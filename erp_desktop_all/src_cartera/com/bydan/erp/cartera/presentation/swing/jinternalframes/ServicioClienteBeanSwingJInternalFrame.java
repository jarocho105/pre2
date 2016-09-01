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

import com.bydan.erp.cartera.util.ServicioClienteConstantesFunciones;
import com.bydan.erp.cartera.util.ServicioClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ServicioClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ServicioClienteBean;
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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ServicioClienteBeanSwingJInternalFrame extends ServicioClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ServicioClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ServicioCliente> servicioclienteValidator = new ClassValidator<ServicioCliente>(ServicioCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ServicioCliente serviciocliente;	
	public ServicioCliente servicioclienteAux;
	public ServicioCliente servicioclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ServicioCliente servicioclienteTotales;
	public Long idServicioClienteActual;
	public Long iIdNuevoServicioCliente=0L;
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

	public String sFinalQueryComboTipoPrecio="";

	public List<TipoPrecio> tipopreciosForeignKey;

	public List<TipoPrecio> gettipopreciosForeignKey() {
		return tipopreciosForeignKey;
	}

	public void settipopreciosForeignKey(List<TipoPrecio> tipopreciosForeignKey) {
		this.tipopreciosForeignKey = tipopreciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoPrecio tipoprecioForeignKey;

	public TipoPrecio gettipoprecioForeignKey() {
		return tipoprecioForeignKey;
	}

	public void settipoprecioForeignKey(TipoPrecio tipoprecioForeignKey) {
		this.tipoprecioForeignKey = tipoprecioForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
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
	
	public Boolean isPermisoTodoServicioCliente;
	public Boolean isPermisoNuevoServicioCliente;
	public Boolean isPermisoActualizarServicioCliente;
	public Boolean isPermisoActualizarOriginalServicioCliente;
	public Boolean isPermisoEliminarServicioCliente;
	public Boolean isPermisoGuardarCambiosServicioCliente;
	public Boolean isPermisoConsultaServicioCliente;
	public Boolean isPermisoBusquedaServicioCliente;
	public Boolean isPermisoReporteServicioCliente;
	public Boolean isPermisoPaginacionMedioServicioCliente;
	public Boolean isPermisoPaginacionAltoServicioCliente;
	public Boolean isPermisoPaginacionTodoServicioCliente;
	public Boolean isPermisoCopiarServicioCliente;
	public Boolean isPermisoVerFormServicioCliente;
	public Boolean isPermisoDuplicarServicioCliente;
	public Boolean isPermisoOrdenServicioCliente;
	
	
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
	
	public ServicioClienteParameterReturnGeneral servicioclienteReturnGeneral;
	public ServicioClienteParameterReturnGeneral servicioclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoServicioCliente=false;
	public Boolean esParaAccionDesdeFormularioServicioCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ServicioClienteSessionBeanAdditional servicioclienteSessionBeanAdditional=null;
	
	public ServicioClienteSessionBeanAdditional getServicioClienteSessionBeanAdditional() {
		return this.servicioclienteSessionBeanAdditional;
	}
	
	public void setServicioClienteSessionBeanAdditional(ServicioClienteSessionBeanAdditional servicioclienteSessionBeanAdditional) {
		try {
			this.servicioclienteSessionBeanAdditional=servicioclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ServicioClienteBeanSwingJInternalFrameAdditional servicioclienteBeanSwingJInternalFrameAdditional=null;
	//public class ServicioClienteBeanSwingJInternalFrame
	
	public ServicioClienteBeanSwingJInternalFrameAdditional getServicioClienteBeanSwingJInternalFrameAdditional() {
		return this.servicioclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setServicioClienteBeanSwingJInternalFrameAdditional(ServicioClienteBeanSwingJInternalFrameAdditional servicioclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.servicioclienteBeanSwingJInternalFrameAdditional=servicioclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ServicioClienteLogic servicioclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ServicioCliente servicioclienteBean;
	public ServicioClienteConstantesFunciones servicioclienteConstantesFunciones;
	//public ServicioClienteParameterReturnGeneral servicioclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public TipoPrecioLogic tipoprecioLogic;
	
	//PARAMETROS
	
	
	//public List<ServicioCliente> servicioclientes;	
	//public List<ServicioCliente> servicioclientesEliminados;
	//public List<ServicioCliente> servicioclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoServicioCliente=false;
	public Boolean isVisibilidadCeldaDuplicarServicioCliente=true;
	public Boolean isVisibilidadCeldaCopiarServicioCliente=true;
	public Boolean isVisibilidadCeldaVerFormServicioCliente=true;
	public Boolean isVisibilidadCeldaOrdenServicioCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesServicioCliente=false;
	public Boolean isVisibilidadCeldaModificarServicioCliente=false;
	public Boolean isVisibilidadCeldaActualizarServicioCliente=false;
	public Boolean isVisibilidadCeldaEliminarServicioCliente=false;
	public Boolean isVisibilidadCeldaCancelarServicioCliente=false;
	public Boolean isVisibilidadCeldaGuardarServicioCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosServicioCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdTipoPrecio=false;
	
	public Long getiIdNuevoServicioCliente() {
		return this.iIdNuevoServicioCliente;
	}

	public void setiIdNuevoServicioCliente(Long iIdNuevoServicioCliente) {
		this.iIdNuevoServicioCliente = iIdNuevoServicioCliente;
	}
	
	public Long getidServicioClienteActual() {
		return this.idServicioClienteActual;
	}

	public void setidServicioClienteActual(Long idServicioClienteActual) {
		this.idServicioClienteActual = idServicioClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ServicioCliente getserviciocliente() {
		return this.serviciocliente;
	}

	public void setserviciocliente(ServicioCliente serviciocliente) {
		this.serviciocliente = serviciocliente;
	}
	
	public ServicioCliente getservicioclienteAux() {
		return this.servicioclienteAux;
	}

	public void setservicioclienteAux(ServicioCliente servicioclienteAux) {
		this.servicioclienteAux = servicioclienteAux;
	}				
	
	public ServicioCliente getservicioclienteAnterior() {
		return this.servicioclienteAnterior;
	}

	public void setservicioclienteAnterior(ServicioCliente servicioclienteAnterior) {
		this.servicioclienteAnterior = servicioclienteAnterior;
	}	
	
	public ServicioCliente getservicioclienteTotales() {
		return this.servicioclienteTotales;
	}

	public void setservicioclienteTotales(ServicioCliente servicioclienteTotales) {
		this.servicioclienteTotales = servicioclienteTotales;
	}	
	
	public ServicioCliente getservicioclienteBean() {
		return this.servicioclienteBean;
	}

	public void setservicioclienteBean(ServicioCliente servicioclienteBean) {
		this.servicioclienteBean = servicioclienteBean;
	}	
	
	public ServicioClienteParameterReturnGeneral getservicioclienteReturnGeneral() {
		return this.servicioclienteReturnGeneral;
	}

	public void setservicioclienteReturnGeneral(ServicioClienteParameterReturnGeneral servicioclienteReturnGeneral) {
		this.servicioclienteReturnGeneral = servicioclienteReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
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

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

	public Long id_tipo_precioFK_IdTipoPrecio=-1L;

	public Long getid_tipo_precioFK_IdTipoPrecio() {
		return this.id_tipo_precioFK_IdTipoPrecio;
	}

	public void setid_tipo_precioFK_IdTipoPrecio(Long id_tipo_precioFK_IdTipoPrecio) {
		this.id_tipo_precioFK_IdTipoPrecio = id_tipo_precioFK_IdTipoPrecio;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ServicioClienteLogic getServicioClienteLogic()	{		
		return servicioclienteLogic;
	}

	public void setServicioClienteLogic(ServicioClienteLogic servicioclienteLogic) {
		this.servicioclienteLogic = servicioclienteLogic;
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
	
	public Boolean getIsEsNuevoServicioCliente() {
		return isEsNuevoServicioCliente;
	}

	public void setIsEsNuevoServicioCliente(Boolean isEsNuevoServicioCliente) {
		this.isEsNuevoServicioCliente = isEsNuevoServicioCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioServicioCliente() {
		return esParaAccionDesdeFormularioServicioCliente;
	}
	
	public void setEsParaAccionDesdeFormularioServicioCliente(Boolean esParaAccionDesdeFormularioServicioCliente) {
		this.esParaAccionDesdeFormularioServicioCliente = esParaAccionDesdeFormularioServicioCliente;
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

			if(this.servicioclienteSessionBean==null) {
				this.servicioclienteSessionBean=new ServicioClienteSessionBean();
			}

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(servicioclienteSessionBean.getlidEmpresaActual());
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

			if(this.servicioclienteSessionBean==null) {
				this.servicioclienteSessionBean=new ServicioClienteSessionBean();
			}

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(servicioclienteSessionBean.getlidClienteActual());
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

			if(this.servicioclienteSessionBean==null) {
				this.servicioclienteSessionBean=new ServicioClienteSessionBean();
			}

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(servicioclienteSessionBean.getlidBodegaActual());
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

			if(this.servicioclienteSessionBean==null) {
				this.servicioclienteSessionBean=new ServicioClienteSessionBean();
			}

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(servicioclienteSessionBean.getlidProductoActual());
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

	public void cargarCombosTipoPreciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipopreciosForeignKey=new ArrayList<TipoPrecio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoPrecioLogic tipoprecioLogic=new TipoPrecioLogic();

			//tipoprecioLogic.getTipoPrecioDataAccess().setIsForForeingKeyData(true);

			if(this.servicioclienteSessionBean==null) {
				this.servicioclienteSessionBean=new ServicioClienteSessionBean();
			}

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoprecioLogic.getTipoPrecioDataAccess().setIsForForeingKeyData(true);

					tipoprecioLogic.getTodosTipoPreciosWithConnection(sFinalQuery,new Pagination());

					this.tipopreciosForeignKey=tipoprecioLogic.getTipoPrecios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoPrecio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprecioLogic.getEntityWithConnection(servicioclienteSessionBean.getlidTipoPrecioActual());
					this.tipopreciosForeignKey.add(tipoprecioLogic.getTipoPrecio());
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

					if(this.serviciocliente!=null) {
						this.serviciocliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaServicioCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaServicioClienteGenerico)throws Exception
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
				jComboBoxid_empresaServicioClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaServicioClienteGenerico!=null && jComboBoxid_empresaServicioClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaServicioClienteGenerico.setSelectedIndex(0);
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

					if(this.serviciocliente!=null) {
						this.serviciocliente.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteServicioCliente.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteServicioCliente!=null) {
						jComboBoxid_clienteFK_IdClienteServicioCliente.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteServicioCliente!=null) {
							//jComboBoxid_clienteFK_IdClienteServicioCliente.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteServicioCliente.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteServicioCliente.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteServicioClienteGenerico)throws Exception
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
				jComboBoxid_clienteServicioClienteGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteServicioClienteGenerico!=null && jComboBoxid_clienteServicioClienteGenerico.getItemCount()>0) {
					jComboBoxid_clienteServicioClienteGenerico.setSelectedIndex(0);
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

					if(this.serviciocliente!=null) {
						this.serviciocliente.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaServicioCliente.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaServicioCliente!=null) {
						jComboBoxid_bodegaFK_IdBodegaServicioCliente.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaServicioCliente!=null) {
							//jComboBoxid_bodegaFK_IdBodegaServicioCliente.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaServicioCliente.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaServicioCliente.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaServicioClienteGenerico)throws Exception
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
				jComboBoxid_bodegaServicioClienteGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaServicioClienteGenerico!=null && jComboBoxid_bodegaServicioClienteGenerico.getItemCount()>0) {
					jComboBoxid_bodegaServicioClienteGenerico.setSelectedIndex(0);
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

					if(this.serviciocliente!=null) {
						this.serviciocliente.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoServicioCliente.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoServicioCliente!=null) {
						jComboBoxid_productoFK_IdProductoServicioCliente.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoServicioCliente!=null) {
							//jComboBoxid_productoFK_IdProductoServicioCliente.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoServicioCliente.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoServicioCliente.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoServicioClienteGenerico)throws Exception
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
				jComboBoxid_productoServicioClienteGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoServicioClienteGenerico!=null && jComboBoxid_productoServicioClienteGenerico.getItemCount()>0) {
					jComboBoxid_productoServicioClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoPrecioForeignKey(Long idTipoPrecioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoPrecio  tipoprecioTemp=null;

			for(TipoPrecio tipoprecioAux:tipopreciosForeignKey) {
				if(tipoprecioAux.getId()!=null && tipoprecioAux.getId().equals(idTipoPrecioSeleccionado)) {
					tipoprecioTemp=tipoprecioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprecioTemp!=null) {

					if(this.serviciocliente!=null) {
						this.serviciocliente.setTipoPrecio(tipoprecioTemp);
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.setSelectedItem(tipoprecioTemp);
					}
				} else {
					//jComboBoxid_tipo_precioServicioCliente.setSelectedItem(tipoprecioTemp);
					if(this.jInternalFrameDetalleFormServicioCliente!=null) {
						if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPrecio") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprecioTemp!=null && jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente!=null) {
						jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.setSelectedItem(tipoprecioTemp);
					} else {
						if(jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente!=null) {
							//jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.setSelectedItem(tipoprecioTemp);
							if(jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.getItemCount()>0) {
								jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.setSelectedIndex(0);
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

	public String getActualTipoPrecioForeignKeyDescripcion(Long idTipoPrecioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoPrecio  tipoprecioTemp=null;

			for(TipoPrecio tipoprecioAux:tipopreciosForeignKey) {
				if(tipoprecioAux.getId()!=null && tipoprecioAux.getId().equals(idTipoPrecioSeleccionado)) {
					tipoprecioTemp=tipoprecioAux;
					break;
				}
			}


			sDescripcion=TipoPrecioConstantesFunciones.getTipoPrecioDescripcion(tipoprecioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoPrecioForeignKeyGenerico(Long idTipoPrecioSeleccionado,JComboBox jComboBoxid_tipo_precioServicioClienteGenerico)throws Exception
	{
		try
		{
			TipoPrecio  tipoprecioTemp=null;

			for(TipoPrecio tipoprecioAux:tipopreciosForeignKey) {
				if(tipoprecioAux.getId()!=null && tipoprecioAux.getId().equals(idTipoPrecioSeleccionado)) {
					tipoprecioTemp=tipoprecioAux;
					break;
				}
			}

			if(tipoprecioTemp!=null) {
				jComboBoxid_tipo_precioServicioClienteGenerico.setSelectedItem(tipoprecioTemp);
			} else {
				if(jComboBoxid_tipo_precioServicioClienteGenerico!=null && jComboBoxid_tipo_precioServicioClienteGenerico.getItemCount()>0) {
					jComboBoxid_tipo_precioServicioClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ServicioCliente serviciocliente,JComboBox jComboBoxid_empresaServicioClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaServicioClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaServicioClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				serviciocliente.setid_empresa(empresaAux.getId());
				serviciocliente.setempresa_descripcion(ServicioClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				serviciocliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ServicioCliente serviciocliente,JComboBox jComboBoxid_clienteServicioClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteServicioClienteGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteServicioClienteGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				serviciocliente.setid_cliente(clienteAux.getId());
				serviciocliente.setcliente_descripcion(ServicioClienteConstantesFunciones.getClienteDescripcion(clienteAux));
				serviciocliente.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ServicioCliente serviciocliente,JComboBox jComboBoxid_bodegaServicioClienteGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaServicioClienteGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaServicioClienteGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				serviciocliente.setid_bodega(bodegaAux.getId());
				serviciocliente.setbodega_descripcion(ServicioClienteConstantesFunciones.getBodegaDescripcion(bodegaAux));
				serviciocliente.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ServicioCliente serviciocliente,JComboBox jComboBoxid_productoServicioClienteGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoServicioClienteGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoServicioClienteGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				serviciocliente.setid_producto(productoAux.getId());
				serviciocliente.setproducto_descripcion(ServicioClienteConstantesFunciones.getProductoDescripcion(productoAux));
				serviciocliente.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPrecioForeignKey(ServicioCliente serviciocliente,JComboBox jComboBoxid_tipo_precioServicioClienteGenerico)throws Exception
	{
		try
		{
			TipoPrecio  tipoprecioAux=new TipoPrecio();

			if(jComboBoxid_tipo_precioServicioClienteGenerico==null) {
				tipoprecioAux=(TipoPrecio)this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.getSelectedItem();
			} else {
				tipoprecioAux=(TipoPrecio)jComboBoxid_tipo_precioServicioClienteGenerico.getSelectedItem();
			}

			if(tipoprecioAux!=null && tipoprecioAux.getId()!=null) {
				serviciocliente.setid_tipo_precio(tipoprecioAux.getId());
				serviciocliente.settipoprecio_descripcion(ServicioClienteConstantesFunciones.getTipoPrecioDescripcion(tipoprecioAux));
				serviciocliente.setTipoPrecio(tipoprecioAux);			}
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

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
					}

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
					}

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteServicioCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteServicioCliente.addItem(cliente);
							}
						}

						if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
					}

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaServicioCliente.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaServicioCliente.addItem(bodega);
							}
						}

						if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
					}

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoServicioCliente.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoServicioCliente.addItem(producto);
							}
						}

						if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoPreciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoPrecio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.removeAllItems();

							for(TipoPrecio tipoprecio:this.tipopreciosForeignKey) {
								this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.addItem(tipoprecio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormServicioCliente!=null) { 
					}

					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPrecio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.removeAllItems();

							for(TipoPrecio tipoprecio:this.tipopreciosForeignKey) {
								this.jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.addItem(tipoprecio);
							}
						}

						if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteServicioCliente.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteServicioCliente.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaServicioCliente.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaServicioCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoServicioCliente.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoServicioCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoPrecioForeignKey(TipoPrecio tipoprecio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.setSelectedItem(tipoprecio);
						}
					} else {
						if(this.jInternalFrameDetalleFormServicioCliente!=null) {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.setSelectedItem(tipoprecio);
						} else {
							this.jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesServicioCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ServicioClienteConstantesFunciones.refrescarForeignKeysDescripcionesServicioCliente(this.servicioclienteLogic.getServicioClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ServicioClienteConstantesFunciones.refrescarForeignKeysDescripcionesServicioCliente(this.servicioclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(TipoPrecio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//servicioclienteLogic.setServicioClientes(this.servicioclientes);
			servicioclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ServicioClienteParameterReturnGeneral getServicioClienteParameterGeneral() {
		return this.servicioclienteParameterGeneral;
	}
	
	public void setServicioClienteParameterGeneral(ServicioClienteParameterReturnGeneral servicioclienteParameterGeneral) {
		this.servicioclienteParameterGeneral = servicioclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoServicioCliente() {
		return isPermisoTodoServicioCliente;
	}

	public void setIsPermisoTodoServicioCliente(Boolean isPermisoTodoServicioCliente) {
		this.isPermisoTodoServicioCliente = isPermisoTodoServicioCliente;
	}

	public Boolean getIsPermisoNuevoServicioCliente() {
		return isPermisoNuevoServicioCliente;
	}

	public void setIsPermisoNuevoServicioCliente(Boolean isPermisoNuevoServicioCliente) {
		this.isPermisoNuevoServicioCliente = isPermisoNuevoServicioCliente;
	}

	public Boolean getIsPermisoActualizarServicioCliente() {
		return isPermisoActualizarServicioCliente;
	}

	public void setIsPermisoActualizarServicioCliente(Boolean isPermisoActualizarServicioCliente) {
		this.isPermisoActualizarServicioCliente = isPermisoActualizarServicioCliente;
	}

	public Boolean getIsPermisoEliminarServicioCliente() {
		return isPermisoEliminarServicioCliente;
	}

	public void setIsPermisoEliminarServicioCliente(Boolean isPermisoEliminarServicioCliente) {
		this.isPermisoEliminarServicioCliente = isPermisoEliminarServicioCliente;
	}

	public Boolean getIsPermisoGuardarCambiosServicioCliente() {
		return isPermisoGuardarCambiosServicioCliente;
	}

	public void setIsPermisoGuardarCambiosServicioCliente(Boolean isPermisoGuardarCambiosServicioCliente) {
		this.isPermisoGuardarCambiosServicioCliente = isPermisoGuardarCambiosServicioCliente;
	}
	
	public Boolean getIsPermisoConsultaServicioCliente() {
		return isPermisoConsultaServicioCliente;
	}

	public void setIsPermisoConsultaServicioCliente(Boolean isPermisoConsultaServicioCliente) {
		this.isPermisoConsultaServicioCliente = isPermisoConsultaServicioCliente;
	}

	public Boolean getIsPermisoBusquedaServicioCliente() {
		return isPermisoBusquedaServicioCliente;
	}

	public void setIsPermisoBusquedaServicioCliente(Boolean isPermisoBusquedaServicioCliente) {
		this.isPermisoBusquedaServicioCliente = isPermisoBusquedaServicioCliente;
	}

	public Boolean getIsPermisoReporteServicioCliente() {
		return isPermisoReporteServicioCliente;
	}

	public void setIsPermisoReporteServicioCliente(Boolean isPermisoReporteServicioCliente) {
		this.isPermisoReporteServicioCliente = isPermisoReporteServicioCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioServicioCliente() {
		return isPermisoPaginacionMedioServicioCliente;
	}

	public void setIsPermisoPaginacionMedioServicioCliente(Boolean isPermisoPaginacionMedioServicioCliente) {
		this.isPermisoPaginacionMedioServicioCliente = isPermisoPaginacionMedioServicioCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoServicioCliente() {
		return isPermisoPaginacionTodoServicioCliente;
	}

	public void setIsPermisoPaginacionTodoServicioCliente(Boolean isPermisoPaginacionTodoServicioCliente) {
		this.isPermisoPaginacionTodoServicioCliente = isPermisoPaginacionTodoServicioCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoServicioCliente() {
		return isPermisoPaginacionAltoServicioCliente;
	}

	public void setIsPermisoPaginacionAltoServicioCliente(Boolean isPermisoPaginacionAltoServicioCliente) {
		this.isPermisoPaginacionAltoServicioCliente = isPermisoPaginacionAltoServicioCliente;
	}
	
	public Boolean getIsPermisoCopiarServicioCliente() {
		return isPermisoCopiarServicioCliente;
	}

	public void setIsPermisoCopiarServicioCliente(Boolean isPermisoCopiarServicioCliente) {
		this.isPermisoCopiarServicioCliente = isPermisoCopiarServicioCliente;
	}
	
	public Boolean getIsPermisoVerFormServicioCliente() {
		return isPermisoVerFormServicioCliente;
	}

	public void setIsPermisoVerFormServicioCliente(Boolean isPermisoVerFormServicioCliente) {
		this.isPermisoVerFormServicioCliente = isPermisoVerFormServicioCliente;
	}
	
	public Boolean getIsPermisoDuplicarServicioCliente() {
		return isPermisoDuplicarServicioCliente;
	}

	public void setIsPermisoDuplicarServicioCliente(Boolean isPermisoDuplicarServicioCliente) {
		this.isPermisoDuplicarServicioCliente = isPermisoDuplicarServicioCliente;
	}
	
	public Boolean getIsPermisoOrdenServicioCliente() {
		return isPermisoOrdenServicioCliente;
	}

	public void setIsPermisoOrdenServicioCliente(Boolean isPermisoOrdenServicioCliente) {
		this.isPermisoOrdenServicioCliente = isPermisoOrdenServicioCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoServicioCliente() {
		return isVisibilidadCeldaNuevoServicioCliente;
	}

	public void setIsVisibilidadCeldaNuevoServicioCliente(Boolean isVisibilidadCeldaNuevoServicioCliente) {
		this.isVisibilidadCeldaNuevoServicioCliente = isVisibilidadCeldaNuevoServicioCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarServicioCliente() {
		return isVisibilidadCeldaDuplicarServicioCliente;
	}

	public void setIsVisibilidadCeldaDuplicarServicioCliente(Boolean isVisibilidadCeldaDuplicarServicioCliente) {
		this.isVisibilidadCeldaDuplicarServicioCliente = isVisibilidadCeldaDuplicarServicioCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarServicioCliente() {
		return isVisibilidadCeldaCopiarServicioCliente;
	}

	public void setIsVisibilidadCeldaCopiarServicioCliente(Boolean isVisibilidadCeldaCopiarServicioCliente) {
		this.isVisibilidadCeldaCopiarServicioCliente = isVisibilidadCeldaCopiarServicioCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormServicioCliente() {
		return isVisibilidadCeldaVerFormServicioCliente;
	}

	public void setIsVisibilidadCeldaVerFormServicioCliente(Boolean isVisibilidadCeldaVerFormServicioCliente) {
		this.isVisibilidadCeldaVerFormServicioCliente = isVisibilidadCeldaVerFormServicioCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenServicioCliente() {
		return isVisibilidadCeldaOrdenServicioCliente;
	}

	public void setIsVisibilidadCeldaOrdenServicioCliente(Boolean isVisibilidadCeldaOrdenServicioCliente) {
		this.isVisibilidadCeldaOrdenServicioCliente = isVisibilidadCeldaOrdenServicioCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesServicioCliente() {
		return isVisibilidadCeldaNuevoRelacionesServicioCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesServicioCliente(Boolean isVisibilidadCeldaNuevoRelacionesServicioCliente) {
		this.isVisibilidadCeldaNuevoRelacionesServicioCliente = isVisibilidadCeldaNuevoRelacionesServicioCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarServicioCliente() {
		return isVisibilidadCeldaModificarServicioCliente;
	}

	public void setIsVisibilidadCeldaModificarServicioCliente(Boolean isVisibilidadCeldaModificarServicioCliente) {
		this.isVisibilidadCeldaModificarServicioCliente = isVisibilidadCeldaModificarServicioCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarServicioCliente() {
		return isVisibilidadCeldaActualizarServicioCliente;
	}

	public void setIsVisibilidadCeldaActualizarServicioCliente(Boolean isVisibilidadCeldaActualizarServicioCliente) {
		this.isVisibilidadCeldaActualizarServicioCliente = isVisibilidadCeldaActualizarServicioCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarServicioCliente() {
		return isVisibilidadCeldaEliminarServicioCliente;
	}

	public void setIsVisibilidadCeldaEliminarServicioCliente(Boolean isVisibilidadCeldaEliminarServicioCliente) {
		this.isVisibilidadCeldaEliminarServicioCliente = isVisibilidadCeldaEliminarServicioCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarServicioCliente() {
		return isVisibilidadCeldaCancelarServicioCliente;
	}

	public void setIsVisibilidadCeldaCancelarServicioCliente(Boolean isVisibilidadCeldaCancelarServicioCliente) {
		this.isVisibilidadCeldaCancelarServicioCliente = isVisibilidadCeldaCancelarServicioCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarServicioCliente() {
		return isVisibilidadCeldaGuardarServicioCliente;
	}

	public void setIsVisibilidadCeldaGuardarServicioCliente(Boolean isVisibilidadCeldaGuardarServicioCliente) {
		this.isVisibilidadCeldaGuardarServicioCliente = isVisibilidadCeldaGuardarServicioCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosServicioCliente() {
		return isVisibilidadCeldaGuardarCambiosServicioCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosServicioCliente(Boolean isVisibilidadCeldaGuardarCambiosServicioCliente) {
		this.isVisibilidadCeldaGuardarCambiosServicioCliente = isVisibilidadCeldaGuardarCambiosServicioCliente;
	}
		
	public ServicioClienteSessionBean getservicioclienteSessionBean() {
		return this.servicioclienteSessionBean;
	}
	
	public void setservicioclienteSessionBean(ServicioClienteSessionBean servicioclienteSessionBean) {
		this.servicioclienteSessionBean=servicioclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
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

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdTipoPrecio() {
		return this.isVisibilidadFK_IdTipoPrecio;
	}

	public void setisVisibilidadFK_IdTipoPrecio(Boolean isVisibilidadFK_IdTipoPrecio) {
		this.isVisibilidadFK_IdTipoPrecio=isVisibilidadFK_IdTipoPrecio;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysServicioCliente(ServicioCliente serviciocliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(serviciocliente,null);
				this.setActualParaGuardarClienteForeignKey(serviciocliente,null);
				this.setActualParaGuardarBodegaForeignKey(serviciocliente,null);
				this.setActualParaGuardarProductoForeignKey(serviciocliente,null);
				this.setActualParaGuardarTipoPrecioForeignKey(serviciocliente,null);
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
	
	public void bugActualizarReferenciaActual(ServicioCliente serviciocliente,ServicioCliente servicioclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalServicioCliente(serviciocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		servicioclienteAux.setId(serviciocliente.getId());
		servicioclienteAux.setVersionRow(serviciocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessServicioCliente();
		
			int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = servicioclienteValidator.getInvalidValues(this.serviciocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			servicioclienteLogic.setDatosCliente(datosCliente);
			servicioclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				servicioclienteAux=new  ServicioCliente();
				
				servicioclienteAux.setIsNew(true);
				servicioclienteAux.setIsChanged(true);
				
				servicioclienteAux.setServicioClienteOriginal(this.serviciocliente);
				
				servicioclienteAux.setId(this.serviciocliente.getId());	
				servicioclienteAux.setVersionRow(this.serviciocliente.getVersionRow());	
				servicioclienteAux.setid_empresa(this.serviciocliente.getid_empresa());	
				servicioclienteAux.setid_cliente(this.serviciocliente.getid_cliente());	
				servicioclienteAux.setid_bodega(this.serviciocliente.getid_bodega());	
				servicioclienteAux.setid_producto(this.serviciocliente.getid_producto());	
				servicioclienteAux.setid_tipo_precio(this.serviciocliente.getid_tipo_precio());	
				servicioclienteAux.setprecio(this.serviciocliente.getprecio());	
				servicioclienteAux.setdescripcion(this.serviciocliente.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.servicioclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(servicioclienteAux,servicioclienteLogic.getServicioClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(servicioclienteAux,servicioclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.servicioclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.servicioclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteLogic.saveServicioClientes();//WithConnection
						//servicioclienteLogic.getSetVersionRowServicioClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.serviciocliente,servicioclienteAux);
					
					this.refrescarForeignKeysDescripcionesServicioCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								servicioclienteLogic.saveServicioClienteRelaciones(servicioclienteAux);//WithConnection
								//servicioclienteLogic.getSetVersionRowServicioClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.serviciocliente,servicioclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.servicioclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(servicioclienteAux,servicioclienteLogic.getServicioClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(servicioclienteAux,servicioclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.serviciocliente,servicioclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				servicioclienteAux=new  ServicioCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.servicioclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.servicioclienteSessionBean.getEsGuardarRelacionado() && this.serviciocliente.getId()>=0)) {
						
					servicioclienteAux.setIsNew(false);
				}
				
				servicioclienteAux.setIsDeleted(false);
			
				servicioclienteAux.setId(this.serviciocliente.getId());	
				servicioclienteAux.setVersionRow(this.serviciocliente.getVersionRow());	
				servicioclienteAux.setid_empresa(this.serviciocliente.getid_empresa());	
				servicioclienteAux.setid_cliente(this.serviciocliente.getid_cliente());	
				servicioclienteAux.setid_bodega(this.serviciocliente.getid_bodega());	
				servicioclienteAux.setid_producto(this.serviciocliente.getid_producto());	
				servicioclienteAux.setid_tipo_precio(this.serviciocliente.getid_tipo_precio());	
				servicioclienteAux.setprecio(this.serviciocliente.getprecio());	
				servicioclienteAux.setdescripcion(this.serviciocliente.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(servicioclienteAux,servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(servicioclienteAux,servicioclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.servicioclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.servicioclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteLogic.saveServicioClientes();//WithConnection
						//servicioclienteLogic.getSetVersionRowServicioClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.serviciocliente,servicioclienteAux);
					
					this.refrescarForeignKeysDescripcionesServicioCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								servicioclienteLogic.saveServicioClienteRelaciones(servicioclienteAux);//WithConnection
								//servicioclienteLogic.getSetVersionRowServicioClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.serviciocliente,servicioclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.servicioclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(servicioclienteAux,servicioclienteLogic.getServicioClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(servicioclienteAux,servicioclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.serviciocliente,servicioclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				servicioclienteAux=new  ServicioCliente();
				
				servicioclienteAux.setIsNew(false);
				servicioclienteAux.setIsChanged(false);
				
				servicioclienteAux.setIsDeleted(true);
				
				servicioclienteAux.setId(this.serviciocliente.getId());	
				servicioclienteAux.setVersionRow(this.serviciocliente.getVersionRow());	
				servicioclienteAux.setid_empresa(this.serviciocliente.getid_empresa());	
				servicioclienteAux.setid_cliente(this.serviciocliente.getid_cliente());	
				servicioclienteAux.setid_bodega(this.serviciocliente.getid_bodega());	
				servicioclienteAux.setid_producto(this.serviciocliente.getid_producto());	
				servicioclienteAux.setid_tipo_precio(this.serviciocliente.getid_tipo_precio());	
				servicioclienteAux.setprecio(this.serviciocliente.getprecio());	
				servicioclienteAux.setdescripcion(this.serviciocliente.getdescripcion());	
				
				if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.servicioclienteAux.getId()>=0) {	
						this.servicioclientesEliminados.add(servicioclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(servicioclienteAux,servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(servicioclienteAux,servicioclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.servicioclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.servicioclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteLogic.saveServicioClientes();//WithConnection
						//servicioclienteLogic.getSetVersionRowServicioClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								servicioclienteLogic.saveServicioClienteRelaciones(servicioclienteAux);//WithConnection
								//servicioclienteLogic.getSetVersionRowServicioClientes();//WithConnection
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
							if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.servicioclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(servicioclienteAux,servicioclienteLogic.getServicioClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(servicioclienteAux,servicioclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.getServicioClientes().addAll(this.servicioclientesEliminados);
					
					servicioclienteLogic.saveServicioClientes();//WithConnection
					//servicioclienteLogic.getSetVersionRowServicioClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesServicioCliente();
				
				this.servicioclientesEliminados= new ArrayList<ServicioCliente>();		
			}
			
			if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Servicio Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.serviciocliente=servicioclienteAux;
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
      		//this.finishProcessServicioCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(ServicioCliente servicioclienteLocal) throws Exception {
		
		if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ServicioCliente servicioclienteLocal) throws Exception {	
		if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				servicioclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				servicioclienteLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				servicioclienteLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				servicioclienteLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPrecioDetalleFormJInternalFrame.class)) {
				TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrameLocal=(TipoPrecioBeanSwingJInternalFrame) ((TipoPrecioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprecioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPrecio(tipoprecioBeanSwingJInternalFrameLocal.gettipoprecio(),true);
				tipoprecioBeanSwingJInternalFrameLocal.actualizarLista(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio,this.tipopreciosForeignKey);

				tipoprecioBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio);

				servicioclienteLocal.setTipoPrecio(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio);

				this.addItemDefectoCombosForeignKeyTipoPrecio();
				this.cargarCombosFrameTipoPreciosForeignKey("Formulario");
				this.setActualTipoPrecioForeignKey(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarServicioClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = servicioclienteValidator.getInvalidValues(this.serviciocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ServicioCliente serviciocliente,List<ServicioCliente> servicioclientes) throws Exception {
		try	{		
			ServicioClienteConstantesFunciones.actualizarLista(serviciocliente,servicioclientes,this.servicioclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ServicioCliente serviciocliente,List<ServicioCliente> servicioclientes) throws Exception {
		try	{			
			ServicioClienteConstantesFunciones.actualizarSelectedLista(serviciocliente,servicioclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ServicioCliente> servicioclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				servicioclientesLocal=this.servicioclienteLogic.getServicioClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				servicioclientesLocal=this.servicioclientes;
			}
			//ARCHITECTURE
		
			for(ServicioCliente servicioclienteLocal:servicioclientesLocal) {
				if(this.permiteMantenimiento(servicioclienteLocal) && servicioclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ServicioClienteConstantesFunciones.getServicioClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ServicioClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabelid_empresaServicioCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ServicioClienteConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabelid_clienteServicioCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ServicioClienteConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabelid_bodegaServicioCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ServicioClienteConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabelid_productoServicioCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ServicioClienteConstantesFunciones.IDTIPOPRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabelid_tipo_precioServicioCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ServicioClienteConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabelprecioServicioCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ServicioClienteConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabeldescripcionServicioCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormServicioCliente.jLabelid_empresaServicioCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormServicioCliente.jLabelid_clienteServicioCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormServicioCliente.jLabelid_bodegaServicioCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormServicioCliente.jLabelid_productoServicioCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormServicioCliente.jLabelid_tipo_precioServicioCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormServicioCliente.jLabelprecioServicioCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormServicioCliente.jLabeldescripcionServicioCliente,"");
		
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
		this.iIdNuevoServicioCliente--;	
		
		
		this.servicioclienteAux=new ServicioCliente();
		
		this.servicioclienteAux.setId(this.iIdNuevoServicioCliente);
		this.servicioclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.servicioclienteLogic.getServicioClientes().add(this.servicioclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.servicioclientes.add(this.servicioclienteAux);
		}
		//ARCHITECTURE
		
		this.serviciocliente=this.servicioclienteAux;
		
		if(ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioServicioCliente(this.serviciocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyServicioCliente(this.serviciocliente);
		}
				
		//this.setDefaultControlesServicioCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyServicioCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyServicioCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyServicioCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualServicioCliente(this.servicioclienteBean,this.serviciocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ServicioClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {
			classes=ServicioClienteConstantesFunciones.getClassesRelationshipsOfServicioCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.servicioclienteReturnGeneral=servicioclienteLogic.procesarEventosServicioClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.servicioclienteLogic.getServicioClientes(),this.serviciocliente,this.servicioclienteParameterGeneral,this.isEsNuevoServicioCliente,classes);//this.servicioclienteLogic.getServicioCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanServicioCliente(this.servicioclienteReturnGeneral,this.servicioclienteBean,false);
		
		if(this.servicioclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyServicioCliente(this.servicioclienteReturnGeneral.getServicioCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioServicioCliente(this.servicioclienteReturnGeneral.getServicioCliente());
		}
		
		if(this.servicioclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioServicioCliente(this.servicioclienteReturnGeneral.getServicioCliente(),classes);//this.servicioclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyServicioCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyServicioCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ServicioClienteBeanSwingJInternalFrameAdditional.RecargarFormServicioCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingServicioCliente(false);
						
			if(servicioclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualServicioCliente();
			}
			
			this.actualizarVisualTableDatosServicioCliente();
			
			this.jTableDatosServicioCliente.setRowSelectionInterval(this.getIndiceNuevoServicioCliente(), this.getIndiceNuevoServicioCliente());
			
			this.seleccionarFilaTablaServicioClienteActual();
						
			this.actualizarEstadoCeldasBotonesServicioCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesServicioCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormServicioCliente.jTextFieldprecioServicioCliente.setEnabled(isHabilitar && this.servicioclienteConstantesFunciones.activarprecioServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jTextAreadescripcionServicioCliente.setEnabled(isHabilitar && this.servicioclienteConstantesFunciones.activardescripcionServicioCliente);	
		//
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.setEnabled(isHabilitar && this.servicioclienteConstantesFunciones.activarid_empresaServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.setEnabled(isHabilitar && this.servicioclienteConstantesFunciones.activarid_clienteServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.setEnabled(isHabilitar && this.servicioclienteConstantesFunciones.activarid_bodegaServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.setEnabled(isHabilitar && this.servicioclienteConstantesFunciones.activarid_productoServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.setEnabled(isHabilitar && this.servicioclienteConstantesFunciones.activarid_tipo_precioServicioCliente);
	};
	
	public void setDefaultControlesServicioCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoServicioCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.servicioclienteSessionBean.setConGuardarRelaciones(true);			
			this.servicioclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormServicioCliente.jTabbedPaneRelacionesServicioCliente.setVisible(true);
			
					
		} else {
			//this.servicioclienteSessionBean.setConGuardarRelaciones(false);			
			this.servicioclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormServicioCliente.jTabbedPaneRelacionesServicioCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoServicioCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ServicioCliente servicioclienteAux:this.servicioclienteLogic.getServicioClientes()) {
				if(servicioclienteAux.getId().equals(this.iIdNuevoServicioCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ServicioCliente servicioclienteAux:this.servicioclientes) {
				if(servicioclienteAux.getId().equals(this.iIdNuevoServicioCliente)) {
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
	
	public int getIndiceActualServicioCliente(ServicioCliente serviciocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ServicioCliente servicioclienteAux:this.servicioclienteLogic.getServicioClientes()) {
				if(servicioclienteAux.getId().equals(serviciocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ServicioCliente servicioclienteAux:this.servicioclientes) {
				if(servicioclienteAux.getId().equals(serviciocliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalServicioCliente(ServicioCliente servicioclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ServicioCliente servicioclienteAux:this.servicioclienteLogic.getServicioClientes()) {
				if(servicioclienteAux.getServicioClienteOriginal().getId().equals(servicioclienteOriginal.getId())) {
					existe=true;
					servicioclienteOriginal.setId(servicioclienteAux.getId());
					servicioclienteOriginal.setVersionRow(servicioclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ServicioCliente servicioclienteAux:this.servicioclientes) {
				if(servicioclienteAux.getServicioClienteOriginal().getId().equals(servicioclienteOriginal.getId())) {
					existe=true;
					servicioclienteOriginal.setId(servicioclienteAux.getId());
					servicioclienteOriginal.setVersionRow(servicioclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosServicioCliente(Boolean esParaCancelar) throws Exception {
		servicioclientesAux=new ArrayList<ServicioCliente>();
		servicioclienteAux=new ServicioCliente();
		
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ServicioCliente servicioclienteAux:this.servicioclienteLogic.getServicioClientes()) {
					if(servicioclienteAux.getId()<0) {
						servicioclientesAux.add(servicioclienteAux);
					}		
				}
				this.iIdNuevoServicioCliente=0L;
				this.servicioclienteLogic.getServicioClientes().removeAll(servicioclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ServicioCliente servicioclienteAux:this.servicioclientes) {
					if(servicioclienteAux.getId()<0) {
						servicioclientesAux.add(servicioclienteAux);
					}		
				}
				this.iIdNuevoServicioCliente=0L;
				this.servicioclientes.removeAll(servicioclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoServicioCliente 
					&& this.servicioclienteLogic.getServicioClientes().size()>0
					) {
					servicioclienteAux=this.servicioclienteLogic.getServicioClientes().get(this.servicioclienteLogic.getServicioClientes().size() - 1);
				
					if(servicioclienteAux.getId()<0) {
						this.servicioclienteLogic.getServicioClientes().remove(servicioclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoServicioCliente && this.servicioclientes.size()>0) {
					servicioclienteAux=this.servicioclientes.get(this.servicioclientes.size() - 1);
				
					if(servicioclienteAux.getId()<0) {
						this.servicioclientes.remove(servicioclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoServicioCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(serviciocliente.getId()<0) {
				this.servicioclienteLogic.getServicioClientes().remove(this.serviciocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(serviciocliente.getId()<0) {
				this.servicioclientes.remove(this.serviciocliente);
			}
		}			
	}
	
	public void setEstadosInicialesServicioCliente(List<ServicioCliente> servicioclientesAux) throws Exception {
		ServicioClienteConstantesFunciones.setEstadosInicialesServicioCliente(servicioclientesAux);
	}
	
	public void setEstadosInicialesServicioCliente(ServicioCliente servicioclienteAux) throws Exception {
		ServicioClienteConstantesFunciones.setEstadosInicialesServicioCliente(servicioclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarServicioClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesServicioCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarServicioClienteActual()) {
				if(!this.isEsNuevoServicioCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesServicioCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoServicioCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarServicioClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Servicio Cliente ?", "MANTENIMIENTO DE Servicio Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesServicioCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ServicioCliente serviciocliente) throws Exception {
		ServicioClienteConstantesFunciones.seleccionarAsignar(this.serviciocliente,serviciocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarServicioCliente=this.isPermisoActualizarOriginalServicioCliente;
			
			
			this.seleccionarAsignar(serviciocliente);
			
			

			idClienteActual=serviciocliente.getid_cliente();
			this.seleccionarClienteActual();

			idProductoActual=serviciocliente.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ServicioClienteConstantesFunciones.quitarEspaciosServicioCliente(this.serviciocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesServicioCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.servicioclienteSessionBean.setsFuncionBusquedaRapida(this.servicioclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
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
			if(this.isEsNuevoServicioCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosServicioCliente(esParaCancelar);				
				this.cancelarNuevoServicioCliente(esParaCancelar);								
			}
			
			this.serviciocliente=new ServicioCliente();
			
			this.inicializarServicioCliente();
			
			this.actualizarEstadoCeldasBotonesServicioCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarServicioCliente() throws Exception {
		try {
			ServicioClienteConstantesFunciones.inicializarServicioCliente(this.serviciocliente);
			
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
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.servicioclienteLogic.getServicioClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteServicioClientes(String sAccionBusqueda,List<ServicioCliente> servicioclientesParaReportes) throws Exception {
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
					sPathReporteFinal="ServicioCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ServicioClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ServicioClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ServicioCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Servicio Clientes");		
		parameters.put("busquedapor", ServicioClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceServicioCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ServicioClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ServicioClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceServicioCliente=new JRBeanArrayDataSource(ServicioClienteJInternalFrame.TraerServicioClienteBeans(servicioclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceServicioCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ServicioClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ServicioClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ServicioClienteBean.TraerServicioClienteBeans(servicioclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteServicioClientes(sAccionBusqueda,sTipoArchivoReporte,servicioclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalServicioClientes(sAccionBusqueda,sTipoArchivoReporte,servicioclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoServicioClienteActionPerformed(null);
					//this.generarExcelReporteServicioClientes(sAccionBusqueda,sTipoArchivoReporte,servicioclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalServicioClientes(sAccionBusqueda,sTipoArchivoReporte,servicioclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesServicioClientes(sAccionBusqueda,sTipoArchivoReporte,servicioclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesServicioClientes(sAccionBusqueda,sTipoArchivoReporte,servicioclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteServicioClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<ServicioCliente> servicioclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serviciocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ServicioClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderServicioCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ServicioCliente serviciocliente : servicioclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ServicioClienteConstantesFunciones.generarExcelReporteDataServicioCliente("NORMAL",row,workbook,serviciocliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderServicioCliente(String sTipo,Row row,Workbook workbook) {
		
		ServicioClienteConstantesFunciones.generarExcelReporteHeaderServicioCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalServicioClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<ServicioCliente> servicioclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serviciocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ServicioClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ServicioCliente serviciocliente : servicioclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ServicioClienteConstantesFunciones.getServicioClienteDescripcion(serviciocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ServicioClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serviciocliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ServicioClienteConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serviciocliente.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ServicioClienteConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serviciocliente.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serviciocliente.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serviciocliente.gettipoprecio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ServicioClienteConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serviciocliente.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ServicioClienteConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serviciocliente.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesServicioClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<ServicioCliente> servicioclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ServicioCliente> servicioclientesRespaldo=null;
		
		classes=ServicioClienteConstantesFunciones.getClassesRelationshipsOfServicioCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.servicioclienteLogic.setDatosCliente(this.datosCliente);
		this.servicioclienteLogic.setDatosDeep(this.datosDeep);
		this.servicioclienteLogic.setIsConDeep(true);
		
		servicioclientesRespaldo=this.servicioclienteLogic.getServicioClientes();
		
		this.servicioclienteLogic.setServicioClientes(servicioclientesParaReportes);	
		this.servicioclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		servicioclientesParaReportes=this.servicioclienteLogic.getServicioClientes();
		this.servicioclienteLogic.setServicioClientes(servicioclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serviciocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ServicioClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderServicioCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ServicioCliente serviciocliente : servicioclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderServicioCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ServicioClienteConstantesFunciones.generarExcelReporteDataServicioCliente("NORMAL",row,workbook,serviciocliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ServicioClienteConstantesFunciones.getServicioClienteDescripcion(serviciocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoServicioCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessServicioCliente() throws Exception {		
		this.startProcessServicioCliente(true);
	}
	
	public void startProcessServicioCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasServicioCliente ,this.jPanelParametrosReportesServicioCliente, this.jScrollPanelDatosServicioCliente,this.jPanelPaginacionServicioCliente, this.jScrollPanelDatosEdicionServicioCliente, this.jPanelAccionesServicioCliente,this.jPanelAccionesFormularioServicioCliente,this.jmenuBarServicioCliente,this.jmenuBarDetalleServicioCliente,this.jTtoolBarServicioCliente,this.jTtoolBarDetalleServicioCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasServicioCliente=this.jTabbedPaneBusquedasServicioCliente; 
		
		final JPanel jPanelParametrosReportesServicioCliente=this.jPanelParametrosReportesServicioCliente;
		//final JScrollPane jScrollPanelDatosServicioCliente=this.jScrollPanelDatosServicioCliente;
		final JTable jTableDatosServicioCliente=this.jTableDatosServicioCliente;		
		final JPanel jPanelPaginacionServicioCliente=this.jPanelPaginacionServicioCliente;
		//final JScrollPane jScrollPanelDatosEdicionServicioCliente=this.jScrollPanelDatosEdicionServicioCliente;
		final JPanel jPanelAccionesServicioCliente=this.jPanelAccionesServicioCliente;
		
		JPanel jPanelCamposAuxiliarServicioCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarServicioCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			jPanelCamposAuxiliarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jPanelCamposServicioCliente;
			jPanelAccionesFormularioAuxiliarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jPanelAccionesFormularioServicioCliente;
		}
		
		final JPanel jPanelCamposServicioCliente=jPanelCamposAuxiliarServicioCliente;
		final JPanel jPanelAccionesFormularioServicioCliente=jPanelAccionesFormularioAuxiliarServicioCliente;
		
		
		final JMenuBar jmenuBarServicioCliente=this.jmenuBarServicioCliente;
		final JToolBar jTtoolBarServicioCliente=this.jTtoolBarServicioCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarServicioCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarServicioCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			jmenuBarDetalleAuxiliarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jmenuBarDetalleServicioCliente;
			jTtoolBarDetalleAuxiliarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jTtoolBarDetalleServicioCliente;
		}
		
		final JMenuBar jmenuBarDetalleServicioCliente=jmenuBarDetalleAuxiliarServicioCliente;
		final JToolBar jTtoolBarDetalleServicioCliente=jTtoolBarDetalleAuxiliarServicioCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasServicioCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesServicioCliente;
			processRunnable.jTableDatos=jTableDatosServicioCliente;
			processRunnable.jPanelCampos=jPanelCamposServicioCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionServicioCliente;
			processRunnable.jPanelAcciones=jPanelAccionesServicioCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioServicioCliente;
			
			
			processRunnable.jmenuBar=jmenuBarServicioCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleServicioCliente;
			processRunnable.jTtoolBar=jTtoolBarServicioCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleServicioCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasServicioCliente ,jPanelParametrosReportesServicioCliente,jTableDatosServicioCliente, /*jScrollPanelDatosServicioCliente,*/jPanelCamposServicioCliente,jPanelPaginacionServicioCliente, /*jScrollPanelDatosEdicionServicioCliente,*/ jPanelAccionesServicioCliente,jPanelAccionesFormularioServicioCliente,jmenuBarServicioCliente,jmenuBarDetalleServicioCliente,jTtoolBarServicioCliente,jTtoolBarDetalleServicioCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasServicioCliente ,jPanelParametrosReportesServicioCliente, jScrollPanelDatosServicioCliente,jPanelPaginacionServicioCliente, jScrollPanelDatosEdicionServicioCliente, jPanelAccionesServicioCliente,jPanelAccionesFormularioServicioCliente,jmenuBarServicioCliente,jmenuBarDetalleServicioCliente,jTtoolBarServicioCliente,jTtoolBarDetalleServicioCliente);
						
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
	
	public void finishProcessServicioCliente() {// throws Exception 
		this.finishProcessServicioCliente(true);
	}
	
	public void finishProcessServicioCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasServicioCliente ,this.jPanelParametrosReportesServicioCliente, this.jScrollPanelDatosServicioCliente,this.jPanelPaginacionServicioCliente, this.jScrollPanelDatosEdicionServicioCliente, this.jPanelAccionesServicioCliente,this.jPanelAccionesFormularioServicioCliente,this.jmenuBarServicioCliente,this.jmenuBarDetalleServicioCliente,this.jTtoolBarServicioCliente,this.jTtoolBarDetalleServicioCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasServicioCliente=this.jTabbedPaneBusquedasServicioCliente; 
		
		final JPanel jPanelParametrosReportesServicioCliente=this.jPanelParametrosReportesServicioCliente;
		//final JScrollPane jScrollPanelDatosServicioCliente=this.jScrollPanelDatosServicioCliente;
		final JTable jTableDatosServicioCliente=this.jTableDatosServicioCliente;		
		final JPanel jPanelPaginacionServicioCliente=this.jPanelPaginacionServicioCliente;
		//final JScrollPane jScrollPanelDatosEdicionServicioCliente=this.jScrollPanelDatosEdicionServicioCliente;
		final JPanel jPanelAccionesServicioCliente=this.jPanelAccionesServicioCliente;
		
		JPanel jPanelCamposAuxiliarServicioCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarServicioCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			jPanelCamposAuxiliarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jPanelCamposServicioCliente;
			jPanelAccionesFormularioAuxiliarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jPanelAccionesFormularioServicioCliente;
		}
		
		final JPanel jPanelCamposServicioCliente=jPanelCamposAuxiliarServicioCliente;
		final JPanel jPanelAccionesFormularioServicioCliente=jPanelAccionesFormularioAuxiliarServicioCliente;
		
		
		final JMenuBar jmenuBarServicioCliente=this.jmenuBarServicioCliente;		
		final JToolBar jTtoolBarServicioCliente=this.jTtoolBarServicioCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarServicioCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarServicioCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			jmenuBarDetalleAuxiliarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jmenuBarDetalleServicioCliente;
			jTtoolBarDetalleAuxiliarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jTtoolBarDetalleServicioCliente;		
		}
		
		final JMenuBar jmenuBarDetalleServicioCliente=jmenuBarDetalleAuxiliarServicioCliente;
		final JToolBar jTtoolBarDetalleServicioCliente=jTtoolBarDetalleAuxiliarServicioCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasServicioCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesServicioCliente;
			processRunnable.jTableDatos=jTableDatosServicioCliente;
			processRunnable.jPanelCampos=jPanelCamposServicioCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionServicioCliente;
			processRunnable.jPanelAcciones=jPanelAccionesServicioCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioServicioCliente;
			
			
			processRunnable.jmenuBar=jmenuBarServicioCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleServicioCliente;
			processRunnable.jTtoolBar=jTtoolBarServicioCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleServicioCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasServicioCliente ,jPanelParametrosReportesServicioCliente, jTableDatosServicioCliente,/*jScrollPanelDatosServicioCliente,*/jPanelCamposServicioCliente,jPanelPaginacionServicioCliente, /*jScrollPanelDatosEdicionServicioCliente,*/ jPanelAccionesServicioCliente,jPanelAccionesFormularioServicioCliente,jmenuBarServicioCliente,jmenuBarDetalleServicioCliente,jTtoolBarServicioCliente,jTtoolBarDetalleServicioCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesServicioCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarServicioCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuServicioCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarServicioCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarServicioCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleServicioCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuServicioCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarServicioCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleServicioCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.servicioclienteConstantesFunciones.getsFinalQueryServicioCliente();
		String  finalQueryPaginacionTodos=this.servicioclienteConstantesFunciones.getsFinalQueryServicioCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ServicioClienteConstantesFunciones.getArrayColumnasGlobalesNoServicioCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ServicioClienteConstantesFunciones.getArrayColumnasGlobalesServicioCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ServicioClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.servicioclientesEliminados= new ArrayList<ServicioCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessServicioCliente();
		
				///*ServicioClienteSessionBean*/this.servicioclienteSessionBean=new ServicioClienteSessionBean();
			
			if(this.servicioclienteSessionBean==null) {
				this.servicioclienteSessionBean=new ServicioClienteSessionBean();
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
					this.iNumeroPaginacion=ServicioClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ServicioClienteConstantesFunciones.getClassesForeignKeysOfServicioCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/serviciocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			servicioclientesAux= new ArrayList<ServicioCliente>();
			
				
			servicioclienteLogic.setDatosCliente(this.datosCliente);
			servicioclienteLogic.setDatosDeep(this.datosDeep);
			servicioclienteLogic.setIsConDeep(true);
			
			
			servicioclienteLogic.getServicioClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					servicioclienteLogic.getTodosServicioClientes(finalQueryGlobal,pagination);
					
					//servicioclienteLogic.getTodosServicioClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(servicioclienteLogic.getServicioClientes()==null|| servicioclienteLogic.getServicioClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							servicioclientesAux= new ArrayList<ServicioCliente>();
							servicioclientesAux.addAll(servicioclienteLogic.getServicioClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientesAux= new ArrayList<ServicioCliente>();
							servicioclientesAux.addAll(servicioclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							servicioclienteLogic.getTodosServicioClientes(finalQueryGlobal+"",this.pagination);												
							
							//servicioclienteLogic.getTodosServicioClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteServicioClientes("Todos",servicioclienteLogic.getServicioClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							servicioclienteLogic.setServicioClientes(new ArrayList<ServicioCliente>());					
							servicioclienteLogic.getServicioClientes().addAll(servicioclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientes=new ArrayList<ServicioCliente>();
							servicioclientes.addAll(servicioclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idServicioCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idServicioCliente=this.idActual;
				
				} else if(this.idServicioClienteActual!=null && this.idServicioClienteActual!=0L) {
					idServicioCliente=idServicioClienteActual;
				}
				
					
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndicePorId(idServicioCliente);
				
				this.servicioclientes=new ArrayList<ServicioCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					servicioclienteLogic.getEntity(idServicioCliente);
					
					//servicioclienteLogic.getEntityWithConnection(idServicioCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					servicioclienteLogic.setServicioClientes(new ArrayList<ServicioCliente>());
					servicioclienteLogic.getServicioClientes().add(servicioclienteLogic.getServicioCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.servicioclientes=new ArrayList<ServicioCliente>();
					this.servicioclientes.add(serviciocliente);
				}
				
				if(servicioclienteLogic.getServicioCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					servicioclienteLogic.getServicioClientesFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=servicioclienteLogic.getServicioClientes()==null||servicioclienteLogic.getServicioClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=servicioclientes==null|| servicioclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclientesAux=new ArrayList<ServicioCliente>();
						servicioclientesAux.addAll(servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientesAux=new ArrayList<ServicioCliente>();
							servicioclientesAux.addAll(servicioclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							servicioclienteLogic.getServicioClientesFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteServicioClientes("FK_IdBodega",servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteServicioClientes("FK_IdBodega",servicioclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteLogic.setServicioClientes(new ArrayList<ServicioCliente>());
						servicioclienteLogic.getServicioClientes().addAll(servicioclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientes=new ArrayList<ServicioCliente>();
							servicioclientes.addAll(servicioclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					servicioclienteLogic.getServicioClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=servicioclienteLogic.getServicioClientes()==null||servicioclienteLogic.getServicioClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=servicioclientes==null|| servicioclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclientesAux=new ArrayList<ServicioCliente>();
						servicioclientesAux.addAll(servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientesAux=new ArrayList<ServicioCliente>();
							servicioclientesAux.addAll(servicioclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							servicioclienteLogic.getServicioClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteServicioClientes("FK_IdCliente",servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteServicioClientes("FK_IdCliente",servicioclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteLogic.setServicioClientes(new ArrayList<ServicioCliente>());
						servicioclienteLogic.getServicioClientes().addAll(servicioclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientes=new ArrayList<ServicioCliente>();
							servicioclientes.addAll(servicioclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					servicioclienteLogic.getServicioClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=servicioclienteLogic.getServicioClientes()==null||servicioclienteLogic.getServicioClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=servicioclientes==null|| servicioclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclientesAux=new ArrayList<ServicioCliente>();
						servicioclientesAux.addAll(servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientesAux=new ArrayList<ServicioCliente>();
							servicioclientesAux.addAll(servicioclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							servicioclienteLogic.getServicioClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteServicioClientes("FK_IdEmpresa",servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteServicioClientes("FK_IdEmpresa",servicioclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteLogic.setServicioClientes(new ArrayList<ServicioCliente>());
						servicioclienteLogic.getServicioClientes().addAll(servicioclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientes=new ArrayList<ServicioCliente>();
							servicioclientes.addAll(servicioclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					servicioclienteLogic.getServicioClientesFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=servicioclienteLogic.getServicioClientes()==null||servicioclienteLogic.getServicioClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=servicioclientes==null|| servicioclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclientesAux=new ArrayList<ServicioCliente>();
						servicioclientesAux.addAll(servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientesAux=new ArrayList<ServicioCliente>();
							servicioclientesAux.addAll(servicioclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							servicioclienteLogic.getServicioClientesFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteServicioClientes("FK_IdProducto",servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteServicioClientes("FK_IdProducto",servicioclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteLogic.setServicioClientes(new ArrayList<ServicioCliente>());
						servicioclienteLogic.getServicioClientes().addAll(servicioclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientes=new ArrayList<ServicioCliente>();
							servicioclientes.addAll(servicioclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPrecio")) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					servicioclienteLogic.getServicioClientesFK_IdTipoPrecio(finalQueryGlobal,pagination,id_tipo_precioFK_IdTipoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=servicioclienteLogic.getServicioClientes()==null||servicioclienteLogic.getServicioClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=servicioclientes==null|| servicioclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclientesAux=new ArrayList<ServicioCliente>();
						servicioclientesAux.addAll(servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientesAux=new ArrayList<ServicioCliente>();
							servicioclientesAux.addAll(servicioclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							servicioclienteLogic.getServicioClientesFK_IdTipoPrecio(finalQueryGlobal,pagination,id_tipo_precioFK_IdTipoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ServicioClienteConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteServicioClientes("FK_IdTipoPrecio",servicioclienteLogic.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteServicioClientes("FK_IdTipoPrecio",servicioclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteLogic.setServicioClientes(new ArrayList<ServicioCliente>());
						servicioclienteLogic.getServicioClientes().addAll(servicioclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclientes=new ArrayList<ServicioCliente>();
							servicioclientes.addAll(servicioclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesServicioCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessServicioCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=servicioclienteLogic.getServicioClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=servicioclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=servicioclienteLogic.getServicioClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=servicioclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ServicioCliente serviciocliente) {
		Boolean permite=true;
		
		if(this.serviciocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ServicioClienteConstantesFunciones.getOrderByListaServicioCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ServicioClienteConstantesFunciones.getOrderByListaServicioCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ServicioCliente serviciocliente:servicioclienteLogic.getServicioClientes()) {
				if(serviciocliente.getsType().equals(Constantes2.S_TOTALES)) {
					servicioclienteTotales=serviciocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ServicioCliente serviciocliente:this.servicioclientes) {
				if(serviciocliente.getsType().equals(Constantes2.S_TOTALES)) {
					servicioclienteTotales=serviciocliente;
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
			this.servicioclienteAux=new ServicioCliente();
			this.servicioclienteAux.setsType(Constantes2.S_TOTALES);
			this.servicioclienteAux.setIsNew(false);
			this.servicioclienteAux.setIsChanged(false);
			this.servicioclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ServicioClienteConstantesFunciones.TotalizarValoresFilaServicioCliente(this.servicioclienteLogic.getServicioClientes(),this.servicioclienteAux);
				
				this.servicioclienteLogic.getServicioClientes().add(this.servicioclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ServicioClienteConstantesFunciones.TotalizarValoresFilaServicioCliente(this.servicioclientes,this.servicioclienteAux);
				
				this.servicioclientes.add(this.servicioclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		servicioclienteTotales=new ServicioCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.servicioclienteLogic.getServicioClientes().remove(servicioclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.servicioclientes.remove(servicioclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		servicioclienteTotales=new ServicioCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ServicioCliente serviciocliente:servicioclienteLogic.getServicioClientes()) {
				if(serviciocliente.getsType().equals(Constantes2.S_TOTALES)) {
					servicioclienteTotales=serviciocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ServicioClienteConstantesFunciones.TotalizarValoresFilaServicioCliente(this.servicioclienteLogic.getServicioClientes(),servicioclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ServicioCliente serviciocliente:this.servicioclientes) {
				if(serviciocliente.getsType().equals(Constantes2.S_TOTALES)) {
					servicioclienteTotales=serviciocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ServicioClienteConstantesFunciones.TotalizarValoresFilaServicioCliente(this.servicioclientes,servicioclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getServicioClientesFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getServicioClientesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getServicioClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getServicioClientesFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getServicioClientesFK_IdTipoPrecio()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPrecio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getServicioClientesFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					servicioclienteLogic.getServicioClientesFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getServicioClientesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					servicioclienteLogic.getServicioClientesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getServicioClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					servicioclienteLogic.getServicioClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getServicioClientesFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					servicioclienteLogic.getServicioClientesFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getServicioClientesFK_IdTipoPrecio(String sFinalQuery,Long id_tipo_precio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					servicioclienteLogic.getServicioClientesFK_IdTipoPrecio(sFinalQuery,this.pagination,id_tipo_precio);
				
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
	
	public void inicializarPermisosServicioCliente() {
		this.isPermisoTodoServicioCliente=false;
		this.isPermisoNuevoServicioCliente=false;
		this.isPermisoActualizarServicioCliente=false;
		this.isPermisoActualizarOriginalServicioCliente=false;
		this.isPermisoEliminarServicioCliente=false;
		this.isPermisoGuardarCambiosServicioCliente=false;
		this.isPermisoConsultaServicioCliente=false;
		this.isPermisoBusquedaServicioCliente=false;
		this.isPermisoReporteServicioCliente=false;		
		this.isPermisoOrdenServicioCliente=false;		
		this.isPermisoPaginacionMedioServicioCliente=false;		
		this.isPermisoPaginacionAltoServicioCliente=false;
		this.isPermisoPaginacionTodoServicioCliente=false;
		this.isPermisoCopiarServicioCliente=false;		
		this.isPermisoVerFormServicioCliente=false;		
		this.isPermisoDuplicarServicioCliente=false;		
		this.isPermisoOrdenServicioCliente=false;		
	}
	
	public void setPermisosUsuarioServicioCliente(Boolean isPermiso) {
		this.isPermisoTodoServicioCliente=isPermiso;
		this.isPermisoNuevoServicioCliente=isPermiso;
		this.isPermisoActualizarServicioCliente=isPermiso;
		this.isPermisoActualizarOriginalServicioCliente=isPermiso;
		this.isPermisoEliminarServicioCliente=isPermiso;
		this.isPermisoGuardarCambiosServicioCliente=isPermiso;
		this.isPermisoConsultaServicioCliente=isPermiso;
		this.isPermisoBusquedaServicioCliente=isPermiso;
		this.isPermisoReporteServicioCliente=isPermiso;
		this.isPermisoOrdenServicioCliente=isPermiso;		
		this.isPermisoPaginacionMedioServicioCliente=isPermiso;		
		this.isPermisoPaginacionAltoServicioCliente=isPermiso;		
		this.isPermisoPaginacionTodoServicioCliente=isPermiso;		
		this.isPermisoCopiarServicioCliente=isPermiso;		
		this.isPermisoVerFormServicioCliente=isPermiso;		
		this.isPermisoDuplicarServicioCliente=isPermiso;
		this.isPermisoOrdenServicioCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioServicioCliente(Boolean isPermiso) {
		//this.isPermisoTodoServicioCliente=isPermiso;
		this.isPermisoNuevoServicioCliente=isPermiso;
		this.isPermisoActualizarServicioCliente=isPermiso;
		this.isPermisoActualizarOriginalServicioCliente=isPermiso;
		this.isPermisoEliminarServicioCliente=isPermiso;
		this.isPermisoGuardarCambiosServicioCliente=isPermiso;
		//this.isPermisoConsultaServicioCliente=isPermiso;
		//this.isPermisoBusquedaServicioCliente=isPermiso;
		//this.isPermisoReporteServicioCliente=isPermiso;
		//this.isPermisoOrdenServicioCliente=isPermiso;		
		//this.isPermisoPaginacionMedioServicioCliente=isPermiso;		
		//this.isPermisoPaginacionAltoServicioCliente=isPermiso;		
		//this.isPermisoPaginacionTodoServicioCliente=isPermiso;		
		//this.isPermisoCopiarServicioCliente=isPermiso;		
		//this.isPermisoDuplicarServicioCliente=isPermiso;
		//this.isPermisoOrdenServicioCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioServicioClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ServicioClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebServicioCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioServicioClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioServicioClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionServicioClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioServicioClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioServicioCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ServicioClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ServicioClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoServicioCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarServicioCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalServicioCliente=this.isPermisoActualizarServicioCliente;
			this.isPermisoEliminarServicioCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosServicioCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaServicioCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaServicioCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoServicioCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteServicioCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenServicioCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioServicioCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoServicioCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoServicioCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarServicioCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormServicioCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarServicioCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenServicioCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosServicioCliente.setToolTipText(this.jTableDatosServicioCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioServicioCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioServicioCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ServicioClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ServicioClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioServicioCliente() throws Exception {
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
	public void inicializarCombosForeignKeyServicioClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.tipopreciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyServicioClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ServicioClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyServicioClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoPrecioListas(cargarCombosDependencia,sFinalQueryCombo);
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

			if((this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
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

	public void cargarCombosForeignKeyTipoPrecioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipopreciosForeignKey==null||this.tipopreciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoPrecioConstantesFunciones.getArrayColumnasGlobalesTipoPrecio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrecioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoPrecioConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoPreciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyServicioClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ServicioClienteParameterReturnGeneral servicioclienteReturnGeneral=new ServicioClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.servicioclienteConstantesFunciones.cargarid_empresaServicioCliente)
					 || (this.esRecargarFks && this.servicioclienteConstantesFunciones.cargarid_empresaServicioCliente)) {

					if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+servicioclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.servicioclienteConstantesFunciones.cargarid_clienteServicioCliente)
					 || (this.esRecargarFks && this.servicioclienteConstantesFunciones.cargarid_clienteServicioCliente)) {

					if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+servicioclienteSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.servicioclienteConstantesFunciones.cargarid_bodegaServicioCliente)
					 || (this.esRecargarFks && this.servicioclienteConstantesFunciones.cargarid_bodegaServicioCliente)) {

					if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+servicioclienteSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.servicioclienteConstantesFunciones.cargarid_productoServicioCliente)
					 || (this.esRecargarFks && this.servicioclienteConstantesFunciones.cargarid_productoServicioCliente)) {

					if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+servicioclienteSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalTipoPrecio="";

				if(((this.tipopreciosForeignKey==null||this.tipopreciosForeignKey.size()<=0) && this.servicioclienteConstantesFunciones.cargarid_tipo_precioServicioCliente)
					 || (this.esRecargarFks && this.servicioclienteConstantesFunciones.cargarid_tipo_precioServicioCliente)) {

					if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPrecioConstantesFunciones.getArrayColumnasGlobalesTipoPrecio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPrecio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrecioConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPrecio=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPrecio, "");
						finalQueryGlobalTipoPrecio+=TipoPrecioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPreciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPrecio=" WHERE " + ConstantesSql.ID + "="+servicioclienteSessionBean.getlidTipoPrecioActual();
					}
				} else {
					finalQueryGlobalTipoPrecio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				servicioclienteReturnGeneral=servicioclienteLogic.cargarCombosLoteForeignKeyServicioCliente(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalTipoPrecio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=servicioclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=servicioclienteReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=servicioclienteReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=servicioclienteReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalTipoPrecio.equals("NONE")) {
				this.tipopreciosForeignKey=servicioclienteReturnGeneral.gettipopreciosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyServicioCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyTipoPrecio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.servicioclienteSessionBean==null) {
				this.servicioclienteSessionBean=new ServicioClienteSessionBean();
			}

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyTipoPrecio()throws Exception {
		try {

			if(!this.servicioclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {
				TipoPrecio tipoprecio=new TipoPrecio();
				TipoPrecioConstantesFunciones.setTipoPrecioDescripcion(tipoprecio,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprecio.setId(null);

				if(!TipoPrecioConstantesFunciones.ExisteEnLista(this.tipopreciosForeignKey,tipoprecio,true)) {

					this.tipopreciosForeignKey.add(0,tipoprecio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyServicioCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyServicioCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyServicioCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyServicioCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyServicioCliente(ServicioCliente serviciocliente)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(serviciocliente.getid_cliente(),false,"Formulario");
			this.setActualBodegaForeignKey(serviciocliente.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(serviciocliente.getid_producto(),false,"Formulario");
			this.setActualTipoPrecioForeignKey(serviciocliente.getid_tipo_precio(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyServicioCliente(ServicioCliente serviciocliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(serviciocliente.getCliente()!=null && !sTipoEvento.equals("id_clienteServicioCliente")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(serviciocliente.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				if(serviciocliente.getProducto()!=null && !sTipoEvento.equals("id_productoServicioCliente")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(serviciocliente.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyServicioCliente()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.servicioclienteConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualBodegaForeignKey(this.servicioclienteConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.servicioclienteConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualTipoPrecioForeignKey(this.servicioclienteConstantesFunciones.getid_tipo_precio(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyServicioCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyServicioCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyServicioCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroServicioCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyServicioCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameTipoPreciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyServicioCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPreciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyServicioCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ServicioClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ServicioClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ServicioClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.servicioclienteSessionBean=new ServicioClienteSessionBean(); 
		this.servicioclienteConstantesFunciones=new ServicioClienteConstantesFunciones(); 
		this.servicioclienteBean=new ServicioCliente();//(this.servicioclienteConstantesFunciones); 		
		this.servicioclienteReturnGeneral=new ServicioClienteParameterReturnGeneral(); 
		
		this.servicioclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.servicioclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ServicioClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ServicioClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ServicioClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessServicioCliente(true);
			
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
			
			this.servicioclienteConstantesFunciones=new ServicioClienteConstantesFunciones(); 
			this.servicioclienteBean=new ServicioCliente();//this.servicioclienteConstantesFunciones); 			
			this.servicioclienteReturnGeneral=new ServicioClienteParameterReturnGeneral(); 
		
			ServicioClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Servicio Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.serviciocliente=new ServicioCliente();
			this.servicioclientes = new ArrayList<ServicioCliente>();
			this.servicioclientesAux = new ArrayList<ServicioCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic=new ServicioClienteLogic();
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.servicioclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.servicioclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormServicioCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoServicioCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoServicioCliente);	
					}
					
					if(this.jInternalFrameImportacionServicioCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionServicioCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByServicioCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByServicioCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormServicioCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormServicioCliente);
				this.jInternalFrameDetalleFormServicioCliente.setVisible(false);
				this.jInternalFrameDetalleFormServicioCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoServicioCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoServicioCliente);
					this.jInternalFrameReporteDinamicoServicioCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoServicioCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionServicioCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionServicioCliente);
					this.jInternalFrameImportacionServicioCliente.setVisible(false);
					this.jInternalFrameImportacionServicioCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByServicioCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByServicioCliente);
					this.jInternalFrameOrderByServicioCliente.setVisible(false);
					this.jInternalFrameOrderByServicioCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idServicioClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ServicioClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.servicioclienteReturnGeneral=new ServicioClienteParameterReturnGeneral();
			
			this.servicioclienteParameterGeneral=new ServicioClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.servicioclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ServicioClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ServicioClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.servicioclienteSessionBean.getEsGuardarRelacionado(),this.servicioclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ServicioClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.servicioclienteSessionBean.getEsGuardarRelacionado(),this.servicioclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoServicioCliente=false;
			this.isVisibilidadCeldaDuplicarServicioCliente=true;
			this.isVisibilidadCeldaCopiarServicioCliente=true;
			this.isVisibilidadCeldaVerFormServicioCliente=true;
			this.isVisibilidadCeldaOrdenServicioCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=false;
			this.isVisibilidadCeldaModificarServicioCliente=false;
			this.isVisibilidadCeldaActualizarServicioCliente=false;
			this.isVisibilidadCeldaEliminarServicioCliente=false;
			this.isVisibilidadCeldaCancelarServicioCliente=false;
			this.isVisibilidadCeldaGuardarServicioCliente=false;
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdTipoPrecio=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesServicioCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosServicioCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioServicioCliente(false);
			
			this.setPermisosUsuarioServicioCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.servicioclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.servicioclienteSessionBean.getEsGuardarRelacionado() && this.servicioclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioServicioClienteClasesRelacionadas();
			}
			
			if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioServicioClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosServicioCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualServicioCliente();
			}
			
			if(!this.isPermisoBusquedaServicioCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasServicioCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioServicioCliente,this.isPermisoPaginacionMedioServicioCliente,this.isPermisoPaginacionTodoServicioCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ServicioClienteConstantesFunciones.getTiposSeleccionarServicioCliente());
				
				this.tiposColumnasSelect=ServicioClienteConstantesFunciones.getTiposSeleccionarServicioCliente(true);
				
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
			//if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioServicioCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioServicioCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioServicioCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesServicioCliente() ;
			
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
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.tipoprecioLogic=new TipoPrecioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				servicioclienteImplementable= (ServicioClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ServicioClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				servicioclienteImplementableHome= (ServicioClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ServicioClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.servicioclientes= new ArrayList<ServicioCliente>();
			this.servicioclientesEliminados= new ArrayList<ServicioCliente>();
						
			this.isEsNuevoServicioCliente=false;
			this.esParaAccionDesdeFormularioServicioCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.tipopreciosForeignKey=new ArrayList<TipoPrecio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyServicioCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroServicioCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ServicioClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ServicioClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesServicioCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingServicioCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormServicioCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioServicioCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioServicioCliente();
			}
			
			ServicioClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasServicioCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasServicioCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasServicioCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessServicioCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ServicioCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectServicioCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesServicioCliente")) {
				iIndex=this.jInternalFrameDetalleFormServicioCliente.jTabbedPaneRelacionesServicioCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormServicioCliente.jTabbedPaneRelacionesServicioCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessServicioCliente();	
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
	
	public void cargarCombosForeignKeyServicioCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyServicioCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyServicioCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyServicioClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyServicioCliente();
		
		this.cargarCombosFrameForeignKeyServicioCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyServicioCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyServicioCliente();
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

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
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
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPrecio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoPrecioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoPrecio();
				this.cargarCombosFrameTipoPreciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoPrecio(this.tipopreciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoServicioClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
			
			if(jTableDatosServicioCliente.getRowCount()>=1) {
				jTableDatosServicioCliente.removeRowSelectionInterval(0, jTableDatosServicioCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoServicioCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoServicioCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesServicioCliente(true);			
			//this.serviciocliente=new ServicioCliente();
			//this.serviciocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesServicioCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualServicioCliente() ;
			
			if(ServicioClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleServicioCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.serviciocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);				
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
			if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ServicioCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarServicioClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosServicioCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosServicioCliente.getSelectedRows().length;			
			}
			
			servicioclientesSeleccionados=this.getServicioClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoServicioCliente--;			
				//ServicioCliente servicioclienteAux= new ServicioCliente();			
				//servicioclienteAux.setId(this.iIdNuevoServicioCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ServicioCliente servicioclienteOrigen=new ServicioCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ServicioCliente servicioclienteOrigen : servicioclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							servicioclienteOrigen =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							servicioclienteOrigen =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaServicioCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.serviciocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosServicioCliente(servicioclienteOrigen,this.serviciocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.servicioclienteLogic.getServicioClientes().add(this.servicioclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.servicioclientes.add(this.servicioclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaServicioCliente(false);
				
				this.jTableDatosServicioCliente.setRowSelectionInterval(this.getIndiceNuevoServicioCliente(), this.getIndiceNuevoServicioCliente());
				
				int iLastRow =  this.jTableDatosServicioCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosServicioCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosServicioCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaServicioCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();									
		
			ServicioCliente servicioclienteOrigen=new ServicioCliente();
			ServicioCliente servicioclienteDestino=new ServicioCliente();
				
			servicioclientesSeleccionados=this.getServicioClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosServicioCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || servicioclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosServicioCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteOrigen =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						servicioclienteOrigen =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						servicioclienteDestino =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						servicioclienteDestino =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				servicioclienteOrigen =servicioclientesSeleccionados.get(0);
				servicioclienteDestino =servicioclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosServicioCliente(servicioclienteOrigen,servicioclienteDestino,true,false);
				
				servicioclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(servicioclienteDestino,servicioclienteLogic.getServicioClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(servicioclienteDestino,servicioclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaServicioCliente(false);
				
				//this.jTableDatosServicioCliente.setRowSelectionInterval(this.getIndiceNuevoServicioCliente(), this.getIndiceNuevoServicioCliente());
				
				int iLastRow =  this.jTableDatosServicioCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosServicioCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosServicioCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaServicioCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormServicioCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesServicioCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasServicioCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesServicioCliente.setVisible(!isVisible);
			this.jPanelPaginacionServicioCliente.setVisible(!isVisible);
			this.jPanelAccionesServicioCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameServicioCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoServicioCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionServicioCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByServicioCliente();
			
			this.abrirFrameOrderByServicioCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByServicioCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleServicioCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormServicioCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormServicioCliente.isMaximum()) {
					this.jInternalFrameDetalleFormServicioCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormServicioCliente.setSize(this.jInternalFrameDetalleFormServicioCliente.iWidthFormulario,this.jInternalFrameDetalleFormServicioCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormServicioCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormServicioCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormServicioCliente.isMaximum()) {
						this.jInternalFrameDetalleFormServicioCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormServicioCliente.jContentPaneDetalleServicioCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormServicioCliente.jTabbedPaneRelacionesServicioCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormServicioCliente.jContentPaneDetalleServicioCliente.getWidth(),ServicioClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormServicioCliente.jTabbedPaneRelacionesServicioCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormServicioCliente.jContentPaneDetalleServicioCliente.getWidth(),ServicioClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormServicioCliente.jTabbedPaneRelacionesServicioCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormServicioCliente.jContentPaneDetalleServicioCliente.getWidth(),ServicioClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormServicioCliente.setVisible(true);
	        this.jInternalFrameDetalleFormServicioCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByServicioCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByServicioCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByServicioCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByServicioCliente,false,this);
				} else {
					this.jInternalFrameOrderByServicioCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByServicioCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByServicioCliente);
				this.jInternalFrameOrderByServicioCliente.setVisible(false);
				this.jInternalFrameOrderByServicioCliente.setSelected(false);
				
				this.jInternalFrameOrderByServicioCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByServicioCliente"));
				
				this.inicializarActualizarBindingTablaOrderByServicioCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionServicioCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionServicioCliente==null) {
				
				this.jInternalFrameImportacionServicioCliente=new ImportacionJInternalFrame(ServicioClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionServicioCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionServicioCliente);
				this.jInternalFrameImportacionServicioCliente.setVisible(false);
				this.jInternalFrameImportacionServicioCliente.setSelected(false);


				this.jInternalFrameImportacionServicioCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionServicioCliente"));
				this.jInternalFrameImportacionServicioCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionServicioCliente"));
				this.jInternalFrameImportacionServicioCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionServicioCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoServicioCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoServicioCliente==null) {
				this.jInternalFrameReporteDinamicoServicioCliente=new ReporteDinamicoJInternalFrame(ServicioClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoServicioCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoServicioCliente);
				this.jInternalFrameReporteDinamicoServicioCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoServicioCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoServicioCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoServicioCliente"));
				this.jInternalFrameReporteDinamicoServicioCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoServicioCliente"));
				this.jInternalFrameReporteDinamicoServicioCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoServicioCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualServicioCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleServicioCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormServicioCliente);
			
	       	this.jInternalFrameDetalleFormServicioCliente.setVisible(false);
	        this.jInternalFrameDetalleFormServicioCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormServicioCliente.dispose();
			//this.jInternalFrameDetalleFormServicioCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoServicioCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoServicioCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoServicioCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionServicioCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionServicioCliente.setVisible(true);
	        this.jInternalFrameImportacionServicioCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByServicioCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByServicioCliente.setVisible(true);
	        this.jInternalFrameOrderByServicioCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByServicioCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByServicioCliente.setVisible(false);
	        this.jInternalFrameOrderByServicioCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoServicioCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoServicioCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoServicioCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionServicioCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionServicioCliente.setVisible(false);
	        this.jInternalFrameImportacionServicioCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarServicioCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarServicioCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesServicioCliente(true);
			//this.isEsNuevoServicioCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesServicioCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesServicioCliente(false) ;
			
			if(servicioclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ServicioClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleServicioCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualServicioCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaServicioClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarServicioCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesServicioCliente(true);
			//this.isEsNuevoServicioCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.serviciocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesServicioCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesServicioCliente(false) ;
			
			if(ServicioClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleServicioCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualServicioCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.servicioclienteConstantesFunciones.cargarid_clienteServicioCliente) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingServicioCliente(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
			
			if(sType.equals("Producto")) {
				if(!this.servicioclienteConstantesFunciones.cargarid_productoServicioCliente) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingServicioCliente(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosServicioCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosServicioCliente.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosServicioCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoPrecio(List<TipoPrecio> tipopreciosForeignKey)throws Exception{
		TableColumn tableColumnTipoPrecio=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO));
		TableCellEditor tableCellEditorTipoPrecio =tableColumnTipoPrecio.getCellEditor();

		TipoPrecioTableCell tipoprecioTableCellFk=(TipoPrecioTableCell)tableCellEditorTipoPrecio;

		if(tipoprecioTableCellFk!=null) {
			tipoprecioTableCellFk.settipopreciosForeignKey(tipopreciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosServicioCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprecioTableCellFk.setRowActual(intSelectedRow);
			//tipoprecioTableCellFk.settipopreciosForeignKeyActual(tipopreciosForeignKey);
		//}


		if(tipoprecioTableCellFk!=null) {
			tipoprecioTableCellFk.RecargarTipoPreciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesServicioCliente(false);
			
			//if(!this.isEsNuevoServicioCliente) {								
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				
			}
			
			if(this.permiteMantenimiento(this.serviciocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoServicioCliente=true;
					this.inicializarActualizarBindingTablaServicioCliente(false);
					this.isEsNuevoServicioCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoServicioCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoServicioCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesServicioCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualServicioCliente(false);
				
				this.habilitarDeshabilitarControlesServicioCliente(false);
			
												
				
				if(ServicioClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleServicioCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoServicioClienteActionPerformed(evt,servicioclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualServicioCliente(this.serviciocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosServicioCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,servicioclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.serviciocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarServicioClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				this.serviciocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				this.serviciocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.serviciocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ServicioClienteModel) this.jTableDatosServicioCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoServicioCliente=true;
				this.inicializarActualizarBindingTablaServicioCliente(false);
				this.isEsNuevoServicioCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesServicioCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualServicioCliente(false);
				
				this.habilitarDeshabilitarControlesServicioCliente(false);
				
				
				
				if(ServicioClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleServicioCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarServicioClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosServicioCliente.getRowCount()>=1) {
				jTableDatosServicioCliente.removeRowSelectionInterval(0, jTableDatosServicioCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesServicioCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaServicioCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesServicioCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualServicioCliente(false) ;
			
			this.isEsNuevoServicioCliente=false;
			
			if(ServicioClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleServicioCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosServicioClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingServicioCliente(false);
				
				//SI ES MANUAL
				if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualServicioCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosServicioClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoServicioCliente--;			
			//ServicioCliente servicioclienteAux= new ServicioCliente();			
			//servicioclienteAux.setId(this.iIdNuevoServicioCliente);
			
			if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaServicioCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
			
			this.serviciocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.servicioclienteLogic.getServicioClientes().add(this.servicioclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.servicioclientes.add(this.servicioclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaServicioCliente(false);
			
			this.jTableDatosServicioCliente.setRowSelectionInterval(this.getIndiceNuevoServicioCliente(), this.getIndiceNuevoServicioCliente());
			
			int iLastRow =  this.jTableDatosServicioCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosServicioCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosServicioCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaServicioCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionServicioClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingServicioCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingServicioCliente(false);
			
			//SI ES MANUAL
			if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualServicioCliente();
			}
			
			//this.abrirFrameTreeServicioCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionServicioClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Servicio ClienteS ?", "MANTENIMIENTO DE Servicio Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionServicioCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralServicioCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.servicioclienteReturnGeneral=servicioclienteLogic.procesarImportacionServicioClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.servicioclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarServicioClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionServicioClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionServicioCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionServicioCliente.setFileImportacion(this.jInternalFrameImportacionServicioCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionServicioCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionServicioCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionServicioCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionServicioCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoServicioClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();		

		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ServicioClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ServicioClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteServicioClientes("Todos",servicioclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ServicioClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ServicioClienteConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ServicioClienteConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPrecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPrecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPrecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPrecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ServicioClienteConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ServicioClienteConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoServicioCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ServicioClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO:
					sNombreCampoCategoria="id_tipo_precio";
					break;

				case ServicioClienteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case ServicioClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ServicioClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO:
					sNombreCampoCategoriaValor="id_tipo_precio";
					break;

				case ServicioClienteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case ServicioClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ServicioClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_precio");
					break;

				case ServicioClienteConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case ServicioClienteConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoServicioClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();		
		
		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serviciocliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ServicioClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ServicioClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ServicioCliente serviciocliente:servicioclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serviciocliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ServicioCliente serviciocliente:servicioclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serviciocliente.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ServicioCliente serviciocliente:servicioclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serviciocliente.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ServicioCliente serviciocliente:servicioclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serviciocliente.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO);
					iRow++;

					for(ServicioCliente serviciocliente:servicioclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serviciocliente.gettipoprecio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ServicioClienteConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(ServicioCliente serviciocliente:servicioclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serviciocliente.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ServicioClienteConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ServicioCliente serviciocliente:servicioclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serviciocliente.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelServicioCliente(row);				
			//	iRow++;
			//}				
			
			//for(ServicioCliente servicioclienteAux:servicioclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelServicioCliente(servicioclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingServicioCliente(false);
			
			//SI ES MANUAL
			if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualServicioCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresServicioClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingServicioCliente(false);
			
			//SI ES MANUAL
			if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualServicioCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesServicioClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingServicioCliente(false);
			
			//SI ES MANUAL
			if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualServicioCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaServicioCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosServicioCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosServicioCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosServicioCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosServicioCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosServicioCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosServicioCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosServicioCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingServicioCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingServicioCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingServicioCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaServicioCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesServicioCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasServicioCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesServicioCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesServicioCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualServicioCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaServicioCliente();
		
		this.inicializarActualizarBindingBotonesManualServicioCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualServicioCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesServicioCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualServicioCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualServicioCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosServicioCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosServicioCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteServicioCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormServicioCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormServicioCliente.jCheckBoxPostAccionNuevoServicioCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormServicioCliente.jCheckBoxPostAccionSinCerrarServicioCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormServicioCliente.jCheckBoxPostAccionSinMensajeServicioCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosServicioCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosServicioCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteServicioCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormServicioCliente!=null) {
				this.jInternalFrameDetalleFormServicioCliente.jCheckBoxPostAccionNuevoServicioCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormServicioCliente.jCheckBoxPostAccionSinCerrarServicioCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormServicioCliente.jCheckBoxPostAccionSinMensajeServicioCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionServicioCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionServicioCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesServicioCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoServicioCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesServicioCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesServicioCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarServicioCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesServicioCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoServicioCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesServicioCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralServicioCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesServicioCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualServicioCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesServicioCliente() throws Exception {
		try	{
			if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualServicioCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleServicioCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualServicioCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesServicioCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesServicioCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesServicioCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesServicioCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesServicioCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesServicioCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionServicioCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionServicioCliente.addItem(reporte);
			}
			
			
			if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionServicioCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionServicioCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesServicioCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesServicioCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesServicioCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesServicioCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarServicioCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarServicioCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarServicioCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualServicioCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualServicioCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoServicioCliente!=null) {
				this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoServicioCliente!=null) {
				this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoServicioCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoServicioCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoServicioCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoServicioCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ServicioClienteConstantesFunciones.getTiposSeleccionarServicioCliente(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ServicioClienteConstantesFunciones.getTiposSeleccionarServicioCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ServicioClienteConstantesFunciones.getTiposSeleccionarServicioCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoServicioCliente.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoServicioCliente.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualServicioCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaServicioCliente.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaServicioCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteServicioCliente.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteServicioCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoServicioCliente.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoServicioCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.getSelectedItem()!=null){this.id_tipo_precioFK_IdTipoPrecio=((TipoPrecio)this.jComboBoxid_tipo_precioFK_IdTipoPrecioServicioCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasServicioCliente(Boolean esInicializar) throws Exception {				
		if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualServicioCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaServicioCliente() throws Exception {
		this.inicializarActualizarBindingTablaServicioCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByServicioCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosServicioClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaServicioCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=servicioclienteLogic.getServicioClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=servicioclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosServicioCliente.setModel(new ServicioClienteModel(this.servicioclienteLogic.getServicioClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosServicioCliente.setModel(new ServicioClienteModel(this.servicioclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByServicioCliente!=null && this.jInternalFrameOrderByServicioCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByServicioCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO,servicioclienteConstantesFunciones.resaltarSeleccionarServicioCliente,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO,servicioclienteConstantesFunciones.resaltarSeleccionarServicioCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_ID));

		if(this.servicioclienteConstantesFunciones.mostraridServicioCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ServicioClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.servicioclienteConstantesFunciones.resaltaridServicioCliente,this.servicioclienteConstantesFunciones.activaridServicioCliente,iSizeTabla,this,true,"idServicioCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.servicioclienteConstantesFunciones.resaltaridServicioCliente,this.servicioclienteConstantesFunciones.activaridServicioCliente,this,true,"idServicioCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.servicioclienteConstantesFunciones.mostrarid_empresaServicioCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ServicioClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.servicioclienteConstantesFunciones.resaltarid_empresaServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_empresaServicioCliente,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.servicioclienteConstantesFunciones.resaltarid_empresaServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_empresaServicioCliente,false,"id_empresaServicioCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_IDCLIENTE));

		if(this.servicioclienteConstantesFunciones.mostrarid_clienteServicioCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ServicioClienteConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.servicioclienteConstantesFunciones.resaltarid_clienteServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_clienteServicioCliente,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.servicioclienteConstantesFunciones.resaltarid_clienteServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_clienteServicioCliente,true,"id_clienteServicioCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_IDBODEGA));

		if(this.servicioclienteConstantesFunciones.mostrarid_bodegaServicioCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ServicioClienteConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.servicioclienteConstantesFunciones.resaltarid_bodegaServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_bodegaServicioCliente,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.servicioclienteConstantesFunciones.resaltarid_bodegaServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_bodegaServicioCliente,true,"id_bodegaServicioCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.servicioclienteConstantesFunciones.mostrarid_productoServicioCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.servicioclienteConstantesFunciones.resaltarid_productoServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_productoServicioCliente,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.servicioclienteConstantesFunciones.resaltarid_productoServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_productoServicioCliente,true,"id_productoServicioCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO));

		if(this.servicioclienteConstantesFunciones.mostrarid_tipo_precioServicioCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPrecioTableCell(this.tipopreciosForeignKey,this.servicioclienteConstantesFunciones.resaltarid_tipo_precioServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_tipo_precioServicioCliente,iSizeTabla));
			tableColumn.setCellEditor(new TipoPrecioTableCell(this.tipopreciosForeignKey,this.servicioclienteConstantesFunciones.resaltarid_tipo_precioServicioCliente,this,this.servicioclienteConstantesFunciones.activarid_tipo_precioServicioCliente,true,"id_tipo_precioServicioCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_PRECIO));

		if(this.servicioclienteConstantesFunciones.mostrarprecioServicioCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ServicioClienteConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.servicioclienteConstantesFunciones.resaltarprecioServicioCliente,this.servicioclienteConstantesFunciones.activarprecioServicioCliente,iSizeTabla,this,true,"precioServicioCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.servicioclienteConstantesFunciones.resaltarprecioServicioCliente,this.servicioclienteConstantesFunciones.activarprecioServicioCliente,this,true,"precioServicioCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,ServicioClienteConstantesFunciones.LABEL_DESCRIPCION));

		if(this.servicioclienteConstantesFunciones.mostrardescripcionServicioCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ServicioClienteConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.servicioclienteConstantesFunciones.resaltardescripcionServicioCliente,this.servicioclienteConstantesFunciones.activardescripcionServicioCliente,iSizeTabla,this,true,"descripcionServicioCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.servicioclienteConstantesFunciones.resaltardescripcionServicioCliente,this.servicioclienteConstantesFunciones.activardescripcionServicioCliente,this,true,"descripcionServicioCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ServicioClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.servicioclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.servicioclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosServicioCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.servicioclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.servicioclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosServicioCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarServicioCliente && this.isPermisoGuardarCambiosServicioCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.servicioclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.servicioclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosServicioCliente.addColumn(tableColumn);
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
			
			this.jTableDatosServicioCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarServicioCliente && this.isPermisoGuardarCambiosServicioCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarServicioCliente && this.isPermisoGuardarCambiosServicioCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosServicioCliente.moveColumn(this.jTableDatosServicioCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosServicioCliente.moveColumn(this.jTableDatosServicioCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosServicioCliente.moveColumn(this.jTableDatosServicioCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosServicioCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosServicioCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosServicioCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosServicioCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosServicioCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosServicioCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosServicioCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosServicioCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=servicioclienteLogic.getServicioClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=servicioclientes.size()-1;
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
		//this.jTableDatosServicioCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosServicioCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosServicioCliente();
			
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
				
				//this.isEsNuevoServicioCliente=false;
					
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
				if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormServicioCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosServicioCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosServicioCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.serviciocliente.getsType().equals("DUPLICADO")
				   || this.serviciocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoServicioCliente=true;
				
				} else {
					this.isEsNuevoServicioCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.serviciocliente.getId()>=0 && !this.serviciocliente.getIsNew()) {						
						this.isEsNuevoServicioCliente=false;
						
					} else {
						this.isEsNuevoServicioCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoServicioCliente(esRelaciones);						
				
				this.seleccionarServicioCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.serviciocliente.getId()<0) {
					this.isEsNuevoServicioCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarServicioCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarServicioCliente(evt,rowIndex);
				}	
				
				if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ServicioCliente: " + this.dDif); 
					}
				}								
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarServicioCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.serviciocliente)) {
					if(this.serviciocliente.getId()>0) {
						this.serviciocliente.setIsDeleted(true);
						
						this.servicioclientesEliminados.add(this.serviciocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.servicioclienteLogic.getServicioClientes().remove(this.serviciocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.servicioclientes.remove(this.serviciocliente);				
					}
					
					
					((ServicioClienteModel) this.jTableDatosServicioCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaServicioCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarServicioCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoServicioCliente) {
			
			if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosServicioCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosServicioCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioServicioCliente(this.serviciocliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.servicioclienteConstantesFunciones.cargarid_empresaServicioCliente || this.servicioclienteConstantesFunciones.event_dependid_empresaServicioCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.serviciocliente.getid_empresa());
									//this.inicializarActualizarBindingServicioCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(serviciocliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(serviciocliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.serviciocliente.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.servicioclienteConstantesFunciones.cargarid_clienteServicioCliente || this.servicioclienteConstantesFunciones.event_dependid_clienteServicioCliente) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.serviciocliente.getid_cliente());
									//this.inicializarActualizarBindingServicioCliente(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(serviciocliente.getCliente()!=null) {
							this.clientesForeignKey.add(serviciocliente.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.serviciocliente.getid_cliente(),false,"Formulario");

					//Bodega
					if(!this.servicioclienteConstantesFunciones.cargarid_bodegaServicioCliente || this.servicioclienteConstantesFunciones.event_dependid_bodegaServicioCliente) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.serviciocliente.getid_bodega());
									//this.inicializarActualizarBindingServicioCliente(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(serviciocliente.getBodega()!=null) {
							this.bodegasForeignKey.add(serviciocliente.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.serviciocliente.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.servicioclienteConstantesFunciones.cargarid_productoServicioCliente || this.servicioclienteConstantesFunciones.event_dependid_productoServicioCliente) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.serviciocliente.getid_producto());
									//this.inicializarActualizarBindingServicioCliente(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(serviciocliente.getProducto()!=null) {
							this.productosForeignKey.add(serviciocliente.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.serviciocliente.getid_producto(),false,"Formulario");

					//TipoPrecio
					if(!this.servicioclienteConstantesFunciones.cargarid_tipo_precioServicioCliente || this.servicioclienteConstantesFunciones.event_dependid_tipo_precioServicioCliente) {
						//this.cargarCombosTipoPreciosForeignKeyLista(" where id="+this.serviciocliente.getid_tipo_precio());
									//this.inicializarActualizarBindingServicioCliente(false,false);
						this.tipopreciosForeignKey=new ArrayList<TipoPrecio>();

						if(serviciocliente.getTipoPrecio()!=null) {
							this.tipopreciosForeignKey.add(serviciocliente.getTipoPrecio());
						}

						this.addItemDefectoCombosForeignKeyTipoPrecio();
						this.cargarCombosFrameTipoPreciosForeignKey("Todos");
					}
					this.setActualTipoPrecioForeignKey(this.serviciocliente.getid_tipo_precio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesServicioCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesServicioCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualServicioCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoServicioCliente(ServicioCliente serviciocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoServicioCliente(serviciocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoServicioCliente(ServicioCliente serviciocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioServicioCliente(serviciocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyServicioCliente(serviciocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyServicioCliente(serviciocliente);
	}
	
	public void setVariablesObjetoActualToFormularioServicioCliente(ServicioCliente serviciocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.setText(serviciocliente.getId().toString());
			this.jInternalFrameDetalleFormServicioCliente.jTextFieldprecioServicioCliente.setText(serviciocliente.getprecio().toString());
			this.jInternalFrameDetalleFormServicioCliente.jTextAreadescripcionServicioCliente.setText(serviciocliente.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ServicioCliente servicioclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,servicioclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ServicioCliente servicioclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				servicioclienteLocal=this.serviciocliente;
			} else {
				servicioclienteLocal=this.servicioclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(servicioclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoServicioCliente(servicioclienteLocal,true);
					
					if(servicioclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(servicioclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(servicioclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoServicioCliente(ServicioCliente serviciocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualServicioCliente(serviciocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(serviciocliente);
	}
	
	public void setVariablesFormularioToObjetoActualServicioCliente(ServicioCliente serviciocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualServicioCliente(serviciocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualServicioCliente(ServicioCliente serviciocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.getText()==null || this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.getText()=="" || this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.setText("0");
			}

			if(conColumnasBase) {serviciocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ServicioClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabelIdServicioCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			serviciocliente.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormServicioCliente.jTextFieldprecioServicioCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ServicioClienteConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabelprecioServicioCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			serviciocliente.setdescripcion(this.jInternalFrameDetalleFormServicioCliente.jTextAreadescripcionServicioCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ServicioClienteConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormServicioCliente.jLabeldescripcionServicioCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualServicioCliente(ServicioCliente servicioclienteBean,ServicioCliente serviciocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && servicioclienteBean.getid_cliente()!=null && !servicioclienteBean.getid_cliente().equals(-1L))) {serviciocliente.setid_cliente(servicioclienteBean.getid_cliente());}
			if(conDefault || (!conDefault && servicioclienteBean.getid_bodega()!=null && !servicioclienteBean.getid_bodega().equals(-1L))) {serviciocliente.setid_bodega(servicioclienteBean.getid_bodega());}
			if(conDefault || (!conDefault && servicioclienteBean.getid_producto()!=null && !servicioclienteBean.getid_producto().equals(-1L))) {serviciocliente.setid_producto(servicioclienteBean.getid_producto());}
			if(conDefault || (!conDefault && servicioclienteBean.getid_tipo_precio()!=null && !servicioclienteBean.getid_tipo_precio().equals(-1L))) {serviciocliente.setid_tipo_precio(servicioclienteBean.getid_tipo_precio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosServicioCliente(ServicioCliente servicioclienteOrigen,ServicioCliente serviciocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && servicioclienteOrigen.getId()!=null && !servicioclienteOrigen.getId().equals(0L))) {serviciocliente.setId(servicioclienteOrigen.getId());}}
			if(conDefault || (!conDefault && servicioclienteOrigen.getid_cliente()!=null && !servicioclienteOrigen.getid_cliente().equals(-1L))) {serviciocliente.setid_cliente(servicioclienteOrigen.getid_cliente());}
			if(conDefault || (!conDefault && servicioclienteOrigen.getid_bodega()!=null && !servicioclienteOrigen.getid_bodega().equals(-1L))) {serviciocliente.setid_bodega(servicioclienteOrigen.getid_bodega());}
			if(conDefault || (!conDefault && servicioclienteOrigen.getid_producto()!=null && !servicioclienteOrigen.getid_producto().equals(-1L))) {serviciocliente.setid_producto(servicioclienteOrigen.getid_producto());}
			if(conDefault || (!conDefault && servicioclienteOrigen.getid_tipo_precio()!=null && !servicioclienteOrigen.getid_tipo_precio().equals(-1L))) {serviciocliente.setid_tipo_precio(servicioclienteOrigen.getid_tipo_precio());}
			if(conDefault || (!conDefault && servicioclienteOrigen.getprecio()!=null && !servicioclienteOrigen.getprecio().equals(0.0))) {serviciocliente.setprecio(servicioclienteOrigen.getprecio());}
			if(conDefault || (!conDefault && servicioclienteOrigen.getdescripcion()!=null && !servicioclienteOrigen.getdescripcion().equals(""))) {serviciocliente.setdescripcion(servicioclienteOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioServicioCliente(ServicioCliente serviciocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.setText(serviciocliente.getId().toString());
			this.jInternalFrameDetalleFormServicioCliente.jTextFieldprecioServicioCliente.setText(serviciocliente.getprecio().toString());
			this.jInternalFrameDetalleFormServicioCliente.jTextAreadescripcionServicioCliente.setText(serviciocliente.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioServicioCliente(ServicioClienteBean servicioclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.setText(servicioclienteBean.getId().toString());
			this.jInternalFrameDetalleFormServicioCliente.jTextFieldprecioServicioCliente.setText(servicioclienteBean.getprecio().toString());
			this.jInternalFrameDetalleFormServicioCliente.jTextAreadescripcionServicioCliente.setText(servicioclienteBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanServicioCliente(ServicioClienteParameterReturnGeneral servicioclienteReturnGeneral,ServicioClienteBean servicioclienteBean,Boolean conDefault) throws Exception { 
		try {
			ServicioCliente servicioclienteLocal=new ServicioCliente();
			
			servicioclienteLocal=servicioclienteReturnGeneral.getServicioCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && servicioclienteLocal.getId()!=null && !servicioclienteLocal.getId().equals(0L))) {servicioclienteBean.setId(servicioclienteLocal.getId());}}
			if(conDefault || (!conDefault && servicioclienteLocal.getid_cliente()!=null && !servicioclienteLocal.getid_cliente().equals(-1L))) {servicioclienteBean.setid_cliente(servicioclienteLocal.getid_cliente());}
			if(conDefault || (!conDefault && servicioclienteLocal.getid_bodega()!=null && !servicioclienteLocal.getid_bodega().equals(-1L))) {servicioclienteBean.setid_bodega(servicioclienteLocal.getid_bodega());}
			if(conDefault || (!conDefault && servicioclienteLocal.getid_producto()!=null && !servicioclienteLocal.getid_producto().equals(-1L))) {servicioclienteBean.setid_producto(servicioclienteLocal.getid_producto());}
			if(conDefault || (!conDefault && servicioclienteLocal.getid_tipo_precio()!=null && !servicioclienteLocal.getid_tipo_precio().equals(-1L))) {servicioclienteBean.setid_tipo_precio(servicioclienteLocal.getid_tipo_precio());}
			if(conDefault || (!conDefault && servicioclienteLocal.getprecio()!=null && !servicioclienteLocal.getprecio().equals(0.0))) {servicioclienteBean.setprecio(servicioclienteLocal.getprecio());}
			if(conDefault || (!conDefault && servicioclienteLocal.getdescripcion()!=null && !servicioclienteLocal.getdescripcion().equals(""))) {servicioclienteBean.setdescripcion(servicioclienteLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxServicioClienteGenerico(Long idServicioClienteSeleccionado,JComboBox jComboBoxServicioCliente,List<ServicioCliente> servicioclientesLocal)throws Exception {
		try {
			ServicioCliente  servicioclienteTemp=null;

			for(ServicioCliente servicioclienteAux:servicioclientesLocal) {
				if(servicioclienteAux.getId()!=null && servicioclienteAux.getId().equals(idServicioClienteSeleccionado)) {
					servicioclienteTemp=servicioclienteAux;
					break;
				}
			}

			jComboBoxServicioCliente.setSelectedItem(servicioclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxServicioClienteGenerico(JComboBox jComboBoxServicioCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxServicioCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxServicioCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxServicioCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxServicioCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			serviciocliente=(ServicioCliente) servicioclienteLogic.getServicioClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			serviciocliente =(ServicioCliente) servicioclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!serviciocliente.getIsNew() && !serviciocliente.getIsChanged() && !serviciocliente.getIsDeleted()) {
				sDescripcion=serviciocliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=serviciocliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!serviciocliente.getIsNew() && !serviciocliente.getIsChanged() && !serviciocliente.getIsDeleted()) {
				sDescripcion=serviciocliente.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=serviciocliente.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!serviciocliente.getIsNew() && !serviciocliente.getIsChanged() && !serviciocliente.getIsDeleted()) {
				sDescripcion=serviciocliente.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=serviciocliente.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!serviciocliente.getIsNew() && !serviciocliente.getIsChanged() && !serviciocliente.getIsDeleted()) {
				sDescripcion=serviciocliente.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=serviciocliente.getproducto_descripcion();
			}
		}

		if(sTipo.equals("TipoPrecio")) {
			//sDescripcion=this.getActualTipoPrecioForeignKeyDescripcion((Long)value);
			if(!serviciocliente.getIsNew() && !serviciocliente.getIsChanged() && !serviciocliente.getIsDeleted()) {
				sDescripcion=serviciocliente.gettipoprecio_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPrecioForeignKeyDescripcion((Long)value);
				sDescripcion=serviciocliente.gettipoprecio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ServicioCliente servicioclienteRow=new ServicioCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			servicioclienteRow=(ServicioCliente) servicioclienteLogic.getServicioClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			servicioclienteRow=(ServicioCliente) servicioclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualServicioCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoServicioCliente.setVisible((this.isVisibilidadCeldaNuevoServicioCliente && this.isPermisoNuevoServicioCliente));			
			this.jButtonDuplicarServicioCliente.setVisible((this.isVisibilidadCeldaDuplicarServicioCliente && this.isPermisoDuplicarServicioCliente));			
			this.jButtonCopiarServicioCliente.setVisible((this.isVisibilidadCeldaCopiarServicioCliente && this.isPermisoCopiarServicioCliente));
			this.jButtonVerFormServicioCliente.setVisible((this.isVisibilidadCeldaVerFormServicioCliente && this.isPermisoVerFormServicioCliente));
			
			this.jButtonAbrirOrderByServicioCliente.setVisible((this.isVisibilidadCeldaOrdenServicioCliente && this.isPermisoOrdenServicioCliente));			
			
			this.jButtonNuevoRelacionesServicioCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesServicioCliente && this.isPermisoNuevoServicioCliente));			
			this.jButtonNuevoGuardarCambiosServicioCliente.setVisible((this.isVisibilidadCeldaNuevoServicioCliente && this.isPermisoNuevoServicioCliente && this.isPermisoGuardarCambiosServicioCliente));
			
			if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonModificarServicioCliente.setVisible((this.isVisibilidadCeldaModificarServicioCliente && this.isPermisoActualizarServicioCliente));	
			this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarServicioCliente.setVisible((this.isVisibilidadCeldaActualizarServicioCliente && this.isPermisoActualizarServicioCliente));	
			this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarServicioCliente.setVisible((this.isVisibilidadCeldaEliminarServicioCliente && this.isPermisoEliminarServicioCliente));
			this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarServicioCliente.setVisible(this.isVisibilidadCeldaCancelarServicioCliente);							
			this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosServicioCliente.setVisible((this.isVisibilidadCeldaGuardarServicioCliente && this.isPermisoGuardarCambiosServicioCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaServicioCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosServicioCliente && this.isPermisoGuardarCambiosServicioCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarServicioCliente.setVisible((this.isVisibilidadCeldaNuevoServicioCliente && this.isPermisoNuevoServicioCliente));						
			this.jButtonDuplicarToolBarServicioCliente.setVisible((this.isVisibilidadCeldaDuplicarServicioCliente && this.isPermisoDuplicarServicioCliente));						
			this.jButtonCopiarToolBarServicioCliente.setVisible((this.isVisibilidadCeldaCopiarServicioCliente && this.isPermisoCopiarServicioCliente));			
			this.jButtonVerFormToolBarServicioCliente.setVisible((this.isVisibilidadCeldaVerFormServicioCliente && this.isPermisoVerFormServicioCliente));			
			this.jButtonAbrirOrderByToolBarServicioCliente.setVisible((this.isVisibilidadCeldaOrdenServicioCliente && this.isPermisoOrdenServicioCliente));
			this.jButtonNuevoRelacionesToolBarServicioCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesServicioCliente && this.isPermisoNuevoServicioCliente));			
			this.jButtonNuevoGuardarCambiosToolBarServicioCliente.setVisible((this.isVisibilidadCeldaNuevoServicioCliente && this.isPermisoNuevoServicioCliente && this.isPermisoGuardarCambiosServicioCliente));			
			
			if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonModificarToolBarServicioCliente.setVisible((this.isVisibilidadCeldaModificarServicioCliente && this.isPermisoActualizarServicioCliente));	
			this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarToolBarServicioCliente.setVisible((this.isVisibilidadCeldaActualizarServicioCliente  && this.isPermisoActualizarServicioCliente));	
			this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarToolBarServicioCliente.setVisible((this.isVisibilidadCeldaEliminarServicioCliente && this.isPermisoEliminarServicioCliente));
			this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarToolBarServicioCliente.setVisible(this.isVisibilidadCeldaCancelarServicioCliente);				
			this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosToolBarServicioCliente.setVisible((this.isVisibilidadCeldaGuardarServicioCliente && this.isPermisoGuardarCambiosServicioCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarServicioCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosServicioCliente && this.isPermisoGuardarCambiosServicioCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoServicioCliente.setVisible((this.isVisibilidadCeldaNuevoServicioCliente && this.isPermisoNuevoServicioCliente));			
			this.jMenuItemDuplicarServicioCliente.setVisible((this.isVisibilidadCeldaDuplicarServicioCliente && this.isPermisoDuplicarServicioCliente));			
			this.jMenuItemCopiarServicioCliente.setVisible((this.isVisibilidadCeldaCopiarServicioCliente && this.isPermisoCopiarServicioCliente));			
			this.jMenuItemVerFormServicioCliente.setVisible((this.isVisibilidadCeldaVerFormServicioCliente && this.isPermisoVerFormServicioCliente));			
			this.jMenuItemAbrirOrderByServicioCliente.setVisible((this.isVisibilidadCeldaOrdenServicioCliente && this.isPermisoOrdenServicioCliente));			
			//this.jMenuItemMostrarOcultarServicioCliente.setVisible((this.isVisibilidadCeldaOrdenServicioCliente && this.isPermisoOrdenServicioCliente));
			this.jMenuItemDetalleAbrirOrderByServicioCliente.setVisible((this.isVisibilidadCeldaOrdenServicioCliente && this.isPermisoOrdenServicioCliente));			
			//this.jMenuItemDetalleMostrarOcultarServicioCliente.setVisible((this.isVisibilidadCeldaOrdenServicioCliente && this.isPermisoOrdenServicioCliente));			
			this.jMenuItemNuevoRelacionesServicioCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesServicioCliente && this.isPermisoNuevoServicioCliente));			
			this.jMenuItemNuevoGuardarCambiosServicioCliente.setVisible((this.isVisibilidadCeldaNuevoServicioCliente && this.isPermisoNuevoServicioCliente && this.isPermisoGuardarCambiosServicioCliente));									
			
			if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			this.jInternalFrameDetalleFormServicioCliente.jMenuItemModificarServicioCliente.setVisible((this.isVisibilidadCeldaModificarServicioCliente && this.isPermisoActualizarServicioCliente));	
			this.jInternalFrameDetalleFormServicioCliente.jMenuItemActualizarServicioCliente.setVisible((this.isVisibilidadCeldaActualizarServicioCliente && this.isPermisoActualizarServicioCliente));	
			this.jInternalFrameDetalleFormServicioCliente.jMenuItemEliminarServicioCliente.setVisible((this.isVisibilidadCeldaEliminarServicioCliente && this.isPermisoEliminarServicioCliente));
			this.jInternalFrameDetalleFormServicioCliente.jMenuItemCancelarServicioCliente.setVisible(this.isVisibilidadCeldaCancelarServicioCliente);				
			}
			
			this.jMenuItemGuardarCambiosServicioCliente.setVisible((this.isVisibilidadCeldaGuardarServicioCliente && this.isPermisoGuardarCambiosServicioCliente));						
			this.jMenuItemGuardarCambiosTablaServicioCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosServicioCliente && this.isPermisoGuardarCambiosServicioCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoServicioCliente=this.jButtonNuevoServicioCliente.isVisible();
			this.isVisibilidadCeldaDuplicarServicioCliente=this.jButtonDuplicarServicioCliente.isVisible();
			this.isVisibilidadCeldaCopiarServicioCliente=this.jButtonCopiarServicioCliente.isVisible();
			this.isVisibilidadCeldaVerFormServicioCliente=this.jButtonVerFormServicioCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenServicioCliente=this.jButtonAbrirOrderByServicioCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=this.jButtonNuevoRelacionesServicioCliente.isVisible();
			this.isVisibilidadCeldaModificarServicioCliente=this.jButtonModificarServicioCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			this.isVisibilidadCeldaActualizarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarServicioCliente.isVisible();
			this.isVisibilidadCeldaEliminarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarServicioCliente.isVisible();
			this.isVisibilidadCeldaCancelarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarServicioCliente.isVisible();
			this.isVisibilidadCeldaGuardarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosServicioCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=this.jButtonGuardarCambiosTablaServicioCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoServicioCliente=this.jButtonNuevoToolBarServicioCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=this.jButtonNuevoRelacionesToolBarServicioCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			this.isVisibilidadCeldaModificarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jButtonModificarToolBarServicioCliente.isVisible();
			this.isVisibilidadCeldaActualizarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarToolBarServicioCliente.isVisible();
			this.isVisibilidadCeldaEliminarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarToolBarServicioCliente.isVisible();
			this.isVisibilidadCeldaCancelarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarToolBarServicioCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarServicioCliente=this.jButtonGuardarCambiosToolBarServicioCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=this.jButtonGuardarCambiosTablaToolBarServicioCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoServicioCliente=this.jMenuItemNuevoServicioCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=this.jMenuItemNuevoRelacionesServicioCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			this.isVisibilidadCeldaModificarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jMenuItemModificarServicioCliente.isVisible();
			this.isVisibilidadCeldaActualizarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jMenuItemActualizarServicioCliente.isVisible();
			this.isVisibilidadCeldaEliminarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jMenuItemEliminarServicioCliente.isVisible();
			this.isVisibilidadCeldaCancelarServicioCliente=this.jInternalFrameDetalleFormServicioCliente.jMenuItemCancelarServicioCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarServicioCliente=this.jMenuItemGuardarCambiosServicioCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=this.jMenuItemGuardarCambiosTablaServicioCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesServicioCliente(Boolean esInicializar) {
		if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesServicioCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualServicioCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualServicioCliente() {
		this.jButtonNuevoServicioCliente.setVisible(this.isPermisoNuevoServicioCliente);			
		this.jButtonDuplicarServicioCliente.setVisible(this.isPermisoDuplicarServicioCliente);			
		this.jButtonCopiarServicioCliente.setVisible(this.isPermisoCopiarServicioCliente);			
		this.jButtonVerFormServicioCliente.setVisible(this.isPermisoVerFormServicioCliente);			
		
		this.jButtonAbrirOrderByServicioCliente.setVisible(this.isPermisoOrdenServicioCliente);					
		
		this.jButtonNuevoRelacionesServicioCliente.setVisible(this.isPermisoNuevoServicioCliente);			
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonModificarServicioCliente.setVisible(this.isPermisoActualizarServicioCliente);	
			this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarServicioCliente.setVisible(this.isPermisoActualizarServicioCliente);	
			this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarServicioCliente.setVisible(this.isPermisoEliminarServicioCliente);
			this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarServicioCliente.setVisible(this.isVisibilidadCeldaCancelarServicioCliente);						
			this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosServicioCliente.setVisible(this.isPermisoGuardarCambiosServicioCliente);							
		}
		
		this.jButtonGuardarCambiosTablaServicioCliente.setVisible(this.isPermisoActualizarServicioCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleServicioCliente() {
		this.jInternalFrameDetalleFormServicioCliente.jButtonModificarServicioCliente.setVisible(this.isPermisoActualizarServicioCliente);	
		this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarServicioCliente.setVisible(this.isPermisoActualizarServicioCliente);	
		this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarServicioCliente.setVisible(this.isPermisoEliminarServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarServicioCliente.setVisible(this.isVisibilidadCeldaCancelarServicioCliente);							
		this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosServicioCliente.setVisible((this.isVisibilidadCeldaGuardarServicioCliente && this.isPermisoGuardarCambiosServicioCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosServicioCliente() {
		if(ServicioClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualServicioCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesServicioCliente() {
	}
	
	public void jTableDatosServicioClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarServicioCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidServicioClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serviciocliente==null) {
						this.serviciocliente = new ServicioCliente();
					}

					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				}

				if(this.serviciocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.serviciocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingServicioCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaServicioClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebServicioCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosServicioCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosServicioCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.servicioclienteLogic.getConnexion());

				if(this.serviciocliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.serviciocliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderServicioCliente=(TitledBorder)this.jScrollPanelDatosServicioCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderServicioCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaServicioClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serviciocliente==null) {
						this.serviciocliente = new ServicioCliente();
					}

					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				}

				if(this.serviciocliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.serviciocliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingServicioCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteServicioClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderServicioCliente=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosServicioCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderServicioCliente=(TitledBorder)this.jScrollPanelDatosServicioCliente.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderServicioCliente.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteServicioClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebServicioCliente(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosServicioCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosServicioCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.servicioclienteLogic.getConnexion());

				if(this.serviciocliente.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.serviciocliente.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderServicioCliente=(TitledBorder)this.jScrollPanelDatosServicioCliente.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderServicioCliente.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteServicioClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serviciocliente==null) {
						this.serviciocliente = new ServicioCliente();
					}

					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				}

				if(this.serviciocliente.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.serviciocliente.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingServicioCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaServicioClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebServicioCliente(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosServicioCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosServicioCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.servicioclienteLogic.getConnexion());

				if(this.serviciocliente.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.serviciocliente.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderServicioCliente=(TitledBorder)this.jScrollPanelDatosServicioCliente.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderServicioCliente.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaServicioClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serviciocliente==null) {
						this.serviciocliente = new ServicioCliente();
					}

					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				}

				if(this.serviciocliente.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.serviciocliente.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingServicioCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoServicioClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderServicioCliente=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosServicioCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderServicioCliente=(TitledBorder)this.jScrollPanelDatosServicioCliente.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderServicioCliente.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoServicioClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebServicioCliente(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosServicioCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosServicioCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.servicioclienteLogic.getConnexion());

				if(this.serviciocliente.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.serviciocliente.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderServicioCliente=(TitledBorder)this.jScrollPanelDatosServicioCliente.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderServicioCliente.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoServicioClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serviciocliente==null) {
						this.serviciocliente = new ServicioCliente();
					}

					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				}

				if(this.serviciocliente.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.serviciocliente.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingServicioCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_precioServicioClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprecio=true;

			idTienePermisotipoprecio=this.tienePermisosUsuarioEnPaginaWebServicioCliente(TipoPrecioConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprecio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosServicioCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosServicioCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);

				this.tipoprecioBeanSwingJInternalFrame=new TipoPrecioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprecioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprecioBeanSwingJInternalFrame.getTipoPrecioLogic().setConnexion(this.servicioclienteLogic.getConnexion());

				if(this.serviciocliente.getid_tipo_precio()!=null) {
					this.tipoprecioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprecioBeanSwingJInternalFrame.setIdActual(this.serviciocliente.getid_tipo_precio());
					this.tipoprecioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprecioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprecioBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPrecio();
				}

				JInternalFrameBase jinternalFrame =this.tipoprecioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderServicioCliente=(TitledBorder)this.jScrollPanelDatosServicioCliente.getBorder();
				TitledBorder titledBordertipoprecio=(TitledBorder)this.tipoprecioBeanSwingJInternalFrame.jScrollPanelDatosTipoPrecio.getBorder();

				titledBordertipoprecio.setTitle(titledBorderServicioCliente.getTitle() + " -> Tipo Precio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_precioServicioClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serviciocliente==null) {
						this.serviciocliente = new ServicioCliente();
					}

					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				}

				if(this.serviciocliente.getid_tipo_precio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_precio = "+this.serviciocliente.getid_tipo_precio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingServicioCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioServicioClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serviciocliente==null) {
						this.serviciocliente = new ServicioCliente();
					}

					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				}

				if(this.serviciocliente.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.serviciocliente.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingServicioCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionServicioClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualServicioCliente(this.getserviciocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serviciocliente==null) {
						this.serviciocliente = new ServicioCliente();
					}

					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);
				}

				if(this.serviciocliente.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.serviciocliente.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingServicioCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaServicioClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingServicioCliente(false,false);

			this.getServicioClientesFK_IdBodega();

			this.inicializarActualizarBindingServicioCliente(false);

			//if(ServicioClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingServicioCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteServicioClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingServicioCliente(false,false);

			this.getServicioClientesFK_IdCliente();

			this.inicializarActualizarBindingServicioCliente(false);

			//if(ServicioClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingServicioCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaServicioClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingServicioCliente(false,false);

			this.getServicioClientesFK_IdEmpresa();

			this.inicializarActualizarBindingServicioCliente(false);

			//if(ServicioClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingServicioCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoServicioClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingServicioCliente(false,false);

			this.getServicioClientesFK_IdProducto();

			this.inicializarActualizarBindingServicioCliente(false);

			//if(ServicioClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingServicioCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPrecioServicioClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingServicioCliente(false,false);

			this.getServicioClientesFK_IdTipoPrecio();

			this.inicializarActualizarBindingServicioCliente(false);

			//if(ServicioClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingServicioCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.servicioclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameServicioCliente() {
		if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) {
			this.jInternalFrameDetalleFormServicioCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormServicioCliente.dispose();
			this.jInternalFrameDetalleFormServicioCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoServicioCliente!=null) {
			this.jInternalFrameReporteDinamicoServicioCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoServicioCliente.dispose();
			this.jInternalFrameReporteDinamicoServicioCliente=null;
		}
		
		if(this.jInternalFrameImportacionServicioCliente!=null) {
			this.jInternalFrameImportacionServicioCliente.setVisible(false);	    			
			this.jInternalFrameImportacionServicioCliente.dispose();
			this.jInternalFrameImportacionServicioCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessServicioCliente();
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoServicioCliente")) {
				jButtonNuevoServicioClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarServicioCliente")) {
				jButtonDuplicarServicioClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarServicioCliente")) {
				jButtonCopiarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormServicioCliente")) {
				jButtonVerFormServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarServicioCliente")) {
				jButtonNuevoServicioClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarServicioCliente")) {
				jButtonDuplicarServicioClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoServicioCliente")) {
				jButtonNuevoServicioClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarServicioCliente")) {
				jButtonDuplicarServicioClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesServicioCliente")) {
				jButtonNuevoServicioClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarServicioCliente")) {
				jButtonNuevoServicioClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesServicioCliente")) {
				jButtonNuevoServicioClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarServicioCliente")) {
				jButtonModificarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarServicioCliente")) {
				jButtonModificarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarServicioCliente")) {
				jButtonModificarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarServicioCliente")) {
				jButtonActualizarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarServicioCliente")) {
				jButtonActualizarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarServicioCliente")) {
				jButtonActualizarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarServicioCliente")) {
				jButtonEliminarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarServicioCliente")) {
				jButtonEliminarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarServicioCliente")) {
				jButtonEliminarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarServicioCliente")) {
				jButtonCancelarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarServicioCliente")) {
				jButtonCancelarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarServicioCliente")) {
				jButtonCancelarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarServicioCliente")) {
				jButtonCerrarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarServicioCliente")) {
				jButtonCerrarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarServicioCliente")) {
				jButtonCerrarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarServicioCliente")) {
				jButtonMostrarOcultarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarServicioCliente")) {
				jButtonCancelarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosServicioCliente")) {
				jButtonGuardarCambiosServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarServicioCliente")) {
				jButtonGuardarCambiosServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarServicioCliente")) {
				jButtonCopiarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarServicioCliente")) {
				jButtonVerFormServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosServicioCliente")) {
				jButtonGuardarCambiosServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarServicioCliente")) {
				jButtonCopiarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormServicioCliente")) {
				jButtonVerFormServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaServicioCliente")) {
				jButtonGuardarCambiosServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarServicioCliente")) {
				jButtonGuardarCambiosServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaServicioCliente")) {
				jButtonGuardarCambiosServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionServicioCliente")) {
				jButtonRecargarInformacionServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarServicioCliente")) {
				jButtonRecargarInformacionServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionServicioCliente")) {
				jButtonRecargarInformacionServicioClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresServicioCliente")) {
				jButtonAnterioresServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarServicioCliente")) {
				jButtonAnterioresServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreServicioCliente")) {
				jButtonAnterioresServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesServicioCliente")) {
				jButtonSiguientesServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarServicioCliente")) {
				jButtonSiguientesServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesServicioCliente")) {
				jButtonSiguientesServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByServicioCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByServicioCliente")) {
				jButtonAbrirOrderByServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarServicioCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarServicioCliente")) {
				jButtonMostrarOcultarServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosServicioCliente")) {
				jButtonNuevoGuardarCambiosServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarServicioCliente")) {
				jButtonNuevoGuardarCambiosServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosServicioCliente")) {
				jButtonNuevoGuardarCambiosServicioClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoServicioCliente")) {
				jButtonCerrarReporteDinamicoServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoServicioCliente")) {
				jButtonGenerarReporteDinamicoServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoServicioCliente")) {
				
				jButtonGenerarExcelReporteDinamicoServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionServicioCliente")) {
				jButtonCerrarImportacionServicioClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionServicioCliente")) {
				
				jButtonGenerarImportacionServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionServicioCliente")) {
				
				jButtonAbrirImportacionServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesServicioCliente")) {
				jComboBoxTiposAccionesServicioClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesServicioCliente")) {
				jComboBoxTiposRelacionesServicioClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioServicioCliente")) {
				jComboBoxTiposAccionesServicioClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarServicioCliente")) {
				
				jComboBoxTiposSeleccionarServicioClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralServicioCliente")) {
				jTextFieldValorCampoGeneralServicioClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByServicioCliente")) {
				jButtonAbrirOrderByServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarServicioCliente")) {
				jButtonAbrirOrderByServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByServicioCliente")) {
				jButtonCerrarOrderByServicioClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idServicioClienteBusqueda")) {
				this.jButtonidServicioClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaServicioClienteUpdate")) {
				this.jButtonid_empresaServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaServicioClienteBusqueda")) {
				this.jButtonid_empresaServicioClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteServicioCliente")) {
				this.jButtonid_clienteServicioClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteServicioClienteUpdate")) {
				this.jButtonid_clienteServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteServicioClienteBusqueda")) {
				this.jButtonid_clienteServicioClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaServicioClienteUpdate")) {
				this.jButtonid_bodegaServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaServicioClienteBusqueda")) {
				this.jButtonid_bodegaServicioClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoServicioCliente")) {
				this.jButtonid_productoServicioClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoServicioClienteUpdate")) {
				this.jButtonid_productoServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoServicioClienteBusqueda")) {
				this.jButtonid_productoServicioClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_precioServicioClienteUpdate")) {
				this.jButtonid_tipo_precioServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_precioServicioClienteBusqueda")) {
				this.jButtonid_tipo_precioServicioClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioServicioClienteBusqueda")) {
				this.jButtonprecioServicioClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionServicioClienteBusqueda")) {
				this.jButtondescripcionServicioClienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteServicioCliente")) {
				this.jButtonid_clienteServicioClienteActionPerformed(evt);
			}
			else if(sTipo.equals("id_productoServicioCliente")) {
				this.jButtonid_productoServicioClienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaServicioCliente")) {
				this.jButtonFK_IdBodegaServicioClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteServicioCliente")) {
				this.jButtonFK_IdClienteServicioClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoServicioCliente")) {
				this.jButtonFK_IdProductoServicioClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoPrecioServicioCliente")) {
				this.jButtonFK_IdTipoPrecioServicioClienteActionPerformed(evt);
			}
			
			;
			
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessServicioCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaServicioClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				


				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ServicioCliente servicioclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				servicioclienteLocal=this.serviciocliente;
			} else {
				servicioclienteLocal=this.servicioclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
							
				
				


				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaServicioClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
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
			
			


			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaServicioClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
								
						
				


				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
								
				
				


				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaServicioClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaServicioClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaServicioClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
							
				
				


				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaServicioClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.servicioclienteAnterior =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.servicioclienteAnterior =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
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
			
			


			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaServicioClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
								
				
				


				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaServicioClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaServicioClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaServicioClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosServicioCliente")) {
					jCheckBoxSeleccionarTodosServicioClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosServicioCliente")) {
					jCheckBoxSeleccionadosServicioClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarServicioCliente")) {
					
				}
				
				


				
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
												
				
				


				
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaServicioClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.servicioclienteAnterior =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.servicioclienteAnterior =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaServicioClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
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
			
			


			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaServicioClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serviciocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serviciocliente);
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
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
				
				


				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ServicioCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ServicioCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaServicioClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.servicioclienteAnterior =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarServicioCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosServicioClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosServicioCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.serviciocliente =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.serviciocliente =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.serviciocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarServicioCliente")) {
				
				}
				
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarServicioCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosServicioCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarServicioCliente")) {
			
			}
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessServicioCliente();
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
			if(sTipo.equals("NuevoServicioCliente")) {
				jButtonNuevoServicioClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarServicioCliente")) {
				jButtonDuplicarServicioClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarServicioCliente")) {
				jButtonCopiarServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormServicioCliente")) {
				jButtonVerFormServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesServicioCliente")) {
				jButtonNuevoServicioClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarServicioCliente")) {
				jButtonModificarServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarServicioCliente")) {
				jButtonActualizarServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarServicioCliente")) {
				jButtonEliminarServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaServicioCliente")) {
				jButtonGuardarCambiosServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarServicioCliente")) {
				jButtonCancelarServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarServicioCliente")) {
				jButtonCerrarServicioClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosServicioCliente")) {
				jButtonGuardarCambiosServicioClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosServicioCliente")) {
				jButtonNuevoGuardarCambiosServicioClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByServicioCliente")) {
				jButtonAbrirOrderByServicioClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionServicioCliente")) {
				jButtonRecargarInformacionServicioClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresServicioCliente")) {
				jButtonAnterioresServicioClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesServicioCliente")) {
				jButtonSiguientesServicioClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idServicioClienteBusqueda")) {
				this.jButtonidServicioClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaServicioClienteUpdate")) {
				this.jButtonid_empresaServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaServicioClienteBusqueda")) {
				this.jButtonid_empresaServicioClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteServicioCliente")) {
				this.jButtonid_clienteServicioClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteServicioClienteUpdate")) {
				this.jButtonid_clienteServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteServicioClienteBusqueda")) {
				this.jButtonid_clienteServicioClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaServicioClienteUpdate")) {
				this.jButtonid_bodegaServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaServicioClienteBusqueda")) {
				this.jButtonid_bodegaServicioClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoServicioCliente")) {
				this.jButtonid_productoServicioClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoServicioClienteUpdate")) {
				this.jButtonid_productoServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoServicioClienteBusqueda")) {
				this.jButtonid_productoServicioClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_precioServicioClienteUpdate")) {
				this.jButtonid_tipo_precioServicioClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_precioServicioClienteBusqueda")) {
				this.jButtonid_tipo_precioServicioClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioServicioClienteBusqueda")) {
				this.jButtonprecioServicioClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionServicioClienteBusqueda")) {
				this.jButtondescripcionServicioClienteBusquedaActionPerformed(evt);
			}
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessServicioCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameServicioCliente")) {
				closingInternalFrameServicioCliente();
				
			} else if(sTipo.equals("jButtonCancelarServicioCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormServicioCliente = (JInternalFrameBase)evt.getSource();
	            	
	            ServicioClienteBeanSwingJInternalFrame jInternalFrameParent=(ServicioClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormServicioCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarServicioClienteActionPerformed(null);
			}
			
			ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.serviciocliente,new Object(),this.servicioclienteParameterGeneral,this.servicioclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormServicioCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormServicioCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormServicioCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.serviciocliente)) {
			if(!esControlTabla) {
				if(ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);			
				}
				
				if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualServicioCliente(this.serviciocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.servicioclienteReturnGeneral=servicioclienteLogic.procesarEventosServicioClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.servicioclienteLogic.getServicioClientes(),this.serviciocliente,this.servicioclienteParameterGeneral,this.isEsNuevoServicioCliente,classes);//this.servicioclienteLogic.getServicioCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanServicioCliente(this.servicioclienteReturnGeneral,this.servicioclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanServicioCliente(classes,this.servicioclienteReturnGeneral,this.servicioclienteBean,false);
					}
						
					if(this.servicioclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyServicioCliente(this.servicioclienteReturnGeneral.getServicioCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioServicioCliente(this.servicioclienteReturnGeneral.getServicioCliente());	
					}
						
					if(this.servicioclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioServicioCliente(this.servicioclienteReturnGeneral.getServicioCliente(),classes);//this.servicioclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioServicioCliente(this.serviciocliente,classes);//this.servicioclienteBean);									
				}
			
				if(ServicioClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualServicioCliente(this.serviciocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysServicioCliente(this.serviciocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.servicioclienteAnterior!=null) {
						this.serviciocliente=this.servicioclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.servicioclienteReturnGeneral=servicioclienteLogic.procesarEventosServicioClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.servicioclienteLogic.getServicioClientes(),this.serviciocliente,this.servicioclienteParameterGeneral,this.isEsNuevoServicioCliente,classes);//this.servicioclienteLogic.getServicioCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.servicioclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.servicioclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.servicioclienteReturnGeneral.getServicioCliente(),servicioclienteLogic.getServicioClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.servicioclienteReturnGeneral.getServicioCliente(),this.servicioclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosServicioCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosServicioCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosServicioCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosServicioCliente() throws Exception {
		
		ServicioClienteModel servicioclienteModel=(ServicioClienteModel)this.jTableDatosServicioCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			servicioclienteModel.servicioclientes=this.servicioclienteLogic.getServicioClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			servicioclienteModel.servicioclientes=this.servicioclientes;
		}
		
		
		((ServicioClienteModel) this.jTableDatosServicioCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaServicioCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getservicioclienteAnterior(),this.servicioclienteLogic.getServicioClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getservicioclienteAnterior(),this.servicioclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosServicioCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioServicioCliente(ServicioCliente serviciocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
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
										
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.serviciocliente,new Object(),generalEntityParameterGeneral,this.servicioclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ServicioClienteConstantesFunciones.getClassesRelationshipsOfServicioCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ServicioClienteConstantesFunciones.getClassesRelationshipsFromStringsOfServicioCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormServicioCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ServicioClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.serviciocliente,new Object(),generalEntityParameterGeneral,this.servicioclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioServicioCliente(ServicioClienteBean servicioclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanServicioCliente(ArrayList<Classe> classes,ServicioClienteReturnGeneral servicioclienteReturnGeneral,ServicioClienteBean servicioclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualServicioCliente(ServicioCliente serviciocliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.serviciocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormServicioCliente = new ServicioClienteDetalleFormJInternalFrame(jDesktopPane,this.servicioclienteSessionBean.getConGuardarRelaciones(),this.servicioclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.setVisible(false);
		this.jInternalFrameDetalleFormServicioCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormServicioCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormServicioCliente.servicioclienteLogic=this.servicioclienteLogic;
		
		this.cargarCombosFrameForeignKeyServicioCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleServicioCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleServicioCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyServicioCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyServicioCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormServicioCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarServicioCliente"));
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonModificarServicioCliente.addActionListener(new ButtonActionListener(this,"ModificarServicioCliente"));

		
		this.jInternalFrameDetalleFormServicioCliente.jButtonModificarToolBarServicioCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarServicioCliente"));
					
		this.jInternalFrameDetalleFormServicioCliente.jMenuItemModificarServicioCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarServicioCliente"));		
		
		
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarServicioCliente.addActionListener (new ButtonActionListener(this,"ActualizarServicioCliente"));
		
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarToolBarServicioCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarServicioCliente"));
						
		this.jInternalFrameDetalleFormServicioCliente.jMenuItemActualizarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarServicioCliente"));		
		
		
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarServicioCliente.addActionListener (new ButtonActionListener(this,"EliminarServicioCliente"));
		
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarServicioCliente"));
								
		this.jInternalFrameDetalleFormServicioCliente.jMenuItemEliminarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarServicioCliente"));		
		
		
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarServicioCliente.addActionListener (new ButtonActionListener(this,"CancelarServicioCliente"));
		
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarServicioCliente"));
					
		this.jInternalFrameDetalleFormServicioCliente.jMenuItemCancelarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarServicioCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormServicioCliente.jMenuItemDetalleCerrarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarServicioCliente"));		
		
		
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarServicioCliente"));
		
		
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarServicioCliente"));
		
		
		
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioServicioCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonidServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"idServicioClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_empresaServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_empresaServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaServicioClienteBusqueda"));
		//jButtonid_clienteServicioCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteServicioClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioCliente.addActionListener(new ButtonActionListener(this,"id_clienteServicioCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteServicioClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_bodegaServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_bodegaServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaServicioClienteBusqueda"));
		//jButtonid_productoServicioCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoServicioClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioCliente.addActionListener(new ButtonActionListener(this,"id_productoServicioCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_productoServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoServicioClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_tipo_precioServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_tipo_precioServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioServicioClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonprecioServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"precioServicioClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtondescripcionServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionServicioClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormServicioCliente.jTabbedPaneRelacionesServicioCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesServicioCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameServicioCliente"));
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarServicioCliente"));
		}
		
		this.jTableDatosServicioCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarServicioCliente"));
		
		this.jTableDatosServicioCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarServicioCliente"));
		
		this.jButtonNuevoServicioCliente.addActionListener(new ButtonActionListener(this,"NuevoServicioCliente"));
		
		this.jButtonDuplicarServicioCliente.addActionListener(new ButtonActionListener(this,"DuplicarServicioCliente"));
		
		this.jButtonCopiarServicioCliente.addActionListener(new ButtonActionListener(this,"CopiarServicioCliente"));
		
		this.jButtonVerFormServicioCliente.addActionListener(new ButtonActionListener(this,"VerFormServicioCliente"));
		
		
		this.jButtonNuevoToolBarServicioCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarServicioCliente"));
			
		this.jButtonDuplicarToolBarServicioCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarServicioCliente"));
			
		this.jMenuItemNuevoServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoServicioCliente"));
			
		this.jMenuItemDuplicarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarServicioCliente"));		
		
		
		this.jButtonNuevoRelacionesServicioCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesServicioCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarServicioCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarServicioCliente"));
			
		this.jMenuItemNuevoRelacionesServicioCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesServicioCliente"));		
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonModificarServicioCliente.addActionListener(new ButtonActionListener(this,"ModificarServicioCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonModificarToolBarServicioCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarServicioCliente"));
			
			this.jInternalFrameDetalleFormServicioCliente.jMenuItemModificarServicioCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarServicioCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarServicioCliente.addActionListener (new ButtonActionListener(this,"ActualizarServicioCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonActualizarToolBarServicioCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarServicioCliente"));
				
			this.jInternalFrameDetalleFormServicioCliente.jMenuItemActualizarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarServicioCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarServicioCliente.addActionListener (new ButtonActionListener(this,"EliminarServicioCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonEliminarToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarServicioCliente"));
						
			this.jInternalFrameDetalleFormServicioCliente.jMenuItemEliminarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarServicioCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarServicioCliente.addActionListener (new ButtonActionListener(this,"CancelarServicioCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonCancelarToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarServicioCliente"));
			
			this.jInternalFrameDetalleFormServicioCliente.jMenuItemCancelarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarServicioCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarServicioCliente"));		
		
		
		this.jButtonCerrarServicioCliente.addActionListener (new ButtonActionListener(this,"CerrarServicioCliente"));
		
		
		this.jButtonCerrarToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarServicioCliente"));
			
		this.jMenuItemCerrarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarServicioCliente"));
			
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jMenuItemDetalleCerrarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarServicioCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosServicioCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosServicioCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarServicioCliente"));
		}
		
		this.jButtonCopiarToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarServicioCliente"));
			
		this.jButtonVerFormToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarServicioCliente"));
		
		this.jMenuItemGuardarCambiosServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosServicioCliente"));
			
		this.jMenuItemCopiarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarServicioCliente"));		
		
		this.jMenuItemVerFormServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormServicioCliente"));		
		
		
		this.jButtonGuardarCambiosTablaServicioCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaServicioCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarServicioCliente"));
			
		this.jMenuItemGuardarCambiosTablaServicioCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaServicioCliente"));		
		
		
		
		this.jButtonRecargarInformacionServicioCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionServicioCliente"));
					
		this.jButtonRecargarInformacionToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarServicioCliente"));
		
		this.jMenuItemRecargarInformacionServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionServicioCliente"));		
		
		
		
		this.jButtonAnterioresServicioCliente.addActionListener (new ButtonActionListener(this,"AnterioresServicioCliente"));
		
		
		this.jButtonAnterioresToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarServicioCliente"));
		
		this.jMenuItemAnterioresServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresServicioCliente"));		
		
		
		this.jButtonSiguientesServicioCliente.addActionListener (new ButtonActionListener(this,"SiguientesServicioCliente"));
		
		
		this.jButtonSiguientesToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarServicioCliente"));
			
		this.jMenuItemSiguientesServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesServicioCliente"));
			
		this.jMenuItemAbrirOrderByServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByServicioCliente"));
			
		this.jMenuItemMostrarOcultarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarServicioCliente"));
			
		this.jMenuItemDetalleAbrirOrderByServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByServicioCliente"));
			
		this.jMenuItemDetalleMostarOcultarServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarServicioCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosServicioCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosServicioCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarServicioCliente"));
			
		this.jMenuItemNuevoGuardarCambiosServicioCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosServicioCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosServicioCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosServicioCliente"));

		this.jCheckBoxSeleccionadosServicioCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosServicioCliente"));
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioServicioCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesServicioCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesServicioCliente"));
			
		this.jComboBoxTiposAccionesServicioCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesServicioCliente"));
					
		this.jComboBoxTiposSeleccionarServicioCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarServicioCliente"));
			
		this.jTextFieldValorCampoGeneralServicioCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralServicioCliente"));		
		
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonidServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"idServicioClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_empresaServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_empresaServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaServicioClienteBusqueda"));
		//jButtonid_clienteServicioCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteServicioClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioCliente.addActionListener(new ButtonActionListener(this,"id_clienteServicioCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteServicioClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_bodegaServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_bodegaServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaServicioClienteBusqueda"));
		//jButtonid_productoServicioCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoServicioClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioCliente.addActionListener(new ButtonActionListener(this,"id_productoServicioCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_productoServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoServicioClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_tipo_precioServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_tipo_precioServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioServicioClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonprecioServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"precioServicioClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtondescripcionServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionServicioClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaServicioCliente.addActionListener(new ButtonActionListener(this,"FK_IdBodegaServicioCliente"));

			this.jButtonFK_IdClienteServicioCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteServicioCliente"));

			this.jButtonBuscarFK_IdClienteid_clienteServicioCliente.addActionListener(new ButtonActionListener(this,"id_clienteServicioCliente"));

			this.jButtonFK_IdProductoServicioCliente.addActionListener(new ButtonActionListener(this,"FK_IdProductoServicioCliente"));

			this.jButtonBuscarFK_IdProductoid_productoServicioCliente.addActionListener(new ButtonActionListener(this,"id_productoServicioCliente"));

			this.jButtonFK_IdTipoPrecioServicioCliente.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrecioServicioCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoServicioCliente!=null) {
				this.jInternalFrameReporteDinamicoServicioCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoServicioCliente"));
				this.jInternalFrameReporteDinamicoServicioCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoServicioCliente"));
				this.jInternalFrameReporteDinamicoServicioCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoServicioCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoServicioCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoServicioCliente"));				
			//this.jButtonGenerarReporteDinamicoServicioCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoServicioCliente"));
			//this.jButtonGenerarExcelReporteDinamicoServicioCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoServicioCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionServicioCliente!=null) {
				this.jInternalFrameImportacionServicioCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionServicioCliente"));
				this.jInternalFrameImportacionServicioCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionServicioCliente"));
				this.jInternalFrameImportacionServicioCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionServicioCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByServicioCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByServicioCliente"));
			
			this.jButtonAbrirOrderByToolBarServicioCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarServicioCliente"));			
			
			if(this.jInternalFrameOrderByServicioCliente!=null) {
				this.jInternalFrameOrderByServicioCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByServicioCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormServicioCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormServicioCliente.jTabbedPaneRelacionesServicioCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesServicioCliente"));
		
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
            		closingInternalFrameServicioCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormServicioCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormServicioCliente = (JInternalFrameBase)event.getSource();
	            	
	            ServicioClienteBeanSwingJInternalFrame jInternalFrameParent=(ServicioClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormServicioCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarServicioClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosServicioCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosServicioClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosServicioCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosServicioCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoServicioClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoServicioClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoServicioClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoServicioCliente";
		inputMap = this.jButtonNuevoServicioCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoServicioCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoServicioClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoServicioClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoServicioClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoServicioClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesServicioCliente";
		inputMap = this.jButtonNuevoRelacionesServicioCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesServicioCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoServicioClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarServicioCliente";
		inputMap = this.jButtonModificarServicioCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarServicioCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarServicioClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarServicioCliente";
		inputMap = this.jButtonActualizarServicioCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarServicioCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarServicioClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarServicioCliente";
		inputMap = this.jButtonEliminarServicioCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarServicioCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarServicioClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarServicioCliente";
		inputMap = this.jButtonCancelarServicioCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarServicioCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarServicioClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarServicioCliente";
		inputMap = this.jButtonCerrarServicioCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarServicioCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarServicioClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosServicioCliente";
		inputMap = this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosServicioCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormServicioCliente.jButtonGuardarCambiosServicioCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosServicioClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosServicioCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosServicioClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesServicioCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesServicioClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarServicioCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarServicioClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralServicioCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralServicioClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonidServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"idServicioClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_empresaServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_empresaServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaServicioClienteBusqueda"));
		//jButtonid_clienteServicioCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteServicioClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioCliente.addActionListener(new ButtonActionListener(this,"id_clienteServicioCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteServicioClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_bodegaServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_bodegaServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaServicioClienteBusqueda"));
		//jButtonid_productoServicioCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoServicioClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioCliente.addActionListener(new ButtonActionListener(this,"id_productoServicioCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_productoServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoServicioClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_tipo_precioServicioClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioServicioClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonid_tipo_precioServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioServicioClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtonprecioServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"precioServicioClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormServicioCliente.jButtondescripcionServicioClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionServicioClienteBusqueda"));
		
		
		this.jButtonFK_IdBodegaServicioCliente.addActionListener(new ButtonActionListener(this,"FK_IdBodegaServicioCliente"));

		this.jButtonFK_IdClienteServicioCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteServicioCliente"));

		this.jButtonBuscarFK_IdClienteid_clienteServicioCliente.addActionListener(new ButtonActionListener(this,"id_clienteServicioCliente"));

		this.jButtonFK_IdProductoServicioCliente.addActionListener(new ButtonActionListener(this,"FK_IdProductoServicioCliente"));

		this.jButtonBuscarFK_IdProductoid_productoServicioCliente.addActionListener(new ButtonActionListener(this,"id_productoServicioCliente"));

		this.jButtonFK_IdTipoPrecioServicioCliente.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrecioServicioCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionServicioCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionServicioClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarServicioClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarServicioCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosServicioCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ServicioCliente servicioclienteAux:this.servicioclienteLogic.getServicioClientes()) {
					servicioclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ServicioCliente servicioclienteAux:servicioclientes) {
					servicioclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosServicioClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingServicioCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ServicioCliente servicioclienteAux:this.servicioclienteLogic.getServicioClientes()) {
						servicioclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ServicioCliente servicioclienteAux:servicioclientes) {
						servicioclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ServicioCliente servicioclienteAux:this.servicioclienteLogic.getServicioClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ServicioCliente servicioclienteAux:servicioclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaServicioCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosServicioCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosServicioCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosServicioClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingServicioCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosServicioCliente.getSelectedRows();
			
			ServicioCliente servicioclienteLocal=new ServicioCliente();
			
			//this.seleccionarTodosServicioCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					servicioclienteLocal =(ServicioCliente) this.servicioclienteLogic.getServicioClientes().toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					servicioclienteLocal =(ServicioCliente) this.servicioclientes.toArray()[this.jTableDatosServicioCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				servicioclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ServicioCliente servicioclienteAux:this.servicioclienteLogic.getServicioClientes()) {
						servicioclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ServicioCliente servicioclienteAux:servicioclientes) {
						servicioclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaServicioCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosServicioCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosServicioCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosServicioCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualServicioClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarServicioClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralServicioClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingServicioCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralServicioCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ServicioCliente servicioclienteAux:this.servicioclienteLogic.getServicioClientes()) {
				
						if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							servicioclienteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							servicioclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ServicioCliente servicioclienteAux:servicioclientes) {
					
						if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							servicioclienteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							servicioclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaServicioCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesServicioClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingServicioCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioServicioCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesServicioCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteServicioCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessServicioCliente(conSplash);
				
					this.generarReporteServicioClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoServicioClientesSeleccionados();
				//this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoServicioClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoServicioClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessServicioCliente();
				
				this.exportarServicioClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionServicioClientes();
				//this.importarServicioClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessServicioCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelServicioClientesSeleccionados();
				//this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Servicio Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessServicioCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoServicioCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyServicioCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(ServicioClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteServicioCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessServicioCliente(conSplash);
					
						//this.actualizarParametrosGeneralServicioCliente();
						
						this.generarReporteProcesoAccionServicioClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ServicioClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Servicio ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Servicio Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessServicioCliente();
				
						this.actualizarParametrosGeneralServicioCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.servicioclienteReturnGeneral=servicioclienteLogic.procesarAccionServicioClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.servicioclienteLogic.getServicioClientes(),this.servicioclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarServicioClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralServicioCliente();
					
					ServicioClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarServicioClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesServicioCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormServicioCliente.jComboBoxTiposAccionesFormularioServicioCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessServicioCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesServicioClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessServicioCliente();
			
			if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();		
			ServicioCliente serviciocliente=new ServicioCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingServicioCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesServicioCliente.getSelectedItem();
			
			
			
			
			servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(servicioclientesSeleccionados.size()==1) {
				for(ServicioCliente servicioclienteAux:servicioclientesSeleccionados) {
					serviciocliente=servicioclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessServicioCliente();
			
      		//this.finishProcessServicioCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarServicioClienteReturnGeneral() throws Exception {
		if(this.servicioclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.servicioclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.servicioclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.servicioclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.servicioclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.servicioclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingServicioCliente(false);
		}
		
		if(this.servicioclienteReturnGeneral.getConRetornoLista() || this.servicioclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.servicioclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.servicioclienteLogic.setServicioClientes(this.servicioclienteReturnGeneral.getServicioClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.servicioclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.servicioclienteLogic.setServicioCliente(this.servicioclienteReturnGeneral.getServicioCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingServicioCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralServicioCliente() throws Exception {
		
		
	}
	
	public ArrayList<ServicioCliente> getServicioClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioServicioCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ServicioCliente servicioclienteAux:servicioclienteLogic.getServicioClientes()) {
					if(servicioclienteAux.getIsSelected()) {
						servicioclientesSeleccionados.add(servicioclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ServicioCliente servicioclienteAux:this.servicioclientes) {
					if(servicioclienteAux.getIsSelected()) {
						servicioclientesSeleccionados.add(servicioclienteAux);				
					}
				}
			}
			
			if(servicioclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						servicioclientesSeleccionados.addAll(this.servicioclienteLogic.getServicioClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						servicioclientesSeleccionados.addAll(this.servicioclientes);				
					}
				}
			}
		} else {
			servicioclientesSeleccionados.add(this.serviciocliente);
		}
		
		return servicioclientesSeleccionados;
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
	
	public void generarReporteServicioClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalServicioClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoServicioClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoServicioClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoServicioClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Servicio Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesServicioClientesSeleccionados() throws Exception {
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();		
		
		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteServicioClientes("Todos",servicioclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalServicioClientesSeleccionados() throws Exception {
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();		
		
		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteServicioClientes("Todos",servicioclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionServicioClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();
		
		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteServicioClientes("Todos",servicioclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoServicioClientesSeleccionados() throws Exception {
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoServicioCliente();
		
		
		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoServicioCliente();
		
		
		//this.generarReporteServicioClientes("Todos",servicioclientesSeleccionados ,servicioclienteImplementable,servicioclienteImplementableHome);
	}
	
	public void mostrarImportacionServicioClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionServicioCliente();
		
		this.abrirFrameImportacionServicioCliente();		
		
			
		//this.generarReporteServicioClientes("Todos",servicioclientesSeleccionados ,servicioclienteImplementable,servicioclienteImplementableHome);
	}
	
	public void importarServicioClientes() throws Exception {		
	
	}
	
	public void exportarServicioClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelServicioClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoServicioClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlServicioClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Servicio Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoServicioClientesSeleccionados() throws Exception {
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();		
		
		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serviciocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarServicioCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ServicioCliente servicioclienteAux:servicioclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarServicioCliente(servicioclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//servicioclienteAux.setsDetalleGeneralEntityReporte(servicioclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarServicioCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ServicioClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ServicioClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ServicioClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ServicioClienteConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ServicioClienteConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ServicioClienteConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ServicioClienteConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarServicioCliente(ServicioCliente serviciocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=serviciocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=serviciocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=serviciocliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serviciocliente.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serviciocliente.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serviciocliente.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serviciocliente.gettipoprecio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serviciocliente.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serviciocliente.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelServicioClientesSeleccionados() throws Exception {
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();		
		
		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serviciocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ServicioClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelServicioCliente(row);				
				iRow++;
			}				
			
			for(ServicioCliente servicioclienteAux:servicioclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelServicioCliente(servicioclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlServicioClientesSeleccionados() throws Exception {
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();		
		
		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serviciocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("servicioclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("serviciocliente");
			//elementRoot.appendChild(element);
		
			for(ServicioCliente servicioclienteAux:servicioclientesSeleccionados) {
				element = document.createElement("serviciocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlServicioCliente(servicioclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Servicio Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelServicioCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ServicioClienteConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelServicioCliente(ServicioCliente serviciocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(serviciocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(serviciocliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(serviciocliente.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(serviciocliente.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(serviciocliente.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(serviciocliente.gettipoprecio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(serviciocliente.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(serviciocliente.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlServicioCliente(ServicioCliente serviciocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ServicioClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(serviciocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ServicioClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(serviciocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ServicioClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(serviciocliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(ServicioClienteConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(serviciocliente.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementbodega_descripcion = document.createElement(ServicioClienteConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(serviciocliente.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ServicioClienteConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(serviciocliente.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementtipoprecio_descripcion = document.createElement(ServicioClienteConstantesFunciones.IDTIPOPRECIO);
		elementtipoprecio_descripcion.appendChild(document.createTextNode(serviciocliente.gettipoprecio_descripcion()));
		element.appendChild(elementtipoprecio_descripcion);

		Element elementprecio = document.createElement(ServicioClienteConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(serviciocliente.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementdescripcion = document.createElement(ServicioClienteConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(serviciocliente.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoServicioClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ServicioCliente> servicioclientesSeleccionados=new ArrayList<ServicioCliente>();
		
		servicioclientesSeleccionados=this.getServicioClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoServicioCliente(servicioclientesSeleccionados);
		
		this.generarReporteServicioClientes("Todos",servicioclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoServicioCliente(ArrayList<ServicioCliente> servicioclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ServicioCliente servicioclienteAux:servicioclientesSeleccionados) {
				servicioclienteAux.setsDetalleGeneralEntityReporte(servicioclienteAux.toString());
			
				if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					servicioclienteAux.setsDescripcionGeneralEntityReporte1(servicioclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					servicioclienteAux.setsDescripcionGeneralEntityReporte1(servicioclienteAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					servicioclienteAux.setsDescripcionGeneralEntityReporte1(servicioclienteAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					servicioclienteAux.setsDescripcionGeneralEntityReporte1(servicioclienteAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO)) {
					existe=true;
					servicioclienteAux.setsDescripcionGeneralEntityReporte1(servicioclienteAux.gettipoprecio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ServicioClienteConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					servicioclienteAux.setsDescripcionGeneralEntityReporte1(servicioclienteAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ServicioClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesServicioCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoServicioCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesServicioCliente=true;
				this.isVisibilidadCeldaGuardarCambiosServicioCliente=true;
			}
			
			this.isVisibilidadCeldaModificarServicioCliente=false;
			this.isVisibilidadCeldaActualizarServicioCliente=false;
			this.isVisibilidadCeldaEliminarServicioCliente=false;
			this.isVisibilidadCeldaCancelarServicioCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarServicioCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoServicioCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=false;
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=false;
			this.isVisibilidadCeldaModificarServicioCliente=false;
			this.isVisibilidadCeldaActualizarServicioCliente=true;
			this.isVisibilidadCeldaEliminarServicioCliente=false;
			this.isVisibilidadCeldaCancelarServicioCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarServicioCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoServicioCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=false;
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=false;
			this.isVisibilidadCeldaModificarServicioCliente=false;
			this.isVisibilidadCeldaActualizarServicioCliente=true;
			this.isVisibilidadCeldaEliminarServicioCliente=true;
			this.isVisibilidadCeldaCancelarServicioCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarServicioCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoServicioCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=false;
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=false;
			this.isVisibilidadCeldaModificarServicioCliente=false;
			this.isVisibilidadCeldaActualizarServicioCliente=true;
			this.isVisibilidadCeldaEliminarServicioCliente=false;
			this.isVisibilidadCeldaCancelarServicioCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoServicioCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=true;
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=true;
			this.isVisibilidadCeldaModificarServicioCliente=false;
			this.isVisibilidadCeldaActualizarServicioCliente=false;
			this.isVisibilidadCeldaEliminarServicioCliente=false;
			this.isVisibilidadCeldaCancelarServicioCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarServicioCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoServicioCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=false;
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=false;
			this.isVisibilidadCeldaActualizarServicioCliente=false;
			this.isVisibilidadCeldaEliminarServicioCliente=false;
			this.isVisibilidadCeldaCancelarServicioCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoServicioCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=false;
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=false;
			this.isVisibilidadCeldaModificarServicioCliente=true;
			this.isVisibilidadCeldaActualizarServicioCliente=false;
			this.isVisibilidadCeldaEliminarServicioCliente=false;
			this.isVisibilidadCeldaCancelarServicioCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarServicioCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ServicioClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoServicioCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=true;
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=true;
		} else {
			this.actualizarEstadoPanelsServicioCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarServicioCliente=false;
			//this.isVisibilidadCeldaVerFormServicioCliente=false;
			this.isVisibilidadCeldaDuplicarServicioCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!servicioclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoServicioCliente=false;
			this.isVisibilidadCeldaGuardarCambiosServicioCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(servicioclienteSessionBean.getEsGuardarRelacionado()) {
			if(!servicioclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesServicioCliente=false;												
			}
			
			this.jButtonCerrarServicioCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesServicioCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.serviciocliente)) {
			this.isVisibilidadCeldaActualizarServicioCliente=false;
			this.isVisibilidadCeldaEliminarServicioCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesServicioCliente() {
	}
	
	public void actualizarEstadoPanelsServicioCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionServicioCliente!=null) {
				this.jScrollPanelDatosEdicionServicioCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasServicioCliente!=null) {
				this.jTabbedPaneBusquedasServicioCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosServicioCliente!=null) {
				this.jScrollPanelDatosServicioCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionServicioCliente!=null) {
				this.jPanelPaginacionServicioCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesServicioCliente!=null) {
				this.jPanelParametrosReportesServicioCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionServicioCliente!=null) {
				this.jScrollPanelDatosEdicionServicioCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasServicioCliente!=null) {
				this.jTabbedPaneBusquedasServicioCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosServicioCliente!=null) {
				this.jScrollPanelDatosServicioCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionServicioCliente!=null) {
				this.jPanelPaginacionServicioCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesServicioCliente!=null) {
				this.jPanelParametrosReportesServicioCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionServicioCliente!=null) {
				this.jScrollPanelDatosEdicionServicioCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasServicioCliente!=null) {
				this.jTabbedPaneBusquedasServicioCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosServicioCliente!=null) {
				this.jScrollPanelDatosServicioCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionServicioCliente!=null) {
				this.jPanelPaginacionServicioCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesServicioCliente!=null) {
				this.jPanelParametrosReportesServicioCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionServicioCliente!=null) {
				this.jScrollPanelDatosEdicionServicioCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasServicioCliente!=null) {
				this.jTabbedPaneBusquedasServicioCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosServicioCliente!=null) {
				this.jScrollPanelDatosServicioCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionServicioCliente!=null) {
				this.jPanelPaginacionServicioCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesServicioCliente!=null) {
				this.jPanelParametrosReportesServicioCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionServicioCliente!=null) {
				this.jScrollPanelDatosEdicionServicioCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasServicioCliente!=null) {
				this.jTabbedPaneBusquedasServicioCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosServicioCliente!=null) {
				this.jScrollPanelDatosServicioCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionServicioCliente!=null) {
				this.jPanelPaginacionServicioCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesServicioCliente!=null) {
				this.jPanelParametrosReportesServicioCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionServicioCliente!=null) {
				this.jScrollPanelDatosEdicionServicioCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasServicioCliente!=null) {
				this.jTabbedPaneBusquedasServicioCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosServicioCliente!=null) {
				this.jScrollPanelDatosServicioCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionServicioCliente!=null) {
				this.jPanelPaginacionServicioCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesServicioCliente!=null) {
				this.jPanelParametrosReportesServicioCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionServicioCliente!=null) {
				this.jScrollPanelDatosEdicionServicioCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasServicioCliente!=null) {
				this.jTabbedPaneBusquedasServicioCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosServicioCliente!=null) {
				this.jScrollPanelDatosServicioCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionServicioCliente!=null) {
				this.jPanelPaginacionServicioCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesServicioCliente!=null) {
				this.jPanelParametrosReportesServicioCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasServicioCliente!=null) {
					this.jTabbedPaneBusquedasServicioCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesServicioCliente!=null) {
				this.jPanelParametrosReportesServicioCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasServicioCliente!=null) {
				this.jTabbedPaneBusquedasServicioCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesServicioCliente!=null) {
				this.jPanelParametrosReportesServicioCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdBodegaServicioCliente);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdClienteServicioCliente);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdProductoServicioCliente);}

			this.isVisibilidadFK_IdTipoPrecio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdTipoPrecioServicioCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdBodega=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdBodegaServicioCliente);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdClienteServicioCliente);}

			this.isVisibilidadFK_IdProducto=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdProductoServicioCliente);}

			this.isVisibilidadFK_IdTipoPrecio=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdTipoPrecioServicioCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdBodegaServicioCliente);}

			this.isVisibilidadFK_IdCliente=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdClienteServicioCliente);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdProductoServicioCliente);}

			this.isVisibilidadFK_IdTipoPrecio=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdTipoPrecioServicioCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdBodegaServicioCliente);}

			this.isVisibilidadFK_IdCliente=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdClienteServicioCliente);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdProductoServicioCliente);}

			this.isVisibilidadFK_IdTipoPrecio=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdTipoPrecioServicioCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPrecio(Boolean isParaTipoPrecio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPrecioNegation=!isParaTipoPrecio;

			this.isVisibilidadFK_IdBodega=isParaTipoPrecioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdBodegaServicioCliente);}

			this.isVisibilidadFK_IdCliente=isParaTipoPrecioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdClienteServicioCliente);}

			this.isVisibilidadFK_IdProducto=isParaTipoPrecioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdProductoServicioCliente);}

			this.isVisibilidadFK_IdTipoPrecio=isParaTipoPrecio;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasServicioCliente.remove(jPanelFK_IdTipoPrecioServicioCliente);}
		}
		
	}
	
	
	
	

	public String registrarSesionServicioClienteParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(servicioclienteSessionBean==null) {
				servicioclienteSessionBean=new ServicioClienteSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(servicioclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.servicioclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ServicioClienteConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionServicioCliente(true);
			//clienteSessionBean.setlidServicioClienteActual(this.idServicioClienteActual);

			servicioclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyServicioCliente(true);
			servicioclienteSessionBean.setlIdServicioClienteActualForeignKey(this.idServicioClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionServicioClienteParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(servicioclienteSessionBean==null) {
				servicioclienteSessionBean=new ServicioClienteSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(servicioclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.servicioclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ServicioClienteConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionServicioCliente(true);
			//productoSessionBean.setlidServicioClienteActual(this.idServicioClienteActual);

			servicioclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyServicioCliente(true);
			servicioclienteSessionBean.setlIdServicioClienteActualForeignKey(this.idServicioClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ServicioClienteSessionBean servicioclienteSessionBean=new ServicioClienteSessionBean();
		
		if(this.servicioclienteSessionBean==null) {
			this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		}
		
		this.servicioclienteSessionBean.setsUltimaBusquedaServicioCliente(this.getsAccionBusqueda());
		this.servicioclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.servicioclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			servicioclienteSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			servicioclienteSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			servicioclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			servicioclienteSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPrecio")) {
			servicioclienteSessionBean.setid_tipo_precio(this.getid_tipo_precioFK_IdTipoPrecio());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ServicioClienteSessionBean servicioclienteSessionBean=new ServicioClienteSessionBean();
		
		if(this.servicioclienteSessionBean==null) {
			this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		}
		
		if(this.servicioclienteSessionBean.getsUltimaBusquedaServicioCliente()!=null&&!this.servicioclienteSessionBean.getsUltimaBusquedaServicioCliente().equals("")) {
			this.setsAccionBusqueda(servicioclienteSessionBean.getsUltimaBusquedaServicioCliente());
			this.setiNumeroPaginacion(servicioclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(servicioclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(servicioclienteSessionBean.getid_bodega());
				servicioclienteSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(servicioclienteSessionBean.getid_cliente());
				servicioclienteSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(servicioclienteSessionBean.getid_empresa());
				servicioclienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(servicioclienteSessionBean.getid_producto());
				servicioclienteSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPrecio")) {
				this.setid_tipo_precioFK_IdTipoPrecio(servicioclienteSessionBean.getid_tipo_precio());
				servicioclienteSessionBean.setid_tipo_precio(-1L);
			}
		}
		
		this.servicioclienteSessionBean.setsUltimaBusquedaServicioCliente("");
		this.servicioclienteSessionBean.setiNumeroPaginacion(ServicioClienteConstantesFunciones.INUMEROPAGINACION);
		this.servicioclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaServicioCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioServicioCliente() {
		this.updateBorderResaltarBusquedasFormularioServicioCliente();
		this.updateVisibilidadBusquedasFormularioServicioCliente();
		this.updateHabilitarBusquedasFormularioServicioCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioServicioCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasServicioCliente.getComponents().length>0) {
	

		if(this.servicioclienteConstantesFunciones.resaltarFK_IdBodegaServicioCliente!=null) {
			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdBodegaServicioCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
				jPanel.setBorder(this.servicioclienteConstantesFunciones.resaltarFK_IdBodegaServicioCliente);
			}
		}

		if(this.servicioclienteConstantesFunciones.resaltarFK_IdClienteServicioCliente!=null) {
			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdClienteServicioCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
				jPanel.setBorder(this.servicioclienteConstantesFunciones.resaltarFK_IdClienteServicioCliente);
			}
		}

		if(this.servicioclienteConstantesFunciones.resaltarFK_IdProductoServicioCliente!=null) {
			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdProductoServicioCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
				jPanel.setBorder(this.servicioclienteConstantesFunciones.resaltarFK_IdProductoServicioCliente);
			}
		}

		if(this.servicioclienteConstantesFunciones.resaltarFK_IdTipoPrecioServicioCliente!=null) {
			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdTipoPrecioServicioCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
				jPanel.setBorder(this.servicioclienteConstantesFunciones.resaltarFK_IdTipoPrecioServicioCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioServicioCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasServicioCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdBodegaServicioCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.servicioclienteConstantesFunciones.mostrarFK_IdBodegaServicioCliente);
			if(!this.servicioclienteConstantesFunciones.mostrarFK_IdBodegaServicioCliente && index>-1) {
				this.jTabbedPaneBusquedasServicioCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdClienteServicioCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.servicioclienteConstantesFunciones.mostrarFK_IdClienteServicioCliente);
			if(!this.servicioclienteConstantesFunciones.mostrarFK_IdClienteServicioCliente && index>-1) {
				this.jTabbedPaneBusquedasServicioCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdProductoServicioCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.servicioclienteConstantesFunciones.mostrarFK_IdProductoServicioCliente);
			if(!this.servicioclienteConstantesFunciones.mostrarFK_IdProductoServicioCliente && index>-1) {
				this.jTabbedPaneBusquedasServicioCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdTipoPrecioServicioCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.servicioclienteConstantesFunciones.mostrarFK_IdTipoPrecioServicioCliente);
			if(!this.servicioclienteConstantesFunciones.mostrarFK_IdTipoPrecioServicioCliente && index>-1) {
				this.jTabbedPaneBusquedasServicioCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioServicioCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasServicioCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdBodegaServicioCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.servicioclienteConstantesFunciones.activarFK_IdBodegaServicioCliente);
				this.jTabbedPaneBusquedasServicioCliente.setEnabledAt(index,this.servicioclienteConstantesFunciones.activarFK_IdBodegaServicioCliente);
			}

			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdClienteServicioCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.servicioclienteConstantesFunciones.activarFK_IdClienteServicioCliente);
				this.jTabbedPaneBusquedasServicioCliente.setEnabledAt(index,this.servicioclienteConstantesFunciones.activarFK_IdClienteServicioCliente);
			}

			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdProductoServicioCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.servicioclienteConstantesFunciones.activarFK_IdProductoServicioCliente);
				this.jTabbedPaneBusquedasServicioCliente.setEnabledAt(index,this.servicioclienteConstantesFunciones.activarFK_IdProductoServicioCliente);
			}

			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdTipoPrecioServicioCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.servicioclienteConstantesFunciones.activarFK_IdTipoPrecioServicioCliente);
				this.jTabbedPaneBusquedasServicioCliente.setEnabledAt(index,this.servicioclienteConstantesFunciones.activarFK_IdTipoPrecioServicioCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaServicioCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdBodegaServicioCliente);

			this.jTabbedPaneBusquedasServicioCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);

			this.servicioclienteConstantesFunciones.setResaltarFK_IdBodegaServicioCliente(resaltar);

			jPanel.setBorder(this.servicioclienteConstantesFunciones.resaltarFK_IdBodegaServicioCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdClienteServicioCliente);

			this.jTabbedPaneBusquedasServicioCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);

			this.servicioclienteConstantesFunciones.setResaltarFK_IdClienteServicioCliente(resaltar);

			jPanel.setBorder(this.servicioclienteConstantesFunciones.resaltarFK_IdClienteServicioCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdProductoServicioCliente);

			this.jTabbedPaneBusquedasServicioCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);

			this.servicioclienteConstantesFunciones.setResaltarFK_IdProductoServicioCliente(resaltar);

			jPanel.setBorder(this.servicioclienteConstantesFunciones.resaltarFK_IdProductoServicioCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoPrecio")) {
			index= this.jTabbedPaneBusquedasServicioCliente.indexOfComponent(this.jPanelFK_IdTipoPrecioServicioCliente);

			this.jTabbedPaneBusquedasServicioCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasServicioCliente.getComponent(index);

			this.servicioclienteConstantesFunciones.setResaltarFK_IdTipoPrecioServicioCliente(resaltar);

			jPanel.setBorder(this.servicioclienteConstantesFunciones.resaltarFK_IdTipoPrecioServicioCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarServicioCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioServicioCliente() throws Exception {

		if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioServicioCliente();
		this.updateVisibilidadResaltarControlesFormularioServicioCliente();
		this.updateHabilitarResaltarControlesFormularioServicioCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioServicioCliente() throws Exception {
		if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.servicioclienteConstantesFunciones.resaltaridServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente!=null) {this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.setBorder(this.servicioclienteConstantesFunciones.resaltaridServicioCliente);}
		if(this.servicioclienteConstantesFunciones.resaltarid_empresaServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente!=null) {this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.setBorder(this.servicioclienteConstantesFunciones.resaltarid_empresaServicioCliente);}
		if(this.servicioclienteConstantesFunciones.resaltarid_clienteServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente!=null) {this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.setBorder(this.servicioclienteConstantesFunciones.resaltarid_clienteServicioCliente);}
		if(this.servicioclienteConstantesFunciones.resaltarid_bodegaServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente!=null) {this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.setBorder(this.servicioclienteConstantesFunciones.resaltarid_bodegaServicioCliente);}
		if(this.servicioclienteConstantesFunciones.resaltarid_productoServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente!=null) {this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.setBorder(this.servicioclienteConstantesFunciones.resaltarid_productoServicioCliente);}
		if(this.servicioclienteConstantesFunciones.resaltarid_tipo_precioServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente!=null) {this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.setBorder(this.servicioclienteConstantesFunciones.resaltarid_tipo_precioServicioCliente);}
		if(this.servicioclienteConstantesFunciones.resaltarprecioServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente!=null) {this.jInternalFrameDetalleFormServicioCliente.jTextFieldprecioServicioCliente.setBorder(this.servicioclienteConstantesFunciones.resaltarprecioServicioCliente);}
		if(this.servicioclienteConstantesFunciones.resaltardescripcionServicioCliente!=null && this.jInternalFrameDetalleFormServicioCliente!=null) {this.jInternalFrameDetalleFormServicioCliente.jTextAreadescripcionServicioCliente.setBorder(this.servicioclienteConstantesFunciones.resaltardescripcionServicioCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioServicioCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) {
	
		//this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostraridServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jPanelidServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostraridServicioCliente);
		//this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_empresaServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jPanelid_empresaServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_empresaServicioCliente);
		//this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_clienteServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jPanelid_clienteServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_clienteServicioCliente);
			this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_clienteServicioCliente);
		//this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_bodegaServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jPanelid_bodegaServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_bodegaServicioCliente);
		//this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_productoServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jPanelid_productoServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_productoServicioCliente);
			this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_productoServicioCliente);
		//this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_tipo_precioServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jPanelid_tipo_precioServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarid_tipo_precioServicioCliente);
		//this.jInternalFrameDetalleFormServicioCliente.jTextFieldprecioServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarprecioServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jPanelprecioServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrarprecioServicioCliente);
		//this.jInternalFrameDetalleFormServicioCliente.jTextAreadescripcionServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrardescripcionServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jPaneldescripcionServicioCliente.setVisible(this.servicioclienteConstantesFunciones.mostrardescripcionServicioCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioServicioCliente() throws Exception {
		if(this.jInternalFrameDetalleFormServicioCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormServicioCliente!=null) {
	
		this.jInternalFrameDetalleFormServicioCliente.jLabelidServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activaridServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_empresaServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activarid_empresaServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_clienteServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activarid_clienteServicioCliente);
			this.jInternalFrameDetalleFormServicioCliente.jButtonid_clienteServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activarid_clienteServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_bodegaServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activarid_bodegaServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_productoServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activarid_productoServicioCliente);
			this.jInternalFrameDetalleFormServicioCliente.jButtonid_productoServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activarid_productoServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jComboBoxid_tipo_precioServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activarid_tipo_precioServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jTextFieldprecioServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activarprecioServicioCliente);
		this.jInternalFrameDetalleFormServicioCliente.jTextAreadescripcionServicioCliente.setEnabled(this.servicioclienteConstantesFunciones.activardescripcionServicioCliente);
		}
	}
	
		
}