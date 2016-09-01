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

import com.bydan.erp.facturacion.util.ParametroProductoConstantesFunciones;
import com.bydan.erp.facturacion.util.ParametroProductoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ParametroProductoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.ParametroProductoBean;
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
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ParametroProductoBeanSwingJInternalFrame extends ParametroProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroProducto> parametroproductoValidator = new ClassValidator<ParametroProducto>(ParametroProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroProducto parametroproducto;	
	public ParametroProducto parametroproductoAux;
	public ParametroProducto parametroproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroProducto parametroproductoTotales;
	public Long idParametroProductoActual;
	public Long iIdNuevoParametroProducto=0L;
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

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
	}

	public String sFinalQueryComboTipoTransaccionModulo="";

	public List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey;

	public List<TipoTransaccionModulo> gettipotransaccionmodulosForeignKey() {
		return tipotransaccionmodulosForeignKey;
	}

	public void settipotransaccionmodulosForeignKey(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey) {
		this.tipotransaccionmodulosForeignKey = tipotransaccionmodulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTransaccionModulo tipotransaccionmoduloForeignKey;

	public TipoTransaccionModulo gettipotransaccionmoduloForeignKey() {
		return tipotransaccionmoduloForeignKey;
	}

	public void settipotransaccionmoduloForeignKey(TipoTransaccionModulo tipotransaccionmoduloForeignKey) {
		this.tipotransaccionmoduloForeignKey = tipotransaccionmoduloForeignKey;
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

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
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
	
	public Boolean isPermisoTodoParametroProducto;
	public Boolean isPermisoNuevoParametroProducto;
	public Boolean isPermisoActualizarParametroProducto;
	public Boolean isPermisoActualizarOriginalParametroProducto;
	public Boolean isPermisoEliminarParametroProducto;
	public Boolean isPermisoGuardarCambiosParametroProducto;
	public Boolean isPermisoConsultaParametroProducto;
	public Boolean isPermisoBusquedaParametroProducto;
	public Boolean isPermisoReporteParametroProducto;
	public Boolean isPermisoPaginacionMedioParametroProducto;
	public Boolean isPermisoPaginacionAltoParametroProducto;
	public Boolean isPermisoPaginacionTodoParametroProducto;
	public Boolean isPermisoCopiarParametroProducto;
	public Boolean isPermisoVerFormParametroProducto;
	public Boolean isPermisoDuplicarParametroProducto;
	public Boolean isPermisoOrdenParametroProducto;
	
	
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
	
	public ParametroProductoParameterReturnGeneral parametroproductoReturnGeneral;
	public ParametroProductoParameterReturnGeneral parametroproductoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroProducto=false;
	public Boolean esParaAccionDesdeFormularioParametroProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroProductoSessionBeanAdditional parametroproductoSessionBeanAdditional=null;
	
	public ParametroProductoSessionBeanAdditional getParametroProductoSessionBeanAdditional() {
		return this.parametroproductoSessionBeanAdditional;
	}
	
	public void setParametroProductoSessionBeanAdditional(ParametroProductoSessionBeanAdditional parametroproductoSessionBeanAdditional) {
		try {
			this.parametroproductoSessionBeanAdditional=parametroproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroProductoBeanSwingJInternalFrameAdditional parametroproductoBeanSwingJInternalFrameAdditional=null;
	//public class ParametroProductoBeanSwingJInternalFrame
	
	public ParametroProductoBeanSwingJInternalFrameAdditional getParametroProductoBeanSwingJInternalFrameAdditional() {
		return this.parametroproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroProductoBeanSwingJInternalFrameAdditional(ParametroProductoBeanSwingJInternalFrameAdditional parametroproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.parametroproductoBeanSwingJInternalFrameAdditional=parametroproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroProductoLogic parametroproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroProducto parametroproductoBean;
	public ParametroProductoConstantesFunciones parametroproductoConstantesFunciones;
	//public ParametroProductoParameterReturnGeneral parametroproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ModuloLogic moduloLogic;
	public TransaccionLogic transaccionLogic;
	public TipoTransaccionModuloLogic tipotransaccionmoduloLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public FormatoLogic formatoLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroProducto> parametroproductos;	
	//public List<ParametroProducto> parametroproductosEliminados;
	//public List<ParametroProducto> parametroproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroProducto=false;
	public Boolean isVisibilidadCeldaDuplicarParametroProducto=true;
	public Boolean isVisibilidadCeldaCopiarParametroProducto=true;
	public Boolean isVisibilidadCeldaVerFormParametroProducto=true;
	public Boolean isVisibilidadCeldaOrdenParametroProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroProducto=false;
	public Boolean isVisibilidadCeldaModificarParametroProducto=false;
	public Boolean isVisibilidadCeldaActualizarParametroProducto=false;
	public Boolean isVisibilidadCeldaEliminarParametroProducto=false;
	public Boolean isVisibilidadCeldaCancelarParametroProducto=false;
	public Boolean isVisibilidadCeldaGuardarParametroProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroProducto=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFormato=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoTransaccionModulo=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoParametroProducto() {
		return this.iIdNuevoParametroProducto;
	}

	public void setiIdNuevoParametroProducto(Long iIdNuevoParametroProducto) {
		this.iIdNuevoParametroProducto = iIdNuevoParametroProducto;
	}
	
	public Long getidParametroProductoActual() {
		return this.idParametroProductoActual;
	}

	public void setidParametroProductoActual(Long idParametroProductoActual) {
		this.idParametroProductoActual = idParametroProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroProducto getparametroproducto() {
		return this.parametroproducto;
	}

	public void setparametroproducto(ParametroProducto parametroproducto) {
		this.parametroproducto = parametroproducto;
	}
	
	public ParametroProducto getparametroproductoAux() {
		return this.parametroproductoAux;
	}

	public void setparametroproductoAux(ParametroProducto parametroproductoAux) {
		this.parametroproductoAux = parametroproductoAux;
	}				
	
	public ParametroProducto getparametroproductoAnterior() {
		return this.parametroproductoAnterior;
	}

	public void setparametroproductoAnterior(ParametroProducto parametroproductoAnterior) {
		this.parametroproductoAnterior = parametroproductoAnterior;
	}	
	
	public ParametroProducto getparametroproductoTotales() {
		return this.parametroproductoTotales;
	}

	public void setparametroproductoTotales(ParametroProducto parametroproductoTotales) {
		this.parametroproductoTotales = parametroproductoTotales;
	}	
	
	public ParametroProducto getparametroproductoBean() {
		return this.parametroproductoBean;
	}

	public void setparametroproductoBean(ParametroProducto parametroproductoBean) {
		this.parametroproductoBean = parametroproductoBean;
	}	
	
	public ParametroProductoParameterReturnGeneral getparametroproductoReturnGeneral() {
		return this.parametroproductoReturnGeneral;
	}

	public void setparametroproductoReturnGeneral(ParametroProductoParameterReturnGeneral parametroproductoReturnGeneral) {
		this.parametroproductoReturnGeneral = parametroproductoReturnGeneral;
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

	public Long id_formatoFK_IdFormato=null;

	public Long getid_formatoFK_IdFormato() {
		return this.id_formatoFK_IdFormato;
	}

	public void setid_formatoFK_IdFormato(Long id_formatoFK_IdFormato) {
		this.id_formatoFK_IdFormato = id_formatoFK_IdFormato;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
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

	public Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo=null;

	public Long getid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo() {
		return this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

	public void setid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo(Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo) {
		this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo = id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroProductoLogic getParametroProductoLogic()	{		
		return parametroproductoLogic;
	}

	public void setParametroProductoLogic(ParametroProductoLogic parametroproductoLogic) {
		this.parametroproductoLogic = parametroproductoLogic;
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
	
	public Boolean getIsEsNuevoParametroProducto() {
		return isEsNuevoParametroProducto;
	}

	public void setIsEsNuevoParametroProducto(Boolean isEsNuevoParametroProducto) {
		this.isEsNuevoParametroProducto = isEsNuevoParametroProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroProducto() {
		return esParaAccionDesdeFormularioParametroProducto;
	}
	
	public void setEsParaAccionDesdeFormularioParametroProducto(Boolean esParaAccionDesdeFormularioParametroProducto) {
		this.esParaAccionDesdeFormularioParametroProducto = esParaAccionDesdeFormularioParametroProducto;
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

			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametroproductoSessionBean.getlidEmpresaActual());
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

			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(parametroproductoSessionBean.getlidSucursalActual());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(parametroproductoSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametroproductoSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosTipoTransaccionModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTransaccionModuloLogic tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();

			//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

					tipotransaccionmoduloLogic.getTodosTipoTransaccionModulosWithConnection(sFinalQuery,new Pagination());

					this.tipotransaccionmodulosForeignKey=tipotransaccionmoduloLogic.getTipoTransaccionModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTransaccionModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getEntityWithConnection(parametroproductoSessionBean.getlidTipoTransaccionModuloActual());
					this.tipotransaccionmodulosForeignKey.add(tipotransaccionmoduloLogic.getTipoTransaccionModulo());
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

			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(parametroproductoSessionBean.getlidBodegaActual());
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

			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(parametroproductoSessionBean.getlidProductoActual());
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

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Formato formatoNulo = new Formato();

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.formatosForeignKey.add(0, formatoNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(parametroproductoSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
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

					if(this.parametroproducto!=null) {
						this.parametroproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroProductoGenerico)throws Exception
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
				jComboBoxid_empresaParametroProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroProductoGenerico!=null && jComboBoxid_empresaParametroProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroProductoGenerico.setSelectedIndex(0);
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

					if(this.parametroproducto!=null) {
						this.parametroproducto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalParametroProducto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalParametroProductoGenerico)throws Exception
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
				jComboBoxid_sucursalParametroProductoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalParametroProductoGenerico!=null && jComboBoxid_sucursalParametroProductoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalParametroProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.parametroproducto!=null) {
						this.parametroproducto.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloParametroProducto.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloFK_IdModuloParametroProducto!=null) {
						jComboBoxid_moduloFK_IdModuloParametroProducto.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloFK_IdModuloParametroProducto!=null) {
							//jComboBoxid_moduloFK_IdModuloParametroProducto.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloFK_IdModuloParametroProducto.getItemCount()>0) {
								jComboBoxid_moduloFK_IdModuloParametroProducto.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloParametroProductoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloParametroProductoGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloParametroProductoGenerico!=null && jComboBoxid_moduloParametroProductoGenerico.getItemCount()>0) {
					jComboBoxid_moduloParametroProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.parametroproducto!=null) {
						this.parametroproducto.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionParametroProducto.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.setSelectedIndex(0);
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

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionParametroProductoGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionParametroProductoGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionParametroProductoGenerico!=null && jComboBoxid_transaccionParametroProductoGenerico.getItemCount()>0) {
					jComboBoxid_transaccionParametroProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTransaccionModuloForeignKey(Long idTipoTransaccionModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipotransaccionmoduloTemp!=null) {

					if(this.parametroproducto!=null) {
						this.parametroproducto.setTipoTransaccionModulo(tipotransaccionmoduloTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.setSelectedItem(tipotransaccionmoduloTemp);
					}
				} else {
					//jComboBoxid_tipo_transaccion_moduloParametroProducto.setSelectedItem(tipotransaccionmoduloTemp);
					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.setSelectedIndex(0);
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

	public String getActualTipoTransaccionModuloForeignKeyDescripcion(Long idTipoTransaccionModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}


			sDescripcion=TipoTransaccionModuloConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTransaccionModuloForeignKeyGenerico(Long idTipoTransaccionModuloSeleccionado,JComboBox jComboBoxid_tipo_transaccion_moduloParametroProductoGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(tipotransaccionmoduloTemp!=null) {
				jComboBoxid_tipo_transaccion_moduloParametroProductoGenerico.setSelectedItem(tipotransaccionmoduloTemp);
			} else {
				if(jComboBoxid_tipo_transaccion_moduloParametroProductoGenerico!=null && jComboBoxid_tipo_transaccion_moduloParametroProductoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_transaccion_moduloParametroProductoGenerico.setSelectedIndex(0);
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

					if(this.parametroproducto!=null) {
						this.parametroproducto.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaParametroProducto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaParametroProductoGenerico)throws Exception
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
				jComboBoxid_bodegaParametroProductoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaParametroProductoGenerico!=null && jComboBoxid_bodegaParametroProductoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaParametroProductoGenerico.setSelectedIndex(0);
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

					if(this.parametroproducto!=null) {
						this.parametroproducto.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoParametroProducto.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoParametroProductoGenerico)throws Exception
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
				jComboBoxid_productoParametroProductoGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoParametroProductoGenerico!=null && jComboBoxid_productoParametroProductoGenerico.getItemCount()>0) {
					jComboBoxid_productoParametroProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.parametroproducto!=null) {
						this.parametroproducto.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoParametroProducto.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormParametroProducto!=null) {
						if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.setSelectedIndex(0);
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

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoParametroProductoGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoParametroProductoGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoParametroProductoGenerico!=null && jComboBoxid_formatoParametroProductoGenerico.getItemCount()>0) {
					jComboBoxid_formatoParametroProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroProducto parametroproducto,JComboBox jComboBoxid_empresaParametroProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametroproducto.setid_empresa(empresaAux.getId());
				parametroproducto.setempresa_descripcion(ParametroProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametroproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ParametroProducto parametroproducto,JComboBox jComboBoxid_sucursalParametroProductoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalParametroProductoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalParametroProductoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				parametroproducto.setid_sucursal(sucursalAux.getId());
				parametroproducto.setsucursal_descripcion(ParametroProductoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				parametroproducto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(ParametroProducto parametroproducto,JComboBox jComboBoxid_moduloParametroProductoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloParametroProductoGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloParametroProductoGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				parametroproducto.setid_modulo(moduloAux.getId());
				parametroproducto.setmodulo_descripcion(ParametroProductoConstantesFunciones.getModuloDescripcion(moduloAux));
				parametroproducto.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(ParametroProducto parametroproducto,JComboBox jComboBoxid_transaccionParametroProductoGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionParametroProductoGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionParametroProductoGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametroproducto.setid_transaccion(transaccionAux.getId());
				parametroproducto.settransaccion_descripcion(ParametroProductoConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				parametroproducto.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTransaccionModuloForeignKey(ParametroProducto parametroproducto,JComboBox jComboBoxid_tipo_transaccion_moduloParametroProductoGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloAux=new TipoTransaccionModulo();

			if(jComboBoxid_tipo_transaccion_moduloParametroProductoGenerico==null) {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.getSelectedItem();
			} else {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)jComboBoxid_tipo_transaccion_moduloParametroProductoGenerico.getSelectedItem();
			}

			if(tipotransaccionmoduloAux!=null) {
				parametroproducto.setid_tipo_transaccion_modulo(tipotransaccionmoduloAux.getId());
				parametroproducto.settipotransaccionmodulo_descripcion(ParametroProductoConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloAux));
				parametroproducto.setTipoTransaccionModulo(tipotransaccionmoduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ParametroProducto parametroproducto,JComboBox jComboBoxid_bodegaParametroProductoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaParametroProductoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaParametroProductoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				parametroproducto.setid_bodega(bodegaAux.getId());
				parametroproducto.setbodega_descripcion(ParametroProductoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				parametroproducto.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ParametroProducto parametroproducto,JComboBox jComboBoxid_productoParametroProductoGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoParametroProductoGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoParametroProductoGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				parametroproducto.setid_producto(productoAux.getId());
				parametroproducto.setproducto_descripcion(ParametroProductoConstantesFunciones.getProductoDescripcion(productoAux));
				parametroproducto.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(ParametroProducto parametroproducto,JComboBox jComboBoxid_formatoParametroProductoGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoParametroProductoGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoParametroProductoGenerico.getSelectedItem();
			}

			if(formatoAux!=null) {
				parametroproducto.setid_formato(formatoAux.getId());
				parametroproducto.setformato_descripcion(ParametroProductoConstantesFunciones.getFormatoDescripcion(formatoAux));
				parametroproducto.setFormato(formatoAux);			}
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

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
					}

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
					}

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
					}

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloFK_IdModuloParametroProducto.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloFK_IdModuloParametroProducto.addItem(modulo);
							}
						}

						if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
					}

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTransaccionModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTransaccionModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.removeAllItems();

							for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulosForeignKey) {
								this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.addItem(tipotransaccionmodulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
					}

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
					}

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
					}

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProducto!=null) { 
					}

					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloFK_IdModuloParametroProducto.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloFK_IdModuloParametroProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoTransaccionModuloForeignKey(TipoTransaccionModulo tipotransaccionmodulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.setSelectedItem(tipotransaccionmodulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProducto!=null) {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesParametroProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroProductoConstantesFunciones.refrescarForeignKeysDescripcionesParametroProducto(this.parametroproductoLogic.getParametroProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroProductoConstantesFunciones.refrescarForeignKeysDescripcionesParametroProducto(this.parametroproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(Transaccion.class));
		classes.add(new Classe(TipoTransaccionModulo.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Formato.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametroproductoLogic.setParametroProductos(this.parametroproductos);
			parametroproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroProductoParameterReturnGeneral getParametroProductoParameterGeneral() {
		return this.parametroproductoParameterGeneral;
	}
	
	public void setParametroProductoParameterGeneral(ParametroProductoParameterReturnGeneral parametroproductoParameterGeneral) {
		this.parametroproductoParameterGeneral = parametroproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroProducto() {
		return isPermisoTodoParametroProducto;
	}

	public void setIsPermisoTodoParametroProducto(Boolean isPermisoTodoParametroProducto) {
		this.isPermisoTodoParametroProducto = isPermisoTodoParametroProducto;
	}

	public Boolean getIsPermisoNuevoParametroProducto() {
		return isPermisoNuevoParametroProducto;
	}

	public void setIsPermisoNuevoParametroProducto(Boolean isPermisoNuevoParametroProducto) {
		this.isPermisoNuevoParametroProducto = isPermisoNuevoParametroProducto;
	}

	public Boolean getIsPermisoActualizarParametroProducto() {
		return isPermisoActualizarParametroProducto;
	}

	public void setIsPermisoActualizarParametroProducto(Boolean isPermisoActualizarParametroProducto) {
		this.isPermisoActualizarParametroProducto = isPermisoActualizarParametroProducto;
	}

	public Boolean getIsPermisoEliminarParametroProducto() {
		return isPermisoEliminarParametroProducto;
	}

	public void setIsPermisoEliminarParametroProducto(Boolean isPermisoEliminarParametroProducto) {
		this.isPermisoEliminarParametroProducto = isPermisoEliminarParametroProducto;
	}

	public Boolean getIsPermisoGuardarCambiosParametroProducto() {
		return isPermisoGuardarCambiosParametroProducto;
	}

	public void setIsPermisoGuardarCambiosParametroProducto(Boolean isPermisoGuardarCambiosParametroProducto) {
		this.isPermisoGuardarCambiosParametroProducto = isPermisoGuardarCambiosParametroProducto;
	}
	
	public Boolean getIsPermisoConsultaParametroProducto() {
		return isPermisoConsultaParametroProducto;
	}

	public void setIsPermisoConsultaParametroProducto(Boolean isPermisoConsultaParametroProducto) {
		this.isPermisoConsultaParametroProducto = isPermisoConsultaParametroProducto;
	}

	public Boolean getIsPermisoBusquedaParametroProducto() {
		return isPermisoBusquedaParametroProducto;
	}

	public void setIsPermisoBusquedaParametroProducto(Boolean isPermisoBusquedaParametroProducto) {
		this.isPermisoBusquedaParametroProducto = isPermisoBusquedaParametroProducto;
	}

	public Boolean getIsPermisoReporteParametroProducto() {
		return isPermisoReporteParametroProducto;
	}

	public void setIsPermisoReporteParametroProducto(Boolean isPermisoReporteParametroProducto) {
		this.isPermisoReporteParametroProducto = isPermisoReporteParametroProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroProducto() {
		return isPermisoPaginacionMedioParametroProducto;
	}

	public void setIsPermisoPaginacionMedioParametroProducto(Boolean isPermisoPaginacionMedioParametroProducto) {
		this.isPermisoPaginacionMedioParametroProducto = isPermisoPaginacionMedioParametroProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroProducto() {
		return isPermisoPaginacionTodoParametroProducto;
	}

	public void setIsPermisoPaginacionTodoParametroProducto(Boolean isPermisoPaginacionTodoParametroProducto) {
		this.isPermisoPaginacionTodoParametroProducto = isPermisoPaginacionTodoParametroProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroProducto() {
		return isPermisoPaginacionAltoParametroProducto;
	}

	public void setIsPermisoPaginacionAltoParametroProducto(Boolean isPermisoPaginacionAltoParametroProducto) {
		this.isPermisoPaginacionAltoParametroProducto = isPermisoPaginacionAltoParametroProducto;
	}
	
	public Boolean getIsPermisoCopiarParametroProducto() {
		return isPermisoCopiarParametroProducto;
	}

	public void setIsPermisoCopiarParametroProducto(Boolean isPermisoCopiarParametroProducto) {
		this.isPermisoCopiarParametroProducto = isPermisoCopiarParametroProducto;
	}
	
	public Boolean getIsPermisoVerFormParametroProducto() {
		return isPermisoVerFormParametroProducto;
	}

	public void setIsPermisoVerFormParametroProducto(Boolean isPermisoVerFormParametroProducto) {
		this.isPermisoVerFormParametroProducto = isPermisoVerFormParametroProducto;
	}
	
	public Boolean getIsPermisoDuplicarParametroProducto() {
		return isPermisoDuplicarParametroProducto;
	}

	public void setIsPermisoDuplicarParametroProducto(Boolean isPermisoDuplicarParametroProducto) {
		this.isPermisoDuplicarParametroProducto = isPermisoDuplicarParametroProducto;
	}
	
	public Boolean getIsPermisoOrdenParametroProducto() {
		return isPermisoOrdenParametroProducto;
	}

	public void setIsPermisoOrdenParametroProducto(Boolean isPermisoOrdenParametroProducto) {
		this.isPermisoOrdenParametroProducto = isPermisoOrdenParametroProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroProducto() {
		return isVisibilidadCeldaNuevoParametroProducto;
	}

	public void setIsVisibilidadCeldaNuevoParametroProducto(Boolean isVisibilidadCeldaNuevoParametroProducto) {
		this.isVisibilidadCeldaNuevoParametroProducto = isVisibilidadCeldaNuevoParametroProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroProducto() {
		return isVisibilidadCeldaDuplicarParametroProducto;
	}

	public void setIsVisibilidadCeldaDuplicarParametroProducto(Boolean isVisibilidadCeldaDuplicarParametroProducto) {
		this.isVisibilidadCeldaDuplicarParametroProducto = isVisibilidadCeldaDuplicarParametroProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroProducto() {
		return isVisibilidadCeldaCopiarParametroProducto;
	}

	public void setIsVisibilidadCeldaCopiarParametroProducto(Boolean isVisibilidadCeldaCopiarParametroProducto) {
		this.isVisibilidadCeldaCopiarParametroProducto = isVisibilidadCeldaCopiarParametroProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroProducto() {
		return isVisibilidadCeldaVerFormParametroProducto;
	}

	public void setIsVisibilidadCeldaVerFormParametroProducto(Boolean isVisibilidadCeldaVerFormParametroProducto) {
		this.isVisibilidadCeldaVerFormParametroProducto = isVisibilidadCeldaVerFormParametroProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroProducto() {
		return isVisibilidadCeldaOrdenParametroProducto;
	}

	public void setIsVisibilidadCeldaOrdenParametroProducto(Boolean isVisibilidadCeldaOrdenParametroProducto) {
		this.isVisibilidadCeldaOrdenParametroProducto = isVisibilidadCeldaOrdenParametroProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroProducto() {
		return isVisibilidadCeldaNuevoRelacionesParametroProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroProducto(Boolean isVisibilidadCeldaNuevoRelacionesParametroProducto) {
		this.isVisibilidadCeldaNuevoRelacionesParametroProducto = isVisibilidadCeldaNuevoRelacionesParametroProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroProducto() {
		return isVisibilidadCeldaModificarParametroProducto;
	}

	public void setIsVisibilidadCeldaModificarParametroProducto(Boolean isVisibilidadCeldaModificarParametroProducto) {
		this.isVisibilidadCeldaModificarParametroProducto = isVisibilidadCeldaModificarParametroProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroProducto() {
		return isVisibilidadCeldaActualizarParametroProducto;
	}

	public void setIsVisibilidadCeldaActualizarParametroProducto(Boolean isVisibilidadCeldaActualizarParametroProducto) {
		this.isVisibilidadCeldaActualizarParametroProducto = isVisibilidadCeldaActualizarParametroProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroProducto() {
		return isVisibilidadCeldaEliminarParametroProducto;
	}

	public void setIsVisibilidadCeldaEliminarParametroProducto(Boolean isVisibilidadCeldaEliminarParametroProducto) {
		this.isVisibilidadCeldaEliminarParametroProducto = isVisibilidadCeldaEliminarParametroProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroProducto() {
		return isVisibilidadCeldaCancelarParametroProducto;
	}

	public void setIsVisibilidadCeldaCancelarParametroProducto(Boolean isVisibilidadCeldaCancelarParametroProducto) {
		this.isVisibilidadCeldaCancelarParametroProducto = isVisibilidadCeldaCancelarParametroProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroProducto() {
		return isVisibilidadCeldaGuardarParametroProducto;
	}

	public void setIsVisibilidadCeldaGuardarParametroProducto(Boolean isVisibilidadCeldaGuardarParametroProducto) {
		this.isVisibilidadCeldaGuardarParametroProducto = isVisibilidadCeldaGuardarParametroProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroProducto() {
		return isVisibilidadCeldaGuardarCambiosParametroProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroProducto(Boolean isVisibilidadCeldaGuardarCambiosParametroProducto) {
		this.isVisibilidadCeldaGuardarCambiosParametroProducto = isVisibilidadCeldaGuardarCambiosParametroProducto;
	}
		
	public ParametroProductoSessionBean getparametroproductoSessionBean() {
		return this.parametroproductoSessionBean;
	}
	
	public void setparametroproductoSessionBean(ParametroProductoSessionBean parametroproductoSessionBean) {
		this.parametroproductoSessionBean=parametroproductoSessionBean;
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

	public Boolean getisVisibilidadFK_IdFormato() {
		return this.isVisibilidadFK_IdFormato;
	}

	public void setisVisibilidadFK_IdFormato(Boolean isVisibilidadFK_IdFormato) {
		this.isVisibilidadFK_IdFormato=isVisibilidadFK_IdFormato;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
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

	public Boolean getisVisibilidadFK_IdTipoTransaccionModulo() {
		return this.isVisibilidadFK_IdTipoTransaccionModulo;
	}

	public void setisVisibilidadFK_IdTipoTransaccionModulo(Boolean isVisibilidadFK_IdTipoTransaccionModulo) {
		this.isVisibilidadFK_IdTipoTransaccionModulo=isVisibilidadFK_IdTipoTransaccionModulo;
	}

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroProducto(ParametroProducto parametroproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametroproducto,null);
				this.setActualParaGuardarSucursalForeignKey(parametroproducto,null);
				this.setActualParaGuardarModuloForeignKey(parametroproducto,null);
				this.setActualParaGuardarTransaccionForeignKey(parametroproducto,null);
				this.setActualParaGuardarTipoTransaccionModuloForeignKey(parametroproducto,null);
				this.setActualParaGuardarBodegaForeignKey(parametroproducto,null);
				this.setActualParaGuardarProductoForeignKey(parametroproducto,null);
				this.setActualParaGuardarFormatoForeignKey(parametroproducto,null);
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
	
	public void bugActualizarReferenciaActual(ParametroProducto parametroproducto,ParametroProducto parametroproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroProducto(parametroproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametroproductoAux.setId(parametroproducto.getId());
		parametroproductoAux.setVersionRow(parametroproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroProducto();
		
			int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametroproductoValidator.getInvalidValues(this.parametroproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametroproductoLogic.setDatosCliente(datosCliente);
			parametroproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametroproductoAux=new  ParametroProducto();
				
				parametroproductoAux.setIsNew(true);
				parametroproductoAux.setIsChanged(true);
				
				parametroproductoAux.setParametroProductoOriginal(this.parametroproducto);
				
				parametroproductoAux.setId(this.parametroproducto.getId());	
				parametroproductoAux.setVersionRow(this.parametroproducto.getVersionRow());	
				parametroproductoAux.setid_empresa(this.parametroproducto.getid_empresa());	
				parametroproductoAux.setid_sucursal(this.parametroproducto.getid_sucursal());	
				parametroproductoAux.setid_modulo(this.parametroproducto.getid_modulo());	
				parametroproductoAux.setid_transaccion(this.parametroproducto.getid_transaccion());	
				parametroproductoAux.setid_tipo_transaccion_modulo(this.parametroproducto.getid_tipo_transaccion_modulo());	
				parametroproductoAux.setid_bodega(this.parametroproducto.getid_bodega());	
				parametroproductoAux.setid_producto(this.parametroproducto.getid_producto());	
				
				if(this.parametroproducto.getid_formato()!=null && this.parametroproducto.getid_formato()>0L) {
					parametroproductoAux.setid_formato(this.parametroproducto.getid_formato());
				} else {
					parametroproductoAux.setid_formato(null);
				}	
				parametroproductoAux.setdescripcion(this.parametroproducto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametroproductoAux,parametroproductoLogic.getParametroProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroproductoAux,parametroproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametroproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductoLogic.saveParametroProductos();//WithConnection
						//parametroproductoLogic.getSetVersionRowParametroProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroproducto,parametroproductoAux);
					
					this.refrescarForeignKeysDescripcionesParametroProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroproductoLogic.saveParametroProductoRelaciones(parametroproductoAux);//WithConnection
								//parametroproductoLogic.getSetVersionRowParametroProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametroproducto,parametroproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametroproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametroproductoAux,parametroproductoLogic.getParametroProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametroproductoAux,parametroproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametroproducto,parametroproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametroproductoAux=new  ParametroProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametroproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.parametroproductoSessionBean.getEsGuardarRelacionado() && this.parametroproducto.getId()>=0)) {
						
					parametroproductoAux.setIsNew(false);
				}
				
				parametroproductoAux.setIsDeleted(false);
			
				parametroproductoAux.setId(this.parametroproducto.getId());	
				parametroproductoAux.setVersionRow(this.parametroproducto.getVersionRow());	
				parametroproductoAux.setid_empresa(this.parametroproducto.getid_empresa());	
				parametroproductoAux.setid_sucursal(this.parametroproducto.getid_sucursal());	
				parametroproductoAux.setid_modulo(this.parametroproducto.getid_modulo());	
				parametroproductoAux.setid_transaccion(this.parametroproducto.getid_transaccion());	
				parametroproductoAux.setid_tipo_transaccion_modulo(this.parametroproducto.getid_tipo_transaccion_modulo());	
				parametroproductoAux.setid_bodega(this.parametroproducto.getid_bodega());	
				parametroproductoAux.setid_producto(this.parametroproducto.getid_producto());	
				
				if(this.parametroproducto.getid_formato()!=null && this.parametroproducto.getid_formato()>0L) {
					parametroproductoAux.setid_formato(this.parametroproducto.getid_formato());
				} else {
					parametroproductoAux.setid_formato(null);
				}	
				parametroproductoAux.setdescripcion(this.parametroproducto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroproductoAux,parametroproductoLogic.getParametroProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroproductoAux,parametroproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametroproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductoLogic.saveParametroProductos();//WithConnection
						//parametroproductoLogic.getSetVersionRowParametroProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroproducto,parametroproductoAux);
					
					this.refrescarForeignKeysDescripcionesParametroProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroproductoLogic.saveParametroProductoRelaciones(parametroproductoAux);//WithConnection
								//parametroproductoLogic.getSetVersionRowParametroProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametroproducto,parametroproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametroproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametroproductoAux,parametroproductoLogic.getParametroProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametroproductoAux,parametroproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametroproducto,parametroproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametroproductoAux=new  ParametroProducto();
				
				parametroproductoAux.setIsNew(false);
				parametroproductoAux.setIsChanged(false);
				
				parametroproductoAux.setIsDeleted(true);
				
				parametroproductoAux.setId(this.parametroproducto.getId());	
				parametroproductoAux.setVersionRow(this.parametroproducto.getVersionRow());	
				parametroproductoAux.setid_empresa(this.parametroproducto.getid_empresa());	
				parametroproductoAux.setid_sucursal(this.parametroproducto.getid_sucursal());	
				parametroproductoAux.setid_modulo(this.parametroproducto.getid_modulo());	
				parametroproductoAux.setid_transaccion(this.parametroproducto.getid_transaccion());	
				parametroproductoAux.setid_tipo_transaccion_modulo(this.parametroproducto.getid_tipo_transaccion_modulo());	
				parametroproductoAux.setid_bodega(this.parametroproducto.getid_bodega());	
				parametroproductoAux.setid_producto(this.parametroproducto.getid_producto());	
				
				if(this.parametroproducto.getid_formato()!=null && this.parametroproducto.getid_formato()>0L) {
					parametroproductoAux.setid_formato(this.parametroproducto.getid_formato());
				} else {
					parametroproductoAux.setid_formato(null);
				}	
				parametroproductoAux.setdescripcion(this.parametroproducto.getdescripcion());	
				
				if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametroproductoAux.getId()>=0) {	
						this.parametroproductosEliminados.add(parametroproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametroproductoAux,parametroproductoLogic.getParametroProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroproductoAux,parametroproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametroproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductoLogic.saveParametroProductos();//WithConnection
						//parametroproductoLogic.getSetVersionRowParametroProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroproductoLogic.saveParametroProductoRelaciones(parametroproductoAux);//WithConnection
								//parametroproductoLogic.getSetVersionRowParametroProductos();//WithConnection
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
							if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametroproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametroproductoAux,parametroproductoLogic.getParametroProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametroproductoAux,parametroproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getParametroProductos().addAll(this.parametroproductosEliminados);
					
					parametroproductoLogic.saveParametroProductos();//WithConnection
					//parametroproductoLogic.getSetVersionRowParametroProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroProducto();
				
				this.parametroproductosEliminados= new ArrayList<ParametroProducto>();		
			}
			
			if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametroproducto=parametroproductoAux;
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
      		//this.finishProcessParametroProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroProducto parametroproductoLocal) throws Exception {
		
		if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroProducto parametroproductoLocal) throws Exception {	
		if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametroproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				parametroproductoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				parametroproductoLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				parametroproductoLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTransaccionModuloDetalleFormJInternalFrame.class)) {
				TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrameLocal=(TipoTransaccionModuloBeanSwingJInternalFrame) ((TipoTransaccionModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.gettipotransaccionmodulo(),true);
				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarLista(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo,this.tipotransaccionmodulosForeignKey);

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				parametroproductoLocal.setTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey("Formulario");
				this.setActualTipoTransaccionModuloForeignKey(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				parametroproductoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				parametroproductoLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				parametroproductoLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametroproductoValidator.getInvalidValues(this.parametroproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroProducto parametroproducto,List<ParametroProducto> parametroproductos) throws Exception {
		try	{		
			ParametroProductoConstantesFunciones.actualizarLista(parametroproducto,parametroproductos,this.parametroproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroProducto parametroproducto,List<ParametroProducto> parametroproductos) throws Exception {
		try	{			
			ParametroProductoConstantesFunciones.actualizarSelectedLista(parametroproducto,parametroproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroProducto> parametroproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametroproductosLocal=this.parametroproductoLogic.getParametroProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametroproductosLocal=this.parametroproductos;
			}
			//ARCHITECTURE
		
			for(ParametroProducto parametroproductoLocal:parametroproductosLocal) {
				if(this.permiteMantenimiento(parametroproductoLocal) && parametroproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroProductoConstantesFunciones.getParametroProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabelid_empresaParametroProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProductoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabelid_sucursalParametroProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProductoConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabelid_moduloParametroProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProductoConstantesFunciones.IDTRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabelid_transaccionParametroProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProductoConstantesFunciones.IDTIPOTRANSACCIONMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabelid_tipo_transaccion_moduloParametroProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProductoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabelid_bodegaParametroProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProductoConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabelid_productoParametroProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProductoConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabelid_formatoParametroProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProductoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabeldescripcionParametroProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProducto.jLabelid_empresaParametroProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProducto.jLabelid_sucursalParametroProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProducto.jLabelid_moduloParametroProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProducto.jLabelid_transaccionParametroProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProducto.jLabelid_tipo_transaccion_moduloParametroProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProducto.jLabelid_bodegaParametroProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProducto.jLabelid_productoParametroProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProducto.jLabelid_formatoParametroProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProducto.jLabeldescripcionParametroProducto,"");
		
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
		this.iIdNuevoParametroProducto--;	
		
		
		this.parametroproductoAux=new ParametroProducto();
		
		this.parametroproductoAux.setId(this.iIdNuevoParametroProducto);
		this.parametroproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroproductoLogic.getParametroProductos().add(this.parametroproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametroproductos.add(this.parametroproductoAux);
		}
		//ARCHITECTURE
		
		this.parametroproducto=this.parametroproductoAux;
		
		if(ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroProducto(this.parametroproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroProducto(this.parametroproducto);
		}
				
		//this.setDefaultControlesParametroProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroProducto(this.parametroproductoBean,this.parametroproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {
			classes=ParametroProductoConstantesFunciones.getClassesRelationshipsOfParametroProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametroproductoReturnGeneral=parametroproductoLogic.procesarEventosParametroProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroproductoLogic.getParametroProductos(),this.parametroproducto,this.parametroproductoParameterGeneral,this.isEsNuevoParametroProducto,classes);//this.parametroproductoLogic.getParametroProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroProducto(this.parametroproductoReturnGeneral,this.parametroproductoBean,false);
		
		if(this.parametroproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroProducto(this.parametroproductoReturnGeneral.getParametroProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroProducto(this.parametroproductoReturnGeneral.getParametroProducto());
		}
		
		if(this.parametroproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroProducto(this.parametroproductoReturnGeneral.getParametroProducto(),classes);//this.parametroproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroProductoBeanSwingJInternalFrameAdditional.RecargarFormParametroProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroProducto(false);
						
			if(parametroproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroProducto();
			}
			
			this.actualizarVisualTableDatosParametroProducto();
			
			this.jTableDatosParametroProducto.setRowSelectionInterval(this.getIndiceNuevoParametroProducto(), this.getIndiceNuevoParametroProducto());
			
			this.seleccionarFilaTablaParametroProductoActual();
						
			this.actualizarEstadoCeldasBotonesParametroProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroProducto.jTextAreadescripcionParametroProducto.setEnabled(isHabilitar && this.parametroproductoConstantesFunciones.activardescripcionParametroProducto);	
		//
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.setEnabled(isHabilitar && this.parametroproductoConstantesFunciones.activarid_empresaParametroProducto);//
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.setEnabled(isHabilitar && this.parametroproductoConstantesFunciones.activarid_sucursalParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.setEnabled(isHabilitar && this.parametroproductoConstantesFunciones.activarid_moduloParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.setEnabled(isHabilitar && this.parametroproductoConstantesFunciones.activarid_transaccionParametroProducto);//
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.setEnabled(isHabilitar && this.parametroproductoConstantesFunciones.activarid_tipo_transaccion_moduloParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.setEnabled(isHabilitar && this.parametroproductoConstantesFunciones.activarid_bodegaParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.setEnabled(isHabilitar && this.parametroproductoConstantesFunciones.activarid_productoParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.setEnabled(isHabilitar && this.parametroproductoConstantesFunciones.activarid_formatoParametroProducto);
	};
	
	public void setDefaultControlesParametroProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametroproductoSessionBean.setConGuardarRelaciones(true);			
			this.parametroproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroProducto.jTabbedPaneRelacionesParametroProducto.setVisible(true);
			
					
		} else {
			//this.parametroproductoSessionBean.setConGuardarRelaciones(false);			
			this.parametroproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroProducto.jTabbedPaneRelacionesParametroProducto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProducto parametroproductoAux:this.parametroproductoLogic.getParametroProductos()) {
				if(parametroproductoAux.getId().equals(this.iIdNuevoParametroProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProducto parametroproductoAux:this.parametroproductos) {
				if(parametroproductoAux.getId().equals(this.iIdNuevoParametroProducto)) {
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
	
	public int getIndiceActualParametroProducto(ParametroProducto parametroproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProducto parametroproductoAux:this.parametroproductoLogic.getParametroProductos()) {
				if(parametroproductoAux.getId().equals(parametroproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProducto parametroproductoAux:this.parametroproductos) {
				if(parametroproductoAux.getId().equals(parametroproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroProducto(ParametroProducto parametroproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProducto parametroproductoAux:this.parametroproductoLogic.getParametroProductos()) {
				if(parametroproductoAux.getParametroProductoOriginal().getId().equals(parametroproductoOriginal.getId())) {
					existe=true;
					parametroproductoOriginal.setId(parametroproductoAux.getId());
					parametroproductoOriginal.setVersionRow(parametroproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProducto parametroproductoAux:this.parametroproductos) {
				if(parametroproductoAux.getParametroProductoOriginal().getId().equals(parametroproductoOriginal.getId())) {
					existe=true;
					parametroproductoOriginal.setId(parametroproductoAux.getId());
					parametroproductoOriginal.setVersionRow(parametroproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroProducto(Boolean esParaCancelar) throws Exception {
		parametroproductosAux=new ArrayList<ParametroProducto>();
		parametroproductoAux=new ParametroProducto();
		
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroProducto parametroproductoAux:this.parametroproductoLogic.getParametroProductos()) {
					if(parametroproductoAux.getId()<0) {
						parametroproductosAux.add(parametroproductoAux);
					}		
				}
				this.iIdNuevoParametroProducto=0L;
				this.parametroproductoLogic.getParametroProductos().removeAll(parametroproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroProducto parametroproductoAux:this.parametroproductos) {
					if(parametroproductoAux.getId()<0) {
						parametroproductosAux.add(parametroproductoAux);
					}		
				}
				this.iIdNuevoParametroProducto=0L;
				this.parametroproductos.removeAll(parametroproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroProducto 
					&& this.parametroproductoLogic.getParametroProductos().size()>0
					) {
					parametroproductoAux=this.parametroproductoLogic.getParametroProductos().get(this.parametroproductoLogic.getParametroProductos().size() - 1);
				
					if(parametroproductoAux.getId()<0) {
						this.parametroproductoLogic.getParametroProductos().remove(parametroproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroProducto && this.parametroproductos.size()>0) {
					parametroproductoAux=this.parametroproductos.get(this.parametroproductos.size() - 1);
				
					if(parametroproductoAux.getId()<0) {
						this.parametroproductos.remove(parametroproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametroproducto.getId()<0) {
				this.parametroproductoLogic.getParametroProductos().remove(this.parametroproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametroproducto.getId()<0) {
				this.parametroproductos.remove(this.parametroproducto);
			}
		}			
	}
	
	public void setEstadosInicialesParametroProducto(List<ParametroProducto> parametroproductosAux) throws Exception {
		ParametroProductoConstantesFunciones.setEstadosInicialesParametroProducto(parametroproductosAux);
	}
	
	public void setEstadosInicialesParametroProducto(ParametroProducto parametroproductoAux) throws Exception {
		ParametroProductoConstantesFunciones.setEstadosInicialesParametroProducto(parametroproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroProductoActual()) {
				if(!this.isEsNuevoParametroProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Producto ?", "MANTENIMIENTO DE Parametro Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroProducto parametroproducto) throws Exception {
		ParametroProductoConstantesFunciones.seleccionarAsignar(this.parametroproducto,parametroproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroProducto=this.isPermisoActualizarOriginalParametroProducto;
			
			
			this.seleccionarAsignar(parametroproducto);
			
			

			idProductoActual=parametroproducto.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroProductoConstantesFunciones.quitarEspaciosParametroProducto(this.parametroproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametroproductoSessionBean.setsFuncionBusquedaRapida(this.parametroproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoParametroProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroProducto(esParaCancelar);				
				this.cancelarNuevoParametroProducto(esParaCancelar);								
			}
			
			this.parametroproducto=new ParametroProducto();
			
			this.inicializarParametroProducto();
			
			this.actualizarEstadoCeldasBotonesParametroProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroProducto() throws Exception {
		try {
			ParametroProductoConstantesFunciones.inicializarParametroProducto(this.parametroproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametroproductoLogic.getParametroProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroProductos(String sAccionBusqueda,List<ParametroProducto> parametroproductosParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Productos");		
		parameters.put("busquedapor", ParametroProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroProducto=new JRBeanArrayDataSource(ParametroProductoJInternalFrame.TraerParametroProductoBeans(parametroproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroProductoBean.TraerParametroProductoBeans(parametroproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroProductos(sAccionBusqueda,sTipoArchivoReporte,parametroproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroProductos(sAccionBusqueda,sTipoArchivoReporte,parametroproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroProductoActionPerformed(null);
					//this.generarExcelReporteParametroProductos(sAccionBusqueda,sTipoArchivoReporte,parametroproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroProductos(sAccionBusqueda,sTipoArchivoReporte,parametroproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroProductos(sAccionBusqueda,sTipoArchivoReporte,parametroproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroProductos(sAccionBusqueda,sTipoArchivoReporte,parametroproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroProducto> parametroproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroProducto parametroproducto : parametroproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroProductoConstantesFunciones.generarExcelReporteDataParametroProducto("NORMAL",row,workbook,parametroproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroProducto(String sTipo,Row row,Workbook workbook) {
		
		ParametroProductoConstantesFunciones.generarExcelReporteHeaderParametroProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroProducto> parametroproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroProducto parametroproducto : parametroproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroProductoConstantesFunciones.getParametroProductoDescripcion(parametroproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroproducto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProductoConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroproducto.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroproducto.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroproducto.gettipotransaccionmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProductoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroproducto.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroproducto.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProductoConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroproducto.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProductoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroproducto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroProducto> parametroproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroProducto> parametroproductosRespaldo=null;
		
		classes=ParametroProductoConstantesFunciones.getClassesRelationshipsOfParametroProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametroproductoLogic.setDatosCliente(this.datosCliente);
		this.parametroproductoLogic.setDatosDeep(this.datosDeep);
		this.parametroproductoLogic.setIsConDeep(true);
		
		parametroproductosRespaldo=this.parametroproductoLogic.getParametroProductos();
		
		this.parametroproductoLogic.setParametroProductos(parametroproductosParaReportes);	
		this.parametroproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametroproductosParaReportes=this.parametroproductoLogic.getParametroProductos();
		this.parametroproductoLogic.setParametroProductos(parametroproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroProducto parametroproducto : parametroproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroProductoConstantesFunciones.generarExcelReporteDataParametroProducto("NORMAL",row,workbook,parametroproducto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroProductoConstantesFunciones.getParametroProductoDescripcion(parametroproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroProducto() throws Exception {		
		this.startProcessParametroProducto(true);
	}
	
	public void startProcessParametroProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroProducto ,this.jPanelParametrosReportesParametroProducto, this.jScrollPanelDatosParametroProducto,this.jPanelPaginacionParametroProducto, this.jScrollPanelDatosEdicionParametroProducto, this.jPanelAccionesParametroProducto,this.jPanelAccionesFormularioParametroProducto,this.jmenuBarParametroProducto,this.jmenuBarDetalleParametroProducto,this.jTtoolBarParametroProducto,this.jTtoolBarDetalleParametroProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroProducto=this.jTabbedPaneBusquedasParametroProducto; 
		
		final JPanel jPanelParametrosReportesParametroProducto=this.jPanelParametrosReportesParametroProducto;
		//final JScrollPane jScrollPanelDatosParametroProducto=this.jScrollPanelDatosParametroProducto;
		final JTable jTableDatosParametroProducto=this.jTableDatosParametroProducto;		
		final JPanel jPanelPaginacionParametroProducto=this.jPanelPaginacionParametroProducto;
		//final JScrollPane jScrollPanelDatosEdicionParametroProducto=this.jScrollPanelDatosEdicionParametroProducto;
		final JPanel jPanelAccionesParametroProducto=this.jPanelAccionesParametroProducto;
		
		JPanel jPanelCamposAuxiliarParametroProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			jPanelCamposAuxiliarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jPanelCamposParametroProducto;
			jPanelAccionesFormularioAuxiliarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jPanelAccionesFormularioParametroProducto;
		}
		
		final JPanel jPanelCamposParametroProducto=jPanelCamposAuxiliarParametroProducto;
		final JPanel jPanelAccionesFormularioParametroProducto=jPanelAccionesFormularioAuxiliarParametroProducto;
		
		
		final JMenuBar jmenuBarParametroProducto=this.jmenuBarParametroProducto;
		final JToolBar jTtoolBarParametroProducto=this.jTtoolBarParametroProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			jmenuBarDetalleAuxiliarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jmenuBarDetalleParametroProducto;
			jTtoolBarDetalleAuxiliarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jTtoolBarDetalleParametroProducto;
		}
		
		final JMenuBar jmenuBarDetalleParametroProducto=jmenuBarDetalleAuxiliarParametroProducto;
		final JToolBar jTtoolBarDetalleParametroProducto=jTtoolBarDetalleAuxiliarParametroProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroProducto;
			processRunnable.jTableDatos=jTableDatosParametroProducto;
			processRunnable.jPanelCampos=jPanelCamposParametroProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroProducto;
			processRunnable.jPanelAcciones=jPanelAccionesParametroProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroProducto;
			
			
			processRunnable.jmenuBar=jmenuBarParametroProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroProducto;
			processRunnable.jTtoolBar=jTtoolBarParametroProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroProducto ,jPanelParametrosReportesParametroProducto,jTableDatosParametroProducto, /*jScrollPanelDatosParametroProducto,*/jPanelCamposParametroProducto,jPanelPaginacionParametroProducto, /*jScrollPanelDatosEdicionParametroProducto,*/ jPanelAccionesParametroProducto,jPanelAccionesFormularioParametroProducto,jmenuBarParametroProducto,jmenuBarDetalleParametroProducto,jTtoolBarParametroProducto,jTtoolBarDetalleParametroProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroProducto ,jPanelParametrosReportesParametroProducto, jScrollPanelDatosParametroProducto,jPanelPaginacionParametroProducto, jScrollPanelDatosEdicionParametroProducto, jPanelAccionesParametroProducto,jPanelAccionesFormularioParametroProducto,jmenuBarParametroProducto,jmenuBarDetalleParametroProducto,jTtoolBarParametroProducto,jTtoolBarDetalleParametroProducto);
						
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
	
	public void finishProcessParametroProducto() {// throws Exception 
		this.finishProcessParametroProducto(true);
	}
	
	public void finishProcessParametroProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroProducto ,this.jPanelParametrosReportesParametroProducto, this.jScrollPanelDatosParametroProducto,this.jPanelPaginacionParametroProducto, this.jScrollPanelDatosEdicionParametroProducto, this.jPanelAccionesParametroProducto,this.jPanelAccionesFormularioParametroProducto,this.jmenuBarParametroProducto,this.jmenuBarDetalleParametroProducto,this.jTtoolBarParametroProducto,this.jTtoolBarDetalleParametroProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroProducto=this.jTabbedPaneBusquedasParametroProducto; 
		
		final JPanel jPanelParametrosReportesParametroProducto=this.jPanelParametrosReportesParametroProducto;
		//final JScrollPane jScrollPanelDatosParametroProducto=this.jScrollPanelDatosParametroProducto;
		final JTable jTableDatosParametroProducto=this.jTableDatosParametroProducto;		
		final JPanel jPanelPaginacionParametroProducto=this.jPanelPaginacionParametroProducto;
		//final JScrollPane jScrollPanelDatosEdicionParametroProducto=this.jScrollPanelDatosEdicionParametroProducto;
		final JPanel jPanelAccionesParametroProducto=this.jPanelAccionesParametroProducto;
		
		JPanel jPanelCamposAuxiliarParametroProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			jPanelCamposAuxiliarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jPanelCamposParametroProducto;
			jPanelAccionesFormularioAuxiliarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jPanelAccionesFormularioParametroProducto;
		}
		
		final JPanel jPanelCamposParametroProducto=jPanelCamposAuxiliarParametroProducto;
		final JPanel jPanelAccionesFormularioParametroProducto=jPanelAccionesFormularioAuxiliarParametroProducto;
		
		
		final JMenuBar jmenuBarParametroProducto=this.jmenuBarParametroProducto;		
		final JToolBar jTtoolBarParametroProducto=this.jTtoolBarParametroProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			jmenuBarDetalleAuxiliarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jmenuBarDetalleParametroProducto;
			jTtoolBarDetalleAuxiliarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jTtoolBarDetalleParametroProducto;		
		}
		
		final JMenuBar jmenuBarDetalleParametroProducto=jmenuBarDetalleAuxiliarParametroProducto;
		final JToolBar jTtoolBarDetalleParametroProducto=jTtoolBarDetalleAuxiliarParametroProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroProducto;
			processRunnable.jTableDatos=jTableDatosParametroProducto;
			processRunnable.jPanelCampos=jPanelCamposParametroProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroProducto;
			processRunnable.jPanelAcciones=jPanelAccionesParametroProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroProducto;
			
			
			processRunnable.jmenuBar=jmenuBarParametroProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroProducto;
			processRunnable.jTtoolBar=jTtoolBarParametroProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroProducto ,jPanelParametrosReportesParametroProducto, jTableDatosParametroProducto,/*jScrollPanelDatosParametroProducto,*/jPanelCamposParametroProducto,jPanelPaginacionParametroProducto, /*jScrollPanelDatosEdicionParametroProducto,*/ jPanelAccionesParametroProducto,jPanelAccionesFormularioParametroProducto,jmenuBarParametroProducto,jmenuBarDetalleParametroProducto,jTtoolBarParametroProducto,jTtoolBarDetalleParametroProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametroproductoConstantesFunciones.getsFinalQueryParametroProducto();
		String  finalQueryPaginacionTodos=this.parametroproductoConstantesFunciones.getsFinalQueryParametroProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroProductoConstantesFunciones.getArrayColumnasGlobalesNoParametroProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroProductoConstantesFunciones.getArrayColumnasGlobalesParametroProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametroproductosEliminados= new ArrayList<ParametroProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroProducto();
		
				///*ParametroProductoSessionBean*/this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			
			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
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
					this.iNumeroPaginacion=ParametroProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroProductoConstantesFunciones.getClassesForeignKeysOfParametroProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametroproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametroproductosAux= new ArrayList<ParametroProducto>();
			
				
			parametroproductoLogic.setDatosCliente(this.datosCliente);
			parametroproductoLogic.setDatosDeep(this.datosDeep);
			parametroproductoLogic.setIsConDeep(true);
			
			
			parametroproductoLogic.getParametroProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametroproductoLogic.getTodosParametroProductos(finalQueryGlobal,pagination);
					
					//parametroproductoLogic.getTodosParametroProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametroproductoLogic.getParametroProductos()==null|| parametroproductoLogic.getParametroProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroproductosAux= new ArrayList<ParametroProducto>();
							parametroproductosAux.addAll(parametroproductoLogic.getParametroProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproductosAux= new ArrayList<ParametroProducto>();
							parametroproductosAux.addAll(parametroproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroproductoLogic.getTodosParametroProductos(finalQueryGlobal+"",this.pagination);												
							
							//parametroproductoLogic.getTodosParametroProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroProductos("Todos",parametroproductoLogic.getParametroProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroproductoLogic.setParametroProductos(new ArrayList<ParametroProducto>());					
							parametroproductoLogic.getParametroProductos().addAll(parametroproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproductos=new ArrayList<ParametroProducto>();
							parametroproductos.addAll(parametroproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroProducto=this.idActual;
				
				} else if(this.idParametroProductoActual!=null && this.idParametroProductoActual!=0L) {
					idParametroProducto=idParametroProductoActual;
				}
				
					
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndicePorId(idParametroProducto);
				
				this.parametroproductos=new ArrayList<ParametroProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametroproductoLogic.getEntity(idParametroProducto);
					
					//parametroproductoLogic.getEntityWithConnection(idParametroProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLogic.setParametroProductos(new ArrayList<ParametroProducto>());
					parametroproductoLogic.getParametroProductos().add(parametroproductoLogic.getParametroProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproductos=new ArrayList<ParametroProducto>();
					this.parametroproductos.add(parametroproducto);
				}
				
				if(parametroproductoLogic.getParametroProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroproductoLogic.getParametroProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroproductoLogic.getParametroProductos()==null||parametroproductoLogic.getParametroProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroproductos==null|| parametroproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductosAux=new ArrayList<ParametroProducto>();
						parametroproductosAux.addAll(parametroproductoLogic.getParametroProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproductosAux=new ArrayList<ParametroProducto>();
							parametroproductosAux.addAll(parametroproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroproductoLogic.getParametroProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroProductos("FK_IdEmpresa",parametroproductoLogic.getParametroProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroProductos("FK_IdEmpresa",parametroproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductoLogic.setParametroProductos(new ArrayList<ParametroProducto>());
						parametroproductoLogic.getParametroProductos().addAll(parametroproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproductos=new ArrayList<ParametroProducto>();
							parametroproductos.addAll(parametroproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroproductoLogic.getParametroProductosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroproductoLogic.getParametroProductos()==null||parametroproductoLogic.getParametroProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroproductos==null|| parametroproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductosAux=new ArrayList<ParametroProducto>();
						parametroproductosAux.addAll(parametroproductoLogic.getParametroProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproductosAux=new ArrayList<ParametroProducto>();
							parametroproductosAux.addAll(parametroproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroproductoLogic.getParametroProductosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroProductos("FK_IdModulo",parametroproductoLogic.getParametroProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroProductos("FK_IdModulo",parametroproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductoLogic.setParametroProductos(new ArrayList<ParametroProducto>());
						parametroproductoLogic.getParametroProductos().addAll(parametroproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproductos=new ArrayList<ParametroProducto>();
							parametroproductos.addAll(parametroproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroproductoLogic.getParametroProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroproductoLogic.getParametroProductos()==null||parametroproductoLogic.getParametroProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroproductos==null|| parametroproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductosAux=new ArrayList<ParametroProducto>();
						parametroproductosAux.addAll(parametroproductoLogic.getParametroProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproductosAux=new ArrayList<ParametroProducto>();
							parametroproductosAux.addAll(parametroproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroproductoLogic.getParametroProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroProductos("FK_IdSucursal",parametroproductoLogic.getParametroProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroProductos("FK_IdSucursal",parametroproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductoLogic.setParametroProductos(new ArrayList<ParametroProducto>());
						parametroproductoLogic.getParametroProductos().addAll(parametroproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproductos=new ArrayList<ParametroProducto>();
							parametroproductos.addAll(parametroproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroproductoLogic.getParametroProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroproductoLogic.getParametroProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroProducto parametroproducto) {
		Boolean permite=true;
		
		if(this.parametroproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroProductoConstantesFunciones.getOrderByListaParametroProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroProductoConstantesFunciones.getOrderByListaParametroProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProducto parametroproducto:parametroproductoLogic.getParametroProductos()) {
				if(parametroproducto.getsType().equals(Constantes2.S_TOTALES)) {
					parametroproductoTotales=parametroproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProducto parametroproducto:this.parametroproductos) {
				if(parametroproducto.getsType().equals(Constantes2.S_TOTALES)) {
					parametroproductoTotales=parametroproducto;
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
			this.parametroproductoAux=new ParametroProducto();
			this.parametroproductoAux.setsType(Constantes2.S_TOTALES);
			this.parametroproductoAux.setIsNew(false);
			this.parametroproductoAux.setIsChanged(false);
			this.parametroproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroProductoConstantesFunciones.TotalizarValoresFilaParametroProducto(this.parametroproductoLogic.getParametroProductos(),this.parametroproductoAux);
				
				this.parametroproductoLogic.getParametroProductos().add(this.parametroproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroProductoConstantesFunciones.TotalizarValoresFilaParametroProducto(this.parametroproductos,this.parametroproductoAux);
				
				this.parametroproductos.add(this.parametroproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametroproductoTotales=new ParametroProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroproductoLogic.getParametroProductos().remove(parametroproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroproductos.remove(parametroproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametroproductoTotales=new ParametroProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProducto parametroproducto:parametroproductoLogic.getParametroProductos()) {
				if(parametroproducto.getsType().equals(Constantes2.S_TOTALES)) {
					parametroproductoTotales=parametroproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroProductoConstantesFunciones.TotalizarValoresFilaParametroProducto(this.parametroproductoLogic.getParametroProductos(),parametroproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProducto parametroproducto:this.parametroproductos) {
				if(parametroproducto.getsType().equals(Constantes2.S_TOTALES)) {
					parametroproductoTotales=parametroproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroProductoConstantesFunciones.TotalizarValoresFilaParametroProducto(this.parametroproductos,parametroproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroProductosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProductosFK_IdFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProductosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProductosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProductosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProductosFK_IdTipoTransaccionModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTransaccionModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProductosFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroProductosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLogic.getParametroProductosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLogic.getParametroProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProductosFK_IdFormato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLogic.getParametroProductosFK_IdFormato(sFinalQuery,this.pagination,id_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProductosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLogic.getParametroProductosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProductosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLogic.getParametroProductosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProductosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLogic.getParametroProductosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProductosFK_IdTipoTransaccionModulo(String sFinalQuery,Long id_tipo_transaccion_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLogic.getParametroProductosFK_IdTipoTransaccionModulo(sFinalQuery,this.pagination,id_tipo_transaccion_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProductosFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLogic.getParametroProductosFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
	
	public void inicializarPermisosParametroProducto() {
		this.isPermisoTodoParametroProducto=false;
		this.isPermisoNuevoParametroProducto=false;
		this.isPermisoActualizarParametroProducto=false;
		this.isPermisoActualizarOriginalParametroProducto=false;
		this.isPermisoEliminarParametroProducto=false;
		this.isPermisoGuardarCambiosParametroProducto=false;
		this.isPermisoConsultaParametroProducto=false;
		this.isPermisoBusquedaParametroProducto=false;
		this.isPermisoReporteParametroProducto=false;		
		this.isPermisoOrdenParametroProducto=false;		
		this.isPermisoPaginacionMedioParametroProducto=false;		
		this.isPermisoPaginacionAltoParametroProducto=false;
		this.isPermisoPaginacionTodoParametroProducto=false;
		this.isPermisoCopiarParametroProducto=false;		
		this.isPermisoVerFormParametroProducto=false;		
		this.isPermisoDuplicarParametroProducto=false;		
		this.isPermisoOrdenParametroProducto=false;		
	}
	
	public void setPermisosUsuarioParametroProducto(Boolean isPermiso) {
		this.isPermisoTodoParametroProducto=isPermiso;
		this.isPermisoNuevoParametroProducto=isPermiso;
		this.isPermisoActualizarParametroProducto=isPermiso;
		this.isPermisoActualizarOriginalParametroProducto=isPermiso;
		this.isPermisoEliminarParametroProducto=isPermiso;
		this.isPermisoGuardarCambiosParametroProducto=isPermiso;
		this.isPermisoConsultaParametroProducto=isPermiso;
		this.isPermisoBusquedaParametroProducto=isPermiso;
		this.isPermisoReporteParametroProducto=isPermiso;
		this.isPermisoOrdenParametroProducto=isPermiso;		
		this.isPermisoPaginacionMedioParametroProducto=isPermiso;		
		this.isPermisoPaginacionAltoParametroProducto=isPermiso;		
		this.isPermisoPaginacionTodoParametroProducto=isPermiso;		
		this.isPermisoCopiarParametroProducto=isPermiso;		
		this.isPermisoVerFormParametroProducto=isPermiso;		
		this.isPermisoDuplicarParametroProducto=isPermiso;
		this.isPermisoOrdenParametroProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroProducto(Boolean isPermiso) {
		//this.isPermisoTodoParametroProducto=isPermiso;
		this.isPermisoNuevoParametroProducto=isPermiso;
		this.isPermisoActualizarParametroProducto=isPermiso;
		this.isPermisoActualizarOriginalParametroProducto=isPermiso;
		this.isPermisoEliminarParametroProducto=isPermiso;
		this.isPermisoGuardarCambiosParametroProducto=isPermiso;
		//this.isPermisoConsultaParametroProducto=isPermiso;
		//this.isPermisoBusquedaParametroProducto=isPermiso;
		//this.isPermisoReporteParametroProducto=isPermiso;
		//this.isPermisoOrdenParametroProducto=isPermiso;		
		//this.isPermisoPaginacionMedioParametroProducto=isPermiso;		
		//this.isPermisoPaginacionAltoParametroProducto=isPermiso;		
		//this.isPermisoPaginacionTodoParametroProducto=isPermiso;		
		//this.isPermisoCopiarParametroProducto=isPermiso;		
		//this.isPermisoDuplicarParametroProducto=isPermiso;
		//this.isPermisoOrdenParametroProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroProductoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroProducto=this.isPermisoActualizarParametroProducto;
			this.isPermisoEliminarParametroProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroProducto.setToolTipText(this.jTableDatosParametroProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroProducto() throws Exception {
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
	public void inicializarCombosForeignKeyParametroProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.tipotransaccionmodulosForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTransaccionModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTransaccionModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTransaccionModulosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroProductoParameterReturnGeneral parametroproductoReturnGeneral=new ParametroProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametroproductoConstantesFunciones.cargarid_empresaParametroProducto)
					 || (this.esRecargarFks && this.parametroproductoConstantesFunciones.cargarid_empresaParametroProducto)) {

					if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametroproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.parametroproductoConstantesFunciones.cargarid_sucursalParametroProducto)
					 || (this.esRecargarFks && this.parametroproductoConstantesFunciones.cargarid_sucursalParametroProducto)) {

					if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+parametroproductoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.parametroproductoConstantesFunciones.cargarid_moduloParametroProducto)
					 || (this.esRecargarFks && this.parametroproductoConstantesFunciones.cargarid_moduloParametroProducto)) {

					if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+parametroproductoSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTransaccion="";

				if(((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0) && this.parametroproductoConstantesFunciones.cargarid_transaccionParametroProducto)
					 || (this.esRecargarFks && this.parametroproductoConstantesFunciones.cargarid_transaccionParametroProducto)) {

					if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion, "");
						finalQueryGlobalTransaccion+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion=" WHERE " + ConstantesSql.ID + "="+parametroproductoSessionBean.getlidTransaccionActual();
					}
				} else {
					finalQueryGlobalTransaccion="NONE";
				}


				String finalQueryGlobalTipoTransaccionModulo="";

				if(((this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0) && this.parametroproductoConstantesFunciones.cargarid_tipo_transaccion_moduloParametroProducto)
					 || (this.esRecargarFks && this.parametroproductoConstantesFunciones.cargarid_tipo_transaccion_moduloParametroProducto)) {

					if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoTransaccionModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoTransaccionModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoTransaccionModulo, "");
						finalQueryGlobalTipoTransaccionModulo+=TipoTransaccionModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoTransaccionModulo=" WHERE " + ConstantesSql.ID + "="+parametroproductoSessionBean.getlidTipoTransaccionModuloActual();
					}
				} else {
					finalQueryGlobalTipoTransaccionModulo="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.parametroproductoConstantesFunciones.cargarid_bodegaParametroProducto)
					 || (this.esRecargarFks && this.parametroproductoConstantesFunciones.cargarid_bodegaParametroProducto)) {

					if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+parametroproductoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.parametroproductoConstantesFunciones.cargarid_productoParametroProducto)
					 || (this.esRecargarFks && this.parametroproductoConstantesFunciones.cargarid_productoParametroProducto)) {

					if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+parametroproductoSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.parametroproductoConstantesFunciones.cargarid_formatoParametroProducto)
					 || (this.esRecargarFks && this.parametroproductoConstantesFunciones.cargarid_formatoParametroProducto)) {

					if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+parametroproductoSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametroproductoReturnGeneral=parametroproductoLogic.cargarCombosLoteForeignKeyParametroProducto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalModulo,finalQueryGlobalTransaccion,finalQueryGlobalTipoTransaccionModulo,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalFormato);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametroproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=parametroproductoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=parametroproductoReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTransaccion.equals("NONE")) {
				this.transaccionsForeignKey=parametroproductoReturnGeneral.gettransaccionsForeignKey();
			}

			if(!finalQueryGlobalTipoTransaccionModulo.equals("NONE")) {
				this.tipotransaccionmodulosForeignKey=parametroproductoReturnGeneral.gettipotransaccionmodulosForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=parametroproductoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=parametroproductoReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=parametroproductoReturnGeneral.getformatosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTransaccion();
			this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyFormato();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametroproductoSessionBean==null) {
				this.parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoTransaccionModulo()throws Exception {
		try {

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				TipoTransaccionModulo tipotransaccionmodulo=new TipoTransaccionModulo();
				TipoTransaccionModuloConstantesFunciones.setTipoTransaccionModuloDescripcion(tipotransaccionmodulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipotransaccionmodulo.setId(null);

				if(!TipoTransaccionModuloConstantesFunciones.ExisteEnLista(this.tipotransaccionmodulosForeignKey,tipotransaccionmodulo,true)) {

					this.tipotransaccionmodulosForeignKey.add(0,tipotransaccionmodulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.parametroproductoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroProducto(ParametroProducto parametroproducto)throws Exception {	
		try {
			
			this.setActualModuloForeignKey(parametroproducto.getid_modulo(),false,"Formulario");
			this.setActualTransaccionForeignKey(parametroproducto.getid_transaccion(),false,"Formulario");
			this.setActualTipoTransaccionModuloForeignKey(parametroproducto.getid_tipo_transaccion_modulo(),false,"Formulario");
			this.setActualBodegaForeignKey(parametroproducto.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(parametroproducto.getid_producto(),false,"Formulario");
			this.setActualFormatoForeignKey(parametroproducto.getid_formato(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroProducto(ParametroProducto parametroproducto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(parametroproducto.getProducto()!=null && !sTipoEvento.equals("id_productoParametroProducto")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(parametroproducto.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroProducto()throws Exception {	
		try {
			
			this.setActualModuloForeignKey(this.parametroproductoConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualTransaccionForeignKey(this.parametroproductoConstantesFunciones.getid_transaccion(),false,"Formulario");
			this.setActualTipoTransaccionModuloForeignKey(this.parametroproductoConstantesFunciones.getid_tipo_transaccion_modulo(),false,"Formulario");
			this.setActualBodegaForeignKey(this.parametroproductoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.parametroproductoConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualFormatoForeignKey(this.parametroproductoConstantesFunciones.getid_formato(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ParametroProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametroproductoSessionBean=new ParametroProductoSessionBean(); 
		this.parametroproductoConstantesFunciones=new ParametroProductoConstantesFunciones(); 
		this.parametroproductoBean=new ParametroProducto();//(this.parametroproductoConstantesFunciones); 		
		this.parametroproductoReturnGeneral=new ParametroProductoParameterReturnGeneral(); 
		
		this.parametroproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroProducto(true);
			
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
			
			this.parametroproductoConstantesFunciones=new ParametroProductoConstantesFunciones(); 
			this.parametroproductoBean=new ParametroProducto();//this.parametroproductoConstantesFunciones); 			
			this.parametroproductoReturnGeneral=new ParametroProductoParameterReturnGeneral(); 
		
			ParametroProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametroproducto=new ParametroProducto();
			this.parametroproductos = new ArrayList<ParametroProducto>();
			this.parametroproductosAux = new ArrayList<ParametroProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic=new ParametroProductoLogic();
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.parametroproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametroproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroProducto);	
					}
					
					if(this.jInternalFrameImportacionParametroProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroProducto);
				this.jInternalFrameDetalleFormParametroProducto.setVisible(false);
				this.jInternalFrameDetalleFormParametroProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroProducto);
					this.jInternalFrameReporteDinamicoParametroProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroProducto);
					this.jInternalFrameImportacionParametroProducto.setVisible(false);
					this.jInternalFrameImportacionParametroProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroProducto);
					this.jInternalFrameOrderByParametroProducto.setVisible(false);
					this.jInternalFrameOrderByParametroProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametroproductoReturnGeneral=new ParametroProductoParameterReturnGeneral();
			
			this.parametroproductoParameterGeneral=new ParametroProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametroproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroproductoSessionBean.getEsGuardarRelacionado(),this.parametroproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroproductoSessionBean.getEsGuardarRelacionado(),this.parametroproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroProducto=false;
			this.isVisibilidadCeldaDuplicarParametroProducto=true;
			this.isVisibilidadCeldaCopiarParametroProducto=true;
			this.isVisibilidadCeldaVerFormParametroProducto=true;
			this.isVisibilidadCeldaOrdenParametroProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=false;
			this.isVisibilidadCeldaModificarParametroProducto=false;
			this.isVisibilidadCeldaActualizarParametroProducto=false;
			this.isVisibilidadCeldaEliminarParametroProducto=false;
			this.isVisibilidadCeldaCancelarParametroProducto=false;
			this.isVisibilidadCeldaGuardarParametroProducto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFormato=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoTransaccionModulo=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroProducto(false);
			
			this.setPermisosUsuarioParametroProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.parametroproductoSessionBean.getEsGuardarRelacionado() && this.parametroproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroProductoClasesRelacionadas();
			}
			
			if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroProducto();
			}
			
			if(!this.isPermisoBusquedaParametroProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroProducto,this.isPermisoPaginacionMedioParametroProducto,this.isPermisoPaginacionTodoParametroProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroProductoConstantesFunciones.getTiposSeleccionarParametroProducto());
				
				this.tiposColumnasSelect=ParametroProductoConstantesFunciones.getTiposSeleccionarParametroProducto(true);
				
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
			//if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroProducto() ;
			
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
			this.moduloLogic=new ModuloLogic();
			this.transaccionLogic=new TransaccionLogic();
			this.tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.formatoLogic=new FormatoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametroproductoImplementable= (ParametroProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametroproductoImplementableHome= (ParametroProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametroproductos= new ArrayList<ParametroProducto>();
			this.parametroproductosEliminados= new ArrayList<ParametroProducto>();
						
			this.isEsNuevoParametroProducto=false;
			this.esParaAccionDesdeFormularioParametroProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroProducto();
			}
			
			ParametroProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroProducto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroProducto")) {
				iIndex=this.jInternalFrameDetalleFormParametroProducto.jTabbedPaneRelacionesParametroProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroProducto.jTabbedPaneRelacionesParametroProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroProducto();	
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
	
	public void cargarCombosForeignKeyParametroProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroProducto();
		
		this.cargarCombosFrameForeignKeyParametroProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroProducto();
		}
	}
	
	

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTransaccionModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoTransaccionModulo(this.tipotransaccionmodulosForeignKey);

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

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
			
			if(jTableDatosParametroProducto.getRowCount()>=1) {
				jTableDatosParametroProducto.removeRowSelectionInterval(0, jTableDatosParametroProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroProducto(true);			
			//this.parametroproducto=new ParametroProducto();
			//this.parametroproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroProducto() ;
			
			if(ParametroProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametroproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);				
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
			if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroProducto.getSelectedRows().length;			
			}
			
			parametroproductosSeleccionados=this.getParametroProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroProducto--;			
				//ParametroProducto parametroproductoAux= new ParametroProducto();			
				//parametroproductoAux.setId(this.iIdNuevoParametroProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroProducto parametroproductoOrigen=new ParametroProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroProducto parametroproductoOrigen : parametroproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametroproductoOrigen =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproductoOrigen =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametroproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroProducto(parametroproductoOrigen,this.parametroproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroproductoLogic.getParametroProductos().add(this.parametroproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroproductos.add(this.parametroproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroProducto(false);
				
				this.jTableDatosParametroProducto.setRowSelectionInterval(this.getIndiceNuevoParametroProducto(), this.getIndiceNuevoParametroProducto());
				
				int iLastRow =  this.jTableDatosParametroProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();									
		
			ParametroProducto parametroproductoOrigen=new ParametroProducto();
			ParametroProducto parametroproductoDestino=new ParametroProducto();
				
			parametroproductosSeleccionados=this.getParametroProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametroproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductoOrigen =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroproductoOrigen =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproductoDestino =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroproductoDestino =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametroproductoOrigen =parametroproductosSeleccionados.get(0);
				parametroproductoDestino =parametroproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroProducto(parametroproductoOrigen,parametroproductoDestino,true,false);
				
				parametroproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroproductoDestino,parametroproductoLogic.getParametroProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroproductoDestino,parametroproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroProducto(false);
				
				//this.jTableDatosParametroProducto.setRowSelectionInterval(this.getIndiceNuevoParametroProducto(), this.getIndiceNuevoParametroProducto());
				
				int iLastRow =  this.jTableDatosParametroProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroProducto.setVisible(!isVisible);
			this.jPanelPaginacionParametroProducto.setVisible(!isVisible);
			this.jPanelAccionesParametroProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroProducto();
			
			this.abrirFrameOrderByParametroProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroProducto.isMaximum()) {
					this.jInternalFrameDetalleFormParametroProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroProducto.setSize(this.jInternalFrameDetalleFormParametroProducto.iWidthFormulario,this.jInternalFrameDetalleFormParametroProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroProducto.isMaximum()) {
						this.jInternalFrameDetalleFormParametroProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroProducto.jContentPaneDetalleParametroProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroProducto.jTabbedPaneRelacionesParametroProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroProducto.jContentPaneDetalleParametroProducto.getWidth(),ParametroProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroProducto.jTabbedPaneRelacionesParametroProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroProducto.jContentPaneDetalleParametroProducto.getWidth(),ParametroProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroProducto.jTabbedPaneRelacionesParametroProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroProducto.jContentPaneDetalleParametroProducto.getWidth(),ParametroProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroProducto.setVisible(true);
	        this.jInternalFrameDetalleFormParametroProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroProducto,false,this);
				} else {
					this.jInternalFrameOrderByParametroProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroProducto);
				this.jInternalFrameOrderByParametroProducto.setVisible(false);
				this.jInternalFrameOrderByParametroProducto.setSelected(false);
				
				this.jInternalFrameOrderByParametroProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroProducto"));
				
				this.inicializarActualizarBindingTablaOrderByParametroProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroProducto==null) {
				
				this.jInternalFrameImportacionParametroProducto=new ImportacionJInternalFrame(ParametroProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroProducto);
				this.jInternalFrameImportacionParametroProducto.setVisible(false);
				this.jInternalFrameImportacionParametroProducto.setSelected(false);


				this.jInternalFrameImportacionParametroProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroProducto"));
				this.jInternalFrameImportacionParametroProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroProducto"));
				this.jInternalFrameImportacionParametroProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroProducto==null) {
				this.jInternalFrameReporteDinamicoParametroProducto=new ReporteDinamicoJInternalFrame(ParametroProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroProducto);
				this.jInternalFrameReporteDinamicoParametroProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroProducto"));
				this.jInternalFrameReporteDinamicoParametroProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroProducto"));
				this.jInternalFrameReporteDinamicoParametroProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroProducto);
			
	       	this.jInternalFrameDetalleFormParametroProducto.setVisible(false);
	        this.jInternalFrameDetalleFormParametroProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroProducto.dispose();
			//this.jInternalFrameDetalleFormParametroProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroProducto.setVisible(true);
	        this.jInternalFrameImportacionParametroProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroProducto.setVisible(true);
	        this.jInternalFrameOrderByParametroProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroProducto.setVisible(false);
	        this.jInternalFrameOrderByParametroProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroProducto.setVisible(false);
	        this.jInternalFrameImportacionParametroProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroProducto(true);
			//this.isEsNuevoParametroProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroProducto(false) ;
			
			if(parametroproductoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroProducto(true);
			//this.isEsNuevoParametroProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametroproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroProducto(false) ;
			
			if(ParametroProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.parametroproductoConstantesFunciones.cargarid_productoParametroProducto) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingParametroProducto(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTransaccionModulo(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey)throws Exception{
		TableColumn tableColumnTipoTransaccionModulo=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO));
		TableCellEditor tableCellEditorTipoTransaccionModulo =tableColumnTipoTransaccionModulo.getCellEditor();

		TipoTransaccionModuloTableCell tipotransaccionmoduloTableCellFk=(TipoTransaccionModuloTableCell)tableCellEditorTipoTransaccionModulo;

		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKey(tipotransaccionmodulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipotransaccionmoduloTableCellFk.setRowActual(intSelectedRow);
			//tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKeyActual(tipotransaccionmodulosForeignKey);
		//}


		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.RecargarTipoTransaccionModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProducto.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroProducto(false);
			
			//if(!this.isEsNuevoParametroProducto) {								
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				
			}
			
			if(this.permiteMantenimiento(this.parametroproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroProducto=true;
					this.inicializarActualizarBindingTablaParametroProducto(false);
					this.isEsNuevoParametroProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroProducto(false);
				
				this.habilitarDeshabilitarControlesParametroProducto(false);
			
												
				
				if(ParametroProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroProductoActionPerformed(evt,parametroproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroProducto(this.parametroproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametroproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametroproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				this.parametroproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				this.parametroproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametroproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroProductoModel) this.jTableDatosParametroProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroProducto=true;
				this.inicializarActualizarBindingTablaParametroProducto(false);
				this.isEsNuevoParametroProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroProducto(false);
				
				this.habilitarDeshabilitarControlesParametroProducto(false);
				
				
				
				if(ParametroProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroProducto.getRowCount()>=1) {
				jTableDatosParametroProducto.removeRowSelectionInterval(0, jTableDatosParametroProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroProducto(false) ;
			
			this.isEsNuevoParametroProducto=false;
			
			if(ParametroProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroProducto(false);
				
				//SI ES MANUAL
				if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroProducto--;			
			//ParametroProducto parametroproductoAux= new ParametroProducto();			
			//parametroproductoAux.setId(this.iIdNuevoParametroProducto);
			
			if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
			
			this.parametroproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametroproductoLogic.getParametroProductos().add(this.parametroproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametroproductos.add(this.parametroproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroProducto(false);
			
			this.jTableDatosParametroProducto.setRowSelectionInterval(this.getIndiceNuevoParametroProducto(), this.getIndiceNuevoParametroProducto());
			
			int iLastRow =  this.jTableDatosParametroProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroProducto(false);
			
			//SI ES MANUAL
			if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroProducto();
			}
			
			//this.abrirFrameTreeParametroProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro ProductoS ?", "MANTENIMIENTO DE Parametro Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametroproductoReturnGeneral=parametroproductoLogic.procesarImportacionParametroProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametroproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroProducto.setFileImportacion(this.jInternalFrameImportacionParametroProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();		

		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroProductos("Todos",parametroproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProductoConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTransaccionModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTransaccionModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTransaccionModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTransaccionModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProductoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProductoConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProductoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoParametroProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoria="id_transaccion";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoria="id_tipo_transaccion_modulo";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case ParametroProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoriaValor="id_transaccion";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoriaValor="id_tipo_transaccion_modulo";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case ParametroProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion");
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Transaccion Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_transaccion_modulo");
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case ParametroProductoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();		
		
		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroProducto parametroproducto:parametroproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ParametroProducto parametroproducto:parametroproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroproducto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(ParametroProducto parametroproducto:parametroproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroproducto.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(ParametroProducto parametroproducto:parametroproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroproducto.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
					iRow++;

					for(ParametroProducto parametroproducto:parametroproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroproducto.gettipotransaccionmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ParametroProducto parametroproducto:parametroproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroproducto.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ParametroProducto parametroproducto:parametroproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroproducto.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProductoConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(ParametroProducto parametroproducto:parametroproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroproducto.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProductoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ParametroProducto parametroproducto:parametroproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroproducto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroProducto(row);				
			//	iRow++;
			//}				
			
			//for(ParametroProducto parametroproductoAux:parametroproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroProducto(parametroproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroProducto(false);
			
			//SI ES MANUAL
			if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroProducto(false);
			
			//SI ES MANUAL
			if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroProducto(false);
			
			//SI ES MANUAL
			if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroProducto();
		
		this.inicializarActualizarBindingBotonesManualParametroProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroProducto.jCheckBoxPostAccionNuevoParametroProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroProducto.jCheckBoxPostAccionSinCerrarParametroProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroProducto.jCheckBoxPostAccionSinMensajeParametroProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroProducto!=null) {
				this.jInternalFrameDetalleFormParametroProducto.jCheckBoxPostAccionNuevoParametroProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroProducto.jCheckBoxPostAccionSinCerrarParametroProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroProducto.jCheckBoxPostAccionSinMensajeParametroProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroProducto() throws Exception {
		try	{
			if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroProducto.addItem(reporte);
			}
			
			
			if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroProducto!=null) {
				this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroProducto!=null) {
				this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_moduloFK_IdModuloParametroProducto.getSelectedItem()!=null){this.id_moduloFK_IdModulo=((Modulo)this.jComboBoxid_moduloFK_IdModuloParametroProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroProducto(Boolean esInicializar) throws Exception {				
		if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroProducto() throws Exception {
		this.inicializarActualizarBindingTablaParametroProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametroproductoLogic.getParametroProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametroproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroProducto.setModel(new ParametroProductoModel(this.parametroproductoLogic.getParametroProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroProducto.setModel(new ParametroProductoModel(this.parametroproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroProducto!=null && this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO,parametroproductoConstantesFunciones.resaltarSeleccionarParametroProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO,parametroproductoConstantesFunciones.resaltarSeleccionarParametroProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_ID));

		if(this.parametroproductoConstantesFunciones.mostraridParametroProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroproductoConstantesFunciones.resaltaridParametroProducto,this.parametroproductoConstantesFunciones.activaridParametroProducto,this,true,"idParametroProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroproductoConstantesFunciones.resaltaridParametroProducto,this.parametroproductoConstantesFunciones.activaridParametroProducto,this,true,"idParametroProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametroproductoConstantesFunciones.mostrarid_empresaParametroProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametroproductoConstantesFunciones.resaltarid_empresaParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_empresaParametroProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametroproductoConstantesFunciones.resaltarid_empresaParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_empresaParametroProducto,false,"id_empresaParametroProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.parametroproductoConstantesFunciones.mostrarid_sucursalParametroProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.parametroproductoConstantesFunciones.resaltarid_sucursalParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_sucursalParametroProducto));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.parametroproductoConstantesFunciones.resaltarid_sucursalParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_sucursalParametroProducto,false,"id_sucursalParametroProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDMODULO));

		if(this.parametroproductoConstantesFunciones.mostrarid_moduloParametroProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProductoConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.parametroproductoConstantesFunciones.resaltarid_moduloParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_moduloParametroProducto));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.parametroproductoConstantesFunciones.resaltarid_moduloParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_moduloParametroProducto,true,"id_moduloParametroProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION));

		if(this.parametroproductoConstantesFunciones.mostrarid_transaccionParametroProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionsForeignKey,this.parametroproductoConstantesFunciones.resaltarid_transaccionParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_transaccionParametroProducto));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionsForeignKey,this.parametroproductoConstantesFunciones.resaltarid_transaccionParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_transaccionParametroProducto,true,"id_transaccionParametroProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDBODEGA));

		if(this.parametroproductoConstantesFunciones.mostrarid_bodegaParametroProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProductoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.parametroproductoConstantesFunciones.resaltarid_bodegaParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_bodegaParametroProducto));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.parametroproductoConstantesFunciones.resaltarid_bodegaParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_bodegaParametroProducto,true,"id_bodegaParametroProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.parametroproductoConstantesFunciones.mostrarid_productoParametroProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.parametroproductoConstantesFunciones.resaltarid_productoParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_productoParametroProducto));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.parametroproductoConstantesFunciones.resaltarid_productoParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_productoParametroProducto,true,"id_productoParametroProducto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_IDFORMATO));

		if(this.parametroproductoConstantesFunciones.mostrarid_formatoParametroProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProductoConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.parametroproductoConstantesFunciones.resaltarid_formatoParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_formatoParametroProducto));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.parametroproductoConstantesFunciones.resaltarid_formatoParametroProducto,this,this.parametroproductoConstantesFunciones.activarid_formatoParametroProducto,true,"id_formatoParametroProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,ParametroProductoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.parametroproductoConstantesFunciones.mostrardescripcionParametroProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProductoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametroproductoConstantesFunciones.resaltardescripcionParametroProducto,this.parametroproductoConstantesFunciones.activardescripcionParametroProducto,this,true,"descripcionParametroProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroproductoConstantesFunciones.resaltardescripcionParametroProducto,this.parametroproductoConstantesFunciones.activardescripcionParametroProducto,this,true,"descripcionParametroProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroProducto && this.isPermisoGuardarCambiosParametroProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametroproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametroproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroProducto.addColumn(tableColumn);
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
			
			this.jTableDatosParametroProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroProducto && this.isPermisoGuardarCambiosParametroProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroProducto && this.isPermisoGuardarCambiosParametroProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroProducto.moveColumn(this.jTableDatosParametroProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroProducto.moveColumn(this.jTableDatosParametroProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroProducto.moveColumn(this.jTableDatosParametroProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametroproductoLogic.getParametroProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametroproductos.size()-1;
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
		//this.jTableDatosParametroProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroProducto();
			
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
				
				//this.isEsNuevoParametroProducto=false;
					
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
				if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametroproducto.getsType().equals("DUPLICADO")
				   || this.parametroproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroProducto=true;
				
				} else {
					this.isEsNuevoParametroProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.parametroproducto.getId()>=0 && !this.parametroproducto.getIsNew()) {						
						this.isEsNuevoParametroProducto=false;
						
					} else {
						this.isEsNuevoParametroProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroProducto(esRelaciones);						
				
				this.seleccionarParametroProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametroproducto.getId()<0) {
					this.isEsNuevoParametroProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroProducto(evt,rowIndex);
				}	
				
				if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroProducto: " + this.dDif); 
					}
				}								
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametroproducto)) {
					if(this.parametroproducto.getId()>0) {
						this.parametroproducto.setIsDeleted(true);
						
						this.parametroproductosEliminados.add(this.parametroproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroproductoLogic.getParametroProductos().remove(this.parametroproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroproductos.remove(this.parametroproducto);				
					}
					
					
					((ParametroProductoModel) this.jTableDatosParametroProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroProducto) {
			
			if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroProducto(this.parametroproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametroproductoConstantesFunciones.cargarid_empresaParametroProducto || this.parametroproductoConstantesFunciones.event_dependid_empresaParametroProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametroproducto.getid_empresa());
									//this.inicializarActualizarBindingParametroProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametroproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametroproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametroproducto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.parametroproductoConstantesFunciones.cargarid_sucursalParametroProducto || this.parametroproductoConstantesFunciones.event_dependid_sucursalParametroProducto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.parametroproducto.getid_sucursal());
									//this.inicializarActualizarBindingParametroProducto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(parametroproducto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(parametroproducto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.parametroproducto.getid_sucursal(),false,"Formulario");

					//Modulo
					if(!this.parametroproductoConstantesFunciones.cargarid_moduloParametroProducto || this.parametroproductoConstantesFunciones.event_dependid_moduloParametroProducto) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.parametroproducto.getid_modulo());
									//this.inicializarActualizarBindingParametroProducto(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(parametroproducto.getModulo()!=null) {
							this.modulosForeignKey.add(parametroproducto.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.parametroproducto.getid_modulo(),false,"Formulario");

					//Transaccion
					if(!this.parametroproductoConstantesFunciones.cargarid_transaccionParametroProducto || this.parametroproductoConstantesFunciones.event_dependid_transaccionParametroProducto) {
						//this.cargarCombosTransaccionsForeignKeyLista(" where id="+this.parametroproducto.getid_transaccion());
									//this.inicializarActualizarBindingParametroProducto(false,false);
						this.transaccionsForeignKey=new ArrayList<Transaccion>();

						if(parametroproducto.getTransaccion()!=null) {
							this.transaccionsForeignKey.add(parametroproducto.getTransaccion());
						}

						this.addItemDefectoCombosForeignKeyTransaccion();
						this.cargarCombosFrameTransaccionsForeignKey("Todos");
					}
					this.setActualTransaccionForeignKey(this.parametroproducto.getid_transaccion(),false,"Formulario");

					//TipoTransaccionModulo
					if(!this.parametroproductoConstantesFunciones.cargarid_tipo_transaccion_moduloParametroProducto || this.parametroproductoConstantesFunciones.event_dependid_tipo_transaccion_moduloParametroProducto) {
						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(" where id="+this.parametroproducto.getid_tipo_transaccion_modulo());
									//this.inicializarActualizarBindingParametroProducto(false,false);
						this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

						if(parametroproducto.getTipoTransaccionModulo()!=null) {
							this.tipotransaccionmodulosForeignKey.add(parametroproducto.getTipoTransaccionModulo());
						}

						this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
						this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
					}
					this.setActualTipoTransaccionModuloForeignKey(this.parametroproducto.getid_tipo_transaccion_modulo(),false,"Formulario");

					//Bodega
					if(!this.parametroproductoConstantesFunciones.cargarid_bodegaParametroProducto || this.parametroproductoConstantesFunciones.event_dependid_bodegaParametroProducto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.parametroproducto.getid_bodega());
									//this.inicializarActualizarBindingParametroProducto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(parametroproducto.getBodega()!=null) {
							this.bodegasForeignKey.add(parametroproducto.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.parametroproducto.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.parametroproductoConstantesFunciones.cargarid_productoParametroProducto || this.parametroproductoConstantesFunciones.event_dependid_productoParametroProducto) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.parametroproducto.getid_producto());
									//this.inicializarActualizarBindingParametroProducto(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(parametroproducto.getProducto()!=null) {
							this.productosForeignKey.add(parametroproducto.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.parametroproducto.getid_producto(),false,"Formulario");

					//Formato
					if(!this.parametroproductoConstantesFunciones.cargarid_formatoParametroProducto || this.parametroproductoConstantesFunciones.event_dependid_formatoParametroProducto) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.parametroproducto.getid_formato());
									//this.inicializarActualizarBindingParametroProducto(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(parametroproducto.getFormato()!=null) {
							this.formatosForeignKey.add(parametroproducto.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.parametroproducto.getid_formato(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroProducto(ParametroProducto parametroproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroProducto(parametroproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroProducto(ParametroProducto parametroproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroProducto(parametroproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroProducto(parametroproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroProducto(parametroproducto);
	}
	
	public void setVariablesObjetoActualToFormularioParametroProducto(ParametroProducto parametroproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.setText(parametroproducto.getId().toString());
			this.jInternalFrameDetalleFormParametroProducto.jTextAreadescripcionParametroProducto.setText(parametroproducto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroProducto parametroproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametroproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroProducto parametroproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametroproductoLocal=this.parametroproducto;
			} else {
				parametroproductoLocal=this.parametroproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametroproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroProducto(parametroproductoLocal,true);
					
					if(parametroproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametroproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametroproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroProducto(ParametroProducto parametroproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroProducto(parametroproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(parametroproducto);
	}
	
	public void setVariablesFormularioToObjetoActualParametroProducto(ParametroProducto parametroproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroProducto(parametroproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroProducto(ParametroProducto parametroproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.getText()==null || this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.getText()=="" || this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.setText("0");
			}

			if(conColumnasBase) {parametroproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabelIdParametroProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroproducto.setdescripcion(this.jInternalFrameDetalleFormParametroProducto.jTextAreadescripcionParametroProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroProductoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProducto.jLabeldescripcionParametroProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroProducto(ParametroProducto parametroproductoBean,ParametroProducto parametroproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametroproductoBean.getid_modulo()!=null && !parametroproductoBean.getid_modulo().equals(-1L))) {parametroproducto.setid_modulo(parametroproductoBean.getid_modulo());}
			if(conDefault || (!conDefault && parametroproductoBean.getid_transaccion()!=null && !parametroproductoBean.getid_transaccion().equals(-1L))) {parametroproducto.setid_transaccion(parametroproductoBean.getid_transaccion());}
			if(conDefault || (!conDefault && parametroproductoBean.getid_bodega()!=null && !parametroproductoBean.getid_bodega().equals(-1L))) {parametroproducto.setid_bodega(parametroproductoBean.getid_bodega());}
			if(conDefault || (!conDefault && parametroproductoBean.getid_producto()!=null && !parametroproductoBean.getid_producto().equals(-1L))) {parametroproducto.setid_producto(parametroproductoBean.getid_producto());}
			if(conDefault || (!conDefault && parametroproductoBean.getid_formato()!=null && !parametroproductoBean.getid_formato().equals(null))) {parametroproducto.setid_formato(parametroproductoBean.getid_formato());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroProducto(ParametroProducto parametroproductoOrigen,ParametroProducto parametroproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroproductoOrigen.getId()!=null && !parametroproductoOrigen.getId().equals(0L))) {parametroproducto.setId(parametroproductoOrigen.getId());}}
			if(conDefault || (!conDefault && parametroproductoOrigen.getid_modulo()!=null && !parametroproductoOrigen.getid_modulo().equals(-1L))) {parametroproducto.setid_modulo(parametroproductoOrigen.getid_modulo());}
			if(conDefault || (!conDefault && parametroproductoOrigen.getid_transaccion()!=null && !parametroproductoOrigen.getid_transaccion().equals(-1L))) {parametroproducto.setid_transaccion(parametroproductoOrigen.getid_transaccion());}
			if(conDefault || (!conDefault && parametroproductoOrigen.getid_tipo_transaccion_modulo()!=null && !parametroproductoOrigen.getid_tipo_transaccion_modulo().equals(null))) {parametroproducto.setid_tipo_transaccion_modulo(parametroproductoOrigen.getid_tipo_transaccion_modulo());}
			if(conDefault || (!conDefault && parametroproductoOrigen.getid_bodega()!=null && !parametroproductoOrigen.getid_bodega().equals(-1L))) {parametroproducto.setid_bodega(parametroproductoOrigen.getid_bodega());}
			if(conDefault || (!conDefault && parametroproductoOrigen.getid_producto()!=null && !parametroproductoOrigen.getid_producto().equals(-1L))) {parametroproducto.setid_producto(parametroproductoOrigen.getid_producto());}
			if(conDefault || (!conDefault && parametroproductoOrigen.getid_formato()!=null && !parametroproductoOrigen.getid_formato().equals(null))) {parametroproducto.setid_formato(parametroproductoOrigen.getid_formato());}
			if(conDefault || (!conDefault && parametroproductoOrigen.getdescripcion()!=null && !parametroproductoOrigen.getdescripcion().equals(""))) {parametroproducto.setdescripcion(parametroproductoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroProducto(ParametroProducto parametroproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.setText(parametroproducto.getId().toString());
			this.jInternalFrameDetalleFormParametroProducto.jTextAreadescripcionParametroProducto.setText(parametroproducto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroProducto(ParametroProductoBean parametroproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.setText(parametroproductoBean.getId().toString());
			this.jInternalFrameDetalleFormParametroProducto.jTextAreadescripcionParametroProducto.setText(parametroproductoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroProducto(ParametroProductoParameterReturnGeneral parametroproductoReturnGeneral,ParametroProductoBean parametroproductoBean,Boolean conDefault) throws Exception { 
		try {
			ParametroProducto parametroproductoLocal=new ParametroProducto();
			
			parametroproductoLocal=parametroproductoReturnGeneral.getParametroProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroproductoLocal.getId()!=null && !parametroproductoLocal.getId().equals(0L))) {parametroproductoBean.setId(parametroproductoLocal.getId());}}
			if(conDefault || (!conDefault && parametroproductoLocal.getid_modulo()!=null && !parametroproductoLocal.getid_modulo().equals(-1L))) {parametroproductoBean.setid_modulo(parametroproductoLocal.getid_modulo());}
			if(conDefault || (!conDefault && parametroproductoLocal.getid_transaccion()!=null && !parametroproductoLocal.getid_transaccion().equals(-1L))) {parametroproductoBean.setid_transaccion(parametroproductoLocal.getid_transaccion());}
			if(conDefault || (!conDefault && parametroproductoLocal.getid_bodega()!=null && !parametroproductoLocal.getid_bodega().equals(-1L))) {parametroproductoBean.setid_bodega(parametroproductoLocal.getid_bodega());}
			if(conDefault || (!conDefault && parametroproductoLocal.getid_producto()!=null && !parametroproductoLocal.getid_producto().equals(-1L))) {parametroproductoBean.setid_producto(parametroproductoLocal.getid_producto());}
			if(conDefault || (!conDefault && parametroproductoLocal.getid_formato()!=null && !parametroproductoLocal.getid_formato().equals(null))) {parametroproductoBean.setid_formato(parametroproductoLocal.getid_formato());}
			if(conDefault || (!conDefault && parametroproductoLocal.getdescripcion()!=null && !parametroproductoLocal.getdescripcion().equals(""))) {parametroproductoBean.setdescripcion(parametroproductoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroProductoGenerico(Long idParametroProductoSeleccionado,JComboBox jComboBoxParametroProducto,List<ParametroProducto> parametroproductosLocal)throws Exception {
		try {
			ParametroProducto  parametroproductoTemp=null;

			for(ParametroProducto parametroproductoAux:parametroproductosLocal) {
				if(parametroproductoAux.getId()!=null && parametroproductoAux.getId().equals(idParametroProductoSeleccionado)) {
					parametroproductoTemp=parametroproductoAux;
					break;
				}
			}

			jComboBoxParametroProducto.setSelectedItem(parametroproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroProductoGenerico(JComboBox jComboBoxParametroProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroproducto=(ParametroProducto) parametroproductoLogic.getParametroProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroproducto =(ParametroProducto) parametroproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametroproducto.getIsNew() && !parametroproducto.getIsChanged() && !parametroproducto.getIsDeleted()) {
				sDescripcion=parametroproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametroproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!parametroproducto.getIsNew() && !parametroproducto.getIsChanged() && !parametroproducto.getIsDeleted()) {
				sDescripcion=parametroproducto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=parametroproducto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!parametroproducto.getIsNew() && !parametroproducto.getIsChanged() && !parametroproducto.getIsDeleted()) {
				sDescripcion=parametroproducto.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=parametroproducto.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!parametroproducto.getIsNew() && !parametroproducto.getIsChanged() && !parametroproducto.getIsDeleted()) {
				sDescripcion=parametroproducto.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=parametroproducto.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("TipoTransaccionModulo")) {
			//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
			if(!parametroproducto.getIsNew() && !parametroproducto.getIsChanged() && !parametroproducto.getIsDeleted()) {
				sDescripcion=parametroproducto.gettipotransaccionmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
				sDescripcion=parametroproducto.gettipotransaccionmodulo_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!parametroproducto.getIsNew() && !parametroproducto.getIsChanged() && !parametroproducto.getIsDeleted()) {
				sDescripcion=parametroproducto.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=parametroproducto.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!parametroproducto.getIsNew() && !parametroproducto.getIsChanged() && !parametroproducto.getIsDeleted()) {
				sDescripcion=parametroproducto.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=parametroproducto.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!parametroproducto.getIsNew() && !parametroproducto.getIsChanged() && !parametroproducto.getIsDeleted()) {
				sDescripcion=parametroproducto.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=parametroproducto.getformato_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroProducto parametroproductoRow=new ParametroProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroproductoRow=(ParametroProducto) parametroproductoLogic.getParametroProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroproductoRow=(ParametroProducto) parametroproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroProducto.setVisible((this.isVisibilidadCeldaNuevoParametroProducto && this.isPermisoNuevoParametroProducto));			
			this.jButtonDuplicarParametroProducto.setVisible((this.isVisibilidadCeldaDuplicarParametroProducto && this.isPermisoDuplicarParametroProducto));			
			this.jButtonCopiarParametroProducto.setVisible((this.isVisibilidadCeldaCopiarParametroProducto && this.isPermisoCopiarParametroProducto));
			this.jButtonVerFormParametroProducto.setVisible((this.isVisibilidadCeldaVerFormParametroProducto && this.isPermisoVerFormParametroProducto));
			
			this.jButtonAbrirOrderByParametroProducto.setVisible((this.isVisibilidadCeldaOrdenParametroProducto && this.isPermisoOrdenParametroProducto));			
			
			this.jButtonNuevoRelacionesParametroProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroProducto && this.isPermisoNuevoParametroProducto));			
			this.jButtonNuevoGuardarCambiosParametroProducto.setVisible((this.isVisibilidadCeldaNuevoParametroProducto && this.isPermisoNuevoParametroProducto && this.isPermisoGuardarCambiosParametroProducto));
			
			if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonModificarParametroProducto.setVisible((this.isVisibilidadCeldaModificarParametroProducto && this.isPermisoActualizarParametroProducto));	
			this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarParametroProducto.setVisible((this.isVisibilidadCeldaActualizarParametroProducto && this.isPermisoActualizarParametroProducto));	
			this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarParametroProducto.setVisible((this.isVisibilidadCeldaEliminarParametroProducto && this.isPermisoEliminarParametroProducto));
			this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarParametroProducto.setVisible(this.isVisibilidadCeldaCancelarParametroProducto);							
			this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosParametroProducto.setVisible((this.isVisibilidadCeldaGuardarParametroProducto && this.isPermisoGuardarCambiosParametroProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroProducto && this.isPermisoGuardarCambiosParametroProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroProducto.setVisible((this.isVisibilidadCeldaNuevoParametroProducto && this.isPermisoNuevoParametroProducto));						
			this.jButtonDuplicarToolBarParametroProducto.setVisible((this.isVisibilidadCeldaDuplicarParametroProducto && this.isPermisoDuplicarParametroProducto));						
			this.jButtonCopiarToolBarParametroProducto.setVisible((this.isVisibilidadCeldaCopiarParametroProducto && this.isPermisoCopiarParametroProducto));			
			this.jButtonVerFormToolBarParametroProducto.setVisible((this.isVisibilidadCeldaVerFormParametroProducto && this.isPermisoVerFormParametroProducto));			
			this.jButtonAbrirOrderByToolBarParametroProducto.setVisible((this.isVisibilidadCeldaOrdenParametroProducto && this.isPermisoOrdenParametroProducto));
			this.jButtonNuevoRelacionesToolBarParametroProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroProducto && this.isPermisoNuevoParametroProducto));			
			this.jButtonNuevoGuardarCambiosToolBarParametroProducto.setVisible((this.isVisibilidadCeldaNuevoParametroProducto && this.isPermisoNuevoParametroProducto && this.isPermisoGuardarCambiosParametroProducto));			
			
			if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonModificarToolBarParametroProducto.setVisible((this.isVisibilidadCeldaModificarParametroProducto && this.isPermisoActualizarParametroProducto));	
			this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarToolBarParametroProducto.setVisible((this.isVisibilidadCeldaActualizarParametroProducto  && this.isPermisoActualizarParametroProducto));	
			this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarToolBarParametroProducto.setVisible((this.isVisibilidadCeldaEliminarParametroProducto && this.isPermisoEliminarParametroProducto));
			this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarToolBarParametroProducto.setVisible(this.isVisibilidadCeldaCancelarParametroProducto);				
			this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosToolBarParametroProducto.setVisible((this.isVisibilidadCeldaGuardarParametroProducto && this.isPermisoGuardarCambiosParametroProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroProducto && this.isPermisoGuardarCambiosParametroProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroProducto.setVisible((this.isVisibilidadCeldaNuevoParametroProducto && this.isPermisoNuevoParametroProducto));			
			this.jMenuItemDuplicarParametroProducto.setVisible((this.isVisibilidadCeldaDuplicarParametroProducto && this.isPermisoDuplicarParametroProducto));			
			this.jMenuItemCopiarParametroProducto.setVisible((this.isVisibilidadCeldaCopiarParametroProducto && this.isPermisoCopiarParametroProducto));			
			this.jMenuItemVerFormParametroProducto.setVisible((this.isVisibilidadCeldaVerFormParametroProducto && this.isPermisoVerFormParametroProducto));			
			this.jMenuItemAbrirOrderByParametroProducto.setVisible((this.isVisibilidadCeldaOrdenParametroProducto && this.isPermisoOrdenParametroProducto));			
			//this.jMenuItemMostrarOcultarParametroProducto.setVisible((this.isVisibilidadCeldaOrdenParametroProducto && this.isPermisoOrdenParametroProducto));
			this.jMenuItemDetalleAbrirOrderByParametroProducto.setVisible((this.isVisibilidadCeldaOrdenParametroProducto && this.isPermisoOrdenParametroProducto));			
			//this.jMenuItemDetalleMostrarOcultarParametroProducto.setVisible((this.isVisibilidadCeldaOrdenParametroProducto && this.isPermisoOrdenParametroProducto));			
			this.jMenuItemNuevoRelacionesParametroProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroProducto && this.isPermisoNuevoParametroProducto));			
			this.jMenuItemNuevoGuardarCambiosParametroProducto.setVisible((this.isVisibilidadCeldaNuevoParametroProducto && this.isPermisoNuevoParametroProducto && this.isPermisoGuardarCambiosParametroProducto));									
			
			if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			this.jInternalFrameDetalleFormParametroProducto.jMenuItemModificarParametroProducto.setVisible((this.isVisibilidadCeldaModificarParametroProducto && this.isPermisoActualizarParametroProducto));	
			this.jInternalFrameDetalleFormParametroProducto.jMenuItemActualizarParametroProducto.setVisible((this.isVisibilidadCeldaActualizarParametroProducto && this.isPermisoActualizarParametroProducto));	
			this.jInternalFrameDetalleFormParametroProducto.jMenuItemEliminarParametroProducto.setVisible((this.isVisibilidadCeldaEliminarParametroProducto && this.isPermisoEliminarParametroProducto));
			this.jInternalFrameDetalleFormParametroProducto.jMenuItemCancelarParametroProducto.setVisible(this.isVisibilidadCeldaCancelarParametroProducto);				
			}
			
			this.jMenuItemGuardarCambiosParametroProducto.setVisible((this.isVisibilidadCeldaGuardarParametroProducto && this.isPermisoGuardarCambiosParametroProducto));						
			this.jMenuItemGuardarCambiosTablaParametroProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroProducto && this.isPermisoGuardarCambiosParametroProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroProducto=this.jButtonNuevoParametroProducto.isVisible();
			this.isVisibilidadCeldaDuplicarParametroProducto=this.jButtonDuplicarParametroProducto.isVisible();
			this.isVisibilidadCeldaCopiarParametroProducto=this.jButtonCopiarParametroProducto.isVisible();
			this.isVisibilidadCeldaVerFormParametroProducto=this.jButtonVerFormParametroProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroProducto=this.jButtonAbrirOrderByParametroProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=this.jButtonNuevoRelacionesParametroProducto.isVisible();
			this.isVisibilidadCeldaModificarParametroProducto=this.jButtonModificarParametroProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			this.isVisibilidadCeldaActualizarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarParametroProducto.isVisible();
			this.isVisibilidadCeldaEliminarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarParametroProducto.isVisible();
			this.isVisibilidadCeldaCancelarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarParametroProducto.isVisible();
			this.isVisibilidadCeldaGuardarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosParametroProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=this.jButtonGuardarCambiosTablaParametroProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroProducto=this.jButtonNuevoToolBarParametroProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=this.jButtonNuevoRelacionesToolBarParametroProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			this.isVisibilidadCeldaModificarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jButtonModificarToolBarParametroProducto.isVisible();
			this.isVisibilidadCeldaActualizarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarToolBarParametroProducto.isVisible();
			this.isVisibilidadCeldaEliminarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarToolBarParametroProducto.isVisible();
			this.isVisibilidadCeldaCancelarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarToolBarParametroProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroProducto=this.jButtonGuardarCambiosToolBarParametroProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=this.jButtonGuardarCambiosTablaToolBarParametroProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroProducto=this.jMenuItemNuevoParametroProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=this.jMenuItemNuevoRelacionesParametroProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			this.isVisibilidadCeldaModificarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jMenuItemModificarParametroProducto.isVisible();
			this.isVisibilidadCeldaActualizarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jMenuItemActualizarParametroProducto.isVisible();
			this.isVisibilidadCeldaEliminarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jMenuItemEliminarParametroProducto.isVisible();
			this.isVisibilidadCeldaCancelarParametroProducto=this.jInternalFrameDetalleFormParametroProducto.jMenuItemCancelarParametroProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroProducto=this.jMenuItemGuardarCambiosParametroProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=this.jMenuItemGuardarCambiosTablaParametroProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroProducto(Boolean esInicializar) {
		if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroProducto() {
		this.jButtonNuevoParametroProducto.setVisible(this.isPermisoNuevoParametroProducto);			
		this.jButtonDuplicarParametroProducto.setVisible(this.isPermisoDuplicarParametroProducto);			
		this.jButtonCopiarParametroProducto.setVisible(this.isPermisoCopiarParametroProducto);			
		this.jButtonVerFormParametroProducto.setVisible(this.isPermisoVerFormParametroProducto);			
		
		this.jButtonAbrirOrderByParametroProducto.setVisible(this.isPermisoOrdenParametroProducto);					
		
		this.jButtonNuevoRelacionesParametroProducto.setVisible(this.isPermisoNuevoParametroProducto);			
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonModificarParametroProducto.setVisible(this.isPermisoActualizarParametroProducto);	
			this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarParametroProducto.setVisible(this.isPermisoActualizarParametroProducto);	
			this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarParametroProducto.setVisible(this.isPermisoEliminarParametroProducto);
			this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarParametroProducto.setVisible(this.isVisibilidadCeldaCancelarParametroProducto);						
			this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosParametroProducto.setVisible(this.isPermisoGuardarCambiosParametroProducto);							
		}
		
		this.jButtonGuardarCambiosTablaParametroProducto.setVisible(this.isPermisoActualizarParametroProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroProducto() {
		this.jInternalFrameDetalleFormParametroProducto.jButtonModificarParametroProducto.setVisible(this.isPermisoActualizarParametroProducto);	
		this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarParametroProducto.setVisible(this.isPermisoActualizarParametroProducto);	
		this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarParametroProducto.setVisible(this.isPermisoEliminarParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarParametroProducto.setVisible(this.isVisibilidadCeldaCancelarParametroProducto);							
		this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosParametroProducto.setVisible((this.isVisibilidadCeldaGuardarParametroProducto && this.isPermisoGuardarCambiosParametroProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroProducto() {
		if(ParametroProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroProducto() {
	}
	
	public void jTableDatosParametroProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametroproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametroproductoLogic.getConnexion());

				if(this.parametroproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametroproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProducto=(TitledBorder)this.jScrollPanelDatosParametroProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametroproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalParametroProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebParametroProducto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.parametroproductoLogic.getConnexion());

				if(this.parametroproducto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.parametroproducto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProducto=(TitledBorder)this.jScrollPanelDatosParametroProducto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderParametroProducto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.parametroproducto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloParametroProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebParametroProducto(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.parametroproductoLogic.getConnexion());

				if(this.parametroproducto.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.parametroproducto.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProducto=(TitledBorder)this.jScrollPanelDatosParametroProducto.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderParametroProducto.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.parametroproducto.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionParametroProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebParametroProducto(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametroproductoLogic.getConnexion());

				if(this.parametroproducto.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.parametroproducto.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProducto=(TitledBorder)this.jScrollPanelDatosParametroProducto.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderParametroProducto.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.parametroproducto.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_transaccion_moduloParametroProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipotransaccionmodulo=true;

			idTienePermisotipotransaccionmodulo=this.tienePermisosUsuarioEnPaginaWebParametroProducto(TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipotransaccionmodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);

				this.tipotransaccionmoduloBeanSwingJInternalFrame=new TipoTransaccionModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipotransaccionmoduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipotransaccionmoduloBeanSwingJInternalFrame.getTipoTransaccionModuloLogic().setConnexion(this.parametroproductoLogic.getConnexion());

				if(this.parametroproducto.getid_tipo_transaccion_modulo()!=null) {
					this.tipotransaccionmoduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setIdActual(this.parametroproducto.getid_tipo_transaccion_modulo());
					this.tipotransaccionmoduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTransaccionModulo();
				}

				JInternalFrameBase jinternalFrame =this.tipotransaccionmoduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProducto=(TitledBorder)this.jScrollPanelDatosParametroProducto.getBorder();
				TitledBorder titledBordertipotransaccionmodulo=(TitledBorder)this.tipotransaccionmoduloBeanSwingJInternalFrame.jScrollPanelDatosTipoTransaccionModulo.getBorder();

				titledBordertipotransaccionmodulo.setTitle(titledBorderParametroProducto.getTitle() + " -> Tipo Transaccion Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_transaccion_moduloParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getid_tipo_transaccion_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_transaccion_modulo = "+this.parametroproducto.getid_tipo_transaccion_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaParametroProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebParametroProducto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.parametroproductoLogic.getConnexion());

				if(this.parametroproducto.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.parametroproducto.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProducto=(TitledBorder)this.jScrollPanelDatosParametroProducto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderParametroProducto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.parametroproducto.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoParametroProductoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderParametroProducto=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosParametroProducto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderParametroProducto=(TitledBorder)this.jScrollPanelDatosParametroProducto.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderParametroProducto.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoParametroProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebParametroProducto(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.parametroproductoLogic.getConnexion());

				if(this.parametroproducto.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.parametroproducto.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProducto=(TitledBorder)this.jScrollPanelDatosParametroProducto.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderParametroProducto.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.parametroproducto.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoParametroProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebParametroProducto(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.parametroproductoLogic.getConnexion());

				if(this.parametroproducto.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.parametroproducto.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProducto=(TitledBorder)this.jScrollPanelDatosParametroProducto.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderParametroProducto.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.parametroproducto.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionParametroProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.getparametroproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroproducto==null) {
						this.parametroproducto = new ParametroProducto();
					}

					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);
				}

				if(this.parametroproducto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.parametroproducto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaParametroProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProducto(false,false);

			this.getParametroProductosFK_IdBodega();

			this.inicializarActualizarBindingParametroProducto(false);

			//if(ParametroProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaParametroProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProducto(false,false);

			this.getParametroProductosFK_IdEmpresa();

			this.inicializarActualizarBindingParametroProducto(false);

			//if(ParametroProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoParametroProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProducto(false,false);

			this.getParametroProductosFK_IdFormato();

			this.inicializarActualizarBindingParametroProducto(false);

			//if(ParametroProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloParametroProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProducto(false,false);

			this.getParametroProductosFK_IdModulo();

			this.inicializarActualizarBindingParametroProducto(false);

			//if(ParametroProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoParametroProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProducto(false,false);

			this.getParametroProductosFK_IdProducto();

			this.inicializarActualizarBindingParametroProducto(false);

			//if(ParametroProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalParametroProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProducto(false,false);

			this.getParametroProductosFK_IdSucursal();

			this.inicializarActualizarBindingParametroProducto(false);

			//if(ParametroProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTransaccionModuloParametroProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProducto(false,false);

			this.getParametroProductosFK_IdTipoTransaccionModulo();

			this.inicializarActualizarBindingParametroProducto(false);

			//if(ParametroProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionParametroProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProducto(false,false);

			this.getParametroProductosFK_IdTransaccion();

			this.inicializarActualizarBindingParametroProducto(false);

			//if(ParametroProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroProducto() {
		if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) {
			this.jInternalFrameDetalleFormParametroProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroProducto.dispose();
			this.jInternalFrameDetalleFormParametroProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroProducto!=null) {
			this.jInternalFrameReporteDinamicoParametroProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroProducto.dispose();
			this.jInternalFrameReporteDinamicoParametroProducto=null;
		}
		
		if(this.jInternalFrameImportacionParametroProducto!=null) {
			this.jInternalFrameImportacionParametroProducto.setVisible(false);	    			
			this.jInternalFrameImportacionParametroProducto.dispose();
			this.jInternalFrameImportacionParametroProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroProducto();
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroProducto")) {
				jButtonNuevoParametroProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroProducto")) {
				jButtonDuplicarParametroProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroProducto")) {
				jButtonCopiarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroProducto")) {
				jButtonVerFormParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroProducto")) {
				jButtonNuevoParametroProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroProducto")) {
				jButtonDuplicarParametroProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroProducto")) {
				jButtonNuevoParametroProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroProducto")) {
				jButtonDuplicarParametroProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroProducto")) {
				jButtonNuevoParametroProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroProducto")) {
				jButtonNuevoParametroProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroProducto")) {
				jButtonNuevoParametroProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroProducto")) {
				jButtonModificarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroProducto")) {
				jButtonModificarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroProducto")) {
				jButtonModificarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroProducto")) {
				jButtonActualizarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroProducto")) {
				jButtonActualizarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroProducto")) {
				jButtonActualizarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroProducto")) {
				jButtonEliminarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroProducto")) {
				jButtonEliminarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroProducto")) {
				jButtonEliminarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroProducto")) {
				jButtonCancelarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroProducto")) {
				jButtonCancelarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroProducto")) {
				jButtonCancelarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroProducto")) {
				jButtonCerrarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroProducto")) {
				jButtonCerrarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroProducto")) {
				jButtonCerrarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroProducto")) {
				jButtonMostrarOcultarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroProducto")) {
				jButtonCancelarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroProducto")) {
				jButtonGuardarCambiosParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroProducto")) {
				jButtonGuardarCambiosParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroProducto")) {
				jButtonCopiarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroProducto")) {
				jButtonVerFormParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroProducto")) {
				jButtonGuardarCambiosParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroProducto")) {
				jButtonCopiarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroProducto")) {
				jButtonVerFormParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroProducto")) {
				jButtonGuardarCambiosParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroProducto")) {
				jButtonGuardarCambiosParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroProducto")) {
				jButtonGuardarCambiosParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroProducto")) {
				jButtonRecargarInformacionParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroProducto")) {
				jButtonRecargarInformacionParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroProducto")) {
				jButtonRecargarInformacionParametroProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroProducto")) {
				jButtonAnterioresParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroProducto")) {
				jButtonAnterioresParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroProducto")) {
				jButtonAnterioresParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroProducto")) {
				jButtonSiguientesParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroProducto")) {
				jButtonSiguientesParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroProducto")) {
				jButtonSiguientesParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroProducto")) {
				jButtonAbrirOrderByParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroProducto")) {
				jButtonMostrarOcultarParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroProducto")) {
				jButtonNuevoGuardarCambiosParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroProducto")) {
				jButtonNuevoGuardarCambiosParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroProducto")) {
				jButtonNuevoGuardarCambiosParametroProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroProducto")) {
				jButtonCerrarReporteDinamicoParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroProducto")) {
				jButtonGenerarReporteDinamicoParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroProducto")) {
				
				jButtonGenerarExcelReporteDinamicoParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroProducto")) {
				jButtonCerrarImportacionParametroProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroProducto")) {
				
				jButtonGenerarImportacionParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroProducto")) {
				
				jButtonAbrirImportacionParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroProducto")) {
				jComboBoxTiposAccionesParametroProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroProducto")) {
				jComboBoxTiposRelacionesParametroProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroProducto")) {
				jComboBoxTiposAccionesParametroProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroProducto")) {
				
				jComboBoxTiposSeleccionarParametroProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroProducto")) {
				jTextFieldValorCampoGeneralParametroProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroProducto")) {
				jButtonAbrirOrderByParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroProducto")) {
				jButtonAbrirOrderByParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroProducto")) {
				jButtonCerrarOrderByParametroProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroProductoBusqueda")) {
				this.jButtonidParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroProductoUpdate")) {
				this.jButtonid_empresaParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroProductoBusqueda")) {
				this.jButtonid_empresaParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroProductoUpdate")) {
				this.jButtonid_sucursalParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroProductoBusqueda")) {
				this.jButtonid_sucursalParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloParametroProductoUpdate")) {
				this.jButtonid_moduloParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloParametroProductoBusqueda")) {
				this.jButtonid_moduloParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionParametroProductoUpdate")) {
				this.jButtonid_transaccionParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionParametroProductoBusqueda")) {
				this.jButtonid_transaccionParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloParametroProductoUpdate")) {
				this.jButtonid_tipo_transaccion_moduloParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloParametroProductoBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaParametroProductoUpdate")) {
				this.jButtonid_bodegaParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaParametroProductoBusqueda")) {
				this.jButtonid_bodegaParametroProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoParametroProducto")) {
				this.jButtonid_productoParametroProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoParametroProductoUpdate")) {
				this.jButtonid_productoParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoParametroProductoBusqueda")) {
				this.jButtonid_productoParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoParametroProductoUpdate")) {
				this.jButtonid_formatoParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoParametroProductoBusqueda")) {
				this.jButtonid_formatoParametroProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroProductoBusqueda")) {
				this.jButtondescripcionParametroProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdModuloParametroProducto")) {
				this.jButtonFK_IdModuloParametroProductoActionPerformed(evt);
			}
			
			;
			
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				


				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroProducto parametroproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametroproductoLocal=this.parametroproducto;
			} else {
				parametroproductoLocal=this.parametroproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
							
				
				


				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
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
			
			


			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
								
						
				


				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
								
				
				


				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
							
				
				


				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproductoAnterior =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroproductoAnterior =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
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
			
			


			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
								
				
				


				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroProducto")) {
					jCheckBoxSeleccionarTodosParametroProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroProducto")) {
					jCheckBoxSeleccionadosParametroProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroProducto")) {
					
				}
				
				


				
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
												
				
				


				
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproductoAnterior =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroproductoAnterior =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
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
			
			


			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroproducto);
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
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
				
				


				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproductoAnterior =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametroproducto =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametroproducto =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametroproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroProducto")) {
				
				}
				
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroProducto")) {
			
			}
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroProducto();
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
			if(sTipo.equals("NuevoParametroProducto")) {
				jButtonNuevoParametroProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroProducto")) {
				jButtonDuplicarParametroProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroProducto")) {
				jButtonCopiarParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroProducto")) {
				jButtonVerFormParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroProducto")) {
				jButtonNuevoParametroProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroProducto")) {
				jButtonModificarParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroProducto")) {
				jButtonActualizarParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroProducto")) {
				jButtonEliminarParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroProducto")) {
				jButtonGuardarCambiosParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroProducto")) {
				jButtonCancelarParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroProducto")) {
				jButtonCerrarParametroProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroProducto")) {
				jButtonGuardarCambiosParametroProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroProducto")) {
				jButtonNuevoGuardarCambiosParametroProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroProducto")) {
				jButtonAbrirOrderByParametroProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroProducto")) {
				jButtonRecargarInformacionParametroProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroProducto")) {
				jButtonAnterioresParametroProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroProducto")) {
				jButtonSiguientesParametroProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroProductoBusqueda")) {
				this.jButtonidParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroProductoUpdate")) {
				this.jButtonid_empresaParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroProductoBusqueda")) {
				this.jButtonid_empresaParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroProductoUpdate")) {
				this.jButtonid_sucursalParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroProductoBusqueda")) {
				this.jButtonid_sucursalParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloParametroProductoUpdate")) {
				this.jButtonid_moduloParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloParametroProductoBusqueda")) {
				this.jButtonid_moduloParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionParametroProductoUpdate")) {
				this.jButtonid_transaccionParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionParametroProductoBusqueda")) {
				this.jButtonid_transaccionParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloParametroProductoUpdate")) {
				this.jButtonid_tipo_transaccion_moduloParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloParametroProductoBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaParametroProductoUpdate")) {
				this.jButtonid_bodegaParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaParametroProductoBusqueda")) {
				this.jButtonid_bodegaParametroProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoParametroProducto")) {
				this.jButtonid_productoParametroProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoParametroProductoUpdate")) {
				this.jButtonid_productoParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoParametroProductoBusqueda")) {
				this.jButtonid_productoParametroProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoParametroProductoUpdate")) {
				this.jButtonid_formatoParametroProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoParametroProductoBusqueda")) {
				this.jButtonid_formatoParametroProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroProductoBusqueda")) {
				this.jButtondescripcionParametroProductoBusquedaActionPerformed(evt);
			}
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroProducto")) {
				closingInternalFrameParametroProducto();
				
			} else if(sTipo.equals("jButtonCancelarParametroProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroProducto = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroProductoBeanSwingJInternalFrame jInternalFrameParent=(ParametroProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroProductoActionPerformed(null);
			}
			
			ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroproducto,new Object(),this.parametroproductoParameterGeneral,this.parametroproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametroproducto)) {
			if(!esControlTabla) {
				if(ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);			
				}
				
				if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroProducto(this.parametroproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroproductoReturnGeneral=parametroproductoLogic.procesarEventosParametroProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroproductoLogic.getParametroProductos(),this.parametroproducto,this.parametroproductoParameterGeneral,this.isEsNuevoParametroProducto,classes);//this.parametroproductoLogic.getParametroProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroProducto(this.parametroproductoReturnGeneral,this.parametroproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroProducto(classes,this.parametroproductoReturnGeneral,this.parametroproductoBean,false);
					}
						
					if(this.parametroproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroProducto(this.parametroproductoReturnGeneral.getParametroProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroProducto(this.parametroproductoReturnGeneral.getParametroProducto());	
					}
						
					if(this.parametroproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroProducto(this.parametroproductoReturnGeneral.getParametroProducto(),classes);//this.parametroproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroProducto(this.parametroproducto,classes);//this.parametroproductoBean);									
				}
			
				if(ParametroProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroProducto(this.parametroproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProducto(this.parametroproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametroproductoAnterior!=null) {
						this.parametroproducto=this.parametroproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroproductoReturnGeneral=parametroproductoLogic.procesarEventosParametroProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroproductoLogic.getParametroProductos(),this.parametroproducto,this.parametroproductoParameterGeneral,this.isEsNuevoParametroProducto,classes);//this.parametroproductoLogic.getParametroProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametroproductoReturnGeneral.getParametroProducto(),parametroproductoLogic.getParametroProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametroproductoReturnGeneral.getParametroProducto(),this.parametroproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroProducto() throws Exception {
		
		ParametroProductoModel parametroproductoModel=(ParametroProductoModel)this.jTableDatosParametroProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroproductoModel.parametroproductos=this.parametroproductoLogic.getParametroProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametroproductoModel.parametroproductos=this.parametroproductos;
		}
		
		
		((ParametroProductoModel) this.jTableDatosParametroProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametroproductoAnterior(),this.parametroproductoLogic.getParametroProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametroproductoAnterior(),this.parametroproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroProducto(ParametroProducto parametroproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
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
										
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroproducto,new Object(),generalEntityParameterGeneral,this.parametroproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametroproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroProductoConstantesFunciones.getClassesRelationshipsOfParametroProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroProductoConstantesFunciones.getClassesRelationshipsFromStringsOfParametroProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroproducto,new Object(),generalEntityParameterGeneral,this.parametroproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroProducto(ParametroProductoBean parametroproductoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroProducto(ArrayList<Classe> classes,ParametroProductoReturnGeneral parametroproductoReturnGeneral,ParametroProductoBean parametroproductoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroProducto(ParametroProducto parametroproducto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametroproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroProducto = new ParametroProductoDetalleFormJInternalFrame(jDesktopPane,this.parametroproductoSessionBean.getConGuardarRelaciones(),this.parametroproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.setVisible(false);
		this.jInternalFrameDetalleFormParametroProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroProducto.parametroproductoLogic=this.parametroproductoLogic;
		
		this.cargarCombosFrameForeignKeyParametroProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroProducto"));
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonModificarParametroProducto.addActionListener(new ButtonActionListener(this,"ModificarParametroProducto"));

		
		this.jInternalFrameDetalleFormParametroProducto.jButtonModificarToolBarParametroProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroProducto"));
					
		this.jInternalFrameDetalleFormParametroProducto.jMenuItemModificarParametroProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroProducto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarParametroProducto.addActionListener (new ButtonActionListener(this,"ActualizarParametroProducto"));
		
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarToolBarParametroProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroProducto"));
						
		this.jInternalFrameDetalleFormParametroProducto.jMenuItemActualizarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroProducto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarParametroProducto.addActionListener (new ButtonActionListener(this,"EliminarParametroProducto"));
		
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroProducto"));
								
		this.jInternalFrameDetalleFormParametroProducto.jMenuItemEliminarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroProducto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarParametroProducto.addActionListener (new ButtonActionListener(this,"CancelarParametroProducto"));
		
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroProducto"));
					
		this.jInternalFrameDetalleFormParametroProducto.jMenuItemCancelarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroProducto.jMenuItemDetalleCerrarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroProducto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroProducto"));
		
		
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroProducto"));
		
		
		
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonidParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_empresaParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_empresaParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_sucursalParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_sucursalParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_moduloParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_moduloParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_transaccionParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_transaccionParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_tipo_transaccion_moduloParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_bodegaParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_bodegaParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProductoBusqueda"));
		//jButtonid_productoParametroProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoParametroProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProducto.addActionListener(new ButtonActionListener(this,"id_productoParametroProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_formatoParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_formatoParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoParametroProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtondescripcionParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroProducto.jTabbedPaneRelacionesParametroProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroProducto"));
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroProducto"));
		}
		
		this.jTableDatosParametroProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroProducto"));
		
		this.jTableDatosParametroProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroProducto"));
		
		this.jButtonNuevoParametroProducto.addActionListener(new ButtonActionListener(this,"NuevoParametroProducto"));
		
		this.jButtonDuplicarParametroProducto.addActionListener(new ButtonActionListener(this,"DuplicarParametroProducto"));
		
		this.jButtonCopiarParametroProducto.addActionListener(new ButtonActionListener(this,"CopiarParametroProducto"));
		
		this.jButtonVerFormParametroProducto.addActionListener(new ButtonActionListener(this,"VerFormParametroProducto"));
		
		
		this.jButtonNuevoToolBarParametroProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroProducto"));
			
		this.jButtonDuplicarToolBarParametroProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroProducto"));
			
		this.jMenuItemNuevoParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroProducto"));
			
		this.jMenuItemDuplicarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroProducto"));		
		
		
		this.jButtonNuevoRelacionesParametroProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroProducto"));
			
		this.jMenuItemNuevoRelacionesParametroProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroProducto"));		
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonModificarParametroProducto.addActionListener(new ButtonActionListener(this,"ModificarParametroProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonModificarToolBarParametroProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroProducto"));
			
			this.jInternalFrameDetalleFormParametroProducto.jMenuItemModificarParametroProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarParametroProducto.addActionListener (new ButtonActionListener(this,"ActualizarParametroProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonActualizarToolBarParametroProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroProducto"));
				
			this.jInternalFrameDetalleFormParametroProducto.jMenuItemActualizarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarParametroProducto.addActionListener (new ButtonActionListener(this,"EliminarParametroProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonEliminarToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroProducto"));
						
			this.jInternalFrameDetalleFormParametroProducto.jMenuItemEliminarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarParametroProducto.addActionListener (new ButtonActionListener(this,"CancelarParametroProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonCancelarToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroProducto"));
			
			this.jInternalFrameDetalleFormParametroProducto.jMenuItemCancelarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroProducto"));		
		
		
		this.jButtonCerrarParametroProducto.addActionListener (new ButtonActionListener(this,"CerrarParametroProducto"));
		
		
		this.jButtonCerrarToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroProducto"));
			
		this.jMenuItemCerrarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroProducto"));
			
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jMenuItemDetalleCerrarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosParametroProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroProducto"));
		}
		
		this.jButtonCopiarToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroProducto"));
			
		this.jButtonVerFormToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroProducto"));
		
		this.jMenuItemGuardarCambiosParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroProducto"));
			
		this.jMenuItemCopiarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroProducto"));		
		
		this.jMenuItemVerFormParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroProducto"));		
		
		
		this.jButtonGuardarCambiosTablaParametroProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroProducto"));
			
		this.jMenuItemGuardarCambiosTablaParametroProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroProducto"));		
		
		
		
		this.jButtonRecargarInformacionParametroProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroProducto"));
					
		this.jButtonRecargarInformacionToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroProducto"));
		
		this.jMenuItemRecargarInformacionParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroProducto"));		
		
		
		
		this.jButtonAnterioresParametroProducto.addActionListener (new ButtonActionListener(this,"AnterioresParametroProducto"));
		
		
		this.jButtonAnterioresToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroProducto"));
		
		this.jMenuItemAnterioresParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroProducto"));		
		
		
		this.jButtonSiguientesParametroProducto.addActionListener (new ButtonActionListener(this,"SiguientesParametroProducto"));
		
		
		this.jButtonSiguientesToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroProducto"));
			
		this.jMenuItemSiguientesParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroProducto"));
			
		this.jMenuItemAbrirOrderByParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroProducto"));
			
		this.jMenuItemMostrarOcultarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroProducto"));
			
		this.jMenuItemDetalleAbrirOrderByParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroProducto"));
			
		this.jMenuItemDetalleMostarOcultarParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroProducto"));
			
		this.jMenuItemNuevoGuardarCambiosParametroProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroProducto"));

		this.jCheckBoxSeleccionadosParametroProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroProducto"));
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroProducto"));
			
		this.jComboBoxTiposAccionesParametroProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroProducto"));
					
		this.jComboBoxTiposSeleccionarParametroProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroProducto"));
			
		this.jTextFieldValorCampoGeneralParametroProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroProducto"));		
		
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonidParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_empresaParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_empresaParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_sucursalParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_sucursalParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_moduloParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_moduloParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_transaccionParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_transaccionParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_tipo_transaccion_moduloParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_bodegaParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_bodegaParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProductoBusqueda"));
		//jButtonid_productoParametroProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoParametroProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProducto.addActionListener(new ButtonActionListener(this,"id_productoParametroProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_formatoParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_formatoParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoParametroProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtondescripcionParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdModuloParametroProducto.addActionListener(new ButtonActionListener(this,"FK_IdModuloParametroProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroProducto!=null) {
				this.jInternalFrameReporteDinamicoParametroProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroProducto"));
				this.jInternalFrameReporteDinamicoParametroProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroProducto"));
				this.jInternalFrameReporteDinamicoParametroProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroProducto"));				
			//this.jButtonGenerarReporteDinamicoParametroProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroProducto"));
			//this.jButtonGenerarExcelReporteDinamicoParametroProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroProducto!=null) {
				this.jInternalFrameImportacionParametroProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroProducto"));
				this.jInternalFrameImportacionParametroProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroProducto"));
				this.jInternalFrameImportacionParametroProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroProducto"));
			
			this.jButtonAbrirOrderByToolBarParametroProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroProducto"));			
			
			if(this.jInternalFrameOrderByParametroProducto!=null) {
				this.jInternalFrameOrderByParametroProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProducto.jTabbedPaneRelacionesParametroProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroProducto"));
		
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
            		closingInternalFrameParametroProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroProducto = (JInternalFrameBase)event.getSource();
	            	
	            ParametroProductoBeanSwingJInternalFrame jInternalFrameParent=(ParametroProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroProducto";
		inputMap = this.jButtonNuevoParametroProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroProducto";
		inputMap = this.jButtonNuevoRelacionesParametroProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroProducto";
		inputMap = this.jButtonModificarParametroProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroProducto";
		inputMap = this.jButtonActualizarParametroProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroProducto";
		inputMap = this.jButtonEliminarParametroProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroProducto";
		inputMap = this.jButtonCancelarParametroProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroProducto";
		inputMap = this.jButtonCerrarParametroProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroProducto";
		inputMap = this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosParametroProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroProducto.jButtonGuardarCambiosParametroProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonidParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_empresaParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_empresaParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_sucursalParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_sucursalParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_moduloParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_moduloParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_transaccionParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_transaccionParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_tipo_transaccion_moduloParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_tipo_transaccion_moduloParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_bodegaParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_bodegaParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProductoBusqueda"));
		//jButtonid_productoParametroProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoParametroProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProducto.addActionListener(new ButtonActionListener(this,"id_productoParametroProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoParametroProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_formatoParametroProductoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoParametroProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtonid_formatoParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoParametroProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProducto.jButtondescripcionParametroProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroProductoBusqueda"));
		
		
		this.jButtonFK_IdModuloParametroProducto.addActionListener(new ButtonActionListener(this,"FK_IdModuloParametroProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroProducto parametroproductoAux:this.parametroproductoLogic.getParametroProductos()) {
					parametroproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroProducto parametroproductoAux:parametroproductos) {
					parametroproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroProducto parametroproductoAux:this.parametroproductoLogic.getParametroProductos()) {
						parametroproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroProducto parametroproductoAux:parametroproductos) {
						parametroproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroProducto parametroproductoAux:this.parametroproductoLogic.getParametroProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroProducto parametroproductoAux:parametroproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroProducto.getSelectedRows();
			
			ParametroProducto parametroproductoLocal=new ParametroProducto();
			
			//this.seleccionarTodosParametroProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproductoLocal =(ParametroProducto) this.parametroproductoLogic.getParametroProductos().toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametroproductoLocal =(ParametroProducto) this.parametroproductos.toArray()[this.jTableDatosParametroProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametroproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroProducto parametroproductoAux:this.parametroproductoLogic.getParametroProductos()) {
						parametroproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroProducto parametroproductoAux:parametroproductos) {
						parametroproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroProducto parametroproductoAux:this.parametroproductoLogic.getParametroProductos()) {
				
						if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametroproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroProducto parametroproductoAux:parametroproductos) {
					
						if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametroproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroProducto(conSplash);
				
					this.generarReporteParametroProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroProductosSeleccionados();
				//this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroProducto();
				
				this.exportarParametroProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroProductos();
				//this.importarParametroProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroProductosSeleccionados();
				//this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroProducto(conSplash);
					
						//this.actualizarParametrosGeneralParametroProducto();
						
						this.generarReporteProcesoAccionParametroProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroProducto();
				
						this.actualizarParametrosGeneralParametroProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametroproductoReturnGeneral=parametroproductoLogic.procesarAccionParametroProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametroproductoLogic.getParametroProductos(),this.parametroproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroProducto();
					
					ParametroProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroProducto.jComboBoxTiposAccionesFormularioParametroProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroProducto();
			
			if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();		
			ParametroProducto parametroproducto=new ParametroProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroProducto.getSelectedItem();
			
			
			
			
			parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametroproductosSeleccionados.size()==1) {
				for(ParametroProducto parametroproductoAux:parametroproductosSeleccionados) {
					parametroproducto=parametroproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroProducto();
			
      		//this.finishProcessParametroProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroProductoReturnGeneral() throws Exception {
		if(this.parametroproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametroproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametroproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametroproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametroproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametroproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroProducto(false);
		}
		
		if(this.parametroproductoReturnGeneral.getConRetornoLista() || this.parametroproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.parametroproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroproductoLogic.setParametroProductos(this.parametroproductoReturnGeneral.getParametroProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametroproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroproductoLogic.setParametroProducto(this.parametroproductoReturnGeneral.getParametroProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroProducto() throws Exception {
		
		
	}
	
	public ArrayList<ParametroProducto> getParametroProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroProducto parametroproductoAux:parametroproductoLogic.getParametroProductos()) {
					if(parametroproductoAux.getIsSelected()) {
						parametroproductosSeleccionados.add(parametroproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroProducto parametroproductoAux:this.parametroproductos) {
					if(parametroproductoAux.getIsSelected()) {
						parametroproductosSeleccionados.add(parametroproductoAux);				
					}
				}
			}
			
			if(parametroproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametroproductosSeleccionados.addAll(this.parametroproductoLogic.getParametroProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametroproductosSeleccionados.addAll(this.parametroproductos);				
					}
				}
			}
		} else {
			parametroproductosSeleccionados.add(this.parametroproducto);
		}
		
		return parametroproductosSeleccionados;
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
	
	public void generarReporteParametroProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroProductosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroProductosSeleccionados() throws Exception {
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();		
		
		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroProductos("Todos",parametroproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroProductosSeleccionados() throws Exception {
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();		
		
		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroProductos("Todos",parametroproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();
		
		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroProductos("Todos",parametroproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroProductosSeleccionados() throws Exception {
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroProducto();
		
		
		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroProducto();
		
		
		//this.generarReporteParametroProductos("Todos",parametroproductosSeleccionados ,parametroproductoImplementable,parametroproductoImplementableHome);
	}
	
	public void mostrarImportacionParametroProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroProducto();
		
		this.abrirFrameImportacionParametroProducto();		
		
			
		//this.generarReporteParametroProductos("Todos",parametroproductosSeleccionados ,parametroproductoImplementable,parametroproductoImplementableHome);
	}
	
	public void importarParametroProductos() throws Exception {		
	
	}
	
	public void exportarParametroProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroProductosSeleccionados() throws Exception {
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();		
		
		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroProducto parametroproductoAux:parametroproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroProducto(parametroproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametroproductoAux.setsDetalleGeneralEntityReporte(parametroproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProductoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroProducto(ParametroProducto parametroproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametroproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.gettipotransaccionmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroproducto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroProductosSeleccionados() throws Exception {
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();		
		
		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroProducto(row);				
				iRow++;
			}				
			
			for(ParametroProducto parametroproductoAux:parametroproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroProducto(parametroproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroProductosSeleccionados() throws Exception {
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();		
		
		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametroproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametroproducto");
			//elementRoot.appendChild(element);
		
			for(ParametroProducto parametroproductoAux:parametroproductosSeleccionados) {
				element = document.createElement("parametroproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroProducto(parametroproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProductoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroProducto(ParametroProducto parametroproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.gettipotransaccionmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroproducto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroProducto(ParametroProducto parametroproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametroproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametroproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametroproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ParametroProductoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(parametroproducto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementmodulo_descripcion = document.createElement(ParametroProductoConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(parametroproducto.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtransaccion_descripcion = document.createElement(ParametroProductoConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(parametroproducto.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementtipotransaccionmodulo_descripcion = document.createElement(ParametroProductoConstantesFunciones.IDTIPOTRANSACCIONMODULO);
		elementtipotransaccionmodulo_descripcion.appendChild(document.createTextNode(parametroproducto.gettipotransaccionmodulo_descripcion()));
		element.appendChild(elementtipotransaccionmodulo_descripcion);

		Element elementbodega_descripcion = document.createElement(ParametroProductoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(parametroproducto.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ParametroProductoConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(parametroproducto.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementformato_descripcion = document.createElement(ParametroProductoConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(parametroproducto.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementdescripcion = document.createElement(ParametroProductoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(parametroproducto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoParametroProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroProducto> parametroproductosSeleccionados=new ArrayList<ParametroProducto>();
		
		parametroproductosSeleccionados=this.getParametroProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroProducto(parametroproductosSeleccionados);
		
		this.generarReporteParametroProductos("Todos",parametroproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroProducto(ArrayList<ParametroProducto> parametroproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroProducto parametroproductoAux:parametroproductosSeleccionados) {
				parametroproductoAux.setsDetalleGeneralEntityReporte(parametroproductoAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametroproductoAux.setsDescripcionGeneralEntityReporte1(parametroproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					parametroproductoAux.setsDescripcionGeneralEntityReporte1(parametroproductoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					parametroproductoAux.setsDescripcionGeneralEntityReporte1(parametroproductoAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					parametroproductoAux.setsDescripcionGeneralEntityReporte1(parametroproductoAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO)) {
					existe=true;
					parametroproductoAux.setsDescripcionGeneralEntityReporte1(parametroproductoAux.gettipotransaccionmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					parametroproductoAux.setsDescripcionGeneralEntityReporte1(parametroproductoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					parametroproductoAux.setsDescripcionGeneralEntityReporte1(parametroproductoAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					parametroproductoAux.setsDescripcionGeneralEntityReporte1(parametroproductoAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProductoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					parametroproductoAux.setsDescripcionGeneralEntityReporte1(parametroproductoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroProducto=true;
				this.isVisibilidadCeldaGuardarCambiosParametroProducto=true;
			}
			
			this.isVisibilidadCeldaModificarParametroProducto=false;
			this.isVisibilidadCeldaActualizarParametroProducto=false;
			this.isVisibilidadCeldaEliminarParametroProducto=false;
			this.isVisibilidadCeldaCancelarParametroProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=false;
			this.isVisibilidadCeldaModificarParametroProducto=false;
			this.isVisibilidadCeldaActualizarParametroProducto=true;
			this.isVisibilidadCeldaEliminarParametroProducto=false;
			this.isVisibilidadCeldaCancelarParametroProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=false;
			this.isVisibilidadCeldaModificarParametroProducto=false;
			this.isVisibilidadCeldaActualizarParametroProducto=true;
			this.isVisibilidadCeldaEliminarParametroProducto=true;
			this.isVisibilidadCeldaCancelarParametroProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=false;
			this.isVisibilidadCeldaModificarParametroProducto=false;
			this.isVisibilidadCeldaActualizarParametroProducto=true;
			this.isVisibilidadCeldaEliminarParametroProducto=false;
			this.isVisibilidadCeldaCancelarParametroProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=true;
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=true;
			this.isVisibilidadCeldaModificarParametroProducto=false;
			this.isVisibilidadCeldaActualizarParametroProducto=false;
			this.isVisibilidadCeldaEliminarParametroProducto=false;
			this.isVisibilidadCeldaCancelarParametroProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=false;
			this.isVisibilidadCeldaActualizarParametroProducto=false;
			this.isVisibilidadCeldaEliminarParametroProducto=false;
			this.isVisibilidadCeldaCancelarParametroProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=false;
			this.isVisibilidadCeldaModificarParametroProducto=true;
			this.isVisibilidadCeldaActualizarParametroProducto=false;
			this.isVisibilidadCeldaEliminarParametroProducto=false;
			this.isVisibilidadCeldaCancelarParametroProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=true;
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=true;
		} else {
			this.actualizarEstadoPanelsParametroProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroProducto=false;
			//this.isVisibilidadCeldaVerFormParametroProducto=false;
			this.isVisibilidadCeldaDuplicarParametroProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametroproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroProducto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametroproductoSessionBean.getEsGuardarRelacionado()) {
			if(!parametroproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroProducto=false;												
			}
			
			this.jButtonCerrarParametroProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.parametroproducto)) {
			this.isVisibilidadCeldaActualizarParametroProducto=false;
			this.isVisibilidadCeldaEliminarParametroProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroProducto() {
	}
	
	public void actualizarEstadoPanelsParametroProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroProducto!=null) {
				this.jScrollPanelDatosEdicionParametroProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProducto!=null) {
				this.jTabbedPaneBusquedasParametroProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroProducto!=null) {
				this.jScrollPanelDatosParametroProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroProducto!=null) {
				this.jPanelPaginacionParametroProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroProducto!=null) {
				this.jPanelParametrosReportesParametroProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroProducto!=null) {
				this.jScrollPanelDatosEdicionParametroProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProducto!=null) {
				this.jTabbedPaneBusquedasParametroProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroProducto!=null) {
				this.jScrollPanelDatosParametroProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroProducto!=null) {
				this.jPanelPaginacionParametroProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroProducto!=null) {
				this.jPanelParametrosReportesParametroProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroProducto!=null) {
				this.jScrollPanelDatosEdicionParametroProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProducto!=null) {
				this.jTabbedPaneBusquedasParametroProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroProducto!=null) {
				this.jScrollPanelDatosParametroProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroProducto!=null) {
				this.jPanelPaginacionParametroProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroProducto!=null) {
				this.jPanelParametrosReportesParametroProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroProducto!=null) {
				this.jScrollPanelDatosEdicionParametroProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProducto!=null) {
				this.jTabbedPaneBusquedasParametroProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroProducto!=null) {
				this.jScrollPanelDatosParametroProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroProducto!=null) {
				this.jPanelPaginacionParametroProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroProducto!=null) {
				this.jPanelParametrosReportesParametroProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroProducto!=null) {
				this.jScrollPanelDatosEdicionParametroProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProducto!=null) {
				this.jTabbedPaneBusquedasParametroProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroProducto!=null) {
				this.jScrollPanelDatosParametroProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroProducto!=null) {
				this.jPanelPaginacionParametroProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroProducto!=null) {
				this.jPanelParametrosReportesParametroProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroProducto!=null) {
				this.jScrollPanelDatosEdicionParametroProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProducto!=null) {
				this.jTabbedPaneBusquedasParametroProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroProducto!=null) {
				this.jScrollPanelDatosParametroProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroProducto!=null) {
				this.jPanelPaginacionParametroProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroProducto!=null) {
				this.jPanelParametrosReportesParametroProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroProducto!=null) {
				this.jScrollPanelDatosEdicionParametroProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProducto!=null) {
				this.jTabbedPaneBusquedasParametroProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroProducto!=null) {
				this.jScrollPanelDatosParametroProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroProducto!=null) {
				this.jPanelPaginacionParametroProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroProducto!=null) {
				this.jPanelParametrosReportesParametroProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroProducto!=null) {
					this.jTabbedPaneBusquedasParametroProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroProducto!=null) {
				this.jPanelParametrosReportesParametroProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProducto!=null) {
				this.jTabbedPaneBusquedasParametroProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroProducto!=null) {
				this.jPanelParametrosReportesParametroProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdModulo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroProducto.remove(jPanelFK_IdModuloParametroProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdModulo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroProducto.remove(jPanelFK_IdModuloParametroProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdModulo=isParaModulo;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroProducto.remove(jPanelFK_IdModuloParametroProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadFK_IdModulo=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroProducto.remove(jPanelFK_IdModuloParametroProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTransaccionModulo(Boolean isParaTipoTransaccionModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTransaccionModuloNegation=!isParaTipoTransaccionModulo;

			this.isVisibilidadFK_IdModulo=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroProducto.remove(jPanelFK_IdModuloParametroProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdModulo=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroProducto.remove(jPanelFK_IdModuloParametroProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdModulo=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroProducto.remove(jPanelFK_IdModuloParametroProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;

			this.isVisibilidadFK_IdModulo=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroProducto.remove(jPanelFK_IdModuloParametroProducto);}
		}
		
	}
	
	
	
	

	public String registrarSesionParametroProductoParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(parametroproductoSessionBean==null) {
				parametroproductoSessionBean=new ParametroProductoSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(parametroproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.parametroproductoFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ParametroProductoConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionParametroProducto(true);
			//productoSessionBean.setlidParametroProductoActual(this.idParametroProductoActual);

			parametroproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyParametroProducto(true);
			parametroproductoSessionBean.setlIdParametroProductoActualForeignKey(this.idParametroProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroProductoSessionBean parametroproductoSessionBean=new ParametroProductoSessionBean();
		
		if(this.parametroproductoSessionBean==null) {
			this.parametroproductoSessionBean=new ParametroProductoSessionBean();
		}
		
		this.parametroproductoSessionBean.setsUltimaBusquedaParametroProducto(this.getsAccionBusqueda());
		this.parametroproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametroproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametroproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			parametroproductoSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			parametroproductoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroProductoSessionBean parametroproductoSessionBean=new ParametroProductoSessionBean();
		
		if(this.parametroproductoSessionBean==null) {
			this.parametroproductoSessionBean=new ParametroProductoSessionBean();
		}
		
		if(this.parametroproductoSessionBean.getsUltimaBusquedaParametroProducto()!=null&&!this.parametroproductoSessionBean.getsUltimaBusquedaParametroProducto().equals("")) {
			this.setsAccionBusqueda(parametroproductoSessionBean.getsUltimaBusquedaParametroProducto());
			this.setiNumeroPaginacion(parametroproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametroproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametroproductoSessionBean.getid_empresa());
				parametroproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(parametroproductoSessionBean.getid_modulo());
				parametroproductoSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(parametroproductoSessionBean.getid_sucursal());
				parametroproductoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.parametroproductoSessionBean.setsUltimaBusquedaParametroProducto("");
		this.parametroproductoSessionBean.setiNumeroPaginacion(ParametroProductoConstantesFunciones.INUMEROPAGINACION);
		this.parametroproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroProducto() {
		this.updateBorderResaltarBusquedasFormularioParametroProducto();
		this.updateVisibilidadBusquedasFormularioParametroProducto();
		this.updateHabilitarBusquedasFormularioParametroProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroProducto.getComponents().length>0) {
	

		if(this.parametroproductoConstantesFunciones.resaltarFK_IdModuloParametroProducto!=null) {
			index= this.jTabbedPaneBusquedasParametroProducto.indexOfComponent(this.jPanelFK_IdModuloParametroProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProducto.getComponent(index);
				jPanel.setBorder(this.parametroproductoConstantesFunciones.resaltarFK_IdModuloParametroProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroProducto.indexOfComponent(this.jPanelFK_IdModuloParametroProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametroproductoConstantesFunciones.mostrarFK_IdModuloParametroProducto);
			if(!this.parametroproductoConstantesFunciones.mostrarFK_IdModuloParametroProducto && index>-1) {
				this.jTabbedPaneBusquedasParametroProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroProducto.indexOfComponent(this.jPanelFK_IdModuloParametroProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametroproductoConstantesFunciones.activarFK_IdModuloParametroProducto);
				this.jTabbedPaneBusquedasParametroProducto.setEnabledAt(index,this.parametroproductoConstantesFunciones.activarFK_IdModuloParametroProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdModulo")) {
			index= this.jTabbedPaneBusquedasParametroProducto.indexOfComponent(this.jPanelFK_IdModuloParametroProducto);

			this.jTabbedPaneBusquedasParametroProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProducto.getComponent(index);

			this.parametroproductoConstantesFunciones.setResaltarFK_IdModuloParametroProducto(resaltar);

			jPanel.setBorder(this.parametroproductoConstantesFunciones.resaltarFK_IdModuloParametroProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroProducto() throws Exception {

		if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroProducto();
		this.updateVisibilidadResaltarControlesFormularioParametroProducto();
		this.updateHabilitarResaltarControlesFormularioParametroProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroProducto() throws Exception {
		if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametroproductoConstantesFunciones.resaltaridParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltaridParametroProducto);}
		if(this.parametroproductoConstantesFunciones.resaltarid_empresaParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltarid_empresaParametroProducto);}
		if(this.parametroproductoConstantesFunciones.resaltarid_sucursalParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltarid_sucursalParametroProducto);}
		if(this.parametroproductoConstantesFunciones.resaltarid_moduloParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltarid_moduloParametroProducto);}
		if(this.parametroproductoConstantesFunciones.resaltarid_transaccionParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltarid_transaccionParametroProducto);}
		if(this.parametroproductoConstantesFunciones.resaltarid_tipo_transaccion_moduloParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltarid_tipo_transaccion_moduloParametroProducto);}
		if(this.parametroproductoConstantesFunciones.resaltarid_bodegaParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltarid_bodegaParametroProducto);}
		if(this.parametroproductoConstantesFunciones.resaltarid_productoParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltarid_productoParametroProducto);}
		if(this.parametroproductoConstantesFunciones.resaltarid_formatoParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltarid_formatoParametroProducto);}
		if(this.parametroproductoConstantesFunciones.resaltardescripcionParametroProducto!=null && this.jInternalFrameDetalleFormParametroProducto!=null) {this.jInternalFrameDetalleFormParametroProducto.jTextAreadescripcionParametroProducto.setBorder(this.parametroproductoConstantesFunciones.resaltardescripcionParametroProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) {
	
		//this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostraridParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPanelidParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostraridParametroProducto);
		//this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_empresaParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPanelid_empresaParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_empresaParametroProducto);
		//this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_sucursalParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPanelid_sucursalParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_sucursalParametroProducto);
		//this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_moduloParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPanelid_moduloParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_moduloParametroProducto);
		//this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_transaccionParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPanelid_transaccionParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_transaccionParametroProducto);
		//this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_tipo_transaccion_moduloParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPanelid_tipo_transaccion_moduloParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_tipo_transaccion_moduloParametroProducto);
		//this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_bodegaParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPanelid_bodegaParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_bodegaParametroProducto);
		//this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_productoParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPanelid_productoParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_productoParametroProducto);
			this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_productoParametroProducto);
		//this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_formatoParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPanelid_formatoParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrarid_formatoParametroProducto);
		//this.jInternalFrameDetalleFormParametroProducto.jTextAreadescripcionParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrardescripcionParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jPaneldescripcionParametroProducto.setVisible(this.parametroproductoConstantesFunciones.mostrardescripcionParametroProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroProducto() throws Exception {
		if(this.jInternalFrameDetalleFormParametroProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroProducto!=null) {
	
		this.jInternalFrameDetalleFormParametroProducto.jLabelidParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activaridParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_empresaParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activarid_empresaParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_sucursalParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activarid_sucursalParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_moduloParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activarid_moduloParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_transaccionParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activarid_transaccionParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_tipo_transaccion_moduloParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activarid_tipo_transaccion_moduloParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_bodegaParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activarid_bodegaParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_productoParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activarid_productoParametroProducto);
			this.jInternalFrameDetalleFormParametroProducto.jButtonid_productoParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activarid_productoParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jComboBoxid_formatoParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activarid_formatoParametroProducto);
		this.jInternalFrameDetalleFormParametroProducto.jTextAreadescripcionParametroProducto.setEnabled(this.parametroproductoConstantesFunciones.activardescripcionParametroProducto);
		}
	}
	
		
}