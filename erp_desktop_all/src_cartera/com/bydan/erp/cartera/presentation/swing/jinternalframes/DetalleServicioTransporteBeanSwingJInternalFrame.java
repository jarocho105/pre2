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

import com.bydan.erp.cartera.util.DetalleServicioTransporteConstantesFunciones;
import com.bydan.erp.cartera.util.DetalleServicioTransporteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.DetalleServicioTransporteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.DetalleServicioTransporteBean;
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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleServicioTransporteBeanSwingJInternalFrame extends DetalleServicioTransporteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleServicioTransporteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleServicioTransporte> detalleserviciotransporteValidator = new ClassValidator<DetalleServicioTransporte>(DetalleServicioTransporte.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleServicioTransporte detalleserviciotransporte;	
	public DetalleServicioTransporte detalleserviciotransporteAux;
	public DetalleServicioTransporte detalleserviciotransporteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleServicioTransporte detalleserviciotransporteTotales;
	public Long idDetalleServicioTransporteActual;
	public Long iIdNuevoDetalleServicioTransporte=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboServicioTransporte="";

	public List<ServicioTransporte> serviciotransportesForeignKey;

	public List<ServicioTransporte> getserviciotransportesForeignKey() {
		return serviciotransportesForeignKey;
	}

	public void setserviciotransportesForeignKey(List<ServicioTransporte> serviciotransportesForeignKey) {
		this.serviciotransportesForeignKey = serviciotransportesForeignKey;
	}

	//OBJETO FK ACTUAL
	public ServicioTransporte serviciotransporteForeignKey;

	public ServicioTransporte getserviciotransporteForeignKey() {
		return serviciotransporteForeignKey;
	}

	public void setserviciotransporteForeignKey(ServicioTransporte serviciotransporteForeignKey) {
		this.serviciotransporteForeignKey = serviciotransporteForeignKey;
	}

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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
	}

	public String sFinalQueryComboProducto="";

	public List<Producto> productosForeignKey;

	public List<Producto> getproductosForeignKey() {
		return productosForeignKey;
	}

	public void setproductosForeignKey(List<Producto> productosForeignKey) {
		this.productosForeignKey = productosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Producto productoForeignKey;

	public Producto getproductoForeignKey() {
		return productoForeignKey;
	}

	public void setproductoForeignKey(Producto productoForeignKey) {
		this.productoForeignKey = productoForeignKey;
	}

	public String sFinalQueryComboUnidad="";

	public List<Unidad> unidadsForeignKey;

	public List<Unidad> getunidadsForeignKey() {
		return unidadsForeignKey;
	}

	public void setunidadsForeignKey(List<Unidad> unidadsForeignKey) {
		this.unidadsForeignKey = unidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadForeignKey;

	public Unidad getunidadForeignKey() {
		return unidadForeignKey;
	}

	public void setunidadForeignKey(Unidad unidadForeignKey) {
		this.unidadForeignKey = unidadForeignKey;
	}

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
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
	
	public Boolean isPermisoTodoDetalleServicioTransporte;
	public Boolean isPermisoNuevoDetalleServicioTransporte;
	public Boolean isPermisoActualizarDetalleServicioTransporte;
	public Boolean isPermisoActualizarOriginalDetalleServicioTransporte;
	public Boolean isPermisoEliminarDetalleServicioTransporte;
	public Boolean isPermisoGuardarCambiosDetalleServicioTransporte;
	public Boolean isPermisoConsultaDetalleServicioTransporte;
	public Boolean isPermisoBusquedaDetalleServicioTransporte;
	public Boolean isPermisoReporteDetalleServicioTransporte;
	public Boolean isPermisoPaginacionMedioDetalleServicioTransporte;
	public Boolean isPermisoPaginacionAltoDetalleServicioTransporte;
	public Boolean isPermisoPaginacionTodoDetalleServicioTransporte;
	public Boolean isPermisoCopiarDetalleServicioTransporte;
	public Boolean isPermisoVerFormDetalleServicioTransporte;
	public Boolean isPermisoDuplicarDetalleServicioTransporte;
	public Boolean isPermisoOrdenDetalleServicioTransporte;
	
	
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
	
	public DetalleServicioTransporteParameterReturnGeneral detalleserviciotransporteReturnGeneral;
	public DetalleServicioTransporteParameterReturnGeneral detalleserviciotransporteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleServicioTransporte=false;
	public Boolean esParaAccionDesdeFormularioDetalleServicioTransporte=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleServicioTransporteSessionBeanAdditional detalleserviciotransporteSessionBeanAdditional=null;
	
	public DetalleServicioTransporteSessionBeanAdditional getDetalleServicioTransporteSessionBeanAdditional() {
		return this.detalleserviciotransporteSessionBeanAdditional;
	}
	
	public void setDetalleServicioTransporteSessionBeanAdditional(DetalleServicioTransporteSessionBeanAdditional detalleserviciotransporteSessionBeanAdditional) {
		try {
			this.detalleserviciotransporteSessionBeanAdditional=detalleserviciotransporteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleServicioTransporteBeanSwingJInternalFrameAdditional detalleserviciotransporteBeanSwingJInternalFrameAdditional=null;
	//public class DetalleServicioTransporteBeanSwingJInternalFrame
	
	public DetalleServicioTransporteBeanSwingJInternalFrameAdditional getDetalleServicioTransporteBeanSwingJInternalFrameAdditional() {
		return this.detalleserviciotransporteBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleServicioTransporteBeanSwingJInternalFrameAdditional(DetalleServicioTransporteBeanSwingJInternalFrameAdditional detalleserviciotransporteBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleserviciotransporteBeanSwingJInternalFrameAdditional=detalleserviciotransporteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleServicioTransporteLogic detalleserviciotransporteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleServicioTransporte detalleserviciotransporteBean;
	public DetalleServicioTransporteConstantesFunciones detalleserviciotransporteConstantesFunciones;
	//public DetalleServicioTransporteParameterReturnGeneral detalleserviciotransporteReturnGeneral;
	
	//FK
	
	public ServicioTransporteLogic serviciotransporteLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	public CentroCostoLogic centrocostoLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleServicioTransporte> detalleserviciotransportes;	
	//public List<DetalleServicioTransporte> detalleserviciotransportesEliminados;
	//public List<DetalleServicioTransporte> detalleserviciotransportesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleServicioTransporte=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleServicioTransporte=true;
	public Boolean isVisibilidadCeldaCopiarDetalleServicioTransporte=true;
	public Boolean isVisibilidadCeldaVerFormDetalleServicioTransporte=true;
	public Boolean isVisibilidadCeldaOrdenDetalleServicioTransporte=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;
	public Boolean isVisibilidadCeldaModificarDetalleServicioTransporte=false;
	public Boolean isVisibilidadCeldaActualizarDetalleServicioTransporte=false;
	public Boolean isVisibilidadCeldaEliminarDetalleServicioTransporte=false;
	public Boolean isVisibilidadCeldaCancelarDetalleServicioTransporte=false;
	public Boolean isVisibilidadCeldaGuardarDetalleServicioTransporte=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdServicioTransporte=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoDetalleServicioTransporte() {
		return this.iIdNuevoDetalleServicioTransporte;
	}

	public void setiIdNuevoDetalleServicioTransporte(Long iIdNuevoDetalleServicioTransporte) {
		this.iIdNuevoDetalleServicioTransporte = iIdNuevoDetalleServicioTransporte;
	}
	
	public Long getidDetalleServicioTransporteActual() {
		return this.idDetalleServicioTransporteActual;
	}

	public void setidDetalleServicioTransporteActual(Long idDetalleServicioTransporteActual) {
		this.idDetalleServicioTransporteActual = idDetalleServicioTransporteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleServicioTransporte getdetalleserviciotransporte() {
		return this.detalleserviciotransporte;
	}

	public void setdetalleserviciotransporte(DetalleServicioTransporte detalleserviciotransporte) {
		this.detalleserviciotransporte = detalleserviciotransporte;
	}
	
	public DetalleServicioTransporte getdetalleserviciotransporteAux() {
		return this.detalleserviciotransporteAux;
	}

	public void setdetalleserviciotransporteAux(DetalleServicioTransporte detalleserviciotransporteAux) {
		this.detalleserviciotransporteAux = detalleserviciotransporteAux;
	}				
	
	public DetalleServicioTransporte getdetalleserviciotransporteAnterior() {
		return this.detalleserviciotransporteAnterior;
	}

	public void setdetalleserviciotransporteAnterior(DetalleServicioTransporte detalleserviciotransporteAnterior) {
		this.detalleserviciotransporteAnterior = detalleserviciotransporteAnterior;
	}	
	
	public DetalleServicioTransporte getdetalleserviciotransporteTotales() {
		return this.detalleserviciotransporteTotales;
	}

	public void setdetalleserviciotransporteTotales(DetalleServicioTransporte detalleserviciotransporteTotales) {
		this.detalleserviciotransporteTotales = detalleserviciotransporteTotales;
	}	
	
	public DetalleServicioTransporte getdetalleserviciotransporteBean() {
		return this.detalleserviciotransporteBean;
	}

	public void setdetalleserviciotransporteBean(DetalleServicioTransporte detalleserviciotransporteBean) {
		this.detalleserviciotransporteBean = detalleserviciotransporteBean;
	}	
	
	public DetalleServicioTransporteParameterReturnGeneral getdetalleserviciotransporteReturnGeneral() {
		return this.detalleserviciotransporteReturnGeneral;
	}

	public void setdetalleserviciotransporteReturnGeneral(DetalleServicioTransporteParameterReturnGeneral detalleserviciotransporteReturnGeneral) {
		this.detalleserviciotransporteReturnGeneral = detalleserviciotransporteReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

	public Long id_servicio_transporteFK_IdServicioTransporte=-1L;

	public Long getid_servicio_transporteFK_IdServicioTransporte() {
		return this.id_servicio_transporteFK_IdServicioTransporte;
	}

	public void setid_servicio_transporteFK_IdServicioTransporte(Long id_servicio_transporteFK_IdServicioTransporte) {
		this.id_servicio_transporteFK_IdServicioTransporte = id_servicio_transporteFK_IdServicioTransporte;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_unidadFK_IdUnidad=-1L;

	public Long getid_unidadFK_IdUnidad() {
		return this.id_unidadFK_IdUnidad;
	}

	public void setid_unidadFK_IdUnidad(Long id_unidadFK_IdUnidad) {
		this.id_unidadFK_IdUnidad = id_unidadFK_IdUnidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleServicioTransporteLogic getDetalleServicioTransporteLogic()	{		
		return detalleserviciotransporteLogic;
	}

	public void setDetalleServicioTransporteLogic(DetalleServicioTransporteLogic detalleserviciotransporteLogic) {
		this.detalleserviciotransporteLogic = detalleserviciotransporteLogic;
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
	
	public Boolean getIsEsNuevoDetalleServicioTransporte() {
		return isEsNuevoDetalleServicioTransporte;
	}

	public void setIsEsNuevoDetalleServicioTransporte(Boolean isEsNuevoDetalleServicioTransporte) {
		this.isEsNuevoDetalleServicioTransporte = isEsNuevoDetalleServicioTransporte;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleServicioTransporte() {
		return esParaAccionDesdeFormularioDetalleServicioTransporte;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleServicioTransporte(Boolean esParaAccionDesdeFormularioDetalleServicioTransporte) {
		this.esParaAccionDesdeFormularioDetalleServicioTransporte = esParaAccionDesdeFormularioDetalleServicioTransporte;
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
	
	
	public void cargarCombosServicioTransportesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.serviciotransportesForeignKey=new ArrayList<ServicioTransporte>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ServicioTransporteLogic serviciotransporteLogic=new ServicioTransporteLogic();

			serviciotransporteLogic.getServicioTransporteDataAccess().setIsForForeingKeyData(true);

			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionServicioTransporte()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serviciotransporteLogic.getServicioTransporteDataAccess().setIsForForeingKeyData(true);

					serviciotransporteLogic.getTodosServicioTransportesWithConnection(sFinalQuery,new Pagination());

					this.serviciotransportesForeignKey=serviciotransporteLogic.getServicioTransportes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaServicioTransporte(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					serviciotransporteLogic.getEntityWithConnection(detalleserviciotransporteSessionBean.getlidServicioTransporteActual());
					this.serviciotransportesForeignKey.add(serviciotransporteLogic.getServicioTransporte());
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

			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleserviciotransporteSessionBean.getlidEmpresaActual());
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

			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detalleserviciotransporteSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(detalleserviciotransporteSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(detalleserviciotransporteSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(detalleserviciotransporteSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

	public void cargarCombosProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productosForeignKey=new ArrayList<Producto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoLogic productoLogic=new ProductoLogic();

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

					productoLogic.getTodosProductosWithConnection(sFinalQuery,new Pagination());

					this.productosForeignKey=productoLogic.getProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(detalleserviciotransporteSessionBean.getlidProductoActual());
					this.productosForeignKey.add(productoLogic.getProducto());
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

	public void cargarCombosUnidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadsForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadsForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(detalleserviciotransporteSessionBean.getlidUnidadActual());
					this.unidadsForeignKey.add(unidadLogic.getUnidad());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(detalleserviciotransporteSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

	
	
	public void setActualServicioTransporteForeignKey(Long idServicioTransporteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ServicioTransporte  serviciotransporteTemp=null;

			for(ServicioTransporte serviciotransporteAux:serviciotransportesForeignKey) {
				if(serviciotransporteAux.getId()!=null && serviciotransporteAux.getId().equals(idServicioTransporteSeleccionado)) {
					serviciotransporteTemp=serviciotransporteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(serviciotransporteTemp!=null) {

					if(this.detalleserviciotransporte!=null) {
						this.detalleserviciotransporte.setServicioTransporte(serviciotransporteTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.setSelectedItem(serviciotransporteTemp);
					}
				} else {
					//jComboBoxid_servicio_transporteDetalleServicioTransporte.setSelectedItem(serviciotransporteTemp);
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdServicioTransporte") || sFormularioTipoBusqueda.equals("Todos")){
					if(serviciotransporteTemp!=null && jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte!=null) {
						jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setSelectedItem(serviciotransporteTemp);
					} else {
						if(jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte!=null) {
							//jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setSelectedItem(serviciotransporteTemp);
							if(jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.getItemCount()>0) {
								jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setSelectedIndex(0);
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

	public String getActualServicioTransporteForeignKeyDescripcion(Long idServicioTransporteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ServicioTransporte  serviciotransporteTemp=null;

			for(ServicioTransporte serviciotransporteAux:serviciotransportesForeignKey) {
				if(serviciotransporteAux.getId()!=null && serviciotransporteAux.getId().equals(idServicioTransporteSeleccionado)) {
					serviciotransporteTemp=serviciotransporteAux;
					break;
				}
			}


			sDescripcion=ServicioTransporteConstantesFunciones.getServicioTransporteDescripcion(serviciotransporteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualServicioTransporteForeignKeyGenerico(Long idServicioTransporteSeleccionado,JComboBox jComboBoxid_servicio_transporteDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			ServicioTransporte  serviciotransporteTemp=null;

			for(ServicioTransporte serviciotransporteAux:serviciotransportesForeignKey) {
				if(serviciotransporteAux.getId()!=null && serviciotransporteAux.getId().equals(idServicioTransporteSeleccionado)) {
					serviciotransporteTemp=serviciotransporteAux;
					break;
				}
			}

			if(serviciotransporteTemp!=null) {
				jComboBoxid_servicio_transporteDetalleServicioTransporteGenerico.setSelectedItem(serviciotransporteTemp);
			} else {
				if(jComboBoxid_servicio_transporteDetalleServicioTransporteGenerico!=null && jComboBoxid_servicio_transporteDetalleServicioTransporteGenerico.getItemCount()>0) {
					jComboBoxid_servicio_transporteDetalleServicioTransporteGenerico.setSelectedIndex(0);
				}
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

					if(this.detalleserviciotransporte!=null) {
						this.detalleserviciotransporte.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleServicioTransporte.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleServicioTransporteGenerico)throws Exception
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
				jComboBoxid_empresaDetalleServicioTransporteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleServicioTransporteGenerico!=null && jComboBoxid_empresaDetalleServicioTransporteGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleServicioTransporteGenerico.setSelectedIndex(0);
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

					if(this.detalleserviciotransporte!=null) {
						this.detalleserviciotransporte.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleServicioTransporte.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleServicioTransporteGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleServicioTransporteGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleServicioTransporteGenerico!=null && jComboBoxid_sucursalDetalleServicioTransporteGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleServicioTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.detalleserviciotransporte!=null) {
						this.detalleserviciotransporte.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetalleServicioTransporte.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioDetalleServicioTransporteGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetalleServicioTransporteGenerico!=null && jComboBoxid_ejercicioDetalleServicioTransporteGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetalleServicioTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.detalleserviciotransporte!=null) {
						this.detalleserviciotransporte.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoDetalleServicioTransporte.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoDetalleServicioTransporteGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoDetalleServicioTransporteGenerico!=null && jComboBoxid_periodoDetalleServicioTransporteGenerico.getItemCount()>0) {
					jComboBoxid_periodoDetalleServicioTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.detalleserviciotransporte!=null) {
						this.detalleserviciotransporte.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDetalleServicioTransporte.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte!=null) {
						jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte!=null) {
							//jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaDetalleServicioTransporteGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDetalleServicioTransporteGenerico!=null && jComboBoxid_bodegaDetalleServicioTransporteGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDetalleServicioTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProductoForeignKey(Long idProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productoTemp!=null) {

					if(this.detalleserviciotransporte!=null) {
						this.detalleserviciotransporte.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDetalleServicioTransporte.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoDetalleServicioTransporte!=null) {
						jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte!=null) {
							//jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.setSelectedIndex(0);
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

	public String getActualProductoForeignKeyDescripcion(Long idProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}


			sDescripcion=ProductoConstantesFunciones.getProductoDescripcion(productoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(productoTemp!=null) {
				jComboBoxid_productoDetalleServicioTransporteGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDetalleServicioTransporteGenerico!=null && jComboBoxid_productoDetalleServicioTransporteGenerico.getItemCount()>0) {
					jComboBoxid_productoDetalleServicioTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadForeignKey(Long idUnidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadTemp!=null) {

					if(this.detalleserviciotransporte!=null) {
						this.detalleserviciotransporte.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadDetalleServicioTransporte.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte!=null) {
						jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte!=null) {
							//jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.setSelectedIndex(0);
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

	public String getActualUnidadForeignKeyDescripcion(Long idUnidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(unidadTemp!=null) {
				jComboBoxid_unidadDetalleServicioTransporteGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadDetalleServicioTransporteGenerico!=null && jComboBoxid_unidadDetalleServicioTransporteGenerico.getItemCount()>0) {
					jComboBoxid_unidadDetalleServicioTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.detalleserviciotransporte!=null) {
						this.detalleserviciotransporte.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoDetalleServicioTransporte.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setSelectedIndex(0);
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

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoDetalleServicioTransporteGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoDetalleServicioTransporteGenerico!=null && jComboBoxid_centro_costoDetalleServicioTransporteGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoDetalleServicioTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarServicioTransporteForeignKey(DetalleServicioTransporte detalleserviciotransporte,JComboBox jComboBoxid_servicio_transporteDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			ServicioTransporte  serviciotransporteAux=new ServicioTransporte();

			if(jComboBoxid_servicio_transporteDetalleServicioTransporteGenerico==null) {
				serviciotransporteAux=(ServicioTransporte)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.getSelectedItem();
			} else {
				serviciotransporteAux=(ServicioTransporte)jComboBoxid_servicio_transporteDetalleServicioTransporteGenerico.getSelectedItem();
			}

			if(serviciotransporteAux!=null && serviciotransporteAux.getId()!=null) {
				detalleserviciotransporte.setid_servicio_transporte(serviciotransporteAux.getId());
				detalleserviciotransporte.setserviciotransporte_descripcion(DetalleServicioTransporteConstantesFunciones.getServicioTransporteDescripcion(serviciotransporteAux));
				detalleserviciotransporte.setServicioTransporte(serviciotransporteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleServicioTransporte detalleserviciotransporte,JComboBox jComboBoxid_empresaDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleServicioTransporteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleServicioTransporteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleserviciotransporte.setid_empresa(empresaAux.getId());
				detalleserviciotransporte.setempresa_descripcion(DetalleServicioTransporteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleserviciotransporte.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleServicioTransporte detalleserviciotransporte,JComboBox jComboBoxid_sucursalDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleServicioTransporteGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleServicioTransporteGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detalleserviciotransporte.setid_sucursal(sucursalAux.getId());
				detalleserviciotransporte.setsucursal_descripcion(DetalleServicioTransporteConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detalleserviciotransporte.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetalleServicioTransporte detalleserviciotransporte,JComboBox jComboBoxid_ejercicioDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetalleServicioTransporteGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetalleServicioTransporteGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detalleserviciotransporte.setid_ejercicio(ejercicioAux.getId());
				detalleserviciotransporte.setejercicio_descripcion(DetalleServicioTransporteConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detalleserviciotransporte.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(DetalleServicioTransporte detalleserviciotransporte,JComboBox jComboBoxid_periodoDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoDetalleServicioTransporteGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoDetalleServicioTransporteGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				detalleserviciotransporte.setid_periodo(periodoAux.getId());
				detalleserviciotransporte.setperiodo_descripcion(DetalleServicioTransporteConstantesFunciones.getPeriodoDescripcion(periodoAux));
				detalleserviciotransporte.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DetalleServicioTransporte detalleserviciotransporte,JComboBox jComboBoxid_bodegaDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDetalleServicioTransporteGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDetalleServicioTransporteGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				detalleserviciotransporte.setid_bodega(bodegaAux.getId());
				detalleserviciotransporte.setbodega_descripcion(DetalleServicioTransporteConstantesFunciones.getBodegaDescripcion(bodegaAux));
				detalleserviciotransporte.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DetalleServicioTransporte detalleserviciotransporte,JComboBox jComboBoxid_productoDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDetalleServicioTransporteGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDetalleServicioTransporteGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				detalleserviciotransporte.setid_producto(productoAux.getId());
				detalleserviciotransporte.setproducto_descripcion(DetalleServicioTransporteConstantesFunciones.getProductoDescripcion(productoAux));
				detalleserviciotransporte.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(DetalleServicioTransporte detalleserviciotransporte,JComboBox jComboBoxid_unidadDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadDetalleServicioTransporteGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadDetalleServicioTransporteGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				detalleserviciotransporte.setid_unidad(unidadAux.getId());
				detalleserviciotransporte.setunidad_descripcion(DetalleServicioTransporteConstantesFunciones.getUnidadDescripcion(unidadAux));
				detalleserviciotransporte.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(DetalleServicioTransporte detalleserviciotransporte,JComboBox jComboBoxid_centro_costoDetalleServicioTransporteGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoDetalleServicioTransporteGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoDetalleServicioTransporteGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				detalleserviciotransporte.setid_centro_costo(centrocostoAux.getId());
				detalleserviciotransporte.setcentrocosto_descripcion(DetalleServicioTransporteConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				detalleserviciotransporte.setCentroCosto(centrocostoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameServicioTransportesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingServicioTransporte=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.removeAllItems();

							for(ServicioTransporte serviciotransporte:this.serviciotransportesForeignKey) {
								this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.addItem(serviciotransporte);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
					}

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdServicioTransporte") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.removeAllItems();

							for(ServicioTransporte serviciotransporte:this.serviciotransportesForeignKey) {
								this.jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.addItem(serviciotransporte);
							}
						}

						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
					}

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
					}

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
					}

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
					}

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
					}

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.addItem(bodega);
							}
						}

						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
					}

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.addItem(producto);
							}
						}

						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
					}

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.addItem(unidad);
							}
						}

						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { 
					}

					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.addItem(centrocosto);
							}
						}

						if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameServicioTransporteForeignKey(ServicioTransporte serviciotransporte,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.setSelectedItem(serviciotransporte);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setSelectedItem(serviciotransporte);
						} else {
							this.jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUnidadForeignKey(Unidad unidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleServicioTransporte() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleServicioTransporteConstantesFunciones.refrescarForeignKeysDescripcionesDetalleServicioTransporte(this.detalleserviciotransporteLogic.getDetalleServicioTransportes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleServicioTransporteConstantesFunciones.refrescarForeignKeysDescripcionesDetalleServicioTransporte(this.detalleserviciotransportes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(ServicioTransporte.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
		classes.add(new Classe(CentroCosto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleserviciotransporteLogic.setDetalleServicioTransportes(this.detalleserviciotransportes);
			detalleserviciotransporteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleServicioTransporteParameterReturnGeneral getDetalleServicioTransporteParameterGeneral() {
		return this.detalleserviciotransporteParameterGeneral;
	}
	
	public void setDetalleServicioTransporteParameterGeneral(DetalleServicioTransporteParameterReturnGeneral detalleserviciotransporteParameterGeneral) {
		this.detalleserviciotransporteParameterGeneral = detalleserviciotransporteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleServicioTransporte() {
		return isPermisoTodoDetalleServicioTransporte;
	}

	public void setIsPermisoTodoDetalleServicioTransporte(Boolean isPermisoTodoDetalleServicioTransporte) {
		this.isPermisoTodoDetalleServicioTransporte = isPermisoTodoDetalleServicioTransporte;
	}

	public Boolean getIsPermisoNuevoDetalleServicioTransporte() {
		return isPermisoNuevoDetalleServicioTransporte;
	}

	public void setIsPermisoNuevoDetalleServicioTransporte(Boolean isPermisoNuevoDetalleServicioTransporte) {
		this.isPermisoNuevoDetalleServicioTransporte = isPermisoNuevoDetalleServicioTransporte;
	}

	public Boolean getIsPermisoActualizarDetalleServicioTransporte() {
		return isPermisoActualizarDetalleServicioTransporte;
	}

	public void setIsPermisoActualizarDetalleServicioTransporte(Boolean isPermisoActualizarDetalleServicioTransporte) {
		this.isPermisoActualizarDetalleServicioTransporte = isPermisoActualizarDetalleServicioTransporte;
	}

	public Boolean getIsPermisoEliminarDetalleServicioTransporte() {
		return isPermisoEliminarDetalleServicioTransporte;
	}

	public void setIsPermisoEliminarDetalleServicioTransporte(Boolean isPermisoEliminarDetalleServicioTransporte) {
		this.isPermisoEliminarDetalleServicioTransporte = isPermisoEliminarDetalleServicioTransporte;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleServicioTransporte() {
		return isPermisoGuardarCambiosDetalleServicioTransporte;
	}

	public void setIsPermisoGuardarCambiosDetalleServicioTransporte(Boolean isPermisoGuardarCambiosDetalleServicioTransporte) {
		this.isPermisoGuardarCambiosDetalleServicioTransporte = isPermisoGuardarCambiosDetalleServicioTransporte;
	}
	
	public Boolean getIsPermisoConsultaDetalleServicioTransporte() {
		return isPermisoConsultaDetalleServicioTransporte;
	}

	public void setIsPermisoConsultaDetalleServicioTransporte(Boolean isPermisoConsultaDetalleServicioTransporte) {
		this.isPermisoConsultaDetalleServicioTransporte = isPermisoConsultaDetalleServicioTransporte;
	}

	public Boolean getIsPermisoBusquedaDetalleServicioTransporte() {
		return isPermisoBusquedaDetalleServicioTransporte;
	}

	public void setIsPermisoBusquedaDetalleServicioTransporte(Boolean isPermisoBusquedaDetalleServicioTransporte) {
		this.isPermisoBusquedaDetalleServicioTransporte = isPermisoBusquedaDetalleServicioTransporte;
	}

	public Boolean getIsPermisoReporteDetalleServicioTransporte() {
		return isPermisoReporteDetalleServicioTransporte;
	}

	public void setIsPermisoReporteDetalleServicioTransporte(Boolean isPermisoReporteDetalleServicioTransporte) {
		this.isPermisoReporteDetalleServicioTransporte = isPermisoReporteDetalleServicioTransporte;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleServicioTransporte() {
		return isPermisoPaginacionMedioDetalleServicioTransporte;
	}

	public void setIsPermisoPaginacionMedioDetalleServicioTransporte(Boolean isPermisoPaginacionMedioDetalleServicioTransporte) {
		this.isPermisoPaginacionMedioDetalleServicioTransporte = isPermisoPaginacionMedioDetalleServicioTransporte;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleServicioTransporte() {
		return isPermisoPaginacionTodoDetalleServicioTransporte;
	}

	public void setIsPermisoPaginacionTodoDetalleServicioTransporte(Boolean isPermisoPaginacionTodoDetalleServicioTransporte) {
		this.isPermisoPaginacionTodoDetalleServicioTransporte = isPermisoPaginacionTodoDetalleServicioTransporte;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleServicioTransporte() {
		return isPermisoPaginacionAltoDetalleServicioTransporte;
	}

	public void setIsPermisoPaginacionAltoDetalleServicioTransporte(Boolean isPermisoPaginacionAltoDetalleServicioTransporte) {
		this.isPermisoPaginacionAltoDetalleServicioTransporte = isPermisoPaginacionAltoDetalleServicioTransporte;
	}
	
	public Boolean getIsPermisoCopiarDetalleServicioTransporte() {
		return isPermisoCopiarDetalleServicioTransporte;
	}

	public void setIsPermisoCopiarDetalleServicioTransporte(Boolean isPermisoCopiarDetalleServicioTransporte) {
		this.isPermisoCopiarDetalleServicioTransporte = isPermisoCopiarDetalleServicioTransporte;
	}
	
	public Boolean getIsPermisoVerFormDetalleServicioTransporte() {
		return isPermisoVerFormDetalleServicioTransporte;
	}

	public void setIsPermisoVerFormDetalleServicioTransporte(Boolean isPermisoVerFormDetalleServicioTransporte) {
		this.isPermisoVerFormDetalleServicioTransporte = isPermisoVerFormDetalleServicioTransporte;
	}
	
	public Boolean getIsPermisoDuplicarDetalleServicioTransporte() {
		return isPermisoDuplicarDetalleServicioTransporte;
	}

	public void setIsPermisoDuplicarDetalleServicioTransporte(Boolean isPermisoDuplicarDetalleServicioTransporte) {
		this.isPermisoDuplicarDetalleServicioTransporte = isPermisoDuplicarDetalleServicioTransporte;
	}
	
	public Boolean getIsPermisoOrdenDetalleServicioTransporte() {
		return isPermisoOrdenDetalleServicioTransporte;
	}

	public void setIsPermisoOrdenDetalleServicioTransporte(Boolean isPermisoOrdenDetalleServicioTransporte) {
		this.isPermisoOrdenDetalleServicioTransporte = isPermisoOrdenDetalleServicioTransporte;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleServicioTransporte() {
		return isVisibilidadCeldaNuevoDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaNuevoDetalleServicioTransporte(Boolean isVisibilidadCeldaNuevoDetalleServicioTransporte) {
		this.isVisibilidadCeldaNuevoDetalleServicioTransporte = isVisibilidadCeldaNuevoDetalleServicioTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleServicioTransporte() {
		return isVisibilidadCeldaDuplicarDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleServicioTransporte(Boolean isVisibilidadCeldaDuplicarDetalleServicioTransporte) {
		this.isVisibilidadCeldaDuplicarDetalleServicioTransporte = isVisibilidadCeldaDuplicarDetalleServicioTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleServicioTransporte() {
		return isVisibilidadCeldaCopiarDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaCopiarDetalleServicioTransporte(Boolean isVisibilidadCeldaCopiarDetalleServicioTransporte) {
		this.isVisibilidadCeldaCopiarDetalleServicioTransporte = isVisibilidadCeldaCopiarDetalleServicioTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleServicioTransporte() {
		return isVisibilidadCeldaVerFormDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaVerFormDetalleServicioTransporte(Boolean isVisibilidadCeldaVerFormDetalleServicioTransporte) {
		this.isVisibilidadCeldaVerFormDetalleServicioTransporte = isVisibilidadCeldaVerFormDetalleServicioTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleServicioTransporte() {
		return isVisibilidadCeldaOrdenDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaOrdenDetalleServicioTransporte(Boolean isVisibilidadCeldaOrdenDetalleServicioTransporte) {
		this.isVisibilidadCeldaOrdenDetalleServicioTransporte = isVisibilidadCeldaOrdenDetalleServicioTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte() {
		return isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte(Boolean isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte = isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleServicioTransporte() {
		return isVisibilidadCeldaModificarDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaModificarDetalleServicioTransporte(Boolean isVisibilidadCeldaModificarDetalleServicioTransporte) {
		this.isVisibilidadCeldaModificarDetalleServicioTransporte = isVisibilidadCeldaModificarDetalleServicioTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleServicioTransporte() {
		return isVisibilidadCeldaActualizarDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaActualizarDetalleServicioTransporte(Boolean isVisibilidadCeldaActualizarDetalleServicioTransporte) {
		this.isVisibilidadCeldaActualizarDetalleServicioTransporte = isVisibilidadCeldaActualizarDetalleServicioTransporte;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleServicioTransporte() {
		return isVisibilidadCeldaEliminarDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaEliminarDetalleServicioTransporte(Boolean isVisibilidadCeldaEliminarDetalleServicioTransporte) {
		this.isVisibilidadCeldaEliminarDetalleServicioTransporte = isVisibilidadCeldaEliminarDetalleServicioTransporte;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleServicioTransporte() {
		return isVisibilidadCeldaCancelarDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaCancelarDetalleServicioTransporte(Boolean isVisibilidadCeldaCancelarDetalleServicioTransporte) {
		this.isVisibilidadCeldaCancelarDetalleServicioTransporte = isVisibilidadCeldaCancelarDetalleServicioTransporte;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleServicioTransporte() {
		return isVisibilidadCeldaGuardarDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaGuardarDetalleServicioTransporte(Boolean isVisibilidadCeldaGuardarDetalleServicioTransporte) {
		this.isVisibilidadCeldaGuardarDetalleServicioTransporte = isVisibilidadCeldaGuardarDetalleServicioTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleServicioTransporte() {
		return isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleServicioTransporte(Boolean isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte) {
		this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte = isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte;
	}
		
	public DetalleServicioTransporteSessionBean getdetalleserviciotransporteSessionBean() {
		return this.detalleserviciotransporteSessionBean;
	}
	
	public void setdetalleserviciotransporteSessionBean(DetalleServicioTransporteSessionBean detalleserviciotransporteSessionBean) {
		this.detalleserviciotransporteSessionBean=detalleserviciotransporteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdServicioTransporte() {
		return this.isVisibilidadFK_IdServicioTransporte;
	}

	public void setisVisibilidadFK_IdServicioTransporte(Boolean isVisibilidadFK_IdServicioTransporte) {
		this.isVisibilidadFK_IdServicioTransporte=isVisibilidadFK_IdServicioTransporte;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte)throws Exception {
		try {
			
				this.setActualParaGuardarServicioTransporteForeignKey(detalleserviciotransporte,null);
				this.setActualParaGuardarEmpresaForeignKey(detalleserviciotransporte,null);
				this.setActualParaGuardarSucursalForeignKey(detalleserviciotransporte,null);
				this.setActualParaGuardarEjercicioForeignKey(detalleserviciotransporte,null);
				this.setActualParaGuardarPeriodoForeignKey(detalleserviciotransporte,null);
				this.setActualParaGuardarBodegaForeignKey(detalleserviciotransporte,null);
				this.setActualParaGuardarProductoForeignKey(detalleserviciotransporte,null);
				this.setActualParaGuardarUnidadForeignKey(detalleserviciotransporte,null);
				this.setActualParaGuardarCentroCostoForeignKey(detalleserviciotransporte,null);
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
	
	public void bugActualizarReferenciaActual(DetalleServicioTransporte detalleserviciotransporte,DetalleServicioTransporte detalleserviciotransporteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleServicioTransporte(detalleserviciotransporte);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleserviciotransporteAux.setId(detalleserviciotransporte.getId());
		detalleserviciotransporteAux.setVersionRow(detalleserviciotransporte.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleServicioTransporte();
		
			int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleserviciotransporteValidator.getInvalidValues(this.detalleserviciotransporte);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleserviciotransporteLogic.setDatosCliente(datosCliente);
			detalleserviciotransporteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleserviciotransporteAux=new  DetalleServicioTransporte();
				
				detalleserviciotransporteAux.setIsNew(true);
				detalleserviciotransporteAux.setIsChanged(true);
				
				detalleserviciotransporteAux.setDetalleServicioTransporteOriginal(this.detalleserviciotransporte);
				
				detalleserviciotransporteAux.setId(this.detalleserviciotransporte.getId());	
				detalleserviciotransporteAux.setVersionRow(this.detalleserviciotransporte.getVersionRow());	
				detalleserviciotransporteAux.setid_servicio_transporte(this.detalleserviciotransporte.getid_servicio_transporte());	
				detalleserviciotransporteAux.setid_empresa(this.detalleserviciotransporte.getid_empresa());	
				detalleserviciotransporteAux.setid_sucursal(this.detalleserviciotransporte.getid_sucursal());	
				detalleserviciotransporteAux.setid_ejercicio(this.detalleserviciotransporte.getid_ejercicio());	
				detalleserviciotransporteAux.setid_periodo(this.detalleserviciotransporte.getid_periodo());	
				detalleserviciotransporteAux.setid_bodega(this.detalleserviciotransporte.getid_bodega());	
				detalleserviciotransporteAux.setid_producto(this.detalleserviciotransporte.getid_producto());	
				detalleserviciotransporteAux.setid_unidad(this.detalleserviciotransporte.getid_unidad());	
				detalleserviciotransporteAux.setid_centro_costo(this.detalleserviciotransporte.getid_centro_costo());	
				detalleserviciotransporteAux.setcantidad(this.detalleserviciotransporte.getcantidad());	
				detalleserviciotransporteAux.setprecio(this.detalleserviciotransporte.getprecio());	
				detalleserviciotransporteAux.settotal(this.detalleserviciotransporte.gettotal());	
				detalleserviciotransporteAux.setdescripcion(this.detalleserviciotransporte.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleserviciotransporteAux,detalleserviciotransporteLogic.getDetalleServicioTransportes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleserviciotransporteAux,detalleserviciotransportes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.saveDetalleServicioTransportes();//WithConnection
						//detalleserviciotransporteLogic.getSetVersionRowDetalleServicioTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleserviciotransporte,detalleserviciotransporteAux);
					
					this.refrescarForeignKeysDescripcionesDetalleServicioTransporte();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleserviciotransporteLogic.saveDetalleServicioTransporteRelaciones(detalleserviciotransporteAux);//WithConnection
								//detalleserviciotransporteLogic.getSetVersionRowDetalleServicioTransportes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleserviciotransporte,detalleserviciotransporteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleserviciotransporteAux,detalleserviciotransporteLogic.getDetalleServicioTransportes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleserviciotransporteAux,detalleserviciotransportes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleserviciotransporte,detalleserviciotransporteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleserviciotransporteAux=new  DetalleServicioTransporte();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() && this.detalleserviciotransporte.getId()>=0)) {
						
					detalleserviciotransporteAux.setIsNew(false);
				}
				
				detalleserviciotransporteAux.setIsDeleted(false);
			
				detalleserviciotransporteAux.setId(this.detalleserviciotransporte.getId());	
				detalleserviciotransporteAux.setVersionRow(this.detalleserviciotransporte.getVersionRow());	
				detalleserviciotransporteAux.setid_servicio_transporte(this.detalleserviciotransporte.getid_servicio_transporte());	
				detalleserviciotransporteAux.setid_empresa(this.detalleserviciotransporte.getid_empresa());	
				detalleserviciotransporteAux.setid_sucursal(this.detalleserviciotransporte.getid_sucursal());	
				detalleserviciotransporteAux.setid_ejercicio(this.detalleserviciotransporte.getid_ejercicio());	
				detalleserviciotransporteAux.setid_periodo(this.detalleserviciotransporte.getid_periodo());	
				detalleserviciotransporteAux.setid_bodega(this.detalleserviciotransporte.getid_bodega());	
				detalleserviciotransporteAux.setid_producto(this.detalleserviciotransporte.getid_producto());	
				detalleserviciotransporteAux.setid_unidad(this.detalleserviciotransporte.getid_unidad());	
				detalleserviciotransporteAux.setid_centro_costo(this.detalleserviciotransporte.getid_centro_costo());	
				detalleserviciotransporteAux.setcantidad(this.detalleserviciotransporte.getcantidad());	
				detalleserviciotransporteAux.setprecio(this.detalleserviciotransporte.getprecio());	
				detalleserviciotransporteAux.settotal(this.detalleserviciotransporte.gettotal());	
				detalleserviciotransporteAux.setdescripcion(this.detalleserviciotransporte.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleserviciotransporteAux,detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleserviciotransporteAux,detalleserviciotransportes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.saveDetalleServicioTransportes();//WithConnection
						//detalleserviciotransporteLogic.getSetVersionRowDetalleServicioTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleserviciotransporte,detalleserviciotransporteAux);
					
					this.refrescarForeignKeysDescripcionesDetalleServicioTransporte();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleserviciotransporteLogic.saveDetalleServicioTransporteRelaciones(detalleserviciotransporteAux);//WithConnection
								//detalleserviciotransporteLogic.getSetVersionRowDetalleServicioTransportes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleserviciotransporte,detalleserviciotransporteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleserviciotransporteAux,detalleserviciotransporteLogic.getDetalleServicioTransportes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleserviciotransporteAux,detalleserviciotransportes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleserviciotransporte,detalleserviciotransporteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleserviciotransporteAux=new  DetalleServicioTransporte();
				
				detalleserviciotransporteAux.setIsNew(false);
				detalleserviciotransporteAux.setIsChanged(false);
				
				detalleserviciotransporteAux.setIsDeleted(true);
				
				detalleserviciotransporteAux.setId(this.detalleserviciotransporte.getId());	
				detalleserviciotransporteAux.setVersionRow(this.detalleserviciotransporte.getVersionRow());	
				detalleserviciotransporteAux.setid_servicio_transporte(this.detalleserviciotransporte.getid_servicio_transporte());	
				detalleserviciotransporteAux.setid_empresa(this.detalleserviciotransporte.getid_empresa());	
				detalleserviciotransporteAux.setid_sucursal(this.detalleserviciotransporte.getid_sucursal());	
				detalleserviciotransporteAux.setid_ejercicio(this.detalleserviciotransporte.getid_ejercicio());	
				detalleserviciotransporteAux.setid_periodo(this.detalleserviciotransporte.getid_periodo());	
				detalleserviciotransporteAux.setid_bodega(this.detalleserviciotransporte.getid_bodega());	
				detalleserviciotransporteAux.setid_producto(this.detalleserviciotransporte.getid_producto());	
				detalleserviciotransporteAux.setid_unidad(this.detalleserviciotransporte.getid_unidad());	
				detalleserviciotransporteAux.setid_centro_costo(this.detalleserviciotransporte.getid_centro_costo());	
				detalleserviciotransporteAux.setcantidad(this.detalleserviciotransporte.getcantidad());	
				detalleserviciotransporteAux.setprecio(this.detalleserviciotransporte.getprecio());	
				detalleserviciotransporteAux.settotal(this.detalleserviciotransporte.gettotal());	
				detalleserviciotransporteAux.setdescripcion(this.detalleserviciotransporte.getdescripcion());	
				
				if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleserviciotransporteAux.getId()>=0) {	
						this.detalleserviciotransportesEliminados.add(detalleserviciotransporteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleserviciotransporteAux,detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleserviciotransporteAux,detalleserviciotransportes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.saveDetalleServicioTransportes();//WithConnection
						//detalleserviciotransporteLogic.getSetVersionRowDetalleServicioTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleserviciotransporteLogic.saveDetalleServicioTransporteRelaciones(detalleserviciotransporteAux);//WithConnection
								//detalleserviciotransporteLogic.getSetVersionRowDetalleServicioTransportes();//WithConnection
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
							if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleserviciotransporteAux,detalleserviciotransporteLogic.getDetalleServicioTransportes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleserviciotransporteAux,detalleserviciotransportes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(this.detalleserviciotransportesEliminados);
					
					detalleserviciotransporteLogic.saveDetalleServicioTransportes();//WithConnection
					//detalleserviciotransporteLogic.getSetVersionRowDetalleServicioTransportes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleServicioTransporte();
				
				this.detalleserviciotransportesEliminados= new ArrayList<DetalleServicioTransporte>();		
			}
			
			if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Servicio Transporte GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleserviciotransporte=detalleserviciotransporteAux;
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
      		//this.finishProcessDetalleServicioTransporte();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleServicioTransporte detalleserviciotransporteLocal) throws Exception {
		
		if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleServicioTransporte detalleserviciotransporteLocal) throws Exception {	
		if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ServicioTransporteDetalleFormJInternalFrame.class)) {
				ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrameLocal=(ServicioTransporteBeanSwingJInternalFrame) ((ServicioTransporteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				serviciotransporteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoServicioTransporte(serviciotransporteBeanSwingJInternalFrameLocal.getserviciotransporte(),true);
				serviciotransporteBeanSwingJInternalFrameLocal.actualizarLista(serviciotransporteBeanSwingJInternalFrameLocal.serviciotransporte,this.serviciotransportesForeignKey);

				serviciotransporteBeanSwingJInternalFrameLocal.actualizarRelaciones(serviciotransporteBeanSwingJInternalFrameLocal.serviciotransporte);

				detalleserviciotransporteLocal.setServicioTransporte(serviciotransporteBeanSwingJInternalFrameLocal.serviciotransporte);

				this.addItemDefectoCombosForeignKeyServicioTransporte();
				this.cargarCombosFrameServicioTransportesForeignKey("Formulario");
				this.setActualServicioTransporteForeignKey(serviciotransporteBeanSwingJInternalFrameLocal.serviciotransporte.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleserviciotransporteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detalleserviciotransporteLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detalleserviciotransporteLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				detalleserviciotransporteLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				detalleserviciotransporteLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				detalleserviciotransporteLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				detalleserviciotransporteLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				detalleserviciotransporteLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleServicioTransporteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleserviciotransporteValidator.getInvalidValues(this.detalleserviciotransporte);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleServicioTransporte detalleserviciotransporte,List<DetalleServicioTransporte> detalleserviciotransportes) throws Exception {
		try	{		
			DetalleServicioTransporteConstantesFunciones.actualizarLista(detalleserviciotransporte,detalleserviciotransportes,this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleServicioTransporte detalleserviciotransporte,List<DetalleServicioTransporte> detalleserviciotransportes) throws Exception {
		try	{			
			DetalleServicioTransporteConstantesFunciones.actualizarSelectedLista(detalleserviciotransporte,detalleserviciotransportes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleServicioTransporte> detalleserviciotransportesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleserviciotransportesLocal=this.detalleserviciotransporteLogic.getDetalleServicioTransportes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleserviciotransportesLocal=this.detalleserviciotransportes;
			}
			//ARCHITECTURE
		
			for(DetalleServicioTransporte detalleserviciotransporteLocal:detalleserviciotransportesLocal) {
				if(this.permiteMantenimiento(detalleserviciotransporteLocal) && detalleserviciotransporteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleServicioTransporteConstantesFunciones.getDetalleServicioTransporteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.IDSERVICIOTRANSPORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_servicio_transporteDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_empresaDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_sucursalDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_ejercicioDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_periodoDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_bodegaDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_productoDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_unidadDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_centro_costoDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelcantidadDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelprecioDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabeltotalDetalleServicioTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleServicioTransporteConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabeldescripcionDetalleServicioTransporte,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_servicio_transporteDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_empresaDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_sucursalDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_ejercicioDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_periodoDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_bodegaDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_productoDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_unidadDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelid_centro_costoDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelcantidadDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelprecioDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabeltotalDetalleServicioTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabeldescripcionDetalleServicioTransporte,"");
		
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
		this.iIdNuevoDetalleServicioTransporte--;	
		
		
		this.detalleserviciotransporteAux=new DetalleServicioTransporte();
		
		this.detalleserviciotransporteAux.setId(this.iIdNuevoDetalleServicioTransporte);
		this.detalleserviciotransporteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleserviciotransporteLogic.getDetalleServicioTransportes().add(this.detalleserviciotransporteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleserviciotransportes.add(this.detalleserviciotransporteAux);
		}
		//ARCHITECTURE
		
		this.detalleserviciotransporte=this.detalleserviciotransporteAux;
		
		if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleServicioTransporte(this.detalleserviciotransporte);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleServicioTransporte(this.detalleserviciotransporte);
		}
				
		//this.setDefaultControlesDetalleServicioTransporte();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleServicioTransporte();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleServicioTransporte();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleServicioTransporte();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporteBean,this.detalleserviciotransporte,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
			classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleserviciotransporteReturnGeneral=detalleserviciotransporteLogic.procesarEventosDetalleServicioTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleserviciotransporteLogic.getDetalleServicioTransportes(),this.detalleserviciotransporte,this.detalleserviciotransporteParameterGeneral,this.isEsNuevoDetalleServicioTransporte,classes);//this.detalleserviciotransporteLogic.getDetalleServicioTransporte()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleServicioTransporte(this.detalleserviciotransporteReturnGeneral,this.detalleserviciotransporteBean,false);
		
		if(this.detalleserviciotransporteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleServicioTransporte(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleServicioTransporte(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte());
		}
		
		if(this.detalleserviciotransporteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleServicioTransporte(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte(),classes);//this.detalleserviciotransporteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleServicioTransporte();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleServicioTransporte();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.RecargarFormDetalleServicioTransporte(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleServicioTransporte(false);
						
			if(detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleServicioTransporte();
			}
			
			this.actualizarVisualTableDatosDetalleServicioTransporte();
			
			this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(this.getIndiceNuevoDetalleServicioTransporte(), this.getIndiceNuevoDetalleServicioTransporte());
			
			this.seleccionarFilaTablaDetalleServicioTransporteActual();
						
			this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleServicioTransporte(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldcantidadDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarcantidadDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldprecioDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarprecioDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldtotalDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activartotalDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextAreadescripcionDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activardescripcionDetalleServicioTransporte);	
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarid_servicio_transporteDetalleServicioTransporte);//
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarid_empresaDetalleServicioTransporte);//
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarid_sucursalDetalleServicioTransporte);//
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarid_ejercicioDetalleServicioTransporte);//
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarid_periodoDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarid_bodegaDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarid_productoDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarid_unidadDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.setEnabled(isHabilitar && this.detalleserviciotransporteConstantesFunciones.activarid_centro_costoDetalleServicioTransporte);
	};
	
	public void setDefaultControlesDetalleServicioTransporte() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleServicioTransporte(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleserviciotransporteSessionBean.setConGuardarRelaciones(true);			
			this.detalleserviciotransporteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTabbedPaneRelacionesDetalleServicioTransporte.setVisible(true);
			
					
		} else {
			//this.detalleserviciotransporteSessionBean.setConGuardarRelaciones(false);			
			this.detalleserviciotransporteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTabbedPaneRelacionesDetalleServicioTransporte.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleServicioTransporte() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
				if(detalleserviciotransporteAux.getId().equals(this.iIdNuevoDetalleServicioTransporte)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransportes) {
				if(detalleserviciotransporteAux.getId().equals(this.iIdNuevoDetalleServicioTransporte)) {
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
	
	public int getIndiceActualDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
				if(detalleserviciotransporteAux.getId().equals(detalleserviciotransporte.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransportes) {
				if(detalleserviciotransporteAux.getId().equals(detalleserviciotransporte.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
				if(detalleserviciotransporteAux.getDetalleServicioTransporteOriginal().getId().equals(detalleserviciotransporteOriginal.getId())) {
					existe=true;
					detalleserviciotransporteOriginal.setId(detalleserviciotransporteAux.getId());
					detalleserviciotransporteOriginal.setVersionRow(detalleserviciotransporteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransportes) {
				if(detalleserviciotransporteAux.getDetalleServicioTransporteOriginal().getId().equals(detalleserviciotransporteOriginal.getId())) {
					existe=true;
					detalleserviciotransporteOriginal.setId(detalleserviciotransporteAux.getId());
					detalleserviciotransporteOriginal.setVersionRow(detalleserviciotransporteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleServicioTransporte(Boolean esParaCancelar) throws Exception {
		detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
		detalleserviciotransporteAux=new DetalleServicioTransporte();
		
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
					if(detalleserviciotransporteAux.getId()<0) {
						detalleserviciotransportesAux.add(detalleserviciotransporteAux);
					}		
				}
				this.iIdNuevoDetalleServicioTransporte=0L;
				this.detalleserviciotransporteLogic.getDetalleServicioTransportes().removeAll(detalleserviciotransportesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransportes) {
					if(detalleserviciotransporteAux.getId()<0) {
						detalleserviciotransportesAux.add(detalleserviciotransporteAux);
					}		
				}
				this.iIdNuevoDetalleServicioTransporte=0L;
				this.detalleserviciotransportes.removeAll(detalleserviciotransportesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleServicioTransporte 
					&& this.detalleserviciotransporteLogic.getDetalleServicioTransportes().size()>0
					) {
					detalleserviciotransporteAux=this.detalleserviciotransporteLogic.getDetalleServicioTransportes().get(this.detalleserviciotransporteLogic.getDetalleServicioTransportes().size() - 1);
				
					if(detalleserviciotransporteAux.getId()<0) {
						this.detalleserviciotransporteLogic.getDetalleServicioTransportes().remove(detalleserviciotransporteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleServicioTransporte && this.detalleserviciotransportes.size()>0) {
					detalleserviciotransporteAux=this.detalleserviciotransportes.get(this.detalleserviciotransportes.size() - 1);
				
					if(detalleserviciotransporteAux.getId()<0) {
						this.detalleserviciotransportes.remove(detalleserviciotransporteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleServicioTransporte(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleserviciotransporte.getId()<0) {
				this.detalleserviciotransporteLogic.getDetalleServicioTransportes().remove(this.detalleserviciotransporte);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleserviciotransporte.getId()<0) {
				this.detalleserviciotransportes.remove(this.detalleserviciotransporte);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleServicioTransporte(List<DetalleServicioTransporte> detalleserviciotransportesAux) throws Exception {
		DetalleServicioTransporteConstantesFunciones.setEstadosInicialesDetalleServicioTransporte(detalleserviciotransportesAux);
	}
	
	public void setEstadosInicialesDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporteAux) throws Exception {
		DetalleServicioTransporteConstantesFunciones.setEstadosInicialesDetalleServicioTransporte(detalleserviciotransporteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleServicioTransporteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleServicioTransporteActual()) {
				if(!this.isEsNuevoDetalleServicioTransporte) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleServicioTransporte=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleServicioTransporteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Servicio Transporte ?", "MANTENIMIENTO DE Detalle Servicio Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleServicioTransporte detalleserviciotransporte) throws Exception {
		DetalleServicioTransporteConstantesFunciones.seleccionarAsignar(this.detalleserviciotransporte,detalleserviciotransporte);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleServicioTransporte=this.isPermisoActualizarOriginalDetalleServicioTransporte;
			
			
			this.seleccionarAsignar(detalleserviciotransporte);
			
			

			idProductoActual=detalleserviciotransporte.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleServicioTransporteConstantesFunciones.quitarEspaciosDetalleServicioTransporte(this.detalleserviciotransporte,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleserviciotransporteSessionBean.setsFuncionBusquedaRapida(this.detalleserviciotransporteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarProductoActual() throws Exception {
		try	{
			Producto productoAux=new Producto();

			if(this.idProductoActual != null && this.idProductoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(this.idProductoActual);
					productoAux= productoLogic.getProducto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				productosForeignKey=new ArrayList<Producto>();
				productosForeignKey.add(productoAux);
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
			if(this.isEsNuevoDetalleServicioTransporte) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleServicioTransporte(esParaCancelar);				
				this.cancelarNuevoDetalleServicioTransporte(esParaCancelar);								
			}
			
			this.detalleserviciotransporte=new DetalleServicioTransporte();
			
			this.inicializarDetalleServicioTransporte();
			
			this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleServicioTransporte() throws Exception {
		try {
			DetalleServicioTransporteConstantesFunciones.inicializarDetalleServicioTransporte(this.detalleserviciotransporte);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleserviciotransporteLogic.getDetalleServicioTransportes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleServicioTransportes(String sAccionBusqueda,List<DetalleServicioTransporte> detalleserviciotransportesParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleServicioTransporte"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleServicioTransporteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleServicioTransporteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleServicioTransporte"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Servicio Transportes");		
		parameters.put("busquedapor", DetalleServicioTransporteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleServicioTransporte=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleServicioTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleServicioTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleServicioTransporte=new JRBeanArrayDataSource(DetalleServicioTransporteJInternalFrame.TraerDetalleServicioTransporteBeans(detalleserviciotransportesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleServicioTransporte);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleServicioTransporteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleServicioTransporteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleServicioTransporteBean.TraerDetalleServicioTransporteBeans(detalleserviciotransportesParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleServicioTransportes(sAccionBusqueda,sTipoArchivoReporte,detalleserviciotransportesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleServicioTransportes(sAccionBusqueda,sTipoArchivoReporte,detalleserviciotransportesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleServicioTransporteActionPerformed(null);
					//this.generarExcelReporteDetalleServicioTransportes(sAccionBusqueda,sTipoArchivoReporte,detalleserviciotransportesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleServicioTransportes(sAccionBusqueda,sTipoArchivoReporte,detalleserviciotransportesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleServicioTransportes(sAccionBusqueda,sTipoArchivoReporte,detalleserviciotransportesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleServicioTransportes(sAccionBusqueda,sTipoArchivoReporte,detalleserviciotransportesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleServicioTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleServicioTransporte> detalleserviciotransportesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserviciotransporte";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleServicioTransportes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleServicioTransporte("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleServicioTransporte detalleserviciotransporte : detalleserviciotransportesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleServicioTransporteConstantesFunciones.generarExcelReporteDataDetalleServicioTransporte("NORMAL",row,workbook,detalleserviciotransporte,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleServicioTransporte(String sTipo,Row row,Workbook workbook) {
		
		DetalleServicioTransporteConstantesFunciones.generarExcelReporteHeaderDetalleServicioTransporte(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleServicioTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleServicioTransporte> detalleserviciotransportesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserviciotransporte_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleServicioTransportes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleServicioTransporte detalleserviciotransporte : detalleserviciotransportesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleServicioTransporteConstantesFunciones.getDetalleServicioTransporteDescripcion(detalleserviciotransporte));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getserviciotransporte_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserviciotransporte.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleServicioTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleServicioTransporte> detalleserviciotransportesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleServicioTransporte> detalleserviciotransportesRespaldo=null;
		
		classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleserviciotransporteLogic.setDatosCliente(this.datosCliente);
		this.detalleserviciotransporteLogic.setDatosDeep(this.datosDeep);
		this.detalleserviciotransporteLogic.setIsConDeep(true);
		
		detalleserviciotransportesRespaldo=this.detalleserviciotransporteLogic.getDetalleServicioTransportes();
		
		this.detalleserviciotransporteLogic.setDetalleServicioTransportes(detalleserviciotransportesParaReportes);	
		this.detalleserviciotransporteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleserviciotransportesParaReportes=this.detalleserviciotransporteLogic.getDetalleServicioTransportes();
		this.detalleserviciotransporteLogic.setDetalleServicioTransportes(detalleserviciotransportesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserviciotransporte_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleServicioTransportes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleServicioTransporte("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleServicioTransporte detalleserviciotransporte : detalleserviciotransportesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleServicioTransporte("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleServicioTransporteConstantesFunciones.generarExcelReporteDataDetalleServicioTransporte("NORMAL",row,workbook,detalleserviciotransporte,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleServicioTransporteConstantesFunciones.getDetalleServicioTransporteDescripcion(detalleserviciotransporte));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleServicioTransporte() throws Exception {		
		this.startProcessDetalleServicioTransporte(true);
	}
	
	public void startProcessDetalleServicioTransporte(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleServicioTransporte ,this.jPanelParametrosReportesDetalleServicioTransporte, this.jScrollPanelDatosDetalleServicioTransporte,this.jPanelPaginacionDetalleServicioTransporte, this.jScrollPanelDatosEdicionDetalleServicioTransporte, this.jPanelAccionesDetalleServicioTransporte,this.jPanelAccionesFormularioDetalleServicioTransporte,this.jmenuBarDetalleServicioTransporte,this.jmenuBarDetalleDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,this.jTtoolBarDetalleDetalleServicioTransporte);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleServicioTransporte=this.jTabbedPaneBusquedasDetalleServicioTransporte; 
		
		final JPanel jPanelParametrosReportesDetalleServicioTransporte=this.jPanelParametrosReportesDetalleServicioTransporte;
		//final JScrollPane jScrollPanelDatosDetalleServicioTransporte=this.jScrollPanelDatosDetalleServicioTransporte;
		final JTable jTableDatosDetalleServicioTransporte=this.jTableDatosDetalleServicioTransporte;		
		final JPanel jPanelPaginacionDetalleServicioTransporte=this.jPanelPaginacionDetalleServicioTransporte;
		//final JScrollPane jScrollPanelDatosEdicionDetalleServicioTransporte=this.jScrollPanelDatosEdicionDetalleServicioTransporte;
		final JPanel jPanelAccionesDetalleServicioTransporte=this.jPanelAccionesDetalleServicioTransporte;
		
		JPanel jPanelCamposAuxiliarDetalleServicioTransporte=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleServicioTransporte=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			jPanelCamposAuxiliarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelCamposDetalleServicioTransporte;
			jPanelAccionesFormularioAuxiliarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelAccionesFormularioDetalleServicioTransporte;
		}
		
		final JPanel jPanelCamposDetalleServicioTransporte=jPanelCamposAuxiliarDetalleServicioTransporte;
		final JPanel jPanelAccionesFormularioDetalleServicioTransporte=jPanelAccionesFormularioAuxiliarDetalleServicioTransporte;
		
		
		final JMenuBar jmenuBarDetalleServicioTransporte=this.jmenuBarDetalleServicioTransporte;
		final JToolBar jTtoolBarDetalleServicioTransporte=this.jTtoolBarDetalleServicioTransporte;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleServicioTransporte=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleServicioTransporte=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			jmenuBarDetalleAuxiliarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jmenuBarDetalleDetalleServicioTransporte;
			jTtoolBarDetalleAuxiliarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jTtoolBarDetalleDetalleServicioTransporte;
		}
		
		final JMenuBar jmenuBarDetalleDetalleServicioTransporte=jmenuBarDetalleAuxiliarDetalleServicioTransporte;
		final JToolBar jTtoolBarDetalleDetalleServicioTransporte=jTtoolBarDetalleAuxiliarDetalleServicioTransporte;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleServicioTransporte;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleServicioTransporte;
			processRunnable.jTableDatos=jTableDatosDetalleServicioTransporte;
			processRunnable.jPanelCampos=jPanelCamposDetalleServicioTransporte;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleServicioTransporte;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleServicioTransporte;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleServicioTransporte;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleServicioTransporte;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleServicioTransporte;
			processRunnable.jTtoolBar=jTtoolBarDetalleServicioTransporte;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleServicioTransporte;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleServicioTransporte ,jPanelParametrosReportesDetalleServicioTransporte,jTableDatosDetalleServicioTransporte, /*jScrollPanelDatosDetalleServicioTransporte,*/jPanelCamposDetalleServicioTransporte,jPanelPaginacionDetalleServicioTransporte, /*jScrollPanelDatosEdicionDetalleServicioTransporte,*/ jPanelAccionesDetalleServicioTransporte,jPanelAccionesFormularioDetalleServicioTransporte,jmenuBarDetalleServicioTransporte,jmenuBarDetalleDetalleServicioTransporte,jTtoolBarDetalleServicioTransporte,jTtoolBarDetalleDetalleServicioTransporte);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleServicioTransporte ,jPanelParametrosReportesDetalleServicioTransporte, jScrollPanelDatosDetalleServicioTransporte,jPanelPaginacionDetalleServicioTransporte, jScrollPanelDatosEdicionDetalleServicioTransporte, jPanelAccionesDetalleServicioTransporte,jPanelAccionesFormularioDetalleServicioTransporte,jmenuBarDetalleServicioTransporte,jmenuBarDetalleDetalleServicioTransporte,jTtoolBarDetalleServicioTransporte,jTtoolBarDetalleDetalleServicioTransporte);
						
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
	
	public void finishProcessDetalleServicioTransporte() {// throws Exception 
		this.finishProcessDetalleServicioTransporte(true);
	}
	
	public void finishProcessDetalleServicioTransporte(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleServicioTransporte ,this.jPanelParametrosReportesDetalleServicioTransporte, this.jScrollPanelDatosDetalleServicioTransporte,this.jPanelPaginacionDetalleServicioTransporte, this.jScrollPanelDatosEdicionDetalleServicioTransporte, this.jPanelAccionesDetalleServicioTransporte,this.jPanelAccionesFormularioDetalleServicioTransporte,this.jmenuBarDetalleServicioTransporte,this.jmenuBarDetalleDetalleServicioTransporte,this.jTtoolBarDetalleServicioTransporte,this.jTtoolBarDetalleDetalleServicioTransporte);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleServicioTransporte=this.jTabbedPaneBusquedasDetalleServicioTransporte; 
		
		final JPanel jPanelParametrosReportesDetalleServicioTransporte=this.jPanelParametrosReportesDetalleServicioTransporte;
		//final JScrollPane jScrollPanelDatosDetalleServicioTransporte=this.jScrollPanelDatosDetalleServicioTransporte;
		final JTable jTableDatosDetalleServicioTransporte=this.jTableDatosDetalleServicioTransporte;		
		final JPanel jPanelPaginacionDetalleServicioTransporte=this.jPanelPaginacionDetalleServicioTransporte;
		//final JScrollPane jScrollPanelDatosEdicionDetalleServicioTransporte=this.jScrollPanelDatosEdicionDetalleServicioTransporte;
		final JPanel jPanelAccionesDetalleServicioTransporte=this.jPanelAccionesDetalleServicioTransporte;
		
		JPanel jPanelCamposAuxiliarDetalleServicioTransporte=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleServicioTransporte=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			jPanelCamposAuxiliarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelCamposDetalleServicioTransporte;
			jPanelAccionesFormularioAuxiliarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelAccionesFormularioDetalleServicioTransporte;
		}
		
		final JPanel jPanelCamposDetalleServicioTransporte=jPanelCamposAuxiliarDetalleServicioTransporte;
		final JPanel jPanelAccionesFormularioDetalleServicioTransporte=jPanelAccionesFormularioAuxiliarDetalleServicioTransporte;
		
		
		final JMenuBar jmenuBarDetalleServicioTransporte=this.jmenuBarDetalleServicioTransporte;		
		final JToolBar jTtoolBarDetalleServicioTransporte=this.jTtoolBarDetalleServicioTransporte;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleServicioTransporte=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleServicioTransporte=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			jmenuBarDetalleAuxiliarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jmenuBarDetalleDetalleServicioTransporte;
			jTtoolBarDetalleAuxiliarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jTtoolBarDetalleDetalleServicioTransporte;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleServicioTransporte=jmenuBarDetalleAuxiliarDetalleServicioTransporte;
		final JToolBar jTtoolBarDetalleDetalleServicioTransporte=jTtoolBarDetalleAuxiliarDetalleServicioTransporte;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleServicioTransporte;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleServicioTransporte;
			processRunnable.jTableDatos=jTableDatosDetalleServicioTransporte;
			processRunnable.jPanelCampos=jPanelCamposDetalleServicioTransporte;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleServicioTransporte;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleServicioTransporte;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleServicioTransporte;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleServicioTransporte;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleServicioTransporte;
			processRunnable.jTtoolBar=jTtoolBarDetalleServicioTransporte;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleServicioTransporte;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleServicioTransporte ,jPanelParametrosReportesDetalleServicioTransporte, jTableDatosDetalleServicioTransporte,/*jScrollPanelDatosDetalleServicioTransporte,*/jPanelCamposDetalleServicioTransporte,jPanelPaginacionDetalleServicioTransporte, /*jScrollPanelDatosEdicionDetalleServicioTransporte,*/ jPanelAccionesDetalleServicioTransporte,jPanelAccionesFormularioDetalleServicioTransporte,jmenuBarDetalleServicioTransporte,jmenuBarDetalleDetalleServicioTransporte,jTtoolBarDetalleServicioTransporte,jTtoolBarDetalleDetalleServicioTransporte));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleServicioTransporte(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleServicioTransporte(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleServicioTransporte(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleServicioTransporte(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleServicioTransporte,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleServicioTransporte,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleServicioTransporte(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleServicioTransporte,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleServicioTransporte,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleserviciotransporteConstantesFunciones.getsFinalQueryDetalleServicioTransporte();
		String  finalQueryPaginacionTodos=this.detalleserviciotransporteConstantesFunciones.getsFinalQueryDetalleServicioTransporte();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleServicioTransporteConstantesFunciones.getArrayColumnasGlobalesNoDetalleServicioTransporte(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleServicioTransporteConstantesFunciones.getArrayColumnasGlobalesDetalleServicioTransporte(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleServicioTransporteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleserviciotransportesEliminados= new ArrayList<DetalleServicioTransporte>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleServicioTransporte();
		
				///*DetalleServicioTransporteSessionBean*/this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			
			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
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
					this.iNumeroPaginacion=DetalleServicioTransporteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleServicioTransporteConstantesFunciones.getClassesForeignKeysOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleserviciotransporte."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleserviciotransportesAux= new ArrayList<DetalleServicioTransporte>();
			
				
			detalleserviciotransporteLogic.setDatosCliente(this.datosCliente);
			detalleserviciotransporteLogic.setDatosDeep(this.datosDeep);
			detalleserviciotransporteLogic.setIsConDeep(true);
			
			
			detalleserviciotransporteLogic.getDetalleServicioTransporteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleserviciotransporteLogic.getTodosDetalleServicioTransportes(finalQueryGlobal,pagination);
					
					//detalleserviciotransporteLogic.getTodosDetalleServicioTransportesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleserviciotransporteLogic.getDetalleServicioTransportes()==null|| detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleserviciotransportesAux= new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux= new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleserviciotransporteLogic.getTodosDetalleServicioTransportes(finalQueryGlobal+"",this.pagination);												
							
							//detalleserviciotransporteLogic.getTodosDetalleServicioTransportesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleServicioTransportes("Todos",detalleserviciotransporteLogic.getDetalleServicioTransportes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());					
							detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleServicioTransporte=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleServicioTransporte=this.idActual;
				
				} else if(this.idDetalleServicioTransporteActual!=null && this.idDetalleServicioTransporteActual!=0L) {
					idDetalleServicioTransporte=idDetalleServicioTransporteActual;
				}
				
					
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndicePorId(idDetalleServicioTransporte);
				
				this.detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleserviciotransporteLogic.getEntity(idDetalleServicioTransporte);
					
					//detalleserviciotransporteLogic.getEntityWithConnection(idDetalleServicioTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
					detalleserviciotransporteLogic.getDetalleServicioTransportes().add(detalleserviciotransporteLogic.getDetalleServicioTransporte());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
					this.detalleserviciotransportes.add(detalleserviciotransporte);
				}
				
				if(detalleserviciotransporteLogic.getDetalleServicioTransporte()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes()==null||detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserviciotransportes==null|| detalleserviciotransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
						detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleServicioTransportes("FK_IdBodega",detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleServicioTransportes("FK_IdBodega",detalleserviciotransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
						detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes()==null||detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserviciotransportes==null|| detalleserviciotransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
						detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleServicioTransportes("FK_IdCentroCosto",detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleServicioTransportes("FK_IdCentroCosto",detalleserviciotransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
						detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes()==null||detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserviciotransportes==null|| detalleserviciotransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
						detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleServicioTransportes("FK_IdEjercicio",detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleServicioTransportes("FK_IdEjercicio",detalleserviciotransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
						detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes()==null||detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserviciotransportes==null|| detalleserviciotransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
						detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleServicioTransportes("FK_IdEmpresa",detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleServicioTransportes("FK_IdEmpresa",detalleserviciotransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
						detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes()==null||detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserviciotransportes==null|| detalleserviciotransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
						detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleServicioTransportes("FK_IdPeriodo",detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleServicioTransportes("FK_IdPeriodo",detalleserviciotransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
						detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes()==null||detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserviciotransportes==null|| detalleserviciotransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
						detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleServicioTransportes("FK_IdProducto",detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleServicioTransportes("FK_IdProducto",detalleserviciotransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
						detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdServicioTransporte")) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdServicioTransporte(id_servicio_transporteFK_IdServicioTransporte);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdServicioTransporte(finalQueryGlobal,pagination,id_servicio_transporteFK_IdServicioTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdServicioTransporte(id_servicio_transporteFK_IdServicioTransporte);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdServicioTransporte(id_servicio_transporteFK_IdServicioTransporte);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes()==null||detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserviciotransportes==null|| detalleserviciotransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
						detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdServicioTransporte(finalQueryGlobal,pagination,id_servicio_transporteFK_IdServicioTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdServicioTransporte(id_servicio_transporteFK_IdServicioTransporte);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdServicioTransporte(id_servicio_transporteFK_IdServicioTransporte);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleServicioTransportes("FK_IdServicioTransporte",detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleServicioTransportes("FK_IdServicioTransporte",detalleserviciotransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
						detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes()==null||detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserviciotransportes==null|| detalleserviciotransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
						detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleServicioTransportes("FK_IdSucursal",detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleServicioTransportes("FK_IdSucursal",detalleserviciotransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
						detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes()==null||detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserviciotransportes==null|| detalleserviciotransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
						detalleserviciotransportesAux.addAll(detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportesAux=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportesAux.addAll(detalleserviciotransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleServicioTransporteConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleServicioTransportes("FK_IdUnidad",detalleserviciotransporteLogic.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleServicioTransportes("FK_IdUnidad",detalleserviciotransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteLogic.setDetalleServicioTransportes(new ArrayList<DetalleServicioTransporte>());
						detalleserviciotransporteLogic.getDetalleServicioTransportes().addAll(detalleserviciotransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransportes=new ArrayList<DetalleServicioTransporte>();
							detalleserviciotransportes.addAll(detalleserviciotransportesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleServicioTransporte();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleServicioTransporte();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleserviciotransporteLogic.getDetalleServicioTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleserviciotransportes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleserviciotransporteLogic.getDetalleServicioTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleserviciotransportes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleServicioTransporte detalleserviciotransporte) {
		Boolean permite=true;
		
		if(this.detalleserviciotransporte.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleServicioTransporteConstantesFunciones.getOrderByListaDetalleServicioTransporte();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleServicioTransporteConstantesFunciones.getOrderByListaDetalleServicioTransporte();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
				if(detalleserviciotransporte.getsType().equals(Constantes2.S_TOTALES)) {
					detalleserviciotransporteTotales=detalleserviciotransporte;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleServicioTransporte detalleserviciotransporte:this.detalleserviciotransportes) {
				if(detalleserviciotransporte.getsType().equals(Constantes2.S_TOTALES)) {
					detalleserviciotransporteTotales=detalleserviciotransporte;
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
			this.detalleserviciotransporteAux=new DetalleServicioTransporte();
			this.detalleserviciotransporteAux.setsType(Constantes2.S_TOTALES);
			this.detalleserviciotransporteAux.setIsNew(false);
			this.detalleserviciotransporteAux.setIsChanged(false);
			this.detalleserviciotransporteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleServicioTransporteConstantesFunciones.TotalizarValoresFilaDetalleServicioTransporte(this.detalleserviciotransporteLogic.getDetalleServicioTransportes(),this.detalleserviciotransporteAux);
				
				this.detalleserviciotransporteLogic.getDetalleServicioTransportes().add(this.detalleserviciotransporteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleServicioTransporteConstantesFunciones.TotalizarValoresFilaDetalleServicioTransporte(this.detalleserviciotransportes,this.detalleserviciotransporteAux);
				
				this.detalleserviciotransportes.add(this.detalleserviciotransporteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleserviciotransporteTotales=new DetalleServicioTransporte();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleserviciotransporteLogic.getDetalleServicioTransportes().remove(detalleserviciotransporteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleserviciotransportes.remove(detalleserviciotransporteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleserviciotransporteTotales=new DetalleServicioTransporte();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
				if(detalleserviciotransporte.getsType().equals(Constantes2.S_TOTALES)) {
					detalleserviciotransporteTotales=detalleserviciotransporte;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleServicioTransporteConstantesFunciones.TotalizarValoresFilaDetalleServicioTransporte(this.detalleserviciotransporteLogic.getDetalleServicioTransportes(),detalleserviciotransporteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleServicioTransporte detalleserviciotransporte:this.detalleserviciotransportes) {
				if(detalleserviciotransporte.getsType().equals(Constantes2.S_TOTALES)) {
					detalleserviciotransporteTotales=detalleserviciotransporte;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleServicioTransporteConstantesFunciones.TotalizarValoresFilaDetalleServicioTransporte(this.detalleserviciotransportes,detalleserviciotransporteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleServicioTransportesFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleServicioTransportesFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleServicioTransportesFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleServicioTransportesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleServicioTransportesFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleServicioTransportesFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleServicioTransportesFK_IdServicioTransporte()throws Exception {
		try {
			sAccionBusqueda="FK_IdServicioTransporte";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleServicioTransportesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleServicioTransportesFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleServicioTransportesFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleServicioTransportesFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleServicioTransportesFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleServicioTransportesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleServicioTransportesFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleServicioTransportesFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleServicioTransportesFK_IdServicioTransporte(String sFinalQuery,Long id_servicio_transporte)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdServicioTransporte(sFinalQuery,this.pagination,id_servicio_transporte);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleServicioTransportesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleServicioTransportesFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLogic.getDetalleServicioTransportesFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosDetalleServicioTransporte() {
		this.isPermisoTodoDetalleServicioTransporte=false;
		this.isPermisoNuevoDetalleServicioTransporte=false;
		this.isPermisoActualizarDetalleServicioTransporte=false;
		this.isPermisoActualizarOriginalDetalleServicioTransporte=false;
		this.isPermisoEliminarDetalleServicioTransporte=false;
		this.isPermisoGuardarCambiosDetalleServicioTransporte=false;
		this.isPermisoConsultaDetalleServicioTransporte=false;
		this.isPermisoBusquedaDetalleServicioTransporte=false;
		this.isPermisoReporteDetalleServicioTransporte=false;		
		this.isPermisoOrdenDetalleServicioTransporte=false;		
		this.isPermisoPaginacionMedioDetalleServicioTransporte=false;		
		this.isPermisoPaginacionAltoDetalleServicioTransporte=false;
		this.isPermisoPaginacionTodoDetalleServicioTransporte=false;
		this.isPermisoCopiarDetalleServicioTransporte=false;		
		this.isPermisoVerFormDetalleServicioTransporte=false;		
		this.isPermisoDuplicarDetalleServicioTransporte=false;		
		this.isPermisoOrdenDetalleServicioTransporte=false;		
	}
	
	public void setPermisosUsuarioDetalleServicioTransporte(Boolean isPermiso) {
		this.isPermisoTodoDetalleServicioTransporte=isPermiso;
		this.isPermisoNuevoDetalleServicioTransporte=isPermiso;
		this.isPermisoActualizarDetalleServicioTransporte=isPermiso;
		this.isPermisoActualizarOriginalDetalleServicioTransporte=isPermiso;
		this.isPermisoEliminarDetalleServicioTransporte=isPermiso;
		this.isPermisoGuardarCambiosDetalleServicioTransporte=isPermiso;
		this.isPermisoConsultaDetalleServicioTransporte=isPermiso;
		this.isPermisoBusquedaDetalleServicioTransporte=isPermiso;
		this.isPermisoReporteDetalleServicioTransporte=isPermiso;
		this.isPermisoOrdenDetalleServicioTransporte=isPermiso;		
		this.isPermisoPaginacionMedioDetalleServicioTransporte=isPermiso;		
		this.isPermisoPaginacionAltoDetalleServicioTransporte=isPermiso;		
		this.isPermisoPaginacionTodoDetalleServicioTransporte=isPermiso;		
		this.isPermisoCopiarDetalleServicioTransporte=isPermiso;		
		this.isPermisoVerFormDetalleServicioTransporte=isPermiso;		
		this.isPermisoDuplicarDetalleServicioTransporte=isPermiso;
		this.isPermisoOrdenDetalleServicioTransporte=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleServicioTransporte(Boolean isPermiso) {
		//this.isPermisoTodoDetalleServicioTransporte=isPermiso;
		this.isPermisoNuevoDetalleServicioTransporte=isPermiso;
		this.isPermisoActualizarDetalleServicioTransporte=isPermiso;
		this.isPermisoActualizarOriginalDetalleServicioTransporte=isPermiso;
		this.isPermisoEliminarDetalleServicioTransporte=isPermiso;
		this.isPermisoGuardarCambiosDetalleServicioTransporte=isPermiso;
		//this.isPermisoConsultaDetalleServicioTransporte=isPermiso;
		//this.isPermisoBusquedaDetalleServicioTransporte=isPermiso;
		//this.isPermisoReporteDetalleServicioTransporte=isPermiso;
		//this.isPermisoOrdenDetalleServicioTransporte=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleServicioTransporte=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleServicioTransporte=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleServicioTransporte=isPermiso;		
		//this.isPermisoCopiarDetalleServicioTransporte=isPermiso;		
		//this.isPermisoDuplicarDetalleServicioTransporte=isPermiso;
		//this.isPermisoOrdenDetalleServicioTransporte=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleServicioTransporteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleServicioTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleServicioTransporteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleServicioTransporteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleServicioTransporteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleServicioTransporteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleServicioTransporte() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleServicioTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleServicioTransporteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleServicioTransporte=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleServicioTransporte=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleServicioTransporte=this.isPermisoActualizarDetalleServicioTransporte;
			this.isPermisoEliminarDetalleServicioTransporte=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleServicioTransporte=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleServicioTransporte=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleServicioTransporte=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleServicioTransporte=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleServicioTransporte=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleServicioTransporte=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleServicioTransporte=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleServicioTransporte=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleServicioTransporte=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleServicioTransporte=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleServicioTransporte=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleServicioTransporte=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleServicioTransporte=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleServicioTransporte.setToolTipText(this.jTableDatosDetalleServicioTransporte.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleServicioTransporte(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleServicioTransporte(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleServicioTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleServicioTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleServicioTransporte() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleServicioTransporteListas()throws Exception {
		try	{						
			
				this.serviciotransportesForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleServicioTransporteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleServicioTransporteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleServicioTransporteListas(false);
			} else {
			
				this.cargarCombosForeignKeyServicioTransporteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyServicioTransporteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.serviciotransportesForeignKey==null||this.serviciotransportesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ServicioTransporteConstantesFunciones.getArrayColumnasGlobalesServicioTransporte(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ServicioTransporteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ServicioTransporteConstantesFunciones.SFINALQUERY;

				this.cargarCombosServicioTransportesForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleServicioTransporteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleServicioTransporteParameterReturnGeneral detalleserviciotransporteReturnGeneral=new DetalleServicioTransporteParameterReturnGeneral();
						
			


				String finalQueryGlobalServicioTransporte="";

				if(((this.serviciotransportesForeignKey==null||this.serviciotransportesForeignKey.size()<=0) && this.detalleserviciotransporteConstantesFunciones.cargarid_servicio_transporteDetalleServicioTransporte)
					 || (this.esRecargarFks && this.detalleserviciotransporteConstantesFunciones.cargarid_servicio_transporteDetalleServicioTransporte)) {

					if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionServicioTransporte()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ServicioTransporteConstantesFunciones.getArrayColumnasGlobalesServicioTransporte(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalServicioTransporte=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ServicioTransporteConstantesFunciones.TABLENAME);

						finalQueryGlobalServicioTransporte=Funciones.GetFinalQueryAppend(finalQueryGlobalServicioTransporte, "");
						finalQueryGlobalServicioTransporte+=ServicioTransporteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosServicioTransportesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalServicioTransporte=" WHERE " + ConstantesSql.ID + "="+detalleserviciotransporteSessionBean.getlidServicioTransporteActual();
					}
				} else {
					finalQueryGlobalServicioTransporte="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleserviciotransporteConstantesFunciones.cargarid_empresaDetalleServicioTransporte)
					 || (this.esRecargarFks && this.detalleserviciotransporteConstantesFunciones.cargarid_empresaDetalleServicioTransporte)) {

					if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleserviciotransporteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detalleserviciotransporteConstantesFunciones.cargarid_sucursalDetalleServicioTransporte)
					 || (this.esRecargarFks && this.detalleserviciotransporteConstantesFunciones.cargarid_sucursalDetalleServicioTransporte)) {

					if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detalleserviciotransporteSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.detalleserviciotransporteConstantesFunciones.cargarid_ejercicioDetalleServicioTransporte)
					 || (this.esRecargarFks && this.detalleserviciotransporteConstantesFunciones.cargarid_ejercicioDetalleServicioTransporte)) {

					if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+detalleserviciotransporteSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.detalleserviciotransporteConstantesFunciones.cargarid_periodoDetalleServicioTransporte)
					 || (this.esRecargarFks && this.detalleserviciotransporteConstantesFunciones.cargarid_periodoDetalleServicioTransporte)) {

					if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+detalleserviciotransporteSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.detalleserviciotransporteConstantesFunciones.cargarid_bodegaDetalleServicioTransporte)
					 || (this.esRecargarFks && this.detalleserviciotransporteConstantesFunciones.cargarid_bodegaDetalleServicioTransporte)) {

					if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+detalleserviciotransporteSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.detalleserviciotransporteConstantesFunciones.cargarid_productoDetalleServicioTransporte)
					 || (this.esRecargarFks && this.detalleserviciotransporteConstantesFunciones.cargarid_productoDetalleServicioTransporte)) {

					if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+detalleserviciotransporteSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.detalleserviciotransporteConstantesFunciones.cargarid_unidadDetalleServicioTransporte)
					 || (this.esRecargarFks && this.detalleserviciotransporteConstantesFunciones.cargarid_unidadDetalleServicioTransporte)) {

					if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+detalleserviciotransporteSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.detalleserviciotransporteConstantesFunciones.cargarid_centro_costoDetalleServicioTransporte)
					 || (this.esRecargarFks && this.detalleserviciotransporteConstantesFunciones.cargarid_centro_costoDetalleServicioTransporte)) {

					if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+detalleserviciotransporteSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleserviciotransporteReturnGeneral=detalleserviciotransporteLogic.cargarCombosLoteForeignKeyDetalleServicioTransporte(finalQueryGlobalServicioTransporte,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUnidad,finalQueryGlobalCentroCosto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalServicioTransporte.equals("NONE")) {
				this.serviciotransportesForeignKey=detalleserviciotransporteReturnGeneral.getserviciotransportesForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleserviciotransporteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detalleserviciotransporteReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=detalleserviciotransporteReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=detalleserviciotransporteReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=detalleserviciotransporteReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=detalleserviciotransporteReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=detalleserviciotransporteReturnGeneral.getunidadsForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=detalleserviciotransporteReturnGeneral.getcentrocostosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleServicioTransporte()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyServicioTransporte();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
			this.addItemDefectoCombosForeignKeyCentroCosto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyServicioTransporte()throws Exception {
		try {
			if(this.detalleserviciotransporteSessionBean==null) {
				this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionServicioTransporte()) {
				ServicioTransporte serviciotransporte=new ServicioTransporte();
				ServicioTransporteConstantesFunciones.setServicioTransporteDescripcion(serviciotransporte,Constantes.SMENSAJE_ESCOJA_OPCION);
				serviciotransporte.setId(null);

				if(!ServicioTransporteConstantesFunciones.ExisteEnLista(this.serviciotransportesForeignKey,serviciotransporte,true)) {

					this.serviciotransportesForeignKey.add(0,serviciotransporte);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				Producto producto=new Producto();
				ProductoConstantesFunciones.setProductoDescripcion(producto,Constantes.SMENSAJE_ESCOJA_OPCION);
				producto.setId(null);

				if(!ProductoConstantesFunciones.ExisteEnLista(this.productosForeignKey,producto,true)) {

					this.productosForeignKey.add(0,producto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				Unidad unidad=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidad.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadsForeignKey,unidad,true)) {

					this.unidadsForeignKey.add(0,unidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.detalleserviciotransporteSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleServicioTransporte()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleServicioTransporte(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyProducto(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyBodega(JComboBox jComboBoxBodegaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Bodega bodegaLocal=(Bodega)jComboBoxBodegaGenerico.getSelectedItem();

			if(bodegaLocal!=null  && bodegaLocal.getId()!=null  && bodegaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_bodega="+bodegaLocal.getId();
			}
			//REDEFINE
			sFinalQueryCombo=InventarioSql.GetQueryProductoFromBodega(bodegaLocal);

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboProducto=sFinalQueryCombo;

			this.productosForeignKey=new ArrayList<Producto>();
			this.cargarCombosForeignKeyProducto(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyProducto(JComboBox jComboBoxProductoGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Producto productoLocal=(Producto)jComboBoxProductoGenerico.getSelectedItem();

			if(productoLocal!=null  && productoLocal.getId()!=null  && productoLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_producto="+productoLocal.getId();
			}
			//REDEFINE
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.detalleserviciotransporte.getid_bodega());

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboUnidad=sFinalQueryCombo;

			this.unidadsForeignKey=new ArrayList<Unidad>();
			this.cargarCombosForeignKeyUnidad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyBodega(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.addItemListener(new ComboBoxItemListener(this,"id_bodegaDetalleServicioTransporte"));
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaDetalleServicioTransporte"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.addActionListener(new ComboBoxActionListener(this,"id_bodegaDetalleServicioTransporte"));
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaDetalleServicioTransporte"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte"));

						this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte"));

						this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.addItemListener(new ComboBoxItemListener(this,"id_productoDetalleServicioTransporte"));
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.addFocusListener(new ComboBoxFocusListener(this,"id_productoDetalleServicioTransporte"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.addActionListener(new ComboBoxActionListener(this,"id_productoDetalleServicioTransporte"));
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.addFocusListener(new ComboBoxFocusListener(this,"id_productoDetalleServicioTransporte"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_productoFK_IdProductoDetalleServicioTransporte"));

						this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoDetalleServicioTransporte"));

					} else {
						this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_productoFK_IdProductoDetalleServicioTransporte"));

						this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoDetalleServicioTransporte"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyDetalleServicioTransporte()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleServicioTransporte();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte)throws Exception {	
		try {
			
			this.setActualServicioTransporteForeignKey(detalleserviciotransporte.getid_servicio_transporte(),false,"Formulario");
			this.setActualBodegaForeignKey(detalleserviciotransporte.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(detalleserviciotransporte.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(detalleserviciotransporte.getid_unidad(),false,"Formulario");
			this.setActualCentroCostoForeignKey(detalleserviciotransporte.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detalleserviciotransporte.getProducto()!=null && !sTipoEvento.equals("id_productoDetalleServicioTransporte")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(detalleserviciotransporte.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleServicioTransporte()throws Exception {	
		try {
			
			this.setActualServicioTransporteForeignKey(this.detalleserviciotransporteConstantesFunciones.getid_servicio_transporte(),false,"Formulario");
			this.setActualBodegaForeignKey(this.detalleserviciotransporteConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.detalleserviciotransporteConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.detalleserviciotransporteConstantesFunciones.getid_unidad(),false,"Formulario");
			this.setActualCentroCostoForeignKey(this.detalleserviciotransporteConstantesFunciones.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleServicioTransporte()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleServicioTransporte()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleServicioTransporte()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleServicioTransporte()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleServicioTransporte()throws Exception {
		try {
			

			this.cargarCombosFrameServicioTransportesForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleServicioTransporte(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameServicioTransportesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleServicioTransporte()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	











	public void recargarFormDetalleServicioTransporteBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDetalleServicioTransporteid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormDetalleServicioTransporteProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDetalleServicioTransporteid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}




	
	



	public void recargarFormDetalleServicioTransporteid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.detalleserviciotransporte,jComboBoxGenericoProducto);
			}

			if(this.detalleserviciotransporte.getid_bodega()!=null && this.detalleserviciotransporte.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.detalleserviciotransporte.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.detalleserviciotransporte.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormDetalleServicioTransporteid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.detalleserviciotransporte,jComboBoxGenericoUnidad);
			}

			if(this.detalleserviciotransporte.getid_producto()!=null && this.detalleserviciotransporte.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.detalleserviciotransporte.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.detalleserviciotransporte.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public DetalleServicioTransporteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleServicioTransporteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleServicioTransporteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean(); 
		this.detalleserviciotransporteConstantesFunciones=new DetalleServicioTransporteConstantesFunciones(); 
		this.detalleserviciotransporteBean=new DetalleServicioTransporte();//(this.detalleserviciotransporteConstantesFunciones); 		
		this.detalleserviciotransporteReturnGeneral=new DetalleServicioTransporteParameterReturnGeneral(); 
		
		this.detalleserviciotransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleserviciotransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleServicioTransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleServicioTransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleServicioTransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleServicioTransporte(true);
			
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
			
			this.detalleserviciotransporteConstantesFunciones=new DetalleServicioTransporteConstantesFunciones(); 
			this.detalleserviciotransporteBean=new DetalleServicioTransporte();//this.detalleserviciotransporteConstantesFunciones); 			
			this.detalleserviciotransporteReturnGeneral=new DetalleServicioTransporteParameterReturnGeneral(); 
		
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Servicio Transporte Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalleserviciotransporte=new DetalleServicioTransporte();
			this.detalleserviciotransportes = new ArrayList<DetalleServicioTransporte>();
			this.detalleserviciotransportesAux = new ArrayList<DetalleServicioTransporte>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic=new DetalleServicioTransporteLogic();
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleserviciotransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleserviciotransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleServicioTransporte);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleServicioTransporte);	
					}
					
					if(this.jInternalFrameImportacionDetalleServicioTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleServicioTransporte);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleServicioTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleServicioTransporte);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleServicioTransporte);
				this.jInternalFrameDetalleFormDetalleServicioTransporte.setVisible(false);
				this.jInternalFrameDetalleFormDetalleServicioTransporte.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleServicioTransporte);
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleServicioTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleServicioTransporte);
					this.jInternalFrameImportacionDetalleServicioTransporte.setVisible(false);
					this.jInternalFrameImportacionDetalleServicioTransporte.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleServicioTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleServicioTransporte);
					this.jInternalFrameOrderByDetalleServicioTransporte.setVisible(false);
					this.jInternalFrameOrderByDetalleServicioTransporte.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleServicioTransporteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleServicioTransporteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleserviciotransporteReturnGeneral=new DetalleServicioTransporteParameterReturnGeneral();
			
			this.detalleserviciotransporteParameterGeneral=new DetalleServicioTransporteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleserviciotransporteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleServicioTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleServicioTransporteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),this.detalleserviciotransporteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleServicioTransporteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),this.detalleserviciotransporteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=false;
			this.isVisibilidadCeldaDuplicarDetalleServicioTransporte=true;
			this.isVisibilidadCeldaCopiarDetalleServicioTransporte=true;
			this.isVisibilidadCeldaVerFormDetalleServicioTransporte=true;
			this.isVisibilidadCeldaOrdenDetalleServicioTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdServicioTransporte=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleServicioTransporte();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleServicioTransporte(false);
			
			this.setPermisosUsuarioDetalleServicioTransporte();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado() && this.detalleserviciotransporteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleServicioTransporteClasesRelacionadas();
			}
			
			if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleServicioTransporteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleServicioTransporte();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleServicioTransporte();
			}
			
			if(!this.isPermisoBusquedaDetalleServicioTransporte) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleServicioTransporte,this.isPermisoPaginacionMedioDetalleServicioTransporte,this.isPermisoPaginacionTodoDetalleServicioTransporte);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleServicioTransporteConstantesFunciones.getTiposSeleccionarDetalleServicioTransporte());
				
				this.tiposColumnasSelect=DetalleServicioTransporteConstantesFunciones.getTiposSeleccionarDetalleServicioTransporte(true);
				
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
			//if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleServicioTransporte();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleServicioTransporte(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleServicioTransporte(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleServicioTransporte() ;
			
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
			
			this.serviciotransporteLogic=new ServicioTransporteLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.unidadLogic=new UnidadLogic();
			this.centrocostoLogic=new CentroCostoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalleserviciotransporteImplementable= (DetalleServicioTransporteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleServicioTransporteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleserviciotransporteImplementableHome= (DetalleServicioTransporteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleServicioTransporteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleserviciotransportes= new ArrayList<DetalleServicioTransporte>();
			this.detalleserviciotransportesEliminados= new ArrayList<DetalleServicioTransporte>();
						
			this.isEsNuevoDetalleServicioTransporte=false;
			this.esParaAccionDesdeFormularioDetalleServicioTransporte=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.serviciotransportesForeignKey=new ArrayList<ServicioTransporte>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleServicioTransporte(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleServicioTransporte();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleServicioTransporteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleServicioTransporte(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleServicioTransporte();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleServicioTransporte();
			}
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleServicioTransporte.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleServicioTransporte.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleServicioTransporte.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleServicioTransporte(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleServicioTransporte: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleServicioTransporte() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleServicioTransporte")) {
				iIndex=this.jInternalFrameDetalleFormDetalleServicioTransporte.jTabbedPaneRelacionesDetalleServicioTransporte.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleServicioTransporte.jTabbedPaneRelacionesDetalleServicioTransporte.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleServicioTransporte();	
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
	
	public void cargarCombosForeignKeyDetalleServicioTransporte(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleServicioTransporte(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleServicioTransporte(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleServicioTransporteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleServicioTransporte();
		
		this.cargarCombosFrameForeignKeyDetalleServicioTransporte();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleServicioTransporte();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleServicioTransporte();
		}
	}
	
	

	public void cargarCombosForeignKeyServicioTransporte(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyServicioTransporteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyServicioTransporte();
				this.cargarCombosFrameServicioTransportesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaServicioTransporte(this.serviciotransportesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyBodega("Todos");
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleServicioTransporteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
			
			if(jTableDatosDetalleServicioTransporte.getRowCount()>=1) {
				jTableDatosDetalleServicioTransporte.removeRowSelectionInterval(0, jTableDatosDetalleServicioTransporte.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleServicioTransporte=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleServicioTransporte(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleServicioTransporte(true);			
			//this.detalleserviciotransporte=new DetalleServicioTransporte();
			//this.detalleserviciotransporte.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleServicioTransporte(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleServicioTransporte() ;
			
			if(DetalleServicioTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleServicioTransporte(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleserviciotransporte);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);				
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
			if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleServicioTransporte: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleServicioTransporteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleServicioTransporte.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleServicioTransporte.getSelectedRows().length;			
			}
			
			detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleServicioTransporte--;			
				//DetalleServicioTransporte detalleserviciotransporteAux= new DetalleServicioTransporte();			
				//detalleserviciotransporteAux.setId(this.iIdNuevoDetalleServicioTransporte);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleServicioTransporte detalleserviciotransporteOrigen=new DetalleServicioTransporte();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleServicioTransporte detalleserviciotransporteOrigen : detalleserviciotransportesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleserviciotransporteOrigen =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserviciotransporteOrigen =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleServicioTransporte();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleserviciotransporte.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleServicioTransporte(detalleserviciotransporteOrigen,this.detalleserviciotransporte,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleserviciotransporteLogic.getDetalleServicioTransportes().add(this.detalleserviciotransporteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransportes.add(this.detalleserviciotransporteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
				
				this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(this.getIndiceNuevoDetalleServicioTransporte(), this.getIndiceNuevoDetalleServicioTransporte());
				
				int iLastRow =  this.jTableDatosDetalleServicioTransporte.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleServicioTransporte.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleServicioTransporte.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();									
		
			DetalleServicioTransporte detalleserviciotransporteOrigen=new DetalleServicioTransporte();
			DetalleServicioTransporte detalleserviciotransporteDestino=new DetalleServicioTransporte();
				
			detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleServicioTransporte.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleserviciotransportesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleServicioTransporte.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteOrigen =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleserviciotransporteOrigen =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserviciotransporteDestino =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleserviciotransporteDestino =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleserviciotransporteOrigen =detalleserviciotransportesSeleccionados.get(0);
				detalleserviciotransporteDestino =detalleserviciotransportesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleServicioTransporte(detalleserviciotransporteOrigen,detalleserviciotransporteDestino,true,false);
				
				detalleserviciotransporteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleserviciotransporteDestino,detalleserviciotransporteLogic.getDetalleServicioTransportes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleserviciotransporteDestino,detalleserviciotransportes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
				
				//this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(this.getIndiceNuevoDetalleServicioTransporte(), this.getIndiceNuevoDetalleServicioTransporte());
				
				int iLastRow =  this.jTableDatosDetalleServicioTransporte.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleServicioTransporte.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleServicioTransporte.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleServicioTransporte.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleServicioTransporte.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(!isVisible);
			this.jPanelPaginacionDetalleServicioTransporte.setVisible(!isVisible);
			this.jPanelAccionesDetalleServicioTransporte.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleServicioTransporte();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleServicioTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleServicioTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleServicioTransporte();
			
			this.abrirFrameOrderByDetalleServicioTransporte();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleServicioTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleServicioTransporte(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleServicioTransporte);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleServicioTransporte.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleServicioTransporte.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleServicioTransporte.setSize(this.jInternalFrameDetalleFormDetalleServicioTransporte.iWidthFormulario,this.jInternalFrameDetalleFormDetalleServicioTransporte.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleServicioTransporte.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleServicioTransporte.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleServicioTransporte.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jContentPaneDetalleDetalleServicioTransporte.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleServicioTransporte.jTabbedPaneRelacionesDetalleServicioTransporte.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleServicioTransporte.jContentPaneDetalleDetalleServicioTransporte.getWidth(),DetalleServicioTransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleServicioTransporte.jTabbedPaneRelacionesDetalleServicioTransporte.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleServicioTransporte.jContentPaneDetalleDetalleServicioTransporte.getWidth(),DetalleServicioTransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleServicioTransporte.jTabbedPaneRelacionesDetalleServicioTransporte.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleServicioTransporte.jContentPaneDetalleDetalleServicioTransporte.getWidth(),DetalleServicioTransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleServicioTransporte.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleServicioTransporte.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleServicioTransporte() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleServicioTransporte==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleServicioTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleServicioTransporte,false,this);
				} else {
					this.jInternalFrameOrderByDetalleServicioTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleServicioTransporte,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleServicioTransporte);
				this.jInternalFrameOrderByDetalleServicioTransporte.setVisible(false);
				this.jInternalFrameOrderByDetalleServicioTransporte.setSelected(false);
				
				this.jInternalFrameOrderByDetalleServicioTransporte.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleServicioTransporte"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleServicioTransporte();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleServicioTransporte() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleServicioTransporte==null) {
				
				this.jInternalFrameImportacionDetalleServicioTransporte=new ImportacionJInternalFrame(DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleServicioTransporte);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleServicioTransporte);
				this.jInternalFrameImportacionDetalleServicioTransporte.setVisible(false);
				this.jInternalFrameImportacionDetalleServicioTransporte.setSelected(false);


				this.jInternalFrameImportacionDetalleServicioTransporte.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleServicioTransporte"));
				this.jInternalFrameImportacionDetalleServicioTransporte.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleServicioTransporte"));
				this.jInternalFrameImportacionDetalleServicioTransporte.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleServicioTransporte"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleServicioTransporte() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte==null) {
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte=new ReporteDinamicoJInternalFrame(DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleServicioTransporte);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleServicioTransporte);
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleServicioTransporte"));
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleServicioTransporte"));
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleServicioTransporte"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleServicioTransporte();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleServicioTransporte() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleServicioTransporte);
			
	       	this.jInternalFrameDetalleFormDetalleServicioTransporte.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleServicioTransporte.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleServicioTransporte.dispose();
			//this.jInternalFrameDetalleFormDetalleServicioTransporte=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleServicioTransporte() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleServicioTransporte() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleServicioTransporte.setVisible(true);
	        this.jInternalFrameImportacionDetalleServicioTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleServicioTransporte() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleServicioTransporte.setVisible(true);
	        this.jInternalFrameOrderByDetalleServicioTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleServicioTransporte() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleServicioTransporte.setVisible(false);
	        this.jInternalFrameOrderByDetalleServicioTransporte.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleServicioTransporte() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleServicioTransporte() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleServicioTransporte.setVisible(false);
	        this.jInternalFrameImportacionDetalleServicioTransporte.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleServicioTransporte(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleServicioTransporte(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleServicioTransporte(true);
			//this.isEsNuevoDetalleServicioTransporte=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleServicioTransporte(false) ;
			
			if(detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleServicioTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleServicioTransporte(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleServicioTransporte(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleServicioTransporteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleServicioTransporte(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleServicioTransporte(true);
			//this.isEsNuevoDetalleServicioTransporte=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleserviciotransporte.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleServicioTransporte(false) ;
			
			if(DetalleServicioTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleServicioTransporte(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleServicioTransporte(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.detalleserviciotransporteConstantesFunciones.cargarid_productoDetalleServicioTransporte) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaServicioTransporte(List<ServicioTransporte> serviciotransportesForeignKey)throws Exception{
		TableColumn tableColumnServicioTransporte=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE));
		TableCellEditor tableCellEditorServicioTransporte =tableColumnServicioTransporte.getCellEditor();

		ServicioTransporteTableCell serviciotransporteTableCellFk=(ServicioTransporteTableCell)tableCellEditorServicioTransporte;

		if(serviciotransporteTableCellFk!=null) {
			serviciotransporteTableCellFk.setserviciotransportesForeignKey(serviciotransportesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleServicioTransporte.getSelectedRow();

		//if(intSelectedRow<=0) {
			//serviciotransporteTableCellFk.setRowActual(intSelectedRow);
			//serviciotransporteTableCellFk.setserviciotransportesForeignKeyActual(serviciotransportesForeignKey);
		//}


		if(serviciotransporteTableCellFk!=null) {
			serviciotransporteTableCellFk.RecargarServicioTransportesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
					
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleServicioTransporte.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleServicioTransporte.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleServicioTransporte.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleServicioTransporte.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleServicioTransporte(false);
			
			//if(!this.isEsNuevoDetalleServicioTransporte) {								
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				
			}
			
			if(this.permiteMantenimiento(this.detalleserviciotransporte)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleServicioTransporte=true;
					this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
					this.isEsNuevoDetalleServicioTransporte=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleServicioTransporte=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleServicioTransporte=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleServicioTransporte(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleServicioTransporte(false);
				
				this.habilitarDeshabilitarControlesDetalleServicioTransporte(false);
			
												
				
				if(DetalleServicioTransporteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleServicioTransporte();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleServicioTransporteActionPerformed(evt,detalleserviciotransporteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleServicioTransporte(this.detalleserviciotransporte,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleserviciotransporteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleserviciotransporte.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				this.detalleserviciotransporte.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				this.detalleserviciotransporte.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleserviciotransporte)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleServicioTransporteModel) this.jTableDatosDetalleServicioTransporte.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleServicioTransporte=true;
				this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
				this.isEsNuevoDetalleServicioTransporte=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleServicioTransporte(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleServicioTransporte(false);
				
				this.habilitarDeshabilitarControlesDetalleServicioTransporte(false);
				
				
				
				if(DetalleServicioTransporteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleServicioTransporte();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleServicioTransporte.getRowCount()>=1) {
				jTableDatosDetalleServicioTransporte.removeRowSelectionInterval(0, jTableDatosDetalleServicioTransporte.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleServicioTransporte(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleServicioTransporte(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleServicioTransporte(false) ;
			
			this.isEsNuevoDetalleServicioTransporte=false;
			
			if(DetalleServicioTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleServicioTransporte();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleServicioTransporte(false);
				
				//SI ES MANUAL
				if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleServicioTransporte();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleServicioTransporte--;			
			//DetalleServicioTransporte detalleserviciotransporteAux= new DetalleServicioTransporte();			
			//detalleserviciotransporteAux.setId(this.iIdNuevoDetalleServicioTransporte);
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleServicioTransporte();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
			
			this.detalleserviciotransporte.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleserviciotransporteLogic.getDetalleServicioTransportes().add(this.detalleserviciotransporteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleserviciotransportes.add(this.detalleserviciotransporteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
			
			this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(this.getIndiceNuevoDetalleServicioTransporte(), this.getIndiceNuevoDetalleServicioTransporte());
			
			int iLastRow =  this.jTableDatosDetalleServicioTransporte.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleServicioTransporte.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleServicioTransporte.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleServicioTransporte(false);
			
			//SI ES MANUAL
			if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleServicioTransporte();
			}
			
			//this.abrirFrameTreeDetalleServicioTransporte();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Servicio TransporteS ?", "MANTENIMIENTO DE Detalle Servicio Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleServicioTransporte.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleServicioTransporte();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleserviciotransporteReturnGeneral=detalleserviciotransporteLogic.procesarImportacionDetalleServicioTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleserviciotransporteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleServicioTransporteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleServicioTransporte.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleServicioTransporte.setFileImportacion(this.jInternalFrameImportacionDetalleServicioTransporte.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleServicioTransporte.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleServicioTransporte.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleServicioTransporte.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleServicioTransporte.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();		

		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleServicioTransporteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleServicioTransporteBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleServicioTransportes("Todos",detalleserviciotransportesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ServicioTransporte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ServicioTransporte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ServicioTransporte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ServicioTransporte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE:
					sNombreCampoCategoria="id_servicio_transporte";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE:
					sNombreCampoCategoriaValor="id_servicio_transporte";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Servicio Transporte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_servicio_transporte");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();		
		
		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserviciotransporte";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleServicioTransportes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getserviciotransporte_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleServicioTransporte detalleserviciotransporte:detalleserviciotransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserviciotransporte.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDetalleServicioTransporte(row);				
			//	iRow++;
			//}				
			
			//for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleServicioTransporte(detalleserviciotransporteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleServicioTransporte(false);
			
			//SI ES MANUAL
			if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleServicioTransporte();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleServicioTransporte(false);
			
			//SI ES MANUAL
			if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleServicioTransporte();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleServicioTransporte(false);
			
			//SI ES MANUAL
			if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleServicioTransporte();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleServicioTransporte() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleServicioTransporte.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleServicioTransporte.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleServicioTransporte.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleServicioTransporte.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleServicioTransporte.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleServicioTransporte.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleServicioTransporte.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleServicioTransporte(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleServicioTransporte(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleServicioTransporte(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleServicioTransporte(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleServicioTransporte(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleServicioTransporte(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleServicioTransporte(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleServicioTransporte(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleServicioTransporte() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleServicioTransporte();
		
		this.inicializarActualizarBindingBotonesManualDetalleServicioTransporte(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleServicioTransporte();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleServicioTransporte() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleServicioTransporte(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleServicioTransporte(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleServicioTransporte.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleServicioTransporte.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleServicioTransporte.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleServicioTransporte.jCheckBoxPostAccionNuevoDetalleServicioTransporte.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleServicioTransporte.jCheckBoxPostAccionSinCerrarDetalleServicioTransporte.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleServicioTransporte.jCheckBoxPostAccionSinMensajeDetalleServicioTransporte.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleServicioTransporte.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleServicioTransporte.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleServicioTransporte.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jCheckBoxPostAccionNuevoDetalleServicioTransporte.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jCheckBoxPostAccionSinCerrarDetalleServicioTransporte.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jCheckBoxPostAccionSinMensajeDetalleServicioTransporte.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleServicioTransporte.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleServicioTransporte.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleServicioTransporte.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleServicioTransporte.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleServicioTransporte.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleServicioTransporte.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleServicioTransporte.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleServicioTransporte.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleServicioTransporte(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleServicioTransporte(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleServicioTransporte() throws Exception {
		try	{
			if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleServicioTransporte();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleServicioTransporte() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleServicioTransporte() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleServicioTransporte.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleServicioTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleServicioTransporte.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleServicioTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleServicioTransporte.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleServicioTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleServicioTransporte.addItem(reporte);
			}
			
			
			if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleServicioTransporte.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleServicioTransporte.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleServicioTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleServicioTransporte.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleServicioTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleServicioTransporte.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleServicioTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleServicioTransporte.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleServicioTransporte.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleServicioTransporte();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleServicioTransporte() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte!=null) {
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte!=null) {
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleServicioTransporteConstantesFunciones.getTiposSeleccionarDetalleServicioTransporte(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleServicioTransporteConstantesFunciones.getTiposSeleccionarDetalleServicioTransporte(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleServicioTransporteConstantesFunciones.getTiposSeleccionarDetalleServicioTransporte(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleServicioTransporte()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte.getSelectedItem()).getId();}
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleServicioTransporte.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoDetalleServicioTransporte.getSelectedItem()).getId();}
		if(this.jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.getSelectedItem()!=null){this.id_servicio_transporteFK_IdServicioTransporte=((ServicioTransporte)this.jComboBoxid_servicio_transporteFK_IdServicioTransporteDetalleServicioTransporte.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadDetalleServicioTransporte.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleServicioTransporte(Boolean esInicializar) throws Exception {				
		if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleServicioTransporte();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleServicioTransporte() throws Exception {
		this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleServicioTransporte() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleServicioTransporteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleServicioTransporte(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleserviciotransporteLogic.getDetalleServicioTransportes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleserviciotransportes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleServicioTransporte.setModel(new DetalleServicioTransporteModel(this.detalleserviciotransporteLogic.getDetalleServicioTransportes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleServicioTransporte.setModel(new DetalleServicioTransporteModel(this.detalleserviciotransportes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleServicioTransporte!=null && this.jInternalFrameOrderByDetalleServicioTransporte.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleServicioTransporte();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO,detalleserviciotransporteConstantesFunciones.resaltarSeleccionarDetalleServicioTransporte,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleServicioTransporteConstantesFunciones.SCLASSWEBTITULO,detalleserviciotransporteConstantesFunciones.resaltarSeleccionarDetalleServicioTransporte,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_ID));

		if(this.detalleserviciotransporteConstantesFunciones.mostraridDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleserviciotransporteConstantesFunciones.resaltaridDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activaridDetalleServicioTransporte,iSizeTabla,this,true,"idDetalleServicioTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleserviciotransporteConstantesFunciones.resaltaridDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activaridDetalleServicioTransporte,this,true,"idDetalleServicioTransporte","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarid_servicio_transporteDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ServicioTransporteTableCell(this.serviciotransportesForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_servicio_transporteDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_servicio_transporteDetalleServicioTransporte,iSizeTabla));
			tableColumn.setCellEditor(new ServicioTransporteTableCell(this.serviciotransportesForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_servicio_transporteDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_servicio_transporteDetalleServicioTransporte,true,"id_servicio_transporteDetalleServicioTransporte","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarid_empresaDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_empresaDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_empresaDetalleServicioTransporte,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_empresaDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_empresaDetalleServicioTransporte,false,"id_empresaDetalleServicioTransporte","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarid_sucursalDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_sucursalDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_sucursalDetalleServicioTransporte,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_sucursalDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_sucursalDetalleServicioTransporte,false,"id_sucursalDetalleServicioTransporte","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarid_ejercicioDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_ejercicioDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_ejercicioDetalleServicioTransporte,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_ejercicioDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_ejercicioDetalleServicioTransporte,false,"id_ejercicioDetalleServicioTransporte","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarid_periodoDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_periodoDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_periodoDetalleServicioTransporte,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_periodoDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_periodoDetalleServicioTransporte,false,"id_periodoDetalleServicioTransporte","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarid_bodegaDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_bodegaDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_bodegaDetalleServicioTransporte,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_bodegaDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_bodegaDetalleServicioTransporte,true,"id_bodegaDetalleServicioTransporte","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarid_productoDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_productoDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_productoDetalleServicioTransporte,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_productoDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_productoDetalleServicioTransporte,true,"id_productoDetalleServicioTransporte","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarid_unidadDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_unidadDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_unidadDetalleServicioTransporte,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_unidadDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_unidadDetalleServicioTransporte,true,"id_unidadDetalleServicioTransporte","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarid_centro_costoDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_centro_costoDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_centro_costoDetalleServicioTransporte,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.detalleserviciotransporteConstantesFunciones.resaltarid_centro_costoDetalleServicioTransporte,this,this.detalleserviciotransporteConstantesFunciones.activarid_centro_costoDetalleServicioTransporte,true,"id_centro_costoDetalleServicioTransporte","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarcantidadDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleserviciotransporteConstantesFunciones.resaltarcantidadDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activarcantidadDetalleServicioTransporte,iSizeTabla,this,true,"cantidadDetalleServicioTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleserviciotransporteConstantesFunciones.resaltarcantidadDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activarcantidadDetalleServicioTransporte,this,true,"cantidadDetalleServicioTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO));

		if(this.detalleserviciotransporteConstantesFunciones.mostrarprecioDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleserviciotransporteConstantesFunciones.resaltarprecioDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activarprecioDetalleServicioTransporte,iSizeTabla,this,true,"precioDetalleServicioTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleserviciotransporteConstantesFunciones.resaltarprecioDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activarprecioDetalleServicioTransporte,this,true,"precioDetalleServicioTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL));

		if(this.detalleserviciotransporteConstantesFunciones.mostrartotalDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleserviciotransporteConstantesFunciones.resaltartotalDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activartotalDetalleServicioTransporte,iSizeTabla,this,true,"totalDetalleServicioTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleserviciotransporteConstantesFunciones.resaltartotalDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activartotalDetalleServicioTransporte,this,true,"totalDetalleServicioTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detalleserviciotransporteConstantesFunciones.mostrardescripcionDetalleServicioTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleserviciotransporteConstantesFunciones.resaltardescripcionDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activardescripcionDetalleServicioTransporte,iSizeTabla,this,true,"descripcionDetalleServicioTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleserviciotransporteConstantesFunciones.resaltardescripcionDetalleServicioTransporte,this.detalleserviciotransporteConstantesFunciones.activardescripcionDetalleServicioTransporte,this,true,"descripcionDetalleServicioTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleServicioTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleServicioTransporte.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleServicioTransporte.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleServicioTransporte.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleServicioTransporte.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleServicioTransporte.moveColumn(this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleServicioTransporte.moveColumn(this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleServicioTransporte.moveColumn(this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleServicioTransporte.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleServicioTransporte.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleServicioTransporte,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleServicioTransporte.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleServicioTransporte.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleServicioTransporte.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleserviciotransporteLogic.getDetalleServicioTransportes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleserviciotransportes.size()-1;
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
		//this.jTableDatosDetalleServicioTransporte.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleServicioTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleServicioTransporte();
			
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
				
				//this.isEsNuevoDetalleServicioTransporte=false;
					
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
				if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleServicioTransporte.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleServicioTransporte.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleserviciotransporte.getsType().equals("DUPLICADO")
				   || this.detalleserviciotransporte.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleServicioTransporte=true;
				
				} else {
					this.isEsNuevoDetalleServicioTransporte=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleserviciotransporte.getId()>=0 && !this.detalleserviciotransporte.getIsNew()) {						
						this.isEsNuevoDetalleServicioTransporte=false;
						
					} else {
						this.isEsNuevoDetalleServicioTransporte=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleServicioTransporte(esRelaciones);						
				
				this.seleccionarDetalleServicioTransporte(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleserviciotransporte.getId()<0) {
					this.isEsNuevoDetalleServicioTransporte=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleServicioTransporte(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleServicioTransporte(evt,rowIndex);
				}	
				
				if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleServicioTransporte: " + this.dDif); 
					}
				}								
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleServicioTransporte(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleserviciotransporte)) {
					if(this.detalleserviciotransporte.getId()>0) {
						this.detalleserviciotransporte.setIsDeleted(true);
						
						this.detalleserviciotransportesEliminados.add(this.detalleserviciotransporte);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleserviciotransporteLogic.getDetalleServicioTransportes().remove(this.detalleserviciotransporte);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransportes.remove(this.detalleserviciotransporte);				
					}
					
					
					((DetalleServicioTransporteModel) this.jTableDatosDetalleServicioTransporte.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleServicioTransporte(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleServicioTransporte) {
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleServicioTransporte.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleServicioTransporte.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleServicioTransporte(this.detalleserviciotransporte);
				}
				
				//ARCHITECTURE
				try {
					

					//ServicioTransporte
					if(!this.detalleserviciotransporteConstantesFunciones.cargarid_servicio_transporteDetalleServicioTransporte || this.detalleserviciotransporteConstantesFunciones.event_dependid_servicio_transporteDetalleServicioTransporte) {
						//this.cargarCombosServicioTransportesForeignKeyLista(" where id="+this.detalleserviciotransporte.getid_servicio_transporte());
									//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
						this.serviciotransportesForeignKey=new ArrayList<ServicioTransporte>();

						if(detalleserviciotransporte.getServicioTransporte()!=null) {
							this.serviciotransportesForeignKey.add(detalleserviciotransporte.getServicioTransporte());
						}

						this.addItemDefectoCombosForeignKeyServicioTransporte();
						this.cargarCombosFrameServicioTransportesForeignKey("Todos");
					}
					this.setActualServicioTransporteForeignKey(this.detalleserviciotransporte.getid_servicio_transporte(),false,"Formulario");

					//Empresa
					if(!this.detalleserviciotransporteConstantesFunciones.cargarid_empresaDetalleServicioTransporte || this.detalleserviciotransporteConstantesFunciones.event_dependid_empresaDetalleServicioTransporte) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleserviciotransporte.getid_empresa());
									//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleserviciotransporte.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleserviciotransporte.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleserviciotransporte.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detalleserviciotransporteConstantesFunciones.cargarid_sucursalDetalleServicioTransporte || this.detalleserviciotransporteConstantesFunciones.event_dependid_sucursalDetalleServicioTransporte) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detalleserviciotransporte.getid_sucursal());
									//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detalleserviciotransporte.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detalleserviciotransporte.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detalleserviciotransporte.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.detalleserviciotransporteConstantesFunciones.cargarid_ejercicioDetalleServicioTransporte || this.detalleserviciotransporteConstantesFunciones.event_dependid_ejercicioDetalleServicioTransporte) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.detalleserviciotransporte.getid_ejercicio());
									//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(detalleserviciotransporte.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(detalleserviciotransporte.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.detalleserviciotransporte.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.detalleserviciotransporteConstantesFunciones.cargarid_periodoDetalleServicioTransporte || this.detalleserviciotransporteConstantesFunciones.event_dependid_periodoDetalleServicioTransporte) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.detalleserviciotransporte.getid_periodo());
									//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(detalleserviciotransporte.getPeriodo()!=null) {
							this.periodosForeignKey.add(detalleserviciotransporte.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.detalleserviciotransporte.getid_periodo(),false,"Formulario");

					//Bodega
					if(!this.detalleserviciotransporteConstantesFunciones.cargarid_bodegaDetalleServicioTransporte || this.detalleserviciotransporteConstantesFunciones.event_dependid_bodegaDetalleServicioTransporte) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.detalleserviciotransporte.getid_bodega());
									//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(detalleserviciotransporte.getBodega()!=null) {
							this.bodegasForeignKey.add(detalleserviciotransporte.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.detalleserviciotransporte.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.detalleserviciotransporteConstantesFunciones.cargarid_productoDetalleServicioTransporte || this.detalleserviciotransporteConstantesFunciones.event_dependid_productoDetalleServicioTransporte) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.detalleserviciotransporte.getid_producto());
									//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(detalleserviciotransporte.getProducto()!=null) {
							this.productosForeignKey.add(detalleserviciotransporte.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.detalleserviciotransporte.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.detalleserviciotransporteConstantesFunciones.cargarid_unidadDetalleServicioTransporte || this.detalleserviciotransporteConstantesFunciones.event_dependid_unidadDetalleServicioTransporte) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.detalleserviciotransporte.getid_unidad());
									//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(detalleserviciotransporte.getUnidad()!=null) {
							this.unidadsForeignKey.add(detalleserviciotransporte.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.detalleserviciotransporte.getid_unidad(),false,"Formulario");

					//CentroCosto
					if(!this.detalleserviciotransporteConstantesFunciones.cargarid_centro_costoDetalleServicioTransporte || this.detalleserviciotransporteConstantesFunciones.event_dependid_centro_costoDetalleServicioTransporte) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.detalleserviciotransporte.getid_centro_costo());
									//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(detalleserviciotransporte.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(detalleserviciotransporte.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.detalleserviciotransporte.getid_centro_costo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleServicioTransporte("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleServicioTransporte(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleServicioTransporte() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleServicioTransporte(detalleserviciotransporte,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleServicioTransporte(detalleserviciotransporte);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleServicioTransporte(detalleserviciotransporte,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleServicioTransporte(detalleserviciotransporte);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.setText(detalleserviciotransporte.getId().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldcantidadDetalleServicioTransporte.setText(detalleserviciotransporte.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldprecioDetalleServicioTransporte.setText(detalleserviciotransporte.getprecio().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldtotalDetalleServicioTransporte.setText(detalleserviciotransporte.gettotal().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextAreadescripcionDetalleServicioTransporte.setText(detalleserviciotransporte.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleServicioTransporte detalleserviciotransporteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleserviciotransporteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleServicioTransporte detalleserviciotransporteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleserviciotransporteLocal=this.detalleserviciotransporte;
			} else {
				detalleserviciotransporteLocal=this.detalleserviciotransporteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleserviciotransporteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleServicioTransporte(detalleserviciotransporteLocal,true);
					
					if(detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleserviciotransporteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleserviciotransporteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(detalleserviciotransporte,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(detalleserviciotransporte);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(detalleserviciotransporte,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.getText()==null || this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.getText()=="" || this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.setText("0");
			}

			if(conColumnasBase) {detalleserviciotransporte.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleServicioTransporteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelIdDetalleServicioTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleserviciotransporte.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldcantidadDetalleServicioTransporte.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelcantidadDetalleServicioTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleserviciotransporte.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldprecioDetalleServicioTransporte.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelprecioDetalleServicioTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleserviciotransporte.settotal(Double.parseDouble(this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldtotalDetalleServicioTransporte.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabeltotalDetalleServicioTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleserviciotransporte.setdescripcion(this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextAreadescripcionDetalleServicioTransporte.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabeldescripcionDetalleServicioTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporteBean,DetalleServicioTransporte detalleserviciotransporte,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleserviciotransporteBean.getid_servicio_transporte()!=null && !detalleserviciotransporteBean.getid_servicio_transporte().equals(-1L))) {detalleserviciotransporte.setid_servicio_transporte(detalleserviciotransporteBean.getid_servicio_transporte());}
			if(conDefault || (!conDefault && detalleserviciotransporteBean.getid_bodega()!=null && !detalleserviciotransporteBean.getid_bodega().equals(-1L))) {detalleserviciotransporte.setid_bodega(detalleserviciotransporteBean.getid_bodega());}
			if(conDefault || (!conDefault && detalleserviciotransporteBean.getid_producto()!=null && !detalleserviciotransporteBean.getid_producto().equals(-1L))) {detalleserviciotransporte.setid_producto(detalleserviciotransporteBean.getid_producto());}
			if(conDefault || (!conDefault && detalleserviciotransporteBean.getid_unidad()!=null && !detalleserviciotransporteBean.getid_unidad().equals(-1L))) {detalleserviciotransporte.setid_unidad(detalleserviciotransporteBean.getid_unidad());}
			if(conDefault || (!conDefault && detalleserviciotransporteBean.getid_centro_costo()!=null && !detalleserviciotransporteBean.getid_centro_costo().equals(null))) {detalleserviciotransporte.setid_centro_costo(detalleserviciotransporteBean.getid_centro_costo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporteOrigen,DetalleServicioTransporte detalleserviciotransporte,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleserviciotransporteOrigen.getId()!=null && !detalleserviciotransporteOrigen.getId().equals(0L))) {detalleserviciotransporte.setId(detalleserviciotransporteOrigen.getId());}}
			if(conDefault || (!conDefault && detalleserviciotransporteOrigen.getid_servicio_transporte()!=null && !detalleserviciotransporteOrigen.getid_servicio_transporte().equals(-1L))) {detalleserviciotransporte.setid_servicio_transporte(detalleserviciotransporteOrigen.getid_servicio_transporte());}
			if(conDefault || (!conDefault && detalleserviciotransporteOrigen.getid_bodega()!=null && !detalleserviciotransporteOrigen.getid_bodega().equals(-1L))) {detalleserviciotransporte.setid_bodega(detalleserviciotransporteOrigen.getid_bodega());}
			if(conDefault || (!conDefault && detalleserviciotransporteOrigen.getid_producto()!=null && !detalleserviciotransporteOrigen.getid_producto().equals(-1L))) {detalleserviciotransporte.setid_producto(detalleserviciotransporteOrigen.getid_producto());}
			if(conDefault || (!conDefault && detalleserviciotransporteOrigen.getid_unidad()!=null && !detalleserviciotransporteOrigen.getid_unidad().equals(-1L))) {detalleserviciotransporte.setid_unidad(detalleserviciotransporteOrigen.getid_unidad());}
			if(conDefault || (!conDefault && detalleserviciotransporteOrigen.getid_centro_costo()!=null && !detalleserviciotransporteOrigen.getid_centro_costo().equals(null))) {detalleserviciotransporte.setid_centro_costo(detalleserviciotransporteOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && detalleserviciotransporteOrigen.getcantidad()!=null && !detalleserviciotransporteOrigen.getcantidad().equals(0))) {detalleserviciotransporte.setcantidad(detalleserviciotransporteOrigen.getcantidad());}
			if(conDefault || (!conDefault && detalleserviciotransporteOrigen.getprecio()!=null && !detalleserviciotransporteOrigen.getprecio().equals(0.0))) {detalleserviciotransporte.setprecio(detalleserviciotransporteOrigen.getprecio());}
			if(conDefault || (!conDefault && detalleserviciotransporteOrigen.gettotal()!=null && !detalleserviciotransporteOrigen.gettotal().equals(0.0))) {detalleserviciotransporte.settotal(detalleserviciotransporteOrigen.gettotal());}
			if(conDefault || (!conDefault && detalleserviciotransporteOrigen.getdescripcion()!=null && !detalleserviciotransporteOrigen.getdescripcion().equals(""))) {detalleserviciotransporte.setdescripcion(detalleserviciotransporteOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.setText(detalleserviciotransporte.getId().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldcantidadDetalleServicioTransporte.setText(detalleserviciotransporte.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldprecioDetalleServicioTransporte.setText(detalleserviciotransporte.getprecio().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldtotalDetalleServicioTransporte.setText(detalleserviciotransporte.gettotal().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextAreadescripcionDetalleServicioTransporte.setText(detalleserviciotransporte.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleServicioTransporte(DetalleServicioTransporteBean detalleserviciotransporteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.setText(detalleserviciotransporteBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldcantidadDetalleServicioTransporte.setText(detalleserviciotransporteBean.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldprecioDetalleServicioTransporte.setText(detalleserviciotransporteBean.getprecio().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldtotalDetalleServicioTransporte.setText(detalleserviciotransporteBean.gettotal().toString());
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextAreadescripcionDetalleServicioTransporte.setText(detalleserviciotransporteBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleServicioTransporte(DetalleServicioTransporteParameterReturnGeneral detalleserviciotransporteReturnGeneral,DetalleServicioTransporteBean detalleserviciotransporteBean,Boolean conDefault) throws Exception { 
		try {
			DetalleServicioTransporte detalleserviciotransporteLocal=new DetalleServicioTransporte();
			
			detalleserviciotransporteLocal=detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleserviciotransporteLocal.getId()!=null && !detalleserviciotransporteLocal.getId().equals(0L))) {detalleserviciotransporteBean.setId(detalleserviciotransporteLocal.getId());}}
			if(conDefault || (!conDefault && detalleserviciotransporteLocal.getid_servicio_transporte()!=null && !detalleserviciotransporteLocal.getid_servicio_transporte().equals(-1L))) {detalleserviciotransporteBean.setid_servicio_transporte(detalleserviciotransporteLocal.getid_servicio_transporte());}
			if(conDefault || (!conDefault && detalleserviciotransporteLocal.getid_bodega()!=null && !detalleserviciotransporteLocal.getid_bodega().equals(-1L))) {detalleserviciotransporteBean.setid_bodega(detalleserviciotransporteLocal.getid_bodega());}
			if(conDefault || (!conDefault && detalleserviciotransporteLocal.getid_producto()!=null && !detalleserviciotransporteLocal.getid_producto().equals(-1L))) {detalleserviciotransporteBean.setid_producto(detalleserviciotransporteLocal.getid_producto());}
			if(conDefault || (!conDefault && detalleserviciotransporteLocal.getid_unidad()!=null && !detalleserviciotransporteLocal.getid_unidad().equals(-1L))) {detalleserviciotransporteBean.setid_unidad(detalleserviciotransporteLocal.getid_unidad());}
			if(conDefault || (!conDefault && detalleserviciotransporteLocal.getid_centro_costo()!=null && !detalleserviciotransporteLocal.getid_centro_costo().equals(null))) {detalleserviciotransporteBean.setid_centro_costo(detalleserviciotransporteLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && detalleserviciotransporteLocal.getcantidad()!=null && !detalleserviciotransporteLocal.getcantidad().equals(0))) {detalleserviciotransporteBean.setcantidad(detalleserviciotransporteLocal.getcantidad());}
			if(conDefault || (!conDefault && detalleserviciotransporteLocal.getprecio()!=null && !detalleserviciotransporteLocal.getprecio().equals(0.0))) {detalleserviciotransporteBean.setprecio(detalleserviciotransporteLocal.getprecio());}
			if(conDefault || (!conDefault && detalleserviciotransporteLocal.gettotal()!=null && !detalleserviciotransporteLocal.gettotal().equals(0.0))) {detalleserviciotransporteBean.settotal(detalleserviciotransporteLocal.gettotal());}
			if(conDefault || (!conDefault && detalleserviciotransporteLocal.getdescripcion()!=null && !detalleserviciotransporteLocal.getdescripcion().equals(""))) {detalleserviciotransporteBean.setdescripcion(detalleserviciotransporteLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleServicioTransporteGenerico(Long idDetalleServicioTransporteSeleccionado,JComboBox jComboBoxDetalleServicioTransporte,List<DetalleServicioTransporte> detalleserviciotransportesLocal)throws Exception {
		try {
			DetalleServicioTransporte  detalleserviciotransporteTemp=null;

			for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportesLocal) {
				if(detalleserviciotransporteAux.getId()!=null && detalleserviciotransporteAux.getId().equals(idDetalleServicioTransporteSeleccionado)) {
					detalleserviciotransporteTemp=detalleserviciotransporteAux;
					break;
				}
			}

			jComboBoxDetalleServicioTransporte.setSelectedItem(detalleserviciotransporteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleServicioTransporteGenerico(JComboBox jComboBoxDetalleServicioTransporte,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleServicioTransporte.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleServicioTransporte.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleServicioTransporte.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleServicioTransporte.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleServicioTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleServicioTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleserviciotransporte=(DetalleServicioTransporte) detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleserviciotransporte =(DetalleServicioTransporte) detalleserviciotransportes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("ServicioTransporte")) {
			//sDescripcion=this.getActualServicioTransporteForeignKeyDescripcion((Long)value);
			if(!detalleserviciotransporte.getIsNew() && !detalleserviciotransporte.getIsChanged() && !detalleserviciotransporte.getIsDeleted()) {
				sDescripcion=detalleserviciotransporte.getserviciotransporte_descripcion();
			} else {
				//sDescripcion=this.getActualServicioTransporteForeignKeyDescripcion((Long)value);
				sDescripcion=detalleserviciotransporte.getserviciotransporte_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleserviciotransporte.getIsNew() && !detalleserviciotransporte.getIsChanged() && !detalleserviciotransporte.getIsDeleted()) {
				sDescripcion=detalleserviciotransporte.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleserviciotransporte.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detalleserviciotransporte.getIsNew() && !detalleserviciotransporte.getIsChanged() && !detalleserviciotransporte.getIsDeleted()) {
				sDescripcion=detalleserviciotransporte.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detalleserviciotransporte.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detalleserviciotransporte.getIsNew() && !detalleserviciotransporte.getIsChanged() && !detalleserviciotransporte.getIsDeleted()) {
				sDescripcion=detalleserviciotransporte.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detalleserviciotransporte.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!detalleserviciotransporte.getIsNew() && !detalleserviciotransporte.getIsChanged() && !detalleserviciotransporte.getIsDeleted()) {
				sDescripcion=detalleserviciotransporte.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleserviciotransporte.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!detalleserviciotransporte.getIsNew() && !detalleserviciotransporte.getIsChanged() && !detalleserviciotransporte.getIsDeleted()) {
				sDescripcion=detalleserviciotransporte.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleserviciotransporte.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!detalleserviciotransporte.getIsNew() && !detalleserviciotransporte.getIsChanged() && !detalleserviciotransporte.getIsDeleted()) {
				sDescripcion=detalleserviciotransporte.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=detalleserviciotransporte.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!detalleserviciotransporte.getIsNew() && !detalleserviciotransporte.getIsChanged() && !detalleserviciotransporte.getIsDeleted()) {
				sDescripcion=detalleserviciotransporte.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=detalleserviciotransporte.getunidad_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!detalleserviciotransporte.getIsNew() && !detalleserviciotransporte.getIsChanged() && !detalleserviciotransporte.getIsDeleted()) {
				sDescripcion=detalleserviciotransporte.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleserviciotransporte.getcentrocosto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleServicioTransporte detalleserviciotransporteRow=new DetalleServicioTransporte();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleserviciotransporteRow=(DetalleServicioTransporte) detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleserviciotransporteRow=(DetalleServicioTransporte) detalleserviciotransportes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleServicioTransporte(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaNuevoDetalleServicioTransporte && this.isPermisoNuevoDetalleServicioTransporte));			
			this.jButtonDuplicarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaDuplicarDetalleServicioTransporte && this.isPermisoDuplicarDetalleServicioTransporte));			
			this.jButtonCopiarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaCopiarDetalleServicioTransporte && this.isPermisoCopiarDetalleServicioTransporte));
			this.jButtonVerFormDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaVerFormDetalleServicioTransporte && this.isPermisoVerFormDetalleServicioTransporte));
			
			this.jButtonAbrirOrderByDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaOrdenDetalleServicioTransporte && this.isPermisoOrdenDetalleServicioTransporte));			
			
			this.jButtonNuevoRelacionesDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte && this.isPermisoNuevoDetalleServicioTransporte));			
			this.jButtonNuevoGuardarCambiosDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaNuevoDetalleServicioTransporte && this.isPermisoNuevoDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonModificarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaModificarDetalleServicioTransporte && this.isPermisoActualizarDetalleServicioTransporte));	
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaActualizarDetalleServicioTransporte && this.isPermisoActualizarDetalleServicioTransporte));	
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaEliminarDetalleServicioTransporte && this.isPermisoEliminarDetalleServicioTransporte));
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarDetalleServicioTransporte.setVisible(this.isVisibilidadCeldaCancelarDetalleServicioTransporte);							
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaGuardarDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaNuevoDetalleServicioTransporte && this.isPermisoNuevoDetalleServicioTransporte));						
			this.jButtonDuplicarToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaDuplicarDetalleServicioTransporte && this.isPermisoDuplicarDetalleServicioTransporte));						
			this.jButtonCopiarToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaCopiarDetalleServicioTransporte && this.isPermisoCopiarDetalleServicioTransporte));			
			this.jButtonVerFormToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaVerFormDetalleServicioTransporte && this.isPermisoVerFormDetalleServicioTransporte));			
			this.jButtonAbrirOrderByToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaOrdenDetalleServicioTransporte && this.isPermisoOrdenDetalleServicioTransporte));
			this.jButtonNuevoRelacionesToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte && this.isPermisoNuevoDetalleServicioTransporte));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaNuevoDetalleServicioTransporte && this.isPermisoNuevoDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));			
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonModificarToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaModificarDetalleServicioTransporte && this.isPermisoActualizarDetalleServicioTransporte));	
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaActualizarDetalleServicioTransporte  && this.isPermisoActualizarDetalleServicioTransporte));	
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaEliminarDetalleServicioTransporte && this.isPermisoEliminarDetalleServicioTransporte));
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarToolBarDetalleServicioTransporte.setVisible(this.isVisibilidadCeldaCancelarDetalleServicioTransporte);				
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaGuardarDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaNuevoDetalleServicioTransporte && this.isPermisoNuevoDetalleServicioTransporte));			
			this.jMenuItemDuplicarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaDuplicarDetalleServicioTransporte && this.isPermisoDuplicarDetalleServicioTransporte));			
			this.jMenuItemCopiarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaCopiarDetalleServicioTransporte && this.isPermisoCopiarDetalleServicioTransporte));			
			this.jMenuItemVerFormDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaVerFormDetalleServicioTransporte && this.isPermisoVerFormDetalleServicioTransporte));			
			this.jMenuItemAbrirOrderByDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaOrdenDetalleServicioTransporte && this.isPermisoOrdenDetalleServicioTransporte));			
			//this.jMenuItemMostrarOcultarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaOrdenDetalleServicioTransporte && this.isPermisoOrdenDetalleServicioTransporte));
			this.jMenuItemDetalleAbrirOrderByDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaOrdenDetalleServicioTransporte && this.isPermisoOrdenDetalleServicioTransporte));			
			//this.jMenuItemDetalleMostrarOcultarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaOrdenDetalleServicioTransporte && this.isPermisoOrdenDetalleServicioTransporte));			
			this.jMenuItemNuevoRelacionesDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte && this.isPermisoNuevoDetalleServicioTransporte));			
			this.jMenuItemNuevoGuardarCambiosDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaNuevoDetalleServicioTransporte && this.isPermisoNuevoDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));									
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemModificarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaModificarDetalleServicioTransporte && this.isPermisoActualizarDetalleServicioTransporte));	
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemActualizarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaActualizarDetalleServicioTransporte && this.isPermisoActualizarDetalleServicioTransporte));	
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemEliminarDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaEliminarDetalleServicioTransporte && this.isPermisoEliminarDetalleServicioTransporte));
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemCancelarDetalleServicioTransporte.setVisible(this.isVisibilidadCeldaCancelarDetalleServicioTransporte);				
			}
			
			this.jMenuItemGuardarCambiosDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaGuardarDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));						
			this.jMenuItemGuardarCambiosTablaDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=this.jButtonNuevoDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleServicioTransporte=this.jButtonDuplicarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaCopiarDetalleServicioTransporte=this.jButtonCopiarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaVerFormDetalleServicioTransporte=this.jButtonVerFormDetalleServicioTransporte.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleServicioTransporte=this.jButtonAbrirOrderByDetalleServicioTransporte.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=this.jButtonNuevoRelacionesDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=this.jButtonModificarDetalleServicioTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaGuardarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosDetalleServicioTransporte.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=this.jButtonGuardarCambiosTablaDetalleServicioTransporte.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=this.jButtonNuevoToolBarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=this.jButtonNuevoRelacionesToolBarDetalleServicioTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonModificarToolBarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarToolBarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarToolBarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarToolBarDetalleServicioTransporte.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleServicioTransporte=this.jButtonGuardarCambiosToolBarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=this.jButtonGuardarCambiosTablaToolBarDetalleServicioTransporte.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=this.jMenuItemNuevoDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=this.jMenuItemNuevoRelacionesDetalleServicioTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemModificarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemActualizarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemEliminarDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemCancelarDetalleServicioTransporte.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleServicioTransporte=this.jMenuItemGuardarCambiosDetalleServicioTransporte.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=this.jMenuItemGuardarCambiosTablaDetalleServicioTransporte.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleServicioTransporte(Boolean esInicializar) {
		if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleServicioTransporte();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleServicioTransporte(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleServicioTransporte() {
		this.jButtonNuevoDetalleServicioTransporte.setVisible(this.isPermisoNuevoDetalleServicioTransporte);			
		this.jButtonDuplicarDetalleServicioTransporte.setVisible(this.isPermisoDuplicarDetalleServicioTransporte);			
		this.jButtonCopiarDetalleServicioTransporte.setVisible(this.isPermisoCopiarDetalleServicioTransporte);			
		this.jButtonVerFormDetalleServicioTransporte.setVisible(this.isPermisoVerFormDetalleServicioTransporte);			
		
		this.jButtonAbrirOrderByDetalleServicioTransporte.setVisible(this.isPermisoOrdenDetalleServicioTransporte);					
		
		this.jButtonNuevoRelacionesDetalleServicioTransporte.setVisible(this.isPermisoNuevoDetalleServicioTransporte);			
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonModificarDetalleServicioTransporte.setVisible(this.isPermisoActualizarDetalleServicioTransporte);	
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarDetalleServicioTransporte.setVisible(this.isPermisoActualizarDetalleServicioTransporte);	
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarDetalleServicioTransporte.setVisible(this.isPermisoEliminarDetalleServicioTransporte);
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarDetalleServicioTransporte.setVisible(this.isVisibilidadCeldaCancelarDetalleServicioTransporte);						
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosDetalleServicioTransporte.setVisible(this.isPermisoGuardarCambiosDetalleServicioTransporte);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte.setVisible(this.isPermisoActualizarDetalleServicioTransporte);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleServicioTransporte() {
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonModificarDetalleServicioTransporte.setVisible(this.isPermisoActualizarDetalleServicioTransporte);	
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarDetalleServicioTransporte.setVisible(this.isPermisoActualizarDetalleServicioTransporte);	
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarDetalleServicioTransporte.setVisible(this.isPermisoEliminarDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarDetalleServicioTransporte.setVisible(this.isVisibilidadCeldaCancelarDetalleServicioTransporte);							
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosDetalleServicioTransporte.setVisible((this.isVisibilidadCeldaGuardarDetalleServicioTransporte && this.isPermisoGuardarCambiosDetalleServicioTransporte));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleServicioTransporte() {
		if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleServicioTransporte();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleServicioTransporte() {
	}
	
	public void jTableDatosDetalleServicioTransporteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleServicioTransporte(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleserviciotransporte.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_servicio_transporteDetalleServicioTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoserviciotransporte=true;

			idTienePermisoserviciotransporte=this.tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(ServicioTransporteConstantesFunciones.CLASSNAME);

			if(idTienePermisoserviciotransporte) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleServicioTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);

				this.serviciotransporteBeanSwingJInternalFrame=new ServicioTransporteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.serviciotransporteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.serviciotransporteBeanSwingJInternalFrame.getServicioTransporteLogic().setConnexion(this.detalleserviciotransporteLogic.getConnexion());

				if(this.detalleserviciotransporte.getid_servicio_transporte()!=null) {
					this.serviciotransporteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.serviciotransporteBeanSwingJInternalFrame.setIdActual(this.detalleserviciotransporte.getid_servicio_transporte());
					this.serviciotransporteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.serviciotransporteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.serviciotransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioTransporte();
				}

				JInternalFrameBase jinternalFrame =this.serviciotransporteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				TitledBorder titledBorderserviciotransporte=(TitledBorder)this.serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.getBorder();

				titledBorderserviciotransporte.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Servicio Transporte");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_servicio_transporteDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getid_servicio_transporte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_servicio_transporte = "+this.detalleserviciotransporte.getid_servicio_transporte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleServicioTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleServicioTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleserviciotransporteLogic.getConnexion());

				if(this.detalleserviciotransporte.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleserviciotransporte.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleserviciotransporte.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleServicioTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleServicioTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detalleserviciotransporteLogic.getConnexion());

				if(this.detalleserviciotransporte.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detalleserviciotransporte.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detalleserviciotransporte.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetalleServicioTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleServicioTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detalleserviciotransporteLogic.getConnexion());

				if(this.detalleserviciotransporte.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detalleserviciotransporte.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detalleserviciotransporte.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoDetalleServicioTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleServicioTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.detalleserviciotransporteLogic.getConnexion());

				if(this.detalleserviciotransporte.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.detalleserviciotransporte.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.detalleserviciotransporte.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDetalleServicioTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleServicioTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.detalleserviciotransporteLogic.getConnexion());

				if(this.detalleserviciotransporte.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.detalleserviciotransporte.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.detalleserviciotransporte.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDetalleServicioTransporteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.productoBeanSwingJInternalFrame.sTipoBusqueda="Producto";

			if(!this.sFinalQueryGeneral_producto.equals("")) {
				this.productoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_producto);
				this.productoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.productoBeanSwingJInternalFrame.procesarBusqueda(this.productoBeanSwingJInternalFrame.sAccionBusqueda);
				this.productoBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}

			if(!this.sFinalQueryComboProducto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleServicioTransporte=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosDetalleServicioTransporte.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoDetalleServicioTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleServicioTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.detalleserviciotransporteLogic.getConnexion());

				if(this.detalleserviciotransporte.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.detalleserviciotransporte.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.detalleserviciotransporte.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadDetalleServicioTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleServicioTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.detalleserviciotransporteLogic.getConnexion());

				if(this.detalleserviciotransporte.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.detalleserviciotransporte.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.detalleserviciotransporte.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoDetalleServicioTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebDetalleServicioTransporte(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleServicioTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleServicioTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.detalleserviciotransporteLogic.getConnexion());

				if(this.detalleserviciotransporte.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.detalleserviciotransporte.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleServicioTransporte=(TitledBorder)this.jScrollPanelDatosDetalleServicioTransporte.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderDetalleServicioTransporte.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.detalleserviciotransporte.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.detalleserviciotransporte.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.detalleserviciotransporte.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.detalleserviciotransporte.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleServicioTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.getdetalleserviciotransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserviciotransporte==null) {
						this.detalleserviciotransporte = new DetalleServicioTransporte();
					}

					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);
				}

				if(this.detalleserviciotransporte.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detalleserviciotransporte.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleServicioTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);

			this.getDetalleServicioTransportesFK_IdBodega();

			this.inicializarActualizarBindingDetalleServicioTransporte(false);

			//if(DetalleServicioTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCentroCostoDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);

			this.getDetalleServicioTransportesFK_IdCentroCosto();

			this.inicializarActualizarBindingDetalleServicioTransporte(false);

			//if(DetalleServicioTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);

			this.getDetalleServicioTransportesFK_IdEjercicio();

			this.inicializarActualizarBindingDetalleServicioTransporte(false);

			//if(DetalleServicioTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);

			this.getDetalleServicioTransportesFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleServicioTransporte(false);

			//if(DetalleServicioTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);

			this.getDetalleServicioTransportesFK_IdPeriodo();

			this.inicializarActualizarBindingDetalleServicioTransporte(false);

			//if(DetalleServicioTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);

			this.getDetalleServicioTransportesFK_IdProducto();

			this.inicializarActualizarBindingDetalleServicioTransporte(false);

			//if(DetalleServicioTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdServicioTransporteDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);

			this.getDetalleServicioTransportesFK_IdServicioTransporte();

			this.inicializarActualizarBindingDetalleServicioTransporte(false);

			//if(DetalleServicioTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);

			this.getDetalleServicioTransportesFK_IdSucursal();

			this.inicializarActualizarBindingDetalleServicioTransporte(false);

			//if(DetalleServicioTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadDetalleServicioTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);

			this.getDetalleServicioTransportesFK_IdUnidad();

			this.inicializarActualizarBindingDetalleServicioTransporte(false);

			//if(DetalleServicioTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserviciotransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleServicioTransporte() {
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleServicioTransporte.dispose();
			this.jInternalFrameDetalleFormDetalleServicioTransporte=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte!=null) {
			this.jInternalFrameReporteDinamicoDetalleServicioTransporte.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleServicioTransporte.dispose();
			this.jInternalFrameReporteDinamicoDetalleServicioTransporte=null;
		}
		
		if(this.jInternalFrameImportacionDetalleServicioTransporte!=null) {
			this.jInternalFrameImportacionDetalleServicioTransporte.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleServicioTransporte.dispose();
			this.jInternalFrameImportacionDetalleServicioTransporte=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleServicioTransporte();
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleServicioTransporte")) {
				jButtonNuevoDetalleServicioTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleServicioTransporte")) {
				jButtonDuplicarDetalleServicioTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleServicioTransporte")) {
				jButtonCopiarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleServicioTransporte")) {
				jButtonVerFormDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleServicioTransporte")) {
				jButtonNuevoDetalleServicioTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleServicioTransporte")) {
				jButtonDuplicarDetalleServicioTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleServicioTransporte")) {
				jButtonNuevoDetalleServicioTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleServicioTransporte")) {
				jButtonDuplicarDetalleServicioTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleServicioTransporte")) {
				jButtonNuevoDetalleServicioTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleServicioTransporte")) {
				jButtonNuevoDetalleServicioTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleServicioTransporte")) {
				jButtonNuevoDetalleServicioTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleServicioTransporte")) {
				jButtonModificarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleServicioTransporte")) {
				jButtonModificarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleServicioTransporte")) {
				jButtonModificarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleServicioTransporte")) {
				jButtonActualizarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleServicioTransporte")) {
				jButtonActualizarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleServicioTransporte")) {
				jButtonActualizarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleServicioTransporte")) {
				jButtonEliminarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleServicioTransporte")) {
				jButtonEliminarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleServicioTransporte")) {
				jButtonEliminarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleServicioTransporte")) {
				jButtonCancelarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleServicioTransporte")) {
				jButtonCancelarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleServicioTransporte")) {
				jButtonCancelarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleServicioTransporte")) {
				jButtonCerrarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleServicioTransporte")) {
				jButtonCerrarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleServicioTransporte")) {
				jButtonCerrarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleServicioTransporte")) {
				jButtonMostrarOcultarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleServicioTransporte")) {
				jButtonCancelarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleServicioTransporte")) {
				jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleServicioTransporte")) {
				jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleServicioTransporte")) {
				jButtonCopiarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleServicioTransporte")) {
				jButtonVerFormDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleServicioTransporte")) {
				jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleServicioTransporte")) {
				jButtonCopiarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleServicioTransporte")) {
				jButtonVerFormDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleServicioTransporte")) {
				jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleServicioTransporte")) {
				jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleServicioTransporte")) {
				jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleServicioTransporte")) {
				jButtonRecargarInformacionDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleServicioTransporte")) {
				jButtonRecargarInformacionDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleServicioTransporte")) {
				jButtonRecargarInformacionDetalleServicioTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleServicioTransporte")) {
				jButtonAnterioresDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleServicioTransporte")) {
				jButtonAnterioresDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleServicioTransporte")) {
				jButtonAnterioresDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleServicioTransporte")) {
				jButtonSiguientesDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleServicioTransporte")) {
				jButtonSiguientesDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleServicioTransporte")) {
				jButtonSiguientesDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleServicioTransporte") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleServicioTransporte")) {
				jButtonAbrirOrderByDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleServicioTransporte") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleServicioTransporte")) {
				jButtonMostrarOcultarDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleServicioTransporte")) {
				jButtonNuevoGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleServicioTransporte")) {
				jButtonNuevoGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleServicioTransporte")) {
				jButtonNuevoGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleServicioTransporte")) {
				jButtonCerrarReporteDinamicoDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleServicioTransporte")) {
				jButtonGenerarReporteDinamicoDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleServicioTransporte")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleServicioTransporte")) {
				jButtonCerrarImportacionDetalleServicioTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleServicioTransporte")) {
				
				jButtonGenerarImportacionDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleServicioTransporte")) {
				
				jButtonAbrirImportacionDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleServicioTransporte")) {
				jComboBoxTiposAccionesDetalleServicioTransporteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleServicioTransporte")) {
				jComboBoxTiposRelacionesDetalleServicioTransporteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleServicioTransporte")) {
				jComboBoxTiposAccionesDetalleServicioTransporteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleServicioTransporte")) {
				
				jComboBoxTiposSeleccionarDetalleServicioTransporteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleServicioTransporte")) {
				jTextFieldValorCampoGeneralDetalleServicioTransporteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleServicioTransporte")) {
				jButtonAbrirOrderByDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleServicioTransporte")) {
				jButtonAbrirOrderByDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleServicioTransporte")) {
				jButtonCerrarOrderByDetalleServicioTransporteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleServicioTransporteBusqueda")) {
				this.jButtonidDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_servicio_transporteDetalleServicioTransporteUpdate")) {
				this.jButtonid_servicio_transporteDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_servicio_transporteDetalleServicioTransporteBusqueda")) {
				this.jButtonid_servicio_transporteDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleServicioTransporteUpdate")) {
				this.jButtonid_empresaDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleServicioTransporteBusqueda")) {
				this.jButtonid_empresaDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleServicioTransporteUpdate")) {
				this.jButtonid_sucursalDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleServicioTransporteBusqueda")) {
				this.jButtonid_sucursalDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleServicioTransporteUpdate")) {
				this.jButtonid_ejercicioDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleServicioTransporteBusqueda")) {
				this.jButtonid_ejercicioDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleServicioTransporteUpdate")) {
				this.jButtonid_periodoDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleServicioTransporteBusqueda")) {
				this.jButtonid_periodoDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetalleServicioTransporteUpdate")) {
				this.jButtonid_bodegaDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetalleServicioTransporteBusqueda")) {
				this.jButtonid_bodegaDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleServicioTransporte")) {
				this.jButtonid_productoDetalleServicioTransporteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleServicioTransporteUpdate")) {
				this.jButtonid_productoDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleServicioTransporteBusqueda")) {
				this.jButtonid_productoDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetalleServicioTransporteUpdate")) {
				this.jButtonid_unidadDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetalleServicioTransporteBusqueda")) {
				this.jButtonid_unidadDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoDetalleServicioTransporteUpdate")) {
				this.jButtonid_centro_costoDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoDetalleServicioTransporteBusqueda")) {
				this.jButtonid_centro_costoDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetalleServicioTransporteBusqueda")) {
				this.jButtoncantidadDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioDetalleServicioTransporteBusqueda")) {
				this.jButtonprecioDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDetalleServicioTransporteBusqueda")) {
				this.jButtontotalDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleServicioTransporteBusqueda")) {
				this.jButtondescripcionDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoDetalleServicioTransporte")) {
				this.jButtonid_productoDetalleServicioTransporteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaDetalleServicioTransporte")) {
				this.jButtonFK_IdBodegaDetalleServicioTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCentroCostoDetalleServicioTransporte")) {
				this.jButtonFK_IdCentroCostoDetalleServicioTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoDetalleServicioTransporte")) {
				this.jButtonFK_IdProductoDetalleServicioTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdServicioTransporteDetalleServicioTransporte")) {
				this.jButtonFK_IdServicioTransporteDetalleServicioTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadDetalleServicioTransporte")) {
				this.jButtonFK_IdUnidadDetalleServicioTransporteActionPerformed(evt);
			}
			
			;
			
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleServicioTransporte();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				


				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleServicioTransporte detalleserviciotransporteLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleserviciotransporteLocal=this.detalleserviciotransporte;
			} else {
				detalleserviciotransporteLocal=this.detalleserviciotransporteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
							
				
				


				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
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
			
			


			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleServicioTransporteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
								
						
				


				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
								
				
				


				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleServicioTransporteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
							
				
				


				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
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
			
			


			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
								
				
				


				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleServicioTransporteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleServicioTransporteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleServicioTransporte")) {
					jCheckBoxSeleccionarTodosDetalleServicioTransporteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleServicioTransporte")) {
					jCheckBoxSeleccionadosDetalleServicioTransporteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleServicioTransporte")) {
					
				}
				
				


				
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
												
				
				


				
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleServicioTransporteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaDetalleServicioTransporte")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte;
				}

				if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleServicioTransporte(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte,"FK_IdBodega");
				//recargarFormDetalleServicioTransporteBodega(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetalleServicioTransporte")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte;
				}

				if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleServicioTransporte(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetalleServicioTransporte")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte,"FK_IdProducto");
				//recargarFormDetalleServicioTransporteProducto(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte,"FK_IdProducto");
			}
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaDetalleServicioTransporte")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte;
				}

				if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleServicioTransporte(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte,"FK_IdBodega");
				//recargarFormDetalleServicioTransporteBodega(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetalleServicioTransporte")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte;
				}

				if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleServicioTransporte(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetalleServicioTransporte")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte,"FK_IdProducto");
				//recargarFormDetalleServicioTransporteProducto(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte,"FK_IdProducto");
			}
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserviciotransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserviciotransporte);
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaDetalleServicioTransporte")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte;
				}

				if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleServicioTransporte(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte,"FK_IdBodega");
				//recargarFormDetalleServicioTransporteBodega(jComboBoxid_bodegaFK_IdBodegaDetalleServicioTransporte,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetalleServicioTransporte")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte;
				}

				if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleServicioTransporte(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetalleServicioTransporte")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte,"FK_IdProducto");
				//recargarFormDetalleServicioTransporteProducto(jComboBoxid_productoFK_IdProductoDetalleServicioTransporte,"FK_IdProducto");
			}
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleServicioTransporte.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleServicioTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleServicioTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserviciotransporteAnterior =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleServicioTransporte")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleServicioTransporteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleServicioTransporte.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleserviciotransporte =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleserviciotransporte);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleServicioTransporte")) {
				
				}
				
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleServicioTransporte")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleServicioTransporte.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleServicioTransporte")) {
			
			}
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleServicioTransporte();
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleServicioTransporte")) {
				jButtonNuevoDetalleServicioTransporteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleServicioTransporte")) {
				jButtonDuplicarDetalleServicioTransporteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleServicioTransporte")) {
				jButtonCopiarDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleServicioTransporte")) {
				jButtonVerFormDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleServicioTransporte")) {
				jButtonNuevoDetalleServicioTransporteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleServicioTransporte")) {
				jButtonModificarDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleServicioTransporte")) {
				jButtonActualizarDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleServicioTransporte")) {
				jButtonEliminarDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleServicioTransporte")) {
				jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleServicioTransporte")) {
				jButtonCancelarDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleServicioTransporte")) {
				jButtonCerrarDetalleServicioTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleServicioTransporte")) {
				jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleServicioTransporte")) {
				jButtonNuevoGuardarCambiosDetalleServicioTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleServicioTransporte")) {
				jButtonAbrirOrderByDetalleServicioTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleServicioTransporte")) {
				jButtonRecargarInformacionDetalleServicioTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleServicioTransporte")) {
				jButtonAnterioresDetalleServicioTransporteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleServicioTransporte")) {
				jButtonSiguientesDetalleServicioTransporteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleServicioTransporteBusqueda")) {
				this.jButtonidDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_servicio_transporteDetalleServicioTransporteUpdate")) {
				this.jButtonid_servicio_transporteDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_servicio_transporteDetalleServicioTransporteBusqueda")) {
				this.jButtonid_servicio_transporteDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleServicioTransporteUpdate")) {
				this.jButtonid_empresaDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleServicioTransporteBusqueda")) {
				this.jButtonid_empresaDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleServicioTransporteUpdate")) {
				this.jButtonid_sucursalDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleServicioTransporteBusqueda")) {
				this.jButtonid_sucursalDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleServicioTransporteUpdate")) {
				this.jButtonid_ejercicioDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleServicioTransporteBusqueda")) {
				this.jButtonid_ejercicioDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleServicioTransporteUpdate")) {
				this.jButtonid_periodoDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleServicioTransporteBusqueda")) {
				this.jButtonid_periodoDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetalleServicioTransporteUpdate")) {
				this.jButtonid_bodegaDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetalleServicioTransporteBusqueda")) {
				this.jButtonid_bodegaDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleServicioTransporte")) {
				this.jButtonid_productoDetalleServicioTransporteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleServicioTransporteUpdate")) {
				this.jButtonid_productoDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleServicioTransporteBusqueda")) {
				this.jButtonid_productoDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetalleServicioTransporteUpdate")) {
				this.jButtonid_unidadDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetalleServicioTransporteBusqueda")) {
				this.jButtonid_unidadDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoDetalleServicioTransporteUpdate")) {
				this.jButtonid_centro_costoDetalleServicioTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoDetalleServicioTransporteBusqueda")) {
				this.jButtonid_centro_costoDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetalleServicioTransporteBusqueda")) {
				this.jButtoncantidadDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioDetalleServicioTransporteBusqueda")) {
				this.jButtonprecioDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDetalleServicioTransporteBusqueda")) {
				this.jButtontotalDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleServicioTransporteBusqueda")) {
				this.jButtondescripcionDetalleServicioTransporteBusquedaActionPerformed(evt);
			}
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleServicioTransporte();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleServicioTransporte")) {
				closingInternalFrameDetalleServicioTransporte();
				
			} else if(sTipo.equals("jButtonCancelarDetalleServicioTransporte")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleServicioTransporte = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleServicioTransporteBeanSwingJInternalFrame jInternalFrameParent=(DetalleServicioTransporteBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleServicioTransporte.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleServicioTransporteActionPerformed(null);
			}
			
			DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleserviciotransporte,new Object(),this.detalleserviciotransporteParameterGeneral,this.detalleserviciotransporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleServicioTransporte(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleServicioTransporte(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleServicioTransporte(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleserviciotransporte)) {
			if(!esControlTabla) {
				if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);			
				}
				
				if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleserviciotransporteReturnGeneral=detalleserviciotransporteLogic.procesarEventosDetalleServicioTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleserviciotransporteLogic.getDetalleServicioTransportes(),this.detalleserviciotransporte,this.detalleserviciotransporteParameterGeneral,this.isEsNuevoDetalleServicioTransporte,classes);//this.detalleserviciotransporteLogic.getDetalleServicioTransporte()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleServicioTransporte(this.detalleserviciotransporteReturnGeneral,this.detalleserviciotransporteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleServicioTransporte(classes,this.detalleserviciotransporteReturnGeneral,this.detalleserviciotransporteBean,false);
					}
						
					if(this.detalleserviciotransporteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleServicioTransporte(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleServicioTransporte(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte());	
					}
						
					if(this.detalleserviciotransporteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleServicioTransporte(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte(),classes);//this.detalleserviciotransporteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleServicioTransporte(this.detalleserviciotransporte,classes);//this.detalleserviciotransporteBean);									
				}
			
				if(DetalleServicioTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleServicioTransporte(this.detalleserviciotransporte,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleServicioTransporte(this.detalleserviciotransporte);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleserviciotransporteAnterior!=null) {
						this.detalleserviciotransporte=this.detalleserviciotransporteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleserviciotransporteReturnGeneral=detalleserviciotransporteLogic.procesarEventosDetalleServicioTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleserviciotransporteLogic.getDetalleServicioTransportes(),this.detalleserviciotransporte,this.detalleserviciotransporteParameterGeneral,this.isEsNuevoDetalleServicioTransporte,classes);//this.detalleserviciotransporteLogic.getDetalleServicioTransporte()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleserviciotransporteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte(),detalleserviciotransporteLogic.getDetalleServicioTransportes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte(),this.detalleserviciotransportes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleServicioTransporte.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleServicioTransporte.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleServicioTransporte();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleServicioTransporte() throws Exception {
		
		DetalleServicioTransporteModel detalleserviciotransporteModel=(DetalleServicioTransporteModel)this.jTableDatosDetalleServicioTransporte.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleserviciotransporteModel.detalleserviciotransportes=this.detalleserviciotransporteLogic.getDetalleServicioTransportes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleserviciotransporteModel.detalleserviciotransportes=this.detalleserviciotransportes;
		}
		
		
		((DetalleServicioTransporteModel) this.jTableDatosDetalleServicioTransporte.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleServicioTransporte() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleserviciotransporteAnterior(),this.detalleserviciotransporteLogic.getDetalleServicioTransportes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleserviciotransporteAnterior(),this.detalleserviciotransportes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleServicioTransporte();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
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
										
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleserviciotransporte,new Object(),generalEntityParameterGeneral,this.detalleserviciotransporteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsOfDetalleServicioTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleServicioTransporteConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleServicioTransporte(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleServicioTransporte(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleServicioTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleserviciotransporte,new Object(),generalEntityParameterGeneral,this.detalleserviciotransporteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleServicioTransporte(DetalleServicioTransporteBean detalleserviciotransporteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleServicioTransporte(ArrayList<Classe> classes,DetalleServicioTransporteReturnGeneral detalleserviciotransporteReturnGeneral,DetalleServicioTransporteBean detalleserviciotransporteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleserviciotransporte)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte = new DetalleServicioTransporteDetalleFormJInternalFrame(jDesktopPane,this.detalleserviciotransporteSessionBean.getConGuardarRelaciones(),this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.setVisible(false);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.detalleserviciotransporteLogic=this.detalleserviciotransporteLogic;
		
		this.cargarCombosFrameForeignKeyDetalleServicioTransporte("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleServicioTransporte();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleServicioTransporte();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleServicioTransporte("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleServicioTransporte();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleServicioTransporte"));
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonModificarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"ModificarDetalleServicioTransporte"));

		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonModificarToolBarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleServicioTransporte"));
					
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemModificarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleServicioTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"ActualizarDetalleServicioTransporte"));
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarToolBarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleServicioTransporte"));
						
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemActualizarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleServicioTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"EliminarDetalleServicioTransporte"));
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleServicioTransporte"));
								
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemEliminarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleServicioTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"CancelarDetalleServicioTransporte"));
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleServicioTransporte"));
					
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemCancelarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleServicioTransporte"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemDetalleCerrarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleServicioTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleServicioTransporte"));
		
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleServicioTransporte"));
		
		
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleServicioTransporte"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonidDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_servicio_transporteDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_servicio_transporteDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_servicio_transporteDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_empresaDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_empresaDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_sucursalDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_sucursalDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_ejercicioDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_ejercicioDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_periodoDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_periodoDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_bodegaDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_bodegaDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleServicioTransporteBusqueda"));
		//jButtonid_productoDetalleServicioTransporte.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleServicioTransporteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporte"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_unidadDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_unidadDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_centro_costoDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_centro_costoDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtoncantidadDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonprecioDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"precioDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtontotalDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"totalDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtondescripcionDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleServicioTransporteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jTabbedPaneRelacionesDetalleServicioTransporte.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleServicioTransporte"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleServicioTransporte"));
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleServicioTransporte"));
		}
		
		this.jTableDatosDetalleServicioTransporte.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleServicioTransporte"));
		
		this.jTableDatosDetalleServicioTransporte.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleServicioTransporte"));
		
		this.jButtonNuevoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"NuevoDetalleServicioTransporte"));
		
		this.jButtonDuplicarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"DuplicarDetalleServicioTransporte"));
		
		this.jButtonCopiarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"CopiarDetalleServicioTransporte"));
		
		this.jButtonVerFormDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"VerFormDetalleServicioTransporte"));
		
		
		this.jButtonNuevoToolBarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleServicioTransporte"));
			
		this.jButtonDuplicarToolBarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleServicioTransporte"));
			
		this.jMenuItemNuevoDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleServicioTransporte"));
			
		this.jMenuItemDuplicarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleServicioTransporte"));		
		
		
		this.jButtonNuevoRelacionesDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleServicioTransporte"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleServicioTransporte"));
			
		this.jMenuItemNuevoRelacionesDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleServicioTransporte"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonModificarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"ModificarDetalleServicioTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonModificarToolBarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleServicioTransporte"));
			
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemModificarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleServicioTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"ActualizarDetalleServicioTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonActualizarToolBarDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleServicioTransporte"));
				
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemActualizarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleServicioTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"EliminarDetalleServicioTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonEliminarToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleServicioTransporte"));
						
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemEliminarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleServicioTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"CancelarDetalleServicioTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonCancelarToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleServicioTransporte"));
			
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemCancelarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleServicioTransporte"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleServicioTransporte"));		
		
		
		this.jButtonCerrarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"CerrarDetalleServicioTransporte"));
		
		
		this.jButtonCerrarToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleServicioTransporte"));
			
		this.jMenuItemCerrarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleServicioTransporte"));
			
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jMenuItemDetalleCerrarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleServicioTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleServicioTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleServicioTransporte"));
		}
		
		this.jButtonCopiarToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleServicioTransporte"));
			
		this.jButtonVerFormToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleServicioTransporte"));
		
		this.jMenuItemGuardarCambiosDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleServicioTransporte"));
			
		this.jMenuItemCopiarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleServicioTransporte"));		
		
		this.jMenuItemVerFormDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleServicioTransporte"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleServicioTransporte"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleServicioTransporte"));
			
		this.jMenuItemGuardarCambiosTablaDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleServicioTransporte"));		
		
		
		
		this.jButtonRecargarInformacionDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleServicioTransporte"));
					
		this.jButtonRecargarInformacionToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleServicioTransporte"));
		
		this.jMenuItemRecargarInformacionDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleServicioTransporte"));		
		
		
		
		this.jButtonAnterioresDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"AnterioresDetalleServicioTransporte"));
		
		
		this.jButtonAnterioresToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleServicioTransporte"));
		
		this.jMenuItemAnterioresDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleServicioTransporte"));		
		
		
		this.jButtonSiguientesDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"SiguientesDetalleServicioTransporte"));
		
		
		this.jButtonSiguientesToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleServicioTransporte"));
			
		this.jMenuItemSiguientesDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleServicioTransporte"));
			
		this.jMenuItemAbrirOrderByDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleServicioTransporte"));
			
		this.jMenuItemMostrarOcultarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleServicioTransporte"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleServicioTransporte"));
			
		this.jMenuItemDetalleMostarOcultarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleServicioTransporte"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleServicioTransporte"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleServicioTransporte"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleServicioTransporte"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleServicioTransporte.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleServicioTransporte"));

		this.jCheckBoxSeleccionadosDetalleServicioTransporte.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleServicioTransporte"));
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleServicioTransporte"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleServicioTransporte"));
			
		this.jComboBoxTiposAccionesDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleServicioTransporte"));
					
		this.jComboBoxTiposSeleccionarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleServicioTransporte"));
			
		this.jTextFieldValorCampoGeneralDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleServicioTransporte"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonidDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_servicio_transporteDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_servicio_transporteDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_servicio_transporteDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_empresaDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_empresaDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_sucursalDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_sucursalDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_ejercicioDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_ejercicioDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_periodoDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_periodoDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_bodegaDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_bodegaDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleServicioTransporteBusqueda"));
		//jButtonid_productoDetalleServicioTransporte.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleServicioTransporteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporte"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_unidadDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_unidadDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_centro_costoDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_centro_costoDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtoncantidadDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonprecioDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"precioDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtontotalDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"totalDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtondescripcionDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleServicioTransporteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetalleServicioTransporte"));

			this.jButtonFK_IdCentroCostoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoDetalleServicioTransporte"));

			this.jButtonFK_IdProductoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleServicioTransporte"));

			this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporte"));

			this.jButtonFK_IdServicioTransporteDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdServicioTransporteDetalleServicioTransporte"));

			this.jButtonFK_IdUnidadDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetalleServicioTransporte"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleServicioTransporte!=null) {
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleServicioTransporte"));
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleServicioTransporte"));
				this.jInternalFrameReporteDinamicoDetalleServicioTransporte.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleServicioTransporte"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleServicioTransporte"));				
			//this.jButtonGenerarReporteDinamicoDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleServicioTransporte"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleServicioTransporte"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleServicioTransporte!=null) {
				this.jInternalFrameImportacionDetalleServicioTransporte.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleServicioTransporte"));
				this.jInternalFrameImportacionDetalleServicioTransporte.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleServicioTransporte"));
				this.jInternalFrameImportacionDetalleServicioTransporte.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleServicioTransporte"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleServicioTransporte"));
			
			this.jButtonAbrirOrderByToolBarDetalleServicioTransporte.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleServicioTransporte"));			
			
			if(this.jInternalFrameOrderByDetalleServicioTransporte!=null) {
				this.jInternalFrameOrderByDetalleServicioTransporte.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleServicioTransporte"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jTabbedPaneRelacionesDetalleServicioTransporte.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleServicioTransporte"));
		
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
            		closingInternalFrameDetalleServicioTransporte();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleServicioTransporte = (JInternalFrameBase)event.getSource();
	            	
	            DetalleServicioTransporteBeanSwingJInternalFrame jInternalFrameParent=(DetalleServicioTransporteBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleServicioTransporte.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleServicioTransporteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleServicioTransporte.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleServicioTransporteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleServicioTransporte.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleServicioTransporte.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleServicioTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleServicioTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleServicioTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleServicioTransporte";
		inputMap = this.jButtonNuevoDetalleServicioTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleServicioTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleServicioTransporteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleServicioTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleServicioTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleServicioTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleServicioTransporte";
		inputMap = this.jButtonNuevoRelacionesDetalleServicioTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleServicioTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleServicioTransporteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleServicioTransporte";
		inputMap = this.jButtonModificarDetalleServicioTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleServicioTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleServicioTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleServicioTransporte";
		inputMap = this.jButtonActualizarDetalleServicioTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleServicioTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleServicioTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleServicioTransporte";
		inputMap = this.jButtonEliminarDetalleServicioTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleServicioTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleServicioTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleServicioTransporte";
		inputMap = this.jButtonCancelarDetalleServicioTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleServicioTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleServicioTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleServicioTransporte";
		inputMap = this.jButtonCerrarDetalleServicioTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleServicioTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleServicioTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleServicioTransporte";
		inputMap = this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosDetalleServicioTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonGuardarCambiosDetalleServicioTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleServicioTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleServicioTransporte.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleServicioTransporteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleServicioTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleServicioTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleServicioTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleServicioTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleServicioTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleServicioTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonidDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_servicio_transporteDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_servicio_transporteDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_servicio_transporteDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_servicio_transporteDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_empresaDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_empresaDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_sucursalDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_sucursalDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_ejercicioDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_ejercicioDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_periodoDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_periodoDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_bodegaDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_bodegaDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleServicioTransporteBusqueda"));
		//jButtonid_productoDetalleServicioTransporte.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleServicioTransporteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporte"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_unidadDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_unidadDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleServicioTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_centro_costoDetalleServicioTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleServicioTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_centro_costoDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtoncantidadDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonprecioDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"precioDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtontotalDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"totalDetalleServicioTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtondescripcionDetalleServicioTransporteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleServicioTransporteBusqueda"));
		
		
		this.jButtonFK_IdBodegaDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetalleServicioTransporte"));

		this.jButtonFK_IdCentroCostoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoDetalleServicioTransporte"));

		this.jButtonFK_IdProductoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleServicioTransporte"));

		this.jButtonBuscarFK_IdProductoid_productoDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"id_productoDetalleServicioTransporte"));

		this.jButtonFK_IdServicioTransporteDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdServicioTransporteDetalleServicioTransporte"));

		this.jButtonFK_IdUnidadDetalleServicioTransporte.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetalleServicioTransporte"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleServicioTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleServicioTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleServicioTransporteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleServicioTransporte.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleServicioTransporte(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
					detalleserviciotransporteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportes) {
					detalleserviciotransporteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleServicioTransporteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
						detalleserviciotransporteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportes) {
						detalleserviciotransporteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleServicioTransporte.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleServicioTransporte.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleServicioTransporteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleServicioTransporte.getSelectedRows();
			
			DetalleServicioTransporte detalleserviciotransporteLocal=new DetalleServicioTransporte();
			
			//this.seleccionarTodosDetalleServicioTransporte(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserviciotransporteLocal =(DetalleServicioTransporte) this.detalleserviciotransporteLogic.getDetalleServicioTransportes().toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleserviciotransporteLocal =(DetalleServicioTransporte) this.detalleserviciotransportes.toArray()[this.jTableDatosDetalleServicioTransporte.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleserviciotransporteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
						detalleserviciotransporteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportes) {
						detalleserviciotransporteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleServicioTransporte.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleServicioTransporte.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleServicioTransporte,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleServicioTransporteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleServicioTransporteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleServicioTransporteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleServicioTransporte.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
				
						if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detalleserviciotransporteAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							detalleserviciotransporteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							detalleserviciotransporteAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleserviciotransporteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportes) {
					
						if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detalleserviciotransporteAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							detalleserviciotransporteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							detalleserviciotransporteAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleserviciotransporteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleServicioTransporteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleServicioTransporte=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleServicioTransporte.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleServicioTransporte) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleServicioTransporte(conSplash);
				
					this.generarReporteDetalleServicioTransportesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleServicioTransportesSeleccionados();
				//this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleServicioTransportesSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleServicioTransportesSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleServicioTransporte();
				
				this.exportarDetalleServicioTransportesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleServicioTransportes();
				//this.importarDetalleServicioTransportes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleServicioTransporte();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleServicioTransportesSeleccionados();
				//this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Servicio Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleServicioTransporte();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleServicioTransporte)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleServicioTransporte(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleServicioTransporteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleServicioTransporte) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleServicioTransporte(conSplash);
					
						//this.actualizarParametrosGeneralDetalleServicioTransporte();
						
						this.generarReporteProcesoAccionDetalleServicioTransportesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleServicioTransporteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Servicio TransporteS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Servicio Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleServicioTransporte();
				
						this.actualizarParametrosGeneralDetalleServicioTransporte();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleserviciotransporteReturnGeneral=detalleserviciotransporteLogic.procesarAccionDetalleServicioTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleserviciotransporteLogic.getDetalleServicioTransportes(),this.detalleserviciotransporteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleServicioTransporteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleServicioTransporte();
					
					DetalleServicioTransporteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleServicioTransporteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleServicioTransporte.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxTiposAccionesFormularioDetalleServicioTransporte.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleServicioTransporte(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleServicioTransporteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleServicioTransporte();
			
			if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();		
			DetalleServicioTransporte detalleserviciotransporte=new DetalleServicioTransporte();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleServicioTransporte(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleServicioTransporte.getSelectedItem();
			
			
			
			
			detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleserviciotransportesSeleccionados.size()==1) {
				for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportesSeleccionados) {
					detalleserviciotransporte=detalleserviciotransporteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleServicioTransporte();
			
      		//this.finishProcessDetalleServicioTransporte(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleServicioTransporteReturnGeneral() throws Exception {
		if(this.detalleserviciotransporteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleserviciotransporteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleserviciotransporteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleserviciotransporteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleserviciotransporteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleserviciotransporteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleServicioTransporte(false);
		}
		
		if(this.detalleserviciotransporteReturnGeneral.getConRetornoLista() || this.detalleserviciotransporteReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleserviciotransporteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleserviciotransporteLogic.setDetalleServicioTransportes(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransportes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleserviciotransporteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleserviciotransporteLogic.setDetalleServicioTransporte(this.detalleserviciotransporteReturnGeneral.getDetalleServicioTransporte());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleServicioTransporte(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleServicioTransporte() throws Exception {
		
		
	}
	
	public ArrayList<DetalleServicioTransporte> getDetalleServicioTransportesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleServicioTransporte) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransporteLogic.getDetalleServicioTransportes()) {
					if(detalleserviciotransporteAux.getIsSelected()) {
						detalleserviciotransportesSeleccionados.add(detalleserviciotransporteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleServicioTransporte detalleserviciotransporteAux:this.detalleserviciotransportes) {
					if(detalleserviciotransporteAux.getIsSelected()) {
						detalleserviciotransportesSeleccionados.add(detalleserviciotransporteAux);				
					}
				}
			}
			
			if(detalleserviciotransportesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleserviciotransportesSeleccionados.addAll(this.detalleserviciotransporteLogic.getDetalleServicioTransportes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleserviciotransportesSeleccionados.addAll(this.detalleserviciotransportes);				
					}
				}
			}
		} else {
			detalleserviciotransportesSeleccionados.add(this.detalleserviciotransporte);
		}
		
		return detalleserviciotransportesSeleccionados;
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
	
	public void generarReporteDetalleServicioTransportesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleServicioTransportesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleServicioTransportesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleServicioTransportesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleServicioTransportesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Servicio Transporte",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleServicioTransportesSeleccionados() throws Exception {
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();		
		
		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleServicioTransportes("Todos",detalleserviciotransportesSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleServicioTransportesSeleccionados() throws Exception {
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();		
		
		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleServicioTransportes("Todos",detalleserviciotransportesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleServicioTransportesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();
		
		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleServicioTransportes("Todos",detalleserviciotransportesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleServicioTransportesSeleccionados() throws Exception {
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleServicioTransporte();
		
		
		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleServicioTransporte();
		
		
		//this.generarReporteDetalleServicioTransportes("Todos",detalleserviciotransportesSeleccionados ,detalleserviciotransporteImplementable,detalleserviciotransporteImplementableHome);
	}
	
	public void mostrarImportacionDetalleServicioTransportes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleServicioTransporte();
		
		this.abrirFrameImportacionDetalleServicioTransporte();		
		
			
		//this.generarReporteDetalleServicioTransportes("Todos",detalleserviciotransportesSeleccionados ,detalleserviciotransporteImplementable,detalleserviciotransporteImplementableHome);
	}
	
	public void importarDetalleServicioTransportes() throws Exception {		
	
	}
	
	public void exportarDetalleServicioTransportesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleServicioTransportesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleServicioTransportesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleServicioTransportesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Servicio Transporte",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleServicioTransportesSeleccionados() throws Exception {
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();		
		
		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserviciotransporte."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleServicioTransporte(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleServicioTransporte(detalleserviciotransporteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleserviciotransporteAux.setsDetalleGeneralEntityReporte(detalleserviciotransporteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleServicioTransporte(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleserviciotransporte.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getserviciotransporte_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserviciotransporte.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleServicioTransportesSeleccionados() throws Exception {
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();		
		
		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserviciotransporte.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleServicioTransportes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleServicioTransporte(row);				
				iRow++;
			}				
			
			for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleServicioTransporte(detalleserviciotransporteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleServicioTransportesSeleccionados() throws Exception {
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();		
		
		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserviciotransporte.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleserviciotransportes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleserviciotransporte");
			//elementRoot.appendChild(element);
		
			for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportesSeleccionados) {
				element = document.createElement("detalleserviciotransporte");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleServicioTransporte(detalleserviciotransporteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Servicio Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleServicioTransporte(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getserviciotransporte_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserviciotransporte.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleServicioTransporte(DetalleServicioTransporte detalleserviciotransporte,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleServicioTransporteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleserviciotransporte.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleServicioTransporteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleserviciotransporte.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementserviciotransporte_descripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.IDSERVICIOTRANSPORTE);
		elementserviciotransporte_descripcion.appendChild(document.createTextNode(detalleserviciotransporte.getserviciotransporte_descripcion()));
		element.appendChild(elementserviciotransporte_descripcion);

		Element elementempresa_descripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleserviciotransporte.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detalleserviciotransporte.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detalleserviciotransporte.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(detalleserviciotransporte.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementbodega_descripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(detalleserviciotransporte.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(detalleserviciotransporte.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(detalleserviciotransporte.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(detalleserviciotransporte.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementcantidad = document.createElement(DetalleServicioTransporteConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(detalleserviciotransporte.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(DetalleServicioTransporteConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(detalleserviciotransporte.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementtotal = document.createElement(DetalleServicioTransporteConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(detalleserviciotransporte.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementdescripcion = document.createElement(DetalleServicioTransporteConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detalleserviciotransporte.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDetalleServicioTransportesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados=new ArrayList<DetalleServicioTransporte>();
		
		detalleserviciotransportesSeleccionados=this.getDetalleServicioTransportesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleServicioTransporte(detalleserviciotransportesSeleccionados);
		
		this.generarReporteDetalleServicioTransportes("Todos",detalleserviciotransportesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleServicioTransporte(ArrayList<DetalleServicioTransporte> detalleserviciotransportesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleServicioTransporte detalleserviciotransporteAux:detalleserviciotransportesSeleccionados) {
				detalleserviciotransporteAux.setsDetalleGeneralEntityReporte(detalleserviciotransporteAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_IDSERVICIOTRANSPORTE)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getserviciotransporte_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(DetalleServicioTransporteConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detalleserviciotransporteAux.setsDescripcionGeneralEntityReporte1(detalleserviciotransporteAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleServicioTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleServicioTransporte(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleServicioTransporte=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=false;
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=true;
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=false;
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=true;
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=true;
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=false;
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=true;
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=true;
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=false;
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=false;
			this.isVisibilidadCeldaModificarDetalleServicioTransporte=true;
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaCancelarDetalleServicioTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleServicioTransporte=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleServicioTransporteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=true;
		} else {
			this.actualizarEstadoPanelsDetalleServicioTransporte(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleServicioTransporte=false;
			//this.isVisibilidadCeldaVerFormDetalleServicioTransporte=false;
			this.isVisibilidadCeldaDuplicarDetalleServicioTransporte=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleServicioTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleServicioTransporte=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			if(!detalleserviciotransporteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;												
			}
			
			this.jButtonCerrarDetalleServicioTransporte.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleServicioTransporte=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleserviciotransporte)) {
			this.isVisibilidadCeldaActualizarDetalleServicioTransporte=false;
			this.isVisibilidadCeldaEliminarDetalleServicioTransporte=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleServicioTransporte() {
	}
	
	public void actualizarEstadoPanelsDetalleServicioTransporte(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosEdicionDetalleServicioTransporte.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleServicioTransporte!=null) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosDetalleServicioTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleServicioTransporte!=null) {
				this.jPanelPaginacionDetalleServicioTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleServicioTransporte!=null) {
				this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosEdicionDetalleServicioTransporte.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleServicioTransporte!=null) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosDetalleServicioTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleServicioTransporte!=null) {
				this.jPanelPaginacionDetalleServicioTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleServicioTransporte!=null) {
				this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosEdicionDetalleServicioTransporte.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleServicioTransporte!=null) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosDetalleServicioTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleServicioTransporte!=null) {
				this.jPanelPaginacionDetalleServicioTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleServicioTransporte!=null) {
				this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosEdicionDetalleServicioTransporte.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleServicioTransporte!=null) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosDetalleServicioTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleServicioTransporte!=null) {
				this.jPanelPaginacionDetalleServicioTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleServicioTransporte!=null) {
				this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosEdicionDetalleServicioTransporte.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleServicioTransporte!=null) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosDetalleServicioTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleServicioTransporte!=null) {
				this.jPanelPaginacionDetalleServicioTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleServicioTransporte!=null) {
				this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosEdicionDetalleServicioTransporte.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleServicioTransporte!=null) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosDetalleServicioTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleServicioTransporte!=null) {
				this.jPanelPaginacionDetalleServicioTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleServicioTransporte!=null) {
				this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosEdicionDetalleServicioTransporte.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleServicioTransporte!=null) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleServicioTransporte!=null) {
				this.jScrollPanelDatosDetalleServicioTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleServicioTransporte!=null) {
				this.jPanelPaginacionDetalleServicioTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleServicioTransporte!=null) {
				this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleServicioTransporte!=null) {
					this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleServicioTransporte!=null) {
				this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleserviciotransporteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleServicioTransporte!=null) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleServicioTransporte!=null) {
				this.jPanelParametrosReportesDetalleServicioTransporte.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaServicioTransporte(Boolean isParaServicioTransporte){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaServicioTransporteNegation=!isParaServicioTransporte;

			this.isVisibilidadFK_IdBodega=isParaServicioTransporteNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdBodegaDetalleServicioTransporte);}

			this.isVisibilidadFK_IdCentroCosto=isParaServicioTransporteNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdCentroCostoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdProducto=isParaServicioTransporteNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdProductoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdServicioTransporte=isParaServicioTransporte;
			if(!this.isVisibilidadFK_IdServicioTransporte) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdServicioTransporteDetalleServicioTransporte);}

			this.isVisibilidadFK_IdUnidad=isParaServicioTransporteNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdUnidadDetalleServicioTransporte);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdBodegaDetalleServicioTransporte);}

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdCentroCostoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdProductoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdServicioTransporte=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdServicioTransporte) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdServicioTransporteDetalleServicioTransporte);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdUnidadDetalleServicioTransporte);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdBodegaDetalleServicioTransporte);}

			this.isVisibilidadFK_IdCentroCosto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdCentroCostoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdProductoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdServicioTransporte=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdServicioTransporte) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdServicioTransporteDetalleServicioTransporte);}

			this.isVisibilidadFK_IdUnidad=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdUnidadDetalleServicioTransporte);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdBodega=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdBodegaDetalleServicioTransporte);}

			this.isVisibilidadFK_IdCentroCosto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdCentroCostoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdProducto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdProductoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdServicioTransporte=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdServicioTransporte) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdServicioTransporteDetalleServicioTransporte);}

			this.isVisibilidadFK_IdUnidad=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdUnidadDetalleServicioTransporte);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdBodega=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdBodegaDetalleServicioTransporte);}

			this.isVisibilidadFK_IdCentroCosto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdCentroCostoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdProducto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdProductoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdServicioTransporte=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdServicioTransporte) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdServicioTransporteDetalleServicioTransporte);}

			this.isVisibilidadFK_IdUnidad=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdUnidadDetalleServicioTransporte);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdBodegaDetalleServicioTransporte);}

			this.isVisibilidadFK_IdCentroCosto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdCentroCostoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdProductoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdServicioTransporte=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdServicioTransporte) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdServicioTransporteDetalleServicioTransporte);}

			this.isVisibilidadFK_IdUnidad=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdUnidadDetalleServicioTransporte);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdBodegaDetalleServicioTransporte);}

			this.isVisibilidadFK_IdCentroCosto=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdCentroCostoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdProductoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdServicioTransporte=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdServicioTransporte) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdServicioTransporteDetalleServicioTransporte);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdUnidadDetalleServicioTransporte);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdBodega=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdBodegaDetalleServicioTransporte);}

			this.isVisibilidadFK_IdCentroCosto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdCentroCostoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdProductoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdServicioTransporte=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdServicioTransporte) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdServicioTransporteDetalleServicioTransporte);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdUnidadDetalleServicioTransporte);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadFK_IdBodega=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdBodegaDetalleServicioTransporte);}

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdCentroCostoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdProducto=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdProductoDetalleServicioTransporte);}

			this.isVisibilidadFK_IdServicioTransporte=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdServicioTransporte) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdServicioTransporteDetalleServicioTransporte);}

			this.isVisibilidadFK_IdUnidad=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(jPanelFK_IdUnidadDetalleServicioTransporte);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetalleServicioTransporteParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(detalleserviciotransporteSessionBean==null) {
				detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(detalleserviciotransporteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.detalleserviciotransporteFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(DetalleServicioTransporteConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleServicioTransporte(true);
			//productoSessionBean.setlidDetalleServicioTransporteActual(this.idDetalleServicioTransporteActual);

			detalleserviciotransporteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleServicioTransporte(true);
			detalleserviciotransporteSessionBean.setlIdDetalleServicioTransporteActualForeignKey(this.idDetalleServicioTransporteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleServicioTransporteSessionBean detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
		
		if(this.detalleserviciotransporteSessionBean==null) {
			this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
		}
		
		this.detalleserviciotransporteSessionBean.setsUltimaBusquedaDetalleServicioTransporte(this.getsAccionBusqueda());
		this.detalleserviciotransporteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleserviciotransporteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			detalleserviciotransporteSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			detalleserviciotransporteSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			detalleserviciotransporteSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleserviciotransporteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			detalleserviciotransporteSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			detalleserviciotransporteSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdServicioTransporte")) {
			detalleserviciotransporteSessionBean.setid_servicio_transporte(this.getid_servicio_transporteFK_IdServicioTransporte());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detalleserviciotransporteSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			detalleserviciotransporteSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleServicioTransporteSessionBean detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
		
		if(this.detalleserviciotransporteSessionBean==null) {
			this.detalleserviciotransporteSessionBean=new DetalleServicioTransporteSessionBean();
		}
		
		if(this.detalleserviciotransporteSessionBean.getsUltimaBusquedaDetalleServicioTransporte()!=null&&!this.detalleserviciotransporteSessionBean.getsUltimaBusquedaDetalleServicioTransporte().equals("")) {
			this.setsAccionBusqueda(detalleserviciotransporteSessionBean.getsUltimaBusquedaDetalleServicioTransporte());
			this.setiNumeroPaginacion(detalleserviciotransporteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleserviciotransporteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(detalleserviciotransporteSessionBean.getid_bodega());
				detalleserviciotransporteSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(detalleserviciotransporteSessionBean.getid_centro_costo());
				detalleserviciotransporteSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(detalleserviciotransporteSessionBean.getid_ejercicio());
				detalleserviciotransporteSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleserviciotransporteSessionBean.getid_empresa());
				detalleserviciotransporteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(detalleserviciotransporteSessionBean.getid_periodo());
				detalleserviciotransporteSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(detalleserviciotransporteSessionBean.getid_producto());
				detalleserviciotransporteSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdServicioTransporte")) {
				this.setid_servicio_transporteFK_IdServicioTransporte(detalleserviciotransporteSessionBean.getid_servicio_transporte());
				detalleserviciotransporteSessionBean.setid_servicio_transporte(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detalleserviciotransporteSessionBean.getid_sucursal());
				detalleserviciotransporteSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(detalleserviciotransporteSessionBean.getid_unidad());
				detalleserviciotransporteSessionBean.setid_unidad(-1L);
			}
		}
		
		this.detalleserviciotransporteSessionBean.setsUltimaBusquedaDetalleServicioTransporte("");
		this.detalleserviciotransporteSessionBean.setiNumeroPaginacion(DetalleServicioTransporteConstantesFunciones.INUMEROPAGINACION);
		this.detalleserviciotransporteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleServicioTransporte(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleServicioTransporte() {
		this.updateBorderResaltarBusquedasFormularioDetalleServicioTransporte();
		this.updateVisibilidadBusquedasFormularioDetalleServicioTransporte();
		this.updateHabilitarBusquedasFormularioDetalleServicioTransporte();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleServicioTransporte() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponents().length>0) {
	

		if(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdBodegaDetalleServicioTransporte!=null) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdBodegaDetalleServicioTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdBodegaDetalleServicioTransporte);
			}
		}

		if(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdCentroCostoDetalleServicioTransporte!=null) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdCentroCostoDetalleServicioTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdCentroCostoDetalleServicioTransporte);
			}
		}

		if(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdProductoDetalleServicioTransporte!=null) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdProductoDetalleServicioTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdProductoDetalleServicioTransporte);
			}
		}

		if(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdServicioTransporteDetalleServicioTransporte!=null) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdServicioTransporteDetalleServicioTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdServicioTransporteDetalleServicioTransporte);
			}
		}

		if(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdUnidadDetalleServicioTransporte!=null) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdUnidadDetalleServicioTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdUnidadDetalleServicioTransporte);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleServicioTransporte() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdBodegaDetalleServicioTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdBodegaDetalleServicioTransporte);
			if(!this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdBodegaDetalleServicioTransporte && index>-1) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdCentroCostoDetalleServicioTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdCentroCostoDetalleServicioTransporte);
			if(!this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdCentroCostoDetalleServicioTransporte && index>-1) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdProductoDetalleServicioTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdProductoDetalleServicioTransporte);
			if(!this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdProductoDetalleServicioTransporte && index>-1) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdServicioTransporteDetalleServicioTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdServicioTransporteDetalleServicioTransporte);
			if(!this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdServicioTransporteDetalleServicioTransporte && index>-1) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdUnidadDetalleServicioTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdUnidadDetalleServicioTransporte);
			if(!this.detalleserviciotransporteConstantesFunciones.mostrarFK_IdUnidadDetalleServicioTransporte && index>-1) {
				this.jTabbedPaneBusquedasDetalleServicioTransporte.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleServicioTransporte() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdBodegaDetalleServicioTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarFK_IdBodegaDetalleServicioTransporte);
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setEnabledAt(index,this.detalleserviciotransporteConstantesFunciones.activarFK_IdBodegaDetalleServicioTransporte);
			}

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdCentroCostoDetalleServicioTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarFK_IdCentroCostoDetalleServicioTransporte);
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setEnabledAt(index,this.detalleserviciotransporteConstantesFunciones.activarFK_IdCentroCostoDetalleServicioTransporte);
			}

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdProductoDetalleServicioTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarFK_IdProductoDetalleServicioTransporte);
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setEnabledAt(index,this.detalleserviciotransporteConstantesFunciones.activarFK_IdProductoDetalleServicioTransporte);
			}

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdServicioTransporteDetalleServicioTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarFK_IdServicioTransporteDetalleServicioTransporte);
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setEnabledAt(index,this.detalleserviciotransporteConstantesFunciones.activarFK_IdServicioTransporteDetalleServicioTransporte);
			}

			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdUnidadDetalleServicioTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarFK_IdUnidadDetalleServicioTransporte);
				this.jTabbedPaneBusquedasDetalleServicioTransporte.setEnabledAt(index,this.detalleserviciotransporteConstantesFunciones.activarFK_IdUnidadDetalleServicioTransporte);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleServicioTransporte(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdBodegaDetalleServicioTransporte);

			this.jTabbedPaneBusquedasDetalleServicioTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);

			this.detalleserviciotransporteConstantesFunciones.setResaltarFK_IdBodegaDetalleServicioTransporte(resaltar);

			jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdBodegaDetalleServicioTransporte);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdCentroCostoDetalleServicioTransporte);

			this.jTabbedPaneBusquedasDetalleServicioTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);

			this.detalleserviciotransporteConstantesFunciones.setResaltarFK_IdCentroCostoDetalleServicioTransporte(resaltar);

			jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdCentroCostoDetalleServicioTransporte);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdProductoDetalleServicioTransporte);

			this.jTabbedPaneBusquedasDetalleServicioTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);

			this.detalleserviciotransporteConstantesFunciones.setResaltarFK_IdProductoDetalleServicioTransporte(resaltar);

			jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdProductoDetalleServicioTransporte);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdServicioTransporte")) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdServicioTransporteDetalleServicioTransporte);

			this.jTabbedPaneBusquedasDetalleServicioTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);

			this.detalleserviciotransporteConstantesFunciones.setResaltarFK_IdServicioTransporteDetalleServicioTransporte(resaltar);

			jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdServicioTransporteDetalleServicioTransporte);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasDetalleServicioTransporte.indexOfComponent(this.jPanelFK_IdUnidadDetalleServicioTransporte);

			this.jTabbedPaneBusquedasDetalleServicioTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleServicioTransporte.getComponent(index);

			this.detalleserviciotransporteConstantesFunciones.setResaltarFK_IdUnidadDetalleServicioTransporte(resaltar);

			jPanel.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarFK_IdUnidadDetalleServicioTransporte);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleServicioTransporte.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleServicioTransporte() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleServicioTransporte();
		this.updateVisibilidadResaltarControlesFormularioDetalleServicioTransporte();
		this.updateHabilitarResaltarControlesFormularioDetalleServicioTransporte();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleServicioTransporte() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleserviciotransporteConstantesFunciones.resaltaridDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltaridDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarid_servicio_transporteDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarid_servicio_transporteDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarid_empresaDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarid_empresaDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarid_sucursalDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarid_sucursalDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarid_ejercicioDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarid_ejercicioDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarid_periodoDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarid_periodoDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarid_bodegaDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarid_bodegaDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarid_productoDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarid_productoDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarid_unidadDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarid_unidadDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarid_centro_costoDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarid_centro_costoDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarcantidadDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldcantidadDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarcantidadDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltarprecioDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldprecioDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltarprecioDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltartotalDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldtotalDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltartotalDetalleServicioTransporte);}
		if(this.detalleserviciotransporteConstantesFunciones.resaltardescripcionDetalleServicioTransporte!=null && this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextAreadescripcionDetalleServicioTransporte.setBorder(this.detalleserviciotransporteConstantesFunciones.resaltardescripcionDetalleServicioTransporte);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleServicioTransporte() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
	
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostraridDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelidDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostraridDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_servicio_transporteDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelid_servicio_transporteDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_servicio_transporteDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_empresaDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelid_empresaDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_empresaDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_sucursalDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelid_sucursalDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_sucursalDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_ejercicioDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelid_ejercicioDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_ejercicioDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_periodoDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelid_periodoDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_periodoDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_bodegaDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelid_bodegaDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_bodegaDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_productoDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelid_productoDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_productoDetalleServicioTransporte);
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_productoDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_unidadDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelid_unidadDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_unidadDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_centro_costoDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelid_centro_costoDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarid_centro_costoDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldcantidadDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarcantidadDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelcantidadDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarcantidadDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldprecioDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarprecioDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPanelprecioDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrarprecioDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldtotalDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrartotalDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPaneltotalDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrartotalDetalleServicioTransporte);
		//this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextAreadescripcionDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrardescripcionDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jPaneldescripcionDetalleServicioTransporte.setVisible(this.detalleserviciotransporteConstantesFunciones.mostrardescripcionDetalleServicioTransporte);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleServicioTransporte() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleServicioTransporte!=null) {
	
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jLabelidDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activaridDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_servicio_transporteDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_servicio_transporteDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_empresaDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_empresaDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_sucursalDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_sucursalDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_ejercicioDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_ejercicioDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_periodoDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_periodoDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_bodegaDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_bodegaDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_productoDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_productoDetalleServicioTransporte);
			this.jInternalFrameDetalleFormDetalleServicioTransporte.jButtonid_productoDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_productoDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_unidadDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_unidadDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jComboBoxid_centro_costoDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarid_centro_costoDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldcantidadDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarcantidadDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldprecioDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activarprecioDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextFieldtotalDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activartotalDetalleServicioTransporte);
		this.jInternalFrameDetalleFormDetalleServicioTransporte.jTextAreadescripcionDetalleServicioTransporte.setEnabled(this.detalleserviciotransporteConstantesFunciones.activardescripcionDetalleServicioTransporte);
		}
	}
	
		
}