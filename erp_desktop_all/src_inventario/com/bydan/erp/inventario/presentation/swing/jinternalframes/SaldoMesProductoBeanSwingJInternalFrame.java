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

import com.bydan.erp.inventario.util.SaldoMesProductoConstantesFunciones;
import com.bydan.erp.inventario.util.SaldoMesProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.SaldoMesProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.SaldoMesProductoBean;
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
public class SaldoMesProductoBeanSwingJInternalFrame extends SaldoMesProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SaldoMesProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SaldoMesProducto> saldomesproductoValidator = new ClassValidator<SaldoMesProducto>(SaldoMesProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SaldoMesProducto saldomesproducto;	
	public SaldoMesProducto saldomesproductoAux;
	public SaldoMesProducto saldomesproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SaldoMesProducto saldomesproductoTotales;
	public Long idSaldoMesProductoActual;
	public Long iIdNuevoSaldoMesProducto=0L;
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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
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
	
	public Boolean isPermisoTodoSaldoMesProducto;
	public Boolean isPermisoNuevoSaldoMesProducto;
	public Boolean isPermisoActualizarSaldoMesProducto;
	public Boolean isPermisoActualizarOriginalSaldoMesProducto;
	public Boolean isPermisoEliminarSaldoMesProducto;
	public Boolean isPermisoGuardarCambiosSaldoMesProducto;
	public Boolean isPermisoConsultaSaldoMesProducto;
	public Boolean isPermisoBusquedaSaldoMesProducto;
	public Boolean isPermisoReporteSaldoMesProducto;
	public Boolean isPermisoPaginacionMedioSaldoMesProducto;
	public Boolean isPermisoPaginacionAltoSaldoMesProducto;
	public Boolean isPermisoPaginacionTodoSaldoMesProducto;
	public Boolean isPermisoCopiarSaldoMesProducto;
	public Boolean isPermisoVerFormSaldoMesProducto;
	public Boolean isPermisoDuplicarSaldoMesProducto;
	public Boolean isPermisoOrdenSaldoMesProducto;
	
	
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
	
	public SaldoMesProductoParameterReturnGeneral saldomesproductoReturnGeneral;
	public SaldoMesProductoParameterReturnGeneral saldomesproductoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSaldoMesProducto=false;
	public Boolean esParaAccionDesdeFormularioSaldoMesProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SaldoMesProductoSessionBeanAdditional saldomesproductoSessionBeanAdditional=null;
	
	public SaldoMesProductoSessionBeanAdditional getSaldoMesProductoSessionBeanAdditional() {
		return this.saldomesproductoSessionBeanAdditional;
	}
	
	public void setSaldoMesProductoSessionBeanAdditional(SaldoMesProductoSessionBeanAdditional saldomesproductoSessionBeanAdditional) {
		try {
			this.saldomesproductoSessionBeanAdditional=saldomesproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SaldoMesProductoBeanSwingJInternalFrameAdditional saldomesproductoBeanSwingJInternalFrameAdditional=null;
	//public class SaldoMesProductoBeanSwingJInternalFrame
	
	public SaldoMesProductoBeanSwingJInternalFrameAdditional getSaldoMesProductoBeanSwingJInternalFrameAdditional() {
		return this.saldomesproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setSaldoMesProductoBeanSwingJInternalFrameAdditional(SaldoMesProductoBeanSwingJInternalFrameAdditional saldomesproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.saldomesproductoBeanSwingJInternalFrameAdditional=saldomesproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SaldoMesProductoLogic saldomesproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SaldoMesProducto saldomesproductoBean;
	public SaldoMesProductoConstantesFunciones saldomesproductoConstantesFunciones;
	//public SaldoMesProductoParameterReturnGeneral saldomesproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<SaldoMesProducto> saldomesproductos;	
	//public List<SaldoMesProducto> saldomesproductosEliminados;
	//public List<SaldoMesProducto> saldomesproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSaldoMesProducto=false;
	public Boolean isVisibilidadCeldaDuplicarSaldoMesProducto=true;
	public Boolean isVisibilidadCeldaCopiarSaldoMesProducto=true;
	public Boolean isVisibilidadCeldaVerFormSaldoMesProducto=true;
	public Boolean isVisibilidadCeldaOrdenSaldoMesProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;
	public Boolean isVisibilidadCeldaModificarSaldoMesProducto=false;
	public Boolean isVisibilidadCeldaActualizarSaldoMesProducto=false;
	public Boolean isVisibilidadCeldaEliminarSaldoMesProducto=false;
	public Boolean isVisibilidadCeldaCancelarSaldoMesProducto=false;
	public Boolean isVisibilidadCeldaGuardarSaldoMesProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSaldoMesProducto=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoSaldoMesProducto() {
		return this.iIdNuevoSaldoMesProducto;
	}

	public void setiIdNuevoSaldoMesProducto(Long iIdNuevoSaldoMesProducto) {
		this.iIdNuevoSaldoMesProducto = iIdNuevoSaldoMesProducto;
	}
	
	public Long getidSaldoMesProductoActual() {
		return this.idSaldoMesProductoActual;
	}

	public void setidSaldoMesProductoActual(Long idSaldoMesProductoActual) {
		this.idSaldoMesProductoActual = idSaldoMesProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SaldoMesProducto getsaldomesproducto() {
		return this.saldomesproducto;
	}

	public void setsaldomesproducto(SaldoMesProducto saldomesproducto) {
		this.saldomesproducto = saldomesproducto;
	}
	
	public SaldoMesProducto getsaldomesproductoAux() {
		return this.saldomesproductoAux;
	}

	public void setsaldomesproductoAux(SaldoMesProducto saldomesproductoAux) {
		this.saldomesproductoAux = saldomesproductoAux;
	}				
	
	public SaldoMesProducto getsaldomesproductoAnterior() {
		return this.saldomesproductoAnterior;
	}

	public void setsaldomesproductoAnterior(SaldoMesProducto saldomesproductoAnterior) {
		this.saldomesproductoAnterior = saldomesproductoAnterior;
	}	
	
	public SaldoMesProducto getsaldomesproductoTotales() {
		return this.saldomesproductoTotales;
	}

	public void setsaldomesproductoTotales(SaldoMesProducto saldomesproductoTotales) {
		this.saldomesproductoTotales = saldomesproductoTotales;
	}	
	
	public SaldoMesProducto getsaldomesproductoBean() {
		return this.saldomesproductoBean;
	}

	public void setsaldomesproductoBean(SaldoMesProducto saldomesproductoBean) {
		this.saldomesproductoBean = saldomesproductoBean;
	}	
	
	public SaldoMesProductoParameterReturnGeneral getsaldomesproductoReturnGeneral() {
		return this.saldomesproductoReturnGeneral;
	}

	public void setsaldomesproductoReturnGeneral(SaldoMesProductoParameterReturnGeneral saldomesproductoReturnGeneral) {
		this.saldomesproductoReturnGeneral = saldomesproductoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
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

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
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
	
	
	public SaldoMesProductoLogic getSaldoMesProductoLogic()	{		
		return saldomesproductoLogic;
	}

	public void setSaldoMesProductoLogic(SaldoMesProductoLogic saldomesproductoLogic) {
		this.saldomesproductoLogic = saldomesproductoLogic;
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
	
	public Boolean getIsEsNuevoSaldoMesProducto() {
		return isEsNuevoSaldoMesProducto;
	}

	public void setIsEsNuevoSaldoMesProducto(Boolean isEsNuevoSaldoMesProducto) {
		this.isEsNuevoSaldoMesProducto = isEsNuevoSaldoMesProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioSaldoMesProducto() {
		return esParaAccionDesdeFormularioSaldoMesProducto;
	}
	
	public void setEsParaAccionDesdeFormularioSaldoMesProducto(Boolean esParaAccionDesdeFormularioSaldoMesProducto) {
		this.esParaAccionDesdeFormularioSaldoMesProducto = esParaAccionDesdeFormularioSaldoMesProducto;
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

			if(this.saldomesproductoSessionBean==null) {
				this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
			}

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(saldomesproductoSessionBean.getlidEmpresaActual());
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

			if(this.saldomesproductoSessionBean==null) {
				this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
			}

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(saldomesproductoSessionBean.getlidSucursalActual());
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

			if(this.saldomesproductoSessionBean==null) {
				this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
			}

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(saldomesproductoSessionBean.getlidBodegaActual());
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

			if(this.saldomesproductoSessionBean==null) {
				this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
			}

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(saldomesproductoSessionBean.getlidProductoActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.saldomesproductoSessionBean==null) {
				this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
			}

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(saldomesproductoSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.saldomesproductoSessionBean==null) {
				this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
			}

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(saldomesproductoSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.saldomesproducto!=null) {
						this.saldomesproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSaldoMesProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSaldoMesProductoGenerico)throws Exception
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
				jComboBoxid_empresaSaldoMesProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSaldoMesProductoGenerico!=null && jComboBoxid_empresaSaldoMesProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaSaldoMesProductoGenerico.setSelectedIndex(0);
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

					if(this.saldomesproducto!=null) {
						this.saldomesproducto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalSaldoMesProducto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalSaldoMesProductoGenerico)throws Exception
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
				jComboBoxid_sucursalSaldoMesProductoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalSaldoMesProductoGenerico!=null && jComboBoxid_sucursalSaldoMesProductoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalSaldoMesProductoGenerico.setSelectedIndex(0);
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

					if(this.saldomesproducto!=null) {
						this.saldomesproducto.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaSaldoMesProducto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto!=null) {
						jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto!=null) {
							//jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaSaldoMesProductoGenerico)throws Exception
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
				jComboBoxid_bodegaSaldoMesProductoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaSaldoMesProductoGenerico!=null && jComboBoxid_bodegaSaldoMesProductoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaSaldoMesProductoGenerico.setSelectedIndex(0);
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

					if(this.saldomesproducto!=null) {
						this.saldomesproducto.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoSaldoMesProducto.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoSaldoMesProducto!=null) {
						jComboBoxid_productoFK_IdProductoSaldoMesProducto.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoSaldoMesProducto!=null) {
							//jComboBoxid_productoFK_IdProductoSaldoMesProducto.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoSaldoMesProducto.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoSaldoMesProducto.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoSaldoMesProductoGenerico)throws Exception
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
				jComboBoxid_productoSaldoMesProductoGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoSaldoMesProductoGenerico!=null && jComboBoxid_productoSaldoMesProductoGenerico.getItemCount()>0) {
					jComboBoxid_productoSaldoMesProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.saldomesproducto!=null) {
						this.saldomesproducto.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioSaldoMesProducto.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioSaldoMesProducto!=null) {
						jComboBoxid_anioFK_IdAnioSaldoMesProducto.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioSaldoMesProducto!=null) {
							//jComboBoxid_anioFK_IdAnioSaldoMesProducto.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioSaldoMesProducto.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioSaldoMesProducto.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioSaldoMesProductoGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioSaldoMesProductoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioSaldoMesProductoGenerico!=null && jComboBoxid_anioSaldoMesProductoGenerico.getItemCount()>0) {
					jComboBoxid_anioSaldoMesProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.saldomesproducto!=null) {
						this.saldomesproducto.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesSaldoMesProducto.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
						if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesSaldoMesProducto!=null) {
						jComboBoxid_mesFK_IdMesSaldoMesProducto.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesSaldoMesProducto!=null) {
							//jComboBoxid_mesFK_IdMesSaldoMesProducto.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesSaldoMesProducto.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesSaldoMesProducto.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesSaldoMesProductoGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesSaldoMesProductoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesSaldoMesProductoGenerico!=null && jComboBoxid_mesSaldoMesProductoGenerico.getItemCount()>0) {
					jComboBoxid_mesSaldoMesProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SaldoMesProducto saldomesproducto,JComboBox jComboBoxid_empresaSaldoMesProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSaldoMesProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSaldoMesProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				saldomesproducto.setid_empresa(empresaAux.getId());
				saldomesproducto.setempresa_descripcion(SaldoMesProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				saldomesproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(SaldoMesProducto saldomesproducto,JComboBox jComboBoxid_sucursalSaldoMesProductoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalSaldoMesProductoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalSaldoMesProductoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				saldomesproducto.setid_sucursal(sucursalAux.getId());
				saldomesproducto.setsucursal_descripcion(SaldoMesProductoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				saldomesproducto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(SaldoMesProducto saldomesproducto,JComboBox jComboBoxid_bodegaSaldoMesProductoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaSaldoMesProductoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaSaldoMesProductoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				saldomesproducto.setid_bodega(bodegaAux.getId());
				saldomesproducto.setbodega_descripcion(SaldoMesProductoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				saldomesproducto.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(SaldoMesProducto saldomesproducto,JComboBox jComboBoxid_productoSaldoMesProductoGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoSaldoMesProductoGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoSaldoMesProductoGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				saldomesproducto.setid_producto(productoAux.getId());
				saldomesproducto.setproducto_descripcion(SaldoMesProductoConstantesFunciones.getProductoDescripcion(productoAux));
				saldomesproducto.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(SaldoMesProducto saldomesproducto,JComboBox jComboBoxid_anioSaldoMesProductoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioSaldoMesProductoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioSaldoMesProductoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				saldomesproducto.setid_anio(anioAux.getId());
				saldomesproducto.setanio_descripcion(SaldoMesProductoConstantesFunciones.getAnioDescripcion(anioAux));
				saldomesproducto.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(SaldoMesProducto saldomesproducto,JComboBox jComboBoxid_mesSaldoMesProductoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesSaldoMesProductoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesSaldoMesProductoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				saldomesproducto.setid_mes(mesAux.getId());
				saldomesproducto.setmes_descripcion(SaldoMesProductoConstantesFunciones.getMesDescripcion(mesAux));
				saldomesproducto.setMes(mesAux);			}
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

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
					}

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
					}

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
					}

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.addItem(bodega);
							}
						}

						if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
					}

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoSaldoMesProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoSaldoMesProducto.addItem(producto);
							}
						}

						if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
					}

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioSaldoMesProducto.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioSaldoMesProducto.addItem(anio);
							}
						}

						if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { 
					}

					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesSaldoMesProducto.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesSaldoMesProducto.addItem(mes);
							}
						}

						if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoSaldoMesProducto.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoSaldoMesProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioSaldoMesProducto.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioSaldoMesProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesSaldoMesProducto.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesSaldoMesProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSaldoMesProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SaldoMesProductoConstantesFunciones.refrescarForeignKeysDescripcionesSaldoMesProducto(this.saldomesproductoLogic.getSaldoMesProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SaldoMesProductoConstantesFunciones.refrescarForeignKeysDescripcionesSaldoMesProducto(this.saldomesproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//saldomesproductoLogic.setSaldoMesProductos(this.saldomesproductos);
			saldomesproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SaldoMesProductoParameterReturnGeneral getSaldoMesProductoParameterGeneral() {
		return this.saldomesproductoParameterGeneral;
	}
	
	public void setSaldoMesProductoParameterGeneral(SaldoMesProductoParameterReturnGeneral saldomesproductoParameterGeneral) {
		this.saldomesproductoParameterGeneral = saldomesproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSaldoMesProducto() {
		return isPermisoTodoSaldoMesProducto;
	}

	public void setIsPermisoTodoSaldoMesProducto(Boolean isPermisoTodoSaldoMesProducto) {
		this.isPermisoTodoSaldoMesProducto = isPermisoTodoSaldoMesProducto;
	}

	public Boolean getIsPermisoNuevoSaldoMesProducto() {
		return isPermisoNuevoSaldoMesProducto;
	}

	public void setIsPermisoNuevoSaldoMesProducto(Boolean isPermisoNuevoSaldoMesProducto) {
		this.isPermisoNuevoSaldoMesProducto = isPermisoNuevoSaldoMesProducto;
	}

	public Boolean getIsPermisoActualizarSaldoMesProducto() {
		return isPermisoActualizarSaldoMesProducto;
	}

	public void setIsPermisoActualizarSaldoMesProducto(Boolean isPermisoActualizarSaldoMesProducto) {
		this.isPermisoActualizarSaldoMesProducto = isPermisoActualizarSaldoMesProducto;
	}

	public Boolean getIsPermisoEliminarSaldoMesProducto() {
		return isPermisoEliminarSaldoMesProducto;
	}

	public void setIsPermisoEliminarSaldoMesProducto(Boolean isPermisoEliminarSaldoMesProducto) {
		this.isPermisoEliminarSaldoMesProducto = isPermisoEliminarSaldoMesProducto;
	}

	public Boolean getIsPermisoGuardarCambiosSaldoMesProducto() {
		return isPermisoGuardarCambiosSaldoMesProducto;
	}

	public void setIsPermisoGuardarCambiosSaldoMesProducto(Boolean isPermisoGuardarCambiosSaldoMesProducto) {
		this.isPermisoGuardarCambiosSaldoMesProducto = isPermisoGuardarCambiosSaldoMesProducto;
	}
	
	public Boolean getIsPermisoConsultaSaldoMesProducto() {
		return isPermisoConsultaSaldoMesProducto;
	}

	public void setIsPermisoConsultaSaldoMesProducto(Boolean isPermisoConsultaSaldoMesProducto) {
		this.isPermisoConsultaSaldoMesProducto = isPermisoConsultaSaldoMesProducto;
	}

	public Boolean getIsPermisoBusquedaSaldoMesProducto() {
		return isPermisoBusquedaSaldoMesProducto;
	}

	public void setIsPermisoBusquedaSaldoMesProducto(Boolean isPermisoBusquedaSaldoMesProducto) {
		this.isPermisoBusquedaSaldoMesProducto = isPermisoBusquedaSaldoMesProducto;
	}

	public Boolean getIsPermisoReporteSaldoMesProducto() {
		return isPermisoReporteSaldoMesProducto;
	}

	public void setIsPermisoReporteSaldoMesProducto(Boolean isPermisoReporteSaldoMesProducto) {
		this.isPermisoReporteSaldoMesProducto = isPermisoReporteSaldoMesProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioSaldoMesProducto() {
		return isPermisoPaginacionMedioSaldoMesProducto;
	}

	public void setIsPermisoPaginacionMedioSaldoMesProducto(Boolean isPermisoPaginacionMedioSaldoMesProducto) {
		this.isPermisoPaginacionMedioSaldoMesProducto = isPermisoPaginacionMedioSaldoMesProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoSaldoMesProducto() {
		return isPermisoPaginacionTodoSaldoMesProducto;
	}

	public void setIsPermisoPaginacionTodoSaldoMesProducto(Boolean isPermisoPaginacionTodoSaldoMesProducto) {
		this.isPermisoPaginacionTodoSaldoMesProducto = isPermisoPaginacionTodoSaldoMesProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoSaldoMesProducto() {
		return isPermisoPaginacionAltoSaldoMesProducto;
	}

	public void setIsPermisoPaginacionAltoSaldoMesProducto(Boolean isPermisoPaginacionAltoSaldoMesProducto) {
		this.isPermisoPaginacionAltoSaldoMesProducto = isPermisoPaginacionAltoSaldoMesProducto;
	}
	
	public Boolean getIsPermisoCopiarSaldoMesProducto() {
		return isPermisoCopiarSaldoMesProducto;
	}

	public void setIsPermisoCopiarSaldoMesProducto(Boolean isPermisoCopiarSaldoMesProducto) {
		this.isPermisoCopiarSaldoMesProducto = isPermisoCopiarSaldoMesProducto;
	}
	
	public Boolean getIsPermisoVerFormSaldoMesProducto() {
		return isPermisoVerFormSaldoMesProducto;
	}

	public void setIsPermisoVerFormSaldoMesProducto(Boolean isPermisoVerFormSaldoMesProducto) {
		this.isPermisoVerFormSaldoMesProducto = isPermisoVerFormSaldoMesProducto;
	}
	
	public Boolean getIsPermisoDuplicarSaldoMesProducto() {
		return isPermisoDuplicarSaldoMesProducto;
	}

	public void setIsPermisoDuplicarSaldoMesProducto(Boolean isPermisoDuplicarSaldoMesProducto) {
		this.isPermisoDuplicarSaldoMesProducto = isPermisoDuplicarSaldoMesProducto;
	}
	
	public Boolean getIsPermisoOrdenSaldoMesProducto() {
		return isPermisoOrdenSaldoMesProducto;
	}

	public void setIsPermisoOrdenSaldoMesProducto(Boolean isPermisoOrdenSaldoMesProducto) {
		this.isPermisoOrdenSaldoMesProducto = isPermisoOrdenSaldoMesProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSaldoMesProducto() {
		return isVisibilidadCeldaNuevoSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaNuevoSaldoMesProducto(Boolean isVisibilidadCeldaNuevoSaldoMesProducto) {
		this.isVisibilidadCeldaNuevoSaldoMesProducto = isVisibilidadCeldaNuevoSaldoMesProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSaldoMesProducto() {
		return isVisibilidadCeldaDuplicarSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaDuplicarSaldoMesProducto(Boolean isVisibilidadCeldaDuplicarSaldoMesProducto) {
		this.isVisibilidadCeldaDuplicarSaldoMesProducto = isVisibilidadCeldaDuplicarSaldoMesProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSaldoMesProducto() {
		return isVisibilidadCeldaCopiarSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaCopiarSaldoMesProducto(Boolean isVisibilidadCeldaCopiarSaldoMesProducto) {
		this.isVisibilidadCeldaCopiarSaldoMesProducto = isVisibilidadCeldaCopiarSaldoMesProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSaldoMesProducto() {
		return isVisibilidadCeldaVerFormSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaVerFormSaldoMesProducto(Boolean isVisibilidadCeldaVerFormSaldoMesProducto) {
		this.isVisibilidadCeldaVerFormSaldoMesProducto = isVisibilidadCeldaVerFormSaldoMesProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSaldoMesProducto() {
		return isVisibilidadCeldaOrdenSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaOrdenSaldoMesProducto(Boolean isVisibilidadCeldaOrdenSaldoMesProducto) {
		this.isVisibilidadCeldaOrdenSaldoMesProducto = isVisibilidadCeldaOrdenSaldoMesProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSaldoMesProducto() {
		return isVisibilidadCeldaNuevoRelacionesSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSaldoMesProducto(Boolean isVisibilidadCeldaNuevoRelacionesSaldoMesProducto) {
		this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto = isVisibilidadCeldaNuevoRelacionesSaldoMesProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSaldoMesProducto() {
		return isVisibilidadCeldaModificarSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaModificarSaldoMesProducto(Boolean isVisibilidadCeldaModificarSaldoMesProducto) {
		this.isVisibilidadCeldaModificarSaldoMesProducto = isVisibilidadCeldaModificarSaldoMesProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSaldoMesProducto() {
		return isVisibilidadCeldaActualizarSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaActualizarSaldoMesProducto(Boolean isVisibilidadCeldaActualizarSaldoMesProducto) {
		this.isVisibilidadCeldaActualizarSaldoMesProducto = isVisibilidadCeldaActualizarSaldoMesProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarSaldoMesProducto() {
		return isVisibilidadCeldaEliminarSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaEliminarSaldoMesProducto(Boolean isVisibilidadCeldaEliminarSaldoMesProducto) {
		this.isVisibilidadCeldaEliminarSaldoMesProducto = isVisibilidadCeldaEliminarSaldoMesProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarSaldoMesProducto() {
		return isVisibilidadCeldaCancelarSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaCancelarSaldoMesProducto(Boolean isVisibilidadCeldaCancelarSaldoMesProducto) {
		this.isVisibilidadCeldaCancelarSaldoMesProducto = isVisibilidadCeldaCancelarSaldoMesProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarSaldoMesProducto() {
		return isVisibilidadCeldaGuardarSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaGuardarSaldoMesProducto(Boolean isVisibilidadCeldaGuardarSaldoMesProducto) {
		this.isVisibilidadCeldaGuardarSaldoMesProducto = isVisibilidadCeldaGuardarSaldoMesProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSaldoMesProducto() {
		return isVisibilidadCeldaGuardarCambiosSaldoMesProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSaldoMesProducto(Boolean isVisibilidadCeldaGuardarCambiosSaldoMesProducto) {
		this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto = isVisibilidadCeldaGuardarCambiosSaldoMesProducto;
	}
		
	public SaldoMesProductoSessionBean getsaldomesproductoSessionBean() {
		return this.saldomesproductoSessionBean;
	}
	
	public void setsaldomesproductoSessionBean(SaldoMesProductoSessionBean saldomesproductoSessionBean) {
		this.saldomesproductoSessionBean=saldomesproductoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
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

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(SaldoMesProducto saldomesproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(saldomesproducto,null);
				this.setActualParaGuardarSucursalForeignKey(saldomesproducto,null);
				this.setActualParaGuardarBodegaForeignKey(saldomesproducto,null);
				this.setActualParaGuardarProductoForeignKey(saldomesproducto,null);
				this.setActualParaGuardarAnioForeignKey(saldomesproducto,null);
				this.setActualParaGuardarMesForeignKey(saldomesproducto,null);
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
	
	public void bugActualizarReferenciaActual(SaldoMesProducto saldomesproducto,SaldoMesProducto saldomesproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSaldoMesProducto(saldomesproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		saldomesproductoAux.setId(saldomesproducto.getId());
		saldomesproductoAux.setVersionRow(saldomesproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSaldoMesProducto();
		
			int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = saldomesproductoValidator.getInvalidValues(this.saldomesproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			saldomesproductoLogic.setDatosCliente(datosCliente);
			saldomesproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				saldomesproductoAux=new  SaldoMesProducto();
				
				saldomesproductoAux.setIsNew(true);
				saldomesproductoAux.setIsChanged(true);
				
				saldomesproductoAux.setSaldoMesProductoOriginal(this.saldomesproducto);
				
				saldomesproductoAux.setId(this.saldomesproducto.getId());	
				saldomesproductoAux.setVersionRow(this.saldomesproducto.getVersionRow());	
				saldomesproductoAux.setid_empresa(this.saldomesproducto.getid_empresa());	
				saldomesproductoAux.setid_sucursal(this.saldomesproducto.getid_sucursal());	
				saldomesproductoAux.setid_bodega(this.saldomesproducto.getid_bodega());	
				saldomesproductoAux.setid_producto(this.saldomesproducto.getid_producto());	
				saldomesproductoAux.setid_anio(this.saldomesproducto.getid_anio());	
				saldomesproductoAux.setid_mes(this.saldomesproducto.getid_mes());	
				saldomesproductoAux.setsaldo(this.saldomesproducto.getsaldo());	
				saldomesproductoAux.setcosto(this.saldomesproducto.getcosto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.saldomesproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(saldomesproductoAux,saldomesproductoLogic.getSaldoMesProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldomesproductoAux,saldomesproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.saldomesproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoLogic.saveSaldoMesProductos();//WithConnection
						//saldomesproductoLogic.getSetVersionRowSaldoMesProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.saldomesproducto,saldomesproductoAux);
					
					this.refrescarForeignKeysDescripcionesSaldoMesProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								saldomesproductoLogic.saveSaldoMesProductoRelaciones(saldomesproductoAux);//WithConnection
								//saldomesproductoLogic.getSetVersionRowSaldoMesProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.saldomesproducto,saldomesproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.saldomesproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(saldomesproductoAux,saldomesproductoLogic.getSaldoMesProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(saldomesproductoAux,saldomesproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.saldomesproducto,saldomesproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				saldomesproductoAux=new  SaldoMesProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.saldomesproductoSessionBean.getEsGuardarRelacionado() && this.saldomesproducto.getId()>=0)) {
						
					saldomesproductoAux.setIsNew(false);
				}
				
				saldomesproductoAux.setIsDeleted(false);
			
				saldomesproductoAux.setId(this.saldomesproducto.getId());	
				saldomesproductoAux.setVersionRow(this.saldomesproducto.getVersionRow());	
				saldomesproductoAux.setid_empresa(this.saldomesproducto.getid_empresa());	
				saldomesproductoAux.setid_sucursal(this.saldomesproducto.getid_sucursal());	
				saldomesproductoAux.setid_bodega(this.saldomesproducto.getid_bodega());	
				saldomesproductoAux.setid_producto(this.saldomesproducto.getid_producto());	
				saldomesproductoAux.setid_anio(this.saldomesproducto.getid_anio());	
				saldomesproductoAux.setid_mes(this.saldomesproducto.getid_mes());	
				saldomesproductoAux.setsaldo(this.saldomesproducto.getsaldo());	
				saldomesproductoAux.setcosto(this.saldomesproducto.getcosto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(saldomesproductoAux,saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldomesproductoAux,saldomesproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.saldomesproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoLogic.saveSaldoMesProductos();//WithConnection
						//saldomesproductoLogic.getSetVersionRowSaldoMesProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.saldomesproducto,saldomesproductoAux);
					
					this.refrescarForeignKeysDescripcionesSaldoMesProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								saldomesproductoLogic.saveSaldoMesProductoRelaciones(saldomesproductoAux);//WithConnection
								//saldomesproductoLogic.getSetVersionRowSaldoMesProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.saldomesproducto,saldomesproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.saldomesproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(saldomesproductoAux,saldomesproductoLogic.getSaldoMesProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(saldomesproductoAux,saldomesproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.saldomesproducto,saldomesproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				saldomesproductoAux=new  SaldoMesProducto();
				
				saldomesproductoAux.setIsNew(false);
				saldomesproductoAux.setIsChanged(false);
				
				saldomesproductoAux.setIsDeleted(true);
				
				saldomesproductoAux.setId(this.saldomesproducto.getId());	
				saldomesproductoAux.setVersionRow(this.saldomesproducto.getVersionRow());	
				saldomesproductoAux.setid_empresa(this.saldomesproducto.getid_empresa());	
				saldomesproductoAux.setid_sucursal(this.saldomesproducto.getid_sucursal());	
				saldomesproductoAux.setid_bodega(this.saldomesproducto.getid_bodega());	
				saldomesproductoAux.setid_producto(this.saldomesproducto.getid_producto());	
				saldomesproductoAux.setid_anio(this.saldomesproducto.getid_anio());	
				saldomesproductoAux.setid_mes(this.saldomesproducto.getid_mes());	
				saldomesproductoAux.setsaldo(this.saldomesproducto.getsaldo());	
				saldomesproductoAux.setcosto(this.saldomesproducto.getcosto());	
				
				if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.saldomesproductoAux.getId()>=0) {	
						this.saldomesproductosEliminados.add(saldomesproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(saldomesproductoAux,saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldomesproductoAux,saldomesproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.saldomesproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoLogic.saveSaldoMesProductos();//WithConnection
						//saldomesproductoLogic.getSetVersionRowSaldoMesProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								saldomesproductoLogic.saveSaldoMesProductoRelaciones(saldomesproductoAux);//WithConnection
								//saldomesproductoLogic.getSetVersionRowSaldoMesProductos();//WithConnection
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
							if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.saldomesproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(saldomesproductoAux,saldomesproductoLogic.getSaldoMesProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(saldomesproductoAux,saldomesproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getSaldoMesProductos().addAll(this.saldomesproductosEliminados);
					
					saldomesproductoLogic.saveSaldoMesProductos();//WithConnection
					//saldomesproductoLogic.getSetVersionRowSaldoMesProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSaldoMesProducto();
				
				this.saldomesproductosEliminados= new ArrayList<SaldoMesProducto>();		
			}
			
			if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Saldo Mes Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.saldomesproducto=saldomesproductoAux;
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
      		//this.finishProcessSaldoMesProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(SaldoMesProducto saldomesproductoLocal) throws Exception {
		
		if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SaldoMesProducto saldomesproductoLocal) throws Exception {	
		if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				saldomesproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				saldomesproductoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				saldomesproductoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				saldomesproductoLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				saldomesproductoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				saldomesproductoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSaldoMesProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = saldomesproductoValidator.getInvalidValues(this.saldomesproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SaldoMesProducto saldomesproducto,List<SaldoMesProducto> saldomesproductos) throws Exception {
		try	{		
			SaldoMesProductoConstantesFunciones.actualizarLista(saldomesproducto,saldomesproductos,this.saldomesproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SaldoMesProducto saldomesproducto,List<SaldoMesProducto> saldomesproductos) throws Exception {
		try	{			
			SaldoMesProductoConstantesFunciones.actualizarSelectedLista(saldomesproducto,saldomesproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SaldoMesProducto> saldomesproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				saldomesproductosLocal=this.saldomesproductoLogic.getSaldoMesProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				saldomesproductosLocal=this.saldomesproductos;
			}
			//ARCHITECTURE
		
			for(SaldoMesProducto saldomesproductoLocal:saldomesproductosLocal) {
				if(this.permiteMantenimiento(saldomesproductoLocal) && saldomesproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SaldoMesProductoConstantesFunciones.getSaldoMesProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SaldoMesProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_empresaSaldoMesProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoMesProductoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_sucursalSaldoMesProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoMesProductoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_bodegaSaldoMesProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoMesProductoConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_productoSaldoMesProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoMesProductoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_anioSaldoMesProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoMesProductoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_mesSaldoMesProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoMesProductoConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelsaldoSaldoMesProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoMesProductoConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelcostoSaldoMesProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_empresaSaldoMesProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_sucursalSaldoMesProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_bodegaSaldoMesProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_productoSaldoMesProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_anioSaldoMesProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelid_mesSaldoMesProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelsaldoSaldoMesProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelcostoSaldoMesProducto,"");
		
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
		this.iIdNuevoSaldoMesProducto--;	
		
		
		this.saldomesproductoAux=new SaldoMesProducto();
		
		this.saldomesproductoAux.setId(this.iIdNuevoSaldoMesProducto);
		this.saldomesproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldomesproductoLogic.getSaldoMesProductos().add(this.saldomesproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.saldomesproductos.add(this.saldomesproductoAux);
		}
		//ARCHITECTURE
		
		this.saldomesproducto=this.saldomesproductoAux;
		
		if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSaldoMesProducto(this.saldomesproducto);
			this.setVariablesObjetoActualToFormularioForeignKeySaldoMesProducto(this.saldomesproducto);
		}
				
		//this.setDefaultControlesSaldoMesProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySaldoMesProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySaldoMesProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldoMesProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldoMesProducto(this.saldomesproductoBean,this.saldomesproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SaldoMesProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {
			classes=SaldoMesProductoConstantesFunciones.getClassesRelationshipsOfSaldoMesProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.saldomesproductoReturnGeneral=saldomesproductoLogic.procesarEventosSaldoMesProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldomesproductoLogic.getSaldoMesProductos(),this.saldomesproducto,this.saldomesproductoParameterGeneral,this.isEsNuevoSaldoMesProducto,classes);//this.saldomesproductoLogic.getSaldoMesProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSaldoMesProducto(this.saldomesproductoReturnGeneral,this.saldomesproductoBean,false);
		
		if(this.saldomesproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySaldoMesProducto(this.saldomesproductoReturnGeneral.getSaldoMesProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSaldoMesProducto(this.saldomesproductoReturnGeneral.getSaldoMesProducto());
		}
		
		if(this.saldomesproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSaldoMesProducto(this.saldomesproductoReturnGeneral.getSaldoMesProducto(),classes);//this.saldomesproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySaldoMesProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySaldoMesProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.RecargarFormSaldoMesProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSaldoMesProducto(false);
						
			if(saldomesproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldoMesProducto();
			}
			
			this.actualizarVisualTableDatosSaldoMesProducto();
			
			this.jTableDatosSaldoMesProducto.setRowSelectionInterval(this.getIndiceNuevoSaldoMesProducto(), this.getIndiceNuevoSaldoMesProducto());
			
			this.seleccionarFilaTablaSaldoMesProductoActual();
						
			this.actualizarEstadoCeldasBotonesSaldoMesProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSaldoMesProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldsaldoSaldoMesProducto.setEnabled(isHabilitar && this.saldomesproductoConstantesFunciones.activarsaldoSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldcostoSaldoMesProducto.setEnabled(isHabilitar && this.saldomesproductoConstantesFunciones.activarcostoSaldoMesProducto);	
		//
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.setEnabled(isHabilitar && this.saldomesproductoConstantesFunciones.activarid_empresaSaldoMesProducto);//
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.setEnabled(isHabilitar && this.saldomesproductoConstantesFunciones.activarid_sucursalSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.setEnabled(isHabilitar && this.saldomesproductoConstantesFunciones.activarid_bodegaSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.setEnabled(isHabilitar && this.saldomesproductoConstantesFunciones.activarid_productoSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.setEnabled(isHabilitar && this.saldomesproductoConstantesFunciones.activarid_anioSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.setEnabled(isHabilitar && this.saldomesproductoConstantesFunciones.activarid_mesSaldoMesProducto);
	};
	
	public void setDefaultControlesSaldoMesProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSaldoMesProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.saldomesproductoSessionBean.setConGuardarRelaciones(true);			
			this.saldomesproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSaldoMesProducto.jTabbedPaneRelacionesSaldoMesProducto.setVisible(true);
			
					
		} else {
			//this.saldomesproductoSessionBean.setConGuardarRelaciones(false);			
			this.saldomesproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSaldoMesProducto.jTabbedPaneRelacionesSaldoMesProducto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSaldoMesProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoMesProducto saldomesproductoAux:this.saldomesproductoLogic.getSaldoMesProductos()) {
				if(saldomesproductoAux.getId().equals(this.iIdNuevoSaldoMesProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoMesProducto saldomesproductoAux:this.saldomesproductos) {
				if(saldomesproductoAux.getId().equals(this.iIdNuevoSaldoMesProducto)) {
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
	
	public int getIndiceActualSaldoMesProducto(SaldoMesProducto saldomesproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoMesProducto saldomesproductoAux:this.saldomesproductoLogic.getSaldoMesProductos()) {
				if(saldomesproductoAux.getId().equals(saldomesproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoMesProducto saldomesproductoAux:this.saldomesproductos) {
				if(saldomesproductoAux.getId().equals(saldomesproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSaldoMesProducto(SaldoMesProducto saldomesproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoMesProducto saldomesproductoAux:this.saldomesproductoLogic.getSaldoMesProductos()) {
				if(saldomesproductoAux.getSaldoMesProductoOriginal().getId().equals(saldomesproductoOriginal.getId())) {
					existe=true;
					saldomesproductoOriginal.setId(saldomesproductoAux.getId());
					saldomesproductoOriginal.setVersionRow(saldomesproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoMesProducto saldomesproductoAux:this.saldomesproductos) {
				if(saldomesproductoAux.getSaldoMesProductoOriginal().getId().equals(saldomesproductoOriginal.getId())) {
					existe=true;
					saldomesproductoOriginal.setId(saldomesproductoAux.getId());
					saldomesproductoOriginal.setVersionRow(saldomesproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSaldoMesProducto(Boolean esParaCancelar) throws Exception {
		saldomesproductosAux=new ArrayList<SaldoMesProducto>();
		saldomesproductoAux=new SaldoMesProducto();
		
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldoMesProducto saldomesproductoAux:this.saldomesproductoLogic.getSaldoMesProductos()) {
					if(saldomesproductoAux.getId()<0) {
						saldomesproductosAux.add(saldomesproductoAux);
					}		
				}
				this.iIdNuevoSaldoMesProducto=0L;
				this.saldomesproductoLogic.getSaldoMesProductos().removeAll(saldomesproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldoMesProducto saldomesproductoAux:this.saldomesproductos) {
					if(saldomesproductoAux.getId()<0) {
						saldomesproductosAux.add(saldomesproductoAux);
					}		
				}
				this.iIdNuevoSaldoMesProducto=0L;
				this.saldomesproductos.removeAll(saldomesproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSaldoMesProducto 
					&& this.saldomesproductoLogic.getSaldoMesProductos().size()>0
					) {
					saldomesproductoAux=this.saldomesproductoLogic.getSaldoMesProductos().get(this.saldomesproductoLogic.getSaldoMesProductos().size() - 1);
				
					if(saldomesproductoAux.getId()<0) {
						this.saldomesproductoLogic.getSaldoMesProductos().remove(saldomesproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSaldoMesProducto && this.saldomesproductos.size()>0) {
					saldomesproductoAux=this.saldomesproductos.get(this.saldomesproductos.size() - 1);
				
					if(saldomesproductoAux.getId()<0) {
						this.saldomesproductos.remove(saldomesproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSaldoMesProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(saldomesproducto.getId()<0) {
				this.saldomesproductoLogic.getSaldoMesProductos().remove(this.saldomesproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(saldomesproducto.getId()<0) {
				this.saldomesproductos.remove(this.saldomesproducto);
			}
		}			
	}
	
	public void setEstadosInicialesSaldoMesProducto(List<SaldoMesProducto> saldomesproductosAux) throws Exception {
		SaldoMesProductoConstantesFunciones.setEstadosInicialesSaldoMesProducto(saldomesproductosAux);
	}
	
	public void setEstadosInicialesSaldoMesProducto(SaldoMesProducto saldomesproductoAux) throws Exception {
		SaldoMesProductoConstantesFunciones.setEstadosInicialesSaldoMesProducto(saldomesproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSaldoMesProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSaldoMesProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSaldoMesProductoActual()) {
				if(!this.isEsNuevoSaldoMesProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSaldoMesProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSaldoMesProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSaldoMesProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Saldo Mes Producto ?", "MANTENIMIENTO DE Saldo Mes Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSaldoMesProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SaldoMesProducto saldomesproducto) throws Exception {
		SaldoMesProductoConstantesFunciones.seleccionarAsignar(this.saldomesproducto,saldomesproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSaldoMesProducto=this.isPermisoActualizarOriginalSaldoMesProducto;
			
			
			this.seleccionarAsignar(saldomesproducto);
			
			

			idProductoActual=saldomesproducto.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SaldoMesProductoConstantesFunciones.quitarEspaciosSaldoMesProducto(this.saldomesproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSaldoMesProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.saldomesproductoSessionBean.setsFuncionBusquedaRapida(this.saldomesproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoSaldoMesProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSaldoMesProducto(esParaCancelar);				
				this.cancelarNuevoSaldoMesProducto(esParaCancelar);								
			}
			
			this.saldomesproducto=new SaldoMesProducto();
			
			this.inicializarSaldoMesProducto();
			
			this.actualizarEstadoCeldasBotonesSaldoMesProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSaldoMesProducto() throws Exception {
		try {
			SaldoMesProductoConstantesFunciones.inicializarSaldoMesProducto(this.saldomesproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.saldomesproductoLogic.getSaldoMesProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSaldoMesProductos(String sAccionBusqueda,List<SaldoMesProducto> saldomesproductosParaReportes) throws Exception {
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
					sPathReporteFinal="SaldoMesProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SaldoMesProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SaldoMesProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SaldoMesProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Saldo Mes Productos");		
		parameters.put("busquedapor", SaldoMesProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSaldoMesProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SaldoMesProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SaldoMesProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSaldoMesProducto=new JRBeanArrayDataSource(SaldoMesProductoJInternalFrame.TraerSaldoMesProductoBeans(saldomesproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSaldoMesProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SaldoMesProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SaldoMesProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SaldoMesProductoBean.TraerSaldoMesProductoBeans(saldomesproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteSaldoMesProductos(sAccionBusqueda,sTipoArchivoReporte,saldomesproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSaldoMesProductos(sAccionBusqueda,sTipoArchivoReporte,saldomesproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSaldoMesProductoActionPerformed(null);
					//this.generarExcelReporteSaldoMesProductos(sAccionBusqueda,sTipoArchivoReporte,saldomesproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSaldoMesProductos(sAccionBusqueda,sTipoArchivoReporte,saldomesproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSaldoMesProductos(sAccionBusqueda,sTipoArchivoReporte,saldomesproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSaldoMesProductos(sAccionBusqueda,sTipoArchivoReporte,saldomesproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSaldoMesProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldoMesProducto> saldomesproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldomesproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldoMesProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldoMesProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SaldoMesProducto saldomesproducto : saldomesproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SaldoMesProductoConstantesFunciones.generarExcelReporteDataSaldoMesProducto("NORMAL",row,workbook,saldomesproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSaldoMesProducto(String sTipo,Row row,Workbook workbook) {
		
		SaldoMesProductoConstantesFunciones.generarExcelReporteHeaderSaldoMesProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSaldoMesProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldoMesProducto> saldomesproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldomesproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldoMesProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SaldoMesProducto saldomesproducto : saldomesproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SaldoMesProductoConstantesFunciones.getSaldoMesProductoDescripcion(saldomesproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldomesproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldomesproducto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldomesproducto.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldomesproducto.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoMesProductoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldomesproducto.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoMesProductoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldomesproducto.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoMesProductoConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldomesproducto.getsaldo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoMesProductoConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldomesproducto.getcosto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSaldoMesProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldoMesProducto> saldomesproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SaldoMesProducto> saldomesproductosRespaldo=null;
		
		classes=SaldoMesProductoConstantesFunciones.getClassesRelationshipsOfSaldoMesProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.saldomesproductoLogic.setDatosCliente(this.datosCliente);
		this.saldomesproductoLogic.setDatosDeep(this.datosDeep);
		this.saldomesproductoLogic.setIsConDeep(true);
		
		saldomesproductosRespaldo=this.saldomesproductoLogic.getSaldoMesProductos();
		
		this.saldomesproductoLogic.setSaldoMesProductos(saldomesproductosParaReportes);	
		this.saldomesproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		saldomesproductosParaReportes=this.saldomesproductoLogic.getSaldoMesProductos();
		this.saldomesproductoLogic.setSaldoMesProductos(saldomesproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldomesproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldoMesProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldoMesProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SaldoMesProducto saldomesproducto : saldomesproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSaldoMesProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SaldoMesProductoConstantesFunciones.generarExcelReporteDataSaldoMesProducto("NORMAL",row,workbook,saldomesproducto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SaldoMesProductoConstantesFunciones.getSaldoMesProductoDescripcion(saldomesproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSaldoMesProducto() throws Exception {		
		this.startProcessSaldoMesProducto(true);
	}
	
	public void startProcessSaldoMesProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSaldoMesProducto ,this.jPanelParametrosReportesSaldoMesProducto, this.jScrollPanelDatosSaldoMesProducto,this.jPanelPaginacionSaldoMesProducto, this.jScrollPanelDatosEdicionSaldoMesProducto, this.jPanelAccionesSaldoMesProducto,this.jPanelAccionesFormularioSaldoMesProducto,this.jmenuBarSaldoMesProducto,this.jmenuBarDetalleSaldoMesProducto,this.jTtoolBarSaldoMesProducto,this.jTtoolBarDetalleSaldoMesProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldoMesProducto=this.jTabbedPaneBusquedasSaldoMesProducto; 
		
		final JPanel jPanelParametrosReportesSaldoMesProducto=this.jPanelParametrosReportesSaldoMesProducto;
		//final JScrollPane jScrollPanelDatosSaldoMesProducto=this.jScrollPanelDatosSaldoMesProducto;
		final JTable jTableDatosSaldoMesProducto=this.jTableDatosSaldoMesProducto;		
		final JPanel jPanelPaginacionSaldoMesProducto=this.jPanelPaginacionSaldoMesProducto;
		//final JScrollPane jScrollPanelDatosEdicionSaldoMesProducto=this.jScrollPanelDatosEdicionSaldoMesProducto;
		final JPanel jPanelAccionesSaldoMesProducto=this.jPanelAccionesSaldoMesProducto;
		
		JPanel jPanelCamposAuxiliarSaldoMesProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSaldoMesProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			jPanelCamposAuxiliarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jPanelCamposSaldoMesProducto;
			jPanelAccionesFormularioAuxiliarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jPanelAccionesFormularioSaldoMesProducto;
		}
		
		final JPanel jPanelCamposSaldoMesProducto=jPanelCamposAuxiliarSaldoMesProducto;
		final JPanel jPanelAccionesFormularioSaldoMesProducto=jPanelAccionesFormularioAuxiliarSaldoMesProducto;
		
		
		final JMenuBar jmenuBarSaldoMesProducto=this.jmenuBarSaldoMesProducto;
		final JToolBar jTtoolBarSaldoMesProducto=this.jTtoolBarSaldoMesProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSaldoMesProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldoMesProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			jmenuBarDetalleAuxiliarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jmenuBarDetalleSaldoMesProducto;
			jTtoolBarDetalleAuxiliarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jTtoolBarDetalleSaldoMesProducto;
		}
		
		final JMenuBar jmenuBarDetalleSaldoMesProducto=jmenuBarDetalleAuxiliarSaldoMesProducto;
		final JToolBar jTtoolBarDetalleSaldoMesProducto=jTtoolBarDetalleAuxiliarSaldoMesProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldoMesProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldoMesProducto;
			processRunnable.jTableDatos=jTableDatosSaldoMesProducto;
			processRunnable.jPanelCampos=jPanelCamposSaldoMesProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldoMesProducto;
			processRunnable.jPanelAcciones=jPanelAccionesSaldoMesProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldoMesProducto;
			
			
			processRunnable.jmenuBar=jmenuBarSaldoMesProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldoMesProducto;
			processRunnable.jTtoolBar=jTtoolBarSaldoMesProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldoMesProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldoMesProducto ,jPanelParametrosReportesSaldoMesProducto,jTableDatosSaldoMesProducto, /*jScrollPanelDatosSaldoMesProducto,*/jPanelCamposSaldoMesProducto,jPanelPaginacionSaldoMesProducto, /*jScrollPanelDatosEdicionSaldoMesProducto,*/ jPanelAccionesSaldoMesProducto,jPanelAccionesFormularioSaldoMesProducto,jmenuBarSaldoMesProducto,jmenuBarDetalleSaldoMesProducto,jTtoolBarSaldoMesProducto,jTtoolBarDetalleSaldoMesProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldoMesProducto ,jPanelParametrosReportesSaldoMesProducto, jScrollPanelDatosSaldoMesProducto,jPanelPaginacionSaldoMesProducto, jScrollPanelDatosEdicionSaldoMesProducto, jPanelAccionesSaldoMesProducto,jPanelAccionesFormularioSaldoMesProducto,jmenuBarSaldoMesProducto,jmenuBarDetalleSaldoMesProducto,jTtoolBarSaldoMesProducto,jTtoolBarDetalleSaldoMesProducto);
						
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
	
	public void finishProcessSaldoMesProducto() {// throws Exception 
		this.finishProcessSaldoMesProducto(true);
	}
	
	public void finishProcessSaldoMesProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSaldoMesProducto ,this.jPanelParametrosReportesSaldoMesProducto, this.jScrollPanelDatosSaldoMesProducto,this.jPanelPaginacionSaldoMesProducto, this.jScrollPanelDatosEdicionSaldoMesProducto, this.jPanelAccionesSaldoMesProducto,this.jPanelAccionesFormularioSaldoMesProducto,this.jmenuBarSaldoMesProducto,this.jmenuBarDetalleSaldoMesProducto,this.jTtoolBarSaldoMesProducto,this.jTtoolBarDetalleSaldoMesProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldoMesProducto=this.jTabbedPaneBusquedasSaldoMesProducto; 
		
		final JPanel jPanelParametrosReportesSaldoMesProducto=this.jPanelParametrosReportesSaldoMesProducto;
		//final JScrollPane jScrollPanelDatosSaldoMesProducto=this.jScrollPanelDatosSaldoMesProducto;
		final JTable jTableDatosSaldoMesProducto=this.jTableDatosSaldoMesProducto;		
		final JPanel jPanelPaginacionSaldoMesProducto=this.jPanelPaginacionSaldoMesProducto;
		//final JScrollPane jScrollPanelDatosEdicionSaldoMesProducto=this.jScrollPanelDatosEdicionSaldoMesProducto;
		final JPanel jPanelAccionesSaldoMesProducto=this.jPanelAccionesSaldoMesProducto;
		
		JPanel jPanelCamposAuxiliarSaldoMesProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSaldoMesProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			jPanelCamposAuxiliarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jPanelCamposSaldoMesProducto;
			jPanelAccionesFormularioAuxiliarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jPanelAccionesFormularioSaldoMesProducto;
		}
		
		final JPanel jPanelCamposSaldoMesProducto=jPanelCamposAuxiliarSaldoMesProducto;
		final JPanel jPanelAccionesFormularioSaldoMesProducto=jPanelAccionesFormularioAuxiliarSaldoMesProducto;
		
		
		final JMenuBar jmenuBarSaldoMesProducto=this.jmenuBarSaldoMesProducto;		
		final JToolBar jTtoolBarSaldoMesProducto=this.jTtoolBarSaldoMesProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarSaldoMesProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldoMesProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			jmenuBarDetalleAuxiliarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jmenuBarDetalleSaldoMesProducto;
			jTtoolBarDetalleAuxiliarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jTtoolBarDetalleSaldoMesProducto;		
		}
		
		final JMenuBar jmenuBarDetalleSaldoMesProducto=jmenuBarDetalleAuxiliarSaldoMesProducto;
		final JToolBar jTtoolBarDetalleSaldoMesProducto=jTtoolBarDetalleAuxiliarSaldoMesProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldoMesProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldoMesProducto;
			processRunnable.jTableDatos=jTableDatosSaldoMesProducto;
			processRunnable.jPanelCampos=jPanelCamposSaldoMesProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldoMesProducto;
			processRunnable.jPanelAcciones=jPanelAccionesSaldoMesProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldoMesProducto;
			
			
			processRunnable.jmenuBar=jmenuBarSaldoMesProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldoMesProducto;
			processRunnable.jTtoolBar=jTtoolBarSaldoMesProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldoMesProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSaldoMesProducto ,jPanelParametrosReportesSaldoMesProducto, jTableDatosSaldoMesProducto,/*jScrollPanelDatosSaldoMesProducto,*/jPanelCamposSaldoMesProducto,jPanelPaginacionSaldoMesProducto, /*jScrollPanelDatosEdicionSaldoMesProducto,*/ jPanelAccionesSaldoMesProducto,jPanelAccionesFormularioSaldoMesProducto,jmenuBarSaldoMesProducto,jmenuBarDetalleSaldoMesProducto,jTtoolBarSaldoMesProducto,jTtoolBarDetalleSaldoMesProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSaldoMesProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSaldoMesProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSaldoMesProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSaldoMesProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSaldoMesProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSaldoMesProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSaldoMesProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSaldoMesProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSaldoMesProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.saldomesproductoConstantesFunciones.getsFinalQuerySaldoMesProducto();
		String  finalQueryPaginacionTodos=this.saldomesproductoConstantesFunciones.getsFinalQuerySaldoMesProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SaldoMesProductoConstantesFunciones.getArrayColumnasGlobalesNoSaldoMesProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SaldoMesProductoConstantesFunciones.getArrayColumnasGlobalesSaldoMesProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SaldoMesProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.saldomesproductosEliminados= new ArrayList<SaldoMesProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSaldoMesProducto();
		
				///*SaldoMesProductoSessionBean*/this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
			
			if(this.saldomesproductoSessionBean==null) {
				this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
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
					this.iNumeroPaginacion=SaldoMesProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SaldoMesProductoConstantesFunciones.getClassesForeignKeysOfSaldoMesProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/saldomesproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			saldomesproductosAux= new ArrayList<SaldoMesProducto>();
			
				
			saldomesproductoLogic.setDatosCliente(this.datosCliente);
			saldomesproductoLogic.setDatosDeep(this.datosDeep);
			saldomesproductoLogic.setIsConDeep(true);
			
			
			saldomesproductoLogic.getSaldoMesProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					saldomesproductoLogic.getTodosSaldoMesProductos(finalQueryGlobal,pagination);
					
					//saldomesproductoLogic.getTodosSaldoMesProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(saldomesproductoLogic.getSaldoMesProductos()==null|| saldomesproductoLogic.getSaldoMesProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							saldomesproductosAux= new ArrayList<SaldoMesProducto>();
							saldomesproductosAux.addAll(saldomesproductoLogic.getSaldoMesProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductosAux= new ArrayList<SaldoMesProducto>();
							saldomesproductosAux.addAll(saldomesproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							saldomesproductoLogic.getTodosSaldoMesProductos(finalQueryGlobal+"",this.pagination);												
							
							//saldomesproductoLogic.getTodosSaldoMesProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSaldoMesProductos("Todos",saldomesproductoLogic.getSaldoMesProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							saldomesproductoLogic.setSaldoMesProductos(new ArrayList<SaldoMesProducto>());					
							saldomesproductoLogic.getSaldoMesProductos().addAll(saldomesproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductos=new ArrayList<SaldoMesProducto>();
							saldomesproductos.addAll(saldomesproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSaldoMesProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSaldoMesProducto=this.idActual;
				
				} else if(this.idSaldoMesProductoActual!=null && this.idSaldoMesProductoActual!=0L) {
					idSaldoMesProducto=idSaldoMesProductoActual;
				}
				
					
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndicePorId(idSaldoMesProducto);
				
				this.saldomesproductos=new ArrayList<SaldoMesProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					saldomesproductoLogic.getEntity(idSaldoMesProducto);
					
					//saldomesproductoLogic.getEntityWithConnection(idSaldoMesProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldomesproductoLogic.setSaldoMesProductos(new ArrayList<SaldoMesProducto>());
					saldomesproductoLogic.getSaldoMesProductos().add(saldomesproductoLogic.getSaldoMesProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldomesproductos=new ArrayList<SaldoMesProducto>();
					this.saldomesproductos.add(saldomesproducto);
				}
				
				if(saldomesproductoLogic.getSaldoMesProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldomesproductoLogic.getSaldoMesProductosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldomesproductoLogic.getSaldoMesProductos()==null||saldomesproductoLogic.getSaldoMesProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldomesproductos==null|| saldomesproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductosAux=new ArrayList<SaldoMesProducto>();
						saldomesproductosAux.addAll(saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductosAux=new ArrayList<SaldoMesProducto>();
							saldomesproductosAux.addAll(saldomesproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldomesproductoLogic.getSaldoMesProductosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoMesProductos("FK_IdAnio",saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoMesProductos("FK_IdAnio",saldomesproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoLogic.setSaldoMesProductos(new ArrayList<SaldoMesProducto>());
						saldomesproductoLogic.getSaldoMesProductos().addAll(saldomesproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductos=new ArrayList<SaldoMesProducto>();
							saldomesproductos.addAll(saldomesproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldomesproductoLogic.getSaldoMesProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldomesproductoLogic.getSaldoMesProductos()==null||saldomesproductoLogic.getSaldoMesProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldomesproductos==null|| saldomesproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductosAux=new ArrayList<SaldoMesProducto>();
						saldomesproductosAux.addAll(saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductosAux=new ArrayList<SaldoMesProducto>();
							saldomesproductosAux.addAll(saldomesproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldomesproductoLogic.getSaldoMesProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoMesProductos("FK_IdBodega",saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoMesProductos("FK_IdBodega",saldomesproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoLogic.setSaldoMesProductos(new ArrayList<SaldoMesProducto>());
						saldomesproductoLogic.getSaldoMesProductos().addAll(saldomesproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductos=new ArrayList<SaldoMesProducto>();
							saldomesproductos.addAll(saldomesproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldomesproductoLogic.getSaldoMesProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldomesproductoLogic.getSaldoMesProductos()==null||saldomesproductoLogic.getSaldoMesProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldomesproductos==null|| saldomesproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductosAux=new ArrayList<SaldoMesProducto>();
						saldomesproductosAux.addAll(saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductosAux=new ArrayList<SaldoMesProducto>();
							saldomesproductosAux.addAll(saldomesproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldomesproductoLogic.getSaldoMesProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoMesProductos("FK_IdEmpresa",saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoMesProductos("FK_IdEmpresa",saldomesproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoLogic.setSaldoMesProductos(new ArrayList<SaldoMesProducto>());
						saldomesproductoLogic.getSaldoMesProductos().addAll(saldomesproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductos=new ArrayList<SaldoMesProducto>();
							saldomesproductos.addAll(saldomesproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldomesproductoLogic.getSaldoMesProductosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldomesproductoLogic.getSaldoMesProductos()==null||saldomesproductoLogic.getSaldoMesProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldomesproductos==null|| saldomesproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductosAux=new ArrayList<SaldoMesProducto>();
						saldomesproductosAux.addAll(saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductosAux=new ArrayList<SaldoMesProducto>();
							saldomesproductosAux.addAll(saldomesproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldomesproductoLogic.getSaldoMesProductosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoMesProductos("FK_IdMes",saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoMesProductos("FK_IdMes",saldomesproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoLogic.setSaldoMesProductos(new ArrayList<SaldoMesProducto>());
						saldomesproductoLogic.getSaldoMesProductos().addAll(saldomesproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductos=new ArrayList<SaldoMesProducto>();
							saldomesproductos.addAll(saldomesproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldomesproductoLogic.getSaldoMesProductosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldomesproductoLogic.getSaldoMesProductos()==null||saldomesproductoLogic.getSaldoMesProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldomesproductos==null|| saldomesproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductosAux=new ArrayList<SaldoMesProducto>();
						saldomesproductosAux.addAll(saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductosAux=new ArrayList<SaldoMesProducto>();
							saldomesproductosAux.addAll(saldomesproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldomesproductoLogic.getSaldoMesProductosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoMesProductos("FK_IdProducto",saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoMesProductos("FK_IdProducto",saldomesproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoLogic.setSaldoMesProductos(new ArrayList<SaldoMesProducto>());
						saldomesproductoLogic.getSaldoMesProductos().addAll(saldomesproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductos=new ArrayList<SaldoMesProducto>();
							saldomesproductos.addAll(saldomesproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldomesproductoLogic.getSaldoMesProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldomesproductoLogic.getSaldoMesProductos()==null||saldomesproductoLogic.getSaldoMesProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldomesproductos==null|| saldomesproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductosAux=new ArrayList<SaldoMesProducto>();
						saldomesproductosAux.addAll(saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductosAux=new ArrayList<SaldoMesProducto>();
							saldomesproductosAux.addAll(saldomesproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldomesproductoLogic.getSaldoMesProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoMesProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoMesProductos("FK_IdSucursal",saldomesproductoLogic.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoMesProductos("FK_IdSucursal",saldomesproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoLogic.setSaldoMesProductos(new ArrayList<SaldoMesProducto>());
						saldomesproductoLogic.getSaldoMesProductos().addAll(saldomesproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductos=new ArrayList<SaldoMesProducto>();
							saldomesproductos.addAll(saldomesproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSaldoMesProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSaldoMesProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldomesproductoLogic.getSaldoMesProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldomesproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldomesproductoLogic.getSaldoMesProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldomesproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SaldoMesProducto saldomesproducto) {
		Boolean permite=true;
		
		if(this.saldomesproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SaldoMesProductoConstantesFunciones.getOrderByListaSaldoMesProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SaldoMesProductoConstantesFunciones.getOrderByListaSaldoMesProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoMesProducto saldomesproducto:saldomesproductoLogic.getSaldoMesProductos()) {
				if(saldomesproducto.getsType().equals(Constantes2.S_TOTALES)) {
					saldomesproductoTotales=saldomesproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoMesProducto saldomesproducto:this.saldomesproductos) {
				if(saldomesproducto.getsType().equals(Constantes2.S_TOTALES)) {
					saldomesproductoTotales=saldomesproducto;
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
			this.saldomesproductoAux=new SaldoMesProducto();
			this.saldomesproductoAux.setsType(Constantes2.S_TOTALES);
			this.saldomesproductoAux.setIsNew(false);
			this.saldomesproductoAux.setIsChanged(false);
			this.saldomesproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SaldoMesProductoConstantesFunciones.TotalizarValoresFilaSaldoMesProducto(this.saldomesproductoLogic.getSaldoMesProductos(),this.saldomesproductoAux);
				
				this.saldomesproductoLogic.getSaldoMesProductos().add(this.saldomesproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SaldoMesProductoConstantesFunciones.TotalizarValoresFilaSaldoMesProducto(this.saldomesproductos,this.saldomesproductoAux);
				
				this.saldomesproductos.add(this.saldomesproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		saldomesproductoTotales=new SaldoMesProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldomesproductoLogic.getSaldoMesProductos().remove(saldomesproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldomesproductos.remove(saldomesproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		saldomesproductoTotales=new SaldoMesProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoMesProducto saldomesproducto:saldomesproductoLogic.getSaldoMesProductos()) {
				if(saldomesproducto.getsType().equals(Constantes2.S_TOTALES)) {
					saldomesproductoTotales=saldomesproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldoMesProductoConstantesFunciones.TotalizarValoresFilaSaldoMesProducto(this.saldomesproductoLogic.getSaldoMesProductos(),saldomesproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoMesProducto saldomesproducto:this.saldomesproductos) {
				if(saldomesproducto.getsType().equals(Constantes2.S_TOTALES)) {
					saldomesproductoTotales=saldomesproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldoMesProductoConstantesFunciones.TotalizarValoresFilaSaldoMesProducto(this.saldomesproductos,saldomesproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSaldoMesProductosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoMesProductosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoMesProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoMesProductosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoMesProductosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoMesProductosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSaldoMesProductosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldomesproductoLogic.getSaldoMesProductosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoMesProductosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldomesproductoLogic.getSaldoMesProductosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoMesProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldomesproductoLogic.getSaldoMesProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoMesProductosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldomesproductoLogic.getSaldoMesProductosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoMesProductosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldomesproductoLogic.getSaldoMesProductosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoMesProductosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldomesproductoLogic.getSaldoMesProductosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosSaldoMesProducto() {
		this.isPermisoTodoSaldoMesProducto=false;
		this.isPermisoNuevoSaldoMesProducto=false;
		this.isPermisoActualizarSaldoMesProducto=false;
		this.isPermisoActualizarOriginalSaldoMesProducto=false;
		this.isPermisoEliminarSaldoMesProducto=false;
		this.isPermisoGuardarCambiosSaldoMesProducto=false;
		this.isPermisoConsultaSaldoMesProducto=false;
		this.isPermisoBusquedaSaldoMesProducto=false;
		this.isPermisoReporteSaldoMesProducto=false;		
		this.isPermisoOrdenSaldoMesProducto=false;		
		this.isPermisoPaginacionMedioSaldoMesProducto=false;		
		this.isPermisoPaginacionAltoSaldoMesProducto=false;
		this.isPermisoPaginacionTodoSaldoMesProducto=false;
		this.isPermisoCopiarSaldoMesProducto=false;		
		this.isPermisoVerFormSaldoMesProducto=false;		
		this.isPermisoDuplicarSaldoMesProducto=false;		
		this.isPermisoOrdenSaldoMesProducto=false;		
	}
	
	public void setPermisosUsuarioSaldoMesProducto(Boolean isPermiso) {
		this.isPermisoTodoSaldoMesProducto=isPermiso;
		this.isPermisoNuevoSaldoMesProducto=isPermiso;
		this.isPermisoActualizarSaldoMesProducto=isPermiso;
		this.isPermisoActualizarOriginalSaldoMesProducto=isPermiso;
		this.isPermisoEliminarSaldoMesProducto=isPermiso;
		this.isPermisoGuardarCambiosSaldoMesProducto=isPermiso;
		this.isPermisoConsultaSaldoMesProducto=isPermiso;
		this.isPermisoBusquedaSaldoMesProducto=isPermiso;
		this.isPermisoReporteSaldoMesProducto=isPermiso;
		this.isPermisoOrdenSaldoMesProducto=isPermiso;		
		this.isPermisoPaginacionMedioSaldoMesProducto=isPermiso;		
		this.isPermisoPaginacionAltoSaldoMesProducto=isPermiso;		
		this.isPermisoPaginacionTodoSaldoMesProducto=isPermiso;		
		this.isPermisoCopiarSaldoMesProducto=isPermiso;		
		this.isPermisoVerFormSaldoMesProducto=isPermiso;		
		this.isPermisoDuplicarSaldoMesProducto=isPermiso;
		this.isPermisoOrdenSaldoMesProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSaldoMesProducto(Boolean isPermiso) {
		//this.isPermisoTodoSaldoMesProducto=isPermiso;
		this.isPermisoNuevoSaldoMesProducto=isPermiso;
		this.isPermisoActualizarSaldoMesProducto=isPermiso;
		this.isPermisoActualizarOriginalSaldoMesProducto=isPermiso;
		this.isPermisoEliminarSaldoMesProducto=isPermiso;
		this.isPermisoGuardarCambiosSaldoMesProducto=isPermiso;
		//this.isPermisoConsultaSaldoMesProducto=isPermiso;
		//this.isPermisoBusquedaSaldoMesProducto=isPermiso;
		//this.isPermisoReporteSaldoMesProducto=isPermiso;
		//this.isPermisoOrdenSaldoMesProducto=isPermiso;		
		//this.isPermisoPaginacionMedioSaldoMesProducto=isPermiso;		
		//this.isPermisoPaginacionAltoSaldoMesProducto=isPermiso;		
		//this.isPermisoPaginacionTodoSaldoMesProducto=isPermiso;		
		//this.isPermisoCopiarSaldoMesProducto=isPermiso;		
		//this.isPermisoDuplicarSaldoMesProducto=isPermiso;
		//this.isPermisoOrdenSaldoMesProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSaldoMesProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SaldoMesProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSaldoMesProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSaldoMesProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSaldoMesProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSaldoMesProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSaldoMesProductoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSaldoMesProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SaldoMesProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SaldoMesProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSaldoMesProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSaldoMesProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSaldoMesProducto=this.isPermisoActualizarSaldoMesProducto;
			this.isPermisoEliminarSaldoMesProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSaldoMesProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSaldoMesProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSaldoMesProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSaldoMesProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSaldoMesProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldoMesProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSaldoMesProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSaldoMesProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSaldoMesProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSaldoMesProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSaldoMesProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSaldoMesProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldoMesProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSaldoMesProducto.setToolTipText(this.jTableDatosSaldoMesProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSaldoMesProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSaldoMesProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SaldoMesProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SaldoMesProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSaldoMesProducto() throws Exception {
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
	public void inicializarCombosForeignKeySaldoMesProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySaldoMesProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SaldoMesProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySaldoMesProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeySaldoMesProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SaldoMesProductoParameterReturnGeneral saldomesproductoReturnGeneral=new SaldoMesProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.saldomesproductoConstantesFunciones.cargarid_empresaSaldoMesProducto)
					 || (this.esRecargarFks && this.saldomesproductoConstantesFunciones.cargarid_empresaSaldoMesProducto)) {

					if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+saldomesproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.saldomesproductoConstantesFunciones.cargarid_sucursalSaldoMesProducto)
					 || (this.esRecargarFks && this.saldomesproductoConstantesFunciones.cargarid_sucursalSaldoMesProducto)) {

					if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+saldomesproductoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.saldomesproductoConstantesFunciones.cargarid_bodegaSaldoMesProducto)
					 || (this.esRecargarFks && this.saldomesproductoConstantesFunciones.cargarid_bodegaSaldoMesProducto)) {

					if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+saldomesproductoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.saldomesproductoConstantesFunciones.cargarid_productoSaldoMesProducto)
					 || (this.esRecargarFks && this.saldomesproductoConstantesFunciones.cargarid_productoSaldoMesProducto)) {

					if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+saldomesproductoSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.saldomesproductoConstantesFunciones.cargarid_anioSaldoMesProducto)
					 || (this.esRecargarFks && this.saldomesproductoConstantesFunciones.cargarid_anioSaldoMesProducto)) {

					if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+saldomesproductoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.saldomesproductoConstantesFunciones.cargarid_mesSaldoMesProducto)
					 || (this.esRecargarFks && this.saldomesproductoConstantesFunciones.cargarid_mesSaldoMesProducto)) {

					if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+saldomesproductoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				saldomesproductoReturnGeneral=saldomesproductoLogic.cargarCombosLoteForeignKeySaldoMesProducto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=saldomesproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=saldomesproductoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=saldomesproductoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=saldomesproductoReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=saldomesproductoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=saldomesproductoReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySaldoMesProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.saldomesproductoSessionBean==null) {
				this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
			}

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.saldomesproductoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySaldoMesProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySaldoMesProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySaldoMesProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldoMesProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySaldoMesProducto(SaldoMesProducto saldomesproducto)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(saldomesproducto.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(saldomesproducto.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySaldoMesProducto(SaldoMesProducto saldomesproducto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(saldomesproducto.getProducto()!=null && !sTipoEvento.equals("id_productoSaldoMesProducto")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(saldomesproducto.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySaldoMesProducto()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.saldomesproductoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.saldomesproductoConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySaldoMesProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySaldoMesProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySaldoMesProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSaldoMesProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySaldoMesProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySaldoMesProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySaldoMesProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public SaldoMesProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SaldoMesProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SaldoMesProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean(); 
		this.saldomesproductoConstantesFunciones=new SaldoMesProductoConstantesFunciones(); 
		this.saldomesproductoBean=new SaldoMesProducto();//(this.saldomesproductoConstantesFunciones); 		
		this.saldomesproductoReturnGeneral=new SaldoMesProductoParameterReturnGeneral(); 
		
		this.saldomesproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldomesproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SaldoMesProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SaldoMesProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SaldoMesProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSaldoMesProducto(true);
			
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
			
			this.saldomesproductoConstantesFunciones=new SaldoMesProductoConstantesFunciones(); 
			this.saldomesproductoBean=new SaldoMesProducto();//this.saldomesproductoConstantesFunciones); 			
			this.saldomesproductoReturnGeneral=new SaldoMesProductoParameterReturnGeneral(); 
		
			SaldoMesProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldo Mes Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.saldomesproducto=new SaldoMesProducto();
			this.saldomesproductos = new ArrayList<SaldoMesProducto>();
			this.saldomesproductosAux = new ArrayList<SaldoMesProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic=new SaldoMesProductoLogic();
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.saldomesproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.saldomesproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSaldoMesProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSaldoMesProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldoMesProducto);	
					}
					
					if(this.jInternalFrameImportacionSaldoMesProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldoMesProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySaldoMesProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySaldoMesProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldoMesProducto);
				this.jInternalFrameDetalleFormSaldoMesProducto.setVisible(false);
				this.jInternalFrameDetalleFormSaldoMesProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldoMesProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldoMesProducto);
					this.jInternalFrameReporteDinamicoSaldoMesProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoSaldoMesProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSaldoMesProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSaldoMesProducto);
					this.jInternalFrameImportacionSaldoMesProducto.setVisible(false);
					this.jInternalFrameImportacionSaldoMesProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySaldoMesProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySaldoMesProducto);
					this.jInternalFrameOrderBySaldoMesProducto.setVisible(false);
					this.jInternalFrameOrderBySaldoMesProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSaldoMesProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SaldoMesProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.saldomesproductoReturnGeneral=new SaldoMesProductoParameterReturnGeneral();
			
			this.saldomesproductoParameterGeneral=new SaldoMesProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.saldomesproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SaldoMesProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldoMesProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldomesproductoSessionBean.getEsGuardarRelacionado(),this.saldomesproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldoMesProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldomesproductoSessionBean.getEsGuardarRelacionado(),this.saldomesproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSaldoMesProducto=false;
			this.isVisibilidadCeldaDuplicarSaldoMesProducto=true;
			this.isVisibilidadCeldaCopiarSaldoMesProducto=true;
			this.isVisibilidadCeldaVerFormSaldoMesProducto=true;
			this.isVisibilidadCeldaOrdenSaldoMesProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;
			this.isVisibilidadCeldaModificarSaldoMesProducto=false;
			this.isVisibilidadCeldaActualizarSaldoMesProducto=false;
			this.isVisibilidadCeldaEliminarSaldoMesProducto=false;
			this.isVisibilidadCeldaCancelarSaldoMesProducto=false;
			this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSaldoMesProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSaldoMesProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSaldoMesProducto(false);
			
			this.setPermisosUsuarioSaldoMesProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.saldomesproductoSessionBean.getEsGuardarRelacionado() && this.saldomesproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSaldoMesProductoClasesRelacionadas();
			}
			
			if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSaldoMesProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSaldoMesProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSaldoMesProducto();
			}
			
			if(!this.isPermisoBusquedaSaldoMesProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSaldoMesProducto,this.isPermisoPaginacionMedioSaldoMesProducto,this.isPermisoPaginacionTodoSaldoMesProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SaldoMesProductoConstantesFunciones.getTiposSeleccionarSaldoMesProducto());
				
				this.tiposColumnasSelect=SaldoMesProductoConstantesFunciones.getTiposSeleccionarSaldoMesProducto(true);
				
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
			//if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSaldoMesProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioSaldoMesProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioSaldoMesProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldoMesProducto() ;
			
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
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				saldomesproductoImplementable= (SaldoMesProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldoMesProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				saldomesproductoImplementableHome= (SaldoMesProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldoMesProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.saldomesproductos= new ArrayList<SaldoMesProducto>();
			this.saldomesproductosEliminados= new ArrayList<SaldoMesProducto>();
						
			this.isEsNuevoSaldoMesProducto=false;
			this.esParaAccionDesdeFormularioSaldoMesProducto=false;
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
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySaldoMesProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSaldoMesProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SaldoMesProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SaldoMesProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSaldoMesProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSaldoMesProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSaldoMesProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSaldoMesProducto();
			}
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSaldoMesProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSaldoMesProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSaldoMesProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSaldoMesProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SaldoMesProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSaldoMesProducto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSaldoMesProducto")) {
				iIndex=this.jInternalFrameDetalleFormSaldoMesProducto.jTabbedPaneRelacionesSaldoMesProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSaldoMesProducto.jTabbedPaneRelacionesSaldoMesProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSaldoMesProducto();	
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
	
	public void cargarCombosForeignKeySaldoMesProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySaldoMesProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySaldoMesProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySaldoMesProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySaldoMesProducto();
		
		this.cargarCombosFrameForeignKeySaldoMesProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySaldoMesProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySaldoMesProducto();
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

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSaldoMesProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
			
			if(jTableDatosSaldoMesProducto.getRowCount()>=1) {
				jTableDatosSaldoMesProducto.removeRowSelectionInterval(0, jTableDatosSaldoMesProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoSaldoMesProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSaldoMesProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSaldoMesProducto(true);			
			//this.saldomesproducto=new SaldoMesProducto();
			//this.saldomesproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldoMesProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldoMesProducto() ;
			
			if(SaldoMesProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldoMesProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.saldomesproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);				
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
			if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SaldoMesProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSaldoMesProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSaldoMesProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSaldoMesProducto.getSelectedRows().length;			
			}
			
			saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSaldoMesProducto--;			
				//SaldoMesProducto saldomesproductoAux= new SaldoMesProducto();			
				//saldomesproductoAux.setId(this.iIdNuevoSaldoMesProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SaldoMesProducto saldomesproductoOrigen=new SaldoMesProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SaldoMesProducto saldomesproductoOrigen : saldomesproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							saldomesproductoOrigen =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldomesproductoOrigen =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSaldoMesProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.saldomesproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSaldoMesProducto(saldomesproductoOrigen,this.saldomesproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldomesproductoLogic.getSaldoMesProductos().add(this.saldomesproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldomesproductos.add(this.saldomesproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSaldoMesProducto(false);
				
				this.jTableDatosSaldoMesProducto.setRowSelectionInterval(this.getIndiceNuevoSaldoMesProducto(), this.getIndiceNuevoSaldoMesProducto());
				
				int iLastRow =  this.jTableDatosSaldoMesProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldoMesProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldoMesProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldoMesProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();									
		
			SaldoMesProducto saldomesproductoOrigen=new SaldoMesProducto();
			SaldoMesProducto saldomesproductoDestino=new SaldoMesProducto();
				
			saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSaldoMesProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || saldomesproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSaldoMesProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoOrigen =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldomesproductoOrigen =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldomesproductoDestino =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldomesproductoDestino =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				saldomesproductoOrigen =saldomesproductosSeleccionados.get(0);
				saldomesproductoDestino =saldomesproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSaldoMesProducto(saldomesproductoOrigen,saldomesproductoDestino,true,false);
				
				saldomesproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(saldomesproductoDestino,saldomesproductoLogic.getSaldoMesProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldomesproductoDestino,saldomesproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSaldoMesProducto(false);
				
				//this.jTableDatosSaldoMesProducto.setRowSelectionInterval(this.getIndiceNuevoSaldoMesProducto(), this.getIndiceNuevoSaldoMesProducto());
				
				int iLastRow =  this.jTableDatosSaldoMesProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldoMesProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldoMesProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldoMesProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSaldoMesProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSaldoMesProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSaldoMesProducto.setVisible(!isVisible);
			this.jPanelPaginacionSaldoMesProducto.setVisible(!isVisible);
			this.jPanelAccionesSaldoMesProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSaldoMesProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSaldoMesProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSaldoMesProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySaldoMesProducto();
			
			this.abrirFrameOrderBySaldoMesProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySaldoMesProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSaldoMesProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldoMesProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSaldoMesProducto.isMaximum()) {
					this.jInternalFrameDetalleFormSaldoMesProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSaldoMesProducto.setSize(this.jInternalFrameDetalleFormSaldoMesProducto.iWidthFormulario,this.jInternalFrameDetalleFormSaldoMesProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSaldoMesProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSaldoMesProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSaldoMesProducto.isMaximum()) {
						this.jInternalFrameDetalleFormSaldoMesProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSaldoMesProducto.jContentPaneDetalleSaldoMesProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSaldoMesProducto.jTabbedPaneRelacionesSaldoMesProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSaldoMesProducto.jContentPaneDetalleSaldoMesProducto.getWidth(),SaldoMesProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldoMesProducto.jTabbedPaneRelacionesSaldoMesProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSaldoMesProducto.jContentPaneDetalleSaldoMesProducto.getWidth(),SaldoMesProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldoMesProducto.jTabbedPaneRelacionesSaldoMesProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSaldoMesProducto.jContentPaneDetalleSaldoMesProducto.getWidth(),SaldoMesProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSaldoMesProducto.setVisible(true);
	        this.jInternalFrameDetalleFormSaldoMesProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySaldoMesProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySaldoMesProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySaldoMesProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldoMesProducto,false,this);
				} else {
					this.jInternalFrameOrderBySaldoMesProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldoMesProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySaldoMesProducto);
				this.jInternalFrameOrderBySaldoMesProducto.setVisible(false);
				this.jInternalFrameOrderBySaldoMesProducto.setSelected(false);
				
				this.jInternalFrameOrderBySaldoMesProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldoMesProducto"));
				
				this.inicializarActualizarBindingTablaOrderBySaldoMesProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSaldoMesProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSaldoMesProducto==null) {
				
				this.jInternalFrameImportacionSaldoMesProducto=new ImportacionJInternalFrame(SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldoMesProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSaldoMesProducto);
				this.jInternalFrameImportacionSaldoMesProducto.setVisible(false);
				this.jInternalFrameImportacionSaldoMesProducto.setSelected(false);


				this.jInternalFrameImportacionSaldoMesProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldoMesProducto"));
				this.jInternalFrameImportacionSaldoMesProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldoMesProducto"));
				this.jInternalFrameImportacionSaldoMesProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldoMesProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSaldoMesProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSaldoMesProducto==null) {
				this.jInternalFrameReporteDinamicoSaldoMesProducto=new ReporteDinamicoJInternalFrame(SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldoMesProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldoMesProducto);
				this.jInternalFrameReporteDinamicoSaldoMesProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoSaldoMesProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSaldoMesProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldoMesProducto"));
				this.jInternalFrameReporteDinamicoSaldoMesProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldoMesProducto"));
				this.jInternalFrameReporteDinamicoSaldoMesProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldoMesProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldoMesProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSaldoMesProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldoMesProducto);
			
	       	this.jInternalFrameDetalleFormSaldoMesProducto.setVisible(false);
	        this.jInternalFrameDetalleFormSaldoMesProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormSaldoMesProducto.dispose();
			//this.jInternalFrameDetalleFormSaldoMesProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSaldoMesProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSaldoMesProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoSaldoMesProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSaldoMesProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSaldoMesProducto.setVisible(true);
	        this.jInternalFrameImportacionSaldoMesProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySaldoMesProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySaldoMesProducto.setVisible(true);
	        this.jInternalFrameOrderBySaldoMesProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySaldoMesProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySaldoMesProducto.setVisible(false);
	        this.jInternalFrameOrderBySaldoMesProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSaldoMesProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSaldoMesProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoSaldoMesProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSaldoMesProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSaldoMesProducto.setVisible(false);
	        this.jInternalFrameImportacionSaldoMesProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSaldoMesProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSaldoMesProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSaldoMesProducto(true);
			//this.isEsNuevoSaldoMesProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSaldoMesProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldoMesProducto(false) ;
			
			if(saldomesproductoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SaldoMesProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldoMesProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldoMesProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSaldoMesProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSaldoMesProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSaldoMesProducto(true);
			//this.isEsNuevoSaldoMesProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.saldomesproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSaldoMesProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSaldoMesProducto(false) ;
			
			if(SaldoMesProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldoMesProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldoMesProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.saldomesproductoConstantesFunciones.cargarid_productoSaldoMesProducto) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingSaldoMesProducto(false,false);
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
		TableColumn tableColumnBodega=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldoMesProducto.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldoMesProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldoMesProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldoMesProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSaldoMesProducto(false);
			
			//if(!this.isEsNuevoSaldoMesProducto) {								
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				
			}
			
			if(this.permiteMantenimiento(this.saldomesproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSaldoMesProducto=true;
					this.inicializarActualizarBindingTablaSaldoMesProducto(false);
					this.isEsNuevoSaldoMesProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSaldoMesProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSaldoMesProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldoMesProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldoMesProducto(false);
				
				this.habilitarDeshabilitarControlesSaldoMesProducto(false);
			
												
				
				if(SaldoMesProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSaldoMesProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSaldoMesProductoActionPerformed(evt,saldomesproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSaldoMesProducto(this.saldomesproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSaldoMesProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,saldomesproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.saldomesproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				this.saldomesproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				this.saldomesproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.saldomesproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SaldoMesProductoModel) this.jTableDatosSaldoMesProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSaldoMesProducto=true;
				this.inicializarActualizarBindingTablaSaldoMesProducto(false);
				this.isEsNuevoSaldoMesProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldoMesProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldoMesProducto(false);
				
				this.habilitarDeshabilitarControlesSaldoMesProducto(false);
				
				
				
				if(SaldoMesProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSaldoMesProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSaldoMesProducto.getRowCount()>=1) {
				jTableDatosSaldoMesProducto.removeRowSelectionInterval(0, jTableDatosSaldoMesProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSaldoMesProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSaldoMesProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldoMesProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldoMesProducto(false) ;
			
			this.isEsNuevoSaldoMesProducto=false;
			
			if(SaldoMesProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSaldoMesProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSaldoMesProducto(false);
				
				//SI ES MANUAL
				if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSaldoMesProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSaldoMesProducto--;			
			//SaldoMesProducto saldomesproductoAux= new SaldoMesProducto();			
			//saldomesproductoAux.setId(this.iIdNuevoSaldoMesProducto);
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSaldoMesProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
			
			this.saldomesproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.saldomesproductoLogic.getSaldoMesProductos().add(this.saldomesproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.saldomesproductos.add(this.saldomesproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSaldoMesProducto(false);
			
			this.jTableDatosSaldoMesProducto.setRowSelectionInterval(this.getIndiceNuevoSaldoMesProducto(), this.getIndiceNuevoSaldoMesProducto());
			
			int iLastRow =  this.jTableDatosSaldoMesProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSaldoMesProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSaldoMesProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSaldoMesProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSaldoMesProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldoMesProducto(false);
			
			//SI ES MANUAL
			if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldoMesProducto();
			}
			
			//this.abrirFrameTreeSaldoMesProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Saldo Mes ProductoS ?", "MANTENIMIENTO DE Saldo Mes Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSaldoMesProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSaldoMesProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.saldomesproductoReturnGeneral=saldomesproductoLogic.procesarImportacionSaldoMesProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.saldomesproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSaldoMesProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSaldoMesProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSaldoMesProducto.setFileImportacion(this.jInternalFrameImportacionSaldoMesProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSaldoMesProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSaldoMesProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSaldoMesProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSaldoMesProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();		

		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SaldoMesProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SaldoMesProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteSaldoMesProductos("Todos",saldomesproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoMesProductoConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoMesProductoConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSaldoMesProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
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
	
	public void jButtonGenerarExcelReporteDinamicoSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();		
		
		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldomesproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SaldoMesProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SaldoMesProducto saldomesproducto:saldomesproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldomesproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(SaldoMesProducto saldomesproducto:saldomesproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldomesproducto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(SaldoMesProducto saldomesproducto:saldomesproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldomesproducto.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(SaldoMesProducto saldomesproducto:saldomesproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldomesproducto.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(SaldoMesProducto saldomesproducto:saldomesproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldomesproducto.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(SaldoMesProducto saldomesproducto:saldomesproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldomesproducto.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(SaldoMesProducto saldomesproducto:saldomesproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldomesproducto.getsaldo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoMesProductoConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(SaldoMesProducto saldomesproducto:saldomesproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldomesproducto.getcosto());
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
			//	this.getFilaCabeceraExportarExcelSaldoMesProducto(row);				
			//	iRow++;
			//}				
			
			//for(SaldoMesProducto saldomesproductoAux:saldomesproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSaldoMesProducto(saldomesproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldoMesProducto(false);
			
			//SI ES MANUAL
			if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldoMesProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldoMesProducto(false);
			
			//SI ES MANUAL
			if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldoMesProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldoMesProducto(false);
			
			//SI ES MANUAL
			if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldoMesProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSaldoMesProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSaldoMesProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSaldoMesProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSaldoMesProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSaldoMesProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSaldoMesProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosSaldoMesProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosSaldoMesProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSaldoMesProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSaldoMesProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSaldoMesProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSaldoMesProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSaldoMesProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSaldoMesProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldoMesProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSaldoMesProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSaldoMesProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSaldoMesProducto();
		
		this.inicializarActualizarBindingBotonesManualSaldoMesProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSaldoMesProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldoMesProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSaldoMesProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSaldoMesProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSaldoMesProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSaldoMesProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSaldoMesProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSaldoMesProducto.jCheckBoxPostAccionNuevoSaldoMesProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSaldoMesProducto.jCheckBoxPostAccionSinCerrarSaldoMesProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSaldoMesProducto.jCheckBoxPostAccionSinMensajeSaldoMesProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSaldoMesProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSaldoMesProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSaldoMesProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
				this.jInternalFrameDetalleFormSaldoMesProducto.jCheckBoxPostAccionNuevoSaldoMesProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSaldoMesProducto.jCheckBoxPostAccionSinCerrarSaldoMesProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSaldoMesProducto.jCheckBoxPostAccionSinMensajeSaldoMesProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSaldoMesProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSaldoMesProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSaldoMesProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSaldoMesProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSaldoMesProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSaldoMesProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSaldoMesProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSaldoMesProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSaldoMesProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSaldoMesProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSaldoMesProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSaldoMesProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSaldoMesProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSaldoMesProducto() throws Exception {
		try	{
			if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldoMesProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldoMesProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldoMesProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSaldoMesProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSaldoMesProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSaldoMesProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSaldoMesProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSaldoMesProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSaldoMesProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSaldoMesProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSaldoMesProducto.addItem(reporte);
			}
			
			
			if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSaldoMesProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSaldoMesProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSaldoMesProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSaldoMesProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSaldoMesProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSaldoMesProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSaldoMesProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSaldoMesProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSaldoMesProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldoMesProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldoMesProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldoMesProducto!=null) {
				this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldoMesProducto!=null) {
				this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSaldoMesProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SaldoMesProductoConstantesFunciones.getTiposSeleccionarSaldoMesProducto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SaldoMesProductoConstantesFunciones.getTiposSeleccionarSaldoMesProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SaldoMesProductoConstantesFunciones.getTiposSeleccionarSaldoMesProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSaldoMesProducto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSaldoMesProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioSaldoMesProducto.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioSaldoMesProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaSaldoMesProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesSaldoMesProducto.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesSaldoMesProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoSaldoMesProducto.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoSaldoMesProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSaldoMesProducto(Boolean esInicializar) throws Exception {				
		if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSaldoMesProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSaldoMesProducto() throws Exception {
		this.inicializarActualizarBindingTablaSaldoMesProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySaldoMesProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSaldoMesProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSaldoMesProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=saldomesproductoLogic.getSaldoMesProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=saldomesproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSaldoMesProducto.setModel(new SaldoMesProductoModel(this.saldomesproductoLogic.getSaldoMesProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSaldoMesProducto.setModel(new SaldoMesProductoModel(this.saldomesproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySaldoMesProducto!=null && this.jInternalFrameOrderBySaldoMesProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySaldoMesProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO,saldomesproductoConstantesFunciones.resaltarSeleccionarSaldoMesProducto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SaldoMesProductoConstantesFunciones.SCLASSWEBTITULO,saldomesproductoConstantesFunciones.resaltarSeleccionarSaldoMesProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_ID));

		if(this.saldomesproductoConstantesFunciones.mostraridSaldoMesProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoMesProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldomesproductoConstantesFunciones.resaltaridSaldoMesProducto,this.saldomesproductoConstantesFunciones.activaridSaldoMesProducto,iSizeTabla,this,true,"idSaldoMesProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldomesproductoConstantesFunciones.resaltaridSaldoMesProducto,this.saldomesproductoConstantesFunciones.activaridSaldoMesProducto,this,true,"idSaldoMesProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.saldomesproductoConstantesFunciones.mostrarid_empresaSaldoMesProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_empresaSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_empresaSaldoMesProducto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_empresaSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_empresaSaldoMesProducto,false,"id_empresaSaldoMesProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.saldomesproductoConstantesFunciones.mostrarid_sucursalSaldoMesProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_sucursalSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_sucursalSaldoMesProducto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_sucursalSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_sucursalSaldoMesProducto,false,"id_sucursalSaldoMesProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA));

		if(this.saldomesproductoConstantesFunciones.mostrarid_bodegaSaldoMesProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_bodegaSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_bodegaSaldoMesProducto,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_bodegaSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_bodegaSaldoMesProducto,true,"id_bodegaSaldoMesProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.saldomesproductoConstantesFunciones.mostrarid_productoSaldoMesProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_productoSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_productoSaldoMesProducto,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_productoSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_productoSaldoMesProducto,true,"id_productoSaldoMesProducto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDANIO));

		if(this.saldomesproductoConstantesFunciones.mostrarid_anioSaldoMesProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoMesProductoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_anioSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_anioSaldoMesProducto,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_anioSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_anioSaldoMesProducto,true,"id_anioSaldoMesProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_IDMES));

		if(this.saldomesproductoConstantesFunciones.mostrarid_mesSaldoMesProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoMesProductoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_mesSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_mesSaldoMesProducto,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.saldomesproductoConstantesFunciones.resaltarid_mesSaldoMesProducto,this,this.saldomesproductoConstantesFunciones.activarid_mesSaldoMesProducto,true,"id_mesSaldoMesProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_SALDO));

		if(this.saldomesproductoConstantesFunciones.mostrarsaldoSaldoMesProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoMesProductoConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldomesproductoConstantesFunciones.resaltarsaldoSaldoMesProducto,this.saldomesproductoConstantesFunciones.activarsaldoSaldoMesProducto,iSizeTabla,this,true,"saldoSaldoMesProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldomesproductoConstantesFunciones.resaltarsaldoSaldoMesProducto,this.saldomesproductoConstantesFunciones.activarsaldoSaldoMesProducto,this,true,"saldoSaldoMesProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,SaldoMesProductoConstantesFunciones.LABEL_COSTO));

		if(this.saldomesproductoConstantesFunciones.mostrarcostoSaldoMesProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoMesProductoConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldomesproductoConstantesFunciones.resaltarcostoSaldoMesProducto,this.saldomesproductoConstantesFunciones.activarcostoSaldoMesProducto,iSizeTabla,this,true,"costoSaldoMesProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldomesproductoConstantesFunciones.resaltarcostoSaldoMesProducto,this.saldomesproductoConstantesFunciones.activarcostoSaldoMesProducto,this,true,"costoSaldoMesProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldoMesProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldomesproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldomesproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldoMesProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldomesproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldomesproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldoMesProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.saldomesproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.saldomesproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSaldoMesProducto.addColumn(tableColumn);
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
			
			this.jTableDatosSaldoMesProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSaldoMesProducto.moveColumn(this.jTableDatosSaldoMesProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSaldoMesProducto.moveColumn(this.jTableDatosSaldoMesProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSaldoMesProducto.moveColumn(this.jTableDatosSaldoMesProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSaldoMesProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSaldoMesProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSaldoMesProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSaldoMesProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSaldoMesProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSaldoMesProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSaldoMesProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=saldomesproductoLogic.getSaldoMesProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=saldomesproductos.size()-1;
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
		//this.jTableDatosSaldoMesProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSaldoMesProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSaldoMesProducto();
			
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
				
				//this.isEsNuevoSaldoMesProducto=false;
					
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
				if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSaldoMesProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldoMesProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldoMesProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.saldomesproducto.getsType().equals("DUPLICADO")
				   || this.saldomesproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSaldoMesProducto=true;
				
				} else {
					this.isEsNuevoSaldoMesProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.saldomesproducto.getId()>=0 && !this.saldomesproducto.getIsNew()) {						
						this.isEsNuevoSaldoMesProducto=false;
						
					} else {
						this.isEsNuevoSaldoMesProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSaldoMesProducto(esRelaciones);						
				
				this.seleccionarSaldoMesProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.saldomesproducto.getId()<0) {
					this.isEsNuevoSaldoMesProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSaldoMesProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSaldoMesProducto(evt,rowIndex);
				}	
				
				if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SaldoMesProducto: " + this.dDif); 
					}
				}								
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSaldoMesProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.saldomesproducto)) {
					if(this.saldomesproducto.getId()>0) {
						this.saldomesproducto.setIsDeleted(true);
						
						this.saldomesproductosEliminados.add(this.saldomesproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldomesproductoLogic.getSaldoMesProductos().remove(this.saldomesproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldomesproductos.remove(this.saldomesproducto);				
					}
					
					
					((SaldoMesProductoModel) this.jTableDatosSaldoMesProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldoMesProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSaldoMesProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSaldoMesProducto) {
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldoMesProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldoMesProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSaldoMesProducto(this.saldomesproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.saldomesproductoConstantesFunciones.cargarid_empresaSaldoMesProducto || this.saldomesproductoConstantesFunciones.event_dependid_empresaSaldoMesProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.saldomesproducto.getid_empresa());
									//this.inicializarActualizarBindingSaldoMesProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(saldomesproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(saldomesproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.saldomesproducto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.saldomesproductoConstantesFunciones.cargarid_sucursalSaldoMesProducto || this.saldomesproductoConstantesFunciones.event_dependid_sucursalSaldoMesProducto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.saldomesproducto.getid_sucursal());
									//this.inicializarActualizarBindingSaldoMesProducto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(saldomesproducto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(saldomesproducto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.saldomesproducto.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.saldomesproductoConstantesFunciones.cargarid_bodegaSaldoMesProducto || this.saldomesproductoConstantesFunciones.event_dependid_bodegaSaldoMesProducto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.saldomesproducto.getid_bodega());
									//this.inicializarActualizarBindingSaldoMesProducto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(saldomesproducto.getBodega()!=null) {
							this.bodegasForeignKey.add(saldomesproducto.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.saldomesproducto.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.saldomesproductoConstantesFunciones.cargarid_productoSaldoMesProducto || this.saldomesproductoConstantesFunciones.event_dependid_productoSaldoMesProducto) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.saldomesproducto.getid_producto());
									//this.inicializarActualizarBindingSaldoMesProducto(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(saldomesproducto.getProducto()!=null) {
							this.productosForeignKey.add(saldomesproducto.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.saldomesproducto.getid_producto(),false,"Formulario");

					//Anio
					if(!this.saldomesproductoConstantesFunciones.cargarid_anioSaldoMesProducto || this.saldomesproductoConstantesFunciones.event_dependid_anioSaldoMesProducto) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.saldomesproducto.getid_anio());
									//this.inicializarActualizarBindingSaldoMesProducto(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(saldomesproducto.getAnio()!=null) {
							this.aniosForeignKey.add(saldomesproducto.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.saldomesproducto.getid_anio(),false,"Formulario");

					//Mes
					if(!this.saldomesproductoConstantesFunciones.cargarid_mesSaldoMesProducto || this.saldomesproductoConstantesFunciones.event_dependid_mesSaldoMesProducto) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.saldomesproducto.getid_mes());
									//this.inicializarActualizarBindingSaldoMesProducto(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(saldomesproducto.getMes()!=null) {
							this.messForeignKey.add(saldomesproducto.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.saldomesproducto.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSaldoMesProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSaldoMesProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldoMesProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldoMesProducto(SaldoMesProducto saldomesproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSaldoMesProducto(saldomesproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldoMesProducto(SaldoMesProducto saldomesproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSaldoMesProducto(saldomesproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySaldoMesProducto(saldomesproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySaldoMesProducto(saldomesproducto);
	}
	
	public void setVariablesObjetoActualToFormularioSaldoMesProducto(SaldoMesProducto saldomesproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.setText(saldomesproducto.getId().toString());
			this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldsaldoSaldoMesProducto.setText(saldomesproducto.getsaldo().toString());
			this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldcostoSaldoMesProducto.setText(saldomesproducto.getcosto().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SaldoMesProducto saldomesproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,saldomesproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SaldoMesProducto saldomesproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				saldomesproductoLocal=this.saldomesproducto;
			} else {
				saldomesproductoLocal=this.saldomesproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(saldomesproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSaldoMesProducto(saldomesproductoLocal,true);
					
					if(saldomesproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(saldomesproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(saldomesproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSaldoMesProducto(SaldoMesProducto saldomesproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldoMesProducto(saldomesproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(saldomesproducto);
	}
	
	public void setVariablesFormularioToObjetoActualSaldoMesProducto(SaldoMesProducto saldomesproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldoMesProducto(saldomesproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSaldoMesProducto(SaldoMesProducto saldomesproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.getText()==null || this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.getText()=="" || this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.setText("0");
			}

			if(conColumnasBase) {saldomesproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoMesProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelIdSaldoMesProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldomesproducto.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldsaldoSaldoMesProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoMesProductoConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelsaldoSaldoMesProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldomesproducto.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldcostoSaldoMesProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoMesProductoConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoMesProducto.jLabelcostoSaldoMesProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldoMesProducto(SaldoMesProducto saldomesproductoBean,SaldoMesProducto saldomesproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSaldoMesProducto(SaldoMesProducto saldomesproductoOrigen,SaldoMesProducto saldomesproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldomesproductoOrigen.getId()!=null && !saldomesproductoOrigen.getId().equals(0L))) {saldomesproducto.setId(saldomesproductoOrigen.getId());}}
			if(conDefault || (!conDefault && saldomesproductoOrigen.getsaldo()!=null && !saldomesproductoOrigen.getsaldo().equals(0.0))) {saldomesproducto.setsaldo(saldomesproductoOrigen.getsaldo());}
			if(conDefault || (!conDefault && saldomesproductoOrigen.getcosto()!=null && !saldomesproductoOrigen.getcosto().equals(0.0))) {saldomesproducto.setcosto(saldomesproductoOrigen.getcosto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldoMesProducto(SaldoMesProducto saldomesproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.setText(saldomesproducto.getId().toString());
			this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldsaldoSaldoMesProducto.setText(saldomesproducto.getsaldo().toString());
			this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldcostoSaldoMesProducto.setText(saldomesproducto.getcosto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldoMesProducto(SaldoMesProductoBean saldomesproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.setText(saldomesproductoBean.getId().toString());
			this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldsaldoSaldoMesProducto.setText(saldomesproductoBean.getsaldo().toString());
			this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldcostoSaldoMesProducto.setText(saldomesproductoBean.getcosto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSaldoMesProducto(SaldoMesProductoParameterReturnGeneral saldomesproductoReturnGeneral,SaldoMesProductoBean saldomesproductoBean,Boolean conDefault) throws Exception { 
		try {
			SaldoMesProducto saldomesproductoLocal=new SaldoMesProducto();
			
			saldomesproductoLocal=saldomesproductoReturnGeneral.getSaldoMesProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldomesproductoLocal.getId()!=null && !saldomesproductoLocal.getId().equals(0L))) {saldomesproductoBean.setId(saldomesproductoLocal.getId());}}
			if(conDefault || (!conDefault && saldomesproductoLocal.getsaldo()!=null && !saldomesproductoLocal.getsaldo().equals(0.0))) {saldomesproductoBean.setsaldo(saldomesproductoLocal.getsaldo());}
			if(conDefault || (!conDefault && saldomesproductoLocal.getcosto()!=null && !saldomesproductoLocal.getcosto().equals(0.0))) {saldomesproductoBean.setcosto(saldomesproductoLocal.getcosto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSaldoMesProductoGenerico(Long idSaldoMesProductoSeleccionado,JComboBox jComboBoxSaldoMesProducto,List<SaldoMesProducto> saldomesproductosLocal)throws Exception {
		try {
			SaldoMesProducto  saldomesproductoTemp=null;

			for(SaldoMesProducto saldomesproductoAux:saldomesproductosLocal) {
				if(saldomesproductoAux.getId()!=null && saldomesproductoAux.getId().equals(idSaldoMesProductoSeleccionado)) {
					saldomesproductoTemp=saldomesproductoAux;
					break;
				}
			}

			jComboBoxSaldoMesProducto.setSelectedItem(saldomesproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSaldoMesProductoGenerico(JComboBox jComboBoxSaldoMesProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldoMesProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSaldoMesProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldoMesProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSaldoMesProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSaldoMesProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSaldoMesProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldomesproducto=(SaldoMesProducto) saldomesproductoLogic.getSaldoMesProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldomesproducto =(SaldoMesProducto) saldomesproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!saldomesproducto.getIsNew() && !saldomesproducto.getIsChanged() && !saldomesproducto.getIsDeleted()) {
				sDescripcion=saldomesproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=saldomesproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!saldomesproducto.getIsNew() && !saldomesproducto.getIsChanged() && !saldomesproducto.getIsDeleted()) {
				sDescripcion=saldomesproducto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=saldomesproducto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!saldomesproducto.getIsNew() && !saldomesproducto.getIsChanged() && !saldomesproducto.getIsDeleted()) {
				sDescripcion=saldomesproducto.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=saldomesproducto.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!saldomesproducto.getIsNew() && !saldomesproducto.getIsChanged() && !saldomesproducto.getIsDeleted()) {
				sDescripcion=saldomesproducto.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=saldomesproducto.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!saldomesproducto.getIsNew() && !saldomesproducto.getIsChanged() && !saldomesproducto.getIsDeleted()) {
				sDescripcion=saldomesproducto.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=saldomesproducto.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!saldomesproducto.getIsNew() && !saldomesproducto.getIsChanged() && !saldomesproducto.getIsDeleted()) {
				sDescripcion=saldomesproducto.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=saldomesproducto.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SaldoMesProducto saldomesproductoRow=new SaldoMesProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldomesproductoRow=(SaldoMesProducto) saldomesproductoLogic.getSaldoMesProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldomesproductoRow=(SaldoMesProducto) saldomesproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSaldoMesProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSaldoMesProducto.setVisible((this.isVisibilidadCeldaNuevoSaldoMesProducto && this.isPermisoNuevoSaldoMesProducto));			
			this.jButtonDuplicarSaldoMesProducto.setVisible((this.isVisibilidadCeldaDuplicarSaldoMesProducto && this.isPermisoDuplicarSaldoMesProducto));			
			this.jButtonCopiarSaldoMesProducto.setVisible((this.isVisibilidadCeldaCopiarSaldoMesProducto && this.isPermisoCopiarSaldoMesProducto));
			this.jButtonVerFormSaldoMesProducto.setVisible((this.isVisibilidadCeldaVerFormSaldoMesProducto && this.isPermisoVerFormSaldoMesProducto));
			
			this.jButtonAbrirOrderBySaldoMesProducto.setVisible((this.isVisibilidadCeldaOrdenSaldoMesProducto && this.isPermisoOrdenSaldoMesProducto));			
			
			this.jButtonNuevoRelacionesSaldoMesProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto && this.isPermisoNuevoSaldoMesProducto));			
			this.jButtonNuevoGuardarCambiosSaldoMesProducto.setVisible((this.isVisibilidadCeldaNuevoSaldoMesProducto && this.isPermisoNuevoSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonModificarSaldoMesProducto.setVisible((this.isVisibilidadCeldaModificarSaldoMesProducto && this.isPermisoActualizarSaldoMesProducto));	
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarSaldoMesProducto.setVisible((this.isVisibilidadCeldaActualizarSaldoMesProducto && this.isPermisoActualizarSaldoMesProducto));	
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarSaldoMesProducto.setVisible((this.isVisibilidadCeldaEliminarSaldoMesProducto && this.isPermisoEliminarSaldoMesProducto));
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarSaldoMesProducto.setVisible(this.isVisibilidadCeldaCancelarSaldoMesProducto);							
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosSaldoMesProducto.setVisible((this.isVisibilidadCeldaGuardarSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaSaldoMesProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaNuevoSaldoMesProducto && this.isPermisoNuevoSaldoMesProducto));						
			this.jButtonDuplicarToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaDuplicarSaldoMesProducto && this.isPermisoDuplicarSaldoMesProducto));						
			this.jButtonCopiarToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaCopiarSaldoMesProducto && this.isPermisoCopiarSaldoMesProducto));			
			this.jButtonVerFormToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaVerFormSaldoMesProducto && this.isPermisoVerFormSaldoMesProducto));			
			this.jButtonAbrirOrderByToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaOrdenSaldoMesProducto && this.isPermisoOrdenSaldoMesProducto));
			this.jButtonNuevoRelacionesToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto && this.isPermisoNuevoSaldoMesProducto));			
			this.jButtonNuevoGuardarCambiosToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaNuevoSaldoMesProducto && this.isPermisoNuevoSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));			
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonModificarToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaModificarSaldoMesProducto && this.isPermisoActualizarSaldoMesProducto));	
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaActualizarSaldoMesProducto  && this.isPermisoActualizarSaldoMesProducto));	
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaEliminarSaldoMesProducto && this.isPermisoEliminarSaldoMesProducto));
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarToolBarSaldoMesProducto.setVisible(this.isVisibilidadCeldaCancelarSaldoMesProducto);				
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaGuardarSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSaldoMesProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSaldoMesProducto.setVisible((this.isVisibilidadCeldaNuevoSaldoMesProducto && this.isPermisoNuevoSaldoMesProducto));			
			this.jMenuItemDuplicarSaldoMesProducto.setVisible((this.isVisibilidadCeldaDuplicarSaldoMesProducto && this.isPermisoDuplicarSaldoMesProducto));			
			this.jMenuItemCopiarSaldoMesProducto.setVisible((this.isVisibilidadCeldaCopiarSaldoMesProducto && this.isPermisoCopiarSaldoMesProducto));			
			this.jMenuItemVerFormSaldoMesProducto.setVisible((this.isVisibilidadCeldaVerFormSaldoMesProducto && this.isPermisoVerFormSaldoMesProducto));			
			this.jMenuItemAbrirOrderBySaldoMesProducto.setVisible((this.isVisibilidadCeldaOrdenSaldoMesProducto && this.isPermisoOrdenSaldoMesProducto));			
			//this.jMenuItemMostrarOcultarSaldoMesProducto.setVisible((this.isVisibilidadCeldaOrdenSaldoMesProducto && this.isPermisoOrdenSaldoMesProducto));
			this.jMenuItemDetalleAbrirOrderBySaldoMesProducto.setVisible((this.isVisibilidadCeldaOrdenSaldoMesProducto && this.isPermisoOrdenSaldoMesProducto));			
			//this.jMenuItemDetalleMostrarOcultarSaldoMesProducto.setVisible((this.isVisibilidadCeldaOrdenSaldoMesProducto && this.isPermisoOrdenSaldoMesProducto));			
			this.jMenuItemNuevoRelacionesSaldoMesProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto && this.isPermisoNuevoSaldoMesProducto));			
			this.jMenuItemNuevoGuardarCambiosSaldoMesProducto.setVisible((this.isVisibilidadCeldaNuevoSaldoMesProducto && this.isPermisoNuevoSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));									
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemModificarSaldoMesProducto.setVisible((this.isVisibilidadCeldaModificarSaldoMesProducto && this.isPermisoActualizarSaldoMesProducto));	
			this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemActualizarSaldoMesProducto.setVisible((this.isVisibilidadCeldaActualizarSaldoMesProducto && this.isPermisoActualizarSaldoMesProducto));	
			this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemEliminarSaldoMesProducto.setVisible((this.isVisibilidadCeldaEliminarSaldoMesProducto && this.isPermisoEliminarSaldoMesProducto));
			this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemCancelarSaldoMesProducto.setVisible(this.isVisibilidadCeldaCancelarSaldoMesProducto);				
			}
			
			this.jMenuItemGuardarCambiosSaldoMesProducto.setVisible((this.isVisibilidadCeldaGuardarSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));						
			this.jMenuItemGuardarCambiosTablaSaldoMesProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSaldoMesProducto=this.jButtonNuevoSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaDuplicarSaldoMesProducto=this.jButtonDuplicarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaCopiarSaldoMesProducto=this.jButtonCopiarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaVerFormSaldoMesProducto=this.jButtonVerFormSaldoMesProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenSaldoMesProducto=this.jButtonAbrirOrderBySaldoMesProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=this.jButtonNuevoRelacionesSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaModificarSaldoMesProducto=this.jButtonModificarSaldoMesProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			this.isVisibilidadCeldaActualizarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaEliminarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaCancelarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaGuardarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosSaldoMesProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=this.jButtonGuardarCambiosTablaSaldoMesProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSaldoMesProducto=this.jButtonNuevoToolBarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=this.jButtonNuevoRelacionesToolBarSaldoMesProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			this.isVisibilidadCeldaModificarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jButtonModificarToolBarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaActualizarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarToolBarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaEliminarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarToolBarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaCancelarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarToolBarSaldoMesProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldoMesProducto=this.jButtonGuardarCambiosToolBarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=this.jButtonGuardarCambiosTablaToolBarSaldoMesProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSaldoMesProducto=this.jMenuItemNuevoSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=this.jMenuItemNuevoRelacionesSaldoMesProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			this.isVisibilidadCeldaModificarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemModificarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaActualizarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemActualizarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaEliminarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemEliminarSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaCancelarSaldoMesProducto=this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemCancelarSaldoMesProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldoMesProducto=this.jMenuItemGuardarCambiosSaldoMesProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=this.jMenuItemGuardarCambiosTablaSaldoMesProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSaldoMesProducto(Boolean esInicializar) {
		if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSaldoMesProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualSaldoMesProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSaldoMesProducto() {
		this.jButtonNuevoSaldoMesProducto.setVisible(this.isPermisoNuevoSaldoMesProducto);			
		this.jButtonDuplicarSaldoMesProducto.setVisible(this.isPermisoDuplicarSaldoMesProducto);			
		this.jButtonCopiarSaldoMesProducto.setVisible(this.isPermisoCopiarSaldoMesProducto);			
		this.jButtonVerFormSaldoMesProducto.setVisible(this.isPermisoVerFormSaldoMesProducto);			
		
		this.jButtonAbrirOrderBySaldoMesProducto.setVisible(this.isPermisoOrdenSaldoMesProducto);					
		
		this.jButtonNuevoRelacionesSaldoMesProducto.setVisible(this.isPermisoNuevoSaldoMesProducto);			
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonModificarSaldoMesProducto.setVisible(this.isPermisoActualizarSaldoMesProducto);	
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarSaldoMesProducto.setVisible(this.isPermisoActualizarSaldoMesProducto);	
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarSaldoMesProducto.setVisible(this.isPermisoEliminarSaldoMesProducto);
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarSaldoMesProducto.setVisible(this.isVisibilidadCeldaCancelarSaldoMesProducto);						
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosSaldoMesProducto.setVisible(this.isPermisoGuardarCambiosSaldoMesProducto);							
		}
		
		this.jButtonGuardarCambiosTablaSaldoMesProducto.setVisible(this.isPermisoActualizarSaldoMesProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldoMesProducto() {
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonModificarSaldoMesProducto.setVisible(this.isPermisoActualizarSaldoMesProducto);	
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarSaldoMesProducto.setVisible(this.isPermisoActualizarSaldoMesProducto);	
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarSaldoMesProducto.setVisible(this.isPermisoEliminarSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarSaldoMesProducto.setVisible(this.isVisibilidadCeldaCancelarSaldoMesProducto);							
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosSaldoMesProducto.setVisible((this.isVisibilidadCeldaGuardarSaldoMesProducto && this.isPermisoGuardarCambiosSaldoMesProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSaldoMesProducto() {
		if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSaldoMesProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSaldoMesProducto() {
	}
	
	public void jTableDatosSaldoMesProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSaldoMesProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSaldoMesProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldomesproducto==null) {
						this.saldomesproducto = new SaldoMesProducto();
					}

					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				}

				if(this.saldomesproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.saldomesproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoMesProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSaldoMesProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSaldoMesProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoMesProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoMesProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.saldomesproductoLogic.getConnexion());

				if(this.saldomesproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.saldomesproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoMesProducto=(TitledBorder)this.jScrollPanelDatosSaldoMesProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSaldoMesProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSaldoMesProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldomesproducto==null) {
						this.saldomesproducto = new SaldoMesProducto();
					}

					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				}

				if(this.saldomesproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.saldomesproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoMesProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalSaldoMesProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebSaldoMesProducto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoMesProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoMesProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.saldomesproductoLogic.getConnexion());

				if(this.saldomesproducto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.saldomesproducto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoMesProducto=(TitledBorder)this.jScrollPanelDatosSaldoMesProducto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderSaldoMesProducto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalSaldoMesProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldomesproducto==null) {
						this.saldomesproducto = new SaldoMesProducto();
					}

					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				}

				if(this.saldomesproducto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.saldomesproducto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoMesProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaSaldoMesProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebSaldoMesProducto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoMesProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoMesProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.saldomesproductoLogic.getConnexion());

				if(this.saldomesproducto.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.saldomesproducto.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoMesProducto=(TitledBorder)this.jScrollPanelDatosSaldoMesProducto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderSaldoMesProducto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaSaldoMesProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldomesproducto==null) {
						this.saldomesproducto = new SaldoMesProducto();
					}

					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				}

				if(this.saldomesproducto.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.saldomesproducto.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoMesProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoSaldoMesProductoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderSaldoMesProducto=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosSaldoMesProducto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderSaldoMesProducto=(TitledBorder)this.jScrollPanelDatosSaldoMesProducto.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderSaldoMesProducto.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoSaldoMesProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebSaldoMesProducto(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoMesProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoMesProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.saldomesproductoLogic.getConnexion());

				if(this.saldomesproducto.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.saldomesproducto.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoMesProducto=(TitledBorder)this.jScrollPanelDatosSaldoMesProducto.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderSaldoMesProducto.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoSaldoMesProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldomesproducto==null) {
						this.saldomesproducto = new SaldoMesProducto();
					}

					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				}

				if(this.saldomesproducto.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.saldomesproducto.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoMesProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioSaldoMesProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebSaldoMesProducto(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoMesProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoMesProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.saldomesproductoLogic.getConnexion());

				if(this.saldomesproducto.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.saldomesproducto.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoMesProducto=(TitledBorder)this.jScrollPanelDatosSaldoMesProducto.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderSaldoMesProducto.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioSaldoMesProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldomesproducto==null) {
						this.saldomesproducto = new SaldoMesProducto();
					}

					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				}

				if(this.saldomesproducto.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.saldomesproducto.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoMesProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesSaldoMesProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebSaldoMesProducto(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoMesProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoMesProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.saldomesproductoLogic.getConnexion());

				if(this.saldomesproducto.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.saldomesproducto.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoMesProducto=(TitledBorder)this.jScrollPanelDatosSaldoMesProducto.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderSaldoMesProducto.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesSaldoMesProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldomesproducto==null) {
						this.saldomesproducto = new SaldoMesProducto();
					}

					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				}

				if(this.saldomesproducto.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.saldomesproducto.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoMesProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoSaldoMesProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldomesproducto==null) {
						this.saldomesproducto = new SaldoMesProducto();
					}

					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				}

				if(this.saldomesproducto.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.saldomesproducto.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoMesProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoSaldoMesProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.getsaldomesproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldomesproducto==null) {
						this.saldomesproducto = new SaldoMesProducto();
					}

					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);
				}

				if(this.saldomesproducto.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.saldomesproducto.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoMesProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoMesProducto(false,false);

			this.getSaldoMesProductosFK_IdAnio();

			this.inicializarActualizarBindingSaldoMesProducto(false);

			//if(SaldoMesProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoMesProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoMesProducto(false,false);

			this.getSaldoMesProductosFK_IdBodega();

			this.inicializarActualizarBindingSaldoMesProducto(false);

			//if(SaldoMesProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoMesProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoMesProducto(false,false);

			this.getSaldoMesProductosFK_IdEmpresa();

			this.inicializarActualizarBindingSaldoMesProducto(false);

			//if(SaldoMesProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoMesProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoMesProducto(false,false);

			this.getSaldoMesProductosFK_IdMes();

			this.inicializarActualizarBindingSaldoMesProducto(false);

			//if(SaldoMesProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoMesProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoMesProducto(false,false);

			this.getSaldoMesProductosFK_IdProducto();

			this.inicializarActualizarBindingSaldoMesProducto(false);

			//if(SaldoMesProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoMesProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalSaldoMesProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoMesProducto(false,false);

			this.getSaldoMesProductosFK_IdSucursal();

			this.inicializarActualizarBindingSaldoMesProducto(false);

			//if(SaldoMesProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoMesProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldomesproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSaldoMesProducto() {
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
			this.jInternalFrameDetalleFormSaldoMesProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormSaldoMesProducto.dispose();
			this.jInternalFrameDetalleFormSaldoMesProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSaldoMesProducto!=null) {
			this.jInternalFrameReporteDinamicoSaldoMesProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSaldoMesProducto.dispose();
			this.jInternalFrameReporteDinamicoSaldoMesProducto=null;
		}
		
		if(this.jInternalFrameImportacionSaldoMesProducto!=null) {
			this.jInternalFrameImportacionSaldoMesProducto.setVisible(false);	    			
			this.jInternalFrameImportacionSaldoMesProducto.dispose();
			this.jInternalFrameImportacionSaldoMesProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSaldoMesProducto();
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoSaldoMesProducto")) {
				jButtonNuevoSaldoMesProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSaldoMesProducto")) {
				jButtonDuplicarSaldoMesProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSaldoMesProducto")) {
				jButtonCopiarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormSaldoMesProducto")) {
				jButtonVerFormSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSaldoMesProducto")) {
				jButtonNuevoSaldoMesProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSaldoMesProducto")) {
				jButtonDuplicarSaldoMesProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSaldoMesProducto")) {
				jButtonNuevoSaldoMesProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSaldoMesProducto")) {
				jButtonDuplicarSaldoMesProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSaldoMesProducto")) {
				jButtonNuevoSaldoMesProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSaldoMesProducto")) {
				jButtonNuevoSaldoMesProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSaldoMesProducto")) {
				jButtonNuevoSaldoMesProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSaldoMesProducto")) {
				jButtonModificarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSaldoMesProducto")) {
				jButtonModificarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSaldoMesProducto")) {
				jButtonModificarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSaldoMesProducto")) {
				jButtonActualizarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSaldoMesProducto")) {
				jButtonActualizarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSaldoMesProducto")) {
				jButtonActualizarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarSaldoMesProducto")) {
				jButtonEliminarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSaldoMesProducto")) {
				jButtonEliminarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSaldoMesProducto")) {
				jButtonEliminarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarSaldoMesProducto")) {
				jButtonCancelarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSaldoMesProducto")) {
				jButtonCancelarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSaldoMesProducto")) {
				jButtonCancelarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarSaldoMesProducto")) {
				jButtonCerrarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSaldoMesProducto")) {
				jButtonCerrarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSaldoMesProducto")) {
				jButtonCerrarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSaldoMesProducto")) {
				jButtonMostrarOcultarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSaldoMesProducto")) {
				jButtonCancelarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSaldoMesProducto")) {
				jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSaldoMesProducto")) {
				jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSaldoMesProducto")) {
				jButtonCopiarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSaldoMesProducto")) {
				jButtonVerFormSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSaldoMesProducto")) {
				jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSaldoMesProducto")) {
				jButtonCopiarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSaldoMesProducto")) {
				jButtonVerFormSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSaldoMesProducto")) {
				jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSaldoMesProducto")) {
				jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSaldoMesProducto")) {
				jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSaldoMesProducto")) {
				jButtonRecargarInformacionSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSaldoMesProducto")) {
				jButtonRecargarInformacionSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSaldoMesProducto")) {
				jButtonRecargarInformacionSaldoMesProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSaldoMesProducto")) {
				jButtonAnterioresSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSaldoMesProducto")) {
				jButtonAnterioresSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSaldoMesProducto")) {
				jButtonAnterioresSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSaldoMesProducto")) {
				jButtonSiguientesSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSaldoMesProducto")) {
				jButtonSiguientesSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSaldoMesProducto")) {
				jButtonSiguientesSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySaldoMesProducto") || sTipo.equals("MenuItemDetalleAbrirOrderBySaldoMesProducto")) {
				jButtonAbrirOrderBySaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSaldoMesProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarSaldoMesProducto")) {
				jButtonMostrarOcultarSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSaldoMesProducto")) {
				jButtonNuevoGuardarCambiosSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSaldoMesProducto")) {
				jButtonNuevoGuardarCambiosSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSaldoMesProducto")) {
				jButtonNuevoGuardarCambiosSaldoMesProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSaldoMesProducto")) {
				jButtonCerrarReporteDinamicoSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSaldoMesProducto")) {
				jButtonGenerarReporteDinamicoSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSaldoMesProducto")) {
				
				jButtonGenerarExcelReporteDinamicoSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSaldoMesProducto")) {
				jButtonCerrarImportacionSaldoMesProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSaldoMesProducto")) {
				
				jButtonGenerarImportacionSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSaldoMesProducto")) {
				
				jButtonAbrirImportacionSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSaldoMesProducto")) {
				jComboBoxTiposAccionesSaldoMesProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSaldoMesProducto")) {
				jComboBoxTiposRelacionesSaldoMesProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSaldoMesProducto")) {
				jComboBoxTiposAccionesSaldoMesProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSaldoMesProducto")) {
				
				jComboBoxTiposSeleccionarSaldoMesProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSaldoMesProducto")) {
				jTextFieldValorCampoGeneralSaldoMesProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySaldoMesProducto")) {
				jButtonAbrirOrderBySaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSaldoMesProducto")) {
				jButtonAbrirOrderBySaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySaldoMesProducto")) {
				jButtonCerrarOrderBySaldoMesProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldoMesProductoBusqueda")) {
				this.jButtonidSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldoMesProductoUpdate")) {
				this.jButtonid_empresaSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldoMesProductoBusqueda")) {
				this.jButtonid_empresaSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSaldoMesProductoUpdate")) {
				this.jButtonid_sucursalSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSaldoMesProductoBusqueda")) {
				this.jButtonid_sucursalSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaSaldoMesProductoUpdate")) {
				this.jButtonid_bodegaSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaSaldoMesProductoBusqueda")) {
				this.jButtonid_bodegaSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoSaldoMesProducto")) {
				this.jButtonid_productoSaldoMesProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoSaldoMesProductoUpdate")) {
				this.jButtonid_productoSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoSaldoMesProductoBusqueda")) {
				this.jButtonid_productoSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioSaldoMesProductoUpdate")) {
				this.jButtonid_anioSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioSaldoMesProductoBusqueda")) {
				this.jButtonid_anioSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesSaldoMesProductoUpdate")) {
				this.jButtonid_mesSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesSaldoMesProductoBusqueda")) {
				this.jButtonid_mesSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoSaldoMesProductoBusqueda")) {
				this.jButtonsaldoSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoSaldoMesProductoBusqueda")) {
				this.jButtoncostoSaldoMesProductoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoSaldoMesProducto")) {
				this.jButtonid_productoSaldoMesProductoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAnioSaldoMesProducto")) {
				this.jButtonFK_IdAnioSaldoMesProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaSaldoMesProducto")) {
				this.jButtonFK_IdBodegaSaldoMesProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesSaldoMesProducto")) {
				this.jButtonFK_IdMesSaldoMesProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoSaldoMesProducto")) {
				this.jButtonFK_IdProductoSaldoMesProductoActionPerformed(evt);
			}
			
			;
			
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSaldoMesProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoMesProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				


				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SaldoMesProducto saldomesproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				saldomesproductoLocal=this.saldomesproducto;
			} else {
				saldomesproductoLocal=this.saldomesproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
							
				
				


				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoMesProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
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
			
			


			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoMesProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
								
						
				


				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
								
				
				


				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoMesProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoMesProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoMesProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
							
				
				


				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoMesProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
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
			
			


			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoMesProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
								
				
				


				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoMesProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoMesProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoMesProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSaldoMesProducto")) {
					jCheckBoxSeleccionarTodosSaldoMesProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSaldoMesProducto")) {
					jCheckBoxSeleccionadosSaldoMesProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSaldoMesProducto")) {
					
				}
				
				


				
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
												
				
				


				
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoMesProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoMesProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
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
			
			


			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoMesProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldomesproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldomesproducto);
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
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
				
				


				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoMesProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoMesProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoMesProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldomesproductoAnterior =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSaldoMesProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSaldoMesProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSaldoMesProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.saldomesproducto =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.saldomesproducto =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.saldomesproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSaldoMesProducto")) {
				
				}
				
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSaldoMesProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSaldoMesProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSaldoMesProducto")) {
			
			}
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSaldoMesProducto();
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
			if(sTipo.equals("NuevoSaldoMesProducto")) {
				jButtonNuevoSaldoMesProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSaldoMesProducto")) {
				jButtonDuplicarSaldoMesProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSaldoMesProducto")) {
				jButtonCopiarSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSaldoMesProducto")) {
				jButtonVerFormSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSaldoMesProducto")) {
				jButtonNuevoSaldoMesProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSaldoMesProducto")) {
				jButtonModificarSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSaldoMesProducto")) {
				jButtonActualizarSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSaldoMesProducto")) {
				jButtonEliminarSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSaldoMesProducto")) {
				jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSaldoMesProducto")) {
				jButtonCancelarSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSaldoMesProducto")) {
				jButtonCerrarSaldoMesProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSaldoMesProducto")) {
				jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSaldoMesProducto")) {
				jButtonNuevoGuardarCambiosSaldoMesProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySaldoMesProducto")) {
				jButtonAbrirOrderBySaldoMesProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSaldoMesProducto")) {
				jButtonRecargarInformacionSaldoMesProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSaldoMesProducto")) {
				jButtonAnterioresSaldoMesProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSaldoMesProducto")) {
				jButtonSiguientesSaldoMesProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldoMesProductoBusqueda")) {
				this.jButtonidSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldoMesProductoUpdate")) {
				this.jButtonid_empresaSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldoMesProductoBusqueda")) {
				this.jButtonid_empresaSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSaldoMesProductoUpdate")) {
				this.jButtonid_sucursalSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSaldoMesProductoBusqueda")) {
				this.jButtonid_sucursalSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaSaldoMesProductoUpdate")) {
				this.jButtonid_bodegaSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaSaldoMesProductoBusqueda")) {
				this.jButtonid_bodegaSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoSaldoMesProducto")) {
				this.jButtonid_productoSaldoMesProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoSaldoMesProductoUpdate")) {
				this.jButtonid_productoSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoSaldoMesProductoBusqueda")) {
				this.jButtonid_productoSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioSaldoMesProductoUpdate")) {
				this.jButtonid_anioSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioSaldoMesProductoBusqueda")) {
				this.jButtonid_anioSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesSaldoMesProductoUpdate")) {
				this.jButtonid_mesSaldoMesProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesSaldoMesProductoBusqueda")) {
				this.jButtonid_mesSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoSaldoMesProductoBusqueda")) {
				this.jButtonsaldoSaldoMesProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoSaldoMesProductoBusqueda")) {
				this.jButtoncostoSaldoMesProductoBusquedaActionPerformed(evt);
			}
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSaldoMesProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSaldoMesProducto")) {
				closingInternalFrameSaldoMesProducto();
				
			} else if(sTipo.equals("jButtonCancelarSaldoMesProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormSaldoMesProducto = (JInternalFrameBase)evt.getSource();
	            	
	            SaldoMesProductoBeanSwingJInternalFrame jInternalFrameParent=(SaldoMesProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldoMesProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSaldoMesProductoActionPerformed(null);
			}
			
			SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldomesproducto,new Object(),this.saldomesproductoParameterGeneral,this.saldomesproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSaldoMesProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSaldoMesProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSaldoMesProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.saldomesproducto)) {
			if(!esControlTabla) {
				if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);			
				}
				
				if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSaldoMesProducto(this.saldomesproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.saldomesproductoReturnGeneral=saldomesproductoLogic.procesarEventosSaldoMesProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldomesproductoLogic.getSaldoMesProductos(),this.saldomesproducto,this.saldomesproductoParameterGeneral,this.isEsNuevoSaldoMesProducto,classes);//this.saldomesproductoLogic.getSaldoMesProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSaldoMesProducto(this.saldomesproductoReturnGeneral,this.saldomesproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSaldoMesProducto(classes,this.saldomesproductoReturnGeneral,this.saldomesproductoBean,false);
					}
						
					if(this.saldomesproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySaldoMesProducto(this.saldomesproductoReturnGeneral.getSaldoMesProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSaldoMesProducto(this.saldomesproductoReturnGeneral.getSaldoMesProducto());	
					}
						
					if(this.saldomesproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSaldoMesProducto(this.saldomesproductoReturnGeneral.getSaldoMesProducto(),classes);//this.saldomesproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSaldoMesProducto(this.saldomesproducto,classes);//this.saldomesproductoBean);									
				}
			
				if(SaldoMesProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSaldoMesProducto(this.saldomesproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoMesProducto(this.saldomesproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.saldomesproductoAnterior!=null) {
						this.saldomesproducto=this.saldomesproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.saldomesproductoReturnGeneral=saldomesproductoLogic.procesarEventosSaldoMesProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldomesproductoLogic.getSaldoMesProductos(),this.saldomesproducto,this.saldomesproductoParameterGeneral,this.isEsNuevoSaldoMesProducto,classes);//this.saldomesproductoLogic.getSaldoMesProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.saldomesproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.saldomesproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.saldomesproductoReturnGeneral.getSaldoMesProducto(),saldomesproductoLogic.getSaldoMesProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.saldomesproductoReturnGeneral.getSaldoMesProducto(),this.saldomesproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSaldoMesProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosSaldoMesProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSaldoMesProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosSaldoMesProducto() throws Exception {
		
		SaldoMesProductoModel saldomesproductoModel=(SaldoMesProductoModel)this.jTableDatosSaldoMesProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldomesproductoModel.saldomesproductos=this.saldomesproductoLogic.getSaldoMesProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			saldomesproductoModel.saldomesproductos=this.saldomesproductos;
		}
		
		
		((SaldoMesProductoModel) this.jTableDatosSaldoMesProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSaldoMesProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsaldomesproductoAnterior(),this.saldomesproductoLogic.getSaldoMesProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsaldomesproductoAnterior(),this.saldomesproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSaldoMesProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSaldoMesProducto(SaldoMesProducto saldomesproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
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
										
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldomesproducto,new Object(),generalEntityParameterGeneral,this.saldomesproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.saldomesproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SaldoMesProductoConstantesFunciones.getClassesRelationshipsOfSaldoMesProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SaldoMesProductoConstantesFunciones.getClassesRelationshipsFromStringsOfSaldoMesProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSaldoMesProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SaldoMesProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldomesproducto,new Object(),generalEntityParameterGeneral,this.saldomesproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSaldoMesProducto(SaldoMesProductoBean saldomesproductoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSaldoMesProducto(ArrayList<Classe> classes,SaldoMesProductoReturnGeneral saldomesproductoReturnGeneral,SaldoMesProductoBean saldomesproductoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSaldoMesProducto(SaldoMesProducto saldomesproducto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.saldomesproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSaldoMesProducto = new SaldoMesProductoDetalleFormJInternalFrame(jDesktopPane,this.saldomesproductoSessionBean.getConGuardarRelaciones(),this.saldomesproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.setVisible(false);
		this.jInternalFrameDetalleFormSaldoMesProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormSaldoMesProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSaldoMesProducto.saldomesproductoLogic=this.saldomesproductoLogic;
		
		this.cargarCombosFrameForeignKeySaldoMesProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldoMesProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldoMesProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySaldoMesProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySaldoMesProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSaldoMesProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldoMesProducto"));
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonModificarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"ModificarSaldoMesProducto"));

		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonModificarToolBarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldoMesProducto"));
					
		this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemModificarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldoMesProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"ActualizarSaldoMesProducto"));
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarToolBarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldoMesProducto"));
						
		this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemActualizarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldoMesProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"EliminarSaldoMesProducto"));
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldoMesProducto"));
								
		this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemEliminarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldoMesProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"CancelarSaldoMesProducto"));
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldoMesProducto"));
					
		this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemCancelarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldoMesProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemDetalleCerrarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldoMesProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldoMesProducto"));
		
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldoMesProducto"));
		
		
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldoMesProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonidSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"idSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_empresaSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_empresaSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_sucursalSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_sucursalSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_bodegaSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_bodegaSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaSaldoMesProductoBusqueda"));
		//jButtonid_productoSaldoMesProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoSaldoMesProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProducto.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_anioSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_anioSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_anioSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_mesSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_mesSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_mesSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesSaldoMesProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonsaldoSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"saldoSaldoMesProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtoncostoSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"costoSaldoMesProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSaldoMesProducto.jTabbedPaneRelacionesSaldoMesProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldoMesProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSaldoMesProducto"));
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldoMesProducto"));
		}
		
		this.jTableDatosSaldoMesProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSaldoMesProducto"));
		
		this.jTableDatosSaldoMesProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSaldoMesProducto"));
		
		this.jButtonNuevoSaldoMesProducto.addActionListener(new ButtonActionListener(this,"NuevoSaldoMesProducto"));
		
		this.jButtonDuplicarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"DuplicarSaldoMesProducto"));
		
		this.jButtonCopiarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"CopiarSaldoMesProducto"));
		
		this.jButtonVerFormSaldoMesProducto.addActionListener(new ButtonActionListener(this,"VerFormSaldoMesProducto"));
		
		
		this.jButtonNuevoToolBarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarSaldoMesProducto"));
			
		this.jButtonDuplicarToolBarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSaldoMesProducto"));
			
		this.jMenuItemNuevoSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSaldoMesProducto"));
			
		this.jMenuItemDuplicarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSaldoMesProducto"));		
		
		
		this.jButtonNuevoRelacionesSaldoMesProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSaldoMesProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSaldoMesProducto"));
			
		this.jMenuItemNuevoRelacionesSaldoMesProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSaldoMesProducto"));		
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonModificarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"ModificarSaldoMesProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonModificarToolBarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldoMesProducto"));
			
			this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemModificarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldoMesProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"ActualizarSaldoMesProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonActualizarToolBarSaldoMesProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldoMesProducto"));
				
			this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemActualizarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldoMesProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"EliminarSaldoMesProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonEliminarToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldoMesProducto"));
						
			this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemEliminarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldoMesProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"CancelarSaldoMesProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonCancelarToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldoMesProducto"));
			
			this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemCancelarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldoMesProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSaldoMesProducto"));		
		
		
		this.jButtonCerrarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"CerrarSaldoMesProducto"));
		
		
		this.jButtonCerrarToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarSaldoMesProducto"));
			
		this.jMenuItemCerrarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSaldoMesProducto"));
			
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jMenuItemDetalleCerrarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldoMesProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosSaldoMesProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosSaldoMesProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldoMesProducto"));
		}
		
		this.jButtonCopiarToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarSaldoMesProducto"));
			
		this.jButtonVerFormToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarSaldoMesProducto"));
		
		this.jMenuItemGuardarCambiosSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSaldoMesProducto"));
			
		this.jMenuItemCopiarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSaldoMesProducto"));		
		
		this.jMenuItemVerFormSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSaldoMesProducto"));		
		
		
		this.jButtonGuardarCambiosTablaSaldoMesProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldoMesProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSaldoMesProducto"));
			
		this.jMenuItemGuardarCambiosTablaSaldoMesProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldoMesProducto"));		
		
		
		
		this.jButtonRecargarInformacionSaldoMesProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionSaldoMesProducto"));
					
		this.jButtonRecargarInformacionToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSaldoMesProducto"));
		
		this.jMenuItemRecargarInformacionSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSaldoMesProducto"));		
		
		
		
		this.jButtonAnterioresSaldoMesProducto.addActionListener (new ButtonActionListener(this,"AnterioresSaldoMesProducto"));
		
		
		this.jButtonAnterioresToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSaldoMesProducto"));
		
		this.jMenuItemAnterioresSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSaldoMesProducto"));		
		
		
		this.jButtonSiguientesSaldoMesProducto.addActionListener (new ButtonActionListener(this,"SiguientesSaldoMesProducto"));
		
		
		this.jButtonSiguientesToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSaldoMesProducto"));
			
		this.jMenuItemSiguientesSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSaldoMesProducto"));
			
		this.jMenuItemAbrirOrderBySaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySaldoMesProducto"));
			
		this.jMenuItemMostrarOcultarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSaldoMesProducto"));
			
		this.jMenuItemDetalleAbrirOrderBySaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySaldoMesProducto"));
			
		this.jMenuItemDetalleMostarOcultarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSaldoMesProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosSaldoMesProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSaldoMesProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSaldoMesProducto"));
			
		this.jMenuItemNuevoGuardarCambiosSaldoMesProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSaldoMesProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSaldoMesProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSaldoMesProducto"));

		this.jCheckBoxSeleccionadosSaldoMesProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSaldoMesProducto"));
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldoMesProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesSaldoMesProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesSaldoMesProducto"));
			
		this.jComboBoxTiposAccionesSaldoMesProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesSaldoMesProducto"));
					
		this.jComboBoxTiposSeleccionarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSaldoMesProducto"));
			
		this.jTextFieldValorCampoGeneralSaldoMesProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSaldoMesProducto"));		
		
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonidSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"idSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_empresaSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_empresaSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_sucursalSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_sucursalSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_bodegaSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_bodegaSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaSaldoMesProductoBusqueda"));
		//jButtonid_productoSaldoMesProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoSaldoMesProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProducto.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_anioSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_anioSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_anioSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_mesSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_mesSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_mesSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesSaldoMesProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonsaldoSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"saldoSaldoMesProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtoncostoSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"costoSaldoMesProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioSaldoMesProducto.addActionListener(new ButtonActionListener(this,"FK_IdAnioSaldoMesProducto"));

			this.jButtonFK_IdBodegaSaldoMesProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaSaldoMesProducto"));

			this.jButtonFK_IdMesSaldoMesProducto.addActionListener(new ButtonActionListener(this,"FK_IdMesSaldoMesProducto"));

			this.jButtonFK_IdProductoSaldoMesProducto.addActionListener(new ButtonActionListener(this,"FK_IdProductoSaldoMesProducto"));

			this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSaldoMesProducto!=null) {
				this.jInternalFrameReporteDinamicoSaldoMesProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldoMesProducto"));
				this.jInternalFrameReporteDinamicoSaldoMesProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldoMesProducto"));
				this.jInternalFrameReporteDinamicoSaldoMesProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldoMesProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoSaldoMesProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldoMesProducto"));				
			//this.jButtonGenerarReporteDinamicoSaldoMesProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldoMesProducto"));
			//this.jButtonGenerarExcelReporteDinamicoSaldoMesProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldoMesProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSaldoMesProducto!=null) {
				this.jInternalFrameImportacionSaldoMesProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldoMesProducto"));
				this.jInternalFrameImportacionSaldoMesProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldoMesProducto"));
				this.jInternalFrameImportacionSaldoMesProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldoMesProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySaldoMesProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderBySaldoMesProducto"));
			
			this.jButtonAbrirOrderByToolBarSaldoMesProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSaldoMesProducto"));			
			
			if(this.jInternalFrameOrderBySaldoMesProducto!=null) {
				this.jInternalFrameOrderBySaldoMesProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldoMesProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoMesProducto.jTabbedPaneRelacionesSaldoMesProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldoMesProducto"));
		
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
            		closingInternalFrameSaldoMesProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSaldoMesProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSaldoMesProducto = (JInternalFrameBase)event.getSource();
	            	
	            SaldoMesProductoBeanSwingJInternalFrame jInternalFrameParent=(SaldoMesProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldoMesProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSaldoMesProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSaldoMesProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSaldoMesProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSaldoMesProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSaldoMesProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoMesProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoMesProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoMesProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSaldoMesProducto";
		inputMap = this.jButtonNuevoSaldoMesProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSaldoMesProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldoMesProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoMesProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoMesProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoMesProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSaldoMesProducto";
		inputMap = this.jButtonNuevoRelacionesSaldoMesProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSaldoMesProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldoMesProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSaldoMesProducto";
		inputMap = this.jButtonModificarSaldoMesProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSaldoMesProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSaldoMesProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSaldoMesProducto";
		inputMap = this.jButtonActualizarSaldoMesProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSaldoMesProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSaldoMesProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSaldoMesProducto";
		inputMap = this.jButtonEliminarSaldoMesProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSaldoMesProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSaldoMesProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSaldoMesProducto";
		inputMap = this.jButtonCancelarSaldoMesProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSaldoMesProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSaldoMesProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSaldoMesProducto";
		inputMap = this.jButtonCerrarSaldoMesProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSaldoMesProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSaldoMesProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSaldoMesProducto";
		inputMap = this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosSaldoMesProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonGuardarCambiosSaldoMesProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSaldoMesProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSaldoMesProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSaldoMesProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSaldoMesProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSaldoMesProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSaldoMesProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSaldoMesProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSaldoMesProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSaldoMesProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonidSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"idSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_empresaSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_empresaSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_sucursalSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_sucursalSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_bodegaSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_bodegaSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaSaldoMesProductoBusqueda"));
		//jButtonid_productoSaldoMesProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoSaldoMesProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProducto.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_anioSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_anioSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_anioSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioSaldoMesProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_mesSaldoMesProductoUpdate.addActionListener(new ButtonActionListener(this,"id_mesSaldoMesProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_mesSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesSaldoMesProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtonsaldoSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"saldoSaldoMesProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoMesProducto.jButtoncostoSaldoMesProductoBusqueda.addActionListener(new ButtonActionListener(this,"costoSaldoMesProductoBusqueda"));
		
		
		this.jButtonFK_IdAnioSaldoMesProducto.addActionListener(new ButtonActionListener(this,"FK_IdAnioSaldoMesProducto"));

		this.jButtonFK_IdBodegaSaldoMesProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaSaldoMesProducto"));

		this.jButtonFK_IdMesSaldoMesProducto.addActionListener(new ButtonActionListener(this,"FK_IdMesSaldoMesProducto"));

		this.jButtonFK_IdProductoSaldoMesProducto.addActionListener(new ButtonActionListener(this,"FK_IdProductoSaldoMesProducto"));

		this.jButtonBuscarFK_IdProductoid_productoSaldoMesProducto.addActionListener(new ButtonActionListener(this,"id_productoSaldoMesProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSaldoMesProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSaldoMesProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSaldoMesProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSaldoMesProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSaldoMesProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SaldoMesProducto saldomesproductoAux:this.saldomesproductoLogic.getSaldoMesProductos()) {
					saldomesproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldoMesProducto saldomesproductoAux:saldomesproductos) {
					saldomesproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSaldoMesProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldoMesProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldoMesProducto saldomesproductoAux:this.saldomesproductoLogic.getSaldoMesProductos()) {
						saldomesproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldoMesProducto saldomesproductoAux:saldomesproductos) {
						saldomesproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SaldoMesProducto saldomesproductoAux:this.saldomesproductoLogic.getSaldoMesProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldoMesProducto saldomesproductoAux:saldomesproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSaldoMesProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldoMesProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldoMesProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSaldoMesProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldoMesProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSaldoMesProducto.getSelectedRows();
			
			SaldoMesProducto saldomesproductoLocal=new SaldoMesProducto();
			
			//this.seleccionarTodosSaldoMesProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldomesproductoLocal =(SaldoMesProducto) this.saldomesproductoLogic.getSaldoMesProductos().toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					saldomesproductoLocal =(SaldoMesProducto) this.saldomesproductos.toArray()[this.jTableDatosSaldoMesProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				saldomesproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldoMesProducto saldomesproductoAux:this.saldomesproductoLogic.getSaldoMesProductos()) {
						saldomesproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldoMesProducto saldomesproductoAux:saldomesproductos) {
						saldomesproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSaldoMesProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldoMesProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldoMesProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldoMesProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSaldoMesProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSaldoMesProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSaldoMesProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSaldoMesProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSaldoMesProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldoMesProducto saldomesproductoAux:this.saldomesproductoLogic.getSaldoMesProductos()) {
				
						if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							saldomesproductoAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							saldomesproductoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldoMesProducto saldomesproductoAux:saldomesproductos) {
					
						if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							saldomesproductoAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							saldomesproductoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSaldoMesProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSaldoMesProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSaldoMesProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSaldoMesProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSaldoMesProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSaldoMesProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessSaldoMesProducto(conSplash);
				
					this.generarReporteSaldoMesProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSaldoMesProductosSeleccionados();
				//this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldoMesProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldoMesProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldoMesProducto();
				
				this.exportarSaldoMesProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSaldoMesProductos();
				//this.importarSaldoMesProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldoMesProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSaldoMesProductosSeleccionados();
				//this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Saldo Mes Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSaldoMesProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSaldoMesProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySaldoMesProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(SaldoMesProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSaldoMesProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSaldoMesProducto(conSplash);
					
						//this.actualizarParametrosGeneralSaldoMesProducto();
						
						this.generarReporteProcesoAccionSaldoMesProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SaldoMesProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Saldo Mes ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Saldo Mes Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSaldoMesProducto();
				
						this.actualizarParametrosGeneralSaldoMesProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.saldomesproductoReturnGeneral=saldomesproductoLogic.procesarAccionSaldoMesProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.saldomesproductoLogic.getSaldoMesProductos(),this.saldomesproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSaldoMesProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSaldoMesProducto();
					
					SaldoMesProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSaldoMesProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldoMesProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxTiposAccionesFormularioSaldoMesProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSaldoMesProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSaldoMesProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSaldoMesProducto();
			
			if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();		
			SaldoMesProducto saldomesproducto=new SaldoMesProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSaldoMesProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSaldoMesProducto.getSelectedItem();
			
			
			
			
			saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(saldomesproductosSeleccionados.size()==1) {
				for(SaldoMesProducto saldomesproductoAux:saldomesproductosSeleccionados) {
					saldomesproducto=saldomesproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSaldoMesProducto();
			
      		//this.finishProcessSaldoMesProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSaldoMesProductoReturnGeneral() throws Exception {
		if(this.saldomesproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.saldomesproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.saldomesproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.saldomesproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.saldomesproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.saldomesproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSaldoMesProducto(false);
		}
		
		if(this.saldomesproductoReturnGeneral.getConRetornoLista() || this.saldomesproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.saldomesproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.saldomesproductoLogic.setSaldoMesProductos(this.saldomesproductoReturnGeneral.getSaldoMesProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.saldomesproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.saldomesproductoLogic.setSaldoMesProducto(this.saldomesproductoReturnGeneral.getSaldoMesProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSaldoMesProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralSaldoMesProducto() throws Exception {
		
		
	}
	
	public ArrayList<SaldoMesProducto> getSaldoMesProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSaldoMesProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SaldoMesProducto saldomesproductoAux:saldomesproductoLogic.getSaldoMesProductos()) {
					if(saldomesproductoAux.getIsSelected()) {
						saldomesproductosSeleccionados.add(saldomesproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldoMesProducto saldomesproductoAux:this.saldomesproductos) {
					if(saldomesproductoAux.getIsSelected()) {
						saldomesproductosSeleccionados.add(saldomesproductoAux);				
					}
				}
			}
			
			if(saldomesproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						saldomesproductosSeleccionados.addAll(this.saldomesproductoLogic.getSaldoMesProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						saldomesproductosSeleccionados.addAll(this.saldomesproductos);				
					}
				}
			}
		} else {
			saldomesproductosSeleccionados.add(this.saldomesproducto);
		}
		
		return saldomesproductosSeleccionados;
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
	
	public void generarReporteSaldoMesProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSaldoMesProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSaldoMesProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldoMesProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldoMesProductosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Saldo Mes Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSaldoMesProductosSeleccionados() throws Exception {
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();		
		
		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSaldoMesProductos("Todos",saldomesproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalSaldoMesProductosSeleccionados() throws Exception {
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();		
		
		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSaldoMesProductos("Todos",saldomesproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSaldoMesProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();
		
		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSaldoMesProductos("Todos",saldomesproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSaldoMesProductosSeleccionados() throws Exception {
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSaldoMesProducto();
		
		
		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSaldoMesProducto();
		
		
		//this.generarReporteSaldoMesProductos("Todos",saldomesproductosSeleccionados ,saldomesproductoImplementable,saldomesproductoImplementableHome);
	}
	
	public void mostrarImportacionSaldoMesProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSaldoMesProducto();
		
		this.abrirFrameImportacionSaldoMesProducto();		
		
			
		//this.generarReporteSaldoMesProductos("Todos",saldomesproductosSeleccionados ,saldomesproductoImplementable,saldomesproductoImplementableHome);
	}
	
	public void importarSaldoMesProductos() throws Exception {		
	
	}
	
	public void exportarSaldoMesProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSaldoMesProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSaldoMesProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSaldoMesProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Saldo Mes Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSaldoMesProductosSeleccionados() throws Exception {
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();		
		
		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldomesproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSaldoMesProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SaldoMesProducto saldomesproductoAux:saldomesproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSaldoMesProducto(saldomesproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//saldomesproductoAux.setsDetalleGeneralEntityReporte(saldomesproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSaldoMesProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_SALDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoMesProductoConstantesFunciones.LABEL_COSTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSaldoMesProducto(SaldoMesProducto saldomesproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=saldomesproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=saldomesproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldomesproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldomesproducto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldomesproducto.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldomesproducto.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldomesproducto.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldomesproducto.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldomesproducto.getsaldo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldomesproducto.getcosto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSaldoMesProductosSeleccionados() throws Exception {
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();		
		
		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldomesproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SaldoMesProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSaldoMesProducto(row);				
				iRow++;
			}				
			
			for(SaldoMesProducto saldomesproductoAux:saldomesproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSaldoMesProducto(saldomesproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSaldoMesProductosSeleccionados() throws Exception {
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();		
		
		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldomesproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("saldomesproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("saldomesproducto");
			//elementRoot.appendChild(element);
		
			for(SaldoMesProducto saldomesproductoAux:saldomesproductosSeleccionados) {
				element = document.createElement("saldomesproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSaldoMesProducto(saldomesproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Mes Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSaldoMesProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_SALDO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoMesProductoConstantesFunciones.LABEL_COSTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSaldoMesProducto(SaldoMesProducto saldomesproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(saldomesproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(saldomesproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldomesproducto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldomesproducto.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldomesproducto.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldomesproducto.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldomesproducto.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldomesproducto.getsaldo());
		cell = row.createCell(iColumn++);cell.setCellValue(saldomesproducto.getcosto());				
	}
	
	public void setFilaDatosExportarXmlSaldoMesProducto(SaldoMesProducto saldomesproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SaldoMesProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(saldomesproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SaldoMesProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(saldomesproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SaldoMesProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(saldomesproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(SaldoMesProductoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(saldomesproducto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(SaldoMesProductoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(saldomesproducto.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(SaldoMesProductoConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(saldomesproducto.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementanio_descripcion = document.createElement(SaldoMesProductoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(saldomesproducto.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(SaldoMesProductoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(saldomesproducto.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementsaldo = document.createElement(SaldoMesProductoConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(saldomesproducto.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);

		Element elementcosto = document.createElement(SaldoMesProductoConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(saldomesproducto.getcosto().toString().trim()));
		element.appendChild(elementcosto);
	}
	
	public void generarReporteGroupGenericoSaldoMesProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SaldoMesProducto> saldomesproductosSeleccionados=new ArrayList<SaldoMesProducto>();
		
		saldomesproductosSeleccionados=this.getSaldoMesProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSaldoMesProducto(saldomesproductosSeleccionados);
		
		this.generarReporteSaldoMesProductos("Todos",saldomesproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSaldoMesProducto(ArrayList<SaldoMesProducto> saldomesproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SaldoMesProducto saldomesproductoAux:saldomesproductosSeleccionados) {
				saldomesproductoAux.setsDetalleGeneralEntityReporte(saldomesproductoAux.toString());
			
				if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					saldomesproductoAux.setsDescripcionGeneralEntityReporte1(saldomesproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					saldomesproductoAux.setsDescripcionGeneralEntityReporte1(saldomesproductoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					saldomesproductoAux.setsDescripcionGeneralEntityReporte1(saldomesproductoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					saldomesproductoAux.setsDescripcionGeneralEntityReporte1(saldomesproductoAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					saldomesproductoAux.setsDescripcionGeneralEntityReporte1(saldomesproductoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoMesProductoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					saldomesproductoAux.setsDescripcionGeneralEntityReporte1(saldomesproductoAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoMesProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSaldoMesProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSaldoMesProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=true;
				this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=true;
			}
			
			this.isVisibilidadCeldaModificarSaldoMesProducto=false;
			this.isVisibilidadCeldaActualizarSaldoMesProducto=false;
			this.isVisibilidadCeldaEliminarSaldoMesProducto=false;
			this.isVisibilidadCeldaCancelarSaldoMesProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSaldoMesProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=false;
			this.isVisibilidadCeldaModificarSaldoMesProducto=false;
			this.isVisibilidadCeldaActualizarSaldoMesProducto=true;
			this.isVisibilidadCeldaEliminarSaldoMesProducto=false;
			this.isVisibilidadCeldaCancelarSaldoMesProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSaldoMesProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=false;
			this.isVisibilidadCeldaModificarSaldoMesProducto=false;
			this.isVisibilidadCeldaActualizarSaldoMesProducto=true;
			this.isVisibilidadCeldaEliminarSaldoMesProducto=true;
			this.isVisibilidadCeldaCancelarSaldoMesProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSaldoMesProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=false;
			this.isVisibilidadCeldaModificarSaldoMesProducto=false;
			this.isVisibilidadCeldaActualizarSaldoMesProducto=true;
			this.isVisibilidadCeldaEliminarSaldoMesProducto=false;
			this.isVisibilidadCeldaCancelarSaldoMesProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSaldoMesProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=true;
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=true;
			this.isVisibilidadCeldaModificarSaldoMesProducto=false;
			this.isVisibilidadCeldaActualizarSaldoMesProducto=false;
			this.isVisibilidadCeldaEliminarSaldoMesProducto=false;
			this.isVisibilidadCeldaCancelarSaldoMesProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSaldoMesProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=false;
			this.isVisibilidadCeldaActualizarSaldoMesProducto=false;
			this.isVisibilidadCeldaEliminarSaldoMesProducto=false;
			this.isVisibilidadCeldaCancelarSaldoMesProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSaldoMesProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=false;
			this.isVisibilidadCeldaModificarSaldoMesProducto=true;
			this.isVisibilidadCeldaActualizarSaldoMesProducto=false;
			this.isVisibilidadCeldaEliminarSaldoMesProducto=false;
			this.isVisibilidadCeldaCancelarSaldoMesProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldoMesProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SaldoMesProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSaldoMesProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=true;
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=true;
		} else {
			this.actualizarEstadoPanelsSaldoMesProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSaldoMesProducto=false;
			//this.isVisibilidadCeldaVerFormSaldoMesProducto=false;
			this.isVisibilidadCeldaDuplicarSaldoMesProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!saldomesproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoSaldoMesProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoMesProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			if(!saldomesproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;												
			}
			
			this.jButtonCerrarSaldoMesProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSaldoMesProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.saldomesproducto)) {
			this.isVisibilidadCeldaActualizarSaldoMesProducto=false;
			this.isVisibilidadCeldaEliminarSaldoMesProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSaldoMesProducto() {
	}
	
	public void actualizarEstadoPanelsSaldoMesProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSaldoMesProducto!=null) {
				this.jScrollPanelDatosEdicionSaldoMesProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoMesProducto!=null) {
				this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldoMesProducto!=null) {
				this.jScrollPanelDatosSaldoMesProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldoMesProducto!=null) {
				this.jPanelPaginacionSaldoMesProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldoMesProducto!=null) {
				this.jPanelParametrosReportesSaldoMesProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSaldoMesProducto!=null) {
				this.jScrollPanelDatosEdicionSaldoMesProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoMesProducto!=null) {
				this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSaldoMesProducto!=null) {
				this.jScrollPanelDatosSaldoMesProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldoMesProducto!=null) {
				this.jPanelPaginacionSaldoMesProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldoMesProducto!=null) {
				this.jPanelParametrosReportesSaldoMesProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSaldoMesProducto!=null) {
				this.jScrollPanelDatosEdicionSaldoMesProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoMesProducto!=null) {
				this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldoMesProducto!=null) {
				this.jScrollPanelDatosSaldoMesProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldoMesProducto!=null) {
				this.jPanelPaginacionSaldoMesProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldoMesProducto!=null) {
				this.jPanelParametrosReportesSaldoMesProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSaldoMesProducto!=null) {
				this.jScrollPanelDatosEdicionSaldoMesProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoMesProducto!=null) {
				this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldoMesProducto!=null) {
				this.jScrollPanelDatosSaldoMesProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldoMesProducto!=null) {
				this.jPanelPaginacionSaldoMesProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldoMesProducto!=null) {
				this.jPanelParametrosReportesSaldoMesProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSaldoMesProducto!=null) {
				this.jScrollPanelDatosEdicionSaldoMesProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoMesProducto!=null) {
				this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldoMesProducto!=null) {
				this.jScrollPanelDatosSaldoMesProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldoMesProducto!=null) {
				this.jPanelPaginacionSaldoMesProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldoMesProducto!=null) {
				this.jPanelParametrosReportesSaldoMesProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSaldoMesProducto!=null) {
				this.jScrollPanelDatosEdicionSaldoMesProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoMesProducto!=null) {
				this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldoMesProducto!=null) {
				this.jScrollPanelDatosSaldoMesProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldoMesProducto!=null) {
				this.jPanelPaginacionSaldoMesProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldoMesProducto!=null) {
				this.jPanelParametrosReportesSaldoMesProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSaldoMesProducto!=null) {
				this.jScrollPanelDatosEdicionSaldoMesProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoMesProducto!=null) {
				this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldoMesProducto!=null) {
				this.jScrollPanelDatosSaldoMesProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldoMesProducto!=null) {
				this.jPanelPaginacionSaldoMesProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldoMesProducto!=null) {
				this.jPanelParametrosReportesSaldoMesProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSaldoMesProducto!=null) {
					this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSaldoMesProducto!=null) {
				this.jPanelParametrosReportesSaldoMesProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoMesProducto!=null) {
				this.jTabbedPaneBusquedasSaldoMesProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSaldoMesProducto!=null) {
				this.jPanelParametrosReportesSaldoMesProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdAnioSaldoMesProducto);}

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdBodegaSaldoMesProducto);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdMesSaldoMesProducto);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdProductoSaldoMesProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAnio=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdAnioSaldoMesProducto);}

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdBodegaSaldoMesProducto);}

			this.isVisibilidadFK_IdMes=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdMesSaldoMesProducto);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdProductoSaldoMesProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdAnio=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdAnioSaldoMesProducto);}

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdBodegaSaldoMesProducto);}

			this.isVisibilidadFK_IdMes=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdMesSaldoMesProducto);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdProductoSaldoMesProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdAnio=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdAnioSaldoMesProducto);}

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdBodegaSaldoMesProducto);}

			this.isVisibilidadFK_IdMes=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdMesSaldoMesProducto);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdProductoSaldoMesProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdAnioSaldoMesProducto);}

			this.isVisibilidadFK_IdBodega=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdBodegaSaldoMesProducto);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdMesSaldoMesProducto);}

			this.isVisibilidadFK_IdProducto=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdProductoSaldoMesProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdAnioSaldoMesProducto);}

			this.isVisibilidadFK_IdBodega=isParaMesNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdBodegaSaldoMesProducto);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdMesSaldoMesProducto);}

			this.isVisibilidadFK_IdProducto=isParaMesNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasSaldoMesProducto.remove(jPanelFK_IdProductoSaldoMesProducto);}
		}
		
	}
	
	
	
	

	public String registrarSesionSaldoMesProductoParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(saldomesproductoSessionBean==null) {
				saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(saldomesproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.saldomesproductoFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(SaldoMesProductoConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionSaldoMesProducto(true);
			//productoSessionBean.setlidSaldoMesProductoActual(this.idSaldoMesProductoActual);

			saldomesproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySaldoMesProducto(true);
			saldomesproductoSessionBean.setlIdSaldoMesProductoActualForeignKey(this.idSaldoMesProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SaldoMesProductoSessionBean saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
		
		if(this.saldomesproductoSessionBean==null) {
			this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
		}
		
		this.saldomesproductoSessionBean.setsUltimaBusquedaSaldoMesProducto(this.getsAccionBusqueda());
		this.saldomesproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.saldomesproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			saldomesproductoSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			saldomesproductoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			saldomesproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			saldomesproductoSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			saldomesproductoSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			saldomesproductoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SaldoMesProductoSessionBean saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
		
		if(this.saldomesproductoSessionBean==null) {
			this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
		}
		
		if(this.saldomesproductoSessionBean.getsUltimaBusquedaSaldoMesProducto()!=null&&!this.saldomesproductoSessionBean.getsUltimaBusquedaSaldoMesProducto().equals("")) {
			this.setsAccionBusqueda(saldomesproductoSessionBean.getsUltimaBusquedaSaldoMesProducto());
			this.setiNumeroPaginacion(saldomesproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(saldomesproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(saldomesproductoSessionBean.getid_anio());
				saldomesproductoSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(saldomesproductoSessionBean.getid_bodega());
				saldomesproductoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(saldomesproductoSessionBean.getid_empresa());
				saldomesproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(saldomesproductoSessionBean.getid_mes());
				saldomesproductoSessionBean.setid_mes(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(saldomesproductoSessionBean.getid_producto());
				saldomesproductoSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(saldomesproductoSessionBean.getid_sucursal());
				saldomesproductoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.saldomesproductoSessionBean.setsUltimaBusquedaSaldoMesProducto("");
		this.saldomesproductoSessionBean.setiNumeroPaginacion(SaldoMesProductoConstantesFunciones.INUMEROPAGINACION);
		this.saldomesproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSaldoMesProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSaldoMesProducto() {
		this.updateBorderResaltarBusquedasFormularioSaldoMesProducto();
		this.updateVisibilidadBusquedasFormularioSaldoMesProducto();
		this.updateHabilitarBusquedasFormularioSaldoMesProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioSaldoMesProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSaldoMesProducto.getComponents().length>0) {
	

		if(this.saldomesproductoConstantesFunciones.resaltarFK_IdAnioSaldoMesProducto!=null) {
			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdAnioSaldoMesProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
				jPanel.setBorder(this.saldomesproductoConstantesFunciones.resaltarFK_IdAnioSaldoMesProducto);
			}
		}

		if(this.saldomesproductoConstantesFunciones.resaltarFK_IdBodegaSaldoMesProducto!=null) {
			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdBodegaSaldoMesProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
				jPanel.setBorder(this.saldomesproductoConstantesFunciones.resaltarFK_IdBodegaSaldoMesProducto);
			}
		}

		if(this.saldomesproductoConstantesFunciones.resaltarFK_IdMesSaldoMesProducto!=null) {
			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdMesSaldoMesProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
				jPanel.setBorder(this.saldomesproductoConstantesFunciones.resaltarFK_IdMesSaldoMesProducto);
			}
		}

		if(this.saldomesproductoConstantesFunciones.resaltarFK_IdProductoSaldoMesProducto!=null) {
			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdProductoSaldoMesProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
				jPanel.setBorder(this.saldomesproductoConstantesFunciones.resaltarFK_IdProductoSaldoMesProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSaldoMesProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSaldoMesProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdAnioSaldoMesProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.saldomesproductoConstantesFunciones.mostrarFK_IdAnioSaldoMesProducto);
			if(!this.saldomesproductoConstantesFunciones.mostrarFK_IdAnioSaldoMesProducto && index>-1) {
				this.jTabbedPaneBusquedasSaldoMesProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdBodegaSaldoMesProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.saldomesproductoConstantesFunciones.mostrarFK_IdBodegaSaldoMesProducto);
			if(!this.saldomesproductoConstantesFunciones.mostrarFK_IdBodegaSaldoMesProducto && index>-1) {
				this.jTabbedPaneBusquedasSaldoMesProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdMesSaldoMesProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.saldomesproductoConstantesFunciones.mostrarFK_IdMesSaldoMesProducto);
			if(!this.saldomesproductoConstantesFunciones.mostrarFK_IdMesSaldoMesProducto && index>-1) {
				this.jTabbedPaneBusquedasSaldoMesProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdProductoSaldoMesProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.saldomesproductoConstantesFunciones.mostrarFK_IdProductoSaldoMesProducto);
			if(!this.saldomesproductoConstantesFunciones.mostrarFK_IdProductoSaldoMesProducto && index>-1) {
				this.jTabbedPaneBusquedasSaldoMesProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSaldoMesProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSaldoMesProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdAnioSaldoMesProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.saldomesproductoConstantesFunciones.activarFK_IdAnioSaldoMesProducto);
				this.jTabbedPaneBusquedasSaldoMesProducto.setEnabledAt(index,this.saldomesproductoConstantesFunciones.activarFK_IdAnioSaldoMesProducto);
			}

			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdBodegaSaldoMesProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.saldomesproductoConstantesFunciones.activarFK_IdBodegaSaldoMesProducto);
				this.jTabbedPaneBusquedasSaldoMesProducto.setEnabledAt(index,this.saldomesproductoConstantesFunciones.activarFK_IdBodegaSaldoMesProducto);
			}

			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdMesSaldoMesProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.saldomesproductoConstantesFunciones.activarFK_IdMesSaldoMesProducto);
				this.jTabbedPaneBusquedasSaldoMesProducto.setEnabledAt(index,this.saldomesproductoConstantesFunciones.activarFK_IdMesSaldoMesProducto);
			}

			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdProductoSaldoMesProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.saldomesproductoConstantesFunciones.activarFK_IdProductoSaldoMesProducto);
				this.jTabbedPaneBusquedasSaldoMesProducto.setEnabledAt(index,this.saldomesproductoConstantesFunciones.activarFK_IdProductoSaldoMesProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSaldoMesProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdAnioSaldoMesProducto);

			this.jTabbedPaneBusquedasSaldoMesProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);

			this.saldomesproductoConstantesFunciones.setResaltarFK_IdAnioSaldoMesProducto(resaltar);

			jPanel.setBorder(this.saldomesproductoConstantesFunciones.resaltarFK_IdAnioSaldoMesProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdBodegaSaldoMesProducto);

			this.jTabbedPaneBusquedasSaldoMesProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);

			this.saldomesproductoConstantesFunciones.setResaltarFK_IdBodegaSaldoMesProducto(resaltar);

			jPanel.setBorder(this.saldomesproductoConstantesFunciones.resaltarFK_IdBodegaSaldoMesProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdMesSaldoMesProducto);

			this.jTabbedPaneBusquedasSaldoMesProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);

			this.saldomesproductoConstantesFunciones.setResaltarFK_IdMesSaldoMesProducto(resaltar);

			jPanel.setBorder(this.saldomesproductoConstantesFunciones.resaltarFK_IdMesSaldoMesProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasSaldoMesProducto.indexOfComponent(this.jPanelFK_IdProductoSaldoMesProducto);

			this.jTabbedPaneBusquedasSaldoMesProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoMesProducto.getComponent(index);

			this.saldomesproductoConstantesFunciones.setResaltarFK_IdProductoSaldoMesProducto(resaltar);

			jPanel.setBorder(this.saldomesproductoConstantesFunciones.resaltarFK_IdProductoSaldoMesProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSaldoMesProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSaldoMesProducto() throws Exception {

		if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSaldoMesProducto();
		this.updateVisibilidadResaltarControlesFormularioSaldoMesProducto();
		this.updateHabilitarResaltarControlesFormularioSaldoMesProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioSaldoMesProducto() throws Exception {
		if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.saldomesproductoConstantesFunciones.resaltaridSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto!=null) {this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.setBorder(this.saldomesproductoConstantesFunciones.resaltaridSaldoMesProducto);}
		if(this.saldomesproductoConstantesFunciones.resaltarid_empresaSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto!=null) {this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.setBorder(this.saldomesproductoConstantesFunciones.resaltarid_empresaSaldoMesProducto);}
		if(this.saldomesproductoConstantesFunciones.resaltarid_sucursalSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto!=null) {this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.setBorder(this.saldomesproductoConstantesFunciones.resaltarid_sucursalSaldoMesProducto);}
		if(this.saldomesproductoConstantesFunciones.resaltarid_bodegaSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto!=null) {this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.setBorder(this.saldomesproductoConstantesFunciones.resaltarid_bodegaSaldoMesProducto);}
		if(this.saldomesproductoConstantesFunciones.resaltarid_productoSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto!=null) {this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.setBorder(this.saldomesproductoConstantesFunciones.resaltarid_productoSaldoMesProducto);}
		if(this.saldomesproductoConstantesFunciones.resaltarid_anioSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto!=null) {this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.setBorder(this.saldomesproductoConstantesFunciones.resaltarid_anioSaldoMesProducto);}
		if(this.saldomesproductoConstantesFunciones.resaltarid_mesSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto!=null) {this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.setBorder(this.saldomesproductoConstantesFunciones.resaltarid_mesSaldoMesProducto);}
		if(this.saldomesproductoConstantesFunciones.resaltarsaldoSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto!=null) {this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldsaldoSaldoMesProducto.setBorder(this.saldomesproductoConstantesFunciones.resaltarsaldoSaldoMesProducto);}
		if(this.saldomesproductoConstantesFunciones.resaltarcostoSaldoMesProducto!=null && this.jInternalFrameDetalleFormSaldoMesProducto!=null) {this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldcostoSaldoMesProducto.setBorder(this.saldomesproductoConstantesFunciones.resaltarcostoSaldoMesProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSaldoMesProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
	
		//this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostraridSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jPanelidSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostraridSaldoMesProducto);
		//this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_empresaSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jPanelid_empresaSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_empresaSaldoMesProducto);
		//this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_sucursalSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jPanelid_sucursalSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_sucursalSaldoMesProducto);
		//this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_bodegaSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jPanelid_bodegaSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_bodegaSaldoMesProducto);
		//this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_productoSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jPanelid_productoSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_productoSaldoMesProducto);
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_productoSaldoMesProducto);
		//this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_anioSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jPanelid_anioSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_anioSaldoMesProducto);
		//this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_mesSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jPanelid_mesSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarid_mesSaldoMesProducto);
		//this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldsaldoSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarsaldoSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jPanelsaldoSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarsaldoSaldoMesProducto);
		//this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldcostoSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarcostoSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jPanelcostoSaldoMesProducto.setVisible(this.saldomesproductoConstantesFunciones.mostrarcostoSaldoMesProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSaldoMesProducto() throws Exception {
		if(this.jInternalFrameDetalleFormSaldoMesProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldoMesProducto!=null) {
	
		this.jInternalFrameDetalleFormSaldoMesProducto.jLabelidSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activaridSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_empresaSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activarid_empresaSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_sucursalSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activarid_sucursalSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_bodegaSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activarid_bodegaSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_productoSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activarid_productoSaldoMesProducto);
			this.jInternalFrameDetalleFormSaldoMesProducto.jButtonid_productoSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activarid_productoSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_anioSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activarid_anioSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jComboBoxid_mesSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activarid_mesSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldsaldoSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activarsaldoSaldoMesProducto);
		this.jInternalFrameDetalleFormSaldoMesProducto.jTextFieldcostoSaldoMesProducto.setEnabled(this.saldomesproductoConstantesFunciones.activarcostoSaldoMesProducto);
		}
	}
	
		
}