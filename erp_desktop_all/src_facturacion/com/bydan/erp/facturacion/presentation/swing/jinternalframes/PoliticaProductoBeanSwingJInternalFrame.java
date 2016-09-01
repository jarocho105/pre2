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

import com.bydan.erp.facturacion.util.PoliticaProductoConstantesFunciones;
import com.bydan.erp.facturacion.util.PoliticaProductoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.PoliticaProductoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.PoliticaProductoBean;
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
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PoliticaProductoBeanSwingJInternalFrame extends PoliticaProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PoliticaProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PoliticaProducto> politicaproductoValidator = new ClassValidator<PoliticaProducto>(PoliticaProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PoliticaProducto politicaproducto;	
	public PoliticaProducto politicaproductoAux;
	public PoliticaProducto politicaproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PoliticaProducto politicaproductoTotales;
	public Long idPoliticaProductoActual;
	public Long iIdNuevoPoliticaProducto=0L;
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
	
	public Boolean isPermisoTodoPoliticaProducto;
	public Boolean isPermisoNuevoPoliticaProducto;
	public Boolean isPermisoActualizarPoliticaProducto;
	public Boolean isPermisoActualizarOriginalPoliticaProducto;
	public Boolean isPermisoEliminarPoliticaProducto;
	public Boolean isPermisoGuardarCambiosPoliticaProducto;
	public Boolean isPermisoConsultaPoliticaProducto;
	public Boolean isPermisoBusquedaPoliticaProducto;
	public Boolean isPermisoReportePoliticaProducto;
	public Boolean isPermisoPaginacionMedioPoliticaProducto;
	public Boolean isPermisoPaginacionAltoPoliticaProducto;
	public Boolean isPermisoPaginacionTodoPoliticaProducto;
	public Boolean isPermisoCopiarPoliticaProducto;
	public Boolean isPermisoVerFormPoliticaProducto;
	public Boolean isPermisoDuplicarPoliticaProducto;
	public Boolean isPermisoOrdenPoliticaProducto;
	
	
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
	
	public PoliticaProductoParameterReturnGeneral politicaproductoReturnGeneral;
	public PoliticaProductoParameterReturnGeneral politicaproductoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPoliticaProducto=false;
	public Boolean esParaAccionDesdeFormularioPoliticaProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PoliticaProductoSessionBeanAdditional politicaproductoSessionBeanAdditional=null;
	
	public PoliticaProductoSessionBeanAdditional getPoliticaProductoSessionBeanAdditional() {
		return this.politicaproductoSessionBeanAdditional;
	}
	
	public void setPoliticaProductoSessionBeanAdditional(PoliticaProductoSessionBeanAdditional politicaproductoSessionBeanAdditional) {
		try {
			this.politicaproductoSessionBeanAdditional=politicaproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PoliticaProductoBeanSwingJInternalFrameAdditional politicaproductoBeanSwingJInternalFrameAdditional=null;
	//public class PoliticaProductoBeanSwingJInternalFrame
	
	public PoliticaProductoBeanSwingJInternalFrameAdditional getPoliticaProductoBeanSwingJInternalFrameAdditional() {
		return this.politicaproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPoliticaProductoBeanSwingJInternalFrameAdditional(PoliticaProductoBeanSwingJInternalFrameAdditional politicaproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.politicaproductoBeanSwingJInternalFrameAdditional=politicaproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PoliticaProductoLogic politicaproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PoliticaProducto politicaproductoBean;
	public PoliticaProductoConstantesFunciones politicaproductoConstantesFunciones;
	//public PoliticaProductoParameterReturnGeneral politicaproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<PoliticaProducto> politicaproductos;	
	//public List<PoliticaProducto> politicaproductosEliminados;
	//public List<PoliticaProducto> politicaproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPoliticaProducto=false;
	public Boolean isVisibilidadCeldaDuplicarPoliticaProducto=true;
	public Boolean isVisibilidadCeldaCopiarPoliticaProducto=true;
	public Boolean isVisibilidadCeldaVerFormPoliticaProducto=true;
	public Boolean isVisibilidadCeldaOrdenPoliticaProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;
	public Boolean isVisibilidadCeldaModificarPoliticaProducto=false;
	public Boolean isVisibilidadCeldaActualizarPoliticaProducto=false;
	public Boolean isVisibilidadCeldaEliminarPoliticaProducto=false;
	public Boolean isVisibilidadCeldaCancelarPoliticaProducto=false;
	public Boolean isVisibilidadCeldaGuardarPoliticaProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPoliticaProducto=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPoliticaProducto() {
		return this.iIdNuevoPoliticaProducto;
	}

	public void setiIdNuevoPoliticaProducto(Long iIdNuevoPoliticaProducto) {
		this.iIdNuevoPoliticaProducto = iIdNuevoPoliticaProducto;
	}
	
	public Long getidPoliticaProductoActual() {
		return this.idPoliticaProductoActual;
	}

	public void setidPoliticaProductoActual(Long idPoliticaProductoActual) {
		this.idPoliticaProductoActual = idPoliticaProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PoliticaProducto getpoliticaproducto() {
		return this.politicaproducto;
	}

	public void setpoliticaproducto(PoliticaProducto politicaproducto) {
		this.politicaproducto = politicaproducto;
	}
	
	public PoliticaProducto getpoliticaproductoAux() {
		return this.politicaproductoAux;
	}

	public void setpoliticaproductoAux(PoliticaProducto politicaproductoAux) {
		this.politicaproductoAux = politicaproductoAux;
	}				
	
	public PoliticaProducto getpoliticaproductoAnterior() {
		return this.politicaproductoAnterior;
	}

	public void setpoliticaproductoAnterior(PoliticaProducto politicaproductoAnterior) {
		this.politicaproductoAnterior = politicaproductoAnterior;
	}	
	
	public PoliticaProducto getpoliticaproductoTotales() {
		return this.politicaproductoTotales;
	}

	public void setpoliticaproductoTotales(PoliticaProducto politicaproductoTotales) {
		this.politicaproductoTotales = politicaproductoTotales;
	}	
	
	public PoliticaProducto getpoliticaproductoBean() {
		return this.politicaproductoBean;
	}

	public void setpoliticaproductoBean(PoliticaProducto politicaproductoBean) {
		this.politicaproductoBean = politicaproductoBean;
	}	
	
	public PoliticaProductoParameterReturnGeneral getpoliticaproductoReturnGeneral() {
		return this.politicaproductoReturnGeneral;
	}

	public void setpoliticaproductoReturnGeneral(PoliticaProductoParameterReturnGeneral politicaproductoReturnGeneral) {
		this.politicaproductoReturnGeneral = politicaproductoReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
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
	
	
	public PoliticaProductoLogic getPoliticaProductoLogic()	{		
		return politicaproductoLogic;
	}

	public void setPoliticaProductoLogic(PoliticaProductoLogic politicaproductoLogic) {
		this.politicaproductoLogic = politicaproductoLogic;
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
	
	public Boolean getIsEsNuevoPoliticaProducto() {
		return isEsNuevoPoliticaProducto;
	}

	public void setIsEsNuevoPoliticaProducto(Boolean isEsNuevoPoliticaProducto) {
		this.isEsNuevoPoliticaProducto = isEsNuevoPoliticaProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioPoliticaProducto() {
		return esParaAccionDesdeFormularioPoliticaProducto;
	}
	
	public void setEsParaAccionDesdeFormularioPoliticaProducto(Boolean esParaAccionDesdeFormularioPoliticaProducto) {
		this.esParaAccionDesdeFormularioPoliticaProducto = esParaAccionDesdeFormularioPoliticaProducto;
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

			if(this.politicaproductoSessionBean==null) {
				this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
			}

			if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(politicaproductoSessionBean.getlidEmpresaActual());
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

			if(this.politicaproductoSessionBean==null) {
				this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
			}

			if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(politicaproductoSessionBean.getlidSucursalActual());
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

			if(this.politicaproductoSessionBean==null) {
				this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
			}

			if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(politicaproductoSessionBean.getlidBodegaActual());
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

			if(this.politicaproductoSessionBean==null) {
				this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
			}

			if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(politicaproductoSessionBean.getlidProductoActual());
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

					if(this.politicaproducto!=null) {
						this.politicaproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
						this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPoliticaProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
						if(this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPoliticaProductoGenerico)throws Exception
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
				jComboBoxid_empresaPoliticaProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPoliticaProductoGenerico!=null && jComboBoxid_empresaPoliticaProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaPoliticaProductoGenerico.setSelectedIndex(0);
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

					if(this.politicaproducto!=null) {
						this.politicaproducto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
						this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPoliticaProducto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
						if(this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPoliticaProductoGenerico)throws Exception
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
				jComboBoxid_sucursalPoliticaProductoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPoliticaProductoGenerico!=null && jComboBoxid_sucursalPoliticaProductoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPoliticaProductoGenerico.setSelectedIndex(0);
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

					if(this.politicaproducto!=null) {
						this.politicaproducto.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
						this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaPoliticaProducto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
						if(this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaPoliticaProducto!=null) {
						jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaPoliticaProducto!=null) {
							//jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaPoliticaProductoGenerico)throws Exception
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
				jComboBoxid_bodegaPoliticaProductoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaPoliticaProductoGenerico!=null && jComboBoxid_bodegaPoliticaProductoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaPoliticaProductoGenerico.setSelectedIndex(0);
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

					if(this.politicaproducto!=null) {
						this.politicaproducto.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
						this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoPoliticaProducto.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
						if(this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoPoliticaProducto!=null) {
						jComboBoxid_productoFK_IdProductoPoliticaProducto.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoPoliticaProducto!=null) {
							//jComboBoxid_productoFK_IdProductoPoliticaProducto.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoPoliticaProducto.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoPoliticaProducto.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoPoliticaProductoGenerico)throws Exception
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
				jComboBoxid_productoPoliticaProductoGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoPoliticaProductoGenerico!=null && jComboBoxid_productoPoliticaProductoGenerico.getItemCount()>0) {
					jComboBoxid_productoPoliticaProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PoliticaProducto politicaproducto,JComboBox jComboBoxid_empresaPoliticaProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPoliticaProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPoliticaProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				politicaproducto.setid_empresa(empresaAux.getId());
				politicaproducto.setempresa_descripcion(PoliticaProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				politicaproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PoliticaProducto politicaproducto,JComboBox jComboBoxid_sucursalPoliticaProductoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPoliticaProductoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPoliticaProductoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				politicaproducto.setid_sucursal(sucursalAux.getId());
				politicaproducto.setsucursal_descripcion(PoliticaProductoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				politicaproducto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(PoliticaProducto politicaproducto,JComboBox jComboBoxid_bodegaPoliticaProductoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaPoliticaProductoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaPoliticaProductoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				politicaproducto.setid_bodega(bodegaAux.getId());
				politicaproducto.setbodega_descripcion(PoliticaProductoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				politicaproducto.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(PoliticaProducto politicaproducto,JComboBox jComboBoxid_productoPoliticaProductoGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoPoliticaProductoGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoPoliticaProductoGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				politicaproducto.setid_producto(productoAux.getId());
				politicaproducto.setproducto_descripcion(PoliticaProductoConstantesFunciones.getProductoDescripcion(productoAux));
				politicaproducto.setProducto(productoAux);			}
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

					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { 
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { 
					}

					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { 
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { 
					}

					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { 
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { 
					}

					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.addItem(bodega);
							}
						}

						if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { 
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { 
					}

					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoPoliticaProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoPoliticaProducto.addItem(producto);
							}
						}

						if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoPoliticaProducto.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoPoliticaProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPoliticaProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PoliticaProductoConstantesFunciones.refrescarForeignKeysDescripcionesPoliticaProducto(this.politicaproductoLogic.getPoliticaProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PoliticaProductoConstantesFunciones.refrescarForeignKeysDescripcionesPoliticaProducto(this.politicaproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//politicaproductoLogic.setPoliticaProductos(this.politicaproductos);
			politicaproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PoliticaProductoParameterReturnGeneral getPoliticaProductoParameterGeneral() {
		return this.politicaproductoParameterGeneral;
	}
	
	public void setPoliticaProductoParameterGeneral(PoliticaProductoParameterReturnGeneral politicaproductoParameterGeneral) {
		this.politicaproductoParameterGeneral = politicaproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPoliticaProducto() {
		return isPermisoTodoPoliticaProducto;
	}

	public void setIsPermisoTodoPoliticaProducto(Boolean isPermisoTodoPoliticaProducto) {
		this.isPermisoTodoPoliticaProducto = isPermisoTodoPoliticaProducto;
	}

	public Boolean getIsPermisoNuevoPoliticaProducto() {
		return isPermisoNuevoPoliticaProducto;
	}

	public void setIsPermisoNuevoPoliticaProducto(Boolean isPermisoNuevoPoliticaProducto) {
		this.isPermisoNuevoPoliticaProducto = isPermisoNuevoPoliticaProducto;
	}

	public Boolean getIsPermisoActualizarPoliticaProducto() {
		return isPermisoActualizarPoliticaProducto;
	}

	public void setIsPermisoActualizarPoliticaProducto(Boolean isPermisoActualizarPoliticaProducto) {
		this.isPermisoActualizarPoliticaProducto = isPermisoActualizarPoliticaProducto;
	}

	public Boolean getIsPermisoEliminarPoliticaProducto() {
		return isPermisoEliminarPoliticaProducto;
	}

	public void setIsPermisoEliminarPoliticaProducto(Boolean isPermisoEliminarPoliticaProducto) {
		this.isPermisoEliminarPoliticaProducto = isPermisoEliminarPoliticaProducto;
	}

	public Boolean getIsPermisoGuardarCambiosPoliticaProducto() {
		return isPermisoGuardarCambiosPoliticaProducto;
	}

	public void setIsPermisoGuardarCambiosPoliticaProducto(Boolean isPermisoGuardarCambiosPoliticaProducto) {
		this.isPermisoGuardarCambiosPoliticaProducto = isPermisoGuardarCambiosPoliticaProducto;
	}
	
	public Boolean getIsPermisoConsultaPoliticaProducto() {
		return isPermisoConsultaPoliticaProducto;
	}

	public void setIsPermisoConsultaPoliticaProducto(Boolean isPermisoConsultaPoliticaProducto) {
		this.isPermisoConsultaPoliticaProducto = isPermisoConsultaPoliticaProducto;
	}

	public Boolean getIsPermisoBusquedaPoliticaProducto() {
		return isPermisoBusquedaPoliticaProducto;
	}

	public void setIsPermisoBusquedaPoliticaProducto(Boolean isPermisoBusquedaPoliticaProducto) {
		this.isPermisoBusquedaPoliticaProducto = isPermisoBusquedaPoliticaProducto;
	}

	public Boolean getIsPermisoReportePoliticaProducto() {
		return isPermisoReportePoliticaProducto;
	}

	public void setIsPermisoReportePoliticaProducto(Boolean isPermisoReportePoliticaProducto) {
		this.isPermisoReportePoliticaProducto = isPermisoReportePoliticaProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioPoliticaProducto() {
		return isPermisoPaginacionMedioPoliticaProducto;
	}

	public void setIsPermisoPaginacionMedioPoliticaProducto(Boolean isPermisoPaginacionMedioPoliticaProducto) {
		this.isPermisoPaginacionMedioPoliticaProducto = isPermisoPaginacionMedioPoliticaProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoPoliticaProducto() {
		return isPermisoPaginacionTodoPoliticaProducto;
	}

	public void setIsPermisoPaginacionTodoPoliticaProducto(Boolean isPermisoPaginacionTodoPoliticaProducto) {
		this.isPermisoPaginacionTodoPoliticaProducto = isPermisoPaginacionTodoPoliticaProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoPoliticaProducto() {
		return isPermisoPaginacionAltoPoliticaProducto;
	}

	public void setIsPermisoPaginacionAltoPoliticaProducto(Boolean isPermisoPaginacionAltoPoliticaProducto) {
		this.isPermisoPaginacionAltoPoliticaProducto = isPermisoPaginacionAltoPoliticaProducto;
	}
	
	public Boolean getIsPermisoCopiarPoliticaProducto() {
		return isPermisoCopiarPoliticaProducto;
	}

	public void setIsPermisoCopiarPoliticaProducto(Boolean isPermisoCopiarPoliticaProducto) {
		this.isPermisoCopiarPoliticaProducto = isPermisoCopiarPoliticaProducto;
	}
	
	public Boolean getIsPermisoVerFormPoliticaProducto() {
		return isPermisoVerFormPoliticaProducto;
	}

	public void setIsPermisoVerFormPoliticaProducto(Boolean isPermisoVerFormPoliticaProducto) {
		this.isPermisoVerFormPoliticaProducto = isPermisoVerFormPoliticaProducto;
	}
	
	public Boolean getIsPermisoDuplicarPoliticaProducto() {
		return isPermisoDuplicarPoliticaProducto;
	}

	public void setIsPermisoDuplicarPoliticaProducto(Boolean isPermisoDuplicarPoliticaProducto) {
		this.isPermisoDuplicarPoliticaProducto = isPermisoDuplicarPoliticaProducto;
	}
	
	public Boolean getIsPermisoOrdenPoliticaProducto() {
		return isPermisoOrdenPoliticaProducto;
	}

	public void setIsPermisoOrdenPoliticaProducto(Boolean isPermisoOrdenPoliticaProducto) {
		this.isPermisoOrdenPoliticaProducto = isPermisoOrdenPoliticaProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPoliticaProducto() {
		return isVisibilidadCeldaNuevoPoliticaProducto;
	}

	public void setIsVisibilidadCeldaNuevoPoliticaProducto(Boolean isVisibilidadCeldaNuevoPoliticaProducto) {
		this.isVisibilidadCeldaNuevoPoliticaProducto = isVisibilidadCeldaNuevoPoliticaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPoliticaProducto() {
		return isVisibilidadCeldaDuplicarPoliticaProducto;
	}

	public void setIsVisibilidadCeldaDuplicarPoliticaProducto(Boolean isVisibilidadCeldaDuplicarPoliticaProducto) {
		this.isVisibilidadCeldaDuplicarPoliticaProducto = isVisibilidadCeldaDuplicarPoliticaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPoliticaProducto() {
		return isVisibilidadCeldaCopiarPoliticaProducto;
	}

	public void setIsVisibilidadCeldaCopiarPoliticaProducto(Boolean isVisibilidadCeldaCopiarPoliticaProducto) {
		this.isVisibilidadCeldaCopiarPoliticaProducto = isVisibilidadCeldaCopiarPoliticaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPoliticaProducto() {
		return isVisibilidadCeldaVerFormPoliticaProducto;
	}

	public void setIsVisibilidadCeldaVerFormPoliticaProducto(Boolean isVisibilidadCeldaVerFormPoliticaProducto) {
		this.isVisibilidadCeldaVerFormPoliticaProducto = isVisibilidadCeldaVerFormPoliticaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPoliticaProducto() {
		return isVisibilidadCeldaOrdenPoliticaProducto;
	}

	public void setIsVisibilidadCeldaOrdenPoliticaProducto(Boolean isVisibilidadCeldaOrdenPoliticaProducto) {
		this.isVisibilidadCeldaOrdenPoliticaProducto = isVisibilidadCeldaOrdenPoliticaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPoliticaProducto() {
		return isVisibilidadCeldaNuevoRelacionesPoliticaProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPoliticaProducto(Boolean isVisibilidadCeldaNuevoRelacionesPoliticaProducto) {
		this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto = isVisibilidadCeldaNuevoRelacionesPoliticaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPoliticaProducto() {
		return isVisibilidadCeldaModificarPoliticaProducto;
	}

	public void setIsVisibilidadCeldaModificarPoliticaProducto(Boolean isVisibilidadCeldaModificarPoliticaProducto) {
		this.isVisibilidadCeldaModificarPoliticaProducto = isVisibilidadCeldaModificarPoliticaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPoliticaProducto() {
		return isVisibilidadCeldaActualizarPoliticaProducto;
	}

	public void setIsVisibilidadCeldaActualizarPoliticaProducto(Boolean isVisibilidadCeldaActualizarPoliticaProducto) {
		this.isVisibilidadCeldaActualizarPoliticaProducto = isVisibilidadCeldaActualizarPoliticaProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarPoliticaProducto() {
		return isVisibilidadCeldaEliminarPoliticaProducto;
	}

	public void setIsVisibilidadCeldaEliminarPoliticaProducto(Boolean isVisibilidadCeldaEliminarPoliticaProducto) {
		this.isVisibilidadCeldaEliminarPoliticaProducto = isVisibilidadCeldaEliminarPoliticaProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarPoliticaProducto() {
		return isVisibilidadCeldaCancelarPoliticaProducto;
	}

	public void setIsVisibilidadCeldaCancelarPoliticaProducto(Boolean isVisibilidadCeldaCancelarPoliticaProducto) {
		this.isVisibilidadCeldaCancelarPoliticaProducto = isVisibilidadCeldaCancelarPoliticaProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarPoliticaProducto() {
		return isVisibilidadCeldaGuardarPoliticaProducto;
	}

	public void setIsVisibilidadCeldaGuardarPoliticaProducto(Boolean isVisibilidadCeldaGuardarPoliticaProducto) {
		this.isVisibilidadCeldaGuardarPoliticaProducto = isVisibilidadCeldaGuardarPoliticaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPoliticaProducto() {
		return isVisibilidadCeldaGuardarCambiosPoliticaProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPoliticaProducto(Boolean isVisibilidadCeldaGuardarCambiosPoliticaProducto) {
		this.isVisibilidadCeldaGuardarCambiosPoliticaProducto = isVisibilidadCeldaGuardarCambiosPoliticaProducto;
	}
		
	public PoliticaProductoSessionBean getpoliticaproductoSessionBean() {
		return this.politicaproductoSessionBean;
	}
	
	public void setpoliticaproductoSessionBean(PoliticaProductoSessionBean politicaproductoSessionBean) {
		this.politicaproductoSessionBean=politicaproductoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(PoliticaProducto politicaproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(politicaproducto,null);
				this.setActualParaGuardarSucursalForeignKey(politicaproducto,null);
				this.setActualParaGuardarBodegaForeignKey(politicaproducto,null);
				this.setActualParaGuardarProductoForeignKey(politicaproducto,null);
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
	
	public void bugActualizarReferenciaActual(PoliticaProducto politicaproducto,PoliticaProducto politicaproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPoliticaProducto(politicaproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		politicaproductoAux.setId(politicaproducto.getId());
		politicaproductoAux.setVersionRow(politicaproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPoliticaProducto();
		
			int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = politicaproductoValidator.getInvalidValues(this.politicaproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			politicaproductoLogic.setDatosCliente(datosCliente);
			politicaproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				politicaproductoAux=new  PoliticaProducto();
				
				politicaproductoAux.setIsNew(true);
				politicaproductoAux.setIsChanged(true);
				
				politicaproductoAux.setPoliticaProductoOriginal(this.politicaproducto);
				
				politicaproductoAux.setId(this.politicaproducto.getId());	
				politicaproductoAux.setVersionRow(this.politicaproducto.getVersionRow());	
				politicaproductoAux.setid_empresa(this.politicaproducto.getid_empresa());	
				politicaproductoAux.setid_sucursal(this.politicaproducto.getid_sucursal());	
				politicaproductoAux.setid_bodega(this.politicaproducto.getid_bodega());	
				politicaproductoAux.setid_producto(this.politicaproducto.getid_producto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.politicaproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(politicaproductoAux,politicaproductoLogic.getPoliticaProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicaproductoAux,politicaproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.politicaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.politicaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductoLogic.savePoliticaProductos();//WithConnection
						//politicaproductoLogic.getSetVersionRowPoliticaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.politicaproducto,politicaproductoAux);
					
					this.refrescarForeignKeysDescripcionesPoliticaProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								politicaproductoLogic.savePoliticaProductoRelaciones(politicaproductoAux);//WithConnection
								//politicaproductoLogic.getSetVersionRowPoliticaProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.politicaproducto,politicaproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.politicaproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(politicaproductoAux,politicaproductoLogic.getPoliticaProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(politicaproductoAux,politicaproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.politicaproducto,politicaproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				politicaproductoAux=new  PoliticaProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.politicaproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.politicaproductoSessionBean.getEsGuardarRelacionado() && this.politicaproducto.getId()>=0)) {
						
					politicaproductoAux.setIsNew(false);
				}
				
				politicaproductoAux.setIsDeleted(false);
			
				politicaproductoAux.setId(this.politicaproducto.getId());	
				politicaproductoAux.setVersionRow(this.politicaproducto.getVersionRow());	
				politicaproductoAux.setid_empresa(this.politicaproducto.getid_empresa());	
				politicaproductoAux.setid_sucursal(this.politicaproducto.getid_sucursal());	
				politicaproductoAux.setid_bodega(this.politicaproducto.getid_bodega());	
				politicaproductoAux.setid_producto(this.politicaproducto.getid_producto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(politicaproductoAux,politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicaproductoAux,politicaproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.politicaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.politicaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductoLogic.savePoliticaProductos();//WithConnection
						//politicaproductoLogic.getSetVersionRowPoliticaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.politicaproducto,politicaproductoAux);
					
					this.refrescarForeignKeysDescripcionesPoliticaProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								politicaproductoLogic.savePoliticaProductoRelaciones(politicaproductoAux);//WithConnection
								//politicaproductoLogic.getSetVersionRowPoliticaProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.politicaproducto,politicaproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.politicaproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(politicaproductoAux,politicaproductoLogic.getPoliticaProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(politicaproductoAux,politicaproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.politicaproducto,politicaproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				politicaproductoAux=new  PoliticaProducto();
				
				politicaproductoAux.setIsNew(false);
				politicaproductoAux.setIsChanged(false);
				
				politicaproductoAux.setIsDeleted(true);
				
				politicaproductoAux.setId(this.politicaproducto.getId());	
				politicaproductoAux.setVersionRow(this.politicaproducto.getVersionRow());	
				politicaproductoAux.setid_empresa(this.politicaproducto.getid_empresa());	
				politicaproductoAux.setid_sucursal(this.politicaproducto.getid_sucursal());	
				politicaproductoAux.setid_bodega(this.politicaproducto.getid_bodega());	
				politicaproductoAux.setid_producto(this.politicaproducto.getid_producto());	
				
				if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.politicaproductoAux.getId()>=0) {	
						this.politicaproductosEliminados.add(politicaproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(politicaproductoAux,politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicaproductoAux,politicaproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.politicaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.politicaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductoLogic.savePoliticaProductos();//WithConnection
						//politicaproductoLogic.getSetVersionRowPoliticaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								politicaproductoLogic.savePoliticaProductoRelaciones(politicaproductoAux);//WithConnection
								//politicaproductoLogic.getSetVersionRowPoliticaProductos();//WithConnection
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
							if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.politicaproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(politicaproductoAux,politicaproductoLogic.getPoliticaProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(politicaproductoAux,politicaproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.getPoliticaProductos().addAll(this.politicaproductosEliminados);
					
					politicaproductoLogic.savePoliticaProductos();//WithConnection
					//politicaproductoLogic.getSetVersionRowPoliticaProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPoliticaProducto();
				
				this.politicaproductosEliminados= new ArrayList<PoliticaProducto>();		
			}
			
			if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Politica Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.politicaproducto=politicaproductoAux;
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
      		//this.finishProcessPoliticaProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(PoliticaProducto politicaproductoLocal) throws Exception {
		
		if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PoliticaProducto politicaproductoLocal) throws Exception {	
		if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				politicaproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				politicaproductoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				politicaproductoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				politicaproductoLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPoliticaProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = politicaproductoValidator.getInvalidValues(this.politicaproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PoliticaProducto politicaproducto,List<PoliticaProducto> politicaproductos) throws Exception {
		try	{		
			PoliticaProductoConstantesFunciones.actualizarLista(politicaproducto,politicaproductos,this.politicaproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PoliticaProducto politicaproducto,List<PoliticaProducto> politicaproductos) throws Exception {
		try	{			
			PoliticaProductoConstantesFunciones.actualizarSelectedLista(politicaproducto,politicaproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PoliticaProducto> politicaproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				politicaproductosLocal=this.politicaproductoLogic.getPoliticaProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				politicaproductosLocal=this.politicaproductos;
			}
			//ARCHITECTURE
		
			for(PoliticaProducto politicaproductoLocal:politicaproductosLocal) {
				if(this.permiteMantenimiento(politicaproductoLocal) && politicaproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PoliticaProductoConstantesFunciones.getPoliticaProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PoliticaProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaProducto.jLabelid_empresaPoliticaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaProductoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaProducto.jLabelid_sucursalPoliticaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaProductoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaProducto.jLabelid_bodegaPoliticaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PoliticaProductoConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaProducto.jLabelid_productoPoliticaProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaProducto.jLabelid_empresaPoliticaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaProducto.jLabelid_sucursalPoliticaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaProducto.jLabelid_bodegaPoliticaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPoliticaProducto.jLabelid_productoPoliticaProducto,"");
		
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
		this.iIdNuevoPoliticaProducto--;	
		
		
		this.politicaproductoAux=new PoliticaProducto();
		
		this.politicaproductoAux.setId(this.iIdNuevoPoliticaProducto);
		this.politicaproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.politicaproductoLogic.getPoliticaProductos().add(this.politicaproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.politicaproductos.add(this.politicaproductoAux);
		}
		//ARCHITECTURE
		
		this.politicaproducto=this.politicaproductoAux;
		
		if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPoliticaProducto(this.politicaproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyPoliticaProducto(this.politicaproducto);
		}
				
		//this.setDefaultControlesPoliticaProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPoliticaProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPoliticaProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPoliticaProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPoliticaProducto(this.politicaproductoBean,this.politicaproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PoliticaProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {
			classes=PoliticaProductoConstantesFunciones.getClassesRelationshipsOfPoliticaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.politicaproductoReturnGeneral=politicaproductoLogic.procesarEventosPoliticaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.politicaproductoLogic.getPoliticaProductos(),this.politicaproducto,this.politicaproductoParameterGeneral,this.isEsNuevoPoliticaProducto,classes);//this.politicaproductoLogic.getPoliticaProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPoliticaProducto(this.politicaproductoReturnGeneral,this.politicaproductoBean,false);
		
		if(this.politicaproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPoliticaProducto(this.politicaproductoReturnGeneral.getPoliticaProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPoliticaProducto(this.politicaproductoReturnGeneral.getPoliticaProducto());
		}
		
		if(this.politicaproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPoliticaProducto(this.politicaproductoReturnGeneral.getPoliticaProducto(),classes);//this.politicaproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPoliticaProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPoliticaProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.RecargarFormPoliticaProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPoliticaProducto(false);
						
			if(politicaproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPoliticaProducto();
			}
			
			this.actualizarVisualTableDatosPoliticaProducto();
			
			this.jTableDatosPoliticaProducto.setRowSelectionInterval(this.getIndiceNuevoPoliticaProducto(), this.getIndiceNuevoPoliticaProducto());
			
			this.seleccionarFilaTablaPoliticaProductoActual();
						
			this.actualizarEstadoCeldasBotonesPoliticaProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPoliticaProducto(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.setEnabled(isHabilitar && this.politicaproductoConstantesFunciones.activarid_empresaPoliticaProducto);//
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.setEnabled(isHabilitar && this.politicaproductoConstantesFunciones.activarid_sucursalPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.setEnabled(isHabilitar && this.politicaproductoConstantesFunciones.activarid_bodegaPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.setEnabled(isHabilitar && this.politicaproductoConstantesFunciones.activarid_productoPoliticaProducto);
	};
	
	public void setDefaultControlesPoliticaProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPoliticaProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.politicaproductoSessionBean.setConGuardarRelaciones(true);			
			this.politicaproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPoliticaProducto.jTabbedPaneRelacionesPoliticaProducto.setVisible(true);
			
					
		} else {
			//this.politicaproductoSessionBean.setConGuardarRelaciones(false);			
			this.politicaproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPoliticaProducto.jTabbedPaneRelacionesPoliticaProducto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPoliticaProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaProducto politicaproductoAux:this.politicaproductoLogic.getPoliticaProductos()) {
				if(politicaproductoAux.getId().equals(this.iIdNuevoPoliticaProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaProducto politicaproductoAux:this.politicaproductos) {
				if(politicaproductoAux.getId().equals(this.iIdNuevoPoliticaProducto)) {
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
	
	public int getIndiceActualPoliticaProducto(PoliticaProducto politicaproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaProducto politicaproductoAux:this.politicaproductoLogic.getPoliticaProductos()) {
				if(politicaproductoAux.getId().equals(politicaproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaProducto politicaproductoAux:this.politicaproductos) {
				if(politicaproductoAux.getId().equals(politicaproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPoliticaProducto(PoliticaProducto politicaproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaProducto politicaproductoAux:this.politicaproductoLogic.getPoliticaProductos()) {
				if(politicaproductoAux.getPoliticaProductoOriginal().getId().equals(politicaproductoOriginal.getId())) {
					existe=true;
					politicaproductoOriginal.setId(politicaproductoAux.getId());
					politicaproductoOriginal.setVersionRow(politicaproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaProducto politicaproductoAux:this.politicaproductos) {
				if(politicaproductoAux.getPoliticaProductoOriginal().getId().equals(politicaproductoOriginal.getId())) {
					existe=true;
					politicaproductoOriginal.setId(politicaproductoAux.getId());
					politicaproductoOriginal.setVersionRow(politicaproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPoliticaProducto(Boolean esParaCancelar) throws Exception {
		politicaproductosAux=new ArrayList<PoliticaProducto>();
		politicaproductoAux=new PoliticaProducto();
		
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PoliticaProducto politicaproductoAux:this.politicaproductoLogic.getPoliticaProductos()) {
					if(politicaproductoAux.getId()<0) {
						politicaproductosAux.add(politicaproductoAux);
					}		
				}
				this.iIdNuevoPoliticaProducto=0L;
				this.politicaproductoLogic.getPoliticaProductos().removeAll(politicaproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaProducto politicaproductoAux:this.politicaproductos) {
					if(politicaproductoAux.getId()<0) {
						politicaproductosAux.add(politicaproductoAux);
					}		
				}
				this.iIdNuevoPoliticaProducto=0L;
				this.politicaproductos.removeAll(politicaproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPoliticaProducto 
					&& this.politicaproductoLogic.getPoliticaProductos().size()>0
					) {
					politicaproductoAux=this.politicaproductoLogic.getPoliticaProductos().get(this.politicaproductoLogic.getPoliticaProductos().size() - 1);
				
					if(politicaproductoAux.getId()<0) {
						this.politicaproductoLogic.getPoliticaProductos().remove(politicaproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPoliticaProducto && this.politicaproductos.size()>0) {
					politicaproductoAux=this.politicaproductos.get(this.politicaproductos.size() - 1);
				
					if(politicaproductoAux.getId()<0) {
						this.politicaproductos.remove(politicaproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPoliticaProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(politicaproducto.getId()<0) {
				this.politicaproductoLogic.getPoliticaProductos().remove(this.politicaproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(politicaproducto.getId()<0) {
				this.politicaproductos.remove(this.politicaproducto);
			}
		}			
	}
	
	public void setEstadosInicialesPoliticaProducto(List<PoliticaProducto> politicaproductosAux) throws Exception {
		PoliticaProductoConstantesFunciones.setEstadosInicialesPoliticaProducto(politicaproductosAux);
	}
	
	public void setEstadosInicialesPoliticaProducto(PoliticaProducto politicaproductoAux) throws Exception {
		PoliticaProductoConstantesFunciones.setEstadosInicialesPoliticaProducto(politicaproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPoliticaProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPoliticaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPoliticaProductoActual()) {
				if(!this.isEsNuevoPoliticaProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPoliticaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPoliticaProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPoliticaProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Politica Producto ?", "MANTENIMIENTO DE Politica Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPoliticaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PoliticaProducto politicaproducto) throws Exception {
		PoliticaProductoConstantesFunciones.seleccionarAsignar(this.politicaproducto,politicaproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPoliticaProducto=this.isPermisoActualizarOriginalPoliticaProducto;
			
			
			this.seleccionarAsignar(politicaproducto);
			
			

			idProductoActual=politicaproducto.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PoliticaProductoConstantesFunciones.quitarEspaciosPoliticaProducto(this.politicaproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPoliticaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.politicaproductoSessionBean.setsFuncionBusquedaRapida(this.politicaproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoPoliticaProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPoliticaProducto(esParaCancelar);				
				this.cancelarNuevoPoliticaProducto(esParaCancelar);								
			}
			
			this.politicaproducto=new PoliticaProducto();
			
			this.inicializarPoliticaProducto();
			
			this.actualizarEstadoCeldasBotonesPoliticaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPoliticaProducto() throws Exception {
		try {
			PoliticaProductoConstantesFunciones.inicializarPoliticaProducto(this.politicaproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.politicaproductoLogic.getPoliticaProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePoliticaProductos(String sAccionBusqueda,List<PoliticaProducto> politicaproductosParaReportes) throws Exception {
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
					sPathReporteFinal="PoliticaProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PoliticaProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PoliticaProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PoliticaProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Politica Productos");		
		parameters.put("busquedapor", PoliticaProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePoliticaProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PoliticaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PoliticaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePoliticaProducto=new JRBeanArrayDataSource(PoliticaProductoJInternalFrame.TraerPoliticaProductoBeans(politicaproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePoliticaProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PoliticaProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PoliticaProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PoliticaProductoBean.TraerPoliticaProductoBeans(politicaproductosParaReportes).toArray()));
							
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
				this.generarExcelReportePoliticaProductos(sAccionBusqueda,sTipoArchivoReporte,politicaproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPoliticaProductos(sAccionBusqueda,sTipoArchivoReporte,politicaproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPoliticaProductoActionPerformed(null);
					//this.generarExcelReportePoliticaProductos(sAccionBusqueda,sTipoArchivoReporte,politicaproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPoliticaProductos(sAccionBusqueda,sTipoArchivoReporte,politicaproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPoliticaProductos(sAccionBusqueda,sTipoArchivoReporte,politicaproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPoliticaProductos(sAccionBusqueda,sTipoArchivoReporte,politicaproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePoliticaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<PoliticaProducto> politicaproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicaproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PoliticaProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPoliticaProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PoliticaProducto politicaproducto : politicaproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PoliticaProductoConstantesFunciones.generarExcelReporteDataPoliticaProducto("NORMAL",row,workbook,politicaproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPoliticaProducto(String sTipo,Row row,Workbook workbook) {
		
		PoliticaProductoConstantesFunciones.generarExcelReporteHeaderPoliticaProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPoliticaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<PoliticaProducto> politicaproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicaproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PoliticaProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PoliticaProducto politicaproducto : politicaproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PoliticaProductoConstantesFunciones.getPoliticaProductoDescripcion(politicaproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicaproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicaproducto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaProductoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicaproducto.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(politicaproducto.getproducto_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPoliticaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<PoliticaProducto> politicaproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PoliticaProducto> politicaproductosRespaldo=null;
		
		classes=PoliticaProductoConstantesFunciones.getClassesRelationshipsOfPoliticaProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.politicaproductoLogic.setDatosCliente(this.datosCliente);
		this.politicaproductoLogic.setDatosDeep(this.datosDeep);
		this.politicaproductoLogic.setIsConDeep(true);
		
		politicaproductosRespaldo=this.politicaproductoLogic.getPoliticaProductos();
		
		this.politicaproductoLogic.setPoliticaProductos(politicaproductosParaReportes);	
		this.politicaproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		politicaproductosParaReportes=this.politicaproductoLogic.getPoliticaProductos();
		this.politicaproductoLogic.setPoliticaProductos(politicaproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicaproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PoliticaProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPoliticaProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PoliticaProducto politicaproducto : politicaproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPoliticaProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PoliticaProductoConstantesFunciones.generarExcelReporteDataPoliticaProducto("NORMAL",row,workbook,politicaproducto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PoliticaProductoConstantesFunciones.getPoliticaProductoDescripcion(politicaproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPoliticaProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPoliticaProducto() throws Exception {		
		this.startProcessPoliticaProducto(true);
	}
	
	public void startProcessPoliticaProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPoliticaProducto ,this.jPanelParametrosReportesPoliticaProducto, this.jScrollPanelDatosPoliticaProducto,this.jPanelPaginacionPoliticaProducto, this.jScrollPanelDatosEdicionPoliticaProducto, this.jPanelAccionesPoliticaProducto,this.jPanelAccionesFormularioPoliticaProducto,this.jmenuBarPoliticaProducto,this.jmenuBarDetallePoliticaProducto,this.jTtoolBarPoliticaProducto,this.jTtoolBarDetallePoliticaProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasPoliticaProducto=this.jTabbedPaneBusquedasPoliticaProducto; 
		
		final JPanel jPanelParametrosReportesPoliticaProducto=this.jPanelParametrosReportesPoliticaProducto;
		//final JScrollPane jScrollPanelDatosPoliticaProducto=this.jScrollPanelDatosPoliticaProducto;
		final JTable jTableDatosPoliticaProducto=this.jTableDatosPoliticaProducto;		
		final JPanel jPanelPaginacionPoliticaProducto=this.jPanelPaginacionPoliticaProducto;
		//final JScrollPane jScrollPanelDatosEdicionPoliticaProducto=this.jScrollPanelDatosEdicionPoliticaProducto;
		final JPanel jPanelAccionesPoliticaProducto=this.jPanelAccionesPoliticaProducto;
		
		JPanel jPanelCamposAuxiliarPoliticaProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPoliticaProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			jPanelCamposAuxiliarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jPanelCamposPoliticaProducto;
			jPanelAccionesFormularioAuxiliarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jPanelAccionesFormularioPoliticaProducto;
		}
		
		final JPanel jPanelCamposPoliticaProducto=jPanelCamposAuxiliarPoliticaProducto;
		final JPanel jPanelAccionesFormularioPoliticaProducto=jPanelAccionesFormularioAuxiliarPoliticaProducto;
		
		
		final JMenuBar jmenuBarPoliticaProducto=this.jmenuBarPoliticaProducto;
		final JToolBar jTtoolBarPoliticaProducto=this.jTtoolBarPoliticaProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPoliticaProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPoliticaProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			jmenuBarDetalleAuxiliarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jmenuBarDetallePoliticaProducto;
			jTtoolBarDetalleAuxiliarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jTtoolBarDetallePoliticaProducto;
		}
		
		final JMenuBar jmenuBarDetallePoliticaProducto=jmenuBarDetalleAuxiliarPoliticaProducto;
		final JToolBar jTtoolBarDetallePoliticaProducto=jTtoolBarDetalleAuxiliarPoliticaProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPoliticaProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPoliticaProducto;
			processRunnable.jTableDatos=jTableDatosPoliticaProducto;
			processRunnable.jPanelCampos=jPanelCamposPoliticaProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPoliticaProducto;
			processRunnable.jPanelAcciones=jPanelAccionesPoliticaProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPoliticaProducto;
			
			
			processRunnable.jmenuBar=jmenuBarPoliticaProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePoliticaProducto;
			processRunnable.jTtoolBar=jTtoolBarPoliticaProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePoliticaProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPoliticaProducto ,jPanelParametrosReportesPoliticaProducto,jTableDatosPoliticaProducto, /*jScrollPanelDatosPoliticaProducto,*/jPanelCamposPoliticaProducto,jPanelPaginacionPoliticaProducto, /*jScrollPanelDatosEdicionPoliticaProducto,*/ jPanelAccionesPoliticaProducto,jPanelAccionesFormularioPoliticaProducto,jmenuBarPoliticaProducto,jmenuBarDetallePoliticaProducto,jTtoolBarPoliticaProducto,jTtoolBarDetallePoliticaProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPoliticaProducto ,jPanelParametrosReportesPoliticaProducto, jScrollPanelDatosPoliticaProducto,jPanelPaginacionPoliticaProducto, jScrollPanelDatosEdicionPoliticaProducto, jPanelAccionesPoliticaProducto,jPanelAccionesFormularioPoliticaProducto,jmenuBarPoliticaProducto,jmenuBarDetallePoliticaProducto,jTtoolBarPoliticaProducto,jTtoolBarDetallePoliticaProducto);
						
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
	
	public void finishProcessPoliticaProducto() {// throws Exception 
		this.finishProcessPoliticaProducto(true);
	}
	
	public void finishProcessPoliticaProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPoliticaProducto ,this.jPanelParametrosReportesPoliticaProducto, this.jScrollPanelDatosPoliticaProducto,this.jPanelPaginacionPoliticaProducto, this.jScrollPanelDatosEdicionPoliticaProducto, this.jPanelAccionesPoliticaProducto,this.jPanelAccionesFormularioPoliticaProducto,this.jmenuBarPoliticaProducto,this.jmenuBarDetallePoliticaProducto,this.jTtoolBarPoliticaProducto,this.jTtoolBarDetallePoliticaProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasPoliticaProducto=this.jTabbedPaneBusquedasPoliticaProducto; 
		
		final JPanel jPanelParametrosReportesPoliticaProducto=this.jPanelParametrosReportesPoliticaProducto;
		//final JScrollPane jScrollPanelDatosPoliticaProducto=this.jScrollPanelDatosPoliticaProducto;
		final JTable jTableDatosPoliticaProducto=this.jTableDatosPoliticaProducto;		
		final JPanel jPanelPaginacionPoliticaProducto=this.jPanelPaginacionPoliticaProducto;
		//final JScrollPane jScrollPanelDatosEdicionPoliticaProducto=this.jScrollPanelDatosEdicionPoliticaProducto;
		final JPanel jPanelAccionesPoliticaProducto=this.jPanelAccionesPoliticaProducto;
		
		JPanel jPanelCamposAuxiliarPoliticaProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPoliticaProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			jPanelCamposAuxiliarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jPanelCamposPoliticaProducto;
			jPanelAccionesFormularioAuxiliarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jPanelAccionesFormularioPoliticaProducto;
		}
		
		final JPanel jPanelCamposPoliticaProducto=jPanelCamposAuxiliarPoliticaProducto;
		final JPanel jPanelAccionesFormularioPoliticaProducto=jPanelAccionesFormularioAuxiliarPoliticaProducto;
		
		
		final JMenuBar jmenuBarPoliticaProducto=this.jmenuBarPoliticaProducto;		
		final JToolBar jTtoolBarPoliticaProducto=this.jTtoolBarPoliticaProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarPoliticaProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPoliticaProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			jmenuBarDetalleAuxiliarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jmenuBarDetallePoliticaProducto;
			jTtoolBarDetalleAuxiliarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jTtoolBarDetallePoliticaProducto;		
		}
		
		final JMenuBar jmenuBarDetallePoliticaProducto=jmenuBarDetalleAuxiliarPoliticaProducto;
		final JToolBar jTtoolBarDetallePoliticaProducto=jTtoolBarDetalleAuxiliarPoliticaProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPoliticaProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPoliticaProducto;
			processRunnable.jTableDatos=jTableDatosPoliticaProducto;
			processRunnable.jPanelCampos=jPanelCamposPoliticaProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPoliticaProducto;
			processRunnable.jPanelAcciones=jPanelAccionesPoliticaProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPoliticaProducto;
			
			
			processRunnable.jmenuBar=jmenuBarPoliticaProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePoliticaProducto;
			processRunnable.jTtoolBar=jTtoolBarPoliticaProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePoliticaProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPoliticaProducto ,jPanelParametrosReportesPoliticaProducto, jTableDatosPoliticaProducto,/*jScrollPanelDatosPoliticaProducto,*/jPanelCamposPoliticaProducto,jPanelPaginacionPoliticaProducto, /*jScrollPanelDatosEdicionPoliticaProducto,*/ jPanelAccionesPoliticaProducto,jPanelAccionesFormularioPoliticaProducto,jmenuBarPoliticaProducto,jmenuBarDetallePoliticaProducto,jTtoolBarPoliticaProducto,jTtoolBarDetallePoliticaProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPoliticaProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPoliticaProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPoliticaProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPoliticaProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPoliticaProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePoliticaProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPoliticaProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPoliticaProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePoliticaProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.politicaproductoConstantesFunciones.getsFinalQueryPoliticaProducto();
		String  finalQueryPaginacionTodos=this.politicaproductoConstantesFunciones.getsFinalQueryPoliticaProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PoliticaProductoConstantesFunciones.getArrayColumnasGlobalesNoPoliticaProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PoliticaProductoConstantesFunciones.getArrayColumnasGlobalesPoliticaProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PoliticaProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.politicaproductosEliminados= new ArrayList<PoliticaProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPoliticaProducto();
		
				///*PoliticaProductoSessionBean*/this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
			
			if(this.politicaproductoSessionBean==null) {
				this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
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
					this.iNumeroPaginacion=PoliticaProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PoliticaProductoConstantesFunciones.getClassesForeignKeysOfPoliticaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/politicaproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			politicaproductosAux= new ArrayList<PoliticaProducto>();
			
				
			politicaproductoLogic.setDatosCliente(this.datosCliente);
			politicaproductoLogic.setDatosDeep(this.datosDeep);
			politicaproductoLogic.setIsConDeep(true);
			
			
			politicaproductoLogic.getPoliticaProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					politicaproductoLogic.getTodosPoliticaProductos(finalQueryGlobal,pagination);
					
					//politicaproductoLogic.getTodosPoliticaProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(politicaproductoLogic.getPoliticaProductos()==null|| politicaproductoLogic.getPoliticaProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							politicaproductosAux= new ArrayList<PoliticaProducto>();
							politicaproductosAux.addAll(politicaproductoLogic.getPoliticaProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductosAux= new ArrayList<PoliticaProducto>();
							politicaproductosAux.addAll(politicaproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							politicaproductoLogic.getTodosPoliticaProductos(finalQueryGlobal+"",this.pagination);												
							
							//politicaproductoLogic.getTodosPoliticaProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePoliticaProductos("Todos",politicaproductoLogic.getPoliticaProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							politicaproductoLogic.setPoliticaProductos(new ArrayList<PoliticaProducto>());					
							politicaproductoLogic.getPoliticaProductos().addAll(politicaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductos=new ArrayList<PoliticaProducto>();
							politicaproductos.addAll(politicaproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPoliticaProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPoliticaProducto=this.idActual;
				
				} else if(this.idPoliticaProductoActual!=null && this.idPoliticaProductoActual!=0L) {
					idPoliticaProducto=idPoliticaProductoActual;
				}
				
					
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndicePorId(idPoliticaProducto);
				
				this.politicaproductos=new ArrayList<PoliticaProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					politicaproductoLogic.getEntity(idPoliticaProducto);
					
					//politicaproductoLogic.getEntityWithConnection(idPoliticaProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaproductoLogic.setPoliticaProductos(new ArrayList<PoliticaProducto>());
					politicaproductoLogic.getPoliticaProductos().add(politicaproductoLogic.getPoliticaProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicaproductos=new ArrayList<PoliticaProducto>();
					this.politicaproductos.add(politicaproducto);
				}
				
				if(politicaproductoLogic.getPoliticaProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicaproductoLogic.getPoliticaProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicaproductoLogic.getPoliticaProductos()==null||politicaproductoLogic.getPoliticaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicaproductos==null|| politicaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductosAux=new ArrayList<PoliticaProducto>();
						politicaproductosAux.addAll(politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductosAux=new ArrayList<PoliticaProducto>();
							politicaproductosAux.addAll(politicaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicaproductoLogic.getPoliticaProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaProductos("FK_IdBodega",politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaProductos("FK_IdBodega",politicaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductoLogic.setPoliticaProductos(new ArrayList<PoliticaProducto>());
						politicaproductoLogic.getPoliticaProductos().addAll(politicaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductos=new ArrayList<PoliticaProducto>();
							politicaproductos.addAll(politicaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicaproductoLogic.getPoliticaProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicaproductoLogic.getPoliticaProductos()==null||politicaproductoLogic.getPoliticaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicaproductos==null|| politicaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductosAux=new ArrayList<PoliticaProducto>();
						politicaproductosAux.addAll(politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductosAux=new ArrayList<PoliticaProducto>();
							politicaproductosAux.addAll(politicaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicaproductoLogic.getPoliticaProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaProductos("FK_IdEmpresa",politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaProductos("FK_IdEmpresa",politicaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductoLogic.setPoliticaProductos(new ArrayList<PoliticaProducto>());
						politicaproductoLogic.getPoliticaProductos().addAll(politicaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductos=new ArrayList<PoliticaProducto>();
							politicaproductos.addAll(politicaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicaproductoLogic.getPoliticaProductosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicaproductoLogic.getPoliticaProductos()==null||politicaproductoLogic.getPoliticaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicaproductos==null|| politicaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductosAux=new ArrayList<PoliticaProducto>();
						politicaproductosAux.addAll(politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductosAux=new ArrayList<PoliticaProducto>();
							politicaproductosAux.addAll(politicaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicaproductoLogic.getPoliticaProductosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaProductos("FK_IdProducto",politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaProductos("FK_IdProducto",politicaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductoLogic.setPoliticaProductos(new ArrayList<PoliticaProducto>());
						politicaproductoLogic.getPoliticaProductos().addAll(politicaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductos=new ArrayList<PoliticaProducto>();
							politicaproductos.addAll(politicaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					politicaproductoLogic.getPoliticaProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=politicaproductoLogic.getPoliticaProductos()==null||politicaproductoLogic.getPoliticaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=politicaproductos==null|| politicaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductosAux=new ArrayList<PoliticaProducto>();
						politicaproductosAux.addAll(politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductosAux=new ArrayList<PoliticaProducto>();
							politicaproductosAux.addAll(politicaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							politicaproductoLogic.getPoliticaProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PoliticaProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePoliticaProductos("FK_IdSucursal",politicaproductoLogic.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePoliticaProductos("FK_IdSucursal",politicaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductoLogic.setPoliticaProductos(new ArrayList<PoliticaProducto>());
						politicaproductoLogic.getPoliticaProductos().addAll(politicaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductos=new ArrayList<PoliticaProducto>();
							politicaproductos.addAll(politicaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPoliticaProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPoliticaProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=politicaproductoLogic.getPoliticaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicaproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=politicaproductoLogic.getPoliticaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicaproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PoliticaProducto politicaproducto) {
		Boolean permite=true;
		
		if(this.politicaproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PoliticaProductoConstantesFunciones.getOrderByListaPoliticaProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PoliticaProductoConstantesFunciones.getOrderByListaPoliticaProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaProducto politicaproducto:politicaproductoLogic.getPoliticaProductos()) {
				if(politicaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					politicaproductoTotales=politicaproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaProducto politicaproducto:this.politicaproductos) {
				if(politicaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					politicaproductoTotales=politicaproducto;
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
			this.politicaproductoAux=new PoliticaProducto();
			this.politicaproductoAux.setsType(Constantes2.S_TOTALES);
			this.politicaproductoAux.setIsNew(false);
			this.politicaproductoAux.setIsChanged(false);
			this.politicaproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PoliticaProductoConstantesFunciones.TotalizarValoresFilaPoliticaProducto(this.politicaproductoLogic.getPoliticaProductos(),this.politicaproductoAux);
				
				this.politicaproductoLogic.getPoliticaProductos().add(this.politicaproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PoliticaProductoConstantesFunciones.TotalizarValoresFilaPoliticaProducto(this.politicaproductos,this.politicaproductoAux);
				
				this.politicaproductos.add(this.politicaproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		politicaproductoTotales=new PoliticaProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.politicaproductoLogic.getPoliticaProductos().remove(politicaproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.politicaproductos.remove(politicaproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		politicaproductoTotales=new PoliticaProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PoliticaProducto politicaproducto:politicaproductoLogic.getPoliticaProductos()) {
				if(politicaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					politicaproductoTotales=politicaproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PoliticaProductoConstantesFunciones.TotalizarValoresFilaPoliticaProducto(this.politicaproductoLogic.getPoliticaProductos(),politicaproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PoliticaProducto politicaproducto:this.politicaproductos) {
				if(politicaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					politicaproductoTotales=politicaproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PoliticaProductoConstantesFunciones.TotalizarValoresFilaPoliticaProducto(this.politicaproductos,politicaproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPoliticaProductosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPoliticaProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPoliticaProductosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPoliticaProductosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPoliticaProductosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaproductoLogic.getPoliticaProductosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPoliticaProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaproductoLogic.getPoliticaProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPoliticaProductosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaproductoLogic.getPoliticaProductosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPoliticaProductosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaproductoLogic.getPoliticaProductosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosPoliticaProducto() {
		this.isPermisoTodoPoliticaProducto=false;
		this.isPermisoNuevoPoliticaProducto=false;
		this.isPermisoActualizarPoliticaProducto=false;
		this.isPermisoActualizarOriginalPoliticaProducto=false;
		this.isPermisoEliminarPoliticaProducto=false;
		this.isPermisoGuardarCambiosPoliticaProducto=false;
		this.isPermisoConsultaPoliticaProducto=false;
		this.isPermisoBusquedaPoliticaProducto=false;
		this.isPermisoReportePoliticaProducto=false;		
		this.isPermisoOrdenPoliticaProducto=false;		
		this.isPermisoPaginacionMedioPoliticaProducto=false;		
		this.isPermisoPaginacionAltoPoliticaProducto=false;
		this.isPermisoPaginacionTodoPoliticaProducto=false;
		this.isPermisoCopiarPoliticaProducto=false;		
		this.isPermisoVerFormPoliticaProducto=false;		
		this.isPermisoDuplicarPoliticaProducto=false;		
		this.isPermisoOrdenPoliticaProducto=false;		
	}
	
	public void setPermisosUsuarioPoliticaProducto(Boolean isPermiso) {
		this.isPermisoTodoPoliticaProducto=isPermiso;
		this.isPermisoNuevoPoliticaProducto=isPermiso;
		this.isPermisoActualizarPoliticaProducto=isPermiso;
		this.isPermisoActualizarOriginalPoliticaProducto=isPermiso;
		this.isPermisoEliminarPoliticaProducto=isPermiso;
		this.isPermisoGuardarCambiosPoliticaProducto=isPermiso;
		this.isPermisoConsultaPoliticaProducto=isPermiso;
		this.isPermisoBusquedaPoliticaProducto=isPermiso;
		this.isPermisoReportePoliticaProducto=isPermiso;
		this.isPermisoOrdenPoliticaProducto=isPermiso;		
		this.isPermisoPaginacionMedioPoliticaProducto=isPermiso;		
		this.isPermisoPaginacionAltoPoliticaProducto=isPermiso;		
		this.isPermisoPaginacionTodoPoliticaProducto=isPermiso;		
		this.isPermisoCopiarPoliticaProducto=isPermiso;		
		this.isPermisoVerFormPoliticaProducto=isPermiso;		
		this.isPermisoDuplicarPoliticaProducto=isPermiso;
		this.isPermisoOrdenPoliticaProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPoliticaProducto(Boolean isPermiso) {
		//this.isPermisoTodoPoliticaProducto=isPermiso;
		this.isPermisoNuevoPoliticaProducto=isPermiso;
		this.isPermisoActualizarPoliticaProducto=isPermiso;
		this.isPermisoActualizarOriginalPoliticaProducto=isPermiso;
		this.isPermisoEliminarPoliticaProducto=isPermiso;
		this.isPermisoGuardarCambiosPoliticaProducto=isPermiso;
		//this.isPermisoConsultaPoliticaProducto=isPermiso;
		//this.isPermisoBusquedaPoliticaProducto=isPermiso;
		//this.isPermisoReportePoliticaProducto=isPermiso;
		//this.isPermisoOrdenPoliticaProducto=isPermiso;		
		//this.isPermisoPaginacionMedioPoliticaProducto=isPermiso;		
		//this.isPermisoPaginacionAltoPoliticaProducto=isPermiso;		
		//this.isPermisoPaginacionTodoPoliticaProducto=isPermiso;		
		//this.isPermisoCopiarPoliticaProducto=isPermiso;		
		//this.isPermisoDuplicarPoliticaProducto=isPermiso;
		//this.isPermisoOrdenPoliticaProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPoliticaProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PoliticaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPoliticaProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPoliticaProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPoliticaProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPoliticaProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPoliticaProductoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPoliticaProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PoliticaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PoliticaProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPoliticaProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPoliticaProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPoliticaProducto=this.isPermisoActualizarPoliticaProducto;
			this.isPermisoEliminarPoliticaProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPoliticaProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPoliticaProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPoliticaProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPoliticaProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePoliticaProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPoliticaProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPoliticaProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPoliticaProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPoliticaProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPoliticaProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPoliticaProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPoliticaProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPoliticaProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPoliticaProducto.setToolTipText(this.jTableDatosPoliticaProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPoliticaProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPoliticaProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PoliticaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PoliticaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPoliticaProducto() throws Exception {
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
	public void inicializarCombosForeignKeyPoliticaProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPoliticaProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PoliticaProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPoliticaProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyPoliticaProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PoliticaProductoParameterReturnGeneral politicaproductoReturnGeneral=new PoliticaProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.politicaproductoConstantesFunciones.cargarid_empresaPoliticaProducto)
					 || (this.esRecargarFks && this.politicaproductoConstantesFunciones.cargarid_empresaPoliticaProducto)) {

					if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+politicaproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.politicaproductoConstantesFunciones.cargarid_sucursalPoliticaProducto)
					 || (this.esRecargarFks && this.politicaproductoConstantesFunciones.cargarid_sucursalPoliticaProducto)) {

					if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+politicaproductoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.politicaproductoConstantesFunciones.cargarid_bodegaPoliticaProducto)
					 || (this.esRecargarFks && this.politicaproductoConstantesFunciones.cargarid_bodegaPoliticaProducto)) {

					if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+politicaproductoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.politicaproductoConstantesFunciones.cargarid_productoPoliticaProducto)
					 || (this.esRecargarFks && this.politicaproductoConstantesFunciones.cargarid_productoPoliticaProducto)) {

					if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+politicaproductoSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				politicaproductoReturnGeneral=politicaproductoLogic.cargarCombosLoteForeignKeyPoliticaProducto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=politicaproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=politicaproductoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=politicaproductoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=politicaproductoReturnGeneral.getproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPoliticaProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.politicaproductoSessionBean==null) {
				this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
			}

			if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.politicaproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyPoliticaProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPoliticaProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPoliticaProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPoliticaProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPoliticaProducto(PoliticaProducto politicaproducto)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(politicaproducto.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(politicaproducto.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPoliticaProducto(PoliticaProducto politicaproducto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(politicaproducto.getProducto()!=null && !sTipoEvento.equals("id_productoPoliticaProducto")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(politicaproducto.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPoliticaProducto()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.politicaproductoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.politicaproductoConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPoliticaProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPoliticaProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPoliticaProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPoliticaProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPoliticaProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPoliticaProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPoliticaProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto!=null && this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto!=null && this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto!=null && this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto!=null && this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public PoliticaProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PoliticaProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PoliticaProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.politicaproductoSessionBean=new PoliticaProductoSessionBean(); 
		this.politicaproductoConstantesFunciones=new PoliticaProductoConstantesFunciones(); 
		this.politicaproductoBean=new PoliticaProducto();//(this.politicaproductoConstantesFunciones); 		
		this.politicaproductoReturnGeneral=new PoliticaProductoParameterReturnGeneral(); 
		
		this.politicaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PoliticaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PoliticaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PoliticaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPoliticaProducto(true);
			
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
			
			this.politicaproductoConstantesFunciones=new PoliticaProductoConstantesFunciones(); 
			this.politicaproductoBean=new PoliticaProducto();//this.politicaproductoConstantesFunciones); 			
			this.politicaproductoReturnGeneral=new PoliticaProductoParameterReturnGeneral(); 
		
			PoliticaProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Politica Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.politicaproducto=new PoliticaProducto();
			this.politicaproductos = new ArrayList<PoliticaProducto>();
			this.politicaproductosAux = new ArrayList<PoliticaProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic=new PoliticaProductoLogic();
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.politicaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.politicaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPoliticaProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPoliticaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPoliticaProducto);	
					}
					
					if(this.jInternalFrameImportacionPoliticaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPoliticaProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPoliticaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPoliticaProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPoliticaProducto);
				this.jInternalFrameDetalleFormPoliticaProducto.setVisible(false);
				this.jInternalFrameDetalleFormPoliticaProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPoliticaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPoliticaProducto);
					this.jInternalFrameReporteDinamicoPoliticaProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoPoliticaProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPoliticaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPoliticaProducto);
					this.jInternalFrameImportacionPoliticaProducto.setVisible(false);
					this.jInternalFrameImportacionPoliticaProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPoliticaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPoliticaProducto);
					this.jInternalFrameOrderByPoliticaProducto.setVisible(false);
					this.jInternalFrameOrderByPoliticaProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPoliticaProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PoliticaProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.politicaproductoReturnGeneral=new PoliticaProductoParameterReturnGeneral();
			
			this.politicaproductoParameterGeneral=new PoliticaProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.politicaproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PoliticaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PoliticaProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.politicaproductoSessionBean.getEsGuardarRelacionado(),this.politicaproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PoliticaProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.politicaproductoSessionBean.getEsGuardarRelacionado(),this.politicaproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPoliticaProducto=false;
			this.isVisibilidadCeldaDuplicarPoliticaProducto=true;
			this.isVisibilidadCeldaCopiarPoliticaProducto=true;
			this.isVisibilidadCeldaVerFormPoliticaProducto=true;
			this.isVisibilidadCeldaOrdenPoliticaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;
			this.isVisibilidadCeldaModificarPoliticaProducto=false;
			this.isVisibilidadCeldaActualizarPoliticaProducto=false;
			this.isVisibilidadCeldaEliminarPoliticaProducto=false;
			this.isVisibilidadCeldaCancelarPoliticaProducto=false;
			this.isVisibilidadCeldaGuardarPoliticaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPoliticaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPoliticaProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPoliticaProducto(false);
			
			this.setPermisosUsuarioPoliticaProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.politicaproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.politicaproductoSessionBean.getEsGuardarRelacionado() && this.politicaproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPoliticaProductoClasesRelacionadas();
			}
			
			if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPoliticaProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPoliticaProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPoliticaProducto();
			}
			
			if(!this.isPermisoBusquedaPoliticaProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPoliticaProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPoliticaProducto,this.isPermisoPaginacionMedioPoliticaProducto,this.isPermisoPaginacionTodoPoliticaProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PoliticaProductoConstantesFunciones.getTiposSeleccionarPoliticaProducto());
				
				this.tiposColumnasSelect=PoliticaProductoConstantesFunciones.getTiposSeleccionarPoliticaProducto(true);
				
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
			//if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPoliticaProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPoliticaProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPoliticaProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaProducto() ;
			
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
			this.bodegaLogic=new BodegaLogic();
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
				politicaproductoImplementable= (PoliticaProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PoliticaProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				politicaproductoImplementableHome= (PoliticaProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PoliticaProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.politicaproductos= new ArrayList<PoliticaProducto>();
			this.politicaproductosEliminados= new ArrayList<PoliticaProducto>();
						
			this.isEsNuevoPoliticaProducto=false;
			this.esParaAccionDesdeFormularioPoliticaProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPoliticaProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPoliticaProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PoliticaProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PoliticaProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPoliticaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPoliticaProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPoliticaProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPoliticaProducto();
			}
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPoliticaProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPoliticaProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPoliticaProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPoliticaProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PoliticaProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPoliticaProducto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPoliticaProducto")) {
				iIndex=this.jInternalFrameDetalleFormPoliticaProducto.jTabbedPaneRelacionesPoliticaProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPoliticaProducto.jTabbedPaneRelacionesPoliticaProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPoliticaProducto();	
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
	
	public void cargarCombosForeignKeyPoliticaProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPoliticaProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPoliticaProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPoliticaProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPoliticaProducto();
		
		this.cargarCombosFrameForeignKeyPoliticaProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPoliticaProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPoliticaProducto();
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
	
	public void jButtonNuevoPoliticaProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
			
			if(jTableDatosPoliticaProducto.getRowCount()>=1) {
				jTableDatosPoliticaProducto.removeRowSelectionInterval(0, jTableDatosPoliticaProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoPoliticaProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPoliticaProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPoliticaProducto(true);			
			//this.politicaproducto=new PoliticaProducto();
			//this.politicaproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPoliticaProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaProducto() ;
			
			if(PoliticaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePoliticaProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.politicaproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);				
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
			if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PoliticaProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPoliticaProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPoliticaProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPoliticaProducto.getSelectedRows().length;			
			}
			
			politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPoliticaProducto--;			
				//PoliticaProducto politicaproductoAux= new PoliticaProducto();			
				//politicaproductoAux.setId(this.iIdNuevoPoliticaProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PoliticaProducto politicaproductoOrigen=new PoliticaProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PoliticaProducto politicaproductoOrigen : politicaproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							politicaproductoOrigen =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							politicaproductoOrigen =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPoliticaProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.politicaproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPoliticaProducto(politicaproductoOrigen,this.politicaproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.politicaproductoLogic.getPoliticaProductos().add(this.politicaproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.politicaproductos.add(this.politicaproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPoliticaProducto(false);
				
				this.jTableDatosPoliticaProducto.setRowSelectionInterval(this.getIndiceNuevoPoliticaProducto(), this.getIndiceNuevoPoliticaProducto());
				
				int iLastRow =  this.jTableDatosPoliticaProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPoliticaProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPoliticaProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPoliticaProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();									
		
			PoliticaProducto politicaproductoOrigen=new PoliticaProducto();
			PoliticaProducto politicaproductoDestino=new PoliticaProducto();
				
			politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPoliticaProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || politicaproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPoliticaProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductoOrigen =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						politicaproductoOrigen =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						politicaproductoDestino =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						politicaproductoDestino =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				politicaproductoOrigen =politicaproductosSeleccionados.get(0);
				politicaproductoDestino =politicaproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPoliticaProducto(politicaproductoOrigen,politicaproductoDestino,true,false);
				
				politicaproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(politicaproductoDestino,politicaproductoLogic.getPoliticaProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(politicaproductoDestino,politicaproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPoliticaProducto(false);
				
				//this.jTableDatosPoliticaProducto.setRowSelectionInterval(this.getIndiceNuevoPoliticaProducto(), this.getIndiceNuevoPoliticaProducto());
				
				int iLastRow =  this.jTableDatosPoliticaProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPoliticaProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPoliticaProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPoliticaProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPoliticaProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPoliticaProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPoliticaProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPoliticaProducto.setVisible(!isVisible);
			this.jPanelPaginacionPoliticaProducto.setVisible(!isVisible);
			this.jPanelAccionesPoliticaProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePoliticaProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPoliticaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPoliticaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPoliticaProducto();
			
			this.abrirFrameOrderByPoliticaProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPoliticaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePoliticaProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPoliticaProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPoliticaProducto.isMaximum()) {
					this.jInternalFrameDetalleFormPoliticaProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPoliticaProducto.setSize(this.jInternalFrameDetalleFormPoliticaProducto.iWidthFormulario,this.jInternalFrameDetalleFormPoliticaProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPoliticaProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPoliticaProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPoliticaProducto.isMaximum()) {
						this.jInternalFrameDetalleFormPoliticaProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPoliticaProducto.jContentPaneDetallePoliticaProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPoliticaProducto.jTabbedPaneRelacionesPoliticaProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPoliticaProducto.jContentPaneDetallePoliticaProducto.getWidth(),PoliticaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPoliticaProducto.jTabbedPaneRelacionesPoliticaProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPoliticaProducto.jContentPaneDetallePoliticaProducto.getWidth(),PoliticaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPoliticaProducto.jTabbedPaneRelacionesPoliticaProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPoliticaProducto.jContentPaneDetallePoliticaProducto.getWidth(),PoliticaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPoliticaProducto.setVisible(true);
	        this.jInternalFrameDetalleFormPoliticaProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPoliticaProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPoliticaProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPoliticaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaProducto,false,this);
				} else {
					this.jInternalFrameOrderByPoliticaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPoliticaProducto);
				this.jInternalFrameOrderByPoliticaProducto.setVisible(false);
				this.jInternalFrameOrderByPoliticaProducto.setSelected(false);
				
				this.jInternalFrameOrderByPoliticaProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPoliticaProducto"));
				
				this.inicializarActualizarBindingTablaOrderByPoliticaProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPoliticaProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPoliticaProducto==null) {
				
				this.jInternalFrameImportacionPoliticaProducto=new ImportacionJInternalFrame(PoliticaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPoliticaProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPoliticaProducto);
				this.jInternalFrameImportacionPoliticaProducto.setVisible(false);
				this.jInternalFrameImportacionPoliticaProducto.setSelected(false);


				this.jInternalFrameImportacionPoliticaProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPoliticaProducto"));
				this.jInternalFrameImportacionPoliticaProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPoliticaProducto"));
				this.jInternalFrameImportacionPoliticaProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPoliticaProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPoliticaProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPoliticaProducto==null) {
				this.jInternalFrameReporteDinamicoPoliticaProducto=new ReporteDinamicoJInternalFrame(PoliticaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPoliticaProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPoliticaProducto);
				this.jInternalFrameReporteDinamicoPoliticaProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoPoliticaProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPoliticaProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPoliticaProducto"));
				this.jInternalFrameReporteDinamicoPoliticaProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPoliticaProducto"));
				this.jInternalFrameReporteDinamicoPoliticaProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPoliticaProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPoliticaProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePoliticaProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPoliticaProducto);
			
	       	this.jInternalFrameDetalleFormPoliticaProducto.setVisible(false);
	        this.jInternalFrameDetalleFormPoliticaProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormPoliticaProducto.dispose();
			//this.jInternalFrameDetalleFormPoliticaProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPoliticaProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPoliticaProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoPoliticaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPoliticaProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPoliticaProducto.setVisible(true);
	        this.jInternalFrameImportacionPoliticaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPoliticaProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPoliticaProducto.setVisible(true);
	        this.jInternalFrameOrderByPoliticaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPoliticaProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPoliticaProducto.setVisible(false);
	        this.jInternalFrameOrderByPoliticaProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPoliticaProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPoliticaProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoPoliticaProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPoliticaProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPoliticaProducto.setVisible(false);
	        this.jInternalFrameImportacionPoliticaProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPoliticaProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPoliticaProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPoliticaProducto(true);
			//this.isEsNuevoPoliticaProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPoliticaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPoliticaProducto(false) ;
			
			if(politicaproductoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PoliticaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePoliticaProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPoliticaProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPoliticaProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPoliticaProducto(true);
			//this.isEsNuevoPoliticaProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.politicaproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPoliticaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPoliticaProducto(false) ;
			
			if(PoliticaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePoliticaProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.politicaproductoConstantesFunciones.cargarid_productoPoliticaProducto) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPoliticaProducto(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosPoliticaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,PoliticaProductoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPoliticaProducto.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosPoliticaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPoliticaProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPoliticaProducto(false);
			
			//if(!this.isEsNuevoPoliticaProducto) {								
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
				
			}
			
			if(this.permiteMantenimiento(this.politicaproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPoliticaProducto=true;
					this.inicializarActualizarBindingTablaPoliticaProducto(false);
					this.isEsNuevoPoliticaProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPoliticaProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPoliticaProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPoliticaProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPoliticaProducto(false);
				
				this.habilitarDeshabilitarControlesPoliticaProducto(false);
			
												
				
				if(PoliticaProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePoliticaProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPoliticaProductoActionPerformed(evt,politicaproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPoliticaProducto(this.politicaproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPoliticaProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,politicaproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.politicaproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				this.politicaproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				this.politicaproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.politicaproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PoliticaProductoModel) this.jTableDatosPoliticaProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPoliticaProducto=true;
				this.inicializarActualizarBindingTablaPoliticaProducto(false);
				this.isEsNuevoPoliticaProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPoliticaProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPoliticaProducto(false);
				
				this.habilitarDeshabilitarControlesPoliticaProducto(false);
				
				
				
				if(PoliticaProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePoliticaProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPoliticaProducto.getRowCount()>=1) {
				jTableDatosPoliticaProducto.removeRowSelectionInterval(0, jTableDatosPoliticaProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPoliticaProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPoliticaProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPoliticaProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPoliticaProducto(false) ;
			
			this.isEsNuevoPoliticaProducto=false;
			
			if(PoliticaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePoliticaProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPoliticaProducto(false);
				
				//SI ES MANUAL
				if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPoliticaProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPoliticaProducto--;			
			//PoliticaProducto politicaproductoAux= new PoliticaProducto();			
			//politicaproductoAux.setId(this.iIdNuevoPoliticaProducto);
			
			if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPoliticaProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
			
			this.politicaproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.politicaproductoLogic.getPoliticaProductos().add(this.politicaproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.politicaproductos.add(this.politicaproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPoliticaProducto(false);
			
			this.jTableDatosPoliticaProducto.setRowSelectionInterval(this.getIndiceNuevoPoliticaProducto(), this.getIndiceNuevoPoliticaProducto());
			
			int iLastRow =  this.jTableDatosPoliticaProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPoliticaProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPoliticaProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPoliticaProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPoliticaProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaProducto(false);
			
			//SI ES MANUAL
			if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPoliticaProducto();
			}
			
			//this.abrirFrameTreePoliticaProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Politica ProductoS ?", "MANTENIMIENTO DE Politica Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPoliticaProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPoliticaProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.politicaproductoReturnGeneral=politicaproductoLogic.procesarImportacionPoliticaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.politicaproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPoliticaProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPoliticaProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPoliticaProducto.setFileImportacion(this.jInternalFrameImportacionPoliticaProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPoliticaProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPoliticaProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPoliticaProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPoliticaProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();		

		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PoliticaProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PoliticaProductoBaseDesign.jrxml";
			
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
			
			this.generarReportePoliticaProductos("Todos",politicaproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPoliticaProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
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
	
	public void jButtonGenerarExcelReporteDinamicoPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();		
		
		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicaproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PoliticaProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PoliticaProducto politicaproducto:politicaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicaproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PoliticaProducto politicaproducto:politicaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicaproducto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(PoliticaProducto politicaproducto:politicaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicaproducto.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(PoliticaProducto politicaproducto:politicaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(politicaproducto.getproducto_descripcion());
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
			//	this.getFilaCabeceraExportarExcelPoliticaProducto(row);				
			//	iRow++;
			//}				
			
			//for(PoliticaProducto politicaproductoAux:politicaproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPoliticaProducto(politicaproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaProducto(false);
			
			//SI ES MANUAL
			if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPoliticaProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaProducto(false);
			
			//SI ES MANUAL
			if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPoliticaProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPoliticaProducto(false);
			
			//SI ES MANUAL
			if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPoliticaProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPoliticaProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPoliticaProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPoliticaProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPoliticaProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPoliticaProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPoliticaProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosPoliticaProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosPoliticaProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPoliticaProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPoliticaProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPoliticaProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPoliticaProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPoliticaProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPoliticaProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPoliticaProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPoliticaProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPoliticaProducto();
		
		this.inicializarActualizarBindingBotonesManualPoliticaProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPoliticaProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPoliticaProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPoliticaProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPoliticaProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPoliticaProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePoliticaProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPoliticaProducto.jCheckBoxPostAccionNuevoPoliticaProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPoliticaProducto.jCheckBoxPostAccionSinCerrarPoliticaProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPoliticaProducto.jCheckBoxPostAccionSinMensajePoliticaProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPoliticaProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPoliticaProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePoliticaProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
				this.jInternalFrameDetalleFormPoliticaProducto.jCheckBoxPostAccionNuevoPoliticaProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPoliticaProducto.jCheckBoxPostAccionSinCerrarPoliticaProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPoliticaProducto.jCheckBoxPostAccionSinMensajePoliticaProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPoliticaProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPoliticaProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPoliticaProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPoliticaProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPoliticaProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPoliticaProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPoliticaProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPoliticaProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPoliticaProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPoliticaProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPoliticaProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPoliticaProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPoliticaProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPoliticaProducto() throws Exception {
		try	{
			if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPoliticaProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePoliticaProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPoliticaProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPoliticaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPoliticaProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPoliticaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPoliticaProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPoliticaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPoliticaProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPoliticaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPoliticaProducto.addItem(reporte);
			}
			
			
			if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPoliticaProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPoliticaProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPoliticaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPoliticaProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPoliticaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPoliticaProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPoliticaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPoliticaProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPoliticaProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPoliticaProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPoliticaProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPoliticaProducto!=null) {
				this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPoliticaProducto!=null) {
				this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPoliticaProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPoliticaProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPoliticaProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPoliticaProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPoliticaProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPoliticaProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPoliticaProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaPoliticaProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoPoliticaProducto.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoPoliticaProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPoliticaProducto(Boolean esInicializar) throws Exception {				
		if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPoliticaProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPoliticaProducto() throws Exception {
		this.inicializarActualizarBindingTablaPoliticaProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPoliticaProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PoliticaProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PoliticaProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPoliticaProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PoliticaProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PoliticaProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPoliticaProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=politicaproductoLogic.getPoliticaProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=politicaproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPoliticaProducto.setModel(new PoliticaProductoModel(this.politicaproductoLogic.getPoliticaProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPoliticaProducto.setModel(new PoliticaProductoModel(this.politicaproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPoliticaProducto!=null && this.jInternalFrameOrderByPoliticaProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPoliticaProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPoliticaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PoliticaProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO,politicaproductoConstantesFunciones.resaltarSeleccionarPoliticaProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PoliticaProductoConstantesFunciones.SCLASSWEBTITULO,politicaproductoConstantesFunciones.resaltarSeleccionarPoliticaProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPoliticaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,PoliticaProductoConstantesFunciones.LABEL_ID));

		if(this.politicaproductoConstantesFunciones.mostraridPoliticaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.politicaproductoConstantesFunciones.resaltaridPoliticaProducto,this.politicaproductoConstantesFunciones.activaridPoliticaProducto,this,true,"idPoliticaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.politicaproductoConstantesFunciones.resaltaridPoliticaProducto,this.politicaproductoConstantesFunciones.activaridPoliticaProducto,this,true,"idPoliticaProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.politicaproductoConstantesFunciones.mostrarid_empresaPoliticaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.politicaproductoConstantesFunciones.resaltarid_empresaPoliticaProducto,this,this.politicaproductoConstantesFunciones.activarid_empresaPoliticaProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.politicaproductoConstantesFunciones.resaltarid_empresaPoliticaProducto,this,this.politicaproductoConstantesFunciones.activarid_empresaPoliticaProducto,false,"id_empresaPoliticaProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PoliticaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.politicaproductoConstantesFunciones.mostrarid_sucursalPoliticaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.politicaproductoConstantesFunciones.resaltarid_sucursalPoliticaProducto,this,this.politicaproductoConstantesFunciones.activarid_sucursalPoliticaProducto));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.politicaproductoConstantesFunciones.resaltarid_sucursalPoliticaProducto,this,this.politicaproductoConstantesFunciones.activarid_sucursalPoliticaProducto,false,"id_sucursalPoliticaProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PoliticaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,PoliticaProductoConstantesFunciones.LABEL_IDBODEGA));

		if(this.politicaproductoConstantesFunciones.mostrarid_bodegaPoliticaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaProductoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.politicaproductoConstantesFunciones.resaltarid_bodegaPoliticaProducto,this,this.politicaproductoConstantesFunciones.activarid_bodegaPoliticaProducto));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.politicaproductoConstantesFunciones.resaltarid_bodegaPoliticaProducto,this,this.politicaproductoConstantesFunciones.activarid_bodegaPoliticaProducto,true,"id_bodegaPoliticaProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new PoliticaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPoliticaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.politicaproductoConstantesFunciones.mostrarid_productoPoliticaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.politicaproductoConstantesFunciones.resaltarid_productoPoliticaProducto,this,this.politicaproductoConstantesFunciones.activarid_productoPoliticaProducto));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.politicaproductoConstantesFunciones.resaltarid_productoPoliticaProducto,this,this.politicaproductoConstantesFunciones.activarid_productoPoliticaProducto,true,"id_productoPoliticaProducto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PoliticaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.politicaproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.politicaproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPoliticaProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.politicaproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.politicaproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPoliticaProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.politicaproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.politicaproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPoliticaProducto.addColumn(tableColumn);
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
			
			this.jTableDatosPoliticaProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPoliticaProducto.moveColumn(this.jTableDatosPoliticaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPoliticaProducto.moveColumn(this.jTableDatosPoliticaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPoliticaProducto.moveColumn(this.jTableDatosPoliticaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPoliticaProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPoliticaProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPoliticaProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPoliticaProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPoliticaProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPoliticaProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPoliticaProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPoliticaProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=politicaproductoLogic.getPoliticaProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=politicaproductos.size()-1;
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
		//this.jTableDatosPoliticaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPoliticaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPoliticaProducto();
			
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
				
				//this.isEsNuevoPoliticaProducto=false;
					
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
				if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPoliticaProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPoliticaProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPoliticaProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.politicaproducto.getsType().equals("DUPLICADO")
				   || this.politicaproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPoliticaProducto=true;
				
				} else {
					this.isEsNuevoPoliticaProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.politicaproducto.getId()>=0 && !this.politicaproducto.getIsNew()) {						
						this.isEsNuevoPoliticaProducto=false;
						
					} else {
						this.isEsNuevoPoliticaProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPoliticaProducto(esRelaciones);						
				
				this.seleccionarPoliticaProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.politicaproducto.getId()<0) {
					this.isEsNuevoPoliticaProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPoliticaProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPoliticaProducto(evt,rowIndex);
				}	
				
				if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PoliticaProducto: " + this.dDif); 
					}
				}								
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPoliticaProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.politicaproducto)) {
					if(this.politicaproducto.getId()>0) {
						this.politicaproducto.setIsDeleted(true);
						
						this.politicaproductosEliminados.add(this.politicaproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.politicaproductoLogic.getPoliticaProductos().remove(this.politicaproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.politicaproductos.remove(this.politicaproducto);				
					}
					
					
					((PoliticaProductoModel) this.jTableDatosPoliticaProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPoliticaProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPoliticaProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPoliticaProducto) {
			
			if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPoliticaProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPoliticaProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPoliticaProducto(this.politicaproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.politicaproductoConstantesFunciones.cargarid_empresaPoliticaProducto || this.politicaproductoConstantesFunciones.event_dependid_empresaPoliticaProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.politicaproducto.getid_empresa());
									//this.inicializarActualizarBindingPoliticaProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(politicaproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(politicaproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.politicaproducto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.politicaproductoConstantesFunciones.cargarid_sucursalPoliticaProducto || this.politicaproductoConstantesFunciones.event_dependid_sucursalPoliticaProducto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.politicaproducto.getid_sucursal());
									//this.inicializarActualizarBindingPoliticaProducto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(politicaproducto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(politicaproducto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.politicaproducto.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.politicaproductoConstantesFunciones.cargarid_bodegaPoliticaProducto || this.politicaproductoConstantesFunciones.event_dependid_bodegaPoliticaProducto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.politicaproducto.getid_bodega());
									//this.inicializarActualizarBindingPoliticaProducto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(politicaproducto.getBodega()!=null) {
							this.bodegasForeignKey.add(politicaproducto.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.politicaproducto.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.politicaproductoConstantesFunciones.cargarid_productoPoliticaProducto || this.politicaproductoConstantesFunciones.event_dependid_productoPoliticaProducto) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.politicaproducto.getid_producto());
									//this.inicializarActualizarBindingPoliticaProducto(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(politicaproducto.getProducto()!=null) {
							this.productosForeignKey.add(politicaproducto.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.politicaproducto.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPoliticaProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPoliticaProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPoliticaProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPoliticaProducto(PoliticaProducto politicaproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPoliticaProducto(politicaproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPoliticaProducto(PoliticaProducto politicaproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPoliticaProducto(politicaproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPoliticaProducto(politicaproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPoliticaProducto(politicaproducto);
	}
	
	public void setVariablesObjetoActualToFormularioPoliticaProducto(PoliticaProducto politicaproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.setText(politicaproducto.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PoliticaProducto politicaproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,politicaproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PoliticaProducto politicaproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				politicaproductoLocal=this.politicaproducto;
			} else {
				politicaproductoLocal=this.politicaproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(politicaproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPoliticaProducto(politicaproductoLocal,true);
					
					if(politicaproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(politicaproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(politicaproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPoliticaProducto(PoliticaProducto politicaproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPoliticaProducto(politicaproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(politicaproducto);
	}
	
	public void setVariablesFormularioToObjetoActualPoliticaProducto(PoliticaProducto politicaproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPoliticaProducto(politicaproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPoliticaProducto(PoliticaProducto politicaproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.getText()==null || this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.getText()=="" || this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.setText("0");
			}

			if(conColumnasBase) {politicaproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PoliticaProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPoliticaProducto.jLabelIdPoliticaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPoliticaProducto(PoliticaProducto politicaproductoBean,PoliticaProducto politicaproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && politicaproductoBean.getid_bodega()!=null && !politicaproductoBean.getid_bodega().equals(-1L))) {politicaproducto.setid_bodega(politicaproductoBean.getid_bodega());}
			if(conDefault || (!conDefault && politicaproductoBean.getid_producto()!=null && !politicaproductoBean.getid_producto().equals(-1L))) {politicaproducto.setid_producto(politicaproductoBean.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPoliticaProducto(PoliticaProducto politicaproductoOrigen,PoliticaProducto politicaproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && politicaproductoOrigen.getId()!=null && !politicaproductoOrigen.getId().equals(0L))) {politicaproducto.setId(politicaproductoOrigen.getId());}}
			if(conDefault || (!conDefault && politicaproductoOrigen.getid_bodega()!=null && !politicaproductoOrigen.getid_bodega().equals(-1L))) {politicaproducto.setid_bodega(politicaproductoOrigen.getid_bodega());}
			if(conDefault || (!conDefault && politicaproductoOrigen.getid_producto()!=null && !politicaproductoOrigen.getid_producto().equals(-1L))) {politicaproducto.setid_producto(politicaproductoOrigen.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPoliticaProducto(PoliticaProducto politicaproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.setText(politicaproducto.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPoliticaProducto(PoliticaProductoBean politicaproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.setText(politicaproductoBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPoliticaProducto(PoliticaProductoParameterReturnGeneral politicaproductoReturnGeneral,PoliticaProductoBean politicaproductoBean,Boolean conDefault) throws Exception { 
		try {
			PoliticaProducto politicaproductoLocal=new PoliticaProducto();
			
			politicaproductoLocal=politicaproductoReturnGeneral.getPoliticaProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && politicaproductoLocal.getId()!=null && !politicaproductoLocal.getId().equals(0L))) {politicaproductoBean.setId(politicaproductoLocal.getId());}}
			if(conDefault || (!conDefault && politicaproductoLocal.getid_bodega()!=null && !politicaproductoLocal.getid_bodega().equals(-1L))) {politicaproductoBean.setid_bodega(politicaproductoLocal.getid_bodega());}
			if(conDefault || (!conDefault && politicaproductoLocal.getid_producto()!=null && !politicaproductoLocal.getid_producto().equals(-1L))) {politicaproductoBean.setid_producto(politicaproductoLocal.getid_producto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPoliticaProductoGenerico(Long idPoliticaProductoSeleccionado,JComboBox jComboBoxPoliticaProducto,List<PoliticaProducto> politicaproductosLocal)throws Exception {
		try {
			PoliticaProducto  politicaproductoTemp=null;

			for(PoliticaProducto politicaproductoAux:politicaproductosLocal) {
				if(politicaproductoAux.getId()!=null && politicaproductoAux.getId().equals(idPoliticaProductoSeleccionado)) {
					politicaproductoTemp=politicaproductoAux;
					break;
				}
			}

			jComboBoxPoliticaProducto.setSelectedItem(politicaproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPoliticaProductoGenerico(JComboBox jComboBoxPoliticaProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPoliticaProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPoliticaProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPoliticaProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPoliticaProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPoliticaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPoliticaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			politicaproducto=(PoliticaProducto) politicaproductoLogic.getPoliticaProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			politicaproducto =(PoliticaProducto) politicaproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!politicaproducto.getIsNew() && !politicaproducto.getIsChanged() && !politicaproducto.getIsDeleted()) {
				sDescripcion=politicaproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=politicaproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!politicaproducto.getIsNew() && !politicaproducto.getIsChanged() && !politicaproducto.getIsDeleted()) {
				sDescripcion=politicaproducto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=politicaproducto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!politicaproducto.getIsNew() && !politicaproducto.getIsChanged() && !politicaproducto.getIsDeleted()) {
				sDescripcion=politicaproducto.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=politicaproducto.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!politicaproducto.getIsNew() && !politicaproducto.getIsChanged() && !politicaproducto.getIsDeleted()) {
				sDescripcion=politicaproducto.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=politicaproducto.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PoliticaProducto politicaproductoRow=new PoliticaProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			politicaproductoRow=(PoliticaProducto) politicaproductoLogic.getPoliticaProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			politicaproductoRow=(PoliticaProducto) politicaproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPoliticaProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPoliticaProducto.setVisible((this.isVisibilidadCeldaNuevoPoliticaProducto && this.isPermisoNuevoPoliticaProducto));			
			this.jButtonDuplicarPoliticaProducto.setVisible((this.isVisibilidadCeldaDuplicarPoliticaProducto && this.isPermisoDuplicarPoliticaProducto));			
			this.jButtonCopiarPoliticaProducto.setVisible((this.isVisibilidadCeldaCopiarPoliticaProducto && this.isPermisoCopiarPoliticaProducto));
			this.jButtonVerFormPoliticaProducto.setVisible((this.isVisibilidadCeldaVerFormPoliticaProducto && this.isPermisoVerFormPoliticaProducto));
			
			this.jButtonAbrirOrderByPoliticaProducto.setVisible((this.isVisibilidadCeldaOrdenPoliticaProducto && this.isPermisoOrdenPoliticaProducto));			
			
			this.jButtonNuevoRelacionesPoliticaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto && this.isPermisoNuevoPoliticaProducto));			
			this.jButtonNuevoGuardarCambiosPoliticaProducto.setVisible((this.isVisibilidadCeldaNuevoPoliticaProducto && this.isPermisoNuevoPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));
			
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonModificarPoliticaProducto.setVisible((this.isVisibilidadCeldaModificarPoliticaProducto && this.isPermisoActualizarPoliticaProducto));	
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarPoliticaProducto.setVisible((this.isVisibilidadCeldaActualizarPoliticaProducto && this.isPermisoActualizarPoliticaProducto));	
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarPoliticaProducto.setVisible((this.isVisibilidadCeldaEliminarPoliticaProducto && this.isPermisoEliminarPoliticaProducto));
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarPoliticaProducto.setVisible(this.isVisibilidadCeldaCancelarPoliticaProducto);							
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosPoliticaProducto.setVisible((this.isVisibilidadCeldaGuardarPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaPoliticaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaNuevoPoliticaProducto && this.isPermisoNuevoPoliticaProducto));						
			this.jButtonDuplicarToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaDuplicarPoliticaProducto && this.isPermisoDuplicarPoliticaProducto));						
			this.jButtonCopiarToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaCopiarPoliticaProducto && this.isPermisoCopiarPoliticaProducto));			
			this.jButtonVerFormToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaVerFormPoliticaProducto && this.isPermisoVerFormPoliticaProducto));			
			this.jButtonAbrirOrderByToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaOrdenPoliticaProducto && this.isPermisoOrdenPoliticaProducto));
			this.jButtonNuevoRelacionesToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto && this.isPermisoNuevoPoliticaProducto));			
			this.jButtonNuevoGuardarCambiosToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaNuevoPoliticaProducto && this.isPermisoNuevoPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));			
			
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonModificarToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaModificarPoliticaProducto && this.isPermisoActualizarPoliticaProducto));	
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaActualizarPoliticaProducto  && this.isPermisoActualizarPoliticaProducto));	
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaEliminarPoliticaProducto && this.isPermisoEliminarPoliticaProducto));
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarToolBarPoliticaProducto.setVisible(this.isVisibilidadCeldaCancelarPoliticaProducto);				
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaGuardarPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPoliticaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPoliticaProducto.setVisible((this.isVisibilidadCeldaNuevoPoliticaProducto && this.isPermisoNuevoPoliticaProducto));			
			this.jMenuItemDuplicarPoliticaProducto.setVisible((this.isVisibilidadCeldaDuplicarPoliticaProducto && this.isPermisoDuplicarPoliticaProducto));			
			this.jMenuItemCopiarPoliticaProducto.setVisible((this.isVisibilidadCeldaCopiarPoliticaProducto && this.isPermisoCopiarPoliticaProducto));			
			this.jMenuItemVerFormPoliticaProducto.setVisible((this.isVisibilidadCeldaVerFormPoliticaProducto && this.isPermisoVerFormPoliticaProducto));			
			this.jMenuItemAbrirOrderByPoliticaProducto.setVisible((this.isVisibilidadCeldaOrdenPoliticaProducto && this.isPermisoOrdenPoliticaProducto));			
			//this.jMenuItemMostrarOcultarPoliticaProducto.setVisible((this.isVisibilidadCeldaOrdenPoliticaProducto && this.isPermisoOrdenPoliticaProducto));
			this.jMenuItemDetalleAbrirOrderByPoliticaProducto.setVisible((this.isVisibilidadCeldaOrdenPoliticaProducto && this.isPermisoOrdenPoliticaProducto));			
			//this.jMenuItemDetalleMostrarOcultarPoliticaProducto.setVisible((this.isVisibilidadCeldaOrdenPoliticaProducto && this.isPermisoOrdenPoliticaProducto));			
			this.jMenuItemNuevoRelacionesPoliticaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto && this.isPermisoNuevoPoliticaProducto));			
			this.jMenuItemNuevoGuardarCambiosPoliticaProducto.setVisible((this.isVisibilidadCeldaNuevoPoliticaProducto && this.isPermisoNuevoPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));									
			
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemModificarPoliticaProducto.setVisible((this.isVisibilidadCeldaModificarPoliticaProducto && this.isPermisoActualizarPoliticaProducto));	
			this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemActualizarPoliticaProducto.setVisible((this.isVisibilidadCeldaActualizarPoliticaProducto && this.isPermisoActualizarPoliticaProducto));	
			this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemEliminarPoliticaProducto.setVisible((this.isVisibilidadCeldaEliminarPoliticaProducto && this.isPermisoEliminarPoliticaProducto));
			this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemCancelarPoliticaProducto.setVisible(this.isVisibilidadCeldaCancelarPoliticaProducto);				
			}
			
			this.jMenuItemGuardarCambiosPoliticaProducto.setVisible((this.isVisibilidadCeldaGuardarPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));						
			this.jMenuItemGuardarCambiosTablaPoliticaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPoliticaProducto=this.jButtonNuevoPoliticaProducto.isVisible();
			this.isVisibilidadCeldaDuplicarPoliticaProducto=this.jButtonDuplicarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaCopiarPoliticaProducto=this.jButtonCopiarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaVerFormPoliticaProducto=this.jButtonVerFormPoliticaProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenPoliticaProducto=this.jButtonAbrirOrderByPoliticaProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=this.jButtonNuevoRelacionesPoliticaProducto.isVisible();
			this.isVisibilidadCeldaModificarPoliticaProducto=this.jButtonModificarPoliticaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			this.isVisibilidadCeldaActualizarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaEliminarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaCancelarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaGuardarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosPoliticaProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=this.jButtonGuardarCambiosTablaPoliticaProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPoliticaProducto=this.jButtonNuevoToolBarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=this.jButtonNuevoRelacionesToolBarPoliticaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			this.isVisibilidadCeldaModificarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jButtonModificarToolBarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaActualizarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarToolBarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaEliminarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarToolBarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaCancelarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarToolBarPoliticaProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPoliticaProducto=this.jButtonGuardarCambiosToolBarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=this.jButtonGuardarCambiosTablaToolBarPoliticaProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPoliticaProducto=this.jMenuItemNuevoPoliticaProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=this.jMenuItemNuevoRelacionesPoliticaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			this.isVisibilidadCeldaModificarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemModificarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaActualizarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemActualizarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaEliminarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemEliminarPoliticaProducto.isVisible();
			this.isVisibilidadCeldaCancelarPoliticaProducto=this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemCancelarPoliticaProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPoliticaProducto=this.jMenuItemGuardarCambiosPoliticaProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=this.jMenuItemGuardarCambiosTablaPoliticaProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPoliticaProducto(Boolean esInicializar) {
		if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPoliticaProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualPoliticaProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPoliticaProducto() {
		this.jButtonNuevoPoliticaProducto.setVisible(this.isPermisoNuevoPoliticaProducto);			
		this.jButtonDuplicarPoliticaProducto.setVisible(this.isPermisoDuplicarPoliticaProducto);			
		this.jButtonCopiarPoliticaProducto.setVisible(this.isPermisoCopiarPoliticaProducto);			
		this.jButtonVerFormPoliticaProducto.setVisible(this.isPermisoVerFormPoliticaProducto);			
		
		this.jButtonAbrirOrderByPoliticaProducto.setVisible(this.isPermisoOrdenPoliticaProducto);					
		
		this.jButtonNuevoRelacionesPoliticaProducto.setVisible(this.isPermisoNuevoPoliticaProducto);			
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonModificarPoliticaProducto.setVisible(this.isPermisoActualizarPoliticaProducto);	
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarPoliticaProducto.setVisible(this.isPermisoActualizarPoliticaProducto);	
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarPoliticaProducto.setVisible(this.isPermisoEliminarPoliticaProducto);
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarPoliticaProducto.setVisible(this.isVisibilidadCeldaCancelarPoliticaProducto);						
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosPoliticaProducto.setVisible(this.isPermisoGuardarCambiosPoliticaProducto);							
		}
		
		this.jButtonGuardarCambiosTablaPoliticaProducto.setVisible(this.isPermisoActualizarPoliticaProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePoliticaProducto() {
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonModificarPoliticaProducto.setVisible(this.isPermisoActualizarPoliticaProducto);	
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarPoliticaProducto.setVisible(this.isPermisoActualizarPoliticaProducto);	
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarPoliticaProducto.setVisible(this.isPermisoEliminarPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarPoliticaProducto.setVisible(this.isVisibilidadCeldaCancelarPoliticaProducto);							
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosPoliticaProducto.setVisible((this.isVisibilidadCeldaGuardarPoliticaProducto && this.isPermisoGuardarCambiosPoliticaProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPoliticaProducto() {
		if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPoliticaProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPoliticaProducto() {
	}
	
	public void jTableDatosPoliticaProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPoliticaProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPoliticaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.getpoliticaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicaproducto==null) {
						this.politicaproducto = new PoliticaProducto();
					}

					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
				}

				if(this.politicaproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.politicaproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPoliticaProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPoliticaProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaProducto(this.getpoliticaproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.politicaproductoLogic.getConnexion());

				if(this.politicaproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.politicaproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaProducto=(TitledBorder)this.jScrollPanelDatosPoliticaProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPoliticaProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPoliticaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.getpoliticaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicaproducto==null) {
						this.politicaproducto = new PoliticaProducto();
					}

					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
				}

				if(this.politicaproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.politicaproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPoliticaProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPoliticaProducto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaProducto(this.getpoliticaproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.politicaproductoLogic.getConnexion());

				if(this.politicaproducto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.politicaproducto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaProducto=(TitledBorder)this.jScrollPanelDatosPoliticaProducto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPoliticaProducto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPoliticaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.getpoliticaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicaproducto==null) {
						this.politicaproducto = new PoliticaProducto();
					}

					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
				}

				if(this.politicaproducto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.politicaproducto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaPoliticaProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebPoliticaProducto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaProducto(this.getpoliticaproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.politicaproductoLogic.getConnexion());

				if(this.politicaproducto.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.politicaproducto.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaProducto=(TitledBorder)this.jScrollPanelDatosPoliticaProducto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderPoliticaProducto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaPoliticaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.getpoliticaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicaproducto==null) {
						this.politicaproducto = new PoliticaProducto();
					}

					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
				}

				if(this.politicaproducto.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.politicaproducto.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoPoliticaProductoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderPoliticaProducto=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosPoliticaProducto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPoliticaProducto=(TitledBorder)this.jScrollPanelDatosPoliticaProducto.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPoliticaProducto.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoPoliticaProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebPoliticaProducto(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPoliticaProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPoliticaProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPoliticaProducto(this.getpoliticaproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.politicaproductoLogic.getConnexion());

				if(this.politicaproducto.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.politicaproducto.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPoliticaProducto=(TitledBorder)this.jScrollPanelDatosPoliticaProducto.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPoliticaProducto.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoPoliticaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.getpoliticaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.politicaproducto==null) {
						this.politicaproducto = new PoliticaProducto();
					}

					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);
				}

				if(this.politicaproducto.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.politicaproducto.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPoliticaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaProducto(false,false);

			this.getPoliticaProductosFK_IdBodega();

			this.inicializarActualizarBindingPoliticaProducto(false);

			//if(PoliticaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaProducto(false,false);

			this.getPoliticaProductosFK_IdEmpresa();

			this.inicializarActualizarBindingPoliticaProducto(false);

			//if(PoliticaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaProducto(false,false);

			this.getPoliticaProductosFK_IdProducto();

			this.inicializarActualizarBindingPoliticaProducto(false);

			//if(PoliticaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPoliticaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPoliticaProducto(false,false);

			this.getPoliticaProductosFK_IdSucursal();

			this.inicializarActualizarBindingPoliticaProducto(false);

			//if(PoliticaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPoliticaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.politicaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePoliticaProducto() {
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
			this.jInternalFrameDetalleFormPoliticaProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormPoliticaProducto.dispose();
			this.jInternalFrameDetalleFormPoliticaProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPoliticaProducto!=null) {
			this.jInternalFrameReporteDinamicoPoliticaProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPoliticaProducto.dispose();
			this.jInternalFrameReporteDinamicoPoliticaProducto=null;
		}
		
		if(this.jInternalFrameImportacionPoliticaProducto!=null) {
			this.jInternalFrameImportacionPoliticaProducto.setVisible(false);	    			
			this.jInternalFrameImportacionPoliticaProducto.dispose();
			this.jInternalFrameImportacionPoliticaProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPoliticaProducto();
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPoliticaProducto")) {
				jButtonNuevoPoliticaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPoliticaProducto")) {
				jButtonDuplicarPoliticaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPoliticaProducto")) {
				jButtonCopiarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPoliticaProducto")) {
				jButtonVerFormPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPoliticaProducto")) {
				jButtonNuevoPoliticaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPoliticaProducto")) {
				jButtonDuplicarPoliticaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPoliticaProducto")) {
				jButtonNuevoPoliticaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPoliticaProducto")) {
				jButtonDuplicarPoliticaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPoliticaProducto")) {
				jButtonNuevoPoliticaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPoliticaProducto")) {
				jButtonNuevoPoliticaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPoliticaProducto")) {
				jButtonNuevoPoliticaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPoliticaProducto")) {
				jButtonModificarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPoliticaProducto")) {
				jButtonModificarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPoliticaProducto")) {
				jButtonModificarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPoliticaProducto")) {
				jButtonActualizarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPoliticaProducto")) {
				jButtonActualizarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPoliticaProducto")) {
				jButtonActualizarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPoliticaProducto")) {
				jButtonEliminarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPoliticaProducto")) {
				jButtonEliminarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPoliticaProducto")) {
				jButtonEliminarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPoliticaProducto")) {
				jButtonCancelarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPoliticaProducto")) {
				jButtonCancelarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPoliticaProducto")) {
				jButtonCancelarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPoliticaProducto")) {
				jButtonCerrarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPoliticaProducto")) {
				jButtonCerrarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPoliticaProducto")) {
				jButtonCerrarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPoliticaProducto")) {
				jButtonMostrarOcultarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPoliticaProducto")) {
				jButtonCancelarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPoliticaProducto")) {
				jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPoliticaProducto")) {
				jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPoliticaProducto")) {
				jButtonCopiarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPoliticaProducto")) {
				jButtonVerFormPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPoliticaProducto")) {
				jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPoliticaProducto")) {
				jButtonCopiarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPoliticaProducto")) {
				jButtonVerFormPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPoliticaProducto")) {
				jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPoliticaProducto")) {
				jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPoliticaProducto")) {
				jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPoliticaProducto")) {
				jButtonRecargarInformacionPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPoliticaProducto")) {
				jButtonRecargarInformacionPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPoliticaProducto")) {
				jButtonRecargarInformacionPoliticaProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPoliticaProducto")) {
				jButtonAnterioresPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPoliticaProducto")) {
				jButtonAnterioresPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePoliticaProducto")) {
				jButtonAnterioresPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPoliticaProducto")) {
				jButtonSiguientesPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPoliticaProducto")) {
				jButtonSiguientesPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPoliticaProducto")) {
				jButtonSiguientesPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPoliticaProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByPoliticaProducto")) {
				jButtonAbrirOrderByPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPoliticaProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarPoliticaProducto")) {
				jButtonMostrarOcultarPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPoliticaProducto")) {
				jButtonNuevoGuardarCambiosPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPoliticaProducto")) {
				jButtonNuevoGuardarCambiosPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPoliticaProducto")) {
				jButtonNuevoGuardarCambiosPoliticaProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPoliticaProducto")) {
				jButtonCerrarReporteDinamicoPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPoliticaProducto")) {
				jButtonGenerarReporteDinamicoPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPoliticaProducto")) {
				
				jButtonGenerarExcelReporteDinamicoPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPoliticaProducto")) {
				jButtonCerrarImportacionPoliticaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPoliticaProducto")) {
				
				jButtonGenerarImportacionPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPoliticaProducto")) {
				
				jButtonAbrirImportacionPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPoliticaProducto")) {
				jComboBoxTiposAccionesPoliticaProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPoliticaProducto")) {
				jComboBoxTiposRelacionesPoliticaProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPoliticaProducto")) {
				jComboBoxTiposAccionesPoliticaProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPoliticaProducto")) {
				
				jComboBoxTiposSeleccionarPoliticaProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPoliticaProducto")) {
				jTextFieldValorCampoGeneralPoliticaProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPoliticaProducto")) {
				jButtonAbrirOrderByPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPoliticaProducto")) {
				jButtonAbrirOrderByPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPoliticaProducto")) {
				jButtonCerrarOrderByPoliticaProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPoliticaProductoBusqueda")) {
				this.jButtonidPoliticaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPoliticaProductoUpdate")) {
				this.jButtonid_empresaPoliticaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPoliticaProductoBusqueda")) {
				this.jButtonid_empresaPoliticaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPoliticaProductoUpdate")) {
				this.jButtonid_sucursalPoliticaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPoliticaProductoBusqueda")) {
				this.jButtonid_sucursalPoliticaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPoliticaProductoUpdate")) {
				this.jButtonid_bodegaPoliticaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPoliticaProductoBusqueda")) {
				this.jButtonid_bodegaPoliticaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPoliticaProducto")) {
				this.jButtonid_productoPoliticaProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPoliticaProductoUpdate")) {
				this.jButtonid_productoPoliticaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPoliticaProductoBusqueda")) {
				this.jButtonid_productoPoliticaProductoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoPoliticaProducto")) {
				this.jButtonid_productoPoliticaProductoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaPoliticaProducto")) {
				this.jButtonFK_IdBodegaPoliticaProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoPoliticaProducto")) {
				this.jButtonFK_IdProductoPoliticaProductoActionPerformed(evt);
			}
			
			;
			
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPoliticaProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				


				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PoliticaProducto politicaproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				politicaproductoLocal=this.politicaproducto;
			} else {
				politicaproductoLocal=this.politicaproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
							
				
				


				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
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
			
			


			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
								
						
				


				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
								
				
				


				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
							
				
				


				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
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
			
			


			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
								
				
				


				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPoliticaProducto")) {
					jCheckBoxSeleccionarTodosPoliticaProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPoliticaProducto")) {
					jCheckBoxSeleccionadosPoliticaProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPoliticaProducto")) {
					
				}
				
				


				
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
												
				
				


				
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
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
			
			


			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPoliticaProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.politicaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.politicaproducto);
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
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
				
				


				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PoliticaProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PoliticaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPoliticaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.politicaproductoAnterior =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPoliticaProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPoliticaProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPoliticaProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.politicaproducto =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.politicaproducto =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.politicaproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPoliticaProducto")) {
				
				}
				
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPoliticaProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPoliticaProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPoliticaProducto")) {
			
			}
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPoliticaProducto();
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
			if(sTipo.equals("NuevoPoliticaProducto")) {
				jButtonNuevoPoliticaProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPoliticaProducto")) {
				jButtonDuplicarPoliticaProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPoliticaProducto")) {
				jButtonCopiarPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPoliticaProducto")) {
				jButtonVerFormPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPoliticaProducto")) {
				jButtonNuevoPoliticaProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPoliticaProducto")) {
				jButtonModificarPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPoliticaProducto")) {
				jButtonActualizarPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPoliticaProducto")) {
				jButtonEliminarPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPoliticaProducto")) {
				jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPoliticaProducto")) {
				jButtonCancelarPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPoliticaProducto")) {
				jButtonCerrarPoliticaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPoliticaProducto")) {
				jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPoliticaProducto")) {
				jButtonNuevoGuardarCambiosPoliticaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPoliticaProducto")) {
				jButtonAbrirOrderByPoliticaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPoliticaProducto")) {
				jButtonRecargarInformacionPoliticaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPoliticaProducto")) {
				jButtonAnterioresPoliticaProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPoliticaProducto")) {
				jButtonSiguientesPoliticaProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPoliticaProductoBusqueda")) {
				this.jButtonidPoliticaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPoliticaProductoUpdate")) {
				this.jButtonid_empresaPoliticaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPoliticaProductoBusqueda")) {
				this.jButtonid_empresaPoliticaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPoliticaProductoUpdate")) {
				this.jButtonid_sucursalPoliticaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPoliticaProductoBusqueda")) {
				this.jButtonid_sucursalPoliticaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPoliticaProductoUpdate")) {
				this.jButtonid_bodegaPoliticaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPoliticaProductoBusqueda")) {
				this.jButtonid_bodegaPoliticaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPoliticaProducto")) {
				this.jButtonid_productoPoliticaProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPoliticaProductoUpdate")) {
				this.jButtonid_productoPoliticaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPoliticaProductoBusqueda")) {
				this.jButtonid_productoPoliticaProductoBusquedaActionPerformed(evt);
			}
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPoliticaProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePoliticaProducto")) {
				closingInternalFramePoliticaProducto();
				
			} else if(sTipo.equals("jButtonCancelarPoliticaProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormPoliticaProducto = (JInternalFrameBase)evt.getSource();
	            	
	            PoliticaProductoBeanSwingJInternalFrame jInternalFrameParent=(PoliticaProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormPoliticaProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPoliticaProductoActionPerformed(null);
			}
			
			PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.politicaproducto,new Object(),this.politicaproductoParameterGeneral,this.politicaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPoliticaProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPoliticaProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPoliticaProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.politicaproducto)) {
			if(!esControlTabla) {
				if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);			
				}
				
				if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPoliticaProducto(this.politicaproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.politicaproductoReturnGeneral=politicaproductoLogic.procesarEventosPoliticaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicaproductoLogic.getPoliticaProductos(),this.politicaproducto,this.politicaproductoParameterGeneral,this.isEsNuevoPoliticaProducto,classes);//this.politicaproductoLogic.getPoliticaProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPoliticaProducto(this.politicaproductoReturnGeneral,this.politicaproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPoliticaProducto(classes,this.politicaproductoReturnGeneral,this.politicaproductoBean,false);
					}
						
					if(this.politicaproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPoliticaProducto(this.politicaproductoReturnGeneral.getPoliticaProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPoliticaProducto(this.politicaproductoReturnGeneral.getPoliticaProducto());	
					}
						
					if(this.politicaproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPoliticaProducto(this.politicaproductoReturnGeneral.getPoliticaProducto(),classes);//this.politicaproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPoliticaProducto(this.politicaproducto,classes);//this.politicaproductoBean);									
				}
			
				if(PoliticaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPoliticaProducto(this.politicaproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPoliticaProducto(this.politicaproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.politicaproductoAnterior!=null) {
						this.politicaproducto=this.politicaproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.politicaproductoReturnGeneral=politicaproductoLogic.procesarEventosPoliticaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicaproductoLogic.getPoliticaProductos(),this.politicaproducto,this.politicaproductoParameterGeneral,this.isEsNuevoPoliticaProducto,classes);//this.politicaproductoLogic.getPoliticaProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.politicaproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.politicaproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.politicaproductoReturnGeneral.getPoliticaProducto(),politicaproductoLogic.getPoliticaProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.politicaproductoReturnGeneral.getPoliticaProducto(),this.politicaproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPoliticaProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosPoliticaProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPoliticaProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosPoliticaProducto() throws Exception {
		
		PoliticaProductoModel politicaproductoModel=(PoliticaProductoModel)this.jTableDatosPoliticaProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			politicaproductoModel.politicaproductos=this.politicaproductoLogic.getPoliticaProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			politicaproductoModel.politicaproductos=this.politicaproductos;
		}
		
		
		((PoliticaProductoModel) this.jTableDatosPoliticaProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPoliticaProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpoliticaproductoAnterior(),this.politicaproductoLogic.getPoliticaProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpoliticaproductoAnterior(),this.politicaproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPoliticaProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPoliticaProducto(PoliticaProducto politicaproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
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
										
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicaproducto,new Object(),generalEntityParameterGeneral,this.politicaproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.politicaproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PoliticaProductoConstantesFunciones.getClassesRelationshipsOfPoliticaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PoliticaProductoConstantesFunciones.getClassesRelationshipsFromStringsOfPoliticaProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPoliticaProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PoliticaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.politicaproducto,new Object(),generalEntityParameterGeneral,this.politicaproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPoliticaProducto(PoliticaProductoBean politicaproductoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPoliticaProducto(ArrayList<Classe> classes,PoliticaProductoReturnGeneral politicaproductoReturnGeneral,PoliticaProductoBean politicaproductoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPoliticaProducto(PoliticaProducto politicaproducto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.politicaproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPoliticaProducto = new PoliticaProductoDetalleFormJInternalFrame(jDesktopPane,this.politicaproductoSessionBean.getConGuardarRelaciones(),this.politicaproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.setVisible(false);
		this.jInternalFrameDetalleFormPoliticaProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormPoliticaProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPoliticaProducto.politicaproductoLogic=this.politicaproductoLogic;
		
		this.cargarCombosFrameForeignKeyPoliticaProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePoliticaProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePoliticaProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPoliticaProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPoliticaProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPoliticaProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPoliticaProducto"));
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonModificarPoliticaProducto.addActionListener(new ButtonActionListener(this,"ModificarPoliticaProducto"));

		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonModificarToolBarPoliticaProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPoliticaProducto"));
					
		this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemModificarPoliticaProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPoliticaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarPoliticaProducto.addActionListener (new ButtonActionListener(this,"ActualizarPoliticaProducto"));
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarToolBarPoliticaProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPoliticaProducto"));
						
		this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemActualizarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPoliticaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarPoliticaProducto.addActionListener (new ButtonActionListener(this,"EliminarPoliticaProducto"));
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPoliticaProducto"));
								
		this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemEliminarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPoliticaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarPoliticaProducto.addActionListener (new ButtonActionListener(this,"CancelarPoliticaProducto"));
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPoliticaProducto"));
					
		this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemCancelarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPoliticaProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemDetalleCerrarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPoliticaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPoliticaProducto"));
		
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPoliticaProducto"));
		
		
		
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPoliticaProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonidPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idPoliticaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_empresaPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_empresaPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_sucursalPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_sucursalPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_bodegaPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_bodegaPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPoliticaProductoBusqueda"));
		//jButtonid_productoPoliticaProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPoliticaProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProducto.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPoliticaProducto.jTabbedPaneRelacionesPoliticaProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPoliticaProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePoliticaProducto"));
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPoliticaProducto"));
		}
		
		this.jTableDatosPoliticaProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPoliticaProducto"));
		
		this.jTableDatosPoliticaProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPoliticaProducto"));
		
		this.jButtonNuevoPoliticaProducto.addActionListener(new ButtonActionListener(this,"NuevoPoliticaProducto"));
		
		this.jButtonDuplicarPoliticaProducto.addActionListener(new ButtonActionListener(this,"DuplicarPoliticaProducto"));
		
		this.jButtonCopiarPoliticaProducto.addActionListener(new ButtonActionListener(this,"CopiarPoliticaProducto"));
		
		this.jButtonVerFormPoliticaProducto.addActionListener(new ButtonActionListener(this,"VerFormPoliticaProducto"));
		
		
		this.jButtonNuevoToolBarPoliticaProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarPoliticaProducto"));
			
		this.jButtonDuplicarToolBarPoliticaProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPoliticaProducto"));
			
		this.jMenuItemNuevoPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPoliticaProducto"));
			
		this.jMenuItemDuplicarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPoliticaProducto"));		
		
		
		this.jButtonNuevoRelacionesPoliticaProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPoliticaProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarPoliticaProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPoliticaProducto"));
			
		this.jMenuItemNuevoRelacionesPoliticaProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPoliticaProducto"));		
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonModificarPoliticaProducto.addActionListener(new ButtonActionListener(this,"ModificarPoliticaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonModificarToolBarPoliticaProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPoliticaProducto"));
			
			this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemModificarPoliticaProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPoliticaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarPoliticaProducto.addActionListener (new ButtonActionListener(this,"ActualizarPoliticaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonActualizarToolBarPoliticaProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPoliticaProducto"));
				
			this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemActualizarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPoliticaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarPoliticaProducto.addActionListener (new ButtonActionListener(this,"EliminarPoliticaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonEliminarToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPoliticaProducto"));
						
			this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemEliminarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPoliticaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarPoliticaProducto.addActionListener (new ButtonActionListener(this,"CancelarPoliticaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonCancelarToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPoliticaProducto"));
			
			this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemCancelarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPoliticaProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPoliticaProducto"));		
		
		
		this.jButtonCerrarPoliticaProducto.addActionListener (new ButtonActionListener(this,"CerrarPoliticaProducto"));
		
		
		this.jButtonCerrarToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarPoliticaProducto"));
			
		this.jMenuItemCerrarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPoliticaProducto"));
			
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jMenuItemDetalleCerrarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPoliticaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosPoliticaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosPoliticaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPoliticaProducto"));
		}
		
		this.jButtonCopiarToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarPoliticaProducto"));
			
		this.jButtonVerFormToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarPoliticaProducto"));
		
		this.jMenuItemGuardarCambiosPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPoliticaProducto"));
			
		this.jMenuItemCopiarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPoliticaProducto"));		
		
		this.jMenuItemVerFormPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPoliticaProducto"));		
		
		
		this.jButtonGuardarCambiosTablaPoliticaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPoliticaProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPoliticaProducto"));
			
		this.jMenuItemGuardarCambiosTablaPoliticaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPoliticaProducto"));		
		
		
		
		this.jButtonRecargarInformacionPoliticaProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionPoliticaProducto"));
					
		this.jButtonRecargarInformacionToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPoliticaProducto"));
		
		this.jMenuItemRecargarInformacionPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPoliticaProducto"));		
		
		
		
		this.jButtonAnterioresPoliticaProducto.addActionListener (new ButtonActionListener(this,"AnterioresPoliticaProducto"));
		
		
		this.jButtonAnterioresToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPoliticaProducto"));
		
		this.jMenuItemAnterioresPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPoliticaProducto"));		
		
		
		this.jButtonSiguientesPoliticaProducto.addActionListener (new ButtonActionListener(this,"SiguientesPoliticaProducto"));
		
		
		this.jButtonSiguientesToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPoliticaProducto"));
			
		this.jMenuItemSiguientesPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPoliticaProducto"));
			
		this.jMenuItemAbrirOrderByPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPoliticaProducto"));
			
		this.jMenuItemMostrarOcultarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPoliticaProducto"));
			
		this.jMenuItemDetalleAbrirOrderByPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPoliticaProducto"));
			
		this.jMenuItemDetalleMostarOcultarPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPoliticaProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosPoliticaProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPoliticaProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPoliticaProducto"));
			
		this.jMenuItemNuevoGuardarCambiosPoliticaProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPoliticaProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPoliticaProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPoliticaProducto"));

		this.jCheckBoxSeleccionadosPoliticaProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPoliticaProducto"));
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPoliticaProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesPoliticaProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesPoliticaProducto"));
			
		this.jComboBoxTiposAccionesPoliticaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesPoliticaProducto"));
					
		this.jComboBoxTiposSeleccionarPoliticaProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPoliticaProducto"));
			
		this.jTextFieldValorCampoGeneralPoliticaProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPoliticaProducto"));		
		
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonidPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idPoliticaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_empresaPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_empresaPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_sucursalPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_sucursalPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_bodegaPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_bodegaPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPoliticaProductoBusqueda"));
		//jButtonid_productoPoliticaProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPoliticaProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProducto.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaPoliticaProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaPoliticaProducto"));

			this.jButtonFK_IdProductoPoliticaProducto.addActionListener(new ButtonActionListener(this,"FK_IdProductoPoliticaProducto"));

			this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPoliticaProducto!=null) {
				this.jInternalFrameReporteDinamicoPoliticaProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPoliticaProducto"));
				this.jInternalFrameReporteDinamicoPoliticaProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPoliticaProducto"));
				this.jInternalFrameReporteDinamicoPoliticaProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPoliticaProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoPoliticaProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPoliticaProducto"));				
			//this.jButtonGenerarReporteDinamicoPoliticaProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPoliticaProducto"));
			//this.jButtonGenerarExcelReporteDinamicoPoliticaProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPoliticaProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPoliticaProducto!=null) {
				this.jInternalFrameImportacionPoliticaProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPoliticaProducto"));
				this.jInternalFrameImportacionPoliticaProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPoliticaProducto"));
				this.jInternalFrameImportacionPoliticaProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPoliticaProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPoliticaProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByPoliticaProducto"));
			
			this.jButtonAbrirOrderByToolBarPoliticaProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPoliticaProducto"));			
			
			if(this.jInternalFrameOrderByPoliticaProducto!=null) {
				this.jInternalFrameOrderByPoliticaProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPoliticaProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPoliticaProducto.jTabbedPaneRelacionesPoliticaProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPoliticaProducto"));
		
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
            		closingInternalFramePoliticaProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPoliticaProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPoliticaProducto = (JInternalFrameBase)event.getSource();
	            	
	            PoliticaProductoBeanSwingJInternalFrame jInternalFrameParent=(PoliticaProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormPoliticaProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPoliticaProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPoliticaProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPoliticaProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPoliticaProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPoliticaProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPoliticaProducto";
		inputMap = this.jButtonNuevoPoliticaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPoliticaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPoliticaProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPoliticaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPoliticaProducto";
		inputMap = this.jButtonNuevoRelacionesPoliticaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPoliticaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPoliticaProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPoliticaProducto";
		inputMap = this.jButtonModificarPoliticaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPoliticaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPoliticaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPoliticaProducto";
		inputMap = this.jButtonActualizarPoliticaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPoliticaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPoliticaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPoliticaProducto";
		inputMap = this.jButtonEliminarPoliticaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPoliticaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPoliticaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPoliticaProducto";
		inputMap = this.jButtonCancelarPoliticaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPoliticaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPoliticaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPoliticaProducto";
		inputMap = this.jButtonCerrarPoliticaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPoliticaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPoliticaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPoliticaProducto";
		inputMap = this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosPoliticaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonGuardarCambiosPoliticaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPoliticaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPoliticaProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPoliticaProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPoliticaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPoliticaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPoliticaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPoliticaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPoliticaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPoliticaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonidPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idPoliticaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_empresaPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_empresaPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPoliticaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_sucursalPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_sucursalPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPoliticaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_bodegaPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_bodegaPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPoliticaProductoBusqueda"));
		//jButtonid_productoPoliticaProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPoliticaProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProducto.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProductoBusqueda"));
		
		
		this.jButtonFK_IdBodegaPoliticaProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaPoliticaProducto"));

		this.jButtonFK_IdProductoPoliticaProducto.addActionListener(new ButtonActionListener(this,"FK_IdProductoPoliticaProducto"));

		this.jButtonBuscarFK_IdProductoid_productoPoliticaProducto.addActionListener(new ButtonActionListener(this,"id_productoPoliticaProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPoliticaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPoliticaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPoliticaProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPoliticaProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPoliticaProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PoliticaProducto politicaproductoAux:this.politicaproductoLogic.getPoliticaProductos()) {
					politicaproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaProducto politicaproductoAux:politicaproductos) {
					politicaproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPoliticaProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPoliticaProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PoliticaProducto politicaproductoAux:this.politicaproductoLogic.getPoliticaProductos()) {
						politicaproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PoliticaProducto politicaproductoAux:politicaproductos) {
						politicaproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PoliticaProducto politicaproductoAux:this.politicaproductoLogic.getPoliticaProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PoliticaProducto politicaproductoAux:politicaproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPoliticaProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPoliticaProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPoliticaProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPoliticaProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPoliticaProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPoliticaProducto.getSelectedRows();
			
			PoliticaProducto politicaproductoLocal=new PoliticaProducto();
			
			//this.seleccionarTodosPoliticaProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					politicaproductoLocal =(PoliticaProducto) this.politicaproductoLogic.getPoliticaProductos().toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					politicaproductoLocal =(PoliticaProducto) this.politicaproductos.toArray()[this.jTableDatosPoliticaProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				politicaproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PoliticaProducto politicaproductoAux:this.politicaproductoLogic.getPoliticaProductos()) {
						politicaproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PoliticaProducto politicaproductoAux:politicaproductos) {
						politicaproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPoliticaProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPoliticaProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPoliticaProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPoliticaProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPoliticaProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPoliticaProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPoliticaProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPoliticaProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPoliticaProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PoliticaProducto politicaproductoAux:this.politicaproductoLogic.getPoliticaProductos()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaProducto politicaproductoAux:politicaproductos) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPoliticaProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPoliticaProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPoliticaProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPoliticaProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPoliticaProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePoliticaProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessPoliticaProducto(conSplash);
				
					this.generarReportePoliticaProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPoliticaProductosSeleccionados();
				//this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPoliticaProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPoliticaProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPoliticaProducto();
				
				this.exportarPoliticaProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPoliticaProductos();
				//this.importarPoliticaProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPoliticaProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPoliticaProductosSeleccionados();
				//this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Politica Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPoliticaProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPoliticaProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPoliticaProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(PoliticaProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePoliticaProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPoliticaProducto(conSplash);
					
						//this.actualizarParametrosGeneralPoliticaProducto();
						
						this.generarReporteProcesoAccionPoliticaProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PoliticaProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Politica ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Politica Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPoliticaProducto();
				
						this.actualizarParametrosGeneralPoliticaProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.politicaproductoReturnGeneral=politicaproductoLogic.procesarAccionPoliticaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.politicaproductoLogic.getPoliticaProductos(),this.politicaproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPoliticaProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPoliticaProducto();
					
					PoliticaProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPoliticaProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPoliticaProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxTiposAccionesFormularioPoliticaProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPoliticaProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPoliticaProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPoliticaProducto();
			
			if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();		
			PoliticaProducto politicaproducto=new PoliticaProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPoliticaProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPoliticaProducto.getSelectedItem();
			
			
			
			
			politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(politicaproductosSeleccionados.size()==1) {
				for(PoliticaProducto politicaproductoAux:politicaproductosSeleccionados) {
					politicaproducto=politicaproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPoliticaProducto();
			
      		//this.finishProcessPoliticaProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPoliticaProductoReturnGeneral() throws Exception {
		if(this.politicaproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.politicaproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.politicaproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.politicaproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.politicaproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.politicaproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPoliticaProducto(false);
		}
		
		if(this.politicaproductoReturnGeneral.getConRetornoLista() || this.politicaproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.politicaproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.politicaproductoLogic.setPoliticaProductos(this.politicaproductoReturnGeneral.getPoliticaProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.politicaproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.politicaproductoLogic.setPoliticaProducto(this.politicaproductoReturnGeneral.getPoliticaProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPoliticaProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralPoliticaProducto() throws Exception {
		
		
	}
	
	public ArrayList<PoliticaProducto> getPoliticaProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPoliticaProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PoliticaProducto politicaproductoAux:politicaproductoLogic.getPoliticaProductos()) {
					if(politicaproductoAux.getIsSelected()) {
						politicaproductosSeleccionados.add(politicaproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PoliticaProducto politicaproductoAux:this.politicaproductos) {
					if(politicaproductoAux.getIsSelected()) {
						politicaproductosSeleccionados.add(politicaproductoAux);				
					}
				}
			}
			
			if(politicaproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						politicaproductosSeleccionados.addAll(this.politicaproductoLogic.getPoliticaProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						politicaproductosSeleccionados.addAll(this.politicaproductos);				
					}
				}
			}
		} else {
			politicaproductosSeleccionados.add(this.politicaproducto);
		}
		
		return politicaproductosSeleccionados;
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
	
	public void generarReportePoliticaProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPoliticaProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPoliticaProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPoliticaProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPoliticaProductosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Politica Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPoliticaProductosSeleccionados() throws Exception {
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();		
		
		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePoliticaProductos("Todos",politicaproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalPoliticaProductosSeleccionados() throws Exception {
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();		
		
		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePoliticaProductos("Todos",politicaproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPoliticaProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();
		
		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePoliticaProductos("Todos",politicaproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPoliticaProductosSeleccionados() throws Exception {
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPoliticaProducto();
		
		
		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPoliticaProducto();
		
		
		//this.generarReportePoliticaProductos("Todos",politicaproductosSeleccionados ,politicaproductoImplementable,politicaproductoImplementableHome);
	}
	
	public void mostrarImportacionPoliticaProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPoliticaProducto();
		
		this.abrirFrameImportacionPoliticaProducto();		
		
			
		//this.generarReportePoliticaProductos("Todos",politicaproductosSeleccionados ,politicaproductoImplementable,politicaproductoImplementableHome);
	}
	
	public void importarPoliticaProductos() throws Exception {		
	
	}
	
	public void exportarPoliticaProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPoliticaProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPoliticaProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPoliticaProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Politica Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPoliticaProductosSeleccionados() throws Exception {
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();		
		
		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicaproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPoliticaProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PoliticaProducto politicaproductoAux:politicaproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPoliticaProducto(politicaproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//politicaproductoAux.setsDetalleGeneralEntityReporte(politicaproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPoliticaProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PoliticaProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaProductoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPoliticaProducto(PoliticaProducto politicaproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=politicaproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=politicaproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicaproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicaproducto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicaproducto.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=politicaproducto.getproducto_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPoliticaProductosSeleccionados() throws Exception {
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();		
		
		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicaproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PoliticaProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPoliticaProducto(row);				
				iRow++;
			}				
			
			for(PoliticaProducto politicaproductoAux:politicaproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPoliticaProducto(politicaproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPoliticaProductosSeleccionados() throws Exception {
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();		
		
		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"politicaproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("politicaproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("politicaproducto");
			//elementRoot.appendChild(element);
		
			for(PoliticaProducto politicaproductoAux:politicaproductosSeleccionados) {
				element = document.createElement("politicaproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPoliticaProducto(politicaproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Politica Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPoliticaProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPoliticaProducto(PoliticaProducto politicaproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(politicaproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(politicaproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(politicaproducto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(politicaproducto.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(politicaproducto.getproducto_descripcion());				
	}
	
	public void setFilaDatosExportarXmlPoliticaProducto(PoliticaProducto politicaproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PoliticaProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(politicaproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PoliticaProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(politicaproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PoliticaProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(politicaproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PoliticaProductoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(politicaproducto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(PoliticaProductoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(politicaproducto.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(PoliticaProductoConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(politicaproducto.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);
	}
	
	public void generarReporteGroupGenericoPoliticaProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PoliticaProducto> politicaproductosSeleccionados=new ArrayList<PoliticaProducto>();
		
		politicaproductosSeleccionados=this.getPoliticaProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPoliticaProducto(politicaproductosSeleccionados);
		
		this.generarReportePoliticaProductos("Todos",politicaproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPoliticaProducto(ArrayList<PoliticaProducto> politicaproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PoliticaProducto politicaproductoAux:politicaproductosSeleccionados) {
				politicaproductoAux.setsDetalleGeneralEntityReporte(politicaproductoAux.toString());
			
				if(sTipoSeleccionar.equals(PoliticaProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					politicaproductoAux.setsDescripcionGeneralEntityReporte1(politicaproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PoliticaProductoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					politicaproductoAux.setsDescripcionGeneralEntityReporte1(politicaproductoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PoliticaProductoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					politicaproductoAux.setsDescripcionGeneralEntityReporte1(politicaproductoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PoliticaProductoConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					politicaproductoAux.setsDescripcionGeneralEntityReporte1(politicaproductoAux.getproducto_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PoliticaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPoliticaProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPoliticaProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=true;
				this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=true;
			}
			
			this.isVisibilidadCeldaModificarPoliticaProducto=false;
			this.isVisibilidadCeldaActualizarPoliticaProducto=false;
			this.isVisibilidadCeldaEliminarPoliticaProducto=false;
			this.isVisibilidadCeldaCancelarPoliticaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPoliticaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=false;
			this.isVisibilidadCeldaModificarPoliticaProducto=false;
			this.isVisibilidadCeldaActualizarPoliticaProducto=true;
			this.isVisibilidadCeldaEliminarPoliticaProducto=false;
			this.isVisibilidadCeldaCancelarPoliticaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPoliticaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=false;
			this.isVisibilidadCeldaModificarPoliticaProducto=false;
			this.isVisibilidadCeldaActualizarPoliticaProducto=true;
			this.isVisibilidadCeldaEliminarPoliticaProducto=true;
			this.isVisibilidadCeldaCancelarPoliticaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPoliticaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=false;
			this.isVisibilidadCeldaModificarPoliticaProducto=false;
			this.isVisibilidadCeldaActualizarPoliticaProducto=true;
			this.isVisibilidadCeldaEliminarPoliticaProducto=false;
			this.isVisibilidadCeldaCancelarPoliticaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPoliticaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=true;
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=true;
			this.isVisibilidadCeldaModificarPoliticaProducto=false;
			this.isVisibilidadCeldaActualizarPoliticaProducto=false;
			this.isVisibilidadCeldaEliminarPoliticaProducto=false;
			this.isVisibilidadCeldaCancelarPoliticaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPoliticaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=false;
			this.isVisibilidadCeldaActualizarPoliticaProducto=false;
			this.isVisibilidadCeldaEliminarPoliticaProducto=false;
			this.isVisibilidadCeldaCancelarPoliticaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPoliticaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=false;
			this.isVisibilidadCeldaModificarPoliticaProducto=true;
			this.isVisibilidadCeldaActualizarPoliticaProducto=false;
			this.isVisibilidadCeldaEliminarPoliticaProducto=false;
			this.isVisibilidadCeldaCancelarPoliticaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarPoliticaProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PoliticaProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPoliticaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=true;
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=true;
		} else {
			this.actualizarEstadoPanelsPoliticaProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPoliticaProducto=false;
			//this.isVisibilidadCeldaVerFormPoliticaProducto=false;
			this.isVisibilidadCeldaDuplicarPoliticaProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!politicaproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoPoliticaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPoliticaProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(politicaproductoSessionBean.getEsGuardarRelacionado()) {
			if(!politicaproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;												
			}
			
			this.jButtonCerrarPoliticaProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPoliticaProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.politicaproducto)) {
			this.isVisibilidadCeldaActualizarPoliticaProducto=false;
			this.isVisibilidadCeldaEliminarPoliticaProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPoliticaProducto() {
	}
	
	public void actualizarEstadoPanelsPoliticaProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPoliticaProducto!=null) {
				this.jScrollPanelDatosEdicionPoliticaProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaProducto!=null) {
				this.jTabbedPaneBusquedasPoliticaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaProducto!=null) {
				this.jScrollPanelDatosPoliticaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaProducto!=null) {
				this.jPanelPaginacionPoliticaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaProducto!=null) {
				this.jPanelParametrosReportesPoliticaProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPoliticaProducto!=null) {
				this.jScrollPanelDatosEdicionPoliticaProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaProducto!=null) {
				this.jTabbedPaneBusquedasPoliticaProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPoliticaProducto!=null) {
				this.jScrollPanelDatosPoliticaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPoliticaProducto!=null) {
				this.jPanelPaginacionPoliticaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPoliticaProducto!=null) {
				this.jPanelParametrosReportesPoliticaProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPoliticaProducto!=null) {
				this.jScrollPanelDatosEdicionPoliticaProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaProducto!=null) {
				this.jTabbedPaneBusquedasPoliticaProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaProducto!=null) {
				this.jScrollPanelDatosPoliticaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPoliticaProducto!=null) {
				this.jPanelPaginacionPoliticaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPoliticaProducto!=null) {
				this.jPanelParametrosReportesPoliticaProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPoliticaProducto!=null) {
				this.jScrollPanelDatosEdicionPoliticaProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaProducto!=null) {
				this.jTabbedPaneBusquedasPoliticaProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaProducto!=null) {
				this.jScrollPanelDatosPoliticaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPoliticaProducto!=null) {
				this.jPanelPaginacionPoliticaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPoliticaProducto!=null) {
				this.jPanelParametrosReportesPoliticaProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPoliticaProducto!=null) {
				this.jScrollPanelDatosEdicionPoliticaProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaProducto!=null) {
				this.jTabbedPaneBusquedasPoliticaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaProducto!=null) {
				this.jScrollPanelDatosPoliticaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaProducto!=null) {
				this.jPanelPaginacionPoliticaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaProducto!=null) {
				this.jPanelParametrosReportesPoliticaProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPoliticaProducto!=null) {
				this.jScrollPanelDatosEdicionPoliticaProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaProducto!=null) {
				this.jTabbedPaneBusquedasPoliticaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaProducto!=null) {
				this.jScrollPanelDatosPoliticaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaProducto!=null) {
				this.jPanelPaginacionPoliticaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaProducto!=null) {
				this.jPanelParametrosReportesPoliticaProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPoliticaProducto!=null) {
				this.jScrollPanelDatosEdicionPoliticaProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaProducto!=null) {
				this.jTabbedPaneBusquedasPoliticaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPoliticaProducto!=null) {
				this.jScrollPanelDatosPoliticaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPoliticaProducto!=null) {
				this.jPanelPaginacionPoliticaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPoliticaProducto!=null) {
				this.jPanelParametrosReportesPoliticaProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPoliticaProducto!=null) {
					this.jTabbedPaneBusquedasPoliticaProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPoliticaProducto!=null) {
				this.jPanelParametrosReportesPoliticaProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPoliticaProducto!=null) {
				this.jTabbedPaneBusquedasPoliticaProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPoliticaProducto!=null) {
				this.jPanelParametrosReportesPoliticaProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPoliticaProducto.remove(jPanelFK_IdBodegaPoliticaProducto);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPoliticaProducto.remove(jPanelFK_IdProductoPoliticaProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPoliticaProducto.remove(jPanelFK_IdBodegaPoliticaProducto);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPoliticaProducto.remove(jPanelFK_IdProductoPoliticaProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPoliticaProducto.remove(jPanelFK_IdBodegaPoliticaProducto);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPoliticaProducto.remove(jPanelFK_IdProductoPoliticaProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPoliticaProducto.remove(jPanelFK_IdBodegaPoliticaProducto);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPoliticaProducto.remove(jPanelFK_IdProductoPoliticaProducto);}
		}
		
	}
	
	
	
	

	public String registrarSesionPoliticaProductoParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(politicaproductoSessionBean==null) {
				politicaproductoSessionBean=new PoliticaProductoSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(politicaproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.politicaproductoFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(PoliticaProductoConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionPoliticaProducto(true);
			//productoSessionBean.setlidPoliticaProductoActual(this.idPoliticaProductoActual);

			politicaproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPoliticaProducto(true);
			politicaproductoSessionBean.setlIdPoliticaProductoActualForeignKey(this.idPoliticaProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PoliticaProductoSessionBean politicaproductoSessionBean=new PoliticaProductoSessionBean();
		
		if(this.politicaproductoSessionBean==null) {
			this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
		}
		
		this.politicaproductoSessionBean.setsUltimaBusquedaPoliticaProducto(this.getsAccionBusqueda());
		this.politicaproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.politicaproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			politicaproductoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			politicaproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			politicaproductoSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			politicaproductoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PoliticaProductoSessionBean politicaproductoSessionBean=new PoliticaProductoSessionBean();
		
		if(this.politicaproductoSessionBean==null) {
			this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
		}
		
		if(this.politicaproductoSessionBean.getsUltimaBusquedaPoliticaProducto()!=null&&!this.politicaproductoSessionBean.getsUltimaBusquedaPoliticaProducto().equals("")) {
			this.setsAccionBusqueda(politicaproductoSessionBean.getsUltimaBusquedaPoliticaProducto());
			this.setiNumeroPaginacion(politicaproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(politicaproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(politicaproductoSessionBean.getid_bodega());
				politicaproductoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(politicaproductoSessionBean.getid_empresa());
				politicaproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(politicaproductoSessionBean.getid_producto());
				politicaproductoSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(politicaproductoSessionBean.getid_sucursal());
				politicaproductoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.politicaproductoSessionBean.setsUltimaBusquedaPoliticaProducto("");
		this.politicaproductoSessionBean.setiNumeroPaginacion(PoliticaProductoConstantesFunciones.INUMEROPAGINACION);
		this.politicaproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPoliticaProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPoliticaProducto() {
		this.updateBorderResaltarBusquedasFormularioPoliticaProducto();
		this.updateVisibilidadBusquedasFormularioPoliticaProducto();
		this.updateHabilitarBusquedasFormularioPoliticaProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioPoliticaProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPoliticaProducto.getComponents().length>0) {
	

		if(this.politicaproductoConstantesFunciones.resaltarFK_IdBodegaPoliticaProducto!=null) {
			index= this.jTabbedPaneBusquedasPoliticaProducto.indexOfComponent(this.jPanelFK_IdBodegaPoliticaProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaProducto.getComponent(index);
				jPanel.setBorder(this.politicaproductoConstantesFunciones.resaltarFK_IdBodegaPoliticaProducto);
			}
		}

		if(this.politicaproductoConstantesFunciones.resaltarFK_IdProductoPoliticaProducto!=null) {
			index= this.jTabbedPaneBusquedasPoliticaProducto.indexOfComponent(this.jPanelFK_IdProductoPoliticaProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaProducto.getComponent(index);
				jPanel.setBorder(this.politicaproductoConstantesFunciones.resaltarFK_IdProductoPoliticaProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPoliticaProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPoliticaProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPoliticaProducto.indexOfComponent(this.jPanelFK_IdBodegaPoliticaProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.politicaproductoConstantesFunciones.mostrarFK_IdBodegaPoliticaProducto);
			if(!this.politicaproductoConstantesFunciones.mostrarFK_IdBodegaPoliticaProducto && index>-1) {
				this.jTabbedPaneBusquedasPoliticaProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasPoliticaProducto.indexOfComponent(this.jPanelFK_IdProductoPoliticaProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.politicaproductoConstantesFunciones.mostrarFK_IdProductoPoliticaProducto);
			if(!this.politicaproductoConstantesFunciones.mostrarFK_IdProductoPoliticaProducto && index>-1) {
				this.jTabbedPaneBusquedasPoliticaProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPoliticaProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPoliticaProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPoliticaProducto.indexOfComponent(this.jPanelFK_IdBodegaPoliticaProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.politicaproductoConstantesFunciones.activarFK_IdBodegaPoliticaProducto);
				this.jTabbedPaneBusquedasPoliticaProducto.setEnabledAt(index,this.politicaproductoConstantesFunciones.activarFK_IdBodegaPoliticaProducto);
			}

			index= this.jTabbedPaneBusquedasPoliticaProducto.indexOfComponent(this.jPanelFK_IdProductoPoliticaProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.politicaproductoConstantesFunciones.activarFK_IdProductoPoliticaProducto);
				this.jTabbedPaneBusquedasPoliticaProducto.setEnabledAt(index,this.politicaproductoConstantesFunciones.activarFK_IdProductoPoliticaProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPoliticaProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasPoliticaProducto.indexOfComponent(this.jPanelFK_IdBodegaPoliticaProducto);

			this.jTabbedPaneBusquedasPoliticaProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaProducto.getComponent(index);

			this.politicaproductoConstantesFunciones.setResaltarFK_IdBodegaPoliticaProducto(resaltar);

			jPanel.setBorder(this.politicaproductoConstantesFunciones.resaltarFK_IdBodegaPoliticaProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasPoliticaProducto.indexOfComponent(this.jPanelFK_IdProductoPoliticaProducto);

			this.jTabbedPaneBusquedasPoliticaProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPoliticaProducto.getComponent(index);

			this.politicaproductoConstantesFunciones.setResaltarFK_IdProductoPoliticaProducto(resaltar);

			jPanel.setBorder(this.politicaproductoConstantesFunciones.resaltarFK_IdProductoPoliticaProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPoliticaProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPoliticaProducto() throws Exception {

		if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPoliticaProducto();
		this.updateVisibilidadResaltarControlesFormularioPoliticaProducto();
		this.updateHabilitarResaltarControlesFormularioPoliticaProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioPoliticaProducto() throws Exception {
		if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.politicaproductoConstantesFunciones.resaltaridPoliticaProducto!=null && this.jInternalFrameDetalleFormPoliticaProducto!=null) {this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.setBorder(this.politicaproductoConstantesFunciones.resaltaridPoliticaProducto);}
		if(this.politicaproductoConstantesFunciones.resaltarid_empresaPoliticaProducto!=null && this.jInternalFrameDetalleFormPoliticaProducto!=null) {this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.setBorder(this.politicaproductoConstantesFunciones.resaltarid_empresaPoliticaProducto);}
		if(this.politicaproductoConstantesFunciones.resaltarid_sucursalPoliticaProducto!=null && this.jInternalFrameDetalleFormPoliticaProducto!=null) {this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.setBorder(this.politicaproductoConstantesFunciones.resaltarid_sucursalPoliticaProducto);}
		if(this.politicaproductoConstantesFunciones.resaltarid_bodegaPoliticaProducto!=null && this.jInternalFrameDetalleFormPoliticaProducto!=null) {this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.setBorder(this.politicaproductoConstantesFunciones.resaltarid_bodegaPoliticaProducto);}
		if(this.politicaproductoConstantesFunciones.resaltarid_productoPoliticaProducto!=null && this.jInternalFrameDetalleFormPoliticaProducto!=null) {this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.setBorder(this.politicaproductoConstantesFunciones.resaltarid_productoPoliticaProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPoliticaProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
	
		//this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostraridPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jPanelidPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostraridPoliticaProducto);
		//this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostrarid_empresaPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jPanelid_empresaPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostrarid_empresaPoliticaProducto);
		//this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostrarid_sucursalPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jPanelid_sucursalPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostrarid_sucursalPoliticaProducto);
		//this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostrarid_bodegaPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jPanelid_bodegaPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostrarid_bodegaPoliticaProducto);
		//this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostrarid_productoPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jPanelid_productoPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostrarid_productoPoliticaProducto);
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProducto.setVisible(this.politicaproductoConstantesFunciones.mostrarid_productoPoliticaProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPoliticaProducto() throws Exception {
		if(this.jInternalFrameDetalleFormPoliticaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPoliticaProducto!=null) {
	
		this.jInternalFrameDetalleFormPoliticaProducto.jLabelidPoliticaProducto.setEnabled(this.politicaproductoConstantesFunciones.activaridPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_empresaPoliticaProducto.setEnabled(this.politicaproductoConstantesFunciones.activarid_empresaPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_sucursalPoliticaProducto.setEnabled(this.politicaproductoConstantesFunciones.activarid_sucursalPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_bodegaPoliticaProducto.setEnabled(this.politicaproductoConstantesFunciones.activarid_bodegaPoliticaProducto);
		this.jInternalFrameDetalleFormPoliticaProducto.jComboBoxid_productoPoliticaProducto.setEnabled(this.politicaproductoConstantesFunciones.activarid_productoPoliticaProducto);
			this.jInternalFrameDetalleFormPoliticaProducto.jButtonid_productoPoliticaProducto.setEnabled(this.politicaproductoConstantesFunciones.activarid_productoPoliticaProducto);
		}
	}
	
		
}