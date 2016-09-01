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

import com.bydan.erp.facturacion.util.FacturaImpresionConstantesFunciones;
import com.bydan.erp.facturacion.util.FacturaImpresionParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.FacturaImpresionParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.FacturaImpresionBean;
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

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FacturaImpresionBeanSwingJInternalFrame extends FacturaImpresionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FacturaImpresionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FacturaImpresion> facturaimpresionValidator = new ClassValidator<FacturaImpresion>(FacturaImpresion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FacturaImpresion facturaimpresion;	
	public FacturaImpresion facturaimpresionAux;
	public FacturaImpresion facturaimpresionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FacturaImpresion facturaimpresionTotales;
	public Long idFacturaImpresionActual;
	public Long iIdNuevoFacturaImpresion=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboFactura="";

	public List<Factura> facturasForeignKey;

	public List<Factura> getfacturasForeignKey() {
		return facturasForeignKey;
	}

	public void setfacturasForeignKey(List<Factura> facturasForeignKey) {
		this.facturasForeignKey = facturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Factura facturaForeignKey;

	public Factura getfacturaForeignKey() {
		return facturaForeignKey;
	}

	public void setfacturaForeignKey(Factura facturaForeignKey) {
		this.facturaForeignKey = facturaForeignKey;
	}

	public String sFinalQueryComboEstadoFactuImpre="";

	public List<EstadoFactuImpre> estadofactuimpresForeignKey;

	public List<EstadoFactuImpre> getestadofactuimpresForeignKey() {
		return estadofactuimpresForeignKey;
	}

	public void setestadofactuimpresForeignKey(List<EstadoFactuImpre> estadofactuimpresForeignKey) {
		this.estadofactuimpresForeignKey = estadofactuimpresForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoFactuImpre estadofactuimpreForeignKey;

	public EstadoFactuImpre getestadofactuimpreForeignKey() {
		return estadofactuimpreForeignKey;
	}

	public void setestadofactuimpreForeignKey(EstadoFactuImpre estadofactuimpreForeignKey) {
		this.estadofactuimpreForeignKey = estadofactuimpreForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
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
	
	public Boolean isPermisoTodoFacturaImpresion;
	public Boolean isPermisoNuevoFacturaImpresion;
	public Boolean isPermisoActualizarFacturaImpresion;
	public Boolean isPermisoActualizarOriginalFacturaImpresion;
	public Boolean isPermisoEliminarFacturaImpresion;
	public Boolean isPermisoGuardarCambiosFacturaImpresion;
	public Boolean isPermisoConsultaFacturaImpresion;
	public Boolean isPermisoBusquedaFacturaImpresion;
	public Boolean isPermisoReporteFacturaImpresion;
	public Boolean isPermisoPaginacionMedioFacturaImpresion;
	public Boolean isPermisoPaginacionAltoFacturaImpresion;
	public Boolean isPermisoPaginacionTodoFacturaImpresion;
	public Boolean isPermisoCopiarFacturaImpresion;
	public Boolean isPermisoVerFormFacturaImpresion;
	public Boolean isPermisoDuplicarFacturaImpresion;
	public Boolean isPermisoOrdenFacturaImpresion;
	
	
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
	
	public FacturaImpresionParameterReturnGeneral facturaimpresionReturnGeneral;
	public FacturaImpresionParameterReturnGeneral facturaimpresionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFacturaImpresion=false;
	public Boolean esParaAccionDesdeFormularioFacturaImpresion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FacturaImpresionSessionBeanAdditional facturaimpresionSessionBeanAdditional=null;
	
	public FacturaImpresionSessionBeanAdditional getFacturaImpresionSessionBeanAdditional() {
		return this.facturaimpresionSessionBeanAdditional;
	}
	
	public void setFacturaImpresionSessionBeanAdditional(FacturaImpresionSessionBeanAdditional facturaimpresionSessionBeanAdditional) {
		try {
			this.facturaimpresionSessionBeanAdditional=facturaimpresionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FacturaImpresionBeanSwingJInternalFrameAdditional facturaimpresionBeanSwingJInternalFrameAdditional=null;
	//public class FacturaImpresionBeanSwingJInternalFrame
	
	public FacturaImpresionBeanSwingJInternalFrameAdditional getFacturaImpresionBeanSwingJInternalFrameAdditional() {
		return this.facturaimpresionBeanSwingJInternalFrameAdditional;
	}
	
	public void setFacturaImpresionBeanSwingJInternalFrameAdditional(FacturaImpresionBeanSwingJInternalFrameAdditional facturaimpresionBeanSwingJInternalFrameAdditional) {
		try {
			this.facturaimpresionBeanSwingJInternalFrameAdditional=facturaimpresionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FacturaImpresionLogic facturaimpresionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FacturaImpresion facturaimpresionBean;
	public FacturaImpresionConstantesFunciones facturaimpresionConstantesFunciones;
	//public FacturaImpresionParameterReturnGeneral facturaimpresionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public FacturaLogic facturaLogic;
	public EstadoFactuImpreLogic estadofactuimpreLogic;
	
	//PARAMETROS
	
	
	//public List<FacturaImpresion> facturaimpresions;	
	//public List<FacturaImpresion> facturaimpresionsEliminados;
	//public List<FacturaImpresion> facturaimpresionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFacturaImpresion=false;
	public Boolean isVisibilidadCeldaDuplicarFacturaImpresion=true;
	public Boolean isVisibilidadCeldaCopiarFacturaImpresion=true;
	public Boolean isVisibilidadCeldaVerFormFacturaImpresion=true;
	public Boolean isVisibilidadCeldaOrdenFacturaImpresion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;
	public Boolean isVisibilidadCeldaModificarFacturaImpresion=false;
	public Boolean isVisibilidadCeldaActualizarFacturaImpresion=false;
	public Boolean isVisibilidadCeldaEliminarFacturaImpresion=false;
	public Boolean isVisibilidadCeldaCancelarFacturaImpresion=false;
	public Boolean isVisibilidadCeldaGuardarFacturaImpresion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFacturaImpresion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoFactuImpre=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoFacturaImpresion() {
		return this.iIdNuevoFacturaImpresion;
	}

	public void setiIdNuevoFacturaImpresion(Long iIdNuevoFacturaImpresion) {
		this.iIdNuevoFacturaImpresion = iIdNuevoFacturaImpresion;
	}
	
	public Long getidFacturaImpresionActual() {
		return this.idFacturaImpresionActual;
	}

	public void setidFacturaImpresionActual(Long idFacturaImpresionActual) {
		this.idFacturaImpresionActual = idFacturaImpresionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FacturaImpresion getfacturaimpresion() {
		return this.facturaimpresion;
	}

	public void setfacturaimpresion(FacturaImpresion facturaimpresion) {
		this.facturaimpresion = facturaimpresion;
	}
	
	public FacturaImpresion getfacturaimpresionAux() {
		return this.facturaimpresionAux;
	}

	public void setfacturaimpresionAux(FacturaImpresion facturaimpresionAux) {
		this.facturaimpresionAux = facturaimpresionAux;
	}				
	
	public FacturaImpresion getfacturaimpresionAnterior() {
		return this.facturaimpresionAnterior;
	}

	public void setfacturaimpresionAnterior(FacturaImpresion facturaimpresionAnterior) {
		this.facturaimpresionAnterior = facturaimpresionAnterior;
	}	
	
	public FacturaImpresion getfacturaimpresionTotales() {
		return this.facturaimpresionTotales;
	}

	public void setfacturaimpresionTotales(FacturaImpresion facturaimpresionTotales) {
		this.facturaimpresionTotales = facturaimpresionTotales;
	}	
	
	public FacturaImpresion getfacturaimpresionBean() {
		return this.facturaimpresionBean;
	}

	public void setfacturaimpresionBean(FacturaImpresion facturaimpresionBean) {
		this.facturaimpresionBean = facturaimpresionBean;
	}	
	
	public FacturaImpresionParameterReturnGeneral getfacturaimpresionReturnGeneral() {
		return this.facturaimpresionReturnGeneral;
	}

	public void setfacturaimpresionReturnGeneral(FacturaImpresionParameterReturnGeneral facturaimpresionReturnGeneral) {
		this.facturaimpresionReturnGeneral = facturaimpresionReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_factu_impreFK_IdEstadoFactuImpre=-1L;

	public Long getid_estado_factu_impreFK_IdEstadoFactuImpre() {
		return this.id_estado_factu_impreFK_IdEstadoFactuImpre;
	}

	public void setid_estado_factu_impreFK_IdEstadoFactuImpre(Long id_estado_factu_impreFK_IdEstadoFactuImpre) {
		this.id_estado_factu_impreFK_IdEstadoFactuImpre = id_estado_factu_impreFK_IdEstadoFactuImpre;
	}

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FacturaImpresionLogic getFacturaImpresionLogic()	{		
		return facturaimpresionLogic;
	}

	public void setFacturaImpresionLogic(FacturaImpresionLogic facturaimpresionLogic) {
		this.facturaimpresionLogic = facturaimpresionLogic;
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
	
	public Boolean getIsEsNuevoFacturaImpresion() {
		return isEsNuevoFacturaImpresion;
	}

	public void setIsEsNuevoFacturaImpresion(Boolean isEsNuevoFacturaImpresion) {
		this.isEsNuevoFacturaImpresion = isEsNuevoFacturaImpresion;
	}

	public Boolean getEsParaAccionDesdeFormularioFacturaImpresion() {
		return esParaAccionDesdeFormularioFacturaImpresion;
	}
	
	public void setEsParaAccionDesdeFormularioFacturaImpresion(Boolean esParaAccionDesdeFormularioFacturaImpresion) {
		this.esParaAccionDesdeFormularioFacturaImpresion = esParaAccionDesdeFormularioFacturaImpresion;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.facturaimpresionSessionBean==null) {
				this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
			}

			if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(facturaimpresionSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.facturaimpresionSessionBean==null) {
				this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
			}

			if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(facturaimpresionSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturasForeignKey=new ArrayList<Factura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaLogic facturaLogic=new FacturaLogic();

			//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.facturaimpresionSessionBean==null) {
				this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
			}

			if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

					facturaLogic.getTodosFacturasWithConnection(sFinalQuery,new Pagination());

					this.facturasForeignKey=facturaLogic.getFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(facturaimpresionSessionBean.getlidFacturaActual());
					this.facturasForeignKey.add(facturaLogic.getFactura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosEstadoFactuImpresForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadofactuimpresForeignKey=new ArrayList<EstadoFactuImpre>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoFactuImpreLogic estadofactuimpreLogic=new EstadoFactuImpreLogic();

			//estadofactuimpreLogic.getEstadoFactuImpreDataAccess().setIsForForeingKeyData(true);

			if(this.facturaimpresionSessionBean==null) {
				this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
			}

			if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionEstadoFactuImpre()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadofactuimpreLogic.getEstadoFactuImpreDataAccess().setIsForForeingKeyData(true);

					estadofactuimpreLogic.getTodosEstadoFactuImpresWithConnection(sFinalQuery,new Pagination());

					this.estadofactuimpresForeignKey=estadofactuimpreLogic.getEstadoFactuImpres();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoFactuImpre(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofactuimpreLogic.getEntityWithConnection(facturaimpresionSessionBean.getlidEstadoFactuImpreActual());
					this.estadofactuimpresForeignKey.add(estadofactuimpreLogic.getEstadoFactuImpre());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.facturaimpresion!=null) {
						this.facturaimpresion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
						this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFacturaImpresion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
						if(this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFacturaImpresionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaFacturaImpresionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFacturaImpresionGenerico!=null && jComboBoxid_empresaFacturaImpresionGenerico.getItemCount()>0) {
					jComboBoxid_empresaFacturaImpresionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.facturaimpresion!=null) {
						this.facturaimpresion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
						this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalFacturaImpresion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
						if(this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalFacturaImpresionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalFacturaImpresionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalFacturaImpresionGenerico!=null && jComboBoxid_sucursalFacturaImpresionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalFacturaImpresionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFacturaForeignKey(Long idFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturaTemp!=null) {

					if(this.facturaimpresion!=null) {
						this.facturaimpresion.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
						this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaFacturaImpresion.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
						if(this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaFacturaImpresion!=null) {
						jComboBoxid_facturaFK_IdFacturaFacturaImpresion.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaFacturaImpresion!=null) {
							//jComboBoxid_facturaFK_IdFacturaFacturaImpresion.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaFacturaImpresion.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaFacturaImpresion.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualFacturaForeignKeyDescripcion(Long idFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}


			sDescripcion=FacturaConstantesFunciones.getFacturaDescripcion(facturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaFacturaImpresionGenerico)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(facturaTemp!=null) {
				jComboBoxid_facturaFacturaImpresionGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaFacturaImpresionGenerico!=null && jComboBoxid_facturaFacturaImpresionGenerico.getItemCount()>0) {
					jComboBoxid_facturaFacturaImpresionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoFactuImpreForeignKey(Long idEstadoFactuImpreSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoFactuImpre  estadofactuimpreTemp=null;

			for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresForeignKey) {
				if(estadofactuimpreAux.getId()!=null && estadofactuimpreAux.getId().equals(idEstadoFactuImpreSeleccionado)) {
					estadofactuimpreTemp=estadofactuimpreAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadofactuimpreTemp!=null) {

					if(this.facturaimpresion!=null) {
						this.facturaimpresion.setEstadoFactuImpre(estadofactuimpreTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
						this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.setSelectedItem(estadofactuimpreTemp);
					}
				} else {
					//jComboBoxid_estado_factu_impreFacturaImpresion.setSelectedItem(estadofactuimpreTemp);
					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
						if(this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoFactuImpre") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadofactuimpreTemp!=null && jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion!=null) {
						jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setSelectedItem(estadofactuimpreTemp);
					} else {
						if(jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion!=null) {
							//jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setSelectedItem(estadofactuimpreTemp);
							if(jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.getItemCount()>0) {
								jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEstadoFactuImpreForeignKeyDescripcion(Long idEstadoFactuImpreSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoFactuImpre  estadofactuimpreTemp=null;

			for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresForeignKey) {
				if(estadofactuimpreAux.getId()!=null && estadofactuimpreAux.getId().equals(idEstadoFactuImpreSeleccionado)) {
					estadofactuimpreTemp=estadofactuimpreAux;
					break;
				}
			}


			sDescripcion=EstadoFactuImpreConstantesFunciones.getEstadoFactuImpreDescripcion(estadofactuimpreTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoFactuImpreForeignKeyGenerico(Long idEstadoFactuImpreSeleccionado,JComboBox jComboBoxid_estado_factu_impreFacturaImpresionGenerico)throws Exception
	{
		try
		{
			EstadoFactuImpre  estadofactuimpreTemp=null;

			for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresForeignKey) {
				if(estadofactuimpreAux.getId()!=null && estadofactuimpreAux.getId().equals(idEstadoFactuImpreSeleccionado)) {
					estadofactuimpreTemp=estadofactuimpreAux;
					break;
				}
			}

			if(estadofactuimpreTemp!=null) {
				jComboBoxid_estado_factu_impreFacturaImpresionGenerico.setSelectedItem(estadofactuimpreTemp);
			} else {
				if(jComboBoxid_estado_factu_impreFacturaImpresionGenerico!=null && jComboBoxid_estado_factu_impreFacturaImpresionGenerico.getItemCount()>0) {
					jComboBoxid_estado_factu_impreFacturaImpresionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FacturaImpresion facturaimpresion,JComboBox jComboBoxid_empresaFacturaImpresionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFacturaImpresionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFacturaImpresionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				facturaimpresion.setid_empresa(empresaAux.getId());
				facturaimpresion.setempresa_descripcion(FacturaImpresionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				facturaimpresion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(FacturaImpresion facturaimpresion,JComboBox jComboBoxid_sucursalFacturaImpresionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalFacturaImpresionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalFacturaImpresionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				facturaimpresion.setid_sucursal(sucursalAux.getId());
				facturaimpresion.setsucursal_descripcion(FacturaImpresionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				facturaimpresion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(FacturaImpresion facturaimpresion,JComboBox jComboBoxid_facturaFacturaImpresionGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaFacturaImpresionGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaFacturaImpresionGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				facturaimpresion.setid_factura(facturaAux.getId());
				facturaimpresion.setfactura_descripcion(FacturaImpresionConstantesFunciones.getFacturaDescripcion(facturaAux));
				facturaimpresion.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoFactuImpreForeignKey(FacturaImpresion facturaimpresion,JComboBox jComboBoxid_estado_factu_impreFacturaImpresionGenerico)throws Exception
	{
		try
		{
			EstadoFactuImpre  estadofactuimpreAux=new EstadoFactuImpre();

			if(jComboBoxid_estado_factu_impreFacturaImpresionGenerico==null) {
				estadofactuimpreAux=(EstadoFactuImpre)this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.getSelectedItem();
			} else {
				estadofactuimpreAux=(EstadoFactuImpre)jComboBoxid_estado_factu_impreFacturaImpresionGenerico.getSelectedItem();
			}

			if(estadofactuimpreAux!=null && estadofactuimpreAux.getId()!=null) {
				facturaimpresion.setid_estado_factu_impre(estadofactuimpreAux.getId());
				facturaimpresion.setestadofactuimpre_descripcion(FacturaImpresionConstantesFunciones.getEstadoFactuImpreDescripcion(estadofactuimpreAux));
				facturaimpresion.setEstadoFactuImpre(estadofactuimpreAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { 
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { 
					}

					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { 
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { 
					}

					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { 
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { 
					}

					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaFacturaImpresion.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaFacturaImpresion.addItem(factura);
							}
						}

						if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoFactuImpresForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoFactuImpre=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { 
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.removeAllItems();

							for(EstadoFactuImpre estadofactuimpre:this.estadofactuimpresForeignKey) {
								this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.addItem(estadofactuimpre);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { 
					}

					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoFactuImpre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.removeAllItems();

							for(EstadoFactuImpre estadofactuimpre:this.estadofactuimpresForeignKey) {
								this.jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.addItem(estadofactuimpre);
							}
						}

						if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFacturaForeignKey(Factura factura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaFacturaImpresion.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaFacturaImpresion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoFactuImpreForeignKey(EstadoFactuImpre estadofactuimpre,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.setSelectedItem(estadofactuimpre);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setSelectedItem(estadofactuimpre);
						} else {
							this.jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFacturaImpresion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FacturaImpresionConstantesFunciones.refrescarForeignKeysDescripcionesFacturaImpresion(this.facturaimpresionLogic.getFacturaImpresions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FacturaImpresionConstantesFunciones.refrescarForeignKeysDescripcionesFacturaImpresion(this.facturaimpresions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Factura.class));
		classes.add(new Classe(EstadoFactuImpre.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//facturaimpresionLogic.setFacturaImpresions(this.facturaimpresions);
			facturaimpresionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FacturaImpresionParameterReturnGeneral getFacturaImpresionParameterGeneral() {
		return this.facturaimpresionParameterGeneral;
	}
	
	public void setFacturaImpresionParameterGeneral(FacturaImpresionParameterReturnGeneral facturaimpresionParameterGeneral) {
		this.facturaimpresionParameterGeneral = facturaimpresionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFacturaImpresion() {
		return isPermisoTodoFacturaImpresion;
	}

	public void setIsPermisoTodoFacturaImpresion(Boolean isPermisoTodoFacturaImpresion) {
		this.isPermisoTodoFacturaImpresion = isPermisoTodoFacturaImpresion;
	}

	public Boolean getIsPermisoNuevoFacturaImpresion() {
		return isPermisoNuevoFacturaImpresion;
	}

	public void setIsPermisoNuevoFacturaImpresion(Boolean isPermisoNuevoFacturaImpresion) {
		this.isPermisoNuevoFacturaImpresion = isPermisoNuevoFacturaImpresion;
	}

	public Boolean getIsPermisoActualizarFacturaImpresion() {
		return isPermisoActualizarFacturaImpresion;
	}

	public void setIsPermisoActualizarFacturaImpresion(Boolean isPermisoActualizarFacturaImpresion) {
		this.isPermisoActualizarFacturaImpresion = isPermisoActualizarFacturaImpresion;
	}

	public Boolean getIsPermisoEliminarFacturaImpresion() {
		return isPermisoEliminarFacturaImpresion;
	}

	public void setIsPermisoEliminarFacturaImpresion(Boolean isPermisoEliminarFacturaImpresion) {
		this.isPermisoEliminarFacturaImpresion = isPermisoEliminarFacturaImpresion;
	}

	public Boolean getIsPermisoGuardarCambiosFacturaImpresion() {
		return isPermisoGuardarCambiosFacturaImpresion;
	}

	public void setIsPermisoGuardarCambiosFacturaImpresion(Boolean isPermisoGuardarCambiosFacturaImpresion) {
		this.isPermisoGuardarCambiosFacturaImpresion = isPermisoGuardarCambiosFacturaImpresion;
	}
	
	public Boolean getIsPermisoConsultaFacturaImpresion() {
		return isPermisoConsultaFacturaImpresion;
	}

	public void setIsPermisoConsultaFacturaImpresion(Boolean isPermisoConsultaFacturaImpresion) {
		this.isPermisoConsultaFacturaImpresion = isPermisoConsultaFacturaImpresion;
	}

	public Boolean getIsPermisoBusquedaFacturaImpresion() {
		return isPermisoBusquedaFacturaImpresion;
	}

	public void setIsPermisoBusquedaFacturaImpresion(Boolean isPermisoBusquedaFacturaImpresion) {
		this.isPermisoBusquedaFacturaImpresion = isPermisoBusquedaFacturaImpresion;
	}

	public Boolean getIsPermisoReporteFacturaImpresion() {
		return isPermisoReporteFacturaImpresion;
	}

	public void setIsPermisoReporteFacturaImpresion(Boolean isPermisoReporteFacturaImpresion) {
		this.isPermisoReporteFacturaImpresion = isPermisoReporteFacturaImpresion;
	}
	
	public Boolean getIsPermisoPaginacionMedioFacturaImpresion() {
		return isPermisoPaginacionMedioFacturaImpresion;
	}

	public void setIsPermisoPaginacionMedioFacturaImpresion(Boolean isPermisoPaginacionMedioFacturaImpresion) {
		this.isPermisoPaginacionMedioFacturaImpresion = isPermisoPaginacionMedioFacturaImpresion;
	}
	
	public Boolean getIsPermisoPaginacionTodoFacturaImpresion() {
		return isPermisoPaginacionTodoFacturaImpresion;
	}

	public void setIsPermisoPaginacionTodoFacturaImpresion(Boolean isPermisoPaginacionTodoFacturaImpresion) {
		this.isPermisoPaginacionTodoFacturaImpresion = isPermisoPaginacionTodoFacturaImpresion;
	}
	
	public Boolean getIsPermisoPaginacionAltoFacturaImpresion() {
		return isPermisoPaginacionAltoFacturaImpresion;
	}

	public void setIsPermisoPaginacionAltoFacturaImpresion(Boolean isPermisoPaginacionAltoFacturaImpresion) {
		this.isPermisoPaginacionAltoFacturaImpresion = isPermisoPaginacionAltoFacturaImpresion;
	}
	
	public Boolean getIsPermisoCopiarFacturaImpresion() {
		return isPermisoCopiarFacturaImpresion;
	}

	public void setIsPermisoCopiarFacturaImpresion(Boolean isPermisoCopiarFacturaImpresion) {
		this.isPermisoCopiarFacturaImpresion = isPermisoCopiarFacturaImpresion;
	}
	
	public Boolean getIsPermisoVerFormFacturaImpresion() {
		return isPermisoVerFormFacturaImpresion;
	}

	public void setIsPermisoVerFormFacturaImpresion(Boolean isPermisoVerFormFacturaImpresion) {
		this.isPermisoVerFormFacturaImpresion = isPermisoVerFormFacturaImpresion;
	}
	
	public Boolean getIsPermisoDuplicarFacturaImpresion() {
		return isPermisoDuplicarFacturaImpresion;
	}

	public void setIsPermisoDuplicarFacturaImpresion(Boolean isPermisoDuplicarFacturaImpresion) {
		this.isPermisoDuplicarFacturaImpresion = isPermisoDuplicarFacturaImpresion;
	}
	
	public Boolean getIsPermisoOrdenFacturaImpresion() {
		return isPermisoOrdenFacturaImpresion;
	}

	public void setIsPermisoOrdenFacturaImpresion(Boolean isPermisoOrdenFacturaImpresion) {
		this.isPermisoOrdenFacturaImpresion = isPermisoOrdenFacturaImpresion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFacturaImpresion() {
		return isVisibilidadCeldaNuevoFacturaImpresion;
	}

	public void setIsVisibilidadCeldaNuevoFacturaImpresion(Boolean isVisibilidadCeldaNuevoFacturaImpresion) {
		this.isVisibilidadCeldaNuevoFacturaImpresion = isVisibilidadCeldaNuevoFacturaImpresion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFacturaImpresion() {
		return isVisibilidadCeldaDuplicarFacturaImpresion;
	}

	public void setIsVisibilidadCeldaDuplicarFacturaImpresion(Boolean isVisibilidadCeldaDuplicarFacturaImpresion) {
		this.isVisibilidadCeldaDuplicarFacturaImpresion = isVisibilidadCeldaDuplicarFacturaImpresion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFacturaImpresion() {
		return isVisibilidadCeldaCopiarFacturaImpresion;
	}

	public void setIsVisibilidadCeldaCopiarFacturaImpresion(Boolean isVisibilidadCeldaCopiarFacturaImpresion) {
		this.isVisibilidadCeldaCopiarFacturaImpresion = isVisibilidadCeldaCopiarFacturaImpresion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFacturaImpresion() {
		return isVisibilidadCeldaVerFormFacturaImpresion;
	}

	public void setIsVisibilidadCeldaVerFormFacturaImpresion(Boolean isVisibilidadCeldaVerFormFacturaImpresion) {
		this.isVisibilidadCeldaVerFormFacturaImpresion = isVisibilidadCeldaVerFormFacturaImpresion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFacturaImpresion() {
		return isVisibilidadCeldaOrdenFacturaImpresion;
	}

	public void setIsVisibilidadCeldaOrdenFacturaImpresion(Boolean isVisibilidadCeldaOrdenFacturaImpresion) {
		this.isVisibilidadCeldaOrdenFacturaImpresion = isVisibilidadCeldaOrdenFacturaImpresion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFacturaImpresion() {
		return isVisibilidadCeldaNuevoRelacionesFacturaImpresion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFacturaImpresion(Boolean isVisibilidadCeldaNuevoRelacionesFacturaImpresion) {
		this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion = isVisibilidadCeldaNuevoRelacionesFacturaImpresion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFacturaImpresion() {
		return isVisibilidadCeldaModificarFacturaImpresion;
	}

	public void setIsVisibilidadCeldaModificarFacturaImpresion(Boolean isVisibilidadCeldaModificarFacturaImpresion) {
		this.isVisibilidadCeldaModificarFacturaImpresion = isVisibilidadCeldaModificarFacturaImpresion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFacturaImpresion() {
		return isVisibilidadCeldaActualizarFacturaImpresion;
	}

	public void setIsVisibilidadCeldaActualizarFacturaImpresion(Boolean isVisibilidadCeldaActualizarFacturaImpresion) {
		this.isVisibilidadCeldaActualizarFacturaImpresion = isVisibilidadCeldaActualizarFacturaImpresion;
	}

	public Boolean getIsVisibilidadCeldaEliminarFacturaImpresion() {
		return isVisibilidadCeldaEliminarFacturaImpresion;
	}

	public void setIsVisibilidadCeldaEliminarFacturaImpresion(Boolean isVisibilidadCeldaEliminarFacturaImpresion) {
		this.isVisibilidadCeldaEliminarFacturaImpresion = isVisibilidadCeldaEliminarFacturaImpresion;
	}

	public Boolean getIsVisibilidadCeldaCancelarFacturaImpresion() {
		return isVisibilidadCeldaCancelarFacturaImpresion;
	}

	public void setIsVisibilidadCeldaCancelarFacturaImpresion(Boolean isVisibilidadCeldaCancelarFacturaImpresion) {
		this.isVisibilidadCeldaCancelarFacturaImpresion = isVisibilidadCeldaCancelarFacturaImpresion;
	}

	public Boolean getIsVisibilidadCeldaGuardarFacturaImpresion() {
		return isVisibilidadCeldaGuardarFacturaImpresion;
	}

	public void setIsVisibilidadCeldaGuardarFacturaImpresion(Boolean isVisibilidadCeldaGuardarFacturaImpresion) {
		this.isVisibilidadCeldaGuardarFacturaImpresion = isVisibilidadCeldaGuardarFacturaImpresion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFacturaImpresion() {
		return isVisibilidadCeldaGuardarCambiosFacturaImpresion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFacturaImpresion(Boolean isVisibilidadCeldaGuardarCambiosFacturaImpresion) {
		this.isVisibilidadCeldaGuardarCambiosFacturaImpresion = isVisibilidadCeldaGuardarCambiosFacturaImpresion;
	}
		
	public FacturaImpresionSessionBean getfacturaimpresionSessionBean() {
		return this.facturaimpresionSessionBean;
	}
	
	public void setfacturaimpresionSessionBean(FacturaImpresionSessionBean facturaimpresionSessionBean) {
		this.facturaimpresionSessionBean=facturaimpresionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoFactuImpre() {
		return this.isVisibilidadFK_IdEstadoFactuImpre;
	}

	public void setisVisibilidadFK_IdEstadoFactuImpre(Boolean isVisibilidadFK_IdEstadoFactuImpre) {
		this.isVisibilidadFK_IdEstadoFactuImpre=isVisibilidadFK_IdEstadoFactuImpre;
	}

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(FacturaImpresion facturaimpresion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(facturaimpresion,null);
				this.setActualParaGuardarSucursalForeignKey(facturaimpresion,null);
				this.setActualParaGuardarFacturaForeignKey(facturaimpresion,null);
				this.setActualParaGuardarEstadoFactuImpreForeignKey(facturaimpresion,null);
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
	
	public void bugActualizarReferenciaActual(FacturaImpresion facturaimpresion,FacturaImpresion facturaimpresionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFacturaImpresion(facturaimpresion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		facturaimpresionAux.setId(facturaimpresion.getId());
		facturaimpresionAux.setVersionRow(facturaimpresion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFacturaImpresion();
		
			int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = facturaimpresionValidator.getInvalidValues(this.facturaimpresion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			facturaimpresionLogic.setDatosCliente(datosCliente);
			facturaimpresionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				facturaimpresionAux=new  FacturaImpresion();
				
				facturaimpresionAux.setIsNew(true);
				facturaimpresionAux.setIsChanged(true);
				
				facturaimpresionAux.setFacturaImpresionOriginal(this.facturaimpresion);
				
				facturaimpresionAux.setId(this.facturaimpresion.getId());	
				facturaimpresionAux.setVersionRow(this.facturaimpresion.getVersionRow());	
				facturaimpresionAux.setid_empresa(this.facturaimpresion.getid_empresa());	
				facturaimpresionAux.setid_sucursal(this.facturaimpresion.getid_sucursal());	
				facturaimpresionAux.setid_factura(this.facturaimpresion.getid_factura());	
				facturaimpresionAux.setid_estado_factu_impre(this.facturaimpresion.getid_estado_factu_impre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturaimpresionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(facturaimpresionAux,facturaimpresionLogic.getFacturaImpresions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturaimpresionAux,facturaimpresions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.facturaimpresionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionLogic.saveFacturaImpresions();//WithConnection
						//facturaimpresionLogic.getSetVersionRowFacturaImpresions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.facturaimpresion,facturaimpresionAux);
					
					this.refrescarForeignKeysDescripcionesFacturaImpresion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								facturaimpresionLogic.saveFacturaImpresionRelaciones(facturaimpresionAux);//WithConnection
								//facturaimpresionLogic.getSetVersionRowFacturaImpresions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.facturaimpresion,facturaimpresionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.facturaimpresionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(facturaimpresionAux,facturaimpresionLogic.getFacturaImpresions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(facturaimpresionAux,facturaimpresions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.facturaimpresion,facturaimpresionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				facturaimpresionAux=new  FacturaImpresion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado() 
					|| (this.facturaimpresionSessionBean.getEsGuardarRelacionado() && this.facturaimpresion.getId()>=0)) {
						
					facturaimpresionAux.setIsNew(false);
				}
				
				facturaimpresionAux.setIsDeleted(false);
			
				facturaimpresionAux.setId(this.facturaimpresion.getId());	
				facturaimpresionAux.setVersionRow(this.facturaimpresion.getVersionRow());	
				facturaimpresionAux.setid_empresa(this.facturaimpresion.getid_empresa());	
				facturaimpresionAux.setid_sucursal(this.facturaimpresion.getid_sucursal());	
				facturaimpresionAux.setid_factura(this.facturaimpresion.getid_factura());	
				facturaimpresionAux.setid_estado_factu_impre(this.facturaimpresion.getid_estado_factu_impre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturaimpresionAux,facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturaimpresionAux,facturaimpresions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.facturaimpresionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionLogic.saveFacturaImpresions();//WithConnection
						//facturaimpresionLogic.getSetVersionRowFacturaImpresions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.facturaimpresion,facturaimpresionAux);
					
					this.refrescarForeignKeysDescripcionesFacturaImpresion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								facturaimpresionLogic.saveFacturaImpresionRelaciones(facturaimpresionAux);//WithConnection
								//facturaimpresionLogic.getSetVersionRowFacturaImpresions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.facturaimpresion,facturaimpresionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.facturaimpresionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(facturaimpresionAux,facturaimpresionLogic.getFacturaImpresions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(facturaimpresionAux,facturaimpresions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.facturaimpresion,facturaimpresionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				facturaimpresionAux=new  FacturaImpresion();
				
				facturaimpresionAux.setIsNew(false);
				facturaimpresionAux.setIsChanged(false);
				
				facturaimpresionAux.setIsDeleted(true);
				
				facturaimpresionAux.setId(this.facturaimpresion.getId());	
				facturaimpresionAux.setVersionRow(this.facturaimpresion.getVersionRow());	
				facturaimpresionAux.setid_empresa(this.facturaimpresion.getid_empresa());	
				facturaimpresionAux.setid_sucursal(this.facturaimpresion.getid_sucursal());	
				facturaimpresionAux.setid_factura(this.facturaimpresion.getid_factura());	
				facturaimpresionAux.setid_estado_factu_impre(this.facturaimpresion.getid_estado_factu_impre());	
				
				if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.facturaimpresionAux.getId()>=0) {	
						this.facturaimpresionsEliminados.add(facturaimpresionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(facturaimpresionAux,facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturaimpresionAux,facturaimpresions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.facturaimpresionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionLogic.saveFacturaImpresions();//WithConnection
						//facturaimpresionLogic.getSetVersionRowFacturaImpresions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								facturaimpresionLogic.saveFacturaImpresionRelaciones(facturaimpresionAux);//WithConnection
								//facturaimpresionLogic.getSetVersionRowFacturaImpresions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.facturaimpresionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(facturaimpresionAux,facturaimpresionLogic.getFacturaImpresions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(facturaimpresionAux,facturaimpresions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.getFacturaImpresions().addAll(this.facturaimpresionsEliminados);
					
					facturaimpresionLogic.saveFacturaImpresions();//WithConnection
					//facturaimpresionLogic.getSetVersionRowFacturaImpresions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFacturaImpresion();
				
				this.facturaimpresionsEliminados= new ArrayList<FacturaImpresion>();		
			}
			
			if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Factura Impresion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.facturaimpresion=facturaimpresionAux;
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
      		//this.finishProcessFacturaImpresion();
      	}
		
	}	
	
	public void actualizarRelaciones(FacturaImpresion facturaimpresionLocal) throws Exception {
		
		if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FacturaImpresion facturaimpresionLocal) throws Exception {	
		if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				facturaimpresionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				facturaimpresionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				facturaimpresionLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoFactuImpreDetalleFormJInternalFrame.class)) {
				EstadoFactuImpreBeanSwingJInternalFrame estadofactuimpreBeanSwingJInternalFrameLocal=(EstadoFactuImpreBeanSwingJInternalFrame) ((EstadoFactuImpreDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadofactuimpreBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoFactuImpre(estadofactuimpreBeanSwingJInternalFrameLocal.getestadofactuimpre(),true);
				estadofactuimpreBeanSwingJInternalFrameLocal.actualizarLista(estadofactuimpreBeanSwingJInternalFrameLocal.estadofactuimpre,this.estadofactuimpresForeignKey);

				estadofactuimpreBeanSwingJInternalFrameLocal.actualizarRelaciones(estadofactuimpreBeanSwingJInternalFrameLocal.estadofactuimpre);

				facturaimpresionLocal.setEstadoFactuImpre(estadofactuimpreBeanSwingJInternalFrameLocal.estadofactuimpre);

				this.addItemDefectoCombosForeignKeyEstadoFactuImpre();
				this.cargarCombosFrameEstadoFactuImpresForeignKey("Formulario");
				this.setActualEstadoFactuImpreForeignKey(estadofactuimpreBeanSwingJInternalFrameLocal.estadofactuimpre.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFacturaImpresionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = facturaimpresionValidator.getInvalidValues(this.facturaimpresion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FacturaImpresion facturaimpresion,List<FacturaImpresion> facturaimpresions) throws Exception {
		try	{		
			FacturaImpresionConstantesFunciones.actualizarLista(facturaimpresion,facturaimpresions,this.facturaimpresionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FacturaImpresion facturaimpresion,List<FacturaImpresion> facturaimpresions) throws Exception {
		try	{			
			FacturaImpresionConstantesFunciones.actualizarSelectedLista(facturaimpresion,facturaimpresions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FacturaImpresion> facturaimpresionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				facturaimpresionsLocal=this.facturaimpresionLogic.getFacturaImpresions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				facturaimpresionsLocal=this.facturaimpresions;
			}
			//ARCHITECTURE
		
			for(FacturaImpresion facturaimpresionLocal:facturaimpresionsLocal) {
				if(this.permiteMantenimiento(facturaimpresionLocal) && facturaimpresionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FacturaImpresionConstantesFunciones.getFacturaImpresionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FacturaImpresionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaImpresion.jLabelid_empresaFacturaImpresion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaImpresionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaImpresion.jLabelid_sucursalFacturaImpresion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaImpresionConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaImpresion.jLabelid_facturaFacturaImpresion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaImpresionConstantesFunciones.IDESTADOFACTUIMPRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaImpresion.jLabelid_estado_factu_impreFacturaImpresion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaImpresion.jLabelid_empresaFacturaImpresion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaImpresion.jLabelid_sucursalFacturaImpresion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaImpresion.jLabelid_facturaFacturaImpresion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaImpresion.jLabelid_estado_factu_impreFacturaImpresion,"");
		
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
		this.iIdNuevoFacturaImpresion--;	
		
		
		this.facturaimpresionAux=new FacturaImpresion();
		
		this.facturaimpresionAux.setId(this.iIdNuevoFacturaImpresion);
		this.facturaimpresionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturaimpresionLogic.getFacturaImpresions().add(this.facturaimpresionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.facturaimpresions.add(this.facturaimpresionAux);
		}
		//ARCHITECTURE
		
		this.facturaimpresion=this.facturaimpresionAux;
		
		if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFacturaImpresion(this.facturaimpresion);
			this.setVariablesObjetoActualToFormularioForeignKeyFacturaImpresion(this.facturaimpresion);
		}
				
		//this.setDefaultControlesFacturaImpresion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFacturaImpresion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFacturaImpresion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturaImpresion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturaImpresion(this.facturaimpresionBean,this.facturaimpresion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FacturaImpresionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {
			classes=FacturaImpresionConstantesFunciones.getClassesRelationshipsOfFacturaImpresion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.facturaimpresionReturnGeneral=facturaimpresionLogic.procesarEventosFacturaImpresionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturaimpresionLogic.getFacturaImpresions(),this.facturaimpresion,this.facturaimpresionParameterGeneral,this.isEsNuevoFacturaImpresion,classes);//this.facturaimpresionLogic.getFacturaImpresion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFacturaImpresion(this.facturaimpresionReturnGeneral,this.facturaimpresionBean,false);
		
		if(this.facturaimpresionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFacturaImpresion(this.facturaimpresionReturnGeneral.getFacturaImpresion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFacturaImpresion(this.facturaimpresionReturnGeneral.getFacturaImpresion());
		}
		
		if(this.facturaimpresionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFacturaImpresion(this.facturaimpresionReturnGeneral.getFacturaImpresion(),classes);//this.facturaimpresionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFacturaImpresion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFacturaImpresion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.RecargarFormFacturaImpresion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFacturaImpresion(false);
						
			if(facturaimpresionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturaImpresion();
			}
			
			this.actualizarVisualTableDatosFacturaImpresion();
			
			this.jTableDatosFacturaImpresion.setRowSelectionInterval(this.getIndiceNuevoFacturaImpresion(), this.getIndiceNuevoFacturaImpresion());
			
			this.seleccionarFilaTablaFacturaImpresionActual();
						
			this.actualizarEstadoCeldasBotonesFacturaImpresion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFacturaImpresion(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.setEnabled(isHabilitar && this.facturaimpresionConstantesFunciones.activarid_empresaFacturaImpresion);//
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.setEnabled(isHabilitar && this.facturaimpresionConstantesFunciones.activarid_sucursalFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.setEnabled(isHabilitar && this.facturaimpresionConstantesFunciones.activarid_facturaFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.setEnabled(isHabilitar && this.facturaimpresionConstantesFunciones.activarid_estado_factu_impreFacturaImpresion);
	};
	
	public void setDefaultControlesFacturaImpresion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFacturaImpresion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.facturaimpresionSessionBean.setConGuardarRelaciones(true);			
			this.facturaimpresionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFacturaImpresion.jTabbedPaneRelacionesFacturaImpresion.setVisible(true);
			
					
		} else {
			//this.facturaimpresionSessionBean.setConGuardarRelaciones(false);			
			this.facturaimpresionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFacturaImpresion.jTabbedPaneRelacionesFacturaImpresion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFacturaImpresion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaImpresion facturaimpresionAux:this.facturaimpresionLogic.getFacturaImpresions()) {
				if(facturaimpresionAux.getId().equals(this.iIdNuevoFacturaImpresion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaImpresion facturaimpresionAux:this.facturaimpresions) {
				if(facturaimpresionAux.getId().equals(this.iIdNuevoFacturaImpresion)) {
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
	
	public int getIndiceActualFacturaImpresion(FacturaImpresion facturaimpresion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaImpresion facturaimpresionAux:this.facturaimpresionLogic.getFacturaImpresions()) {
				if(facturaimpresionAux.getId().equals(facturaimpresion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaImpresion facturaimpresionAux:this.facturaimpresions) {
				if(facturaimpresionAux.getId().equals(facturaimpresion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFacturaImpresion(FacturaImpresion facturaimpresionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaImpresion facturaimpresionAux:this.facturaimpresionLogic.getFacturaImpresions()) {
				if(facturaimpresionAux.getFacturaImpresionOriginal().getId().equals(facturaimpresionOriginal.getId())) {
					existe=true;
					facturaimpresionOriginal.setId(facturaimpresionAux.getId());
					facturaimpresionOriginal.setVersionRow(facturaimpresionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaImpresion facturaimpresionAux:this.facturaimpresions) {
				if(facturaimpresionAux.getFacturaImpresionOriginal().getId().equals(facturaimpresionOriginal.getId())) {
					existe=true;
					facturaimpresionOriginal.setId(facturaimpresionAux.getId());
					facturaimpresionOriginal.setVersionRow(facturaimpresionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFacturaImpresion(Boolean esParaCancelar) throws Exception {
		facturaimpresionsAux=new ArrayList<FacturaImpresion>();
		facturaimpresionAux=new FacturaImpresion();
		
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturaImpresion facturaimpresionAux:this.facturaimpresionLogic.getFacturaImpresions()) {
					if(facturaimpresionAux.getId()<0) {
						facturaimpresionsAux.add(facturaimpresionAux);
					}		
				}
				this.iIdNuevoFacturaImpresion=0L;
				this.facturaimpresionLogic.getFacturaImpresions().removeAll(facturaimpresionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaImpresion facturaimpresionAux:this.facturaimpresions) {
					if(facturaimpresionAux.getId()<0) {
						facturaimpresionsAux.add(facturaimpresionAux);
					}		
				}
				this.iIdNuevoFacturaImpresion=0L;
				this.facturaimpresions.removeAll(facturaimpresionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFacturaImpresion 
					&& this.facturaimpresionLogic.getFacturaImpresions().size()>0
					) {
					facturaimpresionAux=this.facturaimpresionLogic.getFacturaImpresions().get(this.facturaimpresionLogic.getFacturaImpresions().size() - 1);
				
					if(facturaimpresionAux.getId()<0) {
						this.facturaimpresionLogic.getFacturaImpresions().remove(facturaimpresionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFacturaImpresion && this.facturaimpresions.size()>0) {
					facturaimpresionAux=this.facturaimpresions.get(this.facturaimpresions.size() - 1);
				
					if(facturaimpresionAux.getId()<0) {
						this.facturaimpresions.remove(facturaimpresionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFacturaImpresion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(facturaimpresion.getId()<0) {
				this.facturaimpresionLogic.getFacturaImpresions().remove(this.facturaimpresion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(facturaimpresion.getId()<0) {
				this.facturaimpresions.remove(this.facturaimpresion);
			}
		}			
	}
	
	public void setEstadosInicialesFacturaImpresion(List<FacturaImpresion> facturaimpresionsAux) throws Exception {
		FacturaImpresionConstantesFunciones.setEstadosInicialesFacturaImpresion(facturaimpresionsAux);
	}
	
	public void setEstadosInicialesFacturaImpresion(FacturaImpresion facturaimpresionAux) throws Exception {
		FacturaImpresionConstantesFunciones.setEstadosInicialesFacturaImpresion(facturaimpresionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFacturaImpresionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFacturaImpresion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFacturaImpresionActual()) {
				if(!this.isEsNuevoFacturaImpresion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFacturaImpresion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFacturaImpresion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFacturaImpresionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Factura Impresion ?", "MANTENIMIENTO DE Factura Impresion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFacturaImpresion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FacturaImpresion facturaimpresion) throws Exception {
		FacturaImpresionConstantesFunciones.seleccionarAsignar(this.facturaimpresion,facturaimpresion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFacturaImpresion=this.isPermisoActualizarOriginalFacturaImpresion;
			
			
			this.seleccionarAsignar(facturaimpresion);
			
			

			idFacturaActual=facturaimpresion.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturaImpresionConstantesFunciones.quitarEspaciosFacturaImpresion(this.facturaimpresion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFacturaImpresion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.facturaimpresionSessionBean.setsFuncionBusquedaRapida(this.facturaimpresionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarFacturaActual() throws Exception {
		try	{
			Factura facturaAux=new Factura();

			if(this.idFacturaActual != null && this.idFacturaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(this.idFacturaActual);
					facturaAux= facturaLogic.getFactura();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				facturasForeignKey=new ArrayList<Factura>();
				facturasForeignKey.add(facturaAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFacturaImpresion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFacturaImpresion(esParaCancelar);				
				this.cancelarNuevoFacturaImpresion(esParaCancelar);								
			}
			
			this.facturaimpresion=new FacturaImpresion();
			
			this.inicializarFacturaImpresion();
			
			this.actualizarEstadoCeldasBotonesFacturaImpresion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFacturaImpresion() throws Exception {
		try {
			FacturaImpresionConstantesFunciones.inicializarFacturaImpresion(this.facturaimpresion);
			
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
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.facturaimpresionLogic.getFacturaImpresions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFacturaImpresions(String sAccionBusqueda,List<FacturaImpresion> facturaimpresionsParaReportes) throws Exception {
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
					sPathReporteFinal="FacturaImpresion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FacturaImpresionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FacturaImpresionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FacturaImpresion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Factura Impresiones");		
		parameters.put("busquedapor", FacturaImpresionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFacturaImpresion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FacturaImpresionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FacturaImpresionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFacturaImpresion=new JRBeanArrayDataSource(FacturaImpresionJInternalFrame.TraerFacturaImpresionBeans(facturaimpresionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFacturaImpresion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FacturaImpresionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FacturaImpresionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FacturaImpresionBean.TraerFacturaImpresionBeans(facturaimpresionsParaReportes).toArray()));
							
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
				this.generarExcelReporteFacturaImpresions(sAccionBusqueda,sTipoArchivoReporte,facturaimpresionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFacturaImpresions(sAccionBusqueda,sTipoArchivoReporte,facturaimpresionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFacturaImpresionActionPerformed(null);
					//this.generarExcelReporteFacturaImpresions(sAccionBusqueda,sTipoArchivoReporte,facturaimpresionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFacturaImpresions(sAccionBusqueda,sTipoArchivoReporte,facturaimpresionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFacturaImpresions(sAccionBusqueda,sTipoArchivoReporte,facturaimpresionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFacturaImpresions(sAccionBusqueda,sTipoArchivoReporte,facturaimpresionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFacturaImpresions(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturaImpresion> facturaimpresionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaimpresion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturaImpresions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturaImpresion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FacturaImpresion facturaimpresion : facturaimpresionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FacturaImpresionConstantesFunciones.generarExcelReporteDataFacturaImpresion("NORMAL",row,workbook,facturaimpresion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFacturaImpresion(String sTipo,Row row,Workbook workbook) {
		
		FacturaImpresionConstantesFunciones.generarExcelReporteHeaderFacturaImpresion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFacturaImpresions(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturaImpresion> facturaimpresionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaimpresion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturaImpresions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FacturaImpresion facturaimpresion : facturaimpresionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FacturaImpresionConstantesFunciones.getFacturaImpresionDescripcion(facturaimpresion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaimpresion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaimpresion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaImpresionConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaimpresion.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturaimpresion.getestadofactuimpre_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFacturaImpresions(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturaImpresion> facturaimpresionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FacturaImpresion> facturaimpresionsRespaldo=null;
		
		classes=FacturaImpresionConstantesFunciones.getClassesRelationshipsOfFacturaImpresion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.facturaimpresionLogic.setDatosCliente(this.datosCliente);
		this.facturaimpresionLogic.setDatosDeep(this.datosDeep);
		this.facturaimpresionLogic.setIsConDeep(true);
		
		facturaimpresionsRespaldo=this.facturaimpresionLogic.getFacturaImpresions();
		
		this.facturaimpresionLogic.setFacturaImpresions(facturaimpresionsParaReportes);	
		this.facturaimpresionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		facturaimpresionsParaReportes=this.facturaimpresionLogic.getFacturaImpresions();
		this.facturaimpresionLogic.setFacturaImpresions(facturaimpresionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaimpresion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturaImpresions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturaImpresion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FacturaImpresion facturaimpresion : facturaimpresionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFacturaImpresion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FacturaImpresionConstantesFunciones.generarExcelReporteDataFacturaImpresion("NORMAL",row,workbook,facturaimpresion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FacturaImpresionConstantesFunciones.getFacturaImpresionDescripcion(facturaimpresion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturaImpresion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFacturaImpresion() throws Exception {		
		this.startProcessFacturaImpresion(true);
	}
	
	public void startProcessFacturaImpresion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFacturaImpresion ,this.jPanelParametrosReportesFacturaImpresion, this.jScrollPanelDatosFacturaImpresion,this.jPanelPaginacionFacturaImpresion, this.jScrollPanelDatosEdicionFacturaImpresion, this.jPanelAccionesFacturaImpresion,this.jPanelAccionesFormularioFacturaImpresion,this.jmenuBarFacturaImpresion,this.jmenuBarDetalleFacturaImpresion,this.jTtoolBarFacturaImpresion,this.jTtoolBarDetalleFacturaImpresion);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturaImpresion=this.jTabbedPaneBusquedasFacturaImpresion; 
		
		final JPanel jPanelParametrosReportesFacturaImpresion=this.jPanelParametrosReportesFacturaImpresion;
		//final JScrollPane jScrollPanelDatosFacturaImpresion=this.jScrollPanelDatosFacturaImpresion;
		final JTable jTableDatosFacturaImpresion=this.jTableDatosFacturaImpresion;		
		final JPanel jPanelPaginacionFacturaImpresion=this.jPanelPaginacionFacturaImpresion;
		//final JScrollPane jScrollPanelDatosEdicionFacturaImpresion=this.jScrollPanelDatosEdicionFacturaImpresion;
		final JPanel jPanelAccionesFacturaImpresion=this.jPanelAccionesFacturaImpresion;
		
		JPanel jPanelCamposAuxiliarFacturaImpresion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFacturaImpresion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			jPanelCamposAuxiliarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jPanelCamposFacturaImpresion;
			jPanelAccionesFormularioAuxiliarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jPanelAccionesFormularioFacturaImpresion;
		}
		
		final JPanel jPanelCamposFacturaImpresion=jPanelCamposAuxiliarFacturaImpresion;
		final JPanel jPanelAccionesFormularioFacturaImpresion=jPanelAccionesFormularioAuxiliarFacturaImpresion;
		
		
		final JMenuBar jmenuBarFacturaImpresion=this.jmenuBarFacturaImpresion;
		final JToolBar jTtoolBarFacturaImpresion=this.jTtoolBarFacturaImpresion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFacturaImpresion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturaImpresion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			jmenuBarDetalleAuxiliarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jmenuBarDetalleFacturaImpresion;
			jTtoolBarDetalleAuxiliarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jTtoolBarDetalleFacturaImpresion;
		}
		
		final JMenuBar jmenuBarDetalleFacturaImpresion=jmenuBarDetalleAuxiliarFacturaImpresion;
		final JToolBar jTtoolBarDetalleFacturaImpresion=jTtoolBarDetalleAuxiliarFacturaImpresion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturaImpresion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturaImpresion;
			processRunnable.jTableDatos=jTableDatosFacturaImpresion;
			processRunnable.jPanelCampos=jPanelCamposFacturaImpresion;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturaImpresion;
			processRunnable.jPanelAcciones=jPanelAccionesFacturaImpresion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturaImpresion;
			
			
			processRunnable.jmenuBar=jmenuBarFacturaImpresion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturaImpresion;
			processRunnable.jTtoolBar=jTtoolBarFacturaImpresion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturaImpresion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturaImpresion ,jPanelParametrosReportesFacturaImpresion,jTableDatosFacturaImpresion, /*jScrollPanelDatosFacturaImpresion,*/jPanelCamposFacturaImpresion,jPanelPaginacionFacturaImpresion, /*jScrollPanelDatosEdicionFacturaImpresion,*/ jPanelAccionesFacturaImpresion,jPanelAccionesFormularioFacturaImpresion,jmenuBarFacturaImpresion,jmenuBarDetalleFacturaImpresion,jTtoolBarFacturaImpresion,jTtoolBarDetalleFacturaImpresion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturaImpresion ,jPanelParametrosReportesFacturaImpresion, jScrollPanelDatosFacturaImpresion,jPanelPaginacionFacturaImpresion, jScrollPanelDatosEdicionFacturaImpresion, jPanelAccionesFacturaImpresion,jPanelAccionesFormularioFacturaImpresion,jmenuBarFacturaImpresion,jmenuBarDetalleFacturaImpresion,jTtoolBarFacturaImpresion,jTtoolBarDetalleFacturaImpresion);
						
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
	
	public void finishProcessFacturaImpresion() {// throws Exception 
		this.finishProcessFacturaImpresion(true);
	}
	
	public void finishProcessFacturaImpresion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFacturaImpresion ,this.jPanelParametrosReportesFacturaImpresion, this.jScrollPanelDatosFacturaImpresion,this.jPanelPaginacionFacturaImpresion, this.jScrollPanelDatosEdicionFacturaImpresion, this.jPanelAccionesFacturaImpresion,this.jPanelAccionesFormularioFacturaImpresion,this.jmenuBarFacturaImpresion,this.jmenuBarDetalleFacturaImpresion,this.jTtoolBarFacturaImpresion,this.jTtoolBarDetalleFacturaImpresion);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturaImpresion=this.jTabbedPaneBusquedasFacturaImpresion; 
		
		final JPanel jPanelParametrosReportesFacturaImpresion=this.jPanelParametrosReportesFacturaImpresion;
		//final JScrollPane jScrollPanelDatosFacturaImpresion=this.jScrollPanelDatosFacturaImpresion;
		final JTable jTableDatosFacturaImpresion=this.jTableDatosFacturaImpresion;		
		final JPanel jPanelPaginacionFacturaImpresion=this.jPanelPaginacionFacturaImpresion;
		//final JScrollPane jScrollPanelDatosEdicionFacturaImpresion=this.jScrollPanelDatosEdicionFacturaImpresion;
		final JPanel jPanelAccionesFacturaImpresion=this.jPanelAccionesFacturaImpresion;
		
		JPanel jPanelCamposAuxiliarFacturaImpresion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFacturaImpresion=new JPanel();
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			jPanelCamposAuxiliarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jPanelCamposFacturaImpresion;
			jPanelAccionesFormularioAuxiliarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jPanelAccionesFormularioFacturaImpresion;
		}
		
		final JPanel jPanelCamposFacturaImpresion=jPanelCamposAuxiliarFacturaImpresion;
		final JPanel jPanelAccionesFormularioFacturaImpresion=jPanelAccionesFormularioAuxiliarFacturaImpresion;
		
		
		final JMenuBar jmenuBarFacturaImpresion=this.jmenuBarFacturaImpresion;		
		final JToolBar jTtoolBarFacturaImpresion=this.jTtoolBarFacturaImpresion;
				
		JMenuBar jmenuBarDetalleAuxiliarFacturaImpresion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturaImpresion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			jmenuBarDetalleAuxiliarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jmenuBarDetalleFacturaImpresion;
			jTtoolBarDetalleAuxiliarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jTtoolBarDetalleFacturaImpresion;		
		}
		
		final JMenuBar jmenuBarDetalleFacturaImpresion=jmenuBarDetalleAuxiliarFacturaImpresion;
		final JToolBar jTtoolBarDetalleFacturaImpresion=jTtoolBarDetalleAuxiliarFacturaImpresion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturaImpresion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturaImpresion;
			processRunnable.jTableDatos=jTableDatosFacturaImpresion;
			processRunnable.jPanelCampos=jPanelCamposFacturaImpresion;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturaImpresion;
			processRunnable.jPanelAcciones=jPanelAccionesFacturaImpresion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturaImpresion;
			
			
			processRunnable.jmenuBar=jmenuBarFacturaImpresion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturaImpresion;
			processRunnable.jTtoolBar=jTtoolBarFacturaImpresion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturaImpresion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFacturaImpresion ,jPanelParametrosReportesFacturaImpresion, jTableDatosFacturaImpresion,/*jScrollPanelDatosFacturaImpresion,*/jPanelCamposFacturaImpresion,jPanelPaginacionFacturaImpresion, /*jScrollPanelDatosEdicionFacturaImpresion,*/ jPanelAccionesFacturaImpresion,jPanelAccionesFormularioFacturaImpresion,jmenuBarFacturaImpresion,jmenuBarDetalleFacturaImpresion,jTtoolBarFacturaImpresion,jTtoolBarDetalleFacturaImpresion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFacturaImpresion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFacturaImpresion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFacturaImpresion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFacturaImpresion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFacturaImpresion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturaImpresion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFacturaImpresion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFacturaImpresion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturaImpresion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.facturaimpresionConstantesFunciones.getsFinalQueryFacturaImpresion();
		String  finalQueryPaginacionTodos=this.facturaimpresionConstantesFunciones.getsFinalQueryFacturaImpresion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FacturaImpresionConstantesFunciones.getArrayColumnasGlobalesNoFacturaImpresion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FacturaImpresionConstantesFunciones.getArrayColumnasGlobalesFacturaImpresion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FacturaImpresionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.facturaimpresionsEliminados= new ArrayList<FacturaImpresion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFacturaImpresion();
		
				///*FacturaImpresionSessionBean*/this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
			
			if(this.facturaimpresionSessionBean==null) {
				this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
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
					this.iNumeroPaginacion=FacturaImpresionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FacturaImpresionConstantesFunciones.getClassesForeignKeysOfFacturaImpresion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/facturaimpresion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			facturaimpresionsAux= new ArrayList<FacturaImpresion>();
			
				
			facturaimpresionLogic.setDatosCliente(this.datosCliente);
			facturaimpresionLogic.setDatosDeep(this.datosDeep);
			facturaimpresionLogic.setIsConDeep(true);
			
			
			facturaimpresionLogic.getFacturaImpresionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					facturaimpresionLogic.getTodosFacturaImpresions(finalQueryGlobal,pagination);
					
					//facturaimpresionLogic.getTodosFacturaImpresionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(facturaimpresionLogic.getFacturaImpresions()==null|| facturaimpresionLogic.getFacturaImpresions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							facturaimpresionsAux= new ArrayList<FacturaImpresion>();
							facturaimpresionsAux.addAll(facturaimpresionLogic.getFacturaImpresions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresionsAux= new ArrayList<FacturaImpresion>();
							facturaimpresionsAux.addAll(facturaimpresions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							facturaimpresionLogic.getTodosFacturaImpresions(finalQueryGlobal+"",this.pagination);												
							
							//facturaimpresionLogic.getTodosFacturaImpresionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFacturaImpresions("Todos",facturaimpresionLogic.getFacturaImpresions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							facturaimpresionLogic.setFacturaImpresions(new ArrayList<FacturaImpresion>());					
							facturaimpresionLogic.getFacturaImpresions().addAll(facturaimpresionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresions=new ArrayList<FacturaImpresion>();
							facturaimpresions.addAll(facturaimpresionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFacturaImpresion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFacturaImpresion=this.idActual;
				
				} else if(this.idFacturaImpresionActual!=null && this.idFacturaImpresionActual!=0L) {
					idFacturaImpresion=idFacturaImpresionActual;
				}
				
					
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndicePorId(idFacturaImpresion);
				
				this.facturaimpresions=new ArrayList<FacturaImpresion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					facturaimpresionLogic.getEntity(idFacturaImpresion);
					
					//facturaimpresionLogic.getEntityWithConnection(idFacturaImpresion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaimpresionLogic.setFacturaImpresions(new ArrayList<FacturaImpresion>());
					facturaimpresionLogic.getFacturaImpresions().add(facturaimpresionLogic.getFacturaImpresion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturaimpresions=new ArrayList<FacturaImpresion>();
					this.facturaimpresions.add(facturaimpresion);
				}
				
				if(facturaimpresionLogic.getFacturaImpresion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturaimpresionLogic.getFacturaImpresionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturaimpresionLogic.getFacturaImpresions()==null||facturaimpresionLogic.getFacturaImpresions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturaimpresions==null|| facturaimpresions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionsAux=new ArrayList<FacturaImpresion>();
						facturaimpresionsAux.addAll(facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresionsAux=new ArrayList<FacturaImpresion>();
							facturaimpresionsAux.addAll(facturaimpresions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturaimpresionLogic.getFacturaImpresionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaImpresions("FK_IdEmpresa",facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaImpresions("FK_IdEmpresa",facturaimpresions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionLogic.setFacturaImpresions(new ArrayList<FacturaImpresion>());
						facturaimpresionLogic.getFacturaImpresions().addAll(facturaimpresionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresions=new ArrayList<FacturaImpresion>();
							facturaimpresions.addAll(facturaimpresionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoFactuImpre")) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEstadoFactuImpre(id_estado_factu_impreFK_IdEstadoFactuImpre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturaimpresionLogic.getFacturaImpresionsFK_IdEstadoFactuImpre(finalQueryGlobal,pagination,id_estado_factu_impreFK_IdEstadoFactuImpre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEstadoFactuImpre(id_estado_factu_impreFK_IdEstadoFactuImpre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEstadoFactuImpre(id_estado_factu_impreFK_IdEstadoFactuImpre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturaimpresionLogic.getFacturaImpresions()==null||facturaimpresionLogic.getFacturaImpresions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturaimpresions==null|| facturaimpresions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionsAux=new ArrayList<FacturaImpresion>();
						facturaimpresionsAux.addAll(facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresionsAux=new ArrayList<FacturaImpresion>();
							facturaimpresionsAux.addAll(facturaimpresions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturaimpresionLogic.getFacturaImpresionsFK_IdEstadoFactuImpre(finalQueryGlobal,pagination,id_estado_factu_impreFK_IdEstadoFactuImpre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEstadoFactuImpre(id_estado_factu_impreFK_IdEstadoFactuImpre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdEstadoFactuImpre(id_estado_factu_impreFK_IdEstadoFactuImpre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaImpresions("FK_IdEstadoFactuImpre",facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaImpresions("FK_IdEstadoFactuImpre",facturaimpresions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionLogic.setFacturaImpresions(new ArrayList<FacturaImpresion>());
						facturaimpresionLogic.getFacturaImpresions().addAll(facturaimpresionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresions=new ArrayList<FacturaImpresion>();
							facturaimpresions.addAll(facturaimpresionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturaimpresionLogic.getFacturaImpresionsFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturaimpresionLogic.getFacturaImpresions()==null||facturaimpresionLogic.getFacturaImpresions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturaimpresions==null|| facturaimpresions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionsAux=new ArrayList<FacturaImpresion>();
						facturaimpresionsAux.addAll(facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresionsAux=new ArrayList<FacturaImpresion>();
							facturaimpresionsAux.addAll(facturaimpresions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturaimpresionLogic.getFacturaImpresionsFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaImpresions("FK_IdFactura",facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaImpresions("FK_IdFactura",facturaimpresions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionLogic.setFacturaImpresions(new ArrayList<FacturaImpresion>());
						facturaimpresionLogic.getFacturaImpresions().addAll(facturaimpresionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresions=new ArrayList<FacturaImpresion>();
							facturaimpresions.addAll(facturaimpresionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturaimpresionLogic.getFacturaImpresionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturaimpresionLogic.getFacturaImpresions()==null||facturaimpresionLogic.getFacturaImpresions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturaimpresions==null|| facturaimpresions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionsAux=new ArrayList<FacturaImpresion>();
						facturaimpresionsAux.addAll(facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresionsAux=new ArrayList<FacturaImpresion>();
							facturaimpresionsAux.addAll(facturaimpresions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturaimpresionLogic.getFacturaImpresionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaImpresionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaImpresions("FK_IdSucursal",facturaimpresionLogic.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaImpresions("FK_IdSucursal",facturaimpresions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionLogic.setFacturaImpresions(new ArrayList<FacturaImpresion>());
						facturaimpresionLogic.getFacturaImpresions().addAll(facturaimpresionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresions=new ArrayList<FacturaImpresion>();
							facturaimpresions.addAll(facturaimpresionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFacturaImpresion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFacturaImpresion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturaimpresionLogic.getFacturaImpresions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturaimpresions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturaimpresionLogic.getFacturaImpresions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturaimpresions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FacturaImpresion facturaimpresion) {
		Boolean permite=true;
		
		if(this.facturaimpresion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FacturaImpresionConstantesFunciones.getOrderByListaFacturaImpresion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FacturaImpresionConstantesFunciones.getOrderByListaFacturaImpresion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaImpresion facturaimpresion:facturaimpresionLogic.getFacturaImpresions()) {
				if(facturaimpresion.getsType().equals(Constantes2.S_TOTALES)) {
					facturaimpresionTotales=facturaimpresion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaImpresion facturaimpresion:this.facturaimpresions) {
				if(facturaimpresion.getsType().equals(Constantes2.S_TOTALES)) {
					facturaimpresionTotales=facturaimpresion;
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
			this.facturaimpresionAux=new FacturaImpresion();
			this.facturaimpresionAux.setsType(Constantes2.S_TOTALES);
			this.facturaimpresionAux.setIsNew(false);
			this.facturaimpresionAux.setIsChanged(false);
			this.facturaimpresionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FacturaImpresionConstantesFunciones.TotalizarValoresFilaFacturaImpresion(this.facturaimpresionLogic.getFacturaImpresions(),this.facturaimpresionAux);
				
				this.facturaimpresionLogic.getFacturaImpresions().add(this.facturaimpresionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FacturaImpresionConstantesFunciones.TotalizarValoresFilaFacturaImpresion(this.facturaimpresions,this.facturaimpresionAux);
				
				this.facturaimpresions.add(this.facturaimpresionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		facturaimpresionTotales=new FacturaImpresion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturaimpresionLogic.getFacturaImpresions().remove(facturaimpresionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturaimpresions.remove(facturaimpresionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		facturaimpresionTotales=new FacturaImpresion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaImpresion facturaimpresion:facturaimpresionLogic.getFacturaImpresions()) {
				if(facturaimpresion.getsType().equals(Constantes2.S_TOTALES)) {
					facturaimpresionTotales=facturaimpresion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturaImpresionConstantesFunciones.TotalizarValoresFilaFacturaImpresion(this.facturaimpresionLogic.getFacturaImpresions(),facturaimpresionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaImpresion facturaimpresion:this.facturaimpresions) {
				if(facturaimpresion.getsType().equals(Constantes2.S_TOTALES)) {
					facturaimpresionTotales=facturaimpresion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturaImpresionConstantesFunciones.TotalizarValoresFilaFacturaImpresion(this.facturaimpresions,facturaimpresionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFacturaImpresionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturaImpresionsFK_IdEstadoFactuImpre()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoFactuImpre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturaImpresionsFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturaImpresionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFacturaImpresionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaimpresionLogic.getFacturaImpresionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturaImpresionsFK_IdEstadoFactuImpre(String sFinalQuery,Long id_estado_factu_impre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaimpresionLogic.getFacturaImpresionsFK_IdEstadoFactuImpre(sFinalQuery,this.pagination,id_estado_factu_impre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturaImpresionsFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaimpresionLogic.getFacturaImpresionsFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturaImpresionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaimpresionLogic.getFacturaImpresionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosFacturaImpresion() {
		this.isPermisoTodoFacturaImpresion=false;
		this.isPermisoNuevoFacturaImpresion=false;
		this.isPermisoActualizarFacturaImpresion=false;
		this.isPermisoActualizarOriginalFacturaImpresion=false;
		this.isPermisoEliminarFacturaImpresion=false;
		this.isPermisoGuardarCambiosFacturaImpresion=false;
		this.isPermisoConsultaFacturaImpresion=false;
		this.isPermisoBusquedaFacturaImpresion=false;
		this.isPermisoReporteFacturaImpresion=false;		
		this.isPermisoOrdenFacturaImpresion=false;		
		this.isPermisoPaginacionMedioFacturaImpresion=false;		
		this.isPermisoPaginacionAltoFacturaImpresion=false;
		this.isPermisoPaginacionTodoFacturaImpresion=false;
		this.isPermisoCopiarFacturaImpresion=false;		
		this.isPermisoVerFormFacturaImpresion=false;		
		this.isPermisoDuplicarFacturaImpresion=false;		
		this.isPermisoOrdenFacturaImpresion=false;		
	}
	
	public void setPermisosUsuarioFacturaImpresion(Boolean isPermiso) {
		this.isPermisoTodoFacturaImpresion=isPermiso;
		this.isPermisoNuevoFacturaImpresion=isPermiso;
		this.isPermisoActualizarFacturaImpresion=isPermiso;
		this.isPermisoActualizarOriginalFacturaImpresion=isPermiso;
		this.isPermisoEliminarFacturaImpresion=isPermiso;
		this.isPermisoGuardarCambiosFacturaImpresion=isPermiso;
		this.isPermisoConsultaFacturaImpresion=isPermiso;
		this.isPermisoBusquedaFacturaImpresion=isPermiso;
		this.isPermisoReporteFacturaImpresion=isPermiso;
		this.isPermisoOrdenFacturaImpresion=isPermiso;		
		this.isPermisoPaginacionMedioFacturaImpresion=isPermiso;		
		this.isPermisoPaginacionAltoFacturaImpresion=isPermiso;		
		this.isPermisoPaginacionTodoFacturaImpresion=isPermiso;		
		this.isPermisoCopiarFacturaImpresion=isPermiso;		
		this.isPermisoVerFormFacturaImpresion=isPermiso;		
		this.isPermisoDuplicarFacturaImpresion=isPermiso;
		this.isPermisoOrdenFacturaImpresion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFacturaImpresion(Boolean isPermiso) {
		//this.isPermisoTodoFacturaImpresion=isPermiso;
		this.isPermisoNuevoFacturaImpresion=isPermiso;
		this.isPermisoActualizarFacturaImpresion=isPermiso;
		this.isPermisoActualizarOriginalFacturaImpresion=isPermiso;
		this.isPermisoEliminarFacturaImpresion=isPermiso;
		this.isPermisoGuardarCambiosFacturaImpresion=isPermiso;
		//this.isPermisoConsultaFacturaImpresion=isPermiso;
		//this.isPermisoBusquedaFacturaImpresion=isPermiso;
		//this.isPermisoReporteFacturaImpresion=isPermiso;
		//this.isPermisoOrdenFacturaImpresion=isPermiso;		
		//this.isPermisoPaginacionMedioFacturaImpresion=isPermiso;		
		//this.isPermisoPaginacionAltoFacturaImpresion=isPermiso;		
		//this.isPermisoPaginacionTodoFacturaImpresion=isPermiso;		
		//this.isPermisoCopiarFacturaImpresion=isPermiso;		
		//this.isPermisoDuplicarFacturaImpresion=isPermiso;
		//this.isPermisoOrdenFacturaImpresion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFacturaImpresionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FacturaImpresionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFacturaImpresion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFacturaImpresionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFacturaImpresionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFacturaImpresionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFacturaImpresionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFacturaImpresion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FacturaImpresionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FacturaImpresionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFacturaImpresion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFacturaImpresion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFacturaImpresion=this.isPermisoActualizarFacturaImpresion;
			this.isPermisoEliminarFacturaImpresion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFacturaImpresion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFacturaImpresion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFacturaImpresion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFacturaImpresion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFacturaImpresion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturaImpresion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFacturaImpresion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFacturaImpresion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFacturaImpresion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFacturaImpresion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFacturaImpresion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFacturaImpresion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturaImpresion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFacturaImpresion.setToolTipText(this.jTableDatosFacturaImpresion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFacturaImpresion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFacturaImpresion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FacturaImpresionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FacturaImpresionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFacturaImpresion() throws Exception {
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyFacturaImpresionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
				this.estadofactuimpresForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFacturaImpresionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FacturaImpresionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFacturaImpresionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoFactuImpreListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoFactuImpreListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadofactuimpresForeignKey==null||this.estadofactuimpresForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoFactuImpreConstantesFunciones.getArrayColumnasGlobalesEstadoFactuImpre(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoFactuImpreConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoFactuImpreConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoFactuImpresForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFacturaImpresionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FacturaImpresionParameterReturnGeneral facturaimpresionReturnGeneral=new FacturaImpresionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.facturaimpresionConstantesFunciones.cargarid_empresaFacturaImpresion)
					 || (this.esRecargarFks && this.facturaimpresionConstantesFunciones.cargarid_empresaFacturaImpresion)) {

					if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+facturaimpresionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.facturaimpresionConstantesFunciones.cargarid_sucursalFacturaImpresion)
					 || (this.esRecargarFks && this.facturaimpresionConstantesFunciones.cargarid_sucursalFacturaImpresion)) {

					if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+facturaimpresionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.facturaimpresionConstantesFunciones.cargarid_facturaFacturaImpresion)
					 || (this.esRecargarFks && this.facturaimpresionConstantesFunciones.cargarid_facturaFacturaImpresion)) {

					if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+facturaimpresionSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}


				String finalQueryGlobalEstadoFactuImpre="";

				if(((this.estadofactuimpresForeignKey==null||this.estadofactuimpresForeignKey.size()<=0) && this.facturaimpresionConstantesFunciones.cargarid_estado_factu_impreFacturaImpresion)
					 || (this.esRecargarFks && this.facturaimpresionConstantesFunciones.cargarid_estado_factu_impreFacturaImpresion)) {

					if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionEstadoFactuImpre()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoFactuImpreConstantesFunciones.getArrayColumnasGlobalesEstadoFactuImpre(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoFactuImpre=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoFactuImpreConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoFactuImpre=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoFactuImpre, "");
						finalQueryGlobalEstadoFactuImpre+=EstadoFactuImpreConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoFactuImpresForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoFactuImpre=" WHERE " + ConstantesSql.ID + "="+facturaimpresionSessionBean.getlidEstadoFactuImpreActual();
					}
				} else {
					finalQueryGlobalEstadoFactuImpre="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				facturaimpresionReturnGeneral=facturaimpresionLogic.cargarCombosLoteForeignKeyFacturaImpresion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalFactura,finalQueryGlobalEstadoFactuImpre);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=facturaimpresionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=facturaimpresionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=facturaimpresionReturnGeneral.getfacturasForeignKey();
			}

			if(!finalQueryGlobalEstadoFactuImpre.equals("NONE")) {
				this.estadofactuimpresForeignKey=facturaimpresionReturnGeneral.getestadofactuimpresForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFacturaImpresion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyFactura();
			this.addItemDefectoCombosForeignKeyEstadoFactuImpre();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.facturaimpresionSessionBean==null) {
				this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
			}

			if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				Factura factura=new Factura();
				FacturaConstantesFunciones.setFacturaDescripcion(factura,Constantes.SMENSAJE_ESCOJA_OPCION);
				factura.setId(null);

				if(!FacturaConstantesFunciones.ExisteEnLista(this.facturasForeignKey,factura,true)) {

					this.facturasForeignKey.add(0,factura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoFactuImpre()throws Exception {
		try {

			if(!this.facturaimpresionSessionBean.getisBusquedaDesdeForeignKeySesionEstadoFactuImpre()) {
				EstadoFactuImpre estadofactuimpre=new EstadoFactuImpre();
				EstadoFactuImpreConstantesFunciones.setEstadoFactuImpreDescripcion(estadofactuimpre,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadofactuimpre.setId(null);

				if(!EstadoFactuImpreConstantesFunciones.ExisteEnLista(this.estadofactuimpresForeignKey,estadofactuimpre,true)) {

					this.estadofactuimpresForeignKey.add(0,estadofactuimpre);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFacturaImpresion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFacturaImpresion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFacturaImpresion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturaImpresion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFacturaImpresion(FacturaImpresion facturaimpresion)throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(facturaimpresion.getid_factura(),false,"Formulario");
			this.setActualEstadoFactuImpreForeignKey(facturaimpresion.getid_estado_factu_impre(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFacturaImpresion(FacturaImpresion facturaimpresion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(facturaimpresion.getFactura()!=null && !sTipoEvento.equals("id_facturaFacturaImpresion")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(facturaimpresion.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFacturaImpresion()throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(this.facturaimpresionConstantesFunciones.getid_factura(),false,"Formulario");
			this.setActualEstadoFactuImpreForeignKey(this.facturaimpresionConstantesFunciones.getid_estado_factu_impre(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFacturaImpresion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFacturaImpresion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFacturaImpresion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFacturaImpresion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFacturaImpresion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");
			this.cargarCombosFrameEstadoFactuImpresForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFacturaImpresion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoFactuImpresForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFacturaImpresion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion!=null && this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion!=null && this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion!=null && this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion!=null && this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public FacturaImpresionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FacturaImpresionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FacturaImpresionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.facturaimpresionSessionBean=new FacturaImpresionSessionBean(); 
		this.facturaimpresionConstantesFunciones=new FacturaImpresionConstantesFunciones(); 
		this.facturaimpresionBean=new FacturaImpresion();//(this.facturaimpresionConstantesFunciones); 		
		this.facturaimpresionReturnGeneral=new FacturaImpresionParameterReturnGeneral(); 
		
		this.facturaimpresionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaimpresionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FacturaImpresionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FacturaImpresionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FacturaImpresionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFacturaImpresion(true);
			
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
			
			this.facturaimpresionConstantesFunciones=new FacturaImpresionConstantesFunciones(); 
			this.facturaimpresionBean=new FacturaImpresion();//this.facturaimpresionConstantesFunciones); 			
			this.facturaimpresionReturnGeneral=new FacturaImpresionParameterReturnGeneral(); 
		
			FacturaImpresionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factura Impresion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.facturaimpresion=new FacturaImpresion();
			this.facturaimpresions = new ArrayList<FacturaImpresion>();
			this.facturaimpresionsAux = new ArrayList<FacturaImpresion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic=new FacturaImpresionLogic();
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}
			
			//this.facturaimpresionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.facturaimpresionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFacturaImpresion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFacturaImpresion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturaImpresion);	
					}
					
					if(this.jInternalFrameImportacionFacturaImpresion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturaImpresion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFacturaImpresion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFacturaImpresion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturaImpresion);
				this.jInternalFrameDetalleFormFacturaImpresion.setVisible(false);
				this.jInternalFrameDetalleFormFacturaImpresion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturaImpresion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturaImpresion);
					this.jInternalFrameReporteDinamicoFacturaImpresion.setVisible(false);
					this.jInternalFrameReporteDinamicoFacturaImpresion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFacturaImpresion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFacturaImpresion);
					this.jInternalFrameImportacionFacturaImpresion.setVisible(false);
					this.jInternalFrameImportacionFacturaImpresion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFacturaImpresion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFacturaImpresion);
					this.jInternalFrameOrderByFacturaImpresion.setVisible(false);
					this.jInternalFrameOrderByFacturaImpresion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFacturaImpresionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FacturaImpresionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.facturaimpresionReturnGeneral=new FacturaImpresionParameterReturnGeneral();
			
			this.facturaimpresionParameterGeneral=new FacturaImpresionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.facturaimpresionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FacturaImpresionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturaImpresionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturaimpresionSessionBean.getEsGuardarRelacionado(),this.facturaimpresionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturaImpresionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturaimpresionSessionBean.getEsGuardarRelacionado(),this.facturaimpresionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFacturaImpresion=false;
			this.isVisibilidadCeldaDuplicarFacturaImpresion=true;
			this.isVisibilidadCeldaCopiarFacturaImpresion=true;
			this.isVisibilidadCeldaVerFormFacturaImpresion=true;
			this.isVisibilidadCeldaOrdenFacturaImpresion=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;
			this.isVisibilidadCeldaModificarFacturaImpresion=false;
			this.isVisibilidadCeldaActualizarFacturaImpresion=false;
			this.isVisibilidadCeldaEliminarFacturaImpresion=false;
			this.isVisibilidadCeldaCancelarFacturaImpresion=false;
			this.isVisibilidadCeldaGuardarFacturaImpresion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoFactuImpre=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFacturaImpresion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFacturaImpresion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFacturaImpresion(false);
			
			this.setPermisosUsuarioFacturaImpresion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado() 
				|| (this.facturaimpresionSessionBean.getEsGuardarRelacionado() && this.facturaimpresionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFacturaImpresionClasesRelacionadas();
			}
			
			if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFacturaImpresionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFacturaImpresion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFacturaImpresion();
			}
			
			if(!this.isPermisoBusquedaFacturaImpresion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFacturaImpresion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFacturaImpresion,this.isPermisoPaginacionMedioFacturaImpresion,this.isPermisoPaginacionTodoFacturaImpresion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FacturaImpresionConstantesFunciones.getTiposSeleccionarFacturaImpresion());
				
				this.tiposColumnasSelect=FacturaImpresionConstantesFunciones.getTiposSeleccionarFacturaImpresion(true);
				
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
			//if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFacturaImpresion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioFacturaImpresion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioFacturaImpresion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturaImpresion() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.facturaLogic=new FacturaLogic();
			this.estadofactuimpreLogic=new EstadoFactuImpreLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				facturaimpresionImplementable= (FacturaImpresionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturaImpresionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				facturaimpresionImplementableHome= (FacturaImpresionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturaImpresionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.facturaimpresions= new ArrayList<FacturaImpresion>();
			this.facturaimpresionsEliminados= new ArrayList<FacturaImpresion>();
						
			this.isEsNuevoFacturaImpresion=false;
			this.esParaAccionDesdeFormularioFacturaImpresion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			this.estadofactuimpresForeignKey=new ArrayList<EstadoFactuImpre>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFacturaImpresion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFacturaImpresion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FacturaImpresionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FacturaImpresionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFacturaImpresion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFacturaImpresion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFacturaImpresion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFacturaImpresion();
			}
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFacturaImpresion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFacturaImpresion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFacturaImpresion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFacturaImpresion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FacturaImpresion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFacturaImpresion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFacturaImpresion")) {
				iIndex=this.jInternalFrameDetalleFormFacturaImpresion.jTabbedPaneRelacionesFacturaImpresion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFacturaImpresion.jTabbedPaneRelacionesFacturaImpresion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFacturaImpresion();	
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
	
	public void cargarCombosForeignKeyFacturaImpresion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFacturaImpresion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFacturaImpresion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFacturaImpresionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFacturaImpresion();
		
		this.cargarCombosFrameForeignKeyFacturaImpresion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFacturaImpresion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFacturaImpresion();
		}
	}
	
	

	public void cargarCombosForeignKeyFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactura(this.facturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoFactuImpre(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoFactuImpreListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoFactuImpre();
				this.cargarCombosFrameEstadoFactuImpresForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoFactuImpre(this.estadofactuimpresForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFacturaImpresionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
			
			if(jTableDatosFacturaImpresion.getRowCount()>=1) {
				jTableDatosFacturaImpresion.removeRowSelectionInterval(0, jTableDatosFacturaImpresion.getRowCount()-1);						
			}
			
			this.isEsNuevoFacturaImpresion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFacturaImpresion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFacturaImpresion(true);			
			//this.facturaimpresion=new FacturaImpresion();
			//this.facturaimpresion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturaImpresion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaImpresion() ;
			
			if(FacturaImpresionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturaImpresion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.facturaimpresion);	
			this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);				
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
			if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FacturaImpresion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFacturaImpresionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFacturaImpresion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFacturaImpresion.getSelectedRows().length;			
			}
			
			facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFacturaImpresion--;			
				//FacturaImpresion facturaimpresionAux= new FacturaImpresion();			
				//facturaimpresionAux.setId(this.iIdNuevoFacturaImpresion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FacturaImpresion facturaimpresionOrigen=new FacturaImpresion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FacturaImpresion facturaimpresionOrigen : facturaimpresionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							facturaimpresionOrigen =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturaimpresionOrigen =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFacturaImpresion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.facturaimpresion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFacturaImpresion(facturaimpresionOrigen,this.facturaimpresion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturaimpresionLogic.getFacturaImpresions().add(this.facturaimpresionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturaimpresions.add(this.facturaimpresionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFacturaImpresion(false);
				
				this.jTableDatosFacturaImpresion.setRowSelectionInterval(this.getIndiceNuevoFacturaImpresion(), this.getIndiceNuevoFacturaImpresion());
				
				int iLastRow =  this.jTableDatosFacturaImpresion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturaImpresion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturaImpresion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturaImpresion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();									
		
			FacturaImpresion facturaimpresionOrigen=new FacturaImpresion();
			FacturaImpresion facturaimpresionDestino=new FacturaImpresion();
				
			facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFacturaImpresion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || facturaimpresionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFacturaImpresion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionOrigen =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturaimpresionOrigen =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturaimpresionDestino =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturaimpresionDestino =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				facturaimpresionOrigen =facturaimpresionsSeleccionados.get(0);
				facturaimpresionDestino =facturaimpresionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFacturaImpresion(facturaimpresionOrigen,facturaimpresionDestino,true,false);
				
				facturaimpresionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturaimpresionDestino,facturaimpresionLogic.getFacturaImpresions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturaimpresionDestino,facturaimpresions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFacturaImpresion(false);
				
				//this.jTableDatosFacturaImpresion.setRowSelectionInterval(this.getIndiceNuevoFacturaImpresion(), this.getIndiceNuevoFacturaImpresion());
				
				int iLastRow =  this.jTableDatosFacturaImpresion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturaImpresion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturaImpresion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturaImpresion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFacturaImpresion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFacturaImpresion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFacturaImpresion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFacturaImpresion.setVisible(!isVisible);
			this.jPanelPaginacionFacturaImpresion.setVisible(!isVisible);
			this.jPanelAccionesFacturaImpresion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFacturaImpresion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFacturaImpresion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFacturaImpresion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFacturaImpresion();
			
			this.abrirFrameOrderByFacturaImpresion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFacturaImpresion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFacturaImpresion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturaImpresion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFacturaImpresion.isMaximum()) {
					this.jInternalFrameDetalleFormFacturaImpresion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFacturaImpresion.setSize(this.jInternalFrameDetalleFormFacturaImpresion.iWidthFormulario,this.jInternalFrameDetalleFormFacturaImpresion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFacturaImpresion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFacturaImpresion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFacturaImpresion.isMaximum()) {
						this.jInternalFrameDetalleFormFacturaImpresion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFacturaImpresion.jContentPaneDetalleFacturaImpresion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFacturaImpresion.jTabbedPaneRelacionesFacturaImpresion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFacturaImpresion.jContentPaneDetalleFacturaImpresion.getWidth(),FacturaImpresionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturaImpresion.jTabbedPaneRelacionesFacturaImpresion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFacturaImpresion.jContentPaneDetalleFacturaImpresion.getWidth(),FacturaImpresionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturaImpresion.jTabbedPaneRelacionesFacturaImpresion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFacturaImpresion.jContentPaneDetalleFacturaImpresion.getWidth(),FacturaImpresionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFacturaImpresion.setVisible(true);
	        this.jInternalFrameDetalleFormFacturaImpresion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFacturaImpresion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFacturaImpresion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFacturaImpresion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaImpresion,false,this);
				} else {
					this.jInternalFrameOrderByFacturaImpresion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaImpresion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFacturaImpresion);
				this.jInternalFrameOrderByFacturaImpresion.setVisible(false);
				this.jInternalFrameOrderByFacturaImpresion.setSelected(false);
				
				this.jInternalFrameOrderByFacturaImpresion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturaImpresion"));
				
				this.inicializarActualizarBindingTablaOrderByFacturaImpresion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFacturaImpresion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFacturaImpresion==null) {
				
				this.jInternalFrameImportacionFacturaImpresion=new ImportacionJInternalFrame(FacturaImpresionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturaImpresion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFacturaImpresion);
				this.jInternalFrameImportacionFacturaImpresion.setVisible(false);
				this.jInternalFrameImportacionFacturaImpresion.setSelected(false);


				this.jInternalFrameImportacionFacturaImpresion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturaImpresion"));
				this.jInternalFrameImportacionFacturaImpresion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturaImpresion"));
				this.jInternalFrameImportacionFacturaImpresion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturaImpresion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFacturaImpresion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFacturaImpresion==null) {
				this.jInternalFrameReporteDinamicoFacturaImpresion=new ReporteDinamicoJInternalFrame(FacturaImpresionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturaImpresion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturaImpresion);
				this.jInternalFrameReporteDinamicoFacturaImpresion.setVisible(false);
				this.jInternalFrameReporteDinamicoFacturaImpresion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFacturaImpresion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturaImpresion"));
				this.jInternalFrameReporteDinamicoFacturaImpresion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturaImpresion"));
				this.jInternalFrameReporteDinamicoFacturaImpresion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturaImpresion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturaImpresion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFacturaImpresion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturaImpresion);
			
	       	this.jInternalFrameDetalleFormFacturaImpresion.setVisible(false);
	        this.jInternalFrameDetalleFormFacturaImpresion.setSelected(false);
			
			//this.jInternalFrameDetalleFormFacturaImpresion.dispose();
			//this.jInternalFrameDetalleFormFacturaImpresion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFacturaImpresion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFacturaImpresion.setVisible(true);
	        this.jInternalFrameReporteDinamicoFacturaImpresion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFacturaImpresion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFacturaImpresion.setVisible(true);
	        this.jInternalFrameImportacionFacturaImpresion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFacturaImpresion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFacturaImpresion.setVisible(true);
	        this.jInternalFrameOrderByFacturaImpresion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFacturaImpresion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFacturaImpresion.setVisible(false);
	        this.jInternalFrameOrderByFacturaImpresion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFacturaImpresion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFacturaImpresion.setVisible(false);
	        this.jInternalFrameReporteDinamicoFacturaImpresion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFacturaImpresion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFacturaImpresion.setVisible(false);
	        this.jInternalFrameImportacionFacturaImpresion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFacturaImpresion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFacturaImpresion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFacturaImpresion(true);
			//this.isEsNuevoFacturaImpresion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFacturaImpresion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturaImpresion(false) ;
			
			if(facturaimpresionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FacturaImpresionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturaImpresion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaImpresion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFacturaImpresionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFacturaImpresion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFacturaImpresion(true);
			//this.isEsNuevoFacturaImpresion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.facturaimpresion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFacturaImpresion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFacturaImpresion(false) ;
			
			if(FacturaImpresionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturaImpresion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaImpresion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Factura")) {
				if(!this.facturaimpresionConstantesFunciones.cargarid_facturaFacturaImpresion) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingFacturaImpresion(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosFacturaImpresion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,FacturaImpresionConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturaImpresion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoFactuImpre(List<EstadoFactuImpre> estadofactuimpresForeignKey)throws Exception{
		TableColumn tableColumnEstadoFactuImpre=this.jTableDatosFacturaImpresion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE));
		TableCellEditor tableCellEditorEstadoFactuImpre =tableColumnEstadoFactuImpre.getCellEditor();

		EstadoFactuImpreTableCell estadofactuimpreTableCellFk=(EstadoFactuImpreTableCell)tableCellEditorEstadoFactuImpre;

		if(estadofactuimpreTableCellFk!=null) {
			estadofactuimpreTableCellFk.setestadofactuimpresForeignKey(estadofactuimpresForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturaImpresion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadofactuimpreTableCellFk.setRowActual(intSelectedRow);
			//estadofactuimpreTableCellFk.setestadofactuimpresForeignKeyActual(estadofactuimpresForeignKey);
		//}


		if(estadofactuimpreTableCellFk!=null) {
			estadofactuimpreTableCellFk.RecargarEstadoFactuImpresForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFacturaImpresion(false);
			
			//if(!this.isEsNuevoFacturaImpresion) {								
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
				
			}
			
			if(this.permiteMantenimiento(this.facturaimpresion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFacturaImpresion=true;
					this.inicializarActualizarBindingTablaFacturaImpresion(false);
					this.isEsNuevoFacturaImpresion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFacturaImpresion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFacturaImpresion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturaImpresion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturaImpresion(false);
				
				this.habilitarDeshabilitarControlesFacturaImpresion(false);
			
												
				
				if(FacturaImpresionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFacturaImpresion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFacturaImpresionActionPerformed(evt,facturaimpresionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFacturaImpresion(this.facturaimpresion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFacturaImpresion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,facturaimpresionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.facturaimpresion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				this.facturaimpresion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				this.facturaimpresion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.facturaimpresion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FacturaImpresionModel) this.jTableDatosFacturaImpresion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFacturaImpresion=true;
				this.inicializarActualizarBindingTablaFacturaImpresion(false);
				this.isEsNuevoFacturaImpresion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturaImpresion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturaImpresion(false);
				
				this.habilitarDeshabilitarControlesFacturaImpresion(false);
				
				
				
				if(FacturaImpresionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFacturaImpresion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFacturaImpresion.getRowCount()>=1) {
				jTableDatosFacturaImpresion.removeRowSelectionInterval(0, jTableDatosFacturaImpresion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFacturaImpresion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFacturaImpresion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturaImpresion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaImpresion(false) ;
			
			this.isEsNuevoFacturaImpresion=false;
			
			if(FacturaImpresionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFacturaImpresion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFacturaImpresion(false);
				
				//SI ES MANUAL
				if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFacturaImpresion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFacturaImpresion--;			
			//FacturaImpresion facturaimpresionAux= new FacturaImpresion();			
			//facturaimpresionAux.setId(this.iIdNuevoFacturaImpresion);
			
			if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFacturaImpresion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
			
			this.facturaimpresion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.facturaimpresionLogic.getFacturaImpresions().add(this.facturaimpresionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.facturaimpresions.add(this.facturaimpresionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFacturaImpresion(false);
			
			this.jTableDatosFacturaImpresion.setRowSelectionInterval(this.getIndiceNuevoFacturaImpresion(), this.getIndiceNuevoFacturaImpresion());
			
			int iLastRow =  this.jTableDatosFacturaImpresion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFacturaImpresion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFacturaImpresion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFacturaImpresion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFacturaImpresion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaImpresion(false);
			
			//SI ES MANUAL
			if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturaImpresion();
			}
			
			//this.abrirFrameTreeFacturaImpresion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Factura ImpresionES ?", "MANTENIMIENTO DE Factura Impresion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFacturaImpresion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFacturaImpresion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.facturaimpresionReturnGeneral=facturaimpresionLogic.procesarImportacionFacturaImpresionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.facturaimpresionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFacturaImpresionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFacturaImpresion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFacturaImpresion.setFileImportacion(this.jInternalFrameImportacionFacturaImpresion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFacturaImpresion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFacturaImpresion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFacturaImpresion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFacturaImpresion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();		

		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FacturaImpresionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FacturaImpresionBaseDesign.jrxml";
			
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
			
			this.generarReporteFacturaImpresions("Todos",facturaimpresionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoFactuImpre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoFactuImpre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoFactuImpre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoFactuImpre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFacturaImpresion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE:
					sNombreCampoCategoria="id_estado_factu_impre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE:
					sNombreCampoCategoriaValor="id_estado_factu_impre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Factu Impre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_factu_impre");
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
	
	public void jButtonGenerarExcelReporteDinamicoFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();		
		
		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaimpresion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FacturaImpresions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FacturaImpresion facturaimpresion:facturaimpresionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaimpresion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(FacturaImpresion facturaimpresion:facturaimpresionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaimpresion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(FacturaImpresion facturaimpresion:facturaimpresionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaimpresion.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE);
					iRow++;

					for(FacturaImpresion facturaimpresion:facturaimpresionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturaimpresion.getestadofactuimpre_descripcion());
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
			//	this.getFilaCabeceraExportarExcelFacturaImpresion(row);				
			//	iRow++;
			//}				
			
			//for(FacturaImpresion facturaimpresionAux:facturaimpresionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFacturaImpresion(facturaimpresionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
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
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaImpresion(false);
			
			//SI ES MANUAL
			if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturaImpresion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaImpresion(false);
			
			//SI ES MANUAL
			if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturaImpresion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaImpresion(false);
			
			//SI ES MANUAL
			if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturaImpresion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFacturaImpresion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFacturaImpresion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFacturaImpresion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFacturaImpresion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFacturaImpresion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFacturaImpresion.setMinimumSize(dimensionMinimum);
		this.jTableDatosFacturaImpresion.setMaximumSize(dimensionMaximum);
		this.jTableDatosFacturaImpresion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFacturaImpresion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFacturaImpresion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFacturaImpresion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFacturaImpresion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFacturaImpresion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFacturaImpresion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturaImpresion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFacturaImpresion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFacturaImpresion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFacturaImpresion();
		
		this.inicializarActualizarBindingBotonesManualFacturaImpresion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFacturaImpresion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturaImpresion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFacturaImpresion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFacturaImpresion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFacturaImpresion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFacturaImpresion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFacturaImpresion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFacturaImpresion.jCheckBoxPostAccionNuevoFacturaImpresion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFacturaImpresion.jCheckBoxPostAccionSinCerrarFacturaImpresion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFacturaImpresion.jCheckBoxPostAccionSinMensajeFacturaImpresion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFacturaImpresion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFacturaImpresion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFacturaImpresion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
				this.jInternalFrameDetalleFormFacturaImpresion.jCheckBoxPostAccionNuevoFacturaImpresion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFacturaImpresion.jCheckBoxPostAccionSinCerrarFacturaImpresion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFacturaImpresion.jCheckBoxPostAccionSinMensajeFacturaImpresion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFacturaImpresion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFacturaImpresion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFacturaImpresion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFacturaImpresion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFacturaImpresion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFacturaImpresion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFacturaImpresion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFacturaImpresion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFacturaImpresion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFacturaImpresion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFacturaImpresion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFacturaImpresion(Boolean esInicializar) throws Exception {
		try	{	
			if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFacturaImpresion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFacturaImpresion() throws Exception {
		try	{
			if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturaImpresion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturaImpresion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturaImpresion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFacturaImpresion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFacturaImpresion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFacturaImpresion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFacturaImpresion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFacturaImpresion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFacturaImpresion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFacturaImpresion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFacturaImpresion.addItem(reporte);
			}
			
			
			if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFacturaImpresion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFacturaImpresion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFacturaImpresion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFacturaImpresion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFacturaImpresion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFacturaImpresion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFacturaImpresion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFacturaImpresion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFacturaImpresion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturaImpresion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturaImpresion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturaImpresion!=null) {
				this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturaImpresion!=null) {
				this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturaImpresion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFacturaImpresion!=null) {
				
				if(this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturaImpresion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFacturaImpresion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturaImpresion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturaImpresion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFacturaImpresion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.getSelectedItem()!=null){this.id_estado_factu_impreFK_IdEstadoFactuImpre=((EstadoFactuImpre)this.jComboBoxid_estado_factu_impreFK_IdEstadoFactuImpreFacturaImpresion.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaFacturaImpresion.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaFacturaImpresion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFacturaImpresion(Boolean esInicializar) throws Exception {				
		if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFacturaImpresion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFacturaImpresion() throws Exception {
		this.inicializarActualizarBindingTablaFacturaImpresion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFacturaImpresion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FacturaImpresionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FacturaImpresionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFacturaImpresionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FacturaImpresionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FacturaImpresionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFacturaImpresion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=facturaimpresionLogic.getFacturaImpresions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=facturaimpresions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFacturaImpresion.setModel(new FacturaImpresionModel(this.facturaimpresionLogic.getFacturaImpresions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFacturaImpresion.setModel(new FacturaImpresionModel(this.facturaimpresions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFacturaImpresion!=null && this.jInternalFrameOrderByFacturaImpresion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFacturaImpresion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFacturaImpresion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FacturaImpresionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO,facturaimpresionConstantesFunciones.resaltarSeleccionarFacturaImpresion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO,facturaimpresionConstantesFunciones.resaltarSeleccionarFacturaImpresion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFacturaImpresion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,FacturaImpresionConstantesFunciones.LABEL_ID));

		if(this.facturaimpresionConstantesFunciones.mostraridFacturaImpresion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaImpresionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturaimpresionConstantesFunciones.resaltaridFacturaImpresion,this.facturaimpresionConstantesFunciones.activaridFacturaImpresion,this,true,"idFacturaImpresion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturaimpresionConstantesFunciones.resaltaridFacturaImpresion,this.facturaimpresionConstantesFunciones.activaridFacturaImpresion,this,true,"idFacturaImpresion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaImpresion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.facturaimpresionConstantesFunciones.mostrarid_empresaFacturaImpresion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.facturaimpresionConstantesFunciones.resaltarid_empresaFacturaImpresion,this,this.facturaimpresionConstantesFunciones.activarid_empresaFacturaImpresion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.facturaimpresionConstantesFunciones.resaltarid_empresaFacturaImpresion,this,this.facturaimpresionConstantesFunciones.activarid_empresaFacturaImpresion,false,"id_empresaFacturaImpresion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaImpresionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaImpresion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.facturaimpresionConstantesFunciones.mostrarid_sucursalFacturaImpresion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.facturaimpresionConstantesFunciones.resaltarid_sucursalFacturaImpresion,this,this.facturaimpresionConstantesFunciones.activarid_sucursalFacturaImpresion));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.facturaimpresionConstantesFunciones.resaltarid_sucursalFacturaImpresion,this,this.facturaimpresionConstantesFunciones.activarid_sucursalFacturaImpresion,false,"id_sucursalFacturaImpresion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaImpresionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaImpresion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,FacturaImpresionConstantesFunciones.LABEL_IDFACTURA));

		if(this.facturaimpresionConstantesFunciones.mostrarid_facturaFacturaImpresion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaImpresionConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.facturaimpresionConstantesFunciones.resaltarid_facturaFacturaImpresion,this,this.facturaimpresionConstantesFunciones.activarid_facturaFacturaImpresion));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.facturaimpresionConstantesFunciones.resaltarid_facturaFacturaImpresion,this,this.facturaimpresionConstantesFunciones.activarid_facturaFacturaImpresion,true,"id_facturaFacturaImpresion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaImpresionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaImpresion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE));

		if(this.facturaimpresionConstantesFunciones.mostrarid_estado_factu_impreFacturaImpresion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoFactuImpreTableCell(this.estadofactuimpresForeignKey,this.facturaimpresionConstantesFunciones.resaltarid_estado_factu_impreFacturaImpresion,this,this.facturaimpresionConstantesFunciones.activarid_estado_factu_impreFacturaImpresion));
			tableColumn.setCellEditor(new EstadoFactuImpreTableCell(this.estadofactuimpresForeignKey,this.facturaimpresionConstantesFunciones.resaltarid_estado_factu_impreFacturaImpresion,this,this.facturaimpresionConstantesFunciones.activarid_estado_factu_impreFacturaImpresion,true,"id_estado_factu_impreFacturaImpresion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaImpresionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturaimpresionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturaimpresionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturaImpresion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturaimpresionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturaimpresionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturaImpresion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.facturaimpresionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.facturaimpresionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFacturaImpresion.addColumn(tableColumn);
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
			
			this.jTableDatosFacturaImpresion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFacturaImpresion.moveColumn(this.jTableDatosFacturaImpresion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFacturaImpresion.moveColumn(this.jTableDatosFacturaImpresion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFacturaImpresion.moveColumn(this.jTableDatosFacturaImpresion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFacturaImpresion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFacturaImpresion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFacturaImpresion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFacturaImpresion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFacturaImpresion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFacturaImpresion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFacturaImpresion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFacturaImpresion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=facturaimpresionLogic.getFacturaImpresions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=facturaimpresions.size()-1;
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
		//this.jTableDatosFacturaImpresion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFacturaImpresion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFacturaImpresion();
			
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
				
				//this.isEsNuevoFacturaImpresion=false;
					
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
				if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFacturaImpresion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturaImpresion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturaImpresion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.facturaimpresion.getsType().equals("DUPLICADO")
				   || this.facturaimpresion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFacturaImpresion=true;
				
				} else {
					this.isEsNuevoFacturaImpresion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
					if(this.facturaimpresion.getId()>=0 && !this.facturaimpresion.getIsNew()) {						
						this.isEsNuevoFacturaImpresion=false;
						
					} else {
						this.isEsNuevoFacturaImpresion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFacturaImpresion(esRelaciones);						
				
				this.seleccionarFacturaImpresion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.facturaimpresion.getId()<0) {
					this.isEsNuevoFacturaImpresion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFacturaImpresion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFacturaImpresion(evt,rowIndex);
				}	
				
				if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FacturaImpresion: " + this.dDif); 
					}
				}								
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFacturaImpresion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.facturaimpresion)) {
					if(this.facturaimpresion.getId()>0) {
						this.facturaimpresion.setIsDeleted(true);
						
						this.facturaimpresionsEliminados.add(this.facturaimpresion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturaimpresionLogic.getFacturaImpresions().remove(this.facturaimpresion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturaimpresions.remove(this.facturaimpresion);				
					}
					
					
					((FacturaImpresionModel) this.jTableDatosFacturaImpresion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturaImpresion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFacturaImpresion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFacturaImpresion) {
			
			if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturaImpresion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturaImpresion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFacturaImpresion(this.facturaimpresion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.facturaimpresionConstantesFunciones.cargarid_empresaFacturaImpresion || this.facturaimpresionConstantesFunciones.event_dependid_empresaFacturaImpresion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.facturaimpresion.getid_empresa());
									//this.inicializarActualizarBindingFacturaImpresion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(facturaimpresion.getEmpresa()!=null) {
							this.empresasForeignKey.add(facturaimpresion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.facturaimpresion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.facturaimpresionConstantesFunciones.cargarid_sucursalFacturaImpresion || this.facturaimpresionConstantesFunciones.event_dependid_sucursalFacturaImpresion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.facturaimpresion.getid_sucursal());
									//this.inicializarActualizarBindingFacturaImpresion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(facturaimpresion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(facturaimpresion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.facturaimpresion.getid_sucursal(),false,"Formulario");

					//Factura
					if(!this.facturaimpresionConstantesFunciones.cargarid_facturaFacturaImpresion || this.facturaimpresionConstantesFunciones.event_dependid_facturaFacturaImpresion) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.facturaimpresion.getid_factura());
									//this.inicializarActualizarBindingFacturaImpresion(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(facturaimpresion.getFactura()!=null) {
							this.facturasForeignKey.add(facturaimpresion.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.facturaimpresion.getid_factura(),false,"Formulario");

					//EstadoFactuImpre
					if(!this.facturaimpresionConstantesFunciones.cargarid_estado_factu_impreFacturaImpresion || this.facturaimpresionConstantesFunciones.event_dependid_estado_factu_impreFacturaImpresion) {
						//this.cargarCombosEstadoFactuImpresForeignKeyLista(" where id="+this.facturaimpresion.getid_estado_factu_impre());
									//this.inicializarActualizarBindingFacturaImpresion(false,false);
						this.estadofactuimpresForeignKey=new ArrayList<EstadoFactuImpre>();

						if(facturaimpresion.getEstadoFactuImpre()!=null) {
							this.estadofactuimpresForeignKey.add(facturaimpresion.getEstadoFactuImpre());
						}

						this.addItemDefectoCombosForeignKeyEstadoFactuImpre();
						this.cargarCombosFrameEstadoFactuImpresForeignKey("Todos");
					}
					this.setActualEstadoFactuImpreForeignKey(this.facturaimpresion.getid_estado_factu_impre(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFacturaImpresion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFacturaImpresion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturaImpresion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturaImpresion(FacturaImpresion facturaimpresion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFacturaImpresion(facturaimpresion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturaImpresion(FacturaImpresion facturaimpresion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFacturaImpresion(facturaimpresion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFacturaImpresion(facturaimpresion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFacturaImpresion(facturaimpresion);
	}
	
	public void setVariablesObjetoActualToFormularioFacturaImpresion(FacturaImpresion facturaimpresion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.setText(facturaimpresion.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FacturaImpresion facturaimpresionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,facturaimpresionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FacturaImpresion facturaimpresionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				facturaimpresionLocal=this.facturaimpresion;
			} else {
				facturaimpresionLocal=this.facturaimpresionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(facturaimpresionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFacturaImpresion(facturaimpresionLocal,true);
					
					if(facturaimpresionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(facturaimpresionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(facturaimpresionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFacturaImpresion(FacturaImpresion facturaimpresion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturaImpresion(facturaimpresion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(facturaimpresion);
	}
	
	public void setVariablesFormularioToObjetoActualFacturaImpresion(FacturaImpresion facturaimpresion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturaImpresion(facturaimpresion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFacturaImpresion(FacturaImpresion facturaimpresion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.getText()==null || this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.getText()=="" || this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.getText()=="Id") {
				this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.setText("0");
			}

			if(conColumnasBase) {facturaimpresion.setId(Long.parseLong(this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaImpresionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaImpresion.jLabelIdFacturaImpresion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturaImpresion(FacturaImpresion facturaimpresionBean,FacturaImpresion facturaimpresion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && facturaimpresionBean.getid_factura()!=null && !facturaimpresionBean.getid_factura().equals(-1L))) {facturaimpresion.setid_factura(facturaimpresionBean.getid_factura());}
			if(conDefault || (!conDefault && facturaimpresionBean.getid_estado_factu_impre()!=null && !facturaimpresionBean.getid_estado_factu_impre().equals(-1L))) {facturaimpresion.setid_estado_factu_impre(facturaimpresionBean.getid_estado_factu_impre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFacturaImpresion(FacturaImpresion facturaimpresionOrigen,FacturaImpresion facturaimpresion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturaimpresionOrigen.getId()!=null && !facturaimpresionOrigen.getId().equals(0L))) {facturaimpresion.setId(facturaimpresionOrigen.getId());}}
			if(conDefault || (!conDefault && facturaimpresionOrigen.getid_factura()!=null && !facturaimpresionOrigen.getid_factura().equals(-1L))) {facturaimpresion.setid_factura(facturaimpresionOrigen.getid_factura());}
			if(conDefault || (!conDefault && facturaimpresionOrigen.getid_estado_factu_impre()!=null && !facturaimpresionOrigen.getid_estado_factu_impre().equals(-1L))) {facturaimpresion.setid_estado_factu_impre(facturaimpresionOrigen.getid_estado_factu_impre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturaImpresion(FacturaImpresion facturaimpresion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.setText(facturaimpresion.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturaImpresion(FacturaImpresionBean facturaimpresionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.setText(facturaimpresionBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFacturaImpresion(FacturaImpresionParameterReturnGeneral facturaimpresionReturnGeneral,FacturaImpresionBean facturaimpresionBean,Boolean conDefault) throws Exception { 
		try {
			FacturaImpresion facturaimpresionLocal=new FacturaImpresion();
			
			facturaimpresionLocal=facturaimpresionReturnGeneral.getFacturaImpresion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturaimpresionLocal.getId()!=null && !facturaimpresionLocal.getId().equals(0L))) {facturaimpresionBean.setId(facturaimpresionLocal.getId());}}
			if(conDefault || (!conDefault && facturaimpresionLocal.getid_factura()!=null && !facturaimpresionLocal.getid_factura().equals(-1L))) {facturaimpresionBean.setid_factura(facturaimpresionLocal.getid_factura());}
			if(conDefault || (!conDefault && facturaimpresionLocal.getid_estado_factu_impre()!=null && !facturaimpresionLocal.getid_estado_factu_impre().equals(-1L))) {facturaimpresionBean.setid_estado_factu_impre(facturaimpresionLocal.getid_estado_factu_impre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFacturaImpresionGenerico(Long idFacturaImpresionSeleccionado,JComboBox jComboBoxFacturaImpresion,List<FacturaImpresion> facturaimpresionsLocal)throws Exception {
		try {
			FacturaImpresion  facturaimpresionTemp=null;

			for(FacturaImpresion facturaimpresionAux:facturaimpresionsLocal) {
				if(facturaimpresionAux.getId()!=null && facturaimpresionAux.getId().equals(idFacturaImpresionSeleccionado)) {
					facturaimpresionTemp=facturaimpresionAux;
					break;
				}
			}

			jComboBoxFacturaImpresion.setSelectedItem(facturaimpresionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFacturaImpresionGenerico(JComboBox jComboBoxFacturaImpresion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturaImpresion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFacturaImpresion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturaImpresion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFacturaImpresion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturaimpresion=(FacturaImpresion) facturaimpresionLogic.getFacturaImpresions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturaimpresion =(FacturaImpresion) facturaimpresions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!facturaimpresion.getIsNew() && !facturaimpresion.getIsChanged() && !facturaimpresion.getIsDeleted()) {
				sDescripcion=facturaimpresion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=facturaimpresion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!facturaimpresion.getIsNew() && !facturaimpresion.getIsChanged() && !facturaimpresion.getIsDeleted()) {
				sDescripcion=facturaimpresion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=facturaimpresion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!facturaimpresion.getIsNew() && !facturaimpresion.getIsChanged() && !facturaimpresion.getIsDeleted()) {
				sDescripcion=facturaimpresion.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=facturaimpresion.getfactura_descripcion();
			}
		}

		if(sTipo.equals("EstadoFactuImpre")) {
			//sDescripcion=this.getActualEstadoFactuImpreForeignKeyDescripcion((Long)value);
			if(!facturaimpresion.getIsNew() && !facturaimpresion.getIsChanged() && !facturaimpresion.getIsDeleted()) {
				sDescripcion=facturaimpresion.getestadofactuimpre_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoFactuImpreForeignKeyDescripcion((Long)value);
				sDescripcion=facturaimpresion.getestadofactuimpre_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FacturaImpresion facturaimpresionRow=new FacturaImpresion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturaimpresionRow=(FacturaImpresion) facturaimpresionLogic.getFacturaImpresions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturaimpresionRow=(FacturaImpresion) facturaimpresions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFacturaImpresion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFacturaImpresion.setVisible((this.isVisibilidadCeldaNuevoFacturaImpresion && this.isPermisoNuevoFacturaImpresion));			
			this.jButtonDuplicarFacturaImpresion.setVisible((this.isVisibilidadCeldaDuplicarFacturaImpresion && this.isPermisoDuplicarFacturaImpresion));			
			this.jButtonCopiarFacturaImpresion.setVisible((this.isVisibilidadCeldaCopiarFacturaImpresion && this.isPermisoCopiarFacturaImpresion));
			this.jButtonVerFormFacturaImpresion.setVisible((this.isVisibilidadCeldaVerFormFacturaImpresion && this.isPermisoVerFormFacturaImpresion));
			
			this.jButtonAbrirOrderByFacturaImpresion.setVisible((this.isVisibilidadCeldaOrdenFacturaImpresion && this.isPermisoOrdenFacturaImpresion));			
			
			this.jButtonNuevoRelacionesFacturaImpresion.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion && this.isPermisoNuevoFacturaImpresion));			
			this.jButtonNuevoGuardarCambiosFacturaImpresion.setVisible((this.isVisibilidadCeldaNuevoFacturaImpresion && this.isPermisoNuevoFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));
			
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonModificarFacturaImpresion.setVisible((this.isVisibilidadCeldaModificarFacturaImpresion && this.isPermisoActualizarFacturaImpresion));	
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarFacturaImpresion.setVisible((this.isVisibilidadCeldaActualizarFacturaImpresion && this.isPermisoActualizarFacturaImpresion));	
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarFacturaImpresion.setVisible((this.isVisibilidadCeldaEliminarFacturaImpresion && this.isPermisoEliminarFacturaImpresion));
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarFacturaImpresion.setVisible(this.isVisibilidadCeldaCancelarFacturaImpresion);							
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosFacturaImpresion.setVisible((this.isVisibilidadCeldaGuardarFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));			
			
			}
						
			this.jButtonGuardarCambiosTablaFacturaImpresion.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaNuevoFacturaImpresion && this.isPermisoNuevoFacturaImpresion));						
			this.jButtonDuplicarToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaDuplicarFacturaImpresion && this.isPermisoDuplicarFacturaImpresion));						
			this.jButtonCopiarToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaCopiarFacturaImpresion && this.isPermisoCopiarFacturaImpresion));			
			this.jButtonVerFormToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaVerFormFacturaImpresion && this.isPermisoVerFormFacturaImpresion));			
			this.jButtonAbrirOrderByToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaOrdenFacturaImpresion && this.isPermisoOrdenFacturaImpresion));
			this.jButtonNuevoRelacionesToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion && this.isPermisoNuevoFacturaImpresion));			
			this.jButtonNuevoGuardarCambiosToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaNuevoFacturaImpresion && this.isPermisoNuevoFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));			
			
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonModificarToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaModificarFacturaImpresion && this.isPermisoActualizarFacturaImpresion));	
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaActualizarFacturaImpresion  && this.isPermisoActualizarFacturaImpresion));	
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaEliminarFacturaImpresion && this.isPermisoEliminarFacturaImpresion));
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarToolBarFacturaImpresion.setVisible(this.isVisibilidadCeldaCancelarFacturaImpresion);				
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaGuardarFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFacturaImpresion.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFacturaImpresion.setVisible((this.isVisibilidadCeldaNuevoFacturaImpresion && this.isPermisoNuevoFacturaImpresion));			
			this.jMenuItemDuplicarFacturaImpresion.setVisible((this.isVisibilidadCeldaDuplicarFacturaImpresion && this.isPermisoDuplicarFacturaImpresion));			
			this.jMenuItemCopiarFacturaImpresion.setVisible((this.isVisibilidadCeldaCopiarFacturaImpresion && this.isPermisoCopiarFacturaImpresion));			
			this.jMenuItemVerFormFacturaImpresion.setVisible((this.isVisibilidadCeldaVerFormFacturaImpresion && this.isPermisoVerFormFacturaImpresion));			
			this.jMenuItemAbrirOrderByFacturaImpresion.setVisible((this.isVisibilidadCeldaOrdenFacturaImpresion && this.isPermisoOrdenFacturaImpresion));			
			//this.jMenuItemMostrarOcultarFacturaImpresion.setVisible((this.isVisibilidadCeldaOrdenFacturaImpresion && this.isPermisoOrdenFacturaImpresion));
			this.jMenuItemDetalleAbrirOrderByFacturaImpresion.setVisible((this.isVisibilidadCeldaOrdenFacturaImpresion && this.isPermisoOrdenFacturaImpresion));			
			//this.jMenuItemDetalleMostrarOcultarFacturaImpresion.setVisible((this.isVisibilidadCeldaOrdenFacturaImpresion && this.isPermisoOrdenFacturaImpresion));			
			this.jMenuItemNuevoRelacionesFacturaImpresion.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion && this.isPermisoNuevoFacturaImpresion));			
			this.jMenuItemNuevoGuardarCambiosFacturaImpresion.setVisible((this.isVisibilidadCeldaNuevoFacturaImpresion && this.isPermisoNuevoFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));									
			
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemModificarFacturaImpresion.setVisible((this.isVisibilidadCeldaModificarFacturaImpresion && this.isPermisoActualizarFacturaImpresion));	
			this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemActualizarFacturaImpresion.setVisible((this.isVisibilidadCeldaActualizarFacturaImpresion && this.isPermisoActualizarFacturaImpresion));	
			this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemEliminarFacturaImpresion.setVisible((this.isVisibilidadCeldaEliminarFacturaImpresion && this.isPermisoEliminarFacturaImpresion));
			this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemCancelarFacturaImpresion.setVisible(this.isVisibilidadCeldaCancelarFacturaImpresion);				
			}
			
			this.jMenuItemGuardarCambiosFacturaImpresion.setVisible((this.isVisibilidadCeldaGuardarFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));						
			this.jMenuItemGuardarCambiosTablaFacturaImpresion.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFacturaImpresion=this.jButtonNuevoFacturaImpresion.isVisible();
			this.isVisibilidadCeldaDuplicarFacturaImpresion=this.jButtonDuplicarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaCopiarFacturaImpresion=this.jButtonCopiarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaVerFormFacturaImpresion=this.jButtonVerFormFacturaImpresion.isVisible();
			
			this.isVisibilidadCeldaOrdenFacturaImpresion=this.jButtonAbrirOrderByFacturaImpresion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=this.jButtonNuevoRelacionesFacturaImpresion.isVisible();
			this.isVisibilidadCeldaModificarFacturaImpresion=this.jButtonModificarFacturaImpresion.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			this.isVisibilidadCeldaActualizarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaEliminarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaCancelarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaGuardarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosFacturaImpresion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=this.jButtonGuardarCambiosTablaFacturaImpresion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFacturaImpresion=this.jButtonNuevoToolBarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=this.jButtonNuevoRelacionesToolBarFacturaImpresion.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			this.isVisibilidadCeldaModificarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jButtonModificarToolBarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaActualizarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarToolBarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaEliminarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarToolBarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaCancelarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarToolBarFacturaImpresion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturaImpresion=this.jButtonGuardarCambiosToolBarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=this.jButtonGuardarCambiosTablaToolBarFacturaImpresion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFacturaImpresion=this.jMenuItemNuevoFacturaImpresion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=this.jMenuItemNuevoRelacionesFacturaImpresion.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			this.isVisibilidadCeldaModificarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemModificarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaActualizarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemActualizarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaEliminarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemEliminarFacturaImpresion.isVisible();
			this.isVisibilidadCeldaCancelarFacturaImpresion=this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemCancelarFacturaImpresion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturaImpresion=this.jMenuItemGuardarCambiosFacturaImpresion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=this.jMenuItemGuardarCambiosTablaFacturaImpresion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFacturaImpresion(Boolean esInicializar) {
		if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {
				//if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFacturaImpresion();
			}
			
			this.inicializarActualizarBindingBotonesManualFacturaImpresion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFacturaImpresion() {
		this.jButtonNuevoFacturaImpresion.setVisible(this.isPermisoNuevoFacturaImpresion);			
		this.jButtonDuplicarFacturaImpresion.setVisible(this.isPermisoDuplicarFacturaImpresion);			
		this.jButtonCopiarFacturaImpresion.setVisible(this.isPermisoCopiarFacturaImpresion);			
		this.jButtonVerFormFacturaImpresion.setVisible(this.isPermisoVerFormFacturaImpresion);			
		
		this.jButtonAbrirOrderByFacturaImpresion.setVisible(this.isPermisoOrdenFacturaImpresion);					
		
		this.jButtonNuevoRelacionesFacturaImpresion.setVisible(this.isPermisoNuevoFacturaImpresion);			
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonModificarFacturaImpresion.setVisible(this.isPermisoActualizarFacturaImpresion);	
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarFacturaImpresion.setVisible(this.isPermisoActualizarFacturaImpresion);	
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarFacturaImpresion.setVisible(this.isPermisoEliminarFacturaImpresion);
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarFacturaImpresion.setVisible(this.isVisibilidadCeldaCancelarFacturaImpresion);						
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosFacturaImpresion.setVisible(this.isPermisoGuardarCambiosFacturaImpresion);							
		}
		
		this.jButtonGuardarCambiosTablaFacturaImpresion.setVisible(this.isPermisoActualizarFacturaImpresion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturaImpresion() {
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonModificarFacturaImpresion.setVisible(this.isPermisoActualizarFacturaImpresion);	
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarFacturaImpresion.setVisible(this.isPermisoActualizarFacturaImpresion);	
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarFacturaImpresion.setVisible(this.isPermisoEliminarFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarFacturaImpresion.setVisible(this.isVisibilidadCeldaCancelarFacturaImpresion);							
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosFacturaImpresion.setVisible((this.isVisibilidadCeldaGuardarFacturaImpresion && this.isPermisoGuardarCambiosFacturaImpresion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFacturaImpresion() {
		if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFacturaImpresion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFacturaImpresion() {
	}
	
	public void jTableDatosFacturaImpresionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFacturaImpresion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFacturaImpresionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.getfacturaimpresion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaimpresion==null) {
						this.facturaimpresion = new FacturaImpresion();
					}

					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
				}

				if(this.facturaimpresion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.facturaimpresion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaImpresion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFacturaImpresionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFacturaImpresion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaImpresion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaImpresion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaImpresion(this.getfacturaimpresion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.facturaimpresionLogic.getConnexion());

				if(this.facturaimpresion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.facturaimpresion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaImpresion=(TitledBorder)this.jScrollPanelDatosFacturaImpresion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFacturaImpresion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFacturaImpresionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.getfacturaimpresion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaimpresion==null) {
						this.facturaimpresion = new FacturaImpresion();
					}

					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
				}

				if(this.facturaimpresion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.facturaimpresion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaImpresion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalFacturaImpresionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebFacturaImpresion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaImpresion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaImpresion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaImpresion(this.getfacturaimpresion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.facturaimpresionLogic.getConnexion());

				if(this.facturaimpresion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.facturaimpresion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaImpresion=(TitledBorder)this.jScrollPanelDatosFacturaImpresion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderFacturaImpresion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalFacturaImpresionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.getfacturaimpresion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaimpresion==null) {
						this.facturaimpresion = new FacturaImpresion();
					}

					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
				}

				if(this.facturaimpresion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.facturaimpresion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaImpresion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaFacturaImpresionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.facturaBeanSwingJInternalFrame.sTipoBusqueda="Factura";

			if(!this.sFinalQueryGeneral_factura.equals("")) {
				this.facturaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_factura);
				this.facturaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.facturaBeanSwingJInternalFrame.procesarBusqueda(this.facturaBeanSwingJInternalFrame.sAccionBusqueda);
				this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingFactura(false);
			}

			if(!this.sFinalQueryComboFactura.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderFacturaImpresion=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosFacturaImpresion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderFacturaImpresion=(TitledBorder)this.jScrollPanelDatosFacturaImpresion.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderFacturaImpresion.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaFacturaImpresionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebFacturaImpresion(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaImpresion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaImpresion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaImpresion(this.getfacturaimpresion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.facturaimpresionLogic.getConnexion());

				if(this.facturaimpresion.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.facturaimpresion.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaImpresion=(TitledBorder)this.jScrollPanelDatosFacturaImpresion.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderFacturaImpresion.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaFacturaImpresionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.getfacturaimpresion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaimpresion==null) {
						this.facturaimpresion = new FacturaImpresion();
					}

					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
				}

				if(this.facturaimpresion.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.facturaimpresion.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaImpresion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_factu_impreFacturaImpresionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadofactuimpre=true;

			idTienePermisoestadofactuimpre=this.tienePermisosUsuarioEnPaginaWebFacturaImpresion(EstadoFactuImpreConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadofactuimpre) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaImpresion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaImpresion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaImpresion(this.getfacturaimpresion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);

				this.estadofactuimpreBeanSwingJInternalFrame=new EstadoFactuImpreBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadofactuimpreBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadofactuimpreBeanSwingJInternalFrame.getEstadoFactuImpreLogic().setConnexion(this.facturaimpresionLogic.getConnexion());

				if(this.facturaimpresion.getid_estado_factu_impre()!=null) {
					this.estadofactuimpreBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadofactuimpreBeanSwingJInternalFrame.setIdActual(this.facturaimpresion.getid_estado_factu_impre());
					this.estadofactuimpreBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadofactuimpreBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadofactuimpreBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoFactuImpre();
				}

				JInternalFrameBase jinternalFrame =this.estadofactuimpreBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaImpresion=(TitledBorder)this.jScrollPanelDatosFacturaImpresion.getBorder();
				TitledBorder titledBorderestadofactuimpre=(TitledBorder)this.estadofactuimpreBeanSwingJInternalFrame.jScrollPanelDatosEstadoFactuImpre.getBorder();

				titledBorderestadofactuimpre.setTitle(titledBorderFacturaImpresion.getTitle() + " -> Estado Factu Impre");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_factu_impreFacturaImpresionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.getfacturaimpresion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturaimpresion==null) {
						this.facturaimpresion = new FacturaImpresion();
					}

					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);
				}

				if(this.facturaimpresion.getid_estado_factu_impre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_factu_impre = "+this.facturaimpresion.getid_estado_factu_impre().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaImpresion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaImpresion(false,false);

			this.getFacturaImpresionsFK_IdEmpresa();

			this.inicializarActualizarBindingFacturaImpresion(false);

			//if(FacturaImpresionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaImpresion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoFactuImpreFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaImpresion(false,false);

			this.getFacturaImpresionsFK_IdEstadoFactuImpre();

			this.inicializarActualizarBindingFacturaImpresion(false);

			//if(FacturaImpresionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaImpresion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaImpresion(false,false);

			this.getFacturaImpresionsFK_IdFactura();

			this.inicializarActualizarBindingFacturaImpresion(false);

			//if(FacturaImpresionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaImpresion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalFacturaImpresionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaImpresion(false,false);

			this.getFacturaImpresionsFK_IdSucursal();

			this.inicializarActualizarBindingFacturaImpresion(false);

			//if(FacturaImpresionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaImpresion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturaimpresionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFacturaImpresion() {
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
			this.jInternalFrameDetalleFormFacturaImpresion.setVisible(false);	    			
			this.jInternalFrameDetalleFormFacturaImpresion.dispose();
			this.jInternalFrameDetalleFormFacturaImpresion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFacturaImpresion!=null) {
			this.jInternalFrameReporteDinamicoFacturaImpresion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFacturaImpresion.dispose();
			this.jInternalFrameReporteDinamicoFacturaImpresion=null;
		}
		
		if(this.jInternalFrameImportacionFacturaImpresion!=null) {
			this.jInternalFrameImportacionFacturaImpresion.setVisible(false);	    			
			this.jInternalFrameImportacionFacturaImpresion.dispose();
			this.jInternalFrameImportacionFacturaImpresion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFacturaImpresion();
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
			
			if(sTipo.equals("NuevoFacturaImpresion")) {
				jButtonNuevoFacturaImpresionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFacturaImpresion")) {
				jButtonDuplicarFacturaImpresionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFacturaImpresion")) {
				jButtonCopiarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("VerFormFacturaImpresion")) {
				jButtonVerFormFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFacturaImpresion")) {
				jButtonNuevoFacturaImpresionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFacturaImpresion")) {
				jButtonDuplicarFacturaImpresionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFacturaImpresion")) {
				jButtonNuevoFacturaImpresionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFacturaImpresion")) {
				jButtonDuplicarFacturaImpresionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFacturaImpresion")) {
				jButtonNuevoFacturaImpresionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFacturaImpresion")) {
				jButtonNuevoFacturaImpresionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFacturaImpresion")) {
				jButtonNuevoFacturaImpresionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFacturaImpresion")) {
				jButtonModificarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFacturaImpresion")) {
				jButtonModificarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFacturaImpresion")) {
				jButtonModificarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFacturaImpresion")) {
				jButtonActualizarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFacturaImpresion")) {
				jButtonActualizarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFacturaImpresion")) {
				jButtonActualizarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("EliminarFacturaImpresion")) {
				jButtonEliminarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFacturaImpresion")) {
				jButtonEliminarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFacturaImpresion")) {
				jButtonEliminarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("CancelarFacturaImpresion")) {
				jButtonCancelarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFacturaImpresion")) {
				jButtonCancelarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFacturaImpresion")) {
				jButtonCancelarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("CerrarFacturaImpresion")) {
				jButtonCerrarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFacturaImpresion")) {
				jButtonCerrarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFacturaImpresion")) {
				jButtonCerrarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFacturaImpresion")) {
				jButtonMostrarOcultarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFacturaImpresion")) {
				jButtonCancelarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFacturaImpresion")) {
				jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFacturaImpresion")) {
				jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFacturaImpresion")) {
				jButtonCopiarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFacturaImpresion")) {
				jButtonVerFormFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFacturaImpresion")) {
				jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFacturaImpresion")) {
				jButtonCopiarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFacturaImpresion")) {
				jButtonVerFormFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFacturaImpresion")) {
				jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFacturaImpresion")) {
				jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFacturaImpresion")) {
				jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFacturaImpresion")) {
				jButtonRecargarInformacionFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFacturaImpresion")) {
				jButtonRecargarInformacionFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFacturaImpresion")) {
				jButtonRecargarInformacionFacturaImpresionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFacturaImpresion")) {
				jButtonAnterioresFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFacturaImpresion")) {
				jButtonAnterioresFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFacturaImpresion")) {
				jButtonAnterioresFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFacturaImpresion")) {
				jButtonSiguientesFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFacturaImpresion")) {
				jButtonSiguientesFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFacturaImpresion")) {
				jButtonSiguientesFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFacturaImpresion") || sTipo.equals("MenuItemDetalleAbrirOrderByFacturaImpresion")) {
				jButtonAbrirOrderByFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFacturaImpresion") || sTipo.equals("MenuItemDetalleMostrarOcultarFacturaImpresion")) {
				jButtonMostrarOcultarFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFacturaImpresion")) {
				jButtonNuevoGuardarCambiosFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFacturaImpresion")) {
				jButtonNuevoGuardarCambiosFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFacturaImpresion")) {
				jButtonNuevoGuardarCambiosFacturaImpresionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFacturaImpresion")) {
				jButtonCerrarReporteDinamicoFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFacturaImpresion")) {
				jButtonGenerarReporteDinamicoFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFacturaImpresion")) {
				
				jButtonGenerarExcelReporteDinamicoFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFacturaImpresion")) {
				jButtonCerrarImportacionFacturaImpresionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFacturaImpresion")) {
				
				jButtonGenerarImportacionFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFacturaImpresion")) {
				
				jButtonAbrirImportacionFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFacturaImpresion")) {
				jComboBoxTiposAccionesFacturaImpresionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFacturaImpresion")) {
				jComboBoxTiposRelacionesFacturaImpresionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFacturaImpresion")) {
				jComboBoxTiposAccionesFacturaImpresionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFacturaImpresion")) {
				
				jComboBoxTiposSeleccionarFacturaImpresionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFacturaImpresion")) {
				jTextFieldValorCampoGeneralFacturaImpresionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFacturaImpresion")) {
				jButtonAbrirOrderByFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFacturaImpresion")) {
				jButtonAbrirOrderByFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFacturaImpresion")) {
				jButtonCerrarOrderByFacturaImpresionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturaImpresionBusqueda")) {
				this.jButtonidFacturaImpresionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturaImpresionUpdate")) {
				this.jButtonid_empresaFacturaImpresionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturaImpresionBusqueda")) {
				this.jButtonid_empresaFacturaImpresionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFacturaImpresionUpdate")) {
				this.jButtonid_sucursalFacturaImpresionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFacturaImpresionBusqueda")) {
				this.jButtonid_sucursalFacturaImpresionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaFacturaImpresion")) {
				this.jButtonid_facturaFacturaImpresionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaFacturaImpresionUpdate")) {
				this.jButtonid_facturaFacturaImpresionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaFacturaImpresionBusqueda")) {
				this.jButtonid_facturaFacturaImpresionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_factu_impreFacturaImpresionUpdate")) {
				this.jButtonid_estado_factu_impreFacturaImpresionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_factu_impreFacturaImpresionBusqueda")) {
				this.jButtonid_estado_factu_impreFacturaImpresionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_facturaFacturaImpresion")) {
				this.jButtonid_facturaFacturaImpresionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEstadoFactuImpreFacturaImpresion")) {
				this.jButtonFK_IdEstadoFactuImpreFacturaImpresionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaFacturaImpresion")) {
				this.jButtonFK_IdFacturaFacturaImpresionActionPerformed(evt);
			}
			
			;
			
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFacturaImpresion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaImpresionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				


				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FacturaImpresion facturaimpresionLocal=null;
			
			if(!this.getEsControlTabla()) {
				facturaimpresionLocal=this.facturaimpresion;
			} else {
				facturaimpresionLocal=this.facturaimpresionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
							
				
				


				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaImpresionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
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
			
			


			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaImpresionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
								
						
				


				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
								
				
				


				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaImpresionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaImpresionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaImpresionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
							
				
				


				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaImpresionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
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
			
			


			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaImpresionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
								
				
				


				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaImpresionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaImpresionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaImpresionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFacturaImpresion")) {
					jCheckBoxSeleccionarTodosFacturaImpresionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFacturaImpresion")) {
					jCheckBoxSeleccionadosFacturaImpresionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFacturaImpresion")) {
					
				}
				
				


				
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
												
				
				


				
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaImpresionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaImpresionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
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
			
			


			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaImpresionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturaimpresion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturaimpresion);
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
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
				
				


				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaImpresion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaImpresion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaImpresionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturaimpresionAnterior =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFacturaImpresion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFacturaImpresionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFacturaImpresion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.facturaimpresion =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.facturaimpresion =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.facturaimpresion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFacturaImpresion")) {
				
				}
				
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFacturaImpresion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFacturaImpresion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFacturaImpresion")) {
			
			}
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFacturaImpresion();
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
			if(sTipo.equals("NuevoFacturaImpresion")) {
				jButtonNuevoFacturaImpresionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFacturaImpresion")) {
				jButtonDuplicarFacturaImpresionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFacturaImpresion")) {
				jButtonCopiarFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFacturaImpresion")) {
				jButtonVerFormFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFacturaImpresion")) {
				jButtonNuevoFacturaImpresionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFacturaImpresion")) {
				jButtonModificarFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFacturaImpresion")) {
				jButtonActualizarFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFacturaImpresion")) {
				jButtonEliminarFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFacturaImpresion")) {
				jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFacturaImpresion")) {
				jButtonCancelarFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFacturaImpresion")) {
				jButtonCerrarFacturaImpresionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFacturaImpresion")) {
				jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFacturaImpresion")) {
				jButtonNuevoGuardarCambiosFacturaImpresionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFacturaImpresion")) {
				jButtonAbrirOrderByFacturaImpresionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFacturaImpresion")) {
				jButtonRecargarInformacionFacturaImpresionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFacturaImpresion")) {
				jButtonAnterioresFacturaImpresionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFacturaImpresion")) {
				jButtonSiguientesFacturaImpresionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturaImpresionBusqueda")) {
				this.jButtonidFacturaImpresionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturaImpresionUpdate")) {
				this.jButtonid_empresaFacturaImpresionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturaImpresionBusqueda")) {
				this.jButtonid_empresaFacturaImpresionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFacturaImpresionUpdate")) {
				this.jButtonid_sucursalFacturaImpresionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFacturaImpresionBusqueda")) {
				this.jButtonid_sucursalFacturaImpresionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaFacturaImpresion")) {
				this.jButtonid_facturaFacturaImpresionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaFacturaImpresionUpdate")) {
				this.jButtonid_facturaFacturaImpresionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaFacturaImpresionBusqueda")) {
				this.jButtonid_facturaFacturaImpresionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_factu_impreFacturaImpresionUpdate")) {
				this.jButtonid_estado_factu_impreFacturaImpresionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_factu_impreFacturaImpresionBusqueda")) {
				this.jButtonid_estado_factu_impreFacturaImpresionBusquedaActionPerformed(evt);
			}
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFacturaImpresion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFacturaImpresion")) {
				closingInternalFrameFacturaImpresion();
				
			} else if(sTipo.equals("jButtonCancelarFacturaImpresion")) {
				JInternalFrameBase jInternalFrameDetalleFormFacturaImpresion = (JInternalFrameBase)evt.getSource();
	            	
	            FacturaImpresionBeanSwingJInternalFrame jInternalFrameParent=(FacturaImpresionBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturaImpresion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFacturaImpresionActionPerformed(null);
			}
			
			FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturaimpresion,new Object(),this.facturaimpresionParameterGeneral,this.facturaimpresionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFacturaImpresion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFacturaImpresion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFacturaImpresion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.facturaimpresion)) {
			if(!esControlTabla) {
				if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);			
				}
				
				if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFacturaImpresion(this.facturaimpresion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.facturaimpresionReturnGeneral=facturaimpresionLogic.procesarEventosFacturaImpresionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturaimpresionLogic.getFacturaImpresions(),this.facturaimpresion,this.facturaimpresionParameterGeneral,this.isEsNuevoFacturaImpresion,classes);//this.facturaimpresionLogic.getFacturaImpresion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFacturaImpresion(this.facturaimpresionReturnGeneral,this.facturaimpresionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFacturaImpresion(classes,this.facturaimpresionReturnGeneral,this.facturaimpresionBean,false);
					}
						
					if(this.facturaimpresionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFacturaImpresion(this.facturaimpresionReturnGeneral.getFacturaImpresion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFacturaImpresion(this.facturaimpresionReturnGeneral.getFacturaImpresion());	
					}
						
					if(this.facturaimpresionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFacturaImpresion(this.facturaimpresionReturnGeneral.getFacturaImpresion(),classes);//this.facturaimpresionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFacturaImpresion(this.facturaimpresion,classes);//this.facturaimpresionBean);									
				}
			
				if(FacturaImpresionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFacturaImpresion(this.facturaimpresion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaImpresion(this.facturaimpresion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.facturaimpresionAnterior!=null) {
						this.facturaimpresion=this.facturaimpresionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.facturaimpresionReturnGeneral=facturaimpresionLogic.procesarEventosFacturaImpresionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturaimpresionLogic.getFacturaImpresions(),this.facturaimpresion,this.facturaimpresionParameterGeneral,this.isEsNuevoFacturaImpresion,classes);//this.facturaimpresionLogic.getFacturaImpresion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturaimpresionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.facturaimpresionReturnGeneral.getFacturaImpresion(),facturaimpresionLogic.getFacturaImpresions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.facturaimpresionReturnGeneral.getFacturaImpresion(),this.facturaimpresions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFacturaImpresion.repaint();
				
				//((AbstractTableModel) this.jTableDatosFacturaImpresion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFacturaImpresion();
			}
		}
	}
	
	public void actualizarVisualTableDatosFacturaImpresion() throws Exception {
		
		FacturaImpresionModel facturaimpresionModel=(FacturaImpresionModel)this.jTableDatosFacturaImpresion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturaimpresionModel.facturaimpresions=this.facturaimpresionLogic.getFacturaImpresions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			facturaimpresionModel.facturaimpresions=this.facturaimpresions;
		}
		
		
		((FacturaImpresionModel) this.jTableDatosFacturaImpresion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFacturaImpresion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfacturaimpresionAnterior(),this.facturaimpresionLogic.getFacturaImpresions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfacturaimpresionAnterior(),this.facturaimpresions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFacturaImpresion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFacturaImpresion(FacturaImpresion facturaimpresion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
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
										
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturaimpresion,new Object(),generalEntityParameterGeneral,this.facturaimpresionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FacturaImpresionConstantesFunciones.getClassesRelationshipsOfFacturaImpresion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FacturaImpresionConstantesFunciones.getClassesRelationshipsFromStringsOfFacturaImpresion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFacturaImpresion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FacturaImpresionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturaimpresion,new Object(),generalEntityParameterGeneral,this.facturaimpresionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFacturaImpresion(FacturaImpresionBean facturaimpresionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFacturaImpresion(ArrayList<Classe> classes,FacturaImpresionReturnGeneral facturaimpresionReturnGeneral,FacturaImpresionBean facturaimpresionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFacturaImpresion(FacturaImpresion facturaimpresion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.facturaimpresion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFacturaImpresion = new FacturaImpresionDetalleFormJInternalFrame(jDesktopPane,this.facturaimpresionSessionBean.getConGuardarRelaciones(),this.facturaimpresionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.setVisible(false);
		this.jInternalFrameDetalleFormFacturaImpresion.setSelected(false);						
		
		this.jInternalFrameDetalleFormFacturaImpresion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFacturaImpresion.facturaimpresionLogic=this.facturaimpresionLogic;
		
		this.cargarCombosFrameForeignKeyFacturaImpresion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturaImpresion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturaImpresion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFacturaImpresion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFacturaImpresion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFacturaImpresion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturaImpresion"));
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonModificarFacturaImpresion.addActionListener(new ButtonActionListener(this,"ModificarFacturaImpresion"));

		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonModificarToolBarFacturaImpresion.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturaImpresion"));
					
		this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemModificarFacturaImpresion.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturaImpresion"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarFacturaImpresion.addActionListener (new ButtonActionListener(this,"ActualizarFacturaImpresion"));
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarToolBarFacturaImpresion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturaImpresion"));
						
		this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemActualizarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturaImpresion"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarFacturaImpresion.addActionListener (new ButtonActionListener(this,"EliminarFacturaImpresion"));
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturaImpresion"));
								
		this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemEliminarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturaImpresion"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarFacturaImpresion.addActionListener (new ButtonActionListener(this,"CancelarFacturaImpresion"));
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturaImpresion"));
					
		this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemCancelarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturaImpresion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemDetalleCerrarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturaImpresion"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturaImpresion"));
		
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturaImpresion"));
		
		
		
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturaImpresion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonidFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"idFacturaImpresionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_empresaFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_empresaFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturaImpresionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_sucursalFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_sucursalFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaImpresionBusqueda"));
		//jButtonid_facturaFacturaImpresion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaFacturaImpresionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresion.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_estado_factu_impreFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_estado_factu_impreFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_estado_factu_impreFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_factu_impreFacturaImpresionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFacturaImpresion.jTabbedPaneRelacionesFacturaImpresion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturaImpresion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFacturaImpresion"));
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturaImpresion"));
		}
		
		this.jTableDatosFacturaImpresion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFacturaImpresion"));
		
		this.jTableDatosFacturaImpresion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFacturaImpresion"));
		
		this.jButtonNuevoFacturaImpresion.addActionListener(new ButtonActionListener(this,"NuevoFacturaImpresion"));
		
		this.jButtonDuplicarFacturaImpresion.addActionListener(new ButtonActionListener(this,"DuplicarFacturaImpresion"));
		
		this.jButtonCopiarFacturaImpresion.addActionListener(new ButtonActionListener(this,"CopiarFacturaImpresion"));
		
		this.jButtonVerFormFacturaImpresion.addActionListener(new ButtonActionListener(this,"VerFormFacturaImpresion"));
		
		
		this.jButtonNuevoToolBarFacturaImpresion.addActionListener(new ButtonActionListener(this,"NuevoToolBarFacturaImpresion"));
			
		this.jButtonDuplicarToolBarFacturaImpresion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFacturaImpresion"));
			
		this.jMenuItemNuevoFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFacturaImpresion"));
			
		this.jMenuItemDuplicarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFacturaImpresion"));		
		
		
		this.jButtonNuevoRelacionesFacturaImpresion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFacturaImpresion"));
		
		
		this.jButtonNuevoRelacionesToolBarFacturaImpresion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFacturaImpresion"));
			
		this.jMenuItemNuevoRelacionesFacturaImpresion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFacturaImpresion"));		
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonModificarFacturaImpresion.addActionListener(new ButtonActionListener(this,"ModificarFacturaImpresion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonModificarToolBarFacturaImpresion.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturaImpresion"));
			
			this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemModificarFacturaImpresion.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturaImpresion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarFacturaImpresion.addActionListener (new ButtonActionListener(this,"ActualizarFacturaImpresion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonActualizarToolBarFacturaImpresion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturaImpresion"));
				
			this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemActualizarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturaImpresion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarFacturaImpresion.addActionListener (new ButtonActionListener(this,"EliminarFacturaImpresion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonEliminarToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturaImpresion"));
						
			this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemEliminarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturaImpresion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarFacturaImpresion.addActionListener (new ButtonActionListener(this,"CancelarFacturaImpresion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonCancelarToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturaImpresion"));
			
			this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemCancelarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturaImpresion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFacturaImpresion"));		
		
		
		this.jButtonCerrarFacturaImpresion.addActionListener (new ButtonActionListener(this,"CerrarFacturaImpresion"));
		
		
		this.jButtonCerrarToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"CerrarToolBarFacturaImpresion"));
			
		this.jMenuItemCerrarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFacturaImpresion"));
			
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jMenuItemDetalleCerrarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturaImpresion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosFacturaImpresion.addActionListener (new ButtonActionListener(this,"GuardarCambiosFacturaImpresion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturaImpresion"));
		}
		
		this.jButtonCopiarToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"CopiarToolBarFacturaImpresion"));
			
		this.jButtonVerFormToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"VerFormToolBarFacturaImpresion"));
		
		this.jMenuItemGuardarCambiosFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFacturaImpresion"));
			
		this.jMenuItemCopiarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFacturaImpresion"));		
		
		this.jMenuItemVerFormFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFacturaImpresion"));		
		
		
		this.jButtonGuardarCambiosTablaFacturaImpresion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturaImpresion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFacturaImpresion"));
			
		this.jMenuItemGuardarCambiosTablaFacturaImpresion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturaImpresion"));		
		
		
		
		this.jButtonRecargarInformacionFacturaImpresion.addActionListener (new ButtonActionListener(this,"RecargarInformacionFacturaImpresion"));
					
		this.jButtonRecargarInformacionToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFacturaImpresion"));
		
		this.jMenuItemRecargarInformacionFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFacturaImpresion"));		
		
		
		
		this.jButtonAnterioresFacturaImpresion.addActionListener (new ButtonActionListener(this,"AnterioresFacturaImpresion"));
		
		
		this.jButtonAnterioresToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFacturaImpresion"));
		
		this.jMenuItemAnterioresFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFacturaImpresion"));		
		
		
		this.jButtonSiguientesFacturaImpresion.addActionListener (new ButtonActionListener(this,"SiguientesFacturaImpresion"));
		
		
		this.jButtonSiguientesToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFacturaImpresion"));
			
		this.jMenuItemSiguientesFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFacturaImpresion"));
			
		this.jMenuItemAbrirOrderByFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFacturaImpresion"));
			
		this.jMenuItemMostrarOcultarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFacturaImpresion"));
			
		this.jMenuItemDetalleAbrirOrderByFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFacturaImpresion"));
			
		this.jMenuItemDetalleMostarOcultarFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFacturaImpresion"));		
		
		
		this.jButtonNuevoGuardarCambiosFacturaImpresion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFacturaImpresion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFacturaImpresion"));
			
		this.jMenuItemNuevoGuardarCambiosFacturaImpresion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFacturaImpresion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFacturaImpresion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFacturaImpresion"));

		this.jCheckBoxSeleccionadosFacturaImpresion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFacturaImpresion"));
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturaImpresion"));
		}
		
		
		this.jComboBoxTiposRelacionesFacturaImpresion.addActionListener (new ButtonActionListener(this,"TiposRelacionesFacturaImpresion"));
			
		this.jComboBoxTiposAccionesFacturaImpresion.addActionListener (new ButtonActionListener(this,"TiposAccionesFacturaImpresion"));
					
		this.jComboBoxTiposSeleccionarFacturaImpresion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFacturaImpresion"));
			
		this.jTextFieldValorCampoGeneralFacturaImpresion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFacturaImpresion"));		
		
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonidFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"idFacturaImpresionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_empresaFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_empresaFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturaImpresionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_sucursalFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_sucursalFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaImpresionBusqueda"));
		//jButtonid_facturaFacturaImpresion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaFacturaImpresionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresion.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_estado_factu_impreFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_estado_factu_impreFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_estado_factu_impreFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_factu_impreFacturaImpresionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEstadoFactuImpreFacturaImpresion.addActionListener(new ButtonActionListener(this,"FK_IdEstadoFactuImpreFacturaImpresion"));

			this.jButtonFK_IdFacturaFacturaImpresion.addActionListener(new ButtonActionListener(this,"FK_IdFacturaFacturaImpresion"));

			this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFacturaImpresion!=null) {
				this.jInternalFrameReporteDinamicoFacturaImpresion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturaImpresion"));
				this.jInternalFrameReporteDinamicoFacturaImpresion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturaImpresion"));
				this.jInternalFrameReporteDinamicoFacturaImpresion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturaImpresion"));
			}
			
			//this.jButtonCerrarReporteDinamicoFacturaImpresion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturaImpresion"));				
			//this.jButtonGenerarReporteDinamicoFacturaImpresion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturaImpresion"));
			//this.jButtonGenerarExcelReporteDinamicoFacturaImpresion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturaImpresion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFacturaImpresion!=null) {
				this.jInternalFrameImportacionFacturaImpresion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturaImpresion"));
				this.jInternalFrameImportacionFacturaImpresion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturaImpresion"));
				this.jInternalFrameImportacionFacturaImpresion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturaImpresion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFacturaImpresion.addActionListener (new ButtonActionListener(this,"AbrirOrderByFacturaImpresion"));
			
			this.jButtonAbrirOrderByToolBarFacturaImpresion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFacturaImpresion"));			
			
			if(this.jInternalFrameOrderByFacturaImpresion!=null) {
				this.jInternalFrameOrderByFacturaImpresion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturaImpresion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaImpresion.jTabbedPaneRelacionesFacturaImpresion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturaImpresion"));
		
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
            		closingInternalFrameFacturaImpresion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFacturaImpresion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFacturaImpresion = (JInternalFrameBase)event.getSource();
	            	
	            FacturaImpresionBeanSwingJInternalFrame jInternalFrameParent=(FacturaImpresionBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturaImpresion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFacturaImpresionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFacturaImpresion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFacturaImpresionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFacturaImpresion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFacturaImpresion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaImpresionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaImpresionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaImpresionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFacturaImpresion";
		inputMap = this.jButtonNuevoFacturaImpresion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFacturaImpresion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturaImpresionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaImpresionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaImpresionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaImpresionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFacturaImpresion";
		inputMap = this.jButtonNuevoRelacionesFacturaImpresion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFacturaImpresion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturaImpresionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFacturaImpresion";
		inputMap = this.jButtonModificarFacturaImpresion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFacturaImpresion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFacturaImpresionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFacturaImpresion";
		inputMap = this.jButtonActualizarFacturaImpresion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFacturaImpresion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFacturaImpresionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFacturaImpresion";
		inputMap = this.jButtonEliminarFacturaImpresion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFacturaImpresion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFacturaImpresionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFacturaImpresion";
		inputMap = this.jButtonCancelarFacturaImpresion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFacturaImpresion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFacturaImpresionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFacturaImpresion";
		inputMap = this.jButtonCerrarFacturaImpresion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFacturaImpresion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFacturaImpresionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFacturaImpresion";
		inputMap = this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosFacturaImpresion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonGuardarCambiosFacturaImpresion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFacturaImpresionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFacturaImpresion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFacturaImpresionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFacturaImpresion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFacturaImpresionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFacturaImpresion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFacturaImpresionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFacturaImpresion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFacturaImpresionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonidFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"idFacturaImpresionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_empresaFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_empresaFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturaImpresionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_sucursalFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_sucursalFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaImpresionBusqueda"));
		//jButtonid_facturaFacturaImpresion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaFacturaImpresionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresion.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_estado_factu_impreFacturaImpresionUpdate.addActionListener(new ButtonActionListener(this,"id_estado_factu_impreFacturaImpresionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_estado_factu_impreFacturaImpresionBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_factu_impreFacturaImpresionBusqueda"));
		
		
		this.jButtonFK_IdEstadoFactuImpreFacturaImpresion.addActionListener(new ButtonActionListener(this,"FK_IdEstadoFactuImpreFacturaImpresion"));

		this.jButtonFK_IdFacturaFacturaImpresion.addActionListener(new ButtonActionListener(this,"FK_IdFacturaFacturaImpresion"));

		this.jButtonBuscarFK_IdFacturaid_facturaFacturaImpresion.addActionListener(new ButtonActionListener(this,"id_facturaFacturaImpresion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFacturaImpresion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFacturaImpresionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFacturaImpresionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFacturaImpresion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFacturaImpresion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FacturaImpresion facturaimpresionAux:this.facturaimpresionLogic.getFacturaImpresions()) {
					facturaimpresionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaImpresion facturaimpresionAux:facturaimpresions) {
					facturaimpresionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFacturaImpresionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturaImpresion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturaImpresion facturaimpresionAux:this.facturaimpresionLogic.getFacturaImpresions()) {
						facturaimpresionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturaImpresion facturaimpresionAux:facturaimpresions) {
						facturaimpresionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FacturaImpresion facturaimpresionAux:this.facturaimpresionLogic.getFacturaImpresions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturaImpresion facturaimpresionAux:facturaimpresions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFacturaImpresion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturaImpresion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturaImpresion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFacturaImpresionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturaImpresion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFacturaImpresion.getSelectedRows();
			
			FacturaImpresion facturaimpresionLocal=new FacturaImpresion();
			
			//this.seleccionarTodosFacturaImpresion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaimpresionLocal =(FacturaImpresion) this.facturaimpresionLogic.getFacturaImpresions().toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					facturaimpresionLocal =(FacturaImpresion) this.facturaimpresions.toArray()[this.jTableDatosFacturaImpresion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				facturaimpresionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturaImpresion facturaimpresionAux:this.facturaimpresionLogic.getFacturaImpresions()) {
						facturaimpresionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturaImpresion facturaimpresionAux:facturaimpresions) {
						facturaimpresionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFacturaImpresion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturaImpresion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturaImpresion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturaImpresion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFacturaImpresionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFacturaImpresionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFacturaImpresionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFacturaImpresion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFacturaImpresion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturaImpresion facturaimpresionAux:this.facturaimpresionLogic.getFacturaImpresions()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaImpresion facturaimpresionAux:facturaimpresions) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFacturaImpresion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFacturaImpresionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFacturaImpresion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFacturaImpresion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFacturaImpresion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFacturaImpresion) {				
					conSplash=true;//false;										
					
					//this.startProcessFacturaImpresion(conSplash);
				
					this.generarReporteFacturaImpresionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFacturaImpresionsSeleccionados();
				//this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturaImpresionsSeleccionados(false);
				//this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturaImpresionsSeleccionados(true);
				//this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturaImpresion();
				
				this.exportarFacturaImpresionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFacturaImpresions();
				//this.importarFacturaImpresions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturaImpresion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFacturaImpresionsSeleccionados();
				//this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Factura Impresion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFacturaImpresion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFacturaImpresion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFacturaImpresion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.setSelectedIndex(0);					
				}	
			} 			
			else if(FacturaImpresionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFacturaImpresion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFacturaImpresion(conSplash);
					
						//this.actualizarParametrosGeneralFacturaImpresion();
						
						this.generarReporteProcesoAccionFacturaImpresionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FacturaImpresionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Factura ImpresionES SELECCIONADOS?", "MANTENIMIENTO DE Factura Impresion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFacturaImpresion();
				
						this.actualizarParametrosGeneralFacturaImpresion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.facturaimpresionReturnGeneral=facturaimpresionLogic.procesarAccionFacturaImpresionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.facturaimpresionLogic.getFacturaImpresions(),this.facturaimpresionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFacturaImpresionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFacturaImpresion();
					
					FacturaImpresionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFacturaImpresionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturaImpresion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxTiposAccionesFormularioFacturaImpresion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFacturaImpresion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFacturaImpresionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFacturaImpresion();
			
			if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();		
			FacturaImpresion facturaimpresion=new FacturaImpresion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFacturaImpresion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFacturaImpresion.getSelectedItem();
			
			
			
			
			facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(facturaimpresionsSeleccionados.size()==1) {
				for(FacturaImpresion facturaimpresionAux:facturaimpresionsSeleccionados) {
					facturaimpresion=facturaimpresionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFacturaImpresion();
			
      		//this.finishProcessFacturaImpresion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFacturaImpresionReturnGeneral() throws Exception {
		if(this.facturaimpresionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.facturaimpresionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.facturaimpresionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.facturaimpresionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.facturaimpresionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.facturaimpresionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFacturaImpresion(false);
		}
		
		if(this.facturaimpresionReturnGeneral.getConRetornoLista() || this.facturaimpresionReturnGeneral.getConRetornoObjeto()) {
			if(this.facturaimpresionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturaimpresionLogic.setFacturaImpresions(this.facturaimpresionReturnGeneral.getFacturaImpresions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.facturaimpresionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturaimpresionLogic.setFacturaImpresion(this.facturaimpresionReturnGeneral.getFacturaImpresion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFacturaImpresion(false);
		}
	}
	
	public void actualizarParametrosGeneralFacturaImpresion() throws Exception {
		
		
	}
	
	public ArrayList<FacturaImpresion> getFacturaImpresionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFacturaImpresion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FacturaImpresion facturaimpresionAux:facturaimpresionLogic.getFacturaImpresions()) {
					if(facturaimpresionAux.getIsSelected()) {
						facturaimpresionsSeleccionados.add(facturaimpresionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaImpresion facturaimpresionAux:this.facturaimpresions) {
					if(facturaimpresionAux.getIsSelected()) {
						facturaimpresionsSeleccionados.add(facturaimpresionAux);				
					}
				}
			}
			
			if(facturaimpresionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						facturaimpresionsSeleccionados.addAll(this.facturaimpresionLogic.getFacturaImpresions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						facturaimpresionsSeleccionados.addAll(this.facturaimpresions);				
					}
				}
			}
		} else {
			facturaimpresionsSeleccionados.add(this.facturaimpresion);
		}
		
		return facturaimpresionsSeleccionados;
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
	
	public void generarReporteFacturaImpresionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFacturaImpresionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFacturaImpresionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturaImpresionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturaImpresionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Factura Impresion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFacturaImpresionsSeleccionados() throws Exception {
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();		
		
		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFacturaImpresions("Todos",facturaimpresionsSeleccionados);
		
	}	
	
	public void generarReporteNormalFacturaImpresionsSeleccionados() throws Exception {
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();		
		
		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFacturaImpresions("Todos",facturaimpresionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFacturaImpresionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();
		
		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFacturaImpresions("Todos",facturaimpresionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFacturaImpresionsSeleccionados() throws Exception {
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFacturaImpresion();
		
		
		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFacturaImpresion();
		
		
		//this.generarReporteFacturaImpresions("Todos",facturaimpresionsSeleccionados ,facturaimpresionImplementable,facturaimpresionImplementableHome);
	}
	
	public void mostrarImportacionFacturaImpresions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFacturaImpresion();
		
		this.abrirFrameImportacionFacturaImpresion();		
		
			
		//this.generarReporteFacturaImpresions("Todos",facturaimpresionsSeleccionados ,facturaimpresionImplementable,facturaimpresionImplementableHome);
	}
	
	public void importarFacturaImpresions() throws Exception {		
	
	}
	
	public void exportarFacturaImpresionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFacturaImpresionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFacturaImpresionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFacturaImpresionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Factura Impresion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFacturaImpresionsSeleccionados() throws Exception {
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();		
		
		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaimpresion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFacturaImpresion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FacturaImpresion facturaimpresionAux:facturaimpresionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFacturaImpresion(facturaimpresionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//facturaimpresionAux.setsDetalleGeneralEntityReporte(facturaimpresionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFacturaImpresion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FacturaImpresionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaImpresionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaImpresionConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFacturaImpresion(FacturaImpresion facturaimpresion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=facturaimpresion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaimpresion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaimpresion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaimpresion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaimpresion.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturaimpresion.getestadofactuimpre_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFacturaImpresionsSeleccionados() throws Exception {
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();		
		
		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaimpresion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FacturaImpresions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFacturaImpresion(row);				
				iRow++;
			}				
			
			for(FacturaImpresion facturaimpresionAux:facturaimpresionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFacturaImpresion(facturaimpresionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFacturaImpresionsSeleccionados() throws Exception {
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();		
		
		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturaimpresion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("facturaimpresions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("facturaimpresion");
			//elementRoot.appendChild(element);
		
			for(FacturaImpresion facturaimpresionAux:facturaimpresionsSeleccionados) {
				element = document.createElement("facturaimpresion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFacturaImpresion(facturaimpresionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Impresion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFacturaImpresion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFacturaImpresion(FacturaImpresion facturaimpresion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(facturaimpresion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaimpresion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaimpresion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaimpresion.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturaimpresion.getestadofactuimpre_descripcion());				
	}
	
	public void setFilaDatosExportarXmlFacturaImpresion(FacturaImpresion facturaimpresion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FacturaImpresionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(facturaimpresion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FacturaImpresionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(facturaimpresion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FacturaImpresionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(facturaimpresion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(FacturaImpresionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(facturaimpresion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfactura_descripcion = document.createElement(FacturaImpresionConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(facturaimpresion.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementestadofactuimpre_descripcion = document.createElement(FacturaImpresionConstantesFunciones.IDESTADOFACTUIMPRE);
		elementestadofactuimpre_descripcion.appendChild(document.createTextNode(facturaimpresion.getestadofactuimpre_descripcion()));
		element.appendChild(elementestadofactuimpre_descripcion);
	}
	
	public void generarReporteGroupGenericoFacturaImpresionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FacturaImpresion> facturaimpresionsSeleccionados=new ArrayList<FacturaImpresion>();
		
		facturaimpresionsSeleccionados=this.getFacturaImpresionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFacturaImpresion(facturaimpresionsSeleccionados);
		
		this.generarReporteFacturaImpresions("Todos",facturaimpresionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFacturaImpresion(ArrayList<FacturaImpresion> facturaimpresionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FacturaImpresion facturaimpresionAux:facturaimpresionsSeleccionados) {
				facturaimpresionAux.setsDetalleGeneralEntityReporte(facturaimpresionAux.toString());
			
				if(sTipoSeleccionar.equals(FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					facturaimpresionAux.setsDescripcionGeneralEntityReporte1(facturaimpresionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					facturaimpresionAux.setsDescripcionGeneralEntityReporte1(facturaimpresionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturaImpresionConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					facturaimpresionAux.setsDescripcionGeneralEntityReporte1(facturaimpresionAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE)) {
					existe=true;
					facturaimpresionAux.setsDescripcionGeneralEntityReporte1(facturaimpresionAux.getestadofactuimpre_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaImpresionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFacturaImpresion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFacturaImpresion=true;
				this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=true;
				this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=true;
			}
			
			this.isVisibilidadCeldaModificarFacturaImpresion=false;
			this.isVisibilidadCeldaActualizarFacturaImpresion=false;
			this.isVisibilidadCeldaEliminarFacturaImpresion=false;
			this.isVisibilidadCeldaCancelarFacturaImpresion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaImpresion=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFacturaImpresion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=false;
			this.isVisibilidadCeldaModificarFacturaImpresion=false;
			this.isVisibilidadCeldaActualizarFacturaImpresion=true;
			this.isVisibilidadCeldaEliminarFacturaImpresion=false;
			this.isVisibilidadCeldaCancelarFacturaImpresion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaImpresion=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFacturaImpresion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=false;
			this.isVisibilidadCeldaModificarFacturaImpresion=false;
			this.isVisibilidadCeldaActualizarFacturaImpresion=true;
			this.isVisibilidadCeldaEliminarFacturaImpresion=true;
			this.isVisibilidadCeldaCancelarFacturaImpresion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaImpresion=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFacturaImpresion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=false;
			this.isVisibilidadCeldaModificarFacturaImpresion=false;
			this.isVisibilidadCeldaActualizarFacturaImpresion=true;
			this.isVisibilidadCeldaEliminarFacturaImpresion=false;
			this.isVisibilidadCeldaCancelarFacturaImpresion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFacturaImpresion=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=true;
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=true;
			this.isVisibilidadCeldaModificarFacturaImpresion=false;
			this.isVisibilidadCeldaActualizarFacturaImpresion=false;
			this.isVisibilidadCeldaEliminarFacturaImpresion=false;
			this.isVisibilidadCeldaCancelarFacturaImpresion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaImpresion=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFacturaImpresion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=false;
			this.isVisibilidadCeldaActualizarFacturaImpresion=false;
			this.isVisibilidadCeldaEliminarFacturaImpresion=false;
			this.isVisibilidadCeldaCancelarFacturaImpresion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFacturaImpresion=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=false;
			this.isVisibilidadCeldaModificarFacturaImpresion=true;
			this.isVisibilidadCeldaActualizarFacturaImpresion=false;
			this.isVisibilidadCeldaEliminarFacturaImpresion=false;
			this.isVisibilidadCeldaCancelarFacturaImpresion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturaImpresion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FacturaImpresionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFacturaImpresion=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=true;
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=true;
		} else {
			this.actualizarEstadoPanelsFacturaImpresion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFacturaImpresion=false;
			//this.isVisibilidadCeldaVerFormFacturaImpresion=false;
			this.isVisibilidadCeldaDuplicarFacturaImpresion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!facturaimpresionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;
		} else {
			this.isVisibilidadCeldaNuevoFacturaImpresion=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaImpresion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			if(!facturaimpresionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;												
			}
			
			this.jButtonCerrarFacturaImpresion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFacturaImpresion=false;
		}
		
		if(!this.permiteMantenimiento(this.facturaimpresion)) {
			this.isVisibilidadCeldaActualizarFacturaImpresion=false;
			this.isVisibilidadCeldaEliminarFacturaImpresion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFacturaImpresion() {
	}
	
	public void actualizarEstadoPanelsFacturaImpresion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFacturaImpresion!=null) {
				this.jScrollPanelDatosEdicionFacturaImpresion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaImpresion!=null) {
				this.jTabbedPaneBusquedasFacturaImpresion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaImpresion!=null) {
				this.jScrollPanelDatosFacturaImpresion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaImpresion!=null) {
				this.jPanelPaginacionFacturaImpresion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaImpresion!=null) {
				this.jPanelParametrosReportesFacturaImpresion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFacturaImpresion!=null) {
				this.jScrollPanelDatosEdicionFacturaImpresion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaImpresion!=null) {
				this.jTabbedPaneBusquedasFacturaImpresion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFacturaImpresion!=null) {
				this.jScrollPanelDatosFacturaImpresion.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturaImpresion!=null) {
				this.jPanelPaginacionFacturaImpresion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturaImpresion!=null) {
				this.jPanelParametrosReportesFacturaImpresion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFacturaImpresion!=null) {
				this.jScrollPanelDatosEdicionFacturaImpresion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaImpresion!=null) {
				this.jTabbedPaneBusquedasFacturaImpresion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturaImpresion!=null) {
				this.jScrollPanelDatosFacturaImpresion.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturaImpresion!=null) {
				this.jPanelPaginacionFacturaImpresion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturaImpresion!=null) {
				this.jPanelParametrosReportesFacturaImpresion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFacturaImpresion!=null) {
				this.jScrollPanelDatosEdicionFacturaImpresion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaImpresion!=null) {
				this.jTabbedPaneBusquedasFacturaImpresion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturaImpresion!=null) {
				this.jScrollPanelDatosFacturaImpresion.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturaImpresion!=null) {
				this.jPanelPaginacionFacturaImpresion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturaImpresion!=null) {
				this.jPanelParametrosReportesFacturaImpresion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFacturaImpresion!=null) {
				this.jScrollPanelDatosEdicionFacturaImpresion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaImpresion!=null) {
				this.jTabbedPaneBusquedasFacturaImpresion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaImpresion!=null) {
				this.jScrollPanelDatosFacturaImpresion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaImpresion!=null) {
				this.jPanelPaginacionFacturaImpresion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaImpresion!=null) {
				this.jPanelParametrosReportesFacturaImpresion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFacturaImpresion!=null) {
				this.jScrollPanelDatosEdicionFacturaImpresion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaImpresion!=null) {
				this.jTabbedPaneBusquedasFacturaImpresion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaImpresion!=null) {
				this.jScrollPanelDatosFacturaImpresion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaImpresion!=null) {
				this.jPanelPaginacionFacturaImpresion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaImpresion!=null) {
				this.jPanelParametrosReportesFacturaImpresion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFacturaImpresion!=null) {
				this.jScrollPanelDatosEdicionFacturaImpresion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaImpresion!=null) {
				this.jTabbedPaneBusquedasFacturaImpresion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaImpresion!=null) {
				this.jScrollPanelDatosFacturaImpresion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaImpresion!=null) {
				this.jPanelPaginacionFacturaImpresion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaImpresion!=null) {
				this.jPanelParametrosReportesFacturaImpresion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFacturaImpresion!=null) {
					this.jTabbedPaneBusquedasFacturaImpresion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFacturaImpresion!=null) {
				this.jPanelParametrosReportesFacturaImpresion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaImpresion!=null) {
				this.jTabbedPaneBusquedasFacturaImpresion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFacturaImpresion!=null) {
				this.jPanelParametrosReportesFacturaImpresion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEstadoFactuImpre=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoFactuImpre) {this.jTabbedPaneBusquedasFacturaImpresion.remove(jPanelFK_IdEstadoFactuImpreFacturaImpresion);}

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasFacturaImpresion.remove(jPanelFK_IdFacturaFacturaImpresion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEstadoFactuImpre=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoFactuImpre) {this.jTabbedPaneBusquedasFacturaImpresion.remove(jPanelFK_IdEstadoFactuImpreFacturaImpresion);}

			this.isVisibilidadFK_IdFactura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasFacturaImpresion.remove(jPanelFK_IdFacturaFacturaImpresion);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdEstadoFactuImpre=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdEstadoFactuImpre) {this.jTabbedPaneBusquedasFacturaImpresion.remove(jPanelFK_IdEstadoFactuImpreFacturaImpresion);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasFacturaImpresion.remove(jPanelFK_IdFacturaFacturaImpresion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoFactuImpre(Boolean isParaEstadoFactuImpre){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoFactuImpreNegation=!isParaEstadoFactuImpre;

			this.isVisibilidadFK_IdEstadoFactuImpre=isParaEstadoFactuImpre;
			if(!this.isVisibilidadFK_IdEstadoFactuImpre) {this.jTabbedPaneBusquedasFacturaImpresion.remove(jPanelFK_IdEstadoFactuImpreFacturaImpresion);}

			this.isVisibilidadFK_IdFactura=isParaEstadoFactuImpreNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasFacturaImpresion.remove(jPanelFK_IdFacturaFacturaImpresion);}
		}
		
	}
	
	
	
	

	public String registrarSesionFacturaImpresionParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(facturaimpresionSessionBean==null) {
				facturaimpresionSessionBean=new FacturaImpresionSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(facturaimpresionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.facturaimpresionFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(FacturaImpresionConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionFacturaImpresion(true);
			//facturaSessionBean.setlidFacturaImpresionActual(this.idFacturaImpresionActual);

			facturaimpresionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFacturaImpresion(true);
			facturaimpresionSessionBean.setlIdFacturaImpresionActualForeignKey(this.idFacturaImpresionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FacturaImpresionSessionBean facturaimpresionSessionBean=new FacturaImpresionSessionBean();
		
		if(this.facturaimpresionSessionBean==null) {
			this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
		}
		
		this.facturaimpresionSessionBean.setsUltimaBusquedaFacturaImpresion(this.getsAccionBusqueda());
		this.facturaimpresionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.facturaimpresionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			facturaimpresionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoFactuImpre")) {
			facturaimpresionSessionBean.setid_estado_factu_impre(this.getid_estado_factu_impreFK_IdEstadoFactuImpre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			facturaimpresionSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			facturaimpresionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FacturaImpresionSessionBean facturaimpresionSessionBean=new FacturaImpresionSessionBean();
		
		if(this.facturaimpresionSessionBean==null) {
			this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
		}
		
		if(this.facturaimpresionSessionBean.getsUltimaBusquedaFacturaImpresion()!=null&&!this.facturaimpresionSessionBean.getsUltimaBusquedaFacturaImpresion().equals("")) {
			this.setsAccionBusqueda(facturaimpresionSessionBean.getsUltimaBusquedaFacturaImpresion());
			this.setiNumeroPaginacion(facturaimpresionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(facturaimpresionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(facturaimpresionSessionBean.getid_empresa());
				facturaimpresionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoFactuImpre")) {
				this.setid_estado_factu_impreFK_IdEstadoFactuImpre(facturaimpresionSessionBean.getid_estado_factu_impre());
				facturaimpresionSessionBean.setid_estado_factu_impre(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(facturaimpresionSessionBean.getid_factura());
				facturaimpresionSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(facturaimpresionSessionBean.getid_sucursal());
				facturaimpresionSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.facturaimpresionSessionBean.setsUltimaBusquedaFacturaImpresion("");
		this.facturaimpresionSessionBean.setiNumeroPaginacion(FacturaImpresionConstantesFunciones.INUMEROPAGINACION);
		this.facturaimpresionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFacturaImpresion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFacturaImpresion() {
		this.updateBorderResaltarBusquedasFormularioFacturaImpresion();
		this.updateVisibilidadBusquedasFormularioFacturaImpresion();
		this.updateHabilitarBusquedasFormularioFacturaImpresion();
	}
	
	public void updateBorderResaltarBusquedasFormularioFacturaImpresion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFacturaImpresion.getComponents().length>0) {
	

		if(this.facturaimpresionConstantesFunciones.resaltarFK_IdEstadoFactuImpreFacturaImpresion!=null) {
			index= this.jTabbedPaneBusquedasFacturaImpresion.indexOfComponent(this.jPanelFK_IdEstadoFactuImpreFacturaImpresion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaImpresion.getComponent(index);
				jPanel.setBorder(this.facturaimpresionConstantesFunciones.resaltarFK_IdEstadoFactuImpreFacturaImpresion);
			}
		}

		if(this.facturaimpresionConstantesFunciones.resaltarFK_IdFacturaFacturaImpresion!=null) {
			index= this.jTabbedPaneBusquedasFacturaImpresion.indexOfComponent(this.jPanelFK_IdFacturaFacturaImpresion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaImpresion.getComponent(index);
				jPanel.setBorder(this.facturaimpresionConstantesFunciones.resaltarFK_IdFacturaFacturaImpresion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFacturaImpresion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFacturaImpresion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturaImpresion.indexOfComponent(this.jPanelFK_IdEstadoFactuImpreFacturaImpresion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaImpresion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturaimpresionConstantesFunciones.mostrarFK_IdEstadoFactuImpreFacturaImpresion);
			if(!this.facturaimpresionConstantesFunciones.mostrarFK_IdEstadoFactuImpreFacturaImpresion && index>-1) {
				this.jTabbedPaneBusquedasFacturaImpresion.remove(index);
			}

			index= this.jTabbedPaneBusquedasFacturaImpresion.indexOfComponent(this.jPanelFK_IdFacturaFacturaImpresion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaImpresion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturaimpresionConstantesFunciones.mostrarFK_IdFacturaFacturaImpresion);
			if(!this.facturaimpresionConstantesFunciones.mostrarFK_IdFacturaFacturaImpresion && index>-1) {
				this.jTabbedPaneBusquedasFacturaImpresion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFacturaImpresion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFacturaImpresion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturaImpresion.indexOfComponent(this.jPanelFK_IdEstadoFactuImpreFacturaImpresion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaImpresion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturaimpresionConstantesFunciones.activarFK_IdEstadoFactuImpreFacturaImpresion);
				this.jTabbedPaneBusquedasFacturaImpresion.setEnabledAt(index,this.facturaimpresionConstantesFunciones.activarFK_IdEstadoFactuImpreFacturaImpresion);
			}

			index= this.jTabbedPaneBusquedasFacturaImpresion.indexOfComponent(this.jPanelFK_IdFacturaFacturaImpresion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaImpresion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturaimpresionConstantesFunciones.activarFK_IdFacturaFacturaImpresion);
				this.jTabbedPaneBusquedasFacturaImpresion.setEnabledAt(index,this.facturaimpresionConstantesFunciones.activarFK_IdFacturaFacturaImpresion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFacturaImpresion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEstadoFactuImpre")) {
			index= this.jTabbedPaneBusquedasFacturaImpresion.indexOfComponent(this.jPanelFK_IdEstadoFactuImpreFacturaImpresion);

			this.jTabbedPaneBusquedasFacturaImpresion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaImpresion.getComponent(index);

			this.facturaimpresionConstantesFunciones.setResaltarFK_IdEstadoFactuImpreFacturaImpresion(resaltar);

			jPanel.setBorder(this.facturaimpresionConstantesFunciones.resaltarFK_IdEstadoFactuImpreFacturaImpresion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasFacturaImpresion.indexOfComponent(this.jPanelFK_IdFacturaFacturaImpresion);

			this.jTabbedPaneBusquedasFacturaImpresion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaImpresion.getComponent(index);

			this.facturaimpresionConstantesFunciones.setResaltarFK_IdFacturaFacturaImpresion(resaltar);

			jPanel.setBorder(this.facturaimpresionConstantesFunciones.resaltarFK_IdFacturaFacturaImpresion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFacturaImpresion.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioFacturaImpresion() throws Exception {

		if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFacturaImpresion();
		this.updateVisibilidadResaltarControlesFormularioFacturaImpresion();
		this.updateHabilitarResaltarControlesFormularioFacturaImpresion();
		
	}
	
	public void updateBorderResaltarControlesFormularioFacturaImpresion() throws Exception {
		if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.facturaimpresionConstantesFunciones.resaltaridFacturaImpresion!=null && this.jInternalFrameDetalleFormFacturaImpresion!=null) {this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.setBorder(this.facturaimpresionConstantesFunciones.resaltaridFacturaImpresion);}
		if(this.facturaimpresionConstantesFunciones.resaltarid_empresaFacturaImpresion!=null && this.jInternalFrameDetalleFormFacturaImpresion!=null) {this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.setBorder(this.facturaimpresionConstantesFunciones.resaltarid_empresaFacturaImpresion);}
		if(this.facturaimpresionConstantesFunciones.resaltarid_sucursalFacturaImpresion!=null && this.jInternalFrameDetalleFormFacturaImpresion!=null) {this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.setBorder(this.facturaimpresionConstantesFunciones.resaltarid_sucursalFacturaImpresion);}
		if(this.facturaimpresionConstantesFunciones.resaltarid_facturaFacturaImpresion!=null && this.jInternalFrameDetalleFormFacturaImpresion!=null) {this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.setBorder(this.facturaimpresionConstantesFunciones.resaltarid_facturaFacturaImpresion);}
		if(this.facturaimpresionConstantesFunciones.resaltarid_estado_factu_impreFacturaImpresion!=null && this.jInternalFrameDetalleFormFacturaImpresion!=null) {this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.setBorder(this.facturaimpresionConstantesFunciones.resaltarid_estado_factu_impreFacturaImpresion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFacturaImpresion() throws Exception {		
		if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
	
		//this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostraridFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jPanelidFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostraridFacturaImpresion);
		//this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostrarid_empresaFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jPanelid_empresaFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostrarid_empresaFacturaImpresion);
		//this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostrarid_sucursalFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jPanelid_sucursalFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostrarid_sucursalFacturaImpresion);
		//this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostrarid_facturaFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jPanelid_facturaFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostrarid_facturaFacturaImpresion);
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostrarid_facturaFacturaImpresion);
		//this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostrarid_estado_factu_impreFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jPanelid_estado_factu_impreFacturaImpresion.setVisible(this.facturaimpresionConstantesFunciones.mostrarid_estado_factu_impreFacturaImpresion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFacturaImpresion() throws Exception {
		if(this.jInternalFrameDetalleFormFacturaImpresion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturaImpresion!=null) {
	
		this.jInternalFrameDetalleFormFacturaImpresion.jLabelidFacturaImpresion.setEnabled(this.facturaimpresionConstantesFunciones.activaridFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_empresaFacturaImpresion.setEnabled(this.facturaimpresionConstantesFunciones.activarid_empresaFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_sucursalFacturaImpresion.setEnabled(this.facturaimpresionConstantesFunciones.activarid_sucursalFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_facturaFacturaImpresion.setEnabled(this.facturaimpresionConstantesFunciones.activarid_facturaFacturaImpresion);
			this.jInternalFrameDetalleFormFacturaImpresion.jButtonid_facturaFacturaImpresion.setEnabled(this.facturaimpresionConstantesFunciones.activarid_facturaFacturaImpresion);
		this.jInternalFrameDetalleFormFacturaImpresion.jComboBoxid_estado_factu_impreFacturaImpresion.setEnabled(this.facturaimpresionConstantesFunciones.activarid_estado_factu_impreFacturaImpresion);
		}
	}
	
		
}