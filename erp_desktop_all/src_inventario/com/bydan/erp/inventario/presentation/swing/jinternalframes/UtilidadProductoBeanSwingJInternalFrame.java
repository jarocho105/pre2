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

import com.bydan.erp.inventario.util.UtilidadProductoConstantesFunciones;
import com.bydan.erp.inventario.util.UtilidadProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.UtilidadProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.UtilidadProductoBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class UtilidadProductoBeanSwingJInternalFrame extends UtilidadProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UtilidadProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<UtilidadProducto> utilidadproductoValidator = new ClassValidator<UtilidadProducto>(UtilidadProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public UtilidadProducto utilidadproducto;	
	public UtilidadProducto utilidadproductoAux;
	public UtilidadProducto utilidadproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public UtilidadProducto utilidadproductoTotales;
	public Long idUtilidadProductoActual;
	public Long iIdNuevoUtilidadProducto=0L;
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
	
	public Boolean isPermisoTodoUtilidadProducto;
	public Boolean isPermisoNuevoUtilidadProducto;
	public Boolean isPermisoActualizarUtilidadProducto;
	public Boolean isPermisoActualizarOriginalUtilidadProducto;
	public Boolean isPermisoEliminarUtilidadProducto;
	public Boolean isPermisoGuardarCambiosUtilidadProducto;
	public Boolean isPermisoConsultaUtilidadProducto;
	public Boolean isPermisoBusquedaUtilidadProducto;
	public Boolean isPermisoReporteUtilidadProducto;
	public Boolean isPermisoPaginacionMedioUtilidadProducto;
	public Boolean isPermisoPaginacionAltoUtilidadProducto;
	public Boolean isPermisoPaginacionTodoUtilidadProducto;
	public Boolean isPermisoCopiarUtilidadProducto;
	public Boolean isPermisoVerFormUtilidadProducto;
	public Boolean isPermisoDuplicarUtilidadProducto;
	public Boolean isPermisoOrdenUtilidadProducto;
	
	
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
	
	public UtilidadProductoParameterReturnGeneral utilidadproductoReturnGeneral;
	public UtilidadProductoParameterReturnGeneral utilidadproductoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUtilidadProducto=false;
	public Boolean esParaAccionDesdeFormularioUtilidadProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UtilidadProductoSessionBeanAdditional utilidadproductoSessionBeanAdditional=null;
	
	public UtilidadProductoSessionBeanAdditional getUtilidadProductoSessionBeanAdditional() {
		return this.utilidadproductoSessionBeanAdditional;
	}
	
	public void setUtilidadProductoSessionBeanAdditional(UtilidadProductoSessionBeanAdditional utilidadproductoSessionBeanAdditional) {
		try {
			this.utilidadproductoSessionBeanAdditional=utilidadproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UtilidadProductoBeanSwingJInternalFrameAdditional utilidadproductoBeanSwingJInternalFrameAdditional=null;
	//public class UtilidadProductoBeanSwingJInternalFrame
	
	public UtilidadProductoBeanSwingJInternalFrameAdditional getUtilidadProductoBeanSwingJInternalFrameAdditional() {
		return this.utilidadproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setUtilidadProductoBeanSwingJInternalFrameAdditional(UtilidadProductoBeanSwingJInternalFrameAdditional utilidadproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.utilidadproductoBeanSwingJInternalFrameAdditional=utilidadproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UtilidadProductoLogic utilidadproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public UtilidadProducto utilidadproductoBean;
	public UtilidadProductoConstantesFunciones utilidadproductoConstantesFunciones;
	//public UtilidadProductoParameterReturnGeneral utilidadproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<UtilidadProducto> utilidadproductos;	
	//public List<UtilidadProducto> utilidadproductosEliminados;
	//public List<UtilidadProducto> utilidadproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUtilidadProducto=false;
	public Boolean isVisibilidadCeldaDuplicarUtilidadProducto=true;
	public Boolean isVisibilidadCeldaCopiarUtilidadProducto=true;
	public Boolean isVisibilidadCeldaVerFormUtilidadProducto=true;
	public Boolean isVisibilidadCeldaOrdenUtilidadProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;
	public Boolean isVisibilidadCeldaModificarUtilidadProducto=false;
	public Boolean isVisibilidadCeldaActualizarUtilidadProducto=false;
	public Boolean isVisibilidadCeldaEliminarUtilidadProducto=false;
	public Boolean isVisibilidadCeldaCancelarUtilidadProducto=false;
	public Boolean isVisibilidadCeldaGuardarUtilidadProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUtilidadProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdBodegaPorIdProducto=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoUtilidadProducto() {
		return this.iIdNuevoUtilidadProducto;
	}

	public void setiIdNuevoUtilidadProducto(Long iIdNuevoUtilidadProducto) {
		this.iIdNuevoUtilidadProducto = iIdNuevoUtilidadProducto;
	}
	
	public Long getidUtilidadProductoActual() {
		return this.idUtilidadProductoActual;
	}

	public void setidUtilidadProductoActual(Long idUtilidadProductoActual) {
		this.idUtilidadProductoActual = idUtilidadProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public UtilidadProducto getutilidadproducto() {
		return this.utilidadproducto;
	}

	public void setutilidadproducto(UtilidadProducto utilidadproducto) {
		this.utilidadproducto = utilidadproducto;
	}
	
	public UtilidadProducto getutilidadproductoAux() {
		return this.utilidadproductoAux;
	}

	public void setutilidadproductoAux(UtilidadProducto utilidadproductoAux) {
		this.utilidadproductoAux = utilidadproductoAux;
	}				
	
	public UtilidadProducto getutilidadproductoAnterior() {
		return this.utilidadproductoAnterior;
	}

	public void setutilidadproductoAnterior(UtilidadProducto utilidadproductoAnterior) {
		this.utilidadproductoAnterior = utilidadproductoAnterior;
	}	
	
	public UtilidadProducto getutilidadproductoTotales() {
		return this.utilidadproductoTotales;
	}

	public void setutilidadproductoTotales(UtilidadProducto utilidadproductoTotales) {
		this.utilidadproductoTotales = utilidadproductoTotales;
	}	
	
	public UtilidadProducto getutilidadproductoBean() {
		return this.utilidadproductoBean;
	}

	public void setutilidadproductoBean(UtilidadProducto utilidadproductoBean) {
		this.utilidadproductoBean = utilidadproductoBean;
	}	
	
	public UtilidadProductoParameterReturnGeneral getutilidadproductoReturnGeneral() {
		return this.utilidadproductoReturnGeneral;
	}

	public void setutilidadproductoReturnGeneral(UtilidadProductoParameterReturnGeneral utilidadproductoReturnGeneral) {
		this.utilidadproductoReturnGeneral = utilidadproductoReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaPorIdBodegaPorIdProducto=-1L;

	public Long getid_bodegaBusquedaPorIdBodegaPorIdProducto() {
		return this.id_bodegaBusquedaPorIdBodegaPorIdProducto;
	}

	public void setid_bodegaBusquedaPorIdBodegaPorIdProducto(Long id_bodegaBusquedaPorIdBodegaPorIdProducto) {
		this.id_bodegaBusquedaPorIdBodegaPorIdProducto = id_bodegaBusquedaPorIdBodegaPorIdProducto;
	}

;
	public Long id_productoBusquedaPorIdBodegaPorIdProducto=-1L;

	public Long getid_productoBusquedaPorIdBodegaPorIdProducto() {
		return this.id_productoBusquedaPorIdBodegaPorIdProducto;
	}

	public void setid_productoBusquedaPorIdBodegaPorIdProducto(Long id_productoBusquedaPorIdBodegaPorIdProducto) {
		this.id_productoBusquedaPorIdBodegaPorIdProducto = id_productoBusquedaPorIdBodegaPorIdProducto;
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
	
	
	public UtilidadProductoLogic getUtilidadProductoLogic()	{		
		return utilidadproductoLogic;
	}

	public void setUtilidadProductoLogic(UtilidadProductoLogic utilidadproductoLogic) {
		this.utilidadproductoLogic = utilidadproductoLogic;
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
	
	public Boolean getIsEsNuevoUtilidadProducto() {
		return isEsNuevoUtilidadProducto;
	}

	public void setIsEsNuevoUtilidadProducto(Boolean isEsNuevoUtilidadProducto) {
		this.isEsNuevoUtilidadProducto = isEsNuevoUtilidadProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioUtilidadProducto() {
		return esParaAccionDesdeFormularioUtilidadProducto;
	}
	
	public void setEsParaAccionDesdeFormularioUtilidadProducto(Boolean esParaAccionDesdeFormularioUtilidadProducto) {
		this.esParaAccionDesdeFormularioUtilidadProducto = esParaAccionDesdeFormularioUtilidadProducto;
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

			if(this.utilidadproductoSessionBean==null) {
				this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
			}

			if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(utilidadproductoSessionBean.getlidEmpresaActual());
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

			if(this.utilidadproductoSessionBean==null) {
				this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
			}

			if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(utilidadproductoSessionBean.getlidSucursalActual());
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

			if(this.utilidadproductoSessionBean==null) {
				this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
			}

			if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(utilidadproductoSessionBean.getlidBodegaActual());
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

			if(this.utilidadproductoSessionBean==null) {
				this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
			}

			if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(utilidadproductoSessionBean.getlidProductoActual());
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

					if(this.utilidadproducto!=null) {
						this.utilidadproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
						this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaUtilidadProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
						if(this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaUtilidadProductoGenerico)throws Exception
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
				jComboBoxid_empresaUtilidadProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaUtilidadProductoGenerico!=null && jComboBoxid_empresaUtilidadProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaUtilidadProductoGenerico.setSelectedIndex(0);
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

					if(this.utilidadproducto!=null) {
						this.utilidadproducto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
						this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalUtilidadProducto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
						if(this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalUtilidadProductoGenerico)throws Exception
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
				jComboBoxid_sucursalUtilidadProductoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalUtilidadProductoGenerico!=null && jComboBoxid_sucursalUtilidadProductoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalUtilidadProductoGenerico.setSelectedIndex(0);
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

					if(this.utilidadproducto!=null) {
						this.utilidadproducto.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
						this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaUtilidadProducto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
						if(this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto!=null) {
						jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto!=null) {
							//jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaUtilidadProducto!=null) {
						jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaUtilidadProducto!=null) {
							//jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaUtilidadProductoGenerico)throws Exception
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
				jComboBoxid_bodegaUtilidadProductoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaUtilidadProductoGenerico!=null && jComboBoxid_bodegaUtilidadProductoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaUtilidadProductoGenerico.setSelectedIndex(0);
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

					if(this.utilidadproducto!=null) {
						this.utilidadproducto.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
						this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoUtilidadProducto.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
						if(this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto!=null) {
						jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto!=null) {
							//jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.getItemCount()>0) {
								jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoUtilidadProductoGenerico)throws Exception
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
				jComboBoxid_productoUtilidadProductoGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoUtilidadProductoGenerico!=null && jComboBoxid_productoUtilidadProductoGenerico.getItemCount()>0) {
					jComboBoxid_productoUtilidadProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(UtilidadProducto utilidadproducto,JComboBox jComboBoxid_empresaUtilidadProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaUtilidadProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaUtilidadProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				utilidadproducto.setid_empresa(empresaAux.getId());
				utilidadproducto.setempresa_descripcion(UtilidadProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				utilidadproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(UtilidadProducto utilidadproducto,JComboBox jComboBoxid_sucursalUtilidadProductoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalUtilidadProductoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalUtilidadProductoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				utilidadproducto.setid_sucursal(sucursalAux.getId());
				utilidadproducto.setsucursal_descripcion(UtilidadProductoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				utilidadproducto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(UtilidadProducto utilidadproducto,JComboBox jComboBoxid_bodegaUtilidadProductoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaUtilidadProductoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaUtilidadProductoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				utilidadproducto.setid_bodega(bodegaAux.getId());
				utilidadproducto.setbodega_descripcion(UtilidadProductoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				utilidadproducto.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(UtilidadProducto utilidadproducto,JComboBox jComboBoxid_productoUtilidadProductoGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoUtilidadProductoGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoUtilidadProductoGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				utilidadproducto.setid_producto(productoAux.getId());
				utilidadproducto.setproducto_descripcion(UtilidadProductoConstantesFunciones.getProductoDescripcion(productoAux));
				utilidadproducto.setProducto(productoAux);			}
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

					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { 
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { 
					}

					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { 
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { 
					}

					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { 
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { 
					}

					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.addItem(bodega);
							}
						}

						if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.addItem(bodega);
							}
						}

						if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { 
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { 
					}

					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.addItem(producto);
							}
						}

						if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesUtilidadProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			UtilidadProductoConstantesFunciones.refrescarForeignKeysDescripcionesUtilidadProducto(this.utilidadproductoLogic.getUtilidadProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			UtilidadProductoConstantesFunciones.refrescarForeignKeysDescripcionesUtilidadProducto(this.utilidadproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//utilidadproductoLogic.setUtilidadProductos(this.utilidadproductos);
			utilidadproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public UtilidadProductoParameterReturnGeneral getUtilidadProductoParameterGeneral() {
		return this.utilidadproductoParameterGeneral;
	}
	
	public void setUtilidadProductoParameterGeneral(UtilidadProductoParameterReturnGeneral utilidadproductoParameterGeneral) {
		this.utilidadproductoParameterGeneral = utilidadproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoUtilidadProducto() {
		return isPermisoTodoUtilidadProducto;
	}

	public void setIsPermisoTodoUtilidadProducto(Boolean isPermisoTodoUtilidadProducto) {
		this.isPermisoTodoUtilidadProducto = isPermisoTodoUtilidadProducto;
	}

	public Boolean getIsPermisoNuevoUtilidadProducto() {
		return isPermisoNuevoUtilidadProducto;
	}

	public void setIsPermisoNuevoUtilidadProducto(Boolean isPermisoNuevoUtilidadProducto) {
		this.isPermisoNuevoUtilidadProducto = isPermisoNuevoUtilidadProducto;
	}

	public Boolean getIsPermisoActualizarUtilidadProducto() {
		return isPermisoActualizarUtilidadProducto;
	}

	public void setIsPermisoActualizarUtilidadProducto(Boolean isPermisoActualizarUtilidadProducto) {
		this.isPermisoActualizarUtilidadProducto = isPermisoActualizarUtilidadProducto;
	}

	public Boolean getIsPermisoEliminarUtilidadProducto() {
		return isPermisoEliminarUtilidadProducto;
	}

	public void setIsPermisoEliminarUtilidadProducto(Boolean isPermisoEliminarUtilidadProducto) {
		this.isPermisoEliminarUtilidadProducto = isPermisoEliminarUtilidadProducto;
	}

	public Boolean getIsPermisoGuardarCambiosUtilidadProducto() {
		return isPermisoGuardarCambiosUtilidadProducto;
	}

	public void setIsPermisoGuardarCambiosUtilidadProducto(Boolean isPermisoGuardarCambiosUtilidadProducto) {
		this.isPermisoGuardarCambiosUtilidadProducto = isPermisoGuardarCambiosUtilidadProducto;
	}
	
	public Boolean getIsPermisoConsultaUtilidadProducto() {
		return isPermisoConsultaUtilidadProducto;
	}

	public void setIsPermisoConsultaUtilidadProducto(Boolean isPermisoConsultaUtilidadProducto) {
		this.isPermisoConsultaUtilidadProducto = isPermisoConsultaUtilidadProducto;
	}

	public Boolean getIsPermisoBusquedaUtilidadProducto() {
		return isPermisoBusquedaUtilidadProducto;
	}

	public void setIsPermisoBusquedaUtilidadProducto(Boolean isPermisoBusquedaUtilidadProducto) {
		this.isPermisoBusquedaUtilidadProducto = isPermisoBusquedaUtilidadProducto;
	}

	public Boolean getIsPermisoReporteUtilidadProducto() {
		return isPermisoReporteUtilidadProducto;
	}

	public void setIsPermisoReporteUtilidadProducto(Boolean isPermisoReporteUtilidadProducto) {
		this.isPermisoReporteUtilidadProducto = isPermisoReporteUtilidadProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioUtilidadProducto() {
		return isPermisoPaginacionMedioUtilidadProducto;
	}

	public void setIsPermisoPaginacionMedioUtilidadProducto(Boolean isPermisoPaginacionMedioUtilidadProducto) {
		this.isPermisoPaginacionMedioUtilidadProducto = isPermisoPaginacionMedioUtilidadProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoUtilidadProducto() {
		return isPermisoPaginacionTodoUtilidadProducto;
	}

	public void setIsPermisoPaginacionTodoUtilidadProducto(Boolean isPermisoPaginacionTodoUtilidadProducto) {
		this.isPermisoPaginacionTodoUtilidadProducto = isPermisoPaginacionTodoUtilidadProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoUtilidadProducto() {
		return isPermisoPaginacionAltoUtilidadProducto;
	}

	public void setIsPermisoPaginacionAltoUtilidadProducto(Boolean isPermisoPaginacionAltoUtilidadProducto) {
		this.isPermisoPaginacionAltoUtilidadProducto = isPermisoPaginacionAltoUtilidadProducto;
	}
	
	public Boolean getIsPermisoCopiarUtilidadProducto() {
		return isPermisoCopiarUtilidadProducto;
	}

	public void setIsPermisoCopiarUtilidadProducto(Boolean isPermisoCopiarUtilidadProducto) {
		this.isPermisoCopiarUtilidadProducto = isPermisoCopiarUtilidadProducto;
	}
	
	public Boolean getIsPermisoVerFormUtilidadProducto() {
		return isPermisoVerFormUtilidadProducto;
	}

	public void setIsPermisoVerFormUtilidadProducto(Boolean isPermisoVerFormUtilidadProducto) {
		this.isPermisoVerFormUtilidadProducto = isPermisoVerFormUtilidadProducto;
	}
	
	public Boolean getIsPermisoDuplicarUtilidadProducto() {
		return isPermisoDuplicarUtilidadProducto;
	}

	public void setIsPermisoDuplicarUtilidadProducto(Boolean isPermisoDuplicarUtilidadProducto) {
		this.isPermisoDuplicarUtilidadProducto = isPermisoDuplicarUtilidadProducto;
	}
	
	public Boolean getIsPermisoOrdenUtilidadProducto() {
		return isPermisoOrdenUtilidadProducto;
	}

	public void setIsPermisoOrdenUtilidadProducto(Boolean isPermisoOrdenUtilidadProducto) {
		this.isPermisoOrdenUtilidadProducto = isPermisoOrdenUtilidadProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoUtilidadProducto() {
		return isVisibilidadCeldaNuevoUtilidadProducto;
	}

	public void setIsVisibilidadCeldaNuevoUtilidadProducto(Boolean isVisibilidadCeldaNuevoUtilidadProducto) {
		this.isVisibilidadCeldaNuevoUtilidadProducto = isVisibilidadCeldaNuevoUtilidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUtilidadProducto() {
		return isVisibilidadCeldaDuplicarUtilidadProducto;
	}

	public void setIsVisibilidadCeldaDuplicarUtilidadProducto(Boolean isVisibilidadCeldaDuplicarUtilidadProducto) {
		this.isVisibilidadCeldaDuplicarUtilidadProducto = isVisibilidadCeldaDuplicarUtilidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUtilidadProducto() {
		return isVisibilidadCeldaCopiarUtilidadProducto;
	}

	public void setIsVisibilidadCeldaCopiarUtilidadProducto(Boolean isVisibilidadCeldaCopiarUtilidadProducto) {
		this.isVisibilidadCeldaCopiarUtilidadProducto = isVisibilidadCeldaCopiarUtilidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUtilidadProducto() {
		return isVisibilidadCeldaVerFormUtilidadProducto;
	}

	public void setIsVisibilidadCeldaVerFormUtilidadProducto(Boolean isVisibilidadCeldaVerFormUtilidadProducto) {
		this.isVisibilidadCeldaVerFormUtilidadProducto = isVisibilidadCeldaVerFormUtilidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUtilidadProducto() {
		return isVisibilidadCeldaOrdenUtilidadProducto;
	}

	public void setIsVisibilidadCeldaOrdenUtilidadProducto(Boolean isVisibilidadCeldaOrdenUtilidadProducto) {
		this.isVisibilidadCeldaOrdenUtilidadProducto = isVisibilidadCeldaOrdenUtilidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUtilidadProducto() {
		return isVisibilidadCeldaNuevoRelacionesUtilidadProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUtilidadProducto(Boolean isVisibilidadCeldaNuevoRelacionesUtilidadProducto) {
		this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto = isVisibilidadCeldaNuevoRelacionesUtilidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUtilidadProducto() {
		return isVisibilidadCeldaModificarUtilidadProducto;
	}

	public void setIsVisibilidadCeldaModificarUtilidadProducto(Boolean isVisibilidadCeldaModificarUtilidadProducto) {
		this.isVisibilidadCeldaModificarUtilidadProducto = isVisibilidadCeldaModificarUtilidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUtilidadProducto() {
		return isVisibilidadCeldaActualizarUtilidadProducto;
	}

	public void setIsVisibilidadCeldaActualizarUtilidadProducto(Boolean isVisibilidadCeldaActualizarUtilidadProducto) {
		this.isVisibilidadCeldaActualizarUtilidadProducto = isVisibilidadCeldaActualizarUtilidadProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarUtilidadProducto() {
		return isVisibilidadCeldaEliminarUtilidadProducto;
	}

	public void setIsVisibilidadCeldaEliminarUtilidadProducto(Boolean isVisibilidadCeldaEliminarUtilidadProducto) {
		this.isVisibilidadCeldaEliminarUtilidadProducto = isVisibilidadCeldaEliminarUtilidadProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarUtilidadProducto() {
		return isVisibilidadCeldaCancelarUtilidadProducto;
	}

	public void setIsVisibilidadCeldaCancelarUtilidadProducto(Boolean isVisibilidadCeldaCancelarUtilidadProducto) {
		this.isVisibilidadCeldaCancelarUtilidadProducto = isVisibilidadCeldaCancelarUtilidadProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarUtilidadProducto() {
		return isVisibilidadCeldaGuardarUtilidadProducto;
	}

	public void setIsVisibilidadCeldaGuardarUtilidadProducto(Boolean isVisibilidadCeldaGuardarUtilidadProducto) {
		this.isVisibilidadCeldaGuardarUtilidadProducto = isVisibilidadCeldaGuardarUtilidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUtilidadProducto() {
		return isVisibilidadCeldaGuardarCambiosUtilidadProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUtilidadProducto(Boolean isVisibilidadCeldaGuardarCambiosUtilidadProducto) {
		this.isVisibilidadCeldaGuardarCambiosUtilidadProducto = isVisibilidadCeldaGuardarCambiosUtilidadProducto;
	}
		
	public UtilidadProductoSessionBean getutilidadproductoSessionBean() {
		return this.utilidadproductoSessionBean;
	}
	
	public void setutilidadproductoSessionBean(UtilidadProductoSessionBean utilidadproductoSessionBean) {
		this.utilidadproductoSessionBean=utilidadproductoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdBodegaPorIdProducto() {
		return this.isVisibilidadBusquedaPorIdBodegaPorIdProducto;
	}

	public void setisVisibilidadBusquedaPorIdBodegaPorIdProducto(Boolean isVisibilidadBusquedaPorIdBodegaPorIdProducto) {
		this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isVisibilidadBusquedaPorIdBodegaPorIdProducto;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(UtilidadProducto utilidadproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(utilidadproducto,null);
				this.setActualParaGuardarSucursalForeignKey(utilidadproducto,null);
				this.setActualParaGuardarBodegaForeignKey(utilidadproducto,null);
				this.setActualParaGuardarProductoForeignKey(utilidadproducto,null);
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
	
	public void bugActualizarReferenciaActual(UtilidadProducto utilidadproducto,UtilidadProducto utilidadproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUtilidadProducto(utilidadproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		utilidadproductoAux.setId(utilidadproducto.getId());
		utilidadproductoAux.setVersionRow(utilidadproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessUtilidadProducto();
		
			int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = utilidadproductoValidator.getInvalidValues(this.utilidadproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			utilidadproductoLogic.setDatosCliente(datosCliente);
			utilidadproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				utilidadproductoAux=new  UtilidadProducto();
				
				utilidadproductoAux.setIsNew(true);
				utilidadproductoAux.setIsChanged(true);
				
				utilidadproductoAux.setUtilidadProductoOriginal(this.utilidadproducto);
				
				utilidadproductoAux.setId(this.utilidadproducto.getId());	
				utilidadproductoAux.setVersionRow(this.utilidadproducto.getVersionRow());	
				utilidadproductoAux.setid_empresa(this.utilidadproducto.getid_empresa());	
				utilidadproductoAux.setid_sucursal(this.utilidadproducto.getid_sucursal());	
				utilidadproductoAux.setid_bodega(this.utilidadproducto.getid_bodega());	
				utilidadproductoAux.setid_producto(this.utilidadproducto.getid_producto());	
				utilidadproductoAux.setporcentaje(this.utilidadproducto.getporcentaje());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.utilidadproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(utilidadproductoAux,utilidadproductoLogic.getUtilidadProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadproductoAux,utilidadproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.utilidadproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductoLogic.saveUtilidadProductos();//WithConnection
						//utilidadproductoLogic.getSetVersionRowUtilidadProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.utilidadproducto,utilidadproductoAux);
					
					this.refrescarForeignKeysDescripcionesUtilidadProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								utilidadproductoLogic.saveUtilidadProductoRelaciones(utilidadproductoAux);//WithConnection
								//utilidadproductoLogic.getSetVersionRowUtilidadProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.utilidadproducto,utilidadproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.utilidadproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(utilidadproductoAux,utilidadproductoLogic.getUtilidadProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(utilidadproductoAux,utilidadproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.utilidadproducto,utilidadproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				utilidadproductoAux=new  UtilidadProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.utilidadproductoSessionBean.getEsGuardarRelacionado() && this.utilidadproducto.getId()>=0)) {
						
					utilidadproductoAux.setIsNew(false);
				}
				
				utilidadproductoAux.setIsDeleted(false);
			
				utilidadproductoAux.setId(this.utilidadproducto.getId());	
				utilidadproductoAux.setVersionRow(this.utilidadproducto.getVersionRow());	
				utilidadproductoAux.setid_empresa(this.utilidadproducto.getid_empresa());	
				utilidadproductoAux.setid_sucursal(this.utilidadproducto.getid_sucursal());	
				utilidadproductoAux.setid_bodega(this.utilidadproducto.getid_bodega());	
				utilidadproductoAux.setid_producto(this.utilidadproducto.getid_producto());	
				utilidadproductoAux.setporcentaje(this.utilidadproducto.getporcentaje());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(utilidadproductoAux,utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadproductoAux,utilidadproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.utilidadproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductoLogic.saveUtilidadProductos();//WithConnection
						//utilidadproductoLogic.getSetVersionRowUtilidadProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.utilidadproducto,utilidadproductoAux);
					
					this.refrescarForeignKeysDescripcionesUtilidadProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								utilidadproductoLogic.saveUtilidadProductoRelaciones(utilidadproductoAux);//WithConnection
								//utilidadproductoLogic.getSetVersionRowUtilidadProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.utilidadproducto,utilidadproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.utilidadproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(utilidadproductoAux,utilidadproductoLogic.getUtilidadProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(utilidadproductoAux,utilidadproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.utilidadproducto,utilidadproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				utilidadproductoAux=new  UtilidadProducto();
				
				utilidadproductoAux.setIsNew(false);
				utilidadproductoAux.setIsChanged(false);
				
				utilidadproductoAux.setIsDeleted(true);
				
				utilidadproductoAux.setId(this.utilidadproducto.getId());	
				utilidadproductoAux.setVersionRow(this.utilidadproducto.getVersionRow());	
				utilidadproductoAux.setid_empresa(this.utilidadproducto.getid_empresa());	
				utilidadproductoAux.setid_sucursal(this.utilidadproducto.getid_sucursal());	
				utilidadproductoAux.setid_bodega(this.utilidadproducto.getid_bodega());	
				utilidadproductoAux.setid_producto(this.utilidadproducto.getid_producto());	
				utilidadproductoAux.setporcentaje(this.utilidadproducto.getporcentaje());	
				
				if(this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.utilidadproductoAux.getId()>=0) {	
						this.utilidadproductosEliminados.add(utilidadproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(utilidadproductoAux,utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadproductoAux,utilidadproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.utilidadproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductoLogic.saveUtilidadProductos();//WithConnection
						//utilidadproductoLogic.getSetVersionRowUtilidadProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								utilidadproductoLogic.saveUtilidadProductoRelaciones(utilidadproductoAux);//WithConnection
								//utilidadproductoLogic.getSetVersionRowUtilidadProductos();//WithConnection
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
							if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.utilidadproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(utilidadproductoAux,utilidadproductoLogic.getUtilidadProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(utilidadproductoAux,utilidadproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.getUtilidadProductos().addAll(this.utilidadproductosEliminados);
					
					utilidadproductoLogic.saveUtilidadProductos();//WithConnection
					//utilidadproductoLogic.getSetVersionRowUtilidadProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesUtilidadProducto();
				
				this.utilidadproductosEliminados= new ArrayList<UtilidadProducto>();		
			}
			
			if(this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Utilidad Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.utilidadproducto=utilidadproductoAux;
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
      		//this.finishProcessUtilidadProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(UtilidadProducto utilidadproductoLocal) throws Exception {
		
		if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(UtilidadProducto utilidadproductoLocal) throws Exception {	
		if(this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				utilidadproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				utilidadproductoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				utilidadproductoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				utilidadproductoLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUtilidadProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = utilidadproductoValidator.getInvalidValues(this.utilidadproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(UtilidadProducto utilidadproducto,List<UtilidadProducto> utilidadproductos) throws Exception {
		try	{		
			UtilidadProductoConstantesFunciones.actualizarLista(utilidadproducto,utilidadproductos,this.utilidadproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(UtilidadProducto utilidadproducto,List<UtilidadProducto> utilidadproductos) throws Exception {
		try	{			
			UtilidadProductoConstantesFunciones.actualizarSelectedLista(utilidadproducto,utilidadproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<UtilidadProducto> utilidadproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				utilidadproductosLocal=this.utilidadproductoLogic.getUtilidadProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				utilidadproductosLocal=this.utilidadproductos;
			}
			//ARCHITECTURE
		
			for(UtilidadProducto utilidadproductoLocal:utilidadproductosLocal) {
				if(this.permiteMantenimiento(utilidadproductoLocal) && utilidadproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+UtilidadProductoConstantesFunciones.getUtilidadProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UtilidadProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadProducto.jLabelid_empresaUtilidadProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadProductoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadProducto.jLabelid_sucursalUtilidadProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadProductoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadProducto.jLabelid_bodegaUtilidadProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadProductoConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadProducto.jLabelid_productoUtilidadProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadProductoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadProducto.jLabelporcentajeUtilidadProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadProducto.jLabelid_empresaUtilidadProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadProducto.jLabelid_sucursalUtilidadProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadProducto.jLabelid_bodegaUtilidadProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadProducto.jLabelid_productoUtilidadProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadProducto.jLabelporcentajeUtilidadProducto,"");
		
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
		this.iIdNuevoUtilidadProducto--;	
		
		
		this.utilidadproductoAux=new UtilidadProducto();
		
		this.utilidadproductoAux.setId(this.iIdNuevoUtilidadProducto);
		this.utilidadproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.utilidadproductoLogic.getUtilidadProductos().add(this.utilidadproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.utilidadproductos.add(this.utilidadproductoAux);
		}
		//ARCHITECTURE
		
		this.utilidadproducto=this.utilidadproductoAux;
		
		if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUtilidadProducto(this.utilidadproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyUtilidadProducto(this.utilidadproducto);
		}
				
		//this.setDefaultControlesUtilidadProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUtilidadProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUtilidadProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUtilidadProducto(this.utilidadproductoBean,this.utilidadproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(UtilidadProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {
			classes=UtilidadProductoConstantesFunciones.getClassesRelationshipsOfUtilidadProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.utilidadproductoReturnGeneral=utilidadproductoLogic.procesarEventosUtilidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadproductoLogic.getUtilidadProductos(),this.utilidadproducto,this.utilidadproductoParameterGeneral,this.isEsNuevoUtilidadProducto,classes);//this.utilidadproductoLogic.getUtilidadProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUtilidadProducto(this.utilidadproductoReturnGeneral,this.utilidadproductoBean,false);
		
		if(this.utilidadproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUtilidadProducto(this.utilidadproductoReturnGeneral.getUtilidadProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUtilidadProducto(this.utilidadproductoReturnGeneral.getUtilidadProducto());
		}
		
		if(this.utilidadproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUtilidadProducto(this.utilidadproductoReturnGeneral.getUtilidadProducto(),classes);//this.utilidadproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUtilidadProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUtilidadProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.RecargarFormUtilidadProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUtilidadProducto(false);
						
			if(utilidadproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadProducto();
			}
			
			this.actualizarVisualTableDatosUtilidadProducto();
			
			this.jTableDatosUtilidadProducto.setRowSelectionInterval(this.getIndiceNuevoUtilidadProducto(), this.getIndiceNuevoUtilidadProducto());
			
			this.seleccionarFilaTablaUtilidadProductoActual();
						
			this.actualizarEstadoCeldasBotonesUtilidadProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUtilidadProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormUtilidadProducto.jTextFieldporcentajeUtilidadProducto.setEnabled(isHabilitar && this.utilidadproductoConstantesFunciones.activarporcentajeUtilidadProducto);	
		//
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.setEnabled(isHabilitar && this.utilidadproductoConstantesFunciones.activarid_empresaUtilidadProducto);//
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.setEnabled(isHabilitar && this.utilidadproductoConstantesFunciones.activarid_sucursalUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.setEnabled(isHabilitar && this.utilidadproductoConstantesFunciones.activarid_bodegaUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.setEnabled(isHabilitar && this.utilidadproductoConstantesFunciones.activarid_productoUtilidadProducto);
	};
	
	public void setDefaultControlesUtilidadProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUtilidadProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.utilidadproductoSessionBean.setConGuardarRelaciones(true);			
			this.utilidadproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUtilidadProducto.jTabbedPaneRelacionesUtilidadProducto.setVisible(true);
			
					
		} else {
			//this.utilidadproductoSessionBean.setConGuardarRelaciones(false);			
			this.utilidadproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUtilidadProducto.jTabbedPaneRelacionesUtilidadProducto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoUtilidadProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadProducto utilidadproductoAux:this.utilidadproductoLogic.getUtilidadProductos()) {
				if(utilidadproductoAux.getId().equals(this.iIdNuevoUtilidadProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadProducto utilidadproductoAux:this.utilidadproductos) {
				if(utilidadproductoAux.getId().equals(this.iIdNuevoUtilidadProducto)) {
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
	
	public int getIndiceActualUtilidadProducto(UtilidadProducto utilidadproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadProducto utilidadproductoAux:this.utilidadproductoLogic.getUtilidadProductos()) {
				if(utilidadproductoAux.getId().equals(utilidadproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadProducto utilidadproductoAux:this.utilidadproductos) {
				if(utilidadproductoAux.getId().equals(utilidadproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalUtilidadProducto(UtilidadProducto utilidadproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadProducto utilidadproductoAux:this.utilidadproductoLogic.getUtilidadProductos()) {
				if(utilidadproductoAux.getUtilidadProductoOriginal().getId().equals(utilidadproductoOriginal.getId())) {
					existe=true;
					utilidadproductoOriginal.setId(utilidadproductoAux.getId());
					utilidadproductoOriginal.setVersionRow(utilidadproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadProducto utilidadproductoAux:this.utilidadproductos) {
				if(utilidadproductoAux.getUtilidadProductoOriginal().getId().equals(utilidadproductoOriginal.getId())) {
					existe=true;
					utilidadproductoOriginal.setId(utilidadproductoAux.getId());
					utilidadproductoOriginal.setVersionRow(utilidadproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUtilidadProducto(Boolean esParaCancelar) throws Exception {
		utilidadproductosAux=new ArrayList<UtilidadProducto>();
		utilidadproductoAux=new UtilidadProducto();
		
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UtilidadProducto utilidadproductoAux:this.utilidadproductoLogic.getUtilidadProductos()) {
					if(utilidadproductoAux.getId()<0) {
						utilidadproductosAux.add(utilidadproductoAux);
					}		
				}
				this.iIdNuevoUtilidadProducto=0L;
				this.utilidadproductoLogic.getUtilidadProductos().removeAll(utilidadproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadProducto utilidadproductoAux:this.utilidadproductos) {
					if(utilidadproductoAux.getId()<0) {
						utilidadproductosAux.add(utilidadproductoAux);
					}		
				}
				this.iIdNuevoUtilidadProducto=0L;
				this.utilidadproductos.removeAll(utilidadproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUtilidadProducto 
					&& this.utilidadproductoLogic.getUtilidadProductos().size()>0
					) {
					utilidadproductoAux=this.utilidadproductoLogic.getUtilidadProductos().get(this.utilidadproductoLogic.getUtilidadProductos().size() - 1);
				
					if(utilidadproductoAux.getId()<0) {
						this.utilidadproductoLogic.getUtilidadProductos().remove(utilidadproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUtilidadProducto && this.utilidadproductos.size()>0) {
					utilidadproductoAux=this.utilidadproductos.get(this.utilidadproductos.size() - 1);
				
					if(utilidadproductoAux.getId()<0) {
						this.utilidadproductos.remove(utilidadproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUtilidadProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(utilidadproducto.getId()<0) {
				this.utilidadproductoLogic.getUtilidadProductos().remove(this.utilidadproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(utilidadproducto.getId()<0) {
				this.utilidadproductos.remove(this.utilidadproducto);
			}
		}			
	}
	
	public void setEstadosInicialesUtilidadProducto(List<UtilidadProducto> utilidadproductosAux) throws Exception {
		UtilidadProductoConstantesFunciones.setEstadosInicialesUtilidadProducto(utilidadproductosAux);
	}
	
	public void setEstadosInicialesUtilidadProducto(UtilidadProducto utilidadproductoAux) throws Exception {
		UtilidadProductoConstantesFunciones.setEstadosInicialesUtilidadProducto(utilidadproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUtilidadProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUtilidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUtilidadProductoActual()) {
				if(!this.isEsNuevoUtilidadProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUtilidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUtilidadProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUtilidadProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Utilidad Producto ?", "MANTENIMIENTO DE Utilidad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUtilidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(UtilidadProducto utilidadproducto) throws Exception {
		UtilidadProductoConstantesFunciones.seleccionarAsignar(this.utilidadproducto,utilidadproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUtilidadProducto=this.isPermisoActualizarOriginalUtilidadProducto;
			
			
			this.seleccionarAsignar(utilidadproducto);
			
			

			idProductoActual=utilidadproducto.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UtilidadProductoConstantesFunciones.quitarEspaciosUtilidadProducto(this.utilidadproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesUtilidadProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.utilidadproductoSessionBean.setsFuncionBusquedaRapida(this.utilidadproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoUtilidadProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUtilidadProducto(esParaCancelar);				
				this.cancelarNuevoUtilidadProducto(esParaCancelar);								
			}
			
			this.utilidadproducto=new UtilidadProducto();
			
			this.inicializarUtilidadProducto();
			
			this.actualizarEstadoCeldasBotonesUtilidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUtilidadProducto() throws Exception {
		try {
			UtilidadProductoConstantesFunciones.inicializarUtilidadProducto(this.utilidadproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.utilidadproductoLogic.getUtilidadProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUtilidadProductos(String sAccionBusqueda,List<UtilidadProducto> utilidadproductosParaReportes) throws Exception {
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
					sPathReporteFinal="UtilidadProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UtilidadProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UtilidadProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="UtilidadProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Utilidad Productoes");		
		parameters.put("busquedapor", UtilidadProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUtilidadProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UtilidadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UtilidadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUtilidadProducto=new JRBeanArrayDataSource(UtilidadProductoJInternalFrame.TraerUtilidadProductoBeans(utilidadproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUtilidadProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UtilidadProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UtilidadProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UtilidadProductoBean.TraerUtilidadProductoBeans(utilidadproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteUtilidadProductos(sAccionBusqueda,sTipoArchivoReporte,utilidadproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUtilidadProductos(sAccionBusqueda,sTipoArchivoReporte,utilidadproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUtilidadProductoActionPerformed(null);
					//this.generarExcelReporteUtilidadProductos(sAccionBusqueda,sTipoArchivoReporte,utilidadproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUtilidadProductos(sAccionBusqueda,sTipoArchivoReporte,utilidadproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUtilidadProductos(sAccionBusqueda,sTipoArchivoReporte,utilidadproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUtilidadProductos(sAccionBusqueda,sTipoArchivoReporte,utilidadproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUtilidadProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadProducto> utilidadproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUtilidadProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(UtilidadProducto utilidadproducto : utilidadproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UtilidadProductoConstantesFunciones.generarExcelReporteDataUtilidadProducto("NORMAL",row,workbook,utilidadproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUtilidadProducto(String sTipo,Row row,Workbook workbook) {
		
		UtilidadProductoConstantesFunciones.generarExcelReporteHeaderUtilidadProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUtilidadProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadProducto> utilidadproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(UtilidadProducto utilidadproducto : utilidadproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UtilidadProductoConstantesFunciones.getUtilidadProductoDescripcion(utilidadproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadproducto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadProductoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadproducto.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadproducto.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadproducto.getporcentaje());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUtilidadProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadProducto> utilidadproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<UtilidadProducto> utilidadproductosRespaldo=null;
		
		classes=UtilidadProductoConstantesFunciones.getClassesRelationshipsOfUtilidadProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.utilidadproductoLogic.setDatosCliente(this.datosCliente);
		this.utilidadproductoLogic.setDatosDeep(this.datosDeep);
		this.utilidadproductoLogic.setIsConDeep(true);
		
		utilidadproductosRespaldo=this.utilidadproductoLogic.getUtilidadProductos();
		
		this.utilidadproductoLogic.setUtilidadProductos(utilidadproductosParaReportes);	
		this.utilidadproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		utilidadproductosParaReportes=this.utilidadproductoLogic.getUtilidadProductos();
		this.utilidadproductoLogic.setUtilidadProductos(utilidadproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUtilidadProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(UtilidadProducto utilidadproducto : utilidadproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUtilidadProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UtilidadProductoConstantesFunciones.generarExcelReporteDataUtilidadProducto("NORMAL",row,workbook,utilidadproducto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(UtilidadProductoConstantesFunciones.getUtilidadProductoDescripcion(utilidadproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUtilidadProducto() throws Exception {		
		this.startProcessUtilidadProducto(true);
	}
	
	public void startProcessUtilidadProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUtilidadProducto ,this.jPanelParametrosReportesUtilidadProducto, this.jScrollPanelDatosUtilidadProducto,this.jPanelPaginacionUtilidadProducto, this.jScrollPanelDatosEdicionUtilidadProducto, this.jPanelAccionesUtilidadProducto,this.jPanelAccionesFormularioUtilidadProducto,this.jmenuBarUtilidadProducto,this.jmenuBarDetalleUtilidadProducto,this.jTtoolBarUtilidadProducto,this.jTtoolBarDetalleUtilidadProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasUtilidadProducto=this.jTabbedPaneBusquedasUtilidadProducto; 
		
		final JPanel jPanelParametrosReportesUtilidadProducto=this.jPanelParametrosReportesUtilidadProducto;
		//final JScrollPane jScrollPanelDatosUtilidadProducto=this.jScrollPanelDatosUtilidadProducto;
		final JTable jTableDatosUtilidadProducto=this.jTableDatosUtilidadProducto;		
		final JPanel jPanelPaginacionUtilidadProducto=this.jPanelPaginacionUtilidadProducto;
		//final JScrollPane jScrollPanelDatosEdicionUtilidadProducto=this.jScrollPanelDatosEdicionUtilidadProducto;
		final JPanel jPanelAccionesUtilidadProducto=this.jPanelAccionesUtilidadProducto;
		
		JPanel jPanelCamposAuxiliarUtilidadProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUtilidadProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			jPanelCamposAuxiliarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jPanelCamposUtilidadProducto;
			jPanelAccionesFormularioAuxiliarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jPanelAccionesFormularioUtilidadProducto;
		}
		
		final JPanel jPanelCamposUtilidadProducto=jPanelCamposAuxiliarUtilidadProducto;
		final JPanel jPanelAccionesFormularioUtilidadProducto=jPanelAccionesFormularioAuxiliarUtilidadProducto;
		
		
		final JMenuBar jmenuBarUtilidadProducto=this.jmenuBarUtilidadProducto;
		final JToolBar jTtoolBarUtilidadProducto=this.jTtoolBarUtilidadProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUtilidadProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUtilidadProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			jmenuBarDetalleAuxiliarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jmenuBarDetalleUtilidadProducto;
			jTtoolBarDetalleAuxiliarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jTtoolBarDetalleUtilidadProducto;
		}
		
		final JMenuBar jmenuBarDetalleUtilidadProducto=jmenuBarDetalleAuxiliarUtilidadProducto;
		final JToolBar jTtoolBarDetalleUtilidadProducto=jTtoolBarDetalleAuxiliarUtilidadProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUtilidadProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUtilidadProducto;
			processRunnable.jTableDatos=jTableDatosUtilidadProducto;
			processRunnable.jPanelCampos=jPanelCamposUtilidadProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionUtilidadProducto;
			processRunnable.jPanelAcciones=jPanelAccionesUtilidadProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUtilidadProducto;
			
			
			processRunnable.jmenuBar=jmenuBarUtilidadProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUtilidadProducto;
			processRunnable.jTtoolBar=jTtoolBarUtilidadProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUtilidadProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUtilidadProducto ,jPanelParametrosReportesUtilidadProducto,jTableDatosUtilidadProducto, /*jScrollPanelDatosUtilidadProducto,*/jPanelCamposUtilidadProducto,jPanelPaginacionUtilidadProducto, /*jScrollPanelDatosEdicionUtilidadProducto,*/ jPanelAccionesUtilidadProducto,jPanelAccionesFormularioUtilidadProducto,jmenuBarUtilidadProducto,jmenuBarDetalleUtilidadProducto,jTtoolBarUtilidadProducto,jTtoolBarDetalleUtilidadProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUtilidadProducto ,jPanelParametrosReportesUtilidadProducto, jScrollPanelDatosUtilidadProducto,jPanelPaginacionUtilidadProducto, jScrollPanelDatosEdicionUtilidadProducto, jPanelAccionesUtilidadProducto,jPanelAccionesFormularioUtilidadProducto,jmenuBarUtilidadProducto,jmenuBarDetalleUtilidadProducto,jTtoolBarUtilidadProducto,jTtoolBarDetalleUtilidadProducto);
						
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
	
	public void finishProcessUtilidadProducto() {// throws Exception 
		this.finishProcessUtilidadProducto(true);
	}
	
	public void finishProcessUtilidadProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUtilidadProducto ,this.jPanelParametrosReportesUtilidadProducto, this.jScrollPanelDatosUtilidadProducto,this.jPanelPaginacionUtilidadProducto, this.jScrollPanelDatosEdicionUtilidadProducto, this.jPanelAccionesUtilidadProducto,this.jPanelAccionesFormularioUtilidadProducto,this.jmenuBarUtilidadProducto,this.jmenuBarDetalleUtilidadProducto,this.jTtoolBarUtilidadProducto,this.jTtoolBarDetalleUtilidadProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasUtilidadProducto=this.jTabbedPaneBusquedasUtilidadProducto; 
		
		final JPanel jPanelParametrosReportesUtilidadProducto=this.jPanelParametrosReportesUtilidadProducto;
		//final JScrollPane jScrollPanelDatosUtilidadProducto=this.jScrollPanelDatosUtilidadProducto;
		final JTable jTableDatosUtilidadProducto=this.jTableDatosUtilidadProducto;		
		final JPanel jPanelPaginacionUtilidadProducto=this.jPanelPaginacionUtilidadProducto;
		//final JScrollPane jScrollPanelDatosEdicionUtilidadProducto=this.jScrollPanelDatosEdicionUtilidadProducto;
		final JPanel jPanelAccionesUtilidadProducto=this.jPanelAccionesUtilidadProducto;
		
		JPanel jPanelCamposAuxiliarUtilidadProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUtilidadProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			jPanelCamposAuxiliarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jPanelCamposUtilidadProducto;
			jPanelAccionesFormularioAuxiliarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jPanelAccionesFormularioUtilidadProducto;
		}
		
		final JPanel jPanelCamposUtilidadProducto=jPanelCamposAuxiliarUtilidadProducto;
		final JPanel jPanelAccionesFormularioUtilidadProducto=jPanelAccionesFormularioAuxiliarUtilidadProducto;
		
		
		final JMenuBar jmenuBarUtilidadProducto=this.jmenuBarUtilidadProducto;		
		final JToolBar jTtoolBarUtilidadProducto=this.jTtoolBarUtilidadProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarUtilidadProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUtilidadProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			jmenuBarDetalleAuxiliarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jmenuBarDetalleUtilidadProducto;
			jTtoolBarDetalleAuxiliarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jTtoolBarDetalleUtilidadProducto;		
		}
		
		final JMenuBar jmenuBarDetalleUtilidadProducto=jmenuBarDetalleAuxiliarUtilidadProducto;
		final JToolBar jTtoolBarDetalleUtilidadProducto=jTtoolBarDetalleAuxiliarUtilidadProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUtilidadProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUtilidadProducto;
			processRunnable.jTableDatos=jTableDatosUtilidadProducto;
			processRunnable.jPanelCampos=jPanelCamposUtilidadProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionUtilidadProducto;
			processRunnable.jPanelAcciones=jPanelAccionesUtilidadProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUtilidadProducto;
			
			
			processRunnable.jmenuBar=jmenuBarUtilidadProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUtilidadProducto;
			processRunnable.jTtoolBar=jTtoolBarUtilidadProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUtilidadProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUtilidadProducto ,jPanelParametrosReportesUtilidadProducto, jTableDatosUtilidadProducto,/*jScrollPanelDatosUtilidadProducto,*/jPanelCamposUtilidadProducto,jPanelPaginacionUtilidadProducto, /*jScrollPanelDatosEdicionUtilidadProducto,*/ jPanelAccionesUtilidadProducto,jPanelAccionesFormularioUtilidadProducto,jmenuBarUtilidadProducto,jmenuBarDetalleUtilidadProducto,jTtoolBarUtilidadProducto,jTtoolBarDetalleUtilidadProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUtilidadProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUtilidadProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUtilidadProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUtilidadProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUtilidadProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUtilidadProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUtilidadProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUtilidadProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUtilidadProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.utilidadproductoConstantesFunciones.getsFinalQueryUtilidadProducto();
		String  finalQueryPaginacionTodos=this.utilidadproductoConstantesFunciones.getsFinalQueryUtilidadProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=UtilidadProductoConstantesFunciones.getArrayColumnasGlobalesNoUtilidadProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UtilidadProductoConstantesFunciones.getArrayColumnasGlobalesUtilidadProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UtilidadProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.utilidadproductosEliminados= new ArrayList<UtilidadProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUtilidadProducto();
		
				///*UtilidadProductoSessionBean*/this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
			
			if(this.utilidadproductoSessionBean==null) {
				this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
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
					this.iNumeroPaginacion=UtilidadProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UtilidadProductoConstantesFunciones.getClassesForeignKeysOfUtilidadProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/utilidadproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			utilidadproductosAux= new ArrayList<UtilidadProducto>();
			
				
			utilidadproductoLogic.setDatosCliente(this.datosCliente);
			utilidadproductoLogic.setDatosDeep(this.datosDeep);
			utilidadproductoLogic.setIsConDeep(true);
			
			
			utilidadproductoLogic.getUtilidadProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					utilidadproductoLogic.getTodosUtilidadProductos(finalQueryGlobal,pagination);
					
					//utilidadproductoLogic.getTodosUtilidadProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(utilidadproductoLogic.getUtilidadProductos()==null|| utilidadproductoLogic.getUtilidadProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							utilidadproductosAux= new ArrayList<UtilidadProducto>();
							utilidadproductosAux.addAll(utilidadproductoLogic.getUtilidadProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductosAux= new ArrayList<UtilidadProducto>();
							utilidadproductosAux.addAll(utilidadproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							utilidadproductoLogic.getTodosUtilidadProductos(finalQueryGlobal+"",this.pagination);												
							
							//utilidadproductoLogic.getTodosUtilidadProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteUtilidadProductos("Todos",utilidadproductoLogic.getUtilidadProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							utilidadproductoLogic.setUtilidadProductos(new ArrayList<UtilidadProducto>());					
							utilidadproductoLogic.getUtilidadProductos().addAll(utilidadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductos=new ArrayList<UtilidadProducto>();
							utilidadproductos.addAll(utilidadproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUtilidadProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUtilidadProducto=this.idActual;
				
				} else if(this.idUtilidadProductoActual!=null && this.idUtilidadProductoActual!=0L) {
					idUtilidadProducto=idUtilidadProductoActual;
				}
				
					
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndicePorId(idUtilidadProducto);
				
				this.utilidadproductos=new ArrayList<UtilidadProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					utilidadproductoLogic.getEntity(idUtilidadProducto);
					
					//utilidadproductoLogic.getEntityWithConnection(idUtilidadProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadproductoLogic.setUtilidadProductos(new ArrayList<UtilidadProducto>());
					utilidadproductoLogic.getUtilidadProductos().add(utilidadproductoLogic.getUtilidadProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadproductos=new ArrayList<UtilidadProducto>();
					this.utilidadproductos.add(utilidadproducto);
				}
				
				if(utilidadproductoLogic.getUtilidadProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdBodegaPorIdProducto")) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadproductoLogic.getUtilidadProductosBusquedaPorIdBodegaPorIdProducto(finalQueryGlobal,pagination,id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadproductoLogic.getUtilidadProductos()==null||utilidadproductoLogic.getUtilidadProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadproductos==null|| utilidadproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductosAux=new ArrayList<UtilidadProducto>();
						utilidadproductosAux.addAll(utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductosAux=new ArrayList<UtilidadProducto>();
							utilidadproductosAux.addAll(utilidadproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadproductoLogic.getUtilidadProductosBusquedaPorIdBodegaPorIdProducto(finalQueryGlobal,pagination,id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadProductos("BusquedaPorIdBodegaPorIdProducto",utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadProductos("BusquedaPorIdBodegaPorIdProducto",utilidadproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductoLogic.setUtilidadProductos(new ArrayList<UtilidadProducto>());
						utilidadproductoLogic.getUtilidadProductos().addAll(utilidadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductos=new ArrayList<UtilidadProducto>();
							utilidadproductos.addAll(utilidadproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadproductoLogic.getUtilidadProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadproductoLogic.getUtilidadProductos()==null||utilidadproductoLogic.getUtilidadProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadproductos==null|| utilidadproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductosAux=new ArrayList<UtilidadProducto>();
						utilidadproductosAux.addAll(utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductosAux=new ArrayList<UtilidadProducto>();
							utilidadproductosAux.addAll(utilidadproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadproductoLogic.getUtilidadProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadProductos("FK_IdBodega",utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadProductos("FK_IdBodega",utilidadproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductoLogic.setUtilidadProductos(new ArrayList<UtilidadProducto>());
						utilidadproductoLogic.getUtilidadProductos().addAll(utilidadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductos=new ArrayList<UtilidadProducto>();
							utilidadproductos.addAll(utilidadproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadproductoLogic.getUtilidadProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadproductoLogic.getUtilidadProductos()==null||utilidadproductoLogic.getUtilidadProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadproductos==null|| utilidadproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductosAux=new ArrayList<UtilidadProducto>();
						utilidadproductosAux.addAll(utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductosAux=new ArrayList<UtilidadProducto>();
							utilidadproductosAux.addAll(utilidadproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadproductoLogic.getUtilidadProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadProductos("FK_IdEmpresa",utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadProductos("FK_IdEmpresa",utilidadproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductoLogic.setUtilidadProductos(new ArrayList<UtilidadProducto>());
						utilidadproductoLogic.getUtilidadProductos().addAll(utilidadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductos=new ArrayList<UtilidadProducto>();
							utilidadproductos.addAll(utilidadproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadproductoLogic.getUtilidadProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadproductoLogic.getUtilidadProductos()==null||utilidadproductoLogic.getUtilidadProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadproductos==null|| utilidadproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductosAux=new ArrayList<UtilidadProducto>();
						utilidadproductosAux.addAll(utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductosAux=new ArrayList<UtilidadProducto>();
							utilidadproductosAux.addAll(utilidadproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadproductoLogic.getUtilidadProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadProductos("FK_IdSucursal",utilidadproductoLogic.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadProductos("FK_IdSucursal",utilidadproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductoLogic.setUtilidadProductos(new ArrayList<UtilidadProducto>());
						utilidadproductoLogic.getUtilidadProductos().addAll(utilidadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductos=new ArrayList<UtilidadProducto>();
							utilidadproductos.addAll(utilidadproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUtilidadProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUtilidadProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=utilidadproductoLogic.getUtilidadProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=utilidadproductoLogic.getUtilidadProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(UtilidadProducto utilidadproducto) {
		Boolean permite=true;
		
		if(this.utilidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UtilidadProductoConstantesFunciones.getOrderByListaUtilidadProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UtilidadProductoConstantesFunciones.getOrderByListaUtilidadProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadProducto utilidadproducto:utilidadproductoLogic.getUtilidadProductos()) {
				if(utilidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadproductoTotales=utilidadproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadProducto utilidadproducto:this.utilidadproductos) {
				if(utilidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadproductoTotales=utilidadproducto;
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
			this.utilidadproductoAux=new UtilidadProducto();
			this.utilidadproductoAux.setsType(Constantes2.S_TOTALES);
			this.utilidadproductoAux.setIsNew(false);
			this.utilidadproductoAux.setIsChanged(false);
			this.utilidadproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				UtilidadProductoConstantesFunciones.TotalizarValoresFilaUtilidadProducto(this.utilidadproductoLogic.getUtilidadProductos(),this.utilidadproductoAux);
				
				this.utilidadproductoLogic.getUtilidadProductos().add(this.utilidadproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UtilidadProductoConstantesFunciones.TotalizarValoresFilaUtilidadProducto(this.utilidadproductos,this.utilidadproductoAux);
				
				this.utilidadproductos.add(this.utilidadproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		utilidadproductoTotales=new UtilidadProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.utilidadproductoLogic.getUtilidadProductos().remove(utilidadproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.utilidadproductos.remove(utilidadproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		utilidadproductoTotales=new UtilidadProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadProducto utilidadproducto:utilidadproductoLogic.getUtilidadProductos()) {
				if(utilidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadproductoTotales=utilidadproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UtilidadProductoConstantesFunciones.TotalizarValoresFilaUtilidadProducto(this.utilidadproductoLogic.getUtilidadProductos(),utilidadproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadProducto utilidadproducto:this.utilidadproductos) {
				if(utilidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadproductoTotales=utilidadproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UtilidadProductoConstantesFunciones.TotalizarValoresFilaUtilidadProducto(this.utilidadproductos,utilidadproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUtilidadProductosBusquedaPorIdBodegaPorIdProducto()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdBodegaPorIdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadProductosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadProductosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadProductosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getUtilidadProductosBusquedaPorIdBodegaPorIdProducto(String sFinalQuery,Long id_bodega,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadproductoLogic.getUtilidadProductosBusquedaPorIdBodegaPorIdProducto(sFinalQuery,this.pagination,id_bodega,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadProductosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadproductoLogic.getUtilidadProductosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadproductoLogic.getUtilidadProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadProductosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadproductoLogic.getUtilidadProductosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadProductosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadproductoLogic.getUtilidadProductosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosUtilidadProducto() {
		this.isPermisoTodoUtilidadProducto=false;
		this.isPermisoNuevoUtilidadProducto=false;
		this.isPermisoActualizarUtilidadProducto=false;
		this.isPermisoActualizarOriginalUtilidadProducto=false;
		this.isPermisoEliminarUtilidadProducto=false;
		this.isPermisoGuardarCambiosUtilidadProducto=false;
		this.isPermisoConsultaUtilidadProducto=false;
		this.isPermisoBusquedaUtilidadProducto=false;
		this.isPermisoReporteUtilidadProducto=false;		
		this.isPermisoOrdenUtilidadProducto=false;		
		this.isPermisoPaginacionMedioUtilidadProducto=false;		
		this.isPermisoPaginacionAltoUtilidadProducto=false;
		this.isPermisoPaginacionTodoUtilidadProducto=false;
		this.isPermisoCopiarUtilidadProducto=false;		
		this.isPermisoVerFormUtilidadProducto=false;		
		this.isPermisoDuplicarUtilidadProducto=false;		
		this.isPermisoOrdenUtilidadProducto=false;		
	}
	
	public void setPermisosUsuarioUtilidadProducto(Boolean isPermiso) {
		this.isPermisoTodoUtilidadProducto=isPermiso;
		this.isPermisoNuevoUtilidadProducto=isPermiso;
		this.isPermisoActualizarUtilidadProducto=isPermiso;
		this.isPermisoActualizarOriginalUtilidadProducto=isPermiso;
		this.isPermisoEliminarUtilidadProducto=isPermiso;
		this.isPermisoGuardarCambiosUtilidadProducto=isPermiso;
		this.isPermisoConsultaUtilidadProducto=isPermiso;
		this.isPermisoBusquedaUtilidadProducto=isPermiso;
		this.isPermisoReporteUtilidadProducto=isPermiso;
		this.isPermisoOrdenUtilidadProducto=isPermiso;		
		this.isPermisoPaginacionMedioUtilidadProducto=isPermiso;		
		this.isPermisoPaginacionAltoUtilidadProducto=isPermiso;		
		this.isPermisoPaginacionTodoUtilidadProducto=isPermiso;		
		this.isPermisoCopiarUtilidadProducto=isPermiso;		
		this.isPermisoVerFormUtilidadProducto=isPermiso;		
		this.isPermisoDuplicarUtilidadProducto=isPermiso;
		this.isPermisoOrdenUtilidadProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUtilidadProducto(Boolean isPermiso) {
		//this.isPermisoTodoUtilidadProducto=isPermiso;
		this.isPermisoNuevoUtilidadProducto=isPermiso;
		this.isPermisoActualizarUtilidadProducto=isPermiso;
		this.isPermisoActualizarOriginalUtilidadProducto=isPermiso;
		this.isPermisoEliminarUtilidadProducto=isPermiso;
		this.isPermisoGuardarCambiosUtilidadProducto=isPermiso;
		//this.isPermisoConsultaUtilidadProducto=isPermiso;
		//this.isPermisoBusquedaUtilidadProducto=isPermiso;
		//this.isPermisoReporteUtilidadProducto=isPermiso;
		//this.isPermisoOrdenUtilidadProducto=isPermiso;		
		//this.isPermisoPaginacionMedioUtilidadProducto=isPermiso;		
		//this.isPermisoPaginacionAltoUtilidadProducto=isPermiso;		
		//this.isPermisoPaginacionTodoUtilidadProducto=isPermiso;		
		//this.isPermisoCopiarUtilidadProducto=isPermiso;		
		//this.isPermisoDuplicarUtilidadProducto=isPermiso;
		//this.isPermisoOrdenUtilidadProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUtilidadProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(UtilidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebUtilidadProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUtilidadProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioUtilidadProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUtilidadProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUtilidadProductoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioUtilidadProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UtilidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UtilidadProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUtilidadProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUtilidadProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUtilidadProducto=this.isPermisoActualizarUtilidadProducto;
			this.isPermisoEliminarUtilidadProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUtilidadProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUtilidadProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUtilidadProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUtilidadProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUtilidadProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUtilidadProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUtilidadProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUtilidadProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUtilidadProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUtilidadProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUtilidadProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUtilidadProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUtilidadProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUtilidadProducto.setToolTipText(this.jTableDatosUtilidadProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUtilidadProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUtilidadProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UtilidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(UtilidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioUtilidadProducto() throws Exception {
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
	public void inicializarCombosForeignKeyUtilidadProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUtilidadProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UtilidadProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyUtilidadProductoListas(false);
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
	
	public void cargarCombosLoteForeignKeyUtilidadProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			UtilidadProductoParameterReturnGeneral utilidadproductoReturnGeneral=new UtilidadProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.utilidadproductoConstantesFunciones.cargarid_empresaUtilidadProducto)
					 || (this.esRecargarFks && this.utilidadproductoConstantesFunciones.cargarid_empresaUtilidadProducto)) {

					if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+utilidadproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.utilidadproductoConstantesFunciones.cargarid_sucursalUtilidadProducto)
					 || (this.esRecargarFks && this.utilidadproductoConstantesFunciones.cargarid_sucursalUtilidadProducto)) {

					if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+utilidadproductoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.utilidadproductoConstantesFunciones.cargarid_bodegaUtilidadProducto)
					 || (this.esRecargarFks && this.utilidadproductoConstantesFunciones.cargarid_bodegaUtilidadProducto)) {

					if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+utilidadproductoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.utilidadproductoConstantesFunciones.cargarid_productoUtilidadProducto)
					 || (this.esRecargarFks && this.utilidadproductoConstantesFunciones.cargarid_productoUtilidadProducto)) {

					if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+utilidadproductoSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				utilidadproductoReturnGeneral=utilidadproductoLogic.cargarCombosLoteForeignKeyUtilidadProducto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=utilidadproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=utilidadproductoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=utilidadproductoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=utilidadproductoReturnGeneral.getproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyUtilidadProducto()throws Exception {
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
			if(this.utilidadproductoSessionBean==null) {
				this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
			}

			if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.utilidadproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyUtilidadProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUtilidadProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyUtilidadProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUtilidadProducto(UtilidadProducto utilidadproducto)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(utilidadproducto.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(utilidadproducto.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUtilidadProducto(UtilidadProducto utilidadproducto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(utilidadproducto.getProducto()!=null && !sTipoEvento.equals("id_productoUtilidadProducto")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(utilidadproducto.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUtilidadProducto()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.utilidadproductoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.utilidadproductoConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUtilidadProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUtilidadProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUtilidadProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUtilidadProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUtilidadProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUtilidadProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public UtilidadProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UtilidadProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UtilidadProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.utilidadproductoSessionBean=new UtilidadProductoSessionBean(); 
		this.utilidadproductoConstantesFunciones=new UtilidadProductoConstantesFunciones(); 
		this.utilidadproductoBean=new UtilidadProducto();//(this.utilidadproductoConstantesFunciones); 		
		this.utilidadproductoReturnGeneral=new UtilidadProductoParameterReturnGeneral(); 
		
		this.utilidadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UtilidadProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UtilidadProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UtilidadProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUtilidadProducto(true);
			
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
			
			this.utilidadproductoConstantesFunciones=new UtilidadProductoConstantesFunciones(); 
			this.utilidadproductoBean=new UtilidadProducto();//this.utilidadproductoConstantesFunciones); 			
			this.utilidadproductoReturnGeneral=new UtilidadProductoParameterReturnGeneral(); 
		
			UtilidadProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Utilidad Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.utilidadproducto=new UtilidadProducto();
			this.utilidadproductos = new ArrayList<UtilidadProducto>();
			this.utilidadproductosAux = new ArrayList<UtilidadProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic=new UtilidadProductoLogic();
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.utilidadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.utilidadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUtilidadProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUtilidadProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUtilidadProducto);	
					}
					
					if(this.jInternalFrameImportacionUtilidadProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUtilidadProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUtilidadProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUtilidadProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUtilidadProducto);
				this.jInternalFrameDetalleFormUtilidadProducto.setVisible(false);
				this.jInternalFrameDetalleFormUtilidadProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUtilidadProducto);
					this.jInternalFrameReporteDinamicoUtilidadProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoUtilidadProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUtilidadProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUtilidadProducto);
					this.jInternalFrameImportacionUtilidadProducto.setVisible(false);
					this.jInternalFrameImportacionUtilidadProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUtilidadProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUtilidadProducto);
					this.jInternalFrameOrderByUtilidadProducto.setVisible(false);
					this.jInternalFrameOrderByUtilidadProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUtilidadProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UtilidadProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.utilidadproductoReturnGeneral=new UtilidadProductoParameterReturnGeneral();
			
			this.utilidadproductoParameterGeneral=new UtilidadProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.utilidadproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(UtilidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UtilidadProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.utilidadproductoSessionBean.getEsGuardarRelacionado(),this.utilidadproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UtilidadProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.utilidadproductoSessionBean.getEsGuardarRelacionado(),this.utilidadproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoUtilidadProducto=false;
			this.isVisibilidadCeldaDuplicarUtilidadProducto=true;
			this.isVisibilidadCeldaCopiarUtilidadProducto=true;
			this.isVisibilidadCeldaVerFormUtilidadProducto=true;
			this.isVisibilidadCeldaOrdenUtilidadProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;
			this.isVisibilidadCeldaModificarUtilidadProducto=false;
			this.isVisibilidadCeldaActualizarUtilidadProducto=false;
			this.isVisibilidadCeldaEliminarUtilidadProducto=false;
			this.isVisibilidadCeldaCancelarUtilidadProducto=false;
			this.isVisibilidadCeldaGuardarUtilidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=false;
			
			
			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUtilidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUtilidadProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUtilidadProducto(false);
			
			this.setPermisosUsuarioUtilidadProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.utilidadproductoSessionBean.getEsGuardarRelacionado() && this.utilidadproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUtilidadProductoClasesRelacionadas();
			}
			
			if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUtilidadProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUtilidadProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUtilidadProducto();
			}
			
			if(!this.isPermisoBusquedaUtilidadProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUtilidadProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioUtilidadProducto,this.isPermisoPaginacionMedioUtilidadProducto,this.isPermisoPaginacionTodoUtilidadProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UtilidadProductoConstantesFunciones.getTiposSeleccionarUtilidadProducto());
				
				this.tiposColumnasSelect=UtilidadProductoConstantesFunciones.getTiposSeleccionarUtilidadProducto(true);
				
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
			//if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUtilidadProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioUtilidadProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioUtilidadProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadProducto() ;
			
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
				utilidadproductoImplementable= (UtilidadProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UtilidadProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				utilidadproductoImplementableHome= (UtilidadProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UtilidadProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.utilidadproductos= new ArrayList<UtilidadProducto>();
			this.utilidadproductosEliminados= new ArrayList<UtilidadProducto>();
						
			this.isEsNuevoUtilidadProducto=false;
			this.esParaAccionDesdeFormularioUtilidadProducto=false;
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
				this.cargarCombosForeignKeyUtilidadProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUtilidadProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UtilidadProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UtilidadProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUtilidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUtilidadProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUtilidadProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUtilidadProducto();
			}
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUtilidadProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUtilidadProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUtilidadProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUtilidadProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga UtilidadProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUtilidadProducto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUtilidadProducto")) {
				iIndex=this.jInternalFrameDetalleFormUtilidadProducto.jTabbedPaneRelacionesUtilidadProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUtilidadProducto.jTabbedPaneRelacionesUtilidadProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUtilidadProducto();	
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
	
	public void cargarCombosForeignKeyUtilidadProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUtilidadProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUtilidadProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUtilidadProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUtilidadProducto();
		
		this.cargarCombosFrameForeignKeyUtilidadProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUtilidadProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUtilidadProducto();
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
	
	public void jButtonNuevoUtilidadProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
			
			if(jTableDatosUtilidadProducto.getRowCount()>=1) {
				jTableDatosUtilidadProducto.removeRowSelectionInterval(0, jTableDatosUtilidadProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoUtilidadProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUtilidadProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUtilidadProducto(true);			
			//this.utilidadproducto=new UtilidadProducto();
			//this.utilidadproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadProducto() ;
			
			if(UtilidadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.utilidadproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);				
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
			if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar UtilidadProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUtilidadProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUtilidadProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUtilidadProducto.getSelectedRows().length;			
			}
			
			utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUtilidadProducto--;			
				//UtilidadProducto utilidadproductoAux= new UtilidadProducto();			
				//utilidadproductoAux.setId(this.iIdNuevoUtilidadProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//UtilidadProducto utilidadproductoOrigen=new UtilidadProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(UtilidadProducto utilidadproductoOrigen : utilidadproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							utilidadproductoOrigen =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadproductoOrigen =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUtilidadProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.utilidadproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUtilidadProducto(utilidadproductoOrigen,this.utilidadproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.utilidadproductoLogic.getUtilidadProductos().add(this.utilidadproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.utilidadproductos.add(this.utilidadproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUtilidadProducto(false);
				
				this.jTableDatosUtilidadProducto.setRowSelectionInterval(this.getIndiceNuevoUtilidadProducto(), this.getIndiceNuevoUtilidadProducto());
				
				int iLastRow =  this.jTableDatosUtilidadProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUtilidadProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUtilidadProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();									
		
			UtilidadProducto utilidadproductoOrigen=new UtilidadProducto();
			UtilidadProducto utilidadproductoDestino=new UtilidadProducto();
				
			utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUtilidadProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || utilidadproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUtilidadProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductoOrigen =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						utilidadproductoOrigen =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadproductoDestino =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						utilidadproductoDestino =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				utilidadproductoOrigen =utilidadproductosSeleccionados.get(0);
				utilidadproductoDestino =utilidadproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUtilidadProducto(utilidadproductoOrigen,utilidadproductoDestino,true,false);
				
				utilidadproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(utilidadproductoDestino,utilidadproductoLogic.getUtilidadProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadproductoDestino,utilidadproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUtilidadProducto(false);
				
				//this.jTableDatosUtilidadProducto.setRowSelectionInterval(this.getIndiceNuevoUtilidadProducto(), this.getIndiceNuevoUtilidadProducto());
				
				int iLastRow =  this.jTableDatosUtilidadProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUtilidadProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUtilidadProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUtilidadProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUtilidadProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUtilidadProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUtilidadProducto.setVisible(!isVisible);
			this.jPanelPaginacionUtilidadProducto.setVisible(!isVisible);
			this.jPanelAccionesUtilidadProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUtilidadProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUtilidadProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUtilidadProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUtilidadProducto();
			
			this.abrirFrameOrderByUtilidadProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUtilidadProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUtilidadProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUtilidadProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUtilidadProducto.isMaximum()) {
					this.jInternalFrameDetalleFormUtilidadProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUtilidadProducto.setSize(this.jInternalFrameDetalleFormUtilidadProducto.iWidthFormulario,this.jInternalFrameDetalleFormUtilidadProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUtilidadProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUtilidadProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUtilidadProducto.isMaximum()) {
						this.jInternalFrameDetalleFormUtilidadProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUtilidadProducto.jContentPaneDetalleUtilidadProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUtilidadProducto.jTabbedPaneRelacionesUtilidadProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUtilidadProducto.jContentPaneDetalleUtilidadProducto.getWidth(),UtilidadProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUtilidadProducto.jTabbedPaneRelacionesUtilidadProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUtilidadProducto.jContentPaneDetalleUtilidadProducto.getWidth(),UtilidadProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUtilidadProducto.jTabbedPaneRelacionesUtilidadProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUtilidadProducto.jContentPaneDetalleUtilidadProducto.getWidth(),UtilidadProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUtilidadProducto.setVisible(true);
	        this.jInternalFrameDetalleFormUtilidadProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUtilidadProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUtilidadProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUtilidadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadProducto,false,this);
				} else {
					this.jInternalFrameOrderByUtilidadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUtilidadProducto);
				this.jInternalFrameOrderByUtilidadProducto.setVisible(false);
				this.jInternalFrameOrderByUtilidadProducto.setSelected(false);
				
				this.jInternalFrameOrderByUtilidadProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUtilidadProducto"));
				
				this.inicializarActualizarBindingTablaOrderByUtilidadProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUtilidadProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUtilidadProducto==null) {
				
				this.jInternalFrameImportacionUtilidadProducto=new ImportacionJInternalFrame(UtilidadProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUtilidadProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUtilidadProducto);
				this.jInternalFrameImportacionUtilidadProducto.setVisible(false);
				this.jInternalFrameImportacionUtilidadProducto.setSelected(false);


				this.jInternalFrameImportacionUtilidadProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUtilidadProducto"));
				this.jInternalFrameImportacionUtilidadProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUtilidadProducto"));
				this.jInternalFrameImportacionUtilidadProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUtilidadProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUtilidadProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUtilidadProducto==null) {
				this.jInternalFrameReporteDinamicoUtilidadProducto=new ReporteDinamicoJInternalFrame(UtilidadProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUtilidadProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUtilidadProducto);
				this.jInternalFrameReporteDinamicoUtilidadProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoUtilidadProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUtilidadProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadProducto"));
				this.jInternalFrameReporteDinamicoUtilidadProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadProducto"));
				this.jInternalFrameReporteDinamicoUtilidadProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleUtilidadProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUtilidadProducto);
			
	       	this.jInternalFrameDetalleFormUtilidadProducto.setVisible(false);
	        this.jInternalFrameDetalleFormUtilidadProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormUtilidadProducto.dispose();
			//this.jInternalFrameDetalleFormUtilidadProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUtilidadProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUtilidadProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoUtilidadProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUtilidadProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUtilidadProducto.setVisible(true);
	        this.jInternalFrameImportacionUtilidadProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUtilidadProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUtilidadProducto.setVisible(true);
	        this.jInternalFrameOrderByUtilidadProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUtilidadProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUtilidadProducto.setVisible(false);
	        this.jInternalFrameOrderByUtilidadProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUtilidadProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUtilidadProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoUtilidadProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUtilidadProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUtilidadProducto.setVisible(false);
	        this.jInternalFrameImportacionUtilidadProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUtilidadProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUtilidadProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUtilidadProducto(true);
			//this.isEsNuevoUtilidadProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUtilidadProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadProducto(false) ;
			
			if(utilidadproductoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(UtilidadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUtilidadProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUtilidadProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUtilidadProducto(true);
			//this.isEsNuevoUtilidadProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.utilidadproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUtilidadProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUtilidadProducto(false) ;
			
			if(UtilidadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.utilidadproductoConstantesFunciones.cargarid_productoUtilidadProducto) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingUtilidadProducto(false,false);
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
		TableColumn tableColumnBodega=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,UtilidadProductoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUtilidadProducto.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUtilidadProducto.getSelectedRow();

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
	
	public void jButtonActualizarUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUtilidadProducto(false);
			
			//if(!this.isEsNuevoUtilidadProducto) {								
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
				
			}
			
			if(this.permiteMantenimiento(this.utilidadproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUtilidadProducto=true;
					this.inicializarActualizarBindingTablaUtilidadProducto(false);
					this.isEsNuevoUtilidadProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUtilidadProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUtilidadProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUtilidadProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadProducto(false);
				
				this.habilitarDeshabilitarControlesUtilidadProducto(false);
			
												
				
				if(UtilidadProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUtilidadProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUtilidadProductoActionPerformed(evt,utilidadproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUtilidadProducto(this.utilidadproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUtilidadProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,utilidadproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.utilidadproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				this.utilidadproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				this.utilidadproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.utilidadproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UtilidadProductoModel) this.jTableDatosUtilidadProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUtilidadProducto=true;
				this.inicializarActualizarBindingTablaUtilidadProducto(false);
				this.isEsNuevoUtilidadProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUtilidadProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadProducto(false);
				
				this.habilitarDeshabilitarControlesUtilidadProducto(false);
				
				
				
				if(UtilidadProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUtilidadProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUtilidadProducto.getRowCount()>=1) {
				jTableDatosUtilidadProducto.removeRowSelectionInterval(0, jTableDatosUtilidadProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUtilidadProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUtilidadProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadProducto(false) ;
			
			this.isEsNuevoUtilidadProducto=false;
			
			if(UtilidadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUtilidadProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUtilidadProducto(false);
				
				//SI ES MANUAL
				if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUtilidadProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUtilidadProducto--;			
			//UtilidadProducto utilidadproductoAux= new UtilidadProducto();			
			//utilidadproductoAux.setId(this.iIdNuevoUtilidadProducto);
			
			if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUtilidadProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
			
			this.utilidadproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.utilidadproductoLogic.getUtilidadProductos().add(this.utilidadproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.utilidadproductos.add(this.utilidadproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUtilidadProducto(false);
			
			this.jTableDatosUtilidadProducto.setRowSelectionInterval(this.getIndiceNuevoUtilidadProducto(), this.getIndiceNuevoUtilidadProducto());
			
			int iLastRow =  this.jTableDatosUtilidadProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUtilidadProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUtilidadProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUtilidadProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUtilidadProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadProducto(false);
			
			//SI ES MANUAL
			if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadProducto();
			}
			
			//this.abrirFrameTreeUtilidadProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Utilidad ProductoES ?", "MANTENIMIENTO DE Utilidad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionUtilidadProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralUtilidadProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.utilidadproductoReturnGeneral=utilidadproductoLogic.procesarImportacionUtilidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.utilidadproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarUtilidadProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUtilidadProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUtilidadProducto.setFileImportacion(this.jInternalFrameImportacionUtilidadProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUtilidadProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUtilidadProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUtilidadProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUtilidadProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();		

		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UtilidadProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UtilidadProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteUtilidadProductos("Todos",utilidadproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoUtilidadProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
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
	
	public void jButtonGenerarExcelReporteDinamicoUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();		
		
		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("UtilidadProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(UtilidadProducto utilidadproducto:utilidadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(UtilidadProducto utilidadproducto:utilidadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadproducto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(UtilidadProducto utilidadproducto:utilidadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadproducto.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(UtilidadProducto utilidadproducto:utilidadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadproducto.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(UtilidadProducto utilidadproducto:utilidadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadproducto.getporcentaje());
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
			//	this.getFilaCabeceraExportarExcelUtilidadProducto(row);				
			//	iRow++;
			//}				
			
			//for(UtilidadProducto utilidadproductoAux:utilidadproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUtilidadProducto(utilidadproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadProducto(false);
			
			//SI ES MANUAL
			if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadProducto(false);
			
			//SI ES MANUAL
			if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUtilidadProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadProducto(false);
			
			//SI ES MANUAL
			if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUtilidadProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUtilidadProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUtilidadProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUtilidadProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUtilidadProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUtilidadProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUtilidadProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosUtilidadProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosUtilidadProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUtilidadProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUtilidadProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUtilidadProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUtilidadProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUtilidadProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUtilidadProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUtilidadProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUtilidadProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUtilidadProducto();
		
		this.inicializarActualizarBindingBotonesManualUtilidadProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUtilidadProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUtilidadProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUtilidadProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUtilidadProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUtilidadProducto.jCheckBoxPostAccionNuevoUtilidadProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUtilidadProducto.jCheckBoxPostAccionSinCerrarUtilidadProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUtilidadProducto.jCheckBoxPostAccionSinMensajeUtilidadProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUtilidadProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUtilidadProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUtilidadProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
				this.jInternalFrameDetalleFormUtilidadProducto.jCheckBoxPostAccionNuevoUtilidadProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUtilidadProducto.jCheckBoxPostAccionSinCerrarUtilidadProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUtilidadProducto.jCheckBoxPostAccionSinMensajeUtilidadProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUtilidadProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUtilidadProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUtilidadProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUtilidadProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUtilidadProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUtilidadProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUtilidadProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUtilidadProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUtilidadProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUtilidadProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUtilidadProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUtilidadProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadProducto() throws Exception {
		try	{
			if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUtilidadProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUtilidadProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUtilidadProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUtilidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUtilidadProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUtilidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUtilidadProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUtilidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUtilidadProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUtilidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUtilidadProducto.addItem(reporte);
			}
			
			
			if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUtilidadProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUtilidadProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUtilidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUtilidadProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUtilidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUtilidadProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUtilidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUtilidadProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUtilidadProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUtilidadProducto!=null) {
				this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUtilidadProducto!=null) {
				this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUtilidadProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUtilidadProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=UtilidadProductoConstantesFunciones.getTiposSeleccionarUtilidadProducto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=UtilidadProductoConstantesFunciones.getTiposSeleccionarUtilidadProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=UtilidadProductoConstantesFunciones.getTiposSeleccionarUtilidadProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoUtilidadProducto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUtilidadProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.getSelectedItem()!=null){this.id_bodegaBusquedaPorIdBodegaPorIdProducto=((Bodega)this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.getSelectedItem()!=null){this.id_productoBusquedaPorIdBodegaPorIdProducto=((Producto)this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUtilidadProducto(Boolean esInicializar) throws Exception {				
		if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUtilidadProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUtilidadProducto() throws Exception {
		this.inicializarActualizarBindingTablaUtilidadProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUtilidadProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUtilidadProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUtilidadProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=utilidadproductoLogic.getUtilidadProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=utilidadproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUtilidadProducto.setModel(new UtilidadProductoModel(this.utilidadproductoLogic.getUtilidadProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUtilidadProducto.setModel(new UtilidadProductoModel(this.utilidadproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUtilidadProducto!=null && this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUtilidadProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO,utilidadproductoConstantesFunciones.resaltarSeleccionarUtilidadProducto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO,utilidadproductoConstantesFunciones.resaltarSeleccionarUtilidadProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,UtilidadProductoConstantesFunciones.LABEL_ID));

		if(this.utilidadproductoConstantesFunciones.mostraridUtilidadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadproductoConstantesFunciones.resaltaridUtilidadProducto,this.utilidadproductoConstantesFunciones.activaridUtilidadProducto,iSizeTabla,this,true,"idUtilidadProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadproductoConstantesFunciones.resaltaridUtilidadProducto,this.utilidadproductoConstantesFunciones.activaridUtilidadProducto,this,true,"idUtilidadProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.utilidadproductoConstantesFunciones.mostrarid_empresaUtilidadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.utilidadproductoConstantesFunciones.resaltarid_empresaUtilidadProducto,this,this.utilidadproductoConstantesFunciones.activarid_empresaUtilidadProducto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.utilidadproductoConstantesFunciones.resaltarid_empresaUtilidadProducto,this,this.utilidadproductoConstantesFunciones.activarid_empresaUtilidadProducto,false,"id_empresaUtilidadProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.utilidadproductoConstantesFunciones.mostrarid_sucursalUtilidadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.utilidadproductoConstantesFunciones.resaltarid_sucursalUtilidadProducto,this,this.utilidadproductoConstantesFunciones.activarid_sucursalUtilidadProducto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.utilidadproductoConstantesFunciones.resaltarid_sucursalUtilidadProducto,this,this.utilidadproductoConstantesFunciones.activarid_sucursalUtilidadProducto,false,"id_sucursalUtilidadProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,UtilidadProductoConstantesFunciones.LABEL_IDBODEGA));

		if(this.utilidadproductoConstantesFunciones.mostrarid_bodegaUtilidadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadProductoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.utilidadproductoConstantesFunciones.resaltarid_bodegaUtilidadProducto,this,this.utilidadproductoConstantesFunciones.activarid_bodegaUtilidadProducto,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.utilidadproductoConstantesFunciones.resaltarid_bodegaUtilidadProducto,this,this.utilidadproductoConstantesFunciones.activarid_bodegaUtilidadProducto,true,"id_bodegaUtilidadProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.utilidadproductoConstantesFunciones.mostrarid_productoUtilidadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.utilidadproductoConstantesFunciones.resaltarid_productoUtilidadProducto,this,this.utilidadproductoConstantesFunciones.activarid_productoUtilidadProducto,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.utilidadproductoConstantesFunciones.resaltarid_productoUtilidadProducto,this,this.utilidadproductoConstantesFunciones.activarid_productoUtilidadProducto,true,"id_productoUtilidadProducto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.utilidadproductoConstantesFunciones.mostrarporcentajeUtilidadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadproductoConstantesFunciones.resaltarporcentajeUtilidadProducto,this.utilidadproductoConstantesFunciones.activarporcentajeUtilidadProducto,iSizeTabla,this,true,"porcentajeUtilidadProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadproductoConstantesFunciones.resaltarporcentajeUtilidadProducto,this.utilidadproductoConstantesFunciones.activarporcentajeUtilidadProducto,this,true,"porcentajeUtilidadProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.utilidadproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.utilidadproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUtilidadProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.utilidadproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.utilidadproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUtilidadProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.utilidadproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.utilidadproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUtilidadProducto.addColumn(tableColumn);
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
			
			this.jTableDatosUtilidadProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUtilidadProducto.moveColumn(this.jTableDatosUtilidadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUtilidadProducto.moveColumn(this.jTableDatosUtilidadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUtilidadProducto.moveColumn(this.jTableDatosUtilidadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUtilidadProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUtilidadProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUtilidadProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUtilidadProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUtilidadProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUtilidadProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUtilidadProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUtilidadProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=utilidadproductoLogic.getUtilidadProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=utilidadproductos.size()-1;
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
		//this.jTableDatosUtilidadProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUtilidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUtilidadProducto();
			
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
				
				//this.isEsNuevoUtilidadProducto=false;
					
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
				if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUtilidadProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUtilidadProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUtilidadProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.utilidadproducto.getsType().equals("DUPLICADO")
				   || this.utilidadproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUtilidadProducto=true;
				
				} else {
					this.isEsNuevoUtilidadProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.utilidadproducto.getId()>=0 && !this.utilidadproducto.getIsNew()) {						
						this.isEsNuevoUtilidadProducto=false;
						
					} else {
						this.isEsNuevoUtilidadProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUtilidadProducto(esRelaciones);						
				
				this.seleccionarUtilidadProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.utilidadproducto.getId()<0) {
					this.isEsNuevoUtilidadProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUtilidadProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUtilidadProducto(evt,rowIndex);
				}	
				
				if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion UtilidadProducto: " + this.dDif); 
					}
				}								
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUtilidadProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.utilidadproducto)) {
					if(this.utilidadproducto.getId()>0) {
						this.utilidadproducto.setIsDeleted(true);
						
						this.utilidadproductosEliminados.add(this.utilidadproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.utilidadproductoLogic.getUtilidadProductos().remove(this.utilidadproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.utilidadproductos.remove(this.utilidadproducto);				
					}
					
					
					((UtilidadProductoModel) this.jTableDatosUtilidadProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUtilidadProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUtilidadProducto) {
			
			if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUtilidadProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUtilidadProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUtilidadProducto(this.utilidadproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.utilidadproductoConstantesFunciones.cargarid_empresaUtilidadProducto || this.utilidadproductoConstantesFunciones.event_dependid_empresaUtilidadProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.utilidadproducto.getid_empresa());
									//this.inicializarActualizarBindingUtilidadProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(utilidadproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(utilidadproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.utilidadproducto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.utilidadproductoConstantesFunciones.cargarid_sucursalUtilidadProducto || this.utilidadproductoConstantesFunciones.event_dependid_sucursalUtilidadProducto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.utilidadproducto.getid_sucursal());
									//this.inicializarActualizarBindingUtilidadProducto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(utilidadproducto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(utilidadproducto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.utilidadproducto.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.utilidadproductoConstantesFunciones.cargarid_bodegaUtilidadProducto || this.utilidadproductoConstantesFunciones.event_dependid_bodegaUtilidadProducto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.utilidadproducto.getid_bodega());
									//this.inicializarActualizarBindingUtilidadProducto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(utilidadproducto.getBodega()!=null) {
							this.bodegasForeignKey.add(utilidadproducto.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.utilidadproducto.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.utilidadproductoConstantesFunciones.cargarid_productoUtilidadProducto || this.utilidadproductoConstantesFunciones.event_dependid_productoUtilidadProducto) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.utilidadproducto.getid_producto());
									//this.inicializarActualizarBindingUtilidadProducto(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(utilidadproducto.getProducto()!=null) {
							this.productosForeignKey.add(utilidadproducto.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.utilidadproducto.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUtilidadProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUtilidadProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUtilidadProducto(UtilidadProducto utilidadproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUtilidadProducto(utilidadproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUtilidadProducto(UtilidadProducto utilidadproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUtilidadProducto(utilidadproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUtilidadProducto(utilidadproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUtilidadProducto(utilidadproducto);
	}
	
	public void setVariablesObjetoActualToFormularioUtilidadProducto(UtilidadProducto utilidadproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.setText(utilidadproducto.getId().toString());
			this.jInternalFrameDetalleFormUtilidadProducto.jTextFieldporcentajeUtilidadProducto.setText(utilidadproducto.getporcentaje().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,UtilidadProducto utilidadproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,utilidadproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,UtilidadProducto utilidadproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				utilidadproductoLocal=this.utilidadproducto;
			} else {
				utilidadproductoLocal=this.utilidadproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(utilidadproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUtilidadProducto(utilidadproductoLocal,true);
					
					if(utilidadproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(utilidadproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(utilidadproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUtilidadProducto(UtilidadProducto utilidadproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUtilidadProducto(utilidadproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(utilidadproducto);
	}
	
	public void setVariablesFormularioToObjetoActualUtilidadProducto(UtilidadProducto utilidadproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUtilidadProducto(utilidadproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUtilidadProducto(UtilidadProducto utilidadproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.getText()==null || this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.getText()=="" || this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.setText("0");
			}

			if(conColumnasBase) {utilidadproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadProducto.jLabelIdUtilidadProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadproducto.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadProducto.jTextFieldporcentajeUtilidadProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadProducto.jLabelporcentajeUtilidadProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUtilidadProducto(UtilidadProducto utilidadproductoBean,UtilidadProducto utilidadproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && utilidadproductoBean.getid_bodega()!=null && !utilidadproductoBean.getid_bodega().equals(-1L))) {utilidadproducto.setid_bodega(utilidadproductoBean.getid_bodega());}
			if(conDefault || (!conDefault && utilidadproductoBean.getid_producto()!=null && !utilidadproductoBean.getid_producto().equals(-1L))) {utilidadproducto.setid_producto(utilidadproductoBean.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUtilidadProducto(UtilidadProducto utilidadproductoOrigen,UtilidadProducto utilidadproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && utilidadproductoOrigen.getId()!=null && !utilidadproductoOrigen.getId().equals(0L))) {utilidadproducto.setId(utilidadproductoOrigen.getId());}}
			if(conDefault || (!conDefault && utilidadproductoOrigen.getid_bodega()!=null && !utilidadproductoOrigen.getid_bodega().equals(-1L))) {utilidadproducto.setid_bodega(utilidadproductoOrigen.getid_bodega());}
			if(conDefault || (!conDefault && utilidadproductoOrigen.getid_producto()!=null && !utilidadproductoOrigen.getid_producto().equals(-1L))) {utilidadproducto.setid_producto(utilidadproductoOrigen.getid_producto());}
			if(conDefault || (!conDefault && utilidadproductoOrigen.getporcentaje()!=null && !utilidadproductoOrigen.getporcentaje().equals(0.0))) {utilidadproducto.setporcentaje(utilidadproductoOrigen.getporcentaje());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUtilidadProducto(UtilidadProducto utilidadproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.setText(utilidadproducto.getId().toString());
			this.jInternalFrameDetalleFormUtilidadProducto.jTextFieldporcentajeUtilidadProducto.setText(utilidadproducto.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUtilidadProducto(UtilidadProductoBean utilidadproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.setText(utilidadproductoBean.getId().toString());
			this.jInternalFrameDetalleFormUtilidadProducto.jTextFieldporcentajeUtilidadProducto.setText(utilidadproductoBean.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUtilidadProducto(UtilidadProductoParameterReturnGeneral utilidadproductoReturnGeneral,UtilidadProductoBean utilidadproductoBean,Boolean conDefault) throws Exception { 
		try {
			UtilidadProducto utilidadproductoLocal=new UtilidadProducto();
			
			utilidadproductoLocal=utilidadproductoReturnGeneral.getUtilidadProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && utilidadproductoLocal.getId()!=null && !utilidadproductoLocal.getId().equals(0L))) {utilidadproductoBean.setId(utilidadproductoLocal.getId());}}
			if(conDefault || (!conDefault && utilidadproductoLocal.getid_bodega()!=null && !utilidadproductoLocal.getid_bodega().equals(-1L))) {utilidadproductoBean.setid_bodega(utilidadproductoLocal.getid_bodega());}
			if(conDefault || (!conDefault && utilidadproductoLocal.getid_producto()!=null && !utilidadproductoLocal.getid_producto().equals(-1L))) {utilidadproductoBean.setid_producto(utilidadproductoLocal.getid_producto());}
			if(conDefault || (!conDefault && utilidadproductoLocal.getporcentaje()!=null && !utilidadproductoLocal.getporcentaje().equals(0.0))) {utilidadproductoBean.setporcentaje(utilidadproductoLocal.getporcentaje());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUtilidadProductoGenerico(Long idUtilidadProductoSeleccionado,JComboBox jComboBoxUtilidadProducto,List<UtilidadProducto> utilidadproductosLocal)throws Exception {
		try {
			UtilidadProducto  utilidadproductoTemp=null;

			for(UtilidadProducto utilidadproductoAux:utilidadproductosLocal) {
				if(utilidadproductoAux.getId()!=null && utilidadproductoAux.getId().equals(idUtilidadProductoSeleccionado)) {
					utilidadproductoTemp=utilidadproductoAux;
					break;
				}
			}

			jComboBoxUtilidadProducto.setSelectedItem(utilidadproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUtilidadProductoGenerico(JComboBox jComboBoxUtilidadProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUtilidadProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUtilidadProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUtilidadProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUtilidadProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUtilidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUtilidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadproducto=(UtilidadProducto) utilidadproductoLogic.getUtilidadProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			utilidadproducto =(UtilidadProducto) utilidadproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!utilidadproducto.getIsNew() && !utilidadproducto.getIsChanged() && !utilidadproducto.getIsDeleted()) {
				sDescripcion=utilidadproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!utilidadproducto.getIsNew() && !utilidadproducto.getIsChanged() && !utilidadproducto.getIsDeleted()) {
				sDescripcion=utilidadproducto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadproducto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!utilidadproducto.getIsNew() && !utilidadproducto.getIsChanged() && !utilidadproducto.getIsDeleted()) {
				sDescripcion=utilidadproducto.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadproducto.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!utilidadproducto.getIsNew() && !utilidadproducto.getIsChanged() && !utilidadproducto.getIsDeleted()) {
				sDescripcion=utilidadproducto.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadproducto.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		UtilidadProducto utilidadproductoRow=new UtilidadProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadproductoRow=(UtilidadProducto) utilidadproductoLogic.getUtilidadProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			utilidadproductoRow=(UtilidadProducto) utilidadproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUtilidadProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUtilidadProducto.setVisible((this.isVisibilidadCeldaNuevoUtilidadProducto && this.isPermisoNuevoUtilidadProducto));			
			this.jButtonDuplicarUtilidadProducto.setVisible((this.isVisibilidadCeldaDuplicarUtilidadProducto && this.isPermisoDuplicarUtilidadProducto));			
			this.jButtonCopiarUtilidadProducto.setVisible((this.isVisibilidadCeldaCopiarUtilidadProducto && this.isPermisoCopiarUtilidadProducto));
			this.jButtonVerFormUtilidadProducto.setVisible((this.isVisibilidadCeldaVerFormUtilidadProducto && this.isPermisoVerFormUtilidadProducto));
			
			this.jButtonAbrirOrderByUtilidadProducto.setVisible((this.isVisibilidadCeldaOrdenUtilidadProducto && this.isPermisoOrdenUtilidadProducto));			
			
			this.jButtonNuevoRelacionesUtilidadProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto && this.isPermisoNuevoUtilidadProducto));			
			this.jButtonNuevoGuardarCambiosUtilidadProducto.setVisible((this.isVisibilidadCeldaNuevoUtilidadProducto && this.isPermisoNuevoUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));
			
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonModificarUtilidadProducto.setVisible((this.isVisibilidadCeldaModificarUtilidadProducto && this.isPermisoActualizarUtilidadProducto));	
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarUtilidadProducto.setVisible((this.isVisibilidadCeldaActualizarUtilidadProducto && this.isPermisoActualizarUtilidadProducto));	
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarUtilidadProducto.setVisible((this.isVisibilidadCeldaEliminarUtilidadProducto && this.isPermisoEliminarUtilidadProducto));
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarUtilidadProducto.setVisible(this.isVisibilidadCeldaCancelarUtilidadProducto);							
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosUtilidadProducto.setVisible((this.isVisibilidadCeldaGuardarUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaUtilidadProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaNuevoUtilidadProducto && this.isPermisoNuevoUtilidadProducto));						
			this.jButtonDuplicarToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaDuplicarUtilidadProducto && this.isPermisoDuplicarUtilidadProducto));						
			this.jButtonCopiarToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaCopiarUtilidadProducto && this.isPermisoCopiarUtilidadProducto));			
			this.jButtonVerFormToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaVerFormUtilidadProducto && this.isPermisoVerFormUtilidadProducto));			
			this.jButtonAbrirOrderByToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaOrdenUtilidadProducto && this.isPermisoOrdenUtilidadProducto));
			this.jButtonNuevoRelacionesToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto && this.isPermisoNuevoUtilidadProducto));			
			this.jButtonNuevoGuardarCambiosToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaNuevoUtilidadProducto && this.isPermisoNuevoUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));			
			
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonModificarToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaModificarUtilidadProducto && this.isPermisoActualizarUtilidadProducto));	
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaActualizarUtilidadProducto  && this.isPermisoActualizarUtilidadProducto));	
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaEliminarUtilidadProducto && this.isPermisoEliminarUtilidadProducto));
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarToolBarUtilidadProducto.setVisible(this.isVisibilidadCeldaCancelarUtilidadProducto);				
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaGuardarUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUtilidadProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUtilidadProducto.setVisible((this.isVisibilidadCeldaNuevoUtilidadProducto && this.isPermisoNuevoUtilidadProducto));			
			this.jMenuItemDuplicarUtilidadProducto.setVisible((this.isVisibilidadCeldaDuplicarUtilidadProducto && this.isPermisoDuplicarUtilidadProducto));			
			this.jMenuItemCopiarUtilidadProducto.setVisible((this.isVisibilidadCeldaCopiarUtilidadProducto && this.isPermisoCopiarUtilidadProducto));			
			this.jMenuItemVerFormUtilidadProducto.setVisible((this.isVisibilidadCeldaVerFormUtilidadProducto && this.isPermisoVerFormUtilidadProducto));			
			this.jMenuItemAbrirOrderByUtilidadProducto.setVisible((this.isVisibilidadCeldaOrdenUtilidadProducto && this.isPermisoOrdenUtilidadProducto));			
			//this.jMenuItemMostrarOcultarUtilidadProducto.setVisible((this.isVisibilidadCeldaOrdenUtilidadProducto && this.isPermisoOrdenUtilidadProducto));
			this.jMenuItemDetalleAbrirOrderByUtilidadProducto.setVisible((this.isVisibilidadCeldaOrdenUtilidadProducto && this.isPermisoOrdenUtilidadProducto));			
			//this.jMenuItemDetalleMostrarOcultarUtilidadProducto.setVisible((this.isVisibilidadCeldaOrdenUtilidadProducto && this.isPermisoOrdenUtilidadProducto));			
			this.jMenuItemNuevoRelacionesUtilidadProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto && this.isPermisoNuevoUtilidadProducto));			
			this.jMenuItemNuevoGuardarCambiosUtilidadProducto.setVisible((this.isVisibilidadCeldaNuevoUtilidadProducto && this.isPermisoNuevoUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));									
			
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemModificarUtilidadProducto.setVisible((this.isVisibilidadCeldaModificarUtilidadProducto && this.isPermisoActualizarUtilidadProducto));	
			this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemActualizarUtilidadProducto.setVisible((this.isVisibilidadCeldaActualizarUtilidadProducto && this.isPermisoActualizarUtilidadProducto));	
			this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemEliminarUtilidadProducto.setVisible((this.isVisibilidadCeldaEliminarUtilidadProducto && this.isPermisoEliminarUtilidadProducto));
			this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemCancelarUtilidadProducto.setVisible(this.isVisibilidadCeldaCancelarUtilidadProducto);				
			}
			
			this.jMenuItemGuardarCambiosUtilidadProducto.setVisible((this.isVisibilidadCeldaGuardarUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));						
			this.jMenuItemGuardarCambiosTablaUtilidadProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUtilidadProducto=this.jButtonNuevoUtilidadProducto.isVisible();
			this.isVisibilidadCeldaDuplicarUtilidadProducto=this.jButtonDuplicarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaCopiarUtilidadProducto=this.jButtonCopiarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaVerFormUtilidadProducto=this.jButtonVerFormUtilidadProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenUtilidadProducto=this.jButtonAbrirOrderByUtilidadProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=this.jButtonNuevoRelacionesUtilidadProducto.isVisible();
			this.isVisibilidadCeldaModificarUtilidadProducto=this.jButtonModificarUtilidadProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			this.isVisibilidadCeldaActualizarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaGuardarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosUtilidadProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=this.jButtonGuardarCambiosTablaUtilidadProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUtilidadProducto=this.jButtonNuevoToolBarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=this.jButtonNuevoRelacionesToolBarUtilidadProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			this.isVisibilidadCeldaModificarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jButtonModificarToolBarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaActualizarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarToolBarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarToolBarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarToolBarUtilidadProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUtilidadProducto=this.jButtonGuardarCambiosToolBarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=this.jButtonGuardarCambiosTablaToolBarUtilidadProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUtilidadProducto=this.jMenuItemNuevoUtilidadProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=this.jMenuItemNuevoRelacionesUtilidadProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			this.isVisibilidadCeldaModificarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemModificarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaActualizarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemActualizarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemEliminarUtilidadProducto.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadProducto=this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemCancelarUtilidadProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUtilidadProducto=this.jMenuItemGuardarCambiosUtilidadProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=this.jMenuItemGuardarCambiosTablaUtilidadProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUtilidadProducto(Boolean esInicializar) {
		if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUtilidadProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualUtilidadProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUtilidadProducto() {
		this.jButtonNuevoUtilidadProducto.setVisible(this.isPermisoNuevoUtilidadProducto);			
		this.jButtonDuplicarUtilidadProducto.setVisible(this.isPermisoDuplicarUtilidadProducto);			
		this.jButtonCopiarUtilidadProducto.setVisible(this.isPermisoCopiarUtilidadProducto);			
		this.jButtonVerFormUtilidadProducto.setVisible(this.isPermisoVerFormUtilidadProducto);			
		
		this.jButtonAbrirOrderByUtilidadProducto.setVisible(this.isPermisoOrdenUtilidadProducto);					
		
		this.jButtonNuevoRelacionesUtilidadProducto.setVisible(this.isPermisoNuevoUtilidadProducto);			
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonModificarUtilidadProducto.setVisible(this.isPermisoActualizarUtilidadProducto);	
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarUtilidadProducto.setVisible(this.isPermisoActualizarUtilidadProducto);	
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarUtilidadProducto.setVisible(this.isPermisoEliminarUtilidadProducto);
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarUtilidadProducto.setVisible(this.isVisibilidadCeldaCancelarUtilidadProducto);						
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosUtilidadProducto.setVisible(this.isPermisoGuardarCambiosUtilidadProducto);							
		}
		
		this.jButtonGuardarCambiosTablaUtilidadProducto.setVisible(this.isPermisoActualizarUtilidadProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUtilidadProducto() {
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonModificarUtilidadProducto.setVisible(this.isPermisoActualizarUtilidadProducto);	
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarUtilidadProducto.setVisible(this.isPermisoActualizarUtilidadProducto);	
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarUtilidadProducto.setVisible(this.isPermisoEliminarUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarUtilidadProducto.setVisible(this.isVisibilidadCeldaCancelarUtilidadProducto);							
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosUtilidadProducto.setVisible((this.isVisibilidadCeldaGuardarUtilidadProducto && this.isPermisoGuardarCambiosUtilidadProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUtilidadProducto() {
		if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUtilidadProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUtilidadProducto() {
	}
	
	public void jTableDatosUtilidadProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUtilidadProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUtilidadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadproducto==null) {
						this.utilidadproducto = new UtilidadProducto();
					}

					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
				}

				if(this.utilidadproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.utilidadproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaUtilidadProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebUtilidadProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.utilidadproductoLogic.getConnexion());

				if(this.utilidadproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.utilidadproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadProducto=(TitledBorder)this.jScrollPanelDatosUtilidadProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderUtilidadProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaUtilidadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadproducto==null) {
						this.utilidadproducto = new UtilidadProducto();
					}

					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
				}

				if(this.utilidadproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.utilidadproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalUtilidadProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebUtilidadProducto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.utilidadproductoLogic.getConnexion());

				if(this.utilidadproducto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.utilidadproducto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadProducto=(TitledBorder)this.jScrollPanelDatosUtilidadProducto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderUtilidadProducto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalUtilidadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadproducto==null) {
						this.utilidadproducto = new UtilidadProducto();
					}

					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
				}

				if(this.utilidadproducto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.utilidadproducto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaUtilidadProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebUtilidadProducto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.utilidadproductoLogic.getConnexion());

				if(this.utilidadproducto.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.utilidadproducto.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadProducto=(TitledBorder)this.jScrollPanelDatosUtilidadProducto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderUtilidadProducto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaUtilidadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadproducto==null) {
						this.utilidadproducto = new UtilidadProducto();
					}

					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
				}

				if(this.utilidadproducto.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.utilidadproducto.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoUtilidadProductoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderUtilidadProducto=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosUtilidadProducto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderUtilidadProducto=(TitledBorder)this.jScrollPanelDatosUtilidadProducto.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderUtilidadProducto.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoUtilidadProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebUtilidadProducto(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.utilidadproductoLogic.getConnexion());

				if(this.utilidadproducto.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.utilidadproducto.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadProducto=(TitledBorder)this.jScrollPanelDatosUtilidadProducto.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderUtilidadProducto.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoUtilidadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadproducto==null) {
						this.utilidadproducto = new UtilidadProducto();
					}

					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
				}

				if(this.utilidadproducto.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.utilidadproducto.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeUtilidadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.getutilidadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadproducto==null) {
						this.utilidadproducto = new UtilidadProducto();
					}

					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);
				}

				if(this.utilidadproducto.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.utilidadproducto.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadProducto(false,false);

			this.getUtilidadProductosBusquedaPorIdBodegaPorIdProducto();

			this.inicializarActualizarBindingUtilidadProducto(false);

			//if(UtilidadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadProducto(false,false);

			this.getUtilidadProductosFK_IdBodega();

			this.inicializarActualizarBindingUtilidadProducto(false);

			//if(UtilidadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadProducto(false,false);

			this.getUtilidadProductosFK_IdEmpresa();

			this.inicializarActualizarBindingUtilidadProducto(false);

			//if(UtilidadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadProducto(false,false);

			this.getUtilidadProductosFK_IdProducto();

			this.inicializarActualizarBindingUtilidadProducto(false);

			//if(UtilidadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalUtilidadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadProducto(false,false);

			this.getUtilidadProductosFK_IdSucursal();

			this.inicializarActualizarBindingUtilidadProducto(false);

			//if(UtilidadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUtilidadProducto() {
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
			this.jInternalFrameDetalleFormUtilidadProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormUtilidadProducto.dispose();
			this.jInternalFrameDetalleFormUtilidadProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUtilidadProducto!=null) {
			this.jInternalFrameReporteDinamicoUtilidadProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUtilidadProducto.dispose();
			this.jInternalFrameReporteDinamicoUtilidadProducto=null;
		}
		
		if(this.jInternalFrameImportacionUtilidadProducto!=null) {
			this.jInternalFrameImportacionUtilidadProducto.setVisible(false);	    			
			this.jInternalFrameImportacionUtilidadProducto.dispose();
			this.jInternalFrameImportacionUtilidadProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUtilidadProducto();
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoUtilidadProducto")) {
				jButtonNuevoUtilidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUtilidadProducto")) {
				jButtonDuplicarUtilidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUtilidadProducto")) {
				jButtonCopiarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormUtilidadProducto")) {
				jButtonVerFormUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUtilidadProducto")) {
				jButtonNuevoUtilidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUtilidadProducto")) {
				jButtonDuplicarUtilidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUtilidadProducto")) {
				jButtonNuevoUtilidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUtilidadProducto")) {
				jButtonDuplicarUtilidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUtilidadProducto")) {
				jButtonNuevoUtilidadProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUtilidadProducto")) {
				jButtonNuevoUtilidadProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUtilidadProducto")) {
				jButtonNuevoUtilidadProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUtilidadProducto")) {
				jButtonModificarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUtilidadProducto")) {
				jButtonModificarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUtilidadProducto")) {
				jButtonModificarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUtilidadProducto")) {
				jButtonActualizarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUtilidadProducto")) {
				jButtonActualizarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUtilidadProducto")) {
				jButtonActualizarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarUtilidadProducto")) {
				jButtonEliminarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUtilidadProducto")) {
				jButtonEliminarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUtilidadProducto")) {
				jButtonEliminarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarUtilidadProducto")) {
				jButtonCancelarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUtilidadProducto")) {
				jButtonCancelarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUtilidadProducto")) {
				jButtonCancelarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarUtilidadProducto")) {
				jButtonCerrarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUtilidadProducto")) {
				jButtonCerrarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUtilidadProducto")) {
				jButtonCerrarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUtilidadProducto")) {
				jButtonMostrarOcultarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUtilidadProducto")) {
				jButtonCancelarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUtilidadProducto")) {
				jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUtilidadProducto")) {
				jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUtilidadProducto")) {
				jButtonCopiarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUtilidadProducto")) {
				jButtonVerFormUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUtilidadProducto")) {
				jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUtilidadProducto")) {
				jButtonCopiarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUtilidadProducto")) {
				jButtonVerFormUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUtilidadProducto")) {
				jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUtilidadProducto")) {
				jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUtilidadProducto")) {
				jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUtilidadProducto")) {
				jButtonRecargarInformacionUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUtilidadProducto")) {
				jButtonRecargarInformacionUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUtilidadProducto")) {
				jButtonRecargarInformacionUtilidadProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresUtilidadProducto")) {
				jButtonAnterioresUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUtilidadProducto")) {
				jButtonAnterioresUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUtilidadProducto")) {
				jButtonAnterioresUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUtilidadProducto")) {
				jButtonSiguientesUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUtilidadProducto")) {
				jButtonSiguientesUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUtilidadProducto")) {
				jButtonSiguientesUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUtilidadProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByUtilidadProducto")) {
				jButtonAbrirOrderByUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUtilidadProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarUtilidadProducto")) {
				jButtonMostrarOcultarUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUtilidadProducto")) {
				jButtonNuevoGuardarCambiosUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUtilidadProducto")) {
				jButtonNuevoGuardarCambiosUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUtilidadProducto")) {
				jButtonNuevoGuardarCambiosUtilidadProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUtilidadProducto")) {
				jButtonCerrarReporteDinamicoUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUtilidadProducto")) {
				jButtonGenerarReporteDinamicoUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUtilidadProducto")) {
				
				jButtonGenerarExcelReporteDinamicoUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUtilidadProducto")) {
				jButtonCerrarImportacionUtilidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUtilidadProducto")) {
				
				jButtonGenerarImportacionUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUtilidadProducto")) {
				
				jButtonAbrirImportacionUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUtilidadProducto")) {
				jComboBoxTiposAccionesUtilidadProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUtilidadProducto")) {
				jComboBoxTiposRelacionesUtilidadProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUtilidadProducto")) {
				jComboBoxTiposAccionesUtilidadProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUtilidadProducto")) {
				
				jComboBoxTiposSeleccionarUtilidadProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUtilidadProducto")) {
				jTextFieldValorCampoGeneralUtilidadProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUtilidadProducto")) {
				jButtonAbrirOrderByUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUtilidadProducto")) {
				jButtonAbrirOrderByUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUtilidadProducto")) {
				jButtonCerrarOrderByUtilidadProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUtilidadProductoBusqueda")) {
				this.jButtonidUtilidadProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUtilidadProductoUpdate")) {
				this.jButtonid_empresaUtilidadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUtilidadProductoBusqueda")) {
				this.jButtonid_empresaUtilidadProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUtilidadProductoUpdate")) {
				this.jButtonid_sucursalUtilidadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUtilidadProductoBusqueda")) {
				this.jButtonid_sucursalUtilidadProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaUtilidadProductoUpdate")) {
				this.jButtonid_bodegaUtilidadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaUtilidadProductoBusqueda")) {
				this.jButtonid_bodegaUtilidadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoUtilidadProducto")) {
				this.jButtonid_productoUtilidadProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoUtilidadProductoUpdate")) {
				this.jButtonid_productoUtilidadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoUtilidadProductoBusqueda")) {
				this.jButtonid_productoUtilidadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeUtilidadProductoBusqueda")) {
				this.jButtonporcentajeUtilidadProductoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoUtilidadProducto")) {
				this.jButtonid_productoUtilidadProductoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorIdBodegaPorIdProductoUtilidadProducto")) {
				this.jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaUtilidadProducto")) {
				this.jButtonFK_IdBodegaUtilidadProductoActionPerformed(evt);
			}
			
			;
			
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUtilidadProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				


				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			UtilidadProducto utilidadproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				utilidadproductoLocal=this.utilidadproducto;
			} else {
				utilidadproductoLocal=this.utilidadproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
							
				
				


				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
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
			
			


			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
								
						
				


				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
								
				
				


				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
							
				
				


				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
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
			
			


			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
								
				
				


				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUtilidadProducto")) {
					jCheckBoxSeleccionarTodosUtilidadProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUtilidadProducto")) {
					jCheckBoxSeleccionadosUtilidadProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUtilidadProducto")) {
					
				}
				
				


				
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
												
				
				


				
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
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
			
			


			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadproducto);
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
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
				
				


				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadproductoAnterior =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUtilidadProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUtilidadProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUtilidadProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.utilidadproducto =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.utilidadproducto =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.utilidadproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUtilidadProducto")) {
				
				}
				
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUtilidadProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUtilidadProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUtilidadProducto")) {
			
			}
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUtilidadProducto();
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
			if(sTipo.equals("NuevoUtilidadProducto")) {
				jButtonNuevoUtilidadProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUtilidadProducto")) {
				jButtonDuplicarUtilidadProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUtilidadProducto")) {
				jButtonCopiarUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUtilidadProducto")) {
				jButtonVerFormUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUtilidadProducto")) {
				jButtonNuevoUtilidadProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUtilidadProducto")) {
				jButtonModificarUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUtilidadProducto")) {
				jButtonActualizarUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUtilidadProducto")) {
				jButtonEliminarUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUtilidadProducto")) {
				jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUtilidadProducto")) {
				jButtonCancelarUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUtilidadProducto")) {
				jButtonCerrarUtilidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUtilidadProducto")) {
				jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUtilidadProducto")) {
				jButtonNuevoGuardarCambiosUtilidadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUtilidadProducto")) {
				jButtonAbrirOrderByUtilidadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUtilidadProducto")) {
				jButtonRecargarInformacionUtilidadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUtilidadProducto")) {
				jButtonAnterioresUtilidadProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUtilidadProducto")) {
				jButtonSiguientesUtilidadProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUtilidadProductoBusqueda")) {
				this.jButtonidUtilidadProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUtilidadProductoUpdate")) {
				this.jButtonid_empresaUtilidadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUtilidadProductoBusqueda")) {
				this.jButtonid_empresaUtilidadProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUtilidadProductoUpdate")) {
				this.jButtonid_sucursalUtilidadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUtilidadProductoBusqueda")) {
				this.jButtonid_sucursalUtilidadProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaUtilidadProductoUpdate")) {
				this.jButtonid_bodegaUtilidadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaUtilidadProductoBusqueda")) {
				this.jButtonid_bodegaUtilidadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoUtilidadProducto")) {
				this.jButtonid_productoUtilidadProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoUtilidadProductoUpdate")) {
				this.jButtonid_productoUtilidadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoUtilidadProductoBusqueda")) {
				this.jButtonid_productoUtilidadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeUtilidadProductoBusqueda")) {
				this.jButtonporcentajeUtilidadProductoBusquedaActionPerformed(evt);
			}
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUtilidadProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUtilidadProducto")) {
				closingInternalFrameUtilidadProducto();
				
			} else if(sTipo.equals("jButtonCancelarUtilidadProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormUtilidadProducto = (JInternalFrameBase)evt.getSource();
	            	
	            UtilidadProductoBeanSwingJInternalFrame jInternalFrameParent=(UtilidadProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormUtilidadProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUtilidadProductoActionPerformed(null);
			}
			
			UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.utilidadproducto,new Object(),this.utilidadproductoParameterGeneral,this.utilidadproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUtilidadProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUtilidadProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUtilidadProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.utilidadproducto)) {
			if(!esControlTabla) {
				if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);			
				}
				
				if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUtilidadProducto(this.utilidadproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.utilidadproductoReturnGeneral=utilidadproductoLogic.procesarEventosUtilidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadproductoLogic.getUtilidadProductos(),this.utilidadproducto,this.utilidadproductoParameterGeneral,this.isEsNuevoUtilidadProducto,classes);//this.utilidadproductoLogic.getUtilidadProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUtilidadProducto(this.utilidadproductoReturnGeneral,this.utilidadproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUtilidadProducto(classes,this.utilidadproductoReturnGeneral,this.utilidadproductoBean,false);
					}
						
					if(this.utilidadproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUtilidadProducto(this.utilidadproductoReturnGeneral.getUtilidadProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUtilidadProducto(this.utilidadproductoReturnGeneral.getUtilidadProducto());	
					}
						
					if(this.utilidadproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUtilidadProducto(this.utilidadproductoReturnGeneral.getUtilidadProducto(),classes);//this.utilidadproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUtilidadProducto(this.utilidadproducto,classes);//this.utilidadproductoBean);									
				}
			
				if(UtilidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUtilidadProducto(this.utilidadproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadProducto(this.utilidadproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.utilidadproductoAnterior!=null) {
						this.utilidadproducto=this.utilidadproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.utilidadproductoReturnGeneral=utilidadproductoLogic.procesarEventosUtilidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadproductoLogic.getUtilidadProductos(),this.utilidadproducto,this.utilidadproductoParameterGeneral,this.isEsNuevoUtilidadProducto,classes);//this.utilidadproductoLogic.getUtilidadProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.utilidadproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.utilidadproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.utilidadproductoReturnGeneral.getUtilidadProducto(),utilidadproductoLogic.getUtilidadProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.utilidadproductoReturnGeneral.getUtilidadProducto(),this.utilidadproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUtilidadProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosUtilidadProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUtilidadProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosUtilidadProducto() throws Exception {
		
		UtilidadProductoModel utilidadproductoModel=(UtilidadProductoModel)this.jTableDatosUtilidadProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadproductoModel.utilidadproductos=this.utilidadproductoLogic.getUtilidadProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			utilidadproductoModel.utilidadproductos=this.utilidadproductos;
		}
		
		
		((UtilidadProductoModel) this.jTableDatosUtilidadProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUtilidadProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getutilidadproductoAnterior(),this.utilidadproductoLogic.getUtilidadProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getutilidadproductoAnterior(),this.utilidadproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUtilidadProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUtilidadProducto(UtilidadProducto utilidadproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
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
										
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadproducto,new Object(),generalEntityParameterGeneral,this.utilidadproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.utilidadproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UtilidadProductoConstantesFunciones.getClassesRelationshipsOfUtilidadProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UtilidadProductoConstantesFunciones.getClassesRelationshipsFromStringsOfUtilidadProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUtilidadProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UtilidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadproducto,new Object(),generalEntityParameterGeneral,this.utilidadproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUtilidadProducto(UtilidadProductoBean utilidadproductoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUtilidadProducto(ArrayList<Classe> classes,UtilidadProductoReturnGeneral utilidadproductoReturnGeneral,UtilidadProductoBean utilidadproductoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUtilidadProducto(UtilidadProducto utilidadproducto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.utilidadproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUtilidadProducto = new UtilidadProductoDetalleFormJInternalFrame(jDesktopPane,this.utilidadproductoSessionBean.getConGuardarRelaciones(),this.utilidadproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.setVisible(false);
		this.jInternalFrameDetalleFormUtilidadProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormUtilidadProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUtilidadProducto.utilidadproductoLogic=this.utilidadproductoLogic;
		
		this.cargarCombosFrameForeignKeyUtilidadProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUtilidadProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUtilidadProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUtilidadProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUtilidadProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUtilidadProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUtilidadProducto"));
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonModificarUtilidadProducto.addActionListener(new ButtonActionListener(this,"ModificarUtilidadProducto"));

		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonModificarToolBarUtilidadProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarUtilidadProducto"));
					
		this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemModificarUtilidadProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarUtilidadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarUtilidadProducto.addActionListener (new ButtonActionListener(this,"ActualizarUtilidadProducto"));
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarToolBarUtilidadProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUtilidadProducto"));
						
		this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemActualizarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUtilidadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarUtilidadProducto.addActionListener (new ButtonActionListener(this,"EliminarUtilidadProducto"));
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarUtilidadProducto"));
								
		this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemEliminarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUtilidadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarUtilidadProducto.addActionListener (new ButtonActionListener(this,"CancelarUtilidadProducto"));
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarUtilidadProducto"));
					
		this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemCancelarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUtilidadProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemDetalleCerrarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUtilidadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadProducto"));
		
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadProducto"));
		
		
		
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUtilidadProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonidUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_empresaUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_empresaUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_sucursalUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_sucursalUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_bodegaUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_bodegaUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaUtilidadProductoBusqueda"));
		//jButtonid_productoUtilidadProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoUtilidadProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProducto.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonporcentajeUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeUtilidadProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUtilidadProducto.jTabbedPaneRelacionesUtilidadProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUtilidadProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUtilidadProducto"));
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUtilidadProducto"));
		}
		
		this.jTableDatosUtilidadProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUtilidadProducto"));
		
		this.jTableDatosUtilidadProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUtilidadProducto"));
		
		this.jButtonNuevoUtilidadProducto.addActionListener(new ButtonActionListener(this,"NuevoUtilidadProducto"));
		
		this.jButtonDuplicarUtilidadProducto.addActionListener(new ButtonActionListener(this,"DuplicarUtilidadProducto"));
		
		this.jButtonCopiarUtilidadProducto.addActionListener(new ButtonActionListener(this,"CopiarUtilidadProducto"));
		
		this.jButtonVerFormUtilidadProducto.addActionListener(new ButtonActionListener(this,"VerFormUtilidadProducto"));
		
		
		this.jButtonNuevoToolBarUtilidadProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarUtilidadProducto"));
			
		this.jButtonDuplicarToolBarUtilidadProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUtilidadProducto"));
			
		this.jMenuItemNuevoUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUtilidadProducto"));
			
		this.jMenuItemDuplicarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUtilidadProducto"));		
		
		
		this.jButtonNuevoRelacionesUtilidadProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUtilidadProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarUtilidadProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUtilidadProducto"));
			
		this.jMenuItemNuevoRelacionesUtilidadProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUtilidadProducto"));		
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonModificarUtilidadProducto.addActionListener(new ButtonActionListener(this,"ModificarUtilidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonModificarToolBarUtilidadProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarUtilidadProducto"));
			
			this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemModificarUtilidadProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarUtilidadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarUtilidadProducto.addActionListener (new ButtonActionListener(this,"ActualizarUtilidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonActualizarToolBarUtilidadProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUtilidadProducto"));
				
			this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemActualizarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUtilidadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarUtilidadProducto.addActionListener (new ButtonActionListener(this,"EliminarUtilidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonEliminarToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarUtilidadProducto"));
						
			this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemEliminarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUtilidadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarUtilidadProducto.addActionListener (new ButtonActionListener(this,"CancelarUtilidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonCancelarToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarUtilidadProducto"));
			
			this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemCancelarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUtilidadProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUtilidadProducto"));		
		
		
		this.jButtonCerrarUtilidadProducto.addActionListener (new ButtonActionListener(this,"CerrarUtilidadProducto"));
		
		
		this.jButtonCerrarToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarUtilidadProducto"));
			
		this.jMenuItemCerrarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUtilidadProducto"));
			
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jMenuItemDetalleCerrarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUtilidadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosUtilidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosUtilidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadProducto"));
		}
		
		this.jButtonCopiarToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarUtilidadProducto"));
			
		this.jButtonVerFormToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarUtilidadProducto"));
		
		this.jMenuItemGuardarCambiosUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUtilidadProducto"));
			
		this.jMenuItemCopiarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUtilidadProducto"));		
		
		this.jMenuItemVerFormUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUtilidadProducto"));		
		
		
		this.jButtonGuardarCambiosTablaUtilidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUtilidadProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUtilidadProducto"));
			
		this.jMenuItemGuardarCambiosTablaUtilidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUtilidadProducto"));		
		
		
		
		this.jButtonRecargarInformacionUtilidadProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionUtilidadProducto"));
					
		this.jButtonRecargarInformacionToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUtilidadProducto"));
		
		this.jMenuItemRecargarInformacionUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUtilidadProducto"));		
		
		
		
		this.jButtonAnterioresUtilidadProducto.addActionListener (new ButtonActionListener(this,"AnterioresUtilidadProducto"));
		
		
		this.jButtonAnterioresToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUtilidadProducto"));
		
		this.jMenuItemAnterioresUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUtilidadProducto"));		
		
		
		this.jButtonSiguientesUtilidadProducto.addActionListener (new ButtonActionListener(this,"SiguientesUtilidadProducto"));
		
		
		this.jButtonSiguientesToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUtilidadProducto"));
			
		this.jMenuItemSiguientesUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUtilidadProducto"));
			
		this.jMenuItemAbrirOrderByUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUtilidadProducto"));
			
		this.jMenuItemMostrarOcultarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUtilidadProducto"));
			
		this.jMenuItemDetalleAbrirOrderByUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUtilidadProducto"));
			
		this.jMenuItemDetalleMostarOcultarUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUtilidadProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosUtilidadProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUtilidadProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUtilidadProducto"));
			
		this.jMenuItemNuevoGuardarCambiosUtilidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUtilidadProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUtilidadProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUtilidadProducto"));

		this.jCheckBoxSeleccionadosUtilidadProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUtilidadProducto"));
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUtilidadProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesUtilidadProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesUtilidadProducto"));
			
		this.jComboBoxTiposAccionesUtilidadProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesUtilidadProducto"));
					
		this.jComboBoxTiposSeleccionarUtilidadProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUtilidadProducto"));
			
		this.jTextFieldValorCampoGeneralUtilidadProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUtilidadProducto"));		
		
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonidUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_empresaUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_empresaUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_sucursalUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_sucursalUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_bodegaUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_bodegaUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaUtilidadProductoBusqueda"));
		//jButtonid_productoUtilidadProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoUtilidadProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProducto.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonporcentajeUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeUtilidadProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorIdBodegaPorIdProductoUtilidadProducto"));

			this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProducto"));

			this.jButtonFK_IdBodegaUtilidadProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaUtilidadProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUtilidadProducto!=null) {
				this.jInternalFrameReporteDinamicoUtilidadProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadProducto"));
				this.jInternalFrameReporteDinamicoUtilidadProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadProducto"));
				this.jInternalFrameReporteDinamicoUtilidadProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoUtilidadProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadProducto"));				
			//this.jButtonGenerarReporteDinamicoUtilidadProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadProducto"));
			//this.jButtonGenerarExcelReporteDinamicoUtilidadProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUtilidadProducto!=null) {
				this.jInternalFrameImportacionUtilidadProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUtilidadProducto"));
				this.jInternalFrameImportacionUtilidadProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUtilidadProducto"));
				this.jInternalFrameImportacionUtilidadProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUtilidadProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUtilidadProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByUtilidadProducto"));
			
			this.jButtonAbrirOrderByToolBarUtilidadProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUtilidadProducto"));			
			
			if(this.jInternalFrameOrderByUtilidadProducto!=null) {
				this.jInternalFrameOrderByUtilidadProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUtilidadProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadProducto.jTabbedPaneRelacionesUtilidadProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUtilidadProducto"));
		
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
            		closingInternalFrameUtilidadProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUtilidadProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUtilidadProducto = (JInternalFrameBase)event.getSource();
	            	
	            UtilidadProductoBeanSwingJInternalFrame jInternalFrameParent=(UtilidadProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormUtilidadProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUtilidadProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUtilidadProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUtilidadProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUtilidadProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUtilidadProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUtilidadProducto";
		inputMap = this.jButtonNuevoUtilidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUtilidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUtilidadProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUtilidadProducto";
		inputMap = this.jButtonNuevoRelacionesUtilidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUtilidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUtilidadProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUtilidadProducto";
		inputMap = this.jButtonModificarUtilidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUtilidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUtilidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUtilidadProducto";
		inputMap = this.jButtonActualizarUtilidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUtilidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUtilidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUtilidadProducto";
		inputMap = this.jButtonEliminarUtilidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUtilidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUtilidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUtilidadProducto";
		inputMap = this.jButtonCancelarUtilidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUtilidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUtilidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUtilidadProducto";
		inputMap = this.jButtonCerrarUtilidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUtilidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUtilidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUtilidadProducto";
		inputMap = this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosUtilidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonGuardarCambiosUtilidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUtilidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUtilidadProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUtilidadProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUtilidadProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUtilidadProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUtilidadProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUtilidadProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUtilidadProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUtilidadProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonidUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_empresaUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_empresaUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_sucursalUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_sucursalUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_bodegaUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_bodegaUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaUtilidadProductoBusqueda"));
		//jButtonid_productoUtilidadProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoUtilidadProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProducto.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadProducto.jButtonporcentajeUtilidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeUtilidadProductoBusqueda"));
		
		
		this.jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorIdBodegaPorIdProductoUtilidadProducto"));

		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto.addActionListener(new ButtonActionListener(this,"id_productoUtilidadProducto"));

		this.jButtonFK_IdBodegaUtilidadProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaUtilidadProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUtilidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUtilidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUtilidadProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUtilidadProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUtilidadProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(UtilidadProducto utilidadproductoAux:this.utilidadproductoLogic.getUtilidadProductos()) {
					utilidadproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadProducto utilidadproductoAux:utilidadproductos) {
					utilidadproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUtilidadProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUtilidadProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UtilidadProducto utilidadproductoAux:this.utilidadproductoLogic.getUtilidadProductos()) {
						utilidadproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadProducto utilidadproductoAux:utilidadproductos) {
						utilidadproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(UtilidadProducto utilidadproductoAux:this.utilidadproductoLogic.getUtilidadProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadProducto utilidadproductoAux:utilidadproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUtilidadProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUtilidadProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUtilidadProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUtilidadProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUtilidadProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUtilidadProducto.getSelectedRows();
			
			UtilidadProducto utilidadproductoLocal=new UtilidadProducto();
			
			//this.seleccionarTodosUtilidadProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadproductoLocal =(UtilidadProducto) this.utilidadproductoLogic.getUtilidadProductos().toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					utilidadproductoLocal =(UtilidadProducto) this.utilidadproductos.toArray()[this.jTableDatosUtilidadProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				utilidadproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UtilidadProducto utilidadproductoAux:this.utilidadproductoLogic.getUtilidadProductos()) {
						utilidadproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadProducto utilidadproductoAux:utilidadproductos) {
						utilidadproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUtilidadProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUtilidadProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUtilidadProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUtilidadProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUtilidadProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUtilidadProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUtilidadProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUtilidadProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUtilidadProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UtilidadProducto utilidadproductoAux:this.utilidadproductoLogic.getUtilidadProductos()) {
				
						if(sTipoSeleccionar.equals(UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							utilidadproductoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadProducto utilidadproductoAux:utilidadproductos) {
					
						if(sTipoSeleccionar.equals(UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							utilidadproductoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUtilidadProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUtilidadProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUtilidadProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUtilidadProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUtilidadProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUtilidadProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessUtilidadProducto(conSplash);
				
					this.generarReporteUtilidadProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUtilidadProductosSeleccionados();
				//this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUtilidadProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUtilidadProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUtilidadProducto();
				
				this.exportarUtilidadProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUtilidadProductos();
				//this.importarUtilidadProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUtilidadProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUtilidadProductosSeleccionados();
				//this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Utilidad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUtilidadProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUtilidadProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUtilidadProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(UtilidadProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUtilidadProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUtilidadProducto(conSplash);
					
						//this.actualizarParametrosGeneralUtilidadProducto();
						
						this.generarReporteProcesoAccionUtilidadProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UtilidadProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Utilidad ProductoES SELECCIONADOS?", "MANTENIMIENTO DE Utilidad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUtilidadProducto();
				
						this.actualizarParametrosGeneralUtilidadProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.utilidadproductoReturnGeneral=utilidadproductoLogic.procesarAccionUtilidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.utilidadproductoLogic.getUtilidadProductos(),this.utilidadproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUtilidadProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUtilidadProducto();
					
					UtilidadProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUtilidadProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUtilidadProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxTiposAccionesFormularioUtilidadProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUtilidadProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUtilidadProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUtilidadProducto();
			
			if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();		
			UtilidadProducto utilidadproducto=new UtilidadProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUtilidadProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUtilidadProducto.getSelectedItem();
			
			
			
			
			utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(utilidadproductosSeleccionados.size()==1) {
				for(UtilidadProducto utilidadproductoAux:utilidadproductosSeleccionados) {
					utilidadproducto=utilidadproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUtilidadProducto();
			
      		//this.finishProcessUtilidadProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUtilidadProductoReturnGeneral() throws Exception {
		if(this.utilidadproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.utilidadproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.utilidadproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.utilidadproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.utilidadproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.utilidadproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUtilidadProducto(false);
		}
		
		if(this.utilidadproductoReturnGeneral.getConRetornoLista() || this.utilidadproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.utilidadproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.utilidadproductoLogic.setUtilidadProductos(this.utilidadproductoReturnGeneral.getUtilidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.utilidadproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.utilidadproductoLogic.setUtilidadProducto(this.utilidadproductoReturnGeneral.getUtilidadProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingUtilidadProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralUtilidadProducto() throws Exception {
		
		
	}
	
	public ArrayList<UtilidadProducto> getUtilidadProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUtilidadProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(UtilidadProducto utilidadproductoAux:utilidadproductoLogic.getUtilidadProductos()) {
					if(utilidadproductoAux.getIsSelected()) {
						utilidadproductosSeleccionados.add(utilidadproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadProducto utilidadproductoAux:this.utilidadproductos) {
					if(utilidadproductoAux.getIsSelected()) {
						utilidadproductosSeleccionados.add(utilidadproductoAux);				
					}
				}
			}
			
			if(utilidadproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						utilidadproductosSeleccionados.addAll(this.utilidadproductoLogic.getUtilidadProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						utilidadproductosSeleccionados.addAll(this.utilidadproductos);				
					}
				}
			}
		} else {
			utilidadproductosSeleccionados.add(this.utilidadproducto);
		}
		
		return utilidadproductosSeleccionados;
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
	
	public void generarReporteUtilidadProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUtilidadProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUtilidadProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUtilidadProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUtilidadProductosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Utilidad Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUtilidadProductosSeleccionados() throws Exception {
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();		
		
		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUtilidadProductos("Todos",utilidadproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalUtilidadProductosSeleccionados() throws Exception {
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();		
		
		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUtilidadProductos("Todos",utilidadproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUtilidadProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();
		
		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUtilidadProductos("Todos",utilidadproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUtilidadProductosSeleccionados() throws Exception {
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUtilidadProducto();
		
		
		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUtilidadProducto();
		
		
		//this.generarReporteUtilidadProductos("Todos",utilidadproductosSeleccionados ,utilidadproductoImplementable,utilidadproductoImplementableHome);
	}
	
	public void mostrarImportacionUtilidadProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUtilidadProducto();
		
		this.abrirFrameImportacionUtilidadProducto();		
		
			
		//this.generarReporteUtilidadProductos("Todos",utilidadproductosSeleccionados ,utilidadproductoImplementable,utilidadproductoImplementableHome);
	}
	
	public void importarUtilidadProductos() throws Exception {		
	
	}
	
	public void exportarUtilidadProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUtilidadProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUtilidadProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUtilidadProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Utilidad Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUtilidadProductosSeleccionados() throws Exception {
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();		
		
		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUtilidadProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(UtilidadProducto utilidadproductoAux:utilidadproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUtilidadProducto(utilidadproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//utilidadproductoAux.setsDetalleGeneralEntityReporte(utilidadproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUtilidadProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UtilidadProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadProductoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUtilidadProducto(UtilidadProducto utilidadproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=utilidadproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadproducto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadproducto.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadproducto.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadproducto.getporcentaje().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUtilidadProductosSeleccionados() throws Exception {
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();		
		
		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("UtilidadProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUtilidadProducto(row);				
				iRow++;
			}				
			
			for(UtilidadProducto utilidadproductoAux:utilidadproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUtilidadProducto(utilidadproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUtilidadProductosSeleccionados() throws Exception {
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();		
		
		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("utilidadproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("utilidadproducto");
			//elementRoot.appendChild(element);
		
			for(UtilidadProducto utilidadproductoAux:utilidadproductosSeleccionados) {
				element = document.createElement("utilidadproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUtilidadProducto(utilidadproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUtilidadProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadProductoConstantesFunciones.LABEL_PORCENTAJE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUtilidadProducto(UtilidadProducto utilidadproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadproducto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadproducto.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadproducto.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadproducto.getporcentaje());				
	}
	
	public void setFilaDatosExportarXmlUtilidadProducto(UtilidadProducto utilidadproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UtilidadProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(utilidadproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UtilidadProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(utilidadproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(UtilidadProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(utilidadproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(UtilidadProductoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(utilidadproducto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(UtilidadProductoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(utilidadproducto.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(UtilidadProductoConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(utilidadproducto.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementporcentaje = document.createElement(UtilidadProductoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(utilidadproducto.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);
	}
	
	public void generarReporteGroupGenericoUtilidadProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<UtilidadProducto> utilidadproductosSeleccionados=new ArrayList<UtilidadProducto>();
		
		utilidadproductosSeleccionados=this.getUtilidadProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoUtilidadProducto(utilidadproductosSeleccionados);
		
		this.generarReporteUtilidadProductos("Todos",utilidadproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUtilidadProducto(ArrayList<UtilidadProducto> utilidadproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(UtilidadProducto utilidadproductoAux:utilidadproductosSeleccionados) {
				utilidadproductoAux.setsDetalleGeneralEntityReporte(utilidadproductoAux.toString());
			
				if(sTipoSeleccionar.equals(UtilidadProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					utilidadproductoAux.setsDescripcionGeneralEntityReporte1(utilidadproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadProductoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					utilidadproductoAux.setsDescripcionGeneralEntityReporte1(utilidadproductoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadProductoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					utilidadproductoAux.setsDescripcionGeneralEntityReporte1(utilidadproductoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadProductoConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					utilidadproductoAux.setsDescripcionGeneralEntityReporte1(utilidadproductoAux.getproducto_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUtilidadProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUtilidadProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=true;
				this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=true;
			}
			
			this.isVisibilidadCeldaModificarUtilidadProducto=false;
			this.isVisibilidadCeldaActualizarUtilidadProducto=false;
			this.isVisibilidadCeldaEliminarUtilidadProducto=false;
			this.isVisibilidadCeldaCancelarUtilidadProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUtilidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=false;
			this.isVisibilidadCeldaModificarUtilidadProducto=false;
			this.isVisibilidadCeldaActualizarUtilidadProducto=true;
			this.isVisibilidadCeldaEliminarUtilidadProducto=false;
			this.isVisibilidadCeldaCancelarUtilidadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUtilidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=false;
			this.isVisibilidadCeldaModificarUtilidadProducto=false;
			this.isVisibilidadCeldaActualizarUtilidadProducto=true;
			this.isVisibilidadCeldaEliminarUtilidadProducto=true;
			this.isVisibilidadCeldaCancelarUtilidadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUtilidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=false;
			this.isVisibilidadCeldaModificarUtilidadProducto=false;
			this.isVisibilidadCeldaActualizarUtilidadProducto=true;
			this.isVisibilidadCeldaEliminarUtilidadProducto=false;
			this.isVisibilidadCeldaCancelarUtilidadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUtilidadProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=true;
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=true;
			this.isVisibilidadCeldaModificarUtilidadProducto=false;
			this.isVisibilidadCeldaActualizarUtilidadProducto=false;
			this.isVisibilidadCeldaEliminarUtilidadProducto=false;
			this.isVisibilidadCeldaCancelarUtilidadProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUtilidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=false;
			this.isVisibilidadCeldaActualizarUtilidadProducto=false;
			this.isVisibilidadCeldaEliminarUtilidadProducto=false;
			this.isVisibilidadCeldaCancelarUtilidadProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUtilidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=false;
			this.isVisibilidadCeldaModificarUtilidadProducto=true;
			this.isVisibilidadCeldaActualizarUtilidadProducto=false;
			this.isVisibilidadCeldaEliminarUtilidadProducto=false;
			this.isVisibilidadCeldaCancelarUtilidadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UtilidadProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUtilidadProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=true;
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=true;
		} else {
			this.actualizarEstadoPanelsUtilidadProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUtilidadProducto=false;
			//this.isVisibilidadCeldaVerFormUtilidadProducto=false;
			this.isVisibilidadCeldaDuplicarUtilidadProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!utilidadproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoUtilidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			if(!utilidadproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;												
			}
			
			this.jButtonCerrarUtilidadProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUtilidadProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.utilidadproducto)) {
			this.isVisibilidadCeldaActualizarUtilidadProducto=false;
			this.isVisibilidadCeldaEliminarUtilidadProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUtilidadProducto() {
	}
	
	public void actualizarEstadoPanelsUtilidadProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUtilidadProducto!=null) {
				this.jScrollPanelDatosEdicionUtilidadProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadProducto!=null) {
				this.jTabbedPaneBusquedasUtilidadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadProducto!=null) {
				this.jScrollPanelDatosUtilidadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadProducto!=null) {
				this.jPanelPaginacionUtilidadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadProducto!=null) {
				this.jPanelParametrosReportesUtilidadProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUtilidadProducto!=null) {
				this.jScrollPanelDatosEdicionUtilidadProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadProducto!=null) {
				this.jTabbedPaneBusquedasUtilidadProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUtilidadProducto!=null) {
				this.jScrollPanelDatosUtilidadProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadProducto!=null) {
				this.jPanelPaginacionUtilidadProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadProducto!=null) {
				this.jPanelParametrosReportesUtilidadProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUtilidadProducto!=null) {
				this.jScrollPanelDatosEdicionUtilidadProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadProducto!=null) {
				this.jTabbedPaneBusquedasUtilidadProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadProducto!=null) {
				this.jScrollPanelDatosUtilidadProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadProducto!=null) {
				this.jPanelPaginacionUtilidadProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadProducto!=null) {
				this.jPanelParametrosReportesUtilidadProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUtilidadProducto!=null) {
				this.jScrollPanelDatosEdicionUtilidadProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadProducto!=null) {
				this.jTabbedPaneBusquedasUtilidadProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadProducto!=null) {
				this.jScrollPanelDatosUtilidadProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadProducto!=null) {
				this.jPanelPaginacionUtilidadProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadProducto!=null) {
				this.jPanelParametrosReportesUtilidadProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUtilidadProducto!=null) {
				this.jScrollPanelDatosEdicionUtilidadProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadProducto!=null) {
				this.jTabbedPaneBusquedasUtilidadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadProducto!=null) {
				this.jScrollPanelDatosUtilidadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadProducto!=null) {
				this.jPanelPaginacionUtilidadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadProducto!=null) {
				this.jPanelParametrosReportesUtilidadProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUtilidadProducto!=null) {
				this.jScrollPanelDatosEdicionUtilidadProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadProducto!=null) {
				this.jTabbedPaneBusquedasUtilidadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadProducto!=null) {
				this.jScrollPanelDatosUtilidadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadProducto!=null) {
				this.jPanelPaginacionUtilidadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadProducto!=null) {
				this.jPanelParametrosReportesUtilidadProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUtilidadProducto!=null) {
				this.jScrollPanelDatosEdicionUtilidadProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadProducto!=null) {
				this.jTabbedPaneBusquedasUtilidadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadProducto!=null) {
				this.jScrollPanelDatosUtilidadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadProducto!=null) {
				this.jPanelPaginacionUtilidadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadProducto!=null) {
				this.jPanelParametrosReportesUtilidadProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUtilidadProducto!=null) {
					this.jTabbedPaneBusquedasUtilidadProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUtilidadProducto!=null) {
				this.jPanelParametrosReportesUtilidadProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadProducto!=null) {
				this.jTabbedPaneBusquedasUtilidadProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUtilidadProducto!=null) {
				this.jPanelParametrosReportesUtilidadProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasUtilidadProducto.remove(jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto);}

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUtilidadProducto.remove(jPanelFK_IdBodegaUtilidadProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasUtilidadProducto.remove(jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto);}

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUtilidadProducto.remove(jPanelFK_IdBodegaUtilidadProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaBodega;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasUtilidadProducto.remove(jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto);}

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUtilidadProducto.remove(jPanelFK_IdBodegaUtilidadProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaProducto;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasUtilidadProducto.remove(jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto);}

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUtilidadProducto.remove(jPanelFK_IdBodegaUtilidadProducto);}
		}
		
	}
	
	
	
	

	public String registrarSesionUtilidadProductoParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(utilidadproductoSessionBean==null) {
				utilidadproductoSessionBean=new UtilidadProductoSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(utilidadproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.utilidadproductoFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(UtilidadProductoConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionUtilidadProducto(true);
			//productoSessionBean.setlidUtilidadProductoActual(this.idUtilidadProductoActual);

			utilidadproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUtilidadProducto(true);
			utilidadproductoSessionBean.setlIdUtilidadProductoActualForeignKey(this.idUtilidadProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//UtilidadProductoSessionBean utilidadproductoSessionBean=new UtilidadProductoSessionBean();
		
		if(this.utilidadproductoSessionBean==null) {
			this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
		}
		
		this.utilidadproductoSessionBean.setsUltimaBusquedaUtilidadProducto(this.getsAccionBusqueda());
		this.utilidadproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.utilidadproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdBodegaPorIdProducto")) {
			utilidadproductoSessionBean.setid_bodega(this.getid_bodegaBusquedaPorIdBodegaPorIdProducto());	
			utilidadproductoSessionBean.setid_producto(this.getid_productoBusquedaPorIdBodegaPorIdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			utilidadproductoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			utilidadproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			utilidadproductoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//UtilidadProductoSessionBean utilidadproductoSessionBean=new UtilidadProductoSessionBean();
		
		if(this.utilidadproductoSessionBean==null) {
			this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
		}
		
		if(this.utilidadproductoSessionBean.getsUltimaBusquedaUtilidadProducto()!=null&&!this.utilidadproductoSessionBean.getsUltimaBusquedaUtilidadProducto().equals("")) {
			this.setsAccionBusqueda(utilidadproductoSessionBean.getsUltimaBusquedaUtilidadProducto());
			this.setiNumeroPaginacion(utilidadproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(utilidadproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdBodegaPorIdProducto")) {
				this.setid_bodegaBusquedaPorIdBodegaPorIdProducto(utilidadproductoSessionBean.getid_bodega());
				utilidadproductoSessionBean.setid_bodega(-1L);
				this.setid_productoBusquedaPorIdBodegaPorIdProducto(utilidadproductoSessionBean.getid_producto());
				utilidadproductoSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(utilidadproductoSessionBean.getid_bodega());
				utilidadproductoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(utilidadproductoSessionBean.getid_empresa());
				utilidadproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(utilidadproductoSessionBean.getid_sucursal());
				utilidadproductoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.utilidadproductoSessionBean.setsUltimaBusquedaUtilidadProducto("");
		this.utilidadproductoSessionBean.setiNumeroPaginacion(UtilidadProductoConstantesFunciones.INUMEROPAGINACION);
		this.utilidadproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUtilidadProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUtilidadProducto() {
		this.updateBorderResaltarBusquedasFormularioUtilidadProducto();
		this.updateVisibilidadBusquedasFormularioUtilidadProducto();
		this.updateHabilitarBusquedasFormularioUtilidadProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioUtilidadProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUtilidadProducto.getComponents().length>0) {
	

		if(this.utilidadproductoConstantesFunciones.resaltarBusquedaPorIdBodegaPorIdProductoUtilidadProducto!=null) {
			index= this.jTabbedPaneBusquedasUtilidadProducto.indexOfComponent(this.jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadProducto.getComponent(index);
				jPanel.setBorder(this.utilidadproductoConstantesFunciones.resaltarBusquedaPorIdBodegaPorIdProductoUtilidadProducto);
			}
		}

		if(this.utilidadproductoConstantesFunciones.resaltarFK_IdBodegaUtilidadProducto!=null) {
			index= this.jTabbedPaneBusquedasUtilidadProducto.indexOfComponent(this.jPanelFK_IdBodegaUtilidadProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadProducto.getComponent(index);
				jPanel.setBorder(this.utilidadproductoConstantesFunciones.resaltarFK_IdBodegaUtilidadProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUtilidadProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUtilidadProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUtilidadProducto.indexOfComponent(this.jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.utilidadproductoConstantesFunciones.mostrarBusquedaPorIdBodegaPorIdProductoUtilidadProducto);
			if(!this.utilidadproductoConstantesFunciones.mostrarBusquedaPorIdBodegaPorIdProductoUtilidadProducto && index>-1) {
				this.jTabbedPaneBusquedasUtilidadProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasUtilidadProducto.indexOfComponent(this.jPanelFK_IdBodegaUtilidadProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.utilidadproductoConstantesFunciones.mostrarFK_IdBodegaUtilidadProducto);
			if(!this.utilidadproductoConstantesFunciones.mostrarFK_IdBodegaUtilidadProducto && index>-1) {
				this.jTabbedPaneBusquedasUtilidadProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUtilidadProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUtilidadProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUtilidadProducto.indexOfComponent(this.jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.utilidadproductoConstantesFunciones.activarBusquedaPorIdBodegaPorIdProductoUtilidadProducto);
				this.jTabbedPaneBusquedasUtilidadProducto.setEnabledAt(index,this.utilidadproductoConstantesFunciones.activarBusquedaPorIdBodegaPorIdProductoUtilidadProducto);
			}

			index= this.jTabbedPaneBusquedasUtilidadProducto.indexOfComponent(this.jPanelFK_IdBodegaUtilidadProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.utilidadproductoConstantesFunciones.activarFK_IdBodegaUtilidadProducto);
				this.jTabbedPaneBusquedasUtilidadProducto.setEnabledAt(index,this.utilidadproductoConstantesFunciones.activarFK_IdBodegaUtilidadProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUtilidadProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto")) {
			index= this.jTabbedPaneBusquedasUtilidadProducto.indexOfComponent(this.jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto);

			this.jTabbedPaneBusquedasUtilidadProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadProducto.getComponent(index);

			this.utilidadproductoConstantesFunciones.setResaltarBusquedaPorIdBodegaPorIdProductoUtilidadProducto(resaltar);

			jPanel.setBorder(this.utilidadproductoConstantesFunciones.resaltarBusquedaPorIdBodegaPorIdProductoUtilidadProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasUtilidadProducto.indexOfComponent(this.jPanelFK_IdBodegaUtilidadProducto);

			this.jTabbedPaneBusquedasUtilidadProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadProducto.getComponent(index);

			this.utilidadproductoConstantesFunciones.setResaltarFK_IdBodegaUtilidadProducto(resaltar);

			jPanel.setBorder(this.utilidadproductoConstantesFunciones.resaltarFK_IdBodegaUtilidadProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUtilidadProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioUtilidadProducto() throws Exception {

		if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUtilidadProducto();
		this.updateVisibilidadResaltarControlesFormularioUtilidadProducto();
		this.updateHabilitarResaltarControlesFormularioUtilidadProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioUtilidadProducto() throws Exception {
		if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.utilidadproductoConstantesFunciones.resaltaridUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto!=null) {this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.setBorder(this.utilidadproductoConstantesFunciones.resaltaridUtilidadProducto);}
		if(this.utilidadproductoConstantesFunciones.resaltarid_empresaUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto!=null) {this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.setBorder(this.utilidadproductoConstantesFunciones.resaltarid_empresaUtilidadProducto);}
		if(this.utilidadproductoConstantesFunciones.resaltarid_sucursalUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto!=null) {this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.setBorder(this.utilidadproductoConstantesFunciones.resaltarid_sucursalUtilidadProducto);}
		if(this.utilidadproductoConstantesFunciones.resaltarid_bodegaUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto!=null) {this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.setBorder(this.utilidadproductoConstantesFunciones.resaltarid_bodegaUtilidadProducto);}
		if(this.utilidadproductoConstantesFunciones.resaltarid_productoUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto!=null) {this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.setBorder(this.utilidadproductoConstantesFunciones.resaltarid_productoUtilidadProducto);}
		if(this.utilidadproductoConstantesFunciones.resaltarporcentajeUtilidadProducto!=null && this.jInternalFrameDetalleFormUtilidadProducto!=null) {this.jInternalFrameDetalleFormUtilidadProducto.jTextFieldporcentajeUtilidadProducto.setBorder(this.utilidadproductoConstantesFunciones.resaltarporcentajeUtilidadProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUtilidadProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
	
		//this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostraridUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jPanelidUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostraridUtilidadProducto);
		//this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarid_empresaUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jPanelid_empresaUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarid_empresaUtilidadProducto);
		//this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarid_sucursalUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jPanelid_sucursalUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarid_sucursalUtilidadProducto);
		//this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarid_bodegaUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jPanelid_bodegaUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarid_bodegaUtilidadProducto);
		//this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarid_productoUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jPanelid_productoUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarid_productoUtilidadProducto);
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarid_productoUtilidadProducto);
		//this.jInternalFrameDetalleFormUtilidadProducto.jTextFieldporcentajeUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarporcentajeUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jPanelporcentajeUtilidadProducto.setVisible(this.utilidadproductoConstantesFunciones.mostrarporcentajeUtilidadProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUtilidadProducto() throws Exception {
		if(this.jInternalFrameDetalleFormUtilidadProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUtilidadProducto!=null) {
	
		this.jInternalFrameDetalleFormUtilidadProducto.jLabelidUtilidadProducto.setEnabled(this.utilidadproductoConstantesFunciones.activaridUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_empresaUtilidadProducto.setEnabled(this.utilidadproductoConstantesFunciones.activarid_empresaUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_sucursalUtilidadProducto.setEnabled(this.utilidadproductoConstantesFunciones.activarid_sucursalUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_bodegaUtilidadProducto.setEnabled(this.utilidadproductoConstantesFunciones.activarid_bodegaUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jComboBoxid_productoUtilidadProducto.setEnabled(this.utilidadproductoConstantesFunciones.activarid_productoUtilidadProducto);
			this.jInternalFrameDetalleFormUtilidadProducto.jButtonid_productoUtilidadProducto.setEnabled(this.utilidadproductoConstantesFunciones.activarid_productoUtilidadProducto);
		this.jInternalFrameDetalleFormUtilidadProducto.jTextFieldporcentajeUtilidadProducto.setEnabled(this.utilidadproductoConstantesFunciones.activarporcentajeUtilidadProducto);
		}
	}
	
		
}