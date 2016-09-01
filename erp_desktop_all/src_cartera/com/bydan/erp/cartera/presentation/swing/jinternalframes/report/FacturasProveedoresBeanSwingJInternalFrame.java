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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.FacturasProveedoresConstantesFunciones;
import com.bydan.erp.cartera.util.report.FacturasProveedoresParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.FacturasProveedoresParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.FacturasProveedoresBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FacturasProveedoresBeanSwingJInternalFrame extends FacturasProveedoresJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FacturasProveedoresBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FacturasProveedores> facturasproveedoresValidator = new ClassValidator<FacturasProveedores>(FacturasProveedores.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FacturasProveedores facturasproveedores;	
	public FacturasProveedores facturasproveedoresAux;
	public FacturasProveedores facturasproveedoresAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FacturasProveedores facturasproveedoresTotales;
	public Long idFacturasProveedoresActual;
	public Long iIdNuevoFacturasProveedores=0L;
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
	
	public Boolean isPermisoTodoFacturasProveedores;
	public Boolean isPermisoNuevoFacturasProveedores;
	public Boolean isPermisoActualizarFacturasProveedores;
	public Boolean isPermisoActualizarOriginalFacturasProveedores;
	public Boolean isPermisoEliminarFacturasProveedores;
	public Boolean isPermisoGuardarCambiosFacturasProveedores;
	public Boolean isPermisoConsultaFacturasProveedores;
	public Boolean isPermisoBusquedaFacturasProveedores;
	public Boolean isPermisoReporteFacturasProveedores;
	public Boolean isPermisoPaginacionMedioFacturasProveedores;
	public Boolean isPermisoPaginacionAltoFacturasProveedores;
	public Boolean isPermisoPaginacionTodoFacturasProveedores;
	public Boolean isPermisoCopiarFacturasProveedores;
	public Boolean isPermisoVerFormFacturasProveedores;
	public Boolean isPermisoDuplicarFacturasProveedores;
	public Boolean isPermisoOrdenFacturasProveedores;
	
	
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
	
	public FacturasProveedoresParameterReturnGeneral facturasproveedoresReturnGeneral;
	public FacturasProveedoresParameterReturnGeneral facturasproveedoresParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFacturasProveedores=false;
	public Boolean esParaAccionDesdeFormularioFacturasProveedores=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FacturasProveedoresSessionBeanAdditional facturasproveedoresSessionBeanAdditional=null;
	
	public FacturasProveedoresSessionBeanAdditional getFacturasProveedoresSessionBeanAdditional() {
		return this.facturasproveedoresSessionBeanAdditional;
	}
	
	public void setFacturasProveedoresSessionBeanAdditional(FacturasProveedoresSessionBeanAdditional facturasproveedoresSessionBeanAdditional) {
		try {
			this.facturasproveedoresSessionBeanAdditional=facturasproveedoresSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FacturasProveedoresBeanSwingJInternalFrameAdditional facturasproveedoresBeanSwingJInternalFrameAdditional=null;
	//public class FacturasProveedoresBeanSwingJInternalFrame
	
	public FacturasProveedoresBeanSwingJInternalFrameAdditional getFacturasProveedoresBeanSwingJInternalFrameAdditional() {
		return this.facturasproveedoresBeanSwingJInternalFrameAdditional;
	}
	
	public void setFacturasProveedoresBeanSwingJInternalFrameAdditional(FacturasProveedoresBeanSwingJInternalFrameAdditional facturasproveedoresBeanSwingJInternalFrameAdditional) {
		try {
			this.facturasproveedoresBeanSwingJInternalFrameAdditional=facturasproveedoresBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FacturasProveedoresLogic facturasproveedoresLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FacturasProveedores facturasproveedoresBean;
	public FacturasProveedoresConstantesFunciones facturasproveedoresConstantesFunciones;
	//public FacturasProveedoresParameterReturnGeneral facturasproveedoresReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<FacturasProveedores> facturasproveedoress;	
	//public List<FacturasProveedores> facturasproveedoressEliminados;
	//public List<FacturasProveedores> facturasproveedoressAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFacturasProveedores=false;
	public Boolean isVisibilidadCeldaDuplicarFacturasProveedores=true;
	public Boolean isVisibilidadCeldaCopiarFacturasProveedores=true;
	public Boolean isVisibilidadCeldaVerFormFacturasProveedores=true;
	public Boolean isVisibilidadCeldaOrdenFacturasProveedores=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
	public Boolean isVisibilidadCeldaModificarFacturasProveedores=false;
	public Boolean isVisibilidadCeldaActualizarFacturasProveedores=false;
	public Boolean isVisibilidadCeldaEliminarFacturasProveedores=false;
	public Boolean isVisibilidadCeldaCancelarFacturasProveedores=false;
	public Boolean isVisibilidadCeldaGuardarFacturasProveedores=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFacturasProveedores=false;	
	
	
	public Boolean isVisibilidadBusquedaFacturasProveedores=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoFacturasProveedores() {
		return this.iIdNuevoFacturasProveedores;
	}

	public void setiIdNuevoFacturasProveedores(Long iIdNuevoFacturasProveedores) {
		this.iIdNuevoFacturasProveedores = iIdNuevoFacturasProveedores;
	}
	
	public Long getidFacturasProveedoresActual() {
		return this.idFacturasProveedoresActual;
	}

	public void setidFacturasProveedoresActual(Long idFacturasProveedoresActual) {
		this.idFacturasProveedoresActual = idFacturasProveedoresActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FacturasProveedores getfacturasproveedores() {
		return this.facturasproveedores;
	}

	public void setfacturasproveedores(FacturasProveedores facturasproveedores) {
		this.facturasproveedores = facturasproveedores;
	}
	
	public FacturasProveedores getfacturasproveedoresAux() {
		return this.facturasproveedoresAux;
	}

	public void setfacturasproveedoresAux(FacturasProveedores facturasproveedoresAux) {
		this.facturasproveedoresAux = facturasproveedoresAux;
	}				
	
	public FacturasProveedores getfacturasproveedoresAnterior() {
		return this.facturasproveedoresAnterior;
	}

	public void setfacturasproveedoresAnterior(FacturasProveedores facturasproveedoresAnterior) {
		this.facturasproveedoresAnterior = facturasproveedoresAnterior;
	}	
	
	public FacturasProveedores getfacturasproveedoresTotales() {
		return this.facturasproveedoresTotales;
	}

	public void setfacturasproveedoresTotales(FacturasProveedores facturasproveedoresTotales) {
		this.facturasproveedoresTotales = facturasproveedoresTotales;
	}	
	
	public FacturasProveedores getfacturasproveedoresBean() {
		return this.facturasproveedoresBean;
	}

	public void setfacturasproveedoresBean(FacturasProveedores facturasproveedoresBean) {
		this.facturasproveedoresBean = facturasproveedoresBean;
	}	
	
	public FacturasProveedoresParameterReturnGeneral getfacturasproveedoresReturnGeneral() {
		return this.facturasproveedoresReturnGeneral;
	}

	public void setfacturasproveedoresReturnGeneral(FacturasProveedoresParameterReturnGeneral facturasproveedoresReturnGeneral) {
		this.facturasproveedoresReturnGeneral = facturasproveedoresReturnGeneral;
	}	
	
	
	public Long id_clienteBusquedaFacturasProveedores=-1L;

	public Long getid_clienteBusquedaFacturasProveedores() {
		return this.id_clienteBusquedaFacturasProveedores;
	}

	public void setid_clienteBusquedaFacturasProveedores(Long id_clienteBusquedaFacturasProveedores) {
		this.id_clienteBusquedaFacturasProveedores = id_clienteBusquedaFacturasProveedores;
	}

;
	public Date fecha_emision_inicioBusquedaFacturasProveedores=new Date();

	public Date getfecha_emision_inicioBusquedaFacturasProveedores() {
		return this.fecha_emision_inicioBusquedaFacturasProveedores;
	}

	public void setfecha_emision_inicioBusquedaFacturasProveedores(Date fecha_emision_inicioBusquedaFacturasProveedores) {
		this.fecha_emision_inicioBusquedaFacturasProveedores = fecha_emision_inicioBusquedaFacturasProveedores;
	}

;
	public Date fecha_emision_finBusquedaFacturasProveedores=new Date();

	public Date getfecha_emision_finBusquedaFacturasProveedores() {
		return this.fecha_emision_finBusquedaFacturasProveedores;
	}

	public void setfecha_emision_finBusquedaFacturasProveedores(Date fecha_emision_finBusquedaFacturasProveedores) {
		this.fecha_emision_finBusquedaFacturasProveedores = fecha_emision_finBusquedaFacturasProveedores;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FacturasProveedoresLogic getFacturasProveedoresLogic()	{		
		return facturasproveedoresLogic;
	}

	public void setFacturasProveedoresLogic(FacturasProveedoresLogic facturasproveedoresLogic) {
		this.facturasproveedoresLogic = facturasproveedoresLogic;
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
	
	public Boolean getIsEsNuevoFacturasProveedores() {
		return isEsNuevoFacturasProveedores;
	}

	public void setIsEsNuevoFacturasProveedores(Boolean isEsNuevoFacturasProveedores) {
		this.isEsNuevoFacturasProveedores = isEsNuevoFacturasProveedores;
	}

	public Boolean getEsParaAccionDesdeFormularioFacturasProveedores() {
		return esParaAccionDesdeFormularioFacturasProveedores;
	}
	
	public void setEsParaAccionDesdeFormularioFacturasProveedores(Boolean esParaAccionDesdeFormularioFacturasProveedores) {
		this.esParaAccionDesdeFormularioFacturasProveedores = esParaAccionDesdeFormularioFacturasProveedores;
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

			if(this.facturasproveedoresSessionBean==null) {
				this.facturasproveedoresSessionBean=new FacturasProveedoresSessionBean();
			}

			if(!this.facturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(facturasproveedoresSessionBean.getlidEmpresaActual());
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

			if(this.facturasproveedoresSessionBean==null) {
				this.facturasproveedoresSessionBean=new FacturasProveedoresSessionBean();
			}

			if(!this.facturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(facturasproveedoresSessionBean.getlidClienteActual());
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

					if(this.facturasproveedores!=null) {
						this.facturasproveedores.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
						this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFacturasProveedores.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
						if(this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFacturasProveedoresGenerico)throws Exception
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
				jComboBoxid_empresaFacturasProveedoresGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFacturasProveedoresGenerico!=null && jComboBoxid_empresaFacturasProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_empresaFacturasProveedoresGenerico.setSelectedIndex(0);
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

					if(this.facturasproveedores!=null) {
						this.facturasproveedores.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
						this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteFacturasProveedores.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
						if(this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaFacturasProveedores") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores!=null) {
						jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores!=null) {
							//jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.getItemCount()>0) {
								jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteFacturasProveedoresGenerico)throws Exception
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
				jComboBoxid_clienteFacturasProveedoresGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteFacturasProveedoresGenerico!=null && jComboBoxid_clienteFacturasProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_clienteFacturasProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FacturasProveedores facturasproveedores,JComboBox jComboBoxid_empresaFacturasProveedoresGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFacturasProveedoresGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFacturasProveedoresGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				facturasproveedores.setid_empresa(empresaAux.getId());
				facturasproveedores.setempresa_descripcion(FacturasProveedoresConstantesFunciones.getEmpresaDescripcion(empresaAux));
				facturasproveedores.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(FacturasProveedores facturasproveedores,JComboBox jComboBoxid_clienteFacturasProveedoresGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteFacturasProveedoresGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteFacturasProveedoresGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				facturasproveedores.setid_cliente(clienteAux.getId());
				facturasproveedores.setcliente_descripcion(FacturasProveedoresConstantesFunciones.getClienteDescripcion(clienteAux));
				facturasproveedores.setCliente(clienteAux);			}
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

					if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { 
							this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { 
					}

					if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { 
							this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { 
					}

					if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaFacturasProveedores") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.addItem(cliente);
							}
						}

						if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFacturasProveedores() throws Exception {
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
		
	public FacturasProveedoresParameterReturnGeneral getFacturasProveedoresParameterGeneral() {
		return this.facturasproveedoresParameterGeneral;
	}
	
	public void setFacturasProveedoresParameterGeneral(FacturasProveedoresParameterReturnGeneral facturasproveedoresParameterGeneral) {
		this.facturasproveedoresParameterGeneral = facturasproveedoresParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFacturasProveedores() {
		return isPermisoTodoFacturasProveedores;
	}

	public void setIsPermisoTodoFacturasProveedores(Boolean isPermisoTodoFacturasProveedores) {
		this.isPermisoTodoFacturasProveedores = isPermisoTodoFacturasProveedores;
	}

	public Boolean getIsPermisoNuevoFacturasProveedores() {
		return isPermisoNuevoFacturasProveedores;
	}

	public void setIsPermisoNuevoFacturasProveedores(Boolean isPermisoNuevoFacturasProveedores) {
		this.isPermisoNuevoFacturasProveedores = isPermisoNuevoFacturasProveedores;
	}

	public Boolean getIsPermisoActualizarFacturasProveedores() {
		return isPermisoActualizarFacturasProveedores;
	}

	public void setIsPermisoActualizarFacturasProveedores(Boolean isPermisoActualizarFacturasProveedores) {
		this.isPermisoActualizarFacturasProveedores = isPermisoActualizarFacturasProveedores;
	}

	public Boolean getIsPermisoEliminarFacturasProveedores() {
		return isPermisoEliminarFacturasProveedores;
	}

	public void setIsPermisoEliminarFacturasProveedores(Boolean isPermisoEliminarFacturasProveedores) {
		this.isPermisoEliminarFacturasProveedores = isPermisoEliminarFacturasProveedores;
	}

	public Boolean getIsPermisoGuardarCambiosFacturasProveedores() {
		return isPermisoGuardarCambiosFacturasProveedores;
	}

	public void setIsPermisoGuardarCambiosFacturasProveedores(Boolean isPermisoGuardarCambiosFacturasProveedores) {
		this.isPermisoGuardarCambiosFacturasProveedores = isPermisoGuardarCambiosFacturasProveedores;
	}
	
	public Boolean getIsPermisoConsultaFacturasProveedores() {
		return isPermisoConsultaFacturasProveedores;
	}

	public void setIsPermisoConsultaFacturasProveedores(Boolean isPermisoConsultaFacturasProveedores) {
		this.isPermisoConsultaFacturasProveedores = isPermisoConsultaFacturasProveedores;
	}

	public Boolean getIsPermisoBusquedaFacturasProveedores() {
		return isPermisoBusquedaFacturasProveedores;
	}

	public void setIsPermisoBusquedaFacturasProveedores(Boolean isPermisoBusquedaFacturasProveedores) {
		this.isPermisoBusquedaFacturasProveedores = isPermisoBusquedaFacturasProveedores;
	}

	public Boolean getIsPermisoReporteFacturasProveedores() {
		return isPermisoReporteFacturasProveedores;
	}

	public void setIsPermisoReporteFacturasProveedores(Boolean isPermisoReporteFacturasProveedores) {
		this.isPermisoReporteFacturasProveedores = isPermisoReporteFacturasProveedores;
	}
	
	public Boolean getIsPermisoPaginacionMedioFacturasProveedores() {
		return isPermisoPaginacionMedioFacturasProveedores;
	}

	public void setIsPermisoPaginacionMedioFacturasProveedores(Boolean isPermisoPaginacionMedioFacturasProveedores) {
		this.isPermisoPaginacionMedioFacturasProveedores = isPermisoPaginacionMedioFacturasProveedores;
	}
	
	public Boolean getIsPermisoPaginacionTodoFacturasProveedores() {
		return isPermisoPaginacionTodoFacturasProveedores;
	}

	public void setIsPermisoPaginacionTodoFacturasProveedores(Boolean isPermisoPaginacionTodoFacturasProveedores) {
		this.isPermisoPaginacionTodoFacturasProveedores = isPermisoPaginacionTodoFacturasProveedores;
	}
	
	public Boolean getIsPermisoPaginacionAltoFacturasProveedores() {
		return isPermisoPaginacionAltoFacturasProveedores;
	}

	public void setIsPermisoPaginacionAltoFacturasProveedores(Boolean isPermisoPaginacionAltoFacturasProveedores) {
		this.isPermisoPaginacionAltoFacturasProveedores = isPermisoPaginacionAltoFacturasProveedores;
	}
	
	public Boolean getIsPermisoCopiarFacturasProveedores() {
		return isPermisoCopiarFacturasProveedores;
	}

	public void setIsPermisoCopiarFacturasProveedores(Boolean isPermisoCopiarFacturasProveedores) {
		this.isPermisoCopiarFacturasProveedores = isPermisoCopiarFacturasProveedores;
	}
	
	public Boolean getIsPermisoVerFormFacturasProveedores() {
		return isPermisoVerFormFacturasProveedores;
	}

	public void setIsPermisoVerFormFacturasProveedores(Boolean isPermisoVerFormFacturasProveedores) {
		this.isPermisoVerFormFacturasProveedores = isPermisoVerFormFacturasProveedores;
	}
	
	public Boolean getIsPermisoDuplicarFacturasProveedores() {
		return isPermisoDuplicarFacturasProveedores;
	}

	public void setIsPermisoDuplicarFacturasProveedores(Boolean isPermisoDuplicarFacturasProveedores) {
		this.isPermisoDuplicarFacturasProveedores = isPermisoDuplicarFacturasProveedores;
	}
	
	public Boolean getIsPermisoOrdenFacturasProveedores() {
		return isPermisoOrdenFacturasProveedores;
	}

	public void setIsPermisoOrdenFacturasProveedores(Boolean isPermisoOrdenFacturasProveedores) {
		this.isPermisoOrdenFacturasProveedores = isPermisoOrdenFacturasProveedores;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFacturasProveedores() {
		return isVisibilidadCeldaNuevoFacturasProveedores;
	}

	public void setIsVisibilidadCeldaNuevoFacturasProveedores(Boolean isVisibilidadCeldaNuevoFacturasProveedores) {
		this.isVisibilidadCeldaNuevoFacturasProveedores = isVisibilidadCeldaNuevoFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFacturasProveedores() {
		return isVisibilidadCeldaDuplicarFacturasProveedores;
	}

	public void setIsVisibilidadCeldaDuplicarFacturasProveedores(Boolean isVisibilidadCeldaDuplicarFacturasProveedores) {
		this.isVisibilidadCeldaDuplicarFacturasProveedores = isVisibilidadCeldaDuplicarFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFacturasProveedores() {
		return isVisibilidadCeldaCopiarFacturasProveedores;
	}

	public void setIsVisibilidadCeldaCopiarFacturasProveedores(Boolean isVisibilidadCeldaCopiarFacturasProveedores) {
		this.isVisibilidadCeldaCopiarFacturasProveedores = isVisibilidadCeldaCopiarFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFacturasProveedores() {
		return isVisibilidadCeldaVerFormFacturasProveedores;
	}

	public void setIsVisibilidadCeldaVerFormFacturasProveedores(Boolean isVisibilidadCeldaVerFormFacturasProveedores) {
		this.isVisibilidadCeldaVerFormFacturasProveedores = isVisibilidadCeldaVerFormFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFacturasProveedores() {
		return isVisibilidadCeldaOrdenFacturasProveedores;
	}

	public void setIsVisibilidadCeldaOrdenFacturasProveedores(Boolean isVisibilidadCeldaOrdenFacturasProveedores) {
		this.isVisibilidadCeldaOrdenFacturasProveedores = isVisibilidadCeldaOrdenFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFacturasProveedores() {
		return isVisibilidadCeldaNuevoRelacionesFacturasProveedores;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFacturasProveedores(Boolean isVisibilidadCeldaNuevoRelacionesFacturasProveedores) {
		this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores = isVisibilidadCeldaNuevoRelacionesFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFacturasProveedores() {
		return isVisibilidadCeldaModificarFacturasProveedores;
	}

	public void setIsVisibilidadCeldaModificarFacturasProveedores(Boolean isVisibilidadCeldaModificarFacturasProveedores) {
		this.isVisibilidadCeldaModificarFacturasProveedores = isVisibilidadCeldaModificarFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFacturasProveedores() {
		return isVisibilidadCeldaActualizarFacturasProveedores;
	}

	public void setIsVisibilidadCeldaActualizarFacturasProveedores(Boolean isVisibilidadCeldaActualizarFacturasProveedores) {
		this.isVisibilidadCeldaActualizarFacturasProveedores = isVisibilidadCeldaActualizarFacturasProveedores;
	}

	public Boolean getIsVisibilidadCeldaEliminarFacturasProveedores() {
		return isVisibilidadCeldaEliminarFacturasProveedores;
	}

	public void setIsVisibilidadCeldaEliminarFacturasProveedores(Boolean isVisibilidadCeldaEliminarFacturasProveedores) {
		this.isVisibilidadCeldaEliminarFacturasProveedores = isVisibilidadCeldaEliminarFacturasProveedores;
	}

	public Boolean getIsVisibilidadCeldaCancelarFacturasProveedores() {
		return isVisibilidadCeldaCancelarFacturasProveedores;
	}

	public void setIsVisibilidadCeldaCancelarFacturasProveedores(Boolean isVisibilidadCeldaCancelarFacturasProveedores) {
		this.isVisibilidadCeldaCancelarFacturasProveedores = isVisibilidadCeldaCancelarFacturasProveedores;
	}

	public Boolean getIsVisibilidadCeldaGuardarFacturasProveedores() {
		return isVisibilidadCeldaGuardarFacturasProveedores;
	}

	public void setIsVisibilidadCeldaGuardarFacturasProveedores(Boolean isVisibilidadCeldaGuardarFacturasProveedores) {
		this.isVisibilidadCeldaGuardarFacturasProveedores = isVisibilidadCeldaGuardarFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFacturasProveedores() {
		return isVisibilidadCeldaGuardarCambiosFacturasProveedores;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFacturasProveedores(Boolean isVisibilidadCeldaGuardarCambiosFacturasProveedores) {
		this.isVisibilidadCeldaGuardarCambiosFacturasProveedores = isVisibilidadCeldaGuardarCambiosFacturasProveedores;
	}
		
	public FacturasProveedoresSessionBean getfacturasproveedoresSessionBean() {
		return this.facturasproveedoresSessionBean;
	}
	
	public void setfacturasproveedoresSessionBean(FacturasProveedoresSessionBean facturasproveedoresSessionBean) {
		this.facturasproveedoresSessionBean=facturasproveedoresSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaFacturasProveedores() {
		return this.isVisibilidadBusquedaFacturasProveedores;
	}

	public void setisVisibilidadBusquedaFacturasProveedores(Boolean isVisibilidadBusquedaFacturasProveedores) {
		this.isVisibilidadBusquedaFacturasProveedores=isVisibilidadBusquedaFacturasProveedores;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(FacturasProveedores facturasproveedores)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(facturasproveedores,null);
				this.setActualParaGuardarClienteForeignKey(facturasproveedores,null);
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
	
	public void bugActualizarReferenciaActual(FacturasProveedores facturasproveedores,FacturasProveedores facturasproveedoresAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFacturasProveedores(facturasproveedores);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		facturasproveedoresAux.setId(facturasproveedores.getId());
		facturasproveedoresAux.setVersionRow(facturasproveedores.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(FacturasProveedores facturasproveedoresLocal) throws Exception {
		
		if(this.facturasproveedoresSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FacturasProveedores facturasproveedoresLocal) throws Exception {	
		if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				facturasproveedoresLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				facturasproveedoresLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFacturasProveedoresActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = facturasproveedoresValidator.getInvalidValues(this.facturasproveedores);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FacturasProveedores facturasproveedores,List<FacturasProveedores> facturasproveedoress) throws Exception {
	}		
	
	public void actualizarSelectedLista(FacturasProveedores facturasproveedores,List<FacturasProveedores> facturasproveedoress) throws Exception {
		try	{			
			FacturasProveedoresConstantesFunciones.actualizarSelectedLista(facturasproveedores,facturasproveedoress);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FacturasProveedores> facturasproveedoressLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				facturasproveedoressLocal=this.facturasproveedoresLogic.getFacturasProveedoress();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				facturasproveedoressLocal=this.facturasproveedoress;
			}
			//ARCHITECTURE
		
			for(FacturasProveedores facturasproveedoresLocal:facturasproveedoressLocal) {
				if(this.permiteMantenimiento(facturasproveedoresLocal) && facturasproveedoresLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FacturasProveedoresConstantesFunciones.getFacturasProveedoresLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FacturasProveedoresConstantesFunciones.CODIGOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelcodigo_clienteFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasProveedoresConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelnombre_clienteFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasProveedoresConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelnumero_facturaFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasProveedoresConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelfecha_emisionFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasProveedoresConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabeltotalFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasProveedoresConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelnumero_pre_impresoFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturasProveedoresConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelfechaFacturasProveedores,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasProveedores.jLabelcodigo_clienteFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasProveedores.jLabelnombre_clienteFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasProveedores.jLabelnumero_facturaFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasProveedores.jLabelfecha_emisionFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasProveedores.jLabeltotalFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasProveedores.jLabelnumero_pre_impresoFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturasProveedores.jLabelfechaFacturasProveedores,"");
		
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
		this.iIdNuevoFacturasProveedores--;	
		
		
		this.facturasproveedoresAux=new FacturasProveedores();
		
		this.facturasproveedoresAux.setId(this.iIdNuevoFacturasProveedores);
		this.facturasproveedoresAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturasproveedoresLogic.getFacturasProveedoress().add(this.facturasproveedoresAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.facturasproveedoress.add(this.facturasproveedoresAux);
		}
		//ARCHITECTURE
		
		this.facturasproveedores=this.facturasproveedoresAux;
		
		if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFacturasProveedores(this.facturasproveedores);
			this.setVariablesObjetoActualToFormularioForeignKeyFacturasProveedores(this.facturasproveedores);
		}
				
		//this.setDefaultControlesFacturasProveedores();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFacturasProveedores();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFacturasProveedores();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasProveedores();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturasProveedores(this.facturasproveedoresBean,this.facturasproveedores,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFacturasProveedores(this.facturasproveedoresReturnGeneral,this.facturasproveedoresBean,false);
		
		if(this.facturasproveedoresReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFacturasProveedores(this.facturasproveedoresReturnGeneral.getFacturasProveedores());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFacturasProveedores(this.facturasproveedoresReturnGeneral.getFacturasProveedores());
		}
		
		if(this.facturasproveedoresReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFacturasProveedores(this.facturasproveedoresReturnGeneral.getFacturasProveedores(),classes);//this.facturasproveedoresBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFacturasProveedores();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFacturasProveedores();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.RecargarFormFacturasProveedores(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFacturasProveedores(false);
						
			if(facturasproveedoresSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasProveedores();
			}
			
			this.actualizarVisualTableDatosFacturasProveedores();
			
			this.jTableDatosFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoFacturasProveedores(), this.getIndiceNuevoFacturasProveedores());
			
			this.seleccionarFilaTablaFacturasProveedoresActual();
						
			this.actualizarEstadoCeldasBotonesFacturasProveedores("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFacturasProveedores(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emision_inicioFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarfecha_emision_inicioFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emision_finFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarfecha_emision_finFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldcodigo_clienteFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarcodigo_clienteFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextAreanombre_clienteFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarnombre_clienteFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_facturaFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarnumero_facturaFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emisionFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarfecha_emisionFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldtotalFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activartotalFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_pre_impresoFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarnumero_pre_impresoFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfechaFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarfechaFacturasProveedores);	
		//
		this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarid_empresaFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.setEnabled(isHabilitar && this.facturasproveedoresConstantesFunciones.activarid_clienteFacturasProveedores);
	};
	
	public void setDefaultControlesFacturasProveedores() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFacturasProveedores(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.facturasproveedoresSessionBean.setConGuardarRelaciones(true);			
			this.facturasproveedoresSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFacturasProveedores.jTabbedPaneRelacionesFacturasProveedores.setVisible(true);
			
					
		} else {
			//this.facturasproveedoresSessionBean.setConGuardarRelaciones(false);			
			this.facturasproveedoresSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFacturasProveedores.jTabbedPaneRelacionesFacturasProveedores.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFacturasProveedores() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoresLogic.getFacturasProveedoress()) {
				if(facturasproveedoresAux.getId().equals(this.iIdNuevoFacturasProveedores)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoress) {
				if(facturasproveedoresAux.getId().equals(this.iIdNuevoFacturasProveedores)) {
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
	
	public int getIndiceActualFacturasProveedores(FacturasProveedores facturasproveedores,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoresLogic.getFacturasProveedoress()) {
				if(facturasproveedoresAux.getId().equals(facturasproveedores.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoress) {
				if(facturasproveedoresAux.getId().equals(facturasproveedores.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFacturasProveedores(FacturasProveedores facturasproveedoresOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoresLogic.getFacturasProveedoress()) {
				if(facturasproveedoresAux.getFacturasProveedoresOriginal().getId().equals(facturasproveedoresOriginal.getId())) {
					existe=true;
					facturasproveedoresOriginal.setId(facturasproveedoresAux.getId());
					facturasproveedoresOriginal.setVersionRow(facturasproveedoresAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoress) {
				if(facturasproveedoresAux.getFacturasProveedoresOriginal().getId().equals(facturasproveedoresOriginal.getId())) {
					existe=true;
					facturasproveedoresOriginal.setId(facturasproveedoresAux.getId());
					facturasproveedoresOriginal.setVersionRow(facturasproveedoresAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFacturasProveedores(Boolean esParaCancelar) throws Exception {
		facturasproveedoressAux=new ArrayList<FacturasProveedores>();
		facturasproveedoresAux=new FacturasProveedores();
		
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoresLogic.getFacturasProveedoress()) {
					if(facturasproveedoresAux.getId()<0) {
						facturasproveedoressAux.add(facturasproveedoresAux);
					}		
				}
				this.iIdNuevoFacturasProveedores=0L;
				this.facturasproveedoresLogic.getFacturasProveedoress().removeAll(facturasproveedoressAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoress) {
					if(facturasproveedoresAux.getId()<0) {
						facturasproveedoressAux.add(facturasproveedoresAux);
					}		
				}
				this.iIdNuevoFacturasProveedores=0L;
				this.facturasproveedoress.removeAll(facturasproveedoressAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFacturasProveedores 
					&& this.facturasproveedoresLogic.getFacturasProveedoress().size()>0
					) {
					facturasproveedoresAux=this.facturasproveedoresLogic.getFacturasProveedoress().get(this.facturasproveedoresLogic.getFacturasProveedoress().size() - 1);
				
					if(facturasproveedoresAux.getId()<0) {
						this.facturasproveedoresLogic.getFacturasProveedoress().remove(facturasproveedoresAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFacturasProveedores && this.facturasproveedoress.size()>0) {
					facturasproveedoresAux=this.facturasproveedoress.get(this.facturasproveedoress.size() - 1);
				
					if(facturasproveedoresAux.getId()<0) {
						this.facturasproveedoress.remove(facturasproveedoresAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFacturasProveedores(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(facturasproveedores.getId()<0) {
				this.facturasproveedoresLogic.getFacturasProveedoress().remove(this.facturasproveedores);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(facturasproveedores.getId()<0) {
				this.facturasproveedoress.remove(this.facturasproveedores);
			}
		}			
	}
	
	public void setEstadosInicialesFacturasProveedores(List<FacturasProveedores> facturasproveedoressAux) throws Exception {
		FacturasProveedoresConstantesFunciones.setEstadosInicialesFacturasProveedores(facturasproveedoressAux);
	}
	
	public void setEstadosInicialesFacturasProveedores(FacturasProveedores facturasproveedoresAux) throws Exception {
		FacturasProveedoresConstantesFunciones.setEstadosInicialesFacturasProveedores(facturasproveedoresAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFacturasProveedoresActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFacturasProveedoresActual()) {
				if(!this.isEsNuevoFacturasProveedores) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFacturasProveedores=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFacturasProveedoresActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Facturas Proveedores ?", "MANTENIMIENTO DE Facturas Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FacturasProveedores facturasproveedores) throws Exception {
		FacturasProveedoresConstantesFunciones.seleccionarAsignar(this.facturasproveedores,facturasproveedores);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFacturasProveedores=this.isPermisoActualizarOriginalFacturasProveedores;
			
			
			this.seleccionarAsignar(facturasproveedores);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesFacturasProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.facturasproveedoresSessionBean.setsFuncionBusquedaRapida(this.facturasproveedoresSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFacturasProveedores) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFacturasProveedores(esParaCancelar);				
				this.cancelarNuevoFacturasProveedores(esParaCancelar);								
			}
			
			this.facturasproveedores=new FacturasProveedores();
			
			this.inicializarFacturasProveedores();
			
			this.actualizarEstadoCeldasBotonesFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFacturasProveedores() throws Exception {
		try {
			FacturasProveedoresConstantesFunciones.inicializarFacturasProveedores(this.facturasproveedores);
			
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
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.facturasproveedoresLogic.getFacturasProveedoress().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFacturasProveedoress(String sAccionBusqueda,List<FacturasProveedores> facturasproveedoressParaReportes) throws Exception {
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
					sPathReporteFinal="FacturasProveedores"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FacturasProveedoresMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FacturasProveedoresMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FacturasProveedores"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Facturas Proveedoreses");		
		parameters.put("busquedapor", FacturasProveedoresConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFacturasProveedores=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFacturasProveedores=new JRBeanArrayDataSource(FacturasProveedoresJInternalFrame.TraerFacturasProveedoresBeans(facturasproveedoressParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFacturasProveedores);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FacturasProveedoresConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FacturasProveedoresConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FacturasProveedoresBean.TraerFacturasProveedoresBeans(facturasproveedoressParaReportes).toArray()));
							
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
				this.generarExcelReporteFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,facturasproveedoressParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,facturasproveedoressParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFacturasProveedoresActionPerformed(null);
					//this.generarExcelReporteFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,facturasproveedoressParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,facturasproveedoressParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,facturasproveedoressParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,facturasproveedoressParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFacturasProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasProveedores> facturasproveedoressParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasproveedores";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasProveedoress");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturasProveedores("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FacturasProveedores facturasproveedores : facturasproveedoressParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FacturasProveedoresConstantesFunciones.generarExcelReporteDataFacturasProveedores("NORMAL",row,workbook,facturasproveedores,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFacturasProveedores(String sTipo,Row row,Workbook workbook) {
		
		FacturasProveedoresConstantesFunciones.generarExcelReporteHeaderFacturasProveedores(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFacturasProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasProveedores> facturasproveedoressParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasproveedores_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FacturasProveedores facturasproveedores : facturasproveedoressParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FacturasProveedoresConstantesFunciones.getFacturasProveedoresDescripcion(facturasproveedores));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getfecha_emision_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getfecha_emision_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getcodigo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturasProveedoresConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturasproveedores.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFacturasProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturasProveedores> facturasproveedoressParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FacturasProveedores> facturasproveedoressRespaldo=null;
		
		classes=FacturasProveedoresConstantesFunciones.getClassesRelationshipsOfFacturasProveedores(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.facturasproveedoresLogic.setDatosCliente(this.datosCliente);
		this.facturasproveedoresLogic.setDatosDeep(this.datosDeep);
		this.facturasproveedoresLogic.setIsConDeep(true);
		
		facturasproveedoressRespaldo=this.facturasproveedoresLogic.getFacturasProveedoress();
		
		this.facturasproveedoresLogic.setFacturasProveedoress(facturasproveedoressParaReportes);	
		this.facturasproveedoresLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		facturasproveedoressParaReportes=this.facturasproveedoresLogic.getFacturasProveedoress();
		this.facturasproveedoresLogic.setFacturasProveedoress(facturasproveedoressRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasproveedores_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturasProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturasProveedores("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FacturasProveedores facturasproveedores : facturasproveedoressParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFacturasProveedores("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FacturasProveedoresConstantesFunciones.generarExcelReporteDataFacturasProveedores("NORMAL",row,workbook,facturasproveedores,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FacturasProveedoresConstantesFunciones.getFacturasProveedoresDescripcion(facturasproveedores));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasProveedores.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFacturasProveedores() throws Exception {		
		this.startProcessFacturasProveedores(true);
	}
	
	public void startProcessFacturasProveedores(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFacturasProveedores ,this.jPanelParametrosReportesFacturasProveedores, this.jScrollPanelDatosFacturasProveedores,this.jPanelPaginacionFacturasProveedores, this.jScrollPanelDatosEdicionFacturasProveedores, this.jPanelAccionesFacturasProveedores,this.jPanelAccionesFormularioFacturasProveedores,this.jmenuBarFacturasProveedores,this.jmenuBarDetalleFacturasProveedores,this.jTtoolBarFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturasProveedores=this.jTabbedPaneBusquedasFacturasProveedores; 
		
		final JPanel jPanelParametrosReportesFacturasProveedores=this.jPanelParametrosReportesFacturasProveedores;
		//final JScrollPane jScrollPanelDatosFacturasProveedores=this.jScrollPanelDatosFacturasProveedores;
		final JTable jTableDatosFacturasProveedores=this.jTableDatosFacturasProveedores;		
		final JPanel jPanelPaginacionFacturasProveedores=this.jPanelPaginacionFacturasProveedores;
		//final JScrollPane jScrollPanelDatosEdicionFacturasProveedores=this.jScrollPanelDatosEdicionFacturasProveedores;
		final JPanel jPanelAccionesFacturasProveedores=this.jPanelAccionesFacturasProveedores;
		
		JPanel jPanelCamposAuxiliarFacturasProveedores=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFacturasProveedores=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			jPanelCamposAuxiliarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jPanelCamposFacturasProveedores;
			jPanelAccionesFormularioAuxiliarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jPanelAccionesFormularioFacturasProveedores;
		}
		
		final JPanel jPanelCamposFacturasProveedores=jPanelCamposAuxiliarFacturasProveedores;
		final JPanel jPanelAccionesFormularioFacturasProveedores=jPanelAccionesFormularioAuxiliarFacturasProveedores;
		
		
		final JMenuBar jmenuBarFacturasProveedores=this.jmenuBarFacturasProveedores;
		final JToolBar jTtoolBarFacturasProveedores=this.jTtoolBarFacturasProveedores;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFacturasProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturasProveedores=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			jmenuBarDetalleAuxiliarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jmenuBarDetalleFacturasProveedores;
			jTtoolBarDetalleAuxiliarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jTtoolBarDetalleFacturasProveedores;
		}
		
		final JMenuBar jmenuBarDetalleFacturasProveedores=jmenuBarDetalleAuxiliarFacturasProveedores;
		final JToolBar jTtoolBarDetalleFacturasProveedores=jTtoolBarDetalleAuxiliarFacturasProveedores;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturasProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturasProveedores;
			processRunnable.jTableDatos=jTableDatosFacturasProveedores;
			processRunnable.jPanelCampos=jPanelCamposFacturasProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturasProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesFacturasProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturasProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarFacturasProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturasProveedores;
			processRunnable.jTtoolBar=jTtoolBarFacturasProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturasProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturasProveedores ,jPanelParametrosReportesFacturasProveedores,jTableDatosFacturasProveedores, /*jScrollPanelDatosFacturasProveedores,*/jPanelCamposFacturasProveedores,jPanelPaginacionFacturasProveedores, /*jScrollPanelDatosEdicionFacturasProveedores,*/ jPanelAccionesFacturasProveedores,jPanelAccionesFormularioFacturasProveedores,jmenuBarFacturasProveedores,jmenuBarDetalleFacturasProveedores,jTtoolBarFacturasProveedores,jTtoolBarDetalleFacturasProveedores);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturasProveedores ,jPanelParametrosReportesFacturasProveedores, jScrollPanelDatosFacturasProveedores,jPanelPaginacionFacturasProveedores, jScrollPanelDatosEdicionFacturasProveedores, jPanelAccionesFacturasProveedores,jPanelAccionesFormularioFacturasProveedores,jmenuBarFacturasProveedores,jmenuBarDetalleFacturasProveedores,jTtoolBarFacturasProveedores,jTtoolBarDetalleFacturasProveedores);
						
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
	
	public void finishProcessFacturasProveedores() {// throws Exception 
		this.finishProcessFacturasProveedores(true);
	}
	
	public void finishProcessFacturasProveedores(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFacturasProveedores ,this.jPanelParametrosReportesFacturasProveedores, this.jScrollPanelDatosFacturasProveedores,this.jPanelPaginacionFacturasProveedores, this.jScrollPanelDatosEdicionFacturasProveedores, this.jPanelAccionesFacturasProveedores,this.jPanelAccionesFormularioFacturasProveedores,this.jmenuBarFacturasProveedores,this.jmenuBarDetalleFacturasProveedores,this.jTtoolBarFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturasProveedores=this.jTabbedPaneBusquedasFacturasProveedores; 
		
		final JPanel jPanelParametrosReportesFacturasProveedores=this.jPanelParametrosReportesFacturasProveedores;
		//final JScrollPane jScrollPanelDatosFacturasProveedores=this.jScrollPanelDatosFacturasProveedores;
		final JTable jTableDatosFacturasProveedores=this.jTableDatosFacturasProveedores;		
		final JPanel jPanelPaginacionFacturasProveedores=this.jPanelPaginacionFacturasProveedores;
		//final JScrollPane jScrollPanelDatosEdicionFacturasProveedores=this.jScrollPanelDatosEdicionFacturasProveedores;
		final JPanel jPanelAccionesFacturasProveedores=this.jPanelAccionesFacturasProveedores;
		
		JPanel jPanelCamposAuxiliarFacturasProveedores=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFacturasProveedores=new JPanel();
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			jPanelCamposAuxiliarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jPanelCamposFacturasProveedores;
			jPanelAccionesFormularioAuxiliarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jPanelAccionesFormularioFacturasProveedores;
		}
		
		final JPanel jPanelCamposFacturasProveedores=jPanelCamposAuxiliarFacturasProveedores;
		final JPanel jPanelAccionesFormularioFacturasProveedores=jPanelAccionesFormularioAuxiliarFacturasProveedores;
		
		
		final JMenuBar jmenuBarFacturasProveedores=this.jmenuBarFacturasProveedores;		
		final JToolBar jTtoolBarFacturasProveedores=this.jTtoolBarFacturasProveedores;
				
		JMenuBar jmenuBarDetalleAuxiliarFacturasProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturasProveedores=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			jmenuBarDetalleAuxiliarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jmenuBarDetalleFacturasProveedores;
			jTtoolBarDetalleAuxiliarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jTtoolBarDetalleFacturasProveedores;		
		}
		
		final JMenuBar jmenuBarDetalleFacturasProveedores=jmenuBarDetalleAuxiliarFacturasProveedores;
		final JToolBar jTtoolBarDetalleFacturasProveedores=jTtoolBarDetalleAuxiliarFacturasProveedores;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturasProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturasProveedores;
			processRunnable.jTableDatos=jTableDatosFacturasProveedores;
			processRunnable.jPanelCampos=jPanelCamposFacturasProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturasProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesFacturasProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturasProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarFacturasProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturasProveedores;
			processRunnable.jTtoolBar=jTtoolBarFacturasProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturasProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFacturasProveedores ,jPanelParametrosReportesFacturasProveedores, jTableDatosFacturasProveedores,/*jScrollPanelDatosFacturasProveedores,*/jPanelCamposFacturasProveedores,jPanelPaginacionFacturasProveedores, /*jScrollPanelDatosEdicionFacturasProveedores,*/ jPanelAccionesFacturasProveedores,jPanelAccionesFormularioFacturasProveedores,jmenuBarFacturasProveedores,jmenuBarDetalleFacturasProveedores,jTtoolBarFacturasProveedores,jTtoolBarDetalleFacturasProveedores));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFacturasProveedores(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFacturasProveedores(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFacturasProveedores(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFacturasProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFacturasProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturasProveedores,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFacturasProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFacturasProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturasProveedores,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.facturasproveedoresConstantesFunciones.getsFinalQueryFacturasProveedores();
		String  finalQueryPaginacionTodos=this.facturasproveedoresConstantesFunciones.getsFinalQueryFacturasProveedores();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FacturasProveedoresConstantesFunciones.getArrayColumnasGlobalesNoFacturasProveedores(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FacturasProveedoresConstantesFunciones.getArrayColumnasGlobalesFacturasProveedores(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FacturasProveedoresConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.facturasproveedoressEliminados= new ArrayList<FacturasProveedores>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFacturasProveedores();
		
				///*FacturasProveedoresSessionBean*/this.facturasproveedoresSessionBean=new FacturasProveedoresSessionBean();
			
			if(this.facturasproveedoresSessionBean==null) {
				this.facturasproveedoresSessionBean=new FacturasProveedoresSessionBean();
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
					this.iNumeroPaginacion=FacturasProveedoresConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FacturasProveedoresConstantesFunciones.getClassesForeignKeysOfFacturasProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/facturasproveedores."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			facturasproveedoressAux= new ArrayList<FacturasProveedores>();
			
				
			facturasproveedoresLogic.setDatosCliente(this.datosCliente);
			facturasproveedoresLogic.setDatosDeep(this.datosDeep);
			facturasproveedoresLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaFacturasProveedores")) {
				this.sDetalleReporte=FacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaFacturasProveedores(id_clienteBusquedaFacturasProveedores,fecha_emision_inicioBusquedaFacturasProveedores,fecha_emision_finBusquedaFacturasProveedores);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturasproveedoresLogic.getFacturasProveedoressBusquedaFacturasProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_clienteBusquedaFacturasProveedores,fecha_emision_inicioBusquedaFacturasProveedores,fecha_emision_finBusquedaFacturasProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaFacturasProveedores(id_clienteBusquedaFacturasProveedores,fecha_emision_inicioBusquedaFacturasProveedores,fecha_emision_finBusquedaFacturasProveedores);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaFacturasProveedores(id_clienteBusquedaFacturasProveedores,fecha_emision_inicioBusquedaFacturasProveedores,fecha_emision_finBusquedaFacturasProveedores);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturasproveedoresLogic.getFacturasProveedoress()==null||facturasproveedoresLogic.getFacturasProveedoress().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturasproveedoress==null|| facturasproveedoress.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasproveedoressAux=new ArrayList<FacturasProveedores>();
						facturasproveedoressAux.addAll(facturasproveedoresLogic.getFacturasProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturasproveedoressAux=new ArrayList<FacturasProveedores>();
							facturasproveedoressAux.addAll(facturasproveedoress);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturasproveedoresLogic.getFacturasProveedoressBusquedaFacturasProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_clienteBusquedaFacturasProveedores,fecha_emision_inicioBusquedaFacturasProveedores,fecha_emision_finBusquedaFacturasProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaFacturasProveedores(id_clienteBusquedaFacturasProveedores,fecha_emision_inicioBusquedaFacturasProveedores,fecha_emision_finBusquedaFacturasProveedores);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaFacturasProveedores(id_clienteBusquedaFacturasProveedores,fecha_emision_inicioBusquedaFacturasProveedores,fecha_emision_finBusquedaFacturasProveedores);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturasProveedoress("BusquedaFacturasProveedores",facturasproveedoresLogic.getFacturasProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturasProveedoress("BusquedaFacturasProveedores",facturasproveedoress);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasproveedoresLogic.setFacturasProveedoress(new ArrayList<FacturasProveedores>());
						facturasproveedoresLogic.getFacturasProveedoress().addAll(facturasproveedoressAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturasproveedoress=new ArrayList<FacturasProveedores>();
							facturasproveedoress.addAll(facturasproveedoressAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFacturasProveedores();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFacturasProveedores();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturasproveedoresLogic.getFacturasProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturasproveedoress.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturasproveedoresLogic.getFacturasProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturasproveedoress.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FacturasProveedores facturasproveedores) {
		Boolean permite=true;
		
		if(this.facturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FacturasProveedoresConstantesFunciones.getOrderByListaFacturasProveedores();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FacturasProveedoresConstantesFunciones.getOrderByListaFacturasProveedores();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasProveedores facturasproveedores:facturasproveedoresLogic.getFacturasProveedoress()) {
				if(facturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					facturasproveedoresTotales=facturasproveedores;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasProveedores facturasproveedores:this.facturasproveedoress) {
				if(facturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					facturasproveedoresTotales=facturasproveedores;
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
			this.facturasproveedoresAux=new FacturasProveedores();
			this.facturasproveedoresAux.setsType(Constantes2.S_TOTALES);
			this.facturasproveedoresAux.setIsNew(false);
			this.facturasproveedoresAux.setIsChanged(false);
			this.facturasproveedoresAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//FacturasProveedoresConstantesFunciones.TotalizarValoresFilaFacturasProveedores(this.facturasproveedoresLogic.getFacturasProveedoress(),this.facturasproveedoresAux);
				
				//this.facturasproveedoresLogic.getFacturasProveedoress().add(this.facturasproveedoresAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FacturasProveedoresConstantesFunciones.TotalizarValoresFilaFacturasProveedores(this.facturasproveedoress,this.facturasproveedoresAux);
				
				this.facturasproveedoress.add(this.facturasproveedoresAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		facturasproveedoresTotales=new FacturasProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturasproveedoresLogic.getFacturasProveedoress().remove(facturasproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturasproveedoress.remove(facturasproveedoresTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		facturasproveedoresTotales=new FacturasProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturasProveedores facturasproveedores:facturasproveedoresLogic.getFacturasProveedoress()) {
				if(facturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					facturasproveedoresTotales=facturasproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturasProveedoresConstantesFunciones.TotalizarValoresFilaFacturasProveedores(this.facturasproveedoresLogic.getFacturasProveedoress(),facturasproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturasProveedores facturasproveedores:this.facturasproveedoress) {
				if(facturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					facturasproveedoresTotales=facturasproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturasProveedoresConstantesFunciones.TotalizarValoresFilaFacturasProveedores(this.facturasproveedoress,facturasproveedoresTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFacturasProveedoressBusquedaFacturasProveedores()throws Exception {
		try {
			sAccionBusqueda="BusquedaFacturasProveedores";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasProveedoressFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturasProveedoressFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFacturasProveedoressBusquedaFacturasProveedores(String sFinalQuery,Long id_cliente,Date fecha_emision_inicio,Date fecha_emision_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasproveedoresLogic.getFacturasProveedoressBusquedaFacturasProveedores(sFinalQuery,this.pagination,id_cliente,fecha_emision_inicio,fecha_emision_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasProveedoressFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasproveedoresLogic.getFacturasProveedoressFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturasProveedoressFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturasproveedoresLogic.getFacturasProveedoressFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosFacturasProveedores() {
		this.isPermisoTodoFacturasProveedores=false;
		this.isPermisoNuevoFacturasProveedores=false;
		this.isPermisoActualizarFacturasProveedores=false;
		this.isPermisoActualizarOriginalFacturasProveedores=false;
		this.isPermisoEliminarFacturasProveedores=false;
		this.isPermisoGuardarCambiosFacturasProveedores=false;
		this.isPermisoConsultaFacturasProveedores=true;
		this.isPermisoBusquedaFacturasProveedores=true;
		this.isPermisoReporteFacturasProveedores=true;
		this.isPermisoOrdenFacturasProveedores=false;		
		this.isPermisoPaginacionMedioFacturasProveedores=false;		
		this.isPermisoPaginacionAltoFacturasProveedores=false;		
		this.isPermisoPaginacionTodoFacturasProveedores=false;		
		this.isPermisoCopiarFacturasProveedores=false;		
		this.isPermisoVerFormFacturasProveedores=false;		
		this.isPermisoDuplicarFacturasProveedores=false;
		this.isPermisoOrdenFacturasProveedores=false;
	}
	
	public void setPermisosUsuarioFacturasProveedores(Boolean isPermiso) {
		this.isPermisoTodoFacturasProveedores=isPermiso;
		this.isPermisoNuevoFacturasProveedores=isPermiso;
		this.isPermisoActualizarFacturasProveedores=isPermiso;
		this.isPermisoActualizarOriginalFacturasProveedores=isPermiso;
		this.isPermisoEliminarFacturasProveedores=isPermiso;
		this.isPermisoGuardarCambiosFacturasProveedores=isPermiso;
		this.isPermisoConsultaFacturasProveedores=isPermiso;
		this.isPermisoBusquedaFacturasProveedores=isPermiso;
		this.isPermisoReporteFacturasProveedores=isPermiso;
		this.isPermisoOrdenFacturasProveedores=isPermiso;		
		this.isPermisoPaginacionMedioFacturasProveedores=isPermiso;		
		this.isPermisoPaginacionAltoFacturasProveedores=isPermiso;		
		this.isPermisoPaginacionTodoFacturasProveedores=isPermiso;		
		this.isPermisoCopiarFacturasProveedores=isPermiso;		
		this.isPermisoVerFormFacturasProveedores=isPermiso;		
		this.isPermisoDuplicarFacturasProveedores=isPermiso;
		this.isPermisoOrdenFacturasProveedores=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFacturasProveedores(Boolean isPermiso) {
		//this.isPermisoTodoFacturasProveedores=isPermiso;
		this.isPermisoNuevoFacturasProveedores=isPermiso;
		this.isPermisoActualizarFacturasProveedores=isPermiso;
		this.isPermisoActualizarOriginalFacturasProveedores=isPermiso;
		this.isPermisoEliminarFacturasProveedores=isPermiso;
		this.isPermisoGuardarCambiosFacturasProveedores=isPermiso;
		//this.isPermisoConsultaFacturasProveedores=isPermiso;
		//this.isPermisoBusquedaFacturasProveedores=isPermiso;
		//this.isPermisoReporteFacturasProveedores=isPermiso;
		//this.isPermisoOrdenFacturasProveedores=isPermiso;		
		//this.isPermisoPaginacionMedioFacturasProveedores=isPermiso;		
		//this.isPermisoPaginacionAltoFacturasProveedores=isPermiso;		
		//this.isPermisoPaginacionTodoFacturasProveedores=isPermiso;		
		//this.isPermisoCopiarFacturasProveedores=isPermiso;		
		//this.isPermisoDuplicarFacturasProveedores=isPermiso;
		//this.isPermisoOrdenFacturasProveedores=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFacturasProveedoresClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFacturasProveedores(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFacturasProveedoresClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFacturasProveedoresClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFacturasProveedoresClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFacturasProveedoresClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFacturasProveedores() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FacturasProveedoresConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFacturasProveedores=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFacturasProveedores=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFacturasProveedores=this.isPermisoActualizarFacturasProveedores;
			this.isPermisoEliminarFacturasProveedores=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFacturasProveedores=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFacturasProveedores=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFacturasProveedores=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFacturasProveedores=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFacturasProveedores=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturasProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFacturasProveedores=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFacturasProveedores=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFacturasProveedores=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFacturasProveedores=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFacturasProveedores=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFacturasProveedores=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturasProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFacturasProveedores.setToolTipText(this.jTableDatosFacturasProveedores.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFacturasProveedores(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFacturasProveedores(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFacturasProveedores() throws Exception {
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
	public void inicializarCombosForeignKeyFacturasProveedoresListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFacturasProveedoresListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FacturasProveedoresJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyFacturasProveedores()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.facturasproveedoresSessionBean==null) {
				this.facturasproveedoresSessionBean=new FacturasProveedoresSessionBean();
			}

			if(!this.facturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.facturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyFacturasProveedores()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFacturasProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFacturasProveedores()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasProveedores();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFacturasProveedores(FacturasProveedores facturasproveedores)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFacturasProveedores(FacturasProveedores facturasproveedores,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFacturasProveedores()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFacturasProveedores()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFacturasProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFacturasProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFacturasProveedores()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFacturasProveedores()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFacturasProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFacturasProveedores()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public FacturasProveedoresBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FacturasProveedoresBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FacturasProveedoresBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.facturasproveedoresSessionBean=new FacturasProveedoresSessionBean(); 
		this.facturasproveedoresConstantesFunciones=new FacturasProveedoresConstantesFunciones(); 
		this.facturasproveedoresBean=new FacturasProveedores();//(this.facturasproveedoresConstantesFunciones); 		
		this.facturasproveedoresReturnGeneral=new FacturasProveedoresParameterReturnGeneral(); 
		
		this.facturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FacturasProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FacturasProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FacturasProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFacturasProveedores(true);
			
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
			
			this.facturasproveedoresConstantesFunciones=new FacturasProveedoresConstantesFunciones(); 
			this.facturasproveedoresBean=new FacturasProveedores();//this.facturasproveedoresConstantesFunciones); 			
			this.facturasproveedoresReturnGeneral=new FacturasProveedoresParameterReturnGeneral(); 
		
			FacturasProveedoresBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturas Proveedores Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.facturasproveedores=new FacturasProveedores();
			this.facturasproveedoress = new ArrayList<FacturasProveedores>();
			this.facturasproveedoressAux = new ArrayList<FacturasProveedores>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic=new FacturasProveedoresLogic();
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.facturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.facturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFacturasProveedores);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFacturasProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturasProveedores);	
					}
					
					if(this.jInternalFrameImportacionFacturasProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturasProveedores);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFacturasProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFacturasProveedores);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturasProveedores);
				this.jInternalFrameDetalleFormFacturasProveedores.setVisible(false);
				this.jInternalFrameDetalleFormFacturasProveedores.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturasProveedores);
					this.jInternalFrameReporteDinamicoFacturasProveedores.setVisible(false);
					this.jInternalFrameReporteDinamicoFacturasProveedores.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFacturasProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFacturasProveedores);
					this.jInternalFrameImportacionFacturasProveedores.setVisible(false);
					this.jInternalFrameImportacionFacturasProveedores.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFacturasProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFacturasProveedores);
					this.jInternalFrameOrderByFacturasProveedores.setVisible(false);
					this.jInternalFrameOrderByFacturasProveedores.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFacturasProveedoresActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FacturasProveedoresConstantesFunciones.INUMEROPAGINACION;
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
			
			this.facturasproveedoresReturnGeneral=new FacturasProveedoresParameterReturnGeneral();
			
			this.facturasproveedoresParameterGeneral=new FacturasProveedoresParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.facturasproveedoresLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturasProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),this.facturasproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturasProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),this.facturasproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFacturasProveedores=false;
			this.isVisibilidadCeldaDuplicarFacturasProveedores=true;
			this.isVisibilidadCeldaCopiarFacturasProveedores=true;
			this.isVisibilidadCeldaVerFormFacturasProveedores=true;
			this.isVisibilidadCeldaOrdenFacturasProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
			this.isVisibilidadCeldaModificarFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=false;
			
			
			this.isVisibilidadBusquedaFacturasProveedores=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFacturasProveedores();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFacturasProveedores(false);
			
			this.setPermisosUsuarioFacturasProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado() 
				|| (this.facturasproveedoresSessionBean.getEsGuardarRelacionado() && this.facturasproveedoresSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFacturasProveedoresClasesRelacionadas();
			}
			
			if(this.facturasproveedoresSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFacturasProveedoresClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFacturasProveedores();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFacturasProveedores();
			}
			
			if(!this.isPermisoBusquedaFacturasProveedores) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFacturasProveedores.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FacturasProveedoresConstantesFunciones.getTiposSeleccionarFacturasProveedores());
				
				this.tiposColumnasSelect=FacturasProveedoresConstantesFunciones.getTiposSeleccionarFacturasProveedores(true);
				
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
			//if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFacturasProveedores();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioFacturasProveedores(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioFacturasProveedores(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasProveedores() ;
			
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
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				facturasproveedoresImplementable= (FacturasProveedoresImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturasProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				facturasproveedoresImplementableHome= (FacturasProveedoresImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturasProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.facturasproveedoress= new ArrayList<FacturasProveedores>();
			this.facturasproveedoressEliminados= new ArrayList<FacturasProveedores>();
						
			this.isEsNuevoFacturasProveedores=false;
			this.esParaAccionDesdeFormularioFacturasProveedores=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFacturasProveedores(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFacturasProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FacturasProveedoresBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FacturasProveedoresConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFacturasProveedores(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFacturasProveedores();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFacturasProveedores();
			}
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFacturasProveedores.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFacturasProveedores.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFacturasProveedores.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFacturasProveedores(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FacturasProveedores: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFacturasProveedores() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFacturasProveedores")) {
				iIndex=this.jInternalFrameDetalleFormFacturasProveedores.jTabbedPaneRelacionesFacturasProveedores.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFacturasProveedores.jTabbedPaneRelacionesFacturasProveedores.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFacturasProveedores();	
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
	
	public void cargarCombosForeignKeyFacturasProveedores(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFacturasProveedores(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFacturasProveedores(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFacturasProveedoresListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFacturasProveedores();
		
		this.cargarCombosFrameForeignKeyFacturasProveedores();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFacturasProveedores();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFacturasProveedores();
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
	
	public void jButtonNuevoFacturasProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.facturasproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
			
			if(jTableDatosFacturasProveedores.getRowCount()>=1) {
				jTableDatosFacturasProveedores.removeRowSelectionInterval(0, jTableDatosFacturasProveedores.getRowCount()-1);						
			}
			
			this.isEsNuevoFacturasProveedores=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFacturasProveedores(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFacturasProveedores(true);			
			//this.facturasproveedores=new FacturasProveedores();
			//this.facturasproveedores.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasProveedores(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasProveedores() ;
			
			if(FacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasProveedores(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.facturasproveedores);	
			this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);				
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
			if(this.facturasproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FacturasProveedores: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFacturasProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFacturasProveedores.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFacturasProveedores.getSelectedRows().length;			
			}
			
			facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFacturasProveedores--;			
				//FacturasProveedores facturasproveedoresAux= new FacturasProveedores();			
				//facturasproveedoresAux.setId(this.iIdNuevoFacturasProveedores);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FacturasProveedores facturasproveedoresOrigen=new FacturasProveedores();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FacturasProveedores facturasproveedoresOrigen : facturasproveedoressSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							facturasproveedoresOrigen =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturasproveedoresOrigen =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFacturasProveedores();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.facturasproveedores.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFacturasProveedores(facturasproveedoresOrigen,this.facturasproveedores,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturasproveedoresLogic.getFacturasProveedoress().add(this.facturasproveedoresAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturasproveedoress.add(this.facturasproveedoresAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFacturasProveedores(false);
				
				this.jTableDatosFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoFacturasProveedores(), this.getIndiceNuevoFacturasProveedores());
				
				int iLastRow =  this.jTableDatosFacturasProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturasProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturasProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasProveedores(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();									
		
			FacturasProveedores facturasproveedoresOrigen=new FacturasProveedores();
			FacturasProveedores facturasproveedoresDestino=new FacturasProveedores();
				
			facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFacturasProveedores.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || facturasproveedoressSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFacturasProveedores.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasproveedoresOrigen =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturasproveedoresOrigen =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturasproveedoresDestino =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturasproveedoresDestino =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				facturasproveedoresOrigen =facturasproveedoressSeleccionados.get(0);
				facturasproveedoresDestino =facturasproveedoressSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFacturasProveedores(facturasproveedoresOrigen,facturasproveedoresDestino,true,false);
				
				facturasproveedoresDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturasproveedoresDestino,facturasproveedoresLogic.getFacturasProveedoress());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturasproveedoresDestino,facturasproveedoress);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFacturasProveedores(false);
				
				//this.jTableDatosFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoFacturasProveedores(), this.getIndiceNuevoFacturasProveedores());
				
				int iLastRow =  this.jTableDatosFacturasProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturasProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturasProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasProveedores(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFacturasProveedores.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFacturasProveedores.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFacturasProveedores.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFacturasProveedores.setVisible(!isVisible);
			this.jPanelPaginacionFacturasProveedores.setVisible(!isVisible);
			this.jPanelAccionesFacturasProveedores.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFacturasProveedores();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFacturasProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFacturasProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFacturasProveedores();
			
			this.abrirFrameOrderByFacturasProveedores();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFacturasProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFacturasProveedores(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturasProveedores);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFacturasProveedores.isMaximum()) {
					this.jInternalFrameDetalleFormFacturasProveedores.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFacturasProveedores.setSize(this.jInternalFrameDetalleFormFacturasProveedores.iWidthFormulario,this.jInternalFrameDetalleFormFacturasProveedores.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFacturasProveedores.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFacturasProveedores.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFacturasProveedores.isMaximum()) {
						this.jInternalFrameDetalleFormFacturasProveedores.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFacturasProveedores.jContentPaneDetalleFacturasProveedores.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFacturasProveedores.jTabbedPaneRelacionesFacturasProveedores.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFacturasProveedores.jContentPaneDetalleFacturasProveedores.getWidth(),FacturasProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturasProveedores.jTabbedPaneRelacionesFacturasProveedores.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFacturasProveedores.jContentPaneDetalleFacturasProveedores.getWidth(),FacturasProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturasProveedores.jTabbedPaneRelacionesFacturasProveedores.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFacturasProveedores.jContentPaneDetalleFacturasProveedores.getWidth(),FacturasProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFacturasProveedores.setVisible(true);
	        this.jInternalFrameDetalleFormFacturasProveedores.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFacturasProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFacturasProveedores==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasProveedores,false,this);
				} else {
					this.jInternalFrameOrderByFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturasProveedores,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFacturasProveedores);
				this.jInternalFrameOrderByFacturasProveedores.setVisible(false);
				this.jInternalFrameOrderByFacturasProveedores.setSelected(false);
				
				this.jInternalFrameOrderByFacturasProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturasProveedores"));
				
				this.inicializarActualizarBindingTablaOrderByFacturasProveedores();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFacturasProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFacturasProveedores==null) {
				
				this.jInternalFrameImportacionFacturasProveedores=new ImportacionJInternalFrame(FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturasProveedores);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFacturasProveedores);
				this.jInternalFrameImportacionFacturasProveedores.setVisible(false);
				this.jInternalFrameImportacionFacturasProveedores.setSelected(false);


				this.jInternalFrameImportacionFacturasProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturasProveedores"));
				this.jInternalFrameImportacionFacturasProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturasProveedores"));
				this.jInternalFrameImportacionFacturasProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturasProveedores"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFacturasProveedores() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFacturasProveedores==null) {
				this.jInternalFrameReporteDinamicoFacturasProveedores=new ReporteDinamicoJInternalFrame(FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturasProveedores);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturasProveedores);
				this.jInternalFrameReporteDinamicoFacturasProveedores.setVisible(false);
				this.jInternalFrameReporteDinamicoFacturasProveedores.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFacturasProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasProveedores"));
				this.jInternalFrameReporteDinamicoFacturasProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasProveedores"));
				this.jInternalFrameReporteDinamicoFacturasProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasProveedores"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasProveedores();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFacturasProveedores() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturasProveedores);
			
	       	this.jInternalFrameDetalleFormFacturasProveedores.setVisible(false);
	        this.jInternalFrameDetalleFormFacturasProveedores.setSelected(false);
			
			//this.jInternalFrameDetalleFormFacturasProveedores.dispose();
			//this.jInternalFrameDetalleFormFacturasProveedores=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFacturasProveedores() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFacturasProveedores.setVisible(true);
	        this.jInternalFrameReporteDinamicoFacturasProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFacturasProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFacturasProveedores.setVisible(true);
	        this.jInternalFrameImportacionFacturasProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFacturasProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFacturasProveedores.setVisible(true);
	        this.jInternalFrameOrderByFacturasProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFacturasProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFacturasProveedores.setVisible(false);
	        this.jInternalFrameOrderByFacturasProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFacturasProveedores() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFacturasProveedores.setVisible(false);
	        this.jInternalFrameReporteDinamicoFacturasProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFacturasProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFacturasProveedores.setVisible(false);
	        this.jInternalFrameImportacionFacturasProveedores.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFacturasProveedores(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFacturasProveedores(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFacturasProveedores(true);
			//this.isEsNuevoFacturasProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFacturasProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasProveedores(false) ;
			
			if(facturasproveedoresSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasProveedores(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFacturasProveedoresActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFacturasProveedores(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFacturasProveedores(true);
			//this.isEsNuevoFacturasProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.facturasproveedores.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFacturasProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFacturasProveedores(false) ;
			
			if(FacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturasProveedores(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturasProveedores.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFacturasProveedores(false);
			
			//if(!this.isEsNuevoFacturasProveedores) {								
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				
			}
			
			if(this.permiteMantenimiento(this.facturasproveedores)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFacturasProveedores=true;
					this.inicializarActualizarBindingTablaFacturasProveedores(false);
					this.isEsNuevoFacturasProveedores=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFacturasProveedores=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFacturasProveedores=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturasProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasProveedores(false);
				
				this.habilitarDeshabilitarControlesFacturasProveedores(false);
			
												
				
				if(FacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFacturasProveedores();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFacturasProveedoresActionPerformed(evt,facturasproveedoresSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFacturasProveedores(this.facturasproveedores,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFacturasProveedores.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,facturasproveedoresSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.facturasproveedores.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				this.facturasproveedores.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				this.facturasproveedores.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.facturasproveedores)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FacturasProveedoresModel) this.jTableDatosFacturasProveedores.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFacturasProveedores=true;
				this.inicializarActualizarBindingTablaFacturasProveedores(false);
				this.isEsNuevoFacturasProveedores=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturasProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasProveedores(false);
				
				this.habilitarDeshabilitarControlesFacturasProveedores(false);
				
				
				
				if(FacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFacturasProveedores();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFacturasProveedores.getRowCount()>=1) {
				jTableDatosFacturasProveedores.removeRowSelectionInterval(0, jTableDatosFacturasProveedores.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFacturasProveedores(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFacturasProveedores(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturasProveedores(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturasProveedores(false) ;
			
			this.isEsNuevoFacturasProveedores=false;
			
			if(FacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFacturasProveedores();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFacturasProveedores(false);
				
				//SI ES MANUAL
				if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFacturasProveedores();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFacturasProveedores--;			
			//FacturasProveedores facturasproveedoresAux= new FacturasProveedores();			
			//facturasproveedoresAux.setId(this.iIdNuevoFacturasProveedores);
			
			if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFacturasProveedores();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
			
			this.facturasproveedores.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.facturasproveedoresLogic.getFacturasProveedoress().add(this.facturasproveedoresAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.facturasproveedoress.add(this.facturasproveedoresAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFacturasProveedores(false);
			
			this.jTableDatosFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoFacturasProveedores(), this.getIndiceNuevoFacturasProveedores());
			
			int iLastRow =  this.jTableDatosFacturasProveedores.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFacturasProveedores.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFacturasProveedores.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFacturasProveedores(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFacturasProveedores(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasProveedores(false);
			
			//SI ES MANUAL
			if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasProveedores();
			}
			
			//this.abrirFrameTreeFacturasProveedores();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFacturasProveedores.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFacturasProveedores.setFileImportacion(this.jInternalFrameImportacionFacturasProveedores.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFacturasProveedores.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFacturasProveedores.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFacturasProveedores.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFacturasProveedores.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();		

		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FacturasProveedoresBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FacturasProveedoresBaseDesign.jrxml";
			
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
			
			this.generarReporteFacturasProveedoress("Todos",facturasproveedoressSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasProveedoresConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFacturasProveedores.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoria="codigo_cliente";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoriaValor="codigo_cliente";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cliente");
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
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
	
	public void jButtonGenerarExcelReporteDinamicoFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();		
		
		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasproveedores";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FacturasProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getfecha_emision_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getfecha_emision_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getcodigo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturasProveedoresConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(FacturasProveedores facturasproveedores:facturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturasproveedores.getfecha());
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
			//	this.getFilaCabeceraExportarExcelFacturasProveedores(row);				
			//	iRow++;
			//}				
			
			//for(FacturasProveedores facturasproveedoresAux:facturasproveedoressSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFacturasProveedores(facturasproveedoresAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
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
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasProveedores(false);
			
			//SI ES MANUAL
			if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturasProveedores();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasProveedores(false);
			
			//SI ES MANUAL
			if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturasProveedores();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturasProveedores(false);
			
			//SI ES MANUAL
			if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturasProveedores();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFacturasProveedores() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFacturasProveedores.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFacturasProveedores.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFacturasProveedores.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFacturasProveedores.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFacturasProveedores.setMinimumSize(dimensionMinimum);
		this.jTableDatosFacturasProveedores.setMaximumSize(dimensionMaximum);
		this.jTableDatosFacturasProveedores.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFacturasProveedores(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFacturasProveedores(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFacturasProveedores(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFacturasProveedores(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFacturasProveedores(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFacturasProveedores(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasProveedores(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFacturasProveedores(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFacturasProveedores() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFacturasProveedores();
		
		this.inicializarActualizarBindingBotonesManualFacturasProveedores(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFacturasProveedores();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturasProveedores() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasProveedores(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasProveedores(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFacturasProveedores.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFacturasProveedores.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFacturasProveedores.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFacturasProveedores.jCheckBoxPostAccionNuevoFacturasProveedores.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFacturasProveedores.jCheckBoxPostAccionSinCerrarFacturasProveedores.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFacturasProveedores.jCheckBoxPostAccionSinMensajeFacturasProveedores.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFacturasProveedores.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFacturasProveedores.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFacturasProveedores.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
				this.jInternalFrameDetalleFormFacturasProveedores.jCheckBoxPostAccionNuevoFacturasProveedores.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFacturasProveedores.jCheckBoxPostAccionSinCerrarFacturasProveedores.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFacturasProveedores.jCheckBoxPostAccionSinMensajeFacturasProveedores.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFacturasProveedores.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFacturasProveedores.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFacturasProveedores.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFacturasProveedores!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFacturasProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFacturasProveedores.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFacturasProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFacturasProveedores.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFacturasProveedores!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFacturasProveedores.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFacturasProveedores.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFacturasProveedores(Boolean esInicializar) throws Exception {
		try	{	
			if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFacturasProveedores(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFacturasProveedores() throws Exception {
		try	{
			if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturasProveedores();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturasProveedores() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturasProveedores() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFacturasProveedores.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFacturasProveedores.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFacturasProveedores.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFacturasProveedores.addItem(reporte);
			}
			
			
			if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFacturasProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFacturasProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFacturasProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFacturasProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFacturasProveedores.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFacturasProveedores.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasProveedores();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturasProveedores() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturasProveedores!=null) {
				this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturasProveedores!=null) {
				this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFacturasProveedores!=null) {
				
				if(this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFacturasProveedores.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FacturasProveedoresConstantesFunciones.getTiposSeleccionarFacturasProveedores(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FacturasProveedoresConstantesFunciones.getTiposSeleccionarFacturasProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FacturasProveedoresConstantesFunciones.getTiposSeleccionarFacturasProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFacturasProveedores()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.getSelectedItem()!=null){this.id_clienteBusquedaFacturasProveedores=((Cliente)this.jComboBoxid_clienteBusquedaFacturasProveedoresFacturasProveedores.getSelectedItem()).getId();}
		this.fecha_emision_inicioBusquedaFacturasProveedores=new Date(this.jDateChooserfecha_emision_inicioBusquedaFacturasProveedoresFacturasProveedores.getDate().getTime());
		this.fecha_emision_finBusquedaFacturasProveedores=new Date(this.jDateChooserfecha_emision_finBusquedaFacturasProveedoresFacturasProveedores.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFacturasProveedores(Boolean esInicializar) throws Exception {				
		if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFacturasProveedores();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFacturasProveedores() throws Exception {
		this.inicializarActualizarBindingTablaFacturasProveedores(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFacturasProveedores() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFacturasProveedoresOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedoresOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFacturasProveedores(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=facturasproveedoresLogic.getFacturasProveedoress().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=facturasproveedoress.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFacturasProveedores.setModel(new FacturasProveedoresModel(this.facturasproveedoresLogic.getFacturasProveedoress(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFacturasProveedores.setModel(new FacturasProveedoresModel(this.facturasproveedoress,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFacturasProveedores!=null && this.jInternalFrameOrderByFacturasProveedores.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFacturasProveedores();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,facturasproveedoresConstantesFunciones.resaltarSeleccionarFacturasProveedores,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,facturasproveedoresConstantesFunciones.resaltarSeleccionarFacturasProveedores,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,FacturasProveedoresConstantesFunciones.LABEL_ID));

		if(this.facturasproveedoresConstantesFunciones.mostraridFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasProveedoresConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasproveedoresConstantesFunciones.resaltaridFacturasProveedores,this.facturasproveedoresConstantesFunciones.activaridFacturasProveedores,iSizeTabla,this,true,"idFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasproveedoresConstantesFunciones.resaltaridFacturasProveedores,this.facturasproveedoresConstantesFunciones.activaridFacturasProveedores,this,true,"idFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE));

		if(this.facturasproveedoresConstantesFunciones.mostrarcodigo_clienteFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasproveedoresConstantesFunciones.resaltarcodigo_clienteFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarcodigo_clienteFacturasProveedores,iSizeTabla,this,true,"codigo_clienteFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasproveedoresConstantesFunciones.resaltarcodigo_clienteFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarcodigo_clienteFacturasProveedores,this,true,"codigo_clienteFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.facturasproveedoresConstantesFunciones.mostrarnombre_clienteFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasproveedoresConstantesFunciones.resaltarnombre_clienteFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarnombre_clienteFacturasProveedores,iSizeTabla,this,true,"nombre_clienteFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasproveedoresConstantesFunciones.resaltarnombre_clienteFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarnombre_clienteFacturasProveedores,this,true,"nombre_clienteFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.facturasproveedoresConstantesFunciones.mostrarnumero_facturaFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasproveedoresConstantesFunciones.resaltarnumero_facturaFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarnumero_facturaFacturasProveedores,iSizeTabla,this,true,"numero_facturaFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasproveedoresConstantesFunciones.resaltarnumero_facturaFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarnumero_facturaFacturasProveedores,this,true,"numero_facturaFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION));

		if(this.facturasproveedoresConstantesFunciones.mostrarfecha_emisionFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturasproveedoresConstantesFunciones.resaltarfecha_emisionFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarfecha_emisionFacturasProveedores,iSizeTabla,this,true,"fecha_emisionFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturasproveedoresConstantesFunciones.resaltarfecha_emisionFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarfecha_emisionFacturasProveedores,this,true,"fecha_emisionFacturasProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,FacturasProveedoresConstantesFunciones.LABEL_TOTAL));

		if(this.facturasproveedoresConstantesFunciones.mostrartotalFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasProveedoresConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturasproveedoresConstantesFunciones.resaltartotalFacturasProveedores,this.facturasproveedoresConstantesFunciones.activartotalFacturasProveedores,iSizeTabla,this,true,"totalFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasproveedoresConstantesFunciones.resaltartotalFacturasProveedores,this.facturasproveedoresConstantesFunciones.activartotalFacturasProveedores,this,true,"totalFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.facturasproveedoresConstantesFunciones.mostrarnumero_pre_impresoFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturasproveedoresConstantesFunciones.resaltarnumero_pre_impresoFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarnumero_pre_impresoFacturasProveedores,iSizeTabla,this,true,"numero_pre_impresoFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturasproveedoresConstantesFunciones.resaltarnumero_pre_impresoFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarnumero_pre_impresoFacturasProveedores,this,true,"numero_pre_impresoFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,FacturasProveedoresConstantesFunciones.LABEL_FECHA));

		if(this.facturasproveedoresConstantesFunciones.mostrarfechaFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturasProveedoresConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturasproveedoresConstantesFunciones.resaltarfechaFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarfechaFacturasProveedores,iSizeTabla,this,true,"fechaFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturasproveedoresConstantesFunciones.resaltarfechaFacturasProveedores,this.facturasproveedoresConstantesFunciones.activarfechaFacturasProveedores,this,true,"fechaFacturasProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturasProveedores.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturasProveedores.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFacturasProveedores.addColumn(tableColumn);
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
			
			this.jTableDatosFacturasProveedores.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFacturasProveedores.moveColumn(this.jTableDatosFacturasProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFacturasProveedores.moveColumn(this.jTableDatosFacturasProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFacturasProveedores.moveColumn(this.jTableDatosFacturasProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFacturasProveedores.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFacturasProveedores.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFacturasProveedores,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFacturasProveedores.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFacturasProveedores.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFacturasProveedores.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFacturasProveedores.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFacturasProveedores.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=facturasproveedoresLogic.getFacturasProveedoress().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=facturasproveedoress.size()-1;
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
		//this.jTableDatosFacturasProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFacturasProveedores();
			
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
				
				//this.isEsNuevoFacturasProveedores=false;
					
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
				if(this.facturasproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFacturasProveedores==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturasProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturasProveedores.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.facturasproveedores.getsType().equals("DUPLICADO")
				   || this.facturasproveedores.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFacturasProveedores=true;
				
				} else {
					this.isEsNuevoFacturasProveedores=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					if(this.facturasproveedores.getId()>=0 && !this.facturasproveedores.getIsNew()) {						
						this.isEsNuevoFacturasProveedores=false;
						
					} else {
						this.isEsNuevoFacturasProveedores=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFacturasProveedores(esRelaciones);						
				
				this.seleccionarFacturasProveedores(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.facturasproveedores.getId()<0) {
					this.isEsNuevoFacturasProveedores=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFacturasProveedores(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFacturasProveedores(evt,rowIndex);
				}	
				
				if(this.facturasproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FacturasProveedores: " + this.dDif); 
					}
				}								
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFacturasProveedores(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.facturasproveedores)) {
					if(this.facturasproveedores.getId()>0) {
						this.facturasproveedores.setIsDeleted(true);
						
						this.facturasproveedoressEliminados.add(this.facturasproveedores);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturasproveedoresLogic.getFacturasProveedoress().remove(this.facturasproveedores);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturasproveedoress.remove(this.facturasproveedores);				
					}
					
					
					((FacturasProveedoresModel) this.jTableDatosFacturasProveedores.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturasProveedores(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFacturasProveedores(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFacturasProveedores) {
			
			if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturasProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturasProveedores.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFacturasProveedores(this.facturasproveedores);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFacturasProveedores("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFacturasProveedores(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturasProveedores() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturasProveedores(FacturasProveedores facturasproveedores) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFacturasProveedores(facturasproveedores,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturasProveedores(FacturasProveedores facturasproveedores,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFacturasProveedores(facturasproveedores);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFacturasProveedores(facturasproveedores,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFacturasProveedores(facturasproveedores);
	}
	
	public void setVariablesObjetoActualToFormularioFacturasProveedores(FacturasProveedores facturasproveedores) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.setText(facturasproveedores.getId().toString());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldcodigo_clienteFacturasProveedores.setText(facturasproveedores.getcodigo_cliente());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextAreanombre_clienteFacturasProveedores.setText(facturasproveedores.getnombre_cliente());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_facturaFacturasProveedores.setText(facturasproveedores.getnumero_factura());
			this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emisionFacturasProveedores.setDate(facturasproveedores.getfecha_emision());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldtotalFacturasProveedores.setText(facturasproveedores.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_pre_impresoFacturasProveedores.setText(facturasproveedores.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfechaFacturasProveedores.setDate(facturasproveedores.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FacturasProveedores facturasproveedoresLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,facturasproveedoresLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FacturasProveedores facturasproveedoresLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				facturasproveedoresLocal=this.facturasproveedores;
			} else {
				facturasproveedoresLocal=this.facturasproveedoresAnterior;
			}
		}
		
		if(this.permiteMantenimiento(facturasproveedoresLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFacturasProveedores(facturasproveedoresLocal,true);
					
					if(facturasproveedoresSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(facturasproveedoresLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(facturasproveedoresLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFacturasProveedores(FacturasProveedores facturasproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturasProveedores(facturasproveedores,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(facturasproveedores);
	}
	
	public void setVariablesFormularioToObjetoActualFacturasProveedores(FacturasProveedores facturasproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturasProveedores(facturasproveedores,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFacturasProveedores(FacturasProveedores facturasproveedores,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.getText()==null || this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.getText()=="" || this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.getText()=="Id") {
				this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.setText("0");
			}

			if(conColumnasBase) {facturasproveedores.setId(Long.parseLong(this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasProveedoresConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelIdFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasproveedores.setcodigo_cliente(this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldcodigo_clienteFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelcodigo_clienteFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasproveedores.setnombre_cliente(this.jInternalFrameDetalleFormFacturasProveedores.jTextAreanombre_clienteFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelnombre_clienteFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasproveedores.setnumero_factura(this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_facturaFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelnumero_facturaFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasproveedores.setfecha_emision(this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emisionFacturasProveedores.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelfecha_emisionFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasproveedores.settotal(Double.parseDouble(this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldtotalFacturasProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasProveedoresConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabeltotalFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasproveedores.setnumero_pre_impreso(this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_pre_impresoFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelnumero_pre_impresoFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturasproveedores.setfecha(this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfechaFacturasProveedores.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturasProveedoresConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturasProveedores.jLabelfechaFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturasProveedores(FacturasProveedores facturasproveedoresBean,FacturasProveedores facturasproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFacturasProveedores(FacturasProveedores facturasproveedoresOrigen,FacturasProveedores facturasproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturasproveedoresOrigen.getId()!=null && !facturasproveedoresOrigen.getId().equals(0L))) {facturasproveedores.setId(facturasproveedoresOrigen.getId());}}
			if(conDefault || (!conDefault && facturasproveedoresOrigen.getfecha_emision_inicio()!=null && !facturasproveedoresOrigen.getfecha_emision_inicio().equals(new Date()))) {facturasproveedores.setfecha_emision_inicio(facturasproveedoresOrigen.getfecha_emision_inicio());}
			if(conDefault || (!conDefault && facturasproveedoresOrigen.getfecha_emision_fin()!=null && !facturasproveedoresOrigen.getfecha_emision_fin().equals(new Date()))) {facturasproveedores.setfecha_emision_fin(facturasproveedoresOrigen.getfecha_emision_fin());}
			if(conDefault || (!conDefault && facturasproveedoresOrigen.getcodigo_cliente()!=null && !facturasproveedoresOrigen.getcodigo_cliente().equals(""))) {facturasproveedores.setcodigo_cliente(facturasproveedoresOrigen.getcodigo_cliente());}
			if(conDefault || (!conDefault && facturasproveedoresOrigen.getnombre_cliente()!=null && !facturasproveedoresOrigen.getnombre_cliente().equals(""))) {facturasproveedores.setnombre_cliente(facturasproveedoresOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && facturasproveedoresOrigen.getnumero_factura()!=null && !facturasproveedoresOrigen.getnumero_factura().equals(""))) {facturasproveedores.setnumero_factura(facturasproveedoresOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && facturasproveedoresOrigen.getfecha_emision()!=null && !facturasproveedoresOrigen.getfecha_emision().equals(new Date()))) {facturasproveedores.setfecha_emision(facturasproveedoresOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && facturasproveedoresOrigen.gettotal()!=null && !facturasproveedoresOrigen.gettotal().equals(0.0))) {facturasproveedores.settotal(facturasproveedoresOrigen.gettotal());}
			if(conDefault || (!conDefault && facturasproveedoresOrigen.getnumero_pre_impreso()!=null && !facturasproveedoresOrigen.getnumero_pre_impreso().equals(""))) {facturasproveedores.setnumero_pre_impreso(facturasproveedoresOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && facturasproveedoresOrigen.getfecha()!=null && !facturasproveedoresOrigen.getfecha().equals(new Date()))) {facturasproveedores.setfecha(facturasproveedoresOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturasProveedores(FacturasProveedores facturasproveedores) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.setText(facturasproveedores.getId().toString());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldcodigo_clienteFacturasProveedores.setText(facturasproveedores.getcodigo_cliente());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextAreanombre_clienteFacturasProveedores.setText(facturasproveedores.getnombre_cliente());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_facturaFacturasProveedores.setText(facturasproveedores.getnumero_factura());
			this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emisionFacturasProveedores.setDate(facturasproveedores.getfecha_emision());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldtotalFacturasProveedores.setText(facturasproveedores.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_pre_impresoFacturasProveedores.setText(facturasproveedores.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfechaFacturasProveedores.setDate(facturasproveedores.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturasProveedores(FacturasProveedoresBean facturasproveedoresBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.setText(facturasproveedoresBean.getId().toString());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldcodigo_clienteFacturasProveedores.setText(facturasproveedoresBean.getcodigo_cliente());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextAreanombre_clienteFacturasProveedores.setText(facturasproveedoresBean.getnombre_cliente());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_facturaFacturasProveedores.setText(facturasproveedoresBean.getnumero_factura());
			this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emisionFacturasProveedores.setDate(facturasproveedoresBean.getfecha_emision());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldtotalFacturasProveedores.setText(facturasproveedoresBean.gettotal().toString());
			this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_pre_impresoFacturasProveedores.setText(facturasproveedoresBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfechaFacturasProveedores.setDate(facturasproveedoresBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFacturasProveedores(FacturasProveedoresParameterReturnGeneral facturasproveedoresReturnGeneral,FacturasProveedoresBean facturasproveedoresBean,Boolean conDefault) throws Exception { 
		try {
			FacturasProveedores facturasproveedoresLocal=new FacturasProveedores();
			
			facturasproveedoresLocal=facturasproveedoresReturnGeneral.getFacturasProveedores();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturasproveedoresLocal.getId()!=null && !facturasproveedoresLocal.getId().equals(0L))) {facturasproveedoresBean.setId(facturasproveedoresLocal.getId());}}
			if(conDefault || (!conDefault && facturasproveedoresLocal.getcodigo_cliente()!=null && !facturasproveedoresLocal.getcodigo_cliente().equals(""))) {facturasproveedoresBean.setcodigo_cliente(facturasproveedoresLocal.getcodigo_cliente());}
			if(conDefault || (!conDefault && facturasproveedoresLocal.getnombre_cliente()!=null && !facturasproveedoresLocal.getnombre_cliente().equals(""))) {facturasproveedoresBean.setnombre_cliente(facturasproveedoresLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && facturasproveedoresLocal.getnumero_factura()!=null && !facturasproveedoresLocal.getnumero_factura().equals(""))) {facturasproveedoresBean.setnumero_factura(facturasproveedoresLocal.getnumero_factura());}
			if(conDefault || (!conDefault && facturasproveedoresLocal.getfecha_emision()!=null && !facturasproveedoresLocal.getfecha_emision().equals(new Date()))) {facturasproveedoresBean.setfecha_emision(facturasproveedoresLocal.getfecha_emision());}
			if(conDefault || (!conDefault && facturasproveedoresLocal.gettotal()!=null && !facturasproveedoresLocal.gettotal().equals(0.0))) {facturasproveedoresBean.settotal(facturasproveedoresLocal.gettotal());}
			if(conDefault || (!conDefault && facturasproveedoresLocal.getnumero_pre_impreso()!=null && !facturasproveedoresLocal.getnumero_pre_impreso().equals(""))) {facturasproveedoresBean.setnumero_pre_impreso(facturasproveedoresLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && facturasproveedoresLocal.getfecha()!=null && !facturasproveedoresLocal.getfecha().equals(new Date()))) {facturasproveedoresBean.setfecha(facturasproveedoresLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFacturasProveedoresGenerico(Long idFacturasProveedoresSeleccionado,JComboBox jComboBoxFacturasProveedores,List<FacturasProveedores> facturasproveedoressLocal)throws Exception {
		try {
			FacturasProveedores  facturasproveedoresTemp=null;

			for(FacturasProveedores facturasproveedoresAux:facturasproveedoressLocal) {
				if(facturasproveedoresAux.getId()!=null && facturasproveedoresAux.getId().equals(idFacturasProveedoresSeleccionado)) {
					facturasproveedoresTemp=facturasproveedoresAux;
					break;
				}
			}

			jComboBoxFacturasProveedores.setSelectedItem(facturasproveedoresTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFacturasProveedoresGenerico(JComboBox jComboBoxFacturasProveedores,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturasProveedores.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFacturasProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturasProveedores.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFacturasProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturasproveedores=(FacturasProveedores) facturasproveedoresLogic.getFacturasProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturasproveedores =(FacturasProveedores) facturasproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!facturasproveedores.getIsNew() && !facturasproveedores.getIsChanged() && !facturasproveedores.getIsDeleted()) {
				sDescripcion=facturasproveedores.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=facturasproveedores.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!facturasproveedores.getIsNew() && !facturasproveedores.getIsChanged() && !facturasproveedores.getIsDeleted()) {
				sDescripcion=facturasproveedores.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=facturasproveedores.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FacturasProveedores facturasproveedoresRow=new FacturasProveedores();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturasproveedoresRow=(FacturasProveedores) facturasproveedoresLogic.getFacturasProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturasproveedoresRow=(FacturasProveedores) facturasproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFacturasProveedores(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoFacturasProveedores && this.isPermisoNuevoFacturasProveedores));			
			this.jButtonDuplicarFacturasProveedores.setVisible((this.isVisibilidadCeldaDuplicarFacturasProveedores && this.isPermisoDuplicarFacturasProveedores));			
			this.jButtonCopiarFacturasProveedores.setVisible((this.isVisibilidadCeldaCopiarFacturasProveedores && this.isPermisoCopiarFacturasProveedores));
			this.jButtonVerFormFacturasProveedores.setVisible((this.isVisibilidadCeldaVerFormFacturasProveedores && this.isPermisoVerFormFacturasProveedores));
			
			this.jButtonAbrirOrderByFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenFacturasProveedores && this.isPermisoOrdenFacturasProveedores));			
			
			this.jButtonNuevoRelacionesFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores && this.isPermisoNuevoFacturasProveedores));			
			this.jButtonNuevoGuardarCambiosFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoFacturasProveedores && this.isPermisoNuevoFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));
			
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonModificarFacturasProveedores.setVisible((this.isVisibilidadCeldaModificarFacturasProveedores && this.isPermisoActualizarFacturasProveedores));	
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarFacturasProveedores.setVisible((this.isVisibilidadCeldaActualizarFacturasProveedores && this.isPermisoActualizarFacturasProveedores));	
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarFacturasProveedores.setVisible((this.isVisibilidadCeldaEliminarFacturasProveedores && this.isPermisoEliminarFacturasProveedores));
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarFacturasProveedores);							
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));			
			
			}
						
			this.jButtonGuardarCambiosTablaFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoFacturasProveedores && this.isPermisoNuevoFacturasProveedores));						
			this.jButtonDuplicarToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaDuplicarFacturasProveedores && this.isPermisoDuplicarFacturasProveedores));						
			this.jButtonCopiarToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaCopiarFacturasProveedores && this.isPermisoCopiarFacturasProveedores));			
			this.jButtonVerFormToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaVerFormFacturasProveedores && this.isPermisoVerFormFacturasProveedores));			
			this.jButtonAbrirOrderByToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenFacturasProveedores && this.isPermisoOrdenFacturasProveedores));
			this.jButtonNuevoRelacionesToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores && this.isPermisoNuevoFacturasProveedores));			
			this.jButtonNuevoGuardarCambiosToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoFacturasProveedores && this.isPermisoNuevoFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));			
			
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonModificarToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaModificarFacturasProveedores && this.isPermisoActualizarFacturasProveedores));	
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaActualizarFacturasProveedores  && this.isPermisoActualizarFacturasProveedores));	
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaEliminarFacturasProveedores && this.isPermisoEliminarFacturasProveedores));
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarToolBarFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarFacturasProveedores);				
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoFacturasProveedores && this.isPermisoNuevoFacturasProveedores));			
			this.jMenuItemDuplicarFacturasProveedores.setVisible((this.isVisibilidadCeldaDuplicarFacturasProveedores && this.isPermisoDuplicarFacturasProveedores));			
			this.jMenuItemCopiarFacturasProveedores.setVisible((this.isVisibilidadCeldaCopiarFacturasProveedores && this.isPermisoCopiarFacturasProveedores));			
			this.jMenuItemVerFormFacturasProveedores.setVisible((this.isVisibilidadCeldaVerFormFacturasProveedores && this.isPermisoVerFormFacturasProveedores));			
			this.jMenuItemAbrirOrderByFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenFacturasProveedores && this.isPermisoOrdenFacturasProveedores));			
			//this.jMenuItemMostrarOcultarFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenFacturasProveedores && this.isPermisoOrdenFacturasProveedores));
			this.jMenuItemDetalleAbrirOrderByFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenFacturasProveedores && this.isPermisoOrdenFacturasProveedores));			
			//this.jMenuItemDetalleMostrarOcultarFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenFacturasProveedores && this.isPermisoOrdenFacturasProveedores));			
			this.jMenuItemNuevoRelacionesFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores && this.isPermisoNuevoFacturasProveedores));			
			this.jMenuItemNuevoGuardarCambiosFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoFacturasProveedores && this.isPermisoNuevoFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));									
			
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemModificarFacturasProveedores.setVisible((this.isVisibilidadCeldaModificarFacturasProveedores && this.isPermisoActualizarFacturasProveedores));	
			this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemActualizarFacturasProveedores.setVisible((this.isVisibilidadCeldaActualizarFacturasProveedores && this.isPermisoActualizarFacturasProveedores));	
			this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemEliminarFacturasProveedores.setVisible((this.isVisibilidadCeldaEliminarFacturasProveedores && this.isPermisoEliminarFacturasProveedores));
			this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemCancelarFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarFacturasProveedores);				
			}
			
			this.jMenuItemGuardarCambiosFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));						
			this.jMenuItemGuardarCambiosTablaFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFacturasProveedores=this.jButtonNuevoFacturasProveedores.isVisible();
			this.isVisibilidadCeldaDuplicarFacturasProveedores=this.jButtonDuplicarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCopiarFacturasProveedores=this.jButtonCopiarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaVerFormFacturasProveedores=this.jButtonVerFormFacturasProveedores.isVisible();
			
			this.isVisibilidadCeldaOrdenFacturasProveedores=this.jButtonAbrirOrderByFacturasProveedores.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=this.jButtonNuevoRelacionesFacturasProveedores.isVisible();
			this.isVisibilidadCeldaModificarFacturasProveedores=this.jButtonModificarFacturasProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			this.isVisibilidadCeldaActualizarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaEliminarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCancelarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaGuardarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosFacturasProveedores.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=this.jButtonGuardarCambiosTablaFacturasProveedores.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFacturasProveedores=this.jButtonNuevoToolBarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=this.jButtonNuevoRelacionesToolBarFacturasProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			this.isVisibilidadCeldaModificarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jButtonModificarToolBarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaActualizarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarToolBarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaEliminarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarToolBarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCancelarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarToolBarFacturasProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturasProveedores=this.jButtonGuardarCambiosToolBarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=this.jButtonGuardarCambiosTablaToolBarFacturasProveedores.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFacturasProveedores=this.jMenuItemNuevoFacturasProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=this.jMenuItemNuevoRelacionesFacturasProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			this.isVisibilidadCeldaModificarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemModificarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaActualizarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemActualizarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaEliminarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemEliminarFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCancelarFacturasProveedores=this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemCancelarFacturasProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturasProveedores=this.jMenuItemGuardarCambiosFacturasProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=this.jMenuItemGuardarCambiosTablaFacturasProveedores.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFacturasProveedores(Boolean esInicializar) {
		if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {			
			if(this.facturasproveedoresSessionBean.getConGuardarRelaciones()) {
				//if(this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFacturasProveedores();
			}
			
			this.inicializarActualizarBindingBotonesManualFacturasProveedores(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFacturasProveedores() {
		this.jButtonNuevoFacturasProveedores.setVisible(this.isPermisoNuevoFacturasProveedores);			
		this.jButtonDuplicarFacturasProveedores.setVisible(this.isPermisoDuplicarFacturasProveedores);			
		this.jButtonCopiarFacturasProveedores.setVisible(this.isPermisoCopiarFacturasProveedores);			
		this.jButtonVerFormFacturasProveedores.setVisible(this.isPermisoVerFormFacturasProveedores);			
		
		this.jButtonAbrirOrderByFacturasProveedores.setVisible(this.isPermisoOrdenFacturasProveedores);					
		
		this.jButtonNuevoRelacionesFacturasProveedores.setVisible(this.isPermisoNuevoFacturasProveedores);			
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonModificarFacturasProveedores.setVisible(this.isPermisoActualizarFacturasProveedores);	
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarFacturasProveedores.setVisible(this.isPermisoActualizarFacturasProveedores);	
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarFacturasProveedores.setVisible(this.isPermisoEliminarFacturasProveedores);
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarFacturasProveedores);						
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosFacturasProveedores.setVisible(this.isPermisoGuardarCambiosFacturasProveedores);							
		}
		
		this.jButtonGuardarCambiosTablaFacturasProveedores.setVisible(this.isPermisoActualizarFacturasProveedores);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturasProveedores() {
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonModificarFacturasProveedores.setVisible(this.isPermisoActualizarFacturasProveedores);	
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarFacturasProveedores.setVisible(this.isPermisoActualizarFacturasProveedores);	
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarFacturasProveedores.setVisible(this.isPermisoEliminarFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarFacturasProveedores);							
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarFacturasProveedores && this.isPermisoGuardarCambiosFacturasProveedores));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFacturasProveedores() {
		if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFacturasProveedores();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFacturasProveedores() {
	}
	
	public void jTableDatosFacturasProveedoresListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFacturasProveedores(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.facturasproveedores.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFacturasProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFacturasProveedores(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.facturasproveedoresLogic.getConnexion());

				if(this.facturasproveedores.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.facturasproveedores.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasProveedores=(TitledBorder)this.jScrollPanelDatosFacturasProveedores.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFacturasProveedores.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.facturasproveedores.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteFacturasProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebFacturasProveedores(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturasProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturasProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.facturasproveedoresLogic.getConnexion());

				if(this.facturasproveedores.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.facturasproveedores.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturasProveedores=(TitledBorder)this.jScrollPanelDatosFacturasProveedores.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderFacturasProveedores.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.facturasproveedores.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_inicioFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getfecha_emision_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_inicio = '"+Funciones2.getStringPostgresDate(this.facturasproveedores.getfecha_emision_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_finFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getfecha_emision_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_fin = '"+Funciones2.getStringPostgresDate(this.facturasproveedores.getfecha_emision_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_clienteFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getcodigo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cliente like '%"+this.facturasproveedores.getcodigo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.facturasproveedores.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.facturasproveedores.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.facturasproveedores.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.facturasproveedores.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.facturasproveedores.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.getfacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturasproveedores==null) {
						this.facturasproveedores = new FacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);
				}

				if(this.facturasproveedores.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.facturasproveedores.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaFacturasProveedoresFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasProveedores(false,false);

			this.getFacturasProveedoressBusquedaFacturasProveedores();

			this.inicializarActualizarBindingFacturasProveedores(false);

			//if(FacturasProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasProveedores(false,false);

			this.getFacturasProveedoressFK_IdCliente();

			this.inicializarActualizarBindingFacturasProveedores(false);

			//if(FacturasProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturasProveedores(false,false);

			this.getFacturasProveedoressFK_IdEmpresa();

			this.inicializarActualizarBindingFacturasProveedores(false);

			//if(FacturasProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturasProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFacturasProveedores() {
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormFacturasProveedores.setVisible(false);	    			
			this.jInternalFrameDetalleFormFacturasProveedores.dispose();
			this.jInternalFrameDetalleFormFacturasProveedores=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFacturasProveedores!=null) {
			this.jInternalFrameReporteDinamicoFacturasProveedores.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFacturasProveedores.dispose();
			this.jInternalFrameReporteDinamicoFacturasProveedores=null;
		}
		
		if(this.jInternalFrameImportacionFacturasProveedores!=null) {
			this.jInternalFrameImportacionFacturasProveedores.setVisible(false);	    			
			this.jInternalFrameImportacionFacturasProveedores.dispose();
			this.jInternalFrameImportacionFacturasProveedores=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFacturasProveedores();
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
			
			if(sTipo.equals("NuevoFacturasProveedores")) {
				jButtonNuevoFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFacturasProveedores")) {
				jButtonDuplicarFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFacturasProveedores")) {
				jButtonCopiarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormFacturasProveedores")) {
				jButtonVerFormFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFacturasProveedores")) {
				jButtonNuevoFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFacturasProveedores")) {
				jButtonDuplicarFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFacturasProveedores")) {
				jButtonNuevoFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFacturasProveedores")) {
				jButtonDuplicarFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFacturasProveedores")) {
				jButtonNuevoFacturasProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFacturasProveedores")) {
				jButtonNuevoFacturasProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFacturasProveedores")) {
				jButtonNuevoFacturasProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFacturasProveedores")) {
				jButtonModificarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFacturasProveedores")) {
				jButtonModificarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFacturasProveedores")) {
				jButtonModificarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFacturasProveedores")) {
				jButtonActualizarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFacturasProveedores")) {
				jButtonActualizarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFacturasProveedores")) {
				jButtonActualizarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarFacturasProveedores")) {
				jButtonEliminarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFacturasProveedores")) {
				jButtonEliminarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFacturasProveedores")) {
				jButtonEliminarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarFacturasProveedores")) {
				jButtonCancelarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFacturasProveedores")) {
				jButtonCancelarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFacturasProveedores")) {
				jButtonCancelarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarFacturasProveedores")) {
				jButtonCerrarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFacturasProveedores")) {
				jButtonCerrarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFacturasProveedores")) {
				jButtonCerrarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFacturasProveedores")) {
				jButtonMostrarOcultarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFacturasProveedores")) {
				jButtonCancelarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFacturasProveedores")) {
				jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFacturasProveedores")) {
				jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFacturasProveedores")) {
				jButtonCopiarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFacturasProveedores")) {
				jButtonVerFormFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFacturasProveedores")) {
				jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFacturasProveedores")) {
				jButtonCopiarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFacturasProveedores")) {
				jButtonVerFormFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFacturasProveedores")) {
				jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFacturasProveedores")) {
				jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFacturasProveedores")) {
				jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFacturasProveedores")) {
				jButtonRecargarInformacionFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFacturasProveedores")) {
				jButtonRecargarInformacionFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFacturasProveedores")) {
				jButtonRecargarInformacionFacturasProveedoresActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFacturasProveedores")) {
				jButtonAnterioresFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFacturasProveedores")) {
				jButtonAnterioresFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFacturasProveedores")) {
				jButtonAnterioresFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFacturasProveedores")) {
				jButtonSiguientesFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFacturasProveedores")) {
				jButtonSiguientesFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFacturasProveedores")) {
				jButtonSiguientesFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFacturasProveedores") || sTipo.equals("MenuItemDetalleAbrirOrderByFacturasProveedores")) {
				jButtonAbrirOrderByFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFacturasProveedores") || sTipo.equals("MenuItemDetalleMostrarOcultarFacturasProveedores")) {
				jButtonMostrarOcultarFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFacturasProveedores")) {
				jButtonNuevoGuardarCambiosFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFacturasProveedores")) {
				jButtonNuevoGuardarCambiosFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFacturasProveedores")) {
				jButtonNuevoGuardarCambiosFacturasProveedoresActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFacturasProveedores")) {
				jButtonCerrarReporteDinamicoFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFacturasProveedores")) {
				jButtonGenerarReporteDinamicoFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFacturasProveedores")) {
				
				jButtonGenerarExcelReporteDinamicoFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFacturasProveedores")) {
				jButtonCerrarImportacionFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFacturasProveedores")) {
				
				jButtonGenerarImportacionFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFacturasProveedores")) {
				
				jButtonAbrirImportacionFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFacturasProveedores")) {
				jComboBoxTiposAccionesFacturasProveedoresActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFacturasProveedores")) {
				jComboBoxTiposRelacionesFacturasProveedoresActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFacturasProveedores")) {
				jComboBoxTiposAccionesFacturasProveedoresActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFacturasProveedores")) {
				
				jComboBoxTiposSeleccionarFacturasProveedoresActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFacturasProveedores")) {
				jTextFieldValorCampoGeneralFacturasProveedoresActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFacturasProveedores")) {
				jButtonAbrirOrderByFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFacturasProveedores")) {
				jButtonAbrirOrderByFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFacturasProveedores")) {
				jButtonCerrarOrderByFacturasProveedoresActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturasProveedoresBusqueda")) {
				this.jButtonidFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturasProveedoresUpdate")) {
				this.jButtonid_empresaFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturasProveedoresBusqueda")) {
				this.jButtonid_empresaFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteFacturasProveedoresUpdate")) {
				this.jButtonid_clienteFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteFacturasProveedoresBusqueda")) {
				this.jButtonid_clienteFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_inicioFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emision_inicioFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_finFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emision_finFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteFacturasProveedoresBusqueda")) {
				this.jButtoncodigo_clienteFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteFacturasProveedoresBusqueda")) {
				this.jButtonnombre_clienteFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaFacturasProveedoresBusqueda")) {
				this.jButtonnumero_facturaFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emisionFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturasProveedoresBusqueda")) {
				this.jButtontotalFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoFacturasProveedoresBusqueda")) {
				this.jButtonnumero_pre_impresoFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaFacturasProveedoresBusqueda")) {
				this.jButtonfechaFacturasProveedoresBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaFacturasProveedoresFacturasProveedores")) {
				this.jButtonBusquedaFacturasProveedoresFacturasProveedoresActionPerformed(evt);
			}
			
			;
			
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFacturasProveedores();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasProveedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				


				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FacturasProveedores facturasproveedoresLocal=null;
			
			if(!this.getEsControlTabla()) {
				facturasproveedoresLocal=this.facturasproveedores;
			} else {
				facturasproveedoresLocal=this.facturasproveedoresAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
							
				
				


				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
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
			
			


			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasProveedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
								
						
				


				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
								
				
				


				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
							
				
				


				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
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
			
			


			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasProveedoresActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
								
				
				


				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasProveedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFacturasProveedores")) {
					jCheckBoxSeleccionarTodosFacturasProveedoresItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFacturasProveedores")) {
					jCheckBoxSeleccionadosFacturasProveedoresItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFacturasProveedores")) {
					
				}
				
				


				
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
												
				
				


				
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasProveedoresActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
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
			
			


			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturasProveedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturasproveedores);
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
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
				
				


				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturasProveedores.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturasproveedoresAnterior =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFacturasProveedores")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFacturasProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFacturasProveedores.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.facturasproveedores =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.facturasproveedores =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.facturasproveedores);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFacturasProveedores")) {
				
				}
				
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFacturasProveedores")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFacturasProveedores.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFacturasProveedores")) {
			
			}
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFacturasProveedores();
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
			if(sTipo.equals("NuevoFacturasProveedores")) {
				jButtonNuevoFacturasProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFacturasProveedores")) {
				jButtonDuplicarFacturasProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFacturasProveedores")) {
				jButtonCopiarFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFacturasProveedores")) {
				jButtonVerFormFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFacturasProveedores")) {
				jButtonNuevoFacturasProveedoresActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFacturasProveedores")) {
				jButtonModificarFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFacturasProveedores")) {
				jButtonActualizarFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFacturasProveedores")) {
				jButtonEliminarFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFacturasProveedores")) {
				jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFacturasProveedores")) {
				jButtonCancelarFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFacturasProveedores")) {
				jButtonCerrarFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFacturasProveedores")) {
				jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFacturasProveedores")) {
				jButtonNuevoGuardarCambiosFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFacturasProveedores")) {
				jButtonAbrirOrderByFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFacturasProveedores")) {
				jButtonRecargarInformacionFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFacturasProveedores")) {
				jButtonAnterioresFacturasProveedoresActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFacturasProveedores")) {
				jButtonSiguientesFacturasProveedoresActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturasProveedoresBusqueda")) {
				this.jButtonidFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturasProveedoresUpdate")) {
				this.jButtonid_empresaFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturasProveedoresBusqueda")) {
				this.jButtonid_empresaFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteFacturasProveedoresUpdate")) {
				this.jButtonid_clienteFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteFacturasProveedoresBusqueda")) {
				this.jButtonid_clienteFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_inicioFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emision_inicioFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_finFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emision_finFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteFacturasProveedoresBusqueda")) {
				this.jButtoncodigo_clienteFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteFacturasProveedoresBusqueda")) {
				this.jButtonnombre_clienteFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaFacturasProveedoresBusqueda")) {
				this.jButtonnumero_facturaFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emisionFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalFacturasProveedoresBusqueda")) {
				this.jButtontotalFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoFacturasProveedoresBusqueda")) {
				this.jButtonnumero_pre_impresoFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaFacturasProveedoresBusqueda")) {
				this.jButtonfechaFacturasProveedoresBusquedaActionPerformed(evt);
			}
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFacturasProveedores();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFacturasProveedores")) {
				closingInternalFrameFacturasProveedores();
				
			} else if(sTipo.equals("jButtonCancelarFacturasProveedores")) {
				JInternalFrameBase jInternalFrameDetalleFormFacturasProveedores = (JInternalFrameBase)evt.getSource();
	            	
	            FacturasProveedoresBeanSwingJInternalFrame jInternalFrameParent=(FacturasProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturasProveedores.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFacturasProveedoresActionPerformed(null);
			}
			
			FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturasproveedores,new Object(),this.facturasproveedoresParameterGeneral,this.facturasproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFacturasProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFacturasProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFacturasProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.facturasproveedores)) {
			if(!esControlTabla) {
				if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);			
				}
				
				if(this.facturasproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFacturasProveedores(this.facturasproveedores,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFacturasProveedores(this.facturasproveedoresReturnGeneral,this.facturasproveedoresBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.facturasproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFacturasProveedores(classes,this.facturasproveedoresReturnGeneral,this.facturasproveedoresBean,false);
					}
						
					if(this.facturasproveedoresReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFacturasProveedores(this.facturasproveedoresReturnGeneral.getFacturasProveedores());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFacturasProveedores(this.facturasproveedoresReturnGeneral.getFacturasProveedores());	
					}
						
					if(this.facturasproveedoresReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFacturasProveedores(this.facturasproveedoresReturnGeneral.getFacturasProveedores(),classes);//this.facturasproveedoresBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFacturasProveedores(this.facturasproveedores,classes);//this.facturasproveedoresBean);									
				}
			
				if(FacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFacturasProveedores(this.facturasproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturasProveedores(this.facturasproveedores);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.facturasproveedoresAnterior!=null) {
						this.facturasproveedores=this.facturasproveedoresAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturasproveedoresSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturasproveedoresSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.facturasproveedoresReturnGeneral.getFacturasProveedores(),facturasproveedoresLogic.getFacturasProveedoress());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.facturasproveedoresReturnGeneral.getFacturasProveedores(),this.facturasproveedoress);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFacturasProveedores.repaint();
				
				//((AbstractTableModel) this.jTableDatosFacturasProveedores.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFacturasProveedores();
			}
		}
	}
	
	public void actualizarVisualTableDatosFacturasProveedores() throws Exception {
		
		FacturasProveedoresModel facturasproveedoresModel=(FacturasProveedoresModel)this.jTableDatosFacturasProveedores.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturasproveedoresModel.facturasproveedoress=this.facturasproveedoresLogic.getFacturasProveedoress();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			facturasproveedoresModel.facturasproveedoress=this.facturasproveedoress;
		}
		
		
		((FacturasProveedoresModel) this.jTableDatosFacturasProveedores.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFacturasProveedores() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfacturasproveedoresAnterior(),this.facturasproveedoresLogic.getFacturasProveedoress());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfacturasproveedoresAnterior(),this.facturasproveedoress);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFacturasProveedores();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFacturasProveedores(FacturasProveedores facturasproveedores,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
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
										
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturasproveedores,new Object(),generalEntityParameterGeneral,this.facturasproveedoresReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.facturasproveedoresSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FacturasProveedoresConstantesFunciones.getClassesRelationshipsOfFacturasProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FacturasProveedoresConstantesFunciones.getClassesRelationshipsFromStringsOfFacturasProveedores(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFacturasProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturasproveedores,new Object(),generalEntityParameterGeneral,this.facturasproveedoresReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFacturasProveedores(FacturasProveedoresBean facturasproveedoresBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFacturasProveedores(ArrayList<Classe> classes,FacturasProveedoresReturnGeneral facturasproveedoresReturnGeneral,FacturasProveedoresBean facturasproveedoresBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFacturasProveedores(FacturasProveedores facturasproveedores,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.facturasproveedores)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFacturasProveedores = new FacturasProveedoresDetalleFormJInternalFrame(jDesktopPane,this.facturasproveedoresSessionBean.getConGuardarRelaciones(),this.facturasproveedoresSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.setVisible(false);
		this.jInternalFrameDetalleFormFacturasProveedores.setSelected(false);						
		
		this.jInternalFrameDetalleFormFacturasProveedores.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFacturasProveedores.facturasproveedoresLogic=this.facturasproveedoresLogic;
		
		this.cargarCombosFrameForeignKeyFacturasProveedores("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturasProveedores();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturasProveedores();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFacturasProveedores("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFacturasProveedores();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFacturasProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturasProveedores"));
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonModificarFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarFacturasProveedores"));

		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonModificarToolBarFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturasProveedores"));
					
		this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemModificarFacturasProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarFacturasProveedores.addActionListener (new ButtonActionListener(this,"ActualizarFacturasProveedores"));
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarToolBarFacturasProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturasProveedores"));
						
		this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemActualizarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarFacturasProveedores"));
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturasProveedores"));
								
		this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemEliminarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarFacturasProveedores"));
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturasProveedores"));
					
		this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemCancelarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturasProveedores"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemDetalleCerrarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasProveedores"));
		
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasProveedores"));
		
		
		
		this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturasProveedores"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonidFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_empresaFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_empresaFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_clienteFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_clienteFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_inicioFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfecha_emision_finFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_finFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtoncodigo_clienteFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonnombre_clienteFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonnumero_facturaFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfecha_emisionFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtontotalFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfechaFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fechaFacturasProveedoresBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFacturasProveedores.jTabbedPaneRelacionesFacturasProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturasProveedores"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFacturasProveedores"));
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturasProveedores"));
		}
		
		this.jTableDatosFacturasProveedores.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFacturasProveedores"));
		
		this.jTableDatosFacturasProveedores.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFacturasProveedores"));
		
		this.jButtonNuevoFacturasProveedores.addActionListener(new ButtonActionListener(this,"NuevoFacturasProveedores"));
		
		this.jButtonDuplicarFacturasProveedores.addActionListener(new ButtonActionListener(this,"DuplicarFacturasProveedores"));
		
		this.jButtonCopiarFacturasProveedores.addActionListener(new ButtonActionListener(this,"CopiarFacturasProveedores"));
		
		this.jButtonVerFormFacturasProveedores.addActionListener(new ButtonActionListener(this,"VerFormFacturasProveedores"));
		
		
		this.jButtonNuevoToolBarFacturasProveedores.addActionListener(new ButtonActionListener(this,"NuevoToolBarFacturasProveedores"));
			
		this.jButtonDuplicarToolBarFacturasProveedores.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFacturasProveedores"));
			
		this.jMenuItemNuevoFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFacturasProveedores"));
			
		this.jMenuItemDuplicarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFacturasProveedores"));		
		
		
		this.jButtonNuevoRelacionesFacturasProveedores.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFacturasProveedores"));
		
		
		this.jButtonNuevoRelacionesToolBarFacturasProveedores.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFacturasProveedores"));
			
		this.jMenuItemNuevoRelacionesFacturasProveedores.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFacturasProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonModificarFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonModificarToolBarFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturasProveedores"));
			
			this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemModificarFacturasProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarFacturasProveedores.addActionListener (new ButtonActionListener(this,"ActualizarFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonActualizarToolBarFacturasProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturasProveedores"));
				
			this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemActualizarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonEliminarToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturasProveedores"));
						
			this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemEliminarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonCancelarToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturasProveedores"));
			
			this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemCancelarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturasProveedores"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFacturasProveedores"));		
		
		
		this.jButtonCerrarFacturasProveedores.addActionListener (new ButtonActionListener(this,"CerrarFacturasProveedores"));
		
		
		this.jButtonCerrarToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"CerrarToolBarFacturasProveedores"));
			
		this.jMenuItemCerrarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFacturasProveedores"));
			
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jMenuItemDetalleCerrarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturasProveedores"));
		}
		
		this.jButtonCopiarToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"CopiarToolBarFacturasProveedores"));
			
		this.jButtonVerFormToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"VerFormToolBarFacturasProveedores"));
		
		this.jMenuItemGuardarCambiosFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFacturasProveedores"));
			
		this.jMenuItemCopiarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFacturasProveedores"));		
		
		this.jMenuItemVerFormFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFacturasProveedores"));		
		
		
		this.jButtonGuardarCambiosTablaFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturasProveedores"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFacturasProveedores"));
			
		this.jMenuItemGuardarCambiosTablaFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturasProveedores"));		
		
		
		
		this.jButtonRecargarInformacionFacturasProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionFacturasProveedores"));
					
		this.jButtonRecargarInformacionToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFacturasProveedores"));
		
		this.jMenuItemRecargarInformacionFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFacturasProveedores"));		
		
		
		
		this.jButtonAnterioresFacturasProveedores.addActionListener (new ButtonActionListener(this,"AnterioresFacturasProveedores"));
		
		
		this.jButtonAnterioresToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFacturasProveedores"));
		
		this.jMenuItemAnterioresFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFacturasProveedores"));		
		
		
		this.jButtonSiguientesFacturasProveedores.addActionListener (new ButtonActionListener(this,"SiguientesFacturasProveedores"));
		
		
		this.jButtonSiguientesToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFacturasProveedores"));
			
		this.jMenuItemSiguientesFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFacturasProveedores"));
			
		this.jMenuItemAbrirOrderByFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFacturasProveedores"));
			
		this.jMenuItemMostrarOcultarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFacturasProveedores"));
			
		this.jMenuItemDetalleAbrirOrderByFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFacturasProveedores"));
			
		this.jMenuItemDetalleMostarOcultarFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFacturasProveedores"));		
		
		
		this.jButtonNuevoGuardarCambiosFacturasProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFacturasProveedores"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFacturasProveedores"));
			
		this.jMenuItemNuevoGuardarCambiosFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFacturasProveedores"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFacturasProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFacturasProveedores"));

		this.jCheckBoxSeleccionadosFacturasProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFacturasProveedores"));
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturasProveedores"));
		}
		
		
		this.jComboBoxTiposRelacionesFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposRelacionesFacturasProveedores"));
			
		this.jComboBoxTiposAccionesFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFacturasProveedores"));
					
		this.jComboBoxTiposSeleccionarFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFacturasProveedores"));
			
		this.jTextFieldValorCampoGeneralFacturasProveedores.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFacturasProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonidFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_empresaFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_empresaFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_clienteFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_clienteFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_inicioFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfecha_emision_finFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_finFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtoncodigo_clienteFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonnombre_clienteFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonnumero_facturaFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfecha_emisionFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtontotalFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfechaFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fechaFacturasProveedoresBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaFacturasProveedoresFacturasProveedores.addActionListener(new ButtonActionListener(this,"BusquedaFacturasProveedoresFacturasProveedores"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFacturasProveedores!=null) {
				this.jInternalFrameReporteDinamicoFacturasProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasProveedores"));
				this.jInternalFrameReporteDinamicoFacturasProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasProveedores"));
				this.jInternalFrameReporteDinamicoFacturasProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasProveedores"));
			}
			
			//this.jButtonCerrarReporteDinamicoFacturasProveedores.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturasProveedores"));				
			//this.jButtonGenerarReporteDinamicoFacturasProveedores.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturasProveedores"));
			//this.jButtonGenerarExcelReporteDinamicoFacturasProveedores.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturasProveedores"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFacturasProveedores!=null) {
				this.jInternalFrameImportacionFacturasProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturasProveedores"));
				this.jInternalFrameImportacionFacturasProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturasProveedores"));
				this.jInternalFrameImportacionFacturasProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturasProveedores"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFacturasProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByFacturasProveedores"));
			
			this.jButtonAbrirOrderByToolBarFacturasProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFacturasProveedores"));			
			
			if(this.jInternalFrameOrderByFacturasProveedores!=null) {
				this.jInternalFrameOrderByFacturasProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturasProveedores"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturasProveedores.jTabbedPaneRelacionesFacturasProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturasProveedores"));
		
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
            		closingInternalFrameFacturasProveedores();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFacturasProveedores.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFacturasProveedores = (JInternalFrameBase)event.getSource();
	            	
	            FacturasProveedoresBeanSwingJInternalFrame jInternalFrameParent=(FacturasProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturasProveedores.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFacturasProveedoresActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFacturasProveedores.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFacturasProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFacturasProveedores.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFacturasProveedores.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFacturasProveedores";
		inputMap = this.jButtonNuevoFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturasProveedoresActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturasProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFacturasProveedores";
		inputMap = this.jButtonNuevoRelacionesFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturasProveedoresActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFacturasProveedores";
		inputMap = this.jButtonModificarFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFacturasProveedores";
		inputMap = this.jButtonActualizarFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFacturasProveedores";
		inputMap = this.jButtonEliminarFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFacturasProveedores";
		inputMap = this.jButtonCancelarFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFacturasProveedores";
		inputMap = this.jButtonCerrarFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFacturasProveedores";
		inputMap = this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonGuardarCambiosFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFacturasProveedores.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFacturasProveedoresItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFacturasProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFacturasProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFacturasProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFacturasProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFacturasProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFacturasProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonidFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_empresaFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_empresaFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_clienteFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonid_clienteFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfecha_emision_inicioFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_inicioFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfecha_emision_finFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_finFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtoncodigo_clienteFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonnombre_clienteFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonnumero_facturaFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfecha_emisionFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtontotalFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"totalFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonnumero_pre_impresoFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturasProveedores.jButtonfechaFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fechaFacturasProveedoresBusqueda"));
		
		
		this.jButtonBusquedaFacturasProveedoresFacturasProveedores.addActionListener(new ButtonActionListener(this,"BusquedaFacturasProveedoresFacturasProveedores"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFacturasProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFacturasProveedores.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFacturasProveedores(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoresLogic.getFacturasProveedoress()) {
					facturasproveedoresAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasProveedores facturasproveedoresAux:facturasproveedoress) {
					facturasproveedoresAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFacturasProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturasProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoresLogic.getFacturasProveedoress()) {
						facturasproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasProveedores facturasproveedoresAux:facturasproveedoress) {
						facturasproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoresLogic.getFacturasProveedoress()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasProveedores facturasproveedoresAux:facturasproveedoress) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFacturasProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturasProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturasProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFacturasProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturasProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFacturasProveedores.getSelectedRows();
			
			FacturasProveedores facturasproveedoresLocal=new FacturasProveedores();
			
			//this.seleccionarTodosFacturasProveedores(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturasproveedoresLocal =(FacturasProveedores) this.facturasproveedoresLogic.getFacturasProveedoress().toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					facturasproveedoresLocal =(FacturasProveedores) this.facturasproveedoress.toArray()[this.jTableDatosFacturasProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				facturasproveedoresLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoresLogic.getFacturasProveedoress()) {
						facturasproveedoresAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturasProveedores facturasproveedoresAux:facturasproveedoress) {
						facturasproveedoresAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFacturasProveedores(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturasProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturasProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturasProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFacturasProveedoresItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFacturasProveedoresParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFacturasProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFacturasProveedores(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFacturasProveedores.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoresLogic.getFacturasProveedoress()) {
				
						if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO)) {
							existe=true;
							facturasproveedoresAux.setfecha_emision_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN)) {
							existe=true;
							facturasproveedoresAux.setfecha_emision_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							facturasproveedoresAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							facturasproveedoresAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							facturasproveedoresAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturasproveedoresAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturasproveedoresAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							facturasproveedoresAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							facturasproveedoresAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasProveedores facturasproveedoresAux:facturasproveedoress) {
					
						if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO)) {
							existe=true;
							facturasproveedoresAux.setfecha_emision_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN)) {
							existe=true;
							facturasproveedoresAux.setfecha_emision_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							facturasproveedoresAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							facturasproveedoresAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							facturasproveedoresAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturasproveedoresAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							facturasproveedoresAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							facturasproveedoresAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							facturasproveedoresAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFacturasProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFacturasProveedoresActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFacturasProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFacturasProveedores=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFacturasProveedores.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFacturasProveedores) {				
					conSplash=true;//false;										
					
					//this.startProcessFacturasProveedores(conSplash);
				
					this.generarReporteFacturasProveedoressSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFacturasProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturasProveedoressSeleccionados(false);
				//this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturasProveedoressSeleccionados(true);
				//this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturasProveedores();
				
				this.exportarFacturasProveedoressSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFacturasProveedoress();
				//this.importarFacturasProveedoress();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturasProveedores();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFacturasProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Facturas Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFacturasProveedores();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFacturasProveedores)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFacturasProveedores(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.setSelectedIndex(0);					
				}	
			} 			
			else if(FacturasProveedoresBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFacturasProveedores) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFacturasProveedores(conSplash);
					
						//this.actualizarParametrosGeneralFacturasProveedores();
						
						this.generarReporteProcesoAccionFacturasProveedoressSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FacturasProveedoresBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Facturas ProveedoresES SELECCIONADOS?", "MANTENIMIENTO DE Facturas Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFacturasProveedores();
				
						this.actualizarParametrosGeneralFacturasProveedores();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.facturasproveedoresReturnGeneral=facturasproveedoresLogic.procesarAccionFacturasProveedoressWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.facturasproveedoresLogic.getFacturasProveedoress(),this.facturasproveedoresParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFacturasProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFacturasProveedores();
					
					FacturasProveedoresBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFacturasProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturasProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxTiposAccionesFormularioFacturasProveedores.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFacturasProveedores(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFacturasProveedoresActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFacturasProveedores();
			
			if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();		
			FacturasProveedores facturasproveedores=new FacturasProveedores();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFacturasProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFacturasProveedores.getSelectedItem();
			
			
			
			
			facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
			//this.sTipoAccion;
			
			if(facturasproveedoressSeleccionados.size()==1) {
				for(FacturasProveedores facturasproveedoresAux:facturasproveedoressSeleccionados) {
					facturasproveedores=facturasproveedoresAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFacturasProveedores();
			
      		//this.finishProcessFacturasProveedores(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFacturasProveedoresReturnGeneral() throws Exception {
		if(this.facturasproveedoresReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.facturasproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.facturasproveedoresReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.facturasproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.facturasproveedoresReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.facturasproveedoresReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFacturasProveedores(false);
		}
		
		if(this.facturasproveedoresReturnGeneral.getConRetornoLista() || this.facturasproveedoresReturnGeneral.getConRetornoObjeto()) {
			if(this.facturasproveedoresReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturasproveedoresLogic.setFacturasProveedoress(this.facturasproveedoresReturnGeneral.getFacturasProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingFacturasProveedores(false);
		}
	}
	
	public void actualizarParametrosGeneralFacturasProveedores() throws Exception {
		
		
	}
	
	public ArrayList<FacturasProveedores> getFacturasProveedoressSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFacturasProveedores) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FacturasProveedores facturasproveedoresAux:facturasproveedoresLogic.getFacturasProveedoress()) {
					if(facturasproveedoresAux.getIsSelected()) {
						facturasproveedoressSeleccionados.add(facturasproveedoresAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturasProveedores facturasproveedoresAux:this.facturasproveedoress) {
					if(facturasproveedoresAux.getIsSelected()) {
						facturasproveedoressSeleccionados.add(facturasproveedoresAux);				
					}
				}
			}
			
			if(facturasproveedoressSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						facturasproveedoressSeleccionados.addAll(this.facturasproveedoresLogic.getFacturasProveedoress());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						facturasproveedoressSeleccionados.addAll(this.facturasproveedoress);				
					}
				}
			}
		} else {
			facturasproveedoressSeleccionados.add(this.facturasproveedores);
		}
		
		return facturasproveedoressSeleccionados;
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
	
	public void generarReporteFacturasProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFacturasProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFacturasProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturasProveedoressSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturasProveedoressSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Facturas Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();		
		
		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFacturasProveedoress("Todos",facturasproveedoressSeleccionados);
		
	}	
	
	public void generarReporteNormalFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();		
		
		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFacturasProveedoress("Todos",facturasproveedoressSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFacturasProveedoressSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();
		
		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFacturasProveedoress("Todos",facturasproveedoressSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFacturasProveedores();
		
		
		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFacturasProveedores();
		
		
		//this.generarReporteFacturasProveedoress("Todos",facturasproveedoressSeleccionados ,facturasproveedoresImplementable,facturasproveedoresImplementableHome);
	}
	
	public void mostrarImportacionFacturasProveedoress() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFacturasProveedores();
		
		this.abrirFrameImportacionFacturasProveedores();		
		
			
		//this.generarReporteFacturasProveedoress("Todos",facturasproveedoressSeleccionados ,facturasproveedoresImplementable,facturasproveedoresImplementableHome);
	}
	
	public void importarFacturasProveedoress() throws Exception {		
	
	}
	
	public void exportarFacturasProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFacturasProveedoressSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFacturasProveedoressSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFacturasProveedoressSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Facturas Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();		
		
		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasproveedores."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFacturasProveedores(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FacturasProveedores facturasproveedoresAux:facturasproveedoressSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFacturasProveedores(facturasproveedoresAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//facturasproveedoresAux.setsDetalleGeneralEntityReporte(facturasproveedoresAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFacturasProveedores(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturasProveedoresConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFacturasProveedores(FacturasProveedores facturasproveedores,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=facturasproveedores.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getfecha_emision_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getfecha_emision_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getcodigo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturasproveedores.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();		
		
		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasproveedores.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FacturasProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFacturasProveedores(row);				
				iRow++;
			}				
			
			for(FacturasProveedores facturasproveedoresAux:facturasproveedoressSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFacturasProveedores(facturasproveedoresAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();		
		
		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturasproveedores.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("facturasproveedoress");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("facturasproveedores");
			//elementRoot.appendChild(element);
		
			for(FacturasProveedores facturasproveedoresAux:facturasproveedoressSeleccionados) {
				element = document.createElement("facturasproveedores");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFacturasProveedores(facturasproveedoresAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFacturasProveedores(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturasProveedoresConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFacturasProveedores(FacturasProveedores facturasproveedores,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getfecha_emision_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getfecha_emision_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getcodigo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(facturasproveedores.getfecha());				
	}
	
	public void setFilaDatosExportarXmlFacturasProveedores(FacturasProveedores facturasproveedores,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FacturasProveedoresConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(facturasproveedores.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FacturasProveedoresConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(facturasproveedores.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FacturasProveedoresConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(facturasproveedores.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(FacturasProveedoresConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(facturasproveedores.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfecha_emision_inicio = document.createElement(FacturasProveedoresConstantesFunciones.FECHAEMISIONINICIO);
		elementfecha_emision_inicio.appendChild(document.createTextNode(facturasproveedores.getfecha_emision_inicio().toString().trim()));
		element.appendChild(elementfecha_emision_inicio);

		Element elementfecha_emision_fin = document.createElement(FacturasProveedoresConstantesFunciones.FECHAEMISIONFIN);
		elementfecha_emision_fin.appendChild(document.createTextNode(facturasproveedores.getfecha_emision_fin().toString().trim()));
		element.appendChild(elementfecha_emision_fin);

		Element elementcodigo_cliente = document.createElement(FacturasProveedoresConstantesFunciones.CODIGOCLIENTE);
		elementcodigo_cliente.appendChild(document.createTextNode(facturasproveedores.getcodigo_cliente().trim()));
		element.appendChild(elementcodigo_cliente);

		Element elementnombre_cliente = document.createElement(FacturasProveedoresConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(facturasproveedores.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementnumero_factura = document.createElement(FacturasProveedoresConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(facturasproveedores.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementfecha_emision = document.createElement(FacturasProveedoresConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(facturasproveedores.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementtotal = document.createElement(FacturasProveedoresConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(facturasproveedores.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementnumero_pre_impreso = document.createElement(FacturasProveedoresConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(facturasproveedores.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementfecha = document.createElement(FacturasProveedoresConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(facturasproveedores.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoFacturasProveedoressSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FacturasProveedores> facturasproveedoressSeleccionados=new ArrayList<FacturasProveedores>();
		
		facturasproveedoressSeleccionados=this.getFacturasProveedoressSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFacturasProveedores(facturasproveedoressSeleccionados);
		
		this.generarReporteFacturasProveedoress("Todos",facturasproveedoressSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFacturasProveedores(ArrayList<FacturasProveedores> facturasproveedoressSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FacturasProveedores facturasproveedoresAux:facturasproveedoressSeleccionados) {
				facturasproveedoresAux.setsDetalleGeneralEntityReporte(facturasproveedoresAux.toString());
			
				if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(facturasproveedoresAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(facturasproveedoresAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONINICIO)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasproveedoresAux.getfecha_emision_inicio()));
				}
				 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONFIN)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasproveedoresAux.getfecha_emision_fin()));
				}
				 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_CODIGOCLIENTE)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(facturasproveedoresAux.getcodigo_cliente());
				}
				 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(facturasproveedoresAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(facturasproveedoresAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasproveedoresAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(facturasproveedoresAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(FacturasProveedoresConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					facturasproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturasproveedoresAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFacturasProveedores(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFacturasProveedores=true;
				this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=true;
				this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=true;
			}
			
			this.isVisibilidadCeldaModificarFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarFacturasProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=false;
			this.isVisibilidadCeldaModificarFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarFacturasProveedores=true;
			this.isVisibilidadCeldaEliminarFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=false;
			this.isVisibilidadCeldaModificarFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarFacturasProveedores=true;
			this.isVisibilidadCeldaEliminarFacturasProveedores=true;
			this.isVisibilidadCeldaCancelarFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=false;
			this.isVisibilidadCeldaModificarFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarFacturasProveedores=true;
			this.isVisibilidadCeldaEliminarFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFacturasProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=true;
			this.isVisibilidadCeldaModificarFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarFacturasProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarFacturasProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=false;
			this.isVisibilidadCeldaModificarFacturasProveedores=true;
			this.isVisibilidadCeldaActualizarFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturasProveedores=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FacturasProveedoresJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFacturasProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=true;
		} else {
			this.actualizarEstadoPanelsFacturasProveedores(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFacturasProveedores=false;
			//this.isVisibilidadCeldaVerFormFacturasProveedores=false;
			this.isVisibilidadCeldaDuplicarFacturasProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!facturasproveedoresSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
		} else {
			this.isVisibilidadCeldaNuevoFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!facturasproveedoresSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;												
			}
			
			this.jButtonCerrarFacturasProveedores.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
		}
		
		if(!this.permiteMantenimiento(this.facturasproveedores)) {
			this.isVisibilidadCeldaActualizarFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarFacturasProveedores=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoFacturasProveedores=false;
		this.isVisibilidadCeldaNuevoRelacionesFacturasProveedores=false;
		this.isVisibilidadCeldaGuardarCambiosFacturasProveedores=false;
		//this.isVisibilidadCeldaModificarFacturasProveedores=true;
		this.isVisibilidadCeldaActualizarFacturasProveedores=false;
		this.isVisibilidadCeldaEliminarFacturasProveedores=false;
		//this.isVisibilidadCeldaCancelarFacturasProveedores=true;			
		this.isVisibilidadCeldaGuardarFacturasProveedores=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFacturasProveedores() {
	}
	
	public void actualizarEstadoPanelsFacturasProveedores(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionFacturasProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasProveedores!=null) {
				this.jScrollPanelDatosFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasProveedores!=null) {
				this.jPanelPaginacionFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasProveedores!=null) {
				this.jPanelParametrosReportesFacturasProveedores.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionFacturasProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasFacturasProveedores.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFacturasProveedores!=null) {
				this.jScrollPanelDatosFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasProveedores!=null) {
				this.jPanelPaginacionFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasProveedores!=null) {
				this.jPanelParametrosReportesFacturasProveedores.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionFacturasProveedores.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasFacturasProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturasProveedores!=null) {
				this.jScrollPanelDatosFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasProveedores!=null) {
				this.jPanelPaginacionFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasProveedores!=null) {
				this.jPanelParametrosReportesFacturasProveedores.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionFacturasProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasFacturasProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturasProveedores!=null) {
				this.jScrollPanelDatosFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturasProveedores!=null) {
				this.jPanelPaginacionFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturasProveedores!=null) {
				this.jPanelParametrosReportesFacturasProveedores.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionFacturasProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasProveedores!=null) {
				this.jScrollPanelDatosFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasProveedores!=null) {
				this.jPanelPaginacionFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasProveedores!=null) {
				this.jPanelParametrosReportesFacturasProveedores.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionFacturasProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasProveedores!=null) {
				this.jScrollPanelDatosFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasProveedores!=null) {
				this.jPanelPaginacionFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasProveedores!=null) {
				this.jPanelParametrosReportesFacturasProveedores.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionFacturasProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturasProveedores!=null) {
				this.jScrollPanelDatosFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturasProveedores!=null) {
				this.jPanelPaginacionFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturasProveedores!=null) {
				this.jPanelParametrosReportesFacturasProveedores.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFacturasProveedores!=null) {
					this.jTabbedPaneBusquedasFacturasProveedores.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFacturasProveedores!=null) {
				this.jPanelParametrosReportesFacturasProveedores.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.facturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasFacturasProveedores.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFacturasProveedores!=null) {
				this.jPanelParametrosReportesFacturasProveedores.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaFacturasProveedores=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaFacturasProveedores) {this.jTabbedPaneBusquedasFacturasProveedores.remove(jPanelBusquedaFacturasProveedoresFacturasProveedores);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaFacturasProveedores=isParaCliente;
			if(!this.isVisibilidadBusquedaFacturasProveedores) {this.jTabbedPaneBusquedasFacturasProveedores.remove(jPanelBusquedaFacturasProveedoresFacturasProveedores);}
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
			
			this.inicializarActualizarBindingTablaFacturasProveedores(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFacturasProveedores() {
		this.updateBorderResaltarBusquedasFormularioFacturasProveedores();
		this.updateVisibilidadBusquedasFormularioFacturasProveedores();
		this.updateHabilitarBusquedasFormularioFacturasProveedores();
	}
	
	public void updateBorderResaltarBusquedasFormularioFacturasProveedores() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFacturasProveedores.getComponents().length>0) {
	

		if(this.facturasproveedoresConstantesFunciones.resaltarBusquedaFacturasProveedoresFacturasProveedores!=null) {
			index= this.jTabbedPaneBusquedasFacturasProveedores.indexOfComponent(this.jPanelBusquedaFacturasProveedoresFacturasProveedores);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasProveedores.getComponent(index);
				jPanel.setBorder(this.facturasproveedoresConstantesFunciones.resaltarBusquedaFacturasProveedoresFacturasProveedores);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFacturasProveedores() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFacturasProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturasProveedores.indexOfComponent(this.jPanelBusquedaFacturasProveedoresFacturasProveedores);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasProveedores.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturasproveedoresConstantesFunciones.mostrarBusquedaFacturasProveedoresFacturasProveedores);
			if(!this.facturasproveedoresConstantesFunciones.mostrarBusquedaFacturasProveedoresFacturasProveedores && index>-1) {
				this.jTabbedPaneBusquedasFacturasProveedores.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFacturasProveedores() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFacturasProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturasProveedores.indexOfComponent(this.jPanelBusquedaFacturasProveedoresFacturasProveedores);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasProveedores.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturasproveedoresConstantesFunciones.activarBusquedaFacturasProveedoresFacturasProveedores);
				this.jTabbedPaneBusquedasFacturasProveedores.setEnabledAt(index,this.facturasproveedoresConstantesFunciones.activarBusquedaFacturasProveedoresFacturasProveedores);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFacturasProveedores(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaFacturasProveedores")) {
			index= this.jTabbedPaneBusquedasFacturasProveedores.indexOfComponent(this.jPanelBusquedaFacturasProveedoresFacturasProveedores);

			this.jTabbedPaneBusquedasFacturasProveedores.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturasProveedores.getComponent(index);

			this.facturasproveedoresConstantesFunciones.setResaltarBusquedaFacturasProveedoresFacturasProveedores(resaltar);

			jPanel.setBorder(this.facturasproveedoresConstantesFunciones.resaltarBusquedaFacturasProveedoresFacturasProveedores);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFacturasProveedores.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFacturasProveedores() throws Exception {

		if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFacturasProveedores();
		this.updateVisibilidadResaltarControlesFormularioFacturasProveedores();
		this.updateHabilitarResaltarControlesFormularioFacturasProveedores();
		
	}
	
	public void updateBorderResaltarControlesFormularioFacturasProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.facturasproveedoresConstantesFunciones.resaltaridFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltaridFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarid_empresaFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarid_empresaFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarid_clienteFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarid_clienteFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarfecha_emision_inicioFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emision_inicioFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarfecha_emision_inicioFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarfecha_emision_finFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emision_finFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarfecha_emision_finFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarcodigo_clienteFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldcodigo_clienteFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarcodigo_clienteFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarnombre_clienteFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jTextAreanombre_clienteFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarnombre_clienteFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarnumero_facturaFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_facturaFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarnumero_facturaFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarfecha_emisionFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emisionFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarfecha_emisionFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltartotalFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldtotalFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltartotalFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarnumero_pre_impresoFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_pre_impresoFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarnumero_pre_impresoFacturasProveedores);}
		if(this.facturasproveedoresConstantesFunciones.resaltarfechaFacturasProveedores!=null && this.jInternalFrameDetalleFormFacturasProveedores!=null) {this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfechaFacturasProveedores.setBorder(this.facturasproveedoresConstantesFunciones.resaltarfechaFacturasProveedores);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFacturasProveedores() throws Exception {		
		if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
	
		//this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostraridFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelidFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostraridFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarid_empresaFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelid_empresaFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarid_empresaFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarid_clienteFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelid_clienteFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarid_clienteFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emision_inicioFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarfecha_emision_inicioFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelfecha_emision_inicioFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarfecha_emision_inicioFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emision_finFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarfecha_emision_finFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelfecha_emision_finFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarfecha_emision_finFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldcodigo_clienteFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarcodigo_clienteFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelcodigo_clienteFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarcodigo_clienteFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jTextAreanombre_clienteFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarnombre_clienteFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelnombre_clienteFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarnombre_clienteFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_facturaFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarnumero_facturaFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelnumero_facturaFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarnumero_facturaFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emisionFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarfecha_emisionFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelfecha_emisionFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarfecha_emisionFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldtotalFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrartotalFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPaneltotalFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrartotalFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_pre_impresoFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarnumero_pre_impresoFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelnumero_pre_impresoFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarnumero_pre_impresoFacturasProveedores);
		//this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfechaFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarfechaFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jPanelfechaFacturasProveedores.setVisible(this.facturasproveedoresConstantesFunciones.mostrarfechaFacturasProveedores);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFacturasProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturasProveedores!=null) {
	
		this.jInternalFrameDetalleFormFacturasProveedores.jLabelidFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activaridFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_empresaFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarid_empresaFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jComboBoxid_clienteFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarid_clienteFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emision_inicioFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarfecha_emision_inicioFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emision_finFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarfecha_emision_finFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldcodigo_clienteFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarcodigo_clienteFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextAreanombre_clienteFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarnombre_clienteFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_facturaFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarnumero_facturaFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfecha_emisionFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarfecha_emisionFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldtotalFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activartotalFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jTextFieldnumero_pre_impresoFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarnumero_pre_impresoFacturasProveedores);
		this.jInternalFrameDetalleFormFacturasProveedores.jDateChooserfechaFacturasProveedores.setEnabled(this.facturasproveedoresConstantesFunciones.activarfechaFacturasProveedores);
		}
	}
	
		
}