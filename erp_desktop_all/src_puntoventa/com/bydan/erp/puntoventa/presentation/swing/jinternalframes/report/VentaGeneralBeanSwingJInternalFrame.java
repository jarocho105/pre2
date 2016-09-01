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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.VentaGeneralConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.VentaGeneralParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.VentaGeneralParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.VentaGeneralBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VentaGeneralBeanSwingJInternalFrame extends VentaGeneralJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentaGeneralBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentaGeneral> ventageneralValidator = new ClassValidator<VentaGeneral>(VentaGeneral.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentaGeneral ventageneral;	
	public VentaGeneral ventageneralAux;
	public VentaGeneral ventageneralAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentaGeneral ventageneralTotales;
	public Long idVentaGeneralActual;
	public Long iIdNuevoVentaGeneral=0L;
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
	
	public Boolean isPermisoTodoVentaGeneral;
	public Boolean isPermisoNuevoVentaGeneral;
	public Boolean isPermisoActualizarVentaGeneral;
	public Boolean isPermisoActualizarOriginalVentaGeneral;
	public Boolean isPermisoEliminarVentaGeneral;
	public Boolean isPermisoGuardarCambiosVentaGeneral;
	public Boolean isPermisoConsultaVentaGeneral;
	public Boolean isPermisoBusquedaVentaGeneral;
	public Boolean isPermisoReporteVentaGeneral;
	public Boolean isPermisoPaginacionMedioVentaGeneral;
	public Boolean isPermisoPaginacionAltoVentaGeneral;
	public Boolean isPermisoPaginacionTodoVentaGeneral;
	public Boolean isPermisoCopiarVentaGeneral;
	public Boolean isPermisoVerFormVentaGeneral;
	public Boolean isPermisoDuplicarVentaGeneral;
	public Boolean isPermisoOrdenVentaGeneral;
	
	
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
	
	public VentaGeneralParameterReturnGeneral ventageneralReturnGeneral;
	public VentaGeneralParameterReturnGeneral ventageneralParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentaGeneral=false;
	public Boolean esParaAccionDesdeFormularioVentaGeneral=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentaGeneralSessionBeanAdditional ventageneralSessionBeanAdditional=null;
	
	public VentaGeneralSessionBeanAdditional getVentaGeneralSessionBeanAdditional() {
		return this.ventageneralSessionBeanAdditional;
	}
	
	public void setVentaGeneralSessionBeanAdditional(VentaGeneralSessionBeanAdditional ventageneralSessionBeanAdditional) {
		try {
			this.ventageneralSessionBeanAdditional=ventageneralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentaGeneralBeanSwingJInternalFrameAdditional ventageneralBeanSwingJInternalFrameAdditional=null;
	//public class VentaGeneralBeanSwingJInternalFrame
	
	public VentaGeneralBeanSwingJInternalFrameAdditional getVentaGeneralBeanSwingJInternalFrameAdditional() {
		return this.ventageneralBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentaGeneralBeanSwingJInternalFrameAdditional(VentaGeneralBeanSwingJInternalFrameAdditional ventageneralBeanSwingJInternalFrameAdditional) {
		try {
			this.ventageneralBeanSwingJInternalFrameAdditional=ventageneralBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentaGeneralLogic ventageneralLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentaGeneral ventageneralBean;
	public VentaGeneralConstantesFunciones ventageneralConstantesFunciones;
	//public VentaGeneralParameterReturnGeneral ventageneralReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<VentaGeneral> ventagenerals;	
	//public List<VentaGeneral> ventageneralsEliminados;
	//public List<VentaGeneral> ventageneralsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentaGeneral=false;
	public Boolean isVisibilidadCeldaDuplicarVentaGeneral=true;
	public Boolean isVisibilidadCeldaCopiarVentaGeneral=true;
	public Boolean isVisibilidadCeldaVerFormVentaGeneral=true;
	public Boolean isVisibilidadCeldaOrdenVentaGeneral=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
	public Boolean isVisibilidadCeldaModificarVentaGeneral=false;
	public Boolean isVisibilidadCeldaActualizarVentaGeneral=false;
	public Boolean isVisibilidadCeldaEliminarVentaGeneral=false;
	public Boolean isVisibilidadCeldaCancelarVentaGeneral=false;
	public Boolean isVisibilidadCeldaGuardarVentaGeneral=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentaGeneral=false;	
	
	
	public Boolean isVisibilidadBusquedaVentaGeneral=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoVentaGeneral() {
		return this.iIdNuevoVentaGeneral;
	}

	public void setiIdNuevoVentaGeneral(Long iIdNuevoVentaGeneral) {
		this.iIdNuevoVentaGeneral = iIdNuevoVentaGeneral;
	}
	
	public Long getidVentaGeneralActual() {
		return this.idVentaGeneralActual;
	}

	public void setidVentaGeneralActual(Long idVentaGeneralActual) {
		this.idVentaGeneralActual = idVentaGeneralActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentaGeneral getventageneral() {
		return this.ventageneral;
	}

	public void setventageneral(VentaGeneral ventageneral) {
		this.ventageneral = ventageneral;
	}
	
	public VentaGeneral getventageneralAux() {
		return this.ventageneralAux;
	}

	public void setventageneralAux(VentaGeneral ventageneralAux) {
		this.ventageneralAux = ventageneralAux;
	}				
	
	public VentaGeneral getventageneralAnterior() {
		return this.ventageneralAnterior;
	}

	public void setventageneralAnterior(VentaGeneral ventageneralAnterior) {
		this.ventageneralAnterior = ventageneralAnterior;
	}	
	
	public VentaGeneral getventageneralTotales() {
		return this.ventageneralTotales;
	}

	public void setventageneralTotales(VentaGeneral ventageneralTotales) {
		this.ventageneralTotales = ventageneralTotales;
	}	
	
	public VentaGeneral getventageneralBean() {
		return this.ventageneralBean;
	}

	public void setventageneralBean(VentaGeneral ventageneralBean) {
		this.ventageneralBean = ventageneralBean;
	}	
	
	public VentaGeneralParameterReturnGeneral getventageneralReturnGeneral() {
		return this.ventageneralReturnGeneral;
	}

	public void setventageneralReturnGeneral(VentaGeneralParameterReturnGeneral ventageneralReturnGeneral) {
		this.ventageneralReturnGeneral = ventageneralReturnGeneral;
	}	
	
	
	public Date fecha_desdeBusquedaVentaGeneral=new Date();

	public Date getfecha_desdeBusquedaVentaGeneral() {
		return this.fecha_desdeBusquedaVentaGeneral;
	}

	public void setfecha_desdeBusquedaVentaGeneral(Date fecha_desdeBusquedaVentaGeneral) {
		this.fecha_desdeBusquedaVentaGeneral = fecha_desdeBusquedaVentaGeneral;
	}

;
	public Date fecha_hastaBusquedaVentaGeneral=new Date();

	public Date getfecha_hastaBusquedaVentaGeneral() {
		return this.fecha_hastaBusquedaVentaGeneral;
	}

	public void setfecha_hastaBusquedaVentaGeneral(Date fecha_hastaBusquedaVentaGeneral) {
		this.fecha_hastaBusquedaVentaGeneral = fecha_hastaBusquedaVentaGeneral;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VentaGeneralLogic getVentaGeneralLogic()	{		
		return ventageneralLogic;
	}

	public void setVentaGeneralLogic(VentaGeneralLogic ventageneralLogic) {
		this.ventageneralLogic = ventageneralLogic;
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
	
	public Boolean getIsEsNuevoVentaGeneral() {
		return isEsNuevoVentaGeneral;
	}

	public void setIsEsNuevoVentaGeneral(Boolean isEsNuevoVentaGeneral) {
		this.isEsNuevoVentaGeneral = isEsNuevoVentaGeneral;
	}

	public Boolean getEsParaAccionDesdeFormularioVentaGeneral() {
		return esParaAccionDesdeFormularioVentaGeneral;
	}
	
	public void setEsParaAccionDesdeFormularioVentaGeneral(Boolean esParaAccionDesdeFormularioVentaGeneral) {
		this.esParaAccionDesdeFormularioVentaGeneral = esParaAccionDesdeFormularioVentaGeneral;
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

			if(this.ventageneralSessionBean==null) {
				this.ventageneralSessionBean=new VentaGeneralSessionBean();
			}

			if(!this.ventageneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventageneralSessionBean.getlidEmpresaActual());
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

			if(this.ventageneralSessionBean==null) {
				this.ventageneralSessionBean=new VentaGeneralSessionBean();
			}

			if(!this.ventageneralSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(ventageneralSessionBean.getlidSucursalActual());
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

			if(this.ventageneralSessionBean==null) {
				this.ventageneralSessionBean=new VentaGeneralSessionBean();
			}

			if(!this.ventageneralSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(ventageneralSessionBean.getlidClienteActual());
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

			if(this.ventageneralSessionBean==null) {
				this.ventageneralSessionBean=new VentaGeneralSessionBean();
			}

			if(!this.ventageneralSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(ventageneralSessionBean.getlidProductoActual());
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

					if(this.ventageneral!=null) {
						this.ventageneral.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
						this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentaGeneral.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
						if(this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentaGeneralGenerico)throws Exception
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
				jComboBoxid_empresaVentaGeneralGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentaGeneralGenerico!=null && jComboBoxid_empresaVentaGeneralGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentaGeneralGenerico.setSelectedIndex(0);
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

					if(this.ventageneral!=null) {
						this.ventageneral.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
						this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalVentaGeneral.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
						if(this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalVentaGeneralGenerico)throws Exception
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
				jComboBoxid_sucursalVentaGeneralGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalVentaGeneralGenerico!=null && jComboBoxid_sucursalVentaGeneralGenerico.getItemCount()>0) {
					jComboBoxid_sucursalVentaGeneralGenerico.setSelectedIndex(0);
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

					if(this.ventageneral!=null) {
						this.ventageneral.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
						this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteVentaGeneral.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
						if(this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteVentaGeneralGenerico)throws Exception
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
				jComboBoxid_clienteVentaGeneralGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteVentaGeneralGenerico!=null && jComboBoxid_clienteVentaGeneralGenerico.getItemCount()>0) {
					jComboBoxid_clienteVentaGeneralGenerico.setSelectedIndex(0);
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

					if(this.ventageneral!=null) {
						this.ventageneral.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
						this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoVentaGeneral.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
						if(this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoVentaGeneralGenerico)throws Exception
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
				jComboBoxid_productoVentaGeneralGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoVentaGeneralGenerico!=null && jComboBoxid_productoVentaGeneralGenerico.getItemCount()>0) {
					jComboBoxid_productoVentaGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentaGeneral ventageneral,JComboBox jComboBoxid_empresaVentaGeneralGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentaGeneralGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentaGeneralGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventageneral.setid_empresa(empresaAux.getId());
				ventageneral.setempresa_descripcion(VentaGeneralConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventageneral.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(VentaGeneral ventageneral,JComboBox jComboBoxid_sucursalVentaGeneralGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalVentaGeneralGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalVentaGeneralGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ventageneral.setid_sucursal(sucursalAux.getId());
				ventageneral.setsucursal_descripcion(VentaGeneralConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ventageneral.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(VentaGeneral ventageneral,JComboBox jComboBoxid_clienteVentaGeneralGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteVentaGeneralGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteVentaGeneralGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				ventageneral.setid_cliente(clienteAux.getId());
				ventageneral.setcliente_descripcion(VentaGeneralConstantesFunciones.getClienteDescripcion(clienteAux));
				ventageneral.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(VentaGeneral ventageneral,JComboBox jComboBoxid_productoVentaGeneralGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoVentaGeneralGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoVentaGeneralGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				ventageneral.setid_producto(productoAux.getId());
				ventageneral.setproducto_descripcion(VentaGeneralConstantesFunciones.getProductoDescripcion(productoAux));
				ventageneral.setProducto(productoAux);			}
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

					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) { 
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaGeneral!=null) { 
					}

					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) { 
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaGeneral!=null) { 
					}

					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) { 
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaGeneral!=null) { 
					}

					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) { 
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaGeneral!=null) { 
					}

					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesVentaGeneral() throws Exception {
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
		
	public VentaGeneralParameterReturnGeneral getVentaGeneralParameterGeneral() {
		return this.ventageneralParameterGeneral;
	}
	
	public void setVentaGeneralParameterGeneral(VentaGeneralParameterReturnGeneral ventageneralParameterGeneral) {
		this.ventageneralParameterGeneral = ventageneralParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentaGeneral() {
		return isPermisoTodoVentaGeneral;
	}

	public void setIsPermisoTodoVentaGeneral(Boolean isPermisoTodoVentaGeneral) {
		this.isPermisoTodoVentaGeneral = isPermisoTodoVentaGeneral;
	}

	public Boolean getIsPermisoNuevoVentaGeneral() {
		return isPermisoNuevoVentaGeneral;
	}

	public void setIsPermisoNuevoVentaGeneral(Boolean isPermisoNuevoVentaGeneral) {
		this.isPermisoNuevoVentaGeneral = isPermisoNuevoVentaGeneral;
	}

	public Boolean getIsPermisoActualizarVentaGeneral() {
		return isPermisoActualizarVentaGeneral;
	}

	public void setIsPermisoActualizarVentaGeneral(Boolean isPermisoActualizarVentaGeneral) {
		this.isPermisoActualizarVentaGeneral = isPermisoActualizarVentaGeneral;
	}

	public Boolean getIsPermisoEliminarVentaGeneral() {
		return isPermisoEliminarVentaGeneral;
	}

	public void setIsPermisoEliminarVentaGeneral(Boolean isPermisoEliminarVentaGeneral) {
		this.isPermisoEliminarVentaGeneral = isPermisoEliminarVentaGeneral;
	}

	public Boolean getIsPermisoGuardarCambiosVentaGeneral() {
		return isPermisoGuardarCambiosVentaGeneral;
	}

	public void setIsPermisoGuardarCambiosVentaGeneral(Boolean isPermisoGuardarCambiosVentaGeneral) {
		this.isPermisoGuardarCambiosVentaGeneral = isPermisoGuardarCambiosVentaGeneral;
	}
	
	public Boolean getIsPermisoConsultaVentaGeneral() {
		return isPermisoConsultaVentaGeneral;
	}

	public void setIsPermisoConsultaVentaGeneral(Boolean isPermisoConsultaVentaGeneral) {
		this.isPermisoConsultaVentaGeneral = isPermisoConsultaVentaGeneral;
	}

	public Boolean getIsPermisoBusquedaVentaGeneral() {
		return isPermisoBusquedaVentaGeneral;
	}

	public void setIsPermisoBusquedaVentaGeneral(Boolean isPermisoBusquedaVentaGeneral) {
		this.isPermisoBusquedaVentaGeneral = isPermisoBusquedaVentaGeneral;
	}

	public Boolean getIsPermisoReporteVentaGeneral() {
		return isPermisoReporteVentaGeneral;
	}

	public void setIsPermisoReporteVentaGeneral(Boolean isPermisoReporteVentaGeneral) {
		this.isPermisoReporteVentaGeneral = isPermisoReporteVentaGeneral;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentaGeneral() {
		return isPermisoPaginacionMedioVentaGeneral;
	}

	public void setIsPermisoPaginacionMedioVentaGeneral(Boolean isPermisoPaginacionMedioVentaGeneral) {
		this.isPermisoPaginacionMedioVentaGeneral = isPermisoPaginacionMedioVentaGeneral;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentaGeneral() {
		return isPermisoPaginacionTodoVentaGeneral;
	}

	public void setIsPermisoPaginacionTodoVentaGeneral(Boolean isPermisoPaginacionTodoVentaGeneral) {
		this.isPermisoPaginacionTodoVentaGeneral = isPermisoPaginacionTodoVentaGeneral;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentaGeneral() {
		return isPermisoPaginacionAltoVentaGeneral;
	}

	public void setIsPermisoPaginacionAltoVentaGeneral(Boolean isPermisoPaginacionAltoVentaGeneral) {
		this.isPermisoPaginacionAltoVentaGeneral = isPermisoPaginacionAltoVentaGeneral;
	}
	
	public Boolean getIsPermisoCopiarVentaGeneral() {
		return isPermisoCopiarVentaGeneral;
	}

	public void setIsPermisoCopiarVentaGeneral(Boolean isPermisoCopiarVentaGeneral) {
		this.isPermisoCopiarVentaGeneral = isPermisoCopiarVentaGeneral;
	}
	
	public Boolean getIsPermisoVerFormVentaGeneral() {
		return isPermisoVerFormVentaGeneral;
	}

	public void setIsPermisoVerFormVentaGeneral(Boolean isPermisoVerFormVentaGeneral) {
		this.isPermisoVerFormVentaGeneral = isPermisoVerFormVentaGeneral;
	}
	
	public Boolean getIsPermisoDuplicarVentaGeneral() {
		return isPermisoDuplicarVentaGeneral;
	}

	public void setIsPermisoDuplicarVentaGeneral(Boolean isPermisoDuplicarVentaGeneral) {
		this.isPermisoDuplicarVentaGeneral = isPermisoDuplicarVentaGeneral;
	}
	
	public Boolean getIsPermisoOrdenVentaGeneral() {
		return isPermisoOrdenVentaGeneral;
	}

	public void setIsPermisoOrdenVentaGeneral(Boolean isPermisoOrdenVentaGeneral) {
		this.isPermisoOrdenVentaGeneral = isPermisoOrdenVentaGeneral;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentaGeneral() {
		return isVisibilidadCeldaNuevoVentaGeneral;
	}

	public void setIsVisibilidadCeldaNuevoVentaGeneral(Boolean isVisibilidadCeldaNuevoVentaGeneral) {
		this.isVisibilidadCeldaNuevoVentaGeneral = isVisibilidadCeldaNuevoVentaGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentaGeneral() {
		return isVisibilidadCeldaDuplicarVentaGeneral;
	}

	public void setIsVisibilidadCeldaDuplicarVentaGeneral(Boolean isVisibilidadCeldaDuplicarVentaGeneral) {
		this.isVisibilidadCeldaDuplicarVentaGeneral = isVisibilidadCeldaDuplicarVentaGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentaGeneral() {
		return isVisibilidadCeldaCopiarVentaGeneral;
	}

	public void setIsVisibilidadCeldaCopiarVentaGeneral(Boolean isVisibilidadCeldaCopiarVentaGeneral) {
		this.isVisibilidadCeldaCopiarVentaGeneral = isVisibilidadCeldaCopiarVentaGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentaGeneral() {
		return isVisibilidadCeldaVerFormVentaGeneral;
	}

	public void setIsVisibilidadCeldaVerFormVentaGeneral(Boolean isVisibilidadCeldaVerFormVentaGeneral) {
		this.isVisibilidadCeldaVerFormVentaGeneral = isVisibilidadCeldaVerFormVentaGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentaGeneral() {
		return isVisibilidadCeldaOrdenVentaGeneral;
	}

	public void setIsVisibilidadCeldaOrdenVentaGeneral(Boolean isVisibilidadCeldaOrdenVentaGeneral) {
		this.isVisibilidadCeldaOrdenVentaGeneral = isVisibilidadCeldaOrdenVentaGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentaGeneral() {
		return isVisibilidadCeldaNuevoRelacionesVentaGeneral;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentaGeneral(Boolean isVisibilidadCeldaNuevoRelacionesVentaGeneral) {
		this.isVisibilidadCeldaNuevoRelacionesVentaGeneral = isVisibilidadCeldaNuevoRelacionesVentaGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentaGeneral() {
		return isVisibilidadCeldaModificarVentaGeneral;
	}

	public void setIsVisibilidadCeldaModificarVentaGeneral(Boolean isVisibilidadCeldaModificarVentaGeneral) {
		this.isVisibilidadCeldaModificarVentaGeneral = isVisibilidadCeldaModificarVentaGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentaGeneral() {
		return isVisibilidadCeldaActualizarVentaGeneral;
	}

	public void setIsVisibilidadCeldaActualizarVentaGeneral(Boolean isVisibilidadCeldaActualizarVentaGeneral) {
		this.isVisibilidadCeldaActualizarVentaGeneral = isVisibilidadCeldaActualizarVentaGeneral;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentaGeneral() {
		return isVisibilidadCeldaEliminarVentaGeneral;
	}

	public void setIsVisibilidadCeldaEliminarVentaGeneral(Boolean isVisibilidadCeldaEliminarVentaGeneral) {
		this.isVisibilidadCeldaEliminarVentaGeneral = isVisibilidadCeldaEliminarVentaGeneral;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentaGeneral() {
		return isVisibilidadCeldaCancelarVentaGeneral;
	}

	public void setIsVisibilidadCeldaCancelarVentaGeneral(Boolean isVisibilidadCeldaCancelarVentaGeneral) {
		this.isVisibilidadCeldaCancelarVentaGeneral = isVisibilidadCeldaCancelarVentaGeneral;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentaGeneral() {
		return isVisibilidadCeldaGuardarVentaGeneral;
	}

	public void setIsVisibilidadCeldaGuardarVentaGeneral(Boolean isVisibilidadCeldaGuardarVentaGeneral) {
		this.isVisibilidadCeldaGuardarVentaGeneral = isVisibilidadCeldaGuardarVentaGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentaGeneral() {
		return isVisibilidadCeldaGuardarCambiosVentaGeneral;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentaGeneral(Boolean isVisibilidadCeldaGuardarCambiosVentaGeneral) {
		this.isVisibilidadCeldaGuardarCambiosVentaGeneral = isVisibilidadCeldaGuardarCambiosVentaGeneral;
	}
		
	public VentaGeneralSessionBean getventageneralSessionBean() {
		return this.ventageneralSessionBean;
	}
	
	public void setventageneralSessionBean(VentaGeneralSessionBean ventageneralSessionBean) {
		this.ventageneralSessionBean=ventageneralSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentaGeneral() {
		return this.isVisibilidadBusquedaVentaGeneral;
	}

	public void setisVisibilidadBusquedaVentaGeneral(Boolean isVisibilidadBusquedaVentaGeneral) {
		this.isVisibilidadBusquedaVentaGeneral=isVisibilidadBusquedaVentaGeneral;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(VentaGeneral ventageneral)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventageneral,null);
				this.setActualParaGuardarSucursalForeignKey(ventageneral,null);
				this.setActualParaGuardarClienteForeignKey(ventageneral,null);
				this.setActualParaGuardarProductoForeignKey(ventageneral,null);
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
	
	public void bugActualizarReferenciaActual(VentaGeneral ventageneral,VentaGeneral ventageneralAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentaGeneral(ventageneral);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventageneralAux.setId(ventageneral.getId());
		ventageneralAux.setVersionRow(ventageneral.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentaGeneral ventageneralLocal) throws Exception {
		
		if(this.ventageneralSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentaGeneral ventageneralLocal) throws Exception {	
		if(this.ventageneralSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventageneralLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ventageneralLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				ventageneralLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				ventageneralLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentaGeneralActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventageneralValidator.getInvalidValues(this.ventageneral);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentaGeneral ventageneral,List<VentaGeneral> ventagenerals) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentaGeneral ventageneral,List<VentaGeneral> ventagenerals) throws Exception {
		try	{			
			VentaGeneralConstantesFunciones.actualizarSelectedLista(ventageneral,ventagenerals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentaGeneral> ventageneralsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventageneralsLocal=this.ventageneralLogic.getVentaGenerals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventageneralsLocal=this.ventagenerals;
			}
			//ARCHITECTURE
		
			for(VentaGeneral ventageneralLocal:ventageneralsLocal) {
				if(this.permiteMantenimiento(ventageneralLocal) && ventageneralLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentaGeneralConstantesFunciones.getVentaGeneralLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelid_clienteVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelid_productoVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelnombre_productoVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelnombre_clienteVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelfechaVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelsecuencialVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelcantidadVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelprecioVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabeldescuentoVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelivaVentaGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaGeneralConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabeliceVentaGeneral,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabelid_clienteVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabelid_productoVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabelnombre_productoVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabelnombre_clienteVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabelfechaVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabelsecuencialVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabelcantidadVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabelprecioVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabeldescuentoVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabelivaVentaGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaGeneral.jLabeliceVentaGeneral,"");
		
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
		this.iIdNuevoVentaGeneral--;	
		
		
		this.ventageneralAux=new VentaGeneral();
		
		this.ventageneralAux.setId(this.iIdNuevoVentaGeneral);
		this.ventageneralAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventageneralLogic.getVentaGenerals().add(this.ventageneralAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventagenerals.add(this.ventageneralAux);
		}
		//ARCHITECTURE
		
		this.ventageneral=this.ventageneralAux;
		
		if(VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentaGeneral(this.ventageneral);
			this.setVariablesObjetoActualToFormularioForeignKeyVentaGeneral(this.ventageneral);
		}
				
		//this.setDefaultControlesVentaGeneral();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentaGeneral();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentaGeneral();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentaGeneral();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentaGeneral(this.ventageneralBean,this.ventageneral,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentaGeneral(this.ventageneralReturnGeneral,this.ventageneralBean,false);
		
		if(this.ventageneralReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentaGeneral(this.ventageneralReturnGeneral.getVentaGeneral());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentaGeneral(this.ventageneralReturnGeneral.getVentaGeneral());
		}
		
		if(this.ventageneralReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentaGeneral(this.ventageneralReturnGeneral.getVentaGeneral(),classes);//this.ventageneralBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentaGeneral();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentaGeneral();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentaGeneralBeanSwingJInternalFrameAdditional.RecargarFormVentaGeneral(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentaGeneral(false);
						
			if(ventageneralSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentaGeneral();
			}
			
			this.actualizarVisualTableDatosVentaGeneral();
			
			this.jTableDatosVentaGeneral.setRowSelectionInterval(this.getIndiceNuevoVentaGeneral(), this.getIndiceNuevoVentaGeneral());
			
			this.seleccionarFilaTablaVentaGeneralActual();
						
			this.actualizarEstadoCeldasBotonesVentaGeneral("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentaGeneral(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfecha_desdeVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarfecha_desdeVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfecha_hastaVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarfecha_hastaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_productoVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarnombre_productoVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_clienteVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarnombre_clienteVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfechaVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarfechaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldsecuencialVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarsecuencialVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldcantidadVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarcantidadVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldprecioVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarprecioVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFielddescuentoVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activardescuentoVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldivaVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarivaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldiceVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activariceVentaGeneral);	
		//
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarid_empresaVentaGeneral);//
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarid_sucursalVentaGeneral);//
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarid_clienteVentaGeneral);//
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.setEnabled(isHabilitar && this.ventageneralConstantesFunciones.activarid_productoVentaGeneral);
	};
	
	public void setDefaultControlesVentaGeneral() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentaGeneral(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventageneralSessionBean.setConGuardarRelaciones(true);			
			this.ventageneralSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentaGeneral.jTabbedPaneRelacionesVentaGeneral.setVisible(true);
			
					
		} else {
			//this.ventageneralSessionBean.setConGuardarRelaciones(false);			
			this.ventageneralSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentaGeneral.jTabbedPaneRelacionesVentaGeneral.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentaGeneral() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaGeneral ventageneralAux:this.ventageneralLogic.getVentaGenerals()) {
				if(ventageneralAux.getId().equals(this.iIdNuevoVentaGeneral)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaGeneral ventageneralAux:this.ventagenerals) {
				if(ventageneralAux.getId().equals(this.iIdNuevoVentaGeneral)) {
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
	
	public int getIndiceActualVentaGeneral(VentaGeneral ventageneral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaGeneral ventageneralAux:this.ventageneralLogic.getVentaGenerals()) {
				if(ventageneralAux.getId().equals(ventageneral.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaGeneral ventageneralAux:this.ventagenerals) {
				if(ventageneralAux.getId().equals(ventageneral.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentaGeneral(VentaGeneral ventageneralOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaGeneral ventageneralAux:this.ventageneralLogic.getVentaGenerals()) {
				if(ventageneralAux.getVentaGeneralOriginal().getId().equals(ventageneralOriginal.getId())) {
					existe=true;
					ventageneralOriginal.setId(ventageneralAux.getId());
					ventageneralOriginal.setVersionRow(ventageneralAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaGeneral ventageneralAux:this.ventagenerals) {
				if(ventageneralAux.getVentaGeneralOriginal().getId().equals(ventageneralOriginal.getId())) {
					existe=true;
					ventageneralOriginal.setId(ventageneralAux.getId());
					ventageneralOriginal.setVersionRow(ventageneralAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentaGeneral(Boolean esParaCancelar) throws Exception {
		ventageneralsAux=new ArrayList<VentaGeneral>();
		ventageneralAux=new VentaGeneral();
		
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentaGeneral ventageneralAux:this.ventageneralLogic.getVentaGenerals()) {
					if(ventageneralAux.getId()<0) {
						ventageneralsAux.add(ventageneralAux);
					}		
				}
				this.iIdNuevoVentaGeneral=0L;
				this.ventageneralLogic.getVentaGenerals().removeAll(ventageneralsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentaGeneral ventageneralAux:this.ventagenerals) {
					if(ventageneralAux.getId()<0) {
						ventageneralsAux.add(ventageneralAux);
					}		
				}
				this.iIdNuevoVentaGeneral=0L;
				this.ventagenerals.removeAll(ventageneralsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentaGeneral 
					&& this.ventageneralLogic.getVentaGenerals().size()>0
					) {
					ventageneralAux=this.ventageneralLogic.getVentaGenerals().get(this.ventageneralLogic.getVentaGenerals().size() - 1);
				
					if(ventageneralAux.getId()<0) {
						this.ventageneralLogic.getVentaGenerals().remove(ventageneralAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentaGeneral && this.ventagenerals.size()>0) {
					ventageneralAux=this.ventagenerals.get(this.ventagenerals.size() - 1);
				
					if(ventageneralAux.getId()<0) {
						this.ventagenerals.remove(ventageneralAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentaGeneral(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventageneral.getId()<0) {
				this.ventageneralLogic.getVentaGenerals().remove(this.ventageneral);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventageneral.getId()<0) {
				this.ventagenerals.remove(this.ventageneral);
			}
		}			
	}
	
	public void setEstadosInicialesVentaGeneral(List<VentaGeneral> ventageneralsAux) throws Exception {
		VentaGeneralConstantesFunciones.setEstadosInicialesVentaGeneral(ventageneralsAux);
	}
	
	public void setEstadosInicialesVentaGeneral(VentaGeneral ventageneralAux) throws Exception {
		VentaGeneralConstantesFunciones.setEstadosInicialesVentaGeneral(ventageneralAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentaGeneralActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentaGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentaGeneralActual()) {
				if(!this.isEsNuevoVentaGeneral) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentaGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentaGeneral=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentaGeneralActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Venta General ?", "MANTENIMIENTO DE Venta General", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentaGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentaGeneral ventageneral) throws Exception {
		VentaGeneralConstantesFunciones.seleccionarAsignar(this.ventageneral,ventageneral);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentaGeneral=this.isPermisoActualizarOriginalVentaGeneral;
			
			
			this.seleccionarAsignar(ventageneral);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentaGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventageneralSessionBean.setsFuncionBusquedaRapida(this.ventageneralSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentaGeneral) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentaGeneral(esParaCancelar);				
				this.cancelarNuevoVentaGeneral(esParaCancelar);								
			}
			
			this.ventageneral=new VentaGeneral();
			
			this.inicializarVentaGeneral();
			
			this.actualizarEstadoCeldasBotonesVentaGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentaGeneral() throws Exception {
		try {
			VentaGeneralConstantesFunciones.inicializarVentaGeneral(this.ventageneral);
			
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
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventageneralLogic.getVentaGenerals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentaGenerals(String sAccionBusqueda,List<VentaGeneral> ventageneralsParaReportes) throws Exception {
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
					sPathReporteFinal="VentaGeneral"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentaGeneralMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentaGeneralMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentaGeneral"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Venta Generales");		
		parameters.put("busquedapor", VentaGeneralConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentaGeneral=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentaGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentaGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentaGeneral=new JRBeanArrayDataSource(VentaGeneralJInternalFrame.TraerVentaGeneralBeans(ventageneralsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentaGeneral);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentaGeneralConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentaGeneralConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentaGeneralBean.TraerVentaGeneralBeans(ventageneralsParaReportes).toArray()));
							
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
				this.generarExcelReporteVentaGenerals(sAccionBusqueda,sTipoArchivoReporte,ventageneralsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentaGenerals(sAccionBusqueda,sTipoArchivoReporte,ventageneralsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentaGeneralActionPerformed(null);
					//this.generarExcelReporteVentaGenerals(sAccionBusqueda,sTipoArchivoReporte,ventageneralsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentaGenerals(sAccionBusqueda,sTipoArchivoReporte,ventageneralsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentaGenerals(sAccionBusqueda,sTipoArchivoReporte,ventageneralsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentaGenerals(sAccionBusqueda,sTipoArchivoReporte,ventageneralsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentaGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<VentaGeneral> ventageneralsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventageneral";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentaGenerals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentaGeneral("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentaGeneral ventageneral : ventageneralsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentaGeneralConstantesFunciones.generarExcelReporteDataVentaGeneral("NORMAL",row,workbook,ventageneral,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentaGeneral(String sTipo,Row row,Workbook workbook) {
		
		VentaGeneralConstantesFunciones.generarExcelReporteHeaderVentaGeneral(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentaGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<VentaGeneral> ventageneralsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventageneral_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentaGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentaGeneral ventageneral : ventageneralsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentaGeneralConstantesFunciones.getVentaGeneralDescripcion(ventageneral));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaGeneralConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventageneral.getice());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentaGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<VentaGeneral> ventageneralsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentaGeneral> ventageneralsRespaldo=null;
		
		classes=VentaGeneralConstantesFunciones.getClassesRelationshipsOfVentaGeneral(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventageneralLogic.setDatosCliente(this.datosCliente);
		this.ventageneralLogic.setDatosDeep(this.datosDeep);
		this.ventageneralLogic.setIsConDeep(true);
		
		ventageneralsRespaldo=this.ventageneralLogic.getVentaGenerals();
		
		this.ventageneralLogic.setVentaGenerals(ventageneralsParaReportes);	
		this.ventageneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventageneralsParaReportes=this.ventageneralLogic.getVentaGenerals();
		this.ventageneralLogic.setVentaGenerals(ventageneralsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventageneral_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentaGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentaGeneral("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentaGeneral ventageneral : ventageneralsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentaGeneral("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentaGeneralConstantesFunciones.generarExcelReporteDataVentaGeneral("NORMAL",row,workbook,ventageneral,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentaGeneralConstantesFunciones.getVentaGeneralDescripcion(ventageneral));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentaGeneral.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentaGeneral() throws Exception {		
		this.startProcessVentaGeneral(true);
	}
	
	public void startProcessVentaGeneral(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentaGeneral ,this.jPanelParametrosReportesVentaGeneral, this.jScrollPanelDatosVentaGeneral,this.jPanelPaginacionVentaGeneral, this.jScrollPanelDatosEdicionVentaGeneral, this.jPanelAccionesVentaGeneral,this.jPanelAccionesFormularioVentaGeneral,this.jmenuBarVentaGeneral,this.jmenuBarDetalleVentaGeneral,this.jTtoolBarVentaGeneral,this.jTtoolBarDetalleVentaGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasVentaGeneral=this.jTabbedPaneBusquedasVentaGeneral; 
		
		final JPanel jPanelParametrosReportesVentaGeneral=this.jPanelParametrosReportesVentaGeneral;
		//final JScrollPane jScrollPanelDatosVentaGeneral=this.jScrollPanelDatosVentaGeneral;
		final JTable jTableDatosVentaGeneral=this.jTableDatosVentaGeneral;		
		final JPanel jPanelPaginacionVentaGeneral=this.jPanelPaginacionVentaGeneral;
		//final JScrollPane jScrollPanelDatosEdicionVentaGeneral=this.jScrollPanelDatosEdicionVentaGeneral;
		final JPanel jPanelAccionesVentaGeneral=this.jPanelAccionesVentaGeneral;
		
		JPanel jPanelCamposAuxiliarVentaGeneral=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentaGeneral=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			jPanelCamposAuxiliarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jPanelCamposVentaGeneral;
			jPanelAccionesFormularioAuxiliarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jPanelAccionesFormularioVentaGeneral;
		}
		
		final JPanel jPanelCamposVentaGeneral=jPanelCamposAuxiliarVentaGeneral;
		final JPanel jPanelAccionesFormularioVentaGeneral=jPanelAccionesFormularioAuxiliarVentaGeneral;
		
		
		final JMenuBar jmenuBarVentaGeneral=this.jmenuBarVentaGeneral;
		final JToolBar jTtoolBarVentaGeneral=this.jTtoolBarVentaGeneral;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentaGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentaGeneral=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			jmenuBarDetalleAuxiliarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jmenuBarDetalleVentaGeneral;
			jTtoolBarDetalleAuxiliarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jTtoolBarDetalleVentaGeneral;
		}
		
		final JMenuBar jmenuBarDetalleVentaGeneral=jmenuBarDetalleAuxiliarVentaGeneral;
		final JToolBar jTtoolBarDetalleVentaGeneral=jTtoolBarDetalleAuxiliarVentaGeneral;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentaGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentaGeneral;
			processRunnable.jTableDatos=jTableDatosVentaGeneral;
			processRunnable.jPanelCampos=jPanelCamposVentaGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentaGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesVentaGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentaGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarVentaGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentaGeneral;
			processRunnable.jTtoolBar=jTtoolBarVentaGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentaGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentaGeneral ,jPanelParametrosReportesVentaGeneral,jTableDatosVentaGeneral, /*jScrollPanelDatosVentaGeneral,*/jPanelCamposVentaGeneral,jPanelPaginacionVentaGeneral, /*jScrollPanelDatosEdicionVentaGeneral,*/ jPanelAccionesVentaGeneral,jPanelAccionesFormularioVentaGeneral,jmenuBarVentaGeneral,jmenuBarDetalleVentaGeneral,jTtoolBarVentaGeneral,jTtoolBarDetalleVentaGeneral);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentaGeneral ,jPanelParametrosReportesVentaGeneral, jScrollPanelDatosVentaGeneral,jPanelPaginacionVentaGeneral, jScrollPanelDatosEdicionVentaGeneral, jPanelAccionesVentaGeneral,jPanelAccionesFormularioVentaGeneral,jmenuBarVentaGeneral,jmenuBarDetalleVentaGeneral,jTtoolBarVentaGeneral,jTtoolBarDetalleVentaGeneral);
						
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
	
	public void finishProcessVentaGeneral() {// throws Exception 
		this.finishProcessVentaGeneral(true);
	}
	
	public void finishProcessVentaGeneral(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentaGeneral ,this.jPanelParametrosReportesVentaGeneral, this.jScrollPanelDatosVentaGeneral,this.jPanelPaginacionVentaGeneral, this.jScrollPanelDatosEdicionVentaGeneral, this.jPanelAccionesVentaGeneral,this.jPanelAccionesFormularioVentaGeneral,this.jmenuBarVentaGeneral,this.jmenuBarDetalleVentaGeneral,this.jTtoolBarVentaGeneral,this.jTtoolBarDetalleVentaGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasVentaGeneral=this.jTabbedPaneBusquedasVentaGeneral; 
		
		final JPanel jPanelParametrosReportesVentaGeneral=this.jPanelParametrosReportesVentaGeneral;
		//final JScrollPane jScrollPanelDatosVentaGeneral=this.jScrollPanelDatosVentaGeneral;
		final JTable jTableDatosVentaGeneral=this.jTableDatosVentaGeneral;		
		final JPanel jPanelPaginacionVentaGeneral=this.jPanelPaginacionVentaGeneral;
		//final JScrollPane jScrollPanelDatosEdicionVentaGeneral=this.jScrollPanelDatosEdicionVentaGeneral;
		final JPanel jPanelAccionesVentaGeneral=this.jPanelAccionesVentaGeneral;
		
		JPanel jPanelCamposAuxiliarVentaGeneral=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentaGeneral=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			jPanelCamposAuxiliarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jPanelCamposVentaGeneral;
			jPanelAccionesFormularioAuxiliarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jPanelAccionesFormularioVentaGeneral;
		}
		
		final JPanel jPanelCamposVentaGeneral=jPanelCamposAuxiliarVentaGeneral;
		final JPanel jPanelAccionesFormularioVentaGeneral=jPanelAccionesFormularioAuxiliarVentaGeneral;
		
		
		final JMenuBar jmenuBarVentaGeneral=this.jmenuBarVentaGeneral;		
		final JToolBar jTtoolBarVentaGeneral=this.jTtoolBarVentaGeneral;
				
		JMenuBar jmenuBarDetalleAuxiliarVentaGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentaGeneral=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			jmenuBarDetalleAuxiliarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jmenuBarDetalleVentaGeneral;
			jTtoolBarDetalleAuxiliarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jTtoolBarDetalleVentaGeneral;		
		}
		
		final JMenuBar jmenuBarDetalleVentaGeneral=jmenuBarDetalleAuxiliarVentaGeneral;
		final JToolBar jTtoolBarDetalleVentaGeneral=jTtoolBarDetalleAuxiliarVentaGeneral;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentaGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentaGeneral;
			processRunnable.jTableDatos=jTableDatosVentaGeneral;
			processRunnable.jPanelCampos=jPanelCamposVentaGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentaGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesVentaGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentaGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarVentaGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentaGeneral;
			processRunnable.jTtoolBar=jTtoolBarVentaGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentaGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentaGeneral ,jPanelParametrosReportesVentaGeneral, jTableDatosVentaGeneral,/*jScrollPanelDatosVentaGeneral,*/jPanelCamposVentaGeneral,jPanelPaginacionVentaGeneral, /*jScrollPanelDatosEdicionVentaGeneral,*/ jPanelAccionesVentaGeneral,jPanelAccionesFormularioVentaGeneral,jmenuBarVentaGeneral,jmenuBarDetalleVentaGeneral,jTtoolBarVentaGeneral,jTtoolBarDetalleVentaGeneral));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentaGeneral(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentaGeneral(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentaGeneral(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentaGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentaGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentaGeneral,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentaGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentaGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentaGeneral,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventageneralConstantesFunciones.getsFinalQueryVentaGeneral();
		String  finalQueryPaginacionTodos=this.ventageneralConstantesFunciones.getsFinalQueryVentaGeneral();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentaGeneralConstantesFunciones.getArrayColumnasGlobalesNoVentaGeneral(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentaGeneralConstantesFunciones.getArrayColumnasGlobalesVentaGeneral(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentaGeneralConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventageneralsEliminados= new ArrayList<VentaGeneral>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentaGeneral();
		
				///*VentaGeneralSessionBean*/this.ventageneralSessionBean=new VentaGeneralSessionBean();
			
			if(this.ventageneralSessionBean==null) {
				this.ventageneralSessionBean=new VentaGeneralSessionBean();
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
					this.iNumeroPaginacion=VentaGeneralConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentaGeneralConstantesFunciones.getClassesForeignKeysOfVentaGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventageneral."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventageneralsAux= new ArrayList<VentaGeneral>();
			
				
			ventageneralLogic.setDatosCliente(this.datosCliente);
			ventageneralLogic.setDatosDeep(this.datosDeep);
			ventageneralLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentaGeneral")) {
				this.sDetalleReporte=VentaGeneralConstantesFunciones.getDetalleIndiceBusquedaVentaGeneral(fecha_desdeBusquedaVentaGeneral,fecha_hastaBusquedaVentaGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventageneralLogic.getVentaGeneralsBusquedaVentaGeneral(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaVentaGeneral,fecha_hastaBusquedaVentaGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentaGeneralConstantesFunciones.getDetalleIndiceBusquedaVentaGeneral(fecha_desdeBusquedaVentaGeneral,fecha_hastaBusquedaVentaGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentaGeneralConstantesFunciones.getDetalleIndiceBusquedaVentaGeneral(fecha_desdeBusquedaVentaGeneral,fecha_hastaBusquedaVentaGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventageneralLogic.getVentaGenerals()==null||ventageneralLogic.getVentaGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventagenerals==null|| ventagenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventageneralsAux=new ArrayList<VentaGeneral>();
						ventageneralsAux.addAll(ventageneralLogic.getVentaGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventageneralsAux=new ArrayList<VentaGeneral>();
							ventageneralsAux.addAll(ventagenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventageneralLogic.getVentaGeneralsBusquedaVentaGeneral(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaVentaGeneral,fecha_hastaBusquedaVentaGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentaGeneralConstantesFunciones.getDetalleIndiceBusquedaVentaGeneral(fecha_desdeBusquedaVentaGeneral,fecha_hastaBusquedaVentaGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentaGeneralConstantesFunciones.getDetalleIndiceBusquedaVentaGeneral(fecha_desdeBusquedaVentaGeneral,fecha_hastaBusquedaVentaGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentaGenerals("BusquedaVentaGeneral",ventageneralLogic.getVentaGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentaGenerals("BusquedaVentaGeneral",ventagenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventageneralLogic.setVentaGenerals(new ArrayList<VentaGeneral>());
						ventageneralLogic.getVentaGenerals().addAll(ventageneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventagenerals=new ArrayList<VentaGeneral>();
							ventagenerals.addAll(ventageneralsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentaGeneral();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentaGeneral();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventageneralLogic.getVentaGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventagenerals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventageneralLogic.getVentaGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventagenerals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentaGeneral ventageneral) {
		Boolean permite=true;
		
		if(this.ventageneral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentaGeneralConstantesFunciones.getOrderByListaVentaGeneral();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentaGeneralConstantesFunciones.getOrderByListaVentaGeneral();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaGeneral ventageneral:ventageneralLogic.getVentaGenerals()) {
				if(ventageneral.getsType().equals(Constantes2.S_TOTALES)) {
					ventageneralTotales=ventageneral;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaGeneral ventageneral:this.ventagenerals) {
				if(ventageneral.getsType().equals(Constantes2.S_TOTALES)) {
					ventageneralTotales=ventageneral;
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
			this.ventageneralAux=new VentaGeneral();
			this.ventageneralAux.setsType(Constantes2.S_TOTALES);
			this.ventageneralAux.setIsNew(false);
			this.ventageneralAux.setIsChanged(false);
			this.ventageneralAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentaGeneralConstantesFunciones.TotalizarValoresFilaVentaGeneral(this.ventageneralLogic.getVentaGenerals(),this.ventageneralAux);
				
				//this.ventageneralLogic.getVentaGenerals().add(this.ventageneralAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentaGeneralConstantesFunciones.TotalizarValoresFilaVentaGeneral(this.ventagenerals,this.ventageneralAux);
				
				this.ventagenerals.add(this.ventageneralAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventageneralTotales=new VentaGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventageneralLogic.getVentaGenerals().remove(ventageneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventagenerals.remove(ventageneralTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventageneralTotales=new VentaGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaGeneral ventageneral:ventageneralLogic.getVentaGenerals()) {
				if(ventageneral.getsType().equals(Constantes2.S_TOTALES)) {
					ventageneralTotales=ventageneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentaGeneralConstantesFunciones.TotalizarValoresFilaVentaGeneral(this.ventageneralLogic.getVentaGenerals(),ventageneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaGeneral ventageneral:this.ventagenerals) {
				if(ventageneral.getsType().equals(Constantes2.S_TOTALES)) {
					ventageneralTotales=ventageneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentaGeneralConstantesFunciones.TotalizarValoresFilaVentaGeneral(this.ventagenerals,ventageneralTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentaGeneralsBusquedaVentaGeneral()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentaGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaGeneralsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaGeneralsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaGeneralsFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaGeneralsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentaGeneralsBusquedaVentaGeneral(String sFinalQuery,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventageneralLogic.getVentaGeneralsBusquedaVentaGeneral(sFinalQuery,this.pagination,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaGeneralsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventageneralLogic.getVentaGeneralsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaGeneralsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventageneralLogic.getVentaGeneralsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaGeneralsFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventageneralLogic.getVentaGeneralsFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaGeneralsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventageneralLogic.getVentaGeneralsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosVentaGeneral() {
		this.isPermisoTodoVentaGeneral=false;
		this.isPermisoNuevoVentaGeneral=false;
		this.isPermisoActualizarVentaGeneral=false;
		this.isPermisoActualizarOriginalVentaGeneral=false;
		this.isPermisoEliminarVentaGeneral=false;
		this.isPermisoGuardarCambiosVentaGeneral=false;
		this.isPermisoConsultaVentaGeneral=true;
		this.isPermisoBusquedaVentaGeneral=true;
		this.isPermisoReporteVentaGeneral=true;
		this.isPermisoOrdenVentaGeneral=false;		
		this.isPermisoPaginacionMedioVentaGeneral=false;		
		this.isPermisoPaginacionAltoVentaGeneral=false;		
		this.isPermisoPaginacionTodoVentaGeneral=false;		
		this.isPermisoCopiarVentaGeneral=false;		
		this.isPermisoVerFormVentaGeneral=false;		
		this.isPermisoDuplicarVentaGeneral=false;
		this.isPermisoOrdenVentaGeneral=false;
	}
	
	public void setPermisosUsuarioVentaGeneral(Boolean isPermiso) {
		this.isPermisoTodoVentaGeneral=isPermiso;
		this.isPermisoNuevoVentaGeneral=isPermiso;
		this.isPermisoActualizarVentaGeneral=isPermiso;
		this.isPermisoActualizarOriginalVentaGeneral=isPermiso;
		this.isPermisoEliminarVentaGeneral=isPermiso;
		this.isPermisoGuardarCambiosVentaGeneral=isPermiso;
		this.isPermisoConsultaVentaGeneral=isPermiso;
		this.isPermisoBusquedaVentaGeneral=isPermiso;
		this.isPermisoReporteVentaGeneral=isPermiso;
		this.isPermisoOrdenVentaGeneral=isPermiso;		
		this.isPermisoPaginacionMedioVentaGeneral=isPermiso;		
		this.isPermisoPaginacionAltoVentaGeneral=isPermiso;		
		this.isPermisoPaginacionTodoVentaGeneral=isPermiso;		
		this.isPermisoCopiarVentaGeneral=isPermiso;		
		this.isPermisoVerFormVentaGeneral=isPermiso;		
		this.isPermisoDuplicarVentaGeneral=isPermiso;
		this.isPermisoOrdenVentaGeneral=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentaGeneral(Boolean isPermiso) {
		//this.isPermisoTodoVentaGeneral=isPermiso;
		this.isPermisoNuevoVentaGeneral=isPermiso;
		this.isPermisoActualizarVentaGeneral=isPermiso;
		this.isPermisoActualizarOriginalVentaGeneral=isPermiso;
		this.isPermisoEliminarVentaGeneral=isPermiso;
		this.isPermisoGuardarCambiosVentaGeneral=isPermiso;
		//this.isPermisoConsultaVentaGeneral=isPermiso;
		//this.isPermisoBusquedaVentaGeneral=isPermiso;
		//this.isPermisoReporteVentaGeneral=isPermiso;
		//this.isPermisoOrdenVentaGeneral=isPermiso;		
		//this.isPermisoPaginacionMedioVentaGeneral=isPermiso;		
		//this.isPermisoPaginacionAltoVentaGeneral=isPermiso;		
		//this.isPermisoPaginacionTodoVentaGeneral=isPermiso;		
		//this.isPermisoCopiarVentaGeneral=isPermiso;		
		//this.isPermisoDuplicarVentaGeneral=isPermiso;
		//this.isPermisoOrdenVentaGeneral=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentaGeneralClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentaGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentaGeneral(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentaGeneralClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentaGeneralClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentaGeneralClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentaGeneralClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentaGeneral() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentaGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventageneralSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentaGeneralConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentaGeneral=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentaGeneral=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentaGeneral=this.isPermisoActualizarVentaGeneral;
			this.isPermisoEliminarVentaGeneral=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentaGeneral=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentaGeneral=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentaGeneral=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentaGeneral=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentaGeneral=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentaGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentaGeneral=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentaGeneral=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentaGeneral=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentaGeneral=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentaGeneral=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentaGeneral=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentaGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventageneralSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentaGeneral.setToolTipText(this.jTableDatosVentaGeneral.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentaGeneral(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentaGeneral(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentaGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentaGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentaGeneral() throws Exception {
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
	public void inicializarCombosForeignKeyVentaGeneralListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentaGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentaGeneralJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyVentaGeneral()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ventageneralSessionBean==null) {
				this.ventageneralSessionBean=new VentaGeneralSessionBean();
			}

			if(!this.ventageneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.ventageneralSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.ventageneralSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.ventageneralSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyVentaGeneral()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentaGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentaGeneral()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentaGeneral();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentaGeneral(VentaGeneral ventageneral)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(ventageneral.getid_cliente(),false,"Formulario");
			this.setActualProductoForeignKey(ventageneral.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentaGeneral(VentaGeneral ventageneral,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentaGeneral()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.ventageneralConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualProductoForeignKey(this.ventageneralConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentaGeneral()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentaGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentaGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentaGeneral()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentaGeneral()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentaGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentaGeneral()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public VentaGeneralBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentaGeneralBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentaGeneralBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventageneralSessionBean=new VentaGeneralSessionBean(); 
		this.ventageneralConstantesFunciones=new VentaGeneralConstantesFunciones(); 
		this.ventageneralBean=new VentaGeneral();//(this.ventageneralConstantesFunciones); 		
		this.ventageneralReturnGeneral=new VentaGeneralParameterReturnGeneral(); 
		
		this.ventageneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventageneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentaGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentaGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentaGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentaGeneral(true);
			
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
			
			this.ventageneralConstantesFunciones=new VentaGeneralConstantesFunciones(); 
			this.ventageneralBean=new VentaGeneral();//this.ventageneralConstantesFunciones); 			
			this.ventageneralReturnGeneral=new VentaGeneralParameterReturnGeneral(); 
		
			VentaGeneralBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Venta General Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventageneral=new VentaGeneral();
			this.ventagenerals = new ArrayList<VentaGeneral>();
			this.ventageneralsAux = new ArrayList<VentaGeneral>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic=new VentaGeneralLogic();
				this.ventageneralLogic.getNewConnexionToDeep("");
			}
			
			//this.ventageneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventageneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentaGeneral);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentaGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentaGeneral);	
					}
					
					if(this.jInternalFrameImportacionVentaGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentaGeneral);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentaGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentaGeneral);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentaGeneral);
				this.jInternalFrameDetalleFormVentaGeneral.setVisible(false);
				this.jInternalFrameDetalleFormVentaGeneral.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentaGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentaGeneral);
					this.jInternalFrameReporteDinamicoVentaGeneral.setVisible(false);
					this.jInternalFrameReporteDinamicoVentaGeneral.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentaGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentaGeneral);
					this.jInternalFrameImportacionVentaGeneral.setVisible(false);
					this.jInternalFrameImportacionVentaGeneral.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentaGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentaGeneral);
					this.jInternalFrameOrderByVentaGeneral.setVisible(false);
					this.jInternalFrameOrderByVentaGeneral.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentaGeneralActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentaGeneralConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventageneralReturnGeneral=new VentaGeneralParameterReturnGeneral();
			
			this.ventageneralParameterGeneral=new VentaGeneralParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventageneralLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentaGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventageneralSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentaGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventageneralSessionBean.getEsGuardarRelacionado(),this.ventageneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentaGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventageneralSessionBean.getEsGuardarRelacionado(),this.ventageneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentaGeneral=false;
			this.isVisibilidadCeldaDuplicarVentaGeneral=true;
			this.isVisibilidadCeldaCopiarVentaGeneral=true;
			this.isVisibilidadCeldaVerFormVentaGeneral=true;
			this.isVisibilidadCeldaOrdenVentaGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
			this.isVisibilidadCeldaModificarVentaGeneral=false;
			this.isVisibilidadCeldaActualizarVentaGeneral=false;
			this.isVisibilidadCeldaEliminarVentaGeneral=false;
			this.isVisibilidadCeldaCancelarVentaGeneral=false;
			this.isVisibilidadCeldaGuardarVentaGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=false;
			
			
			this.isVisibilidadBusquedaVentaGeneral=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentaGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentaGeneral();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentaGeneral(false);
			
			this.setPermisosUsuarioVentaGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventageneralSessionBean.getEsGuardarRelacionado() 
				|| (this.ventageneralSessionBean.getEsGuardarRelacionado() && this.ventageneralSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentaGeneralClasesRelacionadas();
			}
			
			if(this.ventageneralSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentaGeneralClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentaGeneral();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentaGeneral();
			}
			
			if(!this.isPermisoBusquedaVentaGeneral) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentaGeneral.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentaGeneralConstantesFunciones.getTiposSeleccionarVentaGeneral());
				
				this.tiposColumnasSelect=VentaGeneralConstantesFunciones.getTiposSeleccionarVentaGeneral(true);
				
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
			//if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentaGeneral();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentaGeneral(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentaGeneral(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentaGeneral() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.productoLogic=new ProductoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ventageneralImplementable= (VentaGeneralImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentaGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventageneralImplementableHome= (VentaGeneralImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentaGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventagenerals= new ArrayList<VentaGeneral>();
			this.ventageneralsEliminados= new ArrayList<VentaGeneral>();
						
			this.isEsNuevoVentaGeneral=false;
			this.esParaAccionDesdeFormularioVentaGeneral=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentaGeneral(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentaGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentaGeneralBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentaGeneralConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentaGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentaGeneral(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentaGeneral();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentaGeneral();
			}
			
			VentaGeneralBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentaGeneral.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentaGeneral.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentaGeneral.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentaGeneral(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentaGeneral: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentaGeneral() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentaGeneral")) {
				iIndex=this.jInternalFrameDetalleFormVentaGeneral.jTabbedPaneRelacionesVentaGeneral.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentaGeneral.jTabbedPaneRelacionesVentaGeneral.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentaGeneral();	
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
	
	public void cargarCombosForeignKeyVentaGeneral(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentaGeneral(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentaGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentaGeneralListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentaGeneral();
		
		this.cargarCombosFrameForeignKeyVentaGeneral();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentaGeneral();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentaGeneral();
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
	
	public void jButtonNuevoVentaGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventageneralSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
			
			if(jTableDatosVentaGeneral.getRowCount()>=1) {
				jTableDatosVentaGeneral.removeRowSelectionInterval(0, jTableDatosVentaGeneral.getRowCount()-1);						
			}
			
			this.isEsNuevoVentaGeneral=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentaGeneral(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentaGeneral(true);			
			//this.ventageneral=new VentaGeneral();
			//this.ventageneral.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentaGeneral(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentaGeneral() ;
			
			if(VentaGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentaGeneral(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventageneral);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);				
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
			if(this.ventageneralSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentaGeneral: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentaGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentaGeneral.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentaGeneral.getSelectedRows().length;			
			}
			
			ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentaGeneral--;			
				//VentaGeneral ventageneralAux= new VentaGeneral();			
				//ventageneralAux.setId(this.iIdNuevoVentaGeneral);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentaGeneral ventageneralOrigen=new VentaGeneral();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentaGeneral ventageneralOrigen : ventageneralsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventageneralOrigen =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventageneralOrigen =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentaGeneral();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventageneral.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentaGeneral(ventageneralOrigen,this.ventageneral,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventageneralLogic.getVentaGenerals().add(this.ventageneralAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventagenerals.add(this.ventageneralAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentaGeneral(false);
				
				this.jTableDatosVentaGeneral.setRowSelectionInterval(this.getIndiceNuevoVentaGeneral(), this.getIndiceNuevoVentaGeneral());
				
				int iLastRow =  this.jTableDatosVentaGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentaGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentaGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentaGeneral(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();									
		
			VentaGeneral ventageneralOrigen=new VentaGeneral();
			VentaGeneral ventageneralDestino=new VentaGeneral();
				
			ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentaGeneral.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventageneralsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentaGeneral.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventageneralOrigen =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventageneralOrigen =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventageneralDestino =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventageneralDestino =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventageneralOrigen =ventageneralsSeleccionados.get(0);
				ventageneralDestino =ventageneralsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentaGeneral(ventageneralOrigen,ventageneralDestino,true,false);
				
				ventageneralDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventageneralDestino,ventageneralLogic.getVentaGenerals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventageneralDestino,ventagenerals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentaGeneral(false);
				
				//this.jTableDatosVentaGeneral.setRowSelectionInterval(this.getIndiceNuevoVentaGeneral(), this.getIndiceNuevoVentaGeneral());
				
				int iLastRow =  this.jTableDatosVentaGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentaGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentaGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentaGeneral(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentaGeneral.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentaGeneral.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentaGeneral.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentaGeneral.setVisible(!isVisible);
			this.jPanelPaginacionVentaGeneral.setVisible(!isVisible);
			this.jPanelAccionesVentaGeneral.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentaGeneral();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentaGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentaGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentaGeneral();
			
			this.abrirFrameOrderByVentaGeneral();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentaGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentaGeneral(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentaGeneral);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentaGeneral.isMaximum()) {
					this.jInternalFrameDetalleFormVentaGeneral.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentaGeneral.setSize(this.jInternalFrameDetalleFormVentaGeneral.iWidthFormulario,this.jInternalFrameDetalleFormVentaGeneral.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentaGeneral.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentaGeneral.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentaGeneral.isMaximum()) {
						this.jInternalFrameDetalleFormVentaGeneral.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentaGeneral.jContentPaneDetalleVentaGeneral.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentaGeneral.jTabbedPaneRelacionesVentaGeneral.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentaGeneral.jContentPaneDetalleVentaGeneral.getWidth(),VentaGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentaGeneral.jTabbedPaneRelacionesVentaGeneral.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentaGeneral.jContentPaneDetalleVentaGeneral.getWidth(),VentaGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentaGeneral.jTabbedPaneRelacionesVentaGeneral.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentaGeneral.jContentPaneDetalleVentaGeneral.getWidth(),VentaGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentaGeneral.setVisible(true);
	        this.jInternalFrameDetalleFormVentaGeneral.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentaGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentaGeneral==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentaGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentaGeneral,false,this);
				} else {
					this.jInternalFrameOrderByVentaGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentaGeneral,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentaGeneral);
				this.jInternalFrameOrderByVentaGeneral.setVisible(false);
				this.jInternalFrameOrderByVentaGeneral.setSelected(false);
				
				this.jInternalFrameOrderByVentaGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentaGeneral"));
				
				this.inicializarActualizarBindingTablaOrderByVentaGeneral();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentaGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentaGeneral==null) {
				
				this.jInternalFrameImportacionVentaGeneral=new ImportacionJInternalFrame(VentaGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentaGeneral);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentaGeneral);
				this.jInternalFrameImportacionVentaGeneral.setVisible(false);
				this.jInternalFrameImportacionVentaGeneral.setSelected(false);


				this.jInternalFrameImportacionVentaGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentaGeneral"));
				this.jInternalFrameImportacionVentaGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentaGeneral"));
				this.jInternalFrameImportacionVentaGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentaGeneral"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentaGeneral() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentaGeneral==null) {
				this.jInternalFrameReporteDinamicoVentaGeneral=new ReporteDinamicoJInternalFrame(VentaGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentaGeneral);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentaGeneral);
				this.jInternalFrameReporteDinamicoVentaGeneral.setVisible(false);
				this.jInternalFrameReporteDinamicoVentaGeneral.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentaGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentaGeneral"));
				this.jInternalFrameReporteDinamicoVentaGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentaGeneral"));
				this.jInternalFrameReporteDinamicoVentaGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentaGeneral"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentaGeneral();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentaGeneral() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentaGeneral);
			
	       	this.jInternalFrameDetalleFormVentaGeneral.setVisible(false);
	        this.jInternalFrameDetalleFormVentaGeneral.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentaGeneral.dispose();
			//this.jInternalFrameDetalleFormVentaGeneral=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentaGeneral() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentaGeneral.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentaGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentaGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentaGeneral.setVisible(true);
	        this.jInternalFrameImportacionVentaGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentaGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentaGeneral.setVisible(true);
	        this.jInternalFrameOrderByVentaGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentaGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentaGeneral.setVisible(false);
	        this.jInternalFrameOrderByVentaGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentaGeneral() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentaGeneral.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentaGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentaGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentaGeneral.setVisible(false);
	        this.jInternalFrameImportacionVentaGeneral.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentaGeneral(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentaGeneral(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentaGeneral(true);
			//this.isEsNuevoVentaGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentaGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentaGeneral(false) ;
			
			if(ventageneralSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentaGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentaGeneral(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentaGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentaGeneralActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentaGeneral(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentaGeneral(true);
			//this.isEsNuevoVentaGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventageneral.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentaGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentaGeneral(false) ;
			
			if(VentaGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentaGeneral(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentaGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentaGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentaGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentaGeneral(false);
			
			//if(!this.isEsNuevoVentaGeneral) {								
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				
			}
			
			if(this.permiteMantenimiento(this.ventageneral)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentaGeneral=true;
					this.inicializarActualizarBindingTablaVentaGeneral(false);
					this.isEsNuevoVentaGeneral=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentaGeneral=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentaGeneral=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentaGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentaGeneral(false);
				
				this.habilitarDeshabilitarControlesVentaGeneral(false);
			
												
				
				if(VentaGeneralJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentaGeneral();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentaGeneralActionPerformed(evt,ventageneralSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentaGeneral(this.ventageneral,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentaGeneral.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventageneralSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventageneral.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentaGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				this.ventageneral.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				this.ventageneral.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventageneral)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentaGeneralModel) this.jTableDatosVentaGeneral.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentaGeneral=true;
				this.inicializarActualizarBindingTablaVentaGeneral(false);
				this.isEsNuevoVentaGeneral=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentaGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentaGeneral(false);
				
				this.habilitarDeshabilitarControlesVentaGeneral(false);
				
				
				
				if(VentaGeneralJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentaGeneral();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentaGeneralActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentaGeneral.getRowCount()>=1) {
				jTableDatosVentaGeneral.removeRowSelectionInterval(0, jTableDatosVentaGeneral.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentaGeneral(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentaGeneral(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentaGeneral(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentaGeneral(false) ;
			
			this.isEsNuevoVentaGeneral=false;
			
			if(VentaGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentaGeneral();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentaGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentaGeneral(false);
				
				//SI ES MANUAL
				if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentaGeneral();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentaGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentaGeneral--;			
			//VentaGeneral ventageneralAux= new VentaGeneral();			
			//ventageneralAux.setId(this.iIdNuevoVentaGeneral);
			
			if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentaGeneral();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
			
			this.ventageneral.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventageneralLogic.getVentaGenerals().add(this.ventageneralAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventagenerals.add(this.ventageneralAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentaGeneral(false);
			
			this.jTableDatosVentaGeneral.setRowSelectionInterval(this.getIndiceNuevoVentaGeneral(), this.getIndiceNuevoVentaGeneral());
			
			int iLastRow =  this.jTableDatosVentaGeneral.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentaGeneral.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentaGeneral.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentaGeneral(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentaGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentaGeneral(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentaGeneral(false);
			
			//SI ES MANUAL
			if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentaGeneral();
			}
			
			//this.abrirFrameTreeVentaGeneral();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentaGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentaGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentaGeneral.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentaGeneral.setFileImportacion(this.jInternalFrameImportacionVentaGeneral.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentaGeneral.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentaGeneral.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentaGeneral.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentaGeneral.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentaGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();		

		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentaGeneralBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentaGeneralBaseDesign.jrxml";
			
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
			
			this.generarReporteVentaGenerals("Todos",ventageneralsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta General",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentaGeneralConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaGeneralConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVentaGeneral.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentaGeneralConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case VentaGeneralConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case VentaGeneralConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case VentaGeneralConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case VentaGeneralConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case VentaGeneralConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case VentaGeneralConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case VentaGeneralConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentaGeneralConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case VentaGeneralConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case VentaGeneralConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case VentaGeneralConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case VentaGeneralConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case VentaGeneralConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case VentaGeneralConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case VentaGeneralConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentaGeneralConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case VentaGeneralConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case VentaGeneralConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case VentaGeneralConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case VentaGeneralConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case VentaGeneralConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case VentaGeneralConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case VentaGeneralConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
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
	
	public void jButtonGenerarExcelReporteDinamicoVentaGeneralActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();		
		
		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventageneral";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentaGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentaGeneralConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IVA);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaGeneralConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_ICE);
					iRow++;

					for(VentaGeneral ventageneral:ventageneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventageneral.getice());
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
			//	this.getFilaCabeceraExportarExcelVentaGeneral(row);				
			//	iRow++;
			//}				
			
			//for(VentaGeneral ventageneralAux:ventageneralsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentaGeneral(ventageneralAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta General",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventageneralLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentaGeneral(false);
			
			//SI ES MANUAL
			if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentaGeneral();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentaGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentaGeneral(false);
			
			//SI ES MANUAL
			if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentaGeneral();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentaGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentaGeneral(false);
			
			//SI ES MANUAL
			if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentaGeneral();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentaGeneral() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentaGeneral.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentaGeneral.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentaGeneral.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentaGeneral.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentaGeneral.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentaGeneral.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentaGeneral.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentaGeneral(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentaGeneral(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentaGeneral(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentaGeneral(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentaGeneral(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentaGeneral(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentaGeneral(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentaGeneral(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentaGeneral() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentaGeneral();
		
		this.inicializarActualizarBindingBotonesManualVentaGeneral(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentaGeneral();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentaGeneral() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentaGeneral(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentaGeneral(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentaGeneral.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentaGeneral.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentaGeneral.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentaGeneral.jCheckBoxPostAccionNuevoVentaGeneral.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentaGeneral.jCheckBoxPostAccionSinCerrarVentaGeneral.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentaGeneral.jCheckBoxPostAccionSinMensajeVentaGeneral.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentaGeneral.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentaGeneral.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentaGeneral.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
				this.jInternalFrameDetalleFormVentaGeneral.jCheckBoxPostAccionNuevoVentaGeneral.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentaGeneral.jCheckBoxPostAccionSinCerrarVentaGeneral.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentaGeneral.jCheckBoxPostAccionSinMensajeVentaGeneral.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentaGeneral.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentaGeneral.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentaGeneral.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentaGeneral!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentaGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentaGeneral.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentaGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentaGeneral.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentaGeneral!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentaGeneral.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentaGeneral.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentaGeneral(Boolean esInicializar) throws Exception {
		try	{	
			if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentaGeneral(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentaGeneral() throws Exception {
		try	{
			if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentaGeneral();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentaGeneral() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentaGeneral() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentaGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentaGeneral.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentaGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentaGeneral.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentaGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentaGeneral.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentaGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentaGeneral.addItem(reporte);
			}
			
			
			if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentaGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentaGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentaGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentaGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentaGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentaGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentaGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentaGeneral.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentaGeneral.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentaGeneral();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentaGeneral() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentaGeneral!=null) {
				this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentaGeneral!=null) {
				this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentaGeneral!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentaGeneral.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentaGeneral.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentaGeneral.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentaGeneralConstantesFunciones.getTiposSeleccionarVentaGeneral(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentaGeneralConstantesFunciones.getTiposSeleccionarVentaGeneral(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentaGeneralConstantesFunciones.getTiposSeleccionarVentaGeneral(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentaGeneral.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentaGeneral.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentaGeneral()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_desdeBusquedaVentaGeneral=new Date(this.jDateChooserfecha_desdeBusquedaVentaGeneralVentaGeneral.getDate().getTime());
		this.fecha_hastaBusquedaVentaGeneral=new Date(this.jDateChooserfecha_hastaBusquedaVentaGeneralVentaGeneral.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentaGeneral(Boolean esInicializar) throws Exception {				
		if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentaGeneral();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentaGeneral() throws Exception {
		this.inicializarActualizarBindingTablaVentaGeneral(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentaGeneral() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentaGeneralOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneralOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentaGeneral(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventageneralLogic.getVentaGenerals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventagenerals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentaGeneral.setModel(new VentaGeneralModel(this.ventageneralLogic.getVentaGenerals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentaGeneral.setModel(new VentaGeneralModel(this.ventagenerals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentaGeneral!=null && this.jInternalFrameOrderByVentaGeneral.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentaGeneral();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO,ventageneralConstantesFunciones.resaltarSeleccionarVentaGeneral,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentaGeneralConstantesFunciones.SCLASSWEBTITULO,ventageneralConstantesFunciones.resaltarSeleccionarVentaGeneral,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_ID));

		if(this.ventageneralConstantesFunciones.mostraridVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventageneralConstantesFunciones.resaltaridVentaGeneral,this.ventageneralConstantesFunciones.activaridVentaGeneral,iSizeTabla,this,true,"idVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventageneralConstantesFunciones.resaltaridVentaGeneral,this.ventageneralConstantesFunciones.activaridVentaGeneral,this,true,"idVentaGeneral","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.ventageneralConstantesFunciones.mostrarnombre_productoVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventageneralConstantesFunciones.resaltarnombre_productoVentaGeneral,this.ventageneralConstantesFunciones.activarnombre_productoVentaGeneral,iSizeTabla,this,true,"nombre_productoVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventageneralConstantesFunciones.resaltarnombre_productoVentaGeneral,this.ventageneralConstantesFunciones.activarnombre_productoVentaGeneral,this,true,"nombre_productoVentaGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.ventageneralConstantesFunciones.mostrarnombre_clienteVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventageneralConstantesFunciones.resaltarnombre_clienteVentaGeneral,this.ventageneralConstantesFunciones.activarnombre_clienteVentaGeneral,iSizeTabla,this,true,"nombre_clienteVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventageneralConstantesFunciones.resaltarnombre_clienteVentaGeneral,this.ventageneralConstantesFunciones.activarnombre_clienteVentaGeneral,this,true,"nombre_clienteVentaGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_FECHA));

		if(this.ventageneralConstantesFunciones.mostrarfechaVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ventageneralConstantesFunciones.resaltarfechaVentaGeneral,this.ventageneralConstantesFunciones.activarfechaVentaGeneral,iSizeTabla,this,true,"fechaVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ventageneralConstantesFunciones.resaltarfechaVentaGeneral,this.ventageneralConstantesFunciones.activarfechaVentaGeneral,this,true,"fechaVentaGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_SECUENCIAL));

		if(this.ventageneralConstantesFunciones.mostrarsecuencialVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventageneralConstantesFunciones.resaltarsecuencialVentaGeneral,this.ventageneralConstantesFunciones.activarsecuencialVentaGeneral,iSizeTabla,this,true,"secuencialVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventageneralConstantesFunciones.resaltarsecuencialVentaGeneral,this.ventageneralConstantesFunciones.activarsecuencialVentaGeneral,this,true,"secuencialVentaGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_CANTIDAD));

		if(this.ventageneralConstantesFunciones.mostrarcantidadVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventageneralConstantesFunciones.resaltarcantidadVentaGeneral,this.ventageneralConstantesFunciones.activarcantidadVentaGeneral,iSizeTabla,this,true,"cantidadVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventageneralConstantesFunciones.resaltarcantidadVentaGeneral,this.ventageneralConstantesFunciones.activarcantidadVentaGeneral,this,true,"cantidadVentaGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_PRECIO));

		if(this.ventageneralConstantesFunciones.mostrarprecioVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventageneralConstantesFunciones.resaltarprecioVentaGeneral,this.ventageneralConstantesFunciones.activarprecioVentaGeneral,iSizeTabla,this,true,"precioVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventageneralConstantesFunciones.resaltarprecioVentaGeneral,this.ventageneralConstantesFunciones.activarprecioVentaGeneral,this,true,"precioVentaGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_DESCUENTO));

		if(this.ventageneralConstantesFunciones.mostrardescuentoVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventageneralConstantesFunciones.resaltardescuentoVentaGeneral,this.ventageneralConstantesFunciones.activardescuentoVentaGeneral,iSizeTabla,this,true,"descuentoVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventageneralConstantesFunciones.resaltardescuentoVentaGeneral,this.ventageneralConstantesFunciones.activardescuentoVentaGeneral,this,true,"descuentoVentaGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_IVA));

		if(this.ventageneralConstantesFunciones.mostrarivaVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventageneralConstantesFunciones.resaltarivaVentaGeneral,this.ventageneralConstantesFunciones.activarivaVentaGeneral,iSizeTabla,this,true,"ivaVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventageneralConstantesFunciones.resaltarivaVentaGeneral,this.ventageneralConstantesFunciones.activarivaVentaGeneral,this,true,"ivaVentaGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,VentaGeneralConstantesFunciones.LABEL_ICE));

		if(this.ventageneralConstantesFunciones.mostrariceVentaGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaGeneralConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventageneralConstantesFunciones.resaltariceVentaGeneral,this.ventageneralConstantesFunciones.activariceVentaGeneral,iSizeTabla,this,true,"iceVentaGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventageneralConstantesFunciones.resaltariceVentaGeneral,this.ventageneralConstantesFunciones.activariceVentaGeneral,this,true,"iceVentaGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventageneralSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventageneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventageneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentaGeneral.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventageneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventageneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentaGeneral.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventageneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventageneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentaGeneral.addColumn(tableColumn);
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
			
			this.jTableDatosVentaGeneral.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentaGeneral.moveColumn(this.jTableDatosVentaGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentaGeneral.moveColumn(this.jTableDatosVentaGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentaGeneral.moveColumn(this.jTableDatosVentaGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentaGeneral.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentaGeneral.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentaGeneral,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentaGeneral.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentaGeneral.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentaGeneral.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentaGeneral.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentaGeneral.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventageneralLogic.getVentaGenerals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventagenerals.size()-1;
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
		//this.jTableDatosVentaGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentaGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentaGeneral();
			
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
				
				//this.isEsNuevoVentaGeneral=false;
					
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
				if(this.ventageneralSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentaGeneral==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentaGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentaGeneral.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventageneral.getsType().equals("DUPLICADO")
				   || this.ventageneral.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentaGeneral=true;
				
				} else {
					this.isEsNuevoVentaGeneral=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventageneralSessionBean.getEsGuardarRelacionado()) {
					if(this.ventageneral.getId()>=0 && !this.ventageneral.getIsNew()) {						
						this.isEsNuevoVentaGeneral=false;
						
					} else {
						this.isEsNuevoVentaGeneral=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentaGeneral(esRelaciones);						
				
				this.seleccionarVentaGeneral(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventageneral.getId()<0) {
					this.isEsNuevoVentaGeneral=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentaGeneral(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentaGeneral(evt,rowIndex);
				}	
				
				if(this.ventageneralSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentaGeneral: " + this.dDif); 
					}
				}								
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentaGeneral(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventageneral)) {
					if(this.ventageneral.getId()>0) {
						this.ventageneral.setIsDeleted(true);
						
						this.ventageneralsEliminados.add(this.ventageneral);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventageneralLogic.getVentaGenerals().remove(this.ventageneral);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventagenerals.remove(this.ventageneral);				
					}
					
					
					((VentaGeneralModel) this.jTableDatosVentaGeneral.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentaGeneral(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentaGeneral(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentaGeneral) {
			
			if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentaGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentaGeneral.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentaGeneral(this.ventageneral);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.ventageneralConstantesFunciones.cargarid_clienteVentaGeneral || this.ventageneralConstantesFunciones.event_dependid_clienteVentaGeneral) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.ventageneral.getid_cliente());
									//this.inicializarActualizarBindingVentaGeneral(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(ventageneral.getCliente()!=null) {
							this.clientesForeignKey.add(ventageneral.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.ventageneral.getid_cliente(),false,"Formulario");

					//Producto
					if(!this.ventageneralConstantesFunciones.cargarid_productoVentaGeneral || this.ventageneralConstantesFunciones.event_dependid_productoVentaGeneral) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.ventageneral.getid_producto());
									//this.inicializarActualizarBindingVentaGeneral(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(ventageneral.getProducto()!=null) {
							this.productosForeignKey.add(ventageneral.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.ventageneral.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentaGeneral("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentaGeneral(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentaGeneral() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentaGeneral(VentaGeneral ventageneral) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentaGeneral(ventageneral,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentaGeneral(VentaGeneral ventageneral,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentaGeneral(ventageneral);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentaGeneral(ventageneral,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentaGeneral(ventageneral);
	}
	
	public void setVariablesObjetoActualToFormularioVentaGeneral(VentaGeneral ventageneral) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.setText(ventageneral.getId().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_productoVentaGeneral.setText(ventageneral.getnombre_producto());
			this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_clienteVentaGeneral.setText(ventageneral.getnombre_cliente());
			this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfechaVentaGeneral.setDate(ventageneral.getfecha());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldsecuencialVentaGeneral.setText(ventageneral.getsecuencial());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldcantidadVentaGeneral.setText(ventageneral.getcantidad().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldprecioVentaGeneral.setText(ventageneral.getprecio().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFielddescuentoVentaGeneral.setText(ventageneral.getdescuento().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldivaVentaGeneral.setText(ventageneral.getiva().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldiceVentaGeneral.setText(ventageneral.getice().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentaGeneral ventageneralLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventageneralLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentaGeneral ventageneralLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventageneralLocal=this.ventageneral;
			} else {
				ventageneralLocal=this.ventageneralAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventageneralLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentaGeneral(ventageneralLocal,true);
					
					if(ventageneralSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventageneralLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventageneralSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventageneralLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentaGeneral(VentaGeneral ventageneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentaGeneral(ventageneral,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(ventageneral);
	}
	
	public void setVariablesFormularioToObjetoActualVentaGeneral(VentaGeneral ventageneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentaGeneral(ventageneral,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentaGeneral(VentaGeneral ventageneral,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.getText()==null || this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.getText()=="" || this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.getText()=="Id") {
				this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.setText("0");
			}

			if(conColumnasBase) {ventageneral.setId(Long.parseLong(this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelIdVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventageneral.setnombre_producto(this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_productoVentaGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelnombre_productoVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventageneral.setnombre_cliente(this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_clienteVentaGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelnombre_clienteVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventageneral.setfecha(this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfechaVentaGeneral.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelfechaVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventageneral.setsecuencial(this.jInternalFrameDetalleFormVentaGeneral.jTextFieldsecuencialVentaGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelsecuencialVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventageneral.setcantidad(Double.parseDouble(this.jInternalFrameDetalleFormVentaGeneral.jTextFieldcantidadVentaGeneral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelcantidadVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventageneral.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormVentaGeneral.jTextFieldprecioVentaGeneral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelprecioVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventageneral.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormVentaGeneral.jTextFielddescuentoVentaGeneral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabeldescuentoVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventageneral.setiva(Double.parseDouble(this.jInternalFrameDetalleFormVentaGeneral.jTextFieldivaVentaGeneral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabelivaVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventageneral.setice(Double.parseDouble(this.jInternalFrameDetalleFormVentaGeneral.jTextFieldiceVentaGeneral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaGeneralConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaGeneral.jLabeliceVentaGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentaGeneral(VentaGeneral ventageneralBean,VentaGeneral ventageneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentaGeneral(VentaGeneral ventageneralOrigen,VentaGeneral ventageneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventageneralOrigen.getId()!=null && !ventageneralOrigen.getId().equals(0L))) {ventageneral.setId(ventageneralOrigen.getId());}}
			if(conDefault || (!conDefault && ventageneralOrigen.getid_cliente()!=null && !ventageneralOrigen.getid_cliente().equals(-1L))) {ventageneral.setid_cliente(ventageneralOrigen.getid_cliente());}
			if(conDefault || (!conDefault && ventageneralOrigen.getid_producto()!=null && !ventageneralOrigen.getid_producto().equals(-1L))) {ventageneral.setid_producto(ventageneralOrigen.getid_producto());}
			if(conDefault || (!conDefault && ventageneralOrigen.getfecha_desde()!=null && !ventageneralOrigen.getfecha_desde().equals(new Date()))) {ventageneral.setfecha_desde(ventageneralOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && ventageneralOrigen.getfecha_hasta()!=null && !ventageneralOrigen.getfecha_hasta().equals(new Date()))) {ventageneral.setfecha_hasta(ventageneralOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && ventageneralOrigen.getnombre_producto()!=null && !ventageneralOrigen.getnombre_producto().equals(""))) {ventageneral.setnombre_producto(ventageneralOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && ventageneralOrigen.getnombre_cliente()!=null && !ventageneralOrigen.getnombre_cliente().equals(""))) {ventageneral.setnombre_cliente(ventageneralOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && ventageneralOrigen.getfecha()!=null && !ventageneralOrigen.getfecha().equals(new Date()))) {ventageneral.setfecha(ventageneralOrigen.getfecha());}
			if(conDefault || (!conDefault && ventageneralOrigen.getsecuencial()!=null && !ventageneralOrigen.getsecuencial().equals(""))) {ventageneral.setsecuencial(ventageneralOrigen.getsecuencial());}
			if(conDefault || (!conDefault && ventageneralOrigen.getcantidad()!=null && !ventageneralOrigen.getcantidad().equals(0.0))) {ventageneral.setcantidad(ventageneralOrigen.getcantidad());}
			if(conDefault || (!conDefault && ventageneralOrigen.getprecio()!=null && !ventageneralOrigen.getprecio().equals(0.0))) {ventageneral.setprecio(ventageneralOrigen.getprecio());}
			if(conDefault || (!conDefault && ventageneralOrigen.getdescuento()!=null && !ventageneralOrigen.getdescuento().equals(0.0))) {ventageneral.setdescuento(ventageneralOrigen.getdescuento());}
			if(conDefault || (!conDefault && ventageneralOrigen.getiva()!=null && !ventageneralOrigen.getiva().equals(0.0))) {ventageneral.setiva(ventageneralOrigen.getiva());}
			if(conDefault || (!conDefault && ventageneralOrigen.getice()!=null && !ventageneralOrigen.getice().equals(0.0))) {ventageneral.setice(ventageneralOrigen.getice());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentaGeneral(VentaGeneral ventageneral) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.setText(ventageneral.getId().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_productoVentaGeneral.setText(ventageneral.getnombre_producto());
			this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_clienteVentaGeneral.setText(ventageneral.getnombre_cliente());
			this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfechaVentaGeneral.setDate(ventageneral.getfecha());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldsecuencialVentaGeneral.setText(ventageneral.getsecuencial());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldcantidadVentaGeneral.setText(ventageneral.getcantidad().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldprecioVentaGeneral.setText(ventageneral.getprecio().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFielddescuentoVentaGeneral.setText(ventageneral.getdescuento().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldivaVentaGeneral.setText(ventageneral.getiva().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldiceVentaGeneral.setText(ventageneral.getice().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentaGeneral(VentaGeneralBean ventageneralBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.setText(ventageneralBean.getId().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_productoVentaGeneral.setText(ventageneralBean.getnombre_producto());
			this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_clienteVentaGeneral.setText(ventageneralBean.getnombre_cliente());
			this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfechaVentaGeneral.setDate(ventageneralBean.getfecha());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldsecuencialVentaGeneral.setText(ventageneralBean.getsecuencial());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldcantidadVentaGeneral.setText(ventageneralBean.getcantidad().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldprecioVentaGeneral.setText(ventageneralBean.getprecio().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFielddescuentoVentaGeneral.setText(ventageneralBean.getdescuento().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldivaVentaGeneral.setText(ventageneralBean.getiva().toString());
			this.jInternalFrameDetalleFormVentaGeneral.jTextFieldiceVentaGeneral.setText(ventageneralBean.getice().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentaGeneral(VentaGeneralParameterReturnGeneral ventageneralReturnGeneral,VentaGeneralBean ventageneralBean,Boolean conDefault) throws Exception { 
		try {
			VentaGeneral ventageneralLocal=new VentaGeneral();
			
			ventageneralLocal=ventageneralReturnGeneral.getVentaGeneral();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventageneralLocal.getId()!=null && !ventageneralLocal.getId().equals(0L))) {ventageneralBean.setId(ventageneralLocal.getId());}}
			if(conDefault || (!conDefault && ventageneralLocal.getnombre_producto()!=null && !ventageneralLocal.getnombre_producto().equals(""))) {ventageneralBean.setnombre_producto(ventageneralLocal.getnombre_producto());}
			if(conDefault || (!conDefault && ventageneralLocal.getnombre_cliente()!=null && !ventageneralLocal.getnombre_cliente().equals(""))) {ventageneralBean.setnombre_cliente(ventageneralLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && ventageneralLocal.getfecha()!=null && !ventageneralLocal.getfecha().equals(new Date()))) {ventageneralBean.setfecha(ventageneralLocal.getfecha());}
			if(conDefault || (!conDefault && ventageneralLocal.getsecuencial()!=null && !ventageneralLocal.getsecuencial().equals(""))) {ventageneralBean.setsecuencial(ventageneralLocal.getsecuencial());}
			if(conDefault || (!conDefault && ventageneralLocal.getcantidad()!=null && !ventageneralLocal.getcantidad().equals(0.0))) {ventageneralBean.setcantidad(ventageneralLocal.getcantidad());}
			if(conDefault || (!conDefault && ventageneralLocal.getprecio()!=null && !ventageneralLocal.getprecio().equals(0.0))) {ventageneralBean.setprecio(ventageneralLocal.getprecio());}
			if(conDefault || (!conDefault && ventageneralLocal.getdescuento()!=null && !ventageneralLocal.getdescuento().equals(0.0))) {ventageneralBean.setdescuento(ventageneralLocal.getdescuento());}
			if(conDefault || (!conDefault && ventageneralLocal.getiva()!=null && !ventageneralLocal.getiva().equals(0.0))) {ventageneralBean.setiva(ventageneralLocal.getiva());}
			if(conDefault || (!conDefault && ventageneralLocal.getice()!=null && !ventageneralLocal.getice().equals(0.0))) {ventageneralBean.setice(ventageneralLocal.getice());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentaGeneralGenerico(Long idVentaGeneralSeleccionado,JComboBox jComboBoxVentaGeneral,List<VentaGeneral> ventageneralsLocal)throws Exception {
		try {
			VentaGeneral  ventageneralTemp=null;

			for(VentaGeneral ventageneralAux:ventageneralsLocal) {
				if(ventageneralAux.getId()!=null && ventageneralAux.getId().equals(idVentaGeneralSeleccionado)) {
					ventageneralTemp=ventageneralAux;
					break;
				}
			}

			jComboBoxVentaGeneral.setSelectedItem(ventageneralTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentaGeneralGenerico(JComboBox jComboBoxVentaGeneral,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentaGeneral.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentaGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentaGeneral.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentaGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentaGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentaGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventageneral=(VentaGeneral) ventageneralLogic.getVentaGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventageneral =(VentaGeneral) ventagenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventageneral.getIsNew() && !ventageneral.getIsChanged() && !ventageneral.getIsDeleted()) {
				sDescripcion=ventageneral.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventageneral.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ventageneral.getIsNew() && !ventageneral.getIsChanged() && !ventageneral.getIsDeleted()) {
				sDescripcion=ventageneral.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ventageneral.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!ventageneral.getIsNew() && !ventageneral.getIsChanged() && !ventageneral.getIsDeleted()) {
				sDescripcion=ventageneral.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=ventageneral.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!ventageneral.getIsNew() && !ventageneral.getIsChanged() && !ventageneral.getIsDeleted()) {
				sDescripcion=ventageneral.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=ventageneral.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentaGeneral ventageneralRow=new VentaGeneral();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventageneralRow=(VentaGeneral) ventageneralLogic.getVentaGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventageneralRow=(VentaGeneral) ventagenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentaGeneral(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentaGeneral.setVisible((this.isVisibilidadCeldaNuevoVentaGeneral && this.isPermisoNuevoVentaGeneral));			
			this.jButtonDuplicarVentaGeneral.setVisible((this.isVisibilidadCeldaDuplicarVentaGeneral && this.isPermisoDuplicarVentaGeneral));			
			this.jButtonCopiarVentaGeneral.setVisible((this.isVisibilidadCeldaCopiarVentaGeneral && this.isPermisoCopiarVentaGeneral));
			this.jButtonVerFormVentaGeneral.setVisible((this.isVisibilidadCeldaVerFormVentaGeneral && this.isPermisoVerFormVentaGeneral));
			
			this.jButtonAbrirOrderByVentaGeneral.setVisible((this.isVisibilidadCeldaOrdenVentaGeneral && this.isPermisoOrdenVentaGeneral));			
			
			this.jButtonNuevoRelacionesVentaGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentaGeneral && this.isPermisoNuevoVentaGeneral));			
			this.jButtonNuevoGuardarCambiosVentaGeneral.setVisible((this.isVisibilidadCeldaNuevoVentaGeneral && this.isPermisoNuevoVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));
			
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonModificarVentaGeneral.setVisible((this.isVisibilidadCeldaModificarVentaGeneral && this.isPermisoActualizarVentaGeneral));	
			this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarVentaGeneral.setVisible((this.isVisibilidadCeldaActualizarVentaGeneral && this.isPermisoActualizarVentaGeneral));	
			this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarVentaGeneral.setVisible((this.isVisibilidadCeldaEliminarVentaGeneral && this.isPermisoEliminarVentaGeneral));
			this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarVentaGeneral.setVisible(this.isVisibilidadCeldaCancelarVentaGeneral);							
			this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosVentaGeneral.setVisible((this.isVisibilidadCeldaGuardarVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentaGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaNuevoVentaGeneral && this.isPermisoNuevoVentaGeneral));						
			this.jButtonDuplicarToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaDuplicarVentaGeneral && this.isPermisoDuplicarVentaGeneral));						
			this.jButtonCopiarToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaCopiarVentaGeneral && this.isPermisoCopiarVentaGeneral));			
			this.jButtonVerFormToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaVerFormVentaGeneral && this.isPermisoVerFormVentaGeneral));			
			this.jButtonAbrirOrderByToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaOrdenVentaGeneral && this.isPermisoOrdenVentaGeneral));
			this.jButtonNuevoRelacionesToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentaGeneral && this.isPermisoNuevoVentaGeneral));			
			this.jButtonNuevoGuardarCambiosToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaNuevoVentaGeneral && this.isPermisoNuevoVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));			
			
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonModificarToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaModificarVentaGeneral && this.isPermisoActualizarVentaGeneral));	
			this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaActualizarVentaGeneral  && this.isPermisoActualizarVentaGeneral));	
			this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaEliminarVentaGeneral && this.isPermisoEliminarVentaGeneral));
			this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarToolBarVentaGeneral.setVisible(this.isVisibilidadCeldaCancelarVentaGeneral);				
			this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaGuardarVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentaGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentaGeneral.setVisible((this.isVisibilidadCeldaNuevoVentaGeneral && this.isPermisoNuevoVentaGeneral));			
			this.jMenuItemDuplicarVentaGeneral.setVisible((this.isVisibilidadCeldaDuplicarVentaGeneral && this.isPermisoDuplicarVentaGeneral));			
			this.jMenuItemCopiarVentaGeneral.setVisible((this.isVisibilidadCeldaCopiarVentaGeneral && this.isPermisoCopiarVentaGeneral));			
			this.jMenuItemVerFormVentaGeneral.setVisible((this.isVisibilidadCeldaVerFormVentaGeneral && this.isPermisoVerFormVentaGeneral));			
			this.jMenuItemAbrirOrderByVentaGeneral.setVisible((this.isVisibilidadCeldaOrdenVentaGeneral && this.isPermisoOrdenVentaGeneral));			
			//this.jMenuItemMostrarOcultarVentaGeneral.setVisible((this.isVisibilidadCeldaOrdenVentaGeneral && this.isPermisoOrdenVentaGeneral));
			this.jMenuItemDetalleAbrirOrderByVentaGeneral.setVisible((this.isVisibilidadCeldaOrdenVentaGeneral && this.isPermisoOrdenVentaGeneral));			
			//this.jMenuItemDetalleMostrarOcultarVentaGeneral.setVisible((this.isVisibilidadCeldaOrdenVentaGeneral && this.isPermisoOrdenVentaGeneral));			
			this.jMenuItemNuevoRelacionesVentaGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentaGeneral && this.isPermisoNuevoVentaGeneral));			
			this.jMenuItemNuevoGuardarCambiosVentaGeneral.setVisible((this.isVisibilidadCeldaNuevoVentaGeneral && this.isPermisoNuevoVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));									
			
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			this.jInternalFrameDetalleFormVentaGeneral.jMenuItemModificarVentaGeneral.setVisible((this.isVisibilidadCeldaModificarVentaGeneral && this.isPermisoActualizarVentaGeneral));	
			this.jInternalFrameDetalleFormVentaGeneral.jMenuItemActualizarVentaGeneral.setVisible((this.isVisibilidadCeldaActualizarVentaGeneral && this.isPermisoActualizarVentaGeneral));	
			this.jInternalFrameDetalleFormVentaGeneral.jMenuItemEliminarVentaGeneral.setVisible((this.isVisibilidadCeldaEliminarVentaGeneral && this.isPermisoEliminarVentaGeneral));
			this.jInternalFrameDetalleFormVentaGeneral.jMenuItemCancelarVentaGeneral.setVisible(this.isVisibilidadCeldaCancelarVentaGeneral);				
			}
			
			this.jMenuItemGuardarCambiosVentaGeneral.setVisible((this.isVisibilidadCeldaGuardarVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));						
			this.jMenuItemGuardarCambiosTablaVentaGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentaGeneral=this.jButtonNuevoVentaGeneral.isVisible();
			this.isVisibilidadCeldaDuplicarVentaGeneral=this.jButtonDuplicarVentaGeneral.isVisible();
			this.isVisibilidadCeldaCopiarVentaGeneral=this.jButtonCopiarVentaGeneral.isVisible();
			this.isVisibilidadCeldaVerFormVentaGeneral=this.jButtonVerFormVentaGeneral.isVisible();
			
			this.isVisibilidadCeldaOrdenVentaGeneral=this.jButtonAbrirOrderByVentaGeneral.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=this.jButtonNuevoRelacionesVentaGeneral.isVisible();
			this.isVisibilidadCeldaModificarVentaGeneral=this.jButtonModificarVentaGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			this.isVisibilidadCeldaActualizarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarVentaGeneral.isVisible();
			this.isVisibilidadCeldaEliminarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarVentaGeneral.isVisible();
			this.isVisibilidadCeldaCancelarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarVentaGeneral.isVisible();
			this.isVisibilidadCeldaGuardarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosVentaGeneral.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=this.jButtonGuardarCambiosTablaVentaGeneral.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentaGeneral=this.jButtonNuevoToolBarVentaGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=this.jButtonNuevoRelacionesToolBarVentaGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			this.isVisibilidadCeldaModificarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jButtonModificarToolBarVentaGeneral.isVisible();
			this.isVisibilidadCeldaActualizarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarToolBarVentaGeneral.isVisible();
			this.isVisibilidadCeldaEliminarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarToolBarVentaGeneral.isVisible();
			this.isVisibilidadCeldaCancelarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarToolBarVentaGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentaGeneral=this.jButtonGuardarCambiosToolBarVentaGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=this.jButtonGuardarCambiosTablaToolBarVentaGeneral.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentaGeneral=this.jMenuItemNuevoVentaGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=this.jMenuItemNuevoRelacionesVentaGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			this.isVisibilidadCeldaModificarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jMenuItemModificarVentaGeneral.isVisible();
			this.isVisibilidadCeldaActualizarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jMenuItemActualizarVentaGeneral.isVisible();
			this.isVisibilidadCeldaEliminarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jMenuItemEliminarVentaGeneral.isVisible();
			this.isVisibilidadCeldaCancelarVentaGeneral=this.jInternalFrameDetalleFormVentaGeneral.jMenuItemCancelarVentaGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentaGeneral=this.jMenuItemGuardarCambiosVentaGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=this.jMenuItemGuardarCambiosTablaVentaGeneral.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentaGeneral(Boolean esInicializar) {
		if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventageneralSessionBean.getConGuardarRelaciones()) {
				//if(this.ventageneralSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentaGeneral();
			}
			
			this.inicializarActualizarBindingBotonesManualVentaGeneral(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentaGeneral() {
		this.jButtonNuevoVentaGeneral.setVisible(this.isPermisoNuevoVentaGeneral);			
		this.jButtonDuplicarVentaGeneral.setVisible(this.isPermisoDuplicarVentaGeneral);			
		this.jButtonCopiarVentaGeneral.setVisible(this.isPermisoCopiarVentaGeneral);			
		this.jButtonVerFormVentaGeneral.setVisible(this.isPermisoVerFormVentaGeneral);			
		
		this.jButtonAbrirOrderByVentaGeneral.setVisible(this.isPermisoOrdenVentaGeneral);					
		
		this.jButtonNuevoRelacionesVentaGeneral.setVisible(this.isPermisoNuevoVentaGeneral);			
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonModificarVentaGeneral.setVisible(this.isPermisoActualizarVentaGeneral);	
			this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarVentaGeneral.setVisible(this.isPermisoActualizarVentaGeneral);	
			this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarVentaGeneral.setVisible(this.isPermisoEliminarVentaGeneral);
			this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarVentaGeneral.setVisible(this.isVisibilidadCeldaCancelarVentaGeneral);						
			this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosVentaGeneral.setVisible(this.isPermisoGuardarCambiosVentaGeneral);							
		}
		
		this.jButtonGuardarCambiosTablaVentaGeneral.setVisible(this.isPermisoActualizarVentaGeneral);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentaGeneral() {
		this.jInternalFrameDetalleFormVentaGeneral.jButtonModificarVentaGeneral.setVisible(this.isPermisoActualizarVentaGeneral);	
		this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarVentaGeneral.setVisible(this.isPermisoActualizarVentaGeneral);	
		this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarVentaGeneral.setVisible(this.isPermisoEliminarVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarVentaGeneral.setVisible(this.isVisibilidadCeldaCancelarVentaGeneral);							
		this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosVentaGeneral.setVisible((this.isVisibilidadCeldaGuardarVentaGeneral && this.isPermisoGuardarCambiosVentaGeneral));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentaGeneral() {
		if(VentaGeneralJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentaGeneral();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentaGeneral() {
	}
	
	public void jTableDatosVentaGeneralListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentaGeneral(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventageneral.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentaGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentaGeneral(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventageneralLogic.getConnexion());

				if(this.ventageneral.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventageneral.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaGeneral=(TitledBorder)this.jScrollPanelDatosVentaGeneral.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentaGeneral.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventageneral.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalVentaGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebVentaGeneral(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ventageneralLogic.getConnexion());

				if(this.ventageneral.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ventageneral.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaGeneral=(TitledBorder)this.jScrollPanelDatosVentaGeneral.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderVentaGeneral.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ventageneral.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteVentaGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebVentaGeneral(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.ventageneralLogic.getConnexion());

				if(this.ventageneral.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.ventageneral.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaGeneral=(TitledBorder)this.jScrollPanelDatosVentaGeneral.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderVentaGeneral.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.ventageneral.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoVentaGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebVentaGeneral(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.ventageneralLogic.getConnexion());

				if(this.ventageneral.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.ventageneral.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaGeneral=(TitledBorder)this.jScrollPanelDatosVentaGeneral.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderVentaGeneral.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.ventageneral.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.ventageneral.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.ventageneral.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.ventageneral.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.ventageneral.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.ventageneral.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.ventageneral.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.ventageneral.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.ventageneral.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.ventageneral.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.ventageneral.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceVentaGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.getventageneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventageneral==null) {
						this.ventageneral = new VentaGeneral();
					}

					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);
				}

				if(this.ventageneral.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.ventageneral.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentaGeneralVentaGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaGeneral(false,false);

			this.getVentaGeneralsBusquedaVentaGeneral();

			this.inicializarActualizarBindingVentaGeneral(false);

			//if(VentaGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteVentaGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaGeneral(false,false);

			this.getVentaGeneralsFK_IdCliente();

			this.inicializarActualizarBindingVentaGeneral(false);

			//if(VentaGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentaGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaGeneral(false,false);

			this.getVentaGeneralsFK_IdEmpresa();

			this.inicializarActualizarBindingVentaGeneral(false);

			//if(VentaGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoVentaGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaGeneral(false,false);

			this.getVentaGeneralsFK_IdProducto();

			this.inicializarActualizarBindingVentaGeneral(false);

			//if(VentaGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalVentaGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaGeneral(false,false);

			this.getVentaGeneralsFK_IdSucursal();

			this.inicializarActualizarBindingVentaGeneral(false);

			//if(VentaGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventageneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentaGeneral() {
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
			this.jInternalFrameDetalleFormVentaGeneral.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentaGeneral.dispose();
			this.jInternalFrameDetalleFormVentaGeneral=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentaGeneral!=null) {
			this.jInternalFrameReporteDinamicoVentaGeneral.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentaGeneral.dispose();
			this.jInternalFrameReporteDinamicoVentaGeneral=null;
		}
		
		if(this.jInternalFrameImportacionVentaGeneral!=null) {
			this.jInternalFrameImportacionVentaGeneral.setVisible(false);	    			
			this.jInternalFrameImportacionVentaGeneral.dispose();
			this.jInternalFrameImportacionVentaGeneral=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentaGeneral();
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentaGeneral")) {
				jButtonNuevoVentaGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentaGeneral")) {
				jButtonDuplicarVentaGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentaGeneral")) {
				jButtonCopiarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentaGeneral")) {
				jButtonVerFormVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentaGeneral")) {
				jButtonNuevoVentaGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentaGeneral")) {
				jButtonDuplicarVentaGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentaGeneral")) {
				jButtonNuevoVentaGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentaGeneral")) {
				jButtonDuplicarVentaGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentaGeneral")) {
				jButtonNuevoVentaGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentaGeneral")) {
				jButtonNuevoVentaGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentaGeneral")) {
				jButtonNuevoVentaGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentaGeneral")) {
				jButtonModificarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentaGeneral")) {
				jButtonModificarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentaGeneral")) {
				jButtonModificarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentaGeneral")) {
				jButtonActualizarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentaGeneral")) {
				jButtonActualizarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentaGeneral")) {
				jButtonActualizarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentaGeneral")) {
				jButtonEliminarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentaGeneral")) {
				jButtonEliminarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentaGeneral")) {
				jButtonEliminarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentaGeneral")) {
				jButtonCancelarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentaGeneral")) {
				jButtonCancelarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentaGeneral")) {
				jButtonCancelarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentaGeneral")) {
				jButtonCerrarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentaGeneral")) {
				jButtonCerrarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentaGeneral")) {
				jButtonCerrarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentaGeneral")) {
				jButtonMostrarOcultarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentaGeneral")) {
				jButtonCancelarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentaGeneral")) {
				jButtonGuardarCambiosVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentaGeneral")) {
				jButtonGuardarCambiosVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentaGeneral")) {
				jButtonCopiarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentaGeneral")) {
				jButtonVerFormVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentaGeneral")) {
				jButtonGuardarCambiosVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentaGeneral")) {
				jButtonCopiarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentaGeneral")) {
				jButtonVerFormVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentaGeneral")) {
				jButtonGuardarCambiosVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentaGeneral")) {
				jButtonGuardarCambiosVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentaGeneral")) {
				jButtonGuardarCambiosVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentaGeneral")) {
				jButtonRecargarInformacionVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentaGeneral")) {
				jButtonRecargarInformacionVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentaGeneral")) {
				jButtonRecargarInformacionVentaGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentaGeneral")) {
				jButtonAnterioresVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentaGeneral")) {
				jButtonAnterioresVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentaGeneral")) {
				jButtonAnterioresVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentaGeneral")) {
				jButtonSiguientesVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentaGeneral")) {
				jButtonSiguientesVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentaGeneral")) {
				jButtonSiguientesVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentaGeneral") || sTipo.equals("MenuItemDetalleAbrirOrderByVentaGeneral")) {
				jButtonAbrirOrderByVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentaGeneral") || sTipo.equals("MenuItemDetalleMostrarOcultarVentaGeneral")) {
				jButtonMostrarOcultarVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentaGeneral")) {
				jButtonNuevoGuardarCambiosVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentaGeneral")) {
				jButtonNuevoGuardarCambiosVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentaGeneral")) {
				jButtonNuevoGuardarCambiosVentaGeneralActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentaGeneral")) {
				jButtonCerrarReporteDinamicoVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentaGeneral")) {
				jButtonGenerarReporteDinamicoVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentaGeneral")) {
				
				jButtonGenerarExcelReporteDinamicoVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentaGeneral")) {
				jButtonCerrarImportacionVentaGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentaGeneral")) {
				
				jButtonGenerarImportacionVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentaGeneral")) {
				
				jButtonAbrirImportacionVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentaGeneral")) {
				jComboBoxTiposAccionesVentaGeneralActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentaGeneral")) {
				jComboBoxTiposRelacionesVentaGeneralActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentaGeneral")) {
				jComboBoxTiposAccionesVentaGeneralActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentaGeneral")) {
				
				jComboBoxTiposSeleccionarVentaGeneralActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentaGeneral")) {
				jTextFieldValorCampoGeneralVentaGeneralActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentaGeneral")) {
				jButtonAbrirOrderByVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentaGeneral")) {
				jButtonAbrirOrderByVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentaGeneral")) {
				jButtonCerrarOrderByVentaGeneralActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentaGeneralBusqueda")) {
				this.jButtonidVentaGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentaGeneralUpdate")) {
				this.jButtonid_empresaVentaGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentaGeneralBusqueda")) {
				this.jButtonid_empresaVentaGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentaGeneralUpdate")) {
				this.jButtonid_sucursalVentaGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentaGeneralBusqueda")) {
				this.jButtonid_sucursalVentaGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteVentaGeneralUpdate")) {
				this.jButtonid_clienteVentaGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteVentaGeneralBusqueda")) {
				this.jButtonid_clienteVentaGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoVentaGeneralUpdate")) {
				this.jButtonid_productoVentaGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoVentaGeneralBusqueda")) {
				this.jButtonid_productoVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeVentaGeneralBusqueda")) {
				this.jButtonfecha_desdeVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaVentaGeneralBusqueda")) {
				this.jButtonfecha_hastaVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoVentaGeneralBusqueda")) {
				this.jButtonnombre_productoVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteVentaGeneralBusqueda")) {
				this.jButtonnombre_clienteVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaVentaGeneralBusqueda")) {
				this.jButtonfechaVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialVentaGeneralBusqueda")) {
				this.jButtonsecuencialVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadVentaGeneralBusqueda")) {
				this.jButtoncantidadVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioVentaGeneralBusqueda")) {
				this.jButtonprecioVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoVentaGeneralBusqueda")) {
				this.jButtondescuentoVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaVentaGeneralBusqueda")) {
				this.jButtonivaVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceVentaGeneralBusqueda")) {
				this.jButtoniceVentaGeneralBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentaGeneralVentaGeneral")) {
				this.jButtonBusquedaVentaGeneralVentaGeneralActionPerformed(evt);
			}
			
			;
			
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentaGeneral();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				


				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentaGeneral ventageneralLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventageneralLocal=this.ventageneral;
			} else {
				ventageneralLocal=this.ventageneralAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
							
				
				


				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralAnterior =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventageneralAnterior =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
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
			
			


			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
								
						
				


				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
								
				
				


				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralAnterior =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventageneralAnterior =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralAnterior =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventageneralAnterior =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
							
				
				


				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneralAnterior =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventageneralAnterior =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
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
			
			


			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaGeneralActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
								
				
				


				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralAnterior =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventageneralAnterior =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentaGeneral")) {
					jCheckBoxSeleccionarTodosVentaGeneralItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentaGeneral")) {
					jCheckBoxSeleccionadosVentaGeneralItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentaGeneral")) {
					
				}
				
				


				
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
												
				
				


				
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventageneralAnterior =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventageneralAnterior =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaGeneralActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
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
			
			


			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventageneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventageneral);
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
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
				
				


				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaGeneral.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventageneralAnterior =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventageneralAnterior =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentaGeneral")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentaGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentaGeneral.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventageneral =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventageneral =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventageneral);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentaGeneral")) {
				
				}
				
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentaGeneral")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentaGeneral.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentaGeneral")) {
			
			}
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentaGeneral();
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
			if(sTipo.equals("NuevoVentaGeneral")) {
				jButtonNuevoVentaGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentaGeneral")) {
				jButtonDuplicarVentaGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentaGeneral")) {
				jButtonCopiarVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentaGeneral")) {
				jButtonVerFormVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentaGeneral")) {
				jButtonNuevoVentaGeneralActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentaGeneral")) {
				jButtonModificarVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentaGeneral")) {
				jButtonActualizarVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentaGeneral")) {
				jButtonEliminarVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentaGeneral")) {
				jButtonGuardarCambiosVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentaGeneral")) {
				jButtonCancelarVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentaGeneral")) {
				jButtonCerrarVentaGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentaGeneral")) {
				jButtonGuardarCambiosVentaGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentaGeneral")) {
				jButtonNuevoGuardarCambiosVentaGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentaGeneral")) {
				jButtonAbrirOrderByVentaGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentaGeneral")) {
				jButtonRecargarInformacionVentaGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentaGeneral")) {
				jButtonAnterioresVentaGeneralActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentaGeneral")) {
				jButtonSiguientesVentaGeneralActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentaGeneralBusqueda")) {
				this.jButtonidVentaGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentaGeneralUpdate")) {
				this.jButtonid_empresaVentaGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentaGeneralBusqueda")) {
				this.jButtonid_empresaVentaGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentaGeneralUpdate")) {
				this.jButtonid_sucursalVentaGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentaGeneralBusqueda")) {
				this.jButtonid_sucursalVentaGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteVentaGeneralUpdate")) {
				this.jButtonid_clienteVentaGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteVentaGeneralBusqueda")) {
				this.jButtonid_clienteVentaGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoVentaGeneralUpdate")) {
				this.jButtonid_productoVentaGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoVentaGeneralBusqueda")) {
				this.jButtonid_productoVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeVentaGeneralBusqueda")) {
				this.jButtonfecha_desdeVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaVentaGeneralBusqueda")) {
				this.jButtonfecha_hastaVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoVentaGeneralBusqueda")) {
				this.jButtonnombre_productoVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteVentaGeneralBusqueda")) {
				this.jButtonnombre_clienteVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaVentaGeneralBusqueda")) {
				this.jButtonfechaVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialVentaGeneralBusqueda")) {
				this.jButtonsecuencialVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadVentaGeneralBusqueda")) {
				this.jButtoncantidadVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioVentaGeneralBusqueda")) {
				this.jButtonprecioVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoVentaGeneralBusqueda")) {
				this.jButtondescuentoVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaVentaGeneralBusqueda")) {
				this.jButtonivaVentaGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceVentaGeneralBusqueda")) {
				this.jButtoniceVentaGeneralBusquedaActionPerformed(evt);
			}
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentaGeneral();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentaGeneral")) {
				closingInternalFrameVentaGeneral();
				
			} else if(sTipo.equals("jButtonCancelarVentaGeneral")) {
				JInternalFrameBase jInternalFrameDetalleFormVentaGeneral = (JInternalFrameBase)evt.getSource();
	            	
	            VentaGeneralBeanSwingJInternalFrame jInternalFrameParent=(VentaGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormVentaGeneral.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentaGeneralActionPerformed(null);
			}
			
			VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventageneral,new Object(),this.ventageneralParameterGeneral,this.ventageneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentaGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentaGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentaGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventageneral)) {
			if(!esControlTabla) {
				if(VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);			
				}
				
				if(this.ventageneralSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentaGeneral(this.ventageneral,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentaGeneral(this.ventageneralReturnGeneral,this.ventageneralBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventageneralSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentaGeneral(classes,this.ventageneralReturnGeneral,this.ventageneralBean,false);
					}
						
					if(this.ventageneralReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentaGeneral(this.ventageneralReturnGeneral.getVentaGeneral());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentaGeneral(this.ventageneralReturnGeneral.getVentaGeneral());	
					}
						
					if(this.ventageneralReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentaGeneral(this.ventageneralReturnGeneral.getVentaGeneral(),classes);//this.ventageneralBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentaGeneral(this.ventageneral,classes);//this.ventageneralBean);									
				}
			
				if(VentaGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentaGeneral(this.ventageneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaGeneral(this.ventageneral);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventageneralAnterior!=null) {
						this.ventageneral=this.ventageneralAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventageneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventageneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventageneralReturnGeneral.getVentaGeneral(),ventageneralLogic.getVentaGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventageneralReturnGeneral.getVentaGeneral(),this.ventagenerals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentaGeneral.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentaGeneral.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentaGeneral();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentaGeneral() throws Exception {
		
		VentaGeneralModel ventageneralModel=(VentaGeneralModel)this.jTableDatosVentaGeneral.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventageneralModel.ventagenerals=this.ventageneralLogic.getVentaGenerals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventageneralModel.ventagenerals=this.ventagenerals;
		}
		
		
		((VentaGeneralModel) this.jTableDatosVentaGeneral.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentaGeneral() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventageneralAnterior(),this.ventageneralLogic.getVentaGenerals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventageneralAnterior(),this.ventagenerals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentaGeneral();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentaGeneral(VentaGeneral ventageneral,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
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
										
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventageneral,new Object(),generalEntityParameterGeneral,this.ventageneralReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventageneralSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentaGeneralConstantesFunciones.getClassesRelationshipsOfVentaGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentaGeneralConstantesFunciones.getClassesRelationshipsFromStringsOfVentaGeneral(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentaGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentaGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventageneral,new Object(),generalEntityParameterGeneral,this.ventageneralReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentaGeneral(VentaGeneralBean ventageneralBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentaGeneral(ArrayList<Classe> classes,VentaGeneralReturnGeneral ventageneralReturnGeneral,VentaGeneralBean ventageneralBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentaGeneral(VentaGeneral ventageneral,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventageneral)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentaGeneral = new VentaGeneralDetalleFormJInternalFrame(jDesktopPane,this.ventageneralSessionBean.getConGuardarRelaciones(),this.ventageneralSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.setVisible(false);
		this.jInternalFrameDetalleFormVentaGeneral.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentaGeneral.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentaGeneral.ventageneralLogic=this.ventageneralLogic;
		
		this.cargarCombosFrameForeignKeyVentaGeneral("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentaGeneral();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentaGeneral();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentaGeneral("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentaGeneral();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentaGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentaGeneral"));
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonModificarVentaGeneral.addActionListener(new ButtonActionListener(this,"ModificarVentaGeneral"));

		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonModificarToolBarVentaGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentaGeneral"));
					
		this.jInternalFrameDetalleFormVentaGeneral.jMenuItemModificarVentaGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentaGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarVentaGeneral.addActionListener (new ButtonActionListener(this,"ActualizarVentaGeneral"));
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarToolBarVentaGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentaGeneral"));
						
		this.jInternalFrameDetalleFormVentaGeneral.jMenuItemActualizarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentaGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarVentaGeneral.addActionListener (new ButtonActionListener(this,"EliminarVentaGeneral"));
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentaGeneral"));
								
		this.jInternalFrameDetalleFormVentaGeneral.jMenuItemEliminarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentaGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarVentaGeneral.addActionListener (new ButtonActionListener(this,"CancelarVentaGeneral"));
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentaGeneral"));
					
		this.jInternalFrameDetalleFormVentaGeneral.jMenuItemCancelarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentaGeneral"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jMenuItemDetalleCerrarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentaGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentaGeneral"));
		
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentaGeneral"));
		
		
		
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentaGeneral"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonidVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_empresaVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_empresaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_sucursalVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_sucursalVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_clienteVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_clienteVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_clienteVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_productoVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_productoVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_productoVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_productoVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonfecha_desdeVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonfecha_hastaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonnombre_productoVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonnombre_clienteVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonfechaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fechaVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonsecuencialVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"secuencialVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtoncantidadVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"cantidadVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonprecioVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"precioVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtondescuentoVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"descuentoVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonivaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtoniceVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"iceVentaGeneralBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentaGeneral.jTabbedPaneRelacionesVentaGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentaGeneral"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentaGeneral"));
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentaGeneral"));
		}
		
		this.jTableDatosVentaGeneral.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentaGeneral"));
		
		this.jTableDatosVentaGeneral.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentaGeneral"));
		
		this.jButtonNuevoVentaGeneral.addActionListener(new ButtonActionListener(this,"NuevoVentaGeneral"));
		
		this.jButtonDuplicarVentaGeneral.addActionListener(new ButtonActionListener(this,"DuplicarVentaGeneral"));
		
		this.jButtonCopiarVentaGeneral.addActionListener(new ButtonActionListener(this,"CopiarVentaGeneral"));
		
		this.jButtonVerFormVentaGeneral.addActionListener(new ButtonActionListener(this,"VerFormVentaGeneral"));
		
		
		this.jButtonNuevoToolBarVentaGeneral.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentaGeneral"));
			
		this.jButtonDuplicarToolBarVentaGeneral.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentaGeneral"));
			
		this.jMenuItemNuevoVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentaGeneral"));
			
		this.jMenuItemDuplicarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentaGeneral"));		
		
		
		this.jButtonNuevoRelacionesVentaGeneral.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentaGeneral"));
		
		
		this.jButtonNuevoRelacionesToolBarVentaGeneral.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentaGeneral"));
			
		this.jMenuItemNuevoRelacionesVentaGeneral.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentaGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonModificarVentaGeneral.addActionListener(new ButtonActionListener(this,"ModificarVentaGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonModificarToolBarVentaGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentaGeneral"));
			
			this.jInternalFrameDetalleFormVentaGeneral.jMenuItemModificarVentaGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentaGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarVentaGeneral.addActionListener (new ButtonActionListener(this,"ActualizarVentaGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonActualizarToolBarVentaGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentaGeneral"));
				
			this.jInternalFrameDetalleFormVentaGeneral.jMenuItemActualizarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentaGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarVentaGeneral.addActionListener (new ButtonActionListener(this,"EliminarVentaGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonEliminarToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentaGeneral"));
						
			this.jInternalFrameDetalleFormVentaGeneral.jMenuItemEliminarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentaGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarVentaGeneral.addActionListener (new ButtonActionListener(this,"CancelarVentaGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonCancelarToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentaGeneral"));
			
			this.jInternalFrameDetalleFormVentaGeneral.jMenuItemCancelarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentaGeneral"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentaGeneral"));		
		
		
		this.jButtonCerrarVentaGeneral.addActionListener (new ButtonActionListener(this,"CerrarVentaGeneral"));
		
		
		this.jButtonCerrarToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentaGeneral"));
			
		this.jMenuItemCerrarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentaGeneral"));
			
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jMenuItemDetalleCerrarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentaGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosVentaGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentaGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentaGeneral"));
		}
		
		this.jButtonCopiarToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentaGeneral"));
			
		this.jButtonVerFormToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentaGeneral"));
		
		this.jMenuItemGuardarCambiosVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentaGeneral"));
			
		this.jMenuItemCopiarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentaGeneral"));		
		
		this.jMenuItemVerFormVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentaGeneral"));		
		
		
		this.jButtonGuardarCambiosTablaVentaGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentaGeneral"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentaGeneral"));
			
		this.jMenuItemGuardarCambiosTablaVentaGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentaGeneral"));		
		
		
		
		this.jButtonRecargarInformacionVentaGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentaGeneral"));
					
		this.jButtonRecargarInformacionToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentaGeneral"));
		
		this.jMenuItemRecargarInformacionVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentaGeneral"));		
		
		
		
		this.jButtonAnterioresVentaGeneral.addActionListener (new ButtonActionListener(this,"AnterioresVentaGeneral"));
		
		
		this.jButtonAnterioresToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentaGeneral"));
		
		this.jMenuItemAnterioresVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentaGeneral"));		
		
		
		this.jButtonSiguientesVentaGeneral.addActionListener (new ButtonActionListener(this,"SiguientesVentaGeneral"));
		
		
		this.jButtonSiguientesToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentaGeneral"));
			
		this.jMenuItemSiguientesVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentaGeneral"));
			
		this.jMenuItemAbrirOrderByVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentaGeneral"));
			
		this.jMenuItemMostrarOcultarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentaGeneral"));
			
		this.jMenuItemDetalleAbrirOrderByVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentaGeneral"));
			
		this.jMenuItemDetalleMostarOcultarVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentaGeneral"));		
		
		
		this.jButtonNuevoGuardarCambiosVentaGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentaGeneral"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentaGeneral"));
			
		this.jMenuItemNuevoGuardarCambiosVentaGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentaGeneral"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentaGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentaGeneral"));

		this.jCheckBoxSeleccionadosVentaGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentaGeneral"));
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentaGeneral"));
		}
		
		
		this.jComboBoxTiposRelacionesVentaGeneral.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentaGeneral"));
			
		this.jComboBoxTiposAccionesVentaGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesVentaGeneral"));
					
		this.jComboBoxTiposSeleccionarVentaGeneral.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentaGeneral"));
			
		this.jTextFieldValorCampoGeneralVentaGeneral.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentaGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonidVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_empresaVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_empresaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_sucursalVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_sucursalVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_clienteVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_clienteVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_clienteVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_productoVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_productoVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_productoVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_productoVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonfecha_desdeVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonfecha_hastaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonnombre_productoVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonnombre_clienteVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonfechaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fechaVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonsecuencialVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"secuencialVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtoncantidadVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"cantidadVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonprecioVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"precioVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtondescuentoVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"descuentoVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonivaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtoniceVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"iceVentaGeneralBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentaGeneralVentaGeneral.addActionListener(new ButtonActionListener(this,"BusquedaVentaGeneralVentaGeneral"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentaGeneral!=null) {
				this.jInternalFrameReporteDinamicoVentaGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentaGeneral"));
				this.jInternalFrameReporteDinamicoVentaGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentaGeneral"));
				this.jInternalFrameReporteDinamicoVentaGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentaGeneral"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentaGeneral.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentaGeneral"));				
			//this.jButtonGenerarReporteDinamicoVentaGeneral.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentaGeneral"));
			//this.jButtonGenerarExcelReporteDinamicoVentaGeneral.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentaGeneral"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentaGeneral!=null) {
				this.jInternalFrameImportacionVentaGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentaGeneral"));
				this.jInternalFrameImportacionVentaGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentaGeneral"));
				this.jInternalFrameImportacionVentaGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentaGeneral"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentaGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentaGeneral"));
			
			this.jButtonAbrirOrderByToolBarVentaGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentaGeneral"));			
			
			if(this.jInternalFrameOrderByVentaGeneral!=null) {
				this.jInternalFrameOrderByVentaGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentaGeneral"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaGeneral.jTabbedPaneRelacionesVentaGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentaGeneral"));
		
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
            		closingInternalFrameVentaGeneral();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentaGeneral.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentaGeneral = (JInternalFrameBase)event.getSource();
	            	
	            VentaGeneralBeanSwingJInternalFrame jInternalFrameParent=(VentaGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormVentaGeneral.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentaGeneralActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentaGeneral.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentaGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentaGeneral.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentaGeneral.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentaGeneral";
		inputMap = this.jButtonNuevoVentaGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentaGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentaGeneralActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentaGeneral";
		inputMap = this.jButtonNuevoRelacionesVentaGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentaGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentaGeneralActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentaGeneral";
		inputMap = this.jButtonModificarVentaGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentaGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentaGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentaGeneral";
		inputMap = this.jButtonActualizarVentaGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentaGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentaGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentaGeneral";
		inputMap = this.jButtonEliminarVentaGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentaGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentaGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentaGeneral";
		inputMap = this.jButtonCancelarVentaGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentaGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentaGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentaGeneral";
		inputMap = this.jButtonCerrarVentaGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentaGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentaGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentaGeneral";
		inputMap = this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosVentaGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentaGeneral.jButtonGuardarCambiosVentaGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentaGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentaGeneral.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentaGeneralItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentaGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentaGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentaGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentaGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentaGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentaGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonidVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_empresaVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_empresaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_sucursalVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_sucursalVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_clienteVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_clienteVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_clienteVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteVentaGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_productoVentaGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_productoVentaGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonid_productoVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_productoVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonfecha_desdeVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonfecha_hastaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonnombre_productoVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonnombre_clienteVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonfechaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fechaVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonsecuencialVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"secuencialVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtoncantidadVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"cantidadVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonprecioVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"precioVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtondescuentoVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"descuentoVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtonivaVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentaGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaGeneral.jButtoniceVentaGeneralBusqueda.addActionListener(new ButtonActionListener(this,"iceVentaGeneralBusqueda"));
		
		
		this.jButtonBusquedaVentaGeneralVentaGeneral.addActionListener(new ButtonActionListener(this,"BusquedaVentaGeneralVentaGeneral"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentaGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentaGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentaGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentaGeneral.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentaGeneral(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentaGeneral ventageneralAux:this.ventageneralLogic.getVentaGenerals()) {
					ventageneralAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentaGeneral ventageneralAux:ventagenerals) {
					ventageneralAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentaGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentaGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentaGeneral ventageneralAux:this.ventageneralLogic.getVentaGenerals()) {
						ventageneralAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentaGeneral ventageneralAux:ventagenerals) {
						ventageneralAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentaGeneral ventageneralAux:this.ventageneralLogic.getVentaGenerals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentaGeneral ventageneralAux:ventagenerals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentaGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentaGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentaGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentaGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentaGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentaGeneral.getSelectedRows();
			
			VentaGeneral ventageneralLocal=new VentaGeneral();
			
			//this.seleccionarTodosVentaGeneral(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventageneralLocal =(VentaGeneral) this.ventageneralLogic.getVentaGenerals().toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventageneralLocal =(VentaGeneral) this.ventagenerals.toArray()[this.jTableDatosVentaGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventageneralLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentaGeneral ventageneralAux:this.ventageneralLogic.getVentaGenerals()) {
						ventageneralAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentaGeneral ventageneralAux:ventagenerals) {
						ventageneralAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentaGeneral(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentaGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentaGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentaGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentaGeneralItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentaGeneralParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentaGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentaGeneral(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentaGeneral.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentaGeneral ventageneralAux:this.ventageneralLogic.getVentaGenerals()) {
				
						if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							ventageneralAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							ventageneralAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							ventageneralAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							ventageneralAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							ventageneralAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							ventageneralAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							ventageneralAux.setcantidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							ventageneralAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							ventageneralAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_IVA)) {
							existe=true;
							ventageneralAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_ICE)) {
							existe=true;
							ventageneralAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentaGeneral ventageneralAux:ventagenerals) {
					
						if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							ventageneralAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							ventageneralAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							ventageneralAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							ventageneralAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							ventageneralAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							ventageneralAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							ventageneralAux.setcantidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							ventageneralAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							ventageneralAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_IVA)) {
							existe=true;
							ventageneralAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_ICE)) {
							existe=true;
							ventageneralAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentaGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentaGeneralActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentaGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentaGeneral=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentaGeneral.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentaGeneral) {				
					conSplash=true;//false;										
					
					//this.startProcessVentaGeneral(conSplash);
				
					this.generarReporteVentaGeneralsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentaGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentaGeneralsSeleccionados(false);
				//this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentaGeneralsSeleccionados(true);
				//this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentaGeneral();
				
				this.exportarVentaGeneralsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentaGenerals();
				//this.importarVentaGenerals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentaGeneral();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentaGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Venta General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentaGeneral();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentaGeneral)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentaGeneral(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Venta General",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.setSelectedIndex(0);					
				}	
			} 			
			else if(VentaGeneralBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentaGeneral) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentaGeneral(conSplash);
					
						//this.actualizarParametrosGeneralVentaGeneral();
						
						this.generarReporteProcesoAccionVentaGeneralsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentaGeneralBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Venta GeneralES SELECCIONADOS?", "MANTENIMIENTO DE Venta General", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentaGeneral();
				
						this.actualizarParametrosGeneralVentaGeneral();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventageneralReturnGeneral=ventageneralLogic.procesarAccionVentaGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventageneralLogic.getVentaGenerals(),this.ventageneralParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentaGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentaGeneral();
					
					VentaGeneralBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentaGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentaGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentaGeneral.jComboBoxTiposAccionesFormularioVentaGeneral.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentaGeneral(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentaGeneralActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentaGeneral();
			
			if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();		
			VentaGeneral ventageneral=new VentaGeneral();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentaGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentaGeneral.getSelectedItem();
			
			
			
			
			ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventageneralsSeleccionados.size()==1) {
				for(VentaGeneral ventageneralAux:ventageneralsSeleccionados) {
					ventageneral=ventageneralAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentaGeneral();
			
      		//this.finishProcessVentaGeneral(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentaGeneralReturnGeneral() throws Exception {
		if(this.ventageneralReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventageneralReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventageneralReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventageneralReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventageneralReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventageneralReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentaGeneral(false);
		}
		
		if(this.ventageneralReturnGeneral.getConRetornoLista() || this.ventageneralReturnGeneral.getConRetornoObjeto()) {
			if(this.ventageneralReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventageneralLogic.setVentaGenerals(this.ventageneralReturnGeneral.getVentaGenerals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentaGeneral(false);
		}
	}
	
	public void actualizarParametrosGeneralVentaGeneral() throws Exception {
		
		
	}
	
	public ArrayList<VentaGeneral> getVentaGeneralsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentaGeneral) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentaGeneral ventageneralAux:ventageneralLogic.getVentaGenerals()) {
					if(ventageneralAux.getIsSelected()) {
						ventageneralsSeleccionados.add(ventageneralAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentaGeneral ventageneralAux:this.ventagenerals) {
					if(ventageneralAux.getIsSelected()) {
						ventageneralsSeleccionados.add(ventageneralAux);				
					}
				}
			}
			
			if(ventageneralsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventageneralsSeleccionados.addAll(this.ventageneralLogic.getVentaGenerals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventageneralsSeleccionados.addAll(this.ventagenerals);				
					}
				}
			}
		} else {
			ventageneralsSeleccionados.add(this.ventageneral);
		}
		
		return ventageneralsSeleccionados;
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
	
	public void generarReporteVentaGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentaGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentaGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentaGeneralsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentaGeneralsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Venta General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentaGeneralsSeleccionados() throws Exception {
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();		
		
		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentaGenerals("Todos",ventageneralsSeleccionados);
		
	}	
	
	public void generarReporteNormalVentaGeneralsSeleccionados() throws Exception {
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();		
		
		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentaGenerals("Todos",ventageneralsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentaGeneralsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();
		
		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentaGenerals("Todos",ventageneralsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentaGeneralsSeleccionados() throws Exception {
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentaGeneral();
		
		
		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentaGeneral();
		
		
		//this.generarReporteVentaGenerals("Todos",ventageneralsSeleccionados ,ventageneralImplementable,ventageneralImplementableHome);
	}
	
	public void mostrarImportacionVentaGenerals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentaGeneral();
		
		this.abrirFrameImportacionVentaGeneral();		
		
			
		//this.generarReporteVentaGenerals("Todos",ventageneralsSeleccionados ,ventageneralImplementable,ventageneralImplementableHome);
	}
	
	public void importarVentaGenerals() throws Exception {		
	
	}
	
	public void exportarVentaGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentaGeneralsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentaGeneralsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentaGeneralsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Venta General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentaGeneralsSeleccionados() throws Exception {
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();		
		
		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventageneral."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentaGeneral(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentaGeneral ventageneralAux:ventageneralsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentaGeneral(ventageneralAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventageneralAux.setsDetalleGeneralEntityReporte(ventageneralAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentaGeneral(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaGeneralConstantesFunciones.LABEL_ICE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentaGeneral(VentaGeneral ventageneral,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventageneral.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventageneral.getice().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentaGeneralsSeleccionados() throws Exception {
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();		
		
		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventageneral.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentaGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentaGeneral(row);				
				iRow++;
			}				
			
			for(VentaGeneral ventageneralAux:ventageneralsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentaGeneral(ventageneralAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentaGeneralsSeleccionados() throws Exception {
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();		
		
		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventageneral.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventagenerals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventageneral");
			//elementRoot.appendChild(element);
		
			for(VentaGeneral ventageneralAux:ventageneralsSeleccionados) {
				element = document.createElement("ventageneral");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentaGeneral(ventageneralAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentaGeneral(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaGeneralConstantesFunciones.LABEL_ICE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentaGeneral(VentaGeneral ventageneral,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(ventageneral.getice());				
	}
	
	public void setFilaDatosExportarXmlVentaGeneral(VentaGeneral ventageneral,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentaGeneralConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventageneral.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentaGeneralConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventageneral.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentaGeneralConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventageneral.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(VentaGeneralConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ventageneral.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(VentaGeneralConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(ventageneral.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementproducto_descripcion = document.createElement(VentaGeneralConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(ventageneral.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementfecha_desde = document.createElement(VentaGeneralConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(ventageneral.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(VentaGeneralConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(ventageneral.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementnombre_producto = document.createElement(VentaGeneralConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(ventageneral.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_cliente = document.createElement(VentaGeneralConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(ventageneral.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementfecha = document.createElement(VentaGeneralConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(ventageneral.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementsecuencial = document.createElement(VentaGeneralConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(ventageneral.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementcantidad = document.createElement(VentaGeneralConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(ventageneral.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(VentaGeneralConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(ventageneral.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementdescuento = document.createElement(VentaGeneralConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(ventageneral.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementiva = document.createElement(VentaGeneralConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(ventageneral.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementice = document.createElement(VentaGeneralConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(ventageneral.getice().toString().trim()));
		element.appendChild(elementice);
	}
	
	public void generarReporteGroupGenericoVentaGeneralsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentaGeneral> ventageneralsSeleccionados=new ArrayList<VentaGeneral>();
		
		ventageneralsSeleccionados=this.getVentaGeneralsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentaGeneral(ventageneralsSeleccionados);
		
		this.generarReporteVentaGenerals("Todos",ventageneralsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentaGeneral(ArrayList<VentaGeneral> ventageneralsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentaGeneral ventageneralAux:ventageneralsSeleccionados) {
				ventageneralAux.setsDetalleGeneralEntityReporte(ventageneralAux.toString());
			
				if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(ventageneralAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(ventageneralAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(ventageneralAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(ventageneralAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventageneralAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventageneralAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(ventageneralAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(ventageneralAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventageneralAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(VentaGeneralConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					ventageneralAux.setsDescripcionGeneralEntityReporte1(ventageneralAux.getsecuencial());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentaGeneral(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentaGeneral=true;
				this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=true;
				this.isVisibilidadCeldaGuardarCambiosVentaGeneral=true;
			}
			
			this.isVisibilidadCeldaModificarVentaGeneral=false;
			this.isVisibilidadCeldaActualizarVentaGeneral=false;
			this.isVisibilidadCeldaEliminarVentaGeneral=false;
			this.isVisibilidadCeldaCancelarVentaGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentaGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=false;
			this.isVisibilidadCeldaModificarVentaGeneral=false;
			this.isVisibilidadCeldaActualizarVentaGeneral=true;
			this.isVisibilidadCeldaEliminarVentaGeneral=false;
			this.isVisibilidadCeldaCancelarVentaGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentaGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=false;
			this.isVisibilidadCeldaModificarVentaGeneral=false;
			this.isVisibilidadCeldaActualizarVentaGeneral=true;
			this.isVisibilidadCeldaEliminarVentaGeneral=true;
			this.isVisibilidadCeldaCancelarVentaGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentaGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=false;
			this.isVisibilidadCeldaModificarVentaGeneral=false;
			this.isVisibilidadCeldaActualizarVentaGeneral=true;
			this.isVisibilidadCeldaEliminarVentaGeneral=false;
			this.isVisibilidadCeldaCancelarVentaGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentaGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=true;
			this.isVisibilidadCeldaModificarVentaGeneral=false;
			this.isVisibilidadCeldaActualizarVentaGeneral=false;
			this.isVisibilidadCeldaEliminarVentaGeneral=false;
			this.isVisibilidadCeldaCancelarVentaGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentaGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=false;
			this.isVisibilidadCeldaActualizarVentaGeneral=false;
			this.isVisibilidadCeldaEliminarVentaGeneral=false;
			this.isVisibilidadCeldaCancelarVentaGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentaGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=false;
			this.isVisibilidadCeldaModificarVentaGeneral=true;
			this.isVisibilidadCeldaActualizarVentaGeneral=false;
			this.isVisibilidadCeldaEliminarVentaGeneral=false;
			this.isVisibilidadCeldaCancelarVentaGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarVentaGeneral=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentaGeneralJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentaGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=true;
		} else {
			this.actualizarEstadoPanelsVentaGeneral(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentaGeneral=false;
			//this.isVisibilidadCeldaVerFormVentaGeneral=false;
			this.isVisibilidadCeldaDuplicarVentaGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventageneralSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
		} else {
			this.isVisibilidadCeldaNuevoVentaGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosVentaGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventageneralSessionBean.getEsGuardarRelacionado()) {
			if(!ventageneralSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;												
			}
			
			this.jButtonCerrarVentaGeneral.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
		}
		
		if(!this.permiteMantenimiento(this.ventageneral)) {
			this.isVisibilidadCeldaActualizarVentaGeneral=false;
			this.isVisibilidadCeldaEliminarVentaGeneral=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentaGeneral=false;
		this.isVisibilidadCeldaNuevoRelacionesVentaGeneral=false;
		this.isVisibilidadCeldaGuardarCambiosVentaGeneral=false;
		//this.isVisibilidadCeldaModificarVentaGeneral=true;
		this.isVisibilidadCeldaActualizarVentaGeneral=false;
		this.isVisibilidadCeldaEliminarVentaGeneral=false;
		//this.isVisibilidadCeldaCancelarVentaGeneral=true;			
		this.isVisibilidadCeldaGuardarVentaGeneral=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentaGeneral() {
	}
	
	public void actualizarEstadoPanelsVentaGeneral(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentaGeneral!=null) {
				this.jScrollPanelDatosEdicionVentaGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaGeneral!=null) {
				this.jTabbedPaneBusquedasVentaGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentaGeneral!=null) {
				this.jScrollPanelDatosVentaGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentaGeneral!=null) {
				this.jPanelPaginacionVentaGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentaGeneral!=null) {
				this.jPanelParametrosReportesVentaGeneral.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentaGeneral!=null) {
				this.jScrollPanelDatosEdicionVentaGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaGeneral!=null) {
				this.jTabbedPaneBusquedasVentaGeneral.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentaGeneral!=null) {
				this.jScrollPanelDatosVentaGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentaGeneral!=null) {
				this.jPanelPaginacionVentaGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentaGeneral!=null) {
				this.jPanelParametrosReportesVentaGeneral.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentaGeneral!=null) {
				this.jScrollPanelDatosEdicionVentaGeneral.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaGeneral!=null) {
				this.jTabbedPaneBusquedasVentaGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentaGeneral!=null) {
				this.jScrollPanelDatosVentaGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentaGeneral!=null) {
				this.jPanelPaginacionVentaGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentaGeneral!=null) {
				this.jPanelParametrosReportesVentaGeneral.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentaGeneral!=null) {
				this.jScrollPanelDatosEdicionVentaGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaGeneral!=null) {
				this.jTabbedPaneBusquedasVentaGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentaGeneral!=null) {
				this.jScrollPanelDatosVentaGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentaGeneral!=null) {
				this.jPanelPaginacionVentaGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentaGeneral!=null) {
				this.jPanelParametrosReportesVentaGeneral.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentaGeneral!=null) {
				this.jScrollPanelDatosEdicionVentaGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaGeneral!=null) {
				this.jTabbedPaneBusquedasVentaGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentaGeneral!=null) {
				this.jScrollPanelDatosVentaGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentaGeneral!=null) {
				this.jPanelPaginacionVentaGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentaGeneral!=null) {
				this.jPanelParametrosReportesVentaGeneral.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentaGeneral!=null) {
				this.jScrollPanelDatosEdicionVentaGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaGeneral!=null) {
				this.jTabbedPaneBusquedasVentaGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentaGeneral!=null) {
				this.jScrollPanelDatosVentaGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentaGeneral!=null) {
				this.jPanelPaginacionVentaGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentaGeneral!=null) {
				this.jPanelParametrosReportesVentaGeneral.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentaGeneral!=null) {
				this.jScrollPanelDatosEdicionVentaGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaGeneral!=null) {
				this.jTabbedPaneBusquedasVentaGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentaGeneral!=null) {
				this.jScrollPanelDatosVentaGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentaGeneral!=null) {
				this.jPanelPaginacionVentaGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentaGeneral!=null) {
				this.jPanelParametrosReportesVentaGeneral.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventageneralSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentaGeneral!=null) {
					this.jTabbedPaneBusquedasVentaGeneral.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentaGeneral!=null) {
				this.jPanelParametrosReportesVentaGeneral.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventageneralSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaGeneral!=null) {
				this.jTabbedPaneBusquedasVentaGeneral.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentaGeneral!=null) {
				this.jPanelParametrosReportesVentaGeneral.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentaGeneral=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaVentaGeneral) {this.jTabbedPaneBusquedasVentaGeneral.remove(jPanelBusquedaVentaGeneralVentaGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaVentaGeneral=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaVentaGeneral) {this.jTabbedPaneBusquedasVentaGeneral.remove(jPanelBusquedaVentaGeneralVentaGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaVentaGeneral=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaVentaGeneral) {this.jTabbedPaneBusquedasVentaGeneral.remove(jPanelBusquedaVentaGeneralVentaGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaVentaGeneral=isParaProductoNegation;
			if(!this.isVisibilidadBusquedaVentaGeneral) {this.jTabbedPaneBusquedasVentaGeneral.remove(jPanelBusquedaVentaGeneralVentaGeneral);}
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
			
			this.inicializarActualizarBindingTablaVentaGeneral(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentaGeneral() {
		this.updateBorderResaltarBusquedasFormularioVentaGeneral();
		this.updateVisibilidadBusquedasFormularioVentaGeneral();
		this.updateHabilitarBusquedasFormularioVentaGeneral();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentaGeneral() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentaGeneral.getComponents().length>0) {
	

		if(this.ventageneralConstantesFunciones.resaltarBusquedaVentaGeneralVentaGeneral!=null) {
			index= this.jTabbedPaneBusquedasVentaGeneral.indexOfComponent(this.jPanelBusquedaVentaGeneralVentaGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentaGeneral.getComponent(index);
				jPanel.setBorder(this.ventageneralConstantesFunciones.resaltarBusquedaVentaGeneralVentaGeneral);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentaGeneral() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentaGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentaGeneral.indexOfComponent(this.jPanelBusquedaVentaGeneralVentaGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentaGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventageneralConstantesFunciones.mostrarBusquedaVentaGeneralVentaGeneral);
			if(!this.ventageneralConstantesFunciones.mostrarBusquedaVentaGeneralVentaGeneral && index>-1) {
				this.jTabbedPaneBusquedasVentaGeneral.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentaGeneral() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentaGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentaGeneral.indexOfComponent(this.jPanelBusquedaVentaGeneralVentaGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentaGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventageneralConstantesFunciones.activarBusquedaVentaGeneralVentaGeneral);
				this.jTabbedPaneBusquedasVentaGeneral.setEnabledAt(index,this.ventageneralConstantesFunciones.activarBusquedaVentaGeneralVentaGeneral);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentaGeneral(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentaGeneral")) {
			index= this.jTabbedPaneBusquedasVentaGeneral.indexOfComponent(this.jPanelBusquedaVentaGeneralVentaGeneral);

			this.jTabbedPaneBusquedasVentaGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentaGeneral.getComponent(index);

			this.ventageneralConstantesFunciones.setResaltarBusquedaVentaGeneralVentaGeneral(resaltar);

			jPanel.setBorder(this.ventageneralConstantesFunciones.resaltarBusquedaVentaGeneralVentaGeneral);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentaGeneral.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentaGeneral() throws Exception {

		if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentaGeneral();
		this.updateVisibilidadResaltarControlesFormularioVentaGeneral();
		this.updateHabilitarResaltarControlesFormularioVentaGeneral();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentaGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventageneralConstantesFunciones.resaltaridVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltaridVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarid_empresaVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarid_empresaVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarid_sucursalVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarid_sucursalVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarid_clienteVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarid_clienteVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarid_productoVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarid_productoVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarfecha_desdeVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfecha_desdeVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarfecha_desdeVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarfecha_hastaVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfecha_hastaVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarfecha_hastaVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarnombre_productoVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_productoVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarnombre_productoVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarnombre_clienteVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_clienteVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarnombre_clienteVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarfechaVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfechaVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarfechaVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarsecuencialVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jTextFieldsecuencialVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarsecuencialVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarcantidadVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jTextFieldcantidadVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarcantidadVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarprecioVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jTextFieldprecioVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarprecioVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltardescuentoVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jTextFielddescuentoVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltardescuentoVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltarivaVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jTextFieldivaVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltarivaVentaGeneral);}
		if(this.ventageneralConstantesFunciones.resaltariceVentaGeneral!=null && this.jInternalFrameDetalleFormVentaGeneral!=null) {this.jInternalFrameDetalleFormVentaGeneral.jTextFieldiceVentaGeneral.setBorder(this.ventageneralConstantesFunciones.resaltariceVentaGeneral);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentaGeneral() throws Exception {		
		if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
	
		//this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostraridVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelidVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostraridVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarid_empresaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelid_empresaVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarid_empresaVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarid_sucursalVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelid_sucursalVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarid_sucursalVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarid_clienteVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelid_clienteVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarid_clienteVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarid_productoVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelid_productoVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarid_productoVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfecha_desdeVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarfecha_desdeVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelfecha_desdeVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarfecha_desdeVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfecha_hastaVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarfecha_hastaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelfecha_hastaVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarfecha_hastaVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_productoVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarnombre_productoVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelnombre_productoVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarnombre_productoVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_clienteVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarnombre_clienteVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelnombre_clienteVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarnombre_clienteVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfechaVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarfechaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelfechaVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarfechaVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jTextFieldsecuencialVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarsecuencialVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelsecuencialVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarsecuencialVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jTextFieldcantidadVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarcantidadVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelcantidadVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarcantidadVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jTextFieldprecioVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarprecioVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelprecioVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarprecioVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jTextFielddescuentoVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrardescuentoVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPaneldescuentoVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrardescuentoVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jTextFieldivaVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarivaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPanelivaVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrarivaVentaGeneral);
		//this.jInternalFrameDetalleFormVentaGeneral.jTextFieldiceVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrariceVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jPaneliceVentaGeneral.setVisible(this.ventageneralConstantesFunciones.mostrariceVentaGeneral);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentaGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormVentaGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentaGeneral!=null) {
	
		this.jInternalFrameDetalleFormVentaGeneral.jLabelidVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activaridVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_empresaVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarid_empresaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_sucursalVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarid_sucursalVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_clienteVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarid_clienteVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jComboBoxid_productoVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarid_productoVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfecha_desdeVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarfecha_desdeVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfecha_hastaVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarfecha_hastaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_productoVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarnombre_productoVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextAreanombre_clienteVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarnombre_clienteVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jDateChooserfechaVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarfechaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldsecuencialVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarsecuencialVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldcantidadVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarcantidadVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldprecioVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarprecioVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFielddescuentoVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activardescuentoVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldivaVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activarivaVentaGeneral);
		this.jInternalFrameDetalleFormVentaGeneral.jTextFieldiceVentaGeneral.setEnabled(this.ventageneralConstantesFunciones.activariceVentaGeneral);
		}
	}
	
		
}