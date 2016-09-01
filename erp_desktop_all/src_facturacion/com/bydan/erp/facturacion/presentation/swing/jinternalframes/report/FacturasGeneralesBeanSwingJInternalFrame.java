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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.FacturasGeneralesConstantesFunciones;
import com.bydan.erp.facturacion.util.report.FacturasGeneralesParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.FacturasGeneralesParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.FacturasGeneralesBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FacturasGeneralesBeanSwingJInternalFrame extends FacturasGeneralesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FacturasGeneralesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FacturasGenerales> facturasgeneralesValidator = new ClassValidator<FacturasGenerales>(FacturasGenerales.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FacturasGenerales facturasgenerales;	
	public FacturasGenerales facturasgeneralesAux;
	public FacturasGenerales facturasgeneralesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FacturasGenerales facturasgeneralesTotales;
	public Long idFacturasGeneralesActual;
	public Long iIdNuevoFacturasGenerales=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboZona="";

	public List<Zona> zonasForeignKey;

	public List<Zona> getzonasForeignKey() {
		return zonasForeignKey;
	}

	public void setzonasForeignKey(List<Zona> zonasForeignKey) {
		this.zonasForeignKey = zonasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Zona zonaForeignKey;

	public Zona getzonaForeignKey() {
		return zonaForeignKey;
	}

	public void setzonaForeignKey(Zona zonaForeignKey) {
		this.zonaForeignKey = zonaForeignKey;
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

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboTipoFactura="";

	public List<TipoFactura> tipofacturasForeignKey;

	public List<TipoFactura> gettipofacturasForeignKey() {
		return tipofacturasForeignKey;
	}

	public void settipofacturasForeignKey(List<TipoFactura> tipofacturasForeignKey) {
		this.tipofacturasForeignKey = tipofacturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFactura tipofacturaForeignKey;

	public TipoFactura gettipofacturaForeignKey() {
		return tipofacturaForeignKey;
	}

	public void settipofacturaForeignKey(TipoFactura tipofacturaForeignKey) {
		this.tipofacturaForeignKey = tipofacturaForeignKey;
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
	
	public Boolean isPermisoTodoFacturasGenerales;
	public Boolean isPermisoNuevoFacturasGenerales;
	public Boolean isPermisoActualizarFacturasGenerales;
	public Boolean isPermisoActualizarOriginalFacturasGenerales;
	public Boolean isPermisoEliminarFacturasGenerales;
	public Boolean isPermisoGuardarCambiosFacturasGenerales;
	public Boolean isPermisoConsultaFacturasGenerales;
	public Boolean isPermisoBusquedaFacturasGenerales;
	public Boolean isPermisoReporteFacturasGenerales;
	public Boolean isPermisoPaginacionMedioFacturasGenerales;
	public Boolean isPermisoPaginacionAltoFacturasGenerales;
	public Boolean isPermisoPaginacionTodoFacturasGenerales;
	public Boolean isPermisoCopiarFacturasGenerales;
	public Boolean isPermisoVerFormFacturasGenerales;
	public Boolean isPermisoDuplicarFacturasGenerales;
	public Boolean isPermisoOrdenFacturasGenerales;
	
	
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
	
	public FacturasGeneralesParameterReturnGeneral facturasgeneralesReturnGeneral;
	public FacturasGeneralesParameterReturnGeneral facturasgeneralesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFacturasGenerales=false;
	public Boolean esParaAccionDesdeFormularioFacturasGenerales=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FacturasGeneralesSessionBeanAdditional facturasgeneralesSessionBeanAdditional=null;
	
	public FacturasGeneralesSessionBeanAdditional getFacturasGeneralesSessionBeanAdditional() {
		return this.facturasgeneralesSessionBeanAdditional;
	}
	
	public void setFacturasGeneralesSessionBeanAdditional(FacturasGeneralesSessionBeanAdditional facturasgeneralesSessionBeanAdditional) {
		try {
			this.facturasgeneralesSessionBeanAdditional=facturasgeneralesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FacturasGeneralesBeanSwingJInternalFrameAdditional facturasgeneralesBeanSwingJInternalFrameAdditional=null;
	//public class FacturasGeneralesBeanSwingJInternalFrame
	
	public FacturasGeneralesBeanSwingJInternalFrameAdditional getFacturasGeneralesBeanSwingJInternalFrameAdditional() {
		return this.facturasgeneralesBeanSwingJInternalFrameAdditional;
	}
	
	public void setFacturasGeneralesBeanSwingJInternalFrameAdditional(FacturasGeneralesBeanSwingJInternalFrameAdditional facturasgeneralesBeanSwingJInternalFrameAdditional) {
		try {
			this.facturasgeneralesBeanSwingJInternalFrameAdditional=facturasgeneralesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FacturasGeneralesLogic facturasgeneralesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FacturasGenerales facturasgeneralesBean;
	public FacturasGeneralesConstantesFunciones facturasgeneralesConstantesFunciones;
	//public FacturasGeneralesParameterReturnGeneral facturasgeneralesReturnGeneral;
	
	//FK
	
	public ZonaLogic zonaLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public TipoFacturaLogic tipofacturaLogic;
	
	//PARAMETROS
	
	
	//public List<FacturasGenerales> facturasgeneraless;	
	//public List<FacturasGenerales> facturasgeneralessEliminados;
	//public List<FacturasGenerales> facturasgeneralessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFacturasGenerales=false;
	public Boolean isVisibilidadCeldaDuplicarFacturasGenerales=true;
	public Boolean isVisibilidadCeldaCopiarFacturasGenerales=true;
	public Boolean isVisibilidadCeldaVerFormFacturasGenerales=true;
	public Boolean isVisibilidadCeldaOrdenFacturasGenerales=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
	public Boolean isVisibilidadCeldaModificarFacturasGenerales=false;
	public Boolean isVisibilidadCeldaActualizarFacturasGenerales=false;
	public Boolean isVisibilidadCeldaEliminarFacturasGenerales=false;
	public Boolean isVisibilidadCeldaCancelarFacturasGenerales=false;
	public Boolean isVisibilidadCeldaGuardarFacturasGenerales=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFacturasGenerales=false;	
	
	
	public Boolean isVisibilidadBusquedaFacturasGenerales=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoFactura=false;
	public Boolean isVisibilidadFK_IdZona=false;
	
	public Long getiIdNuevoFacturasGenerales() {
		return this.iIdNuevoFacturasGenerales;
	}

	public void setiIdNuevoFacturasGenerales(Long iIdNuevoFacturasGenerales) {
		this.iIdNuevoFacturasGenerales = iIdNuevoFacturasGenerales;
	}
	
	public Long getidFacturasGeneralesActual() {
		return this.idFacturasGeneralesActual;
	}

	public void setidFacturasGeneralesActual(Long idFacturasGeneralesActual) {
		this.idFacturasGeneralesActual = idFacturasGeneralesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FacturasGenerales getfacturasgenerales() {
		return this.facturasgenerales;
	}

	public void setfacturasgenerales(FacturasGenerales facturasgenerales) {
		this.facturasgenerales = facturasgenerales;
	}
	
	public FacturasGenerales getfacturasgeneralesAux() {
		return this.facturasgeneralesAux;
	}

	public void setfacturasgeneralesAux(FacturasGenerales facturasgeneralesAux) {
		this.facturasgeneralesAux = facturasgeneralesAux;
	}				
	
	public FacturasGenerales getfacturasgeneralesAnterior() {
		return this.facturasgeneralesAnterior;
	}

	public void setfacturasgeneralesAnterior(FacturasGenerales facturasgeneralesAnterior) {
		this.facturasgeneralesAnterior = facturasgeneralesAnterior;
	}	
	
	public FacturasGenerales getfacturasgeneralesTotales() {
		return this.facturasgeneralesTotales;
	}

	public void setfacturasgeneralesTotales(FacturasGenerales facturasgeneralesTotales) {
		this.facturasgeneralesTotales = facturasgeneralesTotales;
	}	
	
	public FacturasGenerales getfacturasgeneralesBean() {
		return this.facturasgeneralesBean;
	}

	public void setfacturasgeneralesBean(FacturasGenerales facturasgeneralesBean) {
		this.facturasgeneralesBean = facturasgeneralesBean;
	}	
	
	public FacturasGeneralesParameterReturnGeneral getfacturasgeneralesReturnGeneral() {
		return this.facturasgeneralesReturnGeneral;
	}

	public void setfacturasgeneralesReturnGeneral(FacturasGeneralesParameterReturnGeneral facturasgeneralesReturnGeneral) {
		this.facturasgeneralesReturnGeneral = facturasgeneralesReturnGeneral;
	}	
	
	
	public Long id_zonaBusquedaFacturasGenerales=-1L;

	public Long getid_zonaBusquedaFacturasGenerales() {
		return this.id_zonaBusquedaFacturasGenerales;
	}

	public void setid_zonaBusquedaFacturasGenerales(Long id_zonaBusquedaFacturasGenerales) {
		this.id_zonaBusquedaFacturasGenerales = id_zonaBusquedaFacturasGenerales;
	}

;
	public Long id_tipo_clienteBusquedaFacturasGenerales=0L;

	public Long getid_tipo_clienteBusquedaFacturasGenerales() {
		return this.id_tipo_clienteBusquedaFacturasGenerales;
	}

	public void setid_tipo_clienteBusquedaFacturasGenerales(Long id_tipo_clienteBusquedaFacturasGenerales) {
		this.id_tipo_clienteBusquedaFacturasGenerales = id_tipo_clienteBusquedaFacturasGenerales;
	}

;
	public Long id_tipo_facturaBusquedaFacturasGenerales=-1L;

	public Long getid_tipo_facturaBusquedaFacturasGenerales() {
		return this.id_tipo_facturaBusquedaFacturasGenerales;
	}

	public void setid_tipo_facturaBusquedaFacturasGenerales(Long id_tipo_facturaBusquedaFacturasGenerales) {
		this.id_tipo_facturaBusquedaFacturasGenerales = id_tipo_facturaBusquedaFacturasGenerales;
	}

;
	public Date fecha_emision_desdeBusquedaFacturasGenerales=new Date();

	public Date getfecha_emision_desdeBusquedaFacturasGenerales() {
		return this.fecha_emision_desdeBusquedaFacturasGenerales;
	}

	public void setfecha_emision_desdeBusquedaFacturasGenerales(Date fecha_emision_desdeBusquedaFacturasGenerales) {
		this.fecha_emision_desdeBusquedaFacturasGenerales = fecha_emision_desdeBusquedaFacturasGenerales;
	}

;
	public Date fecha_emision_hastaBusquedaFacturasGenerales=new Date();

	public Date getfecha_emision_hastaBusquedaFacturasGenerales() {
		return this.fecha_emision_hastaBusquedaFacturasGenerales;
	}

	public void setfecha_emision_hastaBusquedaFacturasGenerales(Date fecha_emision_hastaBusquedaFacturasGenerales) {
		this.fecha_emision_hastaBusquedaFacturasGenerales = fecha_emision_hastaBusquedaFacturasGenerales;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
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

	public Long id_tipo_facturaFK_IdTipoFactura=-1L;

	public Long getid_tipo_facturaFK_IdTipoFactura() {
		return this.id_tipo_facturaFK_IdTipoFactura;
	}

	public void setid_tipo_facturaFK_IdTipoFactura(Long id_tipo_facturaFK_IdTipoFactura) {
		this.id_tipo_facturaFK_IdTipoFactura = id_tipo_facturaFK_IdTipoFactura;
	}

	public Long id_zonaFK_IdZona=-1L;

	public Long getid_zonaFK_IdZona() {
		return this.id_zonaFK_IdZona;
	}

	public void setid_zonaFK_IdZona(Long id_zonaFK_IdZona) {
		this.id_zonaFK_IdZona = id_zonaFK_IdZona;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FacturasGeneralesLogic getFacturasGeneralesLogic()	{		
		return facturasgeneralesLogic;
	}

	public void setFacturasGeneralesLogic(FacturasGeneralesLogic facturasgeneralesLogic) {
		this.facturasgeneralesLogic = facturasgeneralesLogic;
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
	
	public Boolean getIsEsNuevoFacturasGenerales() {
		return isEsNuevoFacturasGenerales;
	}

	public void setIsEsNuevoFacturasGenerales(Boolean isEsNuevoFacturasGenerales) {
		this.isEsNuevoFacturasGenerales = isEsNuevoFacturasGenerales;
	}

	public Boolean getEsParaAccionDesdeFormularioFacturasGenerales() {
		return esParaAccionDesdeFormularioFacturasGenerales;
	}
	
	public void setEsParaAccionDesdeFormularioFacturasGenerales(Boolean esParaAccionDesdeFormularioFacturasGenerales) {
		this.esParaAccionDesdeFormularioFacturasGenerales = esParaAccionDesdeFormularioFacturasGenerales;
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
	
	
	public void cargarCombosZonasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.zonasForeignKey=new ArrayList<Zona>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ZonaLogic zonaLogic=new ZonaLogic();

			zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

			if(this.facturasgeneralesSessionBean==null) {
				this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
			}

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

					zonaLogic.getTodosZonasWithConnection(sFinalQuery,new Pagination());

					this.zonasForeignKey=zonaLogic.getZonas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaZona(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getEntityWithConnection(facturasgeneralesSessionBean.getlidZonaActual());
					this.zonasForeignKey.add(zonaLogic.getZona());
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

			if(this.facturasgeneralesSessionBean==null) {
				this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
			}

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(facturasgeneralesSessionBean.getlidEmpresaActual());
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

			if(this.facturasgeneralesSessionBean==null) {
				this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
			}

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(facturasgeneralesSessionBean.getlidSucursalActual());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.facturasgeneralesSessionBean==null) {
				this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
			}

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(facturasgeneralesSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosTipoFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipofacturasForeignKey=new ArrayList<TipoFactura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFacturaLogic tipofacturaLogic=new TipoFacturaLogic();

			//tipofacturaLogic.getTipoFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.facturasgeneralesSessionBean==null) {
				this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
			}

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionTipoFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipofacturaLogic.getTipoFacturaDataAccess().setIsForForeingKeyData(true);

					tipofacturaLogic.getTodosTipoFacturasWithConnection(sFinalQuery,new Pagination());

					this.tipofacturasForeignKey=tipofacturaLogic.getTipoFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofacturaLogic.getEntityWithConnection(facturasgeneralesSessionBean.getlidTipoFacturaActual());
					this.tipofacturasForeignKey.add(tipofacturaLogic.getTipoFactura());
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

	
	
	public void setActualZonaForeignKey(Long idZonaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(zonaTemp!=null) {

					if(this.facturasgenerales!=null) {
						this.facturasgenerales.setZona(zonaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.setSelectedItem(zonaTemp);
					}
				} else {
					//jComboBoxid_zonaFacturasGenerales.setSelectedItem(zonaTemp);
					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaFacturasGenerales") || sFormularioTipoBusqueda.equals("Todos")){
					if(zonaTemp!=null && jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales!=null) {
						jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.setSelectedItem(zonaTemp);
					} else {
						if(jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales!=null) {
							//jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.setSelectedItem(zonaTemp);
							if(jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.getItemCount()>0) {
								jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.setSelectedIndex(0);
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

	public String getActualZonaForeignKeyDescripcion(Long idZonaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}


			sDescripcion=ZonaConstantesFunciones.getZonaDescripcion(zonaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualZonaForeignKeyGenerico(Long idZonaSeleccionado,JComboBox jComboBoxid_zonaFacturasGeneralesGenerico)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(zonaTemp!=null) {
				jComboBoxid_zonaFacturasGeneralesGenerico.setSelectedItem(zonaTemp);
			} else {
				if(jComboBoxid_zonaFacturasGeneralesGenerico!=null && jComboBoxid_zonaFacturasGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_zonaFacturasGeneralesGenerico.setSelectedIndex(0);
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

					if(this.facturasgenerales!=null) {
						this.facturasgenerales.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFacturasGenerales.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFacturasGeneralesGenerico)throws Exception
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
				jComboBoxid_empresaFacturasGeneralesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFacturasGeneralesGenerico!=null && jComboBoxid_empresaFacturasGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_empresaFacturasGeneralesGenerico.setSelectedIndex(0);
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

					if(this.facturasgenerales!=null) {
						this.facturasgenerales.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalFacturasGenerales.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalFacturasGeneralesGenerico)throws Exception
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
				jComboBoxid_sucursalFacturasGeneralesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalFacturasGeneralesGenerico!=null && jComboBoxid_sucursalFacturasGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalFacturasGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.facturasgenerales!=null) {
						this.facturasgenerales.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteFacturasGenerales.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteFacturasGeneralesGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteFacturasGeneralesGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteFacturasGeneralesGenerico!=null && jComboBoxid_clienteFacturasGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_clienteFacturasGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFacturaForeignKey(Long idTipoFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFactura  tipofacturaTemp=null;

			for(TipoFactura tipofacturaAux:tipofacturasForeignKey) {
				if(tipofacturaAux.getId()!=null && tipofacturaAux.getId().equals(idTipoFacturaSeleccionado)) {
					tipofacturaTemp=tipofacturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipofacturaTemp!=null) {

					if(this.facturasgenerales!=null) {
						this.facturasgenerales.setTipoFactura(tipofacturaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.setSelectedItem(tipofacturaTemp);
					}
				} else {
					//jComboBoxid_tipo_facturaFacturasGenerales.setSelectedItem(tipofacturaTemp);
					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
						if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaFacturasGenerales") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipofacturaTemp!=null && jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales!=null) {
						jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setSelectedItem(tipofacturaTemp);
					} else {
						if(jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales!=null) {
							//jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setSelectedItem(tipofacturaTemp);
							if(jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.getItemCount()>0) {
								jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setSelectedIndex(0);
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

	public String getActualTipoFacturaForeignKeyDescripcion(Long idTipoFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFactura  tipofacturaTemp=null;

			for(TipoFactura tipofacturaAux:tipofacturasForeignKey) {
				if(tipofacturaAux.getId()!=null && tipofacturaAux.getId().equals(idTipoFacturaSeleccionado)) {
					tipofacturaTemp=tipofacturaAux;
					break;
				}
			}


			sDescripcion=TipoFacturaConstantesFunciones.getTipoFacturaDescripcion(tipofacturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFacturaForeignKeyGenerico(Long idTipoFacturaSeleccionado,JComboBox jComboBoxid_tipo_facturaFacturasGeneralesGenerico)throws Exception
	{
		try
		{
			TipoFactura  tipofacturaTemp=null;

			for(TipoFactura tipofacturaAux:tipofacturasForeignKey) {
				if(tipofacturaAux.getId()!=null && tipofacturaAux.getId().equals(idTipoFacturaSeleccionado)) {
					tipofacturaTemp=tipofacturaAux;
					break;
				}
			}

			if(tipofacturaTemp!=null) {
				jComboBoxid_tipo_facturaFacturasGeneralesGenerico.setSelectedItem(tipofacturaTemp);
			} else {
				if(jComboBoxid_tipo_facturaFacturasGeneralesGenerico!=null && jComboBoxid_tipo_facturaFacturasGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_tipo_facturaFacturasGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarZonaForeignKey(FacturasGenerales facturasgenerales,JComboBox jComboBoxid_zonaFacturasGeneralesGenerico)throws Exception
	{
		try
		{
			Zona  zonaAux=new Zona();

			if(jComboBoxid_zonaFacturasGeneralesGenerico==null) {
				zonaAux=(Zona)this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.getSelectedItem();
			} else {
				zonaAux=(Zona)jComboBoxid_zonaFacturasGeneralesGenerico.getSelectedItem();
			}

			if(zonaAux!=null && zonaAux.getId()!=null) {
				facturasgenerales.setid_zona(zonaAux.getId());
				facturasgenerales.setzona_descripcion(FacturasGeneralesConstantesFunciones.getZonaDescripcion(zonaAux));
				facturasgenerales.setZona(zonaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FacturasGenerales facturasgenerales,JComboBox jComboBoxid_empresaFacturasGeneralesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFacturasGeneralesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFacturasGeneralesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				facturasgenerales.setid_empresa(empresaAux.getId());
				facturasgenerales.setempresa_descripcion(FacturasGeneralesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				facturasgenerales.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(FacturasGenerales facturasgenerales,JComboBox jComboBoxid_sucursalFacturasGeneralesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalFacturasGeneralesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalFacturasGeneralesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				facturasgenerales.setid_sucursal(sucursalAux.getId());
				facturasgenerales.setsucursal_descripcion(FacturasGeneralesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				facturasgenerales.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(FacturasGenerales facturasgenerales,JComboBox jComboBoxid_clienteFacturasGeneralesGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteFacturasGeneralesGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteFacturasGeneralesGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				facturasgenerales.setid_cliente(clienteAux.getId());
				facturasgenerales.setcliente_descripcion(FacturasGeneralesConstantesFunciones.getClienteDescripcion(clienteAux));
				facturasgenerales.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFacturaForeignKey(FacturasGenerales facturasgenerales,JComboBox jComboBoxid_tipo_facturaFacturasGeneralesGenerico)throws Exception
	{
		try
		{
			TipoFactura  tipofacturaAux=new TipoFactura();

			if(jComboBoxid_tipo_facturaFacturasGeneralesGenerico==null) {
				tipofacturaAux=(TipoFactura)this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.getSelectedItem();
			} else {
				tipofacturaAux=(TipoFactura)jComboBoxid_tipo_facturaFacturasGeneralesGenerico.getSelectedItem();
			}

			if(tipofacturaAux!=null && tipofacturaAux.getId()!=null) {
				facturasgenerales.setid_tipo_factura(tipofacturaAux.getId());
				facturasgenerales.settipofactura_descripcion(FacturasGeneralesConstantesFunciones.getTipoFacturaDescripcion(tipofacturaAux));
				facturasgenerales.setTipoFactura(tipofacturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameZonasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingZona=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.addItem(zona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
					}

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaFacturasGenerales") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.addItem(zona);
							}
						}

						if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
					}

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
					}

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
					}

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.removeAllItems();

							for(TipoFactura tipofactura:this.tipofacturasForeignKey) {
								this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.addItem(tipofactura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { 
					}

					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaFacturasGenerales") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.removeAllItems();

							for(TipoFactura tipofactura:this.tipofacturasForeignKey) {
								this.jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.addItem(tipofactura);
							}
						}

						if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameZonaForeignKey(Zona zona,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.setSelectedItem(zona);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.setSelectedItem(zona);
						} else {
							this.jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoFacturaForeignKey(TipoFactura tipofactura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.setSelectedItem(tipofactura);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setSelectedItem(tipofactura);
						} else {
							this.jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFacturasGenerales() throws Exception {
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
		
	public FacturasGeneralesParameterReturnGeneral getFacturasGeneralesParameterGeneral() {
		return this.facturasgeneralesParameterGeneral;
	}
	
	public void setFacturasGeneralesParameterGeneral(FacturasGeneralesParameterReturnGeneral facturasgeneralesParameterGeneral) {
		this.facturasgeneralesParameterGeneral = facturasgeneralesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFacturasGenerales() {
		return isPermisoTodoFacturasGenerales;
	}

	public void setIsPermisoTodoFacturasGenerales(Boolean isPermisoTodoFacturasGenerales) {
		this.isPermisoTodoFacturasGenerales = isPermisoTodoFacturasGenerales;
	}

	public Boolean getIsPermisoNuevoFacturasGenerales() {
		return isPermisoNuevoFacturasGenerales;
	}

	public void setIsPermisoNuevoFacturasGenerales(Boolean isPermisoNuevoFacturasGenerales) {
		this.isPermisoNuevoFacturasGenerales = isPermisoNuevoFacturasGenerales;
	}

	public Boolean getIsPermisoActualizarFacturasGenerales() {
		return isPermisoActualizarFacturasGenerales;
	}

	public void setIsPermisoActualizarFacturasGenerales(Boolean isPermisoActualizarFacturasGenerales) {
		this.isPermisoActualizarFacturasGenerales = isPermisoActualizarFacturasGenerales;
	}

	public Boolean getIsPermisoEliminarFacturasGenerales() {
		return isPermisoEliminarFacturasGenerales;
	}

	public void setIsPermisoEliminarFacturasGenerales(Boolean isPermisoEliminarFacturasGenerales) {
		this.isPermisoEliminarFacturasGenerales = isPermisoEliminarFacturasGenerales;
	}

	public Boolean getIsPermisoGuardarCambiosFacturasGenerales() {
		return isPermisoGuardarCambiosFacturasGenerales;
	}

	public void setIsPermisoGuardarCambiosFacturasGenerales(Boolean isPermisoGuardarCambiosFacturasGenerales) {
		this.isPermisoGuardarCambiosFacturasGenerales = isPermisoGuardarCambiosFacturasGenerales;
	}
	
	public Boolean getIsPermisoConsultaFacturasGenerales() {
		return isPermisoConsultaFacturasGenerales;
	}

	public void setIsPermisoConsultaFacturasGenerales(Boolean isPermisoConsultaFacturasGenerales) {
		this.isPermisoConsultaFacturasGenerales = isPermisoConsultaFacturasGenerales;
	}

	public Boolean getIsPermisoBusquedaFacturasGenerales() {
		return isPermisoBusquedaFacturasGenerales;
	}

	public void setIsPermisoBusquedaFacturasGenerales(Boolean isPermisoBusquedaFacturasGenerales) {
		this.isPermisoBusquedaFacturasGenerales = isPermisoBusquedaFacturasGenerales;
	}

	public Boolean getIsPermisoReporteFacturasGenerales() {
		return isPermisoReporteFacturasGenerales;
	}

	public void setIsPermisoReporteFacturasGenerales(Boolean isPermisoReporteFacturasGenerales) {
		this.isPermisoReporteFacturasGenerales = isPermisoReporteFacturasGenerales;
	}
	
	public Boolean getIsPermisoPaginacionMedioFacturasGenerales() {
		return isPermisoPaginacionMedioFacturasGenerales;
	}

	public void setIsPermisoPaginacionMedioFacturasGenerales(Boolean isPermisoPaginacionMedioFacturasGenerales) {
		this.isPermisoPaginacionMedioFacturasGenerales = isPermisoPaginacionMedioFacturasGenerales;
	}
	
	public Boolean getIsPermisoPaginacionTodoFacturasGenerales() {
		return isPermisoPaginacionTodoFacturasGenerales;
	}

	public void setIsPermisoPaginacionTodoFacturasGenerales(Boolean isPermisoPaginacionTodoFacturasGenerales) {
		this.isPermisoPaginacionTodoFacturasGenerales = isPermisoPaginacionTodoFacturasGenerales;
	}
	
	public Boolean getIsPermisoPaginacionAltoFacturasGenerales() {
		return isPermisoPaginacionAltoFacturasGenerales;
	}

	public void setIsPermisoPaginacionAltoFacturasGenerales(Boolean isPermisoPaginacionAltoFacturasGenerales) {
		this.isPermisoPaginacionAltoFacturasGenerales = isPermisoPaginacionAltoFacturasGenerales;
	}
	
	public Boolean getIsPermisoCopiarFacturasGenerales() {
		return isPermisoCopiarFacturasGenerales;
	}

	public void setIsPermisoCopiarFacturasGenerales(Boolean isPermisoCopiarFacturasGenerales) {
		this.isPermisoCopiarFacturasGenerales = isPermisoCopiarFacturasGenerales;
	}
	
	public Boolean getIsPermisoVerFormFacturasGenerales() {
		return isPermisoVerFormFacturasGenerales;
	}

	public void setIsPermisoVerFormFacturasGenerales(Boolean isPermisoVerFormFacturasGenerales) {
		this.isPermisoVerFormFacturasGenerales = isPermisoVerFormFacturasGenerales;
	}
	
	public Boolean getIsPermisoDuplicarFacturasGenerales() {
		return isPermisoDuplicarFacturasGenerales;
	}

	public void setIsPermisoDuplicarFacturasGenerales(Boolean isPermisoDuplicarFacturasGenerales) {
		this.isPermisoDuplicarFacturasGenerales = isPermisoDuplicarFacturasGenerales;
	}
	
	public Boolean getIsPermisoOrdenFacturasGenerales() {
		return isPermisoOrdenFacturasGenerales;
	}

	public void setIsPermisoOrdenFacturasGenerales(Boolean isPermisoOrdenFacturasGenerales) {
		this.isPermisoOrdenFacturasGenerales = isPermisoOrdenFacturasGenerales;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFacturasGenerales() {
		return isVisibilidadCeldaNuevoFacturasGenerales;
	}

	public void setIsVisibilidadCeldaNuevoFacturasGenerales(Boolean isVisibilidadCeldaNuevoFacturasGenerales) {
		this.isVisibilidadCeldaNuevoFacturasGenerales = isVisibilidadCeldaNuevoFacturasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFacturasGenerales() {
		return isVisibilidadCeldaDuplicarFacturasGenerales;
	}

	public void setIsVisibilidadCeldaDuplicarFacturasGenerales(Boolean isVisibilidadCeldaDuplicarFacturasGenerales) {
		this.isVisibilidadCeldaDuplicarFacturasGenerales = isVisibilidadCeldaDuplicarFacturasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFacturasGenerales() {
		return isVisibilidadCeldaCopiarFacturasGenerales;
	}

	public void setIsVisibilidadCeldaCopiarFacturasGenerales(Boolean isVisibilidadCeldaCopiarFacturasGenerales) {
		this.isVisibilidadCeldaCopiarFacturasGenerales = isVisibilidadCeldaCopiarFacturasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFacturasGenerales() {
		return isVisibilidadCeldaVerFormFacturasGenerales;
	}

	public void setIsVisibilidadCeldaVerFormFacturasGenerales(Boolean isVisibilidadCeldaVerFormFacturasGenerales) {
		this.isVisibilidadCeldaVerFormFacturasGenerales = isVisibilidadCeldaVerFormFacturasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFacturasGenerales() {
		return isVisibilidadCeldaOrdenFacturasGenerales;
	}

	public void setIsVisibilidadCeldaOrdenFacturasGenerales(Boolean isVisibilidadCeldaOrdenFacturasGenerales) {
		this.isVisibilidadCeldaOrdenFacturasGenerales = isVisibilidadCeldaOrdenFacturasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFacturasGenerales() {
		return isVisibilidadCeldaNuevoRelacionesFacturasGenerales;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFacturasGenerales(Boolean isVisibilidadCeldaNuevoRelacionesFacturasGenerales) {
		this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales = isVisibilidadCeldaNuevoRelacionesFacturasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFacturasGenerales() {
		return isVisibilidadCeldaModificarFacturasGenerales;
	}

	public void setIsVisibilidadCeldaModificarFacturasGenerales(Boolean isVisibilidadCeldaModificarFacturasGenerales) {
		this.isVisibilidadCeldaModificarFacturasGenerales = isVisibilidadCeldaModificarFacturasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFacturasGenerales() {
		return isVisibilidadCeldaActualizarFacturasGenerales;
	}

	public void setIsVisibilidadCeldaActualizarFacturasGenerales(Boolean isVisibilidadCeldaActualizarFacturasGenerales) {
		this.isVisibilidadCeldaActualizarFacturasGenerales = isVisibilidadCeldaActualizarFacturasGenerales;
	}

	public Boolean getIsVisibilidadCeldaEliminarFacturasGenerales() {
		return isVisibilidadCeldaEliminarFacturasGenerales;
	}

	public void setIsVisibilidadCeldaEliminarFacturasGenerales(Boolean isVisibilidadCeldaEliminarFacturasGenerales) {
		this.isVisibilidadCeldaEliminarFacturasGenerales = isVisibilidadCeldaEliminarFacturasGenerales;
	}

	public Boolean getIsVisibilidadCeldaCancelarFacturasGenerales() {
		return isVisibilidadCeldaCancelarFacturasGenerales;
	}

	public void setIsVisibilidadCeldaCancelarFacturasGenerales(Boolean isVisibilidadCeldaCancelarFacturasGenerales) {
		this.isVisibilidadCeldaCancelarFacturasGenerales = isVisibilidadCeldaCancelarFacturasGenerales;
	}

	public Boolean getIsVisibilidadCeldaGuardarFacturasGenerales() {
		return isVisibilidadCeldaGuardarFacturasGenerales;
	}

	public void setIsVisibilidadCeldaGuardarFacturasGenerales(Boolean isVisibilidadCeldaGuardarFacturasGenerales) {
		this.isVisibilidadCeldaGuardarFacturasGenerales = isVisibilidadCeldaGuardarFacturasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFacturasGenerales() {
		return isVisibilidadCeldaGuardarCambiosFacturasGenerales;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFacturasGenerales(Boolean isVisibilidadCeldaGuardarCambiosFacturasGenerales) {
		this.isVisibilidadCeldaGuardarCambiosFacturasGenerales = isVisibilidadCeldaGuardarCambiosFacturasGenerales;
	}
		
	public FacturasGeneralesSessionBean getfacturasgeneralesSessionBean() {
		return this.facturasgeneralesSessionBean;
	}
	
	public void setfacturasgeneralesSessionBean(FacturasGeneralesSessionBean facturasgeneralesSessionBean) {
		this.facturasgeneralesSessionBean=facturasgeneralesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaFacturasGenerales() {
		return this.isVisibilidadBusquedaFacturasGenerales;
	}

	public void setisVisibilidadBusquedaFacturasGenerales(Boolean isVisibilidadBusquedaFacturasGenerales) {
		this.isVisibilidadBusquedaFacturasGenerales=isVisibilidadBusquedaFacturasGenerales;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
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

	public Boolean getisVisibilidadFK_IdTipoFactura() {
		return this.isVisibilidadFK_IdTipoFactura;
	}

	public void setisVisibilidadFK_IdTipoFactura(Boolean isVisibilidadFK_IdTipoFactura) {
		this.isVisibilidadFK_IdTipoFactura=isVisibilidadFK_IdTipoFactura;
	}

	public Boolean getisVisibilidadFK_IdZona() {
		return this.isVisibilidadFK_IdZona;
	}

	public void setisVisibilidadFK_IdZona(Boolean isVisibilidadFK_IdZona) {
		this.isVisibilidadFK_IdZona=isVisibilidadFK_IdZona;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(FacturasGenerales facturasgenerales)throws Exception {
		try {
			
				this.setActualParaGuardarZonaForeignKey(facturasgenerales,null);
				this.setActualParaGuardarEmpresaForeignKey(facturasgenerales,null);
				this.setActualParaGuardarSucursalForeignKey(facturasgenerales,null);
				this.setActualParaGuardarClienteForeignKey(facturasgenerales,null);
				this.setActualParaGuardarTipoFacturaForeignKey(facturasgenerales,null);
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
	
	public void bugActualizarReferenciaActual(FacturasGenerales facturasgenerales,FacturasGenerales facturasgeneralesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFacturasGenerales(facturasgenerales);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		facturasgeneralesAux.setId(facturasgenerales.getId());
		facturasgeneralesAux.setVersionRow(facturasgenerales.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(FacturasGenerales facturasgeneralesLocal) throws Exception {
		
		if(this.facturasgeneralesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FacturasGenerales facturasgeneralesLocal) throws Exception {	
		if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ZonaDetalleFormJInternalFrame.class)) {
				ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrameLocal=(ZonaBeanSwingJInternalFrame) ((ZonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				zonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoZona(zonaBeanSwingJInternalFrameLocal.getzona(),true);
				zonaBeanSwingJInternalFrameLocal.actualizarLista(zonaBeanSwingJInternalFrameLocal.zona,this.zonasForeignKey);

				zonaBeanSwingJInternalFrameLocal.actualizarRelaciones(zonaBeanSwingJInternalFrameLocal.zona);

				facturasgeneralesLocal.setZona(zonaBeanSwingJInternalFrameLocal.zona);

				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey("Formulario");
				this.setActualZonaForeignKey(zonaBeanSwingJInternalFrameLocal.zona.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				facturasgeneralesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				facturasgeneralesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				facturasgeneralesLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFacturaDetalleFormJInternalFrame.class)) {
				TipoFacturaBeanSwingJInternalFrame tipofacturaBeanSwingJInternalFrameLocal=(TipoFacturaBeanSwingJInternalFrame) ((TipoFacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipofacturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFactura(tipofacturaBeanSwingJInternalFrameLocal.gettipofactura(),true);
				tipofacturaBeanSwingJInternalFrameLocal.actualizarLista(tipofacturaBeanSwingJInternalFrameLocal.tipofactura,this.tipofacturasForeignKey);

				tipofacturaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipofacturaBeanSwingJInternalFrameLocal.tipofactura);

				facturasgeneralesLocal.setTipoFactura(tipofacturaBeanSwingJInternalFrameLocal.tipofactura);

				this.addItemDefectoCombosForeignKeyTipoFactura();
				this.cargarCombosFrameTipoFacturasForeignKey("Formulario");
				this.setActualTipoFacturaForeignKey(tipofacturaBeanSwingJInternalFrameLocal.tipofactura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFacturasGeneralesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = facturasgeneralesValidator.getInvalidValues(this.facturasgenerales);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FacturasGenerales facturasgenerales,List<FacturasGenerales> facturasgeneraless) throws Exception {
	}		
	
	public void actualizarSelectedLista(FacturasGenerales facturasgenerales,List<FacturasGenerales> facturasgeneraless) throws Exception {
		try	{			
			FacturasGeneralesConstantesFunciones.actualizarSelectedLista(facturasgenerales,facturasgeneraless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FacturasGenerales> facturasgeneralessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				facturasgeneralessLocal=this.facturasgeneralesLogic.getFacturasGeneraless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				facturasgeneralessLocal=this.facturasgeneraless;
			}
			//ARCHITECTURE
		
			for(FacturasGenerales facturasgeneralesLocal:facturasgeneralessLocal) {
				if(this.permiteMantenimiento(facturasgeneralesLocal) && facturasgeneralesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FacturasGeneralesConstantesFunciones.getFacturasGeneralesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnombre_zonaFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnombre_completo_clienteFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.NOMBRETIPOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnombre_tipo_facturaFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelfecha_emisionFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelfecha_vencimientoFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnumero_pre_impresoFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.TOTALDESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabeltotal_descuentoFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.TOTALOTRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabeltotal_otroFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelsub_totalFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabeltotalFacturasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasGeneralesConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelivaFacturasGenerales,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnombre_zonaFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnombre_completo_clienteFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnombre_tipo_facturaFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabelfecha_emisionFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabelfecha_vencimientoFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnumero_pre_impresoFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabeltotal_descuentoFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabeltotal_otroFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabelsub_totalFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabeltotalFacturasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasGenerales.jLabelivaFacturasGenerales,"");
		
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
		this.iIdNuevoFacturasGenerales--;	
		
		
		this.facturasgeneralesAux=new FacturasGenerales();
		
		this.facturasgeneralesAux.setId(this.iIdNuevoFacturasGenerales);
		this.facturasgeneralesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturasgeneralesLogic.getFacturasGeneraless().add(this.facturasgeneralesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.facturasgeneraless.add(this.facturasgeneralesAux);
		}
		//ARCHITECTURE
		
		this.facturasgenerales=this.facturasgeneralesAux;
		
		if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFacturasGenerales(this.facturasgenerales);
			this.setVariablesObjetoActualToFormularioForeignKeyFacturasGenerales(this.facturasgenerales);
		}
				
		//this.setDefaultControlesFacturasGenerales();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFacturasGenerales();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFacturasGenerales();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasGenerales();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturasGenerales(this.facturasgeneralesBean,this.facturasgenerales,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFacturasGenerales(this.facturasgeneralesReturnGeneral,this.facturasgeneralesBean,false);
		
		if(this.facturasgeneralesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFacturasGenerales(this.facturasgeneralesReturnGeneral.getFacturasGenerales());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFacturasGenerales(this.facturasgeneralesReturnGeneral.getFacturasGenerales());
		}
		
		if(this.facturasgeneralesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFacturasGenerales(this.facturasgeneralesReturnGeneral.getFacturasGenerales(),classes);//this.facturasgeneralesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFacturasGenerales();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFacturasGenerales();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.RecargarFormFacturasGenerales(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFacturasGenerales(false);
						
			if(facturasgeneralesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasGenerales();
			}
			
			this.actualizarVisualTableDatosFacturasGenerales();
			
			this.jTableDatosFacturasGenerales.setRowSelectionInterval(this.getIndiceNuevoFacturasGenerales(), this.getIndiceNuevoFacturasGenerales());
			
			this.seleccionarFilaTablaFacturasGeneralesActual();
						
			this.actualizarEstadoCeldasBotonesFacturasGenerales("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFacturasGenerales(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldid_tipo_clienteFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarid_tipo_clienteFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emision_desdeFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarfecha_emision_desdeFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emision_hastaFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarfecha_emision_hastaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnombre_zonaFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarnombre_zonaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_completo_clienteFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarnombre_completo_clienteFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_tipo_facturaFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarnombre_tipo_facturaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emisionFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarfecha_emisionFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_vencimientoFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarfecha_vencimientoFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnumero_pre_impresoFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarnumero_pre_impresoFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_descuentoFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activartotal_descuentoFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_otroFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activartotal_otroFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldsub_totalFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarsub_totalFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotalFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activartotalFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldivaFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarivaFacturasGenerales);	
		
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarid_zonaFacturasGenerales);//
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarid_empresaFacturasGenerales);//
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarid_sucursalFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarid_clienteFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.setEnabled(isHabilitar && this.facturasgeneralesConstantesFunciones.activarid_tipo_facturaFacturasGenerales);
	};
	
	public void setDefaultControlesFacturasGenerales() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFacturasGenerales(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.facturasgeneralesSessionBean.setConGuardarRelaciones(true);			
			this.facturasgeneralesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFacturasGenerales.jTabbedPaneRelacionesFacturasGenerales.setVisible(true);
			
					
		} else {
			//this.facturasgeneralesSessionBean.setConGuardarRelaciones(false);			
			this.facturasgeneralesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFacturasGenerales.jTabbedPaneRelacionesFacturasGenerales.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFacturasGenerales() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasGenerales facturasgeneralesAux:this.facturasgeneralesLogic.getFacturasGeneraless()) {
				if(facturasgeneralesAux.getId().equals(this.iIdNuevoFacturasGenerales)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasGenerales facturasgeneralesAux:this.facturasgeneraless) {
				if(facturasgeneralesAux.getId().equals(this.iIdNuevoFacturasGenerales)) {
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
	
	public int getIndiceActualFacturasGenerales(FacturasGenerales facturasgenerales,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasGenerales facturasgeneralesAux:this.facturasgeneralesLogic.getFacturasGeneraless()) {
				if(facturasgeneralesAux.getId().equals(facturasgenerales.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasGenerales facturasgeneralesAux:this.facturasgeneraless) {
				if(facturasgeneralesAux.getId().equals(facturasgenerales.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFacturasGenerales(FacturasGenerales facturasgeneralesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasGenerales facturasgeneralesAux:this.facturasgeneralesLogic.getFacturasGeneraless()) {
				if(facturasgeneralesAux.getFacturasGeneralesOriginal().getId().equals(facturasgeneralesOriginal.getId())) {
					existe=true;
					facturasgeneralesOriginal.setId(facturasgeneralesAux.getId());
					facturasgeneralesOriginal.setVersionRow(facturasgeneralesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasGenerales facturasgeneralesAux:this.facturasgeneraless) {
				if(facturasgeneralesAux.getFacturasGeneralesOriginal().getId().equals(facturasgeneralesOriginal.getId())) {
					existe=true;
					facturasgeneralesOriginal.setId(facturasgeneralesAux.getId());
					facturasgeneralesOriginal.setVersionRow(facturasgeneralesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFacturasGenerales(Boolean esParaCancelar) throws Exception {
		facturasgeneralessAux=new ArrayList<FacturasGenerales>();
		facturasgeneralesAux=new FacturasGenerales();
		
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturasGenerales facturasgeneralesAux:this.facturasgeneralesLogic.getFacturasGeneraless()) {
					if(facturasgeneralesAux.getId()<0) {
						facturasgeneralessAux.add(facturasgeneralesAux);
					}		
				}
				this.iIdNuevoFacturasGenerales=0L;
				this.facturasgeneralesLogic.getFacturasGeneraless().removeAll(facturasgeneralessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasGenerales facturasgeneralesAux:this.facturasgeneraless) {
					if(facturasgeneralesAux.getId()<0) {
						facturasgeneralessAux.add(facturasgeneralesAux);
					}		
				}
				this.iIdNuevoFacturasGenerales=0L;
				this.facturasgeneraless.removeAll(facturasgeneralessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFacturasGenerales 
					&& this.facturasgeneralesLogic.getFacturasGeneraless().size()>0
					) {
					facturasgeneralesAux=this.facturasgeneralesLogic.getFacturasGeneraless().get(this.facturasgeneralesLogic.getFacturasGeneraless().size() - 1);
				
					if(facturasgeneralesAux.getId()<0) {
						this.facturasgeneralesLogic.getFacturasGeneraless().remove(facturasgeneralesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFacturasGenerales && this.facturasgeneraless.size()>0) {
					facturasgeneralesAux=this.facturasgeneraless.get(this.facturasgeneraless.size() - 1);
				
					if(facturasgeneralesAux.getId()<0) {
						this.facturasgeneraless.remove(facturasgeneralesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFacturasGenerales(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(facturasgenerales.getId()<0) {
				this.facturasgeneralesLogic.getFacturasGeneraless().remove(this.facturasgenerales);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(facturasgenerales.getId()<0) {
				this.facturasgeneraless.remove(this.facturasgenerales);
			}
		}			
	}
	
	public void setEstadosInicialesFacturasGenerales(List<FacturasGenerales> facturasgeneralessAux) throws Exception {
		FacturasGeneralesConstantesFunciones.setEstadosInicialesFacturasGenerales(facturasgeneralessAux);
	}
	
	public void setEstadosInicialesFacturasGenerales(FacturasGenerales facturasgeneralesAux) throws Exception {
		FacturasGeneralesConstantesFunciones.setEstadosInicialesFacturasGenerales(facturasgeneralesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFacturasGeneralesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFacturasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFacturasGeneralesActual()) {
				if(!this.isEsNuevoFacturasGenerales) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFacturasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFacturasGenerales=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFacturasGeneralesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Facturas Generales ?", "MANTENIMIENTO DE Facturas Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFacturasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FacturasGenerales facturasgenerales) throws Exception {
		FacturasGeneralesConstantesFunciones.seleccionarAsignar(this.facturasgenerales,facturasgenerales);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFacturasGenerales=this.isPermisoActualizarOriginalFacturasGenerales;
			
			
			this.seleccionarAsignar(facturasgenerales);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesFacturasGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.facturasgeneralesSessionBean.setsFuncionBusquedaRapida(this.facturasgeneralesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFacturasGenerales) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFacturasGenerales(esParaCancelar);				
				this.cancelarNuevoFacturasGenerales(esParaCancelar);								
			}
			
			this.facturasgenerales=new FacturasGenerales();
			
			this.inicializarFacturasGenerales();
			
			this.actualizarEstadoCeldasBotonesFacturasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFacturasGenerales() throws Exception {
		try {
			FacturasGeneralesConstantesFunciones.inicializarFacturasGenerales(this.facturasgenerales);
			
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
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.facturasgeneralesLogic.getFacturasGeneraless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFacturasGeneraless(String sAccionBusqueda,List<FacturasGenerales> facturasgeneralessParaReportes) throws Exception {
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
					sPathReporteFinal="FacturasGenerales"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FacturasGeneralesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FacturasGeneralesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FacturasGenerales"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Facturas Generaleses");		
		parameters.put("busquedapor", FacturasGeneralesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFacturasGenerales=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FacturasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FacturasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFacturasGenerales=new JRBeanArrayDataSource(FacturasGeneralesJInternalFrame.TraerFacturasGeneralesBeans(facturasgeneralessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFacturasGenerales);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FacturasGeneralesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FacturasGeneralesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FacturasGeneralesBean.TraerFacturasGeneralesBeans(facturasgeneralessParaReportes).toArray()));
							
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
				this.generarExcelReporteFacturasGeneraless(sAccionBusqueda,sTipoArchivoReporte,facturasgeneralessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFacturasGeneraless(sAccionBusqueda,sTipoArchivoReporte,facturasgeneralessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFacturasGeneralesActionPerformed(null);
					//this.generarExcelReporteFacturasGeneraless(sAccionBusqueda,sTipoArchivoReporte,facturasgeneralessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFacturasGeneraless(sAccionBusqueda,sTipoArchivoReporte,facturasgeneralessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFacturasGeneraless(sAccionBusqueda,sTipoArchivoReporte,facturasgeneralessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFacturasGeneraless(sAccionBusqueda,sTipoArchivoReporte,facturasgeneralessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFacturasGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasGenerales> facturasgeneralessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasgenerales";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasGeneraless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturasGenerales("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FacturasGenerales facturasgenerales : facturasgeneralessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FacturasGeneralesConstantesFunciones.generarExcelReporteDataFacturasGenerales("NORMAL",row,workbook,facturasgenerales,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFacturasGenerales(String sTipo,Row row,Workbook workbook) {
		
		FacturasGeneralesConstantesFunciones.generarExcelReporteHeaderFacturasGenerales(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFacturasGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasGenerales> facturasgeneralessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasgenerales_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FacturasGenerales facturasgenerales : facturasgeneralessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FacturasGeneralesConstantesFunciones.getFacturasGeneralesDescripcion(facturasgenerales));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_IDZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getzona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getid_tipo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.gettipofactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getnombre_tipo_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.gettotal_descuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.gettotal_otro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getsub_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasGeneralesConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasgenerales.getiva());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFacturasGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasGenerales> facturasgeneralessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FacturasGenerales> facturasgeneralessRespaldo=null;
		
		classes=FacturasGeneralesConstantesFunciones.getClassesRelationshipsOfFacturasGenerales(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.facturasgeneralesLogic.setDatosCliente(this.datosCliente);
		this.facturasgeneralesLogic.setDatosDeep(this.datosDeep);
		this.facturasgeneralesLogic.setIsConDeep(true);
		
		facturasgeneralessRespaldo=this.facturasgeneralesLogic.getFacturasGeneraless();
		
		this.facturasgeneralesLogic.setFacturasGeneraless(facturasgeneralessParaReportes);	
		this.facturasgeneralesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		facturasgeneralessParaReportes=this.facturasgeneralesLogic.getFacturasGeneraless();
		this.facturasgeneralesLogic.setFacturasGeneraless(facturasgeneralessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasgenerales_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturasGenerales("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FacturasGenerales facturasgenerales : facturasgeneralessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFacturasGenerales("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FacturasGeneralesConstantesFunciones.generarExcelReporteDataFacturasGenerales("NORMAL",row,workbook,facturasgenerales,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FacturasGeneralesConstantesFunciones.getFacturasGeneralesDescripcion(facturasgenerales));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasGenerales.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFacturasGenerales() throws Exception {		
		this.startProcessFacturasGenerales(true);
	}
	
	public void startProcessFacturasGenerales(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFacturasGenerales ,this.jPanelParametrosReportesFacturasGenerales, this.jScrollPanelDatosFacturasGenerales,this.jPanelPaginacionFacturasGenerales, this.jScrollPanelDatosEdicionFacturasGenerales, this.jPanelAccionesFacturasGenerales,this.jPanelAccionesFormularioFacturasGenerales,this.jmenuBarFacturasGenerales,this.jmenuBarDetalleFacturasGenerales,this.jTtoolBarFacturasGenerales,this.jTtoolBarDetalleFacturasGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturasGenerales=this.jTabbedPaneBusquedasFacturasGenerales; 
		
		final JPanel jPanelParametrosReportesFacturasGenerales=this.jPanelParametrosReportesFacturasGenerales;
		//final JScrollPane jScrollPanelDatosFacturasGenerales=this.jScrollPanelDatosFacturasGenerales;
		final JTable jTableDatosFacturasGenerales=this.jTableDatosFacturasGenerales;		
		final JPanel jPanelPaginacionFacturasGenerales=this.jPanelPaginacionFacturasGenerales;
		//final JScrollPane jScrollPanelDatosEdicionFacturasGenerales=this.jScrollPanelDatosEdicionFacturasGenerales;
		final JPanel jPanelAccionesFacturasGenerales=this.jPanelAccionesFacturasGenerales;
		
		JPanel jPanelCamposAuxiliarFacturasGenerales=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFacturasGenerales=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			jPanelCamposAuxiliarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jPanelCamposFacturasGenerales;
			jPanelAccionesFormularioAuxiliarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jPanelAccionesFormularioFacturasGenerales;
		}
		
		final JPanel jPanelCamposFacturasGenerales=jPanelCamposAuxiliarFacturasGenerales;
		final JPanel jPanelAccionesFormularioFacturasGenerales=jPanelAccionesFormularioAuxiliarFacturasGenerales;
		
		
		final JMenuBar jmenuBarFacturasGenerales=this.jmenuBarFacturasGenerales;
		final JToolBar jTtoolBarFacturasGenerales=this.jTtoolBarFacturasGenerales;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFacturasGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturasGenerales=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			jmenuBarDetalleAuxiliarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jmenuBarDetalleFacturasGenerales;
			jTtoolBarDetalleAuxiliarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jTtoolBarDetalleFacturasGenerales;
		}
		
		final JMenuBar jmenuBarDetalleFacturasGenerales=jmenuBarDetalleAuxiliarFacturasGenerales;
		final JToolBar jTtoolBarDetalleFacturasGenerales=jTtoolBarDetalleAuxiliarFacturasGenerales;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturasGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturasGenerales;
			processRunnable.jTableDatos=jTableDatosFacturasGenerales;
			processRunnable.jPanelCampos=jPanelCamposFacturasGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturasGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesFacturasGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturasGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarFacturasGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturasGenerales;
			processRunnable.jTtoolBar=jTtoolBarFacturasGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturasGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturasGenerales ,jPanelParametrosReportesFacturasGenerales,jTableDatosFacturasGenerales, /*jScrollPanelDatosFacturasGenerales,*/jPanelCamposFacturasGenerales,jPanelPaginacionFacturasGenerales, /*jScrollPanelDatosEdicionFacturasGenerales,*/ jPanelAccionesFacturasGenerales,jPanelAccionesFormularioFacturasGenerales,jmenuBarFacturasGenerales,jmenuBarDetalleFacturasGenerales,jTtoolBarFacturasGenerales,jTtoolBarDetalleFacturasGenerales);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturasGenerales ,jPanelParametrosReportesFacturasGenerales, jScrollPanelDatosFacturasGenerales,jPanelPaginacionFacturasGenerales, jScrollPanelDatosEdicionFacturasGenerales, jPanelAccionesFacturasGenerales,jPanelAccionesFormularioFacturasGenerales,jmenuBarFacturasGenerales,jmenuBarDetalleFacturasGenerales,jTtoolBarFacturasGenerales,jTtoolBarDetalleFacturasGenerales);
						
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
	
	public void finishProcessFacturasGenerales() {// throws Exception 
		this.finishProcessFacturasGenerales(true);
	}
	
	public void finishProcessFacturasGenerales(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFacturasGenerales ,this.jPanelParametrosReportesFacturasGenerales, this.jScrollPanelDatosFacturasGenerales,this.jPanelPaginacionFacturasGenerales, this.jScrollPanelDatosEdicionFacturasGenerales, this.jPanelAccionesFacturasGenerales,this.jPanelAccionesFormularioFacturasGenerales,this.jmenuBarFacturasGenerales,this.jmenuBarDetalleFacturasGenerales,this.jTtoolBarFacturasGenerales,this.jTtoolBarDetalleFacturasGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturasGenerales=this.jTabbedPaneBusquedasFacturasGenerales; 
		
		final JPanel jPanelParametrosReportesFacturasGenerales=this.jPanelParametrosReportesFacturasGenerales;
		//final JScrollPane jScrollPanelDatosFacturasGenerales=this.jScrollPanelDatosFacturasGenerales;
		final JTable jTableDatosFacturasGenerales=this.jTableDatosFacturasGenerales;		
		final JPanel jPanelPaginacionFacturasGenerales=this.jPanelPaginacionFacturasGenerales;
		//final JScrollPane jScrollPanelDatosEdicionFacturasGenerales=this.jScrollPanelDatosEdicionFacturasGenerales;
		final JPanel jPanelAccionesFacturasGenerales=this.jPanelAccionesFacturasGenerales;
		
		JPanel jPanelCamposAuxiliarFacturasGenerales=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFacturasGenerales=new JPanel();
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			jPanelCamposAuxiliarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jPanelCamposFacturasGenerales;
			jPanelAccionesFormularioAuxiliarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jPanelAccionesFormularioFacturasGenerales;
		}
		
		final JPanel jPanelCamposFacturasGenerales=jPanelCamposAuxiliarFacturasGenerales;
		final JPanel jPanelAccionesFormularioFacturasGenerales=jPanelAccionesFormularioAuxiliarFacturasGenerales;
		
		
		final JMenuBar jmenuBarFacturasGenerales=this.jmenuBarFacturasGenerales;		
		final JToolBar jTtoolBarFacturasGenerales=this.jTtoolBarFacturasGenerales;
				
		JMenuBar jmenuBarDetalleAuxiliarFacturasGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturasGenerales=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			jmenuBarDetalleAuxiliarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jmenuBarDetalleFacturasGenerales;
			jTtoolBarDetalleAuxiliarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jTtoolBarDetalleFacturasGenerales;		
		}
		
		final JMenuBar jmenuBarDetalleFacturasGenerales=jmenuBarDetalleAuxiliarFacturasGenerales;
		final JToolBar jTtoolBarDetalleFacturasGenerales=jTtoolBarDetalleAuxiliarFacturasGenerales;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturasGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturasGenerales;
			processRunnable.jTableDatos=jTableDatosFacturasGenerales;
			processRunnable.jPanelCampos=jPanelCamposFacturasGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturasGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesFacturasGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturasGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarFacturasGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturasGenerales;
			processRunnable.jTtoolBar=jTtoolBarFacturasGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturasGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFacturasGenerales ,jPanelParametrosReportesFacturasGenerales, jTableDatosFacturasGenerales,/*jScrollPanelDatosFacturasGenerales,*/jPanelCamposFacturasGenerales,jPanelPaginacionFacturasGenerales, /*jScrollPanelDatosEdicionFacturasGenerales,*/ jPanelAccionesFacturasGenerales,jPanelAccionesFormularioFacturasGenerales,jmenuBarFacturasGenerales,jmenuBarDetalleFacturasGenerales,jTtoolBarFacturasGenerales,jTtoolBarDetalleFacturasGenerales));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFacturasGenerales(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFacturasGenerales(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFacturasGenerales(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFacturasGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFacturasGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturasGenerales,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFacturasGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFacturasGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturasGenerales,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.facturasgeneralesConstantesFunciones.getsFinalQueryFacturasGenerales();
		String  finalQueryPaginacionTodos=this.facturasgeneralesConstantesFunciones.getsFinalQueryFacturasGenerales();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FacturasGeneralesConstantesFunciones.getArrayColumnasGlobalesNoFacturasGenerales(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FacturasGeneralesConstantesFunciones.getArrayColumnasGlobalesFacturasGenerales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FacturasGeneralesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.facturasgeneralessEliminados= new ArrayList<FacturasGenerales>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFacturasGenerales();
		
				///*FacturasGeneralesSessionBean*/this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
			
			if(this.facturasgeneralesSessionBean==null) {
				this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
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
					this.iNumeroPaginacion=FacturasGeneralesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FacturasGeneralesConstantesFunciones.getClassesForeignKeysOfFacturasGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/facturasgenerales."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			facturasgeneralessAux= new ArrayList<FacturasGenerales>();
			
				
			facturasgeneralesLogic.setDatosCliente(this.datosCliente);
			facturasgeneralesLogic.setDatosDeep(this.datosDeep);
			facturasgeneralesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaFacturasGenerales")) {
				this.sDetalleReporte=FacturasGeneralesConstantesFunciones.getDetalleIndiceBusquedaFacturasGenerales(id_zonaBusquedaFacturasGenerales,id_tipo_clienteBusquedaFacturasGenerales,id_tipo_facturaBusquedaFacturasGenerales,fecha_emision_desdeBusquedaFacturasGenerales,fecha_emision_hastaBusquedaFacturasGenerales);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturasgeneralesLogic.getFacturasGeneralessBusquedaFacturasGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_zonaBusquedaFacturasGenerales,id_tipo_clienteBusquedaFacturasGenerales,id_tipo_facturaBusquedaFacturasGenerales,fecha_emision_desdeBusquedaFacturasGenerales,fecha_emision_hastaBusquedaFacturasGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturasGeneralesConstantesFunciones.getDetalleIndiceBusquedaFacturasGenerales(id_zonaBusquedaFacturasGenerales,id_tipo_clienteBusquedaFacturasGenerales,id_tipo_facturaBusquedaFacturasGenerales,fecha_emision_desdeBusquedaFacturasGenerales,fecha_emision_hastaBusquedaFacturasGenerales);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturasGeneralesConstantesFunciones.getDetalleIndiceBusquedaFacturasGenerales(id_zonaBusquedaFacturasGenerales,id_tipo_clienteBusquedaFacturasGenerales,id_tipo_facturaBusquedaFacturasGenerales,fecha_emision_desdeBusquedaFacturasGenerales,fecha_emision_hastaBusquedaFacturasGenerales);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturasgeneralesLogic.getFacturasGeneraless()==null||facturasgeneralesLogic.getFacturasGeneraless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturasgeneraless==null|| facturasgeneraless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasgeneralessAux=new ArrayList<FacturasGenerales>();
						facturasgeneralessAux.addAll(facturasgeneralesLogic.getFacturasGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturasgeneralessAux=new ArrayList<FacturasGenerales>();
							facturasgeneralessAux.addAll(facturasgeneraless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturasgeneralesLogic.getFacturasGeneralessBusquedaFacturasGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_zonaBusquedaFacturasGenerales,id_tipo_clienteBusquedaFacturasGenerales,id_tipo_facturaBusquedaFacturasGenerales,fecha_emision_desdeBusquedaFacturasGenerales,fecha_emision_hastaBusquedaFacturasGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturasGeneralesConstantesFunciones.getDetalleIndiceBusquedaFacturasGenerales(id_zonaBusquedaFacturasGenerales,id_tipo_clienteBusquedaFacturasGenerales,id_tipo_facturaBusquedaFacturasGenerales,fecha_emision_desdeBusquedaFacturasGenerales,fecha_emision_hastaBusquedaFacturasGenerales);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturasGeneralesConstantesFunciones.getDetalleIndiceBusquedaFacturasGenerales(id_zonaBusquedaFacturasGenerales,id_tipo_clienteBusquedaFacturasGenerales,id_tipo_facturaBusquedaFacturasGenerales,fecha_emision_desdeBusquedaFacturasGenerales,fecha_emision_hastaBusquedaFacturasGenerales);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturasGeneraless("BusquedaFacturasGenerales",facturasgeneralesLogic.getFacturasGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturasGeneraless("BusquedaFacturasGenerales",facturasgeneraless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasgeneralesLogic.setFacturasGeneraless(new ArrayList<FacturasGenerales>());
						facturasgeneralesLogic.getFacturasGeneraless().addAll(facturasgeneralessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturasgeneraless=new ArrayList<FacturasGenerales>();
							facturasgeneraless.addAll(facturasgeneralessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFacturasGenerales();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFacturasGenerales();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturasgeneralesLogic.getFacturasGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturasgeneraless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturasgeneralesLogic.getFacturasGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturasgeneraless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FacturasGenerales facturasgenerales) {
		Boolean permite=true;
		
		if(this.facturasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FacturasGeneralesConstantesFunciones.getOrderByListaFacturasGenerales();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FacturasGeneralesConstantesFunciones.getOrderByListaFacturasGenerales();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasGenerales facturasgenerales:facturasgeneralesLogic.getFacturasGeneraless()) {
				if(facturasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					facturasgeneralesTotales=facturasgenerales;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasGenerales facturasgenerales:this.facturasgeneraless) {
				if(facturasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					facturasgeneralesTotales=facturasgenerales;
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
			this.facturasgeneralesAux=new FacturasGenerales();
			this.facturasgeneralesAux.setsType(Constantes2.S_TOTALES);
			this.facturasgeneralesAux.setIsNew(false);
			this.facturasgeneralesAux.setIsChanged(false);
			this.facturasgeneralesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//FacturasGeneralesConstantesFunciones.TotalizarValoresFilaFacturasGenerales(this.facturasgeneralesLogic.getFacturasGeneraless(),this.facturasgeneralesAux);
				
				//this.facturasgeneralesLogic.getFacturasGeneraless().add(this.facturasgeneralesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FacturasGeneralesConstantesFunciones.TotalizarValoresFilaFacturasGenerales(this.facturasgeneraless,this.facturasgeneralesAux);
				
				this.facturasgeneraless.add(this.facturasgeneralesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		facturasgeneralesTotales=new FacturasGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturasgeneralesLogic.getFacturasGeneraless().remove(facturasgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturasgeneraless.remove(facturasgeneralesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		facturasgeneralesTotales=new FacturasGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasGenerales facturasgenerales:facturasgeneralesLogic.getFacturasGeneraless()) {
				if(facturasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					facturasgeneralesTotales=facturasgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturasGeneralesConstantesFunciones.TotalizarValoresFilaFacturasGenerales(this.facturasgeneralesLogic.getFacturasGeneraless(),facturasgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasGenerales facturasgenerales:this.facturasgeneraless) {
				if(facturasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					facturasgeneralesTotales=facturasgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturasGeneralesConstantesFunciones.TotalizarValoresFilaFacturasGenerales(this.facturasgeneraless,facturasgeneralesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFacturasGeneralessBusquedaFacturasGenerales()throws Exception {
		try {
			sAccionBusqueda="BusquedaFacturasGenerales";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasGeneralessFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasGeneralessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasGeneralessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasGeneralessFK_IdTipoFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasGeneralessFK_IdZona()throws Exception {
		try {
			sAccionBusqueda="FK_IdZona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFacturasGeneralessBusquedaFacturasGenerales(String sFinalQuery,Long id_zona,Long id_tipo_cliente,Long id_tipo_factura,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasgeneralesLogic.getFacturasGeneralessBusquedaFacturasGenerales(sFinalQuery,this.pagination,id_zona,id_tipo_cliente,id_tipo_factura,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasGeneralessFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasgeneralesLogic.getFacturasGeneralessFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasGeneralessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasgeneralesLogic.getFacturasGeneralessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasGeneralessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasgeneralesLogic.getFacturasGeneralessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasGeneralessFK_IdTipoFactura(String sFinalQuery,Long id_tipo_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasgeneralesLogic.getFacturasGeneralessFK_IdTipoFactura(sFinalQuery,this.pagination,id_tipo_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasGeneralessFK_IdZona(String sFinalQuery,Long id_zona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasgeneralesLogic.getFacturasGeneralessFK_IdZona(sFinalQuery,this.pagination,id_zona);
				
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
	
	public void inicializarPermisosFacturasGenerales() {
		this.isPermisoTodoFacturasGenerales=false;
		this.isPermisoNuevoFacturasGenerales=false;
		this.isPermisoActualizarFacturasGenerales=false;
		this.isPermisoActualizarOriginalFacturasGenerales=false;
		this.isPermisoEliminarFacturasGenerales=false;
		this.isPermisoGuardarCambiosFacturasGenerales=false;
		this.isPermisoConsultaFacturasGenerales=true;
		this.isPermisoBusquedaFacturasGenerales=true;
		this.isPermisoReporteFacturasGenerales=true;
		this.isPermisoOrdenFacturasGenerales=false;		
		this.isPermisoPaginacionMedioFacturasGenerales=false;		
		this.isPermisoPaginacionAltoFacturasGenerales=false;		
		this.isPermisoPaginacionTodoFacturasGenerales=false;		
		this.isPermisoCopiarFacturasGenerales=false;		
		this.isPermisoVerFormFacturasGenerales=false;		
		this.isPermisoDuplicarFacturasGenerales=false;
		this.isPermisoOrdenFacturasGenerales=false;
	}
	
	public void setPermisosUsuarioFacturasGenerales(Boolean isPermiso) {
		this.isPermisoTodoFacturasGenerales=isPermiso;
		this.isPermisoNuevoFacturasGenerales=isPermiso;
		this.isPermisoActualizarFacturasGenerales=isPermiso;
		this.isPermisoActualizarOriginalFacturasGenerales=isPermiso;
		this.isPermisoEliminarFacturasGenerales=isPermiso;
		this.isPermisoGuardarCambiosFacturasGenerales=isPermiso;
		this.isPermisoConsultaFacturasGenerales=isPermiso;
		this.isPermisoBusquedaFacturasGenerales=isPermiso;
		this.isPermisoReporteFacturasGenerales=isPermiso;
		this.isPermisoOrdenFacturasGenerales=isPermiso;		
		this.isPermisoPaginacionMedioFacturasGenerales=isPermiso;		
		this.isPermisoPaginacionAltoFacturasGenerales=isPermiso;		
		this.isPermisoPaginacionTodoFacturasGenerales=isPermiso;		
		this.isPermisoCopiarFacturasGenerales=isPermiso;		
		this.isPermisoVerFormFacturasGenerales=isPermiso;		
		this.isPermisoDuplicarFacturasGenerales=isPermiso;
		this.isPermisoOrdenFacturasGenerales=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFacturasGenerales(Boolean isPermiso) {
		//this.isPermisoTodoFacturasGenerales=isPermiso;
		this.isPermisoNuevoFacturasGenerales=isPermiso;
		this.isPermisoActualizarFacturasGenerales=isPermiso;
		this.isPermisoActualizarOriginalFacturasGenerales=isPermiso;
		this.isPermisoEliminarFacturasGenerales=isPermiso;
		this.isPermisoGuardarCambiosFacturasGenerales=isPermiso;
		//this.isPermisoConsultaFacturasGenerales=isPermiso;
		//this.isPermisoBusquedaFacturasGenerales=isPermiso;
		//this.isPermisoReporteFacturasGenerales=isPermiso;
		//this.isPermisoOrdenFacturasGenerales=isPermiso;		
		//this.isPermisoPaginacionMedioFacturasGenerales=isPermiso;		
		//this.isPermisoPaginacionAltoFacturasGenerales=isPermiso;		
		//this.isPermisoPaginacionTodoFacturasGenerales=isPermiso;		
		//this.isPermisoCopiarFacturasGenerales=isPermiso;		
		//this.isPermisoDuplicarFacturasGenerales=isPermiso;
		//this.isPermisoOrdenFacturasGenerales=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFacturasGeneralesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FacturasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFacturasGenerales(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFacturasGeneralesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFacturasGeneralesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFacturasGeneralesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFacturasGeneralesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFacturasGenerales() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FacturasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FacturasGeneralesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFacturasGenerales=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFacturasGenerales=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFacturasGenerales=this.isPermisoActualizarFacturasGenerales;
			this.isPermisoEliminarFacturasGenerales=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFacturasGenerales=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFacturasGenerales=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFacturasGenerales=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFacturasGenerales=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFacturasGenerales=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturasGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFacturasGenerales=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFacturasGenerales=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFacturasGenerales=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFacturasGenerales=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFacturasGenerales=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFacturasGenerales=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturasGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFacturasGenerales.setToolTipText(this.jTableDatosFacturasGenerales.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFacturasGenerales(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFacturasGenerales(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FacturasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FacturasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFacturasGenerales() throws Exception {
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
	public void inicializarCombosForeignKeyFacturasGeneralesListas()throws Exception {
		try	{						
			
				this.zonasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipofacturasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFacturasGeneralesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FacturasGeneralesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyZonaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.zonasForeignKey==null||this.zonasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ZonaConstantesFunciones.getArrayColumnasGlobalesZona(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ZonaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ZonaConstantesFunciones.SFINALQUERY;

				this.cargarCombosZonasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipofacturasForeignKey==null||this.tipofacturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFacturaConstantesFunciones.getArrayColumnasGlobalesTipoFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyFacturasGenerales()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyZona();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoFactura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyZona()throws Exception {
		try {
			if(this.facturasgeneralesSessionBean==null) {
				this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean();
			}

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				Zona zona=new Zona();
				ZonaConstantesFunciones.setZonaDescripcion(zona,Constantes.SMENSAJE_ESCOJA_OPCION);
				zona.setId(null);

				if(!ZonaConstantesFunciones.ExisteEnLista(this.zonasForeignKey,zona,true)) {

					this.zonasForeignKey.add(0,zona);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoFactura()throws Exception {
		try {

			if(!this.facturasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionTipoFactura()) {
				TipoFactura tipofactura=new TipoFactura();
				TipoFacturaConstantesFunciones.setTipoFacturaDescripcion(tipofactura,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipofactura.setId(null);

				if(!TipoFacturaConstantesFunciones.ExisteEnLista(this.tipofacturasForeignKey,tipofactura,true)) {

					this.tipofacturasForeignKey.add(0,tipofactura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFacturasGenerales()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFacturasGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFacturasGenerales()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasGenerales();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFacturasGenerales(FacturasGenerales facturasgenerales)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFacturasGenerales(FacturasGenerales facturasgenerales,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFacturasGenerales()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasGenerales()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFacturasGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFacturasGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFacturasGenerales()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFacturasGenerales()throws Exception {
		try {
			

			this.cargarCombosFrameZonasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoFacturasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFacturasGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFacturasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFacturasGenerales()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public FacturasGeneralesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FacturasGeneralesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FacturasGeneralesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.facturasgeneralesSessionBean=new FacturasGeneralesSessionBean(); 
		this.facturasgeneralesConstantesFunciones=new FacturasGeneralesConstantesFunciones(); 
		this.facturasgeneralesBean=new FacturasGenerales();//(this.facturasgeneralesConstantesFunciones); 		
		this.facturasgeneralesReturnGeneral=new FacturasGeneralesParameterReturnGeneral(); 
		
		this.facturasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FacturasGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FacturasGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FacturasGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFacturasGenerales(true);
			
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
			
			this.facturasgeneralesConstantesFunciones=new FacturasGeneralesConstantesFunciones(); 
			this.facturasgeneralesBean=new FacturasGenerales();//this.facturasgeneralesConstantesFunciones); 			
			this.facturasgeneralesReturnGeneral=new FacturasGeneralesParameterReturnGeneral(); 
		
			FacturasGeneralesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturas Generales Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.facturasgenerales=new FacturasGenerales();
			this.facturasgeneraless = new ArrayList<FacturasGenerales>();
			this.facturasgeneralessAux = new ArrayList<FacturasGenerales>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic=new FacturasGeneralesLogic();
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.facturasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.facturasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFacturasGenerales);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFacturasGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturasGenerales);	
					}
					
					if(this.jInternalFrameImportacionFacturasGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturasGenerales);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFacturasGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFacturasGenerales);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturasGenerales);
				this.jInternalFrameDetalleFormFacturasGenerales.setVisible(false);
				this.jInternalFrameDetalleFormFacturasGenerales.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturasGenerales);
					this.jInternalFrameReporteDinamicoFacturasGenerales.setVisible(false);
					this.jInternalFrameReporteDinamicoFacturasGenerales.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFacturasGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFacturasGenerales);
					this.jInternalFrameImportacionFacturasGenerales.setVisible(false);
					this.jInternalFrameImportacionFacturasGenerales.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFacturasGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFacturasGenerales);
					this.jInternalFrameOrderByFacturasGenerales.setVisible(false);
					this.jInternalFrameOrderByFacturasGenerales.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFacturasGeneralesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FacturasGeneralesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.facturasgeneralesReturnGeneral=new FacturasGeneralesParameterReturnGeneral();
			
			this.facturasgeneralesParameterGeneral=new FacturasGeneralesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.facturasgeneralesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FacturasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturasGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),this.facturasgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturasGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),this.facturasgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFacturasGenerales=false;
			this.isVisibilidadCeldaDuplicarFacturasGenerales=true;
			this.isVisibilidadCeldaCopiarFacturasGenerales=true;
			this.isVisibilidadCeldaVerFormFacturasGenerales=true;
			this.isVisibilidadCeldaOrdenFacturasGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
			this.isVisibilidadCeldaModificarFacturasGenerales=false;
			this.isVisibilidadCeldaActualizarFacturasGenerales=false;
			this.isVisibilidadCeldaEliminarFacturasGenerales=false;
			this.isVisibilidadCeldaCancelarFacturasGenerales=false;
			this.isVisibilidadCeldaGuardarFacturasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=false;
			
			
			this.isVisibilidadBusquedaFacturasGenerales=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoFactura=true;
			this.isVisibilidadFK_IdZona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFacturasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFacturasGenerales();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFacturasGenerales(false);
			
			this.setPermisosUsuarioFacturasGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado() 
				|| (this.facturasgeneralesSessionBean.getEsGuardarRelacionado() && this.facturasgeneralesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFacturasGeneralesClasesRelacionadas();
			}
			
			if(this.facturasgeneralesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFacturasGeneralesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFacturasGenerales();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFacturasGenerales();
			}
			
			if(!this.isPermisoBusquedaFacturasGenerales) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFacturasGenerales.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FacturasGeneralesConstantesFunciones.getTiposSeleccionarFacturasGenerales());
				
				this.tiposColumnasSelect=FacturasGeneralesConstantesFunciones.getTiposSeleccionarFacturasGenerales(true);
				
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
			//if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFacturasGenerales();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioFacturasGenerales(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioFacturasGenerales(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasGenerales() ;
			
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
			
			this.zonaLogic=new ZonaLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.clienteLogic=new ClienteLogic();
			this.tipofacturaLogic=new TipoFacturaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				facturasgeneralesImplementable= (FacturasGeneralesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturasGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				facturasgeneralesImplementableHome= (FacturasGeneralesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturasGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.facturasgeneraless= new ArrayList<FacturasGenerales>();
			this.facturasgeneralessEliminados= new ArrayList<FacturasGenerales>();
						
			this.isEsNuevoFacturasGenerales=false;
			this.esParaAccionDesdeFormularioFacturasGenerales=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.zonasForeignKey=new ArrayList<Zona>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipofacturasForeignKey=new ArrayList<TipoFactura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFacturasGenerales(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFacturasGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FacturasGeneralesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FacturasGeneralesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFacturasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFacturasGenerales(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFacturasGenerales();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFacturasGenerales();
			}
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFacturasGenerales.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFacturasGenerales.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFacturasGenerales.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFacturasGenerales(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FacturasGenerales: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFacturasGenerales() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFacturasGenerales")) {
				iIndex=this.jInternalFrameDetalleFormFacturasGenerales.jTabbedPaneRelacionesFacturasGenerales.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFacturasGenerales.jTabbedPaneRelacionesFacturasGenerales.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFacturasGenerales();	
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
	
	public void cargarCombosForeignKeyFacturasGenerales(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFacturasGenerales(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFacturasGenerales(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFacturasGeneralesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFacturasGenerales();
		
		this.cargarCombosFrameForeignKeyFacturasGenerales();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFacturasGenerales();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFacturasGenerales();
		}
	}
	
	

	public void cargarCombosForeignKeyZona(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaZona(this.zonasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFactura();
				this.cargarCombosFrameTipoFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFactura(this.tipofacturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFacturasGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.facturasgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
			
			if(jTableDatosFacturasGenerales.getRowCount()>=1) {
				jTableDatosFacturasGenerales.removeRowSelectionInterval(0, jTableDatosFacturasGenerales.getRowCount()-1);						
			}
			
			this.isEsNuevoFacturasGenerales=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFacturasGenerales(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFacturasGenerales(true);			
			//this.facturasgenerales=new FacturasGenerales();
			//this.facturasgenerales.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasGenerales(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasGenerales() ;
			
			if(FacturasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasGenerales(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.facturasgenerales);	
			this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);				
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
			if(this.facturasgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FacturasGenerales: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFacturasGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFacturasGenerales.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFacturasGenerales.getSelectedRows().length;			
			}
			
			facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFacturasGenerales--;			
				//FacturasGenerales facturasgeneralesAux= new FacturasGenerales();			
				//facturasgeneralesAux.setId(this.iIdNuevoFacturasGenerales);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FacturasGenerales facturasgeneralesOrigen=new FacturasGenerales();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FacturasGenerales facturasgeneralesOrigen : facturasgeneralessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							facturasgeneralesOrigen =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturasgeneralesOrigen =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFacturasGenerales();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.facturasgenerales.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFacturasGenerales(facturasgeneralesOrigen,this.facturasgenerales,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturasgeneralesLogic.getFacturasGeneraless().add(this.facturasgeneralesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturasgeneraless.add(this.facturasgeneralesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFacturasGenerales(false);
				
				this.jTableDatosFacturasGenerales.setRowSelectionInterval(this.getIndiceNuevoFacturasGenerales(), this.getIndiceNuevoFacturasGenerales());
				
				int iLastRow =  this.jTableDatosFacturasGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturasGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturasGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasGenerales(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();									
		
			FacturasGenerales facturasgeneralesOrigen=new FacturasGenerales();
			FacturasGenerales facturasgeneralesDestino=new FacturasGenerales();
				
			facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFacturasGenerales.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || facturasgeneralessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFacturasGenerales.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasgeneralesOrigen =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturasgeneralesOrigen =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasgeneralesDestino =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturasgeneralesDestino =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				facturasgeneralesOrigen =facturasgeneralessSeleccionados.get(0);
				facturasgeneralesDestino =facturasgeneralessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFacturasGenerales(facturasgeneralesOrigen,facturasgeneralesDestino,true,false);
				
				facturasgeneralesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturasgeneralesDestino,facturasgeneralesLogic.getFacturasGeneraless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturasgeneralesDestino,facturasgeneraless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFacturasGenerales(false);
				
				//this.jTableDatosFacturasGenerales.setRowSelectionInterval(this.getIndiceNuevoFacturasGenerales(), this.getIndiceNuevoFacturasGenerales());
				
				int iLastRow =  this.jTableDatosFacturasGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturasGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturasGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasGenerales(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFacturasGenerales.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFacturasGenerales.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFacturasGenerales.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFacturasGenerales.setVisible(!isVisible);
			this.jPanelPaginacionFacturasGenerales.setVisible(!isVisible);
			this.jPanelAccionesFacturasGenerales.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFacturasGenerales();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFacturasGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFacturasGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFacturasGenerales();
			
			this.abrirFrameOrderByFacturasGenerales();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFacturasGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFacturasGenerales(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturasGenerales);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFacturasGenerales.isMaximum()) {
					this.jInternalFrameDetalleFormFacturasGenerales.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFacturasGenerales.setSize(this.jInternalFrameDetalleFormFacturasGenerales.iWidthFormulario,this.jInternalFrameDetalleFormFacturasGenerales.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFacturasGenerales.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFacturasGenerales.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFacturasGenerales.isMaximum()) {
						this.jInternalFrameDetalleFormFacturasGenerales.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFacturasGenerales.jContentPaneDetalleFacturasGenerales.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFacturasGenerales.jTabbedPaneRelacionesFacturasGenerales.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFacturasGenerales.jContentPaneDetalleFacturasGenerales.getWidth(),FacturasGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturasGenerales.jTabbedPaneRelacionesFacturasGenerales.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFacturasGenerales.jContentPaneDetalleFacturasGenerales.getWidth(),FacturasGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturasGenerales.jTabbedPaneRelacionesFacturasGenerales.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFacturasGenerales.jContentPaneDetalleFacturasGenerales.getWidth(),FacturasGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFacturasGenerales.setVisible(true);
	        this.jInternalFrameDetalleFormFacturasGenerales.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFacturasGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFacturasGenerales==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFacturasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasGenerales,false,this);
				} else {
					this.jInternalFrameOrderByFacturasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasGenerales,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFacturasGenerales);
				this.jInternalFrameOrderByFacturasGenerales.setVisible(false);
				this.jInternalFrameOrderByFacturasGenerales.setSelected(false);
				
				this.jInternalFrameOrderByFacturasGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturasGenerales"));
				
				this.inicializarActualizarBindingTablaOrderByFacturasGenerales();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFacturasGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFacturasGenerales==null) {
				
				this.jInternalFrameImportacionFacturasGenerales=new ImportacionJInternalFrame(FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturasGenerales);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFacturasGenerales);
				this.jInternalFrameImportacionFacturasGenerales.setVisible(false);
				this.jInternalFrameImportacionFacturasGenerales.setSelected(false);


				this.jInternalFrameImportacionFacturasGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturasGenerales"));
				this.jInternalFrameImportacionFacturasGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturasGenerales"));
				this.jInternalFrameImportacionFacturasGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturasGenerales"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFacturasGenerales() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFacturasGenerales==null) {
				this.jInternalFrameReporteDinamicoFacturasGenerales=new ReporteDinamicoJInternalFrame(FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturasGenerales);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturasGenerales);
				this.jInternalFrameReporteDinamicoFacturasGenerales.setVisible(false);
				this.jInternalFrameReporteDinamicoFacturasGenerales.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFacturasGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasGenerales"));
				this.jInternalFrameReporteDinamicoFacturasGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasGenerales"));
				this.jInternalFrameReporteDinamicoFacturasGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasGenerales"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasGenerales();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFacturasGenerales() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturasGenerales);
			
	       	this.jInternalFrameDetalleFormFacturasGenerales.setVisible(false);
	        this.jInternalFrameDetalleFormFacturasGenerales.setSelected(false);
			
			//this.jInternalFrameDetalleFormFacturasGenerales.dispose();
			//this.jInternalFrameDetalleFormFacturasGenerales=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFacturasGenerales() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFacturasGenerales.setVisible(true);
	        this.jInternalFrameReporteDinamicoFacturasGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFacturasGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFacturasGenerales.setVisible(true);
	        this.jInternalFrameImportacionFacturasGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFacturasGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFacturasGenerales.setVisible(true);
	        this.jInternalFrameOrderByFacturasGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFacturasGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFacturasGenerales.setVisible(false);
	        this.jInternalFrameOrderByFacturasGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFacturasGenerales() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFacturasGenerales.setVisible(false);
	        this.jInternalFrameReporteDinamicoFacturasGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFacturasGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFacturasGenerales.setVisible(false);
	        this.jInternalFrameImportacionFacturasGenerales.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFacturasGenerales(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFacturasGenerales(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFacturasGenerales(true);
			//this.isEsNuevoFacturasGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFacturasGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasGenerales(false) ;
			
			if(facturasgeneralesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FacturasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasGenerales(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFacturasGeneralesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFacturasGenerales(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFacturasGenerales(true);
			//this.isEsNuevoFacturasGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.facturasgenerales.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFacturasGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFacturasGenerales(false) ;
			
			if(FacturasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasGenerales(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaZona(List<Zona> zonasForeignKey)throws Exception{
		TableColumn tableColumnZona=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_IDZONA));
		TableCellEditor tableCellEditorZona =tableColumnZona.getCellEditor();

		ZonaTableCell zonaTableCellFk=(ZonaTableCell)tableCellEditorZona;

		if(zonaTableCellFk!=null) {
			zonaTableCellFk.setzonasForeignKey(zonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturasGenerales.getSelectedRow();

		//if(intSelectedRow<=0) {
			//zonaTableCellFk.setRowActual(intSelectedRow);
			//zonaTableCellFk.setzonasForeignKeyActual(zonasForeignKey);
		//}


		if(zonaTableCellFk!=null) {
			zonaTableCellFk.RecargarZonasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturasGenerales.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFactura(List<TipoFactura> tipofacturasForeignKey)throws Exception{
		TableColumn tableColumnTipoFactura=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA));
		TableCellEditor tableCellEditorTipoFactura =tableColumnTipoFactura.getCellEditor();

		TipoFacturaTableCell tipofacturaTableCellFk=(TipoFacturaTableCell)tableCellEditorTipoFactura;

		if(tipofacturaTableCellFk!=null) {
			tipofacturaTableCellFk.settipofacturasForeignKey(tipofacturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturasGenerales.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipofacturaTableCellFk.setRowActual(intSelectedRow);
			//tipofacturaTableCellFk.settipofacturasForeignKeyActual(tipofacturasForeignKey);
		//}


		if(tipofacturaTableCellFk!=null) {
			tipofacturaTableCellFk.RecargarTipoFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFacturasGenerales(false);
			
			//if(!this.isEsNuevoFacturasGenerales) {								
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				
			}
			
			if(this.permiteMantenimiento(this.facturasgenerales)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFacturasGenerales=true;
					this.inicializarActualizarBindingTablaFacturasGenerales(false);
					this.isEsNuevoFacturasGenerales=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFacturasGenerales=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFacturasGenerales=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturasGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasGenerales(false);
				
				this.habilitarDeshabilitarControlesFacturasGenerales(false);
			
												
				
				if(FacturasGeneralesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFacturasGenerales();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFacturasGeneralesActionPerformed(evt,facturasgeneralesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFacturasGenerales(this.facturasgenerales,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFacturasGenerales.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,facturasgeneralesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.facturasgenerales.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				this.facturasgenerales.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				this.facturasgenerales.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.facturasgenerales)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FacturasGeneralesModel) this.jTableDatosFacturasGenerales.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFacturasGenerales=true;
				this.inicializarActualizarBindingTablaFacturasGenerales(false);
				this.isEsNuevoFacturasGenerales=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturasGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasGenerales(false);
				
				this.habilitarDeshabilitarControlesFacturasGenerales(false);
				
				
				
				if(FacturasGeneralesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFacturasGenerales();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFacturasGenerales.getRowCount()>=1) {
				jTableDatosFacturasGenerales.removeRowSelectionInterval(0, jTableDatosFacturasGenerales.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFacturasGenerales(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFacturasGenerales(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasGenerales(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasGenerales(false) ;
			
			this.isEsNuevoFacturasGenerales=false;
			
			if(FacturasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFacturasGenerales();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFacturasGenerales(false);
				
				//SI ES MANUAL
				if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFacturasGenerales();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFacturasGenerales--;			
			//FacturasGenerales facturasgeneralesAux= new FacturasGenerales();			
			//facturasgeneralesAux.setId(this.iIdNuevoFacturasGenerales);
			
			if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFacturasGenerales();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
			
			this.facturasgenerales.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.facturasgeneralesLogic.getFacturasGeneraless().add(this.facturasgeneralesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.facturasgeneraless.add(this.facturasgeneralesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFacturasGenerales(false);
			
			this.jTableDatosFacturasGenerales.setRowSelectionInterval(this.getIndiceNuevoFacturasGenerales(), this.getIndiceNuevoFacturasGenerales());
			
			int iLastRow =  this.jTableDatosFacturasGenerales.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFacturasGenerales.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFacturasGenerales.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFacturasGenerales(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFacturasGenerales(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasGenerales(false);
			
			//SI ES MANUAL
			if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasGenerales();
			}
			
			//this.abrirFrameTreeFacturasGenerales();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFacturasGenerales.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFacturasGenerales.setFileImportacion(this.jInternalFrameImportacionFacturasGenerales.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFacturasGenerales.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFacturasGenerales.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFacturasGenerales.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFacturasGenerales.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();		

		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FacturasGeneralesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FacturasGeneralesBaseDesign.jrxml";
			
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
			
			this.generarReporteFacturasGeneraless("Todos",facturasgeneralessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Generales",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talDescuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talDescuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talDescuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talDescuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talOtro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talOtro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talOtro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talOtro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFacturasGenerales.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					sNombreCampoCategoria="nombre_tipo_factura";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoria="total_descuento";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO:
					sNombreCampoCategoria="total_otro";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="sub_total";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					sNombreCampoCategoriaValor="nombre_tipo_factura";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoriaValor="total_descuento";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO:
					sNombreCampoCategoriaValor="total_otro";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="sub_total";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_factura");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_descuento");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Otro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_otro");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_total");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
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
	
	public void jButtonGenerarExcelReporteDinamicoFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();		
		
		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasgenerales";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FacturasGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FacturasGeneralesConstantesFunciones.LABEL_IDZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDZONA);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getzona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getid_tipo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.gettipofactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getnombre_tipo_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.gettotal_descuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.gettotal_otro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getsub_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasGeneralesConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IVA);
					iRow++;

					for(FacturasGenerales facturasgenerales:facturasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasgenerales.getiva());
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
			//	this.getFilaCabeceraExportarExcelFacturasGenerales(row);				
			//	iRow++;
			//}				
			
			//for(FacturasGenerales facturasgeneralesAux:facturasgeneralessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFacturasGenerales(facturasgeneralesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Generales",JOptionPane.INFORMATION_MESSAGE);
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
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasGenerales(false);
			
			//SI ES MANUAL
			if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasGenerales();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasGenerales(false);
			
			//SI ES MANUAL
			if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturasGenerales();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasGenerales(false);
			
			//SI ES MANUAL
			if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturasGenerales();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFacturasGenerales() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFacturasGenerales.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFacturasGenerales.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFacturasGenerales.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFacturasGenerales.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFacturasGenerales.setMinimumSize(dimensionMinimum);
		this.jTableDatosFacturasGenerales.setMaximumSize(dimensionMaximum);
		this.jTableDatosFacturasGenerales.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFacturasGenerales(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFacturasGenerales(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFacturasGenerales(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFacturasGenerales(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFacturasGenerales(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFacturasGenerales(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasGenerales(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFacturasGenerales(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFacturasGenerales() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFacturasGenerales();
		
		this.inicializarActualizarBindingBotonesManualFacturasGenerales(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFacturasGenerales();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasGenerales() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasGenerales(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasGenerales(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFacturasGenerales.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFacturasGenerales.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFacturasGenerales.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFacturasGenerales.jCheckBoxPostAccionNuevoFacturasGenerales.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFacturasGenerales.jCheckBoxPostAccionSinCerrarFacturasGenerales.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFacturasGenerales.jCheckBoxPostAccionSinMensajeFacturasGenerales.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFacturasGenerales.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFacturasGenerales.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFacturasGenerales.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
				this.jInternalFrameDetalleFormFacturasGenerales.jCheckBoxPostAccionNuevoFacturasGenerales.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFacturasGenerales.jCheckBoxPostAccionSinCerrarFacturasGenerales.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFacturasGenerales.jCheckBoxPostAccionSinMensajeFacturasGenerales.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFacturasGenerales.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFacturasGenerales.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFacturasGenerales.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFacturasGenerales!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFacturasGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFacturasGenerales.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFacturasGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFacturasGenerales.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFacturasGenerales!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFacturasGenerales.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFacturasGenerales.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFacturasGenerales(Boolean esInicializar) throws Exception {
		try	{	
			if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasGenerales(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFacturasGenerales() throws Exception {
		try	{
			if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturasGenerales();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturasGenerales() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturasGenerales() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFacturasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFacturasGenerales.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFacturasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFacturasGenerales.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFacturasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFacturasGenerales.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFacturasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFacturasGenerales.addItem(reporte);
			}
			
			
			if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFacturasGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFacturasGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFacturasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFacturasGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFacturasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFacturasGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFacturasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFacturasGenerales.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFacturasGenerales.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasGenerales();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasGenerales() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturasGenerales!=null) {
				this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturasGenerales!=null) {
				this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFacturasGenerales!=null) {
				
				if(this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFacturasGenerales.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FacturasGeneralesConstantesFunciones.getTiposSeleccionarFacturasGenerales(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FacturasGeneralesConstantesFunciones.getTiposSeleccionarFacturasGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FacturasGeneralesConstantesFunciones.getTiposSeleccionarFacturasGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFacturasGenerales.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFacturasGenerales()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.getSelectedItem()!=null){this.id_zonaBusquedaFacturasGenerales=((Zona)this.jComboBoxid_zonaBusquedaFacturasGeneralesFacturasGenerales.getSelectedItem()).getId();}
		this.id_tipo_clienteBusquedaFacturasGenerales=Long.parseLong(this.jTextFieldid_tipo_clienteBusquedaFacturasGeneralesFacturasGenerales.getText());
		if(this.jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.getSelectedItem()!=null){this.id_tipo_facturaBusquedaFacturasGenerales=((TipoFactura)this.jComboBoxid_tipo_facturaBusquedaFacturasGeneralesFacturasGenerales.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaFacturasGenerales=new Date(this.jDateChooserfecha_emision_desdeBusquedaFacturasGeneralesFacturasGenerales.getDate().getTime());
		this.fecha_emision_hastaBusquedaFacturasGenerales=new Date(this.jDateChooserfecha_emision_hastaBusquedaFacturasGeneralesFacturasGenerales.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFacturasGenerales(Boolean esInicializar) throws Exception {				
		if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFacturasGenerales();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFacturasGenerales() throws Exception {
		this.inicializarActualizarBindingTablaFacturasGenerales(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFacturasGenerales() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFacturasGeneralesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGeneralesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFacturasGenerales(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=facturasgeneralesLogic.getFacturasGeneraless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=facturasgeneraless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFacturasGenerales.setModel(new FacturasGeneralesModel(this.facturasgeneralesLogic.getFacturasGeneraless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFacturasGenerales.setModel(new FacturasGeneralesModel(this.facturasgeneraless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFacturasGenerales!=null && this.jInternalFrameOrderByFacturasGenerales.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFacturasGenerales();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO,facturasgeneralesConstantesFunciones.resaltarSeleccionarFacturasGenerales,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FacturasGeneralesConstantesFunciones.SCLASSWEBTITULO,facturasgeneralesConstantesFunciones.resaltarSeleccionarFacturasGenerales,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_ID));

		if(this.facturasgeneralesConstantesFunciones.mostraridFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasgeneralesConstantesFunciones.resaltaridFacturasGenerales,this.facturasgeneralesConstantesFunciones.activaridFacturasGenerales,iSizeTabla,this,true,"idFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltaridFacturasGenerales,this.facturasgeneralesConstantesFunciones.activaridFacturasGenerales,this,true,"idFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA));

		if(this.facturasgeneralesConstantesFunciones.mostrarnombre_zonaFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasgeneralesConstantesFunciones.resaltarnombre_zonaFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarnombre_zonaFacturasGenerales,iSizeTabla,this,true,"nombre_zonaFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltarnombre_zonaFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarnombre_zonaFacturasGenerales,this,true,"nombre_zonaFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.facturasgeneralesConstantesFunciones.mostrarnombre_completo_clienteFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasgeneralesConstantesFunciones.resaltarnombre_completo_clienteFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarnombre_completo_clienteFacturasGenerales,iSizeTabla,this,true,"nombre_completo_clienteFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltarnombre_completo_clienteFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarnombre_completo_clienteFacturasGenerales,this,true,"nombre_completo_clienteFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA));

		if(this.facturasgeneralesConstantesFunciones.mostrarnombre_tipo_facturaFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasgeneralesConstantesFunciones.resaltarnombre_tipo_facturaFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarnombre_tipo_facturaFacturasGenerales,iSizeTabla,this,true,"nombre_tipo_facturaFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltarnombre_tipo_facturaFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarnombre_tipo_facturaFacturasGenerales,this,true,"nombre_tipo_facturaFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION));

		if(this.facturasgeneralesConstantesFunciones.mostrarfecha_emisionFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturasgeneralesConstantesFunciones.resaltarfecha_emisionFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarfecha_emisionFacturasGenerales,iSizeTabla,this,true,"fecha_emisionFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltarfecha_emisionFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarfecha_emisionFacturasGenerales,this,true,"fecha_emisionFacturasGenerales","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.facturasgeneralesConstantesFunciones.mostrarfecha_vencimientoFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturasgeneralesConstantesFunciones.resaltarfecha_vencimientoFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarfecha_vencimientoFacturasGenerales,iSizeTabla,this,true,"fecha_vencimientoFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltarfecha_vencimientoFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarfecha_vencimientoFacturasGenerales,this,true,"fecha_vencimientoFacturasGenerales","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.facturasgeneralesConstantesFunciones.mostrarnumero_pre_impresoFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasgeneralesConstantesFunciones.resaltarnumero_pre_impresoFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarnumero_pre_impresoFacturasGenerales,iSizeTabla,this,true,"numero_pre_impresoFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltarnumero_pre_impresoFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarnumero_pre_impresoFacturasGenerales,this,true,"numero_pre_impresoFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO));

		if(this.facturasgeneralesConstantesFunciones.mostrartotal_descuentoFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasgeneralesConstantesFunciones.resaltartotal_descuentoFacturasGenerales,this.facturasgeneralesConstantesFunciones.activartotal_descuentoFacturasGenerales,iSizeTabla,this,true,"total_descuentoFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltartotal_descuentoFacturasGenerales,this.facturasgeneralesConstantesFunciones.activartotal_descuentoFacturasGenerales,this,true,"total_descuentoFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO));

		if(this.facturasgeneralesConstantesFunciones.mostrartotal_otroFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasgeneralesConstantesFunciones.resaltartotal_otroFacturasGenerales,this.facturasgeneralesConstantesFunciones.activartotal_otroFacturasGenerales,iSizeTabla,this,true,"total_otroFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltartotal_otroFacturasGenerales,this.facturasgeneralesConstantesFunciones.activartotal_otroFacturasGenerales,this,true,"total_otroFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL));

		if(this.facturasgeneralesConstantesFunciones.mostrarsub_totalFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasgeneralesConstantesFunciones.resaltarsub_totalFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarsub_totalFacturasGenerales,iSizeTabla,this,true,"sub_totalFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltarsub_totalFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarsub_totalFacturasGenerales,this,true,"sub_totalFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_TOTAL));

		if(this.facturasgeneralesConstantesFunciones.mostrartotalFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasgeneralesConstantesFunciones.resaltartotalFacturasGenerales,this.facturasgeneralesConstantesFunciones.activartotalFacturasGenerales,iSizeTabla,this,true,"totalFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltartotalFacturasGenerales,this.facturasgeneralesConstantesFunciones.activartotalFacturasGenerales,this,true,"totalFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,FacturasGeneralesConstantesFunciones.LABEL_IVA));

		if(this.facturasgeneralesConstantesFunciones.mostrarivaFacturasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasGeneralesConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasgeneralesConstantesFunciones.resaltarivaFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarivaFacturasGenerales,iSizeTabla,this,true,"ivaFacturasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasgeneralesConstantesFunciones.resaltarivaFacturasGenerales,this.facturasgeneralesConstantesFunciones.activarivaFacturasGenerales,this,true,"ivaFacturasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturasGenerales.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturasGenerales.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFacturasGenerales.addColumn(tableColumn);
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
			
			this.jTableDatosFacturasGenerales.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFacturasGenerales.moveColumn(this.jTableDatosFacturasGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFacturasGenerales.moveColumn(this.jTableDatosFacturasGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFacturasGenerales.moveColumn(this.jTableDatosFacturasGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFacturasGenerales.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFacturasGenerales.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFacturasGenerales,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFacturasGenerales.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFacturasGenerales.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFacturasGenerales.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFacturasGenerales.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFacturasGenerales.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=facturasgeneralesLogic.getFacturasGeneraless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=facturasgeneraless.size()-1;
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
		//this.jTableDatosFacturasGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFacturasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFacturasGenerales();
			
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
				
				//this.isEsNuevoFacturasGenerales=false;
					
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
				if(this.facturasgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFacturasGenerales==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturasGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturasGenerales.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.facturasgenerales.getsType().equals("DUPLICADO")
				   || this.facturasgenerales.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFacturasGenerales=true;
				
				} else {
					this.isEsNuevoFacturasGenerales=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
					if(this.facturasgenerales.getId()>=0 && !this.facturasgenerales.getIsNew()) {						
						this.isEsNuevoFacturasGenerales=false;
						
					} else {
						this.isEsNuevoFacturasGenerales=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFacturasGenerales(esRelaciones);						
				
				this.seleccionarFacturasGenerales(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.facturasgenerales.getId()<0) {
					this.isEsNuevoFacturasGenerales=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFacturasGenerales(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFacturasGenerales(evt,rowIndex);
				}	
				
				if(this.facturasgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FacturasGenerales: " + this.dDif); 
					}
				}								
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFacturasGenerales(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.facturasgenerales)) {
					if(this.facturasgenerales.getId()>0) {
						this.facturasgenerales.setIsDeleted(true);
						
						this.facturasgeneralessEliminados.add(this.facturasgenerales);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturasgeneralesLogic.getFacturasGeneraless().remove(this.facturasgenerales);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturasgeneraless.remove(this.facturasgenerales);				
					}
					
					
					((FacturasGeneralesModel) this.jTableDatosFacturasGenerales.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasGenerales(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFacturasGenerales(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFacturasGenerales) {
			
			if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturasGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturasGenerales.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFacturasGenerales(this.facturasgenerales);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFacturasGenerales("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFacturasGenerales(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasGenerales() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturasGenerales(FacturasGenerales facturasgenerales) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFacturasGenerales(facturasgenerales,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturasGenerales(FacturasGenerales facturasgenerales,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFacturasGenerales(facturasgenerales);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFacturasGenerales(facturasgenerales,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFacturasGenerales(facturasgenerales);
	}
	
	public void setVariablesObjetoActualToFormularioFacturasGenerales(FacturasGenerales facturasgenerales) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.setText(facturasgenerales.getId().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnombre_zonaFacturasGenerales.setText(facturasgenerales.getnombre_zona());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_completo_clienteFacturasGenerales.setText(facturasgenerales.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_tipo_facturaFacturasGenerales.setText(facturasgenerales.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emisionFacturasGenerales.setDate(facturasgenerales.getfecha_emision());
			this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_vencimientoFacturasGenerales.setDate(facturasgenerales.getfecha_vencimiento());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnumero_pre_impresoFacturasGenerales.setText(facturasgenerales.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_descuentoFacturasGenerales.setText(facturasgenerales.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_otroFacturasGenerales.setText(facturasgenerales.gettotal_otro().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldsub_totalFacturasGenerales.setText(facturasgenerales.getsub_total().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotalFacturasGenerales.setText(facturasgenerales.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldivaFacturasGenerales.setText(facturasgenerales.getiva().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FacturasGenerales facturasgeneralesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,facturasgeneralesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FacturasGenerales facturasgeneralesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				facturasgeneralesLocal=this.facturasgenerales;
			} else {
				facturasgeneralesLocal=this.facturasgeneralesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(facturasgeneralesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFacturasGenerales(facturasgeneralesLocal,true);
					
					if(facturasgeneralesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(facturasgeneralesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(facturasgeneralesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFacturasGenerales(FacturasGenerales facturasgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturasGenerales(facturasgenerales,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(facturasgenerales);
	}
	
	public void setVariablesFormularioToObjetoActualFacturasGenerales(FacturasGenerales facturasgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturasGenerales(facturasgenerales,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFacturasGenerales(FacturasGenerales facturasgenerales,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.getText()==null || this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.getText()=="" || this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.getText()=="Id") {
				this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.setText("0");
			}

			if(conColumnasBase) {facturasgenerales.setId(Long.parseLong(this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelIdFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.setnombre_zona(this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnombre_zonaFacturasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnombre_zonaFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.setnombre_completo_cliente(this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_completo_clienteFacturasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnombre_completo_clienteFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.setnombre_tipo_factura(this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_tipo_facturaFacturasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnombre_tipo_facturaFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.setfecha_emision(this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emisionFacturasGenerales.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelfecha_emisionFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.setfecha_vencimiento(this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_vencimientoFacturasGenerales.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelfecha_vencimientoFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.setnumero_pre_impreso(this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnumero_pre_impresoFacturasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelnumero_pre_impresoFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.settotal_descuento(Double.parseDouble(this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_descuentoFacturasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabeltotal_descuentoFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.settotal_otro(Double.parseDouble(this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_otroFacturasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabeltotal_otroFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.setsub_total(Double.parseDouble(this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldsub_totalFacturasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelsub_totalFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.settotal(Double.parseDouble(this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotalFacturasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabeltotalFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasgenerales.setiva(Double.parseDouble(this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldivaFacturasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasGeneralesConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasGenerales.jLabelivaFacturasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturasGenerales(FacturasGenerales facturasgeneralesBean,FacturasGenerales facturasgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFacturasGenerales(FacturasGenerales facturasgeneralesOrigen,FacturasGenerales facturasgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturasgeneralesOrigen.getId()!=null && !facturasgeneralesOrigen.getId().equals(0L))) {facturasgenerales.setId(facturasgeneralesOrigen.getId());}}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getid_tipo_cliente()!=null && !facturasgeneralesOrigen.getid_tipo_cliente().equals(0L))) {facturasgenerales.setid_tipo_cliente(facturasgeneralesOrigen.getid_tipo_cliente());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getfecha_emision_desde()!=null && !facturasgeneralesOrigen.getfecha_emision_desde().equals(new Date()))) {facturasgenerales.setfecha_emision_desde(facturasgeneralesOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getfecha_emision_hasta()!=null && !facturasgeneralesOrigen.getfecha_emision_hasta().equals(new Date()))) {facturasgenerales.setfecha_emision_hasta(facturasgeneralesOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getnombre_zona()!=null && !facturasgeneralesOrigen.getnombre_zona().equals(""))) {facturasgenerales.setnombre_zona(facturasgeneralesOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getnombre_completo_cliente()!=null && !facturasgeneralesOrigen.getnombre_completo_cliente().equals(""))) {facturasgenerales.setnombre_completo_cliente(facturasgeneralesOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getnombre_tipo_factura()!=null && !facturasgeneralesOrigen.getnombre_tipo_factura().equals(""))) {facturasgenerales.setnombre_tipo_factura(facturasgeneralesOrigen.getnombre_tipo_factura());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getfecha_emision()!=null && !facturasgeneralesOrigen.getfecha_emision().equals(new Date()))) {facturasgenerales.setfecha_emision(facturasgeneralesOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getfecha_vencimiento()!=null && !facturasgeneralesOrigen.getfecha_vencimiento().equals(new Date()))) {facturasgenerales.setfecha_vencimiento(facturasgeneralesOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getnumero_pre_impreso()!=null && !facturasgeneralesOrigen.getnumero_pre_impreso().equals(""))) {facturasgenerales.setnumero_pre_impreso(facturasgeneralesOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.gettotal_descuento()!=null && !facturasgeneralesOrigen.gettotal_descuento().equals(0.0))) {facturasgenerales.settotal_descuento(facturasgeneralesOrigen.gettotal_descuento());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.gettotal_otro()!=null && !facturasgeneralesOrigen.gettotal_otro().equals(0.0))) {facturasgenerales.settotal_otro(facturasgeneralesOrigen.gettotal_otro());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getsub_total()!=null && !facturasgeneralesOrigen.getsub_total().equals(0.0))) {facturasgenerales.setsub_total(facturasgeneralesOrigen.getsub_total());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.gettotal()!=null && !facturasgeneralesOrigen.gettotal().equals(0.0))) {facturasgenerales.settotal(facturasgeneralesOrigen.gettotal());}
			if(conDefault || (!conDefault && facturasgeneralesOrigen.getiva()!=null && !facturasgeneralesOrigen.getiva().equals(0.0))) {facturasgenerales.setiva(facturasgeneralesOrigen.getiva());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturasGenerales(FacturasGenerales facturasgenerales) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.setText(facturasgenerales.getId().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnombre_zonaFacturasGenerales.setText(facturasgenerales.getnombre_zona());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_completo_clienteFacturasGenerales.setText(facturasgenerales.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_tipo_facturaFacturasGenerales.setText(facturasgenerales.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emisionFacturasGenerales.setDate(facturasgenerales.getfecha_emision());
			this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_vencimientoFacturasGenerales.setDate(facturasgenerales.getfecha_vencimiento());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnumero_pre_impresoFacturasGenerales.setText(facturasgenerales.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_descuentoFacturasGenerales.setText(facturasgenerales.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_otroFacturasGenerales.setText(facturasgenerales.gettotal_otro().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldsub_totalFacturasGenerales.setText(facturasgenerales.getsub_total().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotalFacturasGenerales.setText(facturasgenerales.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldivaFacturasGenerales.setText(facturasgenerales.getiva().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturasGenerales(FacturasGeneralesBean facturasgeneralesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.setText(facturasgeneralesBean.getId().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnombre_zonaFacturasGenerales.setText(facturasgeneralesBean.getnombre_zona());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_completo_clienteFacturasGenerales.setText(facturasgeneralesBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_tipo_facturaFacturasGenerales.setText(facturasgeneralesBean.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emisionFacturasGenerales.setDate(facturasgeneralesBean.getfecha_emision());
			this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_vencimientoFacturasGenerales.setDate(facturasgeneralesBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnumero_pre_impresoFacturasGenerales.setText(facturasgeneralesBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_descuentoFacturasGenerales.setText(facturasgeneralesBean.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_otroFacturasGenerales.setText(facturasgeneralesBean.gettotal_otro().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldsub_totalFacturasGenerales.setText(facturasgeneralesBean.getsub_total().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotalFacturasGenerales.setText(facturasgeneralesBean.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldivaFacturasGenerales.setText(facturasgeneralesBean.getiva().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFacturasGenerales(FacturasGeneralesParameterReturnGeneral facturasgeneralesReturnGeneral,FacturasGeneralesBean facturasgeneralesBean,Boolean conDefault) throws Exception { 
		try {
			FacturasGenerales facturasgeneralesLocal=new FacturasGenerales();
			
			facturasgeneralesLocal=facturasgeneralesReturnGeneral.getFacturasGenerales();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturasgeneralesLocal.getId()!=null && !facturasgeneralesLocal.getId().equals(0L))) {facturasgeneralesBean.setId(facturasgeneralesLocal.getId());}}
			if(conDefault || (!conDefault && facturasgeneralesLocal.getnombre_zona()!=null && !facturasgeneralesLocal.getnombre_zona().equals(""))) {facturasgeneralesBean.setnombre_zona(facturasgeneralesLocal.getnombre_zona());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.getnombre_completo_cliente()!=null && !facturasgeneralesLocal.getnombre_completo_cliente().equals(""))) {facturasgeneralesBean.setnombre_completo_cliente(facturasgeneralesLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.getnombre_tipo_factura()!=null && !facturasgeneralesLocal.getnombre_tipo_factura().equals(""))) {facturasgeneralesBean.setnombre_tipo_factura(facturasgeneralesLocal.getnombre_tipo_factura());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.getfecha_emision()!=null && !facturasgeneralesLocal.getfecha_emision().equals(new Date()))) {facturasgeneralesBean.setfecha_emision(facturasgeneralesLocal.getfecha_emision());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.getfecha_vencimiento()!=null && !facturasgeneralesLocal.getfecha_vencimiento().equals(new Date()))) {facturasgeneralesBean.setfecha_vencimiento(facturasgeneralesLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.getnumero_pre_impreso()!=null && !facturasgeneralesLocal.getnumero_pre_impreso().equals(""))) {facturasgeneralesBean.setnumero_pre_impreso(facturasgeneralesLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.gettotal_descuento()!=null && !facturasgeneralesLocal.gettotal_descuento().equals(0.0))) {facturasgeneralesBean.settotal_descuento(facturasgeneralesLocal.gettotal_descuento());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.gettotal_otro()!=null && !facturasgeneralesLocal.gettotal_otro().equals(0.0))) {facturasgeneralesBean.settotal_otro(facturasgeneralesLocal.gettotal_otro());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.getsub_total()!=null && !facturasgeneralesLocal.getsub_total().equals(0.0))) {facturasgeneralesBean.setsub_total(facturasgeneralesLocal.getsub_total());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.gettotal()!=null && !facturasgeneralesLocal.gettotal().equals(0.0))) {facturasgeneralesBean.settotal(facturasgeneralesLocal.gettotal());}
			if(conDefault || (!conDefault && facturasgeneralesLocal.getiva()!=null && !facturasgeneralesLocal.getiva().equals(0.0))) {facturasgeneralesBean.setiva(facturasgeneralesLocal.getiva());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFacturasGeneralesGenerico(Long idFacturasGeneralesSeleccionado,JComboBox jComboBoxFacturasGenerales,List<FacturasGenerales> facturasgeneralessLocal)throws Exception {
		try {
			FacturasGenerales  facturasgeneralesTemp=null;

			for(FacturasGenerales facturasgeneralesAux:facturasgeneralessLocal) {
				if(facturasgeneralesAux.getId()!=null && facturasgeneralesAux.getId().equals(idFacturasGeneralesSeleccionado)) {
					facturasgeneralesTemp=facturasgeneralesAux;
					break;
				}
			}

			jComboBoxFacturasGenerales.setSelectedItem(facturasgeneralesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFacturasGeneralesGenerico(JComboBox jComboBoxFacturasGenerales,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturasGenerales.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFacturasGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturasGenerales.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFacturasGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFacturasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFacturasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturasgenerales=(FacturasGenerales) facturasgeneralesLogic.getFacturasGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturasgenerales =(FacturasGenerales) facturasgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Zona")) {
			//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
			if(!facturasgenerales.getIsNew() && !facturasgenerales.getIsChanged() && !facturasgenerales.getIsDeleted()) {
				sDescripcion=facturasgenerales.getzona_descripcion();
			} else {
				//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
				sDescripcion=facturasgenerales.getzona_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!facturasgenerales.getIsNew() && !facturasgenerales.getIsChanged() && !facturasgenerales.getIsDeleted()) {
				sDescripcion=facturasgenerales.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=facturasgenerales.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!facturasgenerales.getIsNew() && !facturasgenerales.getIsChanged() && !facturasgenerales.getIsDeleted()) {
				sDescripcion=facturasgenerales.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=facturasgenerales.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!facturasgenerales.getIsNew() && !facturasgenerales.getIsChanged() && !facturasgenerales.getIsDeleted()) {
				sDescripcion=facturasgenerales.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=facturasgenerales.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoFactura")) {
			//sDescripcion=this.getActualTipoFacturaForeignKeyDescripcion((Long)value);
			if(!facturasgenerales.getIsNew() && !facturasgenerales.getIsChanged() && !facturasgenerales.getIsDeleted()) {
				sDescripcion=facturasgenerales.gettipofactura_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=facturasgenerales.gettipofactura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FacturasGenerales facturasgeneralesRow=new FacturasGenerales();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturasgeneralesRow=(FacturasGenerales) facturasgeneralesLogic.getFacturasGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturasgeneralesRow=(FacturasGenerales) facturasgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFacturasGenerales(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFacturasGenerales.setVisible((this.isVisibilidadCeldaNuevoFacturasGenerales && this.isPermisoNuevoFacturasGenerales));			
			this.jButtonDuplicarFacturasGenerales.setVisible((this.isVisibilidadCeldaDuplicarFacturasGenerales && this.isPermisoDuplicarFacturasGenerales));			
			this.jButtonCopiarFacturasGenerales.setVisible((this.isVisibilidadCeldaCopiarFacturasGenerales && this.isPermisoCopiarFacturasGenerales));
			this.jButtonVerFormFacturasGenerales.setVisible((this.isVisibilidadCeldaVerFormFacturasGenerales && this.isPermisoVerFormFacturasGenerales));
			
			this.jButtonAbrirOrderByFacturasGenerales.setVisible((this.isVisibilidadCeldaOrdenFacturasGenerales && this.isPermisoOrdenFacturasGenerales));			
			
			this.jButtonNuevoRelacionesFacturasGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales && this.isPermisoNuevoFacturasGenerales));			
			this.jButtonNuevoGuardarCambiosFacturasGenerales.setVisible((this.isVisibilidadCeldaNuevoFacturasGenerales && this.isPermisoNuevoFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));
			
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonModificarFacturasGenerales.setVisible((this.isVisibilidadCeldaModificarFacturasGenerales && this.isPermisoActualizarFacturasGenerales));	
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarFacturasGenerales.setVisible((this.isVisibilidadCeldaActualizarFacturasGenerales && this.isPermisoActualizarFacturasGenerales));	
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarFacturasGenerales.setVisible((this.isVisibilidadCeldaEliminarFacturasGenerales && this.isPermisoEliminarFacturasGenerales));
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarFacturasGenerales.setVisible(this.isVisibilidadCeldaCancelarFacturasGenerales);							
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosFacturasGenerales.setVisible((this.isVisibilidadCeldaGuardarFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));			
			
			}
						
			this.jButtonGuardarCambiosTablaFacturasGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaNuevoFacturasGenerales && this.isPermisoNuevoFacturasGenerales));						
			this.jButtonDuplicarToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaDuplicarFacturasGenerales && this.isPermisoDuplicarFacturasGenerales));						
			this.jButtonCopiarToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaCopiarFacturasGenerales && this.isPermisoCopiarFacturasGenerales));			
			this.jButtonVerFormToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaVerFormFacturasGenerales && this.isPermisoVerFormFacturasGenerales));			
			this.jButtonAbrirOrderByToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaOrdenFacturasGenerales && this.isPermisoOrdenFacturasGenerales));
			this.jButtonNuevoRelacionesToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales && this.isPermisoNuevoFacturasGenerales));			
			this.jButtonNuevoGuardarCambiosToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaNuevoFacturasGenerales && this.isPermisoNuevoFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));			
			
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonModificarToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaModificarFacturasGenerales && this.isPermisoActualizarFacturasGenerales));	
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaActualizarFacturasGenerales  && this.isPermisoActualizarFacturasGenerales));	
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaEliminarFacturasGenerales && this.isPermisoEliminarFacturasGenerales));
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarToolBarFacturasGenerales.setVisible(this.isVisibilidadCeldaCancelarFacturasGenerales);				
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaGuardarFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFacturasGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFacturasGenerales.setVisible((this.isVisibilidadCeldaNuevoFacturasGenerales && this.isPermisoNuevoFacturasGenerales));			
			this.jMenuItemDuplicarFacturasGenerales.setVisible((this.isVisibilidadCeldaDuplicarFacturasGenerales && this.isPermisoDuplicarFacturasGenerales));			
			this.jMenuItemCopiarFacturasGenerales.setVisible((this.isVisibilidadCeldaCopiarFacturasGenerales && this.isPermisoCopiarFacturasGenerales));			
			this.jMenuItemVerFormFacturasGenerales.setVisible((this.isVisibilidadCeldaVerFormFacturasGenerales && this.isPermisoVerFormFacturasGenerales));			
			this.jMenuItemAbrirOrderByFacturasGenerales.setVisible((this.isVisibilidadCeldaOrdenFacturasGenerales && this.isPermisoOrdenFacturasGenerales));			
			//this.jMenuItemMostrarOcultarFacturasGenerales.setVisible((this.isVisibilidadCeldaOrdenFacturasGenerales && this.isPermisoOrdenFacturasGenerales));
			this.jMenuItemDetalleAbrirOrderByFacturasGenerales.setVisible((this.isVisibilidadCeldaOrdenFacturasGenerales && this.isPermisoOrdenFacturasGenerales));			
			//this.jMenuItemDetalleMostrarOcultarFacturasGenerales.setVisible((this.isVisibilidadCeldaOrdenFacturasGenerales && this.isPermisoOrdenFacturasGenerales));			
			this.jMenuItemNuevoRelacionesFacturasGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales && this.isPermisoNuevoFacturasGenerales));			
			this.jMenuItemNuevoGuardarCambiosFacturasGenerales.setVisible((this.isVisibilidadCeldaNuevoFacturasGenerales && this.isPermisoNuevoFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));									
			
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemModificarFacturasGenerales.setVisible((this.isVisibilidadCeldaModificarFacturasGenerales && this.isPermisoActualizarFacturasGenerales));	
			this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemActualizarFacturasGenerales.setVisible((this.isVisibilidadCeldaActualizarFacturasGenerales && this.isPermisoActualizarFacturasGenerales));	
			this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemEliminarFacturasGenerales.setVisible((this.isVisibilidadCeldaEliminarFacturasGenerales && this.isPermisoEliminarFacturasGenerales));
			this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemCancelarFacturasGenerales.setVisible(this.isVisibilidadCeldaCancelarFacturasGenerales);				
			}
			
			this.jMenuItemGuardarCambiosFacturasGenerales.setVisible((this.isVisibilidadCeldaGuardarFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));						
			this.jMenuItemGuardarCambiosTablaFacturasGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFacturasGenerales=this.jButtonNuevoFacturasGenerales.isVisible();
			this.isVisibilidadCeldaDuplicarFacturasGenerales=this.jButtonDuplicarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaCopiarFacturasGenerales=this.jButtonCopiarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaVerFormFacturasGenerales=this.jButtonVerFormFacturasGenerales.isVisible();
			
			this.isVisibilidadCeldaOrdenFacturasGenerales=this.jButtonAbrirOrderByFacturasGenerales.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=this.jButtonNuevoRelacionesFacturasGenerales.isVisible();
			this.isVisibilidadCeldaModificarFacturasGenerales=this.jButtonModificarFacturasGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			this.isVisibilidadCeldaActualizarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaEliminarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaCancelarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaGuardarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosFacturasGenerales.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=this.jButtonGuardarCambiosTablaFacturasGenerales.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFacturasGenerales=this.jButtonNuevoToolBarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=this.jButtonNuevoRelacionesToolBarFacturasGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			this.isVisibilidadCeldaModificarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jButtonModificarToolBarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaActualizarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarToolBarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaEliminarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarToolBarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaCancelarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarToolBarFacturasGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturasGenerales=this.jButtonGuardarCambiosToolBarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=this.jButtonGuardarCambiosTablaToolBarFacturasGenerales.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFacturasGenerales=this.jMenuItemNuevoFacturasGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=this.jMenuItemNuevoRelacionesFacturasGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			this.isVisibilidadCeldaModificarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemModificarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaActualizarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemActualizarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaEliminarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemEliminarFacturasGenerales.isVisible();
			this.isVisibilidadCeldaCancelarFacturasGenerales=this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemCancelarFacturasGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturasGenerales=this.jMenuItemGuardarCambiosFacturasGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=this.jMenuItemGuardarCambiosTablaFacturasGenerales.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFacturasGenerales(Boolean esInicializar) {
		if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.facturasgeneralesSessionBean.getConGuardarRelaciones()) {
				//if(this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFacturasGenerales();
			}
			
			this.inicializarActualizarBindingBotonesManualFacturasGenerales(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFacturasGenerales() {
		this.jButtonNuevoFacturasGenerales.setVisible(this.isPermisoNuevoFacturasGenerales);			
		this.jButtonDuplicarFacturasGenerales.setVisible(this.isPermisoDuplicarFacturasGenerales);			
		this.jButtonCopiarFacturasGenerales.setVisible(this.isPermisoCopiarFacturasGenerales);			
		this.jButtonVerFormFacturasGenerales.setVisible(this.isPermisoVerFormFacturasGenerales);			
		
		this.jButtonAbrirOrderByFacturasGenerales.setVisible(this.isPermisoOrdenFacturasGenerales);					
		
		this.jButtonNuevoRelacionesFacturasGenerales.setVisible(this.isPermisoNuevoFacturasGenerales);			
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonModificarFacturasGenerales.setVisible(this.isPermisoActualizarFacturasGenerales);	
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarFacturasGenerales.setVisible(this.isPermisoActualizarFacturasGenerales);	
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarFacturasGenerales.setVisible(this.isPermisoEliminarFacturasGenerales);
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarFacturasGenerales.setVisible(this.isVisibilidadCeldaCancelarFacturasGenerales);						
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosFacturasGenerales.setVisible(this.isPermisoGuardarCambiosFacturasGenerales);							
		}
		
		this.jButtonGuardarCambiosTablaFacturasGenerales.setVisible(this.isPermisoActualizarFacturasGenerales);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturasGenerales() {
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonModificarFacturasGenerales.setVisible(this.isPermisoActualizarFacturasGenerales);	
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarFacturasGenerales.setVisible(this.isPermisoActualizarFacturasGenerales);	
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarFacturasGenerales.setVisible(this.isPermisoEliminarFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarFacturasGenerales.setVisible(this.isVisibilidadCeldaCancelarFacturasGenerales);							
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosFacturasGenerales.setVisible((this.isVisibilidadCeldaGuardarFacturasGenerales && this.isPermisoGuardarCambiosFacturasGenerales));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFacturasGenerales() {
		if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFacturasGenerales();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFacturasGenerales() {
	}
	
	public void jTableDatosFacturasGeneralesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFacturasGenerales(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.facturasgenerales.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_zonaFacturasGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisozona=true;

			idTienePermisozona=this.tienePermisosUsuarioEnPaginaWebFacturasGenerales(ZonaConstantesFunciones.CLASSNAME);

			if(idTienePermisozona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);

				this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.zonaBeanSwingJInternalFrame.getZonaLogic().setConnexion(this.facturasgeneralesLogic.getConnexion());

				if(this.facturasgenerales.getid_zona()!=null) {
					this.zonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.zonaBeanSwingJInternalFrame.setIdActual(this.facturasgenerales.getid_zona());
					this.zonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaZona();
				}

				JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasGenerales=(TitledBorder)this.jScrollPanelDatosFacturasGenerales.getBorder();
				TitledBorder titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderFacturasGenerales.getTitle() + " -> Zona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_zonaFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getid_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_zona = "+this.facturasgenerales.getid_zona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_clienteFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getid_tipo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_cliente = "+this.facturasgenerales.getid_tipo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFacturasGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFacturasGenerales(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.facturasgeneralesLogic.getConnexion());

				if(this.facturasgenerales.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.facturasgenerales.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasGenerales=(TitledBorder)this.jScrollPanelDatosFacturasGenerales.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFacturasGenerales.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.facturasgenerales.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalFacturasGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebFacturasGenerales(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.facturasgeneralesLogic.getConnexion());

				if(this.facturasgenerales.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.facturasgenerales.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasGenerales=(TitledBorder)this.jScrollPanelDatosFacturasGenerales.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderFacturasGenerales.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.facturasgenerales.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteFacturasGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebFacturasGenerales(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.facturasgeneralesLogic.getConnexion());

				if(this.facturasgenerales.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.facturasgenerales.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasGenerales=(TitledBorder)this.jScrollPanelDatosFacturasGenerales.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderFacturasGenerales.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.facturasgenerales.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_facturaFacturasGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipofactura=true;

			idTienePermisotipofactura=this.tienePermisosUsuarioEnPaginaWebFacturasGenerales(TipoFacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);

				this.tipofacturaBeanSwingJInternalFrame=new TipoFacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipofacturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipofacturaBeanSwingJInternalFrame.getTipoFacturaLogic().setConnexion(this.facturasgeneralesLogic.getConnexion());

				if(this.facturasgenerales.getid_tipo_factura()!=null) {
					this.tipofacturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipofacturaBeanSwingJInternalFrame.setIdActual(this.facturasgenerales.getid_tipo_factura());
					this.tipofacturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipofacturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipofacturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFactura();
				}

				JInternalFrameBase jinternalFrame =this.tipofacturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasGenerales=(TitledBorder)this.jScrollPanelDatosFacturasGenerales.getBorder();
				TitledBorder titledBordertipofactura=(TitledBorder)this.tipofacturaBeanSwingJInternalFrame.jScrollPanelDatosTipoFactura.getBorder();

				titledBordertipofactura.setTitle(titledBorderFacturasGenerales.getTitle() + " -> TIPOFACTURA");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_facturaFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getid_tipo_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_factura = "+this.facturasgenerales.getid_tipo_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.facturasgenerales.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.facturasgenerales.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.facturasgenerales.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.facturasgenerales.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_facturaFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getnombre_tipo_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_factura like '%"+this.facturasgenerales.getnombre_tipo_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.facturasgenerales.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.facturasgenerales.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.facturasgenerales.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_descuentoFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.gettotal_descuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_descuento = "+this.facturasgenerales.gettotal_descuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_otroFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.gettotal_otro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_otro = "+this.facturasgenerales.gettotal_otro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsub_totalFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getsub_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_total = "+this.facturasgenerales.getsub_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.facturasgenerales.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaFacturasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.getfacturasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasgenerales==null) {
						this.facturasgenerales = new FacturasGenerales();
					}

					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);
				}

				if(this.facturasgenerales.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.facturasgenerales.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaFacturasGeneralesFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasGenerales(false,false);

			this.getFacturasGeneralessBusquedaFacturasGenerales();

			this.inicializarActualizarBindingFacturasGenerales(false);

			//if(FacturasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasGenerales(false,false);

			this.getFacturasGeneralessFK_IdCliente();

			this.inicializarActualizarBindingFacturasGenerales(false);

			//if(FacturasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasGenerales(false,false);

			this.getFacturasGeneralessFK_IdEmpresa();

			this.inicializarActualizarBindingFacturasGenerales(false);

			//if(FacturasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasGenerales(false,false);

			this.getFacturasGeneralessFK_IdSucursal();

			this.inicializarActualizarBindingFacturasGenerales(false);

			//if(FacturasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFacturaFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasGenerales(false,false);

			this.getFacturasGeneralessFK_IdTipoFactura();

			this.inicializarActualizarBindingFacturasGenerales(false);

			//if(FacturasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdZonaFacturasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasGenerales(false,false);

			this.getFacturasGeneralessFK_IdZona();

			this.inicializarActualizarBindingFacturasGenerales(false);

			//if(FacturasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFacturasGenerales() {
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
			this.jInternalFrameDetalleFormFacturasGenerales.setVisible(false);	    			
			this.jInternalFrameDetalleFormFacturasGenerales.dispose();
			this.jInternalFrameDetalleFormFacturasGenerales=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFacturasGenerales!=null) {
			this.jInternalFrameReporteDinamicoFacturasGenerales.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFacturasGenerales.dispose();
			this.jInternalFrameReporteDinamicoFacturasGenerales=null;
		}
		
		if(this.jInternalFrameImportacionFacturasGenerales!=null) {
			this.jInternalFrameImportacionFacturasGenerales.setVisible(false);	    			
			this.jInternalFrameImportacionFacturasGenerales.dispose();
			this.jInternalFrameImportacionFacturasGenerales=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFacturasGenerales();
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
			
			if(sTipo.equals("NuevoFacturasGenerales")) {
				jButtonNuevoFacturasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFacturasGenerales")) {
				jButtonDuplicarFacturasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFacturasGenerales")) {
				jButtonCopiarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormFacturasGenerales")) {
				jButtonVerFormFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFacturasGenerales")) {
				jButtonNuevoFacturasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFacturasGenerales")) {
				jButtonDuplicarFacturasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFacturasGenerales")) {
				jButtonNuevoFacturasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFacturasGenerales")) {
				jButtonDuplicarFacturasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFacturasGenerales")) {
				jButtonNuevoFacturasGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFacturasGenerales")) {
				jButtonNuevoFacturasGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFacturasGenerales")) {
				jButtonNuevoFacturasGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFacturasGenerales")) {
				jButtonModificarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFacturasGenerales")) {
				jButtonModificarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFacturasGenerales")) {
				jButtonModificarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFacturasGenerales")) {
				jButtonActualizarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFacturasGenerales")) {
				jButtonActualizarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFacturasGenerales")) {
				jButtonActualizarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarFacturasGenerales")) {
				jButtonEliminarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFacturasGenerales")) {
				jButtonEliminarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFacturasGenerales")) {
				jButtonEliminarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarFacturasGenerales")) {
				jButtonCancelarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFacturasGenerales")) {
				jButtonCancelarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFacturasGenerales")) {
				jButtonCancelarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarFacturasGenerales")) {
				jButtonCerrarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFacturasGenerales")) {
				jButtonCerrarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFacturasGenerales")) {
				jButtonCerrarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFacturasGenerales")) {
				jButtonMostrarOcultarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFacturasGenerales")) {
				jButtonCancelarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFacturasGenerales")) {
				jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFacturasGenerales")) {
				jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFacturasGenerales")) {
				jButtonCopiarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFacturasGenerales")) {
				jButtonVerFormFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFacturasGenerales")) {
				jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFacturasGenerales")) {
				jButtonCopiarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFacturasGenerales")) {
				jButtonVerFormFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFacturasGenerales")) {
				jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFacturasGenerales")) {
				jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFacturasGenerales")) {
				jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFacturasGenerales")) {
				jButtonRecargarInformacionFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFacturasGenerales")) {
				jButtonRecargarInformacionFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFacturasGenerales")) {
				jButtonRecargarInformacionFacturasGeneralesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFacturasGenerales")) {
				jButtonAnterioresFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFacturasGenerales")) {
				jButtonAnterioresFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFacturasGenerales")) {
				jButtonAnterioresFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFacturasGenerales")) {
				jButtonSiguientesFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFacturasGenerales")) {
				jButtonSiguientesFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFacturasGenerales")) {
				jButtonSiguientesFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFacturasGenerales") || sTipo.equals("MenuItemDetalleAbrirOrderByFacturasGenerales")) {
				jButtonAbrirOrderByFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFacturasGenerales") || sTipo.equals("MenuItemDetalleMostrarOcultarFacturasGenerales")) {
				jButtonMostrarOcultarFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFacturasGenerales")) {
				jButtonNuevoGuardarCambiosFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFacturasGenerales")) {
				jButtonNuevoGuardarCambiosFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFacturasGenerales")) {
				jButtonNuevoGuardarCambiosFacturasGeneralesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFacturasGenerales")) {
				jButtonCerrarReporteDinamicoFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFacturasGenerales")) {
				jButtonGenerarReporteDinamicoFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFacturasGenerales")) {
				
				jButtonGenerarExcelReporteDinamicoFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFacturasGenerales")) {
				jButtonCerrarImportacionFacturasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFacturasGenerales")) {
				
				jButtonGenerarImportacionFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFacturasGenerales")) {
				
				jButtonAbrirImportacionFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFacturasGenerales")) {
				jComboBoxTiposAccionesFacturasGeneralesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFacturasGenerales")) {
				jComboBoxTiposRelacionesFacturasGeneralesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFacturasGenerales")) {
				jComboBoxTiposAccionesFacturasGeneralesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFacturasGenerales")) {
				
				jComboBoxTiposSeleccionarFacturasGeneralesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFacturasGenerales")) {
				jTextFieldValorCampoGeneralFacturasGeneralesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFacturasGenerales")) {
				jButtonAbrirOrderByFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFacturasGenerales")) {
				jButtonAbrirOrderByFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFacturasGenerales")) {
				jButtonCerrarOrderByFacturasGeneralesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturasGeneralesBusqueda")) {
				this.jButtonidFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaFacturasGeneralesUpdate")) {
				this.jButtonid_zonaFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaFacturasGeneralesBusqueda")) {
				this.jButtonid_zonaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_clienteFacturasGeneralesBusqueda")) {
				this.jButtonid_tipo_clienteFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturasGeneralesUpdate")) {
				this.jButtonid_empresaFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturasGeneralesBusqueda")) {
				this.jButtonid_empresaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFacturasGeneralesUpdate")) {
				this.jButtonid_sucursalFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFacturasGeneralesBusqueda")) {
				this.jButtonid_sucursalFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteFacturasGeneralesUpdate")) {
				this.jButtonid_clienteFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteFacturasGeneralesBusqueda")) {
				this.jButtonid_clienteFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_facturaFacturasGeneralesUpdate")) {
				this.jButtonid_tipo_facturaFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_facturaFacturasGeneralesBusqueda")) {
				this.jButtonid_tipo_facturaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeFacturasGeneralesBusqueda")) {
				this.jButtonfecha_emision_desdeFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaFacturasGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaFacturasGeneralesBusqueda")) {
				this.jButtonnombre_zonaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteFacturasGeneralesBusqueda")) {
				this.jButtonnombre_completo_clienteFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_facturaFacturasGeneralesBusqueda")) {
				this.jButtonnombre_tipo_facturaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturasGeneralesBusqueda")) {
				this.jButtonfecha_emisionFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoFacturasGeneralesBusqueda")) {
				this.jButtonfecha_vencimientoFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoFacturasGeneralesBusqueda")) {
				this.jButtonnumero_pre_impresoFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoFacturasGeneralesBusqueda")) {
				this.jButtontotal_descuentoFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_otroFacturasGeneralesBusqueda")) {
				this.jButtontotal_otroFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalFacturasGeneralesBusqueda")) {
				this.jButtonsub_totalFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturasGeneralesBusqueda")) {
				this.jButtontotalFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaFacturasGeneralesBusqueda")) {
				this.jButtonivaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaFacturasGeneralesFacturasGenerales")) {
				this.jButtonBusquedaFacturasGeneralesFacturasGeneralesActionPerformed(evt);
			}
			
			;
			
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFacturasGenerales();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				


				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FacturasGenerales facturasgeneralesLocal=null;
			
			if(!this.getEsControlTabla()) {
				facturasgeneralesLocal=this.facturasgenerales;
			} else {
				facturasgeneralesLocal=this.facturasgeneralesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
							
				
				


				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
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
			
			


			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
								
						
				


				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
								
				
				


				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
							
				
				


				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
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
			
			


			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasGeneralesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
								
				
				


				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFacturasGenerales")) {
					jCheckBoxSeleccionarTodosFacturasGeneralesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFacturasGenerales")) {
					jCheckBoxSeleccionadosFacturasGeneralesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFacturasGenerales")) {
					
				}
				
				


				
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
												
				
				


				
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasGeneralesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
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
			
			


			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasgenerales);
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
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
				
				


				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasGenerales.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasgeneralesAnterior =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFacturasGenerales")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFacturasGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFacturasGenerales.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.facturasgenerales =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.facturasgenerales =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.facturasgenerales);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFacturasGenerales")) {
				
				}
				
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFacturasGenerales")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFacturasGenerales.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFacturasGenerales")) {
			
			}
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFacturasGenerales();
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
			if(sTipo.equals("NuevoFacturasGenerales")) {
				jButtonNuevoFacturasGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFacturasGenerales")) {
				jButtonDuplicarFacturasGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFacturasGenerales")) {
				jButtonCopiarFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFacturasGenerales")) {
				jButtonVerFormFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFacturasGenerales")) {
				jButtonNuevoFacturasGeneralesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFacturasGenerales")) {
				jButtonModificarFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFacturasGenerales")) {
				jButtonActualizarFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFacturasGenerales")) {
				jButtonEliminarFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFacturasGenerales")) {
				jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFacturasGenerales")) {
				jButtonCancelarFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFacturasGenerales")) {
				jButtonCerrarFacturasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFacturasGenerales")) {
				jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFacturasGenerales")) {
				jButtonNuevoGuardarCambiosFacturasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFacturasGenerales")) {
				jButtonAbrirOrderByFacturasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFacturasGenerales")) {
				jButtonRecargarInformacionFacturasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFacturasGenerales")) {
				jButtonAnterioresFacturasGeneralesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFacturasGenerales")) {
				jButtonSiguientesFacturasGeneralesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturasGeneralesBusqueda")) {
				this.jButtonidFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaFacturasGeneralesUpdate")) {
				this.jButtonid_zonaFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaFacturasGeneralesBusqueda")) {
				this.jButtonid_zonaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_clienteFacturasGeneralesBusqueda")) {
				this.jButtonid_tipo_clienteFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturasGeneralesUpdate")) {
				this.jButtonid_empresaFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturasGeneralesBusqueda")) {
				this.jButtonid_empresaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFacturasGeneralesUpdate")) {
				this.jButtonid_sucursalFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFacturasGeneralesBusqueda")) {
				this.jButtonid_sucursalFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteFacturasGeneralesUpdate")) {
				this.jButtonid_clienteFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteFacturasGeneralesBusqueda")) {
				this.jButtonid_clienteFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_facturaFacturasGeneralesUpdate")) {
				this.jButtonid_tipo_facturaFacturasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_facturaFacturasGeneralesBusqueda")) {
				this.jButtonid_tipo_facturaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeFacturasGeneralesBusqueda")) {
				this.jButtonfecha_emision_desdeFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaFacturasGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaFacturasGeneralesBusqueda")) {
				this.jButtonnombre_zonaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteFacturasGeneralesBusqueda")) {
				this.jButtonnombre_completo_clienteFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_facturaFacturasGeneralesBusqueda")) {
				this.jButtonnombre_tipo_facturaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturasGeneralesBusqueda")) {
				this.jButtonfecha_emisionFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoFacturasGeneralesBusqueda")) {
				this.jButtonfecha_vencimientoFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoFacturasGeneralesBusqueda")) {
				this.jButtonnumero_pre_impresoFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoFacturasGeneralesBusqueda")) {
				this.jButtontotal_descuentoFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_otroFacturasGeneralesBusqueda")) {
				this.jButtontotal_otroFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalFacturasGeneralesBusqueda")) {
				this.jButtonsub_totalFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturasGeneralesBusqueda")) {
				this.jButtontotalFacturasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaFacturasGeneralesBusqueda")) {
				this.jButtonivaFacturasGeneralesBusquedaActionPerformed(evt);
			}
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFacturasGenerales();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFacturasGenerales")) {
				closingInternalFrameFacturasGenerales();
				
			} else if(sTipo.equals("jButtonCancelarFacturasGenerales")) {
				JInternalFrameBase jInternalFrameDetalleFormFacturasGenerales = (JInternalFrameBase)evt.getSource();
	            	
	            FacturasGeneralesBeanSwingJInternalFrame jInternalFrameParent=(FacturasGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturasGenerales.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFacturasGeneralesActionPerformed(null);
			}
			
			FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturasgenerales,new Object(),this.facturasgeneralesParameterGeneral,this.facturasgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFacturasGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFacturasGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFacturasGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.facturasgenerales)) {
			if(!esControlTabla) {
				if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);			
				}
				
				if(this.facturasgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFacturasGenerales(this.facturasgenerales,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFacturasGenerales(this.facturasgeneralesReturnGeneral,this.facturasgeneralesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.facturasgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFacturasGenerales(classes,this.facturasgeneralesReturnGeneral,this.facturasgeneralesBean,false);
					}
						
					if(this.facturasgeneralesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFacturasGenerales(this.facturasgeneralesReturnGeneral.getFacturasGenerales());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFacturasGenerales(this.facturasgeneralesReturnGeneral.getFacturasGenerales());	
					}
						
					if(this.facturasgeneralesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFacturasGenerales(this.facturasgeneralesReturnGeneral.getFacturasGenerales(),classes);//this.facturasgeneralesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFacturasGenerales(this.facturasgenerales,classes);//this.facturasgeneralesBean);									
				}
			
				if(FacturasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFacturasGenerales(this.facturasgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasGenerales(this.facturasgenerales);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.facturasgeneralesAnterior!=null) {
						this.facturasgenerales=this.facturasgeneralesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturasgeneralesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturasgeneralesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.facturasgeneralesReturnGeneral.getFacturasGenerales(),facturasgeneralesLogic.getFacturasGeneraless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.facturasgeneralesReturnGeneral.getFacturasGenerales(),this.facturasgeneraless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFacturasGenerales.repaint();
				
				//((AbstractTableModel) this.jTableDatosFacturasGenerales.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFacturasGenerales();
			}
		}
	}
	
	public void actualizarVisualTableDatosFacturasGenerales() throws Exception {
		
		FacturasGeneralesModel facturasgeneralesModel=(FacturasGeneralesModel)this.jTableDatosFacturasGenerales.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturasgeneralesModel.facturasgeneraless=this.facturasgeneralesLogic.getFacturasGeneraless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			facturasgeneralesModel.facturasgeneraless=this.facturasgeneraless;
		}
		
		
		((FacturasGeneralesModel) this.jTableDatosFacturasGenerales.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFacturasGenerales() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfacturasgeneralesAnterior(),this.facturasgeneralesLogic.getFacturasGeneraless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfacturasgeneralesAnterior(),this.facturasgeneraless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFacturasGenerales();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFacturasGenerales(FacturasGenerales facturasgenerales,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
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
										
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturasgenerales,new Object(),generalEntityParameterGeneral,this.facturasgeneralesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.facturasgeneralesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FacturasGeneralesConstantesFunciones.getClassesRelationshipsOfFacturasGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FacturasGeneralesConstantesFunciones.getClassesRelationshipsFromStringsOfFacturasGenerales(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFacturasGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FacturasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturasgenerales,new Object(),generalEntityParameterGeneral,this.facturasgeneralesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFacturasGenerales(FacturasGeneralesBean facturasgeneralesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFacturasGenerales(ArrayList<Classe> classes,FacturasGeneralesReturnGeneral facturasgeneralesReturnGeneral,FacturasGeneralesBean facturasgeneralesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFacturasGenerales(FacturasGenerales facturasgenerales,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.facturasgenerales)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFacturasGenerales = new FacturasGeneralesDetalleFormJInternalFrame(jDesktopPane,this.facturasgeneralesSessionBean.getConGuardarRelaciones(),this.facturasgeneralesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.setVisible(false);
		this.jInternalFrameDetalleFormFacturasGenerales.setSelected(false);						
		
		this.jInternalFrameDetalleFormFacturasGenerales.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFacturasGenerales.facturasgeneralesLogic=this.facturasgeneralesLogic;
		
		this.cargarCombosFrameForeignKeyFacturasGenerales("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturasGenerales();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturasGenerales();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFacturasGenerales("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFacturasGenerales();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFacturasGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturasGenerales"));
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonModificarFacturasGenerales.addActionListener(new ButtonActionListener(this,"ModificarFacturasGenerales"));

		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonModificarToolBarFacturasGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturasGenerales"));
					
		this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemModificarFacturasGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarFacturasGenerales.addActionListener (new ButtonActionListener(this,"ActualizarFacturasGenerales"));
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarToolBarFacturasGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturasGenerales"));
						
		this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemActualizarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarFacturasGenerales.addActionListener (new ButtonActionListener(this,"EliminarFacturasGenerales"));
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturasGenerales"));
								
		this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemEliminarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarFacturasGenerales.addActionListener (new ButtonActionListener(this,"CancelarFacturasGenerales"));
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturasGenerales"));
					
		this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemCancelarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturasGenerales"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemDetalleCerrarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasGenerales"));
		
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasGenerales"));
		
		
		
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturasGenerales"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonidFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_zonaFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_zonaFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_zonaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_tipo_clienteFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_clienteFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_empresaFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_empresaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_sucursalFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_sucursalFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_clienteFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_clienteFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_tipo_facturaFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_facturaFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_tipo_facturaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_facturaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnombre_zonaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_emisionFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_vencimientoFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtontotal_descuentoFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtontotal_otroFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"total_otroFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonsub_totalFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtontotalFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonivaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturasGeneralesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFacturasGenerales.jTabbedPaneRelacionesFacturasGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturasGenerales"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFacturasGenerales"));
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturasGenerales"));
		}
		
		this.jTableDatosFacturasGenerales.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFacturasGenerales"));
		
		this.jTableDatosFacturasGenerales.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFacturasGenerales"));
		
		this.jButtonNuevoFacturasGenerales.addActionListener(new ButtonActionListener(this,"NuevoFacturasGenerales"));
		
		this.jButtonDuplicarFacturasGenerales.addActionListener(new ButtonActionListener(this,"DuplicarFacturasGenerales"));
		
		this.jButtonCopiarFacturasGenerales.addActionListener(new ButtonActionListener(this,"CopiarFacturasGenerales"));
		
		this.jButtonVerFormFacturasGenerales.addActionListener(new ButtonActionListener(this,"VerFormFacturasGenerales"));
		
		
		this.jButtonNuevoToolBarFacturasGenerales.addActionListener(new ButtonActionListener(this,"NuevoToolBarFacturasGenerales"));
			
		this.jButtonDuplicarToolBarFacturasGenerales.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFacturasGenerales"));
			
		this.jMenuItemNuevoFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFacturasGenerales"));
			
		this.jMenuItemDuplicarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFacturasGenerales"));		
		
		
		this.jButtonNuevoRelacionesFacturasGenerales.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFacturasGenerales"));
		
		
		this.jButtonNuevoRelacionesToolBarFacturasGenerales.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFacturasGenerales"));
			
		this.jMenuItemNuevoRelacionesFacturasGenerales.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFacturasGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonModificarFacturasGenerales.addActionListener(new ButtonActionListener(this,"ModificarFacturasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonModificarToolBarFacturasGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturasGenerales"));
			
			this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemModificarFacturasGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarFacturasGenerales.addActionListener (new ButtonActionListener(this,"ActualizarFacturasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonActualizarToolBarFacturasGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturasGenerales"));
				
			this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemActualizarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarFacturasGenerales.addActionListener (new ButtonActionListener(this,"EliminarFacturasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonEliminarToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturasGenerales"));
						
			this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemEliminarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarFacturasGenerales.addActionListener (new ButtonActionListener(this,"CancelarFacturasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonCancelarToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturasGenerales"));
			
			this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemCancelarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturasGenerales"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFacturasGenerales"));		
		
		
		this.jButtonCerrarFacturasGenerales.addActionListener (new ButtonActionListener(this,"CerrarFacturasGenerales"));
		
		
		this.jButtonCerrarToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"CerrarToolBarFacturasGenerales"));
			
		this.jMenuItemCerrarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFacturasGenerales"));
			
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jMenuItemDetalleCerrarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosFacturasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosFacturasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasGenerales"));
		}
		
		this.jButtonCopiarToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"CopiarToolBarFacturasGenerales"));
			
		this.jButtonVerFormToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"VerFormToolBarFacturasGenerales"));
		
		this.jMenuItemGuardarCambiosFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFacturasGenerales"));
			
		this.jMenuItemCopiarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFacturasGenerales"));		
		
		this.jMenuItemVerFormFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFacturasGenerales"));		
		
		
		this.jButtonGuardarCambiosTablaFacturasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturasGenerales"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFacturasGenerales"));
			
		this.jMenuItemGuardarCambiosTablaFacturasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturasGenerales"));		
		
		
		
		this.jButtonRecargarInformacionFacturasGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionFacturasGenerales"));
					
		this.jButtonRecargarInformacionToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFacturasGenerales"));
		
		this.jMenuItemRecargarInformacionFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFacturasGenerales"));		
		
		
		
		this.jButtonAnterioresFacturasGenerales.addActionListener (new ButtonActionListener(this,"AnterioresFacturasGenerales"));
		
		
		this.jButtonAnterioresToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFacturasGenerales"));
		
		this.jMenuItemAnterioresFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFacturasGenerales"));		
		
		
		this.jButtonSiguientesFacturasGenerales.addActionListener (new ButtonActionListener(this,"SiguientesFacturasGenerales"));
		
		
		this.jButtonSiguientesToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFacturasGenerales"));
			
		this.jMenuItemSiguientesFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFacturasGenerales"));
			
		this.jMenuItemAbrirOrderByFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFacturasGenerales"));
			
		this.jMenuItemMostrarOcultarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFacturasGenerales"));
			
		this.jMenuItemDetalleAbrirOrderByFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFacturasGenerales"));
			
		this.jMenuItemDetalleMostarOcultarFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFacturasGenerales"));		
		
		
		this.jButtonNuevoGuardarCambiosFacturasGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFacturasGenerales"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFacturasGenerales"));
			
		this.jMenuItemNuevoGuardarCambiosFacturasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFacturasGenerales"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFacturasGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFacturasGenerales"));

		this.jCheckBoxSeleccionadosFacturasGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFacturasGenerales"));
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturasGenerales"));
		}
		
		
		this.jComboBoxTiposRelacionesFacturasGenerales.addActionListener (new ButtonActionListener(this,"TiposRelacionesFacturasGenerales"));
			
		this.jComboBoxTiposAccionesFacturasGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFacturasGenerales"));
					
		this.jComboBoxTiposSeleccionarFacturasGenerales.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFacturasGenerales"));
			
		this.jTextFieldValorCampoGeneralFacturasGenerales.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFacturasGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonidFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_zonaFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_zonaFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_zonaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_tipo_clienteFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_clienteFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_empresaFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_empresaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_sucursalFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_sucursalFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_clienteFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_clienteFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_tipo_facturaFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_facturaFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_tipo_facturaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_facturaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnombre_zonaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_emisionFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_vencimientoFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtontotal_descuentoFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtontotal_otroFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"total_otroFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonsub_totalFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtontotalFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonivaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturasGeneralesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaFacturasGeneralesFacturasGenerales.addActionListener(new ButtonActionListener(this,"BusquedaFacturasGeneralesFacturasGenerales"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFacturasGenerales!=null) {
				this.jInternalFrameReporteDinamicoFacturasGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasGenerales"));
				this.jInternalFrameReporteDinamicoFacturasGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasGenerales"));
				this.jInternalFrameReporteDinamicoFacturasGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasGenerales"));
			}
			
			//this.jButtonCerrarReporteDinamicoFacturasGenerales.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasGenerales"));				
			//this.jButtonGenerarReporteDinamicoFacturasGenerales.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasGenerales"));
			//this.jButtonGenerarExcelReporteDinamicoFacturasGenerales.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasGenerales"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFacturasGenerales!=null) {
				this.jInternalFrameImportacionFacturasGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturasGenerales"));
				this.jInternalFrameImportacionFacturasGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturasGenerales"));
				this.jInternalFrameImportacionFacturasGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturasGenerales"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFacturasGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByFacturasGenerales"));
			
			this.jButtonAbrirOrderByToolBarFacturasGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFacturasGenerales"));			
			
			if(this.jInternalFrameOrderByFacturasGenerales!=null) {
				this.jInternalFrameOrderByFacturasGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturasGenerales"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasGenerales.jTabbedPaneRelacionesFacturasGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturasGenerales"));
		
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
            		closingInternalFrameFacturasGenerales();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFacturasGenerales.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFacturasGenerales = (JInternalFrameBase)event.getSource();
	            	
	            FacturasGeneralesBeanSwingJInternalFrame jInternalFrameParent=(FacturasGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturasGenerales.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFacturasGeneralesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFacturasGenerales.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFacturasGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFacturasGenerales.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFacturasGenerales.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFacturasGenerales";
		inputMap = this.jButtonNuevoFacturasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFacturasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturasGeneralesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFacturasGenerales";
		inputMap = this.jButtonNuevoRelacionesFacturasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFacturasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturasGeneralesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFacturasGenerales";
		inputMap = this.jButtonModificarFacturasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFacturasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFacturasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFacturasGenerales";
		inputMap = this.jButtonActualizarFacturasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFacturasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFacturasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFacturasGenerales";
		inputMap = this.jButtonEliminarFacturasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFacturasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFacturasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFacturasGenerales";
		inputMap = this.jButtonCancelarFacturasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFacturasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFacturasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFacturasGenerales";
		inputMap = this.jButtonCerrarFacturasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFacturasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFacturasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFacturasGenerales";
		inputMap = this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosFacturasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonGuardarCambiosFacturasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFacturasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFacturasGenerales.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFacturasGeneralesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFacturasGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFacturasGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFacturasGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFacturasGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFacturasGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFacturasGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonidFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_zonaFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_zonaFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_zonaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_tipo_clienteFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_clienteFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_empresaFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_empresaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_sucursalFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_sucursalFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_clienteFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_clienteFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFacturasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_tipo_facturaFacturasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_facturaFacturasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonid_tipo_facturaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_facturaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_emision_desdeFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_emision_hastaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnombre_zonaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnombre_completo_clienteFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnombre_tipo_facturaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_emisionFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonfecha_vencimientoFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonnumero_pre_impresoFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtontotal_descuentoFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtontotal_otroFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"total_otroFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonsub_totalFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtontotalFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasGenerales.jButtonivaFacturasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"ivaFacturasGeneralesBusqueda"));
		
		
		this.jButtonBusquedaFacturasGeneralesFacturasGenerales.addActionListener(new ButtonActionListener(this,"BusquedaFacturasGeneralesFacturasGenerales"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFacturasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFacturasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFacturasGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFacturasGenerales.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFacturasGenerales(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FacturasGenerales facturasgeneralesAux:this.facturasgeneralesLogic.getFacturasGeneraless()) {
					facturasgeneralesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasGenerales facturasgeneralesAux:facturasgeneraless) {
					facturasgeneralesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFacturasGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturasGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturasGenerales facturasgeneralesAux:this.facturasgeneralesLogic.getFacturasGeneraless()) {
						facturasgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasGenerales facturasgeneralesAux:facturasgeneraless) {
						facturasgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FacturasGenerales facturasgeneralesAux:this.facturasgeneralesLogic.getFacturasGeneraless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasGenerales facturasgeneralesAux:facturasgeneraless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFacturasGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturasGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturasGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFacturasGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturasGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFacturasGenerales.getSelectedRows();
			
			FacturasGenerales facturasgeneralesLocal=new FacturasGenerales();
			
			//this.seleccionarTodosFacturasGenerales(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturasgeneralesLocal =(FacturasGenerales) this.facturasgeneralesLogic.getFacturasGeneraless().toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					facturasgeneralesLocal =(FacturasGenerales) this.facturasgeneraless.toArray()[this.jTableDatosFacturasGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				facturasgeneralesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturasGenerales facturasgeneralesAux:this.facturasgeneralesLogic.getFacturasGeneraless()) {
						facturasgeneralesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasGenerales facturasgeneralesAux:facturasgeneraless) {
						facturasgeneralesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFacturasGenerales(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturasGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturasGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturasGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFacturasGeneralesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFacturasGeneralesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFacturasGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFacturasGenerales(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFacturasGenerales.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturasGenerales facturasgeneralesAux:this.facturasgeneralesLogic.getFacturasGeneraless()) {
				
						if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE)) {
							existe=true;
							facturasgeneralesAux.setid_tipo_cliente(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							facturasgeneralesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							facturasgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							facturasgeneralesAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							facturasgeneralesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
							existe=true;
							facturasgeneralesAux.setnombre_tipo_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturasgeneralesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							facturasgeneralesAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							facturasgeneralesAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							facturasgeneralesAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO)) {
							existe=true;
							facturasgeneralesAux.settotal_otro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							facturasgeneralesAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturasgeneralesAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IVA)) {
							existe=true;
							facturasgeneralesAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasGenerales facturasgeneralesAux:facturasgeneraless) {
					
						if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE)) {
							existe=true;
							facturasgeneralesAux.setid_tipo_cliente(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							facturasgeneralesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							facturasgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							facturasgeneralesAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							facturasgeneralesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
							existe=true;
							facturasgeneralesAux.setnombre_tipo_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturasgeneralesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							facturasgeneralesAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							facturasgeneralesAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							facturasgeneralesAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO)) {
							existe=true;
							facturasgeneralesAux.settotal_otro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							facturasgeneralesAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturasgeneralesAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IVA)) {
							existe=true;
							facturasgeneralesAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFacturasGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFacturasGeneralesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFacturasGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFacturasGenerales=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFacturasGenerales.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFacturasGenerales) {				
					conSplash=true;//false;										
					
					//this.startProcessFacturasGenerales(conSplash);
				
					this.generarReporteFacturasGeneralessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFacturasGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturasGeneralessSeleccionados(false);
				//this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturasGeneralessSeleccionados(true);
				//this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturasGenerales();
				
				this.exportarFacturasGeneralessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFacturasGeneraless();
				//this.importarFacturasGeneraless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturasGenerales();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFacturasGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Facturas Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFacturasGenerales();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFacturasGenerales)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFacturasGenerales(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Facturas Generales",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.setSelectedIndex(0);					
				}	
			} 			
			else if(FacturasGeneralesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFacturasGenerales) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFacturasGenerales(conSplash);
					
						//this.actualizarParametrosGeneralFacturasGenerales();
						
						this.generarReporteProcesoAccionFacturasGeneralessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FacturasGeneralesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Facturas GeneralesES SELECCIONADOS?", "MANTENIMIENTO DE Facturas Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFacturasGenerales();
				
						this.actualizarParametrosGeneralFacturasGenerales();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.facturasgeneralesReturnGeneral=facturasgeneralesLogic.procesarAccionFacturasGeneralessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.facturasgeneralesLogic.getFacturasGeneraless(),this.facturasgeneralesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFacturasGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFacturasGenerales();
					
					FacturasGeneralesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFacturasGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturasGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxTiposAccionesFormularioFacturasGenerales.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFacturasGenerales(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFacturasGeneralesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFacturasGenerales();
			
			if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();		
			FacturasGenerales facturasgenerales=new FacturasGenerales();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFacturasGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFacturasGenerales.getSelectedItem();
			
			
			
			
			facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
			//this.sTipoAccion;
			
			if(facturasgeneralessSeleccionados.size()==1) {
				for(FacturasGenerales facturasgeneralesAux:facturasgeneralessSeleccionados) {
					facturasgenerales=facturasgeneralesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFacturasGenerales();
			
      		//this.finishProcessFacturasGenerales(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFacturasGeneralesReturnGeneral() throws Exception {
		if(this.facturasgeneralesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.facturasgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.facturasgeneralesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.facturasgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.facturasgeneralesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.facturasgeneralesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFacturasGenerales(false);
		}
		
		if(this.facturasgeneralesReturnGeneral.getConRetornoLista() || this.facturasgeneralesReturnGeneral.getConRetornoObjeto()) {
			if(this.facturasgeneralesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturasgeneralesLogic.setFacturasGeneraless(this.facturasgeneralesReturnGeneral.getFacturasGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingFacturasGenerales(false);
		}
	}
	
	public void actualizarParametrosGeneralFacturasGenerales() throws Exception {
		
		
	}
	
	public ArrayList<FacturasGenerales> getFacturasGeneralessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFacturasGenerales) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FacturasGenerales facturasgeneralesAux:facturasgeneralesLogic.getFacturasGeneraless()) {
					if(facturasgeneralesAux.getIsSelected()) {
						facturasgeneralessSeleccionados.add(facturasgeneralesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasGenerales facturasgeneralesAux:this.facturasgeneraless) {
					if(facturasgeneralesAux.getIsSelected()) {
						facturasgeneralessSeleccionados.add(facturasgeneralesAux);				
					}
				}
			}
			
			if(facturasgeneralessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						facturasgeneralessSeleccionados.addAll(this.facturasgeneralesLogic.getFacturasGeneraless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						facturasgeneralessSeleccionados.addAll(this.facturasgeneraless);				
					}
				}
			}
		} else {
			facturasgeneralessSeleccionados.add(this.facturasgenerales);
		}
		
		return facturasgeneralessSeleccionados;
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
	
	public void generarReporteFacturasGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFacturasGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFacturasGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturasGeneralessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturasGeneralessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Facturas Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFacturasGeneralessSeleccionados() throws Exception {
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();		
		
		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFacturasGeneraless("Todos",facturasgeneralessSeleccionados);
		
	}	
	
	public void generarReporteNormalFacturasGeneralessSeleccionados() throws Exception {
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();		
		
		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFacturasGeneraless("Todos",facturasgeneralessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFacturasGeneralessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();
		
		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFacturasGeneraless("Todos",facturasgeneralessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFacturasGeneralessSeleccionados() throws Exception {
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFacturasGenerales();
		
		
		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFacturasGenerales();
		
		
		//this.generarReporteFacturasGeneraless("Todos",facturasgeneralessSeleccionados ,facturasgeneralesImplementable,facturasgeneralesImplementableHome);
	}
	
	public void mostrarImportacionFacturasGeneraless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFacturasGenerales();
		
		this.abrirFrameImportacionFacturasGenerales();		
		
			
		//this.generarReporteFacturasGeneraless("Todos",facturasgeneralessSeleccionados ,facturasgeneralesImplementable,facturasgeneralesImplementableHome);
	}
	
	public void importarFacturasGeneraless() throws Exception {		
	
	}
	
	public void exportarFacturasGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFacturasGeneralessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFacturasGeneralessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFacturasGeneralessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Facturas Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFacturasGeneralessSeleccionados() throws Exception {
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();		
		
		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasgenerales."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFacturasGenerales(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FacturasGenerales facturasgeneralesAux:facturasgeneralessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFacturasGenerales(facturasgeneralesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//facturasgeneralesAux.setsDetalleGeneralEntityReporte(facturasgeneralesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFacturasGenerales(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_IDZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasGeneralesConstantesFunciones.LABEL_IVA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFacturasGenerales(FacturasGenerales facturasgenerales,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=facturasgenerales.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getzona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getid_tipo_cliente().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.gettipofactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getnombre_tipo_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.gettotal_descuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.gettotal_otro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getsub_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasgenerales.getiva().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFacturasGeneralessSeleccionados() throws Exception {
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();		
		
		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasgenerales.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FacturasGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFacturasGenerales(row);				
				iRow++;
			}				
			
			for(FacturasGenerales facturasgeneralesAux:facturasgeneralessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFacturasGenerales(facturasgeneralesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFacturasGeneralessSeleccionados() throws Exception {
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();		
		
		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasgenerales.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("facturasgeneraless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("facturasgenerales");
			//elementRoot.appendChild(element);
		
			for(FacturasGenerales facturasgeneralesAux:facturasgeneralessSeleccionados) {
				element = document.createElement("facturasgenerales");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFacturasGenerales(facturasgeneralesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFacturasGenerales(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_TOTALDESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_TOTALOTRO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasGeneralesConstantesFunciones.LABEL_IVA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFacturasGenerales(FacturasGenerales facturasgenerales,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getzona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getid_tipo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.gettipofactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getnombre_tipo_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.gettotal_descuento());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.gettotal_otro());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getsub_total());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasgenerales.getiva());				
	}
	
	public void setFilaDatosExportarXmlFacturasGenerales(FacturasGenerales facturasgenerales,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FacturasGeneralesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(facturasgenerales.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FacturasGeneralesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(facturasgenerales.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementzona_descripcion = document.createElement(FacturasGeneralesConstantesFunciones.IDZONA);
		elementzona_descripcion.appendChild(document.createTextNode(facturasgenerales.getzona_descripcion()));
		element.appendChild(elementzona_descripcion);

		Element elementid_tipo_cliente = document.createElement(FacturasGeneralesConstantesFunciones.IDTIPOCLIENTE);
		elementid_tipo_cliente.appendChild(document.createTextNode(facturasgenerales.getid_tipo_cliente().toString().trim()));
		element.appendChild(elementid_tipo_cliente);

		Element elementempresa_descripcion = document.createElement(FacturasGeneralesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(facturasgenerales.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(FacturasGeneralesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(facturasgenerales.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(FacturasGeneralesConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(facturasgenerales.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipofactura_descripcion = document.createElement(FacturasGeneralesConstantesFunciones.IDTIPOFACTURA);
		elementtipofactura_descripcion.appendChild(document.createTextNode(facturasgenerales.gettipofactura_descripcion()));
		element.appendChild(elementtipofactura_descripcion);

		Element elementfecha_emision_desde = document.createElement(FacturasGeneralesConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(facturasgenerales.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(FacturasGeneralesConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(facturasgenerales.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_zona = document.createElement(FacturasGeneralesConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(facturasgenerales.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_completo_cliente = document.createElement(FacturasGeneralesConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(facturasgenerales.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnombre_tipo_factura = document.createElement(FacturasGeneralesConstantesFunciones.NOMBRETIPOFACTURA);
		elementnombre_tipo_factura.appendChild(document.createTextNode(facturasgenerales.getnombre_tipo_factura().trim()));
		element.appendChild(elementnombre_tipo_factura);

		Element elementfecha_emision = document.createElement(FacturasGeneralesConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(facturasgenerales.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(FacturasGeneralesConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(facturasgenerales.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementnumero_pre_impreso = document.createElement(FacturasGeneralesConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(facturasgenerales.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementtotal_descuento = document.createElement(FacturasGeneralesConstantesFunciones.TOTALDESCUENTO);
		elementtotal_descuento.appendChild(document.createTextNode(facturasgenerales.gettotal_descuento().toString().trim()));
		element.appendChild(elementtotal_descuento);

		Element elementtotal_otro = document.createElement(FacturasGeneralesConstantesFunciones.TOTALOTRO);
		elementtotal_otro.appendChild(document.createTextNode(facturasgenerales.gettotal_otro().toString().trim()));
		element.appendChild(elementtotal_otro);

		Element elementsub_total = document.createElement(FacturasGeneralesConstantesFunciones.SUBTOTAL);
		elementsub_total.appendChild(document.createTextNode(facturasgenerales.getsub_total().toString().trim()));
		element.appendChild(elementsub_total);

		Element elementtotal = document.createElement(FacturasGeneralesConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(facturasgenerales.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementiva = document.createElement(FacturasGeneralesConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(facturasgenerales.getiva().toString().trim()));
		element.appendChild(elementiva);
	}
	
	public void generarReporteGroupGenericoFacturasGeneralessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FacturasGenerales> facturasgeneralessSeleccionados=new ArrayList<FacturasGenerales>();
		
		facturasgeneralessSeleccionados=this.getFacturasGeneralessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFacturasGenerales(facturasgeneralessSeleccionados);
		
		this.generarReporteFacturasGeneraless("Todos",facturasgeneralessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFacturasGenerales(ArrayList<FacturasGenerales> facturasgeneralessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FacturasGenerales facturasgeneralesAux:facturasgeneralessSeleccionados) {
				facturasgeneralesAux.setsDetalleGeneralEntityReporte(facturasgeneralesAux.toString());
			
				if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IDZONA)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.getzona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOCLIENTE)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.getid_tipo_cliente().toString());
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_IDTIPOFACTURA)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.gettipofactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasgeneralesAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasgeneralesAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.getnombre_tipo_factura());
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasgeneralesAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasgeneralesAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(FacturasGeneralesConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					facturasgeneralesAux.setsDescripcionGeneralEntityReporte1(facturasgeneralesAux.getnumero_pre_impreso());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFacturasGenerales(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFacturasGenerales=true;
				this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=true;
				this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=true;
			}
			
			this.isVisibilidadCeldaModificarFacturasGenerales=false;
			this.isVisibilidadCeldaActualizarFacturasGenerales=false;
			this.isVisibilidadCeldaEliminarFacturasGenerales=false;
			this.isVisibilidadCeldaCancelarFacturasGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFacturasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=false;
			this.isVisibilidadCeldaModificarFacturasGenerales=false;
			this.isVisibilidadCeldaActualizarFacturasGenerales=true;
			this.isVisibilidadCeldaEliminarFacturasGenerales=false;
			this.isVisibilidadCeldaCancelarFacturasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFacturasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=false;
			this.isVisibilidadCeldaModificarFacturasGenerales=false;
			this.isVisibilidadCeldaActualizarFacturasGenerales=true;
			this.isVisibilidadCeldaEliminarFacturasGenerales=true;
			this.isVisibilidadCeldaCancelarFacturasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFacturasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=false;
			this.isVisibilidadCeldaModificarFacturasGenerales=false;
			this.isVisibilidadCeldaActualizarFacturasGenerales=true;
			this.isVisibilidadCeldaEliminarFacturasGenerales=false;
			this.isVisibilidadCeldaCancelarFacturasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFacturasGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=true;
			this.isVisibilidadCeldaModificarFacturasGenerales=false;
			this.isVisibilidadCeldaActualizarFacturasGenerales=false;
			this.isVisibilidadCeldaEliminarFacturasGenerales=false;
			this.isVisibilidadCeldaCancelarFacturasGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFacturasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=false;
			this.isVisibilidadCeldaActualizarFacturasGenerales=false;
			this.isVisibilidadCeldaEliminarFacturasGenerales=false;
			this.isVisibilidadCeldaCancelarFacturasGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFacturasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=false;
			this.isVisibilidadCeldaModificarFacturasGenerales=true;
			this.isVisibilidadCeldaActualizarFacturasGenerales=false;
			this.isVisibilidadCeldaEliminarFacturasGenerales=false;
			this.isVisibilidadCeldaCancelarFacturasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasGenerales=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FacturasGeneralesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFacturasGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=true;
		} else {
			this.actualizarEstadoPanelsFacturasGenerales(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFacturasGenerales=false;
			//this.isVisibilidadCeldaVerFormFacturasGenerales=false;
			this.isVisibilidadCeldaDuplicarFacturasGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!facturasgeneralesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
		} else {
			this.isVisibilidadCeldaNuevoFacturasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!facturasgeneralesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;												
			}
			
			this.jButtonCerrarFacturasGenerales.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
		}
		
		if(!this.permiteMantenimiento(this.facturasgenerales)) {
			this.isVisibilidadCeldaActualizarFacturasGenerales=false;
			this.isVisibilidadCeldaEliminarFacturasGenerales=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoFacturasGenerales=false;
		this.isVisibilidadCeldaNuevoRelacionesFacturasGenerales=false;
		this.isVisibilidadCeldaGuardarCambiosFacturasGenerales=false;
		//this.isVisibilidadCeldaModificarFacturasGenerales=true;
		this.isVisibilidadCeldaActualizarFacturasGenerales=false;
		this.isVisibilidadCeldaEliminarFacturasGenerales=false;
		//this.isVisibilidadCeldaCancelarFacturasGenerales=true;			
		this.isVisibilidadCeldaGuardarFacturasGenerales=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFacturasGenerales() {
	}
	
	public void actualizarEstadoPanelsFacturasGenerales(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFacturasGenerales!=null) {
				this.jScrollPanelDatosEdicionFacturasGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasGenerales!=null) {
				this.jTabbedPaneBusquedasFacturasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasGenerales!=null) {
				this.jScrollPanelDatosFacturasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasGenerales!=null) {
				this.jPanelPaginacionFacturasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasGenerales!=null) {
				this.jPanelParametrosReportesFacturasGenerales.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFacturasGenerales!=null) {
				this.jScrollPanelDatosEdicionFacturasGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasGenerales!=null) {
				this.jTabbedPaneBusquedasFacturasGenerales.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFacturasGenerales!=null) {
				this.jScrollPanelDatosFacturasGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasGenerales!=null) {
				this.jPanelPaginacionFacturasGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasGenerales!=null) {
				this.jPanelParametrosReportesFacturasGenerales.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFacturasGenerales!=null) {
				this.jScrollPanelDatosEdicionFacturasGenerales.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasGenerales!=null) {
				this.jTabbedPaneBusquedasFacturasGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturasGenerales!=null) {
				this.jScrollPanelDatosFacturasGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasGenerales!=null) {
				this.jPanelPaginacionFacturasGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasGenerales!=null) {
				this.jPanelParametrosReportesFacturasGenerales.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFacturasGenerales!=null) {
				this.jScrollPanelDatosEdicionFacturasGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasGenerales!=null) {
				this.jTabbedPaneBusquedasFacturasGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturasGenerales!=null) {
				this.jScrollPanelDatosFacturasGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasGenerales!=null) {
				this.jPanelPaginacionFacturasGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasGenerales!=null) {
				this.jPanelParametrosReportesFacturasGenerales.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFacturasGenerales!=null) {
				this.jScrollPanelDatosEdicionFacturasGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasGenerales!=null) {
				this.jTabbedPaneBusquedasFacturasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasGenerales!=null) {
				this.jScrollPanelDatosFacturasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasGenerales!=null) {
				this.jPanelPaginacionFacturasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasGenerales!=null) {
				this.jPanelParametrosReportesFacturasGenerales.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFacturasGenerales!=null) {
				this.jScrollPanelDatosEdicionFacturasGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasGenerales!=null) {
				this.jTabbedPaneBusquedasFacturasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasGenerales!=null) {
				this.jScrollPanelDatosFacturasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasGenerales!=null) {
				this.jPanelPaginacionFacturasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasGenerales!=null) {
				this.jPanelParametrosReportesFacturasGenerales.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFacturasGenerales!=null) {
				this.jScrollPanelDatosEdicionFacturasGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasGenerales!=null) {
				this.jTabbedPaneBusquedasFacturasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasGenerales!=null) {
				this.jScrollPanelDatosFacturasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasGenerales!=null) {
				this.jPanelPaginacionFacturasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasGenerales!=null) {
				this.jPanelParametrosReportesFacturasGenerales.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFacturasGenerales!=null) {
					this.jTabbedPaneBusquedasFacturasGenerales.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFacturasGenerales!=null) {
				this.jPanelParametrosReportesFacturasGenerales.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.facturasgeneralesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasGenerales!=null) {
				this.jTabbedPaneBusquedasFacturasGenerales.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFacturasGenerales!=null) {
				this.jPanelParametrosReportesFacturasGenerales.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaZona(Boolean isParaZona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaZonaNegation=!isParaZona;

			this.isVisibilidadBusquedaFacturasGenerales=isParaZona;
			if(!this.isVisibilidadBusquedaFacturasGenerales) {this.jTabbedPaneBusquedasFacturasGenerales.remove(jPanelBusquedaFacturasGeneralesFacturasGenerales);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaFacturasGenerales=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaFacturasGenerales) {this.jTabbedPaneBusquedasFacturasGenerales.remove(jPanelBusquedaFacturasGeneralesFacturasGenerales);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaFacturasGenerales=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaFacturasGenerales) {this.jTabbedPaneBusquedasFacturasGenerales.remove(jPanelBusquedaFacturasGeneralesFacturasGenerales);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaFacturasGenerales=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaFacturasGenerales) {this.jTabbedPaneBusquedasFacturasGenerales.remove(jPanelBusquedaFacturasGeneralesFacturasGenerales);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFactura(Boolean isParaTipoFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFacturaNegation=!isParaTipoFactura;

			this.isVisibilidadBusquedaFacturasGenerales=isParaTipoFactura;
			if(!this.isVisibilidadBusquedaFacturasGenerales) {this.jTabbedPaneBusquedasFacturasGenerales.remove(jPanelBusquedaFacturasGeneralesFacturasGenerales);}
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
			
			this.inicializarActualizarBindingTablaFacturasGenerales(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFacturasGenerales() {
		this.updateBorderResaltarBusquedasFormularioFacturasGenerales();
		this.updateVisibilidadBusquedasFormularioFacturasGenerales();
		this.updateHabilitarBusquedasFormularioFacturasGenerales();
	}
	
	public void updateBorderResaltarBusquedasFormularioFacturasGenerales() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFacturasGenerales.getComponents().length>0) {
	

		if(this.facturasgeneralesConstantesFunciones.resaltarBusquedaFacturasGeneralesFacturasGenerales!=null) {
			index= this.jTabbedPaneBusquedasFacturasGenerales.indexOfComponent(this.jPanelBusquedaFacturasGeneralesFacturasGenerales);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasGenerales.getComponent(index);
				jPanel.setBorder(this.facturasgeneralesConstantesFunciones.resaltarBusquedaFacturasGeneralesFacturasGenerales);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFacturasGenerales() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFacturasGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturasGenerales.indexOfComponent(this.jPanelBusquedaFacturasGeneralesFacturasGenerales);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasGenerales.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturasgeneralesConstantesFunciones.mostrarBusquedaFacturasGeneralesFacturasGenerales);
			if(!this.facturasgeneralesConstantesFunciones.mostrarBusquedaFacturasGeneralesFacturasGenerales && index>-1) {
				this.jTabbedPaneBusquedasFacturasGenerales.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFacturasGenerales() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFacturasGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturasGenerales.indexOfComponent(this.jPanelBusquedaFacturasGeneralesFacturasGenerales);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasGenerales.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturasgeneralesConstantesFunciones.activarBusquedaFacturasGeneralesFacturasGenerales);
				this.jTabbedPaneBusquedasFacturasGenerales.setEnabledAt(index,this.facturasgeneralesConstantesFunciones.activarBusquedaFacturasGeneralesFacturasGenerales);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFacturasGenerales(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaFacturasGenerales")) {
			index= this.jTabbedPaneBusquedasFacturasGenerales.indexOfComponent(this.jPanelBusquedaFacturasGeneralesFacturasGenerales);

			this.jTabbedPaneBusquedasFacturasGenerales.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasGenerales.getComponent(index);

			this.facturasgeneralesConstantesFunciones.setResaltarBusquedaFacturasGeneralesFacturasGenerales(resaltar);

			jPanel.setBorder(this.facturasgeneralesConstantesFunciones.resaltarBusquedaFacturasGeneralesFacturasGenerales);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFacturasGenerales.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFacturasGenerales() throws Exception {

		if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFacturasGenerales();
		this.updateVisibilidadResaltarControlesFormularioFacturasGenerales();
		this.updateHabilitarResaltarControlesFormularioFacturasGenerales();
		
	}
	
	public void updateBorderResaltarControlesFormularioFacturasGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.facturasgeneralesConstantesFunciones.resaltaridFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltaridFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarid_zonaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarid_zonaFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarid_tipo_clienteFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldid_tipo_clienteFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarid_tipo_clienteFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarid_empresaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarid_empresaFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarid_sucursalFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarid_sucursalFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarid_clienteFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarid_clienteFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarid_tipo_facturaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarid_tipo_facturaFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarfecha_emision_desdeFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emision_desdeFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarfecha_emision_desdeFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarfecha_emision_hastaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emision_hastaFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarfecha_emision_hastaFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarnombre_zonaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnombre_zonaFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarnombre_zonaFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarnombre_completo_clienteFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_completo_clienteFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarnombre_completo_clienteFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarnombre_tipo_facturaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_tipo_facturaFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarnombre_tipo_facturaFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarfecha_emisionFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emisionFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarfecha_emisionFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarfecha_vencimientoFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_vencimientoFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarfecha_vencimientoFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarnumero_pre_impresoFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnumero_pre_impresoFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarnumero_pre_impresoFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltartotal_descuentoFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_descuentoFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltartotal_descuentoFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltartotal_otroFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_otroFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltartotal_otroFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarsub_totalFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldsub_totalFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarsub_totalFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltartotalFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotalFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltartotalFacturasGenerales);}
		if(this.facturasgeneralesConstantesFunciones.resaltarivaFacturasGenerales!=null && this.jInternalFrameDetalleFormFacturasGenerales!=null) {this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldivaFacturasGenerales.setBorder(this.facturasgeneralesConstantesFunciones.resaltarivaFacturasGenerales);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFacturasGenerales() throws Exception {		
		if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
	
		//this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostraridFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelidFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostraridFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_zonaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelid_zonaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_zonaFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldid_tipo_clienteFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_tipo_clienteFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelid_tipo_clienteFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_tipo_clienteFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_empresaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelid_empresaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_empresaFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_sucursalFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelid_sucursalFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_sucursalFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_clienteFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelid_clienteFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_clienteFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_tipo_facturaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelid_tipo_facturaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarid_tipo_facturaFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emision_desdeFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarfecha_emision_desdeFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelfecha_emision_desdeFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarfecha_emision_desdeFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emision_hastaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarfecha_emision_hastaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelfecha_emision_hastaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarfecha_emision_hastaFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnombre_zonaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarnombre_zonaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelnombre_zonaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarnombre_zonaFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_completo_clienteFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarnombre_completo_clienteFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelnombre_completo_clienteFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarnombre_completo_clienteFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_tipo_facturaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarnombre_tipo_facturaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelnombre_tipo_facturaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarnombre_tipo_facturaFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emisionFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarfecha_emisionFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelfecha_emisionFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarfecha_emisionFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_vencimientoFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarfecha_vencimientoFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelfecha_vencimientoFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarfecha_vencimientoFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnumero_pre_impresoFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarnumero_pre_impresoFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelnumero_pre_impresoFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarnumero_pre_impresoFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_descuentoFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrartotal_descuentoFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPaneltotal_descuentoFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrartotal_descuentoFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_otroFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrartotal_otroFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPaneltotal_otroFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrartotal_otroFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldsub_totalFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarsub_totalFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelsub_totalFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarsub_totalFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotalFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrartotalFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPaneltotalFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrartotalFacturasGenerales);
		//this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldivaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarivaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jPanelivaFacturasGenerales.setVisible(this.facturasgeneralesConstantesFunciones.mostrarivaFacturasGenerales);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFacturasGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormFacturasGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturasGenerales!=null) {
	
		this.jInternalFrameDetalleFormFacturasGenerales.jLabelidFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activaridFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_zonaFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarid_zonaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldid_tipo_clienteFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarid_tipo_clienteFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_empresaFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarid_empresaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_sucursalFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarid_sucursalFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_clienteFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarid_clienteFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jComboBoxid_tipo_facturaFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarid_tipo_facturaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emision_desdeFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarfecha_emision_desdeFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emision_hastaFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarfecha_emision_hastaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnombre_zonaFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarnombre_zonaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_completo_clienteFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarnombre_completo_clienteFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextAreanombre_tipo_facturaFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarnombre_tipo_facturaFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_emisionFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarfecha_emisionFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jDateChooserfecha_vencimientoFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarfecha_vencimientoFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldnumero_pre_impresoFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarnumero_pre_impresoFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_descuentoFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activartotal_descuentoFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotal_otroFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activartotal_otroFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldsub_totalFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarsub_totalFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldtotalFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activartotalFacturasGenerales);
		this.jInternalFrameDetalleFormFacturasGenerales.jTextFieldivaFacturasGenerales.setEnabled(this.facturasgeneralesConstantesFunciones.activarivaFacturasGenerales);
		}
	}
	
		
}