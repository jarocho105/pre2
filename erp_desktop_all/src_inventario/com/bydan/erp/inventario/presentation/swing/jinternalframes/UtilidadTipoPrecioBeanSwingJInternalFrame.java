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

import com.bydan.erp.inventario.util.UtilidadTipoPrecioConstantesFunciones;
import com.bydan.erp.inventario.util.UtilidadTipoPrecioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.UtilidadTipoPrecioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.UtilidadTipoPrecioBean;
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
public class UtilidadTipoPrecioBeanSwingJInternalFrame extends UtilidadTipoPrecioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UtilidadTipoPrecioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<UtilidadTipoPrecio> utilidadtipoprecioValidator = new ClassValidator<UtilidadTipoPrecio>(UtilidadTipoPrecio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public UtilidadTipoPrecio utilidadtipoprecio;	
	public UtilidadTipoPrecio utilidadtipoprecioAux;
	public UtilidadTipoPrecio utilidadtipoprecioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public UtilidadTipoPrecio utilidadtipoprecioTotales;
	public Long idUtilidadTipoPrecioActual;
	public Long iIdNuevoUtilidadTipoPrecio=0L;
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
	
	public Boolean isPermisoTodoUtilidadTipoPrecio;
	public Boolean isPermisoNuevoUtilidadTipoPrecio;
	public Boolean isPermisoActualizarUtilidadTipoPrecio;
	public Boolean isPermisoActualizarOriginalUtilidadTipoPrecio;
	public Boolean isPermisoEliminarUtilidadTipoPrecio;
	public Boolean isPermisoGuardarCambiosUtilidadTipoPrecio;
	public Boolean isPermisoConsultaUtilidadTipoPrecio;
	public Boolean isPermisoBusquedaUtilidadTipoPrecio;
	public Boolean isPermisoReporteUtilidadTipoPrecio;
	public Boolean isPermisoPaginacionMedioUtilidadTipoPrecio;
	public Boolean isPermisoPaginacionAltoUtilidadTipoPrecio;
	public Boolean isPermisoPaginacionTodoUtilidadTipoPrecio;
	public Boolean isPermisoCopiarUtilidadTipoPrecio;
	public Boolean isPermisoVerFormUtilidadTipoPrecio;
	public Boolean isPermisoDuplicarUtilidadTipoPrecio;
	public Boolean isPermisoOrdenUtilidadTipoPrecio;
	
	
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
	
	public UtilidadTipoPrecioParameterReturnGeneral utilidadtipoprecioReturnGeneral;
	public UtilidadTipoPrecioParameterReturnGeneral utilidadtipoprecioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUtilidadTipoPrecio=false;
	public Boolean esParaAccionDesdeFormularioUtilidadTipoPrecio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UtilidadTipoPrecioSessionBeanAdditional utilidadtipoprecioSessionBeanAdditional=null;
	
	public UtilidadTipoPrecioSessionBeanAdditional getUtilidadTipoPrecioSessionBeanAdditional() {
		return this.utilidadtipoprecioSessionBeanAdditional;
	}
	
	public void setUtilidadTipoPrecioSessionBeanAdditional(UtilidadTipoPrecioSessionBeanAdditional utilidadtipoprecioSessionBeanAdditional) {
		try {
			this.utilidadtipoprecioSessionBeanAdditional=utilidadtipoprecioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UtilidadTipoPrecioBeanSwingJInternalFrameAdditional utilidadtipoprecioBeanSwingJInternalFrameAdditional=null;
	//public class UtilidadTipoPrecioBeanSwingJInternalFrame
	
	public UtilidadTipoPrecioBeanSwingJInternalFrameAdditional getUtilidadTipoPrecioBeanSwingJInternalFrameAdditional() {
		return this.utilidadtipoprecioBeanSwingJInternalFrameAdditional;
	}
	
	public void setUtilidadTipoPrecioBeanSwingJInternalFrameAdditional(UtilidadTipoPrecioBeanSwingJInternalFrameAdditional utilidadtipoprecioBeanSwingJInternalFrameAdditional) {
		try {
			this.utilidadtipoprecioBeanSwingJInternalFrameAdditional=utilidadtipoprecioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UtilidadTipoPrecioLogic utilidadtipoprecioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public UtilidadTipoPrecio utilidadtipoprecioBean;
	public UtilidadTipoPrecioConstantesFunciones utilidadtipoprecioConstantesFunciones;
	//public UtilidadTipoPrecioParameterReturnGeneral utilidadtipoprecioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoPrecioLogic tipoprecioLogic;
	
	//PARAMETROS
	
	
	//public List<UtilidadTipoPrecio> utilidadtipoprecios;	
	//public List<UtilidadTipoPrecio> utilidadtipopreciosEliminados;
	//public List<UtilidadTipoPrecio> utilidadtipopreciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUtilidadTipoPrecio=false;
	public Boolean isVisibilidadCeldaDuplicarUtilidadTipoPrecio=true;
	public Boolean isVisibilidadCeldaCopiarUtilidadTipoPrecio=true;
	public Boolean isVisibilidadCeldaVerFormUtilidadTipoPrecio=true;
	public Boolean isVisibilidadCeldaOrdenUtilidadTipoPrecio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;
	public Boolean isVisibilidadCeldaModificarUtilidadTipoPrecio=false;
	public Boolean isVisibilidadCeldaActualizarUtilidadTipoPrecio=false;
	public Boolean isVisibilidadCeldaEliminarUtilidadTipoPrecio=false;
	public Boolean isVisibilidadCeldaCancelarUtilidadTipoPrecio=false;
	public Boolean isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoPrecio=false;
	
	public Long getiIdNuevoUtilidadTipoPrecio() {
		return this.iIdNuevoUtilidadTipoPrecio;
	}

	public void setiIdNuevoUtilidadTipoPrecio(Long iIdNuevoUtilidadTipoPrecio) {
		this.iIdNuevoUtilidadTipoPrecio = iIdNuevoUtilidadTipoPrecio;
	}
	
	public Long getidUtilidadTipoPrecioActual() {
		return this.idUtilidadTipoPrecioActual;
	}

	public void setidUtilidadTipoPrecioActual(Long idUtilidadTipoPrecioActual) {
		this.idUtilidadTipoPrecioActual = idUtilidadTipoPrecioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public UtilidadTipoPrecio getutilidadtipoprecio() {
		return this.utilidadtipoprecio;
	}

	public void setutilidadtipoprecio(UtilidadTipoPrecio utilidadtipoprecio) {
		this.utilidadtipoprecio = utilidadtipoprecio;
	}
	
	public UtilidadTipoPrecio getutilidadtipoprecioAux() {
		return this.utilidadtipoprecioAux;
	}

	public void setutilidadtipoprecioAux(UtilidadTipoPrecio utilidadtipoprecioAux) {
		this.utilidadtipoprecioAux = utilidadtipoprecioAux;
	}				
	
	public UtilidadTipoPrecio getutilidadtipoprecioAnterior() {
		return this.utilidadtipoprecioAnterior;
	}

	public void setutilidadtipoprecioAnterior(UtilidadTipoPrecio utilidadtipoprecioAnterior) {
		this.utilidadtipoprecioAnterior = utilidadtipoprecioAnterior;
	}	
	
	public UtilidadTipoPrecio getutilidadtipoprecioTotales() {
		return this.utilidadtipoprecioTotales;
	}

	public void setutilidadtipoprecioTotales(UtilidadTipoPrecio utilidadtipoprecioTotales) {
		this.utilidadtipoprecioTotales = utilidadtipoprecioTotales;
	}	
	
	public UtilidadTipoPrecio getutilidadtipoprecioBean() {
		return this.utilidadtipoprecioBean;
	}

	public void setutilidadtipoprecioBean(UtilidadTipoPrecio utilidadtipoprecioBean) {
		this.utilidadtipoprecioBean = utilidadtipoprecioBean;
	}	
	
	public UtilidadTipoPrecioParameterReturnGeneral getutilidadtipoprecioReturnGeneral() {
		return this.utilidadtipoprecioReturnGeneral;
	}

	public void setutilidadtipoprecioReturnGeneral(UtilidadTipoPrecioParameterReturnGeneral utilidadtipoprecioReturnGeneral) {
		this.utilidadtipoprecioReturnGeneral = utilidadtipoprecioReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public UtilidadTipoPrecioLogic getUtilidadTipoPrecioLogic()	{		
		return utilidadtipoprecioLogic;
	}

	public void setUtilidadTipoPrecioLogic(UtilidadTipoPrecioLogic utilidadtipoprecioLogic) {
		this.utilidadtipoprecioLogic = utilidadtipoprecioLogic;
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
	
	public Boolean getIsEsNuevoUtilidadTipoPrecio() {
		return isEsNuevoUtilidadTipoPrecio;
	}

	public void setIsEsNuevoUtilidadTipoPrecio(Boolean isEsNuevoUtilidadTipoPrecio) {
		this.isEsNuevoUtilidadTipoPrecio = isEsNuevoUtilidadTipoPrecio;
	}

	public Boolean getEsParaAccionDesdeFormularioUtilidadTipoPrecio() {
		return esParaAccionDesdeFormularioUtilidadTipoPrecio;
	}
	
	public void setEsParaAccionDesdeFormularioUtilidadTipoPrecio(Boolean esParaAccionDesdeFormularioUtilidadTipoPrecio) {
		this.esParaAccionDesdeFormularioUtilidadTipoPrecio = esParaAccionDesdeFormularioUtilidadTipoPrecio;
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

			if(this.utilidadtipoprecioSessionBean==null) {
				this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
			}

			if(!this.utilidadtipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(utilidadtipoprecioSessionBean.getlidEmpresaActual());
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

			if(this.utilidadtipoprecioSessionBean==null) {
				this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
			}

			if(!this.utilidadtipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(utilidadtipoprecioSessionBean.getlidSucursalActual());
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

			if(this.utilidadtipoprecioSessionBean==null) {
				this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
			}

			if(!this.utilidadtipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {
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
					tipoprecioLogic.getEntityWithConnection(utilidadtipoprecioSessionBean.getlidTipoPrecioActual());
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

					if(this.utilidadtipoprecio!=null) {
						this.utilidadtipoprecio.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
						this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaUtilidadTipoPrecio.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaUtilidadTipoPrecioGenerico)throws Exception
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
				jComboBoxid_empresaUtilidadTipoPrecioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaUtilidadTipoPrecioGenerico!=null && jComboBoxid_empresaUtilidadTipoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_empresaUtilidadTipoPrecioGenerico.setSelectedIndex(0);
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

					if(this.utilidadtipoprecio!=null) {
						this.utilidadtipoprecio.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
						this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalUtilidadTipoPrecio.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalUtilidadTipoPrecioGenerico)throws Exception
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
				jComboBoxid_sucursalUtilidadTipoPrecioGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalUtilidadTipoPrecioGenerico!=null && jComboBoxid_sucursalUtilidadTipoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_sucursalUtilidadTipoPrecioGenerico.setSelectedIndex(0);
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

					if(this.utilidadtipoprecio!=null) {
						this.utilidadtipoprecio.setTipoPrecio(tipoprecioTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
						this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.setSelectedItem(tipoprecioTemp);
					}
				} else {
					//jComboBoxid_tipo_precioUtilidadTipoPrecio.setSelectedItem(tipoprecioTemp);
					if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPrecio") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprecioTemp!=null && jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio!=null) {
						jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setSelectedItem(tipoprecioTemp);
					} else {
						if(jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio!=null) {
							//jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setSelectedItem(tipoprecioTemp);
							if(jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.getItemCount()>0) {
								jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setSelectedIndex(0);
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
	public void setActualTipoPrecioForeignKeyGenerico(Long idTipoPrecioSeleccionado,JComboBox jComboBoxid_tipo_precioUtilidadTipoPrecioGenerico)throws Exception
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
				jComboBoxid_tipo_precioUtilidadTipoPrecioGenerico.setSelectedItem(tipoprecioTemp);
			} else {
				if(jComboBoxid_tipo_precioUtilidadTipoPrecioGenerico!=null && jComboBoxid_tipo_precioUtilidadTipoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_tipo_precioUtilidadTipoPrecioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(UtilidadTipoPrecio utilidadtipoprecio,JComboBox jComboBoxid_empresaUtilidadTipoPrecioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaUtilidadTipoPrecioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaUtilidadTipoPrecioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				utilidadtipoprecio.setid_empresa(empresaAux.getId());
				utilidadtipoprecio.setempresa_descripcion(UtilidadTipoPrecioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				utilidadtipoprecio.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(UtilidadTipoPrecio utilidadtipoprecio,JComboBox jComboBoxid_sucursalUtilidadTipoPrecioGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalUtilidadTipoPrecioGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalUtilidadTipoPrecioGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				utilidadtipoprecio.setid_sucursal(sucursalAux.getId());
				utilidadtipoprecio.setsucursal_descripcion(UtilidadTipoPrecioConstantesFunciones.getSucursalDescripcion(sucursalAux));
				utilidadtipoprecio.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPrecioForeignKey(UtilidadTipoPrecio utilidadtipoprecio,JComboBox jComboBoxid_tipo_precioUtilidadTipoPrecioGenerico)throws Exception
	{
		try
		{
			TipoPrecio  tipoprecioAux=new TipoPrecio();

			if(jComboBoxid_tipo_precioUtilidadTipoPrecioGenerico==null) {
				tipoprecioAux=(TipoPrecio)this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.getSelectedItem();
			} else {
				tipoprecioAux=(TipoPrecio)jComboBoxid_tipo_precioUtilidadTipoPrecioGenerico.getSelectedItem();
			}

			if(tipoprecioAux!=null && tipoprecioAux.getId()!=null) {
				utilidadtipoprecio.setid_tipo_precio(tipoprecioAux.getId());
				utilidadtipoprecio.settipoprecio_descripcion(UtilidadTipoPrecioConstantesFunciones.getTipoPrecioDescripcion(tipoprecioAux));
				utilidadtipoprecio.setTipoPrecio(tipoprecioAux);			}
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

					if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { 
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { 
					}

					if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { 
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { 
					}

					if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { 
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.removeAllItems();

							for(TipoPrecio tipoprecio:this.tipopreciosForeignKey) {
								this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.addItem(tipoprecio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { 
					}

					if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPrecio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.removeAllItems();

							for(TipoPrecio tipoprecio:this.tipopreciosForeignKey) {
								this.jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.addItem(tipoprecio);
							}
						}

						if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoPrecioForeignKey(TipoPrecio tipoprecio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.setSelectedItem(tipoprecio);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setSelectedItem(tipoprecio);
						} else {
							this.jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesUtilidadTipoPrecio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			UtilidadTipoPrecioConstantesFunciones.refrescarForeignKeysDescripcionesUtilidadTipoPrecio(this.utilidadtipoprecioLogic.getUtilidadTipoPrecios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			UtilidadTipoPrecioConstantesFunciones.refrescarForeignKeysDescripcionesUtilidadTipoPrecio(this.utilidadtipoprecios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoPrecio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//utilidadtipoprecioLogic.setUtilidadTipoPrecios(this.utilidadtipoprecios);
			utilidadtipoprecioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public UtilidadTipoPrecioParameterReturnGeneral getUtilidadTipoPrecioParameterGeneral() {
		return this.utilidadtipoprecioParameterGeneral;
	}
	
	public void setUtilidadTipoPrecioParameterGeneral(UtilidadTipoPrecioParameterReturnGeneral utilidadtipoprecioParameterGeneral) {
		this.utilidadtipoprecioParameterGeneral = utilidadtipoprecioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoUtilidadTipoPrecio() {
		return isPermisoTodoUtilidadTipoPrecio;
	}

	public void setIsPermisoTodoUtilidadTipoPrecio(Boolean isPermisoTodoUtilidadTipoPrecio) {
		this.isPermisoTodoUtilidadTipoPrecio = isPermisoTodoUtilidadTipoPrecio;
	}

	public Boolean getIsPermisoNuevoUtilidadTipoPrecio() {
		return isPermisoNuevoUtilidadTipoPrecio;
	}

	public void setIsPermisoNuevoUtilidadTipoPrecio(Boolean isPermisoNuevoUtilidadTipoPrecio) {
		this.isPermisoNuevoUtilidadTipoPrecio = isPermisoNuevoUtilidadTipoPrecio;
	}

	public Boolean getIsPermisoActualizarUtilidadTipoPrecio() {
		return isPermisoActualizarUtilidadTipoPrecio;
	}

	public void setIsPermisoActualizarUtilidadTipoPrecio(Boolean isPermisoActualizarUtilidadTipoPrecio) {
		this.isPermisoActualizarUtilidadTipoPrecio = isPermisoActualizarUtilidadTipoPrecio;
	}

	public Boolean getIsPermisoEliminarUtilidadTipoPrecio() {
		return isPermisoEliminarUtilidadTipoPrecio;
	}

	public void setIsPermisoEliminarUtilidadTipoPrecio(Boolean isPermisoEliminarUtilidadTipoPrecio) {
		this.isPermisoEliminarUtilidadTipoPrecio = isPermisoEliminarUtilidadTipoPrecio;
	}

	public Boolean getIsPermisoGuardarCambiosUtilidadTipoPrecio() {
		return isPermisoGuardarCambiosUtilidadTipoPrecio;
	}

	public void setIsPermisoGuardarCambiosUtilidadTipoPrecio(Boolean isPermisoGuardarCambiosUtilidadTipoPrecio) {
		this.isPermisoGuardarCambiosUtilidadTipoPrecio = isPermisoGuardarCambiosUtilidadTipoPrecio;
	}
	
	public Boolean getIsPermisoConsultaUtilidadTipoPrecio() {
		return isPermisoConsultaUtilidadTipoPrecio;
	}

	public void setIsPermisoConsultaUtilidadTipoPrecio(Boolean isPermisoConsultaUtilidadTipoPrecio) {
		this.isPermisoConsultaUtilidadTipoPrecio = isPermisoConsultaUtilidadTipoPrecio;
	}

	public Boolean getIsPermisoBusquedaUtilidadTipoPrecio() {
		return isPermisoBusquedaUtilidadTipoPrecio;
	}

	public void setIsPermisoBusquedaUtilidadTipoPrecio(Boolean isPermisoBusquedaUtilidadTipoPrecio) {
		this.isPermisoBusquedaUtilidadTipoPrecio = isPermisoBusquedaUtilidadTipoPrecio;
	}

	public Boolean getIsPermisoReporteUtilidadTipoPrecio() {
		return isPermisoReporteUtilidadTipoPrecio;
	}

	public void setIsPermisoReporteUtilidadTipoPrecio(Boolean isPermisoReporteUtilidadTipoPrecio) {
		this.isPermisoReporteUtilidadTipoPrecio = isPermisoReporteUtilidadTipoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionMedioUtilidadTipoPrecio() {
		return isPermisoPaginacionMedioUtilidadTipoPrecio;
	}

	public void setIsPermisoPaginacionMedioUtilidadTipoPrecio(Boolean isPermisoPaginacionMedioUtilidadTipoPrecio) {
		this.isPermisoPaginacionMedioUtilidadTipoPrecio = isPermisoPaginacionMedioUtilidadTipoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionTodoUtilidadTipoPrecio() {
		return isPermisoPaginacionTodoUtilidadTipoPrecio;
	}

	public void setIsPermisoPaginacionTodoUtilidadTipoPrecio(Boolean isPermisoPaginacionTodoUtilidadTipoPrecio) {
		this.isPermisoPaginacionTodoUtilidadTipoPrecio = isPermisoPaginacionTodoUtilidadTipoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionAltoUtilidadTipoPrecio() {
		return isPermisoPaginacionAltoUtilidadTipoPrecio;
	}

	public void setIsPermisoPaginacionAltoUtilidadTipoPrecio(Boolean isPermisoPaginacionAltoUtilidadTipoPrecio) {
		this.isPermisoPaginacionAltoUtilidadTipoPrecio = isPermisoPaginacionAltoUtilidadTipoPrecio;
	}
	
	public Boolean getIsPermisoCopiarUtilidadTipoPrecio() {
		return isPermisoCopiarUtilidadTipoPrecio;
	}

	public void setIsPermisoCopiarUtilidadTipoPrecio(Boolean isPermisoCopiarUtilidadTipoPrecio) {
		this.isPermisoCopiarUtilidadTipoPrecio = isPermisoCopiarUtilidadTipoPrecio;
	}
	
	public Boolean getIsPermisoVerFormUtilidadTipoPrecio() {
		return isPermisoVerFormUtilidadTipoPrecio;
	}

	public void setIsPermisoVerFormUtilidadTipoPrecio(Boolean isPermisoVerFormUtilidadTipoPrecio) {
		this.isPermisoVerFormUtilidadTipoPrecio = isPermisoVerFormUtilidadTipoPrecio;
	}
	
	public Boolean getIsPermisoDuplicarUtilidadTipoPrecio() {
		return isPermisoDuplicarUtilidadTipoPrecio;
	}

	public void setIsPermisoDuplicarUtilidadTipoPrecio(Boolean isPermisoDuplicarUtilidadTipoPrecio) {
		this.isPermisoDuplicarUtilidadTipoPrecio = isPermisoDuplicarUtilidadTipoPrecio;
	}
	
	public Boolean getIsPermisoOrdenUtilidadTipoPrecio() {
		return isPermisoOrdenUtilidadTipoPrecio;
	}

	public void setIsPermisoOrdenUtilidadTipoPrecio(Boolean isPermisoOrdenUtilidadTipoPrecio) {
		this.isPermisoOrdenUtilidadTipoPrecio = isPermisoOrdenUtilidadTipoPrecio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoUtilidadTipoPrecio() {
		return isVisibilidadCeldaNuevoUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaNuevoUtilidadTipoPrecio(Boolean isVisibilidadCeldaNuevoUtilidadTipoPrecio) {
		this.isVisibilidadCeldaNuevoUtilidadTipoPrecio = isVisibilidadCeldaNuevoUtilidadTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUtilidadTipoPrecio() {
		return isVisibilidadCeldaDuplicarUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaDuplicarUtilidadTipoPrecio(Boolean isVisibilidadCeldaDuplicarUtilidadTipoPrecio) {
		this.isVisibilidadCeldaDuplicarUtilidadTipoPrecio = isVisibilidadCeldaDuplicarUtilidadTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUtilidadTipoPrecio() {
		return isVisibilidadCeldaCopiarUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaCopiarUtilidadTipoPrecio(Boolean isVisibilidadCeldaCopiarUtilidadTipoPrecio) {
		this.isVisibilidadCeldaCopiarUtilidadTipoPrecio = isVisibilidadCeldaCopiarUtilidadTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUtilidadTipoPrecio() {
		return isVisibilidadCeldaVerFormUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaVerFormUtilidadTipoPrecio(Boolean isVisibilidadCeldaVerFormUtilidadTipoPrecio) {
		this.isVisibilidadCeldaVerFormUtilidadTipoPrecio = isVisibilidadCeldaVerFormUtilidadTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUtilidadTipoPrecio() {
		return isVisibilidadCeldaOrdenUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaOrdenUtilidadTipoPrecio(Boolean isVisibilidadCeldaOrdenUtilidadTipoPrecio) {
		this.isVisibilidadCeldaOrdenUtilidadTipoPrecio = isVisibilidadCeldaOrdenUtilidadTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio() {
		return isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio(Boolean isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio) {
		this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio = isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUtilidadTipoPrecio() {
		return isVisibilidadCeldaModificarUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaModificarUtilidadTipoPrecio(Boolean isVisibilidadCeldaModificarUtilidadTipoPrecio) {
		this.isVisibilidadCeldaModificarUtilidadTipoPrecio = isVisibilidadCeldaModificarUtilidadTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUtilidadTipoPrecio() {
		return isVisibilidadCeldaActualizarUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaActualizarUtilidadTipoPrecio(Boolean isVisibilidadCeldaActualizarUtilidadTipoPrecio) {
		this.isVisibilidadCeldaActualizarUtilidadTipoPrecio = isVisibilidadCeldaActualizarUtilidadTipoPrecio;
	}

	public Boolean getIsVisibilidadCeldaEliminarUtilidadTipoPrecio() {
		return isVisibilidadCeldaEliminarUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaEliminarUtilidadTipoPrecio(Boolean isVisibilidadCeldaEliminarUtilidadTipoPrecio) {
		this.isVisibilidadCeldaEliminarUtilidadTipoPrecio = isVisibilidadCeldaEliminarUtilidadTipoPrecio;
	}

	public Boolean getIsVisibilidadCeldaCancelarUtilidadTipoPrecio() {
		return isVisibilidadCeldaCancelarUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaCancelarUtilidadTipoPrecio(Boolean isVisibilidadCeldaCancelarUtilidadTipoPrecio) {
		this.isVisibilidadCeldaCancelarUtilidadTipoPrecio = isVisibilidadCeldaCancelarUtilidadTipoPrecio;
	}

	public Boolean getIsVisibilidadCeldaGuardarUtilidadTipoPrecio() {
		return isVisibilidadCeldaGuardarUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaGuardarUtilidadTipoPrecio(Boolean isVisibilidadCeldaGuardarUtilidadTipoPrecio) {
		this.isVisibilidadCeldaGuardarUtilidadTipoPrecio = isVisibilidadCeldaGuardarUtilidadTipoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio() {
		return isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio(Boolean isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio) {
		this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio = isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio;
	}
		
	public UtilidadTipoPrecioSessionBean getutilidadtipoprecioSessionBean() {
		return this.utilidadtipoprecioSessionBean;
	}
	
	public void setutilidadtipoprecioSessionBean(UtilidadTipoPrecioSessionBean utilidadtipoprecioSessionBean) {
		this.utilidadtipoprecioSessionBean=utilidadtipoprecioSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(utilidadtipoprecio,null);
				this.setActualParaGuardarSucursalForeignKey(utilidadtipoprecio,null);
				this.setActualParaGuardarTipoPrecioForeignKey(utilidadtipoprecio,null);
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
	
	public void bugActualizarReferenciaActual(UtilidadTipoPrecio utilidadtipoprecio,UtilidadTipoPrecio utilidadtipoprecioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUtilidadTipoPrecio(utilidadtipoprecio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		utilidadtipoprecioAux.setId(utilidadtipoprecio.getId());
		utilidadtipoprecioAux.setVersionRow(utilidadtipoprecio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessUtilidadTipoPrecio();
		
			int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = utilidadtipoprecioValidator.getInvalidValues(this.utilidadtipoprecio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			utilidadtipoprecioLogic.setDatosCliente(datosCliente);
			utilidadtipoprecioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				utilidadtipoprecioAux=new  UtilidadTipoPrecio();
				
				utilidadtipoprecioAux.setIsNew(true);
				utilidadtipoprecioAux.setIsChanged(true);
				
				utilidadtipoprecioAux.setUtilidadTipoPrecioOriginal(this.utilidadtipoprecio);
				
				utilidadtipoprecioAux.setId(this.utilidadtipoprecio.getId());	
				utilidadtipoprecioAux.setVersionRow(this.utilidadtipoprecio.getVersionRow());	
				utilidadtipoprecioAux.setid_empresa(this.utilidadtipoprecio.getid_empresa());	
				utilidadtipoprecioAux.setid_sucursal(this.utilidadtipoprecio.getid_sucursal());	
				utilidadtipoprecioAux.setid_tipo_precio(this.utilidadtipoprecio.getid_tipo_precio());	
				utilidadtipoprecioAux.setporcentaje(this.utilidadtipoprecio.getporcentaje());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(utilidadtipoprecioAux,utilidadtipoprecioLogic.getUtilidadTipoPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadtipoprecioAux,utilidadtipoprecios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipoprecioLogic.saveUtilidadTipoPrecios();//WithConnection
						//utilidadtipoprecioLogic.getSetVersionRowUtilidadTipoPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.utilidadtipoprecio,utilidadtipoprecioAux);
					
					this.refrescarForeignKeysDescripcionesUtilidadTipoPrecio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								utilidadtipoprecioLogic.saveUtilidadTipoPrecioRelaciones(utilidadtipoprecioAux);//WithConnection
								//utilidadtipoprecioLogic.getSetVersionRowUtilidadTipoPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.utilidadtipoprecio,utilidadtipoprecioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(utilidadtipoprecioAux,utilidadtipoprecioLogic.getUtilidadTipoPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(utilidadtipoprecioAux,utilidadtipoprecios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.utilidadtipoprecio,utilidadtipoprecioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				utilidadtipoprecioAux=new  UtilidadTipoPrecio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado() 
					|| (this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado() && this.utilidadtipoprecio.getId()>=0)) {
						
					utilidadtipoprecioAux.setIsNew(false);
				}
				
				utilidadtipoprecioAux.setIsDeleted(false);
			
				utilidadtipoprecioAux.setId(this.utilidadtipoprecio.getId());	
				utilidadtipoprecioAux.setVersionRow(this.utilidadtipoprecio.getVersionRow());	
				utilidadtipoprecioAux.setid_empresa(this.utilidadtipoprecio.getid_empresa());	
				utilidadtipoprecioAux.setid_sucursal(this.utilidadtipoprecio.getid_sucursal());	
				utilidadtipoprecioAux.setid_tipo_precio(this.utilidadtipoprecio.getid_tipo_precio());	
				utilidadtipoprecioAux.setporcentaje(this.utilidadtipoprecio.getporcentaje());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(utilidadtipoprecioAux,utilidadtipoprecioLogic.getUtilidadTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadtipoprecioAux,utilidadtipoprecios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipoprecioLogic.saveUtilidadTipoPrecios();//WithConnection
						//utilidadtipoprecioLogic.getSetVersionRowUtilidadTipoPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.utilidadtipoprecio,utilidadtipoprecioAux);
					
					this.refrescarForeignKeysDescripcionesUtilidadTipoPrecio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								utilidadtipoprecioLogic.saveUtilidadTipoPrecioRelaciones(utilidadtipoprecioAux);//WithConnection
								//utilidadtipoprecioLogic.getSetVersionRowUtilidadTipoPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.utilidadtipoprecio,utilidadtipoprecioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(utilidadtipoprecioAux,utilidadtipoprecioLogic.getUtilidadTipoPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(utilidadtipoprecioAux,utilidadtipoprecios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.utilidadtipoprecio,utilidadtipoprecioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				utilidadtipoprecioAux=new  UtilidadTipoPrecio();
				
				utilidadtipoprecioAux.setIsNew(false);
				utilidadtipoprecioAux.setIsChanged(false);
				
				utilidadtipoprecioAux.setIsDeleted(true);
				
				utilidadtipoprecioAux.setId(this.utilidadtipoprecio.getId());	
				utilidadtipoprecioAux.setVersionRow(this.utilidadtipoprecio.getVersionRow());	
				utilidadtipoprecioAux.setid_empresa(this.utilidadtipoprecio.getid_empresa());	
				utilidadtipoprecioAux.setid_sucursal(this.utilidadtipoprecio.getid_sucursal());	
				utilidadtipoprecioAux.setid_tipo_precio(this.utilidadtipoprecio.getid_tipo_precio());	
				utilidadtipoprecioAux.setporcentaje(this.utilidadtipoprecio.getporcentaje());	
				
				if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.utilidadtipoprecioAux.getId()>=0) {	
						this.utilidadtipopreciosEliminados.add(utilidadtipoprecioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(utilidadtipoprecioAux,utilidadtipoprecioLogic.getUtilidadTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadtipoprecioAux,utilidadtipoprecios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipoprecioLogic.saveUtilidadTipoPrecios();//WithConnection
						//utilidadtipoprecioLogic.getSetVersionRowUtilidadTipoPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								utilidadtipoprecioLogic.saveUtilidadTipoPrecioRelaciones(utilidadtipoprecioAux);//WithConnection
								//utilidadtipoprecioLogic.getSetVersionRowUtilidadTipoPrecios();//WithConnection
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
							if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(utilidadtipoprecioAux,utilidadtipoprecioLogic.getUtilidadTipoPrecios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(utilidadtipoprecioAux,utilidadtipoprecios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().addAll(this.utilidadtipopreciosEliminados);
					
					utilidadtipoprecioLogic.saveUtilidadTipoPrecios();//WithConnection
					//utilidadtipoprecioLogic.getSetVersionRowUtilidadTipoPrecios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesUtilidadTipoPrecio();
				
				this.utilidadtipopreciosEliminados= new ArrayList<UtilidadTipoPrecio>();		
			}
			
			if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Utilidad Tipo Precio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.utilidadtipoprecio=utilidadtipoprecioAux;
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
      		//this.finishProcessUtilidadTipoPrecio();
      	}
		
	}	
	
	public void actualizarRelaciones(UtilidadTipoPrecio utilidadtipoprecioLocal) throws Exception {
		
		if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(UtilidadTipoPrecio utilidadtipoprecioLocal) throws Exception {	
		if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				utilidadtipoprecioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				utilidadtipoprecioLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPrecioDetalleFormJInternalFrame.class)) {
				TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrameLocal=(TipoPrecioBeanSwingJInternalFrame) ((TipoPrecioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprecioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPrecio(tipoprecioBeanSwingJInternalFrameLocal.gettipoprecio(),true);
				tipoprecioBeanSwingJInternalFrameLocal.actualizarLista(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio,this.tipopreciosForeignKey);

				tipoprecioBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio);

				utilidadtipoprecioLocal.setTipoPrecio(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio);

				this.addItemDefectoCombosForeignKeyTipoPrecio();
				this.cargarCombosFrameTipoPreciosForeignKey("Formulario");
				this.setActualTipoPrecioForeignKey(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUtilidadTipoPrecioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = utilidadtipoprecioValidator.getInvalidValues(this.utilidadtipoprecio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(UtilidadTipoPrecio utilidadtipoprecio,List<UtilidadTipoPrecio> utilidadtipoprecios) throws Exception {
		try	{		
			UtilidadTipoPrecioConstantesFunciones.actualizarLista(utilidadtipoprecio,utilidadtipoprecios,this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(UtilidadTipoPrecio utilidadtipoprecio,List<UtilidadTipoPrecio> utilidadtipoprecios) throws Exception {
		try	{			
			UtilidadTipoPrecioConstantesFunciones.actualizarSelectedLista(utilidadtipoprecio,utilidadtipoprecios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<UtilidadTipoPrecio> utilidadtipopreciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				utilidadtipopreciosLocal=this.utilidadtipoprecioLogic.getUtilidadTipoPrecios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				utilidadtipopreciosLocal=this.utilidadtipoprecios;
			}
			//ARCHITECTURE
		
			for(UtilidadTipoPrecio utilidadtipoprecioLocal:utilidadtipopreciosLocal) {
				if(this.permiteMantenimiento(utilidadtipoprecioLocal) && utilidadtipoprecioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+UtilidadTipoPrecioConstantesFunciones.getUtilidadTipoPrecioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UtilidadTipoPrecioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelid_empresaUtilidadTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadTipoPrecioConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelid_sucursalUtilidadTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadTipoPrecioConstantesFunciones.IDTIPOPRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelid_tipo_precioUtilidadTipoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadTipoPrecioConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelporcentajeUtilidadTipoPrecio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelid_empresaUtilidadTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelid_sucursalUtilidadTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelid_tipo_precioUtilidadTipoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelporcentajeUtilidadTipoPrecio,"");
		
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
		this.iIdNuevoUtilidadTipoPrecio--;	
		
		
		this.utilidadtipoprecioAux=new UtilidadTipoPrecio();
		
		this.utilidadtipoprecioAux.setId(this.iIdNuevoUtilidadTipoPrecio);
		this.utilidadtipoprecioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().add(this.utilidadtipoprecioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.utilidadtipoprecios.add(this.utilidadtipoprecioAux);
		}
		//ARCHITECTURE
		
		this.utilidadtipoprecio=this.utilidadtipoprecioAux;
		
		if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUtilidadTipoPrecio(this.utilidadtipoprecio);
			this.setVariablesObjetoActualToFormularioForeignKeyUtilidadTipoPrecio(this.utilidadtipoprecio);
		}
				
		//this.setDefaultControlesUtilidadTipoPrecio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUtilidadTipoPrecio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUtilidadTipoPrecio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadTipoPrecio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecioBean,this.utilidadtipoprecio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
			classes=UtilidadTipoPrecioConstantesFunciones.getClassesRelationshipsOfUtilidadTipoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.utilidadtipoprecioReturnGeneral=utilidadtipoprecioLogic.procesarEventosUtilidadTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadtipoprecioLogic.getUtilidadTipoPrecios(),this.utilidadtipoprecio,this.utilidadtipoprecioParameterGeneral,this.isEsNuevoUtilidadTipoPrecio,classes);//this.utilidadtipoprecioLogic.getUtilidadTipoPrecio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUtilidadTipoPrecio(this.utilidadtipoprecioReturnGeneral,this.utilidadtipoprecioBean,false);
		
		if(this.utilidadtipoprecioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUtilidadTipoPrecio(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUtilidadTipoPrecio(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio());
		}
		
		if(this.utilidadtipoprecioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUtilidadTipoPrecio(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio(),classes);//this.utilidadtipoprecioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUtilidadTipoPrecio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUtilidadTipoPrecio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.RecargarFormUtilidadTipoPrecio(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUtilidadTipoPrecio(false);
						
			if(utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadTipoPrecio();
			}
			
			this.actualizarVisualTableDatosUtilidadTipoPrecio();
			
			this.jTableDatosUtilidadTipoPrecio.setRowSelectionInterval(this.getIndiceNuevoUtilidadTipoPrecio(), this.getIndiceNuevoUtilidadTipoPrecio());
			
			this.seleccionarFilaTablaUtilidadTipoPrecioActual();
						
			this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUtilidadTipoPrecio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTextFieldporcentajeUtilidadTipoPrecio.setEnabled(isHabilitar && this.utilidadtipoprecioConstantesFunciones.activarporcentajeUtilidadTipoPrecio);	
		//
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.setEnabled(isHabilitar && this.utilidadtipoprecioConstantesFunciones.activarid_empresaUtilidadTipoPrecio);//
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.setEnabled(isHabilitar && this.utilidadtipoprecioConstantesFunciones.activarid_sucursalUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.setEnabled(isHabilitar && this.utilidadtipoprecioConstantesFunciones.activarid_tipo_precioUtilidadTipoPrecio);
	};
	
	public void setDefaultControlesUtilidadTipoPrecio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUtilidadTipoPrecio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.utilidadtipoprecioSessionBean.setConGuardarRelaciones(true);			
			this.utilidadtipoprecioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTabbedPaneRelacionesUtilidadTipoPrecio.setVisible(true);
			
					
		} else {
			//this.utilidadtipoprecioSessionBean.setConGuardarRelaciones(false);			
			this.utilidadtipoprecioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTabbedPaneRelacionesUtilidadTipoPrecio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoUtilidadTipoPrecio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
				if(utilidadtipoprecioAux.getId().equals(this.iIdNuevoUtilidadTipoPrecio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecios) {
				if(utilidadtipoprecioAux.getId().equals(this.iIdNuevoUtilidadTipoPrecio)) {
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
	
	public int getIndiceActualUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
				if(utilidadtipoprecioAux.getId().equals(utilidadtipoprecio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecios) {
				if(utilidadtipoprecioAux.getId().equals(utilidadtipoprecio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
				if(utilidadtipoprecioAux.getUtilidadTipoPrecioOriginal().getId().equals(utilidadtipoprecioOriginal.getId())) {
					existe=true;
					utilidadtipoprecioOriginal.setId(utilidadtipoprecioAux.getId());
					utilidadtipoprecioOriginal.setVersionRow(utilidadtipoprecioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecios) {
				if(utilidadtipoprecioAux.getUtilidadTipoPrecioOriginal().getId().equals(utilidadtipoprecioOriginal.getId())) {
					existe=true;
					utilidadtipoprecioOriginal.setId(utilidadtipoprecioAux.getId());
					utilidadtipoprecioOriginal.setVersionRow(utilidadtipoprecioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUtilidadTipoPrecio(Boolean esParaCancelar) throws Exception {
		utilidadtipopreciosAux=new ArrayList<UtilidadTipoPrecio>();
		utilidadtipoprecioAux=new UtilidadTipoPrecio();
		
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
					if(utilidadtipoprecioAux.getId()<0) {
						utilidadtipopreciosAux.add(utilidadtipoprecioAux);
					}		
				}
				this.iIdNuevoUtilidadTipoPrecio=0L;
				this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().removeAll(utilidadtipopreciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecios) {
					if(utilidadtipoprecioAux.getId()<0) {
						utilidadtipopreciosAux.add(utilidadtipoprecioAux);
					}		
				}
				this.iIdNuevoUtilidadTipoPrecio=0L;
				this.utilidadtipoprecios.removeAll(utilidadtipopreciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUtilidadTipoPrecio 
					&& this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().size()>0
					) {
					utilidadtipoprecioAux=this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().get(this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().size() - 1);
				
					if(utilidadtipoprecioAux.getId()<0) {
						this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().remove(utilidadtipoprecioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUtilidadTipoPrecio && this.utilidadtipoprecios.size()>0) {
					utilidadtipoprecioAux=this.utilidadtipoprecios.get(this.utilidadtipoprecios.size() - 1);
				
					if(utilidadtipoprecioAux.getId()<0) {
						this.utilidadtipoprecios.remove(utilidadtipoprecioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUtilidadTipoPrecio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(utilidadtipoprecio.getId()<0) {
				this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().remove(this.utilidadtipoprecio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(utilidadtipoprecio.getId()<0) {
				this.utilidadtipoprecios.remove(this.utilidadtipoprecio);
			}
		}			
	}
	
	public void setEstadosInicialesUtilidadTipoPrecio(List<UtilidadTipoPrecio> utilidadtipopreciosAux) throws Exception {
		UtilidadTipoPrecioConstantesFunciones.setEstadosInicialesUtilidadTipoPrecio(utilidadtipopreciosAux);
	}
	
	public void setEstadosInicialesUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecioAux) throws Exception {
		UtilidadTipoPrecioConstantesFunciones.setEstadosInicialesUtilidadTipoPrecio(utilidadtipoprecioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUtilidadTipoPrecioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUtilidadTipoPrecioActual()) {
				if(!this.isEsNuevoUtilidadTipoPrecio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUtilidadTipoPrecio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUtilidadTipoPrecioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Utilidad Tipo Precio ?", "MANTENIMIENTO DE Utilidad Tipo Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(UtilidadTipoPrecio utilidadtipoprecio) throws Exception {
		UtilidadTipoPrecioConstantesFunciones.seleccionarAsignar(this.utilidadtipoprecio,utilidadtipoprecio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUtilidadTipoPrecio=this.isPermisoActualizarOriginalUtilidadTipoPrecio;
			
			
			this.seleccionarAsignar(utilidadtipoprecio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UtilidadTipoPrecioConstantesFunciones.quitarEspaciosUtilidadTipoPrecio(this.utilidadtipoprecio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.utilidadtipoprecioSessionBean.setsFuncionBusquedaRapida(this.utilidadtipoprecioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoUtilidadTipoPrecio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUtilidadTipoPrecio(esParaCancelar);				
				this.cancelarNuevoUtilidadTipoPrecio(esParaCancelar);								
			}
			
			this.utilidadtipoprecio=new UtilidadTipoPrecio();
			
			this.inicializarUtilidadTipoPrecio();
			
			this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUtilidadTipoPrecio() throws Exception {
		try {
			UtilidadTipoPrecioConstantesFunciones.inicializarUtilidadTipoPrecio(this.utilidadtipoprecio);
			
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
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUtilidadTipoPrecios(String sAccionBusqueda,List<UtilidadTipoPrecio> utilidadtipopreciosParaReportes) throws Exception {
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
					sPathReporteFinal="UtilidadTipoPrecio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UtilidadTipoPrecioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UtilidadTipoPrecioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="UtilidadTipoPrecio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Utilidad Tipo Precioes");		
		parameters.put("busquedapor", UtilidadTipoPrecioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUtilidadTipoPrecio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UtilidadTipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UtilidadTipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUtilidadTipoPrecio=new JRBeanArrayDataSource(UtilidadTipoPrecioJInternalFrame.TraerUtilidadTipoPrecioBeans(utilidadtipopreciosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUtilidadTipoPrecio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UtilidadTipoPrecioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UtilidadTipoPrecioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UtilidadTipoPrecioBean.TraerUtilidadTipoPrecioBeans(utilidadtipopreciosParaReportes).toArray()));
							
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
				this.generarExcelReporteUtilidadTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,utilidadtipopreciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUtilidadTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,utilidadtipopreciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecioActionPerformed(null);
					//this.generarExcelReporteUtilidadTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,utilidadtipopreciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUtilidadTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,utilidadtipopreciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUtilidadTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,utilidadtipopreciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUtilidadTipoPrecios(sAccionBusqueda,sTipoArchivoReporte,utilidadtipopreciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUtilidadTipoPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadTipoPrecio> utilidadtipopreciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadtipoprecio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadTipoPrecios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUtilidadTipoPrecio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(UtilidadTipoPrecio utilidadtipoprecio : utilidadtipopreciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UtilidadTipoPrecioConstantesFunciones.generarExcelReporteDataUtilidadTipoPrecio("NORMAL",row,workbook,utilidadtipoprecio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUtilidadTipoPrecio(String sTipo,Row row,Workbook workbook) {
		
		UtilidadTipoPrecioConstantesFunciones.generarExcelReporteHeaderUtilidadTipoPrecio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUtilidadTipoPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadTipoPrecio> utilidadtipopreciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadtipoprecio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadTipoPrecios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(UtilidadTipoPrecio utilidadtipoprecio : utilidadtipopreciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.getUtilidadTipoPrecioDescripcion(utilidadtipoprecio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadtipoprecio.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadtipoprecio.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadtipoprecio.gettipoprecio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadtipoprecio.getporcentaje());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUtilidadTipoPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadTipoPrecio> utilidadtipopreciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<UtilidadTipoPrecio> utilidadtipopreciosRespaldo=null;
		
		classes=UtilidadTipoPrecioConstantesFunciones.getClassesRelationshipsOfUtilidadTipoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.utilidadtipoprecioLogic.setDatosCliente(this.datosCliente);
		this.utilidadtipoprecioLogic.setDatosDeep(this.datosDeep);
		this.utilidadtipoprecioLogic.setIsConDeep(true);
		
		utilidadtipopreciosRespaldo=this.utilidadtipoprecioLogic.getUtilidadTipoPrecios();
		
		this.utilidadtipoprecioLogic.setUtilidadTipoPrecios(utilidadtipopreciosParaReportes);	
		this.utilidadtipoprecioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		utilidadtipopreciosParaReportes=this.utilidadtipoprecioLogic.getUtilidadTipoPrecios();
		this.utilidadtipoprecioLogic.setUtilidadTipoPrecios(utilidadtipopreciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadtipoprecio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadTipoPrecios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUtilidadTipoPrecio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(UtilidadTipoPrecio utilidadtipoprecio : utilidadtipopreciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUtilidadTipoPrecio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UtilidadTipoPrecioConstantesFunciones.generarExcelReporteDataUtilidadTipoPrecio("NORMAL",row,workbook,utilidadtipoprecio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.getUtilidadTipoPrecioDescripcion(utilidadtipoprecio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUtilidadTipoPrecio() throws Exception {		
		this.startProcessUtilidadTipoPrecio(true);
	}
	
	public void startProcessUtilidadTipoPrecio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUtilidadTipoPrecio ,this.jPanelParametrosReportesUtilidadTipoPrecio, this.jScrollPanelDatosUtilidadTipoPrecio,this.jPanelPaginacionUtilidadTipoPrecio, this.jScrollPanelDatosEdicionUtilidadTipoPrecio, this.jPanelAccionesUtilidadTipoPrecio,this.jPanelAccionesFormularioUtilidadTipoPrecio,this.jmenuBarUtilidadTipoPrecio,this.jmenuBarDetalleUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,this.jTtoolBarDetalleUtilidadTipoPrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasUtilidadTipoPrecio=this.jTabbedPaneBusquedasUtilidadTipoPrecio; 
		
		final JPanel jPanelParametrosReportesUtilidadTipoPrecio=this.jPanelParametrosReportesUtilidadTipoPrecio;
		//final JScrollPane jScrollPanelDatosUtilidadTipoPrecio=this.jScrollPanelDatosUtilidadTipoPrecio;
		final JTable jTableDatosUtilidadTipoPrecio=this.jTableDatosUtilidadTipoPrecio;		
		final JPanel jPanelPaginacionUtilidadTipoPrecio=this.jPanelPaginacionUtilidadTipoPrecio;
		//final JScrollPane jScrollPanelDatosEdicionUtilidadTipoPrecio=this.jScrollPanelDatosEdicionUtilidadTipoPrecio;
		final JPanel jPanelAccionesUtilidadTipoPrecio=this.jPanelAccionesUtilidadTipoPrecio;
		
		JPanel jPanelCamposAuxiliarUtilidadTipoPrecio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUtilidadTipoPrecio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			jPanelCamposAuxiliarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jPanelCamposUtilidadTipoPrecio;
			jPanelAccionesFormularioAuxiliarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jPanelAccionesFormularioUtilidadTipoPrecio;
		}
		
		final JPanel jPanelCamposUtilidadTipoPrecio=jPanelCamposAuxiliarUtilidadTipoPrecio;
		final JPanel jPanelAccionesFormularioUtilidadTipoPrecio=jPanelAccionesFormularioAuxiliarUtilidadTipoPrecio;
		
		
		final JMenuBar jmenuBarUtilidadTipoPrecio=this.jmenuBarUtilidadTipoPrecio;
		final JToolBar jTtoolBarUtilidadTipoPrecio=this.jTtoolBarUtilidadTipoPrecio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUtilidadTipoPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUtilidadTipoPrecio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			jmenuBarDetalleAuxiliarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jmenuBarDetalleUtilidadTipoPrecio;
			jTtoolBarDetalleAuxiliarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTtoolBarDetalleUtilidadTipoPrecio;
		}
		
		final JMenuBar jmenuBarDetalleUtilidadTipoPrecio=jmenuBarDetalleAuxiliarUtilidadTipoPrecio;
		final JToolBar jTtoolBarDetalleUtilidadTipoPrecio=jTtoolBarDetalleAuxiliarUtilidadTipoPrecio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUtilidadTipoPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUtilidadTipoPrecio;
			processRunnable.jTableDatos=jTableDatosUtilidadTipoPrecio;
			processRunnable.jPanelCampos=jPanelCamposUtilidadTipoPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionUtilidadTipoPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesUtilidadTipoPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUtilidadTipoPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarUtilidadTipoPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUtilidadTipoPrecio;
			processRunnable.jTtoolBar=jTtoolBarUtilidadTipoPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUtilidadTipoPrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUtilidadTipoPrecio ,jPanelParametrosReportesUtilidadTipoPrecio,jTableDatosUtilidadTipoPrecio, /*jScrollPanelDatosUtilidadTipoPrecio,*/jPanelCamposUtilidadTipoPrecio,jPanelPaginacionUtilidadTipoPrecio, /*jScrollPanelDatosEdicionUtilidadTipoPrecio,*/ jPanelAccionesUtilidadTipoPrecio,jPanelAccionesFormularioUtilidadTipoPrecio,jmenuBarUtilidadTipoPrecio,jmenuBarDetalleUtilidadTipoPrecio,jTtoolBarUtilidadTipoPrecio,jTtoolBarDetalleUtilidadTipoPrecio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUtilidadTipoPrecio ,jPanelParametrosReportesUtilidadTipoPrecio, jScrollPanelDatosUtilidadTipoPrecio,jPanelPaginacionUtilidadTipoPrecio, jScrollPanelDatosEdicionUtilidadTipoPrecio, jPanelAccionesUtilidadTipoPrecio,jPanelAccionesFormularioUtilidadTipoPrecio,jmenuBarUtilidadTipoPrecio,jmenuBarDetalleUtilidadTipoPrecio,jTtoolBarUtilidadTipoPrecio,jTtoolBarDetalleUtilidadTipoPrecio);
						
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
	
	public void finishProcessUtilidadTipoPrecio() {// throws Exception 
		this.finishProcessUtilidadTipoPrecio(true);
	}
	
	public void finishProcessUtilidadTipoPrecio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUtilidadTipoPrecio ,this.jPanelParametrosReportesUtilidadTipoPrecio, this.jScrollPanelDatosUtilidadTipoPrecio,this.jPanelPaginacionUtilidadTipoPrecio, this.jScrollPanelDatosEdicionUtilidadTipoPrecio, this.jPanelAccionesUtilidadTipoPrecio,this.jPanelAccionesFormularioUtilidadTipoPrecio,this.jmenuBarUtilidadTipoPrecio,this.jmenuBarDetalleUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,this.jTtoolBarDetalleUtilidadTipoPrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasUtilidadTipoPrecio=this.jTabbedPaneBusquedasUtilidadTipoPrecio; 
		
		final JPanel jPanelParametrosReportesUtilidadTipoPrecio=this.jPanelParametrosReportesUtilidadTipoPrecio;
		//final JScrollPane jScrollPanelDatosUtilidadTipoPrecio=this.jScrollPanelDatosUtilidadTipoPrecio;
		final JTable jTableDatosUtilidadTipoPrecio=this.jTableDatosUtilidadTipoPrecio;		
		final JPanel jPanelPaginacionUtilidadTipoPrecio=this.jPanelPaginacionUtilidadTipoPrecio;
		//final JScrollPane jScrollPanelDatosEdicionUtilidadTipoPrecio=this.jScrollPanelDatosEdicionUtilidadTipoPrecio;
		final JPanel jPanelAccionesUtilidadTipoPrecio=this.jPanelAccionesUtilidadTipoPrecio;
		
		JPanel jPanelCamposAuxiliarUtilidadTipoPrecio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUtilidadTipoPrecio=new JPanel();
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			jPanelCamposAuxiliarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jPanelCamposUtilidadTipoPrecio;
			jPanelAccionesFormularioAuxiliarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jPanelAccionesFormularioUtilidadTipoPrecio;
		}
		
		final JPanel jPanelCamposUtilidadTipoPrecio=jPanelCamposAuxiliarUtilidadTipoPrecio;
		final JPanel jPanelAccionesFormularioUtilidadTipoPrecio=jPanelAccionesFormularioAuxiliarUtilidadTipoPrecio;
		
		
		final JMenuBar jmenuBarUtilidadTipoPrecio=this.jmenuBarUtilidadTipoPrecio;		
		final JToolBar jTtoolBarUtilidadTipoPrecio=this.jTtoolBarUtilidadTipoPrecio;
				
		JMenuBar jmenuBarDetalleAuxiliarUtilidadTipoPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUtilidadTipoPrecio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			jmenuBarDetalleAuxiliarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jmenuBarDetalleUtilidadTipoPrecio;
			jTtoolBarDetalleAuxiliarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTtoolBarDetalleUtilidadTipoPrecio;		
		}
		
		final JMenuBar jmenuBarDetalleUtilidadTipoPrecio=jmenuBarDetalleAuxiliarUtilidadTipoPrecio;
		final JToolBar jTtoolBarDetalleUtilidadTipoPrecio=jTtoolBarDetalleAuxiliarUtilidadTipoPrecio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUtilidadTipoPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUtilidadTipoPrecio;
			processRunnable.jTableDatos=jTableDatosUtilidadTipoPrecio;
			processRunnable.jPanelCampos=jPanelCamposUtilidadTipoPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionUtilidadTipoPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesUtilidadTipoPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUtilidadTipoPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarUtilidadTipoPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUtilidadTipoPrecio;
			processRunnable.jTtoolBar=jTtoolBarUtilidadTipoPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUtilidadTipoPrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUtilidadTipoPrecio ,jPanelParametrosReportesUtilidadTipoPrecio, jTableDatosUtilidadTipoPrecio,/*jScrollPanelDatosUtilidadTipoPrecio,*/jPanelCamposUtilidadTipoPrecio,jPanelPaginacionUtilidadTipoPrecio, /*jScrollPanelDatosEdicionUtilidadTipoPrecio,*/ jPanelAccionesUtilidadTipoPrecio,jPanelAccionesFormularioUtilidadTipoPrecio,jmenuBarUtilidadTipoPrecio,jmenuBarDetalleUtilidadTipoPrecio,jTtoolBarUtilidadTipoPrecio,jTtoolBarDetalleUtilidadTipoPrecio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUtilidadTipoPrecio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUtilidadTipoPrecio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUtilidadTipoPrecio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUtilidadTipoPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUtilidadTipoPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUtilidadTipoPrecio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUtilidadTipoPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUtilidadTipoPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUtilidadTipoPrecio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.utilidadtipoprecioConstantesFunciones.getsFinalQueryUtilidadTipoPrecio();
		String  finalQueryPaginacionTodos=this.utilidadtipoprecioConstantesFunciones.getsFinalQueryUtilidadTipoPrecio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=UtilidadTipoPrecioConstantesFunciones.getArrayColumnasGlobalesNoUtilidadTipoPrecio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UtilidadTipoPrecioConstantesFunciones.getArrayColumnasGlobalesUtilidadTipoPrecio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UtilidadTipoPrecioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.utilidadtipopreciosEliminados= new ArrayList<UtilidadTipoPrecio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUtilidadTipoPrecio();
		
				///*UtilidadTipoPrecioSessionBean*/this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
			
			if(this.utilidadtipoprecioSessionBean==null) {
				this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
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
					this.iNumeroPaginacion=UtilidadTipoPrecioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UtilidadTipoPrecioConstantesFunciones.getClassesForeignKeysOfUtilidadTipoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/utilidadtipoprecio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			utilidadtipopreciosAux= new ArrayList<UtilidadTipoPrecio>();
			
				
			utilidadtipoprecioLogic.setDatosCliente(this.datosCliente);
			utilidadtipoprecioLogic.setDatosDeep(this.datosDeep);
			utilidadtipoprecioLogic.setIsConDeep(true);
			
			
			utilidadtipoprecioLogic.getUtilidadTipoPrecioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					utilidadtipoprecioLogic.getTodosUtilidadTipoPrecios(finalQueryGlobal,pagination);
					
					//utilidadtipoprecioLogic.getTodosUtilidadTipoPreciosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(utilidadtipoprecioLogic.getUtilidadTipoPrecios()==null|| utilidadtipoprecioLogic.getUtilidadTipoPrecios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							utilidadtipopreciosAux= new ArrayList<UtilidadTipoPrecio>();
							utilidadtipopreciosAux.addAll(utilidadtipoprecioLogic.getUtilidadTipoPrecios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadtipopreciosAux= new ArrayList<UtilidadTipoPrecio>();
							utilidadtipopreciosAux.addAll(utilidadtipoprecios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							utilidadtipoprecioLogic.getTodosUtilidadTipoPrecios(finalQueryGlobal+"",this.pagination);												
							
							//utilidadtipoprecioLogic.getTodosUtilidadTipoPreciosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteUtilidadTipoPrecios("Todos",utilidadtipoprecioLogic.getUtilidadTipoPrecios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							utilidadtipoprecioLogic.setUtilidadTipoPrecios(new ArrayList<UtilidadTipoPrecio>());					
							utilidadtipoprecioLogic.getUtilidadTipoPrecios().addAll(utilidadtipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadtipoprecios=new ArrayList<UtilidadTipoPrecio>();
							utilidadtipoprecios.addAll(utilidadtipopreciosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUtilidadTipoPrecio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUtilidadTipoPrecio=this.idActual;
				
				} else if(this.idUtilidadTipoPrecioActual!=null && this.idUtilidadTipoPrecioActual!=0L) {
					idUtilidadTipoPrecio=idUtilidadTipoPrecioActual;
				}
				
					
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndicePorId(idUtilidadTipoPrecio);
				
				this.utilidadtipoprecios=new ArrayList<UtilidadTipoPrecio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					utilidadtipoprecioLogic.getEntity(idUtilidadTipoPrecio);
					
					//utilidadtipoprecioLogic.getEntityWithConnection(idUtilidadTipoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadtipoprecioLogic.setUtilidadTipoPrecios(new ArrayList<UtilidadTipoPrecio>());
					utilidadtipoprecioLogic.getUtilidadTipoPrecios().add(utilidadtipoprecioLogic.getUtilidadTipoPrecio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadtipoprecios=new ArrayList<UtilidadTipoPrecio>();
					this.utilidadtipoprecios.add(utilidadtipoprecio);
				}
				
				if(utilidadtipoprecioLogic.getUtilidadTipoPrecio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadtipoprecioLogic.getUtilidadTipoPreciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadtipoprecioLogic.getUtilidadTipoPrecios()==null||utilidadtipoprecioLogic.getUtilidadTipoPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadtipoprecios==null|| utilidadtipoprecios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipopreciosAux=new ArrayList<UtilidadTipoPrecio>();
						utilidadtipopreciosAux.addAll(utilidadtipoprecioLogic.getUtilidadTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadtipopreciosAux=new ArrayList<UtilidadTipoPrecio>();
							utilidadtipopreciosAux.addAll(utilidadtipoprecios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadtipoprecioLogic.getUtilidadTipoPreciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadTipoPrecios("FK_IdEmpresa",utilidadtipoprecioLogic.getUtilidadTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadTipoPrecios("FK_IdEmpresa",utilidadtipoprecios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipoprecioLogic.setUtilidadTipoPrecios(new ArrayList<UtilidadTipoPrecio>());
						utilidadtipoprecioLogic.getUtilidadTipoPrecios().addAll(utilidadtipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadtipoprecios=new ArrayList<UtilidadTipoPrecio>();
							utilidadtipoprecios.addAll(utilidadtipopreciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadtipoprecioLogic.getUtilidadTipoPreciosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadtipoprecioLogic.getUtilidadTipoPrecios()==null||utilidadtipoprecioLogic.getUtilidadTipoPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadtipoprecios==null|| utilidadtipoprecios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipopreciosAux=new ArrayList<UtilidadTipoPrecio>();
						utilidadtipopreciosAux.addAll(utilidadtipoprecioLogic.getUtilidadTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadtipopreciosAux=new ArrayList<UtilidadTipoPrecio>();
							utilidadtipopreciosAux.addAll(utilidadtipoprecios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadtipoprecioLogic.getUtilidadTipoPreciosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadTipoPrecios("FK_IdSucursal",utilidadtipoprecioLogic.getUtilidadTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadTipoPrecios("FK_IdSucursal",utilidadtipoprecios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipoprecioLogic.setUtilidadTipoPrecios(new ArrayList<UtilidadTipoPrecio>());
						utilidadtipoprecioLogic.getUtilidadTipoPrecios().addAll(utilidadtipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadtipoprecios=new ArrayList<UtilidadTipoPrecio>();
							utilidadtipoprecios.addAll(utilidadtipopreciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPrecio")) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadtipoprecioLogic.getUtilidadTipoPreciosFK_IdTipoPrecio(finalQueryGlobal,pagination,id_tipo_precioFK_IdTipoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadtipoprecioLogic.getUtilidadTipoPrecios()==null||utilidadtipoprecioLogic.getUtilidadTipoPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadtipoprecios==null|| utilidadtipoprecios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipopreciosAux=new ArrayList<UtilidadTipoPrecio>();
						utilidadtipopreciosAux.addAll(utilidadtipoprecioLogic.getUtilidadTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadtipopreciosAux=new ArrayList<UtilidadTipoPrecio>();
							utilidadtipopreciosAux.addAll(utilidadtipoprecios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadtipoprecioLogic.getUtilidadTipoPreciosFK_IdTipoPrecio(finalQueryGlobal,pagination,id_tipo_precioFK_IdTipoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadTipoPrecioConstantesFunciones.getDetalleIndiceFK_IdTipoPrecio(id_tipo_precioFK_IdTipoPrecio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadTipoPrecios("FK_IdTipoPrecio",utilidadtipoprecioLogic.getUtilidadTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadTipoPrecios("FK_IdTipoPrecio",utilidadtipoprecios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipoprecioLogic.setUtilidadTipoPrecios(new ArrayList<UtilidadTipoPrecio>());
						utilidadtipoprecioLogic.getUtilidadTipoPrecios().addAll(utilidadtipopreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadtipoprecios=new ArrayList<UtilidadTipoPrecio>();
							utilidadtipoprecios.addAll(utilidadtipopreciosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUtilidadTipoPrecio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUtilidadTipoPrecio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=utilidadtipoprecioLogic.getUtilidadTipoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadtipoprecios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=utilidadtipoprecioLogic.getUtilidadTipoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadtipoprecios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(UtilidadTipoPrecio utilidadtipoprecio) {
		Boolean permite=true;
		
		if(this.utilidadtipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UtilidadTipoPrecioConstantesFunciones.getOrderByListaUtilidadTipoPrecio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UtilidadTipoPrecioConstantesFunciones.getOrderByListaUtilidadTipoPrecio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadTipoPrecio utilidadtipoprecio:utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
				if(utilidadtipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadtipoprecioTotales=utilidadtipoprecio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadTipoPrecio utilidadtipoprecio:this.utilidadtipoprecios) {
				if(utilidadtipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadtipoprecioTotales=utilidadtipoprecio;
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
			this.utilidadtipoprecioAux=new UtilidadTipoPrecio();
			this.utilidadtipoprecioAux.setsType(Constantes2.S_TOTALES);
			this.utilidadtipoprecioAux.setIsNew(false);
			this.utilidadtipoprecioAux.setIsChanged(false);
			this.utilidadtipoprecioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				UtilidadTipoPrecioConstantesFunciones.TotalizarValoresFilaUtilidadTipoPrecio(this.utilidadtipoprecioLogic.getUtilidadTipoPrecios(),this.utilidadtipoprecioAux);
				
				this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().add(this.utilidadtipoprecioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UtilidadTipoPrecioConstantesFunciones.TotalizarValoresFilaUtilidadTipoPrecio(this.utilidadtipoprecios,this.utilidadtipoprecioAux);
				
				this.utilidadtipoprecios.add(this.utilidadtipoprecioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		utilidadtipoprecioTotales=new UtilidadTipoPrecio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().remove(utilidadtipoprecioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.utilidadtipoprecios.remove(utilidadtipoprecioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		utilidadtipoprecioTotales=new UtilidadTipoPrecio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadTipoPrecio utilidadtipoprecio:utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
				if(utilidadtipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadtipoprecioTotales=utilidadtipoprecio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UtilidadTipoPrecioConstantesFunciones.TotalizarValoresFilaUtilidadTipoPrecio(this.utilidadtipoprecioLogic.getUtilidadTipoPrecios(),utilidadtipoprecioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadTipoPrecio utilidadtipoprecio:this.utilidadtipoprecios) {
				if(utilidadtipoprecio.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadtipoprecioTotales=utilidadtipoprecio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UtilidadTipoPrecioConstantesFunciones.TotalizarValoresFilaUtilidadTipoPrecio(this.utilidadtipoprecios,utilidadtipoprecioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUtilidadTipoPreciosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadTipoPreciosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadTipoPreciosFK_IdTipoPrecio()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPrecio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getUtilidadTipoPreciosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadtipoprecioLogic.getUtilidadTipoPreciosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadTipoPreciosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadtipoprecioLogic.getUtilidadTipoPreciosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadTipoPreciosFK_IdTipoPrecio(String sFinalQuery,Long id_tipo_precio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadtipoprecioLogic.getUtilidadTipoPreciosFK_IdTipoPrecio(sFinalQuery,this.pagination,id_tipo_precio);
				
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
	
	public void inicializarPermisosUtilidadTipoPrecio() {
		this.isPermisoTodoUtilidadTipoPrecio=false;
		this.isPermisoNuevoUtilidadTipoPrecio=false;
		this.isPermisoActualizarUtilidadTipoPrecio=false;
		this.isPermisoActualizarOriginalUtilidadTipoPrecio=false;
		this.isPermisoEliminarUtilidadTipoPrecio=false;
		this.isPermisoGuardarCambiosUtilidadTipoPrecio=false;
		this.isPermisoConsultaUtilidadTipoPrecio=false;
		this.isPermisoBusquedaUtilidadTipoPrecio=false;
		this.isPermisoReporteUtilidadTipoPrecio=false;		
		this.isPermisoOrdenUtilidadTipoPrecio=false;		
		this.isPermisoPaginacionMedioUtilidadTipoPrecio=false;		
		this.isPermisoPaginacionAltoUtilidadTipoPrecio=false;
		this.isPermisoPaginacionTodoUtilidadTipoPrecio=false;
		this.isPermisoCopiarUtilidadTipoPrecio=false;		
		this.isPermisoVerFormUtilidadTipoPrecio=false;		
		this.isPermisoDuplicarUtilidadTipoPrecio=false;		
		this.isPermisoOrdenUtilidadTipoPrecio=false;		
	}
	
	public void setPermisosUsuarioUtilidadTipoPrecio(Boolean isPermiso) {
		this.isPermisoTodoUtilidadTipoPrecio=isPermiso;
		this.isPermisoNuevoUtilidadTipoPrecio=isPermiso;
		this.isPermisoActualizarUtilidadTipoPrecio=isPermiso;
		this.isPermisoActualizarOriginalUtilidadTipoPrecio=isPermiso;
		this.isPermisoEliminarUtilidadTipoPrecio=isPermiso;
		this.isPermisoGuardarCambiosUtilidadTipoPrecio=isPermiso;
		this.isPermisoConsultaUtilidadTipoPrecio=isPermiso;
		this.isPermisoBusquedaUtilidadTipoPrecio=isPermiso;
		this.isPermisoReporteUtilidadTipoPrecio=isPermiso;
		this.isPermisoOrdenUtilidadTipoPrecio=isPermiso;		
		this.isPermisoPaginacionMedioUtilidadTipoPrecio=isPermiso;		
		this.isPermisoPaginacionAltoUtilidadTipoPrecio=isPermiso;		
		this.isPermisoPaginacionTodoUtilidadTipoPrecio=isPermiso;		
		this.isPermisoCopiarUtilidadTipoPrecio=isPermiso;		
		this.isPermisoVerFormUtilidadTipoPrecio=isPermiso;		
		this.isPermisoDuplicarUtilidadTipoPrecio=isPermiso;
		this.isPermisoOrdenUtilidadTipoPrecio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUtilidadTipoPrecio(Boolean isPermiso) {
		//this.isPermisoTodoUtilidadTipoPrecio=isPermiso;
		this.isPermisoNuevoUtilidadTipoPrecio=isPermiso;
		this.isPermisoActualizarUtilidadTipoPrecio=isPermiso;
		this.isPermisoActualizarOriginalUtilidadTipoPrecio=isPermiso;
		this.isPermisoEliminarUtilidadTipoPrecio=isPermiso;
		this.isPermisoGuardarCambiosUtilidadTipoPrecio=isPermiso;
		//this.isPermisoConsultaUtilidadTipoPrecio=isPermiso;
		//this.isPermisoBusquedaUtilidadTipoPrecio=isPermiso;
		//this.isPermisoReporteUtilidadTipoPrecio=isPermiso;
		//this.isPermisoOrdenUtilidadTipoPrecio=isPermiso;		
		//this.isPermisoPaginacionMedioUtilidadTipoPrecio=isPermiso;		
		//this.isPermisoPaginacionAltoUtilidadTipoPrecio=isPermiso;		
		//this.isPermisoPaginacionTodoUtilidadTipoPrecio=isPermiso;		
		//this.isPermisoCopiarUtilidadTipoPrecio=isPermiso;		
		//this.isPermisoDuplicarUtilidadTipoPrecio=isPermiso;
		//this.isPermisoOrdenUtilidadTipoPrecio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUtilidadTipoPrecioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(UtilidadTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebUtilidadTipoPrecio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUtilidadTipoPrecioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioUtilidadTipoPrecioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUtilidadTipoPrecioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUtilidadTipoPrecioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioUtilidadTipoPrecio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UtilidadTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UtilidadTipoPrecioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUtilidadTipoPrecio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUtilidadTipoPrecio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUtilidadTipoPrecio=this.isPermisoActualizarUtilidadTipoPrecio;
			this.isPermisoEliminarUtilidadTipoPrecio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUtilidadTipoPrecio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUtilidadTipoPrecio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUtilidadTipoPrecio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUtilidadTipoPrecio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUtilidadTipoPrecio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUtilidadTipoPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUtilidadTipoPrecio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUtilidadTipoPrecio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUtilidadTipoPrecio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUtilidadTipoPrecio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUtilidadTipoPrecio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUtilidadTipoPrecio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUtilidadTipoPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUtilidadTipoPrecio.setToolTipText(this.jTableDatosUtilidadTipoPrecio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUtilidadTipoPrecio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUtilidadTipoPrecio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UtilidadTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(UtilidadTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioUtilidadTipoPrecio() throws Exception {
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
	public void inicializarCombosForeignKeyUtilidadTipoPrecioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tipopreciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUtilidadTipoPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UtilidadTipoPrecioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyUtilidadTipoPrecioListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyUtilidadTipoPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			UtilidadTipoPrecioParameterReturnGeneral utilidadtipoprecioReturnGeneral=new UtilidadTipoPrecioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.utilidadtipoprecioConstantesFunciones.cargarid_empresaUtilidadTipoPrecio)
					 || (this.esRecargarFks && this.utilidadtipoprecioConstantesFunciones.cargarid_empresaUtilidadTipoPrecio)) {

					if(!this.utilidadtipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+utilidadtipoprecioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.utilidadtipoprecioConstantesFunciones.cargarid_sucursalUtilidadTipoPrecio)
					 || (this.esRecargarFks && this.utilidadtipoprecioConstantesFunciones.cargarid_sucursalUtilidadTipoPrecio)) {

					if(!this.utilidadtipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+utilidadtipoprecioSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoPrecio="";

				if(((this.tipopreciosForeignKey==null||this.tipopreciosForeignKey.size()<=0) && this.utilidadtipoprecioConstantesFunciones.cargarid_tipo_precioUtilidadTipoPrecio)
					 || (this.esRecargarFks && this.utilidadtipoprecioConstantesFunciones.cargarid_tipo_precioUtilidadTipoPrecio)) {

					if(!this.utilidadtipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPrecioConstantesFunciones.getArrayColumnasGlobalesTipoPrecio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPrecio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrecioConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPrecio=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPrecio, "");
						finalQueryGlobalTipoPrecio+=TipoPrecioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPreciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPrecio=" WHERE " + ConstantesSql.ID + "="+utilidadtipoprecioSessionBean.getlidTipoPrecioActual();
					}
				} else {
					finalQueryGlobalTipoPrecio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				utilidadtipoprecioReturnGeneral=utilidadtipoprecioLogic.cargarCombosLoteForeignKeyUtilidadTipoPrecio(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoPrecio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=utilidadtipoprecioReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=utilidadtipoprecioReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoPrecio.equals("NONE")) {
				this.tipopreciosForeignKey=utilidadtipoprecioReturnGeneral.gettipopreciosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyUtilidadTipoPrecio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoPrecio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.utilidadtipoprecioSessionBean==null) {
				this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
			}

			if(!this.utilidadtipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.utilidadtipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyTipoPrecio()throws Exception {
		try {

			if(!this.utilidadtipoprecioSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {
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
	
	public void initActionsCombosTodosForeignKeyUtilidadTipoPrecio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUtilidadTipoPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyUtilidadTipoPrecio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadTipoPrecio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio)throws Exception {	
		try {
			
			this.setActualTipoPrecioForeignKey(utilidadtipoprecio.getid_tipo_precio(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUtilidadTipoPrecio()throws Exception {	
		try {
			
			this.setActualTipoPrecioForeignKey(this.utilidadtipoprecioConstantesFunciones.getid_tipo_precio(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadTipoPrecio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUtilidadTipoPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUtilidadTipoPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUtilidadTipoPrecio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUtilidadTipoPrecio()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoPreciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUtilidadTipoPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPreciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUtilidadTipoPrecio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio!=null && this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio!=null && this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio!=null && this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public UtilidadTipoPrecioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UtilidadTipoPrecioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UtilidadTipoPrecioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean(); 
		this.utilidadtipoprecioConstantesFunciones=new UtilidadTipoPrecioConstantesFunciones(); 
		this.utilidadtipoprecioBean=new UtilidadTipoPrecio();//(this.utilidadtipoprecioConstantesFunciones); 		
		this.utilidadtipoprecioReturnGeneral=new UtilidadTipoPrecioParameterReturnGeneral(); 
		
		this.utilidadtipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadtipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UtilidadTipoPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UtilidadTipoPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UtilidadTipoPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUtilidadTipoPrecio(true);
			
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
			
			this.utilidadtipoprecioConstantesFunciones=new UtilidadTipoPrecioConstantesFunciones(); 
			this.utilidadtipoprecioBean=new UtilidadTipoPrecio();//this.utilidadtipoprecioConstantesFunciones); 			
			this.utilidadtipoprecioReturnGeneral=new UtilidadTipoPrecioParameterReturnGeneral(); 
		
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Utilidad Tipo Precio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.utilidadtipoprecio=new UtilidadTipoPrecio();
			this.utilidadtipoprecios = new ArrayList<UtilidadTipoPrecio>();
			this.utilidadtipopreciosAux = new ArrayList<UtilidadTipoPrecio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic=new UtilidadTipoPrecioLogic();
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}
			
			//this.utilidadtipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.utilidadtipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUtilidadTipoPrecio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUtilidadTipoPrecio);	
					}
					
					if(this.jInternalFrameImportacionUtilidadTipoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUtilidadTipoPrecio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUtilidadTipoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUtilidadTipoPrecio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUtilidadTipoPrecio);
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.setVisible(false);
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio);
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setVisible(false);
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUtilidadTipoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUtilidadTipoPrecio);
					this.jInternalFrameImportacionUtilidadTipoPrecio.setVisible(false);
					this.jInternalFrameImportacionUtilidadTipoPrecio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUtilidadTipoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUtilidadTipoPrecio);
					this.jInternalFrameOrderByUtilidadTipoPrecio.setVisible(false);
					this.jInternalFrameOrderByUtilidadTipoPrecio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUtilidadTipoPrecioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UtilidadTipoPrecioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.utilidadtipoprecioReturnGeneral=new UtilidadTipoPrecioParameterReturnGeneral();
			
			this.utilidadtipoprecioParameterGeneral=new UtilidadTipoPrecioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.utilidadtipoprecioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(UtilidadTipoPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UtilidadTipoPrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),this.utilidadtipoprecioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UtilidadTipoPrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),this.utilidadtipoprecioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaDuplicarUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaCopiarUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaVerFormUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaOrdenUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoPrecio=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUtilidadTipoPrecio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUtilidadTipoPrecio(false);
			
			this.setPermisosUsuarioUtilidadTipoPrecio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado() 
				|| (this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado() && this.utilidadtipoprecioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUtilidadTipoPrecioClasesRelacionadas();
			}
			
			if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUtilidadTipoPrecioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUtilidadTipoPrecio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUtilidadTipoPrecio();
			}
			
			if(!this.isPermisoBusquedaUtilidadTipoPrecio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioUtilidadTipoPrecio,this.isPermisoPaginacionMedioUtilidadTipoPrecio,this.isPermisoPaginacionTodoUtilidadTipoPrecio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UtilidadTipoPrecioConstantesFunciones.getTiposSeleccionarUtilidadTipoPrecio());
				
				this.tiposColumnasSelect=UtilidadTipoPrecioConstantesFunciones.getTiposSeleccionarUtilidadTipoPrecio(true);
				
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
			//if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUtilidadTipoPrecio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioUtilidadTipoPrecio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioUtilidadTipoPrecio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadTipoPrecio() ;
			
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
				utilidadtipoprecioImplementable= (UtilidadTipoPrecioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UtilidadTipoPrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				utilidadtipoprecioImplementableHome= (UtilidadTipoPrecioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UtilidadTipoPrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.utilidadtipoprecios= new ArrayList<UtilidadTipoPrecio>();
			this.utilidadtipopreciosEliminados= new ArrayList<UtilidadTipoPrecio>();
						
			this.isEsNuevoUtilidadTipoPrecio=false;
			this.esParaAccionDesdeFormularioUtilidadTipoPrecio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tipopreciosForeignKey=new ArrayList<TipoPrecio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyUtilidadTipoPrecio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUtilidadTipoPrecio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UtilidadTipoPrecioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUtilidadTipoPrecio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUtilidadTipoPrecio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUtilidadTipoPrecio();
			}
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUtilidadTipoPrecio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUtilidadTipoPrecio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUtilidadTipoPrecio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUtilidadTipoPrecio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga UtilidadTipoPrecio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUtilidadTipoPrecio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUtilidadTipoPrecio")) {
				iIndex=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTabbedPaneRelacionesUtilidadTipoPrecio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTabbedPaneRelacionesUtilidadTipoPrecio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUtilidadTipoPrecio();	
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
	
	public void cargarCombosForeignKeyUtilidadTipoPrecio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUtilidadTipoPrecio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUtilidadTipoPrecio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUtilidadTipoPrecioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUtilidadTipoPrecio();
		
		this.cargarCombosFrameForeignKeyUtilidadTipoPrecio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUtilidadTipoPrecio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUtilidadTipoPrecio();
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
	
	public void jButtonNuevoUtilidadTipoPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
			
			if(jTableDatosUtilidadTipoPrecio.getRowCount()>=1) {
				jTableDatosUtilidadTipoPrecio.removeRowSelectionInterval(0, jTableDatosUtilidadTipoPrecio.getRowCount()-1);						
			}
			
			this.isEsNuevoUtilidadTipoPrecio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUtilidadTipoPrecio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUtilidadTipoPrecio(true);			
			//this.utilidadtipoprecio=new UtilidadTipoPrecio();
			//this.utilidadtipoprecio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadTipoPrecio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadTipoPrecio() ;
			
			if(UtilidadTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadTipoPrecio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.utilidadtipoprecio);	
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);				
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
			if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar UtilidadTipoPrecio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUtilidadTipoPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUtilidadTipoPrecio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUtilidadTipoPrecio.getSelectedRows().length;			
			}
			
			utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUtilidadTipoPrecio--;			
				//UtilidadTipoPrecio utilidadtipoprecioAux= new UtilidadTipoPrecio();			
				//utilidadtipoprecioAux.setId(this.iIdNuevoUtilidadTipoPrecio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//UtilidadTipoPrecio utilidadtipoprecioOrigen=new UtilidadTipoPrecio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(UtilidadTipoPrecio utilidadtipoprecioOrigen : utilidadtipopreciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							utilidadtipoprecioOrigen =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadtipoprecioOrigen =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUtilidadTipoPrecio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.utilidadtipoprecio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUtilidadTipoPrecio(utilidadtipoprecioOrigen,this.utilidadtipoprecio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().add(this.utilidadtipoprecioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.utilidadtipoprecios.add(this.utilidadtipoprecioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
				
				this.jTableDatosUtilidadTipoPrecio.setRowSelectionInterval(this.getIndiceNuevoUtilidadTipoPrecio(), this.getIndiceNuevoUtilidadTipoPrecio());
				
				int iLastRow =  this.jTableDatosUtilidadTipoPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUtilidadTipoPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUtilidadTipoPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();									
		
			UtilidadTipoPrecio utilidadtipoprecioOrigen=new UtilidadTipoPrecio();
			UtilidadTipoPrecio utilidadtipoprecioDestino=new UtilidadTipoPrecio();
				
			utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUtilidadTipoPrecio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || utilidadtipopreciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUtilidadTipoPrecio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipoprecioOrigen =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						utilidadtipoprecioOrigen =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadtipoprecioDestino =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						utilidadtipoprecioDestino =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				utilidadtipoprecioOrigen =utilidadtipopreciosSeleccionados.get(0);
				utilidadtipoprecioDestino =utilidadtipopreciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUtilidadTipoPrecio(utilidadtipoprecioOrigen,utilidadtipoprecioDestino,true,false);
				
				utilidadtipoprecioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(utilidadtipoprecioDestino,utilidadtipoprecioLogic.getUtilidadTipoPrecios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadtipoprecioDestino,utilidadtipoprecios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
				
				//this.jTableDatosUtilidadTipoPrecio.setRowSelectionInterval(this.getIndiceNuevoUtilidadTipoPrecio(), this.getIndiceNuevoUtilidadTipoPrecio());
				
				int iLastRow =  this.jTableDatosUtilidadTipoPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUtilidadTipoPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUtilidadTipoPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUtilidadTipoPrecio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(!isVisible);
			this.jPanelPaginacionUtilidadTipoPrecio.setVisible(!isVisible);
			this.jPanelAccionesUtilidadTipoPrecio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUtilidadTipoPrecio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUtilidadTipoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUtilidadTipoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUtilidadTipoPrecio();
			
			this.abrirFrameOrderByUtilidadTipoPrecio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUtilidadTipoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUtilidadTipoPrecio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUtilidadTipoPrecio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUtilidadTipoPrecio.isMaximum()) {
					this.jInternalFrameDetalleFormUtilidadTipoPrecio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUtilidadTipoPrecio.setSize(this.jInternalFrameDetalleFormUtilidadTipoPrecio.iWidthFormulario,this.jInternalFrameDetalleFormUtilidadTipoPrecio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUtilidadTipoPrecio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUtilidadTipoPrecio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUtilidadTipoPrecio.isMaximum()) {
						this.jInternalFrameDetalleFormUtilidadTipoPrecio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jContentPaneDetalleUtilidadTipoPrecio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTabbedPaneRelacionesUtilidadTipoPrecio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jContentPaneDetalleUtilidadTipoPrecio.getWidth(),UtilidadTipoPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTabbedPaneRelacionesUtilidadTipoPrecio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jContentPaneDetalleUtilidadTipoPrecio.getWidth(),UtilidadTipoPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTabbedPaneRelacionesUtilidadTipoPrecio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jContentPaneDetalleUtilidadTipoPrecio.getWidth(),UtilidadTipoPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUtilidadTipoPrecio.setVisible(true);
	        this.jInternalFrameDetalleFormUtilidadTipoPrecio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUtilidadTipoPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUtilidadTipoPrecio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUtilidadTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadTipoPrecio,false,this);
				} else {
					this.jInternalFrameOrderByUtilidadTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadTipoPrecio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUtilidadTipoPrecio);
				this.jInternalFrameOrderByUtilidadTipoPrecio.setVisible(false);
				this.jInternalFrameOrderByUtilidadTipoPrecio.setSelected(false);
				
				this.jInternalFrameOrderByUtilidadTipoPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUtilidadTipoPrecio"));
				
				this.inicializarActualizarBindingTablaOrderByUtilidadTipoPrecio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUtilidadTipoPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUtilidadTipoPrecio==null) {
				
				this.jInternalFrameImportacionUtilidadTipoPrecio=new ImportacionJInternalFrame(UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUtilidadTipoPrecio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUtilidadTipoPrecio);
				this.jInternalFrameImportacionUtilidadTipoPrecio.setVisible(false);
				this.jInternalFrameImportacionUtilidadTipoPrecio.setSelected(false);


				this.jInternalFrameImportacionUtilidadTipoPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUtilidadTipoPrecio"));
				this.jInternalFrameImportacionUtilidadTipoPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUtilidadTipoPrecio"));
				this.jInternalFrameImportacionUtilidadTipoPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUtilidadTipoPrecio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUtilidadTipoPrecio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio==null) {
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio=new ReporteDinamicoJInternalFrame(UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUtilidadTipoPrecio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio);
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setVisible(false);
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadTipoPrecio"));
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadTipoPrecio"));
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadTipoPrecio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadTipoPrecio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleUtilidadTipoPrecio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUtilidadTipoPrecio);
			
	       	this.jInternalFrameDetalleFormUtilidadTipoPrecio.setVisible(false);
	        this.jInternalFrameDetalleFormUtilidadTipoPrecio.setSelected(false);
			
			//this.jInternalFrameDetalleFormUtilidadTipoPrecio.dispose();
			//this.jInternalFrameDetalleFormUtilidadTipoPrecio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUtilidadTipoPrecio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setVisible(true);
	        this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUtilidadTipoPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUtilidadTipoPrecio.setVisible(true);
	        this.jInternalFrameImportacionUtilidadTipoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUtilidadTipoPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUtilidadTipoPrecio.setVisible(true);
	        this.jInternalFrameOrderByUtilidadTipoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUtilidadTipoPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUtilidadTipoPrecio.setVisible(false);
	        this.jInternalFrameOrderByUtilidadTipoPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUtilidadTipoPrecio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setVisible(false);
	        this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUtilidadTipoPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUtilidadTipoPrecio.setVisible(false);
	        this.jInternalFrameImportacionUtilidadTipoPrecio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUtilidadTipoPrecio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUtilidadTipoPrecio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUtilidadTipoPrecio(true);
			//this.isEsNuevoUtilidadTipoPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadTipoPrecio(false) ;
			
			if(utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(UtilidadTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadTipoPrecio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadTipoPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUtilidadTipoPrecioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUtilidadTipoPrecio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUtilidadTipoPrecio(true);
			//this.isEsNuevoUtilidadTipoPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.utilidadtipoprecio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUtilidadTipoPrecio(false) ;
			
			if(UtilidadTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadTipoPrecio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadTipoPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoPrecio(List<TipoPrecio> tipopreciosForeignKey)throws Exception{
		TableColumn tableColumnTipoPrecio=this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecio,UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO));
		TableCellEditor tableCellEditorTipoPrecio =tableColumnTipoPrecio.getCellEditor();

		TipoPrecioTableCell tipoprecioTableCellFk=(TipoPrecioTableCell)tableCellEditorTipoPrecio;

		if(tipoprecioTableCellFk!=null) {
			tipoprecioTableCellFk.settipopreciosForeignKey(tipopreciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUtilidadTipoPrecio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprecioTableCellFk.setRowActual(intSelectedRow);
			//tipoprecioTableCellFk.settipopreciosForeignKeyActual(tipopreciosForeignKey);
		//}


		if(tipoprecioTableCellFk!=null) {
			tipoprecioTableCellFk.RecargarTipoPreciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUtilidadTipoPrecio(false);
			
			//if(!this.isEsNuevoUtilidadTipoPrecio) {								
				int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
				
			}
			
			if(this.permiteMantenimiento(this.utilidadtipoprecio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUtilidadTipoPrecio=true;
					this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
					this.isEsNuevoUtilidadTipoPrecio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUtilidadTipoPrecio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUtilidadTipoPrecio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUtilidadTipoPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadTipoPrecio(false);
				
				this.habilitarDeshabilitarControlesUtilidadTipoPrecio(false);
			
												
				
				if(UtilidadTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUtilidadTipoPrecio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,utilidadtipoprecioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUtilidadTipoPrecio(this.utilidadtipoprecio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUtilidadTipoPrecio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,utilidadtipoprecioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.utilidadtipoprecio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				this.utilidadtipoprecio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				this.utilidadtipoprecio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.utilidadtipoprecio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UtilidadTipoPrecioModel) this.jTableDatosUtilidadTipoPrecio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUtilidadTipoPrecio=true;
				this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
				this.isEsNuevoUtilidadTipoPrecio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUtilidadTipoPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadTipoPrecio(false);
				
				this.habilitarDeshabilitarControlesUtilidadTipoPrecio(false);
				
				
				
				if(UtilidadTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUtilidadTipoPrecio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUtilidadTipoPrecio.getRowCount()>=1) {
				jTableDatosUtilidadTipoPrecio.removeRowSelectionInterval(0, jTableDatosUtilidadTipoPrecio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUtilidadTipoPrecio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadTipoPrecio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadTipoPrecio(false) ;
			
			this.isEsNuevoUtilidadTipoPrecio=false;
			
			if(UtilidadTipoPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUtilidadTipoPrecio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUtilidadTipoPrecio(false);
				
				//SI ES MANUAL
				if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUtilidadTipoPrecio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUtilidadTipoPrecio--;			
			//UtilidadTipoPrecio utilidadtipoprecioAux= new UtilidadTipoPrecio();			
			//utilidadtipoprecioAux.setId(this.iIdNuevoUtilidadTipoPrecio);
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUtilidadTipoPrecio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
			
			this.utilidadtipoprecio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().add(this.utilidadtipoprecioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.utilidadtipoprecios.add(this.utilidadtipoprecioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
			
			this.jTableDatosUtilidadTipoPrecio.setRowSelectionInterval(this.getIndiceNuevoUtilidadTipoPrecio(), this.getIndiceNuevoUtilidadTipoPrecio());
			
			int iLastRow =  this.jTableDatosUtilidadTipoPrecio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUtilidadTipoPrecio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUtilidadTipoPrecio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadTipoPrecio(false);
			
			//SI ES MANUAL
			if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadTipoPrecio();
			}
			
			//this.abrirFrameTreeUtilidadTipoPrecio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Utilidad Tipo PrecioES ?", "MANTENIMIENTO DE Utilidad Tipo Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionUtilidadTipoPrecio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralUtilidadTipoPrecio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.utilidadtipoprecioReturnGeneral=utilidadtipoprecioLogic.procesarImportacionUtilidadTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.utilidadtipoprecioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarUtilidadTipoPrecioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUtilidadTipoPrecio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUtilidadTipoPrecio.setFileImportacion(this.jInternalFrameImportacionUtilidadTipoPrecio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUtilidadTipoPrecio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUtilidadTipoPrecio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUtilidadTipoPrecio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUtilidadTipoPrecio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();		

		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UtilidadTipoPrecioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UtilidadTipoPrecioBaseDesign.jrxml";
			
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
			
			this.generarReporteUtilidadTipoPrecios("Todos",utilidadtipopreciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPrecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPrecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPrecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPrecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
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
		
		if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					sNombreCampoCategoria="id_tipo_precio";
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					sNombreCampoCategoriaValor="id_tipo_precio";
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_precio");
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
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
	
	public void jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();		
		
		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadtipoprecio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("UtilidadTipoPrecios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(UtilidadTipoPrecio utilidadtipoprecio:utilidadtipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadtipoprecio.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(UtilidadTipoPrecio utilidadtipoprecio:utilidadtipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadtipoprecio.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
					iRow++;

					for(UtilidadTipoPrecio utilidadtipoprecio:utilidadtipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadtipoprecio.gettipoprecio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(UtilidadTipoPrecio utilidadtipoprecio:utilidadtipopreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadtipoprecio.getporcentaje());
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
			//	this.getFilaCabeceraExportarExcelUtilidadTipoPrecio(row);				
			//	iRow++;
			//}				
			
			//for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipopreciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUtilidadTipoPrecio(utilidadtipoprecioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
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
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadTipoPrecio(false);
			
			//SI ES MANUAL
			if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadTipoPrecio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadTipoPrecio(false);
			
			//SI ES MANUAL
			if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUtilidadTipoPrecio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadTipoPrecio(false);
			
			//SI ES MANUAL
			if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUtilidadTipoPrecio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUtilidadTipoPrecio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUtilidadTipoPrecio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUtilidadTipoPrecio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUtilidadTipoPrecio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUtilidadTipoPrecio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUtilidadTipoPrecio.setMinimumSize(dimensionMinimum);
		this.jTableDatosUtilidadTipoPrecio.setMaximumSize(dimensionMaximum);
		this.jTableDatosUtilidadTipoPrecio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUtilidadTipoPrecio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUtilidadTipoPrecio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUtilidadTipoPrecio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUtilidadTipoPrecio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUtilidadTipoPrecio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUtilidadTipoPrecio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadTipoPrecio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUtilidadTipoPrecio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUtilidadTipoPrecio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUtilidadTipoPrecio();
		
		this.inicializarActualizarBindingBotonesManualUtilidadTipoPrecio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUtilidadTipoPrecio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadTipoPrecio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadTipoPrecio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadTipoPrecio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUtilidadTipoPrecio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUtilidadTipoPrecio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jCheckBoxPostAccionNuevoUtilidadTipoPrecio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jCheckBoxPostAccionSinCerrarUtilidadTipoPrecio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jCheckBoxPostAccionSinMensajeUtilidadTipoPrecio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUtilidadTipoPrecio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUtilidadTipoPrecio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.jCheckBoxPostAccionNuevoUtilidadTipoPrecio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.jCheckBoxPostAccionSinCerrarUtilidadTipoPrecio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.jCheckBoxPostAccionSinMensajeUtilidadTipoPrecio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUtilidadTipoPrecio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUtilidadTipoPrecio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUtilidadTipoPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUtilidadTipoPrecio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUtilidadTipoPrecio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUtilidadTipoPrecio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUtilidadTipoPrecio(Boolean esInicializar) throws Exception {
		try	{	
			if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadTipoPrecio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadTipoPrecio() throws Exception {
		try	{
			if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUtilidadTipoPrecio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUtilidadTipoPrecio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUtilidadTipoPrecio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUtilidadTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUtilidadTipoPrecio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUtilidadTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUtilidadTipoPrecio.addItem(reporte);
			}
			
			
			if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUtilidadTipoPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUtilidadTipoPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUtilidadTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUtilidadTipoPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUtilidadTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUtilidadTipoPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadTipoPrecio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadTipoPrecio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio!=null) {
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio!=null) {
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio!=null) {
				
				if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=UtilidadTipoPrecioConstantesFunciones.getTiposSeleccionarUtilidadTipoPrecio(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=UtilidadTipoPrecioConstantesFunciones.getTiposSeleccionarUtilidadTipoPrecio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=UtilidadTipoPrecioConstantesFunciones.getTiposSeleccionarUtilidadTipoPrecio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUtilidadTipoPrecio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.getSelectedItem()!=null){this.id_tipo_precioFK_IdTipoPrecio=((TipoPrecio)this.jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUtilidadTipoPrecio(Boolean esInicializar) throws Exception {				
		if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUtilidadTipoPrecio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUtilidadTipoPrecio() throws Exception {
		this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUtilidadTipoPrecio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UtilidadTipoPrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UtilidadTipoPrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUtilidadTipoPrecioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UtilidadTipoPrecioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UtilidadTipoPrecioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUtilidadTipoPrecio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=utilidadtipoprecioLogic.getUtilidadTipoPrecios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=utilidadtipoprecios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUtilidadTipoPrecio.setModel(new UtilidadTipoPrecioModel(this.utilidadtipoprecioLogic.getUtilidadTipoPrecios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUtilidadTipoPrecio.setModel(new UtilidadTipoPrecioModel(this.utilidadtipoprecios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUtilidadTipoPrecio!=null && this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUtilidadTipoPrecio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UtilidadTipoPrecioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO,utilidadtipoprecioConstantesFunciones.resaltarSeleccionarUtilidadTipoPrecio,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO,utilidadtipoprecioConstantesFunciones.resaltarSeleccionarUtilidadTipoPrecio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecio,UtilidadTipoPrecioConstantesFunciones.LABEL_ID));

		if(this.utilidadtipoprecioConstantesFunciones.mostraridUtilidadTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadTipoPrecioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadtipoprecioConstantesFunciones.resaltaridUtilidadTipoPrecio,this.utilidadtipoprecioConstantesFunciones.activaridUtilidadTipoPrecio,iSizeTabla,this,true,"idUtilidadTipoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadtipoprecioConstantesFunciones.resaltaridUtilidadTipoPrecio,this.utilidadtipoprecioConstantesFunciones.activaridUtilidadTipoPrecio,this,true,"idUtilidadTipoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecio,UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.utilidadtipoprecioConstantesFunciones.mostrarid_empresaUtilidadTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.utilidadtipoprecioConstantesFunciones.resaltarid_empresaUtilidadTipoPrecio,this,this.utilidadtipoprecioConstantesFunciones.activarid_empresaUtilidadTipoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.utilidadtipoprecioConstantesFunciones.resaltarid_empresaUtilidadTipoPrecio,this,this.utilidadtipoprecioConstantesFunciones.activarid_empresaUtilidadTipoPrecio,false,"id_empresaUtilidadTipoPrecio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecio,UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.utilidadtipoprecioConstantesFunciones.mostrarid_sucursalUtilidadTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.utilidadtipoprecioConstantesFunciones.resaltarid_sucursalUtilidadTipoPrecio,this,this.utilidadtipoprecioConstantesFunciones.activarid_sucursalUtilidadTipoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.utilidadtipoprecioConstantesFunciones.resaltarid_sucursalUtilidadTipoPrecio,this,this.utilidadtipoprecioConstantesFunciones.activarid_sucursalUtilidadTipoPrecio,false,"id_sucursalUtilidadTipoPrecio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecio,UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO));

		if(this.utilidadtipoprecioConstantesFunciones.mostrarid_tipo_precioUtilidadTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPrecioTableCell(this.tipopreciosForeignKey,this.utilidadtipoprecioConstantesFunciones.resaltarid_tipo_precioUtilidadTipoPrecio,this,this.utilidadtipoprecioConstantesFunciones.activarid_tipo_precioUtilidadTipoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new TipoPrecioTableCell(this.tipopreciosForeignKey,this.utilidadtipoprecioConstantesFunciones.resaltarid_tipo_precioUtilidadTipoPrecio,this,this.utilidadtipoprecioConstantesFunciones.activarid_tipo_precioUtilidadTipoPrecio,true,"id_tipo_precioUtilidadTipoPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecio,UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE));

		if(this.utilidadtipoprecioConstantesFunciones.mostrarporcentajeUtilidadTipoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadtipoprecioConstantesFunciones.resaltarporcentajeUtilidadTipoPrecio,this.utilidadtipoprecioConstantesFunciones.activarporcentajeUtilidadTipoPrecio,iSizeTabla,this,true,"porcentajeUtilidadTipoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadtipoprecioConstantesFunciones.resaltarporcentajeUtilidadTipoPrecio,this.utilidadtipoprecioConstantesFunciones.activarporcentajeUtilidadTipoPrecio,this,true,"porcentajeUtilidadTipoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadTipoPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUtilidadTipoPrecio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUtilidadTipoPrecio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUtilidadTipoPrecio.addColumn(tableColumn);
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
			
			this.jTableDatosUtilidadTipoPrecio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUtilidadTipoPrecio.moveColumn(this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUtilidadTipoPrecio.moveColumn(this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUtilidadTipoPrecio.moveColumn(this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUtilidadTipoPrecio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUtilidadTipoPrecio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUtilidadTipoPrecio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUtilidadTipoPrecio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUtilidadTipoPrecio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUtilidadTipoPrecio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=utilidadtipoprecioLogic.getUtilidadTipoPrecios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=utilidadtipoprecios.size()-1;
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
		//this.jTableDatosUtilidadTipoPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUtilidadTipoPrecio();
			
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
				
				//this.isEsNuevoUtilidadTipoPrecio=false;
					
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
				if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUtilidadTipoPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUtilidadTipoPrecio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.utilidadtipoprecio.getsType().equals("DUPLICADO")
				   || this.utilidadtipoprecio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUtilidadTipoPrecio=true;
				
				} else {
					this.isEsNuevoUtilidadTipoPrecio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
					if(this.utilidadtipoprecio.getId()>=0 && !this.utilidadtipoprecio.getIsNew()) {						
						this.isEsNuevoUtilidadTipoPrecio=false;
						
					} else {
						this.isEsNuevoUtilidadTipoPrecio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUtilidadTipoPrecio(esRelaciones);						
				
				this.seleccionarUtilidadTipoPrecio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.utilidadtipoprecio.getId()<0) {
					this.isEsNuevoUtilidadTipoPrecio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUtilidadTipoPrecio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUtilidadTipoPrecio(evt,rowIndex);
				}	
				
				if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion UtilidadTipoPrecio: " + this.dDif); 
					}
				}								
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUtilidadTipoPrecio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.utilidadtipoprecio)) {
					if(this.utilidadtipoprecio.getId()>0) {
						this.utilidadtipoprecio.setIsDeleted(true);
						
						this.utilidadtipopreciosEliminados.add(this.utilidadtipoprecio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().remove(this.utilidadtipoprecio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.utilidadtipoprecios.remove(this.utilidadtipoprecio);				
					}
					
					
					((UtilidadTipoPrecioModel) this.jTableDatosUtilidadTipoPrecio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUtilidadTipoPrecio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUtilidadTipoPrecio) {
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUtilidadTipoPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUtilidadTipoPrecio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUtilidadTipoPrecio(this.utilidadtipoprecio);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.utilidadtipoprecioConstantesFunciones.cargarid_empresaUtilidadTipoPrecio || this.utilidadtipoprecioConstantesFunciones.event_dependid_empresaUtilidadTipoPrecio) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.utilidadtipoprecio.getid_empresa());
									//this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(utilidadtipoprecio.getEmpresa()!=null) {
							this.empresasForeignKey.add(utilidadtipoprecio.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.utilidadtipoprecio.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.utilidadtipoprecioConstantesFunciones.cargarid_sucursalUtilidadTipoPrecio || this.utilidadtipoprecioConstantesFunciones.event_dependid_sucursalUtilidadTipoPrecio) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.utilidadtipoprecio.getid_sucursal());
									//this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(utilidadtipoprecio.getSucursal()!=null) {
							this.sucursalsForeignKey.add(utilidadtipoprecio.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.utilidadtipoprecio.getid_sucursal(),false,"Formulario");

					//TipoPrecio
					if(!this.utilidadtipoprecioConstantesFunciones.cargarid_tipo_precioUtilidadTipoPrecio || this.utilidadtipoprecioConstantesFunciones.event_dependid_tipo_precioUtilidadTipoPrecio) {
						//this.cargarCombosTipoPreciosForeignKeyLista(" where id="+this.utilidadtipoprecio.getid_tipo_precio());
									//this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
						this.tipopreciosForeignKey=new ArrayList<TipoPrecio>();

						if(utilidadtipoprecio.getTipoPrecio()!=null) {
							this.tipopreciosForeignKey.add(utilidadtipoprecio.getTipoPrecio());
						}

						this.addItemDefectoCombosForeignKeyTipoPrecio();
						this.cargarCombosFrameTipoPreciosForeignKey("Todos");
					}
					this.setActualTipoPrecioForeignKey(this.utilidadtipoprecio.getid_tipo_precio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUtilidadTipoPrecio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadTipoPrecio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUtilidadTipoPrecio(utilidadtipoprecio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUtilidadTipoPrecio(utilidadtipoprecio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUtilidadTipoPrecio(utilidadtipoprecio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUtilidadTipoPrecio(utilidadtipoprecio);
	}
	
	public void setVariablesObjetoActualToFormularioUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.setText(utilidadtipoprecio.getId().toString());
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTextFieldporcentajeUtilidadTipoPrecio.setText(utilidadtipoprecio.getporcentaje().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,UtilidadTipoPrecio utilidadtipoprecioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,utilidadtipoprecioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,UtilidadTipoPrecio utilidadtipoprecioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				utilidadtipoprecioLocal=this.utilidadtipoprecio;
			} else {
				utilidadtipoprecioLocal=this.utilidadtipoprecioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(utilidadtipoprecioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUtilidadTipoPrecio(utilidadtipoprecioLocal,true);
					
					if(utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(utilidadtipoprecioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(utilidadtipoprecioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(utilidadtipoprecio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(utilidadtipoprecio);
	}
	
	public void setVariablesFormularioToObjetoActualUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(utilidadtipoprecio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.getText()==null || this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.getText()=="" || this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.getText()=="Id") {
				this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.setText("0");
			}

			if(conColumnasBase) {utilidadtipoprecio.setId(Long.parseLong(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadTipoPrecioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelIdUtilidadTipoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadtipoprecio.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTextFieldporcentajeUtilidadTipoPrecio.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelporcentajeUtilidadTipoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecioBean,UtilidadTipoPrecio utilidadtipoprecio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && utilidadtipoprecioBean.getid_tipo_precio()!=null && !utilidadtipoprecioBean.getid_tipo_precio().equals(-1L))) {utilidadtipoprecio.setid_tipo_precio(utilidadtipoprecioBean.getid_tipo_precio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecioOrigen,UtilidadTipoPrecio utilidadtipoprecio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && utilidadtipoprecioOrigen.getId()!=null && !utilidadtipoprecioOrigen.getId().equals(0L))) {utilidadtipoprecio.setId(utilidadtipoprecioOrigen.getId());}}
			if(conDefault || (!conDefault && utilidadtipoprecioOrigen.getid_tipo_precio()!=null && !utilidadtipoprecioOrigen.getid_tipo_precio().equals(-1L))) {utilidadtipoprecio.setid_tipo_precio(utilidadtipoprecioOrigen.getid_tipo_precio());}
			if(conDefault || (!conDefault && utilidadtipoprecioOrigen.getporcentaje()!=null && !utilidadtipoprecioOrigen.getporcentaje().equals(0.0))) {utilidadtipoprecio.setporcentaje(utilidadtipoprecioOrigen.getporcentaje());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.setText(utilidadtipoprecio.getId().toString());
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTextFieldporcentajeUtilidadTipoPrecio.setText(utilidadtipoprecio.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUtilidadTipoPrecio(UtilidadTipoPrecioBean utilidadtipoprecioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.setText(utilidadtipoprecioBean.getId().toString());
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTextFieldporcentajeUtilidadTipoPrecio.setText(utilidadtipoprecioBean.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUtilidadTipoPrecio(UtilidadTipoPrecioParameterReturnGeneral utilidadtipoprecioReturnGeneral,UtilidadTipoPrecioBean utilidadtipoprecioBean,Boolean conDefault) throws Exception { 
		try {
			UtilidadTipoPrecio utilidadtipoprecioLocal=new UtilidadTipoPrecio();
			
			utilidadtipoprecioLocal=utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && utilidadtipoprecioLocal.getId()!=null && !utilidadtipoprecioLocal.getId().equals(0L))) {utilidadtipoprecioBean.setId(utilidadtipoprecioLocal.getId());}}
			if(conDefault || (!conDefault && utilidadtipoprecioLocal.getid_tipo_precio()!=null && !utilidadtipoprecioLocal.getid_tipo_precio().equals(-1L))) {utilidadtipoprecioBean.setid_tipo_precio(utilidadtipoprecioLocal.getid_tipo_precio());}
			if(conDefault || (!conDefault && utilidadtipoprecioLocal.getporcentaje()!=null && !utilidadtipoprecioLocal.getporcentaje().equals(0.0))) {utilidadtipoprecioBean.setporcentaje(utilidadtipoprecioLocal.getporcentaje());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUtilidadTipoPrecioGenerico(Long idUtilidadTipoPrecioSeleccionado,JComboBox jComboBoxUtilidadTipoPrecio,List<UtilidadTipoPrecio> utilidadtipopreciosLocal)throws Exception {
		try {
			UtilidadTipoPrecio  utilidadtipoprecioTemp=null;

			for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipopreciosLocal) {
				if(utilidadtipoprecioAux.getId()!=null && utilidadtipoprecioAux.getId().equals(idUtilidadTipoPrecioSeleccionado)) {
					utilidadtipoprecioTemp=utilidadtipoprecioAux;
					break;
				}
			}

			jComboBoxUtilidadTipoPrecio.setSelectedItem(utilidadtipoprecioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUtilidadTipoPrecioGenerico(JComboBox jComboBoxUtilidadTipoPrecio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUtilidadTipoPrecio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUtilidadTipoPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUtilidadTipoPrecio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUtilidadTipoPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadtipoprecio=(UtilidadTipoPrecio) utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			utilidadtipoprecio =(UtilidadTipoPrecio) utilidadtipoprecios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!utilidadtipoprecio.getIsNew() && !utilidadtipoprecio.getIsChanged() && !utilidadtipoprecio.getIsDeleted()) {
				sDescripcion=utilidadtipoprecio.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadtipoprecio.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!utilidadtipoprecio.getIsNew() && !utilidadtipoprecio.getIsChanged() && !utilidadtipoprecio.getIsDeleted()) {
				sDescripcion=utilidadtipoprecio.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadtipoprecio.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoPrecio")) {
			//sDescripcion=this.getActualTipoPrecioForeignKeyDescripcion((Long)value);
			if(!utilidadtipoprecio.getIsNew() && !utilidadtipoprecio.getIsChanged() && !utilidadtipoprecio.getIsDeleted()) {
				sDescripcion=utilidadtipoprecio.gettipoprecio_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPrecioForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadtipoprecio.gettipoprecio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		UtilidadTipoPrecio utilidadtipoprecioRow=new UtilidadTipoPrecio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadtipoprecioRow=(UtilidadTipoPrecio) utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			utilidadtipoprecioRow=(UtilidadTipoPrecio) utilidadtipoprecios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUtilidadTipoPrecio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoUtilidadTipoPrecio && this.isPermisoNuevoUtilidadTipoPrecio));			
			this.jButtonDuplicarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaDuplicarUtilidadTipoPrecio && this.isPermisoDuplicarUtilidadTipoPrecio));			
			this.jButtonCopiarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaCopiarUtilidadTipoPrecio && this.isPermisoCopiarUtilidadTipoPrecio));
			this.jButtonVerFormUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaVerFormUtilidadTipoPrecio && this.isPermisoVerFormUtilidadTipoPrecio));
			
			this.jButtonAbrirOrderByUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenUtilidadTipoPrecio && this.isPermisoOrdenUtilidadTipoPrecio));			
			
			this.jButtonNuevoRelacionesUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio && this.isPermisoNuevoUtilidadTipoPrecio));			
			this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoUtilidadTipoPrecio && this.isPermisoNuevoUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonModificarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaModificarUtilidadTipoPrecio && this.isPermisoActualizarUtilidadTipoPrecio));	
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaActualizarUtilidadTipoPrecio && this.isPermisoActualizarUtilidadTipoPrecio));	
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaEliminarUtilidadTipoPrecio && this.isPermisoEliminarUtilidadTipoPrecio));
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarUtilidadTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarUtilidadTipoPrecio);							
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));			
			
			}
						
			this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoUtilidadTipoPrecio && this.isPermisoNuevoUtilidadTipoPrecio));						
			this.jButtonDuplicarToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaDuplicarUtilidadTipoPrecio && this.isPermisoDuplicarUtilidadTipoPrecio));						
			this.jButtonCopiarToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaCopiarUtilidadTipoPrecio && this.isPermisoCopiarUtilidadTipoPrecio));			
			this.jButtonVerFormToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaVerFormUtilidadTipoPrecio && this.isPermisoVerFormUtilidadTipoPrecio));			
			this.jButtonAbrirOrderByToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenUtilidadTipoPrecio && this.isPermisoOrdenUtilidadTipoPrecio));
			this.jButtonNuevoRelacionesToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio && this.isPermisoNuevoUtilidadTipoPrecio));			
			this.jButtonNuevoGuardarCambiosToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoUtilidadTipoPrecio && this.isPermisoNuevoUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));			
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonModificarToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaModificarUtilidadTipoPrecio && this.isPermisoActualizarUtilidadTipoPrecio));	
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaActualizarUtilidadTipoPrecio  && this.isPermisoActualizarUtilidadTipoPrecio));	
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaEliminarUtilidadTipoPrecio && this.isPermisoEliminarUtilidadTipoPrecio));
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarToolBarUtilidadTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarUtilidadTipoPrecio);				
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoUtilidadTipoPrecio && this.isPermisoNuevoUtilidadTipoPrecio));			
			this.jMenuItemDuplicarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaDuplicarUtilidadTipoPrecio && this.isPermisoDuplicarUtilidadTipoPrecio));			
			this.jMenuItemCopiarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaCopiarUtilidadTipoPrecio && this.isPermisoCopiarUtilidadTipoPrecio));			
			this.jMenuItemVerFormUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaVerFormUtilidadTipoPrecio && this.isPermisoVerFormUtilidadTipoPrecio));			
			this.jMenuItemAbrirOrderByUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenUtilidadTipoPrecio && this.isPermisoOrdenUtilidadTipoPrecio));			
			//this.jMenuItemMostrarOcultarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenUtilidadTipoPrecio && this.isPermisoOrdenUtilidadTipoPrecio));
			this.jMenuItemDetalleAbrirOrderByUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenUtilidadTipoPrecio && this.isPermisoOrdenUtilidadTipoPrecio));			
			//this.jMenuItemDetalleMostrarOcultarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaOrdenUtilidadTipoPrecio && this.isPermisoOrdenUtilidadTipoPrecio));			
			this.jMenuItemNuevoRelacionesUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio && this.isPermisoNuevoUtilidadTipoPrecio));			
			this.jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaNuevoUtilidadTipoPrecio && this.isPermisoNuevoUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));									
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemModificarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaModificarUtilidadTipoPrecio && this.isPermisoActualizarUtilidadTipoPrecio));	
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemActualizarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaActualizarUtilidadTipoPrecio && this.isPermisoActualizarUtilidadTipoPrecio));	
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemEliminarUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaEliminarUtilidadTipoPrecio && this.isPermisoEliminarUtilidadTipoPrecio));
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemCancelarUtilidadTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarUtilidadTipoPrecio);				
			}
			
			this.jMenuItemGuardarCambiosUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));						
			this.jMenuItemGuardarCambiosTablaUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=this.jButtonNuevoUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaDuplicarUtilidadTipoPrecio=this.jButtonDuplicarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaCopiarUtilidadTipoPrecio=this.jButtonCopiarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaVerFormUtilidadTipoPrecio=this.jButtonVerFormUtilidadTipoPrecio.isVisible();
			
			this.isVisibilidadCeldaOrdenUtilidadTipoPrecio=this.jButtonAbrirOrderByUtilidadTipoPrecio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=this.jButtonNuevoRelacionesUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=this.jButtonModificarUtilidadTipoPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosUtilidadTipoPrecio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=this.jButtonNuevoToolBarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=this.jButtonNuevoRelacionesToolBarUtilidadTipoPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonModificarToolBarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarToolBarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarToolBarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarToolBarUtilidadTipoPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=this.jButtonGuardarCambiosToolBarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=this.jButtonGuardarCambiosTablaToolBarUtilidadTipoPrecio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=this.jMenuItemNuevoUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=this.jMenuItemNuevoRelacionesUtilidadTipoPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemModificarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemActualizarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemEliminarUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemCancelarUtilidadTipoPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=this.jMenuItemGuardarCambiosUtilidadTipoPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=this.jMenuItemGuardarCambiosTablaUtilidadTipoPrecio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUtilidadTipoPrecio(Boolean esInicializar) {
		if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
				//if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUtilidadTipoPrecio();
			}
			
			this.inicializarActualizarBindingBotonesManualUtilidadTipoPrecio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUtilidadTipoPrecio() {
		this.jButtonNuevoUtilidadTipoPrecio.setVisible(this.isPermisoNuevoUtilidadTipoPrecio);			
		this.jButtonDuplicarUtilidadTipoPrecio.setVisible(this.isPermisoDuplicarUtilidadTipoPrecio);			
		this.jButtonCopiarUtilidadTipoPrecio.setVisible(this.isPermisoCopiarUtilidadTipoPrecio);			
		this.jButtonVerFormUtilidadTipoPrecio.setVisible(this.isPermisoVerFormUtilidadTipoPrecio);			
		
		this.jButtonAbrirOrderByUtilidadTipoPrecio.setVisible(this.isPermisoOrdenUtilidadTipoPrecio);					
		
		this.jButtonNuevoRelacionesUtilidadTipoPrecio.setVisible(this.isPermisoNuevoUtilidadTipoPrecio);			
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonModificarUtilidadTipoPrecio.setVisible(this.isPermisoActualizarUtilidadTipoPrecio);	
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarUtilidadTipoPrecio.setVisible(this.isPermisoActualizarUtilidadTipoPrecio);	
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarUtilidadTipoPrecio.setVisible(this.isPermisoEliminarUtilidadTipoPrecio);
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarUtilidadTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarUtilidadTipoPrecio);						
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosUtilidadTipoPrecio.setVisible(this.isPermisoGuardarCambiosUtilidadTipoPrecio);							
		}
		
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.setVisible(this.isPermisoActualizarUtilidadTipoPrecio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUtilidadTipoPrecio() {
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonModificarUtilidadTipoPrecio.setVisible(this.isPermisoActualizarUtilidadTipoPrecio);	
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarUtilidadTipoPrecio.setVisible(this.isPermisoActualizarUtilidadTipoPrecio);	
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarUtilidadTipoPrecio.setVisible(this.isPermisoEliminarUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarUtilidadTipoPrecio.setVisible(this.isVisibilidadCeldaCancelarUtilidadTipoPrecio);							
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosUtilidadTipoPrecio.setVisible((this.isVisibilidadCeldaGuardarUtilidadTipoPrecio && this.isPermisoGuardarCambiosUtilidadTipoPrecio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUtilidadTipoPrecio() {
		if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUtilidadTipoPrecio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUtilidadTipoPrecio() {
	}
	
	public void jTableDatosUtilidadTipoPrecioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUtilidadTipoPrecio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUtilidadTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.getutilidadtipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadtipoprecio==null) {
						this.utilidadtipoprecio = new UtilidadTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
				}

				if(this.utilidadtipoprecio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.utilidadtipoprecio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaUtilidadTipoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebUtilidadTipoPrecio(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadTipoPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadTipoPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.getutilidadtipoprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.utilidadtipoprecioLogic.getConnexion());

				if(this.utilidadtipoprecio.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.utilidadtipoprecio.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadTipoPrecio=(TitledBorder)this.jScrollPanelDatosUtilidadTipoPrecio.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderUtilidadTipoPrecio.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaUtilidadTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.getutilidadtipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadtipoprecio==null) {
						this.utilidadtipoprecio = new UtilidadTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
				}

				if(this.utilidadtipoprecio.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.utilidadtipoprecio.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalUtilidadTipoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebUtilidadTipoPrecio(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadTipoPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadTipoPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.getutilidadtipoprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.utilidadtipoprecioLogic.getConnexion());

				if(this.utilidadtipoprecio.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.utilidadtipoprecio.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadTipoPrecio=(TitledBorder)this.jScrollPanelDatosUtilidadTipoPrecio.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderUtilidadTipoPrecio.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalUtilidadTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.getutilidadtipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadtipoprecio==null) {
						this.utilidadtipoprecio = new UtilidadTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
				}

				if(this.utilidadtipoprecio.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.utilidadtipoprecio.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_precioUtilidadTipoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprecio=true;

			idTienePermisotipoprecio=this.tienePermisosUsuarioEnPaginaWebUtilidadTipoPrecio(TipoPrecioConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprecio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadTipoPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadTipoPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.getutilidadtipoprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);

				this.tipoprecioBeanSwingJInternalFrame=new TipoPrecioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprecioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprecioBeanSwingJInternalFrame.getTipoPrecioLogic().setConnexion(this.utilidadtipoprecioLogic.getConnexion());

				if(this.utilidadtipoprecio.getid_tipo_precio()!=null) {
					this.tipoprecioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprecioBeanSwingJInternalFrame.setIdActual(this.utilidadtipoprecio.getid_tipo_precio());
					this.tipoprecioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprecioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprecioBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPrecio();
				}

				JInternalFrameBase jinternalFrame =this.tipoprecioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadTipoPrecio=(TitledBorder)this.jScrollPanelDatosUtilidadTipoPrecio.getBorder();
				TitledBorder titledBordertipoprecio=(TitledBorder)this.tipoprecioBeanSwingJInternalFrame.jScrollPanelDatosTipoPrecio.getBorder();

				titledBordertipoprecio.setTitle(titledBorderUtilidadTipoPrecio.getTitle() + " -> Tipo Precio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_precioUtilidadTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.getutilidadtipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadtipoprecio==null) {
						this.utilidadtipoprecio = new UtilidadTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
				}

				if(this.utilidadtipoprecio.getid_tipo_precio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_precio = "+this.utilidadtipoprecio.getid_tipo_precio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeUtilidadTipoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.getutilidadtipoprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadtipoprecio==null) {
						this.utilidadtipoprecio = new UtilidadTipoPrecio();
					}

					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);
				}

				if(this.utilidadtipoprecio.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.utilidadtipoprecio.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadTipoPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);

			this.getUtilidadTipoPreciosFK_IdEmpresa();

			this.inicializarActualizarBindingUtilidadTipoPrecio(false);

			//if(UtilidadTipoPrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);

			this.getUtilidadTipoPreciosFK_IdSucursal();

			this.inicializarActualizarBindingUtilidadTipoPrecio(false);

			//if(UtilidadTipoPrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPrecioUtilidadTipoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);

			this.getUtilidadTipoPreciosFK_IdTipoPrecio();

			this.inicializarActualizarBindingUtilidadTipoPrecio(false);

			//if(UtilidadTipoPrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadtipoprecioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUtilidadTipoPrecio() {
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.setVisible(false);	    			
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.dispose();
			this.jInternalFrameDetalleFormUtilidadTipoPrecio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio!=null) {
			this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.dispose();
			this.jInternalFrameReporteDinamicoUtilidadTipoPrecio=null;
		}
		
		if(this.jInternalFrameImportacionUtilidadTipoPrecio!=null) {
			this.jInternalFrameImportacionUtilidadTipoPrecio.setVisible(false);	    			
			this.jInternalFrameImportacionUtilidadTipoPrecio.dispose();
			this.jInternalFrameImportacionUtilidadTipoPrecio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUtilidadTipoPrecio();
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
			
			if(sTipo.equals("NuevoUtilidadTipoPrecio")) {
				jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUtilidadTipoPrecio")) {
				jButtonDuplicarUtilidadTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUtilidadTipoPrecio")) {
				jButtonCopiarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormUtilidadTipoPrecio")) {
				jButtonVerFormUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUtilidadTipoPrecio")) {
				jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUtilidadTipoPrecio")) {
				jButtonDuplicarUtilidadTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUtilidadTipoPrecio")) {
				jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUtilidadTipoPrecio")) {
				jButtonDuplicarUtilidadTipoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUtilidadTipoPrecio")) {
				jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUtilidadTipoPrecio")) {
				jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUtilidadTipoPrecio")) {
				jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUtilidadTipoPrecio")) {
				jButtonModificarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUtilidadTipoPrecio")) {
				jButtonModificarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUtilidadTipoPrecio")) {
				jButtonModificarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUtilidadTipoPrecio")) {
				jButtonActualizarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUtilidadTipoPrecio")) {
				jButtonActualizarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUtilidadTipoPrecio")) {
				jButtonActualizarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarUtilidadTipoPrecio")) {
				jButtonEliminarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUtilidadTipoPrecio")) {
				jButtonEliminarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUtilidadTipoPrecio")) {
				jButtonEliminarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarUtilidadTipoPrecio")) {
				jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUtilidadTipoPrecio")) {
				jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUtilidadTipoPrecio")) {
				jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarUtilidadTipoPrecio")) {
				jButtonCerrarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUtilidadTipoPrecio")) {
				jButtonCerrarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUtilidadTipoPrecio")) {
				jButtonCerrarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUtilidadTipoPrecio")) {
				jButtonMostrarOcultarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUtilidadTipoPrecio")) {
				jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUtilidadTipoPrecio")) {
				jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUtilidadTipoPrecio")) {
				jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUtilidadTipoPrecio")) {
				jButtonCopiarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUtilidadTipoPrecio")) {
				jButtonVerFormUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUtilidadTipoPrecio")) {
				jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUtilidadTipoPrecio")) {
				jButtonCopiarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUtilidadTipoPrecio")) {
				jButtonVerFormUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUtilidadTipoPrecio")) {
				jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUtilidadTipoPrecio")) {
				jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUtilidadTipoPrecio")) {
				jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUtilidadTipoPrecio")) {
				jButtonRecargarInformacionUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUtilidadTipoPrecio")) {
				jButtonRecargarInformacionUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUtilidadTipoPrecio")) {
				jButtonRecargarInformacionUtilidadTipoPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresUtilidadTipoPrecio")) {
				jButtonAnterioresUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUtilidadTipoPrecio")) {
				jButtonAnterioresUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUtilidadTipoPrecio")) {
				jButtonAnterioresUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUtilidadTipoPrecio")) {
				jButtonSiguientesUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUtilidadTipoPrecio")) {
				jButtonSiguientesUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUtilidadTipoPrecio")) {
				jButtonSiguientesUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUtilidadTipoPrecio") || sTipo.equals("MenuItemDetalleAbrirOrderByUtilidadTipoPrecio")) {
				jButtonAbrirOrderByUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUtilidadTipoPrecio") || sTipo.equals("MenuItemDetalleMostrarOcultarUtilidadTipoPrecio")) {
				jButtonMostrarOcultarUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUtilidadTipoPrecio")) {
				jButtonNuevoGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUtilidadTipoPrecio")) {
				jButtonNuevoGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUtilidadTipoPrecio")) {
				jButtonNuevoGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUtilidadTipoPrecio")) {
				jButtonCerrarReporteDinamicoUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUtilidadTipoPrecio")) {
				jButtonGenerarReporteDinamicoUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUtilidadTipoPrecio")) {
				
				jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUtilidadTipoPrecio")) {
				jButtonCerrarImportacionUtilidadTipoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUtilidadTipoPrecio")) {
				
				jButtonGenerarImportacionUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUtilidadTipoPrecio")) {
				
				jButtonAbrirImportacionUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUtilidadTipoPrecio")) {
				jComboBoxTiposAccionesUtilidadTipoPrecioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUtilidadTipoPrecio")) {
				jComboBoxTiposRelacionesUtilidadTipoPrecioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUtilidadTipoPrecio")) {
				jComboBoxTiposAccionesUtilidadTipoPrecioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUtilidadTipoPrecio")) {
				
				jComboBoxTiposSeleccionarUtilidadTipoPrecioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUtilidadTipoPrecio")) {
				jTextFieldValorCampoGeneralUtilidadTipoPrecioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUtilidadTipoPrecio")) {
				jButtonAbrirOrderByUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUtilidadTipoPrecio")) {
				jButtonAbrirOrderByUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUtilidadTipoPrecio")) {
				jButtonCerrarOrderByUtilidadTipoPrecioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUtilidadTipoPrecioBusqueda")) {
				this.jButtonidUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUtilidadTipoPrecioUpdate")) {
				this.jButtonid_empresaUtilidadTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUtilidadTipoPrecioBusqueda")) {
				this.jButtonid_empresaUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUtilidadTipoPrecioUpdate")) {
				this.jButtonid_sucursalUtilidadTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUtilidadTipoPrecioBusqueda")) {
				this.jButtonid_sucursalUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_precioUtilidadTipoPrecioUpdate")) {
				this.jButtonid_tipo_precioUtilidadTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_precioUtilidadTipoPrecioBusqueda")) {
				this.jButtonid_tipo_precioUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeUtilidadTipoPrecioBusqueda")) {
				this.jButtonporcentajeUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoPrecioUtilidadTipoPrecio")) {
				this.jButtonFK_IdTipoPrecioUtilidadTipoPrecioActionPerformed(evt);
			}
			
			;
			
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUtilidadTipoPrecio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				


				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			UtilidadTipoPrecio utilidadtipoprecioLocal=null;
			
			if(!this.getEsControlTabla()) {
				utilidadtipoprecioLocal=this.utilidadtipoprecio;
			} else {
				utilidadtipoprecioLocal=this.utilidadtipoprecioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
							
				
				


				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
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
			
			


			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadTipoPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
								
						
				


				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
								
				
				


				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadTipoPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
							
				
				


				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
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
			
			


			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
								
				
				


				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadTipoPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadTipoPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUtilidadTipoPrecio")) {
					jCheckBoxSeleccionarTodosUtilidadTipoPrecioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUtilidadTipoPrecio")) {
					jCheckBoxSeleccionadosUtilidadTipoPrecioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUtilidadTipoPrecio")) {
					
				}
				
				


				
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
												
				
				


				
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadTipoPrecioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
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
			
			


			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadtipoprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadtipoprecio);
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
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
				
				


				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadTipoPrecio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadTipoPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadTipoPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadtipoprecioAnterior =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUtilidadTipoPrecio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUtilidadTipoPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUtilidadTipoPrecio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.utilidadtipoprecio =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.utilidadtipoprecio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUtilidadTipoPrecio")) {
				
				}
				
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUtilidadTipoPrecio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUtilidadTipoPrecio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUtilidadTipoPrecio")) {
			
			}
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUtilidadTipoPrecio();
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
			if(sTipo.equals("NuevoUtilidadTipoPrecio")) {
				jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUtilidadTipoPrecio")) {
				jButtonDuplicarUtilidadTipoPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUtilidadTipoPrecio")) {
				jButtonCopiarUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUtilidadTipoPrecio")) {
				jButtonVerFormUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUtilidadTipoPrecio")) {
				jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUtilidadTipoPrecio")) {
				jButtonModificarUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUtilidadTipoPrecio")) {
				jButtonActualizarUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUtilidadTipoPrecio")) {
				jButtonEliminarUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUtilidadTipoPrecio")) {
				jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUtilidadTipoPrecio")) {
				jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUtilidadTipoPrecio")) {
				jButtonCerrarUtilidadTipoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUtilidadTipoPrecio")) {
				jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUtilidadTipoPrecio")) {
				jButtonNuevoGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUtilidadTipoPrecio")) {
				jButtonAbrirOrderByUtilidadTipoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUtilidadTipoPrecio")) {
				jButtonRecargarInformacionUtilidadTipoPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUtilidadTipoPrecio")) {
				jButtonAnterioresUtilidadTipoPrecioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUtilidadTipoPrecio")) {
				jButtonSiguientesUtilidadTipoPrecioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUtilidadTipoPrecioBusqueda")) {
				this.jButtonidUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUtilidadTipoPrecioUpdate")) {
				this.jButtonid_empresaUtilidadTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUtilidadTipoPrecioBusqueda")) {
				this.jButtonid_empresaUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUtilidadTipoPrecioUpdate")) {
				this.jButtonid_sucursalUtilidadTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUtilidadTipoPrecioBusqueda")) {
				this.jButtonid_sucursalUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_precioUtilidadTipoPrecioUpdate")) {
				this.jButtonid_tipo_precioUtilidadTipoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_precioUtilidadTipoPrecioBusqueda")) {
				this.jButtonid_tipo_precioUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeUtilidadTipoPrecioBusqueda")) {
				this.jButtonporcentajeUtilidadTipoPrecioBusquedaActionPerformed(evt);
			}
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUtilidadTipoPrecio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUtilidadTipoPrecio")) {
				closingInternalFrameUtilidadTipoPrecio();
				
			} else if(sTipo.equals("jButtonCancelarUtilidadTipoPrecio")) {
				JInternalFrameBase jInternalFrameDetalleFormUtilidadTipoPrecio = (JInternalFrameBase)evt.getSource();
	            	
	            UtilidadTipoPrecioBeanSwingJInternalFrame jInternalFrameParent=(UtilidadTipoPrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormUtilidadTipoPrecio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUtilidadTipoPrecioActionPerformed(null);
			}
			
			UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.utilidadtipoprecio,new Object(),this.utilidadtipoprecioParameterGeneral,this.utilidadtipoprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUtilidadTipoPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUtilidadTipoPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUtilidadTipoPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.utilidadtipoprecio)) {
			if(!esControlTabla) {
				if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);			
				}
				
				if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.utilidadtipoprecioReturnGeneral=utilidadtipoprecioLogic.procesarEventosUtilidadTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadtipoprecioLogic.getUtilidadTipoPrecios(),this.utilidadtipoprecio,this.utilidadtipoprecioParameterGeneral,this.isEsNuevoUtilidadTipoPrecio,classes);//this.utilidadtipoprecioLogic.getUtilidadTipoPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUtilidadTipoPrecio(this.utilidadtipoprecioReturnGeneral,this.utilidadtipoprecioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUtilidadTipoPrecio(classes,this.utilidadtipoprecioReturnGeneral,this.utilidadtipoprecioBean,false);
					}
						
					if(this.utilidadtipoprecioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUtilidadTipoPrecio(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUtilidadTipoPrecio(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio());	
					}
						
					if(this.utilidadtipoprecioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUtilidadTipoPrecio(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio(),classes);//this.utilidadtipoprecioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUtilidadTipoPrecio(this.utilidadtipoprecio,classes);//this.utilidadtipoprecioBean);									
				}
			
				if(UtilidadTipoPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUtilidadTipoPrecio(this.utilidadtipoprecio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadTipoPrecio(this.utilidadtipoprecio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.utilidadtipoprecioAnterior!=null) {
						this.utilidadtipoprecio=this.utilidadtipoprecioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.utilidadtipoprecioReturnGeneral=utilidadtipoprecioLogic.procesarEventosUtilidadTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadtipoprecioLogic.getUtilidadTipoPrecios(),this.utilidadtipoprecio,this.utilidadtipoprecioParameterGeneral,this.isEsNuevoUtilidadTipoPrecio,classes);//this.utilidadtipoprecioLogic.getUtilidadTipoPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio(),utilidadtipoprecioLogic.getUtilidadTipoPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio(),this.utilidadtipoprecios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUtilidadTipoPrecio.repaint();
				
				//((AbstractTableModel) this.jTableDatosUtilidadTipoPrecio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUtilidadTipoPrecio();
			}
		}
	}
	
	public void actualizarVisualTableDatosUtilidadTipoPrecio() throws Exception {
		
		UtilidadTipoPrecioModel utilidadtipoprecioModel=(UtilidadTipoPrecioModel)this.jTableDatosUtilidadTipoPrecio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadtipoprecioModel.utilidadtipoprecios=this.utilidadtipoprecioLogic.getUtilidadTipoPrecios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			utilidadtipoprecioModel.utilidadtipoprecios=this.utilidadtipoprecios;
		}
		
		
		((UtilidadTipoPrecioModel) this.jTableDatosUtilidadTipoPrecio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUtilidadTipoPrecio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getutilidadtipoprecioAnterior(),this.utilidadtipoprecioLogic.getUtilidadTipoPrecios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getutilidadtipoprecioAnterior(),this.utilidadtipoprecios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUtilidadTipoPrecio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
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
										
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadtipoprecio,new Object(),generalEntityParameterGeneral,this.utilidadtipoprecioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UtilidadTipoPrecioConstantesFunciones.getClassesRelationshipsOfUtilidadTipoPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UtilidadTipoPrecioConstantesFunciones.getClassesRelationshipsFromStringsOfUtilidadTipoPrecio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUtilidadTipoPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadtipoprecio,new Object(),generalEntityParameterGeneral,this.utilidadtipoprecioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUtilidadTipoPrecio(UtilidadTipoPrecioBean utilidadtipoprecioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUtilidadTipoPrecio(ArrayList<Classe> classes,UtilidadTipoPrecioReturnGeneral utilidadtipoprecioReturnGeneral,UtilidadTipoPrecioBean utilidadtipoprecioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.utilidadtipoprecio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio = new UtilidadTipoPrecioDetalleFormJInternalFrame(jDesktopPane,this.utilidadtipoprecioSessionBean.getConGuardarRelaciones(),this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.setVisible(false);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.setSelected(false);						
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.utilidadtipoprecioLogic=this.utilidadtipoprecioLogic;
		
		this.cargarCombosFrameForeignKeyUtilidadTipoPrecio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUtilidadTipoPrecio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUtilidadTipoPrecio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUtilidadTipoPrecio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUtilidadTipoPrecio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUtilidadTipoPrecio"));
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonModificarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"ModificarUtilidadTipoPrecio"));

		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonModificarToolBarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarUtilidadTipoPrecio"));
					
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemModificarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarUtilidadTipoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"ActualizarUtilidadTipoPrecio"));
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarToolBarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUtilidadTipoPrecio"));
						
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemActualizarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUtilidadTipoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"EliminarUtilidadTipoPrecio"));
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarUtilidadTipoPrecio"));
								
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemEliminarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUtilidadTipoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"CancelarUtilidadTipoPrecio"));
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarUtilidadTipoPrecio"));
					
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemCancelarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUtilidadTipoPrecio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemDetalleCerrarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUtilidadTipoPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadTipoPrecio"));
		
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadTipoPrecio"));
		
		
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUtilidadTipoPrecio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonidUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_empresaUtilidadTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_empresaUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_sucursalUtilidadTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_sucursalUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_tipo_precioUtilidadTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioUtilidadTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioUtilidadTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonporcentajeUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeUtilidadTipoPrecioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTabbedPaneRelacionesUtilidadTipoPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUtilidadTipoPrecio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUtilidadTipoPrecio"));
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUtilidadTipoPrecio"));
		}
		
		this.jTableDatosUtilidadTipoPrecio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUtilidadTipoPrecio"));
		
		this.jTableDatosUtilidadTipoPrecio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUtilidadTipoPrecio"));
		
		this.jButtonNuevoUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"NuevoUtilidadTipoPrecio"));
		
		this.jButtonDuplicarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"DuplicarUtilidadTipoPrecio"));
		
		this.jButtonCopiarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"CopiarUtilidadTipoPrecio"));
		
		this.jButtonVerFormUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"VerFormUtilidadTipoPrecio"));
		
		
		this.jButtonNuevoToolBarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"NuevoToolBarUtilidadTipoPrecio"));
			
		this.jButtonDuplicarToolBarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUtilidadTipoPrecio"));
			
		this.jMenuItemNuevoUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUtilidadTipoPrecio"));
			
		this.jMenuItemDuplicarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUtilidadTipoPrecio"));		
		
		
		this.jButtonNuevoRelacionesUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUtilidadTipoPrecio"));
		
		
		this.jButtonNuevoRelacionesToolBarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUtilidadTipoPrecio"));
			
		this.jMenuItemNuevoRelacionesUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUtilidadTipoPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonModificarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"ModificarUtilidadTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonModificarToolBarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarUtilidadTipoPrecio"));
			
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemModificarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarUtilidadTipoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"ActualizarUtilidadTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonActualizarToolBarUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUtilidadTipoPrecio"));
				
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemActualizarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUtilidadTipoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"EliminarUtilidadTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonEliminarToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarUtilidadTipoPrecio"));
						
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemEliminarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUtilidadTipoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"CancelarUtilidadTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonCancelarToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarUtilidadTipoPrecio"));
			
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemCancelarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUtilidadTipoPrecio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUtilidadTipoPrecio"));		
		
		
		this.jButtonCerrarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"CerrarUtilidadTipoPrecio"));
		
		
		this.jButtonCerrarToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"CerrarToolBarUtilidadTipoPrecio"));
			
		this.jMenuItemCerrarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUtilidadTipoPrecio"));
			
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jMenuItemDetalleCerrarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUtilidadTipoPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosUtilidadTipoPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadTipoPrecio"));
		}
		
		this.jButtonCopiarToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"CopiarToolBarUtilidadTipoPrecio"));
			
		this.jButtonVerFormToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"VerFormToolBarUtilidadTipoPrecio"));
		
		this.jMenuItemGuardarCambiosUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUtilidadTipoPrecio"));
			
		this.jMenuItemCopiarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUtilidadTipoPrecio"));		
		
		this.jMenuItemVerFormUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUtilidadTipoPrecio"));		
		
		
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUtilidadTipoPrecio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUtilidadTipoPrecio"));
			
		this.jMenuItemGuardarCambiosTablaUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUtilidadTipoPrecio"));		
		
		
		
		this.jButtonRecargarInformacionUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionUtilidadTipoPrecio"));
					
		this.jButtonRecargarInformacionToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUtilidadTipoPrecio"));
		
		this.jMenuItemRecargarInformacionUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUtilidadTipoPrecio"));		
		
		
		
		this.jButtonAnterioresUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"AnterioresUtilidadTipoPrecio"));
		
		
		this.jButtonAnterioresToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUtilidadTipoPrecio"));
		
		this.jMenuItemAnterioresUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUtilidadTipoPrecio"));		
		
		
		this.jButtonSiguientesUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"SiguientesUtilidadTipoPrecio"));
		
		
		this.jButtonSiguientesToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUtilidadTipoPrecio"));
			
		this.jMenuItemSiguientesUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUtilidadTipoPrecio"));
			
		this.jMenuItemAbrirOrderByUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUtilidadTipoPrecio"));
			
		this.jMenuItemMostrarOcultarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUtilidadTipoPrecio"));
			
		this.jMenuItemDetalleAbrirOrderByUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUtilidadTipoPrecio"));
			
		this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUtilidadTipoPrecio"));		
		
		
		this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUtilidadTipoPrecio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUtilidadTipoPrecio"));
			
		this.jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUtilidadTipoPrecio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUtilidadTipoPrecio"));

		this.jCheckBoxSeleccionadosUtilidadTipoPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUtilidadTipoPrecio"));
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUtilidadTipoPrecio"));
		}
		
		
		this.jComboBoxTiposRelacionesUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposRelacionesUtilidadTipoPrecio"));
			
		this.jComboBoxTiposAccionesUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesUtilidadTipoPrecio"));
					
		this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUtilidadTipoPrecio"));
			
		this.jTextFieldValorCampoGeneralUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUtilidadTipoPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonidUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_empresaUtilidadTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_empresaUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_sucursalUtilidadTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_sucursalUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_tipo_precioUtilidadTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioUtilidadTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioUtilidadTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonporcentajeUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeUtilidadTipoPrecioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoPrecioUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrecioUtilidadTipoPrecio"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUtilidadTipoPrecio!=null) {
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadTipoPrecio"));
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadTipoPrecio"));
				this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadTipoPrecio"));
			}
			
			//this.jButtonCerrarReporteDinamicoUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadTipoPrecio"));				
			//this.jButtonGenerarReporteDinamicoUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadTipoPrecio"));
			//this.jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadTipoPrecio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUtilidadTipoPrecio!=null) {
				this.jInternalFrameImportacionUtilidadTipoPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUtilidadTipoPrecio"));
				this.jInternalFrameImportacionUtilidadTipoPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUtilidadTipoPrecio"));
				this.jInternalFrameImportacionUtilidadTipoPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUtilidadTipoPrecio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByUtilidadTipoPrecio"));
			
			this.jButtonAbrirOrderByToolBarUtilidadTipoPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUtilidadTipoPrecio"));			
			
			if(this.jInternalFrameOrderByUtilidadTipoPrecio!=null) {
				this.jInternalFrameOrderByUtilidadTipoPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUtilidadTipoPrecio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTabbedPaneRelacionesUtilidadTipoPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUtilidadTipoPrecio"));
		
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
            		closingInternalFrameUtilidadTipoPrecio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUtilidadTipoPrecio = (JInternalFrameBase)event.getSource();
	            	
	            UtilidadTipoPrecioBeanSwingJInternalFrame jInternalFrameParent=(UtilidadTipoPrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormUtilidadTipoPrecio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUtilidadTipoPrecioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUtilidadTipoPrecio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUtilidadTipoPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUtilidadTipoPrecio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUtilidadTipoPrecio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUtilidadTipoPrecio";
		inputMap = this.jButtonNuevoUtilidadTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUtilidadTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUtilidadTipoPrecio";
		inputMap = this.jButtonNuevoRelacionesUtilidadTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUtilidadTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUtilidadTipoPrecioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUtilidadTipoPrecio";
		inputMap = this.jButtonModificarUtilidadTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUtilidadTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUtilidadTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUtilidadTipoPrecio";
		inputMap = this.jButtonActualizarUtilidadTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUtilidadTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUtilidadTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUtilidadTipoPrecio";
		inputMap = this.jButtonEliminarUtilidadTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUtilidadTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUtilidadTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUtilidadTipoPrecio";
		inputMap = this.jButtonCancelarUtilidadTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUtilidadTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUtilidadTipoPrecio";
		inputMap = this.jButtonCerrarUtilidadTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUtilidadTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUtilidadTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUtilidadTipoPrecio";
		inputMap = this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosUtilidadTipoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonGuardarCambiosUtilidadTipoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUtilidadTipoPrecioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUtilidadTipoPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUtilidadTipoPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUtilidadTipoPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUtilidadTipoPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUtilidadTipoPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonidUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_empresaUtilidadTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_empresaUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_sucursalUtilidadTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_sucursalUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadTipoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_tipo_precioUtilidadTipoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioUtilidadTipoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioUtilidadTipoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jButtonporcentajeUtilidadTipoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeUtilidadTipoPrecioBusqueda"));
		
		
		this.jButtonFK_IdTipoPrecioUtilidadTipoPrecio.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrecioUtilidadTipoPrecio"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUtilidadTipoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUtilidadTipoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUtilidadTipoPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUtilidadTipoPrecio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
					utilidadtipoprecioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipoprecios) {
					utilidadtipoprecioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUtilidadTipoPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
						utilidadtipoprecioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipoprecios) {
						utilidadtipoprecioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipoprecios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUtilidadTipoPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUtilidadTipoPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUtilidadTipoPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUtilidadTipoPrecio.getSelectedRows();
			
			UtilidadTipoPrecio utilidadtipoprecioLocal=new UtilidadTipoPrecio();
			
			//this.seleccionarTodosUtilidadTipoPrecio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadtipoprecioLocal =(UtilidadTipoPrecio) this.utilidadtipoprecioLogic.getUtilidadTipoPrecios().toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					utilidadtipoprecioLocal =(UtilidadTipoPrecio) this.utilidadtipoprecios.toArray()[this.jTableDatosUtilidadTipoPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				utilidadtipoprecioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
						utilidadtipoprecioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipoprecios) {
						utilidadtipoprecioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUtilidadTipoPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUtilidadTipoPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUtilidadTipoPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUtilidadTipoPrecioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUtilidadTipoPrecioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUtilidadTipoPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUtilidadTipoPrecio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
				
						if(sTipoSeleccionar.equals(UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							utilidadtipoprecioAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipoprecios) {
					
						if(sTipoSeleccionar.equals(UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							utilidadtipoprecioAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUtilidadTipoPrecioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUtilidadTipoPrecio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUtilidadTipoPrecio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUtilidadTipoPrecio) {				
					conSplash=true;//false;										
					
					//this.startProcessUtilidadTipoPrecio(conSplash);
				
					this.generarReporteUtilidadTipoPreciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUtilidadTipoPreciosSeleccionados();
				//this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUtilidadTipoPreciosSeleccionados(false);
				//this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUtilidadTipoPreciosSeleccionados(true);
				//this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUtilidadTipoPrecio();
				
				this.exportarUtilidadTipoPreciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUtilidadTipoPrecios();
				//this.importarUtilidadTipoPrecios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUtilidadTipoPrecio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUtilidadTipoPreciosSeleccionados();
				//this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Utilidad Tipo Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUtilidadTipoPrecio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUtilidadTipoPrecio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUtilidadTipoPrecio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setSelectedIndex(0);					
				}	
			} 			
			else if(UtilidadTipoPrecioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUtilidadTipoPrecio) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUtilidadTipoPrecio(conSplash);
					
						//this.actualizarParametrosGeneralUtilidadTipoPrecio();
						
						this.generarReporteProcesoAccionUtilidadTipoPreciosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Utilidad Tipo PrecioES SELECCIONADOS?", "MANTENIMIENTO DE Utilidad Tipo Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUtilidadTipoPrecio();
				
						this.actualizarParametrosGeneralUtilidadTipoPrecio();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.utilidadtipoprecioReturnGeneral=utilidadtipoprecioLogic.procesarAccionUtilidadTipoPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.utilidadtipoprecioLogic.getUtilidadTipoPrecios(),this.utilidadtipoprecioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUtilidadTipoPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUtilidadTipoPrecio();
					
					UtilidadTipoPrecioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUtilidadTipoPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUtilidadTipoPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUtilidadTipoPrecio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUtilidadTipoPrecioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUtilidadTipoPrecio();
			
			if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();		
			UtilidadTipoPrecio utilidadtipoprecio=new UtilidadTipoPrecio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUtilidadTipoPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUtilidadTipoPrecio.getSelectedItem();
			
			
			
			
			utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(utilidadtipopreciosSeleccionados.size()==1) {
				for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipopreciosSeleccionados) {
					utilidadtipoprecio=utilidadtipoprecioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUtilidadTipoPrecio();
			
      		//this.finishProcessUtilidadTipoPrecio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUtilidadTipoPrecioReturnGeneral() throws Exception {
		if(this.utilidadtipoprecioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.utilidadtipoprecioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.utilidadtipoprecioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.utilidadtipoprecioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.utilidadtipoprecioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.utilidadtipoprecioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUtilidadTipoPrecio(false);
		}
		
		if(this.utilidadtipoprecioReturnGeneral.getConRetornoLista() || this.utilidadtipoprecioReturnGeneral.getConRetornoObjeto()) {
			if(this.utilidadtipoprecioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.utilidadtipoprecioLogic.setUtilidadTipoPrecios(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.utilidadtipoprecioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.utilidadtipoprecioLogic.setUtilidadTipoPrecio(this.utilidadtipoprecioReturnGeneral.getUtilidadTipoPrecio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingUtilidadTipoPrecio(false);
		}
	}
	
	public void actualizarParametrosGeneralUtilidadTipoPrecio() throws Exception {
		
		
	}
	
	public ArrayList<UtilidadTipoPrecio> getUtilidadTipoPreciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUtilidadTipoPrecio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipoprecioLogic.getUtilidadTipoPrecios()) {
					if(utilidadtipoprecioAux.getIsSelected()) {
						utilidadtipopreciosSeleccionados.add(utilidadtipoprecioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadTipoPrecio utilidadtipoprecioAux:this.utilidadtipoprecios) {
					if(utilidadtipoprecioAux.getIsSelected()) {
						utilidadtipopreciosSeleccionados.add(utilidadtipoprecioAux);				
					}
				}
			}
			
			if(utilidadtipopreciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						utilidadtipopreciosSeleccionados.addAll(this.utilidadtipoprecioLogic.getUtilidadTipoPrecios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						utilidadtipopreciosSeleccionados.addAll(this.utilidadtipoprecios);				
					}
				}
			}
		} else {
			utilidadtipopreciosSeleccionados.add(this.utilidadtipoprecio);
		}
		
		return utilidadtipopreciosSeleccionados;
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
	
	public void generarReporteUtilidadTipoPreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUtilidadTipoPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUtilidadTipoPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUtilidadTipoPreciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUtilidadTipoPreciosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Utilidad Tipo Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUtilidadTipoPreciosSeleccionados() throws Exception {
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();		
		
		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUtilidadTipoPrecios("Todos",utilidadtipopreciosSeleccionados);
		
	}	
	
	public void generarReporteNormalUtilidadTipoPreciosSeleccionados() throws Exception {
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();		
		
		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUtilidadTipoPrecios("Todos",utilidadtipopreciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUtilidadTipoPreciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();
		
		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUtilidadTipoPrecios("Todos",utilidadtipopreciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUtilidadTipoPreciosSeleccionados() throws Exception {
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUtilidadTipoPrecio();
		
		
		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUtilidadTipoPrecio();
		
		
		//this.generarReporteUtilidadTipoPrecios("Todos",utilidadtipopreciosSeleccionados ,utilidadtipoprecioImplementable,utilidadtipoprecioImplementableHome);
	}
	
	public void mostrarImportacionUtilidadTipoPrecios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUtilidadTipoPrecio();
		
		this.abrirFrameImportacionUtilidadTipoPrecio();		
		
			
		//this.generarReporteUtilidadTipoPrecios("Todos",utilidadtipopreciosSeleccionados ,utilidadtipoprecioImplementable,utilidadtipoprecioImplementableHome);
	}
	
	public void importarUtilidadTipoPrecios() throws Exception {		
	
	}
	
	public void exportarUtilidadTipoPreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUtilidadTipoPreciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUtilidadTipoPreciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUtilidadTipoPreciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Utilidad Tipo Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUtilidadTipoPreciosSeleccionados() throws Exception {
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();		
		
		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadtipoprecio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUtilidadTipoPrecio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipopreciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUtilidadTipoPrecio(utilidadtipoprecioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//utilidadtipoprecioAux.setsDetalleGeneralEntityReporte(utilidadtipoprecioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUtilidadTipoPrecio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UtilidadTipoPrecioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadTipoPrecioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=utilidadtipoprecio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadtipoprecio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadtipoprecio.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadtipoprecio.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadtipoprecio.gettipoprecio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadtipoprecio.getporcentaje().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUtilidadTipoPreciosSeleccionados() throws Exception {
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();		
		
		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadtipoprecio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("UtilidadTipoPrecios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUtilidadTipoPrecio(row);				
				iRow++;
			}				
			
			for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipopreciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUtilidadTipoPrecio(utilidadtipoprecioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUtilidadTipoPreciosSeleccionados() throws Exception {
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();		
		
		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadtipoprecio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("utilidadtipoprecios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("utilidadtipoprecio");
			//elementRoot.appendChild(element);
		
			for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipopreciosSeleccionados) {
				element = document.createElement("utilidadtipoprecio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUtilidadTipoPrecio(utilidadtipoprecioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Tipo Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUtilidadTipoPrecio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadtipoprecio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadtipoprecio.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadtipoprecio.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadtipoprecio.gettipoprecio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadtipoprecio.getporcentaje());				
	}
	
	public void setFilaDatosExportarXmlUtilidadTipoPrecio(UtilidadTipoPrecio utilidadtipoprecio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UtilidadTipoPrecioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(utilidadtipoprecio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UtilidadTipoPrecioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(utilidadtipoprecio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(UtilidadTipoPrecioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(utilidadtipoprecio.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(UtilidadTipoPrecioConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(utilidadtipoprecio.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtipoprecio_descripcion = document.createElement(UtilidadTipoPrecioConstantesFunciones.IDTIPOPRECIO);
		elementtipoprecio_descripcion.appendChild(document.createTextNode(utilidadtipoprecio.gettipoprecio_descripcion()));
		element.appendChild(elementtipoprecio_descripcion);

		Element elementporcentaje = document.createElement(UtilidadTipoPrecioConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(utilidadtipoprecio.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);
	}
	
	public void generarReporteGroupGenericoUtilidadTipoPreciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados=new ArrayList<UtilidadTipoPrecio>();
		
		utilidadtipopreciosSeleccionados=this.getUtilidadTipoPreciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoUtilidadTipoPrecio(utilidadtipopreciosSeleccionados);
		
		this.generarReporteUtilidadTipoPrecios("Todos",utilidadtipopreciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUtilidadTipoPrecio(ArrayList<UtilidadTipoPrecio> utilidadtipopreciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(UtilidadTipoPrecio utilidadtipoprecioAux:utilidadtipopreciosSeleccionados) {
				utilidadtipoprecioAux.setsDetalleGeneralEntityReporte(utilidadtipoprecioAux.toString());
			
				if(sTipoSeleccionar.equals(UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					utilidadtipoprecioAux.setsDescripcionGeneralEntityReporte1(utilidadtipoprecioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					utilidadtipoprecioAux.setsDescripcionGeneralEntityReporte1(utilidadtipoprecioAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO)) {
					existe=true;
					utilidadtipoprecioAux.setsDescripcionGeneralEntityReporte1(utilidadtipoprecioAux.gettipoprecio_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadTipoPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUtilidadTipoPrecio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=true;
				this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=true;
				this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=true;
			}
			
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaModificarUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaCancelarUtilidadTipoPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadTipoPrecio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UtilidadTipoPrecioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=true;
		} else {
			this.actualizarEstadoPanelsUtilidadTipoPrecio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUtilidadTipoPrecio=false;
			//this.isVisibilidadCeldaVerFormUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaDuplicarUtilidadTipoPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;
		} else {
			this.isVisibilidadCeldaNuevoUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadTipoPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			if(!utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;												
			}
			
			this.jButtonCerrarUtilidadTipoPrecio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUtilidadTipoPrecio=false;
		}
		
		if(!this.permiteMantenimiento(this.utilidadtipoprecio)) {
			this.isVisibilidadCeldaActualizarUtilidadTipoPrecio=false;
			this.isVisibilidadCeldaEliminarUtilidadTipoPrecio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUtilidadTipoPrecio() {
	}
	
	public void actualizarEstadoPanelsUtilidadTipoPrecio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadTipoPrecio!=null) {
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosUtilidadTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadTipoPrecio!=null) {
				this.jPanelPaginacionUtilidadTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadTipoPrecio!=null) {
				this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadTipoPrecio!=null) {
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosUtilidadTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadTipoPrecio!=null) {
				this.jPanelPaginacionUtilidadTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadTipoPrecio!=null) {
				this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadTipoPrecio!=null) {
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosUtilidadTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadTipoPrecio!=null) {
				this.jPanelPaginacionUtilidadTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadTipoPrecio!=null) {
				this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadTipoPrecio!=null) {
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosUtilidadTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadTipoPrecio!=null) {
				this.jPanelPaginacionUtilidadTipoPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadTipoPrecio!=null) {
				this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadTipoPrecio!=null) {
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosUtilidadTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadTipoPrecio!=null) {
				this.jPanelPaginacionUtilidadTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadTipoPrecio!=null) {
				this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadTipoPrecio!=null) {
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosUtilidadTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadTipoPrecio!=null) {
				this.jPanelPaginacionUtilidadTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadTipoPrecio!=null) {
				this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadTipoPrecio!=null) {
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadTipoPrecio!=null) {
				this.jScrollPanelDatosUtilidadTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadTipoPrecio!=null) {
				this.jPanelPaginacionUtilidadTipoPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadTipoPrecio!=null) {
				this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUtilidadTipoPrecio!=null) {
					this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUtilidadTipoPrecio!=null) {
				this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadTipoPrecio!=null) {
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUtilidadTipoPrecio!=null) {
				this.jPanelParametrosReportesUtilidadTipoPrecio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoPrecio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasUtilidadTipoPrecio.remove(jPanelFK_IdTipoPrecioUtilidadTipoPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTipoPrecio=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasUtilidadTipoPrecio.remove(jPanelFK_IdTipoPrecioUtilidadTipoPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPrecio(Boolean isParaTipoPrecio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPrecioNegation=!isParaTipoPrecio;

			this.isVisibilidadFK_IdTipoPrecio=isParaTipoPrecio;
			if(!this.isVisibilidadFK_IdTipoPrecio) {this.jTabbedPaneBusquedasUtilidadTipoPrecio.remove(jPanelFK_IdTipoPrecioUtilidadTipoPrecio);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//UtilidadTipoPrecioSessionBean utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
		
		if(this.utilidadtipoprecioSessionBean==null) {
			this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
		}
		
		this.utilidadtipoprecioSessionBean.setsUltimaBusquedaUtilidadTipoPrecio(this.getsAccionBusqueda());
		this.utilidadtipoprecioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.utilidadtipoprecioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			utilidadtipoprecioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			utilidadtipoprecioSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPrecio")) {
			utilidadtipoprecioSessionBean.setid_tipo_precio(this.getid_tipo_precioFK_IdTipoPrecio());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//UtilidadTipoPrecioSessionBean utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
		
		if(this.utilidadtipoprecioSessionBean==null) {
			this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
		}
		
		if(this.utilidadtipoprecioSessionBean.getsUltimaBusquedaUtilidadTipoPrecio()!=null&&!this.utilidadtipoprecioSessionBean.getsUltimaBusquedaUtilidadTipoPrecio().equals("")) {
			this.setsAccionBusqueda(utilidadtipoprecioSessionBean.getsUltimaBusquedaUtilidadTipoPrecio());
			this.setiNumeroPaginacion(utilidadtipoprecioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(utilidadtipoprecioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(utilidadtipoprecioSessionBean.getid_empresa());
				utilidadtipoprecioSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(utilidadtipoprecioSessionBean.getid_sucursal());
				utilidadtipoprecioSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPrecio")) {
				this.setid_tipo_precioFK_IdTipoPrecio(utilidadtipoprecioSessionBean.getid_tipo_precio());
				utilidadtipoprecioSessionBean.setid_tipo_precio(-1L);
			}
		}
		
		this.utilidadtipoprecioSessionBean.setsUltimaBusquedaUtilidadTipoPrecio("");
		this.utilidadtipoprecioSessionBean.setiNumeroPaginacion(UtilidadTipoPrecioConstantesFunciones.INUMEROPAGINACION);
		this.utilidadtipoprecioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUtilidadTipoPrecio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUtilidadTipoPrecio() {
		this.updateBorderResaltarBusquedasFormularioUtilidadTipoPrecio();
		this.updateVisibilidadBusquedasFormularioUtilidadTipoPrecio();
		this.updateHabilitarBusquedasFormularioUtilidadTipoPrecio();
	}
	
	public void updateBorderResaltarBusquedasFormularioUtilidadTipoPrecio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUtilidadTipoPrecio.getComponents().length>0) {
	

		if(this.utilidadtipoprecioConstantesFunciones.resaltarFK_IdTipoPrecioUtilidadTipoPrecio!=null) {
			index= this.jTabbedPaneBusquedasUtilidadTipoPrecio.indexOfComponent(this.jPanelFK_IdTipoPrecioUtilidadTipoPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadTipoPrecio.getComponent(index);
				jPanel.setBorder(this.utilidadtipoprecioConstantesFunciones.resaltarFK_IdTipoPrecioUtilidadTipoPrecio);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUtilidadTipoPrecio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUtilidadTipoPrecio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUtilidadTipoPrecio.indexOfComponent(this.jPanelFK_IdTipoPrecioUtilidadTipoPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadTipoPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.utilidadtipoprecioConstantesFunciones.mostrarFK_IdTipoPrecioUtilidadTipoPrecio);
			if(!this.utilidadtipoprecioConstantesFunciones.mostrarFK_IdTipoPrecioUtilidadTipoPrecio && index>-1) {
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUtilidadTipoPrecio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUtilidadTipoPrecio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUtilidadTipoPrecio.indexOfComponent(this.jPanelFK_IdTipoPrecioUtilidadTipoPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadTipoPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.utilidadtipoprecioConstantesFunciones.activarFK_IdTipoPrecioUtilidadTipoPrecio);
				this.jTabbedPaneBusquedasUtilidadTipoPrecio.setEnabledAt(index,this.utilidadtipoprecioConstantesFunciones.activarFK_IdTipoPrecioUtilidadTipoPrecio);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUtilidadTipoPrecio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoPrecio")) {
			index= this.jTabbedPaneBusquedasUtilidadTipoPrecio.indexOfComponent(this.jPanelFK_IdTipoPrecioUtilidadTipoPrecio);

			this.jTabbedPaneBusquedasUtilidadTipoPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadTipoPrecio.getComponent(index);

			this.utilidadtipoprecioConstantesFunciones.setResaltarFK_IdTipoPrecioUtilidadTipoPrecio(resaltar);

			jPanel.setBorder(this.utilidadtipoprecioConstantesFunciones.resaltarFK_IdTipoPrecioUtilidadTipoPrecio);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUtilidadTipoPrecio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioUtilidadTipoPrecio() throws Exception {

		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUtilidadTipoPrecio();
		this.updateVisibilidadResaltarControlesFormularioUtilidadTipoPrecio();
		this.updateHabilitarResaltarControlesFormularioUtilidadTipoPrecio();
		
	}
	
	public void updateBorderResaltarControlesFormularioUtilidadTipoPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.utilidadtipoprecioConstantesFunciones.resaltaridUtilidadTipoPrecio!=null && this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.setBorder(this.utilidadtipoprecioConstantesFunciones.resaltaridUtilidadTipoPrecio);}
		if(this.utilidadtipoprecioConstantesFunciones.resaltarid_empresaUtilidadTipoPrecio!=null && this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.setBorder(this.utilidadtipoprecioConstantesFunciones.resaltarid_empresaUtilidadTipoPrecio);}
		if(this.utilidadtipoprecioConstantesFunciones.resaltarid_sucursalUtilidadTipoPrecio!=null && this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.setBorder(this.utilidadtipoprecioConstantesFunciones.resaltarid_sucursalUtilidadTipoPrecio);}
		if(this.utilidadtipoprecioConstantesFunciones.resaltarid_tipo_precioUtilidadTipoPrecio!=null && this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.setBorder(this.utilidadtipoprecioConstantesFunciones.resaltarid_tipo_precioUtilidadTipoPrecio);}
		if(this.utilidadtipoprecioConstantesFunciones.resaltarporcentajeUtilidadTipoPrecio!=null && this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTextFieldporcentajeUtilidadTipoPrecio.setBorder(this.utilidadtipoprecioConstantesFunciones.resaltarporcentajeUtilidadTipoPrecio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUtilidadTipoPrecio() throws Exception {		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
	
		//this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostraridUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jPanelidUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostraridUtilidadTipoPrecio);
		//this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostrarid_empresaUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jPanelid_empresaUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostrarid_empresaUtilidadTipoPrecio);
		//this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostrarid_sucursalUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jPanelid_sucursalUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostrarid_sucursalUtilidadTipoPrecio);
		//this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostrarid_tipo_precioUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jPanelid_tipo_precioUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostrarid_tipo_precioUtilidadTipoPrecio);
		//this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTextFieldporcentajeUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostrarporcentajeUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jPanelporcentajeUtilidadTipoPrecio.setVisible(this.utilidadtipoprecioConstantesFunciones.mostrarporcentajeUtilidadTipoPrecio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUtilidadTipoPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUtilidadTipoPrecio!=null) {
	
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jLabelidUtilidadTipoPrecio.setEnabled(this.utilidadtipoprecioConstantesFunciones.activaridUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_empresaUtilidadTipoPrecio.setEnabled(this.utilidadtipoprecioConstantesFunciones.activarid_empresaUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_sucursalUtilidadTipoPrecio.setEnabled(this.utilidadtipoprecioConstantesFunciones.activarid_sucursalUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jComboBoxid_tipo_precioUtilidadTipoPrecio.setEnabled(this.utilidadtipoprecioConstantesFunciones.activarid_tipo_precioUtilidadTipoPrecio);
		this.jInternalFrameDetalleFormUtilidadTipoPrecio.jTextFieldporcentajeUtilidadTipoPrecio.setEnabled(this.utilidadtipoprecioConstantesFunciones.activarporcentajeUtilidadTipoPrecio);
		}
	}
	
		
}