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

import com.bydan.erp.inventario.util.DescuentoTipoPrecioConstantesFunciones;
import com.bydan.erp.inventario.util.DescuentoTipoPrecioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DescuentoTipoPrecioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.DescuentoTipoPrecioBean;
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
public class DescuentoTipoPrecioBeanSwingJInternalFrame extends DescuentoTipoPrecioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DescuentoTipoPrecioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DescuentoTipoPrecio> descuentotipoprecioValidator = new ClassValidator<DescuentoTipoPrecio>(DescuentoTipoPrecio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DescuentoTipoPrecio descuentotipoprecio;	
	public DescuentoTipoPrecio descuentotipoprecioAux;
	public DescuentoTipoPrecio descuentotipoprecioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DescuentoTipoPrecio descuentotipoprecioTotales;
	public Long idDescuentoTipoPrecioActual;
	public Long iIdNuevoDescuentoTipoPrecio=0L;
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

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
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
	
	public Boolean isPermisoTodoDescuentoTipoPrecio;
	public Boolean isPermisoNuevoDescuentoTipoPrecio;
	public Boolean isPermisoActualizarDescuentoTipoPrecio;
	public Boolean isPermisoActualizarOriginalDescuentoTipoPrecio;
	public Boolean isPermisoEliminarDescuentoTipoPrecio;
	public Boolean isPermisoGuardarCambiosDescuentoTipoPrecio;
	public Boolean isPermisoConsultaDescuentoTipoPrecio;
	public Boolean isPermisoBusquedaDescuentoTipoPrecio;
	public Boolean isPermisoReporteDescuentoTipoPrecio;
	public Boolean isPermisoPaginacionMedioDescuentoTipoPrecio;
	public Boolean isPermisoPaginacionAltoDescuentoTipoPrecio;
	public Boolean isPermisoPaginacionTodoDescuentoTipoPrecio;
	public Boolean isPermisoCopiarDescuentoTipoPrecio;
	public Boolean isPermisoVerFormDescuentoTipoPrecio;
	public Boolean isPermisoDuplicarDescuentoTipoPrecio;
	public Boolean isPermisoOrdenDescuentoTipoPrecio;
	
	
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
	
	public DescuentoTipoPrecioParameterReturnGeneral descuentotipoprecioReturnGeneral;
	public DescuentoTipoPrecioParameterReturnGeneral descuentotipoprecioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDescuentoTipoPrecio=false;
	public Boolean esParaAccionDesdeFormularioDescuentoTipoPrecio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DescuentoTipoPrecioSessionBeanAdditional descuentotipoprecioSessionBeanAdditional=null;
	
	public DescuentoTipoPrecioSessionBeanAdditional getDescuentoTipoPrecioSessionBeanAdditional() {
		return this.descuentotipoprecioSessionBeanAdditional;
	}
	
	public void setDescuentoTipoPrecioSessionBeanAdditional(DescuentoTipoPrecioSessionBeanAdditional descuentotipoprecioSessionBeanAdditional) {
		try {
			this.descuentotipoprecioSessionBeanAdditional=descuentotipoprecioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DescuentoTipoPrecioBeanSwingJInternalFrameAdditional descuentotipoprecioBeanSwingJInternalFrameAdditional=null;
	//public class DescuentoTipoPrecioBeanSwingJInternalFrame
	
	public DescuentoTipoPrecioBeanSwingJInternalFrameAdditional getDescuentoTipoPrecioBeanSwingJInternalFrameAdditional() {
		return this.descuentotipoprecioBeanSwingJInternalFrameAdditional;
	}
	
	public void setDescuentoTipoPrecioBeanSwingJInternalFrameAdditional(DescuentoTipoPrecioBeanSwingJInternalFrameAdditional descuentotipoprecioBeanSwingJInternalFrameAdditional) {
		try {
			this.descuentotipoprecioBeanSwingJInternalFrameAdditional=descuentotipoprecioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DescuentoTipoPrecioLogic descuentotipoprecioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DescuentoTipoPrecio descuentotipoprecioBean;
	public DescuentoTipoPrecioConstantesFunciones descuentotipoprecioConstantesFunciones;
	//public DescuentoTipoPrecioParameterReturnGeneral descuentotipoprecioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public BodegaLogic bodegaLogic;
	public TipoPrecioLogic tipoprecioLogic;
	
	//PARAMETROS
	
	
	//public List<DescuentoTipoPrecio> descuentotipoprecios;	
	//public List<DescuentoTipoPrecio> descuentotipopreciosEliminados;
	//public List<DescuentoTipoPrecio> descuentotipopreciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDescuentoTipoPrecio=false;
	public Boolean isVisibilidadCeldaDuplicarDescuentoTipoPrecio=true;
	public Boolean isVisibilidadCeldaCopiarDescuentoTipoPrecio=true;
	public Boolean isVisibilidadCeldaVerFormDescuentoTipoPrecio=true;
	public Boolean isVisibilidadCeldaOrdenDescuentoTipoPrecio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;
	public Boolean isVisibilidadCeldaModificarDescuentoTipoPrecio=false;
	public Boolean isVisibilidadCeldaActualizarDescuentoTipoPrecio=false;
	public Boolean isVisibilidadCeldaEliminarDescuentoTipoPrecio=false;
	public Boolean isVisibilidadCeldaCancelarDescuentoTipoPrecio=false;
	public Boolean isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoPrecio=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoDescuentoTipoPrecio() {
		return this.iIdNuevoDescuentoTipoPrecio;
	}

	public void setiIdNuevoDescuentoTipoPrecio(Long iIdNuevoDescuentoTipoPrecio) {
		this.iIdNuevoDescuentoTipoPrecio = iIdNuevoDescuentoTipoPrecio;
	}
	
	public Long getidDescuentoTipoPrecioActual() {
		return this.idDescuentoTipoPrecioActual;
	}

	public void setidDescuentoTipoPrecioActual(Long idDescuentoTipoPrecioActual) {
		this.idDescuentoTipoPrecioActual = idDescuentoTipoPrecioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DescuentoTipoPrecio getdescuentotipoprecio() {
		return this.descuentotipoprecio;
	}

	public void setdescuentotipoprecio(DescuentoTipoPrecio descuentotipoprecio) {
		this.descuentotipoprecio = descuentotipoprecio;
	}
	
	public DescuentoTipoPrecio getdescuentotipoprecioAux() {
		return this.descuentotipoprecioAux;
	}

	public void setdescuentotipoprecioAux(DescuentoTipoPrecio descuentotipoprecioAux) {
		this.descuentotipoprecioAux = descuentotipoprecioAux;
	}				
	
	public DescuentoTipoPrecio getdescuentotipoprecioAnterior() {
		return this.descuentotipoprecioAnterior;
	}

	public void setdescuentotipoprecioAnterior(DescuentoTipoPrecio descuentotipoprecioAnterior) {
		this.descuentotipoprecioAnterior = descuentotipoprecioAnterior;
	}	
	
	public DescuentoTipoPrecio getdescuentotipoprecioTotales() {
		return this.descuentotipoprecioTotales;
	}

	public void setdescuentotipoprecioTotales(DescuentoTipoPrecio descuentotipoprecioTotales) {
		this.descuentotipoprecioTotales = descuentotipoprecioTotales;
	}	
	
	public DescuentoTipoPrecio getdescuentotipoprecioBean() {
		return this.descuentotipoprecioBean;
	}

	public void setdescuentotipoprecioBean(DescuentoTipoPrecio descuentotipoprecioBean) {
		this.descuentotipoprecioBean = descuentotipoprecioBean;
	}	
	
	public DescuentoTipoPrecioParameterReturnGeneral getdescuentotipoprecioReturnGeneral() {
		return this.descuentotipoprecioReturnGeneral;
	}

	public void setdescuentotipoprecioReturnGeneral(DescuentoTipoPrecioParameterReturnGeneral descuentotipoprecioReturnGeneral) {
		this.descuentotipoprecioReturnGeneral = descuentotipoprecioReturnGeneral;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_precioFK_IdTipoPrecio=-1L;

	public Long getid_tipo_precioFK_IdTipoPrecio() {
		return this.id_tipo_precioFK_IdTipoPrecio;
	}

	public void setid_tipo_precioFK_IdTipoPrecio(Long id_tipo_precioFK_IdTipoPrecio) {
		this.id_tipo_precioFK_IdTipoPrecio = id_tipo_precioFK_IdTipoPrecio;
	}

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DescuentoTipoPrecioLogic getDescuentoTipoPrecioLogic()	{		
		return descuentotipoprecioLogic;
	}

	public void setDescuentoTipoPrecioLogic(DescuentoTipoPrecioLogic descuentotipoprecioLogic) {
		this.descuentotipoprecioLogic = descuentotipoprecioLogic;
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
	
	public Boolean getIsEsNuevoDescuentoTipoPrecio() {
		return isEsNuevoDescuentoTipoPrecio;
	}

	public void setIsEsNuevoDescuentoTipoPrecio(Boolean isEsNuevoDescuentoTipoPrecio) {
		this.isEsNuevoDescuentoTipoPrecio = isEsNuevoDescuentoTipoPrecio;
	}

	public Boolean getEsParaAccionDesdeFormularioDescuentoTipoPrecio() {
		return esParaAccionDesdeFormularioDescuentoTipoPrecio;
	}
	
	public void setEsParaAccionDesdeFormularioDescuentoTipoPrecio(Boolean esParaAccionDesdeFormularioDescuentoTipoPrecio) {
		this.esParaAccionDesdeFormularioDescuentoTipoPrecio = esParaAccionDesdeFormularioDescuentoTipoPrecio;
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

			if(this.descuentotipoprecioSessionBean==null) {
				this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
			}

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(descuentotipoprecioSessionBean.getlidEmpresaActual());
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

			if(this.descuentotipoprecioSessionBean==null) {
				this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
			}

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(descuentotipoprecioSessionBean.getlidSucursalActual());
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

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.descuentotipoprecioSessionBean==null) {
				this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
			}

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(descuentotipoprecioSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
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

			if(this.descuentotipoprecioSessionBean==null) {
				this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
			}

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(descuentotipoprecioSessionBean.getlidBodegaActual());
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

			if(this.descuentotipoprecioSessionBean==null) {
				this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
			}

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {
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
					tipoprecioLogic.getEntityWithConnection(descuentotipoprecioSessionBean.getlidTipoPrecioActual());
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

					if(this.descuentotipoprecio!=null) {
						this.descuentotipoprecio.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDescuentoTipoPrecio.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDescuentoTipoPrecioGenerico)throws Exception
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
				jComboBoxid_empresaDescuentoTipoPrecioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDescuentoTipoPrecioGenerico!=null && jComboBoxid_empresaDescuentoTipoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_empresaDescuentoTipoPrecioGenerico.setSelectedIndex(0);
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

					if(this.descuentotipoprecio!=null) {
						this.descuentotipoprecio.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDescuentoTipoPrecio.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDescuentoTipoPrecioGenerico)throws Exception
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
				jComboBoxid_sucursalDescuentoTipoPrecioGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDescuentoTipoPrecioGenerico!=null && jComboBoxid_sucursalDescuentoTipoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDescuentoTipoPrecioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.descuentotipoprecio!=null) {
						this.descuentotipoprecio.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioDescuentoTipoPrecio.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.setSelectedIndex(0);
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

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioDescuentoTipoPrecioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioDescuentoTipoPrecioGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioDescuentoTipoPrecioGenerico!=null && jComboBoxid_usuarioDescuentoTipoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_usuarioDescuentoTipoPrecioGenerico.setSelectedIndex(0);
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

					if(this.descuentotipoprecio!=null) {
						this.descuentotipoprecio.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDescuentoTipoPrecio.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio!=null) {
						jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio!=null) {
							//jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDescuentoTipoPrecioGenerico)throws Exception
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
				jComboBoxid_bodegaDescuentoTipoPrecioGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDescuentoTipoPrecioGenerico!=null && jComboBoxid_bodegaDescuentoTipoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDescuentoTipoPrecioGenerico.setSelectedIndex(0);
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

					if(this.descuentotipoprecio!=null) {
						this.descuentotipoprecio.setTipoPrecio(tipoprecioTemp);
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.setSelectedItem(tipoprecioTemp);
					}
				} else {
					//jComboBoxid_tipo_precioDescuentoTipoPrecio.setSelectedItem(tipoprecioTemp);
					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPrecio") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprecioTemp!=null && jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio!=null) {
						jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setSelectedItem(tipoprecioTemp);
					} else {
						if(jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio!=null) {
							//jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setSelectedItem(tipoprecioTemp);
							if(jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.getItemCount()>0) {
								jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setSelectedIndex(0);
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
	public void setActualTipoPrecioForeignKeyGenerico(Long idTipoPrecioSeleccionado,JComboBox jComboBoxid_tipo_precioDescuentoTipoPrecioGenerico)throws Exception
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
				jComboBoxid_tipo_precioDescuentoTipoPrecioGenerico.setSelectedItem(tipoprecioTemp);
			} else {
				if(jComboBoxid_tipo_precioDescuentoTipoPrecioGenerico!=null && jComboBoxid_tipo_precioDescuentoTipoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_tipo_precioDescuentoTipoPrecioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DescuentoTipoPrecio descuentotipoprecio,JComboBox jComboBoxid_empresaDescuentoTipoPrecioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDescuentoTipoPrecioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDescuentoTipoPrecioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				descuentotipoprecio.setid_empresa(empresaAux.getId());
				descuentotipoprecio.setempresa_descripcion(DescuentoTipoPrecioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				descuentotipoprecio.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DescuentoTipoPrecio descuentotipoprecio,JComboBox jComboBoxid_sucursalDescuentoTipoPrecioGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDescuentoTipoPrecioGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDescuentoTipoPrecioGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				descuentotipoprecio.setid_sucursal(sucursalAux.getId());
				descuentotipoprecio.setsucursal_descripcion(DescuentoTipoPrecioConstantesFunciones.getSucursalDescripcion(sucursalAux));
				descuentotipoprecio.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(DescuentoTipoPrecio descuentotipoprecio,JComboBox jComboBoxid_usuarioDescuentoTipoPrecioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioDescuentoTipoPrecioGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioDescuentoTipoPrecioGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				descuentotipoprecio.setid_usuario(usuarioAux.getId());
				descuentotipoprecio.setusuario_descripcion(DescuentoTipoPrecioConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				descuentotipoprecio.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DescuentoTipoPrecio descuentotipoprecio,JComboBox jComboBoxid_bodegaDescuentoTipoPrecioGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDescuentoTipoPrecioGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDescuentoTipoPrecioGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				descuentotipoprecio.setid_bodega(bodegaAux.getId());
				descuentotipoprecio.setbodega_descripcion(DescuentoTipoPrecioConstantesFunciones.getBodegaDescripcion(bodegaAux));
				descuentotipoprecio.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPrecioForeignKey(DescuentoTipoPrecio descuentotipoprecio,JComboBox jComboBoxid_tipo_precioDescuentoTipoPrecioGenerico)throws Exception
	{
		try
		{
			TipoPrecio  tipoprecioAux=new TipoPrecio();

			if(jComboBoxid_tipo_precioDescuentoTipoPrecioGenerico==null) {
				tipoprecioAux=(TipoPrecio)this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.getSelectedItem();
			} else {
				tipoprecioAux=(TipoPrecio)jComboBoxid_tipo_precioDescuentoTipoPrecioGenerico.getSelectedItem();
			}

			if(tipoprecioAux!=null && tipoprecioAux.getId()!=null) {
				descuentotipoprecio.setid_tipo_precio(tipoprecioAux.getId());
				descuentotipoprecio.settipoprecio_descripcion(DescuentoTipoPrecioConstantesFunciones.getTipoPrecioDescripcion(tipoprecioAux));
				descuentotipoprecio.setTipoPrecio(tipoprecioAux);			}
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

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
					}

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
					}

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
					}

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
					}

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.addItem(bodega);
							}
						}

						if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.removeAllItems();

							for(TipoPrecio tipoprecio:this.tipopreciosForeignKey) {
								this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.addItem(tipoprecio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { 
					}

					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPrecio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.removeAllItems();

							for(TipoPrecio tipoprecio:this.tipopreciosForeignKey) {
								this.jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.addItem(tipoprecio);
							}
						}

						if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.setSelectedItem(tipoprecio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setSelectedItem(tipoprecio);
						} else {
							this.jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDescuentoTipoPrecio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DescuentoTipoPrecioConstantesFunciones.refrescarForeignKeysDescripcionesDescuentoTipoPrecio(this.descuentotipoprecioLogic.getDescuentoTipoPrecios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DescuentoTipoPrecioConstantesFunciones.refrescarForeignKeysDescripcionesDescuentoTipoPrecio(this.descuentotipoprecios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(TipoPrecio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//descuentotipoprecioLogic.setDescuentoTipoPrecios(this.descuentotipoprecios);
			descuentotipoprecioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DescuentoTipoPrecioParameterReturnGeneral getDescuentoTipoPrecioParameterGeneral() {
		return this.descuentotipoprecioParameterGeneral;
	}
	
	public void setDescuentoTipoPrecioParameterGeneral(DescuentoTipoPrecioParameterReturnGeneral descuentotipoprecioParameterGeneral) {
		this.descuentotipoprecioParameterGeneral = descuentotipoprecioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDescuentoTipoPrecio() {
		return isPermisoTodoDescuentoTipoPrecio;
	}

	public void setIsPermisoTodoDescuentoTipoPrecio(Boolean isPermisoTodoDescuentoTipoPrecio) {
		this.isPermisoTodoDescuentoTipoPrecio = isPermisoTodoDescuentoTipoPrecio;
	}

	public Boolean getIsPermisoNuevoDescuentoTipoPrecio() {
		return isPermisoNuevoDescuentoTipoPrecio;
	}

	public void setIsPermisoNuevoDescuentoTipoPrecio(Boolean isPermisoNuevoDescuentoTipoPrecio) {
		this.isPermisoNuevoDescuentoTipoPrecio = isPermisoNuevoDescuentoTipoPrecio;
	}

	public Boolean getIsPermisoActualizarDescuentoTipoPrecio() {
		return isPermisoActualizarDescuentoTipoPrecio;
	}

	public void setIsPermisoActualizarDescuentoTipoPrecio(Boolean isPermisoActualizarDescuentoTipoPrecio) {
		this.isPermisoActualizarDescuentoTipoPrecio = isPermisoActualizarDescuentoTipoPrecio;
	}

	public Boolean getIsPermisoEliminarDescuentoTipoPrecio() {
		return isPermisoEliminarDescuentoTipoPrecio;
	}

	public void setIsPermisoEliminarDescuentoTipoPrecio(Boolean isPermisoEliminarDescuentoTipoPrecio) {
		this.isPermisoEliminarDescuentoTipoPrecio = isPermisoEliminarDescuentoTipoPrecio;
	}

	public Boolean getIsPermisoGuardarCambiosDescuentoTipoPrecio() {
		return isPermisoGuardarCambiosDescuentoTipoPrecio;
	}

	public void setIsPermisoGuardarCambiosDescuentoTipoPrecio(Boolean isPermisoGuardarCambiosDescuentoTipoPrecio) {
		this.isPermisoGuardarCambiosDescuentoTipoPrecio = isPermisoGuardarCambiosDescuentoTipoPrecio;
	}
	
	public Boolean getIsPermisoConsultaDescuentoTipoPrecio() {
		return isPermisoConsultaDescuentoTipoPrecio;
	}

	public void setIsPermisoConsultaDescuentoTipoPrecio(Boolean isPermisoConsultaDescuentoTipoPrecio) {
		this.isPermisoConsultaDescuentoTipoPrecio = isPermisoConsultaDescuentoTipoPrecio;
	}

	public Boolean getIsPermisoBusquedaDescuentoTipoPrecio() {
		return isPermisoBusquedaDescuentoTipoPrecio;
	}

	public void setIsPermisoBusquedaDescuentoTipoPrecio(Boolean isPermisoBusquedaDescuentoTipoPrecio) {
		this.isPermisoBusquedaDescuentoTipoPrecio = isPermisoBusquedaDescuentoTipoPrecio;
	}

	public Boolean getIsPermisoReporteDescuentoTipoPrecio() {
		return isPermisoReporteDescuentoTipoPrecio;
	}

	public void setIsPermisoReporteDescuentoTipoPrecio(Boolean isPermisoReporteDescuentoTipoPrecio) {
		this.isPermisoReporteDescuentoTipoPrecio = isPermisoReporteDescuentoTipoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionMedioDescuentoTipoPrecio() {
		return isPermisoPaginacionMedioDescuentoTipoPrecio;
	}

	public void setIsPermisoPaginacionMedioDescuentoTipoPrecio(Boolean isPermisoPaginacionMedioDescuentoTipoPrecio) {
		this.isPermisoPaginacionMedioDescuentoTipoPrecio = isPermisoPaginacionMedioDescuentoTipoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionTodoDescuentoTipoPrecio() {
		return isPermisoPaginacionTodoDescuentoTipoPrecio;
	}

	public void setIsPermisoPaginacionTodoDescuentoTipoPrecio(Boolean isPermisoPaginacionTodoDescuentoTipoPrecio) {
		this.isPermisoPaginacionTodoDescuentoTipoPrecio = isPermisoPaginacionTodoDescuentoTipoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionAltoDescuentoTipoPrecio() {
		return isPermisoPaginacionAltoDescuentoTipoPrecio;
	}

	public void setIsPermisoPaginacionAltoDescuentoTipoPrecio(Boolean isPermisoPaginacionAltoDescuentoTipoPrecio) {
		this.isPermisoPaginacionAltoDescuentoTipoPrecio = isPermisoPaginacionAltoDescuentoTipoPrecio;
	}
	
	public Boolean getIsPermisoCopiarDescuentoTipoPrecio() {
		return isPermisoCopiarDescuentoTipoPrecio;
	}

	public void setIsPermisoCopiarDescuentoTipoPrecio(Boolean isPermisoCopiarDescuentoTipoPrecio) {
		this.isPermisoCopiarDescuentoTipoPrecio = isPermisoCopiarDescuentoTipoPrecio;
	}
	
	public Boolean getIsPermisoVerFormDescuentoTipoPrecio() {
		return isPermisoVerFormDescuentoTipoPrecio;
	}

	public void setIsPermisoVerFormDescuentoTipoPrecio(Boolean isPermisoVerFormDescuentoTipoPrecio) {
		this.isPermisoVerFormDescuentoTipoPrecio = isPermisoVerFormDescuentoTipoPrecio;
	}
	
	public Boolean getIsPermisoDuplicarDescuentoTipoPrecio() {
		return isPermisoDuplicarDescuentoTipoPrecio;
	}

	public void setIsPermisoDuplicarDescuentoTipoPrecio(Boolean isPermisoDuplicarDescuentoTipoPrecio) {
		this.isPermisoDuplicarDescuentoTipoPrecio = isPermisoDuplicarDescuentoTipoPrecio;
	}
	
	public Boolean getIsPermisoOrdenDescuentoTipoPrecio() {
		return isPermisoOrdenDescuentoTipoPrecio;
	}

	public void setIsPermisoOrdenDescuentoTipoPrecio(Boolean isPermisoOrdenDescuentoTipoPrecio) {
		this.isPermisoOrdenDescuentoTipoPrecio = isPermisoOrdenDescuentoTipoPrecio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDescuentoTipoPrecio() {
		return isVisibilidadCeldaNuevoDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaNuevoDescuentoTipoPrecio(Boolean isVisibilidadCeldaNuevoDescuentoTipoPrecio) {
		this.isVisibilidadCeldaNuevoDescuentoTipoPrecio = isVisibilidadCeldaNuevoDescuentoTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDescuentoTipoPrecio() {
		return isVisibilidadCeldaDuplicarDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaDuplicarDescuentoTipoPrecio(Boolean isVisibilidadCeldaDuplicarDescuentoTipoPrecio) {
		this.isVisibilidadCeldaDuplicarDescuentoTipoPrecio = isVisibilidadCeldaDuplicarDescuentoTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDescuentoTipoPrecio() {
		return isVisibilidadCeldaCopiarDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaCopiarDescuentoTipoPrecio(Boolean isVisibilidadCeldaCopiarDescuentoTipoPrecio) {
		this.isVisibilidadCeldaCopiarDescuentoTipoPrecio = isVisibilidadCeldaCopiarDescuentoTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDescuentoTipoPrecio() {
		return isVisibilidadCeldaVerFormDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaVerFormDescuentoTipoPrecio(Boolean isVisibilidadCeldaVerFormDescuentoTipoPrecio) {
		this.isVisibilidadCeldaVerFormDescuentoTipoPrecio = isVisibilidadCeldaVerFormDescuentoTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDescuentoTipoPrecio() {
		return isVisibilidadCeldaOrdenDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaOrdenDescuentoTipoPrecio(Boolean isVisibilidadCeldaOrdenDescuentoTipoPrecio) {
		this.isVisibilidadCeldaOrdenDescuentoTipoPrecio = isVisibilidadCeldaOrdenDescuentoTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio() {
		return isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio(Boolean isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio) {
		this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio = isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDescuentoTipoPrecio() {
		return isVisibilidadCeldaModificarDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaModificarDescuentoTipoPrecio(Boolean isVisibilidadCeldaModificarDescuentoTipoPrecio) {
		this.isVisibilidadCeldaModificarDescuentoTipoPrecio = isVisibilidadCeldaModificarDescuentoTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDescuentoTipoPrecio() {
		return isVisibilidadCeldaActualizarDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaActualizarDescuentoTipoPrecio(Boolean isVisibilidadCeldaActualizarDescuentoTipoPrecio) {
		this.isVisibilidadCeldaActualizarDescuentoTipoPrecio = isVisibilidadCeldaActualizarDescuentoTipoPrecio;
	}

	public Boolean getIsVisibilidadCeldaEliminarDescuentoTipoPrecio() {
		return isVisibilidadCeldaEliminarDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaEliminarDescuentoTipoPrecio(Boolean isVisibilidadCeldaEliminarDescuentoTipoPrecio) {
		this.isVisibilidadCeldaEliminarDescuentoTipoPrecio = isVisibilidadCeldaEliminarDescuentoTipoPrecio;
	}

	public Boolean getIsVisibilidadCeldaCancelarDescuentoTipoPrecio() {
		return isVisibilidadCeldaCancelarDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaCancelarDescuentoTipoPrecio(Boolean isVisibilidadCeldaCancelarDescuentoTipoPrecio) {
		this.isVisibilidadCeldaCancelarDescuentoTipoPrecio = isVisibilidadCeldaCancelarDescuentoTipoPrecio;
	}

	public Boolean getIsVisibilidadCeldaGuardarDescuentoTipoPrecio() {
		return isVisibilidadCeldaGuardarDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaGuardarDescuentoTipoPrecio(Boolean isVisibilidadCeldaGuardarDescuentoTipoPrecio) {
		this.isVisibilidadCeldaGuardarDescuentoTipoPrecio = isVisibilidadCeldaGuardarDescuentoTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio() {
		return isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio(Boolean isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio) {
		this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio = isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio;
	}
		
	public DescuentoTipoPrecioSessionBean getdescuentotipoprecioSessionBean() {
		return this.descuentotipoprecioSessionBean;
	}
	
	public void setdescuentotipoprecioSessionBean(DescuentoTipoPrecioSessionBean descuentotipoprecioSessionBean) {
		this.descuentotipoprecioSessionBean=descuentotipoprecioSessionBean;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoPrecio() {
		return this.isVisibilidadFK_IdTipoPrecio;
	}

	public void setisVisibilidadFK_IdTipoPrecio(Boolean isVisibilidadFK_IdTipoPrecio) {
		this.isVisibilidadFK_IdTipoPrecio=isVisibilidadFK_IdTipoPrecio;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(descuentotipoprecio,null);
				this.setActualParaGuardarSucursalForeignKey(descuentotipoprecio,null);
				this.setActualParaGuardarUsuarioForeignKey(descuentotipoprecio,null);
				this.setActualParaGuardarBodegaForeignKey(descuentotipoprecio,null);
				this.setActualParaGuardarTipoPrecioForeignKey(descuentotipoprecio,null);
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
	
	public void bugActualizarReferenciaActual(DescuentoTipoPrecio descuentotipoprecio,DescuentoTipoPrecio descuentotipoprecioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDescuentoTipoPrecio(descuentotipoprecio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		descuentotipoprecioAux.setId(descuentotipoprecio.getId());
		descuentotipoprecioAux.setVersionRow(descuentotipoprecio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDescuentoTipoPrecio();
		
			int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = descuentotipoprecioValidator.getInvalidValues(this.descuentotipoprecio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			descuentotipoprecioLogic.setDatosCliente(datosCliente);
			descuentotipoprecioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				descuentotipoprecioAux=new  DescuentoTipoPrecio();
				
				descuentotipoprecioAux.setIsNew(true);
				descuentotipoprecioAux.setIsChanged(true);
				
				descuentotipoprecioAux.setDescuentoTipoPrecioOriginal(this.descuentotipoprecio);
				
				descuentotipoprecioAux.setId(this.descuentotipoprecio.getId());	
				descuentotipoprecioAux.setVersionRow(this.descuentotipoprecio.getVersionRow());	
				descuentotipoprecioAux.setid_empresa(this.descuentotipoprecio.getid_empresa());	
				descuentotipoprecioAux.setid_sucursal(this.descuentotipoprecio.getid_sucursal());	
				descuentotipoprecioAux.setid_usuario(this.descuentotipoprecio.getid_usuario());	
				descuentotipoprecioAux.setid_bodega(this.descuentotipoprecio.getid_bodega());	
				descuentotipoprecioAux.setid_tipo_precio(this.descuentotipoprecio.getid_tipo_precio());	
				descuentotipoprecioAux.setdescripcion(this.descuentotipoprecio.getdescripcion());	
				descuentotipoprecioAux.setporcentaje(this.descuentotipoprecio.getporcentaje());	
				descuentotipoprecioAux.setfecha_inicio(this.descuentotipoprecio.getfecha_inicio());	
				descuentotipoprecioAux.setfecha_fin(this.descuentotipoprecio.getfecha_fin());	
				descuentotipoprecioAux.setesta_activo(this.descuentotipoprecio.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.descuentotipoprecioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(descuentotipoprecioAux,descuentotipoprecioLogic.getDescuentoTipoPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(descuentotipoprecioAux,descuentotipoprecios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioLogic.saveDescuentoTipoPrecios();//WithConnection
						//descuentotipoprecioLogic.getSetVersionRowDescuentoTipoPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.descuentotipoprecio,descuentotipoprecioAux);
					
					this.refrescarForeignKeysDescripcionesDescuentoTipoPrecio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								descuentotipoprecioLogic.saveDescuentoTipoPrecioRelaciones(descuentotipoprecioAux);//WithConnection
								//descuentotipoprecioLogic.getSetVersionRowDescuentoTipoPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.descuentotipoprecio,descuentotipoprecioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.descuentotipoprecioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(descuentotipoprecioAux,descuentotipoprecioLogic.getDescuentoTipoPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(descuentotipoprecioAux,descuentotipoprecios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.descuentotipoprecio,descuentotipoprecioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				descuentotipoprecioAux=new  DescuentoTipoPrecio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() 
					|| (this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() && this.descuentotipoprecio.getId()>=0)) {
						
					descuentotipoprecioAux.setIsNew(false);
				}
				
				descuentotipoprecioAux.setIsDeleted(false);
			
				descuentotipoprecioAux.setId(this.descuentotipoprecio.getId());	
				descuentotipoprecioAux.setVersionRow(this.descuentotipoprecio.getVersionRow());	
				descuentotipoprecioAux.setid_empresa(this.descuentotipoprecio.getid_empresa());	
				descuentotipoprecioAux.setid_sucursal(this.descuentotipoprecio.getid_sucursal());	
				descuentotipoprecioAux.setid_usuario(this.descuentotipoprecio.getid_usuario());	
				descuentotipoprecioAux.setid_bodega(this.descuentotipoprecio.getid_bodega());	
				descuentotipoprecioAux.setid_tipo_precio(this.descuentotipoprecio.getid_tipo_precio());	
				descuentotipoprecioAux.setdescripcion(this.descuentotipoprecio.getdescripcion());	
				descuentotipoprecioAux.setporcentaje(this.descuentotipoprecio.getporcentaje());	
				descuentotipoprecioAux.setfecha_inicio(this.descuentotipoprecio.getfecha_inicio());	
				descuentotipoprecioAux.setfecha_fin(this.descuentotipoprecio.getfecha_fin());	
				descuentotipoprecioAux.setesta_activo(this.descuentotipoprecio.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(descuentotipoprecioAux,descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(descuentotipoprecioAux,descuentotipoprecios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioLogic.saveDescuentoTipoPrecios();//WithConnection
						//descuentotipoprecioLogic.getSetVersionRowDescuentoTipoPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.descuentotipoprecio,descuentotipoprecioAux);
					
					this.refrescarForeignKeysDescripcionesDescuentoTipoPrecio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								descuentotipoprecioLogic.saveDescuentoTipoPrecioRelaciones(descuentotipoprecioAux);//WithConnection
								//descuentotipoprecioLogic.getSetVersionRowDescuentoTipoPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.descuentotipoprecio,descuentotipoprecioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.descuentotipoprecioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(descuentotipoprecioAux,descuentotipoprecioLogic.getDescuentoTipoPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(descuentotipoprecioAux,descuentotipoprecios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.descuentotipoprecio,descuentotipoprecioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				descuentotipoprecioAux=new  DescuentoTipoPrecio();
				
				descuentotipoprecioAux.setIsNew(false);
				descuentotipoprecioAux.setIsChanged(false);
				
				descuentotipoprecioAux.setIsDeleted(true);
				
				descuentotipoprecioAux.setId(this.descuentotipoprecio.getId());	
				descuentotipoprecioAux.setVersionRow(this.descuentotipoprecio.getVersionRow());	
				descuentotipoprecioAux.setid_empresa(this.descuentotipoprecio.getid_empresa());	
				descuentotipoprecioAux.setid_sucursal(this.descuentotipoprecio.getid_sucursal());	
				descuentotipoprecioAux.setid_usuario(this.descuentotipoprecio.getid_usuario());	
				descuentotipoprecioAux.setid_bodega(this.descuentotipoprecio.getid_bodega());	
				descuentotipoprecioAux.setid_tipo_precio(this.descuentotipoprecio.getid_tipo_precio());	
				descuentotipoprecioAux.setdescripcion(this.descuentotipoprecio.getdescripcion());	
				descuentotipoprecioAux.setporcentaje(this.descuentotipoprecio.getporcentaje());	
				descuentotipoprecioAux.setfecha_inicio(this.descuentotipoprecio.getfecha_inicio());	
				descuentotipoprecioAux.setfecha_fin(this.descuentotipoprecio.getfecha_fin());	
				descuentotipoprecioAux.setesta_activo(this.descuentotipoprecio.getesta_activo());	
				
				if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.descuentotipoprecioAux.getId()>=0) {	
						this.descuentotipopreciosEliminados.add(descuentotipoprecioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(descuentotipoprecioAux,descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(descuentotipoprecioAux,descuentotipoprecios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioLogic.saveDescuentoTipoPrecios();//WithConnection
						//descuentotipoprecioLogic.getSetVersionRowDescuentoTipoPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								descuentotipoprecioLogic.saveDescuentoTipoPrecioRelaciones(descuentotipoprecioAux);//WithConnection
								//descuentotipoprecioLogic.getSetVersionRowDescuentoTipoPrecios();//WithConnection
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
							if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.descuentotipoprecioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(descuentotipoprecioAux,descuentotipoprecioLogic.getDescuentoTipoPrecios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(descuentotipoprecioAux,descuentotipoprecios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getDescuentoTipoPrecios().addAll(this.descuentotipopreciosEliminados);
					
					descuentotipoprecioLogic.saveDescuentoTipoPrecios();//WithConnection
					//descuentotipoprecioLogic.getSetVersionRowDescuentoTipoPrecios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDescuentoTipoPrecio();
				
				this.descuentotipopreciosEliminados= new ArrayList<DescuentoTipoPrecio>();		
			}
			
			if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Descuento Tipo Precio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.descuentotipoprecio=descuentotipoprecioAux;
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
      		//this.finishProcessDescuentoTipoPrecio();
      	}
		
	}	
	
	public void actualizarRelaciones(DescuentoTipoPrecio descuentotipoprecioLocal) throws Exception {
		
		if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DescuentoTipoPrecio descuentotipoprecioLocal) throws Exception {	
		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				descuentotipoprecioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				descuentotipoprecioLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				descuentotipoprecioLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				descuentotipoprecioLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPrecioDetalleFormJInternalFrame.class)) {
				TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrameLocal=(TipoPrecioBeanSwingJInternalFrame) ((TipoPrecioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprecioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPrecio(tipoprecioBeanSwingJInternalFrameLocal.gettipoprecio(),true);
				tipoprecioBeanSwingJInternalFrameLocal.actualizarLista(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio,this.tipopreciosForeignKey);

				tipoprecioBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio);

				descuentotipoprecioLocal.setTipoPrecio(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio);

				this.addItemDefectoCombosForeignKeyTipoPrecio();
				this.cargarCombosFrameTipoPreciosForeignKey("Formulario");
				this.setActualTipoPrecioForeignKey(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDescuentoTipoPrecioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = descuentotipoprecioValidator.getInvalidValues(this.descuentotipoprecio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DescuentoTipoPrecio descuentotipoprecio,List<DescuentoTipoPrecio> descuentotipoprecios) throws Exception {
		try	{		
			DescuentoTipoPrecioConstantesFunciones.actualizarLista(descuentotipoprecio,descuentotipoprecios,this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DescuentoTipoPrecio descuentotipoprecio,List<DescuentoTipoPrecio> descuentotipoprecios) throws Exception {
		try	{			
			DescuentoTipoPrecioConstantesFunciones.actualizarSelectedLista(descuentotipoprecio,descuentotipoprecios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DescuentoTipoPrecio> descuentotipopreciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				descuentotipopreciosLocal=this.descuentotipoprecioLogic.getDescuentoTipoPrecios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				descuentotipopreciosLocal=this.descuentotipoprecios;
			}
			//ARCHITECTURE
		
			for(DescuentoTipoPrecio descuentotipoprecioLocal:descuentotipopreciosLocal) {
				if(this.permiteMantenimiento(descuentotipoprecioLocal) && descuentotipoprecioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DescuentoTipoPrecioConstantesFunciones.getDescuentoTipoPrecioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_empresaDescuentoTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_sucursalDescuentoTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_usuarioDescuentoTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_bodegaDescuentoTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.IDTIPOPRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_tipo_precioDescuentoTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabeldescripcionDescuentoTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelporcentajeDescuentoTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelfecha_inicioDescuentoTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelfecha_finDescuentoTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoTipoPrecioConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelesta_activoDescuentoTipoPrecio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_empresaDescuentoTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_sucursalDescuentoTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_usuarioDescuentoTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_bodegaDescuentoTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelid_tipo_precioDescuentoTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabeldescripcionDescuentoTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelporcentajeDescuentoTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelfecha_inicioDescuentoTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelfecha_finDescuentoTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelesta_activoDescuentoTipoPrecio,"");
		
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
		this.iIdNuevoDescuentoTipoPrecio--;	
		
		
		this.descuentotipoprecioAux=new DescuentoTipoPrecio();
		
		this.descuentotipoprecioAux.setId(this.iIdNuevoDescuentoTipoPrecio);
		this.descuentotipoprecioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.descuentotipoprecioLogic.getDescuentoTipoPrecios().add(this.descuentotipoprecioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.descuentotipoprecios.add(this.descuentotipoprecioAux);
		}
		//ARCHITECTURE
		
		this.descuentotipoprecio=this.descuentotipoprecioAux;
		
		if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDescuentoTipoPrecio(this.descuentotipoprecio);
			this.setVariablesObjetoActualToFormularioForeignKeyDescuentoTipoPrecio(this.descuentotipoprecio);
		}
				
		//this.setDefaultControlesDescuentoTipoPrecio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDescuentoTipoPrecio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDescuentoTipoPrecio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDescuentoTipoPrecio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecioBean,this.descuentotipoprecio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
			classes=DescuentoTipoPrecioConstantesFunciones.getClassesRelationshipsOfDescuentoTipoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.descuentotipoprecioReturnGeneral=descuentotipoprecioLogic.procesarEventosDescuentoTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.descuentotipoprecioLogic.getDescuentoTipoPrecios(),this.descuentotipoprecio,this.descuentotipoprecioParameterGeneral,this.isEsNuevoDescuentoTipoPrecio,classes);//this.descuentotipoprecioLogic.getDescuentoTipoPrecio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDescuentoTipoPrecio(this.descuentotipoprecioReturnGeneral,this.descuentotipoprecioBean,false);
		
		if(this.descuentotipoprecioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDescuentoTipoPrecio(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDescuentoTipoPrecio(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio());
		}
		
		if(this.descuentotipoprecioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDescuentoTipoPrecio(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio(),classes);//this.descuentotipoprecioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDescuentoTipoPrecio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDescuentoTipoPrecio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.RecargarFormDescuentoTipoPrecio(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDescuentoTipoPrecio(false);
						
			if(descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDescuentoTipoPrecio();
			}
			
			this.actualizarVisualTableDatosDescuentoTipoPrecio();
			
			this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(this.getIndiceNuevoDescuentoTipoPrecio(), this.getIndiceNuevoDescuentoTipoPrecio());
			
			this.seleccionarFilaTablaDescuentoTipoPrecioActual();
						
			this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDescuentoTipoPrecio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextAreadescripcionDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activardescripcionDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextFieldporcentajeDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activarporcentajeDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_inicioDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activarfecha_inicioDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_finDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activarfecha_finDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxesta_activoDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activaresta_activoDescuentoTipoPrecio);	
		//
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activarid_empresaDescuentoTipoPrecio);//
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activarid_sucursalDescuentoTipoPrecio);//
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activarid_usuarioDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activarid_bodegaDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.setEnabled(isHabilitar && this.descuentotipoprecioConstantesFunciones.activarid_tipo_precioDescuentoTipoPrecio);
	};
	
	public void setDefaultControlesDescuentoTipoPrecio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDescuentoTipoPrecio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.descuentotipoprecioSessionBean.setConGuardarRelaciones(true);			
			this.descuentotipoprecioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTabbedPaneRelacionesDescuentoTipoPrecio.setVisible(true);
			
					
		} else {
			//this.descuentotipoprecioSessionBean.setConGuardarRelaciones(false);			
			this.descuentotipoprecioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTabbedPaneRelacionesDescuentoTipoPrecio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDescuentoTipoPrecio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
				if(descuentotipoprecioAux.getId().equals(this.iIdNuevoDescuentoTipoPrecio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecios) {
				if(descuentotipoprecioAux.getId().equals(this.iIdNuevoDescuentoTipoPrecio)) {
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
	
	public int getIndiceActualDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
				if(descuentotipoprecioAux.getId().equals(descuentotipoprecio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecios) {
				if(descuentotipoprecioAux.getId().equals(descuentotipoprecio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
				if(descuentotipoprecioAux.getDescuentoTipoPrecioOriginal().getId().equals(descuentotipoprecioOriginal.getId())) {
					existe=true;
					descuentotipoprecioOriginal.setId(descuentotipoprecioAux.getId());
					descuentotipoprecioOriginal.setVersionRow(descuentotipoprecioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecios) {
				if(descuentotipoprecioAux.getDescuentoTipoPrecioOriginal().getId().equals(descuentotipoprecioOriginal.getId())) {
					existe=true;
					descuentotipoprecioOriginal.setId(descuentotipoprecioAux.getId());
					descuentotipoprecioOriginal.setVersionRow(descuentotipoprecioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDescuentoTipoPrecio(Boolean esParaCancelar) throws Exception {
		descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
		descuentotipoprecioAux=new DescuentoTipoPrecio();
		
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
					if(descuentotipoprecioAux.getId()<0) {
						descuentotipopreciosAux.add(descuentotipoprecioAux);
					}		
				}
				this.iIdNuevoDescuentoTipoPrecio=0L;
				this.descuentotipoprecioLogic.getDescuentoTipoPrecios().removeAll(descuentotipopreciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecios) {
					if(descuentotipoprecioAux.getId()<0) {
						descuentotipopreciosAux.add(descuentotipoprecioAux);
					}		
				}
				this.iIdNuevoDescuentoTipoPrecio=0L;
				this.descuentotipoprecios.removeAll(descuentotipopreciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDescuentoTipoPrecio 
					&& this.descuentotipoprecioLogic.getDescuentoTipoPrecios().size()>0
					) {
					descuentotipoprecioAux=this.descuentotipoprecioLogic.getDescuentoTipoPrecios().get(this.descuentotipoprecioLogic.getDescuentoTipoPrecios().size() - 1);
				
					if(descuentotipoprecioAux.getId()<0) {
						this.descuentotipoprecioLogic.getDescuentoTipoPrecios().remove(descuentotipoprecioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDescuentoTipoPrecio && this.descuentotipoprecios.size()>0) {
					descuentotipoprecioAux=this.descuentotipoprecios.get(this.descuentotipoprecios.size() - 1);
				
					if(descuentotipoprecioAux.getId()<0) {
						this.descuentotipoprecios.remove(descuentotipoprecioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDescuentoTipoPrecio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(descuentotipoprecio.getId()<0) {
				this.descuentotipoprecioLogic.getDescuentoTipoPrecios().remove(this.descuentotipoprecio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(descuentotipoprecio.getId()<0) {
				this.descuentotipoprecios.remove(this.descuentotipoprecio);
			}
		}			
	}
	
	public void setEstadosInicialesDescuentoTipoPrecio(List<DescuentoTipoPrecio> descuentotipopreciosAux) throws Exception {
		DescuentoTipoPrecioConstantesFunciones.setEstadosInicialesDescuentoTipoPrecio(descuentotipopreciosAux);
	}
	
	public void setEstadosInicialesDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecioAux) throws Exception {
		DescuentoTipoPrecioConstantesFunciones.setEstadosInicialesDescuentoTipoPrecio(descuentotipoprecioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDescuentoTipoPrecioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDescuentoTipoPrecioActual()) {
				if(!this.isEsNuevoDescuentoTipoPrecio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDescuentoTipoPrecio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDescuentoTipoPrecioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Descuento Tipo Precio ?", "MANTENIMIENTO DE Descuento Tipo Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DescuentoTipoPrecio descuentotipoprecio) throws Exception {
		DescuentoTipoPrecioConstantesFunciones.seleccionarAsignar(this.descuentotipoprecio,descuentotipoprecio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDescuentoTipoPrecio=this.isPermisoActualizarOriginalDescuentoTipoPrecio;
			
			
			this.seleccionarAsignar(descuentotipoprecio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DescuentoTipoPrecioConstantesFunciones.quitarEspaciosDescuentoTipoPrecio(this.descuentotipoprecio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.descuentotipoprecioSessionBean.setsFuncionBusquedaRapida(this.descuentotipoprecioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDescuentoTipoPrecio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDescuentoTipoPrecio(esParaCancelar);				
				this.cancelarNuevoDescuentoTipoPrecio(esParaCancelar);								
			}
			
			this.descuentotipoprecio=new DescuentoTipoPrecio();
			
			this.inicializarDescuentoTipoPrecio();
			
			this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDescuentoTipoPrecio() throws Exception {
		try {
			DescuentoTipoPrecioConstantesFunciones.inicializarDescuentoTipoPrecio(this.descuentotipoprecio);
			
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
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.descuentotipoprecioLogic.getDescuentoTipoPrecios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDescuentoTipoPrecios(String sAccionBusqueda,List<DescuentoTipoPrecio> descuentotipopreciosParaReportes) throws Exception {
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
					sPathReporteFinal="DescuentoTipoPrecio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DescuentoTipoPrecioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DescuentoTipoPrecioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DescuentoTipoPrecio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Descuento Tipo Precios");		
		parameters.put("busquedapor", DescuentoTipoPrecioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDescuentoTipoPrecio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DescuentoTipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DescuentoTipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDescuentoTipoPrecio=new JRBeanArrayDataSource(DescuentoTipoPrecioJInternalFrame.TraerDescuentoTipoPrecioBeans(descuentotipopreciosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDescuentoTipoPrecio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DescuentoTipoPrecioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DescuentoTipoPrecioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DescuentoTipoPrecioBean.TraerDescuentoTipoPrecioBeans(descuentotipopreciosParaReportes).toArray()));
							
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
				this.generarExcelReporteDescuentoTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,descuentotipopreciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDescuentoTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,descuentotipopreciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecioActionPerformed(null);
					//this.generarExcelReporteDescuentoTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,descuentotipopreciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDescuentoTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,descuentotipopreciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDescuentoTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,descuentotipopreciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDescuentoTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,descuentotipopreciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDescuentoTipoPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<DescuentoTipoPrecio> descuentotipopreciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentotipoprecio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DescuentoTipoPrecios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDescuentoTipoPrecio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DescuentoTipoPrecio descuentotipoprecio : descuentotipopreciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DescuentoTipoPrecioConstantesFunciones.generarExcelReporteDataDescuentoTipoPrecio("NORMAL",row,workbook,descuentotipoprecio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDescuentoTipoPrecio(String sTipo,Row row,Workbook workbook) {
		
		DescuentoTipoPrecioConstantesFunciones.generarExcelReporteHeaderDescuentoTipoPrecio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDescuentoTipoPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<DescuentoTipoPrecio> descuentotipopreciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentotipoprecio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DescuentoTipoPrecios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DescuentoTipoPrecio descuentotipoprecio : descuentotipopreciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.getDescuentoTipoPrecioDescripcion(descuentotipoprecio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentotipoprecio.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentotipoprecio.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentotipoprecio.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentotipoprecio.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentotipoprecio.gettipoprecio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentotipoprecio.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentotipoprecio.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentotipoprecio.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentotipoprecio.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(descuentotipoprecio.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDescuentoTipoPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<DescuentoTipoPrecio> descuentotipopreciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DescuentoTipoPrecio> descuentotipopreciosRespaldo=null;
		
		classes=DescuentoTipoPrecioConstantesFunciones.getClassesRelationshipsOfDescuentoTipoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.descuentotipoprecioLogic.setDatosCliente(this.datosCliente);
		this.descuentotipoprecioLogic.setDatosDeep(this.datosDeep);
		this.descuentotipoprecioLogic.setIsConDeep(true);
		
		descuentotipopreciosRespaldo=this.descuentotipoprecioLogic.getDescuentoTipoPrecios();
		
		this.descuentotipoprecioLogic.setDescuentoTipoPrecios(descuentotipopreciosParaReportes);	
		this.descuentotipoprecioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		descuentotipopreciosParaReportes=this.descuentotipoprecioLogic.getDescuentoTipoPrecios();
		this.descuentotipoprecioLogic.setDescuentoTipoPrecios(descuentotipopreciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentotipoprecio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DescuentoTipoPrecios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDescuentoTipoPrecio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DescuentoTipoPrecio descuentotipoprecio : descuentotipopreciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDescuentoTipoPrecio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DescuentoTipoPrecioConstantesFunciones.generarExcelReporteDataDescuentoTipoPrecio("NORMAL",row,workbook,descuentotipoprecio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.getDescuentoTipoPrecioDescripcion(descuentotipoprecio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDescuentoTipoPrecio() throws Exception {		
		this.startProcessDescuentoTipoPrecio(true);
	}
	
	public void startProcessDescuentoTipoPrecio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDescuentoTipoPrecio ,this.jPanelParametrosReportesDescuentoTipoPrecio, this.jScrollPanelDatosDescuentoTipoPrecio,this.jPanelPaginacionDescuentoTipoPrecio, this.jScrollPanelDatosEdicionDescuentoTipoPrecio, this.jPanelAccionesDescuentoTipoPrecio,this.jPanelAccionesFormularioDescuentoTipoPrecio,this.jmenuBarDescuentoTipoPrecio,this.jmenuBarDetalleDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,this.jTtoolBarDetalleDescuentoTipoPrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasDescuentoTipoPrecio=this.jTabbedPaneBusquedasDescuentoTipoPrecio; 
		
		final JPanel jPanelParametrosReportesDescuentoTipoPrecio=this.jPanelParametrosReportesDescuentoTipoPrecio;
		//final JScrollPane jScrollPanelDatosDescuentoTipoPrecio=this.jScrollPanelDatosDescuentoTipoPrecio;
		final JTable jTableDatosDescuentoTipoPrecio=this.jTableDatosDescuentoTipoPrecio;		
		final JPanel jPanelPaginacionDescuentoTipoPrecio=this.jPanelPaginacionDescuentoTipoPrecio;
		//final JScrollPane jScrollPanelDatosEdicionDescuentoTipoPrecio=this.jScrollPanelDatosEdicionDescuentoTipoPrecio;
		final JPanel jPanelAccionesDescuentoTipoPrecio=this.jPanelAccionesDescuentoTipoPrecio;
		
		JPanel jPanelCamposAuxiliarDescuentoTipoPrecio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDescuentoTipoPrecio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			jPanelCamposAuxiliarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelCamposDescuentoTipoPrecio;
			jPanelAccionesFormularioAuxiliarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelAccionesFormularioDescuentoTipoPrecio;
		}
		
		final JPanel jPanelCamposDescuentoTipoPrecio=jPanelCamposAuxiliarDescuentoTipoPrecio;
		final JPanel jPanelAccionesFormularioDescuentoTipoPrecio=jPanelAccionesFormularioAuxiliarDescuentoTipoPrecio;
		
		
		final JMenuBar jmenuBarDescuentoTipoPrecio=this.jmenuBarDescuentoTipoPrecio;
		final JToolBar jTtoolBarDescuentoTipoPrecio=this.jTtoolBarDescuentoTipoPrecio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDescuentoTipoPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDescuentoTipoPrecio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			jmenuBarDetalleAuxiliarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jmenuBarDetalleDescuentoTipoPrecio;
			jTtoolBarDetalleAuxiliarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTtoolBarDetalleDescuentoTipoPrecio;
		}
		
		final JMenuBar jmenuBarDetalleDescuentoTipoPrecio=jmenuBarDetalleAuxiliarDescuentoTipoPrecio;
		final JToolBar jTtoolBarDetalleDescuentoTipoPrecio=jTtoolBarDetalleAuxiliarDescuentoTipoPrecio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDescuentoTipoPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDescuentoTipoPrecio;
			processRunnable.jTableDatos=jTableDatosDescuentoTipoPrecio;
			processRunnable.jPanelCampos=jPanelCamposDescuentoTipoPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionDescuentoTipoPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesDescuentoTipoPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDescuentoTipoPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarDescuentoTipoPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDescuentoTipoPrecio;
			processRunnable.jTtoolBar=jTtoolBarDescuentoTipoPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDescuentoTipoPrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDescuentoTipoPrecio ,jPanelParametrosReportesDescuentoTipoPrecio,jTableDatosDescuentoTipoPrecio, /*jScrollPanelDatosDescuentoTipoPrecio,*/jPanelCamposDescuentoTipoPrecio,jPanelPaginacionDescuentoTipoPrecio, /*jScrollPanelDatosEdicionDescuentoTipoPrecio,*/ jPanelAccionesDescuentoTipoPrecio,jPanelAccionesFormularioDescuentoTipoPrecio,jmenuBarDescuentoTipoPrecio,jmenuBarDetalleDescuentoTipoPrecio,jTtoolBarDescuentoTipoPrecio,jTtoolBarDetalleDescuentoTipoPrecio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDescuentoTipoPrecio ,jPanelParametrosReportesDescuentoTipoPrecio, jScrollPanelDatosDescuentoTipoPrecio,jPanelPaginacionDescuentoTipoPrecio, jScrollPanelDatosEdicionDescuentoTipoPrecio, jPanelAccionesDescuentoTipoPrecio,jPanelAccionesFormularioDescuentoTipoPrecio,jmenuBarDescuentoTipoPrecio,jmenuBarDetalleDescuentoTipoPrecio,jTtoolBarDescuentoTipoPrecio,jTtoolBarDetalleDescuentoTipoPrecio);
						
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
	
	public void finishProcessDescuentoTipoPrecio() {// throws Exception 
		this.finishProcessDescuentoTipoPrecio(true);
	}
	
	public void finishProcessDescuentoTipoPrecio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDescuentoTipoPrecio ,this.jPanelParametrosReportesDescuentoTipoPrecio, this.jScrollPanelDatosDescuentoTipoPrecio,this.jPanelPaginacionDescuentoTipoPrecio, this.jScrollPanelDatosEdicionDescuentoTipoPrecio, this.jPanelAccionesDescuentoTipoPrecio,this.jPanelAccionesFormularioDescuentoTipoPrecio,this.jmenuBarDescuentoTipoPrecio,this.jmenuBarDetalleDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,this.jTtoolBarDetalleDescuentoTipoPrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasDescuentoTipoPrecio=this.jTabbedPaneBusquedasDescuentoTipoPrecio; 
		
		final JPanel jPanelParametrosReportesDescuentoTipoPrecio=this.jPanelParametrosReportesDescuentoTipoPrecio;
		//final JScrollPane jScrollPanelDatosDescuentoTipoPrecio=this.jScrollPanelDatosDescuentoTipoPrecio;
		final JTable jTableDatosDescuentoTipoPrecio=this.jTableDatosDescuentoTipoPrecio;		
		final JPanel jPanelPaginacionDescuentoTipoPrecio=this.jPanelPaginacionDescuentoTipoPrecio;
		//final JScrollPane jScrollPanelDatosEdicionDescuentoTipoPrecio=this.jScrollPanelDatosEdicionDescuentoTipoPrecio;
		final JPanel jPanelAccionesDescuentoTipoPrecio=this.jPanelAccionesDescuentoTipoPrecio;
		
		JPanel jPanelCamposAuxiliarDescuentoTipoPrecio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDescuentoTipoPrecio=new JPanel();
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			jPanelCamposAuxiliarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelCamposDescuentoTipoPrecio;
			jPanelAccionesFormularioAuxiliarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelAccionesFormularioDescuentoTipoPrecio;
		}
		
		final JPanel jPanelCamposDescuentoTipoPrecio=jPanelCamposAuxiliarDescuentoTipoPrecio;
		final JPanel jPanelAccionesFormularioDescuentoTipoPrecio=jPanelAccionesFormularioAuxiliarDescuentoTipoPrecio;
		
		
		final JMenuBar jmenuBarDescuentoTipoPrecio=this.jmenuBarDescuentoTipoPrecio;		
		final JToolBar jTtoolBarDescuentoTipoPrecio=this.jTtoolBarDescuentoTipoPrecio;
				
		JMenuBar jmenuBarDetalleAuxiliarDescuentoTipoPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDescuentoTipoPrecio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			jmenuBarDetalleAuxiliarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jmenuBarDetalleDescuentoTipoPrecio;
			jTtoolBarDetalleAuxiliarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTtoolBarDetalleDescuentoTipoPrecio;		
		}
		
		final JMenuBar jmenuBarDetalleDescuentoTipoPrecio=jmenuBarDetalleAuxiliarDescuentoTipoPrecio;
		final JToolBar jTtoolBarDetalleDescuentoTipoPrecio=jTtoolBarDetalleAuxiliarDescuentoTipoPrecio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDescuentoTipoPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDescuentoTipoPrecio;
			processRunnable.jTableDatos=jTableDatosDescuentoTipoPrecio;
			processRunnable.jPanelCampos=jPanelCamposDescuentoTipoPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionDescuentoTipoPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesDescuentoTipoPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDescuentoTipoPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarDescuentoTipoPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDescuentoTipoPrecio;
			processRunnable.jTtoolBar=jTtoolBarDescuentoTipoPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDescuentoTipoPrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDescuentoTipoPrecio ,jPanelParametrosReportesDescuentoTipoPrecio, jTableDatosDescuentoTipoPrecio,/*jScrollPanelDatosDescuentoTipoPrecio,*/jPanelCamposDescuentoTipoPrecio,jPanelPaginacionDescuentoTipoPrecio, /*jScrollPanelDatosEdicionDescuentoTipoPrecio,*/ jPanelAccionesDescuentoTipoPrecio,jPanelAccionesFormularioDescuentoTipoPrecio,jmenuBarDescuentoTipoPrecio,jmenuBarDetalleDescuentoTipoPrecio,jTtoolBarDescuentoTipoPrecio,jTtoolBarDetalleDescuentoTipoPrecio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDescuentoTipoPrecio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDescuentoTipoPrecio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDescuentoTipoPrecio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDescuentoTipoPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDescuentoTipoPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDescuentoTipoPrecio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDescuentoTipoPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDescuentoTipoPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDescuentoTipoPrecio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.descuentotipoprecioConstantesFunciones.getsFinalQueryDescuentoTipoPrecio();
		String  finalQueryPaginacionTodos=this.descuentotipoprecioConstantesFunciones.getsFinalQueryDescuentoTipoPrecio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DescuentoTipoPrecioConstantesFunciones.getArrayColumnasGlobalesNoDescuentoTipoPrecio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DescuentoTipoPrecioConstantesFunciones.getArrayColumnasGlobalesDescuentoTipoPrecio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DescuentoTipoPrecioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.descuentotipopreciosEliminados= new ArrayList<DescuentoTipoPrecio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDescuentoTipoPrecio();
		
				///*DescuentoTipoPrecioSessionBean*/this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
			
			if(this.descuentotipoprecioSessionBean==null) {
				this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
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
					this.iNumeroPaginacion=DescuentoTipoPrecioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DescuentoTipoPrecioConstantesFunciones.getClassesForeignKeysOfDescuentoTipoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/descuentotipoprecio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			descuentotipopreciosAux= new ArrayList<DescuentoTipoPrecio>();
			
				
			descuentotipoprecioLogic.setDatosCliente(this.datosCliente);
			descuentotipoprecioLogic.setDatosDeep(this.datosDeep);
			descuentotipoprecioLogic.setIsConDeep(true);
			
			
			descuentotipoprecioLogic.getDescuentoTipoPrecioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					descuentotipoprecioLogic.getTodosDescuentoTipoPrecios(finalQueryGlobal,pagination);
					
					//descuentotipoprecioLogic.getTodosDescuentoTipoPreciosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(descuentotipoprecioLogic.getDescuentoTipoPrecios()==null|| descuentotipoprecioLogic.getDescuentoTipoPrecios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							descuentotipopreciosAux= new ArrayList<DescuentoTipoPrecio>();
							descuentotipopreciosAux.addAll(descuentotipoprecioLogic.getDescuentoTipoPrecios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipopreciosAux= new ArrayList<DescuentoTipoPrecio>();
							descuentotipopreciosAux.addAll(descuentotipoprecios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							descuentotipoprecioLogic.getTodosDescuentoTipoPrecios(finalQueryGlobal+"",this.pagination);												
							
							//descuentotipoprecioLogic.getTodosDescuentoTipoPreciosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDescuentoTipoPrecios("Todos",descuentotipoprecioLogic.getDescuentoTipoPrecios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							descuentotipoprecioLogic.setDescuentoTipoPrecios(new ArrayList<DescuentoTipoPrecio>());					
							descuentotipoprecioLogic.getDescuentoTipoPrecios().addAll(descuentotipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipoprecios=new ArrayList<DescuentoTipoPrecio>();
							descuentotipoprecios.addAll(descuentotipopreciosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDescuentoTipoPrecio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDescuentoTipoPrecio=this.idActual;
				
				} else if(this.idDescuentoTipoPrecioActual!=null && this.idDescuentoTipoPrecioActual!=0L) {
					idDescuentoTipoPrecio=idDescuentoTipoPrecioActual;
				}
				
					
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndicePorId(idDescuentoTipoPrecio);
				
				this.descuentotipoprecios=new ArrayList<DescuentoTipoPrecio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					descuentotipoprecioLogic.getEntity(idDescuentoTipoPrecio);
					
					//descuentotipoprecioLogic.getEntityWithConnection(idDescuentoTipoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentotipoprecioLogic.setDescuentoTipoPrecios(new ArrayList<DescuentoTipoPrecio>());
					descuentotipoprecioLogic.getDescuentoTipoPrecios().add(descuentotipoprecioLogic.getDescuentoTipoPrecio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentotipoprecios=new ArrayList<DescuentoTipoPrecio>();
					this.descuentotipoprecios.add(descuentotipoprecio);
				}
				
				if(descuentotipoprecioLogic.getDescuentoTipoPrecio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=descuentotipoprecioLogic.getDescuentoTipoPrecios()==null||descuentotipoprecioLogic.getDescuentoTipoPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=descuentotipoprecios==null|| descuentotipoprecios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
						descuentotipopreciosAux.addAll(descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
							descuentotipopreciosAux.addAll(descuentotipoprecios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDescuentoTipoPrecios("FK_IdBodega",descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDescuentoTipoPrecios("FK_IdBodega",descuentotipoprecios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioLogic.setDescuentoTipoPrecios(new ArrayList<DescuentoTipoPrecio>());
						descuentotipoprecioLogic.getDescuentoTipoPrecios().addAll(descuentotipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipoprecios=new ArrayList<DescuentoTipoPrecio>();
							descuentotipoprecios.addAll(descuentotipopreciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=descuentotipoprecioLogic.getDescuentoTipoPrecios()==null||descuentotipoprecioLogic.getDescuentoTipoPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=descuentotipoprecios==null|| descuentotipoprecios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
						descuentotipopreciosAux.addAll(descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
							descuentotipopreciosAux.addAll(descuentotipoprecios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDescuentoTipoPrecios("FK_IdEmpresa",descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDescuentoTipoPrecios("FK_IdEmpresa",descuentotipoprecios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioLogic.setDescuentoTipoPrecios(new ArrayList<DescuentoTipoPrecio>());
						descuentotipoprecioLogic.getDescuentoTipoPrecios().addAll(descuentotipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipoprecios=new ArrayList<DescuentoTipoPrecio>();
							descuentotipoprecios.addAll(descuentotipopreciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=descuentotipoprecioLogic.getDescuentoTipoPrecios()==null||descuentotipoprecioLogic.getDescuentoTipoPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=descuentotipoprecios==null|| descuentotipoprecios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
						descuentotipopreciosAux.addAll(descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
							descuentotipopreciosAux.addAll(descuentotipoprecios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDescuentoTipoPrecios("FK_IdSucursal",descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDescuentoTipoPrecios("FK_IdSucursal",descuentotipoprecios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioLogic.setDescuentoTipoPrecios(new ArrayList<DescuentoTipoPrecio>());
						descuentotipoprecioLogic.getDescuentoTipoPrecios().addAll(descuentotipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipoprecios=new ArrayList<DescuentoTipoPrecio>();
							descuentotipoprecios.addAll(descuentotipopreciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPrecio")) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdTipoPrecio(finalQueryGlobal,pagination,id_tipo_precioFK_IdTipoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=descuentotipoprecioLogic.getDescuentoTipoPrecios()==null||descuentotipoprecioLogic.getDescuentoTipoPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=descuentotipoprecios==null|| descuentotipoprecios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
						descuentotipopreciosAux.addAll(descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
							descuentotipopreciosAux.addAll(descuentotipoprecios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdTipoPrecio(finalQueryGlobal,pagination,id_tipo_precioFK_IdTipoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDescuentoTipoPrecios("FK_IdTipoPrecio",descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDescuentoTipoPrecios("FK_IdTipoPrecio",descuentotipoprecios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioLogic.setDescuentoTipoPrecios(new ArrayList<DescuentoTipoPrecio>());
						descuentotipoprecioLogic.getDescuentoTipoPrecios().addAll(descuentotipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipoprecios=new ArrayList<DescuentoTipoPrecio>();
							descuentotipoprecios.addAll(descuentotipopreciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=descuentotipoprecioLogic.getDescuentoTipoPrecios()==null||descuentotipoprecioLogic.getDescuentoTipoPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=descuentotipoprecios==null|| descuentotipoprecios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
						descuentotipopreciosAux.addAll(descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipopreciosAux=new ArrayList<DescuentoTipoPrecio>();
							descuentotipopreciosAux.addAll(descuentotipoprecios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDescuentoTipoPrecios("FK_IdUsuario",descuentotipoprecioLogic.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDescuentoTipoPrecios("FK_IdUsuario",descuentotipoprecios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioLogic.setDescuentoTipoPrecios(new ArrayList<DescuentoTipoPrecio>());
						descuentotipoprecioLogic.getDescuentoTipoPrecios().addAll(descuentotipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipoprecios=new ArrayList<DescuentoTipoPrecio>();
							descuentotipoprecios.addAll(descuentotipopreciosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDescuentoTipoPrecio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDescuentoTipoPrecio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=descuentotipoprecioLogic.getDescuentoTipoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=descuentotipoprecios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=descuentotipoprecioLogic.getDescuentoTipoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=descuentotipoprecios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DescuentoTipoPrecio descuentotipoprecio) {
		Boolean permite=true;
		
		if(this.descuentotipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DescuentoTipoPrecioConstantesFunciones.getOrderByListaDescuentoTipoPrecio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DescuentoTipoPrecioConstantesFunciones.getOrderByListaDescuentoTipoPrecio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoTipoPrecio descuentotipoprecio:descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
				if(descuentotipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					descuentotipoprecioTotales=descuentotipoprecio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoTipoPrecio descuentotipoprecio:this.descuentotipoprecios) {
				if(descuentotipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					descuentotipoprecioTotales=descuentotipoprecio;
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
			this.descuentotipoprecioAux=new DescuentoTipoPrecio();
			this.descuentotipoprecioAux.setsType(Constantes2.S_TOTALES);
			this.descuentotipoprecioAux.setIsNew(false);
			this.descuentotipoprecioAux.setIsChanged(false);
			this.descuentotipoprecioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DescuentoTipoPrecioConstantesFunciones.TotalizarValoresFilaDescuentoTipoPrecio(this.descuentotipoprecioLogic.getDescuentoTipoPrecios(),this.descuentotipoprecioAux);
				
				this.descuentotipoprecioLogic.getDescuentoTipoPrecios().add(this.descuentotipoprecioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DescuentoTipoPrecioConstantesFunciones.TotalizarValoresFilaDescuentoTipoPrecio(this.descuentotipoprecios,this.descuentotipoprecioAux);
				
				this.descuentotipoprecios.add(this.descuentotipoprecioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		descuentotipoprecioTotales=new DescuentoTipoPrecio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.descuentotipoprecioLogic.getDescuentoTipoPrecios().remove(descuentotipoprecioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.descuentotipoprecios.remove(descuentotipoprecioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		descuentotipoprecioTotales=new DescuentoTipoPrecio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoTipoPrecio descuentotipoprecio:descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
				if(descuentotipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					descuentotipoprecioTotales=descuentotipoprecio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DescuentoTipoPrecioConstantesFunciones.TotalizarValoresFilaDescuentoTipoPrecio(this.descuentotipoprecioLogic.getDescuentoTipoPrecios(),descuentotipoprecioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoTipoPrecio descuentotipoprecio:this.descuentotipoprecios) {
				if(descuentotipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					descuentotipoprecioTotales=descuentotipoprecio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DescuentoTipoPrecioConstantesFunciones.TotalizarValoresFilaDescuentoTipoPrecio(this.descuentotipoprecios,descuentotipoprecioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDescuentoTipoPreciosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDescuentoTipoPreciosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDescuentoTipoPreciosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDescuentoTipoPreciosFK_IdTipoPrecio()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPrecio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDescuentoTipoPreciosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDescuentoTipoPreciosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDescuentoTipoPreciosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDescuentoTipoPreciosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDescuentoTipoPreciosFK_IdTipoPrecio(String sFinalQuery,Long id_tipo_precio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdTipoPrecio(sFinalQuery,this.pagination,id_tipo_precio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDescuentoTipoPreciosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentotipoprecioLogic.getDescuentoTipoPreciosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosDescuentoTipoPrecio() {
		this.isPermisoTodoDescuentoTipoPrecio=false;
		this.isPermisoNuevoDescuentoTipoPrecio=false;
		this.isPermisoActualizarDescuentoTipoPrecio=false;
		this.isPermisoActualizarOriginalDescuentoTipoPrecio=false;
		this.isPermisoEliminarDescuentoTipoPrecio=false;
		this.isPermisoGuardarCambiosDescuentoTipoPrecio=false;
		this.isPermisoConsultaDescuentoTipoPrecio=false;
		this.isPermisoBusquedaDescuentoTipoPrecio=false;
		this.isPermisoReporteDescuentoTipoPrecio=false;		
		this.isPermisoOrdenDescuentoTipoPrecio=false;		
		this.isPermisoPaginacionMedioDescuentoTipoPrecio=false;		
		this.isPermisoPaginacionAltoDescuentoTipoPrecio=false;
		this.isPermisoPaginacionTodoDescuentoTipoPrecio=false;
		this.isPermisoCopiarDescuentoTipoPrecio=false;		
		this.isPermisoVerFormDescuentoTipoPrecio=false;		
		this.isPermisoDuplicarDescuentoTipoPrecio=false;		
		this.isPermisoOrdenDescuentoTipoPrecio=false;		
	}
	
	public void setPermisosUsuarioDescuentoTipoPrecio(Boolean isPermiso) {
		this.isPermisoTodoDescuentoTipoPrecio=isPermiso;
		this.isPermisoNuevoDescuentoTipoPrecio=isPermiso;
		this.isPermisoActualizarDescuentoTipoPrecio=isPermiso;
		this.isPermisoActualizarOriginalDescuentoTipoPrecio=isPermiso;
		this.isPermisoEliminarDescuentoTipoPrecio=isPermiso;
		this.isPermisoGuardarCambiosDescuentoTipoPrecio=isPermiso;
		this.isPermisoConsultaDescuentoTipoPrecio=isPermiso;
		this.isPermisoBusquedaDescuentoTipoPrecio=isPermiso;
		this.isPermisoReporteDescuentoTipoPrecio=isPermiso;
		this.isPermisoOrdenDescuentoTipoPrecio=isPermiso;		
		this.isPermisoPaginacionMedioDescuentoTipoPrecio=isPermiso;		
		this.isPermisoPaginacionAltoDescuentoTipoPrecio=isPermiso;		
		this.isPermisoPaginacionTodoDescuentoTipoPrecio=isPermiso;		
		this.isPermisoCopiarDescuentoTipoPrecio=isPermiso;		
		this.isPermisoVerFormDescuentoTipoPrecio=isPermiso;		
		this.isPermisoDuplicarDescuentoTipoPrecio=isPermiso;
		this.isPermisoOrdenDescuentoTipoPrecio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDescuentoTipoPrecio(Boolean isPermiso) {
		//this.isPermisoTodoDescuentoTipoPrecio=isPermiso;
		this.isPermisoNuevoDescuentoTipoPrecio=isPermiso;
		this.isPermisoActualizarDescuentoTipoPrecio=isPermiso;
		this.isPermisoActualizarOriginalDescuentoTipoPrecio=isPermiso;
		this.isPermisoEliminarDescuentoTipoPrecio=isPermiso;
		this.isPermisoGuardarCambiosDescuentoTipoPrecio=isPermiso;
		//this.isPermisoConsultaDescuentoTipoPrecio=isPermiso;
		//this.isPermisoBusquedaDescuentoTipoPrecio=isPermiso;
		//this.isPermisoReporteDescuentoTipoPrecio=isPermiso;
		//this.isPermisoOrdenDescuentoTipoPrecio=isPermiso;		
		//this.isPermisoPaginacionMedioDescuentoTipoPrecio=isPermiso;		
		//this.isPermisoPaginacionAltoDescuentoTipoPrecio=isPermiso;		
		//this.isPermisoPaginacionTodoDescuentoTipoPrecio=isPermiso;		
		//this.isPermisoCopiarDescuentoTipoPrecio=isPermiso;		
		//this.isPermisoDuplicarDescuentoTipoPrecio=isPermiso;
		//this.isPermisoOrdenDescuentoTipoPrecio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDescuentoTipoPrecioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DescuentoTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDescuentoTipoPrecio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDescuentoTipoPrecioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDescuentoTipoPrecioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDescuentoTipoPrecioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDescuentoTipoPrecioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDescuentoTipoPrecio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DescuentoTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DescuentoTipoPrecioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDescuentoTipoPrecio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDescuentoTipoPrecio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDescuentoTipoPrecio=this.isPermisoActualizarDescuentoTipoPrecio;
			this.isPermisoEliminarDescuentoTipoPrecio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDescuentoTipoPrecio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDescuentoTipoPrecio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDescuentoTipoPrecio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDescuentoTipoPrecio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDescuentoTipoPrecio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDescuentoTipoPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDescuentoTipoPrecio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDescuentoTipoPrecio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDescuentoTipoPrecio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDescuentoTipoPrecio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDescuentoTipoPrecio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDescuentoTipoPrecio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDescuentoTipoPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDescuentoTipoPrecio.setToolTipText(this.jTableDatosDescuentoTipoPrecio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDescuentoTipoPrecio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDescuentoTipoPrecio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DescuentoTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DescuentoTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDescuentoTipoPrecio() throws Exception {
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
	public void inicializarCombosForeignKeyDescuentoTipoPrecioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.tipopreciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDescuentoTipoPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DescuentoTipoPrecioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDescuentoTipoPrecioListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDescuentoTipoPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DescuentoTipoPrecioParameterReturnGeneral descuentotipoprecioReturnGeneral=new DescuentoTipoPrecioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.descuentotipoprecioConstantesFunciones.cargarid_empresaDescuentoTipoPrecio)
					 || (this.esRecargarFks && this.descuentotipoprecioConstantesFunciones.cargarid_empresaDescuentoTipoPrecio)) {

					if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+descuentotipoprecioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.descuentotipoprecioConstantesFunciones.cargarid_sucursalDescuentoTipoPrecio)
					 || (this.esRecargarFks && this.descuentotipoprecioConstantesFunciones.cargarid_sucursalDescuentoTipoPrecio)) {

					if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+descuentotipoprecioSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.descuentotipoprecioConstantesFunciones.cargarid_usuarioDescuentoTipoPrecio)
					 || (this.esRecargarFks && this.descuentotipoprecioConstantesFunciones.cargarid_usuarioDescuentoTipoPrecio)) {

					if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+descuentotipoprecioSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.descuentotipoprecioConstantesFunciones.cargarid_bodegaDescuentoTipoPrecio)
					 || (this.esRecargarFks && this.descuentotipoprecioConstantesFunciones.cargarid_bodegaDescuentoTipoPrecio)) {

					if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+descuentotipoprecioSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalTipoPrecio="";

				if(((this.tipopreciosForeignKey==null||this.tipopreciosForeignKey.size()<=0) && this.descuentotipoprecioConstantesFunciones.cargarid_tipo_precioDescuentoTipoPrecio)
					 || (this.esRecargarFks && this.descuentotipoprecioConstantesFunciones.cargarid_tipo_precioDescuentoTipoPrecio)) {

					if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPrecioConstantesFunciones.getArrayColumnasGlobalesTipoPrecio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPrecio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrecioConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPrecio=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPrecio, "");
						finalQueryGlobalTipoPrecio+=TipoPrecioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPreciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPrecio=" WHERE " + ConstantesSql.ID + "="+descuentotipoprecioSessionBean.getlidTipoPrecioActual();
					}
				} else {
					finalQueryGlobalTipoPrecio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				descuentotipoprecioReturnGeneral=descuentotipoprecioLogic.cargarCombosLoteForeignKeyDescuentoTipoPrecio(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalBodega,finalQueryGlobalTipoPrecio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=descuentotipoprecioReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=descuentotipoprecioReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=descuentotipoprecioReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=descuentotipoprecioReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalTipoPrecio.equals("NONE")) {
				this.tipopreciosForeignKey=descuentotipoprecioReturnGeneral.gettipopreciosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDescuentoTipoPrecio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyTipoPrecio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.descuentotipoprecioSessionBean==null) {
				this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
			}

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

	public void addItemDefectoCombosForeignKeyTipoPrecio()throws Exception {
		try {

			if(!this.descuentotipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {
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
	
	public void initActionsCombosTodosForeignKeyDescuentoTipoPrecio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDescuentoTipoPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDescuentoTipoPrecio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.descuentotipoprecio.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.descuentotipoprecio.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDescuentoTipoPrecio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(descuentotipoprecio.getid_bodega(),false,"Formulario");
			this.setActualTipoPrecioForeignKey(descuentotipoprecio.getid_tipo_precio(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDescuentoTipoPrecio()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.descuentotipoprecioConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualTipoPrecioForeignKey(this.descuentotipoprecioConstantesFunciones.getid_tipo_precio(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDescuentoTipoPrecio()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDescuentoTipoPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDescuentoTipoPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDescuentoTipoPrecio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDescuentoTipoPrecio()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameTipoPreciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDescuentoTipoPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPreciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDescuentoTipoPrecio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public DescuentoTipoPrecioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DescuentoTipoPrecioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DescuentoTipoPrecioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean(); 
		this.descuentotipoprecioConstantesFunciones=new DescuentoTipoPrecioConstantesFunciones(); 
		this.descuentotipoprecioBean=new DescuentoTipoPrecio();//(this.descuentotipoprecioConstantesFunciones); 		
		this.descuentotipoprecioReturnGeneral=new DescuentoTipoPrecioParameterReturnGeneral(); 
		
		this.descuentotipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DescuentoTipoPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DescuentoTipoPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DescuentoTipoPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDescuentoTipoPrecio(true);
			
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
			
			this.descuentotipoprecioConstantesFunciones=new DescuentoTipoPrecioConstantesFunciones(); 
			this.descuentotipoprecioBean=new DescuentoTipoPrecio();//this.descuentotipoprecioConstantesFunciones); 			
			this.descuentotipoprecioReturnGeneral=new DescuentoTipoPrecioParameterReturnGeneral(); 
		
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Descuento Tipo Precio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.descuentotipoprecio=new DescuentoTipoPrecio();
			this.descuentotipoprecios = new ArrayList<DescuentoTipoPrecio>();
			this.descuentotipopreciosAux = new ArrayList<DescuentoTipoPrecio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic=new DescuentoTipoPrecioLogic();
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}
			
			//this.descuentotipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDescuentoTipoPrecio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDescuentoTipoPrecio);	
					}
					
					if(this.jInternalFrameImportacionDescuentoTipoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDescuentoTipoPrecio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDescuentoTipoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDescuentoTipoPrecio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDescuentoTipoPrecio);
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.setVisible(false);
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio);
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setVisible(false);
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDescuentoTipoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDescuentoTipoPrecio);
					this.jInternalFrameImportacionDescuentoTipoPrecio.setVisible(false);
					this.jInternalFrameImportacionDescuentoTipoPrecio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDescuentoTipoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDescuentoTipoPrecio);
					this.jInternalFrameOrderByDescuentoTipoPrecio.setVisible(false);
					this.jInternalFrameOrderByDescuentoTipoPrecio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDescuentoTipoPrecioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DescuentoTipoPrecioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.descuentotipoprecioReturnGeneral=new DescuentoTipoPrecioParameterReturnGeneral();
			
			this.descuentotipoprecioParameterGeneral=new DescuentoTipoPrecioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.descuentotipoprecioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DescuentoTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DescuentoTipoPrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),this.descuentotipoprecioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DescuentoTipoPrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),this.descuentotipoprecioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaDuplicarDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaCopiarDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaVerFormDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaOrdenDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoPrecio=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDescuentoTipoPrecio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDescuentoTipoPrecio(false);
			
			this.setPermisosUsuarioDescuentoTipoPrecio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() 
				|| (this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() && this.descuentotipoprecioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDescuentoTipoPrecioClasesRelacionadas();
			}
			
			if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDescuentoTipoPrecioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDescuentoTipoPrecio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDescuentoTipoPrecio();
			}
			
			if(!this.isPermisoBusquedaDescuentoTipoPrecio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDescuentoTipoPrecio,this.isPermisoPaginacionMedioDescuentoTipoPrecio,this.isPermisoPaginacionTodoDescuentoTipoPrecio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DescuentoTipoPrecioConstantesFunciones.getTiposSeleccionarDescuentoTipoPrecio());
				
				this.tiposColumnasSelect=DescuentoTipoPrecioConstantesFunciones.getTiposSeleccionarDescuentoTipoPrecio(true);
				
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
			//if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDescuentoTipoPrecio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDescuentoTipoPrecio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDescuentoTipoPrecio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDescuentoTipoPrecio() ;
			
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
			this.usuarioLogic=new UsuarioLogic();
			this.bodegaLogic=new BodegaLogic();
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
				descuentotipoprecioImplementable= (DescuentoTipoPrecioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DescuentoTipoPrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				descuentotipoprecioImplementableHome= (DescuentoTipoPrecioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DescuentoTipoPrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.descuentotipoprecios= new ArrayList<DescuentoTipoPrecio>();
			this.descuentotipopreciosEliminados= new ArrayList<DescuentoTipoPrecio>();
						
			this.isEsNuevoDescuentoTipoPrecio=false;
			this.esParaAccionDesdeFormularioDescuentoTipoPrecio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.tipopreciosForeignKey=new ArrayList<TipoPrecio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDescuentoTipoPrecio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDescuentoTipoPrecio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DescuentoTipoPrecioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDescuentoTipoPrecio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDescuentoTipoPrecio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDescuentoTipoPrecio();
			}
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDescuentoTipoPrecio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDescuentoTipoPrecio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDescuentoTipoPrecio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDescuentoTipoPrecio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DescuentoTipoPrecio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDescuentoTipoPrecio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDescuentoTipoPrecio")) {
				iIndex=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTabbedPaneRelacionesDescuentoTipoPrecio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTabbedPaneRelacionesDescuentoTipoPrecio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDescuentoTipoPrecio();	
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
	
	public void cargarCombosForeignKeyDescuentoTipoPrecio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDescuentoTipoPrecio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDescuentoTipoPrecio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDescuentoTipoPrecioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDescuentoTipoPrecio();
		
		this.cargarCombosFrameForeignKeyDescuentoTipoPrecio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDescuentoTipoPrecio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDescuentoTipoPrecio();
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
	
	public void jButtonNuevoDescuentoTipoPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
			
			if(jTableDatosDescuentoTipoPrecio.getRowCount()>=1) {
				jTableDatosDescuentoTipoPrecio.removeRowSelectionInterval(0, jTableDatosDescuentoTipoPrecio.getRowCount()-1);						
			}
			
			this.isEsNuevoDescuentoTipoPrecio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDescuentoTipoPrecio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDescuentoTipoPrecio(true);			
			//this.descuentotipoprecio=new DescuentoTipoPrecio();
			//this.descuentotipoprecio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDescuentoTipoPrecio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDescuentoTipoPrecio() ;
			
			if(DescuentoTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDescuentoTipoPrecio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.descuentotipoprecio);	
			this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);				
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
			if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DescuentoTipoPrecio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDescuentoTipoPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDescuentoTipoPrecio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDescuentoTipoPrecio.getSelectedRows().length;			
			}
			
			descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDescuentoTipoPrecio--;			
				//DescuentoTipoPrecio descuentotipoprecioAux= new DescuentoTipoPrecio();			
				//descuentotipoprecioAux.setId(this.iIdNuevoDescuentoTipoPrecio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DescuentoTipoPrecio descuentotipoprecioOrigen=new DescuentoTipoPrecio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DescuentoTipoPrecio descuentotipoprecioOrigen : descuentotipopreciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							descuentotipoprecioOrigen =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentotipoprecioOrigen =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDescuentoTipoPrecio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.descuentotipoprecio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDescuentoTipoPrecio(descuentotipoprecioOrigen,this.descuentotipoprecio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.descuentotipoprecioLogic.getDescuentoTipoPrecios().add(this.descuentotipoprecioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecios.add(this.descuentotipoprecioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
				
				this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(this.getIndiceNuevoDescuentoTipoPrecio(), this.getIndiceNuevoDescuentoTipoPrecio());
				
				int iLastRow =  this.jTableDatosDescuentoTipoPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDescuentoTipoPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDescuentoTipoPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();									
		
			DescuentoTipoPrecio descuentotipoprecioOrigen=new DescuentoTipoPrecio();
			DescuentoTipoPrecio descuentotipoprecioDestino=new DescuentoTipoPrecio();
				
			descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDescuentoTipoPrecio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || descuentotipopreciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDescuentoTipoPrecio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioOrigen =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						descuentotipoprecioOrigen =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentotipoprecioDestino =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						descuentotipoprecioDestino =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				descuentotipoprecioOrigen =descuentotipopreciosSeleccionados.get(0);
				descuentotipoprecioDestino =descuentotipopreciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDescuentoTipoPrecio(descuentotipoprecioOrigen,descuentotipoprecioDestino,true,false);
				
				descuentotipoprecioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(descuentotipoprecioDestino,descuentotipoprecioLogic.getDescuentoTipoPrecios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(descuentotipoprecioDestino,descuentotipoprecios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
				
				//this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(this.getIndiceNuevoDescuentoTipoPrecio(), this.getIndiceNuevoDescuentoTipoPrecio());
				
				int iLastRow =  this.jTableDatosDescuentoTipoPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDescuentoTipoPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDescuentoTipoPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDescuentoTipoPrecio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(!isVisible);
			this.jPanelPaginacionDescuentoTipoPrecio.setVisible(!isVisible);
			this.jPanelAccionesDescuentoTipoPrecio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDescuentoTipoPrecio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDescuentoTipoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDescuentoTipoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDescuentoTipoPrecio();
			
			this.abrirFrameOrderByDescuentoTipoPrecio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDescuentoTipoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDescuentoTipoPrecio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDescuentoTipoPrecio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.isMaximum()) {
					this.jInternalFrameDetalleFormDescuentoTipoPrecio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDescuentoTipoPrecio.setSize(this.jInternalFrameDetalleFormDescuentoTipoPrecio.iWidthFormulario,this.jInternalFrameDetalleFormDescuentoTipoPrecio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDescuentoTipoPrecio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDescuentoTipoPrecio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDescuentoTipoPrecio.isMaximum()) {
						this.jInternalFrameDetalleFormDescuentoTipoPrecio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jContentPaneDetalleDescuentoTipoPrecio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTabbedPaneRelacionesDescuentoTipoPrecio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jContentPaneDetalleDescuentoTipoPrecio.getWidth(),DescuentoTipoPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTabbedPaneRelacionesDescuentoTipoPrecio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jContentPaneDetalleDescuentoTipoPrecio.getWidth(),DescuentoTipoPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTabbedPaneRelacionesDescuentoTipoPrecio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jContentPaneDetalleDescuentoTipoPrecio.getWidth(),DescuentoTipoPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDescuentoTipoPrecio.setVisible(true);
	        this.jInternalFrameDetalleFormDescuentoTipoPrecio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDescuentoTipoPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDescuentoTipoPrecio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDescuentoTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDescuentoTipoPrecio,false,this);
				} else {
					this.jInternalFrameOrderByDescuentoTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDescuentoTipoPrecio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDescuentoTipoPrecio);
				this.jInternalFrameOrderByDescuentoTipoPrecio.setVisible(false);
				this.jInternalFrameOrderByDescuentoTipoPrecio.setSelected(false);
				
				this.jInternalFrameOrderByDescuentoTipoPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDescuentoTipoPrecio"));
				
				this.inicializarActualizarBindingTablaOrderByDescuentoTipoPrecio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDescuentoTipoPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDescuentoTipoPrecio==null) {
				
				this.jInternalFrameImportacionDescuentoTipoPrecio=new ImportacionJInternalFrame(DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDescuentoTipoPrecio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDescuentoTipoPrecio);
				this.jInternalFrameImportacionDescuentoTipoPrecio.setVisible(false);
				this.jInternalFrameImportacionDescuentoTipoPrecio.setSelected(false);


				this.jInternalFrameImportacionDescuentoTipoPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDescuentoTipoPrecio"));
				this.jInternalFrameImportacionDescuentoTipoPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDescuentoTipoPrecio"));
				this.jInternalFrameImportacionDescuentoTipoPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDescuentoTipoPrecio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDescuentoTipoPrecio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio==null) {
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio=new ReporteDinamicoJInternalFrame(DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDescuentoTipoPrecio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio);
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setVisible(false);
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDescuentoTipoPrecio"));
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDescuentoTipoPrecio"));
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDescuentoTipoPrecio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDescuentoTipoPrecio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDescuentoTipoPrecio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDescuentoTipoPrecio);
			
	       	this.jInternalFrameDetalleFormDescuentoTipoPrecio.setVisible(false);
	        this.jInternalFrameDetalleFormDescuentoTipoPrecio.setSelected(false);
			
			//this.jInternalFrameDetalleFormDescuentoTipoPrecio.dispose();
			//this.jInternalFrameDetalleFormDescuentoTipoPrecio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDescuentoTipoPrecio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setVisible(true);
	        this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDescuentoTipoPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDescuentoTipoPrecio.setVisible(true);
	        this.jInternalFrameImportacionDescuentoTipoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDescuentoTipoPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDescuentoTipoPrecio.setVisible(true);
	        this.jInternalFrameOrderByDescuentoTipoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDescuentoTipoPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDescuentoTipoPrecio.setVisible(false);
	        this.jInternalFrameOrderByDescuentoTipoPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDescuentoTipoPrecio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setVisible(false);
	        this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDescuentoTipoPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDescuentoTipoPrecio.setVisible(false);
	        this.jInternalFrameImportacionDescuentoTipoPrecio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDescuentoTipoPrecio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDescuentoTipoPrecio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDescuentoTipoPrecio(true);
			//this.isEsNuevoDescuentoTipoPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDescuentoTipoPrecio(false) ;
			
			if(descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DescuentoTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDescuentoTipoPrecio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDescuentoTipoPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDescuentoTipoPrecioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDescuentoTipoPrecio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDescuentoTipoPrecio(true);
			//this.isEsNuevoDescuentoTipoPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.descuentotipoprecio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDescuentoTipoPrecio(false) ;
			
			if(DescuentoTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDescuentoTipoPrecio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDescuentoTipoPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoPrecio(List<TipoPrecio> tipopreciosForeignKey)throws Exception{
		TableColumn tableColumnTipoPrecio=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO));
		TableCellEditor tableCellEditorTipoPrecio =tableColumnTipoPrecio.getCellEditor();

		TipoPrecioTableCell tipoprecioTableCellFk=(TipoPrecioTableCell)tableCellEditorTipoPrecio;

		if(tipoprecioTableCellFk!=null) {
			tipoprecioTableCellFk.settipopreciosForeignKey(tipopreciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprecioTableCellFk.setRowActual(intSelectedRow);
			//tipoprecioTableCellFk.settipopreciosForeignKeyActual(tipopreciosForeignKey);
		//}


		if(tipoprecioTableCellFk!=null) {
			tipoprecioTableCellFk.RecargarTipoPreciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDescuentoTipoPrecio(false);
			
			//if(!this.isEsNuevoDescuentoTipoPrecio) {								
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				
			}
			
			if(this.permiteMantenimiento(this.descuentotipoprecio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDescuentoTipoPrecio=true;
					this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
					this.isEsNuevoDescuentoTipoPrecio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDescuentoTipoPrecio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDescuentoTipoPrecio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDescuentoTipoPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDescuentoTipoPrecio(false);
				
				this.habilitarDeshabilitarControlesDescuentoTipoPrecio(false);
			
												
				
				if(DescuentoTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDescuentoTipoPrecio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,descuentotipoprecioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDescuentoTipoPrecio(this.descuentotipoprecio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,descuentotipoprecioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.descuentotipoprecio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				this.descuentotipoprecio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				this.descuentotipoprecio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.descuentotipoprecio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DescuentoTipoPrecioModel) this.jTableDatosDescuentoTipoPrecio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDescuentoTipoPrecio=true;
				this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
				this.isEsNuevoDescuentoTipoPrecio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDescuentoTipoPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDescuentoTipoPrecio(false);
				
				this.habilitarDeshabilitarControlesDescuentoTipoPrecio(false);
				
				
				
				if(DescuentoTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDescuentoTipoPrecio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDescuentoTipoPrecio.getRowCount()>=1) {
				jTableDatosDescuentoTipoPrecio.removeRowSelectionInterval(0, jTableDatosDescuentoTipoPrecio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDescuentoTipoPrecio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDescuentoTipoPrecio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDescuentoTipoPrecio(false) ;
			
			this.isEsNuevoDescuentoTipoPrecio=false;
			
			if(DescuentoTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDescuentoTipoPrecio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				
				//SI ES MANUAL
				if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDescuentoTipoPrecio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDescuentoTipoPrecio--;			
			//DescuentoTipoPrecio descuentotipoprecioAux= new DescuentoTipoPrecio();			
			//descuentotipoprecioAux.setId(this.iIdNuevoDescuentoTipoPrecio);
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDescuentoTipoPrecio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
			
			this.descuentotipoprecio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.descuentotipoprecioLogic.getDescuentoTipoPrecios().add(this.descuentotipoprecioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.descuentotipoprecios.add(this.descuentotipoprecioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
			
			this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(this.getIndiceNuevoDescuentoTipoPrecio(), this.getIndiceNuevoDescuentoTipoPrecio());
			
			int iLastRow =  this.jTableDatosDescuentoTipoPrecio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDescuentoTipoPrecio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDescuentoTipoPrecio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDescuentoTipoPrecio(false);
			
			//SI ES MANUAL
			if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDescuentoTipoPrecio();
			}
			
			//this.abrirFrameTreeDescuentoTipoPrecio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Descuento Tipo PrecioS ?", "MANTENIMIENTO DE Descuento Tipo Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDescuentoTipoPrecio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDescuentoTipoPrecio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.descuentotipoprecioReturnGeneral=descuentotipoprecioLogic.procesarImportacionDescuentoTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.descuentotipoprecioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDescuentoTipoPrecioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDescuentoTipoPrecio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDescuentoTipoPrecio.setFileImportacion(this.jInternalFrameImportacionDescuentoTipoPrecio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDescuentoTipoPrecio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDescuentoTipoPrecio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDescuentoTipoPrecio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDescuentoTipoPrecio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();		

		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DescuentoTipoPrecioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DescuentoTipoPrecioBaseDesign.jrxml";
			
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
			
			this.generarReporteDescuentoTipoPrecios("Todos",descuentotipopreciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPrecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPrecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPrecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPrecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					sNombreCampoCategoria="id_tipo_precio";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					sNombreCampoCategoriaValor="id_tipo_precio";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_precio");
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();		
		
		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentotipoprecio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DescuentoTipoPrecios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.gettipoprecio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(DescuentoTipoPrecio descuentotipoprecio:descuentotipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentotipoprecio.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelDescuentoTipoPrecio(row);				
			//	iRow++;
			//}				
			
			//for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipopreciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDescuentoTipoPrecio(descuentotipoprecioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
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
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDescuentoTipoPrecio(false);
			
			//SI ES MANUAL
			if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDescuentoTipoPrecio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDescuentoTipoPrecio(false);
			
			//SI ES MANUAL
			if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDescuentoTipoPrecio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDescuentoTipoPrecio(false);
			
			//SI ES MANUAL
			if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDescuentoTipoPrecio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDescuentoTipoPrecio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDescuentoTipoPrecio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDescuentoTipoPrecio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDescuentoTipoPrecio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDescuentoTipoPrecio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDescuentoTipoPrecio.setMinimumSize(dimensionMinimum);
		this.jTableDatosDescuentoTipoPrecio.setMaximumSize(dimensionMaximum);
		this.jTableDatosDescuentoTipoPrecio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDescuentoTipoPrecio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDescuentoTipoPrecio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDescuentoTipoPrecio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDescuentoTipoPrecio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDescuentoTipoPrecio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDescuentoTipoPrecio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDescuentoTipoPrecio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDescuentoTipoPrecio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDescuentoTipoPrecio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDescuentoTipoPrecio();
		
		this.inicializarActualizarBindingBotonesManualDescuentoTipoPrecio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDescuentoTipoPrecio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDescuentoTipoPrecio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDescuentoTipoPrecio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDescuentoTipoPrecio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDescuentoTipoPrecio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDescuentoTipoPrecio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxPostAccionNuevoDescuentoTipoPrecio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxPostAccionSinCerrarDescuentoTipoPrecio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxPostAccionSinMensajeDescuentoTipoPrecio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDescuentoTipoPrecio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDescuentoTipoPrecio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxPostAccionNuevoDescuentoTipoPrecio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxPostAccionSinCerrarDescuentoTipoPrecio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxPostAccionSinMensajeDescuentoTipoPrecio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDescuentoTipoPrecio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDescuentoTipoPrecio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDescuentoTipoPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDescuentoTipoPrecio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDescuentoTipoPrecio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDescuentoTipoPrecio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDescuentoTipoPrecio(Boolean esInicializar) throws Exception {
		try	{	
			if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDescuentoTipoPrecio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDescuentoTipoPrecio() throws Exception {
		try	{
			if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDescuentoTipoPrecio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDescuentoTipoPrecio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDescuentoTipoPrecio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDescuentoTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDescuentoTipoPrecio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDescuentoTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDescuentoTipoPrecio.addItem(reporte);
			}
			
			
			if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDescuentoTipoPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDescuentoTipoPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDescuentoTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDescuentoTipoPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDescuentoTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDescuentoTipoPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDescuentoTipoPrecio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDescuentoTipoPrecio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio!=null) {
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio!=null) {
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio!=null) {
				
				if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DescuentoTipoPrecioConstantesFunciones.getTiposSeleccionarDescuentoTipoPrecio(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DescuentoTipoPrecioConstantesFunciones.getTiposSeleccionarDescuentoTipoPrecio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DescuentoTipoPrecioConstantesFunciones.getTiposSeleccionarDescuentoTipoPrecio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDescuentoTipoPrecio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.getSelectedItem()!=null){this.id_tipo_precioFK_IdTipoPrecio=((TipoPrecio)this.jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDescuentoTipoPrecio(Boolean esInicializar) throws Exception {				
		if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDescuentoTipoPrecio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDescuentoTipoPrecio() throws Exception {
		this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDescuentoTipoPrecio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDescuentoTipoPrecioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDescuentoTipoPrecio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=descuentotipoprecioLogic.getDescuentoTipoPrecios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=descuentotipoprecios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDescuentoTipoPrecio.setModel(new DescuentoTipoPrecioModel(this.descuentotipoprecioLogic.getDescuentoTipoPrecios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDescuentoTipoPrecio.setModel(new DescuentoTipoPrecioModel(this.descuentotipoprecios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDescuentoTipoPrecio!=null && this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDescuentoTipoPrecio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO,descuentotipoprecioConstantesFunciones.resaltarSeleccionarDescuentoTipoPrecio,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO,descuentotipoprecioConstantesFunciones.resaltarSeleccionarDescuentoTipoPrecio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_ID));

		if(this.descuentotipoprecioConstantesFunciones.mostraridDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.descuentotipoprecioConstantesFunciones.resaltaridDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activaridDescuentoTipoPrecio,iSizeTabla,this,true,"idDescuentoTipoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.descuentotipoprecioConstantesFunciones.resaltaridDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activaridDescuentoTipoPrecio,this,true,"idDescuentoTipoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.descuentotipoprecioConstantesFunciones.mostrarid_empresaDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_empresaDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_empresaDescuentoTipoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_empresaDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_empresaDescuentoTipoPrecio,false,"id_empresaDescuentoTipoPrecio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.descuentotipoprecioConstantesFunciones.mostrarid_sucursalDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_sucursalDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_sucursalDescuentoTipoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_sucursalDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_sucursalDescuentoTipoPrecio,false,"id_sucursalDescuentoTipoPrecio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO));

		if(this.descuentotipoprecioConstantesFunciones.mostrarid_usuarioDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_usuarioDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_usuarioDescuentoTipoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_usuarioDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_usuarioDescuentoTipoPrecio,false,"id_usuarioDescuentoTipoPrecio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA));

		if(this.descuentotipoprecioConstantesFunciones.mostrarid_bodegaDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_bodegaDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_bodegaDescuentoTipoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_bodegaDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_bodegaDescuentoTipoPrecio,true,"id_bodegaDescuentoTipoPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO));

		if(this.descuentotipoprecioConstantesFunciones.mostrarid_tipo_precioDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPrecioTableCell(this.tipopreciosForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_tipo_precioDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_tipo_precioDescuentoTipoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new TipoPrecioTableCell(this.tipopreciosForeignKey,this.descuentotipoprecioConstantesFunciones.resaltarid_tipo_precioDescuentoTipoPrecio,this,this.descuentotipoprecioConstantesFunciones.activarid_tipo_precioDescuentoTipoPrecio,true,"id_tipo_precioDescuentoTipoPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION));

		if(this.descuentotipoprecioConstantesFunciones.mostrardescripcionDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.descuentotipoprecioConstantesFunciones.resaltardescripcionDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activardescripcionDescuentoTipoPrecio,iSizeTabla,this,true,"descripcionDescuentoTipoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.descuentotipoprecioConstantesFunciones.resaltardescripcionDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activardescripcionDescuentoTipoPrecio,this,true,"descripcionDescuentoTipoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE));

		if(this.descuentotipoprecioConstantesFunciones.mostrarporcentajeDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.descuentotipoprecioConstantesFunciones.resaltarporcentajeDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activarporcentajeDescuentoTipoPrecio,iSizeTabla,this,true,"porcentajeDescuentoTipoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.descuentotipoprecioConstantesFunciones.resaltarporcentajeDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activarporcentajeDescuentoTipoPrecio,this,true,"porcentajeDescuentoTipoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO));

		if(this.descuentotipoprecioConstantesFunciones.mostrarfecha_inicioDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.descuentotipoprecioConstantesFunciones.resaltarfecha_inicioDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activarfecha_inicioDescuentoTipoPrecio,iSizeTabla,this,true,"fecha_inicioDescuentoTipoPrecio","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.descuentotipoprecioConstantesFunciones.resaltarfecha_inicioDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activarfecha_inicioDescuentoTipoPrecio,this,true,"fecha_inicioDescuentoTipoPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN));

		if(this.descuentotipoprecioConstantesFunciones.mostrarfecha_finDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.descuentotipoprecioConstantesFunciones.resaltarfecha_finDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activarfecha_finDescuentoTipoPrecio,iSizeTabla,this,true,"fecha_finDescuentoTipoPrecio","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.descuentotipoprecioConstantesFunciones.resaltarfecha_finDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activarfecha_finDescuentoTipoPrecio,this,true,"fecha_finDescuentoTipoPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.descuentotipoprecioConstantesFunciones.mostraresta_activoDescuentoTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.descuentotipoprecioConstantesFunciones.resaltaresta_activoDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activaresta_activoDescuentoTipoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.descuentotipoprecioConstantesFunciones.resaltaresta_activoDescuentoTipoPrecio,this.descuentotipoprecioConstantesFunciones.activaresta_activoDescuentoTipoPrecio,this,true,"esta_activoDescuentoTipoPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DescuentoTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDescuentoTipoPrecio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDescuentoTipoPrecio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDescuentoTipoPrecio.addColumn(tableColumn);
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
			
			this.jTableDatosDescuentoTipoPrecio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDescuentoTipoPrecio.moveColumn(this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDescuentoTipoPrecio.moveColumn(this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDescuentoTipoPrecio.moveColumn(this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDescuentoTipoPrecio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDescuentoTipoPrecio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDescuentoTipoPrecio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDescuentoTipoPrecio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDescuentoTipoPrecio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDescuentoTipoPrecio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=descuentotipoprecioLogic.getDescuentoTipoPrecios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=descuentotipoprecios.size()-1;
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
		//this.jTableDatosDescuentoTipoPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDescuentoTipoPrecio();
			
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
				
				//this.isEsNuevoDescuentoTipoPrecio=false;
					
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
				if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDescuentoTipoPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDescuentoTipoPrecio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.descuentotipoprecio.getsType().equals("DUPLICADO")
				   || this.descuentotipoprecio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDescuentoTipoPrecio=true;
				
				} else {
					this.isEsNuevoDescuentoTipoPrecio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
					if(this.descuentotipoprecio.getId()>=0 && !this.descuentotipoprecio.getIsNew()) {						
						this.isEsNuevoDescuentoTipoPrecio=false;
						
					} else {
						this.isEsNuevoDescuentoTipoPrecio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDescuentoTipoPrecio(esRelaciones);						
				
				this.seleccionarDescuentoTipoPrecio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.descuentotipoprecio.getId()<0) {
					this.isEsNuevoDescuentoTipoPrecio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDescuentoTipoPrecio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDescuentoTipoPrecio(evt,rowIndex);
				}	
				
				if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DescuentoTipoPrecio: " + this.dDif); 
					}
				}								
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDescuentoTipoPrecio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.descuentotipoprecio)) {
					if(this.descuentotipoprecio.getId()>0) {
						this.descuentotipoprecio.setIsDeleted(true);
						
						this.descuentotipopreciosEliminados.add(this.descuentotipoprecio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.descuentotipoprecioLogic.getDescuentoTipoPrecios().remove(this.descuentotipoprecio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecios.remove(this.descuentotipoprecio);				
					}
					
					
					((DescuentoTipoPrecioModel) this.jTableDatosDescuentoTipoPrecio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDescuentoTipoPrecio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDescuentoTipoPrecio) {
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDescuentoTipoPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDescuentoTipoPrecio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDescuentoTipoPrecio(this.descuentotipoprecio);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.descuentotipoprecioConstantesFunciones.cargarid_empresaDescuentoTipoPrecio || this.descuentotipoprecioConstantesFunciones.event_dependid_empresaDescuentoTipoPrecio) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.descuentotipoprecio.getid_empresa());
									//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(descuentotipoprecio.getEmpresa()!=null) {
							this.empresasForeignKey.add(descuentotipoprecio.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.descuentotipoprecio.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.descuentotipoprecioConstantesFunciones.cargarid_sucursalDescuentoTipoPrecio || this.descuentotipoprecioConstantesFunciones.event_dependid_sucursalDescuentoTipoPrecio) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.descuentotipoprecio.getid_sucursal());
									//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(descuentotipoprecio.getSucursal()!=null) {
							this.sucursalsForeignKey.add(descuentotipoprecio.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.descuentotipoprecio.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.descuentotipoprecioConstantesFunciones.cargarid_usuarioDescuentoTipoPrecio || this.descuentotipoprecioConstantesFunciones.event_dependid_usuarioDescuentoTipoPrecio) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.descuentotipoprecio.getid_usuario());
									//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(descuentotipoprecio.getUsuario()!=null) {
							this.usuariosForeignKey.add(descuentotipoprecio.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.descuentotipoprecio.getid_usuario(),false,"Formulario");

					//Bodega
					if(!this.descuentotipoprecioConstantesFunciones.cargarid_bodegaDescuentoTipoPrecio || this.descuentotipoprecioConstantesFunciones.event_dependid_bodegaDescuentoTipoPrecio) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.descuentotipoprecio.getid_bodega());
									//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(descuentotipoprecio.getBodega()!=null) {
							this.bodegasForeignKey.add(descuentotipoprecio.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.descuentotipoprecio.getid_bodega(),false,"Formulario");

					//TipoPrecio
					if(!this.descuentotipoprecioConstantesFunciones.cargarid_tipo_precioDescuentoTipoPrecio || this.descuentotipoprecioConstantesFunciones.event_dependid_tipo_precioDescuentoTipoPrecio) {
						//this.cargarCombosTipoPreciosForeignKeyLista(" where id="+this.descuentotipoprecio.getid_tipo_precio());
									//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
						this.tipopreciosForeignKey=new ArrayList<TipoPrecio>();

						if(descuentotipoprecio.getTipoPrecio()!=null) {
							this.tipopreciosForeignKey.add(descuentotipoprecio.getTipoPrecio());
						}

						this.addItemDefectoCombosForeignKeyTipoPrecio();
						this.cargarCombosFrameTipoPreciosForeignKey("Todos");
					}
					this.setActualTipoPrecioForeignKey(this.descuentotipoprecio.getid_tipo_precio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDescuentoTipoPrecio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDescuentoTipoPrecio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDescuentoTipoPrecio(descuentotipoprecio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDescuentoTipoPrecio(descuentotipoprecio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDescuentoTipoPrecio(descuentotipoprecio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDescuentoTipoPrecio(descuentotipoprecio);
	}
	
	public void setVariablesObjetoActualToFormularioDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.setText(descuentotipoprecio.getId().toString());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextAreadescripcionDescuentoTipoPrecio.setText(descuentotipoprecio.getdescripcion());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextFieldporcentajeDescuentoTipoPrecio.setText(descuentotipoprecio.getporcentaje().toString());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_inicioDescuentoTipoPrecio.setDate(descuentotipoprecio.getfecha_inicio());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_finDescuentoTipoPrecio.setDate(descuentotipoprecio.getfecha_fin());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxesta_activoDescuentoTipoPrecio.setSelected(descuentotipoprecio.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DescuentoTipoPrecio descuentotipoprecioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,descuentotipoprecioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DescuentoTipoPrecio descuentotipoprecioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				descuentotipoprecioLocal=this.descuentotipoprecio;
			} else {
				descuentotipoprecioLocal=this.descuentotipoprecioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(descuentotipoprecioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDescuentoTipoPrecio(descuentotipoprecioLocal,true);
					
					if(descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(descuentotipoprecioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(descuentotipoprecioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(descuentotipoprecio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(descuentotipoprecio);
	}
	
	public void setVariablesFormularioToObjetoActualDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(descuentotipoprecio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.getText()==null || this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.getText()=="" || this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.getText()=="Id") {
				this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.setText("0");
			}

			if(conColumnasBase) {descuentotipoprecio.setId(Long.parseLong(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoTipoPrecioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelIdDescuentoTipoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentotipoprecio.setdescripcion(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextAreadescripcionDescuentoTipoPrecio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabeldescripcionDescuentoTipoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentotipoprecio.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextFieldporcentajeDescuentoTipoPrecio.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelporcentajeDescuentoTipoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentotipoprecio.setfecha_inicio(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_inicioDescuentoTipoPrecio.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelfecha_inicioDescuentoTipoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentotipoprecio.setfecha_fin(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_finDescuentoTipoPrecio.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelfecha_finDescuentoTipoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentotipoprecio.setesta_activo(this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxesta_activoDescuentoTipoPrecio.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelesta_activoDescuentoTipoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecioBean,DescuentoTipoPrecio descuentotipoprecio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && descuentotipoprecioBean.getid_bodega()!=null && !descuentotipoprecioBean.getid_bodega().equals(-1L))) {descuentotipoprecio.setid_bodega(descuentotipoprecioBean.getid_bodega());}
			if(conDefault || (!conDefault && descuentotipoprecioBean.getid_tipo_precio()!=null && !descuentotipoprecioBean.getid_tipo_precio().equals(-1L))) {descuentotipoprecio.setid_tipo_precio(descuentotipoprecioBean.getid_tipo_precio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecioOrigen,DescuentoTipoPrecio descuentotipoprecio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && descuentotipoprecioOrigen.getId()!=null && !descuentotipoprecioOrigen.getId().equals(0L))) {descuentotipoprecio.setId(descuentotipoprecioOrigen.getId());}}
			if(conDefault || (!conDefault && descuentotipoprecioOrigen.getid_bodega()!=null && !descuentotipoprecioOrigen.getid_bodega().equals(-1L))) {descuentotipoprecio.setid_bodega(descuentotipoprecioOrigen.getid_bodega());}
			if(conDefault || (!conDefault && descuentotipoprecioOrigen.getid_tipo_precio()!=null && !descuentotipoprecioOrigen.getid_tipo_precio().equals(-1L))) {descuentotipoprecio.setid_tipo_precio(descuentotipoprecioOrigen.getid_tipo_precio());}
			if(conDefault || (!conDefault && descuentotipoprecioOrigen.getdescripcion()!=null && !descuentotipoprecioOrigen.getdescripcion().equals(""))) {descuentotipoprecio.setdescripcion(descuentotipoprecioOrigen.getdescripcion());}
			if(conDefault || (!conDefault && descuentotipoprecioOrigen.getporcentaje()!=null && !descuentotipoprecioOrigen.getporcentaje().equals(0.0))) {descuentotipoprecio.setporcentaje(descuentotipoprecioOrigen.getporcentaje());}
			if(conDefault || (!conDefault && descuentotipoprecioOrigen.getfecha_inicio()!=null && !descuentotipoprecioOrigen.getfecha_inicio().equals(new Date()))) {descuentotipoprecio.setfecha_inicio(descuentotipoprecioOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && descuentotipoprecioOrigen.getfecha_fin()!=null && !descuentotipoprecioOrigen.getfecha_fin().equals(new Date()))) {descuentotipoprecio.setfecha_fin(descuentotipoprecioOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && descuentotipoprecioOrigen.getesta_activo()!=null && !descuentotipoprecioOrigen.getesta_activo().equals(false))) {descuentotipoprecio.setesta_activo(descuentotipoprecioOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.setText(descuentotipoprecio.getId().toString());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextAreadescripcionDescuentoTipoPrecio.setText(descuentotipoprecio.getdescripcion());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextFieldporcentajeDescuentoTipoPrecio.setText(descuentotipoprecio.getporcentaje().toString());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_inicioDescuentoTipoPrecio.setDate(descuentotipoprecio.getfecha_inicio());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_finDescuentoTipoPrecio.setDate(descuentotipoprecio.getfecha_fin());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxesta_activoDescuentoTipoPrecio.setSelected(descuentotipoprecio.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDescuentoTipoPrecio(DescuentoTipoPrecioBean descuentotipoprecioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.setText(descuentotipoprecioBean.getId().toString());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextAreadescripcionDescuentoTipoPrecio.setText(descuentotipoprecioBean.getdescripcion());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextFieldporcentajeDescuentoTipoPrecio.setText(descuentotipoprecioBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_inicioDescuentoTipoPrecio.setDate(descuentotipoprecioBean.getfecha_inicio());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_finDescuentoTipoPrecio.setDate(descuentotipoprecioBean.getfecha_fin());
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxesta_activoDescuentoTipoPrecio.setSelected(descuentotipoprecioBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDescuentoTipoPrecio(DescuentoTipoPrecioParameterReturnGeneral descuentotipoprecioReturnGeneral,DescuentoTipoPrecioBean descuentotipoprecioBean,Boolean conDefault) throws Exception { 
		try {
			DescuentoTipoPrecio descuentotipoprecioLocal=new DescuentoTipoPrecio();
			
			descuentotipoprecioLocal=descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && descuentotipoprecioLocal.getId()!=null && !descuentotipoprecioLocal.getId().equals(0L))) {descuentotipoprecioBean.setId(descuentotipoprecioLocal.getId());}}
			if(conDefault || (!conDefault && descuentotipoprecioLocal.getid_bodega()!=null && !descuentotipoprecioLocal.getid_bodega().equals(-1L))) {descuentotipoprecioBean.setid_bodega(descuentotipoprecioLocal.getid_bodega());}
			if(conDefault || (!conDefault && descuentotipoprecioLocal.getid_tipo_precio()!=null && !descuentotipoprecioLocal.getid_tipo_precio().equals(-1L))) {descuentotipoprecioBean.setid_tipo_precio(descuentotipoprecioLocal.getid_tipo_precio());}
			if(conDefault || (!conDefault && descuentotipoprecioLocal.getdescripcion()!=null && !descuentotipoprecioLocal.getdescripcion().equals(""))) {descuentotipoprecioBean.setdescripcion(descuentotipoprecioLocal.getdescripcion());}
			if(conDefault || (!conDefault && descuentotipoprecioLocal.getporcentaje()!=null && !descuentotipoprecioLocal.getporcentaje().equals(0.0))) {descuentotipoprecioBean.setporcentaje(descuentotipoprecioLocal.getporcentaje());}
			if(conDefault || (!conDefault && descuentotipoprecioLocal.getfecha_inicio()!=null && !descuentotipoprecioLocal.getfecha_inicio().equals(new Date()))) {descuentotipoprecioBean.setfecha_inicio(descuentotipoprecioLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && descuentotipoprecioLocal.getfecha_fin()!=null && !descuentotipoprecioLocal.getfecha_fin().equals(new Date()))) {descuentotipoprecioBean.setfecha_fin(descuentotipoprecioLocal.getfecha_fin());}
			if(conDefault || (!conDefault && descuentotipoprecioLocal.getesta_activo()!=null && !descuentotipoprecioLocal.getesta_activo().equals(false))) {descuentotipoprecioBean.setesta_activo(descuentotipoprecioLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDescuentoTipoPrecioGenerico(Long idDescuentoTipoPrecioSeleccionado,JComboBox jComboBoxDescuentoTipoPrecio,List<DescuentoTipoPrecio> descuentotipopreciosLocal)throws Exception {
		try {
			DescuentoTipoPrecio  descuentotipoprecioTemp=null;

			for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipopreciosLocal) {
				if(descuentotipoprecioAux.getId()!=null && descuentotipoprecioAux.getId().equals(idDescuentoTipoPrecioSeleccionado)) {
					descuentotipoprecioTemp=descuentotipoprecioAux;
					break;
				}
			}

			jComboBoxDescuentoTipoPrecio.setSelectedItem(descuentotipoprecioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDescuentoTipoPrecioGenerico(JComboBox jComboBoxDescuentoTipoPrecio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDescuentoTipoPrecio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDescuentoTipoPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDescuentoTipoPrecio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDescuentoTipoPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			descuentotipoprecio=(DescuentoTipoPrecio) descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			descuentotipoprecio =(DescuentoTipoPrecio) descuentotipoprecios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!descuentotipoprecio.getIsNew() && !descuentotipoprecio.getIsChanged() && !descuentotipoprecio.getIsDeleted()) {
				sDescripcion=descuentotipoprecio.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=descuentotipoprecio.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!descuentotipoprecio.getIsNew() && !descuentotipoprecio.getIsChanged() && !descuentotipoprecio.getIsDeleted()) {
				sDescripcion=descuentotipoprecio.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=descuentotipoprecio.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!descuentotipoprecio.getIsNew() && !descuentotipoprecio.getIsChanged() && !descuentotipoprecio.getIsDeleted()) {
				sDescripcion=descuentotipoprecio.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=descuentotipoprecio.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!descuentotipoprecio.getIsNew() && !descuentotipoprecio.getIsChanged() && !descuentotipoprecio.getIsDeleted()) {
				sDescripcion=descuentotipoprecio.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=descuentotipoprecio.getbodega_descripcion();
			}
		}

		if(sTipo.equals("TipoPrecio")) {
			//sDescripcion=this.getActualTipoPrecioForeignKeyDescripcion((Long)value);
			if(!descuentotipoprecio.getIsNew() && !descuentotipoprecio.getIsChanged() && !descuentotipoprecio.getIsDeleted()) {
				sDescripcion=descuentotipoprecio.gettipoprecio_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPrecioForeignKeyDescripcion((Long)value);
				sDescripcion=descuentotipoprecio.gettipoprecio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DescuentoTipoPrecio descuentotipoprecioRow=new DescuentoTipoPrecio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			descuentotipoprecioRow=(DescuentoTipoPrecio) descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			descuentotipoprecioRow=(DescuentoTipoPrecio) descuentotipoprecios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDescuentoTipoPrecio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoDescuentoTipoPrecio && this.isPermisoNuevoDescuentoTipoPrecio));			
			this.jButtonDuplicarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaDuplicarDescuentoTipoPrecio && this.isPermisoDuplicarDescuentoTipoPrecio));			
			this.jButtonCopiarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaCopiarDescuentoTipoPrecio && this.isPermisoCopiarDescuentoTipoPrecio));
			this.jButtonVerFormDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaVerFormDescuentoTipoPrecio && this.isPermisoVerFormDescuentoTipoPrecio));
			
			this.jButtonAbrirOrderByDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenDescuentoTipoPrecio && this.isPermisoOrdenDescuentoTipoPrecio));			
			
			this.jButtonNuevoRelacionesDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio && this.isPermisoNuevoDescuentoTipoPrecio));			
			this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoDescuentoTipoPrecio && this.isPermisoNuevoDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonModificarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaModificarDescuentoTipoPrecio && this.isPermisoActualizarDescuentoTipoPrecio));	
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaActualizarDescuentoTipoPrecio && this.isPermisoActualizarDescuentoTipoPrecio));	
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaEliminarDescuentoTipoPrecio && this.isPermisoEliminarDescuentoTipoPrecio));
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarDescuentoTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarDescuentoTipoPrecio);							
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));			
			
			}
						
			this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoDescuentoTipoPrecio && this.isPermisoNuevoDescuentoTipoPrecio));						
			this.jButtonDuplicarToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaDuplicarDescuentoTipoPrecio && this.isPermisoDuplicarDescuentoTipoPrecio));						
			this.jButtonCopiarToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaCopiarDescuentoTipoPrecio && this.isPermisoCopiarDescuentoTipoPrecio));			
			this.jButtonVerFormToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaVerFormDescuentoTipoPrecio && this.isPermisoVerFormDescuentoTipoPrecio));			
			this.jButtonAbrirOrderByToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenDescuentoTipoPrecio && this.isPermisoOrdenDescuentoTipoPrecio));
			this.jButtonNuevoRelacionesToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio && this.isPermisoNuevoDescuentoTipoPrecio));			
			this.jButtonNuevoGuardarCambiosToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoDescuentoTipoPrecio && this.isPermisoNuevoDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));			
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonModificarToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaModificarDescuentoTipoPrecio && this.isPermisoActualizarDescuentoTipoPrecio));	
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaActualizarDescuentoTipoPrecio  && this.isPermisoActualizarDescuentoTipoPrecio));	
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaEliminarDescuentoTipoPrecio && this.isPermisoEliminarDescuentoTipoPrecio));
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarToolBarDescuentoTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarDescuentoTipoPrecio);				
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoDescuentoTipoPrecio && this.isPermisoNuevoDescuentoTipoPrecio));			
			this.jMenuItemDuplicarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaDuplicarDescuentoTipoPrecio && this.isPermisoDuplicarDescuentoTipoPrecio));			
			this.jMenuItemCopiarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaCopiarDescuentoTipoPrecio && this.isPermisoCopiarDescuentoTipoPrecio));			
			this.jMenuItemVerFormDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaVerFormDescuentoTipoPrecio && this.isPermisoVerFormDescuentoTipoPrecio));			
			this.jMenuItemAbrirOrderByDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenDescuentoTipoPrecio && this.isPermisoOrdenDescuentoTipoPrecio));			
			//this.jMenuItemMostrarOcultarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenDescuentoTipoPrecio && this.isPermisoOrdenDescuentoTipoPrecio));
			this.jMenuItemDetalleAbrirOrderByDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenDescuentoTipoPrecio && this.isPermisoOrdenDescuentoTipoPrecio));			
			//this.jMenuItemDetalleMostrarOcultarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenDescuentoTipoPrecio && this.isPermisoOrdenDescuentoTipoPrecio));			
			this.jMenuItemNuevoRelacionesDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio && this.isPermisoNuevoDescuentoTipoPrecio));			
			this.jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoDescuentoTipoPrecio && this.isPermisoNuevoDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));									
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemModificarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaModificarDescuentoTipoPrecio && this.isPermisoActualizarDescuentoTipoPrecio));	
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemActualizarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaActualizarDescuentoTipoPrecio && this.isPermisoActualizarDescuentoTipoPrecio));	
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemEliminarDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaEliminarDescuentoTipoPrecio && this.isPermisoEliminarDescuentoTipoPrecio));
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemCancelarDescuentoTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarDescuentoTipoPrecio);				
			}
			
			this.jMenuItemGuardarCambiosDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));						
			this.jMenuItemGuardarCambiosTablaDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=this.jButtonNuevoDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaDuplicarDescuentoTipoPrecio=this.jButtonDuplicarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaCopiarDescuentoTipoPrecio=this.jButtonCopiarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaVerFormDescuentoTipoPrecio=this.jButtonVerFormDescuentoTipoPrecio.isVisible();
			
			this.isVisibilidadCeldaOrdenDescuentoTipoPrecio=this.jButtonAbrirOrderByDescuentoTipoPrecio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=this.jButtonNuevoRelacionesDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=this.jButtonModificarDescuentoTipoPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosDescuentoTipoPrecio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=this.jButtonNuevoToolBarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=this.jButtonNuevoRelacionesToolBarDescuentoTipoPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonModificarToolBarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarToolBarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarToolBarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarToolBarDescuentoTipoPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=this.jButtonGuardarCambiosToolBarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=this.jButtonGuardarCambiosTablaToolBarDescuentoTipoPrecio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=this.jMenuItemNuevoDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=this.jMenuItemNuevoRelacionesDescuentoTipoPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemModificarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemActualizarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemEliminarDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemCancelarDescuentoTipoPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=this.jMenuItemGuardarCambiosDescuentoTipoPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=this.jMenuItemGuardarCambiosTablaDescuentoTipoPrecio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDescuentoTipoPrecio(Boolean esInicializar) {
		if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
				//if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDescuentoTipoPrecio();
			}
			
			this.inicializarActualizarBindingBotonesManualDescuentoTipoPrecio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDescuentoTipoPrecio() {
		this.jButtonNuevoDescuentoTipoPrecio.setVisible(this.isPermisoNuevoDescuentoTipoPrecio);			
		this.jButtonDuplicarDescuentoTipoPrecio.setVisible(this.isPermisoDuplicarDescuentoTipoPrecio);			
		this.jButtonCopiarDescuentoTipoPrecio.setVisible(this.isPermisoCopiarDescuentoTipoPrecio);			
		this.jButtonVerFormDescuentoTipoPrecio.setVisible(this.isPermisoVerFormDescuentoTipoPrecio);			
		
		this.jButtonAbrirOrderByDescuentoTipoPrecio.setVisible(this.isPermisoOrdenDescuentoTipoPrecio);					
		
		this.jButtonNuevoRelacionesDescuentoTipoPrecio.setVisible(this.isPermisoNuevoDescuentoTipoPrecio);			
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonModificarDescuentoTipoPrecio.setVisible(this.isPermisoActualizarDescuentoTipoPrecio);	
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarDescuentoTipoPrecio.setVisible(this.isPermisoActualizarDescuentoTipoPrecio);	
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarDescuentoTipoPrecio.setVisible(this.isPermisoEliminarDescuentoTipoPrecio);
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarDescuentoTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarDescuentoTipoPrecio);						
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosDescuentoTipoPrecio.setVisible(this.isPermisoGuardarCambiosDescuentoTipoPrecio);							
		}
		
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.setVisible(this.isPermisoActualizarDescuentoTipoPrecio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDescuentoTipoPrecio() {
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonModificarDescuentoTipoPrecio.setVisible(this.isPermisoActualizarDescuentoTipoPrecio);	
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarDescuentoTipoPrecio.setVisible(this.isPermisoActualizarDescuentoTipoPrecio);	
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarDescuentoTipoPrecio.setVisible(this.isPermisoEliminarDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarDescuentoTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarDescuentoTipoPrecio);							
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosDescuentoTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarDescuentoTipoPrecio && this.isPermisoGuardarCambiosDescuentoTipoPrecio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDescuentoTipoPrecio() {
		if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDescuentoTipoPrecio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDescuentoTipoPrecio() {
	}
	
	public void jTableDatosDescuentoTipoPrecioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDescuentoTipoPrecio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.descuentotipoprecio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDescuentoTipoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDescuentoTipoPrecio(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDescuentoTipoPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.descuentotipoprecioLogic.getConnexion());

				if(this.descuentotipoprecio.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.descuentotipoprecio.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDescuentoTipoPrecio=(TitledBorder)this.jScrollPanelDatosDescuentoTipoPrecio.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDescuentoTipoPrecio.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.descuentotipoprecio.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDescuentoTipoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDescuentoTipoPrecio(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDescuentoTipoPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.descuentotipoprecioLogic.getConnexion());

				if(this.descuentotipoprecio.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.descuentotipoprecio.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDescuentoTipoPrecio=(TitledBorder)this.jScrollPanelDatosDescuentoTipoPrecio.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDescuentoTipoPrecio.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.descuentotipoprecio.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioDescuentoTipoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebDescuentoTipoPrecio(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDescuentoTipoPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.descuentotipoprecioLogic.getConnexion());

				if(this.descuentotipoprecio.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.descuentotipoprecio.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDescuentoTipoPrecio=(TitledBorder)this.jScrollPanelDatosDescuentoTipoPrecio.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderDescuentoTipoPrecio.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.descuentotipoprecio.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDescuentoTipoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDescuentoTipoPrecio(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDescuentoTipoPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.descuentotipoprecioLogic.getConnexion());

				if(this.descuentotipoprecio.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.descuentotipoprecio.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDescuentoTipoPrecio=(TitledBorder)this.jScrollPanelDatosDescuentoTipoPrecio.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDescuentoTipoPrecio.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.descuentotipoprecio.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_precioDescuentoTipoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprecio=true;

			idTienePermisotipoprecio=this.tienePermisosUsuarioEnPaginaWebDescuentoTipoPrecio(TipoPrecioConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprecio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDescuentoTipoPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDescuentoTipoPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);

				this.tipoprecioBeanSwingJInternalFrame=new TipoPrecioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprecioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprecioBeanSwingJInternalFrame.getTipoPrecioLogic().setConnexion(this.descuentotipoprecioLogic.getConnexion());

				if(this.descuentotipoprecio.getid_tipo_precio()!=null) {
					this.tipoprecioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprecioBeanSwingJInternalFrame.setIdActual(this.descuentotipoprecio.getid_tipo_precio());
					this.tipoprecioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprecioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprecioBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPrecio();
				}

				JInternalFrameBase jinternalFrame =this.tipoprecioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDescuentoTipoPrecio=(TitledBorder)this.jScrollPanelDatosDescuentoTipoPrecio.getBorder();
				TitledBorder titledBordertipoprecio=(TitledBorder)this.tipoprecioBeanSwingJInternalFrame.jScrollPanelDatosTipoPrecio.getBorder();

				titledBordertipoprecio.setTitle(titledBorderDescuentoTipoPrecio.getTitle() + " -> Tipo Precio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_precioDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getid_tipo_precio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_precio = "+this.descuentotipoprecio.getid_tipo_precio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.descuentotipoprecio.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.descuentotipoprecio.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.descuentotipoprecio.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.descuentotipoprecio.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoDescuentoTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.getdescuentotipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentotipoprecio==null) {
						this.descuentotipoprecio = new DescuentoTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);
				}

				if(this.descuentotipoprecio.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.descuentotipoprecio.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);

			this.getDescuentoTipoPreciosFK_IdBodega();

			this.inicializarActualizarBindingDescuentoTipoPrecio(false);

			//if(DescuentoTipoPrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);

			this.getDescuentoTipoPreciosFK_IdEmpresa();

			this.inicializarActualizarBindingDescuentoTipoPrecio(false);

			//if(DescuentoTipoPrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);

			this.getDescuentoTipoPreciosFK_IdSucursal();

			this.inicializarActualizarBindingDescuentoTipoPrecio(false);

			//if(DescuentoTipoPrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPrecioDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);

			this.getDescuentoTipoPreciosFK_IdTipoPrecio();

			this.inicializarActualizarBindingDescuentoTipoPrecio(false);

			//if(DescuentoTipoPrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioDescuentoTipoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);

			this.getDescuentoTipoPreciosFK_IdUsuario();

			this.inicializarActualizarBindingDescuentoTipoPrecio(false);

			//if(DescuentoTipoPrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentotipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDescuentoTipoPrecio() {
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.setVisible(false);	    			
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.dispose();
			this.jInternalFrameDetalleFormDescuentoTipoPrecio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio!=null) {
			this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.dispose();
			this.jInternalFrameReporteDinamicoDescuentoTipoPrecio=null;
		}
		
		if(this.jInternalFrameImportacionDescuentoTipoPrecio!=null) {
			this.jInternalFrameImportacionDescuentoTipoPrecio.setVisible(false);	    			
			this.jInternalFrameImportacionDescuentoTipoPrecio.dispose();
			this.jInternalFrameImportacionDescuentoTipoPrecio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDescuentoTipoPrecio();
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
			
			if(sTipo.equals("NuevoDescuentoTipoPrecio")) {
				jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDescuentoTipoPrecio")) {
				jButtonDuplicarDescuentoTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDescuentoTipoPrecio")) {
				jButtonCopiarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormDescuentoTipoPrecio")) {
				jButtonVerFormDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDescuentoTipoPrecio")) {
				jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDescuentoTipoPrecio")) {
				jButtonDuplicarDescuentoTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDescuentoTipoPrecio")) {
				jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDescuentoTipoPrecio")) {
				jButtonDuplicarDescuentoTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDescuentoTipoPrecio")) {
				jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDescuentoTipoPrecio")) {
				jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDescuentoTipoPrecio")) {
				jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDescuentoTipoPrecio")) {
				jButtonModificarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDescuentoTipoPrecio")) {
				jButtonModificarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDescuentoTipoPrecio")) {
				jButtonModificarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDescuentoTipoPrecio")) {
				jButtonActualizarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDescuentoTipoPrecio")) {
				jButtonActualizarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDescuentoTipoPrecio")) {
				jButtonActualizarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarDescuentoTipoPrecio")) {
				jButtonEliminarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDescuentoTipoPrecio")) {
				jButtonEliminarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDescuentoTipoPrecio")) {
				jButtonEliminarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarDescuentoTipoPrecio")) {
				jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDescuentoTipoPrecio")) {
				jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDescuentoTipoPrecio")) {
				jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarDescuentoTipoPrecio")) {
				jButtonCerrarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDescuentoTipoPrecio")) {
				jButtonCerrarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDescuentoTipoPrecio")) {
				jButtonCerrarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDescuentoTipoPrecio")) {
				jButtonMostrarOcultarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDescuentoTipoPrecio")) {
				jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDescuentoTipoPrecio")) {
				jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDescuentoTipoPrecio")) {
				jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDescuentoTipoPrecio")) {
				jButtonCopiarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDescuentoTipoPrecio")) {
				jButtonVerFormDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDescuentoTipoPrecio")) {
				jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDescuentoTipoPrecio")) {
				jButtonCopiarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDescuentoTipoPrecio")) {
				jButtonVerFormDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDescuentoTipoPrecio")) {
				jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDescuentoTipoPrecio")) {
				jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDescuentoTipoPrecio")) {
				jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDescuentoTipoPrecio")) {
				jButtonRecargarInformacionDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDescuentoTipoPrecio")) {
				jButtonRecargarInformacionDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDescuentoTipoPrecio")) {
				jButtonRecargarInformacionDescuentoTipoPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDescuentoTipoPrecio")) {
				jButtonAnterioresDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDescuentoTipoPrecio")) {
				jButtonAnterioresDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDescuentoTipoPrecio")) {
				jButtonAnterioresDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDescuentoTipoPrecio")) {
				jButtonSiguientesDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDescuentoTipoPrecio")) {
				jButtonSiguientesDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDescuentoTipoPrecio")) {
				jButtonSiguientesDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDescuentoTipoPrecio") || sTipo.equals("MenuItemDetalleAbrirOrderByDescuentoTipoPrecio")) {
				jButtonAbrirOrderByDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDescuentoTipoPrecio") || sTipo.equals("MenuItemDetalleMostrarOcultarDescuentoTipoPrecio")) {
				jButtonMostrarOcultarDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDescuentoTipoPrecio")) {
				jButtonNuevoGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDescuentoTipoPrecio")) {
				jButtonNuevoGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDescuentoTipoPrecio")) {
				jButtonNuevoGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDescuentoTipoPrecio")) {
				jButtonCerrarReporteDinamicoDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDescuentoTipoPrecio")) {
				jButtonGenerarReporteDinamicoDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDescuentoTipoPrecio")) {
				
				jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDescuentoTipoPrecio")) {
				jButtonCerrarImportacionDescuentoTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDescuentoTipoPrecio")) {
				
				jButtonGenerarImportacionDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDescuentoTipoPrecio")) {
				
				jButtonAbrirImportacionDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDescuentoTipoPrecio")) {
				jComboBoxTiposAccionesDescuentoTipoPrecioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDescuentoTipoPrecio")) {
				jComboBoxTiposRelacionesDescuentoTipoPrecioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDescuentoTipoPrecio")) {
				jComboBoxTiposAccionesDescuentoTipoPrecioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDescuentoTipoPrecio")) {
				
				jComboBoxTiposSeleccionarDescuentoTipoPrecioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDescuentoTipoPrecio")) {
				jTextFieldValorCampoGeneralDescuentoTipoPrecioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDescuentoTipoPrecio")) {
				jButtonAbrirOrderByDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDescuentoTipoPrecio")) {
				jButtonAbrirOrderByDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDescuentoTipoPrecio")) {
				jButtonCerrarOrderByDescuentoTipoPrecioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDescuentoTipoPrecioBusqueda")) {
				this.jButtonidDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDescuentoTipoPrecioUpdate")) {
				this.jButtonid_empresaDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_empresaDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDescuentoTipoPrecioUpdate")) {
				this.jButtonid_sucursalDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_sucursalDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDescuentoTipoPrecioUpdate")) {
				this.jButtonid_usuarioDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_usuarioDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDescuentoTipoPrecioUpdate")) {
				this.jButtonid_bodegaDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_bodegaDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_precioDescuentoTipoPrecioUpdate")) {
				this.jButtonid_tipo_precioDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_precioDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_tipo_precioDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDescuentoTipoPrecioBusqueda")) {
				this.jButtondescripcionDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDescuentoTipoPrecioBusqueda")) {
				this.jButtonporcentajeDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioDescuentoTipoPrecioBusqueda")) {
				this.jButtonfecha_inicioDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finDescuentoTipoPrecioBusqueda")) {
				this.jButtonfecha_finDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDescuentoTipoPrecioBusqueda")) {
				this.jButtonesta_activoDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdBodegaDescuentoTipoPrecio")) {
				this.jButtonFK_IdBodegaDescuentoTipoPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoPrecioDescuentoTipoPrecio")) {
				this.jButtonFK_IdTipoPrecioDescuentoTipoPrecioActionPerformed(evt);
			}
			
			;
			
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDescuentoTipoPrecio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				


				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DescuentoTipoPrecio descuentotipoprecioLocal=null;
			
			if(!this.getEsControlTabla()) {
				descuentotipoprecioLocal=this.descuentotipoprecio;
			} else {
				descuentotipoprecioLocal=this.descuentotipoprecioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
							
				
				


				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
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
			
			


			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoTipoPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
								
						
				


				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
								
				
				


				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoTipoPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
							
				
				


				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
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
			
			


			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
								
				
				


				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoTipoPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoTipoPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDescuentoTipoPrecio")) {
					jCheckBoxSeleccionarTodosDescuentoTipoPrecioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDescuentoTipoPrecio")) {
					jCheckBoxSeleccionadosDescuentoTipoPrecioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDescuentoTipoPrecio")) {
					
				}
				
				


				
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
												
				
				


				
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoTipoPrecioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
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
			
			


			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentotipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentotipoprecio);
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
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
				
				


				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoTipoPrecio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentotipoprecioAnterior =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDescuentoTipoPrecio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDescuentoTipoPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDescuentoTipoPrecio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.descuentotipoprecio =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.descuentotipoprecio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDescuentoTipoPrecio")) {
				
				}
				
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDescuentoTipoPrecio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDescuentoTipoPrecio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDescuentoTipoPrecio")) {
			
			}
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDescuentoTipoPrecio();
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
			if(sTipo.equals("NuevoDescuentoTipoPrecio")) {
				jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDescuentoTipoPrecio")) {
				jButtonDuplicarDescuentoTipoPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDescuentoTipoPrecio")) {
				jButtonCopiarDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDescuentoTipoPrecio")) {
				jButtonVerFormDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDescuentoTipoPrecio")) {
				jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDescuentoTipoPrecio")) {
				jButtonModificarDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDescuentoTipoPrecio")) {
				jButtonActualizarDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDescuentoTipoPrecio")) {
				jButtonEliminarDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDescuentoTipoPrecio")) {
				jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDescuentoTipoPrecio")) {
				jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDescuentoTipoPrecio")) {
				jButtonCerrarDescuentoTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDescuentoTipoPrecio")) {
				jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDescuentoTipoPrecio")) {
				jButtonNuevoGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDescuentoTipoPrecio")) {
				jButtonAbrirOrderByDescuentoTipoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDescuentoTipoPrecio")) {
				jButtonRecargarInformacionDescuentoTipoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDescuentoTipoPrecio")) {
				jButtonAnterioresDescuentoTipoPrecioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDescuentoTipoPrecio")) {
				jButtonSiguientesDescuentoTipoPrecioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDescuentoTipoPrecioBusqueda")) {
				this.jButtonidDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDescuentoTipoPrecioUpdate")) {
				this.jButtonid_empresaDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_empresaDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDescuentoTipoPrecioUpdate")) {
				this.jButtonid_sucursalDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_sucursalDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDescuentoTipoPrecioUpdate")) {
				this.jButtonid_usuarioDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_usuarioDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDescuentoTipoPrecioUpdate")) {
				this.jButtonid_bodegaDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_bodegaDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_precioDescuentoTipoPrecioUpdate")) {
				this.jButtonid_tipo_precioDescuentoTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_precioDescuentoTipoPrecioBusqueda")) {
				this.jButtonid_tipo_precioDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDescuentoTipoPrecioBusqueda")) {
				this.jButtondescripcionDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDescuentoTipoPrecioBusqueda")) {
				this.jButtonporcentajeDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioDescuentoTipoPrecioBusqueda")) {
				this.jButtonfecha_inicioDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finDescuentoTipoPrecioBusqueda")) {
				this.jButtonfecha_finDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDescuentoTipoPrecioBusqueda")) {
				this.jButtonesta_activoDescuentoTipoPrecioBusquedaActionPerformed(evt);
			}
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDescuentoTipoPrecio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDescuentoTipoPrecio")) {
				closingInternalFrameDescuentoTipoPrecio();
				
			} else if(sTipo.equals("jButtonCancelarDescuentoTipoPrecio")) {
				JInternalFrameBase jInternalFrameDetalleFormDescuentoTipoPrecio = (JInternalFrameBase)evt.getSource();
	            	
	            DescuentoTipoPrecioBeanSwingJInternalFrame jInternalFrameParent=(DescuentoTipoPrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormDescuentoTipoPrecio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDescuentoTipoPrecioActionPerformed(null);
			}
			
			DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.descuentotipoprecio,new Object(),this.descuentotipoprecioParameterGeneral,this.descuentotipoprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDescuentoTipoPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDescuentoTipoPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDescuentoTipoPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.descuentotipoprecio)) {
			if(!esControlTabla) {
				if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);			
				}
				
				if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.descuentotipoprecioReturnGeneral=descuentotipoprecioLogic.procesarEventosDescuentoTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.descuentotipoprecioLogic.getDescuentoTipoPrecios(),this.descuentotipoprecio,this.descuentotipoprecioParameterGeneral,this.isEsNuevoDescuentoTipoPrecio,classes);//this.descuentotipoprecioLogic.getDescuentoTipoPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDescuentoTipoPrecio(this.descuentotipoprecioReturnGeneral,this.descuentotipoprecioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDescuentoTipoPrecio(classes,this.descuentotipoprecioReturnGeneral,this.descuentotipoprecioBean,false);
					}
						
					if(this.descuentotipoprecioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDescuentoTipoPrecio(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDescuentoTipoPrecio(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio());	
					}
						
					if(this.descuentotipoprecioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDescuentoTipoPrecio(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio(),classes);//this.descuentotipoprecioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDescuentoTipoPrecio(this.descuentotipoprecio,classes);//this.descuentotipoprecioBean);									
				}
			
				if(DescuentoTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDescuentoTipoPrecio(this.descuentotipoprecio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoTipoPrecio(this.descuentotipoprecio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.descuentotipoprecioAnterior!=null) {
						this.descuentotipoprecio=this.descuentotipoprecioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.descuentotipoprecioReturnGeneral=descuentotipoprecioLogic.procesarEventosDescuentoTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.descuentotipoprecioLogic.getDescuentoTipoPrecios(),this.descuentotipoprecio,this.descuentotipoprecioParameterGeneral,this.isEsNuevoDescuentoTipoPrecio,classes);//this.descuentotipoprecioLogic.getDescuentoTipoPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.descuentotipoprecioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio(),descuentotipoprecioLogic.getDescuentoTipoPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio(),this.descuentotipoprecios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDescuentoTipoPrecio.repaint();
				
				//((AbstractTableModel) this.jTableDatosDescuentoTipoPrecio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDescuentoTipoPrecio();
			}
		}
	}
	
	public void actualizarVisualTableDatosDescuentoTipoPrecio() throws Exception {
		
		DescuentoTipoPrecioModel descuentotipoprecioModel=(DescuentoTipoPrecioModel)this.jTableDatosDescuentoTipoPrecio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			descuentotipoprecioModel.descuentotipoprecios=this.descuentotipoprecioLogic.getDescuentoTipoPrecios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			descuentotipoprecioModel.descuentotipoprecios=this.descuentotipoprecios;
		}
		
		
		((DescuentoTipoPrecioModel) this.jTableDatosDescuentoTipoPrecio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDescuentoTipoPrecio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdescuentotipoprecioAnterior(),this.descuentotipoprecioLogic.getDescuentoTipoPrecios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdescuentotipoprecioAnterior(),this.descuentotipoprecios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDescuentoTipoPrecio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
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
										
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.descuentotipoprecio,new Object(),generalEntityParameterGeneral,this.descuentotipoprecioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DescuentoTipoPrecioConstantesFunciones.getClassesRelationshipsOfDescuentoTipoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DescuentoTipoPrecioConstantesFunciones.getClassesRelationshipsFromStringsOfDescuentoTipoPrecio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDescuentoTipoPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.descuentotipoprecio,new Object(),generalEntityParameterGeneral,this.descuentotipoprecioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDescuentoTipoPrecio(DescuentoTipoPrecioBean descuentotipoprecioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDescuentoTipoPrecio(ArrayList<Classe> classes,DescuentoTipoPrecioReturnGeneral descuentotipoprecioReturnGeneral,DescuentoTipoPrecioBean descuentotipoprecioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.descuentotipoprecio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio = new DescuentoTipoPrecioDetalleFormJInternalFrame(jDesktopPane,this.descuentotipoprecioSessionBean.getConGuardarRelaciones(),this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.setVisible(false);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.setSelected(false);						
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.descuentotipoprecioLogic=this.descuentotipoprecioLogic;
		
		this.cargarCombosFrameForeignKeyDescuentoTipoPrecio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDescuentoTipoPrecio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDescuentoTipoPrecio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDescuentoTipoPrecio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDescuentoTipoPrecio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDescuentoTipoPrecio"));
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonModificarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"ModificarDescuentoTipoPrecio"));

		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonModificarToolBarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarDescuentoTipoPrecio"));
					
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemModificarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarDescuentoTipoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"ActualizarDescuentoTipoPrecio"));
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarToolBarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDescuentoTipoPrecio"));
						
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemActualizarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDescuentoTipoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"EliminarDescuentoTipoPrecio"));
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarDescuentoTipoPrecio"));
								
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemEliminarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDescuentoTipoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"CancelarDescuentoTipoPrecio"));
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarDescuentoTipoPrecio"));
					
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemCancelarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDescuentoTipoPrecio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemDetalleCerrarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDescuentoTipoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDescuentoTipoPrecio"));
		
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDescuentoTipoPrecio"));
		
		
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDescuentoTipoPrecio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonidDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_empresaDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_empresaDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_sucursalDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_sucursalDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_usuarioDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_usuarioDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_bodegaDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_bodegaDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_tipo_precioDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtondescripcionDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonporcentajeDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonfecha_finDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonesta_activoDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDescuentoTipoPrecioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTabbedPaneRelacionesDescuentoTipoPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDescuentoTipoPrecio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDescuentoTipoPrecio"));
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDescuentoTipoPrecio"));
		}
		
		this.jTableDatosDescuentoTipoPrecio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDescuentoTipoPrecio"));
		
		this.jTableDatosDescuentoTipoPrecio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDescuentoTipoPrecio"));
		
		this.jButtonNuevoDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"NuevoDescuentoTipoPrecio"));
		
		this.jButtonDuplicarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"DuplicarDescuentoTipoPrecio"));
		
		this.jButtonCopiarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"CopiarDescuentoTipoPrecio"));
		
		this.jButtonVerFormDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"VerFormDescuentoTipoPrecio"));
		
		
		this.jButtonNuevoToolBarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"NuevoToolBarDescuentoTipoPrecio"));
			
		this.jButtonDuplicarToolBarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDescuentoTipoPrecio"));
			
		this.jMenuItemNuevoDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDescuentoTipoPrecio"));
			
		this.jMenuItemDuplicarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDescuentoTipoPrecio"));		
		
		
		this.jButtonNuevoRelacionesDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDescuentoTipoPrecio"));
		
		
		this.jButtonNuevoRelacionesToolBarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDescuentoTipoPrecio"));
			
		this.jMenuItemNuevoRelacionesDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDescuentoTipoPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonModificarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"ModificarDescuentoTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonModificarToolBarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarDescuentoTipoPrecio"));
			
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemModificarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarDescuentoTipoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"ActualizarDescuentoTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonActualizarToolBarDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDescuentoTipoPrecio"));
				
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemActualizarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDescuentoTipoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"EliminarDescuentoTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonEliminarToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarDescuentoTipoPrecio"));
						
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemEliminarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDescuentoTipoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"CancelarDescuentoTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonCancelarToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarDescuentoTipoPrecio"));
			
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemCancelarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDescuentoTipoPrecio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDescuentoTipoPrecio"));		
		
		
		this.jButtonCerrarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"CerrarDescuentoTipoPrecio"));
		
		
		this.jButtonCerrarToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"CerrarToolBarDescuentoTipoPrecio"));
			
		this.jMenuItemCerrarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDescuentoTipoPrecio"));
			
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jMenuItemDetalleCerrarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDescuentoTipoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosDescuentoTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDescuentoTipoPrecio"));
		}
		
		this.jButtonCopiarToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"CopiarToolBarDescuentoTipoPrecio"));
			
		this.jButtonVerFormToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"VerFormToolBarDescuentoTipoPrecio"));
		
		this.jMenuItemGuardarCambiosDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDescuentoTipoPrecio"));
			
		this.jMenuItemCopiarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDescuentoTipoPrecio"));		
		
		this.jMenuItemVerFormDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDescuentoTipoPrecio"));		
		
		
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDescuentoTipoPrecio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDescuentoTipoPrecio"));
			
		this.jMenuItemGuardarCambiosTablaDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDescuentoTipoPrecio"));		
		
		
		
		this.jButtonRecargarInformacionDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionDescuentoTipoPrecio"));
					
		this.jButtonRecargarInformacionToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDescuentoTipoPrecio"));
		
		this.jMenuItemRecargarInformacionDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDescuentoTipoPrecio"));		
		
		
		
		this.jButtonAnterioresDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"AnterioresDescuentoTipoPrecio"));
		
		
		this.jButtonAnterioresToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDescuentoTipoPrecio"));
		
		this.jMenuItemAnterioresDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDescuentoTipoPrecio"));		
		
		
		this.jButtonSiguientesDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"SiguientesDescuentoTipoPrecio"));
		
		
		this.jButtonSiguientesToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDescuentoTipoPrecio"));
			
		this.jMenuItemSiguientesDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDescuentoTipoPrecio"));
			
		this.jMenuItemAbrirOrderByDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDescuentoTipoPrecio"));
			
		this.jMenuItemMostrarOcultarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDescuentoTipoPrecio"));
			
		this.jMenuItemDetalleAbrirOrderByDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDescuentoTipoPrecio"));
			
		this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDescuentoTipoPrecio"));		
		
		
		this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDescuentoTipoPrecio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDescuentoTipoPrecio"));
			
		this.jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDescuentoTipoPrecio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDescuentoTipoPrecio"));

		this.jCheckBoxSeleccionadosDescuentoTipoPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDescuentoTipoPrecio"));
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDescuentoTipoPrecio"));
		}
		
		
		this.jComboBoxTiposRelacionesDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposRelacionesDescuentoTipoPrecio"));
			
		this.jComboBoxTiposAccionesDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesDescuentoTipoPrecio"));
					
		this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDescuentoTipoPrecio"));
			
		this.jTextFieldValorCampoGeneralDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDescuentoTipoPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonidDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_empresaDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_empresaDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_sucursalDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_sucursalDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_usuarioDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_usuarioDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_bodegaDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_bodegaDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_tipo_precioDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtondescripcionDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonporcentajeDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonfecha_finDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonesta_activoDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDescuentoTipoPrecioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDescuentoTipoPrecio"));

			this.jButtonFK_IdTipoPrecioDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrecioDescuentoTipoPrecio"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDescuentoTipoPrecio!=null) {
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDescuentoTipoPrecio"));
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDescuentoTipoPrecio"));
				this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDescuentoTipoPrecio"));
			}
			
			//this.jButtonCerrarReporteDinamicoDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDescuentoTipoPrecio"));				
			//this.jButtonGenerarReporteDinamicoDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDescuentoTipoPrecio"));
			//this.jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDescuentoTipoPrecio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDescuentoTipoPrecio!=null) {
				this.jInternalFrameImportacionDescuentoTipoPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDescuentoTipoPrecio"));
				this.jInternalFrameImportacionDescuentoTipoPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDescuentoTipoPrecio"));
				this.jInternalFrameImportacionDescuentoTipoPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDescuentoTipoPrecio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByDescuentoTipoPrecio"));
			
			this.jButtonAbrirOrderByToolBarDescuentoTipoPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDescuentoTipoPrecio"));			
			
			if(this.jInternalFrameOrderByDescuentoTipoPrecio!=null) {
				this.jInternalFrameOrderByDescuentoTipoPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDescuentoTipoPrecio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTabbedPaneRelacionesDescuentoTipoPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDescuentoTipoPrecio"));
		
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
            		closingInternalFrameDescuentoTipoPrecio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDescuentoTipoPrecio = (JInternalFrameBase)event.getSource();
	            	
	            DescuentoTipoPrecioBeanSwingJInternalFrame jInternalFrameParent=(DescuentoTipoPrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormDescuentoTipoPrecio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDescuentoTipoPrecioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDescuentoTipoPrecio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDescuentoTipoPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDescuentoTipoPrecio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDescuentoTipoPrecio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDescuentoTipoPrecio";
		inputMap = this.jButtonNuevoDescuentoTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDescuentoTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDescuentoTipoPrecio";
		inputMap = this.jButtonNuevoRelacionesDescuentoTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDescuentoTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDescuentoTipoPrecioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDescuentoTipoPrecio";
		inputMap = this.jButtonModificarDescuentoTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDescuentoTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDescuentoTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDescuentoTipoPrecio";
		inputMap = this.jButtonActualizarDescuentoTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDescuentoTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDescuentoTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDescuentoTipoPrecio";
		inputMap = this.jButtonEliminarDescuentoTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDescuentoTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDescuentoTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDescuentoTipoPrecio";
		inputMap = this.jButtonCancelarDescuentoTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDescuentoTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDescuentoTipoPrecio";
		inputMap = this.jButtonCerrarDescuentoTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDescuentoTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDescuentoTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDescuentoTipoPrecio";
		inputMap = this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosDescuentoTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonGuardarCambiosDescuentoTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDescuentoTipoPrecioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDescuentoTipoPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDescuentoTipoPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDescuentoTipoPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDescuentoTipoPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDescuentoTipoPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonidDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_empresaDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_empresaDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_sucursalDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_sucursalDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_usuarioDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_usuarioDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_bodegaDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_bodegaDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_tipo_precioDescuentoTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioDescuentoTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtondescripcionDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonporcentajeDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonfecha_finDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finDescuentoTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jButtonesta_activoDescuentoTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDescuentoTipoPrecioBusqueda"));
		
		
		this.jButtonFK_IdBodegaDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDescuentoTipoPrecio"));

		this.jButtonFK_IdTipoPrecioDescuentoTipoPrecio.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrecioDescuentoTipoPrecio"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDescuentoTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDescuentoTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDescuentoTipoPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDescuentoTipoPrecio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
					descuentotipoprecioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipoprecios) {
					descuentotipoprecioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDescuentoTipoPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
						descuentotipoprecioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipoprecios) {
						descuentotipoprecioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
					
						if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							descuentotipoprecioAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipoprecios) {
						
						if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							descuentotipoprecioAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDescuentoTipoPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDescuentoTipoPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDescuentoTipoPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDescuentoTipoPrecio.getSelectedRows();
			
			DescuentoTipoPrecio descuentotipoprecioLocal=new DescuentoTipoPrecio();
			
			//this.seleccionarTodosDescuentoTipoPrecio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentotipoprecioLocal =(DescuentoTipoPrecio) this.descuentotipoprecioLogic.getDescuentoTipoPrecios().toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					descuentotipoprecioLocal =(DescuentoTipoPrecio) this.descuentotipoprecios.toArray()[this.jTableDatosDescuentoTipoPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				descuentotipoprecioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
						descuentotipoprecioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipoprecios) {
						descuentotipoprecioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDescuentoTipoPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDescuentoTipoPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDescuentoTipoPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDescuentoTipoPrecioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDescuentoTipoPrecioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDescuentoTipoPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDescuentoTipoPrecio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
				
						if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							descuentotipoprecioAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							descuentotipoprecioAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							descuentotipoprecioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							descuentotipoprecioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipoprecios) {
					
						if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							descuentotipoprecioAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							descuentotipoprecioAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							descuentotipoprecioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							descuentotipoprecioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDescuentoTipoPrecioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDescuentoTipoPrecio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDescuentoTipoPrecio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDescuentoTipoPrecio) {				
					conSplash=true;//false;										
					
					//this.startProcessDescuentoTipoPrecio(conSplash);
				
					this.generarReporteDescuentoTipoPreciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDescuentoTipoPreciosSeleccionados();
				//this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDescuentoTipoPreciosSeleccionados(false);
				//this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDescuentoTipoPreciosSeleccionados(true);
				//this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDescuentoTipoPrecio();
				
				this.exportarDescuentoTipoPreciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDescuentoTipoPrecios();
				//this.importarDescuentoTipoPrecios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDescuentoTipoPrecio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDescuentoTipoPreciosSeleccionados();
				//this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Descuento Tipo Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDescuentoTipoPrecio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDescuentoTipoPrecio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDescuentoTipoPrecio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setSelectedIndex(0);					
				}	
			} 			
			else if(DescuentoTipoPrecioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDescuentoTipoPrecio) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDescuentoTipoPrecio(conSplash);
					
						//this.actualizarParametrosGeneralDescuentoTipoPrecio();
						
						this.generarReporteProcesoAccionDescuentoTipoPreciosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Descuento Tipo PrecioS SELECCIONADOS?", "MANTENIMIENTO DE Descuento Tipo Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDescuentoTipoPrecio();
				
						this.actualizarParametrosGeneralDescuentoTipoPrecio();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.descuentotipoprecioReturnGeneral=descuentotipoprecioLogic.procesarAccionDescuentoTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.descuentotipoprecioLogic.getDescuentoTipoPrecios(),this.descuentotipoprecioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDescuentoTipoPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDescuentoTipoPrecio();
					
					DescuentoTipoPrecioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDescuentoTipoPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDescuentoTipoPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDescuentoTipoPrecio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDescuentoTipoPrecioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDescuentoTipoPrecio();
			
			if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();		
			DescuentoTipoPrecio descuentotipoprecio=new DescuentoTipoPrecio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDescuentoTipoPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDescuentoTipoPrecio.getSelectedItem();
			
			
			
			
			descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(descuentotipopreciosSeleccionados.size()==1) {
				for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipopreciosSeleccionados) {
					descuentotipoprecio=descuentotipoprecioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDescuentoTipoPrecio();
			
      		//this.finishProcessDescuentoTipoPrecio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDescuentoTipoPrecioReturnGeneral() throws Exception {
		if(this.descuentotipoprecioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.descuentotipoprecioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.descuentotipoprecioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.descuentotipoprecioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.descuentotipoprecioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.descuentotipoprecioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDescuentoTipoPrecio(false);
		}
		
		if(this.descuentotipoprecioReturnGeneral.getConRetornoLista() || this.descuentotipoprecioReturnGeneral.getConRetornoObjeto()) {
			if(this.descuentotipoprecioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.descuentotipoprecioLogic.setDescuentoTipoPrecios(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.descuentotipoprecioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.descuentotipoprecioLogic.setDescuentoTipoPrecio(this.descuentotipoprecioReturnGeneral.getDescuentoTipoPrecio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDescuentoTipoPrecio(false);
		}
	}
	
	public void actualizarParametrosGeneralDescuentoTipoPrecio() throws Exception {
		
		
	}
	
	public ArrayList<DescuentoTipoPrecio> getDescuentoTipoPreciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDescuentoTipoPrecio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipoprecioLogic.getDescuentoTipoPrecios()) {
					if(descuentotipoprecioAux.getIsSelected()) {
						descuentotipopreciosSeleccionados.add(descuentotipoprecioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DescuentoTipoPrecio descuentotipoprecioAux:this.descuentotipoprecios) {
					if(descuentotipoprecioAux.getIsSelected()) {
						descuentotipopreciosSeleccionados.add(descuentotipoprecioAux);				
					}
				}
			}
			
			if(descuentotipopreciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						descuentotipopreciosSeleccionados.addAll(this.descuentotipoprecioLogic.getDescuentoTipoPrecios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						descuentotipopreciosSeleccionados.addAll(this.descuentotipoprecios);				
					}
				}
			}
		} else {
			descuentotipopreciosSeleccionados.add(this.descuentotipoprecio);
		}
		
		return descuentotipopreciosSeleccionados;
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
	
	public void generarReporteDescuentoTipoPreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDescuentoTipoPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDescuentoTipoPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDescuentoTipoPreciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDescuentoTipoPreciosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Descuento Tipo Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDescuentoTipoPreciosSeleccionados() throws Exception {
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();		
		
		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDescuentoTipoPrecios("Todos",descuentotipopreciosSeleccionados);
		
	}	
	
	public void generarReporteNormalDescuentoTipoPreciosSeleccionados() throws Exception {
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();		
		
		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDescuentoTipoPrecios("Todos",descuentotipopreciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDescuentoTipoPreciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();
		
		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDescuentoTipoPrecios("Todos",descuentotipopreciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDescuentoTipoPreciosSeleccionados() throws Exception {
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDescuentoTipoPrecio();
		
		
		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDescuentoTipoPrecio();
		
		
		//this.generarReporteDescuentoTipoPrecios("Todos",descuentotipopreciosSeleccionados ,descuentotipoprecioImplementable,descuentotipoprecioImplementableHome);
	}
	
	public void mostrarImportacionDescuentoTipoPrecios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDescuentoTipoPrecio();
		
		this.abrirFrameImportacionDescuentoTipoPrecio();		
		
			
		//this.generarReporteDescuentoTipoPrecios("Todos",descuentotipopreciosSeleccionados ,descuentotipoprecioImplementable,descuentotipoprecioImplementableHome);
	}
	
	public void importarDescuentoTipoPrecios() throws Exception {		
	
	}
	
	public void exportarDescuentoTipoPreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDescuentoTipoPreciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDescuentoTipoPreciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDescuentoTipoPreciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Descuento Tipo Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDescuentoTipoPreciosSeleccionados() throws Exception {
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();		
		
		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentotipoprecio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDescuentoTipoPrecio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipopreciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDescuentoTipoPrecio(descuentotipoprecioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//descuentotipoprecioAux.setsDetalleGeneralEntityReporte(descuentotipoprecioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDescuentoTipoPrecio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=descuentotipoprecio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.gettipoprecio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentotipoprecio.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDescuentoTipoPreciosSeleccionados() throws Exception {
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();		
		
		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentotipoprecio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DescuentoTipoPrecios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDescuentoTipoPrecio(row);				
				iRow++;
			}				
			
			for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipopreciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDescuentoTipoPrecio(descuentotipoprecioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDescuentoTipoPreciosSeleccionados() throws Exception {
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();		
		
		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentotipoprecio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("descuentotipoprecios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("descuentotipoprecio");
			//elementRoot.appendChild(element);
		
			for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipopreciosSeleccionados) {
				element = document.createElement("descuentotipoprecio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDescuentoTipoPrecio(descuentotipoprecioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDescuentoTipoPrecio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.gettipoprecio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentotipoprecio.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlDescuentoTipoPrecio(DescuentoTipoPrecio descuentotipoprecio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DescuentoTipoPrecioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(descuentotipoprecio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DescuentoTipoPrecioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(descuentotipoprecio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DescuentoTipoPrecioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(descuentotipoprecio.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DescuentoTipoPrecioConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(descuentotipoprecio.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(DescuentoTipoPrecioConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(descuentotipoprecio.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementbodega_descripcion = document.createElement(DescuentoTipoPrecioConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(descuentotipoprecio.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementtipoprecio_descripcion = document.createElement(DescuentoTipoPrecioConstantesFunciones.IDTIPOPRECIO);
		elementtipoprecio_descripcion.appendChild(document.createTextNode(descuentotipoprecio.gettipoprecio_descripcion()));
		element.appendChild(elementtipoprecio_descripcion);

		Element elementdescripcion = document.createElement(DescuentoTipoPrecioConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(descuentotipoprecio.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementporcentaje = document.createElement(DescuentoTipoPrecioConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(descuentotipoprecio.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementfecha_inicio = document.createElement(DescuentoTipoPrecioConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(descuentotipoprecio.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(DescuentoTipoPrecioConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(descuentotipoprecio.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementesta_activo = document.createElement(DescuentoTipoPrecioConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(descuentotipoprecio.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoDescuentoTipoPreciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados=new ArrayList<DescuentoTipoPrecio>();
		
		descuentotipopreciosSeleccionados=this.getDescuentoTipoPreciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDescuentoTipoPrecio(descuentotipopreciosSeleccionados);
		
		this.generarReporteDescuentoTipoPrecios("Todos",descuentotipopreciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDescuentoTipoPrecio(ArrayList<DescuentoTipoPrecio> descuentotipopreciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DescuentoTipoPrecio descuentotipoprecioAux:descuentotipopreciosSeleccionados) {
				descuentotipoprecioAux.setsDetalleGeneralEntityReporte(descuentotipoprecioAux.toString());
			
				if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					descuentotipoprecioAux.setsDescripcionGeneralEntityReporte1(descuentotipoprecioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					descuentotipoprecioAux.setsDescripcionGeneralEntityReporte1(descuentotipoprecioAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					descuentotipoprecioAux.setsDescripcionGeneralEntityReporte1(descuentotipoprecioAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					descuentotipoprecioAux.setsDescripcionGeneralEntityReporte1(descuentotipoprecioAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO)) {
					existe=true;
					descuentotipoprecioAux.setsDescripcionGeneralEntityReporte1(descuentotipoprecioAux.gettipoprecio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					descuentotipoprecioAux.setsDescripcionGeneralEntityReporte1(descuentotipoprecioAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					descuentotipoprecioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(descuentotipoprecioAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					descuentotipoprecioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(descuentotipoprecioAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					descuentotipoprecioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(descuentotipoprecioAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDescuentoTipoPrecio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=true;
				this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=true;
				this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=true;
			}
			
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaModificarDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaCancelarDescuentoTipoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoTipoPrecio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DescuentoTipoPrecioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=true;
		} else {
			this.actualizarEstadoPanelsDescuentoTipoPrecio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDescuentoTipoPrecio=false;
			//this.isVisibilidadCeldaVerFormDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaDuplicarDescuentoTipoPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;
		} else {
			this.isVisibilidadCeldaNuevoDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoTipoPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			if(!descuentotipoprecioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;												
			}
			
			this.jButtonCerrarDescuentoTipoPrecio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDescuentoTipoPrecio=false;
		}
		
		if(!this.permiteMantenimiento(this.descuentotipoprecio)) {
			this.isVisibilidadCeldaActualizarDescuentoTipoPrecio=false;
			this.isVisibilidadCeldaEliminarDescuentoTipoPrecio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDescuentoTipoPrecio() {
	}
	
	public void actualizarEstadoPanelsDescuentoTipoPrecio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoTipoPrecio!=null) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosDescuentoTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionDescuentoTipoPrecio!=null) {
				this.jPanelPaginacionDescuentoTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDescuentoTipoPrecio!=null) {
				this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoTipoPrecio!=null) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosDescuentoTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionDescuentoTipoPrecio!=null) {
				this.jPanelPaginacionDescuentoTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDescuentoTipoPrecio!=null) {
				this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoTipoPrecio!=null) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosDescuentoTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionDescuentoTipoPrecio!=null) {
				this.jPanelPaginacionDescuentoTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDescuentoTipoPrecio!=null) {
				this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoTipoPrecio!=null) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosDescuentoTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionDescuentoTipoPrecio!=null) {
				this.jPanelPaginacionDescuentoTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDescuentoTipoPrecio!=null) {
				this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoTipoPrecio!=null) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosDescuentoTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionDescuentoTipoPrecio!=null) {
				this.jPanelPaginacionDescuentoTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDescuentoTipoPrecio!=null) {
				this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoTipoPrecio!=null) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosDescuentoTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionDescuentoTipoPrecio!=null) {
				this.jPanelPaginacionDescuentoTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDescuentoTipoPrecio!=null) {
				this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoTipoPrecio!=null) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoTipoPrecio!=null) {
				this.jScrollPanelDatosDescuentoTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionDescuentoTipoPrecio!=null) {
				this.jPanelPaginacionDescuentoTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDescuentoTipoPrecio!=null) {
				this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDescuentoTipoPrecio!=null) {
					this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDescuentoTipoPrecio!=null) {
				this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoTipoPrecio!=null) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDescuentoTipoPrecio!=null) {
				this.jPanelParametrosReportesDescuentoTipoPrecio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdBodegaDescuentoTipoPrecio);}

			this.isVisibilidadFK_IdTipoPrecio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdTipoPrecioDescuentoTipoPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdBodegaDescuentoTipoPrecio);}

			this.isVisibilidadFK_IdTipoPrecio=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdTipoPrecioDescuentoTipoPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdBodega=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdBodegaDescuentoTipoPrecio);}

			this.isVisibilidadFK_IdTipoPrecio=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdTipoPrecioDescuentoTipoPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdBodegaDescuentoTipoPrecio);}

			this.isVisibilidadFK_IdTipoPrecio=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdTipoPrecioDescuentoTipoPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPrecio(Boolean isParaTipoPrecio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPrecioNegation=!isParaTipoPrecio;

			this.isVisibilidadFK_IdBodega=isParaTipoPrecioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdBodegaDescuentoTipoPrecio);}

			this.isVisibilidadFK_IdTipoPrecio=isParaTipoPrecio;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(jPanelFK_IdTipoPrecioDescuentoTipoPrecio);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DescuentoTipoPrecioSessionBean descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		
		if(this.descuentotipoprecioSessionBean==null) {
			this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		}
		
		this.descuentotipoprecioSessionBean.setsUltimaBusquedaDescuentoTipoPrecio(this.getsAccionBusqueda());
		this.descuentotipoprecioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.descuentotipoprecioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			descuentotipoprecioSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			descuentotipoprecioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			descuentotipoprecioSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPrecio")) {
			descuentotipoprecioSessionBean.setid_tipo_precio(this.getid_tipo_precioFK_IdTipoPrecio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			descuentotipoprecioSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DescuentoTipoPrecioSessionBean descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		
		if(this.descuentotipoprecioSessionBean==null) {
			this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		}
		
		if(this.descuentotipoprecioSessionBean.getsUltimaBusquedaDescuentoTipoPrecio()!=null&&!this.descuentotipoprecioSessionBean.getsUltimaBusquedaDescuentoTipoPrecio().equals("")) {
			this.setsAccionBusqueda(descuentotipoprecioSessionBean.getsUltimaBusquedaDescuentoTipoPrecio());
			this.setiNumeroPaginacion(descuentotipoprecioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(descuentotipoprecioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(descuentotipoprecioSessionBean.getid_bodega());
				descuentotipoprecioSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(descuentotipoprecioSessionBean.getid_empresa());
				descuentotipoprecioSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(descuentotipoprecioSessionBean.getid_sucursal());
				descuentotipoprecioSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPrecio")) {
				this.setid_tipo_precioFK_IdTipoPrecio(descuentotipoprecioSessionBean.getid_tipo_precio());
				descuentotipoprecioSessionBean.setid_tipo_precio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(descuentotipoprecioSessionBean.getid_usuario());
				descuentotipoprecioSessionBean.setid_usuario(-1L);
			}
		}
		
		this.descuentotipoprecioSessionBean.setsUltimaBusquedaDescuentoTipoPrecio("");
		this.descuentotipoprecioSessionBean.setiNumeroPaginacion(DescuentoTipoPrecioConstantesFunciones.INUMEROPAGINACION);
		this.descuentotipoprecioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDescuentoTipoPrecio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDescuentoTipoPrecio() {
		this.updateBorderResaltarBusquedasFormularioDescuentoTipoPrecio();
		this.updateVisibilidadBusquedasFormularioDescuentoTipoPrecio();
		this.updateHabilitarBusquedasFormularioDescuentoTipoPrecio();
	}
	
	public void updateBorderResaltarBusquedasFormularioDescuentoTipoPrecio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponents().length>0) {
	

		if(this.descuentotipoprecioConstantesFunciones.resaltarFK_IdBodegaDescuentoTipoPrecio!=null) {
			index= this.jTabbedPaneBusquedasDescuentoTipoPrecio.indexOfComponent(this.jPanelFK_IdBodegaDescuentoTipoPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponent(index);
				jPanel.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarFK_IdBodegaDescuentoTipoPrecio);
			}
		}

		if(this.descuentotipoprecioConstantesFunciones.resaltarFK_IdTipoPrecioDescuentoTipoPrecio!=null) {
			index= this.jTabbedPaneBusquedasDescuentoTipoPrecio.indexOfComponent(this.jPanelFK_IdTipoPrecioDescuentoTipoPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponent(index);
				jPanel.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarFK_IdTipoPrecioDescuentoTipoPrecio);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDescuentoTipoPrecio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDescuentoTipoPrecio.indexOfComponent(this.jPanelFK_IdBodegaDescuentoTipoPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarFK_IdBodegaDescuentoTipoPrecio);
			if(!this.descuentotipoprecioConstantesFunciones.mostrarFK_IdBodegaDescuentoTipoPrecio && index>-1) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(index);
			}

			index= this.jTabbedPaneBusquedasDescuentoTipoPrecio.indexOfComponent(this.jPanelFK_IdTipoPrecioDescuentoTipoPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarFK_IdTipoPrecioDescuentoTipoPrecio);
			if(!this.descuentotipoprecioConstantesFunciones.mostrarFK_IdTipoPrecioDescuentoTipoPrecio && index>-1) {
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDescuentoTipoPrecio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDescuentoTipoPrecio.indexOfComponent(this.jPanelFK_IdBodegaDescuentoTipoPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.descuentotipoprecioConstantesFunciones.activarFK_IdBodegaDescuentoTipoPrecio);
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setEnabledAt(index,this.descuentotipoprecioConstantesFunciones.activarFK_IdBodegaDescuentoTipoPrecio);
			}

			index= this.jTabbedPaneBusquedasDescuentoTipoPrecio.indexOfComponent(this.jPanelFK_IdTipoPrecioDescuentoTipoPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.descuentotipoprecioConstantesFunciones.activarFK_IdTipoPrecioDescuentoTipoPrecio);
				this.jTabbedPaneBusquedasDescuentoTipoPrecio.setEnabledAt(index,this.descuentotipoprecioConstantesFunciones.activarFK_IdTipoPrecioDescuentoTipoPrecio);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDescuentoTipoPrecio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasDescuentoTipoPrecio.indexOfComponent(this.jPanelFK_IdBodegaDescuentoTipoPrecio);

			this.jTabbedPaneBusquedasDescuentoTipoPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponent(index);

			this.descuentotipoprecioConstantesFunciones.setResaltarFK_IdBodegaDescuentoTipoPrecio(resaltar);

			jPanel.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarFK_IdBodegaDescuentoTipoPrecio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoPrecio")) {
			index= this.jTabbedPaneBusquedasDescuentoTipoPrecio.indexOfComponent(this.jPanelFK_IdTipoPrecioDescuentoTipoPrecio);

			this.jTabbedPaneBusquedasDescuentoTipoPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoTipoPrecio.getComponent(index);

			this.descuentotipoprecioConstantesFunciones.setResaltarFK_IdTipoPrecioDescuentoTipoPrecio(resaltar);

			jPanel.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarFK_IdTipoPrecioDescuentoTipoPrecio);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDescuentoTipoPrecio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDescuentoTipoPrecio() throws Exception {

		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDescuentoTipoPrecio();
		this.updateVisibilidadResaltarControlesFormularioDescuentoTipoPrecio();
		this.updateHabilitarResaltarControlesFormularioDescuentoTipoPrecio();
		
	}
	
	public void updateBorderResaltarControlesFormularioDescuentoTipoPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.descuentotipoprecioConstantesFunciones.resaltaridDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltaridDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltarid_empresaDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarid_empresaDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltarid_sucursalDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarid_sucursalDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltarid_usuarioDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarid_usuarioDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltarid_bodegaDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarid_bodegaDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltarid_tipo_precioDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarid_tipo_precioDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltardescripcionDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextAreadescripcionDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltardescripcionDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltarporcentajeDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextFieldporcentajeDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarporcentajeDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltarfecha_inicioDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_inicioDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarfecha_inicioDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltarfecha_finDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_finDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltarfecha_finDescuentoTipoPrecio);}
		if(this.descuentotipoprecioConstantesFunciones.resaltaresta_activoDescuentoTipoPrecio!=null && this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxesta_activoDescuentoTipoPrecio.setBorderPainted(true);this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxesta_activoDescuentoTipoPrecio.setBorder(this.descuentotipoprecioConstantesFunciones.resaltaresta_activoDescuentoTipoPrecio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDescuentoTipoPrecio() throws Exception {		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
	
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostraridDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelidDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostraridDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_empresaDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelid_empresaDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_empresaDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_sucursalDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelid_sucursalDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_sucursalDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_usuarioDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelid_usuarioDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_usuarioDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_bodegaDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelid_bodegaDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_bodegaDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_tipo_precioDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelid_tipo_precioDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarid_tipo_precioDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextAreadescripcionDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrardescripcionDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPaneldescripcionDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrardescripcionDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextFieldporcentajeDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarporcentajeDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelporcentajeDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarporcentajeDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_inicioDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarfecha_inicioDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelfecha_inicioDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarfecha_inicioDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_finDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarfecha_finDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelfecha_finDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostrarfecha_finDescuentoTipoPrecio);
		//this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxesta_activoDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostraresta_activoDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jPanelesta_activoDescuentoTipoPrecio.setVisible(this.descuentotipoprecioConstantesFunciones.mostraresta_activoDescuentoTipoPrecio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDescuentoTipoPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDescuentoTipoPrecio!=null) {
	
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jLabelidDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activaridDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_empresaDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activarid_empresaDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_sucursalDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activarid_sucursalDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_usuarioDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activarid_usuarioDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_bodegaDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activarid_bodegaDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jComboBoxid_tipo_precioDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activarid_tipo_precioDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextAreadescripcionDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activardescripcionDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jTextFieldporcentajeDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activarporcentajeDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_inicioDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activarfecha_inicioDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jDateChooserfecha_finDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activarfecha_finDescuentoTipoPrecio);
		this.jInternalFrameDetalleFormDescuentoTipoPrecio.jCheckBoxesta_activoDescuentoTipoPrecio.setEnabled(this.descuentotipoprecioConstantesFunciones.activaresta_activoDescuentoTipoPrecio);
		}
	}
	
		
}