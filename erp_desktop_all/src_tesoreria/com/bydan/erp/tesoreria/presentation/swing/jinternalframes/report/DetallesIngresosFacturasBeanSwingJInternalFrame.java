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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.DetallesIngresosFacturasConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.DetallesIngresosFacturasParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.DetallesIngresosFacturasParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.DetallesIngresosFacturasBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetallesIngresosFacturasBeanSwingJInternalFrame extends DetallesIngresosFacturasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetallesIngresosFacturasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetallesIngresosFacturas> detallesingresosfacturasValidator = new ClassValidator<DetallesIngresosFacturas>(DetallesIngresosFacturas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetallesIngresosFacturas detallesingresosfacturas;	
	public DetallesIngresosFacturas detallesingresosfacturasAux;
	public DetallesIngresosFacturas detallesingresosfacturasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetallesIngresosFacturas detallesingresosfacturasTotales;
	public Long idDetallesIngresosFacturasActual;
	public Long iIdNuevoDetallesIngresosFacturas=0L;
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
	
	public Boolean isPermisoTodoDetallesIngresosFacturas;
	public Boolean isPermisoNuevoDetallesIngresosFacturas;
	public Boolean isPermisoActualizarDetallesIngresosFacturas;
	public Boolean isPermisoActualizarOriginalDetallesIngresosFacturas;
	public Boolean isPermisoEliminarDetallesIngresosFacturas;
	public Boolean isPermisoGuardarCambiosDetallesIngresosFacturas;
	public Boolean isPermisoConsultaDetallesIngresosFacturas;
	public Boolean isPermisoBusquedaDetallesIngresosFacturas;
	public Boolean isPermisoReporteDetallesIngresosFacturas;
	public Boolean isPermisoPaginacionMedioDetallesIngresosFacturas;
	public Boolean isPermisoPaginacionAltoDetallesIngresosFacturas;
	public Boolean isPermisoPaginacionTodoDetallesIngresosFacturas;
	public Boolean isPermisoCopiarDetallesIngresosFacturas;
	public Boolean isPermisoVerFormDetallesIngresosFacturas;
	public Boolean isPermisoDuplicarDetallesIngresosFacturas;
	public Boolean isPermisoOrdenDetallesIngresosFacturas;
	
	
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
	
	public DetallesIngresosFacturasParameterReturnGeneral detallesingresosfacturasReturnGeneral;
	public DetallesIngresosFacturasParameterReturnGeneral detallesingresosfacturasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetallesIngresosFacturas=false;
	public Boolean esParaAccionDesdeFormularioDetallesIngresosFacturas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetallesIngresosFacturasSessionBeanAdditional detallesingresosfacturasSessionBeanAdditional=null;
	
	public DetallesIngresosFacturasSessionBeanAdditional getDetallesIngresosFacturasSessionBeanAdditional() {
		return this.detallesingresosfacturasSessionBeanAdditional;
	}
	
	public void setDetallesIngresosFacturasSessionBeanAdditional(DetallesIngresosFacturasSessionBeanAdditional detallesingresosfacturasSessionBeanAdditional) {
		try {
			this.detallesingresosfacturasSessionBeanAdditional=detallesingresosfacturasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetallesIngresosFacturasBeanSwingJInternalFrameAdditional detallesingresosfacturasBeanSwingJInternalFrameAdditional=null;
	//public class DetallesIngresosFacturasBeanSwingJInternalFrame
	
	public DetallesIngresosFacturasBeanSwingJInternalFrameAdditional getDetallesIngresosFacturasBeanSwingJInternalFrameAdditional() {
		return this.detallesingresosfacturasBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetallesIngresosFacturasBeanSwingJInternalFrameAdditional(DetallesIngresosFacturasBeanSwingJInternalFrameAdditional detallesingresosfacturasBeanSwingJInternalFrameAdditional) {
		try {
			this.detallesingresosfacturasBeanSwingJInternalFrameAdditional=detallesingresosfacturasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetallesIngresosFacturasLogic detallesingresosfacturasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetallesIngresosFacturas detallesingresosfacturasBean;
	public DetallesIngresosFacturasConstantesFunciones detallesingresosfacturasConstantesFunciones;
	//public DetallesIngresosFacturasParameterReturnGeneral detallesingresosfacturasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<DetallesIngresosFacturas> detallesingresosfacturass;	
	//public List<DetallesIngresosFacturas> detallesingresosfacturassEliminados;
	//public List<DetallesIngresosFacturas> detallesingresosfacturassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetallesIngresosFacturas=false;
	public Boolean isVisibilidadCeldaDuplicarDetallesIngresosFacturas=true;
	public Boolean isVisibilidadCeldaCopiarDetallesIngresosFacturas=true;
	public Boolean isVisibilidadCeldaVerFormDetallesIngresosFacturas=true;
	public Boolean isVisibilidadCeldaOrdenDetallesIngresosFacturas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
	public Boolean isVisibilidadCeldaModificarDetallesIngresosFacturas=false;
	public Boolean isVisibilidadCeldaActualizarDetallesIngresosFacturas=false;
	public Boolean isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
	public Boolean isVisibilidadCeldaCancelarDetallesIngresosFacturas=false;
	public Boolean isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=false;	
	
	
	public Boolean isVisibilidadBusquedaDetallesIngresosFacturas=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDetallesIngresosFacturas() {
		return this.iIdNuevoDetallesIngresosFacturas;
	}

	public void setiIdNuevoDetallesIngresosFacturas(Long iIdNuevoDetallesIngresosFacturas) {
		this.iIdNuevoDetallesIngresosFacturas = iIdNuevoDetallesIngresosFacturas;
	}
	
	public Long getidDetallesIngresosFacturasActual() {
		return this.idDetallesIngresosFacturasActual;
	}

	public void setidDetallesIngresosFacturasActual(Long idDetallesIngresosFacturasActual) {
		this.idDetallesIngresosFacturasActual = idDetallesIngresosFacturasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetallesIngresosFacturas getdetallesingresosfacturas() {
		return this.detallesingresosfacturas;
	}

	public void setdetallesingresosfacturas(DetallesIngresosFacturas detallesingresosfacturas) {
		this.detallesingresosfacturas = detallesingresosfacturas;
	}
	
	public DetallesIngresosFacturas getdetallesingresosfacturasAux() {
		return this.detallesingresosfacturasAux;
	}

	public void setdetallesingresosfacturasAux(DetallesIngresosFacturas detallesingresosfacturasAux) {
		this.detallesingresosfacturasAux = detallesingresosfacturasAux;
	}				
	
	public DetallesIngresosFacturas getdetallesingresosfacturasAnterior() {
		return this.detallesingresosfacturasAnterior;
	}

	public void setdetallesingresosfacturasAnterior(DetallesIngresosFacturas detallesingresosfacturasAnterior) {
		this.detallesingresosfacturasAnterior = detallesingresosfacturasAnterior;
	}	
	
	public DetallesIngresosFacturas getdetallesingresosfacturasTotales() {
		return this.detallesingresosfacturasTotales;
	}

	public void setdetallesingresosfacturasTotales(DetallesIngresosFacturas detallesingresosfacturasTotales) {
		this.detallesingresosfacturasTotales = detallesingresosfacturasTotales;
	}	
	
	public DetallesIngresosFacturas getdetallesingresosfacturasBean() {
		return this.detallesingresosfacturasBean;
	}

	public void setdetallesingresosfacturasBean(DetallesIngresosFacturas detallesingresosfacturasBean) {
		this.detallesingresosfacturasBean = detallesingresosfacturasBean;
	}	
	
	public DetallesIngresosFacturasParameterReturnGeneral getdetallesingresosfacturasReturnGeneral() {
		return this.detallesingresosfacturasReturnGeneral;
	}

	public void setdetallesingresosfacturasReturnGeneral(DetallesIngresosFacturasParameterReturnGeneral detallesingresosfacturasReturnGeneral) {
		this.detallesingresosfacturasReturnGeneral = detallesingresosfacturasReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaDetallesIngresosFacturas=-1L;

	public Long getid_ejercicioBusquedaDetallesIngresosFacturas() {
		return this.id_ejercicioBusquedaDetallesIngresosFacturas;
	}

	public void setid_ejercicioBusquedaDetallesIngresosFacturas(Long id_ejercicioBusquedaDetallesIngresosFacturas) {
		this.id_ejercicioBusquedaDetallesIngresosFacturas = id_ejercicioBusquedaDetallesIngresosFacturas;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetallesIngresosFacturasLogic getDetallesIngresosFacturasLogic()	{		
		return detallesingresosfacturasLogic;
	}

	public void setDetallesIngresosFacturasLogic(DetallesIngresosFacturasLogic detallesingresosfacturasLogic) {
		this.detallesingresosfacturasLogic = detallesingresosfacturasLogic;
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
	
	public Boolean getIsEsNuevoDetallesIngresosFacturas() {
		return isEsNuevoDetallesIngresosFacturas;
	}

	public void setIsEsNuevoDetallesIngresosFacturas(Boolean isEsNuevoDetallesIngresosFacturas) {
		this.isEsNuevoDetallesIngresosFacturas = isEsNuevoDetallesIngresosFacturas;
	}

	public Boolean getEsParaAccionDesdeFormularioDetallesIngresosFacturas() {
		return esParaAccionDesdeFormularioDetallesIngresosFacturas;
	}
	
	public void setEsParaAccionDesdeFormularioDetallesIngresosFacturas(Boolean esParaAccionDesdeFormularioDetallesIngresosFacturas) {
		this.esParaAccionDesdeFormularioDetallesIngresosFacturas = esParaAccionDesdeFormularioDetallesIngresosFacturas;
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

			if(this.detallesingresosfacturasSessionBean==null) {
				this.detallesingresosfacturasSessionBean=new DetallesIngresosFacturasSessionBean();
			}

			if(!this.detallesingresosfacturasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallesingresosfacturasSessionBean.getlidEmpresaActual());
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

			if(this.detallesingresosfacturasSessionBean==null) {
				this.detallesingresosfacturasSessionBean=new DetallesIngresosFacturasSessionBean();
			}

			if(!this.detallesingresosfacturasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detallesingresosfacturasSessionBean.getlidSucursalActual());
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

			if(this.detallesingresosfacturasSessionBean==null) {
				this.detallesingresosfacturasSessionBean=new DetallesIngresosFacturasSessionBean();
			}

			if(!this.detallesingresosfacturasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(detallesingresosfacturasSessionBean.getlidEjercicioActual());
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

					if(this.detallesingresosfacturas!=null) {
						this.detallesingresosfacturas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
						this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetallesIngresosFacturas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetallesIngresosFacturasGenerico)throws Exception
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
				jComboBoxid_empresaDetallesIngresosFacturasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetallesIngresosFacturasGenerico!=null && jComboBoxid_empresaDetallesIngresosFacturasGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetallesIngresosFacturasGenerico.setSelectedIndex(0);
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

					if(this.detallesingresosfacturas!=null) {
						this.detallesingresosfacturas.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
						this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetallesIngresosFacturas.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetallesIngresosFacturasGenerico)throws Exception
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
				jComboBoxid_sucursalDetallesIngresosFacturasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetallesIngresosFacturasGenerico!=null && jComboBoxid_sucursalDetallesIngresosFacturasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetallesIngresosFacturasGenerico.setSelectedIndex(0);
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

					if(this.detallesingresosfacturas!=null) {
						this.detallesingresosfacturas.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
						this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetallesIngresosFacturas.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDetallesIngresosFacturas") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas!=null) {
						jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas!=null) {
							//jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetallesIngresosFacturasGenerico)throws Exception
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
				jComboBoxid_ejercicioDetallesIngresosFacturasGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetallesIngresosFacturasGenerico!=null && jComboBoxid_ejercicioDetallesIngresosFacturasGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetallesIngresosFacturasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetallesIngresosFacturas detallesingresosfacturas,JComboBox jComboBoxid_empresaDetallesIngresosFacturasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetallesIngresosFacturasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetallesIngresosFacturasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallesingresosfacturas.setid_empresa(empresaAux.getId());
				detallesingresosfacturas.setempresa_descripcion(DetallesIngresosFacturasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallesingresosfacturas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetallesIngresosFacturas detallesingresosfacturas,JComboBox jComboBoxid_sucursalDetallesIngresosFacturasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetallesIngresosFacturasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetallesIngresosFacturasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detallesingresosfacturas.setid_sucursal(sucursalAux.getId());
				detallesingresosfacturas.setsucursal_descripcion(DetallesIngresosFacturasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detallesingresosfacturas.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetallesIngresosFacturas detallesingresosfacturas,JComboBox jComboBoxid_ejercicioDetallesIngresosFacturasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetallesIngresosFacturasGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetallesIngresosFacturasGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detallesingresosfacturas.setid_ejercicio(ejercicioAux.getId());
				detallesingresosfacturas.setejercicio_descripcion(DetallesIngresosFacturasConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detallesingresosfacturas.setEjercicio(ejercicioAux);			}
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

					if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { 
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { 
					}

					if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { 
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { 
					}

					if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { 
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { 
					}

					if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDetallesIngresosFacturas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.addItem(ejercicio);
							}
						}

						if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetallesIngresosFacturas() throws Exception {
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
		
	public DetallesIngresosFacturasParameterReturnGeneral getDetallesIngresosFacturasParameterGeneral() {
		return this.detallesingresosfacturasParameterGeneral;
	}
	
	public void setDetallesIngresosFacturasParameterGeneral(DetallesIngresosFacturasParameterReturnGeneral detallesingresosfacturasParameterGeneral) {
		this.detallesingresosfacturasParameterGeneral = detallesingresosfacturasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetallesIngresosFacturas() {
		return isPermisoTodoDetallesIngresosFacturas;
	}

	public void setIsPermisoTodoDetallesIngresosFacturas(Boolean isPermisoTodoDetallesIngresosFacturas) {
		this.isPermisoTodoDetallesIngresosFacturas = isPermisoTodoDetallesIngresosFacturas;
	}

	public Boolean getIsPermisoNuevoDetallesIngresosFacturas() {
		return isPermisoNuevoDetallesIngresosFacturas;
	}

	public void setIsPermisoNuevoDetallesIngresosFacturas(Boolean isPermisoNuevoDetallesIngresosFacturas) {
		this.isPermisoNuevoDetallesIngresosFacturas = isPermisoNuevoDetallesIngresosFacturas;
	}

	public Boolean getIsPermisoActualizarDetallesIngresosFacturas() {
		return isPermisoActualizarDetallesIngresosFacturas;
	}

	public void setIsPermisoActualizarDetallesIngresosFacturas(Boolean isPermisoActualizarDetallesIngresosFacturas) {
		this.isPermisoActualizarDetallesIngresosFacturas = isPermisoActualizarDetallesIngresosFacturas;
	}

	public Boolean getIsPermisoEliminarDetallesIngresosFacturas() {
		return isPermisoEliminarDetallesIngresosFacturas;
	}

	public void setIsPermisoEliminarDetallesIngresosFacturas(Boolean isPermisoEliminarDetallesIngresosFacturas) {
		this.isPermisoEliminarDetallesIngresosFacturas = isPermisoEliminarDetallesIngresosFacturas;
	}

	public Boolean getIsPermisoGuardarCambiosDetallesIngresosFacturas() {
		return isPermisoGuardarCambiosDetallesIngresosFacturas;
	}

	public void setIsPermisoGuardarCambiosDetallesIngresosFacturas(Boolean isPermisoGuardarCambiosDetallesIngresosFacturas) {
		this.isPermisoGuardarCambiosDetallesIngresosFacturas = isPermisoGuardarCambiosDetallesIngresosFacturas;
	}
	
	public Boolean getIsPermisoConsultaDetallesIngresosFacturas() {
		return isPermisoConsultaDetallesIngresosFacturas;
	}

	public void setIsPermisoConsultaDetallesIngresosFacturas(Boolean isPermisoConsultaDetallesIngresosFacturas) {
		this.isPermisoConsultaDetallesIngresosFacturas = isPermisoConsultaDetallesIngresosFacturas;
	}

	public Boolean getIsPermisoBusquedaDetallesIngresosFacturas() {
		return isPermisoBusquedaDetallesIngresosFacturas;
	}

	public void setIsPermisoBusquedaDetallesIngresosFacturas(Boolean isPermisoBusquedaDetallesIngresosFacturas) {
		this.isPermisoBusquedaDetallesIngresosFacturas = isPermisoBusquedaDetallesIngresosFacturas;
	}

	public Boolean getIsPermisoReporteDetallesIngresosFacturas() {
		return isPermisoReporteDetallesIngresosFacturas;
	}

	public void setIsPermisoReporteDetallesIngresosFacturas(Boolean isPermisoReporteDetallesIngresosFacturas) {
		this.isPermisoReporteDetallesIngresosFacturas = isPermisoReporteDetallesIngresosFacturas;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetallesIngresosFacturas() {
		return isPermisoPaginacionMedioDetallesIngresosFacturas;
	}

	public void setIsPermisoPaginacionMedioDetallesIngresosFacturas(Boolean isPermisoPaginacionMedioDetallesIngresosFacturas) {
		this.isPermisoPaginacionMedioDetallesIngresosFacturas = isPermisoPaginacionMedioDetallesIngresosFacturas;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetallesIngresosFacturas() {
		return isPermisoPaginacionTodoDetallesIngresosFacturas;
	}

	public void setIsPermisoPaginacionTodoDetallesIngresosFacturas(Boolean isPermisoPaginacionTodoDetallesIngresosFacturas) {
		this.isPermisoPaginacionTodoDetallesIngresosFacturas = isPermisoPaginacionTodoDetallesIngresosFacturas;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetallesIngresosFacturas() {
		return isPermisoPaginacionAltoDetallesIngresosFacturas;
	}

	public void setIsPermisoPaginacionAltoDetallesIngresosFacturas(Boolean isPermisoPaginacionAltoDetallesIngresosFacturas) {
		this.isPermisoPaginacionAltoDetallesIngresosFacturas = isPermisoPaginacionAltoDetallesIngresosFacturas;
	}
	
	public Boolean getIsPermisoCopiarDetallesIngresosFacturas() {
		return isPermisoCopiarDetallesIngresosFacturas;
	}

	public void setIsPermisoCopiarDetallesIngresosFacturas(Boolean isPermisoCopiarDetallesIngresosFacturas) {
		this.isPermisoCopiarDetallesIngresosFacturas = isPermisoCopiarDetallesIngresosFacturas;
	}
	
	public Boolean getIsPermisoVerFormDetallesIngresosFacturas() {
		return isPermisoVerFormDetallesIngresosFacturas;
	}

	public void setIsPermisoVerFormDetallesIngresosFacturas(Boolean isPermisoVerFormDetallesIngresosFacturas) {
		this.isPermisoVerFormDetallesIngresosFacturas = isPermisoVerFormDetallesIngresosFacturas;
	}
	
	public Boolean getIsPermisoDuplicarDetallesIngresosFacturas() {
		return isPermisoDuplicarDetallesIngresosFacturas;
	}

	public void setIsPermisoDuplicarDetallesIngresosFacturas(Boolean isPermisoDuplicarDetallesIngresosFacturas) {
		this.isPermisoDuplicarDetallesIngresosFacturas = isPermisoDuplicarDetallesIngresosFacturas;
	}
	
	public Boolean getIsPermisoOrdenDetallesIngresosFacturas() {
		return isPermisoOrdenDetallesIngresosFacturas;
	}

	public void setIsPermisoOrdenDetallesIngresosFacturas(Boolean isPermisoOrdenDetallesIngresosFacturas) {
		this.isPermisoOrdenDetallesIngresosFacturas = isPermisoOrdenDetallesIngresosFacturas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetallesIngresosFacturas() {
		return isVisibilidadCeldaNuevoDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaNuevoDetallesIngresosFacturas(Boolean isVisibilidadCeldaNuevoDetallesIngresosFacturas) {
		this.isVisibilidadCeldaNuevoDetallesIngresosFacturas = isVisibilidadCeldaNuevoDetallesIngresosFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetallesIngresosFacturas() {
		return isVisibilidadCeldaDuplicarDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaDuplicarDetallesIngresosFacturas(Boolean isVisibilidadCeldaDuplicarDetallesIngresosFacturas) {
		this.isVisibilidadCeldaDuplicarDetallesIngresosFacturas = isVisibilidadCeldaDuplicarDetallesIngresosFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetallesIngresosFacturas() {
		return isVisibilidadCeldaCopiarDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaCopiarDetallesIngresosFacturas(Boolean isVisibilidadCeldaCopiarDetallesIngresosFacturas) {
		this.isVisibilidadCeldaCopiarDetallesIngresosFacturas = isVisibilidadCeldaCopiarDetallesIngresosFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetallesIngresosFacturas() {
		return isVisibilidadCeldaVerFormDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaVerFormDetallesIngresosFacturas(Boolean isVisibilidadCeldaVerFormDetallesIngresosFacturas) {
		this.isVisibilidadCeldaVerFormDetallesIngresosFacturas = isVisibilidadCeldaVerFormDetallesIngresosFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetallesIngresosFacturas() {
		return isVisibilidadCeldaOrdenDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaOrdenDetallesIngresosFacturas(Boolean isVisibilidadCeldaOrdenDetallesIngresosFacturas) {
		this.isVisibilidadCeldaOrdenDetallesIngresosFacturas = isVisibilidadCeldaOrdenDetallesIngresosFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas() {
		return isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas(Boolean isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas) {
		this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas = isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetallesIngresosFacturas() {
		return isVisibilidadCeldaModificarDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaModificarDetallesIngresosFacturas(Boolean isVisibilidadCeldaModificarDetallesIngresosFacturas) {
		this.isVisibilidadCeldaModificarDetallesIngresosFacturas = isVisibilidadCeldaModificarDetallesIngresosFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetallesIngresosFacturas() {
		return isVisibilidadCeldaActualizarDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaActualizarDetallesIngresosFacturas(Boolean isVisibilidadCeldaActualizarDetallesIngresosFacturas) {
		this.isVisibilidadCeldaActualizarDetallesIngresosFacturas = isVisibilidadCeldaActualizarDetallesIngresosFacturas;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetallesIngresosFacturas() {
		return isVisibilidadCeldaEliminarDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaEliminarDetallesIngresosFacturas(Boolean isVisibilidadCeldaEliminarDetallesIngresosFacturas) {
		this.isVisibilidadCeldaEliminarDetallesIngresosFacturas = isVisibilidadCeldaEliminarDetallesIngresosFacturas;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetallesIngresosFacturas() {
		return isVisibilidadCeldaCancelarDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaCancelarDetallesIngresosFacturas(Boolean isVisibilidadCeldaCancelarDetallesIngresosFacturas) {
		this.isVisibilidadCeldaCancelarDetallesIngresosFacturas = isVisibilidadCeldaCancelarDetallesIngresosFacturas;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetallesIngresosFacturas() {
		return isVisibilidadCeldaGuardarDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaGuardarDetallesIngresosFacturas(Boolean isVisibilidadCeldaGuardarDetallesIngresosFacturas) {
		this.isVisibilidadCeldaGuardarDetallesIngresosFacturas = isVisibilidadCeldaGuardarDetallesIngresosFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas() {
		return isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas(Boolean isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas) {
		this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas = isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas;
	}
		
	public DetallesIngresosFacturasSessionBean getdetallesingresosfacturasSessionBean() {
		return this.detallesingresosfacturasSessionBean;
	}
	
	public void setdetallesingresosfacturasSessionBean(DetallesIngresosFacturasSessionBean detallesingresosfacturasSessionBean) {
		this.detallesingresosfacturasSessionBean=detallesingresosfacturasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaDetallesIngresosFacturas() {
		return this.isVisibilidadBusquedaDetallesIngresosFacturas;
	}

	public void setisVisibilidadBusquedaDetallesIngresosFacturas(Boolean isVisibilidadBusquedaDetallesIngresosFacturas) {
		this.isVisibilidadBusquedaDetallesIngresosFacturas=isVisibilidadBusquedaDetallesIngresosFacturas;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detallesingresosfacturas,null);
				this.setActualParaGuardarSucursalForeignKey(detallesingresosfacturas,null);
				this.setActualParaGuardarEjercicioForeignKey(detallesingresosfacturas,null);
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
	
	public void bugActualizarReferenciaActual(DetallesIngresosFacturas detallesingresosfacturas,DetallesIngresosFacturas detallesingresosfacturasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetallesIngresosFacturas(detallesingresosfacturas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallesingresosfacturasAux.setId(detallesingresosfacturas.getId());
		detallesingresosfacturasAux.setVersionRow(detallesingresosfacturas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(DetallesIngresosFacturas detallesingresosfacturasLocal) throws Exception {
		
		if(this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetallesIngresosFacturas detallesingresosfacturasLocal) throws Exception {	
		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallesingresosfacturasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detallesingresosfacturasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detallesingresosfacturasLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetallesIngresosFacturasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallesingresosfacturasValidator.getInvalidValues(this.detallesingresosfacturas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetallesIngresosFacturas detallesingresosfacturas,List<DetallesIngresosFacturas> detallesingresosfacturass) throws Exception {
	}		
	
	public void actualizarSelectedLista(DetallesIngresosFacturas detallesingresosfacturas,List<DetallesIngresosFacturas> detallesingresosfacturass) throws Exception {
		try	{			
			DetallesIngresosFacturasConstantesFunciones.actualizarSelectedLista(detallesingresosfacturas,detallesingresosfacturass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetallesIngresosFacturas> detallesingresosfacturassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallesingresosfacturassLocal=this.detallesingresosfacturasLogic.getDetallesIngresosFacturass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallesingresosfacturassLocal=this.detallesingresosfacturass;
			}
			//ARCHITECTURE
		
			for(DetallesIngresosFacturas detallesingresosfacturasLocal:detallesingresosfacturassLocal) {
				if(this.permiteMantenimiento(detallesingresosfacturasLocal) && detallesingresosfacturasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetallesIngresosFacturasConstantesFunciones.getDetallesIngresosFacturasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetallesIngresosFacturasConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelfechaDetallesIngresosFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallesIngresosFacturasConstantesFunciones.TIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabeltipo_movimientoDetallesIngresosFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallesIngresosFacturasConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnumero_mayorDetallesIngresosFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallesIngresosFacturasConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnumero_facturaDetallesIngresosFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallesIngresosFacturasConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnombre_clienteDetallesIngresosFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallesIngresosFacturasConstantesFunciones.SIGLASPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelsiglas_pagoDetallesIngresosFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallesIngresosFacturasConstantesFunciones.NOMBREPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnombre_pagoDetallesIngresosFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallesIngresosFacturasConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelcodigoDetallesIngresosFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallesIngresosFacturasConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelcredito_mone_localDetallesIngresosFacturas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelfechaDetallesIngresosFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabeltipo_movimientoDetallesIngresosFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnumero_mayorDetallesIngresosFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnumero_facturaDetallesIngresosFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnombre_clienteDetallesIngresosFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelsiglas_pagoDetallesIngresosFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnombre_pagoDetallesIngresosFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelcodigoDetallesIngresosFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelcredito_mone_localDetallesIngresosFacturas,"");
		
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
		this.iIdNuevoDetallesIngresosFacturas--;	
		
		
		this.detallesingresosfacturasAux=new DetallesIngresosFacturas();
		
		this.detallesingresosfacturasAux.setId(this.iIdNuevoDetallesIngresosFacturas);
		this.detallesingresosfacturasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().add(this.detallesingresosfacturasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallesingresosfacturass.add(this.detallesingresosfacturasAux);
		}
		//ARCHITECTURE
		
		this.detallesingresosfacturas=this.detallesingresosfacturasAux;
		
		if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetallesIngresosFacturas(this.detallesingresosfacturas);
			this.setVariablesObjetoActualToFormularioForeignKeyDetallesIngresosFacturas(this.detallesingresosfacturas);
		}
				
		//this.setDefaultControlesDetallesIngresosFacturas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetallesIngresosFacturas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetallesIngresosFacturas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallesIngresosFacturas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturasBean,this.detallesingresosfacturas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetallesIngresosFacturas(this.detallesingresosfacturasReturnGeneral,this.detallesingresosfacturasBean,false);
		
		if(this.detallesingresosfacturasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetallesIngresosFacturas(this.detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetallesIngresosFacturas(this.detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturas());
		}
		
		if(this.detallesingresosfacturasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetallesIngresosFacturas(this.detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturas(),classes);//this.detallesingresosfacturasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetallesIngresosFacturas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetallesIngresosFacturas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.RecargarFormDetallesIngresosFacturas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetallesIngresosFacturas(false);
						
			if(detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallesIngresosFacturas();
			}
			
			this.actualizarVisualTableDatosDetallesIngresosFacturas();
			
			this.jTableDatosDetallesIngresosFacturas.setRowSelectionInterval(this.getIndiceNuevoDetallesIngresosFacturas(), this.getIndiceNuevoDetallesIngresosFacturas());
			
			this.seleccionarFilaTablaDetallesIngresosFacturasActual();
						
			this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetallesIngresosFacturas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jDateChooserfechaDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarfechaDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreatipo_movimientoDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activartipo_movimientoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanumero_mayorDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarnumero_mayorDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldnumero_facturaDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarnumero_facturaDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_clienteDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarnombre_clienteDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldsiglas_pagoDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarsiglas_pagoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_pagoDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarnombre_pagoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcodigoDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarcodigoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcredito_mone_localDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarcredito_mone_localDetallesIngresosFacturas);	
		//
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarid_empresaDetallesIngresosFacturas);//
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarid_sucursalDetallesIngresosFacturas);//
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.setEnabled(isHabilitar && this.detallesingresosfacturasConstantesFunciones.activarid_ejercicioDetallesIngresosFacturas);
	};
	
	public void setDefaultControlesDetallesIngresosFacturas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetallesIngresosFacturas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallesingresosfacturasSessionBean.setConGuardarRelaciones(true);			
			this.detallesingresosfacturasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTabbedPaneRelacionesDetallesIngresosFacturas.setVisible(true);
			
					
		} else {
			//this.detallesingresosfacturasSessionBean.setConGuardarRelaciones(false);			
			this.detallesingresosfacturasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTabbedPaneRelacionesDetallesIngresosFacturas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetallesIngresosFacturas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
				if(detallesingresosfacturasAux.getId().equals(this.iIdNuevoDetallesIngresosFacturas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturass) {
				if(detallesingresosfacturasAux.getId().equals(this.iIdNuevoDetallesIngresosFacturas)) {
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
	
	public int getIndiceActualDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
				if(detallesingresosfacturasAux.getId().equals(detallesingresosfacturas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturass) {
				if(detallesingresosfacturasAux.getId().equals(detallesingresosfacturas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
				if(detallesingresosfacturasAux.getDetallesIngresosFacturasOriginal().getId().equals(detallesingresosfacturasOriginal.getId())) {
					existe=true;
					detallesingresosfacturasOriginal.setId(detallesingresosfacturasAux.getId());
					detallesingresosfacturasOriginal.setVersionRow(detallesingresosfacturasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturass) {
				if(detallesingresosfacturasAux.getDetallesIngresosFacturasOriginal().getId().equals(detallesingresosfacturasOriginal.getId())) {
					existe=true;
					detallesingresosfacturasOriginal.setId(detallesingresosfacturasAux.getId());
					detallesingresosfacturasOriginal.setVersionRow(detallesingresosfacturasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetallesIngresosFacturas(Boolean esParaCancelar) throws Exception {
		detallesingresosfacturassAux=new ArrayList<DetallesIngresosFacturas>();
		detallesingresosfacturasAux=new DetallesIngresosFacturas();
		
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
					if(detallesingresosfacturasAux.getId()<0) {
						detallesingresosfacturassAux.add(detallesingresosfacturasAux);
					}		
				}
				this.iIdNuevoDetallesIngresosFacturas=0L;
				this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().removeAll(detallesingresosfacturassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturass) {
					if(detallesingresosfacturasAux.getId()<0) {
						detallesingresosfacturassAux.add(detallesingresosfacturasAux);
					}		
				}
				this.iIdNuevoDetallesIngresosFacturas=0L;
				this.detallesingresosfacturass.removeAll(detallesingresosfacturassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetallesIngresosFacturas 
					&& this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().size()>0
					) {
					detallesingresosfacturasAux=this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().get(this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().size() - 1);
				
					if(detallesingresosfacturasAux.getId()<0) {
						this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().remove(detallesingresosfacturasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetallesIngresosFacturas && this.detallesingresosfacturass.size()>0) {
					detallesingresosfacturasAux=this.detallesingresosfacturass.get(this.detallesingresosfacturass.size() - 1);
				
					if(detallesingresosfacturasAux.getId()<0) {
						this.detallesingresosfacturass.remove(detallesingresosfacturasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetallesIngresosFacturas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallesingresosfacturas.getId()<0) {
				this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().remove(this.detallesingresosfacturas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallesingresosfacturas.getId()<0) {
				this.detallesingresosfacturass.remove(this.detallesingresosfacturas);
			}
		}			
	}
	
	public void setEstadosInicialesDetallesIngresosFacturas(List<DetallesIngresosFacturas> detallesingresosfacturassAux) throws Exception {
		DetallesIngresosFacturasConstantesFunciones.setEstadosInicialesDetallesIngresosFacturas(detallesingresosfacturassAux);
	}
	
	public void setEstadosInicialesDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturasAux) throws Exception {
		DetallesIngresosFacturasConstantesFunciones.setEstadosInicialesDetallesIngresosFacturas(detallesingresosfacturasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetallesIngresosFacturasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetallesIngresosFacturasActual()) {
				if(!this.isEsNuevoDetallesIngresosFacturas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetallesIngresosFacturas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetallesIngresosFacturasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalles Ingresos Facturas ?", "MANTENIMIENTO DE Detalles Ingresos Facturas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetallesIngresosFacturas detallesingresosfacturas) throws Exception {
		DetallesIngresosFacturasConstantesFunciones.seleccionarAsignar(this.detallesingresosfacturas,detallesingresosfacturas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetallesIngresosFacturas=this.isPermisoActualizarOriginalDetallesIngresosFacturas;
			
			
			this.seleccionarAsignar(detallesingresosfacturas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallesingresosfacturasSessionBean.setsFuncionBusquedaRapida(this.detallesingresosfacturasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetallesIngresosFacturas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetallesIngresosFacturas(esParaCancelar);				
				this.cancelarNuevoDetallesIngresosFacturas(esParaCancelar);								
			}
			
			this.detallesingresosfacturas=new DetallesIngresosFacturas();
			
			this.inicializarDetallesIngresosFacturas();
			
			this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetallesIngresosFacturas() throws Exception {
		try {
			DetallesIngresosFacturasConstantesFunciones.inicializarDetallesIngresosFacturas(this.detallesingresosfacturas);
			
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
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetallesIngresosFacturass(String sAccionBusqueda,List<DetallesIngresosFacturas> detallesingresosfacturassParaReportes) throws Exception {
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
					sPathReporteFinal="DetallesIngresosFacturas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetallesIngresosFacturasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetallesIngresosFacturasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetallesIngresosFacturas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalles Ingresos Facturases");		
		parameters.put("busquedapor", DetallesIngresosFacturasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetallesIngresosFacturas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetallesIngresosFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetallesIngresosFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetallesIngresosFacturas=new JRBeanArrayDataSource(DetallesIngresosFacturasJInternalFrame.TraerDetallesIngresosFacturasBeans(detallesingresosfacturassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetallesIngresosFacturas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetallesIngresosFacturasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetallesIngresosFacturasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetallesIngresosFacturasBean.TraerDetallesIngresosFacturasBeans(detallesingresosfacturassParaReportes).toArray()));
							
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
				this.generarExcelReporteDetallesIngresosFacturass(sAccionBusqueda,sTipoArchivoReporte,detallesingresosfacturassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetallesIngresosFacturass(sAccionBusqueda,sTipoArchivoReporte,detallesingresosfacturassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturasActionPerformed(null);
					//this.generarExcelReporteDetallesIngresosFacturass(sAccionBusqueda,sTipoArchivoReporte,detallesingresosfacturassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetallesIngresosFacturass(sAccionBusqueda,sTipoArchivoReporte,detallesingresosfacturassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetallesIngresosFacturass(sAccionBusqueda,sTipoArchivoReporte,detallesingresosfacturassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetallesIngresosFacturass(sAccionBusqueda,sTipoArchivoReporte,detallesingresosfacturassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetallesIngresosFacturass(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallesIngresosFacturas> detallesingresosfacturassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallesingresosfacturas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallesIngresosFacturass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallesIngresosFacturas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetallesIngresosFacturas detallesingresosfacturas : detallesingresosfacturassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetallesIngresosFacturasConstantesFunciones.generarExcelReporteDataDetallesIngresosFacturas("NORMAL",row,workbook,detallesingresosfacturas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalles Ingresos Facturas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetallesIngresosFacturas(String sTipo,Row row,Workbook workbook) {
		
		DetallesIngresosFacturasConstantesFunciones.generarExcelReporteHeaderDetallesIngresosFacturas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetallesIngresosFacturass(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallesIngresosFacturas> detallesingresosfacturassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallesingresosfacturas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallesIngresosFacturass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetallesIngresosFacturas detallesingresosfacturas : detallesingresosfacturassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.getDetallesIngresosFacturasDescripcion(detallesingresosfacturas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.gettipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getsiglas_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getnombre_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallesingresosfacturas.getcredito_mone_local());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalles Ingresos Facturas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetallesIngresosFacturass(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallesIngresosFacturas> detallesingresosfacturassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetallesIngresosFacturas> detallesingresosfacturassRespaldo=null;
		
		classes=DetallesIngresosFacturasConstantesFunciones.getClassesRelationshipsOfDetallesIngresosFacturas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallesingresosfacturasLogic.setDatosCliente(this.datosCliente);
		this.detallesingresosfacturasLogic.setDatosDeep(this.datosDeep);
		this.detallesingresosfacturasLogic.setIsConDeep(true);
		
		detallesingresosfacturassRespaldo=this.detallesingresosfacturasLogic.getDetallesIngresosFacturass();
		
		this.detallesingresosfacturasLogic.setDetallesIngresosFacturass(detallesingresosfacturassParaReportes);	
		this.detallesingresosfacturasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallesingresosfacturassParaReportes=this.detallesingresosfacturasLogic.getDetallesIngresosFacturass();
		this.detallesingresosfacturasLogic.setDetallesIngresosFacturass(detallesingresosfacturassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallesingresosfacturas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallesIngresosFacturass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallesIngresosFacturas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetallesIngresosFacturas detallesingresosfacturas : detallesingresosfacturassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetallesIngresosFacturas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetallesIngresosFacturasConstantesFunciones.generarExcelReporteDataDetallesIngresosFacturas("NORMAL",row,workbook,detallesingresosfacturas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.getDetallesIngresosFacturasDescripcion(detallesingresosfacturas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalles Ingresos Facturas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetallesIngresosFacturas() throws Exception {		
		this.startProcessDetallesIngresosFacturas(true);
	}
	
	public void startProcessDetallesIngresosFacturas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetallesIngresosFacturas ,this.jPanelParametrosReportesDetallesIngresosFacturas, this.jScrollPanelDatosDetallesIngresosFacturas,this.jPanelPaginacionDetallesIngresosFacturas, this.jScrollPanelDatosEdicionDetallesIngresosFacturas, this.jPanelAccionesDetallesIngresosFacturas,this.jPanelAccionesFormularioDetallesIngresosFacturas,this.jmenuBarDetallesIngresosFacturas,this.jmenuBarDetalleDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,this.jTtoolBarDetalleDetallesIngresosFacturas);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallesIngresosFacturas=this.jTabbedPaneBusquedasDetallesIngresosFacturas; 
		
		final JPanel jPanelParametrosReportesDetallesIngresosFacturas=this.jPanelParametrosReportesDetallesIngresosFacturas;
		//final JScrollPane jScrollPanelDatosDetallesIngresosFacturas=this.jScrollPanelDatosDetallesIngresosFacturas;
		final JTable jTableDatosDetallesIngresosFacturas=this.jTableDatosDetallesIngresosFacturas;		
		final JPanel jPanelPaginacionDetallesIngresosFacturas=this.jPanelPaginacionDetallesIngresosFacturas;
		//final JScrollPane jScrollPanelDatosEdicionDetallesIngresosFacturas=this.jScrollPanelDatosEdicionDetallesIngresosFacturas;
		final JPanel jPanelAccionesDetallesIngresosFacturas=this.jPanelAccionesDetallesIngresosFacturas;
		
		JPanel jPanelCamposAuxiliarDetallesIngresosFacturas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetallesIngresosFacturas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			jPanelCamposAuxiliarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelCamposDetallesIngresosFacturas;
			jPanelAccionesFormularioAuxiliarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelAccionesFormularioDetallesIngresosFacturas;
		}
		
		final JPanel jPanelCamposDetallesIngresosFacturas=jPanelCamposAuxiliarDetallesIngresosFacturas;
		final JPanel jPanelAccionesFormularioDetallesIngresosFacturas=jPanelAccionesFormularioAuxiliarDetallesIngresosFacturas;
		
		
		final JMenuBar jmenuBarDetallesIngresosFacturas=this.jmenuBarDetallesIngresosFacturas;
		final JToolBar jTtoolBarDetallesIngresosFacturas=this.jTtoolBarDetallesIngresosFacturas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetallesIngresosFacturas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallesIngresosFacturas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			jmenuBarDetalleAuxiliarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jmenuBarDetalleDetallesIngresosFacturas;
			jTtoolBarDetalleAuxiliarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTtoolBarDetalleDetallesIngresosFacturas;
		}
		
		final JMenuBar jmenuBarDetalleDetallesIngresosFacturas=jmenuBarDetalleAuxiliarDetallesIngresosFacturas;
		final JToolBar jTtoolBarDetalleDetallesIngresosFacturas=jTtoolBarDetalleAuxiliarDetallesIngresosFacturas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallesIngresosFacturas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallesIngresosFacturas;
			processRunnable.jTableDatos=jTableDatosDetallesIngresosFacturas;
			processRunnable.jPanelCampos=jPanelCamposDetallesIngresosFacturas;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallesIngresosFacturas;
			processRunnable.jPanelAcciones=jPanelAccionesDetallesIngresosFacturas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallesIngresosFacturas;
			
			
			processRunnable.jmenuBar=jmenuBarDetallesIngresosFacturas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallesIngresosFacturas;
			processRunnable.jTtoolBar=jTtoolBarDetallesIngresosFacturas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallesIngresosFacturas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallesIngresosFacturas ,jPanelParametrosReportesDetallesIngresosFacturas,jTableDatosDetallesIngresosFacturas, /*jScrollPanelDatosDetallesIngresosFacturas,*/jPanelCamposDetallesIngresosFacturas,jPanelPaginacionDetallesIngresosFacturas, /*jScrollPanelDatosEdicionDetallesIngresosFacturas,*/ jPanelAccionesDetallesIngresosFacturas,jPanelAccionesFormularioDetallesIngresosFacturas,jmenuBarDetallesIngresosFacturas,jmenuBarDetalleDetallesIngresosFacturas,jTtoolBarDetallesIngresosFacturas,jTtoolBarDetalleDetallesIngresosFacturas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallesIngresosFacturas ,jPanelParametrosReportesDetallesIngresosFacturas, jScrollPanelDatosDetallesIngresosFacturas,jPanelPaginacionDetallesIngresosFacturas, jScrollPanelDatosEdicionDetallesIngresosFacturas, jPanelAccionesDetallesIngresosFacturas,jPanelAccionesFormularioDetallesIngresosFacturas,jmenuBarDetallesIngresosFacturas,jmenuBarDetalleDetallesIngresosFacturas,jTtoolBarDetallesIngresosFacturas,jTtoolBarDetalleDetallesIngresosFacturas);
						
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
	
	public void finishProcessDetallesIngresosFacturas() {// throws Exception 
		this.finishProcessDetallesIngresosFacturas(true);
	}
	
	public void finishProcessDetallesIngresosFacturas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetallesIngresosFacturas ,this.jPanelParametrosReportesDetallesIngresosFacturas, this.jScrollPanelDatosDetallesIngresosFacturas,this.jPanelPaginacionDetallesIngresosFacturas, this.jScrollPanelDatosEdicionDetallesIngresosFacturas, this.jPanelAccionesDetallesIngresosFacturas,this.jPanelAccionesFormularioDetallesIngresosFacturas,this.jmenuBarDetallesIngresosFacturas,this.jmenuBarDetalleDetallesIngresosFacturas,this.jTtoolBarDetallesIngresosFacturas,this.jTtoolBarDetalleDetallesIngresosFacturas);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallesIngresosFacturas=this.jTabbedPaneBusquedasDetallesIngresosFacturas; 
		
		final JPanel jPanelParametrosReportesDetallesIngresosFacturas=this.jPanelParametrosReportesDetallesIngresosFacturas;
		//final JScrollPane jScrollPanelDatosDetallesIngresosFacturas=this.jScrollPanelDatosDetallesIngresosFacturas;
		final JTable jTableDatosDetallesIngresosFacturas=this.jTableDatosDetallesIngresosFacturas;		
		final JPanel jPanelPaginacionDetallesIngresosFacturas=this.jPanelPaginacionDetallesIngresosFacturas;
		//final JScrollPane jScrollPanelDatosEdicionDetallesIngresosFacturas=this.jScrollPanelDatosEdicionDetallesIngresosFacturas;
		final JPanel jPanelAccionesDetallesIngresosFacturas=this.jPanelAccionesDetallesIngresosFacturas;
		
		JPanel jPanelCamposAuxiliarDetallesIngresosFacturas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetallesIngresosFacturas=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			jPanelCamposAuxiliarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelCamposDetallesIngresosFacturas;
			jPanelAccionesFormularioAuxiliarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelAccionesFormularioDetallesIngresosFacturas;
		}
		
		final JPanel jPanelCamposDetallesIngresosFacturas=jPanelCamposAuxiliarDetallesIngresosFacturas;
		final JPanel jPanelAccionesFormularioDetallesIngresosFacturas=jPanelAccionesFormularioAuxiliarDetallesIngresosFacturas;
		
		
		final JMenuBar jmenuBarDetallesIngresosFacturas=this.jmenuBarDetallesIngresosFacturas;		
		final JToolBar jTtoolBarDetallesIngresosFacturas=this.jTtoolBarDetallesIngresosFacturas;
				
		JMenuBar jmenuBarDetalleAuxiliarDetallesIngresosFacturas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallesIngresosFacturas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			jmenuBarDetalleAuxiliarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jmenuBarDetalleDetallesIngresosFacturas;
			jTtoolBarDetalleAuxiliarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTtoolBarDetalleDetallesIngresosFacturas;		
		}
		
		final JMenuBar jmenuBarDetalleDetallesIngresosFacturas=jmenuBarDetalleAuxiliarDetallesIngresosFacturas;
		final JToolBar jTtoolBarDetalleDetallesIngresosFacturas=jTtoolBarDetalleAuxiliarDetallesIngresosFacturas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallesIngresosFacturas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallesIngresosFacturas;
			processRunnable.jTableDatos=jTableDatosDetallesIngresosFacturas;
			processRunnable.jPanelCampos=jPanelCamposDetallesIngresosFacturas;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallesIngresosFacturas;
			processRunnable.jPanelAcciones=jPanelAccionesDetallesIngresosFacturas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallesIngresosFacturas;
			
			
			processRunnable.jmenuBar=jmenuBarDetallesIngresosFacturas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallesIngresosFacturas;
			processRunnable.jTtoolBar=jTtoolBarDetallesIngresosFacturas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallesIngresosFacturas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetallesIngresosFacturas ,jPanelParametrosReportesDetallesIngresosFacturas, jTableDatosDetallesIngresosFacturas,/*jScrollPanelDatosDetallesIngresosFacturas,*/jPanelCamposDetallesIngresosFacturas,jPanelPaginacionDetallesIngresosFacturas, /*jScrollPanelDatosEdicionDetallesIngresosFacturas,*/ jPanelAccionesDetallesIngresosFacturas,jPanelAccionesFormularioDetallesIngresosFacturas,jmenuBarDetallesIngresosFacturas,jmenuBarDetalleDetallesIngresosFacturas,jTtoolBarDetallesIngresosFacturas,jTtoolBarDetalleDetallesIngresosFacturas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetallesIngresosFacturas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetallesIngresosFacturas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetallesIngresosFacturas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetallesIngresosFacturas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallesIngresosFacturas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetallesIngresosFacturas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetallesIngresosFacturas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetallesIngresosFacturas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetallesIngresosFacturas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallesingresosfacturasConstantesFunciones.getsFinalQueryDetallesIngresosFacturas();
		String  finalQueryPaginacionTodos=this.detallesingresosfacturasConstantesFunciones.getsFinalQueryDetallesIngresosFacturas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetallesIngresosFacturasConstantesFunciones.getArrayColumnasGlobalesNoDetallesIngresosFacturas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetallesIngresosFacturasConstantesFunciones.getArrayColumnasGlobalesDetallesIngresosFacturas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetallesIngresosFacturasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallesingresosfacturassEliminados= new ArrayList<DetallesIngresosFacturas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetallesIngresosFacturas();
		
				///*DetallesIngresosFacturasSessionBean*/this.detallesingresosfacturasSessionBean=new DetallesIngresosFacturasSessionBean();
			
			if(this.detallesingresosfacturasSessionBean==null) {
				this.detallesingresosfacturasSessionBean=new DetallesIngresosFacturasSessionBean();
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
					this.iNumeroPaginacion=DetallesIngresosFacturasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetallesIngresosFacturasConstantesFunciones.getClassesForeignKeysOfDetallesIngresosFacturas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallesingresosfacturas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallesingresosfacturassAux= new ArrayList<DetallesIngresosFacturas>();
			
				
			detallesingresosfacturasLogic.setDatosCliente(this.datosCliente);
			detallesingresosfacturasLogic.setDatosDeep(this.datosDeep);
			detallesingresosfacturasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaDetallesIngresosFacturas")) {
				this.sDetalleReporte=DetallesIngresosFacturasConstantesFunciones.getDetalleIndiceBusquedaDetallesIngresosFacturas(id_ejercicioBusquedaDetallesIngresosFacturas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallesingresosfacturasLogic.getDetallesIngresosFacturassBusquedaDetallesIngresosFacturas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaDetallesIngresosFacturas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallesIngresosFacturasConstantesFunciones.getDetalleIndiceBusquedaDetallesIngresosFacturas(id_ejercicioBusquedaDetallesIngresosFacturas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallesIngresosFacturasConstantesFunciones.getDetalleIndiceBusquedaDetallesIngresosFacturas(id_ejercicioBusquedaDetallesIngresosFacturas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallesingresosfacturasLogic.getDetallesIngresosFacturass()==null||detallesingresosfacturasLogic.getDetallesIngresosFacturass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallesingresosfacturass==null|| detallesingresosfacturass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallesingresosfacturassAux=new ArrayList<DetallesIngresosFacturas>();
						detallesingresosfacturassAux.addAll(detallesingresosfacturasLogic.getDetallesIngresosFacturass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallesingresosfacturassAux=new ArrayList<DetallesIngresosFacturas>();
							detallesingresosfacturassAux.addAll(detallesingresosfacturass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallesingresosfacturasLogic.getDetallesIngresosFacturassBusquedaDetallesIngresosFacturas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaDetallesIngresosFacturas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallesIngresosFacturasConstantesFunciones.getDetalleIndiceBusquedaDetallesIngresosFacturas(id_ejercicioBusquedaDetallesIngresosFacturas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallesIngresosFacturasConstantesFunciones.getDetalleIndiceBusquedaDetallesIngresosFacturas(id_ejercicioBusquedaDetallesIngresosFacturas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallesIngresosFacturass("BusquedaDetallesIngresosFacturas",detallesingresosfacturasLogic.getDetallesIngresosFacturass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallesIngresosFacturass("BusquedaDetallesIngresosFacturas",detallesingresosfacturass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallesingresosfacturasLogic.setDetallesIngresosFacturass(new ArrayList<DetallesIngresosFacturas>());
						detallesingresosfacturasLogic.getDetallesIngresosFacturass().addAll(detallesingresosfacturassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallesingresosfacturass=new ArrayList<DetallesIngresosFacturas>();
							detallesingresosfacturass.addAll(detallesingresosfacturassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetallesIngresosFacturas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetallesIngresosFacturas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallesingresosfacturasLogic.getDetallesIngresosFacturass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallesingresosfacturass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallesingresosfacturasLogic.getDetallesIngresosFacturass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallesingresosfacturass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetallesIngresosFacturas detallesingresosfacturas) {
		Boolean permite=true;
		
		if(this.detallesingresosfacturas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetallesIngresosFacturasConstantesFunciones.getOrderByListaDetallesIngresosFacturas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetallesIngresosFacturasConstantesFunciones.getOrderByListaDetallesIngresosFacturas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
				if(detallesingresosfacturas.getsType().equals(Constantes2.S_TOTALES)) {
					detallesingresosfacturasTotales=detallesingresosfacturas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallesIngresosFacturas detallesingresosfacturas:this.detallesingresosfacturass) {
				if(detallesingresosfacturas.getsType().equals(Constantes2.S_TOTALES)) {
					detallesingresosfacturasTotales=detallesingresosfacturas;
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
			this.detallesingresosfacturasAux=new DetallesIngresosFacturas();
			this.detallesingresosfacturasAux.setsType(Constantes2.S_TOTALES);
			this.detallesingresosfacturasAux.setIsNew(false);
			this.detallesingresosfacturasAux.setIsChanged(false);
			this.detallesingresosfacturasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//DetallesIngresosFacturasConstantesFunciones.TotalizarValoresFilaDetallesIngresosFacturas(this.detallesingresosfacturasLogic.getDetallesIngresosFacturass(),this.detallesingresosfacturasAux);
				
				//this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().add(this.detallesingresosfacturasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetallesIngresosFacturasConstantesFunciones.TotalizarValoresFilaDetallesIngresosFacturas(this.detallesingresosfacturass,this.detallesingresosfacturasAux);
				
				this.detallesingresosfacturass.add(this.detallesingresosfacturasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallesingresosfacturasTotales=new DetallesIngresosFacturas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().remove(detallesingresosfacturasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallesingresosfacturass.remove(detallesingresosfacturasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallesingresosfacturasTotales=new DetallesIngresosFacturas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
				if(detallesingresosfacturas.getsType().equals(Constantes2.S_TOTALES)) {
					detallesingresosfacturasTotales=detallesingresosfacturas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallesIngresosFacturasConstantesFunciones.TotalizarValoresFilaDetallesIngresosFacturas(this.detallesingresosfacturasLogic.getDetallesIngresosFacturass(),detallesingresosfacturasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallesIngresosFacturas detallesingresosfacturas:this.detallesingresosfacturass) {
				if(detallesingresosfacturas.getsType().equals(Constantes2.S_TOTALES)) {
					detallesingresosfacturasTotales=detallesingresosfacturas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallesIngresosFacturasConstantesFunciones.TotalizarValoresFilaDetallesIngresosFacturas(this.detallesingresosfacturass,detallesingresosfacturasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetallesIngresosFacturassBusquedaDetallesIngresosFacturas()throws Exception {
		try {
			sAccionBusqueda="BusquedaDetallesIngresosFacturas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallesIngresosFacturassFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallesIngresosFacturassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallesIngresosFacturassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetallesIngresosFacturassBusquedaDetallesIngresosFacturas(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallesingresosfacturasLogic.getDetallesIngresosFacturassBusquedaDetallesIngresosFacturas(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallesIngresosFacturassFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallesingresosfacturasLogic.getDetallesIngresosFacturassFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallesIngresosFacturassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallesingresosfacturasLogic.getDetallesIngresosFacturassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallesIngresosFacturassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallesingresosfacturasLogic.getDetallesIngresosFacturassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosDetallesIngresosFacturas() {
		this.isPermisoTodoDetallesIngresosFacturas=false;
		this.isPermisoNuevoDetallesIngresosFacturas=false;
		this.isPermisoActualizarDetallesIngresosFacturas=false;
		this.isPermisoActualizarOriginalDetallesIngresosFacturas=false;
		this.isPermisoEliminarDetallesIngresosFacturas=false;
		this.isPermisoGuardarCambiosDetallesIngresosFacturas=false;
		this.isPermisoConsultaDetallesIngresosFacturas=true;
		this.isPermisoBusquedaDetallesIngresosFacturas=true;
		this.isPermisoReporteDetallesIngresosFacturas=true;
		this.isPermisoOrdenDetallesIngresosFacturas=false;		
		this.isPermisoPaginacionMedioDetallesIngresosFacturas=false;		
		this.isPermisoPaginacionAltoDetallesIngresosFacturas=false;		
		this.isPermisoPaginacionTodoDetallesIngresosFacturas=false;		
		this.isPermisoCopiarDetallesIngresosFacturas=false;		
		this.isPermisoVerFormDetallesIngresosFacturas=false;		
		this.isPermisoDuplicarDetallesIngresosFacturas=false;
		this.isPermisoOrdenDetallesIngresosFacturas=false;
	}
	
	public void setPermisosUsuarioDetallesIngresosFacturas(Boolean isPermiso) {
		this.isPermisoTodoDetallesIngresosFacturas=isPermiso;
		this.isPermisoNuevoDetallesIngresosFacturas=isPermiso;
		this.isPermisoActualizarDetallesIngresosFacturas=isPermiso;
		this.isPermisoActualizarOriginalDetallesIngresosFacturas=isPermiso;
		this.isPermisoEliminarDetallesIngresosFacturas=isPermiso;
		this.isPermisoGuardarCambiosDetallesIngresosFacturas=isPermiso;
		this.isPermisoConsultaDetallesIngresosFacturas=isPermiso;
		this.isPermisoBusquedaDetallesIngresosFacturas=isPermiso;
		this.isPermisoReporteDetallesIngresosFacturas=isPermiso;
		this.isPermisoOrdenDetallesIngresosFacturas=isPermiso;		
		this.isPermisoPaginacionMedioDetallesIngresosFacturas=isPermiso;		
		this.isPermisoPaginacionAltoDetallesIngresosFacturas=isPermiso;		
		this.isPermisoPaginacionTodoDetallesIngresosFacturas=isPermiso;		
		this.isPermisoCopiarDetallesIngresosFacturas=isPermiso;		
		this.isPermisoVerFormDetallesIngresosFacturas=isPermiso;		
		this.isPermisoDuplicarDetallesIngresosFacturas=isPermiso;
		this.isPermisoOrdenDetallesIngresosFacturas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetallesIngresosFacturas(Boolean isPermiso) {
		//this.isPermisoTodoDetallesIngresosFacturas=isPermiso;
		this.isPermisoNuevoDetallesIngresosFacturas=isPermiso;
		this.isPermisoActualizarDetallesIngresosFacturas=isPermiso;
		this.isPermisoActualizarOriginalDetallesIngresosFacturas=isPermiso;
		this.isPermisoEliminarDetallesIngresosFacturas=isPermiso;
		this.isPermisoGuardarCambiosDetallesIngresosFacturas=isPermiso;
		//this.isPermisoConsultaDetallesIngresosFacturas=isPermiso;
		//this.isPermisoBusquedaDetallesIngresosFacturas=isPermiso;
		//this.isPermisoReporteDetallesIngresosFacturas=isPermiso;
		//this.isPermisoOrdenDetallesIngresosFacturas=isPermiso;		
		//this.isPermisoPaginacionMedioDetallesIngresosFacturas=isPermiso;		
		//this.isPermisoPaginacionAltoDetallesIngresosFacturas=isPermiso;		
		//this.isPermisoPaginacionTodoDetallesIngresosFacturas=isPermiso;		
		//this.isPermisoCopiarDetallesIngresosFacturas=isPermiso;		
		//this.isPermisoDuplicarDetallesIngresosFacturas=isPermiso;
		//this.isPermisoOrdenDetallesIngresosFacturas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetallesIngresosFacturasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetallesIngresosFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetallesIngresosFacturas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetallesIngresosFacturasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetallesIngresosFacturasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetallesIngresosFacturasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetallesIngresosFacturasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetallesIngresosFacturas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetallesIngresosFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetallesIngresosFacturasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetallesIngresosFacturas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetallesIngresosFacturas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetallesIngresosFacturas=this.isPermisoActualizarDetallesIngresosFacturas;
			this.isPermisoEliminarDetallesIngresosFacturas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetallesIngresosFacturas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetallesIngresosFacturas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetallesIngresosFacturas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetallesIngresosFacturas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetallesIngresosFacturas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallesIngresosFacturas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetallesIngresosFacturas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetallesIngresosFacturas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetallesIngresosFacturas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetallesIngresosFacturas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetallesIngresosFacturas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetallesIngresosFacturas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallesIngresosFacturas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetallesIngresosFacturas.setToolTipText(this.jTableDatosDetallesIngresosFacturas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetallesIngresosFacturas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetallesIngresosFacturas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetallesIngresosFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetallesIngresosFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetallesIngresosFacturas() throws Exception {
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
	public void inicializarCombosForeignKeyDetallesIngresosFacturasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetallesIngresosFacturasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetallesIngresosFacturasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyDetallesIngresosFacturas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detallesingresosfacturasSessionBean==null) {
				this.detallesingresosfacturasSessionBean=new DetallesIngresosFacturasSessionBean();
			}

			if(!this.detallesingresosfacturasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detallesingresosfacturasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.detallesingresosfacturasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
	
	public void initActionsCombosTodosForeignKeyDetallesIngresosFacturas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetallesIngresosFacturas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetallesIngresosFacturas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallesIngresosFacturas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetallesIngresosFacturas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetallesIngresosFacturas()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetallesIngresosFacturas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetallesIngresosFacturas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetallesIngresosFacturas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetallesIngresosFacturas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetallesIngresosFacturas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetallesIngresosFacturas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public DetallesIngresosFacturasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetallesIngresosFacturasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetallesIngresosFacturasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallesingresosfacturasSessionBean=new DetallesIngresosFacturasSessionBean(); 
		this.detallesingresosfacturasConstantesFunciones=new DetallesIngresosFacturasConstantesFunciones(); 
		this.detallesingresosfacturasBean=new DetallesIngresosFacturas();//(this.detallesingresosfacturasConstantesFunciones); 		
		this.detallesingresosfacturasReturnGeneral=new DetallesIngresosFacturasParameterReturnGeneral(); 
		
		this.detallesingresosfacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallesingresosfacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetallesIngresosFacturasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetallesIngresosFacturasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetallesIngresosFacturasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetallesIngresosFacturas(true);
			
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
			
			this.detallesingresosfacturasConstantesFunciones=new DetallesIngresosFacturasConstantesFunciones(); 
			this.detallesingresosfacturasBean=new DetallesIngresosFacturas();//this.detallesingresosfacturasConstantesFunciones); 			
			this.detallesingresosfacturasReturnGeneral=new DetallesIngresosFacturasParameterReturnGeneral(); 
		
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalles Ingresos Facturas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallesingresosfacturas=new DetallesIngresosFacturas();
			this.detallesingresosfacturass = new ArrayList<DetallesIngresosFacturas>();
			this.detallesingresosfacturassAux = new ArrayList<DetallesIngresosFacturas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic=new DetallesIngresosFacturasLogic();
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}
			
			//this.detallesingresosfacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallesingresosfacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetallesIngresosFacturas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallesIngresosFacturas);	
					}
					
					if(this.jInternalFrameImportacionDetallesIngresosFacturas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallesIngresosFacturas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetallesIngresosFacturas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetallesIngresosFacturas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallesIngresosFacturas);
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.setVisible(false);
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas);
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setVisible(false);
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetallesIngresosFacturas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetallesIngresosFacturas);
					this.jInternalFrameImportacionDetallesIngresosFacturas.setVisible(false);
					this.jInternalFrameImportacionDetallesIngresosFacturas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetallesIngresosFacturas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetallesIngresosFacturas);
					this.jInternalFrameOrderByDetallesIngresosFacturas.setVisible(false);
					this.jInternalFrameOrderByDetallesIngresosFacturas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetallesIngresosFacturasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetallesIngresosFacturasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallesingresosfacturasReturnGeneral=new DetallesIngresosFacturasParameterReturnGeneral();
			
			this.detallesingresosfacturasParameterGeneral=new DetallesIngresosFacturasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallesingresosfacturasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetallesIngresosFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallesIngresosFacturasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),this.detallesingresosfacturasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallesIngresosFacturasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),this.detallesingresosfacturasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaDuplicarDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaCopiarDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaVerFormDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaOrdenDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=false;
			
			
			this.isVisibilidadBusquedaDetallesIngresosFacturas=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetallesIngresosFacturas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetallesIngresosFacturas(false);
			
			this.setPermisosUsuarioDetallesIngresosFacturas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() 
				|| (this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() && this.detallesingresosfacturasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetallesIngresosFacturasClasesRelacionadas();
			}
			
			if(this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetallesIngresosFacturasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetallesIngresosFacturas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetallesIngresosFacturas();
			}
			
			if(!this.isPermisoBusquedaDetallesIngresosFacturas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetallesIngresosFacturasConstantesFunciones.getTiposSeleccionarDetallesIngresosFacturas());
				
				this.tiposColumnasSelect=DetallesIngresosFacturasConstantesFunciones.getTiposSeleccionarDetallesIngresosFacturas(true);
				
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
			//if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetallesIngresosFacturas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioDetallesIngresosFacturas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioDetallesIngresosFacturas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallesIngresosFacturas() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detallesingresosfacturasImplementable= (DetallesIngresosFacturasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallesIngresosFacturasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallesingresosfacturasImplementableHome= (DetallesIngresosFacturasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallesIngresosFacturasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallesingresosfacturass= new ArrayList<DetallesIngresosFacturas>();
			this.detallesingresosfacturassEliminados= new ArrayList<DetallesIngresosFacturas>();
						
			this.isEsNuevoDetallesIngresosFacturas=false;
			this.esParaAccionDesdeFormularioDetallesIngresosFacturas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetallesIngresosFacturas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetallesIngresosFacturas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetallesIngresosFacturasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetallesIngresosFacturas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetallesIngresosFacturas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetallesIngresosFacturas();
			}
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetallesIngresosFacturas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetallesIngresosFacturas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetallesIngresosFacturas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetallesIngresosFacturas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetallesIngresosFacturas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetallesIngresosFacturas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetallesIngresosFacturas")) {
				iIndex=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTabbedPaneRelacionesDetallesIngresosFacturas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTabbedPaneRelacionesDetallesIngresosFacturas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetallesIngresosFacturas();	
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
	
	public void cargarCombosForeignKeyDetallesIngresosFacturas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetallesIngresosFacturas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetallesIngresosFacturas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetallesIngresosFacturasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetallesIngresosFacturas();
		
		this.cargarCombosFrameForeignKeyDetallesIngresosFacturas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetallesIngresosFacturas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetallesIngresosFacturas();
		}
	}
	
	
	
	public void jButtonNuevoDetallesIngresosFacturasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
			
			if(jTableDatosDetallesIngresosFacturas.getRowCount()>=1) {
				jTableDatosDetallesIngresosFacturas.removeRowSelectionInterval(0, jTableDatosDetallesIngresosFacturas.getRowCount()-1);						
			}
			
			this.isEsNuevoDetallesIngresosFacturas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetallesIngresosFacturas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetallesIngresosFacturas(true);			
			//this.detallesingresosfacturas=new DetallesIngresosFacturas();
			//this.detallesingresosfacturas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallesIngresosFacturas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallesIngresosFacturas() ;
			
			if(DetallesIngresosFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallesIngresosFacturas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallesingresosfacturas);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);				
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
			if(this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetallesIngresosFacturas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetallesIngresosFacturasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetallesIngresosFacturas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetallesIngresosFacturas.getSelectedRows().length;			
			}
			
			detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetallesIngresosFacturas--;			
				//DetallesIngresosFacturas detallesingresosfacturasAux= new DetallesIngresosFacturas();			
				//detallesingresosfacturasAux.setId(this.iIdNuevoDetallesIngresosFacturas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetallesIngresosFacturas detallesingresosfacturasOrigen=new DetallesIngresosFacturas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetallesIngresosFacturas detallesingresosfacturasOrigen : detallesingresosfacturassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallesingresosfacturasOrigen =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallesingresosfacturasOrigen =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetallesIngresosFacturas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallesingresosfacturas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetallesIngresosFacturas(detallesingresosfacturasOrigen,this.detallesingresosfacturas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().add(this.detallesingresosfacturasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturass.add(this.detallesingresosfacturasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
				
				this.jTableDatosDetallesIngresosFacturas.setRowSelectionInterval(this.getIndiceNuevoDetallesIngresosFacturas(), this.getIndiceNuevoDetallesIngresosFacturas());
				
				int iLastRow =  this.jTableDatosDetallesIngresosFacturas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallesIngresosFacturas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallesIngresosFacturas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();									
		
			DetallesIngresosFacturas detallesingresosfacturasOrigen=new DetallesIngresosFacturas();
			DetallesIngresosFacturas detallesingresosfacturasDestino=new DetallesIngresosFacturas();
				
			detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetallesIngresosFacturas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallesingresosfacturassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetallesIngresosFacturas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallesingresosfacturasOrigen =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallesingresosfacturasOrigen =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallesingresosfacturasDestino =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallesingresosfacturasDestino =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallesingresosfacturasOrigen =detallesingresosfacturassSeleccionados.get(0);
				detallesingresosfacturasDestino =detallesingresosfacturassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetallesIngresosFacturas(detallesingresosfacturasOrigen,detallesingresosfacturasDestino,true,false);
				
				detallesingresosfacturasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallesingresosfacturasDestino,detallesingresosfacturasLogic.getDetallesIngresosFacturass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallesingresosfacturasDestino,detallesingresosfacturass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
				
				//this.jTableDatosDetallesIngresosFacturas.setRowSelectionInterval(this.getIndiceNuevoDetallesIngresosFacturas(), this.getIndiceNuevoDetallesIngresosFacturas());
				
				int iLastRow =  this.jTableDatosDetallesIngresosFacturas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallesIngresosFacturas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallesIngresosFacturas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetallesIngresosFacturas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(!isVisible);
			this.jPanelPaginacionDetallesIngresosFacturas.setVisible(!isVisible);
			this.jPanelAccionesDetallesIngresosFacturas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetallesIngresosFacturas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetallesIngresosFacturas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetallesIngresosFacturas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetallesIngresosFacturas();
			
			this.abrirFrameOrderByDetallesIngresosFacturas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetallesIngresosFacturas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetallesIngresosFacturas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallesIngresosFacturas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetallesIngresosFacturas.isMaximum()) {
					this.jInternalFrameDetalleFormDetallesIngresosFacturas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetallesIngresosFacturas.setSize(this.jInternalFrameDetalleFormDetallesIngresosFacturas.iWidthFormulario,this.jInternalFrameDetalleFormDetallesIngresosFacturas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetallesIngresosFacturas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetallesIngresosFacturas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetallesIngresosFacturas.isMaximum()) {
						this.jInternalFrameDetalleFormDetallesIngresosFacturas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jContentPaneDetalleDetallesIngresosFacturas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTabbedPaneRelacionesDetallesIngresosFacturas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jContentPaneDetalleDetallesIngresosFacturas.getWidth(),DetallesIngresosFacturasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTabbedPaneRelacionesDetallesIngresosFacturas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jContentPaneDetalleDetallesIngresosFacturas.getWidth(),DetallesIngresosFacturasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTabbedPaneRelacionesDetallesIngresosFacturas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jContentPaneDetalleDetallesIngresosFacturas.getWidth(),DetallesIngresosFacturasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetallesIngresosFacturas.setVisible(true);
	        this.jInternalFrameDetalleFormDetallesIngresosFacturas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetallesIngresosFacturas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetallesIngresosFacturas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetallesIngresosFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallesIngresosFacturas,false,this);
				} else {
					this.jInternalFrameOrderByDetallesIngresosFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallesIngresosFacturas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetallesIngresosFacturas);
				this.jInternalFrameOrderByDetallesIngresosFacturas.setVisible(false);
				this.jInternalFrameOrderByDetallesIngresosFacturas.setSelected(false);
				
				this.jInternalFrameOrderByDetallesIngresosFacturas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallesIngresosFacturas"));
				
				this.inicializarActualizarBindingTablaOrderByDetallesIngresosFacturas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetallesIngresosFacturas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetallesIngresosFacturas==null) {
				
				this.jInternalFrameImportacionDetallesIngresosFacturas=new ImportacionJInternalFrame(DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallesIngresosFacturas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetallesIngresosFacturas);
				this.jInternalFrameImportacionDetallesIngresosFacturas.setVisible(false);
				this.jInternalFrameImportacionDetallesIngresosFacturas.setSelected(false);


				this.jInternalFrameImportacionDetallesIngresosFacturas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallesIngresosFacturas"));
				this.jInternalFrameImportacionDetallesIngresosFacturas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallesIngresosFacturas"));
				this.jInternalFrameImportacionDetallesIngresosFacturas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallesIngresosFacturas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetallesIngresosFacturas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas==null) {
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas=new ReporteDinamicoJInternalFrame(DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallesIngresosFacturas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas);
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setVisible(false);
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallesIngresosFacturas"));
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallesIngresosFacturas"));
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallesIngresosFacturas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallesIngresosFacturas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetallesIngresosFacturas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallesIngresosFacturas);
			
	       	this.jInternalFrameDetalleFormDetallesIngresosFacturas.setVisible(false);
	        this.jInternalFrameDetalleFormDetallesIngresosFacturas.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetallesIngresosFacturas.dispose();
			//this.jInternalFrameDetalleFormDetallesIngresosFacturas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetallesIngresosFacturas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetallesIngresosFacturas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetallesIngresosFacturas.setVisible(true);
	        this.jInternalFrameImportacionDetallesIngresosFacturas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetallesIngresosFacturas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetallesIngresosFacturas.setVisible(true);
	        this.jInternalFrameOrderByDetallesIngresosFacturas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetallesIngresosFacturas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetallesIngresosFacturas.setVisible(false);
	        this.jInternalFrameOrderByDetallesIngresosFacturas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetallesIngresosFacturas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetallesIngresosFacturas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetallesIngresosFacturas.setVisible(false);
	        this.jInternalFrameImportacionDetallesIngresosFacturas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetallesIngresosFacturas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetallesIngresosFacturas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetallesIngresosFacturas(true);
			//this.isEsNuevoDetallesIngresosFacturas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallesIngresosFacturas(false) ;
			
			if(detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetallesIngresosFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallesIngresosFacturas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallesIngresosFacturas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetallesIngresosFacturasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetallesIngresosFacturas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetallesIngresosFacturas(true);
			//this.isEsNuevoDetallesIngresosFacturas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallesingresosfacturas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetallesIngresosFacturas(false) ;
			
			if(DetallesIngresosFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallesIngresosFacturas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallesIngresosFacturas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	
	public void jButtonActualizarDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetallesIngresosFacturas(false);
			
			//if(!this.isEsNuevoDetallesIngresosFacturas) {								
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				
			}
			
			if(this.permiteMantenimiento(this.detallesingresosfacturas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetallesIngresosFacturas=true;
					this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
					this.isEsNuevoDetallesIngresosFacturas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetallesIngresosFacturas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetallesIngresosFacturas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallesIngresosFacturas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallesIngresosFacturas(false);
				
				this.habilitarDeshabilitarControlesDetallesIngresosFacturas(false);
			
												
				
				if(DetallesIngresosFacturasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetallesIngresosFacturas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,detallesingresosfacturasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetallesIngresosFacturas(this.detallesingresosfacturas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetallesIngresosFacturas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallesingresosfacturasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallesingresosfacturas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				this.detallesingresosfacturas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				this.detallesingresosfacturas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallesingresosfacturas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetallesIngresosFacturasModel) this.jTableDatosDetallesIngresosFacturas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetallesIngresosFacturas=true;
				this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
				this.isEsNuevoDetallesIngresosFacturas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallesIngresosFacturas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallesIngresosFacturas(false);
				
				this.habilitarDeshabilitarControlesDetallesIngresosFacturas(false);
				
				
				
				if(DetallesIngresosFacturasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetallesIngresosFacturas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetallesIngresosFacturas.getRowCount()>=1) {
				jTableDatosDetallesIngresosFacturas.removeRowSelectionInterval(0, jTableDatosDetallesIngresosFacturas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetallesIngresosFacturas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallesIngresosFacturas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallesIngresosFacturas(false) ;
			
			this.isEsNuevoDetallesIngresosFacturas=false;
			
			if(DetallesIngresosFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetallesIngresosFacturas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				
				//SI ES MANUAL
				if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetallesIngresosFacturas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetallesIngresosFacturas--;			
			//DetallesIngresosFacturas detallesingresosfacturasAux= new DetallesIngresosFacturas();			
			//detallesingresosfacturasAux.setId(this.iIdNuevoDetallesIngresosFacturas);
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetallesIngresosFacturas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
			
			this.detallesingresosfacturas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().add(this.detallesingresosfacturasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallesingresosfacturass.add(this.detallesingresosfacturasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
			
			this.jTableDatosDetallesIngresosFacturas.setRowSelectionInterval(this.getIndiceNuevoDetallesIngresosFacturas(), this.getIndiceNuevoDetallesIngresosFacturas());
			
			int iLastRow =  this.jTableDatosDetallesIngresosFacturas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetallesIngresosFacturas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetallesIngresosFacturas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallesIngresosFacturas(false);
			
			//SI ES MANUAL
			if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallesIngresosFacturas();
			}
			
			//this.abrirFrameTreeDetallesIngresosFacturas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetallesIngresosFacturas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetallesIngresosFacturas.setFileImportacion(this.jInternalFrameImportacionDetallesIngresosFacturas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetallesIngresosFacturas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetallesIngresosFacturas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetallesIngresosFacturas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetallesIngresosFacturas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();		

		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetallesIngresosFacturasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetallesIngresosFacturasBaseDesign.jrxml";
			
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
			
			this.generarReporteDetallesIngresosFacturass("Todos",detallesingresosfacturassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalles Ingresos Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glasPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glasPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glasPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glasPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbrePago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbrePago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbrePago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbrePago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoria="tipo_movimiento";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO:
					sNombreCampoCategoria="siglas_pago";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO:
					sNombreCampoCategoria="nombre_pago";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="tipo_movimiento";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO:
					sNombreCampoCategoriaValor="siglas_pago";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO:
					sNombreCampoCategoriaValor="nombre_pago";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_movimiento");
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas_pago");
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_pago");
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();		
		
		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallesingresosfacturas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetallesIngresosFacturass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetallesIngresosFacturasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.gettipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getsiglas_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getnombre_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(DetallesIngresosFacturas detallesingresosfacturas:detallesingresosfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallesingresosfacturas.getcredito_mone_local());
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
			//	this.getFilaCabeceraExportarExcelDetallesIngresosFacturas(row);				
			//	iRow++;
			//}				
			
			//for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetallesIngresosFacturas(detallesingresosfacturasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalles Ingresos Facturas",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallesIngresosFacturas(false);
			
			//SI ES MANUAL
			if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallesIngresosFacturas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallesIngresosFacturas(false);
			
			//SI ES MANUAL
			if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallesIngresosFacturas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallesIngresosFacturas(false);
			
			//SI ES MANUAL
			if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallesIngresosFacturas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetallesIngresosFacturas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetallesIngresosFacturas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetallesIngresosFacturas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetallesIngresosFacturas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetallesIngresosFacturas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetallesIngresosFacturas.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetallesIngresosFacturas.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetallesIngresosFacturas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetallesIngresosFacturas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetallesIngresosFacturas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetallesIngresosFacturas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetallesIngresosFacturas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetallesIngresosFacturas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetallesIngresosFacturas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallesIngresosFacturas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetallesIngresosFacturas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetallesIngresosFacturas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetallesIngresosFacturas();
		
		this.inicializarActualizarBindingBotonesManualDetallesIngresosFacturas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetallesIngresosFacturas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallesIngresosFacturas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetallesIngresosFacturas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetallesIngresosFacturas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetallesIngresosFacturas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetallesIngresosFacturas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jCheckBoxPostAccionNuevoDetallesIngresosFacturas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jCheckBoxPostAccionSinCerrarDetallesIngresosFacturas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jCheckBoxPostAccionSinMensajeDetallesIngresosFacturas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetallesIngresosFacturas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetallesIngresosFacturas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.jCheckBoxPostAccionNuevoDetallesIngresosFacturas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.jCheckBoxPostAccionSinCerrarDetallesIngresosFacturas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.jCheckBoxPostAccionSinMensajeDetallesIngresosFacturas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetallesIngresosFacturas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetallesIngresosFacturas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetallesIngresosFacturas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetallesIngresosFacturas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetallesIngresosFacturas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetallesIngresosFacturas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetallesIngresosFacturas(Boolean esInicializar) throws Exception {
		try	{	
			if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetallesIngresosFacturas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetallesIngresosFacturas() throws Exception {
		try	{
			if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallesIngresosFacturas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallesIngresosFacturas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallesIngresosFacturas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetallesIngresosFacturas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetallesIngresosFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetallesIngresosFacturas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetallesIngresosFacturas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetallesIngresosFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetallesIngresosFacturas.addItem(reporte);
			}
			
			
			if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetallesIngresosFacturas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetallesIngresosFacturas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetallesIngresosFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetallesIngresosFacturas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetallesIngresosFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetallesIngresosFacturas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallesIngresosFacturas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallesIngresosFacturas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas!=null) {
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas!=null) {
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetallesIngresosFacturasConstantesFunciones.getTiposSeleccionarDetallesIngresosFacturas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetallesIngresosFacturasConstantesFunciones.getTiposSeleccionarDetallesIngresosFacturas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetallesIngresosFacturasConstantesFunciones.getTiposSeleccionarDetallesIngresosFacturas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetallesIngresosFacturas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.getSelectedItem()!=null){this.id_ejercicioBusquedaDetallesIngresosFacturas=((Ejercicio)this.jComboBoxid_ejercicioBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetallesIngresosFacturas(Boolean esInicializar) throws Exception {				
		if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetallesIngresosFacturas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetallesIngresosFacturas() throws Exception {
		this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetallesIngresosFacturas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetallesIngresosFacturasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetallesIngresosFacturas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallesingresosfacturasLogic.getDetallesIngresosFacturass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallesingresosfacturass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetallesIngresosFacturas.setModel(new DetallesIngresosFacturasModel(this.detallesingresosfacturasLogic.getDetallesIngresosFacturass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetallesIngresosFacturas.setModel(new DetallesIngresosFacturasModel(this.detallesingresosfacturass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetallesIngresosFacturas!=null && this.jInternalFrameOrderByDetallesIngresosFacturas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetallesIngresosFacturas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO,detallesingresosfacturasConstantesFunciones.resaltarSeleccionarDetallesIngresosFacturas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO,detallesingresosfacturasConstantesFunciones.resaltarSeleccionarDetallesIngresosFacturas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_ID));

		if(this.detallesingresosfacturasConstantesFunciones.mostraridDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallesingresosfacturasConstantesFunciones.resaltaridDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activaridDetallesIngresosFacturas,iSizeTabla,this,true,"idDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltaridDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activaridDetallesIngresosFacturas,this,true,"idDetallesIngresosFacturas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA));

		if(this.detallesingresosfacturasConstantesFunciones.mostrarfechaDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarfechaDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarfechaDetallesIngresosFacturas,iSizeTabla,this,true,"fechaDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarfechaDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarfechaDetallesIngresosFacturas,this,true,"fechaDetallesIngresosFacturas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO));

		if(this.detallesingresosfacturasConstantesFunciones.mostrartipo_movimientoDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallesingresosfacturasConstantesFunciones.resaltartipo_movimientoDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activartipo_movimientoDetallesIngresosFacturas,iSizeTabla,this,true,"tipo_movimientoDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltartipo_movimientoDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activartipo_movimientoDetallesIngresosFacturas,this,true,"tipo_movimientoDetallesIngresosFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.detallesingresosfacturasConstantesFunciones.mostrarnumero_mayorDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarnumero_mayorDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarnumero_mayorDetallesIngresosFacturas,iSizeTabla,this,true,"numero_mayorDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarnumero_mayorDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarnumero_mayorDetallesIngresosFacturas,this,true,"numero_mayorDetallesIngresosFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.detallesingresosfacturasConstantesFunciones.mostrarnumero_facturaDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarnumero_facturaDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarnumero_facturaDetallesIngresosFacturas,iSizeTabla,this,true,"numero_facturaDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarnumero_facturaDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarnumero_facturaDetallesIngresosFacturas,this,true,"numero_facturaDetallesIngresosFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.detallesingresosfacturasConstantesFunciones.mostrarnombre_clienteDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarnombre_clienteDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarnombre_clienteDetallesIngresosFacturas,iSizeTabla,this,true,"nombre_clienteDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarnombre_clienteDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarnombre_clienteDetallesIngresosFacturas,this,true,"nombre_clienteDetallesIngresosFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO));

		if(this.detallesingresosfacturasConstantesFunciones.mostrarsiglas_pagoDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarsiglas_pagoDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarsiglas_pagoDetallesIngresosFacturas,iSizeTabla,this,true,"siglas_pagoDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarsiglas_pagoDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarsiglas_pagoDetallesIngresosFacturas,this,true,"siglas_pagoDetallesIngresosFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO));

		if(this.detallesingresosfacturasConstantesFunciones.mostrarnombre_pagoDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarnombre_pagoDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarnombre_pagoDetallesIngresosFacturas,iSizeTabla,this,true,"nombre_pagoDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarnombre_pagoDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarnombre_pagoDetallesIngresosFacturas,this,true,"nombre_pagoDetallesIngresosFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO));

		if(this.detallesingresosfacturasConstantesFunciones.mostrarcodigoDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarcodigoDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarcodigoDetallesIngresosFacturas,iSizeTabla,this,true,"codigoDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarcodigoDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarcodigoDetallesIngresosFacturas,this,true,"codigoDetallesIngresosFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.detallesingresosfacturasConstantesFunciones.mostrarcredito_mone_localDetallesIngresosFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarcredito_mone_localDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarcredito_mone_localDetallesIngresosFacturas,iSizeTabla,this,true,"credito_mone_localDetallesIngresosFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallesingresosfacturasConstantesFunciones.resaltarcredito_mone_localDetallesIngresosFacturas,this.detallesingresosfacturasConstantesFunciones.activarcredito_mone_localDetallesIngresosFacturas,this,true,"credito_mone_localDetallesIngresosFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallesIngresosFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallesIngresosFacturas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallesIngresosFacturas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetallesIngresosFacturas.addColumn(tableColumn);
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
			
			this.jTableDatosDetallesIngresosFacturas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetallesIngresosFacturas.moveColumn(this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetallesIngresosFacturas.moveColumn(this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetallesIngresosFacturas.moveColumn(this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetallesIngresosFacturas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetallesIngresosFacturas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetallesIngresosFacturas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetallesIngresosFacturas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetallesIngresosFacturas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetallesIngresosFacturas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=detallesingresosfacturasLogic.getDetallesIngresosFacturass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallesingresosfacturass.size()-1;
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
		//this.jTableDatosDetallesIngresosFacturas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetallesIngresosFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetallesIngresosFacturas();
			
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
				
				//this.isEsNuevoDetallesIngresosFacturas=false;
					
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
				if(this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallesIngresosFacturas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallesIngresosFacturas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallesingresosfacturas.getsType().equals("DUPLICADO")
				   || this.detallesingresosfacturas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetallesIngresosFacturas=true;
				
				} else {
					this.isEsNuevoDetallesIngresosFacturas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
					if(this.detallesingresosfacturas.getId()>=0 && !this.detallesingresosfacturas.getIsNew()) {						
						this.isEsNuevoDetallesIngresosFacturas=false;
						
					} else {
						this.isEsNuevoDetallesIngresosFacturas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetallesIngresosFacturas(esRelaciones);						
				
				this.seleccionarDetallesIngresosFacturas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallesingresosfacturas.getId()<0) {
					this.isEsNuevoDetallesIngresosFacturas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetallesIngresosFacturas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetallesIngresosFacturas(evt,rowIndex);
				}	
				
				if(this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetallesIngresosFacturas: " + this.dDif); 
					}
				}								
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetallesIngresosFacturas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallesingresosfacturas)) {
					if(this.detallesingresosfacturas.getId()>0) {
						this.detallesingresosfacturas.setIsDeleted(true);
						
						this.detallesingresosfacturassEliminados.add(this.detallesingresosfacturas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().remove(this.detallesingresosfacturas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturass.remove(this.detallesingresosfacturas);				
					}
					
					
					((DetallesIngresosFacturasModel) this.jTableDatosDetallesIngresosFacturas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetallesIngresosFacturas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetallesIngresosFacturas) {
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallesIngresosFacturas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallesIngresosFacturas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetallesIngresosFacturas(this.detallesingresosfacturas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetallesIngresosFacturas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetallesIngresosFacturas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallesIngresosFacturas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetallesIngresosFacturas(detallesingresosfacturas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetallesIngresosFacturas(detallesingresosfacturas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetallesIngresosFacturas(detallesingresosfacturas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetallesIngresosFacturas(detallesingresosfacturas);
	}
	
	public void setVariablesObjetoActualToFormularioDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.setText(detallesingresosfacturas.getId().toString());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jDateChooserfechaDetallesIngresosFacturas.setDate(detallesingresosfacturas.getfecha());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreatipo_movimientoDetallesIngresosFacturas.setText(detallesingresosfacturas.gettipo_movimiento());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanumero_mayorDetallesIngresosFacturas.setText(detallesingresosfacturas.getnumero_mayor());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldnumero_facturaDetallesIngresosFacturas.setText(detallesingresosfacturas.getnumero_factura());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_clienteDetallesIngresosFacturas.setText(detallesingresosfacturas.getnombre_cliente());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldsiglas_pagoDetallesIngresosFacturas.setText(detallesingresosfacturas.getsiglas_pago());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_pagoDetallesIngresosFacturas.setText(detallesingresosfacturas.getnombre_pago());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcodigoDetallesIngresosFacturas.setText(detallesingresosfacturas.getcodigo());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcredito_mone_localDetallesIngresosFacturas.setText(detallesingresosfacturas.getcredito_mone_local().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetallesIngresosFacturas detallesingresosfacturasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallesingresosfacturasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetallesIngresosFacturas detallesingresosfacturasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallesingresosfacturasLocal=this.detallesingresosfacturas;
			} else {
				detallesingresosfacturasLocal=this.detallesingresosfacturasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallesingresosfacturasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetallesIngresosFacturas(detallesingresosfacturasLocal,true);
					
					if(detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallesingresosfacturasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallesingresosfacturasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(detallesingresosfacturas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(detallesingresosfacturas);
	}
	
	public void setVariablesFormularioToObjetoActualDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(detallesingresosfacturas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.getText()==null || this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.getText()=="" || this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.getText()=="Id") {
				this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.setText("0");
			}

			if(conColumnasBase) {detallesingresosfacturas.setId(Long.parseLong(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelIdDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallesingresosfacturas.setfecha(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jDateChooserfechaDetallesIngresosFacturas.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelfechaDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallesingresosfacturas.settipo_movimiento(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreatipo_movimientoDetallesIngresosFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabeltipo_movimientoDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallesingresosfacturas.setnumero_mayor(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanumero_mayorDetallesIngresosFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnumero_mayorDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallesingresosfacturas.setnumero_factura(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldnumero_facturaDetallesIngresosFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnumero_facturaDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallesingresosfacturas.setnombre_cliente(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_clienteDetallesIngresosFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnombre_clienteDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallesingresosfacturas.setsiglas_pago(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldsiglas_pagoDetallesIngresosFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelsiglas_pagoDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallesingresosfacturas.setnombre_pago(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_pagoDetallesIngresosFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelnombre_pagoDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallesingresosfacturas.setcodigo(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcodigoDetallesIngresosFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelcodigoDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallesingresosfacturas.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcredito_mone_localDetallesIngresosFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelcredito_mone_localDetallesIngresosFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturasBean,DetallesIngresosFacturas detallesingresosfacturas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturasOrigen,DetallesIngresosFacturas detallesingresosfacturas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallesingresosfacturasOrigen.getId()!=null && !detallesingresosfacturasOrigen.getId().equals(0L))) {detallesingresosfacturas.setId(detallesingresosfacturasOrigen.getId());}}
			if(conDefault || (!conDefault && detallesingresosfacturasOrigen.getfecha()!=null && !detallesingresosfacturasOrigen.getfecha().equals(new Date()))) {detallesingresosfacturas.setfecha(detallesingresosfacturasOrigen.getfecha());}
			if(conDefault || (!conDefault && detallesingresosfacturasOrigen.gettipo_movimiento()!=null && !detallesingresosfacturasOrigen.gettipo_movimiento().equals(""))) {detallesingresosfacturas.settipo_movimiento(detallesingresosfacturasOrigen.gettipo_movimiento());}
			if(conDefault || (!conDefault && detallesingresosfacturasOrigen.getnumero_mayor()!=null && !detallesingresosfacturasOrigen.getnumero_mayor().equals(""))) {detallesingresosfacturas.setnumero_mayor(detallesingresosfacturasOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && detallesingresosfacturasOrigen.getnumero_factura()!=null && !detallesingresosfacturasOrigen.getnumero_factura().equals(""))) {detallesingresosfacturas.setnumero_factura(detallesingresosfacturasOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && detallesingresosfacturasOrigen.getnombre_cliente()!=null && !detallesingresosfacturasOrigen.getnombre_cliente().equals(""))) {detallesingresosfacturas.setnombre_cliente(detallesingresosfacturasOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && detallesingresosfacturasOrigen.getsiglas_pago()!=null && !detallesingresosfacturasOrigen.getsiglas_pago().equals(""))) {detallesingresosfacturas.setsiglas_pago(detallesingresosfacturasOrigen.getsiglas_pago());}
			if(conDefault || (!conDefault && detallesingresosfacturasOrigen.getnombre_pago()!=null && !detallesingresosfacturasOrigen.getnombre_pago().equals(""))) {detallesingresosfacturas.setnombre_pago(detallesingresosfacturasOrigen.getnombre_pago());}
			if(conDefault || (!conDefault && detallesingresosfacturasOrigen.getcodigo()!=null && !detallesingresosfacturasOrigen.getcodigo().equals(""))) {detallesingresosfacturas.setcodigo(detallesingresosfacturasOrigen.getcodigo());}
			if(conDefault || (!conDefault && detallesingresosfacturasOrigen.getcredito_mone_local()!=null && !detallesingresosfacturasOrigen.getcredito_mone_local().equals(0.0))) {detallesingresosfacturas.setcredito_mone_local(detallesingresosfacturasOrigen.getcredito_mone_local());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.setText(detallesingresosfacturas.getId().toString());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jDateChooserfechaDetallesIngresosFacturas.setDate(detallesingresosfacturas.getfecha());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreatipo_movimientoDetallesIngresosFacturas.setText(detallesingresosfacturas.gettipo_movimiento());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanumero_mayorDetallesIngresosFacturas.setText(detallesingresosfacturas.getnumero_mayor());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldnumero_facturaDetallesIngresosFacturas.setText(detallesingresosfacturas.getnumero_factura());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_clienteDetallesIngresosFacturas.setText(detallesingresosfacturas.getnombre_cliente());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldsiglas_pagoDetallesIngresosFacturas.setText(detallesingresosfacturas.getsiglas_pago());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_pagoDetallesIngresosFacturas.setText(detallesingresosfacturas.getnombre_pago());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcodigoDetallesIngresosFacturas.setText(detallesingresosfacturas.getcodigo());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcredito_mone_localDetallesIngresosFacturas.setText(detallesingresosfacturas.getcredito_mone_local().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallesIngresosFacturas(DetallesIngresosFacturasBean detallesingresosfacturasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.setText(detallesingresosfacturasBean.getId().toString());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jDateChooserfechaDetallesIngresosFacturas.setDate(detallesingresosfacturasBean.getfecha());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreatipo_movimientoDetallesIngresosFacturas.setText(detallesingresosfacturasBean.gettipo_movimiento());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanumero_mayorDetallesIngresosFacturas.setText(detallesingresosfacturasBean.getnumero_mayor());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldnumero_facturaDetallesIngresosFacturas.setText(detallesingresosfacturasBean.getnumero_factura());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_clienteDetallesIngresosFacturas.setText(detallesingresosfacturasBean.getnombre_cliente());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldsiglas_pagoDetallesIngresosFacturas.setText(detallesingresosfacturasBean.getsiglas_pago());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_pagoDetallesIngresosFacturas.setText(detallesingresosfacturasBean.getnombre_pago());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcodigoDetallesIngresosFacturas.setText(detallesingresosfacturasBean.getcodigo());
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcredito_mone_localDetallesIngresosFacturas.setText(detallesingresosfacturasBean.getcredito_mone_local().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetallesIngresosFacturas(DetallesIngresosFacturasParameterReturnGeneral detallesingresosfacturasReturnGeneral,DetallesIngresosFacturasBean detallesingresosfacturasBean,Boolean conDefault) throws Exception { 
		try {
			DetallesIngresosFacturas detallesingresosfacturasLocal=new DetallesIngresosFacturas();
			
			detallesingresosfacturasLocal=detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallesingresosfacturasLocal.getId()!=null && !detallesingresosfacturasLocal.getId().equals(0L))) {detallesingresosfacturasBean.setId(detallesingresosfacturasLocal.getId());}}
			if(conDefault || (!conDefault && detallesingresosfacturasLocal.getfecha()!=null && !detallesingresosfacturasLocal.getfecha().equals(new Date()))) {detallesingresosfacturasBean.setfecha(detallesingresosfacturasLocal.getfecha());}
			if(conDefault || (!conDefault && detallesingresosfacturasLocal.gettipo_movimiento()!=null && !detallesingresosfacturasLocal.gettipo_movimiento().equals(""))) {detallesingresosfacturasBean.settipo_movimiento(detallesingresosfacturasLocal.gettipo_movimiento());}
			if(conDefault || (!conDefault && detallesingresosfacturasLocal.getnumero_mayor()!=null && !detallesingresosfacturasLocal.getnumero_mayor().equals(""))) {detallesingresosfacturasBean.setnumero_mayor(detallesingresosfacturasLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && detallesingresosfacturasLocal.getnumero_factura()!=null && !detallesingresosfacturasLocal.getnumero_factura().equals(""))) {detallesingresosfacturasBean.setnumero_factura(detallesingresosfacturasLocal.getnumero_factura());}
			if(conDefault || (!conDefault && detallesingresosfacturasLocal.getnombre_cliente()!=null && !detallesingresosfacturasLocal.getnombre_cliente().equals(""))) {detallesingresosfacturasBean.setnombre_cliente(detallesingresosfacturasLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && detallesingresosfacturasLocal.getsiglas_pago()!=null && !detallesingresosfacturasLocal.getsiglas_pago().equals(""))) {detallesingresosfacturasBean.setsiglas_pago(detallesingresosfacturasLocal.getsiglas_pago());}
			if(conDefault || (!conDefault && detallesingresosfacturasLocal.getnombre_pago()!=null && !detallesingresosfacturasLocal.getnombre_pago().equals(""))) {detallesingresosfacturasBean.setnombre_pago(detallesingresosfacturasLocal.getnombre_pago());}
			if(conDefault || (!conDefault && detallesingresosfacturasLocal.getcodigo()!=null && !detallesingresosfacturasLocal.getcodigo().equals(""))) {detallesingresosfacturasBean.setcodigo(detallesingresosfacturasLocal.getcodigo());}
			if(conDefault || (!conDefault && detallesingresosfacturasLocal.getcredito_mone_local()!=null && !detallesingresosfacturasLocal.getcredito_mone_local().equals(0.0))) {detallesingresosfacturasBean.setcredito_mone_local(detallesingresosfacturasLocal.getcredito_mone_local());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetallesIngresosFacturasGenerico(Long idDetallesIngresosFacturasSeleccionado,JComboBox jComboBoxDetallesIngresosFacturas,List<DetallesIngresosFacturas> detallesingresosfacturassLocal)throws Exception {
		try {
			DetallesIngresosFacturas  detallesingresosfacturasTemp=null;

			for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturassLocal) {
				if(detallesingresosfacturasAux.getId()!=null && detallesingresosfacturasAux.getId().equals(idDetallesIngresosFacturasSeleccionado)) {
					detallesingresosfacturasTemp=detallesingresosfacturasAux;
					break;
				}
			}

			jComboBoxDetallesIngresosFacturas.setSelectedItem(detallesingresosfacturasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetallesIngresosFacturasGenerico(JComboBox jComboBoxDetallesIngresosFacturas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallesIngresosFacturas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetallesIngresosFacturas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallesIngresosFacturas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetallesIngresosFacturas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallesingresosfacturas=(DetallesIngresosFacturas) detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallesingresosfacturas =(DetallesIngresosFacturas) detallesingresosfacturass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallesingresosfacturas.getIsNew() && !detallesingresosfacturas.getIsChanged() && !detallesingresosfacturas.getIsDeleted()) {
				sDescripcion=detallesingresosfacturas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallesingresosfacturas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detallesingresosfacturas.getIsNew() && !detallesingresosfacturas.getIsChanged() && !detallesingresosfacturas.getIsDeleted()) {
				sDescripcion=detallesingresosfacturas.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detallesingresosfacturas.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detallesingresosfacturas.getIsNew() && !detallesingresosfacturas.getIsChanged() && !detallesingresosfacturas.getIsDeleted()) {
				sDescripcion=detallesingresosfacturas.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detallesingresosfacturas.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetallesIngresosFacturas detallesingresosfacturasRow=new DetallesIngresosFacturas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallesingresosfacturasRow=(DetallesIngresosFacturas) detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallesingresosfacturasRow=(DetallesIngresosFacturas) detallesingresosfacturass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetallesIngresosFacturas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaNuevoDetallesIngresosFacturas && this.isPermisoNuevoDetallesIngresosFacturas));			
			this.jButtonDuplicarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaDuplicarDetallesIngresosFacturas && this.isPermisoDuplicarDetallesIngresosFacturas));			
			this.jButtonCopiarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaCopiarDetallesIngresosFacturas && this.isPermisoCopiarDetallesIngresosFacturas));
			this.jButtonVerFormDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaVerFormDetallesIngresosFacturas && this.isPermisoVerFormDetallesIngresosFacturas));
			
			this.jButtonAbrirOrderByDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaOrdenDetallesIngresosFacturas && this.isPermisoOrdenDetallesIngresosFacturas));			
			
			this.jButtonNuevoRelacionesDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas && this.isPermisoNuevoDetallesIngresosFacturas));			
			this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaNuevoDetallesIngresosFacturas && this.isPermisoNuevoDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonModificarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaModificarDetallesIngresosFacturas && this.isPermisoActualizarDetallesIngresosFacturas));	
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaActualizarDetallesIngresosFacturas && this.isPermisoActualizarDetallesIngresosFacturas));	
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaEliminarDetallesIngresosFacturas && this.isPermisoEliminarDetallesIngresosFacturas));
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarDetallesIngresosFacturas.setVisible(this.isVisibilidadCeldaCancelarDetallesIngresosFacturas);							
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaGuardarDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaNuevoDetallesIngresosFacturas && this.isPermisoNuevoDetallesIngresosFacturas));						
			this.jButtonDuplicarToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaDuplicarDetallesIngresosFacturas && this.isPermisoDuplicarDetallesIngresosFacturas));						
			this.jButtonCopiarToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaCopiarDetallesIngresosFacturas && this.isPermisoCopiarDetallesIngresosFacturas));			
			this.jButtonVerFormToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaVerFormDetallesIngresosFacturas && this.isPermisoVerFormDetallesIngresosFacturas));			
			this.jButtonAbrirOrderByToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaOrdenDetallesIngresosFacturas && this.isPermisoOrdenDetallesIngresosFacturas));
			this.jButtonNuevoRelacionesToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas && this.isPermisoNuevoDetallesIngresosFacturas));			
			this.jButtonNuevoGuardarCambiosToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaNuevoDetallesIngresosFacturas && this.isPermisoNuevoDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));			
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonModificarToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaModificarDetallesIngresosFacturas && this.isPermisoActualizarDetallesIngresosFacturas));	
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaActualizarDetallesIngresosFacturas  && this.isPermisoActualizarDetallesIngresosFacturas));	
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaEliminarDetallesIngresosFacturas && this.isPermisoEliminarDetallesIngresosFacturas));
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarToolBarDetallesIngresosFacturas.setVisible(this.isVisibilidadCeldaCancelarDetallesIngresosFacturas);				
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaGuardarDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaNuevoDetallesIngresosFacturas && this.isPermisoNuevoDetallesIngresosFacturas));			
			this.jMenuItemDuplicarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaDuplicarDetallesIngresosFacturas && this.isPermisoDuplicarDetallesIngresosFacturas));			
			this.jMenuItemCopiarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaCopiarDetallesIngresosFacturas && this.isPermisoCopiarDetallesIngresosFacturas));			
			this.jMenuItemVerFormDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaVerFormDetallesIngresosFacturas && this.isPermisoVerFormDetallesIngresosFacturas));			
			this.jMenuItemAbrirOrderByDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaOrdenDetallesIngresosFacturas && this.isPermisoOrdenDetallesIngresosFacturas));			
			//this.jMenuItemMostrarOcultarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaOrdenDetallesIngresosFacturas && this.isPermisoOrdenDetallesIngresosFacturas));
			this.jMenuItemDetalleAbrirOrderByDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaOrdenDetallesIngresosFacturas && this.isPermisoOrdenDetallesIngresosFacturas));			
			//this.jMenuItemDetalleMostrarOcultarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaOrdenDetallesIngresosFacturas && this.isPermisoOrdenDetallesIngresosFacturas));			
			this.jMenuItemNuevoRelacionesDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas && this.isPermisoNuevoDetallesIngresosFacturas));			
			this.jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaNuevoDetallesIngresosFacturas && this.isPermisoNuevoDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));									
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemModificarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaModificarDetallesIngresosFacturas && this.isPermisoActualizarDetallesIngresosFacturas));	
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemActualizarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaActualizarDetallesIngresosFacturas && this.isPermisoActualizarDetallesIngresosFacturas));	
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemEliminarDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaEliminarDetallesIngresosFacturas && this.isPermisoEliminarDetallesIngresosFacturas));
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemCancelarDetallesIngresosFacturas.setVisible(this.isVisibilidadCeldaCancelarDetallesIngresosFacturas);				
			}
			
			this.jMenuItemGuardarCambiosDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaGuardarDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));						
			this.jMenuItemGuardarCambiosTablaDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=this.jButtonNuevoDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaDuplicarDetallesIngresosFacturas=this.jButtonDuplicarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaCopiarDetallesIngresosFacturas=this.jButtonCopiarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaVerFormDetallesIngresosFacturas=this.jButtonVerFormDetallesIngresosFacturas.isVisible();
			
			this.isVisibilidadCeldaOrdenDetallesIngresosFacturas=this.jButtonAbrirOrderByDetallesIngresosFacturas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=this.jButtonNuevoRelacionesDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=this.jButtonModificarDetallesIngresosFacturas.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosDetallesIngresosFacturas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=this.jButtonNuevoToolBarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=this.jButtonNuevoRelacionesToolBarDetallesIngresosFacturas.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonModificarToolBarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarToolBarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarToolBarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarToolBarDetallesIngresosFacturas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=this.jButtonGuardarCambiosToolBarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=this.jButtonGuardarCambiosTablaToolBarDetallesIngresosFacturas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=this.jMenuItemNuevoDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=this.jMenuItemNuevoRelacionesDetallesIngresosFacturas.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemModificarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemActualizarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemEliminarDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemCancelarDetallesIngresosFacturas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=this.jMenuItemGuardarCambiosDetallesIngresosFacturas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=this.jMenuItemGuardarCambiosTablaDetallesIngresosFacturas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetallesIngresosFacturas(Boolean esInicializar) {
		if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
				//if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetallesIngresosFacturas();
			}
			
			this.inicializarActualizarBindingBotonesManualDetallesIngresosFacturas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetallesIngresosFacturas() {
		this.jButtonNuevoDetallesIngresosFacturas.setVisible(this.isPermisoNuevoDetallesIngresosFacturas);			
		this.jButtonDuplicarDetallesIngresosFacturas.setVisible(this.isPermisoDuplicarDetallesIngresosFacturas);			
		this.jButtonCopiarDetallesIngresosFacturas.setVisible(this.isPermisoCopiarDetallesIngresosFacturas);			
		this.jButtonVerFormDetallesIngresosFacturas.setVisible(this.isPermisoVerFormDetallesIngresosFacturas);			
		
		this.jButtonAbrirOrderByDetallesIngresosFacturas.setVisible(this.isPermisoOrdenDetallesIngresosFacturas);					
		
		this.jButtonNuevoRelacionesDetallesIngresosFacturas.setVisible(this.isPermisoNuevoDetallesIngresosFacturas);			
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonModificarDetallesIngresosFacturas.setVisible(this.isPermisoActualizarDetallesIngresosFacturas);	
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarDetallesIngresosFacturas.setVisible(this.isPermisoActualizarDetallesIngresosFacturas);	
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarDetallesIngresosFacturas.setVisible(this.isPermisoEliminarDetallesIngresosFacturas);
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarDetallesIngresosFacturas.setVisible(this.isVisibilidadCeldaCancelarDetallesIngresosFacturas);						
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosDetallesIngresosFacturas.setVisible(this.isPermisoGuardarCambiosDetallesIngresosFacturas);							
		}
		
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.setVisible(this.isPermisoActualizarDetallesIngresosFacturas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallesIngresosFacturas() {
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonModificarDetallesIngresosFacturas.setVisible(this.isPermisoActualizarDetallesIngresosFacturas);	
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarDetallesIngresosFacturas.setVisible(this.isPermisoActualizarDetallesIngresosFacturas);	
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarDetallesIngresosFacturas.setVisible(this.isPermisoEliminarDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarDetallesIngresosFacturas.setVisible(this.isVisibilidadCeldaCancelarDetallesIngresosFacturas);							
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosDetallesIngresosFacturas.setVisible((this.isVisibilidadCeldaGuardarDetallesIngresosFacturas && this.isPermisoGuardarCambiosDetallesIngresosFacturas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetallesIngresosFacturas() {
		if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetallesIngresosFacturas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetallesIngresosFacturas() {
	}
	
	public void jTableDatosDetallesIngresosFacturasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetallesIngresosFacturas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallesingresosfacturas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetallesIngresosFacturasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetallesIngresosFacturas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallesIngresosFacturas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallesIngresosFacturas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallesingresosfacturasLogic.getConnexion());

				if(this.detallesingresosfacturas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallesingresosfacturas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallesIngresosFacturas=(TitledBorder)this.jScrollPanelDatosDetallesIngresosFacturas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetallesIngresosFacturas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallesingresosfacturas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetallesIngresosFacturasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetallesIngresosFacturas(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallesIngresosFacturas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallesIngresosFacturas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detallesingresosfacturasLogic.getConnexion());

				if(this.detallesingresosfacturas.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detallesingresosfacturas.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallesIngresosFacturas=(TitledBorder)this.jScrollPanelDatosDetallesIngresosFacturas.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetallesIngresosFacturas.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detallesingresosfacturas.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetallesIngresosFacturasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetallesIngresosFacturas(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallesIngresosFacturas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallesIngresosFacturas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detallesingresosfacturasLogic.getConnexion());

				if(this.detallesingresosfacturas.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detallesingresosfacturas.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallesIngresosFacturas=(TitledBorder)this.jScrollPanelDatosDetallesIngresosFacturas.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetallesIngresosFacturas.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detallesingresosfacturas.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.detallesingresosfacturas.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_movimientoDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.gettipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_movimiento like '%"+this.detallesingresosfacturas.gettipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.detallesingresosfacturas.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.detallesingresosfacturas.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.detallesingresosfacturas.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglas_pagoDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getsiglas_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas_pago like '%"+this.detallesingresosfacturas.getsiglas_pago()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_pagoDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getnombre_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_pago like '%"+this.detallesingresosfacturas.getnombre_pago()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.detallesingresosfacturas.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localDetallesIngresosFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.getdetallesingresosfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallesingresosfacturas==null) {
						this.detallesingresosfacturas = new DetallesIngresosFacturas();
					}

					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);
				}

				if(this.detallesingresosfacturas.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.detallesingresosfacturas.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallesIngresosFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);

			this.getDetallesIngresosFacturassBusquedaDetallesIngresosFacturas();

			this.inicializarActualizarBindingDetallesIngresosFacturas(false);

			//if(DetallesIngresosFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);

			this.getDetallesIngresosFacturassFK_IdEjercicio();

			this.inicializarActualizarBindingDetallesIngresosFacturas(false);

			//if(DetallesIngresosFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);

			this.getDetallesIngresosFacturassFK_IdEmpresa();

			this.inicializarActualizarBindingDetallesIngresosFacturas(false);

			//if(DetallesIngresosFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetallesIngresosFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);

			this.getDetallesIngresosFacturassFK_IdSucursal();

			this.inicializarActualizarBindingDetallesIngresosFacturas(false);

			//if(DetallesIngresosFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallesingresosfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetallesIngresosFacturas() {
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.dispose();
			this.jInternalFrameDetalleFormDetallesIngresosFacturas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas!=null) {
			this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.dispose();
			this.jInternalFrameReporteDinamicoDetallesIngresosFacturas=null;
		}
		
		if(this.jInternalFrameImportacionDetallesIngresosFacturas!=null) {
			this.jInternalFrameImportacionDetallesIngresosFacturas.setVisible(false);	    			
			this.jInternalFrameImportacionDetallesIngresosFacturas.dispose();
			this.jInternalFrameImportacionDetallesIngresosFacturas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetallesIngresosFacturas();
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetallesIngresosFacturas")) {
				jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetallesIngresosFacturas")) {
				jButtonDuplicarDetallesIngresosFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetallesIngresosFacturas")) {
				jButtonCopiarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetallesIngresosFacturas")) {
				jButtonVerFormDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetallesIngresosFacturas")) {
				jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetallesIngresosFacturas")) {
				jButtonDuplicarDetallesIngresosFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetallesIngresosFacturas")) {
				jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetallesIngresosFacturas")) {
				jButtonDuplicarDetallesIngresosFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetallesIngresosFacturas")) {
				jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetallesIngresosFacturas")) {
				jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetallesIngresosFacturas")) {
				jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetallesIngresosFacturas")) {
				jButtonModificarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetallesIngresosFacturas")) {
				jButtonModificarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetallesIngresosFacturas")) {
				jButtonModificarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetallesIngresosFacturas")) {
				jButtonActualizarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetallesIngresosFacturas")) {
				jButtonActualizarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetallesIngresosFacturas")) {
				jButtonActualizarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetallesIngresosFacturas")) {
				jButtonEliminarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetallesIngresosFacturas")) {
				jButtonEliminarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetallesIngresosFacturas")) {
				jButtonEliminarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetallesIngresosFacturas")) {
				jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetallesIngresosFacturas")) {
				jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetallesIngresosFacturas")) {
				jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetallesIngresosFacturas")) {
				jButtonCerrarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetallesIngresosFacturas")) {
				jButtonCerrarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetallesIngresosFacturas")) {
				jButtonCerrarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetallesIngresosFacturas")) {
				jButtonMostrarOcultarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetallesIngresosFacturas")) {
				jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetallesIngresosFacturas")) {
				jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetallesIngresosFacturas")) {
				jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetallesIngresosFacturas")) {
				jButtonCopiarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetallesIngresosFacturas")) {
				jButtonVerFormDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetallesIngresosFacturas")) {
				jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetallesIngresosFacturas")) {
				jButtonCopiarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetallesIngresosFacturas")) {
				jButtonVerFormDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetallesIngresosFacturas")) {
				jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetallesIngresosFacturas")) {
				jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetallesIngresosFacturas")) {
				jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetallesIngresosFacturas")) {
				jButtonRecargarInformacionDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetallesIngresosFacturas")) {
				jButtonRecargarInformacionDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetallesIngresosFacturas")) {
				jButtonRecargarInformacionDetallesIngresosFacturasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetallesIngresosFacturas")) {
				jButtonAnterioresDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetallesIngresosFacturas")) {
				jButtonAnterioresDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetallesIngresosFacturas")) {
				jButtonAnterioresDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetallesIngresosFacturas")) {
				jButtonSiguientesDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetallesIngresosFacturas")) {
				jButtonSiguientesDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetallesIngresosFacturas")) {
				jButtonSiguientesDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetallesIngresosFacturas") || sTipo.equals("MenuItemDetalleAbrirOrderByDetallesIngresosFacturas")) {
				jButtonAbrirOrderByDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetallesIngresosFacturas") || sTipo.equals("MenuItemDetalleMostrarOcultarDetallesIngresosFacturas")) {
				jButtonMostrarOcultarDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetallesIngresosFacturas")) {
				jButtonNuevoGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetallesIngresosFacturas")) {
				jButtonNuevoGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetallesIngresosFacturas")) {
				jButtonNuevoGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetallesIngresosFacturas")) {
				jButtonCerrarReporteDinamicoDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetallesIngresosFacturas")) {
				jButtonGenerarReporteDinamicoDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetallesIngresosFacturas")) {
				
				jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetallesIngresosFacturas")) {
				jButtonCerrarImportacionDetallesIngresosFacturasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetallesIngresosFacturas")) {
				
				jButtonGenerarImportacionDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetallesIngresosFacturas")) {
				
				jButtonAbrirImportacionDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetallesIngresosFacturas")) {
				jComboBoxTiposAccionesDetallesIngresosFacturasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetallesIngresosFacturas")) {
				jComboBoxTiposRelacionesDetallesIngresosFacturasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetallesIngresosFacturas")) {
				jComboBoxTiposAccionesDetallesIngresosFacturasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetallesIngresosFacturas")) {
				
				jComboBoxTiposSeleccionarDetallesIngresosFacturasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetallesIngresosFacturas")) {
				jTextFieldValorCampoGeneralDetallesIngresosFacturasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetallesIngresosFacturas")) {
				jButtonAbrirOrderByDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetallesIngresosFacturas")) {
				jButtonAbrirOrderByDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetallesIngresosFacturas")) {
				jButtonCerrarOrderByDetallesIngresosFacturasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallesIngresosFacturasBusqueda")) {
				this.jButtonidDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallesIngresosFacturasUpdate")) {
				this.jButtonid_empresaDetallesIngresosFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallesIngresosFacturasBusqueda")) {
				this.jButtonid_empresaDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallesIngresosFacturasUpdate")) {
				this.jButtonid_sucursalDetallesIngresosFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallesIngresosFacturasBusqueda")) {
				this.jButtonid_sucursalDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetallesIngresosFacturasUpdate")) {
				this.jButtonid_ejercicioDetallesIngresosFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetallesIngresosFacturasBusqueda")) {
				this.jButtonid_ejercicioDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDetallesIngresosFacturasBusqueda")) {
				this.jButtonfechaDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoDetallesIngresosFacturasBusqueda")) {
				this.jButtontipo_movimientoDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorDetallesIngresosFacturasBusqueda")) {
				this.jButtonnumero_mayorDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaDetallesIngresosFacturasBusqueda")) {
				this.jButtonnumero_facturaDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteDetallesIngresosFacturasBusqueda")) {
				this.jButtonnombre_clienteDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglas_pagoDetallesIngresosFacturasBusqueda")) {
				this.jButtonsiglas_pagoDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_pagoDetallesIngresosFacturasBusqueda")) {
				this.jButtonnombre_pagoDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDetallesIngresosFacturasBusqueda")) {
				this.jButtoncodigoDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localDetallesIngresosFacturasBusqueda")) {
				this.jButtoncredito_mone_localDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaDetallesIngresosFacturasDetallesIngresosFacturas")) {
				this.jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturasActionPerformed(evt);
			}
			
			;
			
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetallesIngresosFacturas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				


				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetallesIngresosFacturas detallesingresosfacturasLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallesingresosfacturasLocal=this.detallesingresosfacturas;
			} else {
				detallesingresosfacturasLocal=this.detallesingresosfacturasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
							
				
				


				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
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
			
			


			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallesIngresosFacturasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
								
						
				


				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
								
				
				


				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallesIngresosFacturasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
							
				
				


				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
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
			
			


			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
								
				
				


				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallesIngresosFacturasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallesIngresosFacturasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetallesIngresosFacturas")) {
					jCheckBoxSeleccionarTodosDetallesIngresosFacturasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetallesIngresosFacturas")) {
					jCheckBoxSeleccionadosDetallesIngresosFacturasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetallesIngresosFacturas")) {
					
				}
				
				


				
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
												
				
				


				
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallesIngresosFacturasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
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
			
			


			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallesingresosfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallesingresosfacturas);
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
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
				
				


				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallesIngresosFacturas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallesIngresosFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallesIngresosFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallesingresosfacturasAnterior =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetallesIngresosFacturas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetallesIngresosFacturasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetallesIngresosFacturas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallesingresosfacturas =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallesingresosfacturas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetallesIngresosFacturas")) {
				
				}
				
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetallesIngresosFacturas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetallesIngresosFacturas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetallesIngresosFacturas")) {
			
			}
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetallesIngresosFacturas();
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
			if(sTipo.equals("NuevoDetallesIngresosFacturas")) {
				jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetallesIngresosFacturas")) {
				jButtonDuplicarDetallesIngresosFacturasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetallesIngresosFacturas")) {
				jButtonCopiarDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetallesIngresosFacturas")) {
				jButtonVerFormDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetallesIngresosFacturas")) {
				jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetallesIngresosFacturas")) {
				jButtonModificarDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetallesIngresosFacturas")) {
				jButtonActualizarDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetallesIngresosFacturas")) {
				jButtonEliminarDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetallesIngresosFacturas")) {
				jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetallesIngresosFacturas")) {
				jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetallesIngresosFacturas")) {
				jButtonCerrarDetallesIngresosFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetallesIngresosFacturas")) {
				jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetallesIngresosFacturas")) {
				jButtonNuevoGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetallesIngresosFacturas")) {
				jButtonAbrirOrderByDetallesIngresosFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetallesIngresosFacturas")) {
				jButtonRecargarInformacionDetallesIngresosFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetallesIngresosFacturas")) {
				jButtonAnterioresDetallesIngresosFacturasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetallesIngresosFacturas")) {
				jButtonSiguientesDetallesIngresosFacturasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallesIngresosFacturasBusqueda")) {
				this.jButtonidDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallesIngresosFacturasUpdate")) {
				this.jButtonid_empresaDetallesIngresosFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallesIngresosFacturasBusqueda")) {
				this.jButtonid_empresaDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallesIngresosFacturasUpdate")) {
				this.jButtonid_sucursalDetallesIngresosFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallesIngresosFacturasBusqueda")) {
				this.jButtonid_sucursalDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetallesIngresosFacturasUpdate")) {
				this.jButtonid_ejercicioDetallesIngresosFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetallesIngresosFacturasBusqueda")) {
				this.jButtonid_ejercicioDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDetallesIngresosFacturasBusqueda")) {
				this.jButtonfechaDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoDetallesIngresosFacturasBusqueda")) {
				this.jButtontipo_movimientoDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorDetallesIngresosFacturasBusqueda")) {
				this.jButtonnumero_mayorDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaDetallesIngresosFacturasBusqueda")) {
				this.jButtonnumero_facturaDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteDetallesIngresosFacturasBusqueda")) {
				this.jButtonnombre_clienteDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglas_pagoDetallesIngresosFacturasBusqueda")) {
				this.jButtonsiglas_pagoDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_pagoDetallesIngresosFacturasBusqueda")) {
				this.jButtonnombre_pagoDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDetallesIngresosFacturasBusqueda")) {
				this.jButtoncodigoDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localDetallesIngresosFacturasBusqueda")) {
				this.jButtoncredito_mone_localDetallesIngresosFacturasBusquedaActionPerformed(evt);
			}
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetallesIngresosFacturas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetallesIngresosFacturas")) {
				closingInternalFrameDetallesIngresosFacturas();
				
			} else if(sTipo.equals("jButtonCancelarDetallesIngresosFacturas")) {
				JInternalFrameBase jInternalFrameDetalleFormDetallesIngresosFacturas = (JInternalFrameBase)evt.getSource();
	            	
	            DetallesIngresosFacturasBeanSwingJInternalFrame jInternalFrameParent=(DetallesIngresosFacturasBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallesIngresosFacturas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetallesIngresosFacturasActionPerformed(null);
			}
			
			DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallesingresosfacturas,new Object(),this.detallesingresosfacturasParameterGeneral,this.detallesingresosfacturasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetallesIngresosFacturas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetallesIngresosFacturas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetallesIngresosFacturas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallesingresosfacturas)) {
			if(!esControlTabla) {
				if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);			
				}
				
				if(this.detallesingresosfacturasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetallesIngresosFacturas(this.detallesingresosfacturasReturnGeneral,this.detallesingresosfacturasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallesingresosfacturasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetallesIngresosFacturas(classes,this.detallesingresosfacturasReturnGeneral,this.detallesingresosfacturasBean,false);
					}
						
					if(this.detallesingresosfacturasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetallesIngresosFacturas(this.detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetallesIngresosFacturas(this.detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturas());	
					}
						
					if(this.detallesingresosfacturasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetallesIngresosFacturas(this.detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturas(),classes);//this.detallesingresosfacturasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetallesIngresosFacturas(this.detallesingresosfacturas,classes);//this.detallesingresosfacturasBean);									
				}
			
				if(DetallesIngresosFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetallesIngresosFacturas(this.detallesingresosfacturas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallesIngresosFacturas(this.detallesingresosfacturas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallesingresosfacturasAnterior!=null) {
						this.detallesingresosfacturas=this.detallesingresosfacturasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallesingresosfacturasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturas(),detallesingresosfacturasLogic.getDetallesIngresosFacturass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturas(),this.detallesingresosfacturass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetallesIngresosFacturas.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetallesIngresosFacturas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetallesIngresosFacturas();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetallesIngresosFacturas() throws Exception {
		
		DetallesIngresosFacturasModel detallesingresosfacturasModel=(DetallesIngresosFacturasModel)this.jTableDatosDetallesIngresosFacturas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallesingresosfacturasModel.detallesingresosfacturass=this.detallesingresosfacturasLogic.getDetallesIngresosFacturass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallesingresosfacturasModel.detallesingresosfacturass=this.detallesingresosfacturass;
		}
		
		
		((DetallesIngresosFacturasModel) this.jTableDatosDetallesIngresosFacturas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetallesIngresosFacturas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallesingresosfacturasAnterior(),this.detallesingresosfacturasLogic.getDetallesIngresosFacturass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallesingresosfacturasAnterior(),this.detallesingresosfacturass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetallesIngresosFacturas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
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
										
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallesingresosfacturas,new Object(),generalEntityParameterGeneral,this.detallesingresosfacturasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetallesIngresosFacturasConstantesFunciones.getClassesRelationshipsOfDetallesIngresosFacturas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetallesIngresosFacturasConstantesFunciones.getClassesRelationshipsFromStringsOfDetallesIngresosFacturas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetallesIngresosFacturas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallesingresosfacturas,new Object(),generalEntityParameterGeneral,this.detallesingresosfacturasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetallesIngresosFacturas(DetallesIngresosFacturasBean detallesingresosfacturasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetallesIngresosFacturas(ArrayList<Classe> classes,DetallesIngresosFacturasReturnGeneral detallesingresosfacturasReturnGeneral,DetallesIngresosFacturasBean detallesingresosfacturasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallesingresosfacturas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas = new DetallesIngresosFacturasDetalleFormJInternalFrame(jDesktopPane,this.detallesingresosfacturasSessionBean.getConGuardarRelaciones(),this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.setVisible(false);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.detallesingresosfacturasLogic=this.detallesingresosfacturasLogic;
		
		this.cargarCombosFrameForeignKeyDetallesIngresosFacturas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallesIngresosFacturas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallesIngresosFacturas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetallesIngresosFacturas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetallesIngresosFacturas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallesIngresosFacturas"));
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonModificarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"ModificarDetallesIngresosFacturas"));

		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonModificarToolBarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallesIngresosFacturas"));
					
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemModificarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallesIngresosFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"ActualizarDetallesIngresosFacturas"));
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarToolBarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallesIngresosFacturas"));
						
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemActualizarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallesIngresosFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"EliminarDetallesIngresosFacturas"));
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallesIngresosFacturas"));
								
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemEliminarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallesIngresosFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"CancelarDetallesIngresosFacturas"));
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallesIngresosFacturas"));
					
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemCancelarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallesIngresosFacturas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemDetalleCerrarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallesIngresosFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallesIngresosFacturas"));
		
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallesIngresosFacturas"));
		
		
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallesIngresosFacturas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonidDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"idDetallesIngresosFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_empresaDetallesIngresosFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallesIngresosFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_empresaDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallesIngresosFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_sucursalDetallesIngresosFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallesIngresosFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_sucursalDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallesIngresosFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_ejercicioDetallesIngresosFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallesIngresosFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonfechaDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fechaDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"siglas_pagoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_pagoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtoncodigoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localDetallesIngresosFacturasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTabbedPaneRelacionesDetallesIngresosFacturas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallesIngresosFacturas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetallesIngresosFacturas"));
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallesIngresosFacturas"));
		}
		
		this.jTableDatosDetallesIngresosFacturas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetallesIngresosFacturas"));
		
		this.jTableDatosDetallesIngresosFacturas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetallesIngresosFacturas"));
		
		this.jButtonNuevoDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"NuevoDetallesIngresosFacturas"));
		
		this.jButtonDuplicarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"DuplicarDetallesIngresosFacturas"));
		
		this.jButtonCopiarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"CopiarDetallesIngresosFacturas"));
		
		this.jButtonVerFormDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"VerFormDetallesIngresosFacturas"));
		
		
		this.jButtonNuevoToolBarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetallesIngresosFacturas"));
			
		this.jButtonDuplicarToolBarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetallesIngresosFacturas"));
			
		this.jMenuItemNuevoDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetallesIngresosFacturas"));
			
		this.jMenuItemDuplicarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetallesIngresosFacturas"));		
		
		
		this.jButtonNuevoRelacionesDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetallesIngresosFacturas"));
		
		
		this.jButtonNuevoRelacionesToolBarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetallesIngresosFacturas"));
			
		this.jMenuItemNuevoRelacionesDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetallesIngresosFacturas"));		
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonModificarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"ModificarDetallesIngresosFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonModificarToolBarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallesIngresosFacturas"));
			
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemModificarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallesIngresosFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"ActualizarDetallesIngresosFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonActualizarToolBarDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallesIngresosFacturas"));
				
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemActualizarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallesIngresosFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"EliminarDetallesIngresosFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonEliminarToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallesIngresosFacturas"));
						
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemEliminarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallesIngresosFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"CancelarDetallesIngresosFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonCancelarToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallesIngresosFacturas"));
			
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemCancelarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallesIngresosFacturas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetallesIngresosFacturas"));		
		
		
		this.jButtonCerrarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"CerrarDetallesIngresosFacturas"));
		
		
		this.jButtonCerrarToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetallesIngresosFacturas"));
			
		this.jMenuItemCerrarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetallesIngresosFacturas"));
			
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jMenuItemDetalleCerrarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallesIngresosFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetallesIngresosFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallesIngresosFacturas"));
		}
		
		this.jButtonCopiarToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetallesIngresosFacturas"));
			
		this.jButtonVerFormToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetallesIngresosFacturas"));
		
		this.jMenuItemGuardarCambiosDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetallesIngresosFacturas"));
			
		this.jMenuItemCopiarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetallesIngresosFacturas"));		
		
		this.jMenuItemVerFormDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetallesIngresosFacturas"));		
		
		
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallesIngresosFacturas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetallesIngresosFacturas"));
			
		this.jMenuItemGuardarCambiosTablaDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallesIngresosFacturas"));		
		
		
		
		this.jButtonRecargarInformacionDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetallesIngresosFacturas"));
					
		this.jButtonRecargarInformacionToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetallesIngresosFacturas"));
		
		this.jMenuItemRecargarInformacionDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetallesIngresosFacturas"));		
		
		
		
		this.jButtonAnterioresDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"AnterioresDetallesIngresosFacturas"));
		
		
		this.jButtonAnterioresToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetallesIngresosFacturas"));
		
		this.jMenuItemAnterioresDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetallesIngresosFacturas"));		
		
		
		this.jButtonSiguientesDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"SiguientesDetallesIngresosFacturas"));
		
		
		this.jButtonSiguientesToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetallesIngresosFacturas"));
			
		this.jMenuItemSiguientesDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetallesIngresosFacturas"));
			
		this.jMenuItemAbrirOrderByDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetallesIngresosFacturas"));
			
		this.jMenuItemMostrarOcultarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetallesIngresosFacturas"));
			
		this.jMenuItemDetalleAbrirOrderByDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetallesIngresosFacturas"));
			
		this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetallesIngresosFacturas"));		
		
		
		this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetallesIngresosFacturas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetallesIngresosFacturas"));
			
		this.jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetallesIngresosFacturas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetallesIngresosFacturas"));

		this.jCheckBoxSeleccionadosDetallesIngresosFacturas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetallesIngresosFacturas"));
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallesIngresosFacturas"));
		}
		
		
		this.jComboBoxTiposRelacionesDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetallesIngresosFacturas"));
			
		this.jComboBoxTiposAccionesDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"TiposAccionesDetallesIngresosFacturas"));
					
		this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetallesIngresosFacturas"));
			
		this.jTextFieldValorCampoGeneralDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetallesIngresosFacturas"));		
		
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonidDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"idDetallesIngresosFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_empresaDetallesIngresosFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallesIngresosFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_empresaDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallesIngresosFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_sucursalDetallesIngresosFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallesIngresosFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_sucursalDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallesIngresosFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_ejercicioDetallesIngresosFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallesIngresosFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonfechaDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fechaDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"siglas_pagoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_pagoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtoncodigoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localDetallesIngresosFacturasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"BusquedaDetallesIngresosFacturasDetallesIngresosFacturas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetallesIngresosFacturas!=null) {
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallesIngresosFacturas"));
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallesIngresosFacturas"));
				this.jInternalFrameReporteDinamicoDetallesIngresosFacturas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallesIngresosFacturas"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallesIngresosFacturas"));				
			//this.jButtonGenerarReporteDinamicoDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallesIngresosFacturas"));
			//this.jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallesIngresosFacturas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetallesIngresosFacturas!=null) {
				this.jInternalFrameImportacionDetallesIngresosFacturas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallesIngresosFacturas"));
				this.jInternalFrameImportacionDetallesIngresosFacturas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallesIngresosFacturas"));
				this.jInternalFrameImportacionDetallesIngresosFacturas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallesIngresosFacturas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetallesIngresosFacturas"));
			
			this.jButtonAbrirOrderByToolBarDetallesIngresosFacturas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetallesIngresosFacturas"));			
			
			if(this.jInternalFrameOrderByDetallesIngresosFacturas!=null) {
				this.jInternalFrameOrderByDetallesIngresosFacturas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallesIngresosFacturas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTabbedPaneRelacionesDetallesIngresosFacturas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallesIngresosFacturas"));
		
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
            		closingInternalFrameDetallesIngresosFacturas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetallesIngresosFacturas = (JInternalFrameBase)event.getSource();
	            	
	            DetallesIngresosFacturasBeanSwingJInternalFrame jInternalFrameParent=(DetallesIngresosFacturasBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallesIngresosFacturas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetallesIngresosFacturasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetallesIngresosFacturas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetallesIngresosFacturasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetallesIngresosFacturas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetallesIngresosFacturas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetallesIngresosFacturas";
		inputMap = this.jButtonNuevoDetallesIngresosFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetallesIngresosFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetallesIngresosFacturas";
		inputMap = this.jButtonNuevoRelacionesDetallesIngresosFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetallesIngresosFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallesIngresosFacturasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetallesIngresosFacturas";
		inputMap = this.jButtonModificarDetallesIngresosFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetallesIngresosFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetallesIngresosFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetallesIngresosFacturas";
		inputMap = this.jButtonActualizarDetallesIngresosFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetallesIngresosFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetallesIngresosFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetallesIngresosFacturas";
		inputMap = this.jButtonEliminarDetallesIngresosFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetallesIngresosFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetallesIngresosFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetallesIngresosFacturas";
		inputMap = this.jButtonCancelarDetallesIngresosFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetallesIngresosFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetallesIngresosFacturas";
		inputMap = this.jButtonCerrarDetallesIngresosFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetallesIngresosFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetallesIngresosFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetallesIngresosFacturas";
		inputMap = this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosDetallesIngresosFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonGuardarCambiosDetallesIngresosFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetallesIngresosFacturas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetallesIngresosFacturasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetallesIngresosFacturas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetallesIngresosFacturasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetallesIngresosFacturasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetallesIngresosFacturas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetallesIngresosFacturasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonidDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"idDetallesIngresosFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_empresaDetallesIngresosFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallesIngresosFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_empresaDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallesIngresosFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_sucursalDetallesIngresosFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallesIngresosFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_sucursalDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallesIngresosFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_ejercicioDetallesIngresosFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallesIngresosFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonfechaDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fechaDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"siglas_pagoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_pagoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtoncodigoDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetallesIngresosFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localDetallesIngresosFacturasBusqueda"));
		
		
		this.jButtonBusquedaDetallesIngresosFacturasDetallesIngresosFacturas.addActionListener(new ButtonActionListener(this,"BusquedaDetallesIngresosFacturasDetallesIngresosFacturas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetallesIngresosFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetallesIngresosFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetallesIngresosFacturasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetallesIngresosFacturas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetallesIngresosFacturas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
					detallesingresosfacturasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturass) {
					detallesingresosfacturasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetallesIngresosFacturasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
						detallesingresosfacturasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturass) {
						detallesingresosfacturasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallesIngresosFacturas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallesIngresosFacturas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetallesIngresosFacturasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetallesIngresosFacturas.getSelectedRows();
			
			DetallesIngresosFacturas detallesingresosfacturasLocal=new DetallesIngresosFacturas();
			
			//this.seleccionarTodosDetallesIngresosFacturas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallesingresosfacturasLocal =(DetallesIngresosFacturas) this.detallesingresosfacturasLogic.getDetallesIngresosFacturass().toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallesingresosfacturasLocal =(DetallesIngresosFacturas) this.detallesingresosfacturass.toArray()[this.jTableDatosDetallesIngresosFacturas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallesingresosfacturasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
						detallesingresosfacturasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturass) {
						detallesingresosfacturasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallesIngresosFacturas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallesIngresosFacturas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallesIngresosFacturas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetallesIngresosFacturasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetallesIngresosFacturasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetallesIngresosFacturasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetallesIngresosFacturas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
				
						if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							detallesingresosfacturasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							detallesingresosfacturasAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							detallesingresosfacturasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							detallesingresosfacturasAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							detallesingresosfacturasAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO)) {
							existe=true;
							detallesingresosfacturasAux.setsiglas_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO)) {
							existe=true;
							detallesingresosfacturasAux.setnombre_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							detallesingresosfacturasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							detallesingresosfacturasAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturass) {
					
						if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							detallesingresosfacturasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							detallesingresosfacturasAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							detallesingresosfacturasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							detallesingresosfacturasAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							detallesingresosfacturasAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO)) {
							existe=true;
							detallesingresosfacturasAux.setsiglas_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO)) {
							existe=true;
							detallesingresosfacturasAux.setnombre_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							detallesingresosfacturasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							detallesingresosfacturasAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetallesIngresosFacturasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetallesIngresosFacturas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetallesIngresosFacturas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetallesIngresosFacturas) {				
					conSplash=true;//false;										
					
					//this.startProcessDetallesIngresosFacturas(conSplash);
				
					this.generarReporteDetallesIngresosFacturassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetallesIngresosFacturassSeleccionados();
				//this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallesIngresosFacturassSeleccionados(false);
				//this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallesIngresosFacturassSeleccionados(true);
				//this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallesIngresosFacturas();
				
				this.exportarDetallesIngresosFacturassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetallesIngresosFacturass();
				//this.importarDetallesIngresosFacturass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallesIngresosFacturas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetallesIngresosFacturassSeleccionados();
				//this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalles Ingresos Facturas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetallesIngresosFacturas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetallesIngresosFacturas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetallesIngresosFacturas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalles Ingresos Facturas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setSelectedIndex(0);					
				}	
			} 			
			else if(DetallesIngresosFacturasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetallesIngresosFacturas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetallesIngresosFacturas(conSplash);
					
						//this.actualizarParametrosGeneralDetallesIngresosFacturas();
						
						this.generarReporteProcesoAccionDetallesIngresosFacturassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalles Ingresos FacturasES SELECCIONADOS?", "MANTENIMIENTO DE Detalles Ingresos Facturas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetallesIngresosFacturas();
				
						this.actualizarParametrosGeneralDetallesIngresosFacturas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallesingresosfacturasReturnGeneral=detallesingresosfacturasLogic.procesarAccionDetallesIngresosFacturassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallesingresosfacturasLogic.getDetallesIngresosFacturass(),this.detallesingresosfacturasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetallesIngresosFacturasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetallesIngresosFacturas();
					
					DetallesIngresosFacturasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetallesIngresosFacturasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallesIngresosFacturas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetallesIngresosFacturas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetallesIngresosFacturasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetallesIngresosFacturas();
			
			if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();		
			DetallesIngresosFacturas detallesingresosfacturas=new DetallesIngresosFacturas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetallesIngresosFacturas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetallesIngresosFacturas.getSelectedItem();
			
			
			
			
			detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallesingresosfacturassSeleccionados.size()==1) {
				for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturassSeleccionados) {
					detallesingresosfacturas=detallesingresosfacturasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetallesIngresosFacturas();
			
      		//this.finishProcessDetallesIngresosFacturas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetallesIngresosFacturasReturnGeneral() throws Exception {
		if(this.detallesingresosfacturasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallesingresosfacturasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallesingresosfacturasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallesingresosfacturasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallesingresosfacturasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallesingresosfacturasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetallesIngresosFacturas(false);
		}
		
		if(this.detallesingresosfacturasReturnGeneral.getConRetornoLista() || this.detallesingresosfacturasReturnGeneral.getConRetornoObjeto()) {
			if(this.detallesingresosfacturasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallesingresosfacturasLogic.setDetallesIngresosFacturass(this.detallesingresosfacturasReturnGeneral.getDetallesIngresosFacturass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingDetallesIngresosFacturas(false);
		}
	}
	
	public void actualizarParametrosGeneralDetallesIngresosFacturas() throws Exception {
		
		
	}
	
	public ArrayList<DetallesIngresosFacturas> getDetallesIngresosFacturassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetallesIngresosFacturas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturasLogic.getDetallesIngresosFacturass()) {
					if(detallesingresosfacturasAux.getIsSelected()) {
						detallesingresosfacturassSeleccionados.add(detallesingresosfacturasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallesIngresosFacturas detallesingresosfacturasAux:this.detallesingresosfacturass) {
					if(detallesingresosfacturasAux.getIsSelected()) {
						detallesingresosfacturassSeleccionados.add(detallesingresosfacturasAux);				
					}
				}
			}
			
			if(detallesingresosfacturassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallesingresosfacturassSeleccionados.addAll(this.detallesingresosfacturasLogic.getDetallesIngresosFacturass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallesingresosfacturassSeleccionados.addAll(this.detallesingresosfacturass);				
					}
				}
			}
		} else {
			detallesingresosfacturassSeleccionados.add(this.detallesingresosfacturas);
		}
		
		return detallesingresosfacturassSeleccionados;
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
	
	public void generarReporteDetallesIngresosFacturassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetallesIngresosFacturassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetallesIngresosFacturassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallesIngresosFacturassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallesIngresosFacturassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalles Ingresos Facturas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetallesIngresosFacturassSeleccionados() throws Exception {
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();		
		
		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetallesIngresosFacturass("Todos",detallesingresosfacturassSeleccionados);
		
	}	
	
	public void generarReporteNormalDetallesIngresosFacturassSeleccionados() throws Exception {
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();		
		
		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetallesIngresosFacturass("Todos",detallesingresosfacturassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetallesIngresosFacturassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();
		
		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetallesIngresosFacturass("Todos",detallesingresosfacturassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetallesIngresosFacturassSeleccionados() throws Exception {
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetallesIngresosFacturas();
		
		
		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetallesIngresosFacturas();
		
		
		//this.generarReporteDetallesIngresosFacturass("Todos",detallesingresosfacturassSeleccionados ,detallesingresosfacturasImplementable,detallesingresosfacturasImplementableHome);
	}
	
	public void mostrarImportacionDetallesIngresosFacturass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetallesIngresosFacturas();
		
		this.abrirFrameImportacionDetallesIngresosFacturas();		
		
			
		//this.generarReporteDetallesIngresosFacturass("Todos",detallesingresosfacturassSeleccionados ,detallesingresosfacturasImplementable,detallesingresosfacturasImplementableHome);
	}
	
	public void importarDetallesIngresosFacturass() throws Exception {		
	
	}
	
	public void exportarDetallesIngresosFacturassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetallesIngresosFacturassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetallesIngresosFacturassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetallesIngresosFacturassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalles Ingresos Facturas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetallesIngresosFacturassSeleccionados() throws Exception {
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();		
		
		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallesingresosfacturas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetallesIngresosFacturas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetallesIngresosFacturas(detallesingresosfacturasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallesingresosfacturasAux.setsDetalleGeneralEntityReporte(detallesingresosfacturasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalles Ingresos Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetallesIngresosFacturas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallesingresosfacturas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.gettipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getsiglas_pago();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getnombre_pago();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallesingresosfacturas.getcredito_mone_local().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetallesIngresosFacturassSeleccionados() throws Exception {
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();		
		
		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallesingresosfacturas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetallesIngresosFacturass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetallesIngresosFacturas(row);				
				iRow++;
			}				
			
			for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetallesIngresosFacturas(detallesingresosfacturasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalles Ingresos Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetallesIngresosFacturassSeleccionados() throws Exception {
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();		
		
		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallesingresosfacturas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallesingresosfacturass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallesingresosfacturas");
			//elementRoot.appendChild(element);
		
			for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturassSeleccionados) {
				element = document.createElement("detallesingresosfacturas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetallesIngresosFacturas(detallesingresosfacturasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalles Ingresos Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetallesIngresosFacturas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.gettipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getsiglas_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getnombre_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(detallesingresosfacturas.getcredito_mone_local());				
	}
	
	public void setFilaDatosExportarXmlDetallesIngresosFacturas(DetallesIngresosFacturas detallesingresosfacturas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetallesIngresosFacturasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallesingresosfacturas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetallesIngresosFacturasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallesingresosfacturas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetallesIngresosFacturasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallesingresosfacturas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetallesIngresosFacturasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detallesingresosfacturas.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetallesIngresosFacturasConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detallesingresosfacturas.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementfecha = document.createElement(DetallesIngresosFacturasConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(detallesingresosfacturas.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementtipo_movimiento = document.createElement(DetallesIngresosFacturasConstantesFunciones.TIPOMOVIMIENTO);
		elementtipo_movimiento.appendChild(document.createTextNode(detallesingresosfacturas.gettipo_movimiento().trim()));
		element.appendChild(elementtipo_movimiento);

		Element elementnumero_mayor = document.createElement(DetallesIngresosFacturasConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(detallesingresosfacturas.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementnumero_factura = document.createElement(DetallesIngresosFacturasConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(detallesingresosfacturas.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementnombre_cliente = document.createElement(DetallesIngresosFacturasConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(detallesingresosfacturas.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementsiglas_pago = document.createElement(DetallesIngresosFacturasConstantesFunciones.SIGLASPAGO);
		elementsiglas_pago.appendChild(document.createTextNode(detallesingresosfacturas.getsiglas_pago().trim()));
		element.appendChild(elementsiglas_pago);

		Element elementnombre_pago = document.createElement(DetallesIngresosFacturasConstantesFunciones.NOMBREPAGO);
		elementnombre_pago.appendChild(document.createTextNode(detallesingresosfacturas.getnombre_pago().trim()));
		element.appendChild(elementnombre_pago);

		Element elementcodigo = document.createElement(DetallesIngresosFacturasConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(detallesingresosfacturas.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementcredito_mone_local = document.createElement(DetallesIngresosFacturasConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(detallesingresosfacturas.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);
	}
	
	public void generarReporteGroupGenericoDetallesIngresosFacturassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados=new ArrayList<DetallesIngresosFacturas>();
		
		detallesingresosfacturassSeleccionados=this.getDetallesIngresosFacturassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetallesIngresosFacturas(detallesingresosfacturassSeleccionados);
		
		this.generarReporteDetallesIngresosFacturass("Todos",detallesingresosfacturassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetallesIngresosFacturas(ArrayList<DetallesIngresosFacturas> detallesingresosfacturassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetallesIngresosFacturas detallesingresosfacturasAux:detallesingresosfacturassSeleccionados) {
				detallesingresosfacturasAux.setsDetalleGeneralEntityReporte(detallesingresosfacturasAux.toString());
			
				if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(detallesingresosfacturasAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.gettipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.getsiglas_pago());
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.getnombre_pago());
				}
				 else if(sTipoSeleccionar.equals(DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					detallesingresosfacturasAux.setsDescripcionGeneralEntityReporte1(detallesingresosfacturasAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallesIngresosFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetallesIngresosFacturas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=true;
				this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=true;
				this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=true;
			}
			
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaModificarDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetallesIngresosFacturasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=true;
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=true;
		} else {
			this.actualizarEstadoPanelsDetallesIngresosFacturas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetallesIngresosFacturas=false;
			//this.isVisibilidadCeldaVerFormDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaDuplicarDetallesIngresosFacturas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
		} else {
			this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			if(!detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;												
			}
			
			this.jButtonCerrarDetallesIngresosFacturas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
		}
		
		if(!this.permiteMantenimiento(this.detallesingresosfacturas)) {
			this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=false;
			this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoDetallesIngresosFacturas=false;
		this.isVisibilidadCeldaNuevoRelacionesDetallesIngresosFacturas=false;
		this.isVisibilidadCeldaGuardarCambiosDetallesIngresosFacturas=false;
		//this.isVisibilidadCeldaModificarDetallesIngresosFacturas=true;
		this.isVisibilidadCeldaActualizarDetallesIngresosFacturas=false;
		this.isVisibilidadCeldaEliminarDetallesIngresosFacturas=false;
		//this.isVisibilidadCeldaCancelarDetallesIngresosFacturas=true;			
		this.isVisibilidadCeldaGuardarDetallesIngresosFacturas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetallesIngresosFacturas() {
	}
	
	public void actualizarEstadoPanelsDetallesIngresosFacturas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallesIngresosFacturas!=null) {
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosDetallesIngresosFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallesIngresosFacturas!=null) {
				this.jPanelPaginacionDetallesIngresosFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallesIngresosFacturas!=null) {
				this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallesIngresosFacturas!=null) {
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosDetallesIngresosFacturas.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallesIngresosFacturas!=null) {
				this.jPanelPaginacionDetallesIngresosFacturas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallesIngresosFacturas!=null) {
				this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallesIngresosFacturas!=null) {
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosDetallesIngresosFacturas.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallesIngresosFacturas!=null) {
				this.jPanelPaginacionDetallesIngresosFacturas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallesIngresosFacturas!=null) {
				this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallesIngresosFacturas!=null) {
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosDetallesIngresosFacturas.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallesIngresosFacturas!=null) {
				this.jPanelPaginacionDetallesIngresosFacturas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallesIngresosFacturas!=null) {
				this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallesIngresosFacturas!=null) {
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosDetallesIngresosFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallesIngresosFacturas!=null) {
				this.jPanelPaginacionDetallesIngresosFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallesIngresosFacturas!=null) {
				this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallesIngresosFacturas!=null) {
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosDetallesIngresosFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallesIngresosFacturas!=null) {
				this.jPanelPaginacionDetallesIngresosFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallesIngresosFacturas!=null) {
				this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallesIngresosFacturas!=null) {
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallesIngresosFacturas!=null) {
				this.jScrollPanelDatosDetallesIngresosFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallesIngresosFacturas!=null) {
				this.jPanelPaginacionDetallesIngresosFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallesIngresosFacturas!=null) {
				this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetallesIngresosFacturas!=null) {
					this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetallesIngresosFacturas!=null) {
				this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallesIngresosFacturas!=null) {
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetallesIngresosFacturas!=null) {
				this.jPanelParametrosReportesDetallesIngresosFacturas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaDetallesIngresosFacturas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaDetallesIngresosFacturas) {this.jTabbedPaneBusquedasDetallesIngresosFacturas.remove(jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaDetallesIngresosFacturas=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaDetallesIngresosFacturas) {this.jTabbedPaneBusquedasDetallesIngresosFacturas.remove(jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaDetallesIngresosFacturas=isParaEjercicio;
			if(!this.isVisibilidadBusquedaDetallesIngresosFacturas) {this.jTabbedPaneBusquedasDetallesIngresosFacturas.remove(jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetallesIngresosFacturas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetallesIngresosFacturas() {
		this.updateBorderResaltarBusquedasFormularioDetallesIngresosFacturas();
		this.updateVisibilidadBusquedasFormularioDetallesIngresosFacturas();
		this.updateHabilitarBusquedasFormularioDetallesIngresosFacturas();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetallesIngresosFacturas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetallesIngresosFacturas.getComponents().length>0) {
	

		if(this.detallesingresosfacturasConstantesFunciones.resaltarBusquedaDetallesIngresosFacturasDetallesIngresosFacturas!=null) {
			index= this.jTabbedPaneBusquedasDetallesIngresosFacturas.indexOfComponent(this.jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallesIngresosFacturas.getComponent(index);
				jPanel.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetallesIngresosFacturas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetallesIngresosFacturas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallesIngresosFacturas.indexOfComponent(this.jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallesIngresosFacturas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);
			if(!this.detallesingresosfacturasConstantesFunciones.mostrarBusquedaDetallesIngresosFacturasDetallesIngresosFacturas && index>-1) {
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetallesIngresosFacturas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetallesIngresosFacturas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallesIngresosFacturas.indexOfComponent(this.jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallesIngresosFacturas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);
				this.jTabbedPaneBusquedasDetallesIngresosFacturas.setEnabledAt(index,this.detallesingresosfacturasConstantesFunciones.activarBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetallesIngresosFacturas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaDetallesIngresosFacturas")) {
			index= this.jTabbedPaneBusquedasDetallesIngresosFacturas.indexOfComponent(this.jPanelBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);

			this.jTabbedPaneBusquedasDetallesIngresosFacturas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallesIngresosFacturas.getComponent(index);

			this.detallesingresosfacturasConstantesFunciones.setResaltarBusquedaDetallesIngresosFacturasDetallesIngresosFacturas(resaltar);

			jPanel.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarBusquedaDetallesIngresosFacturasDetallesIngresosFacturas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetallesIngresosFacturas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetallesIngresosFacturas() throws Exception {

		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetallesIngresosFacturas();
		this.updateVisibilidadResaltarControlesFormularioDetallesIngresosFacturas();
		this.updateHabilitarResaltarControlesFormularioDetallesIngresosFacturas();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetallesIngresosFacturas() throws Exception {
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallesingresosfacturasConstantesFunciones.resaltaridDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltaridDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarid_empresaDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarid_empresaDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarid_sucursalDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarid_sucursalDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarid_ejercicioDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarid_ejercicioDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarfechaDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jDateChooserfechaDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarfechaDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltartipo_movimientoDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreatipo_movimientoDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltartipo_movimientoDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarnumero_mayorDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanumero_mayorDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarnumero_mayorDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarnumero_facturaDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldnumero_facturaDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarnumero_facturaDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarnombre_clienteDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_clienteDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarnombre_clienteDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarsiglas_pagoDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldsiglas_pagoDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarsiglas_pagoDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarnombre_pagoDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_pagoDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarnombre_pagoDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarcodigoDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcodigoDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarcodigoDetallesIngresosFacturas);}
		if(this.detallesingresosfacturasConstantesFunciones.resaltarcredito_mone_localDetallesIngresosFacturas!=null && this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcredito_mone_localDetallesIngresosFacturas.setBorder(this.detallesingresosfacturasConstantesFunciones.resaltarcredito_mone_localDetallesIngresosFacturas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetallesIngresosFacturas() throws Exception {		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
	
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostraridDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelidDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostraridDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarid_empresaDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelid_empresaDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarid_empresaDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarid_sucursalDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelid_sucursalDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarid_sucursalDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarid_ejercicioDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelid_ejercicioDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarid_ejercicioDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jDateChooserfechaDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarfechaDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelfechaDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarfechaDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreatipo_movimientoDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrartipo_movimientoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPaneltipo_movimientoDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrartipo_movimientoDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanumero_mayorDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarnumero_mayorDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelnumero_mayorDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarnumero_mayorDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldnumero_facturaDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarnumero_facturaDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelnumero_facturaDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarnumero_facturaDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_clienteDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarnombre_clienteDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelnombre_clienteDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarnombre_clienteDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldsiglas_pagoDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarsiglas_pagoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelsiglas_pagoDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarsiglas_pagoDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_pagoDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarnombre_pagoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelnombre_pagoDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarnombre_pagoDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcodigoDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarcodigoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelcodigoDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarcodigoDetallesIngresosFacturas);
		//this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcredito_mone_localDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarcredito_mone_localDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jPanelcredito_mone_localDetallesIngresosFacturas.setVisible(this.detallesingresosfacturasConstantesFunciones.mostrarcredito_mone_localDetallesIngresosFacturas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetallesIngresosFacturas() throws Exception {
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallesIngresosFacturas!=null) {
	
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jLabelidDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activaridDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_empresaDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarid_empresaDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_sucursalDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarid_sucursalDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jComboBoxid_ejercicioDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarid_ejercicioDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jDateChooserfechaDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarfechaDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreatipo_movimientoDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activartipo_movimientoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanumero_mayorDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarnumero_mayorDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldnumero_facturaDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarnumero_facturaDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_clienteDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarnombre_clienteDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldsiglas_pagoDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarsiglas_pagoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextAreanombre_pagoDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarnombre_pagoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcodigoDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarcodigoDetallesIngresosFacturas);
		this.jInternalFrameDetalleFormDetallesIngresosFacturas.jTextFieldcredito_mone_localDetallesIngresosFacturas.setEnabled(this.detallesingresosfacturasConstantesFunciones.activarcredito_mone_localDetallesIngresosFacturas);
		}
	}
	
		
}